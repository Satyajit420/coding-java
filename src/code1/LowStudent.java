package code1;

import code.Student;

public class LowStudent {
	public static int m=Student.z;

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.get();
		System.out.println(m);
	}
}
