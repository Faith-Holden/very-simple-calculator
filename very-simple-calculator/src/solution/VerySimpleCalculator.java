package solution;
import textio.TextIO;
public class VerySimpleCalculator {
    public static void main(String[]args){
        double number1;
        char operator;
        double number2;
        double result;
        do{
            System.out.println("Please type a simple equation. Valid operators are (-),(+),(*), and (/). Example-> 47*2.8");
            System.out.println("Type \"0\" when you're done.");
            number1 = TextIO.getDouble();
            operator = TextIO.getChar();
            number2 = TextIO.getlnDouble();
            switch (operator){
                case '*': {
                    result = number1 * number2;
                    System.out.println(number1 + "*" + number2 + "=" + result);
                    break;
                }
                case '+': {
                    result = number1 + number2;
                    System.out.println(number1 + "+" + number2 + "=" + result);
                    break;
                }
                case '-': {
                    result = number1 - number2;
                    System.out.println(number1 + "-" + number2 + "=" + result);
                    break;
                }
                case '/': {
                    result = number1 / number2;
                    System.out.println(number1 + "/" + number2 + "=" + result);
                    break;
                }
                default:
                    System.out.println("That was not a valid operator!");
                    break;
            }
        }while (number1 != 0);
    }
}
