import java.util.Arrays;
import java.util.List;

public class demoList {
    public static void main(String[] args) {
        Integer arr[]={22,33,44,55};
        List<Integer> ls = Arrays.asList(arr);

//        Integer arr1[]=new Integer[3];
//        //Integer arr1[]=new Integer[5];
//     ---   //Integer arr1[]=new Integer[ls.size()];
//        ls.toArray(arr1);// list convert to array
       //--- //arr=ls.toArray(arr1);
        Integer arr1[]=ls.toArray(new Integer[0]);
        for(Integer i : arr1){
            System.out.println(i);
        }
    }
}
