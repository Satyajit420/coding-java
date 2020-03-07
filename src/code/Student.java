package code;

public class Student {
public static  int z;

public void get()
{   z=10;
	System.out.println(z);
}



public static void main(String[] args)
{
 System.out.println(z);
 Student s=new Student();
 s.get();
 System.out.println(z);
}
}