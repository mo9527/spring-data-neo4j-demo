package com.mo9.neo4j.controller.param;

import com.mo9.core.web.service.config.BaseRequestParam;


public class ScoreCardRequestParam extends BaseRequestParam{
	/** 用户手机号*/
    private String mobile;
    /** 评分卡版本 */
    private String scVersion;
    /** 用户t_risk_buyer主键*/
    private Long buyerId;
    /** 已有的评分序列号*/
    private String sequence;
    
    /** 运营商数据*/
    private String mobileReport;
    /** 芝麻分数据*/
    private String zmScore;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getScVersion() {
		return scVersion;
	}

	public void setScVersion(String scVersion) {
		this.scVersion = scVersion;
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public String getMobileReport() {
		return mobileReport;
	}

	public void setMobileReport(String mobileReport) {
		this.mobileReport = mobileReport;
	}

	public String getZmScore() {
		return zmScore;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
		
	
}