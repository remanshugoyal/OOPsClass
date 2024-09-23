import java.util.ArrayList;

public class evenlist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<100;i++){
            arr.add(i);
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        arr.forEach(x -> {
            if (x % 2 == 0) {
                arr1.add(x);}});
        arr1.stream().forEach(System.out::println);

    }
}
