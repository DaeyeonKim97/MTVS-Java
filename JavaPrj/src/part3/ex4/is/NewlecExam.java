package part3.ex4.is;

public class NewlecExam extends Exam {
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0); // 코드집중
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}
	
	@Override
	public int total() {
		return super.total()+this.com;
	}

}
