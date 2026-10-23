public class class_052 {
    String name;
    int marks;
    static String school = "ABC School";
    public static void main(String[] args){
        int age = 20;
        class_052 s1 = new class_052();
        class_052 s2 = new class_052();
        s1.name = "John";  
        s1.marks = 90; 
        s2.name = "Alice";
        s2.marks = 85;
        System.out.println(age);
        System.out.println(s1.name + ": " + s1.marks);
        System.out.println(s2.name + ": " + s2.marks);
        System.out.println("School: " + class_052.school);

    } 
}
