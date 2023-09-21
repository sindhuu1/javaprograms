import java.util.*;
public class Test{
        public static void main(String args[]){
 char ca;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 subject marks");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        int total=n1+n2+n3+n4+n5;
        float p= (total/500)*100;

System.out.println("percentage = "+p);
if(p <= 100 && p >= 75){
ca='A';
}else if(p < 75 && p >= 60){
ca='B';
}else if(p< 60 && p >= 50){
ca='C';



        

