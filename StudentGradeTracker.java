import java.util.*;
public class StudentGradeTracker{

    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Grade O: 10\nGrade A+:9\nGrade A:8\nGrade B+:7\nGrade B:6\nGrade C+:5\nGrade C:4\nGrade D:Fail");
        System.out.println("Enter Total Number Of Students in the class: ");
        int n=sc.nextInt();
        int StudentArray[]=new int [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the grade(equivalent integer value) of Roll No "+(i+1)+" : ");
            StudentArray[i]=sc.nextInt();
        }
        Arrays.sort(StudentArray);
        double Average =0;
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=total+StudentArray[i];
        }
        Average=total/n;
        System.out.println("Average grade :"+Average);
        System.out.println("Highest grade :"+StudentArray[n-1]);
        System.out.println("Lowest grade :"+StudentArray[0]);
    }
}
