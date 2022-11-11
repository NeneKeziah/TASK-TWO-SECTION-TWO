//this program contains assigned  quesion Task 2, no 2 tha prompts user to enter marks for three units and gives them avarege
package Threeunits;
import java.util.Scanner;
public class threeunits {
    public static void main(String[]args){
        class marks{
            public static void results(){
                marks.results();
            }
        }
                float java,net,maths,tot,avg;
                Scanner input=new Scanner(System.in);
                System.out.println("Enter marks for Java:");
                float javamarks=input.nextInt();
                System.out.println("Enter marks for networking:");
                float netmarks=input.nextInt();
                System.out.println("Enter marks for maths:");
            
                float mathsmarks=input.nextInt();
            float totmarks=javamarks+netmarks+mathsmarks;
            float avgmarks=totmarks/3;
                
            System.out.println("The average mark is:" +avgmarks);
                

            }
        }
    
    

