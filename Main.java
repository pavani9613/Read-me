import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            StudentGroup student_obj=new StudentGroup(3);
            Student[] students=new Student[3];

        int id,index; String fullName; Date birthDate; double avgMark;
	    for(int i=1;i<=students.length;i++)
        {
            System.out.println("Enter Student id");
            id=scan.nextInt();
            System.out.println("Enter Student Name");
            fullName=scan.nextLine();
            System.out.println("Enter Student Date of birth");
            String date = scan.next();
            birthDate=null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {

                    birthDate = dateFormat.parse(date);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            System.out.println("Enter Student avgmarks");
            avgMark=scan.nextDouble();
            students[i]=new Student(id,fullName,birthDate,avgMark);
        }
        student_obj.setStudents(students);

        System.out.println("Enter Student id");
            id=scan.nextInt();
            System.out.println("Enter Student Name");
            fullName=scan.nextLine();
            System.out.println("Enter Student Date of birth");
            String date = scan.next();
            birthDate=null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            try {

                    birthDate = dateFormat.parse(date);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            System.out.println("Enter Student avgmarks");
            avgMark=scan.nextDouble();
             System.out.println("Enter Student index");
             index=scan.nextInt();
             Student stu_obj=new Student(id,fullName,birthDate,avgMark);
            student_obj.addFirst(stu_obj);
            student_obj.setStudent(stu_obj,index);

		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	}

}
