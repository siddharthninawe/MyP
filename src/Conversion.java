import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();

        arr.add("siddharth");
        arr.add("harshal");
        arr.add("mohnish");

        Object[] obj = arr.toArray();
        String[] str = Arrays.copyOf(obj, obj.length, String[].class);
        System.out.println("arrays......");
        try {
            Siddharth si = new Siddharth(str);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
