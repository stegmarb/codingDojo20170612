import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintFizzBuzz {
  List<String> list = new ArrayList<>();

  public List<String> fizzBuzz(){
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        list.add("FizzBuzz");
      } else {
        if (i % 3 == 0) {
          list.add("Fizz");
        } else if (i % 5 == 0) {
          list.add("Buzz");
        } else {
          list.add(Integer.toString(i));
        }
      }
    }
    System.out.println(list);
    return list;
  }
}
