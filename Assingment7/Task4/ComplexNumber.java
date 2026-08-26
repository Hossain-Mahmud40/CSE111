package Task4;

public class ComplexNumber extends RealNumber {
  public double imaginaryValue = 1.0;

  public ComplexNumber(){
    super(1.0);
  }
  public ComplexNumber(double real, double imaginary){
  super(real);
  this.imaginaryValue = imaginary;
  }
  public String details(){
    return getReal()+"\nImaginaryPart: "+imaginaryValue;
  }
}
