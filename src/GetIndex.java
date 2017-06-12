import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIndex {

  List<Integer> intList = new ArrayList<>(Arrays.asList(1));

  public static void main(String[] args) {
    System.out.println(7);
  }

  public int getIndex(int number) {
    int index = -1;
    for (int i = 0; i < intList.size(); ++i) {
      if (intList.get(i) == number) {
        index = i;
      }
    }
    return index;
  }
}
