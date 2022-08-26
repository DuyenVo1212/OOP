package B_PERSON;

public class Student extends Person{
	private int scores1;
	private int scores2;
	private int review;
	
	public Student(String fullname, String address, int scores1, int scores2, int review) {
		super(fullname, address);
		this.scores1 = scores1;
		this.scores2 = scores2;
		this.review = review;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fullname, String address) {
		super(fullname, address);
		// TODO Auto-generated constructor stub
	}

	public int getScores1() {
		return scores1;
	}
	public void setScores1(int scores1) {
		this.scores1 = scores1;
	}
	public int getScores2() {
		return scores2;
	}
	public void setScores2(int scores2) {
		this.scores2 = scores2;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public double getAverga() {
		return (this.scores1+this.scores2)/2;	
	}
	//ham nhap student
	public static Student inputStudent() {
		String fullname=Input.inputString("Nhap full ten");
		int review=Input.inputInt("Nhap review");
		String address =Input.inputString("Nhap dia chi");
		int scores1=Input.inputInt("Nhap diem 1");
		int scores2=Input.inputInt("Nhap diem 2");
		return new Student(fullname, address, scores1, scores2, review);		
	}

	@Override
	public String toString() {
		return "Student=" +super.toString()+ "getAverga()="
				+ getAverga();
	}
	
}
