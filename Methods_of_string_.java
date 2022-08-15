//Write a program using string builtin function 
//where you have to implement something by using the functions
package String;
import java.util.Scanner;
public class Methods_of_string_ {
	String s1,s2;//string declared......
	int res;//variable declaration......
	Scanner sc=new Scanner(System.in);//scanner 
	public static void main(String args[]) //main method.....
	{
		Methods_of_string_ obj=new Methods_of_string_();//create object for calling the methods...
		obj.compared();
		obj. length();
		obj.equal();  
        obj.upper_lower();
        obj.charAt();
	    obj.concat();
		obj.contain();
		obj.split_method1();
		obj.join_method();
	}
	public void acept() 
	{
		 System.out.println("Enter the first name: ");//get the value from user.....
		    s1=sc.nextLine();
		    System.out.println("Enter the Second name: ");//get the value from user.....
		    s2=sc.next();
		    
    }
    public  void compared()
    {
        acept();//call the acept methods.......
    	res=s1.compareTo(s2);
        System.out.println("The res is :"+res);
        if (res==0) {
        	System.out.println("s1 is equal to s2");
        }
        else {
        	System.out.println("s1 is not equal to s2");
        }
    }
    public void length() 
    {
	acept();//call the acept methods.......
	res=s1.length();
	System.out.println("s1 length is ="+res);
	res=s2.length();
	System.out.println("s2 length is ="+res);
    }
    public void equal() 
    {
    Boolean res1;
	acept();//call the acept methods.......
	res1=s1.equals(s2);
	System.out.println(res1);
    }
    public void upper_lower() 
    {
	acept();//call the acept methods.......
	System.out.println("convert to s1 in upper letters: "+s1.toUpperCase());
	System.out.println("convert to s2 in lower letters: "+s2.toLowerCase());
    //this is for trim method in trim eliminates the spaces before and after the string....
	String s3="  PREM  ";
	System.out.println("USE THE TRIM METHOD:"+s3.trim());
	//startwith and endwith methods.......
	String s4="manisha";
	System.out.println(s4.startsWith("m"));
	System.out.println(s4.endsWith("a"));
    }
    public  void charAt()
    {
	acept();//call acept methods....
	System.out.println(s1.charAt(3));	
    }
    public void concat()
    {
	acept();//call the acept methods.......
	if(s1.length()==0  && s2.length()==0)			// compare a length here 
	{
		System.out.println("Try again! "); 
	}
	else
	System.out.println("After Concat String :  "+s1.concat(s2));  // adding string here
    }
    public void contain()
    {
	acept(); // call the acept method.......
	System.out.println(s1.contains("JAVA"));// check that  string exist or not 
	System.out.println(s2.contains("CODE"));// check that  string exist or not
    }
 	public void split_method1()
 	{
		System.out.print("Enter a String with spaces : "); // Taking a String with user
		String s5= sc.nextLine();  
		String[] words=s5.split("\\s");		//splits the string based on whitespace  
		
		//using java foreach loop to print elements of string array  
		for(String wo:words)
		{  
		System.out.print(wo);  
		}
 	}
		public void join_method()
		{
			acept();//call the acept methods.......
			System.out.print(String.join(s1,s2," Join_String"));    // join the string .		
}
}