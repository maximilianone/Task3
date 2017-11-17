import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ConverterFtoKTest extends ConverterTest{

        @Parameterized.Parameters
        public static Collection<Object[]> testData(){
            return Arrays.asList(
                    new Object[][]{
                            {255.65,0.5},
                            {258.15,5}
                    }
            );
        }

        @Test
        @Override
        public void test(){
            assertEquals(expected,conver.convertFtoK(value),0.1);
        }
}
