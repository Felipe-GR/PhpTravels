package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.After;

import java.io.IOException;

public class Hooks {
    TestContext objTestContext;

    public Hooks(TestContext context){
        objTestContext = context;
    }

    @After
    public void tearDown() throws IOException {
        objTestContext.getDriverManager().teardown();
}
}