import java.util.*;
import java.util.stream.Collectors;
class StreamsDemo{
    public static void main(String n[]){
        List<String> list=Arrays.asList("Roger","Rakesh","Sanjay","Nareshkumar","Josesph","Prakash","Vivek","Varunkumar");
        
        List<String> result=list.stream().filter((x)->x.length()>5?true:false).collect(Collectors.toList());
         
        result.forEach((x)->System.out.println(x));

         System.out.println("-----------------------------------");
        List<String> greet=list.stream().map(x->"Hello! "+x).collect(Collectors.toList());

        greet.forEach((x)->System.out.println(x));

        System.out.println("---------------------------------------");
       
        Optional<String> out=list.stream().reduce((x,y)->x.length()>y.length()?x:y);
        
        out.ifPresent(x->System.out.println(x));

        
    } 
}