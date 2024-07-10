import java.util.Scanner;
class str{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int c=0;
        for(int i=0;i<st.length();i++){
            if((st.charAt(i)>=65 && st.charAt(i)<=90) || (st.charAt(i)>=97 && st.charAt(i)<=122) || (st.charAt(i)>=48 && st.charAt(i)<=57))
            c=0;
            else
            c++;
        }
        if(c!=0)
                System.out.println("Contains other than character");
        else
                System.out.println("Contains character");
    }
}