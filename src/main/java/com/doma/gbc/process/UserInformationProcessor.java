/**
 * 
 */
package com.doma.gbc.process;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.springframework.stereotype.Component;

/**
 * @author Freddy Li
 * @date   8 Dec 2017
 * UserInformationProcessor
 */
@Component
public class UserInformationProcessor implements Callable {
	
	@Resource
	private MuleMessage muleMessage;

	/* (non-Javadoc)
	 * @see org.mule.api.lifecycle.Callable#onCall(org.mule.api.MuleEventContext)
	 */
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		  muleMessage = eventContext.getMessage();
		String body =  muleMessage.getPayloadAsString();
		JSONObject jsonObj = new JSONObject(body);
		
		return null;
	}

}
