import java.util.Scanner;

public class HelloWorld{
    
    public static void main (String[] args){
        
        int miles;
        double kilometer;
	
        Scanner input = new Scanner(System.in);

        System.out.println("Enter distance in miles =");
        miles = input.nextInt();

        kilometer = miles * 1.609;

        System.out.println("Miles in kilometer = " + kilometer + " km");

        input.close();
    }

}