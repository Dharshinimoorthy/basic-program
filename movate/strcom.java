import java.util.Scanner;
class strcom{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int s1=str1.length();
        int s2=str2.length();
        if(s1!=s2){
            System.out.println("Not equal");
        }
        else{
            int res=str1.compareToIgnoreCase(str2);
            System.out.println(res);

          if(res==0)
            System.out.println(" equal");
          else
            System.out.println("Not equal");
        } 
    }
}