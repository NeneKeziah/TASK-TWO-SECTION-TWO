//this program prompts user to create a main class
public class sstatic{
    static int a=5;
//non-static method
    void f(){
        System .out.println("The number above is an odd number");
  
  }
//method 2
public static void main(String[]args){
    sstatic obj=new sstatic();
    System.out.println(obj.a);
    obj.f();
}











}