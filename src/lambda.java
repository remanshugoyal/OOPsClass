import java.util.ArrayList;

public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(2);
        // 1st ---arr.forEach((x)-> {System.out.println(x);});// lambda function
        //arr.forEach(x-> System.out.println(x*x));
   // 2nd----arr.forEach(System.out::println);

        // arr.stream().forEach(System.out::println);
    }
}
