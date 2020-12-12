//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer>mobj = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            mobj.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(mobj.get(s) == null)
                System.out.println("Not found");
            else {
                System.out.println(s + "=" + mobj.get(s));
            }
        }
        in.close();
    }
}
