import java.util.*;

 class ConvertArrayListToArray {
    public static void main(String args[]) {

                /*ArrayList declaration and initialization*/
  ArrayList<String> arrlist= new ArrayList<String>();
  arrlist.add("Apple");
  arrlist.add("Banana");
  arrlist.add("Mango");
  arrlist.add("Pear");
  
  System.out.println(arrlist);

  /*ArrayList to Array Conversion */
  String array[] = new String[arrlist.size()];              
  for(int j =0;j<arrlist.size();j++){
    array[j] = arrlist.get(j);
  }

  /*Displaying Array elements*/
  for(String k: array)
  {
   System.out.println(k);
  }
  }
}  