package com.mashape.unirest.http;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Headers extends HashMap<String, List<String>> {

	private static final long serialVersionUID = 71310341388734766L;

	public String getFirst(Object key) {
		List<String> list = get(key);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	
	public Map<String, String> getFlatHeaders(){
		Map<String, String> result = new HashMap<String, String>();
		
		for(Iterator<String> i = this.keySet().iterator(); i.hasNext();) {
		    String key = i.next();
		    String value = getFirst(key);
		    result.put(key, value);
		}
		
		return result;
	}	
}
