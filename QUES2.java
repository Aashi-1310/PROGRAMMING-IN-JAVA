/*Create a class TwoDim which contains private members as x and y coordinates in package P1. Define the default constructor, a parameterized constructor and override toString() method to display the co-ordinates. Now reuse this class and in package P2 create another class ThreeDim, adding a new dimension as z as its private member. Define the constructors for the subclass and override toString() method in the subclass also. Write appropriate methods to show dynamic method dispatch. The main() function should be in a package P.
*/
package P1;
public class TwoDim{
private int x;
private int y;

publicTwoDim(int x, int y){
this.x=x;
this.y=y;
}

public String toString(){
return "x = "+x+",y = "+y;
}
}

package P2;
import P1.*;
public class ThreeDim extends TwoDim{
private int z;

public ThreeDim(int x,int y, int z){
super(x,y);
this.z=z;
}
public String toString(){
return super.toString()+" ,z = "+z;
}
}

package P;
import P1.*;
import P2.*;
public class Main{
public static void main(String[] args) {
TwoDim t2= new TwoDim(10,15);
ThreeDim t3= new ThreeDim(20,40,20);
TwoDim t;
t=t2;
System.out.println(t);
t=t3;
System.out.println(t); 
}
}

