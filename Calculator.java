class Calculator{
  public void add(int a, int b){
    int c = a + b;
    System.out.println(c);
  }
  public void subtract(int a, int b){
    int c = a - b;
    System.out.println(c);
  }
  public static void main(String args[]){
    Calculator obj = new Calculator();
    obj.add(2,3);
    obj.subtract(10,5);
  }
}
