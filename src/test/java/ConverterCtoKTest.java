import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ConverterCtoKTest extends ConverterTest{
    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        return Arrays.asList(
                new Object[][]{
                        {309.75,36.6},
                        {373.15,100}
                }
        );
    }

    @Test
    @Override
    public void test(){
        assertEquals(expected,conver.convertCtoK(value),0.1);
    }
}
