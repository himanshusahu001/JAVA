
class calculator {
    int a ;
    int b ;
    void add(){
        int sum = a+b;
        System.out.println("sum="+sum);
        
    }
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.a=10;
        c1.b=20;
        c1.add();
    }
}