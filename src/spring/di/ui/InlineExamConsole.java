package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;
	
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	public InlineExamConsole(Exam exam) {
		this.exam=exam;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam=exam;
		
	}

}
