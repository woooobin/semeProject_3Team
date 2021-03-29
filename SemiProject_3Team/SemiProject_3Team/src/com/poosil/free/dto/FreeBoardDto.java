package com.poosil.free.dto;

import javax.xml.crypto.Data;

public class FreeBoardDto {
	
	private int freeboardseq;
	private String userid;
	private String freeboardtitle;
	private String freeboardcontent;
	private Data regdate;
	private int readcount;
	
	public FreeBoardDto() {
		
	}

	public FreeBoardDto(int freeboardseq, String userid, String freeboardtitle, String freeboardcontent, Data regdate,
			int readcount) {
		super();
		this.freeboardseq = freeboardseq;
		this.userid = userid;
		this.freeboardtitle = freeboardtitle;
		this.freeboardcontent = freeboardcontent;
		this.regdate = regdate;
		this.readcount = readcount;
	}

	public int getFreeboardseq() {
		return freeboardseq;
	}

	public void setFreeboardseq(int freeboardseq) {
		this.freeboardseq = freeboardseq;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFreeboardtitle() {
		return freeboardtitle;
	}

	public void setFreeboardtitle(String freeboardtitle) {
		this.freeboardtitle = freeboardtitle;
	}

	public String getFreeboardcontent() {
		return freeboardcontent;
	}

	public void setFreeboardcontent(String freeboardcontent) {
		this.freeboardcontent = freeboardcontent;
	}

	public Data getRegdate() {
		return regdate;
	}

	public void setRegdate(Data regdate) {
		this.regdate = regdate;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	
	
	
}
