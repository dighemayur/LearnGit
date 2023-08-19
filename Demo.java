import java.util.*;
public class Demo{
	static String name=null;
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("before calling to Demo1");
		name=sc.nextLine();
		Demo dm =new Demo();
		dm.m2();
		
		}
		void m2(){
			///static int abc=10;
			Demo1 demo1=new Demo1(name);
		    //demo1.m1();
		}

}


 class Demo1{
		
		 Demo1(){
			System.out.println("In Demo1");
		}
		
		Demo1(String name){
			System.out.println("My Name is : "+name);
		}
		
	}