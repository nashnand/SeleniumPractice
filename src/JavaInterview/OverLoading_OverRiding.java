package JavaInterview;

public class OverLoading_OverRiding {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int Addition = add(1, 2);
        int Addition2 = add(1, 3, 3);
        System.out.println(Addition);
        System.out.println(Addition2);
    }
}

