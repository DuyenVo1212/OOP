package bttamgiac;

public class TamGiac {
	private float ma;
	private float mb;
	private float mc;
	public float getMa() {
		return ma;
	}
	public void setMa(float ma) {
		if(ma >= 0) {
			this.ma = ma;
		}
	}
	public float getMb() {
		return mb;
	}
	public void setMb(float mb) {
		if(mb >= 0) {
			this.mb = mb;
		}
	}
	public float getMc() {
		return mc;
	}
	public void setMc(float mc) {
		if(mc >= 0) {
			this.mc = mc;
		}
	}
	public TamGiac() {
		this(0.0f, 0.0f, 0.0f);
	}
	public TamGiac(float ma, float mb, float mc) {
		setMa(ma);
		setMb(mb);
		setMc(mc);
	}
	public float ChuVi() {
		return ma+mb+mc;
	}
	public double DienTich() {
		double p = (ma+mb+mc)/2;
		double pp = Math.sqrt(p*(p-ma)*(p-mc)*(p-mb));
		return pp;
	}
	public String setTamGiac() {
		if(ma*ma == mb*mb+mc*mc || mb*mb == mc*mc+ma*ma || mc*mc == ma*ma+mb*mb) {
			return "Tam giac vuong";
		}
		if(ma==mb && ma == mc && mb == mc) {
			return "Tam giac deu";
		}
		if(ma==mb && ma == mc && mb != mc) {
			return "Tam giac can";
		}
		if(mb==mc && mb==ma && mc != ma) {
			return "Tam giac can";
		}
		if(mc==ma && mc==mb && ma!=mb) {
			return "Tam giac can";
		}
		return "la 1 tam giac";
	}
	public String TieuDe() {
		return String.format("%10s %10s %10s %10s %10s %15s", 
				"ma", "mb", "mc", "Chu Vi", "Dien Tich", "Loai Tam Giac");
	}
	public String toString() {
		return String.format("%10s %10s %10s %10s %10s %15s",
				ma, mb, mc, ChuVi(), DienTich(), setTamGiac());
	}
}
