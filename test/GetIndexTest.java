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
    GetIndex index = new GetIndex();
    assertEquals(index.getIndex(0, testList), -1);
  }
}