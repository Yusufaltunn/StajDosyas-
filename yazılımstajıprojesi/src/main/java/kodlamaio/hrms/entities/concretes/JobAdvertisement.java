package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "job_advertisements")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "job_description")
	private String jobDescription;

	@Column(name = "max_salary")
	private double maxSalary;

	@Column(name = "min_salary")
	private double minSalary;

	@Column(name = "open_position")
	private int openPosition;

	@Column(name = "application_deadline")
	private Date applicationDeadline;

	@Column(name = "release_date")
	private Date releaseDate;

	@Column(name = "is_active")
	private boolean isActive;

	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH})
	@JoinColumn(name = "jobPosition_id")
	private JobPosition jobPositions;

	 @OneToMany(mappedBy = "jobAdvertisements")
	 private List<Language> languages;

	 @OneToMany(mappedBy = "jobAdvertisements")
	 private List<School> schools;

	 @OneToMany(mappedBy = "jobAdvertisements")
	 private List<Skill> skills;

	 @OneToMany(mappedBy = "jobAdvertisements")
	 private List<Experience> experiences;
}
