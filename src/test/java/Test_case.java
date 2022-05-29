import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import utilities.TestBaseClass;

public class Test_case extends TestBaseClass {
   /* Notes: It may also be necessary to write code to accept the accept cookies warning.
      1. Go to 'https://www.amazon.com.tr/'
      2. Search iPhone13 512
      3. Check that the results are listed
      4. Click iPhone13 at the top of the list
      5. Log the following values for each size
      .Size information .Price .Color .Stock status
    */
    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();



    }
}
