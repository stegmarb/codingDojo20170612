import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GetIndexTest {
  private List<Integer> testList = new ArrayList<>();

  @Before
  public void createList() {
    testList.add(1);
  }

  @Test
  public void testGetIndex() {
    assertEquals(java.util.Optional.ofNullable(testList.get(0)), 1);
  }
}