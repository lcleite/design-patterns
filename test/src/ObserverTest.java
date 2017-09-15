import com.lcleite.github.behavioral.observer.BinaryObserver;
import com.lcleite.github.behavioral.observer.HexObserver;
import com.lcleite.github.behavioral.observer.ObservableNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by leandro on 14/09/17.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObserverTest {

  ObservableNumber number;
  HexObserver hexObserver;
  BinaryObserver binaryObserver;

  @Before
  public void setup(){
    number = new ObservableNumber();
    number.setValue(10);

    hexObserver = new HexObserver(number);
    binaryObserver = new BinaryObserver(number);
  }

  @Test
  public void itShouldTest_1_ObservableNumberInitialValueEquals10(){
    Assert.assertEquals(10, number.getValue());
  }

  @Test
  public void itShouldTest_2_HexNumberInitialValueEqualsA(){
    Assert.assertEquals("a", hexObserver.getValue());
  }

  @Test
  public void itShouldTest_3_BinNumberInitialValueEquals1010(){
    Assert.assertEquals("1010", binaryObserver.getValue());
  }

  @Test
  public void itShouldTest_4_ObservableNumberNewValueEquals15(){
    number.setValue(15);

    Assert.assertEquals(15, number.getValue());
  }

  @Test
  public void itShouldTest_5_HexNumberNewValueEqualsF(){
    number.setValue(15);

    Assert.assertEquals("f", hexObserver.getValue());
  }

  @Test
  public void itShouldTest_6_BinNumberNewValueEquals1110(){
    number.setValue(15);

    Assert.assertEquals("1111", binaryObserver.getValue());
  }
}
