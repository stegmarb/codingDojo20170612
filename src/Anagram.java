import java.util.Arrays;

public class Anagram {

  public boolean isAnagram(String one, String two) {

    char[] oneCharArray = one.toCharArray();
    Arrays.sort(oneCharArray);

    char[] twoCharArray = two.toCharArray();
    Arrays.sort(twoCharArray);

    return Arrays.toString(oneCharArray).equals(Arrays.toString(twoCharArray));
  }
}