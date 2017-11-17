import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ConverterCtoFTest extends ConverterTest{
    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        return Arrays.asList(
                new Object[][]{
                        {212,100},
                        {41,5}
                }
        );
    }

    @Test
    @Override
    public void test(){
        assertEquals(expected,conver.convertCtoF(value),0.1);
    }
}
