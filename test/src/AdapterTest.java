import com.lcleite.github.structural.adapter.Adaptee;
import com.lcleite.github.structural.adapter.Adapter;
import com.lcleite.github.structural.adapter.Target;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leandro on 19/08/17.
 */
public class AdapterTest {

  private Target target;
  private Adaptee adaptee;

  @Before
  public void setup(){
    target = new Target();
    adaptee = new Adaptee();
  }

  @Test
  public void itShouldTest_AdapterPattern(){
    Adapter adapter = new Adapter(adaptee);

    String targetMethod = target.targetMethod("Hello", " World!");
    String adapterMethod = adapter.targetMethod("Hello", " World!");

    Assert.assertEquals(targetMethod, adapterMethod);
  }
}
