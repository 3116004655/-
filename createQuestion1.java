package arithmetic;

import java.util.Random;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


//带真分数四则运算
public class createQuestion1 {
	public void testQuestion(String num,String max) {
	     fileUnit fileunit=new fileUnit();
	     int num1=Integer.parseInt(num);
	     int max1=Integer.parseInt(max);
	     String result=null;
	     String operator1=null;
	     String txt=null;
	     String txt1=null;
	     int operator,operatorNum;
	     //int[] a=new int[10000];
	     Fraction [] arr=new Fraction[10000];
	     Fraction [] arr1=new Fraction[4];
	     String [] Result = new String [10000];
	     System.out.println("生成的带真分数四则运算试题为：");
	     
	     for(int j=1;j<=num1;j++) {
	     //a[0]=(int)(Math.random()*max1);
	     //result=a[0]+"";
	      result=null;
	   	  Random c = new Random();
		  Random d = new Random();
		  Fraction e = new Fraction(c.nextInt(max1)+1,d.nextInt(max1)+1);
		  arr1[0]=e;
	     operatorNum=(int)(Math.random()*max1%4);
	     while(operatorNum==0) {
	    	 operatorNum=(int)(Math.random()*max1%4);
	     }
	     for(int i=1;i<operatorNum+1;i++)
	     {
	    // a[i]=(int)(Math.random()*max1);
	     Fraction b = new Fraction(c.nextInt(max1)+1,d.nextInt(max1)+1);
	     operator=(int)(Math.random()*max1%4);
	     switch(operator) {
	     case 0:operator1="+";arr1[i]=arr1[i-1].add(b);break;
	     case 1:operator1="-";arr1[i]=arr1[i-1].subtraction(b);break;
	     case 2:operator1="*";arr1[i]=arr1[i-1].multiplication(b);break;
	     case 3:operator1="/";arr1[i]=arr1[i-1].division(b);break;
	     }
	     if(i==1) {
	    	 result="("+e+")"+operator1+"("+b+")"+"";
	     }
	     else {
	    	 result="("+result+")"+operator1+"("+b+")"+"";
	     } 
	     } 
	     arr[j]=arr1[operatorNum];
	     System.out.println("题目"+j+":"+"result="+result);  
	     if(txt==null) {
	         txt="result="+result+"\n";
	     }
	     else {
	         txt=txt+"result="+result+"\n";
	     }
	     Result[j]=arr[j]+"";
	     if(txt1==null) {
	    	 txt1="result="+Result[j]+"\n";
	     }
	     else {
	    	 txt1=txt1+"result="+Result[j]+"\n";
	     }
	     }
	     /*
	     ScriptEngineManager manager = new ScriptEngineManager();
	     ScriptEngine engine = manager.getEngineByName("js");//可以通过这个来调用JS模块的函数
	     for(int k=1;k<=num1;k++) {
	     Object result2;
		try {
			result2 = engine.eval(Result[k]);
		     if(txt1==null) {
		    	 txt1="result="+result2+"\n";
		     }
		     else {
		    	 txt1=txt1+"result="+result2+"\n";
		     }
		    
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	     */
	     String fileName="c:\\Exercises.txt";
	     System.out.println("练习题目已生成，存储路径为："+fileName);
	     fileunit.WriteTextFile(fileName,"题目"+"\n");
	     fileunit.WriteTextFile(fileName, txt);
	     String fileName1="c:\\Answers.txt";
	     System.out.println("练习题目答案已生成，存储路径为："+fileName1);
	     fileunit.WriteTextFile(fileName1,"答案"+"\n");
	     fileunit.WriteTextFile(fileName1, txt1);     
	     
}
}
