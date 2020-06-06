import java.util.ArrayList;
import java.util.List;

public class Main { // Prime Number
    public static void main(String[] args) {
        List<Integer> primeNumber = new ArrayList<Integer>();
        for(int i = 1; i<=10000; i++) {
            for(int j = 2; j<=10000; j++) {
                System.out.println(i + " % " + j + " : " + i%j);
                if(i%j != 0) {
                    break;
                }
            }

        }

    }
}
