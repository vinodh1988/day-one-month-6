import java.util.*;
public class MapDemo {
    public static void main(String n[]){
        Map<String,String> hmap=new HashMap<String,String>();
        hmap.put("Raj","Stokes");
        hmap.put("Ravi","James");

        hmap.entrySet().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
    }
}
