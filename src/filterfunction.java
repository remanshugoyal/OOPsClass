import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filterfunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<100;i++){
            arr.add(i);
        }
        //ArrayList<Integer> arr1=new ArrayList<>();
       // List<Integer> arr1=arr.stream().filter(x -> x%2==0).collect(Collectors.toList());
      //  List<Integer> arr1=arr.stream().filter(x -> x%2==0).map(x -> x*x).collect(Collectors.toList());
        //
        //
        List<Integer> arr1=arr.stream().filter(Object=nonNull).filter(x -> x%2==0).map(x -> x*x).collect(Collectors.toList());

        arr1.stream().forEach(System.out::println);

    }
}
