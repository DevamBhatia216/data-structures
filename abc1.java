import java.util.*;

class abc1
{
   int n1,n2;
   static int n3;
   void s(int n1,int n2,int n3)
   {
   this.n1=n1*n1;
   this.n2=n2*n2;
   n3=n3*n3;
   System.out.println(+n1+" "+n2+" "+n3);
   }
public static void main(String... args)
   {
	  
     abc1 ob=new abc1();
	 ob.s(4,7,9);
	 
	 
	 
	}
	
}