
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        int N = 3;
        int s = 0;
        int m = N - 1;
        for (int i = 0; i < arr.size(); i++) {
            s += arr.get(i) * Math.pow(10, m);
            m--;
        }
        s = s + 1;
        String numberStr = Integer.toString(s);
        ArrayList<Integer> list = new ArrayList<>();
        // Loop through each character in the string
        for (char digit : numberStr.toCharArray()) {
            // Convert the character back to an integer and add to the list
            list.add(Character.getNumericValue(digit));

        }
        System.out.println(list);
    }}