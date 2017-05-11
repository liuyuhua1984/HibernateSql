/**
 * @Title:PetData.java
 * @Package:com.engine.domain
 * @Description:TODO
 * @auth:cl
 * @date:2015-11-16下午6:28:51
 * @version V1.0
 */
package com.lyh.game.hibernate.domain;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lyh.game.lib.sql.DbEntity;


/**
 * @Title:TODO(宠物数据实体)
 * @Description:TODO
 * @ClassName:PetData
 * @author:cl
 * @date:2015-11-16下午6:28:51
 */
@Entity
@Table(name = "pet",indexes={@Index(name="role_id",columnList="roleId")})
public class PetData extends DbEntity{

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 8447450646514069635L;

	/**
	 * 速度
	 */
	private int speed;

	/**
	 * 配置id
	 */
	private int configId;
	
	/**
	 * 是否出战 1：出战，0：未出战
	 */
	private int isPlay = 0;
	
	/**
	 * 在宠物背包中的位置
	 */
	private int indexInPetBag;
	
	/**
	 * 角色id
	 */
	private long roleId;
	
	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	public int getIsPlay() {
		return isPlay;
	}

	public void setIsPlay(int isPlay) {
		this.isPlay = isPlay;
	}

	
	public int getIndexInPetBag() {
		return indexInPetBag;
	}

	public void setIndexInPetBag(int indexInPetBag) {
		this.indexInPetBag = indexInPetBag;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "PetData [speed=" + speed + ", configId=" + configId
				+ ", isPlay=" + isPlay + ", indexInPetBag=" + indexInPetBag
				+ ", roleId=" + roleId + "]";
	}
}