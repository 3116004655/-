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
	System.out.println("四则运算试题");
	System.out.println("-n:输入生成题目个数");
	while(temp)
	{
	Scanner input1=new Scanner(System.in);
	func=input1.next();
	if(func.equals("-n")) {
		System.out.println("请输入生成题目个数:");
		Scanner input2=new Scanner(System.in);
		num=input2.next();
		System.out.println("-r:输入数值范围");
		Scanner input3=new Scanner(System.in);
		func1=input3.next();
		if(func1.equals("-r"))
		{
			System.out.println("请输入数值范围:");
			Scanner input4=new Scanner(System.in);
			max=input4.next();
		    temp=false;
		}
	}else {
		System.out.println("输入错误，请重新输入！");
		temp=true;
	}
	}
    question.testQuestion(num, max);
    question1.testQuestion(num, max);
    
	
	
  }
}
