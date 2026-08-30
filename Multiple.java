interface Father {
    default void fatherdisp() {
        System.out.println("I am from father class");
    }
}

interface Mother {
    default void motherdisp() {
        System.out.println("I am from mother class");
    }
}

class Son implements Father, Mother {
    void sondisp() {
        System.out.println("I am from son class");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Son s1 = new Son();

        s1.sondisp();
        s1.fatherdisp();
        s1.motherdisp();
    }
}