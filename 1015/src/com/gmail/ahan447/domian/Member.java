package com.gmail.ahan447.domian;

import java.sql.Date;
import java.util.Map;

public class Member {
	public class MebverDaoImpl implements MemberDao {

		@Override
		public String idCheck(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int insertMember(Member member) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Member login(Map<String, Object> map) {
			// TODO Auto-generated method stub
			return null;
		}

	}
	private String id;
	private String pw;
	private String name;
	private String alias;
	private Date regdate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", alias=" + alias + ", regdate=" + regdate + "]";
	}
	
	
	
	
}
