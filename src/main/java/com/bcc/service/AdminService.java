package com.bcc.service;


import java.util.List;

import org.json.simple.JSONObject;

import com.bcc.domain.PremiumOrderVO;

public interface AdminService {
	
	public List<PremiumOrderVO> getPmInfo(String date);

	public List<String> getPm(String date);
	
	public List<PremiumOrderVO> getOnlyPeriod(String date);
	
	public JSONObject getTrendChart();
	
}
