package project;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p=new Person();
       p.who();
       student.who();   
 }
}
class Person
{
 public static void who()
  {
	System.out.println("I am person");
  }
}
class student extends Person
{
   public static void who()
   {
	 System.out.println("I am student");
   }
}
class teacher
{
   static { System.out.println("I am student"); } 	
}