package exercises2;

import java.util.ArrayList;

public class Sum {
    public static int getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                sum += numbers.get(i);
//            }
//        } return sum;
//    }
//}


