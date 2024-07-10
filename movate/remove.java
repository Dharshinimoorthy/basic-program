import java.util.ArrayList;
import java.util.Arrays;
class remove{
    public static void main(String[]args){
        ArrayList <Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        arr.remove(2);
        for(Integer n: arr)
        System.out.println(n);
    }
}