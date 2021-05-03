import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkipElementFromArray
{
    public static void main(String[] args) 
    {
        //List 1
        List<String> namesList = Arrays.asList( "alex", "brian", "charles");
         
        //List 2
        ArrayList<String> otherList = new ArrayList<>();
         
        //skip element with value "alex"
        namesList.stream().filter(name -> !name.equals("alex")).forEachOrdered(otherList::add);
         
        System.out.println(otherList);
    }
}