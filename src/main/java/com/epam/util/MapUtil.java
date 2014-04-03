package com.epam.util;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
	public static Map<String, Object> convert(Map<String, String[]> inputMap) {
		Map<String, Object> outputMap = new HashMap();
		for (String key : inputMap.keySet()) {
			outputMap.put(key, inputMap.get(key)[0]);
		}
		return outputMap;
	}
}
