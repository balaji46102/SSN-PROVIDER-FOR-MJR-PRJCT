package com.stubizsolutions.services;

import org.springframework.stereotype.Service;

import com.stubizsolutions.bindings.SsaWebRequest;
import com.stubizsolutions.bindings.SsaWebResponse;

@Service
public class SsaWebServiceImpl implements SsaWebService 
{

	@Override
	public SsaWebResponse getCitizenInfo(SsaWebRequest request) {
		
		SsaWebResponse response = new SsaWebResponse();
		
		Long ssn = request.getSsn();
		response.setSsn(ssn);
		String ssnStr = String.valueOf(ssn);	
		
		
		if (ssnStr.startsWith("1")) 
		{
			response.setStateName("New Jersy");
		}
		else if (ssnStr.startsWith("2"))
		{
			response.setStateName("Texas");
		}
		else if (ssnStr.startsWith("3"))
		{
			response.setStateName("Dallas");
		}
		else if (ssnStr.startsWith("4")) 
		{
			response.setStateName("Rhode Island");
		}
		else if (ssnStr.startsWith("5")) 
		{
			response.setStateName("Ohio");
		}
		else if (ssnStr.startsWith("6")) 
		{
			response.setStateName("Alabma");
		}
		else if (ssnStr.startsWith("7")) 
		{
			response.setStateName("Kenttuky");
		}
		else if (ssnStr.startsWith("8")) 
		{
			response.setStateName("California");
		}
		else if (ssnStr.startsWith("9")) 
		{
			response.setStateName("Standford");
		}
		
		return response;
	}

}
