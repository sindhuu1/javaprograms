public class TestArray{
public static void main(String ard[]){
double[] myList = {1.9,2.9,3.4,3.5};
for(int i = 0; i<myList.length;i++){
System.out.println(myList[i]+"");
}
double total = 0;
for(int i = 0;i<myList.length;i++){
total+=myList[i];
}
System.out.println("Total is" +total);
}
}