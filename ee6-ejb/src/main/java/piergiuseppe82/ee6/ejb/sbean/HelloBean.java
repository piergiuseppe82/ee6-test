/**
 * 
 */
package piergiuseppe82.ee6.ejb.sbean;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * @author placava
 *
 */
@Stateless
public class HelloBean {
	
	@Inject
	private String deafaultMessage;
	
	public String getMessage(String name){		
		if(name != null)
			return "Hey " +name+", hello from EJB!";
		else
			return deafaultMessage;
	}

}
