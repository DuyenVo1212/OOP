package BT11_SinhVienDHCN;

public class SVCD extends Student{
	private int grade;

	public SVCD(int age, String name, int grade) {
		super(age, name);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	//tuong tu ben SVTC, khac nhau so nam

}
