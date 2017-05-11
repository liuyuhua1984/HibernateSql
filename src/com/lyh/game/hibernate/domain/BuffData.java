
package com.lyh.game.hibernate.domain;  

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.lyh.game.lib.sql.DbEntity;


/** 
 * ClassName:BuffData <br/> 
 * Function: (buff数据). <br/> 
 * Date:     2015-9-1 下午5:22:03 <br/> 
 * @author   jack 
 * @version   
 * @see       
 */
@Entity
@Table(name = "buff_data",indexes={@Index(name="role_id",columnList="roleId")})
public class BuffData extends DbEntity{

	/****/  
    private static final long serialVersionUID = 3254242666550392051L;
	
    /** 角色ID **/  
    private long roleId;
    
    /**角色buff列表 json**/  
  
    private String buffInfos = "";
    
	public long getRoleId() {
    	return roleId;
    }

	public void setRoleId(long roleId) {
    	this.roleId = roleId;
    }
	
	@Lob
	@Column(length = 512)
	public String getBuffInfos() {
    	return buffInfos;
    }

	public void setBuffInfos(String buffInfos) {
    	this.buffInfos = buffInfos;
    }
   
}
  