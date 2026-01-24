class Student{
    int rollno;
    String name;
    int marks;

}



public class arrayOfObjects {
    public static void main(String[] args) {
        Student[] students=new Student[3];

        students[0]=new Student();
        students[0].rollno=1;
        students[0].name="Alice";
        students[0].marks=85;

        students[1]=new Student();
        students[1].rollno=2;
        students[1].name="Bob";
        students[1].marks=90;

        students[2]=new Student();
        students[2].rollno=3;
        students[2].name="Charlie";
        students[2].marks=78;

        /*for user input code
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Student[] students = new Student[n];

        // Taking input
        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Roll No: ");
            students[i].rollno = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Marks: ");
            students[i].marks = sc.nextInt();
        }
 */
        for(int i=0;i<students.length;i++){
            System.out.println("Student " + (i+1) + ":");
            System.out.println("Roll No: " + students[i].rollno);
            System.out.println("Name: " + students[i].name);
            System.out.println("Marks: " + students[i].marks);
            System.out.println();
        }
    }
    
}
