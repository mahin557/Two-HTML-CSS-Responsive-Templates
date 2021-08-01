class Fraction{  
   private int numerator;
   private int denominator;

   public Fraction(int numerator, int denominator){

    this.numerator = numerator;
    this.denominator = denominator;
   }
    
    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    
@Override
public String toString() {
return ""+numerator+"/"+denominator;
}
public void add(Fraction c) {

    int numerator =
    this.getNumerator()*c.getDenominator()+this.getDenominator()*c.getNumerator();
    int denominator = this.getDenominator()*c.getDenominator();
    this.setNumerator(numerator);
    this.setDenominator(denominator);
}
public void sub(Fraction c) {
   
    int numerator = this.getNumerator()*c.getDenominator()-
    this.getDenominator()*c.getNumerator();
    int denominator = this.getDenominator()*c.getDenominator();
    this.setNumerator(numerator);
    this.setDenominator(denominator);
    }
    
    public void multiplication(Fraction c) {
    
    int numerator = this.getNumerator()*c.getNumerator();
    int denominator = this.getDenominator()*c.getDenominator();
    this.setNumerator(numerator);
    this.setDenominator(denominator);
    }
    
    public void division(Fraction c) {
    
    int numerator = this.getNumerator()*c.getDenominator();
    int denominator = this.getDenominator()*c.getNumerator();
    this.setNumerator(numerator);
    this.setDenominator(denominator);
    }
}
    

   
  