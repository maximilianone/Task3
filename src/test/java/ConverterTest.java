import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(value = Parameterized.class)
public abstract class ConverterTest {
    TemperatureConverter conver;
    @Parameterized.Parameter
    public double expected;
    @Parameterized.Parameter(1)
    public double value;


    @Before
    public void init() {
        conver = new TemperatureConverter();
    }

    public abstract void test();

}
