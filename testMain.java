package arithmetic;

import java.util.Scanner;

public class testMain {
	public static void main(String[] args) {
		fileUnit fileunit=new fileUnit();
		createQuestion question=new createQuestion();
		createQuestion1 question1=new createQuestion1();
		String num=null;
		String max=null;
		String func=null;
		String func1=null;
		boolean temp=true;
		int line=0;
	System.out.println("������������");
	System.out.println("-n:����������Ŀ����");
	while(temp)
	{
	Scanner input1=new Scanner(System.in);
	func=input1.next();
	if(func.equals("-n")) {
		System.out.println("������������Ŀ����:");
		Scanner input2=new Scanner(System.in);
		num=input2.next();
		System.out.println("-r:������ֵ��Χ");
		Scanner input3=new Scanner(System.in);
		func1=input3.next();
		if(func1.equals("-r"))
		{
			System.out.println("��������ֵ��Χ:");
			Scanner input4=new Scanner(System.in);
			max=input4.next();
		    temp=false;
		}
	}else {
		System.out.println("����������������룡");
		temp=true;
	}
	}
    question.testQuestion(num, max);
    question1.testQuestion(num, max);
    
	
	
  }
}
