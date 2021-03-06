/**
 * 
 */
package com.kaoshidian.oa.permission.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;

import com.kaoshidian.oa.base.entity.BaseEntity;

/**
 * @author <p>Innate Solitary 于 2012-5-16 下午5:27:15</p>
 *
 */
public class User extends BaseEntity {
	private Integer userId;
	private String loginName;
	private String password;
	private String realName;
	private String salt;
	private Long lastModifyPwdTime;
	private UserStateEnum state;
	private UserTypeEnum userType;
	private Integer orgId;
	private String dn;
	private String jobno;
	private Boolean isSend=true;
    private Integer ruleId;	
	
	private MultiMap permissions = new MultiHashMap();
	private List<Role> roles = new ArrayList<Role>(0);
	
	public String getLoginName() {
    	return loginName;
    }
	public void setLoginName(String loginName) {
    	this.loginName = loginName;
    }
	public String getPassword() {
    	return password;
    }
	public void setPassword(String password) {
    	this.password = password;
    }
	public String getRealName() {
    	return realName;
    }
	public void setRealName(String realName) {
    	this.realName = realName;
    }
	public UserStateEnum getState() {
    	return state;
    }
	public void setState(UserStateEnum state) {
    	this.state = state;
    }
	public Integer getUserId() {
    	return userId;
    }
	public void setUserId(Integer userId) {
    	this.userId = userId;
    }
	public UserTypeEnum getUserType() {
    	return userType;
    }
	public void setUserType(UserTypeEnum userType) {
    	this.userType = userType;
    }
	public MultiMap getPermissions() {
		if(permissions == null) {
			permissions = new MultiHashMap();
		}
    	return permissions;
    }
	public void setPermissions(MultiMap permissions) {
	    this.permissions = permissions;
    }
	public String getSalt() {
    	return salt;
    }
	public void setSalt(String salt) {
    	this.salt = salt;
    }
	public Long getLastModifyPwdTime() {
    	return lastModifyPwdTime;
    }
	public void setLastModifyPwdTime(Long lastModifyPwdTime) {
    	this.lastModifyPwdTime = lastModifyPwdTime;
    }
	public List<Role> getRoles() {
	    return roles;
    }
	public void setRoles(List<Role> roles) {
	    this.roles = roles;
    }
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public String getDn() {
	    return dn;
    }
	public void setDn(String dn) {
	    this.dn = dn;
    }
	public String getJobno() {
	    return jobno;
    }
	public void setJobno(String jobno) {
	    this.jobno = jobno;
    }
	public Boolean getIsSend() {
		return isSend;
	}
	public void setIsSend(Boolean isSend) {
		this.isSend = isSend;
	}
	public Integer getRuleId() {
		return ruleId;
	}
	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}
	
	
}
