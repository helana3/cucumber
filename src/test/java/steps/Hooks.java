package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {

    @Before
    public  void beforeAnyScenario(){
        System.out.println("before any scenario");
    }

    @After
    public  void afterAnyScenario(){
    }
}
