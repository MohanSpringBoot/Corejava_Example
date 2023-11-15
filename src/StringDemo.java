
public class StringDemo {
	
	public static void main(String args[]){  
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   String s5=new String("Sachin");
		   String s6=new String("Sachin");
		   String s7=s2.intern();
		   StringBuffer sb=new StringBuffer("Sachin"); 
		   StringBuffer sb1=new StringBuffer("Sachin");
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   System.out.println("heap "+s5.equals(s6));//true 
		   System.out.println("heap =="+(s5==s6));//false 
		   System.out.println(s1==s2);//true
		   System.out.println(s2==s7);//true
		   System.out.println(s7.equals(s5));//true
		   
		   System.out.println("stringbuffer::=::"+(sb==sb1));//true
		   System.out.println("stringbuffer::"+sb.equals(sb1));//true

		 }  

}
