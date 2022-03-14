import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        float firstNumYohannes, secondNumYohannes, sum, difference, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program will calculate the sum, difference, product and quotient for two numbers.");
        System.out.println("Enter the first number (and press enter): ");
        firstNumYohannes=Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press enter): ");
        secondNumYohannes=Float.parseFloat(br.readLine());

        sum = firstNumYohannes + secondNumYohannes;
        difference = firstNumYohannes - secondNumYohannes;
        product = firstNumYohannes * secondNumYohannes;
        quotient = firstNumYohannes / secondNumYohannes;

        System.out.printf("You have entered two numbers, the first is: " + "%2.2f", firstNumYohannes);
        System.out.printf("and the second is: " + "%2.2f", secondNumYohannes);

        System.out.println();

        System.out.printf("Sum = " + "%2.2f, \n", + sum);
        System.out.printf("Difference = " + "%2.2f, \n", + difference);
        System.out.printf("Product = " + "%2.2f, \n", + product);
        System.out.printf("Quotient = " + "%2.2f, \n", + quotient);
    }
}
