package com.lyh.game.hibernate.domain;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lyh.game.lib.sql.DbEntity;


/**
 * ClassName:SkillData <br/>
 * Function: (技能数据). <br/>
 * Date: 2015-8-13 下午3:26:52 <br/>
 * 
 * @author jack
 * @version
 * @see
 */
@Entity
@Table(name = "skill_data",indexes={@Index(name="role_id",columnList="roleId")})
public class SkillData extends DbEntity {
	
	/** UID **/
	private static final long serialVersionUID = -532311660845861439L;
	
	/** 角色ID **/
	private long roleId;
	/** 装配位置（0：未装配） **/  
	private int adaptPos;
	
	/** 技能等级 **/  
	private int level;
	
	/**模板id**/  
	private int configId;
	
//	/** 技能数据 **/
//	private String skillData;
	
	public long getRoleId() {
		return roleId;
	}
	
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	
//	public String getSkillData() {
//		return skillData;
//	}
//	
//	public void setSkillData(String skillData) {
//		this.skillData = skillData;
//	}

	public int getAdaptPos() {
    	return adaptPos;
    }

	public void setAdaptPos(int adaptPos) {
    	this.adaptPos = adaptPos;
    }

	public int getLevel() {
    	return level;
    }

	public void setLevel(int level) {
    	this.level = level;
    }

	public int getConfigId() {
    	return configId;
    }

	public void setConfigId(int configId) {
    	this.configId = configId;
    }
}
