import org.junit.Assert;
import org.junit.Test;

public class ClassATest {

    private ClassA classA = new ClassA();

    @Test
    public void calc() {
        Assert.assertEquals("Sum is checking", classA.calc(5, 10), 15);
    }
}
