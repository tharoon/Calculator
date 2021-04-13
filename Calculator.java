class Calculator{
  public void add(int a, int b){
    int c = a + b;
    System.out.println(c);
  }
  public void subtract(int a, int b){
    int c = a - b;
    System.out.println(c);
  }
  public void multiply(int a, int b){
    int c = a * b;
    System.out.println(c);
  }
  public void divide(int a, int b){
    int c = a / b;
    System.out.println(c);
  }
  
  public String message(){
    return "Vanakam Ulagam!";
  }
  
  public static void main(String args[]){
    Calculator obj = new Calculator();
    obj.add(2,3);
    obj.subtract(10,5);
    obj.multiply(2,8);
    obj.divide(100,5);
    System.out.println(obj.message);
  }
}
