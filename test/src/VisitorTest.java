import com.lcleite.github.behavioral.visitor.Document;
import com.lcleite.github.behavioral.visitor.visitables.BoldText;
import com.lcleite.github.behavioral.visitor.visitables.Hyperlink;
import com.lcleite.github.behavioral.visitor.visitables.Paragraph;
import com.lcleite.github.behavioral.visitor.visitors.HtmlVisitor;
import com.lcleite.github.behavioral.visitor.visitors.MarkdownVisitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leandro on 18/09/17.
 */
public class VisitorTest {

  Document document;
  MarkdownVisitor markdownVisitor;
  HtmlVisitor htmlVisitor;

  @Before
  public void setup(){
    document = new Document();
    markdownVisitor = new MarkdownVisitor();
    htmlVisitor = new HtmlVisitor();
  }

  @Test
  public void itShouldTest_HtmlBoldText(){
    document.addVisitableElement(new BoldText("Important text!"));
    document.accept(htmlVisitor);

    Assert.assertEquals(htmlVisitor.toString(), "<b>Important text!</b>");
  }

  @Test
  public void itShouldTest_HtmlParagraph(){
    document.addVisitableElement(new Paragraph("Regular paragraph"));
    document.accept(htmlVisitor);

    Assert.assertEquals(htmlVisitor.toString(), "<p>Regular paragraph</p>");
  }

  @Test
  public void itShouldTest_HtmlHyperlink(){
    document.addVisitableElement(new Hyperlink("Click me", "http://url.com"));
    document.accept(htmlVisitor);

    Assert.assertEquals(htmlVisitor.toString(), "<a href='http://url.com'>Click me</a>");
  }

  @Test
  public void itShouldTest_MarkdownBoldText(){
    document.addVisitableElement(new BoldText("Important text!"));
    document.accept(markdownVisitor);

    Assert.assertEquals(markdownVisitor.toString(), "**Important text!**");
  }

  @Test
  public void itShouldTest_MarkdownParagraph(){
    document.addVisitableElement(new Paragraph("Regular paragraph"));
    document.accept(markdownVisitor);

    Assert.assertEquals(markdownVisitor.toString(), "Regular paragraph");
  }

  @Test
  public void itShouldTest_MarkdownHyperlink(){
    document.addVisitableElement(new Hyperlink("Click me", "http://url.com"));
    document.accept(markdownVisitor);

    Assert.assertEquals(markdownVisitor.toString(), "[Click me](http://url.com)");
  }
}
