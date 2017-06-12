import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GetIndexTest {

  private List<Integer> testList = new ArrayList<>();

  GetIndex index = new GetIndex();

  Anagram anagram = new Anagram();

  PrintFizzBuzz fB = new PrintFizzBuzz();

  @Before
  public void createList() {
    testList.add(1);
  }

  @Test
  public void testGetIndex() {

    assertEquals(index.getIndex(0, testList), -1);
  }

  @Test
  public void testValidNumberInList() {
    assertEquals(index.getIndex(1, testList), 0);
  }

  @Test
  public void testIsAnagram(){

    String firstString = "abcd";
    String secondString = "dcba";

    assertTrue(anagram.isAnagram(firstString, secondString));
  }

  @Test
  public void testIsAnagramWhenLettersRepeating() {
    assertFalse(anagram.isAnagram("aab", "abb"));
  }

  @Test
  public void testFizzBuzz() {
    assertEquals(fB.fizzBuzz().get(2), "Fizz");
  }
}