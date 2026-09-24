import java.util.Scanner;

class ExampleUserInput {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String name = "";
        System.out.print("Please enter your name: ");
        name = scan.next();

        int Age = 0;
        System.out.print("Please enter your Age:");
        Age = scan.nextInt();
		
		float height=0;
		System.out.print("Please enter your height:");
		height = scan.nextFloat();
		
		double marks=0;
		System.out.print("Please enter your marks:");
		marks = scan.nextDouble();
		
		boolean student;
		System.out.print("Are you a student? (true/false): ");
	    student = scan.nextBoolean();
		
		System.out.println("Your name is " + name);
        System.out.println("-------------");
        System.out.println("Your age is " + Age);
		System.out.println("-------------");
		System.out.println("Your height is " + height);
		System.out.println("********");
		System.out.println("Your marks is " + marks);
        System.out.println("********");
	    System.out.println("Student: " + student);
    }
}