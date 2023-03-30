import java.util.ArrayList;

public class FibonaseCal {

    public ArrayList<Integer> fibonaciCalFunc(){
        ArrayList<Integer> fib0sList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int fib = fibonacci(i);
            fib0sList.add(fib);
        }

        //System.out.println(fibList);
        return fib0sList;
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);

    }
    public static void main(String[] args) {
        FibonaseCal cal = new FibonaseCal();
        cal.fibonaciCalFunc();
    }
}