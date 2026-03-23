package W8;

import java.util.Scanner;

public class W8_6 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter number of widgets" + "produced: ");
            Scanner sc = new Scanner(System.in);

            int widgets = sc.nextInt();
            if(widgets < 0) throw new NegativeNumberExcption("widgets");
            System.out.println("How many were defective?");
            int defective = sc.nextInt();
            if(defective < 0) throw new NegativeNumberExcption("defective " + "widgets");

            double ratio = exceptionDivision(widgets, defective);
            System.out.println("One in every " + ratio + " widgets is defective.");
        } catch (DivideByZeroException e){
            System.out.println("Congratulations! A perfect " + "record!");
        } catch (NegativeNumberExcption e){
            System.out.println("Cannot have a negative number of " + e.getMessage());
        }
        System.out.println("End of program. ");
    }

    public static double exceptionDivision(double numerator, double denominator) throws DivideByZeroException{
        if(denominator == 0)
            throw new DivideByZeroException();
        return numerator / denominator;
    }
}



class NegativeNumberExcption extends Exception{
    NegativeNumberExcption(){};
    NegativeNumberExcption(String str){
        super(str);
    }
}

class DivideByZeroException extends Exception{
    DivideByZeroException(){};
    DivideByZeroException(String str){
        super(str);
    }
}