public class Anagram {

  public boolean isAnagram(String one, String two) {
    int count = 0;
    if (one.length() == two.length()) {

      for (int i = 0; i < one.length(); ++i) {
        if (two.contains(one.substring(i, i + 1))) {
          count++;
        }
      }
    }
    if (count == one.length()) {
      return true;
    } else {
      return false;
    }
  }
}