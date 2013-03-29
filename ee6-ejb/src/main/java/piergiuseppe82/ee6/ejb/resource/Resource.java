/**
 * 
 */
package piergiuseppe82.ee6.ejb.resource;

import javax.enterprise.inject.Produces;

/**
 * @author placava
 *
 */
public class Resource {
	
	@Produces
	public String getDeafaultMessage(){
		return "Hello welcome!";
	}
}
