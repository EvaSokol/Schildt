import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Eva Sokolyanskaya on 19/03/2018.
 */
public class InversionTest {

    @Test
    public void test1(){
        String base =  "Asdf";
        String expected = "fdsA";
        String separator = " ";

        String result = Inversion2.revertor(base, separator);
        System.out.println("expected: " + expected);
        System.out.println("result: " + result);

        Assert.assertTrue(result.equals(expected));
    }

    @Test
    public void test2(){
        String base =  "Asdf zxcV";
        String expected = "fdsA Vcxz";
        String separator = " ";

        String result = Inversion2.revertor(base, separator);
        System.out.println("expected: " + expected);
        System.out.println("result: " + result);

        Assert.assertTrue(result.equals(expected));
    }

    @Test
    public void test3(){
        String base =  "Asdf zxcV";
        String expected = "fdsA Vcxz";
        String separator = " ";

        String result = Inversion2.revertor(base, separator);
        System.out.println("expected: " + expected);
        System.out.println("result: " + result);

        Assert.assertTrue(result.length() == base.length());
    }
}
