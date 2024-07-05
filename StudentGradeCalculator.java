import java.util.Scanner;

public class StudentGradeCalculator{

    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("=================================");
      System.out.println("   STUDENT GRADE CALCULATOR   ");
      System.out.println("=================================");
      System.out.println("Enter the number of subject : ");
      int nsub=sc.nextInt();
      int total=0;
      for(int i=0;i<nsub;i++)
      {
        System.out.println("Enter marks obtained in sub "+(i+1)+":");
         int marks=sc.nextInt();
         total+=marks;
      }
      double avg= total/nsub;
      char Grade;
      if(avg>=90)
      {
        Grade='O';
      }
      else if (avg>=80) 
      {
        Grade='A';
      }
      else if(avg>=65)
      {
        Grade='B';
      }
      else if (avg>=45) 
      {
        Grade='C';
      }
      else
      {
        Grade='F';
      }
      System.out.println("Total Marks Scored is : " +total);
      System.out.println("Average Percentage Gained is : " +avg+ " % ");
      System.out.println("Grade : " +Grade);
      
      

    }
}