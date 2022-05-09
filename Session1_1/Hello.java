public class Hello {

    int d;
    public static void foo(int y){
        
        y = 9;
        System.out.println("X from foo: " + y);
    }

    public static void main(String[] args){
        // System.out.println("Hello");

        int x = 657;
        x = 7;

        foo(x);

        System.out.println("X from main: " + x);
        //byte y = x;

    }
}