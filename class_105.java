class class_105 {
void add(int a, int b){
    System.out.println(a+b);
}
int add(int a, int b, int c) {
    return a + b + c;
}

double add(double a,double b){
    return (a+b);
}
public static void main(String[] args) {
    class_105 s = new class_105();
    s.add(1,2);
     System.out.println(s.add(1,2,3));
    System.out.println(s.add(1.6,2.3));
    
}
    
}
