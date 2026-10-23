class employee {
    
    String name;
    int id;
    int salary;
    void display() {
        System.out.println(name + " " + id + " " + salary);
    }
    static void main(String[] args) {
        employee e1 = new employee();
        e1.name = "Rohit";
        e1.id = 101;
        e1.salary = 20000;
        e1.display();
        employee e2 = new employee();
        e2.name = "Ramesh";
        e2.id = 102;
        e2.salary = 30000;
        e2.display();
    }
}