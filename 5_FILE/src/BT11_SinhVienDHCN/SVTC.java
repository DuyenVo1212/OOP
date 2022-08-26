package BT11_SinhVienDHCN;

public class SVTC extends Student {
	private int grade;

	public SVTC(int age, String name, int grade) {
		super(age, name);
		this.grade = grade;
	}

	public SVTC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SVTC(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
	public String getgrade() {
		switch(grade) {
		case 1:return "Nam 1";
		case 2:return "Nam 2";
		default:return "Da ra truong";
		
		}
	}
	public void setgrade(int grade) {
		this.grade=grade;
	}
	public void Nhap() {
		super.Nhap();
		System.out.println("Chon nam 1 hay 2");
		grade=sc.nextInt();
	}

	@Override
	public String toString() {
		return "SVTC"+super.toString()+"grade="+getgrade();
	}
	
}
