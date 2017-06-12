import java.util.List;

public class GetIndex {

  public int getIndex(int number, List<Integer> intList) {
    int index = -1;
    for (int i = 0; i < intList.size(); ++i) {
      if (intList.get(i) == number) {
        index = i;
      }
    }
    return index;
  }
}
