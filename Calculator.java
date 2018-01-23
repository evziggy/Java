
/**************************************************************************/
/* This program use classes, methods, and objects to create a simple arithmetic calculator*/
/* Coded by: Evense Zetrenne*/
/**************************************************************************/


class Calculator{

  
  public Calculator(){
    
    
  }
  public int add(int a, int b) {
   return (a+b);
  }
  
  public int subtract(int a, int b) {
  return (a-b);
  }
  
  public int multiply(int a, int b) {
   return (a*b);
  }
  
  public int divide(int a, int b) {
    
    if (b == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
        return b;
    }
    
    else {
   		return(a/b);
    }
  }
  
  public int modulo(int a, int b){
    
    if (b == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
        return b;
    }
    
    else {
   		return (a%b);
    }
  }
  
    

public static void main(String[] args) {

  Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(5, 7));
  System.out.println(myCalculator.subtract(45, 11));
  System.out.println(myCalculator.divide(50, 10));
  System.out.println(myCalculator.modulo(44, 11));
}
}