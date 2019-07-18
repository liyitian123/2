import java.util.Vector;
import java.util.*;

public class num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num c=new num();
//	c.clone();
		int sum=0;
		Vector a=new Vector();//动态数组
		a.add(1);//传进去的是int,经过Integer（包装类）的包装，变为Object类的对象
		a.add(2);
		for( int i=0;i<a.size();i++)//java为强类型语言，每个变量前都要声明类型，在括号
		{
			Object obj=a.get(i);//
//			Object obj=a.get(i);//get得到的是一个Object的对象，因此要强制类型转换 
			int temp=(int) obj;//由于我们输入的int,最后也要转化为int,因此再次强制类型转换
//			
//		}
//		Vector<Integer> b=new Vector<Integer>();
//		
//		b.add(1);
//		b.add(2);
//		b.add(3);
		String s=new String("a");
		String s1=new java.util.Scanner(System.in).next();
		String s2=new String("a");
		String s4="a";
		String s5="a";
		String s6="b";
	
		if (s==s1)
		{
			System.out.println("s4");
		}
		if(s.equals(s1 ))
		{
			System.out.println("s5");
		}
		
		if(s4==s5)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
		
		if(s.equals(s2))
		{
			System.out.println("s3");
		}
		
	}
	//五到大提，选择，填空，读程序写运型结果，看类图写代码，看需求设计类图
	//overloading（覆盖）,继程，构造方法的顺序，静态（static）,函数重载（支持多态）
		
	
	}
}
