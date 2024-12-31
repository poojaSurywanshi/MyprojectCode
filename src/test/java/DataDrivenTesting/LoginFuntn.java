package DataDrivenTesting;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class  LoginFuntn {

    private String username;
    private String password;
    private String resultMessage;

    @Given("the user navigates to the login page")
    public void givenUserIsOnLoginPage() {
        // Code to navigate to the login page (e.g., open a web browser to the login URL)
        System.out.println("Navigating to login page...");
    }

    @When("the user enters {string} and {string}")
    public void whenUserEntersCredentials(String username, String password) {
        // Code to input the username and password
        this.username = username;
        this.password = password;

        // Simulate login process based on the username and password
        if ("validUser".equals(username) && "validPassword".equals(password)) {
            resultMessage = "Login successful";
        } else {
            resultMessage = "Login failed";
        }
    }

    @Then("the user should see the {string} message")
    public void thenUserShouldSeeResult(String expectedResult) {
        // Assert that the actual result matches the expected result
        assertEquals(expectedResult, resultMessage);
    }
}
