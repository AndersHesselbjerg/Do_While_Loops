import java.util.ArrayList;

import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[]args) {
           ArrayList<String> arr = new ArrayList<String>();
           arr.add("boo");
           arr.add("baz");
           arr.add("foo");

           System.out.println(arrayListReturn(null, null));
    }

    public static boolean arrayListReturn(ArrayList list, String str){
        if(null == str) {
            return false;
        }

        if(list.contains(str)){
            return false;
        }

        else {


        }

        return true;

    }
}
