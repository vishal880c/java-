import java.util.Scanner;

 class Arithmetic {

     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.println("Welcome to Arithmatic  calculator\n ");
         System.out.println(" Please enter first number ");
         int fisrt = input.nextInt();
         System.out.println(" Now enter Second number ");
         int Second = input.nextInt();


         int add = fisrt +  Second;
         int sub = fisrt -  Second;
         int mul = fisrt *  Second;
         int div = fisrt /  Second;
         int mod= fisrt %  Second;


         System.out.println(" Addition is:   "+ add );
         System.out.println(" Subtraction  is:   "+ add );
         System.out.println(" Multiplication  is:   "+ add );
         System.out.println(" Division is:   "+ add );
         System.out.println(" Modulus  is:   "+ add );





    }
}

