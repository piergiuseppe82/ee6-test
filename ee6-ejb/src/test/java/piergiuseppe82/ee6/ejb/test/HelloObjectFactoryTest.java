/**
 * 
 */
package piergiuseppe82.ee6.ejb.test;

import org.junit.Assert;
import org.junit.Test;

import cucumber.runtime.java.ObjectFactory;
import cucumber.runtime.java.openejb.OpenEJBObjectFactory;

/**
 * @author placava
 *
 */
public class HelloObjectFactoryTest {
	 	@Test
	    public void shouldGiveUsNewInstancesForEachScenario() {
	        ObjectFactory factory = new OpenEJBObjectFactory();
	        factory.addClass(HelloStepdefs.class);

	        factory.start();
	        HelloStepdefs o1 = factory.getInstance(HelloStepdefs.class);
	        factory.stop();

	        Assert.assertNotNull(o1);
	    }
}
