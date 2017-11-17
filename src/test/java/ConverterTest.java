import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(value = Parameterized.class)
public class ConverterTest {
    TemperatureConverter conver;
    @Parameterized.Parameter
    public double fahrenheit;
    @Parameterized.Parameter(1)
    public double celsius;
    @Parameterized.Parameter(2)
    public double kelvin;


    @Before
    public void init() {
        conver = new TemperatureConverter();
    }


    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        return Arrays.asList(
                new Object[][]{
                        {212,100,373.15},
                        {41,5,278.15},
                        {33.8,1,274.15}
                }
        );
    }

    @Test
    public void testCtoF(){
        assertEquals(fahrenheit,conver.convertCtoF(celsius),0.1);
    }

    @Test
    public void testCtoK(){
        assertEquals(kelvin,conver.convertCtoK(celsius),0.1);
    }

    @Test
    public void testKtoF(){
        assertEquals(fahrenheit,conver.convertKtoF(kelvin),0.1);
    }

    @Test
    public void testKtoC(){
        assertEquals(celsius,conver.convertKtoC(kelvin),0.1);
    }

    @Test
    public void testFtoC(){
        assertEquals(celsius,conver.convertFtoC(fahrenheit),0.1);
    }

    @Test
    public void testFtoK(){
        assertEquals(kelvin,conver.convertFtoK(fahrenheit),0.1);
    }

}
