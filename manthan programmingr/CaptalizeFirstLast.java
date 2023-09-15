import java.util.Scanner;
public class CaptalizeFirstLast {
    public static void main (String[] args){
      
        Scanner scanner=new Scanner (System.in);

        System.out.println("Enter the string");

        String inputString=scanner.nextLine();

        String result=CaptalizeFirstLast( inputString);

        System.out.println("Modified String:" result);
        scanner.close();

    }
    
}
