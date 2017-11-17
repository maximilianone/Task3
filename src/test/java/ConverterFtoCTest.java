import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ConverterFtoCTest extends ConverterTest{
    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        return Arrays.asList(
                new Object[][]{
                        {-17.222,1},
                        {-15,5}
                }
        );
    }

    @Test
    @Override
    public void test(){
        assertEquals(expected,conver.convertFtoC(value),0.1);
    }
}
