import com.lcleite.github.structural.flyweight.Flyweight;
import com.lcleite.github.structural.flyweight.FlyweightFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leandro on 19/08/17.
 */
public class FlyweightTest {

  private FlyweightFactory flyweightFactory;

  @Before
  public void setup(){
    flyweightFactory = new FlyweightFactory();
    flyweightFactory.getFlyweight(1);
  }

  @Test
  public void itShouldTest_ExistingFlyweight(){
    Flyweight flyweight = flyweightFactory.getFlyweight(1);

    Assert.assertEquals(1, flyweight.getId());
  }

  @Test
  public void itShouldTest_NewFlyweight(){
    Flyweight flyweight = flyweightFactory.getFlyweight(2);

    Assert.assertEquals(2, flyweight.getId());
  }
}
