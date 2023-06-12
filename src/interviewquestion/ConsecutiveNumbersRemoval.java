package interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveNumbersRemoval {
    public static int countElementsToRemove(List<Integer> numbers) {
        int count = 0;
        int size = numbers.size();

        if (size < 3) {
            // If the list has less than 3 elements, no removal is needed
            return 0;
        }

        for (int i = 0; i < size - 2; i++) {
            int num1 = numbers.get(i);
            int num2 = numbers.get(i + 1);
            int num3 = numbers.get(i + 2);

            if ((num1 < num2 && num2 < num3) || (num1 > num2 && num2 > num3)) {
                // Consecutive three numbers are in increasing or decreasing order
                // Remove the middle number (num2) to break the pattern
                numbers.remove(i + 1);
                count++;
                size--;
                i--; // Decrement i to recheck the previous numbers
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);

        ArrayList<Integer> newNumber =  new ArrayList<>(numbers);


        int removalCount = countElementsToRemove(newNumber);
        System.out.println("Number of elements to be removed: " + removalCount);
    }
}
