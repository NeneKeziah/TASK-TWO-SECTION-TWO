//this program contains assigned questionTask 2, no3 which prompts user to enter an year and check whether the year is leap or not 
package leapyear;
import java.util.Scanner;
public class leapyear {
    public static void main(String[]args){
         
        class year{
            public static void leap(){
                year.leap();
            }
        }
int year;
System.out.println("enter year");
Scanner input=new Scanner(System.in);
year=input.nextInt();

if((year%4)==0){
    System.out.println("Is a leap year");

    
}
else{
    System.out.println("it is not a leap year");
}

            }
        }
    
    

