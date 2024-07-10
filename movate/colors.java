import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class colors{
    public static void main(String[]args){
        ArrayList <String> arr=new ArrayList<String>();
        Collections.addAll(arr,"orange","red","black","blue","red","white");
        for(String s:arr)
        System.out.println(s);
    }
}