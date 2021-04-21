package imostafizur;

import java.util.Scanner;

public class Main {
	
static int add(int a,int b){
int c= a+b ;
 return c ;

}

public static void main(String[] args) {
	
	int z;
	
	Scanner scan = new Scanner(System.in);
	
	int x = scan.nextInt();
	int y = scan.nextInt();
	scan.close(); // To close the Scanner
	
	

     z= add(x,y);
	
     System.out.println(z);
	
     
	
}



}
