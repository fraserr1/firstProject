import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int i =0;
		String s0;
		Scanner s =  new Scanner(System.in);
		System.out.println("A = " + a);
		System.out.println("Give a string: ");
		s0 = s.nextLine();
		System.out.println("\n String is " + s0);
		
		for (i=0;i<5;i++){
			System.out.println("\n String Number " + i);
		}
		// large comments are ctrl + "\"
		if (i==5){
			System.out.println("\n i is 5");
		}
		else{
			System.out.println("\n i is "+ i);
		}
	}

}
