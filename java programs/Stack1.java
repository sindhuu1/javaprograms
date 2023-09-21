import java.util.*;
public class Stack1{
public static void main(String arg[]){
Stack<String> stack = new Stack<String>();
 stack.push("Sindhu");
stack.push("Sreeja");
stack.push("Prathibha");
stack.push("Vijji");
stack.push("Soumya");
Iterator<String> itr=stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
stack.pop();
System.out.println("After pop");
Iterator<String> itr2=stack.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
}
}
