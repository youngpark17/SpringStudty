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
		
		//스프링에게 지시서로 남기자.
//		Exam exam = new NewlecExam(); //exam과 console 객체는 정적으로 바뀔 수 있음.
//		ExamConsole console = new GridExamConsole();
//		console.setExam(exam);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		Exam exam = context.getBean(Exam.class);
		
		System.out.println(exam.toString());
		//ExamConsole console =(ExamConsole)context.getBean("console");
		ExamConsole console =context.getBean(ExamConsole.class); //ExamConsole 타입에 맞는 클래스를 알아서 꺼내라.
		console.print();
		
		List<Exam> exams = (List<Exam>)context.getBean("exams");
		for(Exam e : exams) {
			System.out.println(e);
		}
		
	}

}
