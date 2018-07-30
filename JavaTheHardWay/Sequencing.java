import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args) {
    // THIS CODE IS BROKEN UNTIL YOU FIX import junit.framework.TestCase;

    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    salesTax = price *0.0825;
    total = price + salesTax;

    System.out.print( "How much is the purchase price? ");
    price = keyboard.nextDouble();

    System.out.println( " Item price:\t" + price );
    System.out.println( " Sales tax:\t" + salesTax);
    System.out.println( " Total cost:\t" + total );


  }
}

// Does not compile. Price is still not defined, unable to compile until it is defined. 
