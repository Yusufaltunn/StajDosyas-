package overriding;

public class OgrenciKredi extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar *1.10;
	}

}
