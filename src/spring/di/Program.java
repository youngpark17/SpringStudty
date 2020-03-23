package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���������� ���ü��� ������.
//		Exam exam = new NewlecExam(); //exam�� console ��ü�� �������� �ٲ� �� ����.
//		ExamConsole console = new GridExamConsole();
//		console.setExam(exam);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		Exam exam = context.getBean(Exam.class);
		
		System.out.println(exam.toString());
		//ExamConsole console =(ExamConsole)context.getBean("console");
		ExamConsole console =context.getBean(ExamConsole.class); //ExamConsole Ÿ�Կ� �´� Ŭ������ �˾Ƽ� ������.
		console.print();
		
		List<Exam> exams = (List<Exam>)context.getBean("exams");
		for(Exam e : exams) {
			System.out.println(e);
		}
		
	}

}
