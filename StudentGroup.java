import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
    Scanner scan=new Scanner(System.in);
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	    //int id; String fullName; Date birthDate; double avgMark;
	    for(int i=1;i<=students.length;i++)
        {
           System.out.println(students[i].getId()+" "+students[i].getFullName()+" "+students[i].getBirthDate()+" "+students[i].getAvgMark());
        }
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
	    for(int i=1;i<=students.length;i++)
        {
            this.students[i]=new Student(students[i].getId(),students[i].getFullName(),students[i].getBirthDate(),students[i].getAvgMark());
        }
		// Add your implementation here

	}

	@Override
	public Student getStudent(int index) {
	    for(int i=0;i<students.length;i++)
        {
            if(index==i)
            {
                System.out.println(students[i].getId()+" "+students[i].getFullName()+" "+students[i].getBirthDate()+" "+students[i].getAvgMark());
            }
        }
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
	    students[index]=new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark());
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {

		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {

		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {

		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
	    //Date today= new Date().getYear;
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
	    for(int i=1;i<=students.length;i++)
        {
           // Date currentDate=new Date();
           // SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");;
           // Date date =(Date)formatter.parse(students[i].getBirthDate());
           // long diff = currentDate.getTime() - date.getTime();
           // long d=(1000*60*60*24*365);
            //long years = Math.round(diff / d);
            //int age1=(int) years;
            //if (age==age1)
            //{
             //   System.out.println(students[i].getId()+" "+students[i].getFullName()+" "+students[i].getBirthDate()+" "+students[i].getAvgMark());
            //}
        }

        return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
	    int index=1;
	    Student stu[]=new Student[students.length];
	    for(int i=1;i<=students.length;i++)
        {
            for(int k=i+1;k<=students.length;k++)
            {
               if(students[k].getAvgMark()>students[i].getAvgMark())
                {
                    stu[index]=students[k];
                    students[k]=students[i];
                    students[i]=students[index];
                }
            }
        }

		// Add your implementation here
		return students;
	}

	@Override
	public Student getNextStudent(Student student) {
	    int j=0;
	    for(int i=1;i<=students.length;i++)
        {
            if((this.students[i].getId()==student.getId())&&(i<students.length))
            {

                j=i+1;
                System.out.println(students[j].getId()+" "+students[j].getFullName()+" "+students[j].getBirthDate()+" "+students[j].getAvgMark());
                break;

            }
            else
            {
                System.out.println("Index out of bound");
                break;
            }
        }
		// Add your implementation here
		return students[j];
	}
}
