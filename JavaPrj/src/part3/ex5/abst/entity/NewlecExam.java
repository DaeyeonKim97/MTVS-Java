package part3.ex5.abst.entity;

public class NewlecExam extends Exam {
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0); // 코드집중
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		return super.total()+this.com;
	}
	@Override
	public double avg() {
		return total()/4.0;
	}
}
