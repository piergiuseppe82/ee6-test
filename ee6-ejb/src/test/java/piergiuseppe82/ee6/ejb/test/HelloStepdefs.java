/**
 * 
 */
package piergiuseppe82.ee6.ejb.test;

import javax.ejb.EJB;

import org.junit.Assert;

import piergiuseppe82.ee6.ejb.sbean.HelloBean;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author placava
 *
 */
public class HelloStepdefs {
	private String parameter;
	private String message;
	
	@EJB
	private HelloBean helloBean;
	
	@Given("^null parameter$")
	public void null_parameter(){
		parameter = null;
	}
	
	@Given("^parameter with value \"([^\"]*)\"$")
	public void parameter_with_value(String parameter){
		this.parameter = parameter;
	}
	
	@When("^call ejb$")
	public void call_ejb(){
		message = helloBean.getMessage(parameter);
	}
	
	@Then("^message is \"([^\"]*)\"$")
	public void message_is(String expected){
		Assert.assertEquals(expected, message);
	}

}
