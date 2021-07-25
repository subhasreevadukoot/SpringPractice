import org.example.Mobile;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MobileTest {

    @Test
    public void TestMobile(){
        Mobile mobile = new Mobile();
       assertEquals("Airtel new model", mobile.display("Airtel"));
    }

}
