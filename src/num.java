import java.util.Vector;
import java.util.*;

public class num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num c=new num();
//	c.clone();
		int sum=0;
		Vector a=new Vector();//��̬����
		a.add(1);//����ȥ����int,����Integer����װ�ࣩ�İ�װ����ΪObject��Ķ���
		a.add(2);
		for( int i=0;i<a.size();i++)//javaΪǿ�������ԣ�ÿ������ǰ��Ҫ�������ͣ�������
		{
			Object obj=a.get(i);//
//			Object obj=a.get(i);//get�õ�����һ��Object�Ķ������Ҫǿ������ת�� 
			int temp=(int) obj;//�������������int,���ҲҪת��Ϊint,����ٴ�ǿ������ת��
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
	//�嵽���ᣬѡ����գ�������д���ͽ��������ͼд���룬�����������ͼ
	//overloading�����ǣ�,�̳̣����췽����˳�򣬾�̬��static��,�������أ�֧�ֶ�̬��
		
	
	}
}
