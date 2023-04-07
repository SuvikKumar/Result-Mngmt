import java.util.Scanner;
class student{
String name;
int rollnumber;
public void initialize(){
System.out.println("enter the name of the student:");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.println("enter the roll number of the student:");
rollnumber=sc.nextInt();
}}
class exam extends student{
int[] marks=new int[6];
public void getmarks(){
{Scanner sc = new Scanner(System.in);
System.out.println("enter the marks of the student in six subjects");
for(int i=0;i<6;i++)
{marks[i]=sc.nextInt();
System.out.println("Marks "+(i+1)+" :"+marks[i]);
}}}}
class result extends exam{
float tot;
float avg;
public void compute()
{
for(int i=0;i<6;i++) 
tot = tot+ marks[i];
avg=tot/6;
System.out.println("Total :"+tot);
System.out.println("Average :"+avg);
}}
public class studentinheritance {
public static void main(String args[]) {
int n,i;
System.out.print("enter the number of students");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
result students[]=new result[100];
for(i=0;i<n;i++) {
System.out.println("enter the details of students" + (i+1));
students[i]=new result();
students[i].initialize();
students[i].getmarks();
students[i].compute();
