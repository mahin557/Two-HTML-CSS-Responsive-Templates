public class question {
    public static void main(String[] args) {
Fraction fraction1 = new Fraction(1,4);
Fraction fraction2 = new Fraction(3,5);
fraction1.add(fraction2);
System.out.println("Addition Answer : "+fraction1);

fraction1.sub(fraction2);
System.out.println("Subtraction Answer : "+fraction1);

fraction1.multiplication(fraction2);
System.out.println("Multiplication Answer : "+fraction1);

fraction1.division(fraction2);
System.out.println("Division Answer : "+fraction1);
    }
}
