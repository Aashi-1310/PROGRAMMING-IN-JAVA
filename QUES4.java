/*Create an exception subclass UnderAge, which prints “Under Age” along with the age value when an object of UnderAge class is printed in the catch statement. Write a class exceptionDemo in which the method test() throws UnderAge exception if the variable age passed to it as argument is less than 18. Write main() method also to show working of the program.
*/
import java.util.*;
class UnderAge extends Exception {
int detail;

public UnderAge(int a) {
detail = a;
    }

public String toString() {
return "UnderAge[" + detail+ "]:Age is less than 18";
    }
}
Class exceptionDemo {

static void test(int x) throws UnderAge {
if (x < 18) {
UnderAge u = new UnderAge(x);
throw u;
        }
 else {
System.out.println("Age is greater than 18.");
        }
    }
public static void main(String args[]){
int age;
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age : ");
age = sc.nextInt();
try{
test(age);
        }
catch (UnderAge e) {
System.out.println("Caught " + e);
        }
  }
}
