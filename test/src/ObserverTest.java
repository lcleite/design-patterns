import com.lcleite.github.behavioral.observer.BinaryObserver;
import com.lcleite.github.behavioral.observer.HexObserver;
import com.lcleite.github.behavioral.observer.ObservableNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leandro on 14/09/17.
 */
public class ObserverTest {

  ObservableNumber number;
  HexObserver hexObserver;
  BinaryObserver binaryObserver;

  @Before
  public void setup(){
    number = new ObservableNumber();

    hexObserver = new HexObserver(number);
    binaryObserver = new BinaryObserver(number);
  }

  @Test
  public void itShouldTest_ObservableNumberInitialValueEquals10(){
    number.setValue(10);

    Assert.assertEquals(10, number.getValue());
  }

  @Test
  public void itShouldTest_HexNumberInitialValueEqualsA(){
    number.setValue(10);

    Assert.assertEquals("a", hexObserver.getValue());
  }

  @Test
  public void itShouldTest_BinNumberInitialValueEquals1010(){
    number.setValue(10);

    Assert.assertEquals("1010", binaryObserver.getValue());
  }

  @Test
  public void itShouldTest_ObservableNumberNewValueEquals15(){
    number.setValue(15);

    Assert.assertEquals(15, number.getValue());
  }

  @Test
  public void itShouldTest_HexNumberNewValueEqualsF(){
    number.setValue(15);

    Assert.assertEquals("f", hexObserver.getValue());
  }

  @Test
  public void itShouldTest_BinNumberNewValueEquals1110(){
    number.setValue(15);

    Assert.assertEquals("1111", binaryObserver.getValue());
  }
}
