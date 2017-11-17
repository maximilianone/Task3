import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ConverterKtoCTest extends ConverterTest{
    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        return Arrays.asList(
                new Object[][]{
                        {-272.15,1},
                        {-268.15,5}
                }
        );
    }

    @Test
    @Override
    public void test(){
        assertEquals(expected,conver.convertKtoC(value),0.1);
    }
}
