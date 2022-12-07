package exceptions;

public class text {
    public static void main(String[] args) {
        Person p1 = new Person("Kevin", 39);
        p1.talk();
        Person p2 = new Person("Chihua", 42);
        Person p3 = new Person("Alice", 30);
        p2.setSpouse(p3);
        p3.setSpouse(p2);
        p2.talk();
        p3.talk();
    }
}
