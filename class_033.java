class stu {
    int marks ;
    void dis(){
        System.out.println("marks"+ marks);
    }
    public static void main(String[] args) {
        stu s1 = new stu();
        s1.marks=99;
        s1.dis();

        stu s2 = new stu();
        s2.marks=89;
        s2.dis();
    }
}