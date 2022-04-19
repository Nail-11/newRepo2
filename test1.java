package generic;
import java.util.ArrayList;
import java.util.List;



public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ok");
        list.add("privet");

        for(Object o : list){
            System.out.println(o + " dlina" +((String)o).length());
        }
    }
}
