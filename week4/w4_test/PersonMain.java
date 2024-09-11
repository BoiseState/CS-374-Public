package week4.w4_test;

import week4.w4_code.Person;

public class PersonMain {
	  public static void main(String [] argv) {
		  String name = argv[0];
		  int weight = Integer.valueOf(argv[1]);
		  Person p1 = new Person (name);
		  p1.addKgs(weight);
		  System.out.println(p1);
		  PersonMain m = new PersonMain();
	  }
}
