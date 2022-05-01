import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void concatTest() {
        assertEquals("skilldemo", SkillDemo.stringConcat("skill", "demo"));
    }
}
