package com.stubizsolutions.services;

import com.stubizsolutions.bindings.SsaWebRequest;
import com.stubizsolutions.bindings.SsaWebResponse;

public interface SsaWebService 
{
	public SsaWebResponse getCitizenInfo(SsaWebRequest request);

}
