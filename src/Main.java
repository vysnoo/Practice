public class Main {
    public static void main(String[] args) {
        // static method  override?
        Parent p = new Child();
        p.show(); // Parent
    }
}

class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}



