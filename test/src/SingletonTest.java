import com.lcleite.github.creational.singleton.Singleton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leandro on 14/09/17.
 */
public class SingletonTest {

  Singleton singleton = null;

  @Before
  public void setup(){
    singleton = Singleton.getInstance();
  }

  @Test
  public void itShouldTest_SingletonObjectNotNull(){
    Assert.assertTrue(singleton != null);
  }

  @Test
  public void itShouldTest_SingletonObjectValue(){
    singleton.setValue(10);

    Assert.assertEquals(10, singleton.getValue());
  }

  @Test
  public void itShouldTest_PersistentSingletonObjectValue(){
    singleton.setValue(17);
    singleton = Singleton.getInstance();

    Assert.assertEquals(17, singleton.getValue());
  }
}
