package com.bcc.domain;

public class SearchCriteria extends Criteria {

	private String searchType = "";
	private String keyword = "";
	private Integer t_category;

	
	
	
	public Integer getT_category() {
		return t_category;
	}

	public void setT_category(Integer t_category) {
		this.t_category = t_category;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + ", t_category=" + t_category + "]";
	}

}