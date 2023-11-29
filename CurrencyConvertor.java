/*
       This Program is demonstration of Currency Convertor between four currencies :
       1. Indian rupees
       2. American dollar
       3. Japanese Yen
       4. European Euro

       ---- This is my first Project of Java Language -----

       concepts used :
       1. classes and objects
       2. User input using Scanner class
       3. Exception Handling (try - catch - finally)
       4. while loop
       5. switch - case statement
       6. break statement with label
       7. use of private, public, static
       8. color output on console
       9. return statement

* */

import java.io.IOError;
import java.util.Scanner;

final class USD_INR {
    private double USD, INR;
    public double inrToUsd (double inr) {
        USD = inr * 0.012;
        return USD;
    }

    public double usdToInr (double usd) {
        INR = usd * 83.31;
        return INR;
    }
}

final class USD_JPY {
    private double JPY, USD;
    public double usdToJpy(double usd) {
        JPY = usd * 149.46;
        return JPY;
    }

    public double jpyToUsd (double jpy) {
        USD = jpy * 0.0067;
        return USD;
    }
}

final class JPY_INR {
    private double JPY, INR;
    public double jpyToInr (double jpy) {
        INR = jpy * 0.56;
        return INR;
    }

    public double inrToJpy (double inr) {
        JPY = inr * 1.80;
        return JPY;
    }
}

final class JPY_EUR {
    private double JPY, EUR;
    public double jpyToEur (double jpy) {
        EUR = jpy * 0.0061;
        return EUR;
    }

    public double eurToJpy (double eur) {
        JPY = eur * 163.65;
        return JPY;
    }
}
final class USD_EUR {
    private double USD, EUR;
    public double usdToEur (double usd) {
        EUR = usd * 0.91;
        return EUR;
    }

    public double eurToUsd (double eur) {
        USD = eur * 1.09;
        return USD;
    }
}

final class INR_EUR {
    private double INR, EUR;
    public double inrToEur (double inr) {
        EUR = inr * 0.011;
        return EUR;
    }

    public double eurToInr (double eur) {
        INR = eur * 91.23;
        return INR;
    }
}

public class CurrencyConvertor {

    private static String RESET = "\u001B[0m";
    private static String RED = "\u001B[31m";

    public static void main(String[] args) {


        USD_INR ui = new USD_INR();
        USD_EUR ue = new USD_EUR();
        USD_JPY uj = new USD_JPY();
        INR_EUR ie = new INR_EUR();
        JPY_EUR je = new JPY_EUR();
        JPY_INR ji = new JPY_INR();

        double usdValue, jpyValue, inrValue, eurValue;

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Choose the conversion : ");
            System.out.println("01. American Dollar to Indian Rupees \t\t02. Indian Rupees to American Dollar");
            System.out.println("03. American Dollar to Japanese Yen \t\t04. Japanese Yen to American Dollar");
            System.out.println("05. American Dollar to European Euro \t\t06. European Euro to American Dollar");
            System.out.println("07. Indian Rupees to European Euro \t\t\t08. European Euro to Indian Rupees");
            System.out.println("09. Japanese Yen to European Euro \t\t\t10. European Euro to Japanese Yen");
            System.out.println("11. Japanese Yen to Indian Rupees \t\t\t12. Indian Rupees to Japanese Yen");
            while (true) {


                int choice = in.nextInt();
                mainCode: switch (choice) {
                    case 1:
                        System.out.print("Enter value in American Dollar : ");
                        double tempUSD = in.nextDouble();
                        inrValue = ui.usdToInr(tempUSD);
                        System.out.println(tempUSD + " USD in INR = " + RED + inrValue + RESET);
                        break mainCode;
                    case 2:
                        System.out.print("Enter value in Indian Rupees : ");
                        double tempINR = in.nextDouble();
                        usdValue = ui.inrToUsd(tempINR);
                        System.out.println(tempINR + " INR in USD = " + RED + usdValue + RESET);
                        break mainCode;
                    case 3:
                        System.out.print("Enter value in American Dollar : ");
                        tempUSD = in.nextDouble();
                        jpyValue = uj.usdToJpy(tempUSD);
                        System.out.println(tempUSD + " USD in JPY = " + RED + jpyValue + RESET);
                        break mainCode;
                    case 4:
                        System.out.print("Enter value in Japanese Yen : ");
                        double tempJPY = in.nextDouble();
                        usdValue = uj.jpyToUsd(tempJPY);
                        System.out.println(tempJPY + " JPY in USD = " + RED + usdValue + RESET);
                        break mainCode;
                    case 5:
                        System.out.print("Enter value in American Dollar : ");
                        tempUSD = in.nextDouble();
                        eurValue = ue.usdToEur(tempUSD);
                        System.out.println(tempUSD + " USD in EUR = " + RED + eurValue + RESET);
                        break mainCode;
                    case 6:
                        System.out.print("Enter value in European Euro : ");
                        double tempEUR = in.nextDouble();
                        usdValue = ue.eurToUsd(tempEUR);
                        System.out.println(tempEUR + " EUR in USD = " + RED + usdValue + RESET);
                        break mainCode;
                    case 7:
                        System.out.print("Enter value in Indian Rupees : ");
                        tempINR = in.nextDouble();
                        eurValue = ie.inrToEur(tempINR);
                        System.out.println(tempINR + " INR in EUR = " + RED + eurValue + RESET);
                        break mainCode;
                    case 8:
                        System.out.print("Enter value in European Euro : ");
                        tempEUR = in.nextDouble();
                        inrValue = ie.eurToInr(tempEUR);
                        System.out.println(tempEUR + " EUR in INR = " + RED + inrValue + RESET);
                        break mainCode;
                    case 9:
                        System.out.print("Enter value in Japanese Yen : ");
                        tempJPY = in.nextDouble();
                        eurValue = je.jpyToEur(tempJPY);
                        System.out.println(tempJPY + " JPY in EUR = " + RED + eurValue + RESET);
                        break mainCode;
                    case 10:
                        System.out.print("Enter value in European Euro : ");
                        tempEUR = in.nextDouble();
                        jpyValue = je.eurToJpy(tempEUR);
                        System.out.println(tempEUR + " EUR in JPY = " + RED + jpyValue + RESET);
                        break mainCode;
                    case 11:
                        System.out.print("Enter value in Japanese Yen : ");
                        tempJPY = in.nextDouble();
                        inrValue = ji.jpyToInr(tempJPY);
                        System.out.println(tempJPY + " JPY in INR = " + RED + inrValue + RESET);
                        break mainCode;
                    case 12:
                        System.out.print("Enter value in Indian Rupees : ");
                        tempINR = in.nextDouble();
                        jpyValue = ji.inrToJpy(tempINR);
                        System.out.println(tempINR + " INT in JPY = " + RED + jpyValue + RESET);
                        break mainCode;
                    default:
                        System.out.println("Enter correct Input!!!");
                }
                System.out.println("\n");
                System.out.print("Choose the conversion : ");
            }
        }
        catch (ArithmeticException a) {
            System.out.println("Arithmetic Exception occurs : " + a);
        }
        catch (IOError ioe) {
            System.out.println("Input Output exception occurs : " + ioe);
        }
        catch (NumberFormatException n) {
            System.out.println("Number format is wrong : "+ n);
        }
        finally {
            System.out.println(".............End of the program........");
        }
    }
}
