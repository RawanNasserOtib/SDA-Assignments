package sa.rawan_alotaibi.sda.assigments.week7;

import org.testng.annotations.Test;
import sa.rawan_alotaibi.sda.assigments.Tests;
import sa.rawan_alotaibi.sda.assigments.pages.lambdatest.LambdaTestRegisterPage;

public class Week7Task1Test extends Tests {
    /*
	  The Task details: 
      go to url : https://ecommerce-playground.lambdatest.io/index.php?route=account/register
      register account test with fluent page object approach
    */

    @Test
    public void registerLambdatestTest(){
        new LambdaTestRegisterPage(bot)
                .goTo()
                .register("Rawan","AL-Otaibi","rawan_alotaibi@rawan.net","0123456789","123456r")
                .assertRegister();
    }
}
