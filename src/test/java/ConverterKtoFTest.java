import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ConverterKtoFTest extends ConverterTest{
    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        return Arrays.asList(
                new Object[][]{
                        {-457.87,1},
                        {-450.67,5}
                }
        );
    }

    @Test
    @Override
    public void test(){
        assertEquals(expected,conver.convertKtoF(value),0.1);
    }}
