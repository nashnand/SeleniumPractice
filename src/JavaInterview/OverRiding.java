package JavaInterview;

public class OverRiding {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Childclass_Override extends OverRiding {

    static int add(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Childclass_Override Mul=new Childclass_Override();
        int Mulitiply = Mul.add(1, 2); //This will call the child class version of eat()
        System.out.println(Mulitiply);
    }
}

