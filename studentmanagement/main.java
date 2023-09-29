package studentmanagement;

public class main {

	public static void main(String[] args) 
	{		
		  student[] s= new student[2];
	        
	        s[0]= new student();
	        s[1]= new student();

	        s[0].setmark(50);
	        s[0].setname("rutik");
	        s[0].setrollno(4);

	        s[1].setmark(75);
	        s[1].setname("tushar");
	        s[1].setrollno(12);
	        
	        System.out.println("Name :" + s[0].getname());
	        System.out.println( "Mark : " + s[0].getmark());
	        System.out.println("Roll No : " +s[0].getrollno());
	        System.out.println();
	        System.out.println("Name :" + s[1].getname());
	        System.out.println( "Mark : " + s[1].getmark());
	        System.out.println("Roll No : " +s[1].getrollno());
	      
	}

}
