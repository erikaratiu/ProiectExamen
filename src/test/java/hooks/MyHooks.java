package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TestBase;

public class MyHooks {
    private TestBase testBase;

    public MyHooks(TestBase testBase){

        this.testBase = testBase;
    }


    @Before
    public void initializeTest(){
        System.out.println("Hook Before a inceput");
        testBase.initializeDriver();
    }

    @After
    public void finalizeTest(){
        System.out.println("Hook After a inceput");
        testBase.closeDriver();
    }
}
