
package com.lyh.game.hibernate.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.lyh.game.lib.sql.DbEntity;
/**
 * ClassName:Role <br/>
 * Function: TODO (角色数据库数据). <br/>
 * Reason: TODO (). <br/>
 * Date: 2015-7-3 下午4:34:45 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Entity
@Table(name = "role",indexes={@Index(name="role_name",columnList="roleName"),@Index(name="user_name",columnList="userName")})
public class Role extends DbEntity {
	
	/****/
	private static final long serialVersionUID = 3684576532542034529L;
	
	/** 是否可保存 (1可以 0 不可以)**/  
	private int canSave = 1;
	
	/** 角色名字 **/
	private String roleName;
	/** 用户名 **/
	private String userName;
	/** 角色职业配置文件 **/
	private int careerConfigId;
	/** 角色等级 **/
	private int roleLevel;
	
	/** 当前经验 **/
	private int curExp;
	
	/** 服务器id **/
	private String serverId;
	
	/** 气力 **/
	private int air;
	/** 内力 **/
	private int innerForce;
	/*** 敏捷 */
	private int agility;
	/** 掌控 **/
	private int control;
	/** 坚韧 **/
	private int tenacity;
	/** 防御 **/
	private int defence;
	/**聊天-普通配置*/
	private int chatNormalConfig = 511;
	/**聊天-语音配置*/
	private int chatVoiceConfig = 511;
	
	/**
	 * 装备格子数
	 */
	private int equitGridNumber;
	/**
	 * 普通道具数量
	 */
	private int commonGridNumber;
	

	//仓库解锁格子数
	private int cargoGridNumber;
	
//	/** 创建角色时间 **/
//	private Timestamp createTime;
	
	/** 登录时间 **/
	private Timestamp loginInTime;
	/** 登出时间 **/
	private Timestamp loginOutTime;
	
	/** 累计在线时间(以分钟为单位) **/
	private int onlineTime;
	
	/** 游戏币白银 **/
	private int money;
	
	/*** 绑定钻石---元宝 **/
	private int bindGold;
	/** 充值钻石---金砖 **/
	private int rechargeGold;
	
	/** vip等级 **/
	private int vipLevel;
	
	/** 生肖 **/
	private int chineseZodiacId;
	
	/** 角色体力 **/
	private int vits;
	
	/** 称号配置id **/
	private int titleConfigId;
	
	/** 精血 **/
	private int hp;
	/** 精力 **/
	private int mp;
	
	/** 公会id **/
	private long guildId;
	/** 公会名称 **/
	private String guildName;
	
	/** 副本id **/
	private long fuBenId;
	
	/** 地图模板ID **/
	private int mapUid;
	
	/** 方向 **/
	private float dir;
	
	/** x坐标 **/
	private float x;
	/** y坐标 **/
	private float y;
	/** z坐标 **/
	private float z;
	/**
	 * 新手指导
	 */
	private int guideInfo;
	/**
	 * 主要任务索引
	 */
	private int mainTaskIndex;
	
	/** 已通关副本ID **/
	private String passedFuBenUids;
//	
//	/** 怒气值 **/
//	private int anger;
	
	/** 计数器 (JSON) **/
	private String counterStr;
	
	/** 可使用的属性点 **/
	private int remainSkillPoint;
	
	/**
	 * 是否是新角色
	 */
	private boolean isNewRole;
	
	/**
	 * 副本免费复活次数
	 */
	private String fubenFreeRelives="";
	
	/** 技能点 **/  
	private int skillPoint;
	
	@Lob
	public String getFubenFreeRelives() {
    	return fubenFreeRelives;
    }

	public void setFubenFreeRelives(String fubenFreeRelives) {
    	this.fubenFreeRelives = fubenFreeRelives;
    }

	public String getCounterStr() {
		return counterStr;
	}
	
	public void setCounterStr(String counterStr) {
		this.counterStr = counterStr;
	}
	
	public String getPassedFuBenUids() {
		return passedFuBenUids;
	}
		
	public int getCanSave() {
    	return canSave;
    }

	public void setCanSave(int canSave) {
    	this.canSave = canSave;
    }

	public void setPassedFuBenUids(String passedFuBenUids) {
		this.passedFuBenUids = passedFuBenUids;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName; 
	}
	 
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public long getFuBenId() {
		return fuBenId;
	}
	
	public void setFuBenId(long fuBenId) {
		this.fuBenId = fuBenId;
	}
	
	public int getRoleLevel() {
		return roleLevel;
	}
	
	public void setRoleLevel(int roleLevel) {
		this.roleLevel = roleLevel;
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public int getMapUid() {
		return mapUid;
	}
	
	public void setMapUid(int mapUid) {
		this.mapUid = mapUid;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
	public int getAir() {
		return air;
	}
	
	public void setAir(int air) {
		this.air = air;
	}
	
	public int getInnerForce() {
		return innerForce;
	}
	
	public void setInnerForce(int innerForce) {
		this.innerForce = innerForce;
	}
	
	public int getCurExp() {
		return curExp;
	}
	
	public void setCurExp(int curExp) {
		this.curExp = curExp;
	}
	
//	public Timestamp getCreateTime() {
//		return createTime;
//	}
//	
//	public void setCreateTime(Timestamp createTime) {
//		this.createTime = createTime;
//	}
	
	public Timestamp getLoginInTime() {
		return loginInTime;
	}
	
	public void setLoginInTime(Timestamp loginInTime) {
		this.loginInTime = loginInTime;
	}
	
	public Timestamp getLoginOutTime() {
		return loginOutTime;
	}
	
	public void setLoginOutTime(Timestamp loginOutTime) {
		this.loginOutTime = loginOutTime;
	}
	
	public int getOnlineTime() {
		return onlineTime;
	}
	
	public void setOnlineTime(int onlineTime) {
		this.onlineTime = onlineTime;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getVipLevel() {
		return vipLevel;
	}
	
	public void setVipLevel(int vipLevel) {
		this.vipLevel = vipLevel;
	}
	
	public int getChineseZodiacId() {
		return chineseZodiacId;
	}
	
	public void setChineseZodiacId(int chineseZodiacId) {
		this.chineseZodiacId = chineseZodiacId;
	}
	
	public  int getVits() {
		return vits;
	}
	
	public  void setVits(int vits) {
		this.vits = vits;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	public int getControl() {
		return control;
	}
	
	public void setControl(int control) {
		this.control = control;
	}
	
	public int getTenacity() {
		return tenacity;
	}
	
	public void setTenacity(int tenacity) {
		this.tenacity = tenacity;
	}
	
	public int getDefence() {
		return defence;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	public int getCareerConfigId() {
		return careerConfigId;
	}
	
	public void setCareerConfigId(int careerConfigId) {
		this.careerConfigId = careerConfigId;
	}
	
	public int getEquitGridNumber() {
		return equitGridNumber;
	}
	
	public void setEquitGridNumber(int equitGridNumber) {
		this.equitGridNumber = equitGridNumber;
	}
	
	public int getCommonGridNumber() {
		return commonGridNumber;
	}
	
	public void setCommonGridNumber(int commonGridNumber) {
		this.commonGridNumber = commonGridNumber;
	}
	
	public int getTitleConfigId() {
		return titleConfigId;
	}
	
	public void setTitleConfigId(int titleConfigId) {
		this.titleConfigId = titleConfigId;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getBindGold() {
		return bindGold;
	}
	
	public void setBindGold(int bindGold) {
		this.bindGold = bindGold;
	}
	
	public int getRechargeGold() {
		return rechargeGold;
	}
	
	public void setRechargeGold(int rechargeGold) {
		this.rechargeGold = rechargeGold;
	}
	
	public long getGuildId() {
		return guildId;
	}
	
	public void setGuildId(long guildId) {
		this.guildId = guildId;
	}
	
	public String getGuildName() {
		return guildName;
	}
	
	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}
	
	public float getDir() {
		return dir;
	}
	
	public void setDir(float dir) {
		this.dir = dir;
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public float getZ() {
		return z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public int getGuideInfo() {
		return guideInfo;
	}
	
	public void setGuideInfo(int guideInfo) {
		this.guideInfo = guideInfo;
	}
	
	public int getMainTaskIndex() {
		return mainTaskIndex;
	}
	
	public void setMainTaskIndex(int mainTaskIndex) {
		this.mainTaskIndex = mainTaskIndex;
	}
	
//	public int getAnger() {
//		return anger;
//	}
//	
//	public void setAnger(int anger) {
//		this.anger = anger;
//	}

	public int getRemainSkillPoint() {
    	return remainSkillPoint;
    }

	public void setRemainSkillPoint(int remainSkillPoint) {
    	this.remainSkillPoint = remainSkillPoint;
    }
	
	public boolean isNewRole() {
    	return isNewRole;
    }

	public void setNewRole(boolean isNewRole) {
    	this.isNewRole = isNewRole;
    }

	public int getSkillPoint() {
    	return skillPoint;
    }

	public void setSkillPoint(int skillPoint) {
    	this.skillPoint = skillPoint;
    }

	public int getChatNormalConfig() {
		return chatNormalConfig;
	}

	public void setChatNormalConfig(int chatNormalConfig) {
		this.chatNormalConfig = chatNormalConfig;
	}

	public int getChatVoiceConfig() {
		return chatVoiceConfig;
	}

	public void setChatVoiceConfig(int chatVoiceConfig) {
		this.chatVoiceConfig = chatVoiceConfig;
	}

	public int getCargoGridNumber() {
		return cargoGridNumber;
	}

	public void setCargoGridNumber(int cargoGridNumber) {
		this.cargoGridNumber = cargoGridNumber;
	}

//	@Override
//	public String toString() {
//		return "Role [roleName=" + roleName + ", userName=" + userName
//				+ ", careerConfigId=" + careerConfigId + ", roleLevel="
//				+ roleLevel + ", curExp=" + curExp + ", serverId=" + serverId
//				+ ", air=" + air + ", innerForce=" + innerForce + ", agility="
//				+ agility + ", control=" + control + ", tenacity=" + tenacity
//				+ ", defence=" + defence + ", chatNormalConfig="
//				+ chatNormalConfig + ", chatVoiceConfig=" + chatVoiceConfig
//				+ ", equitGridNumber=" + equitGridNumber
//				+ ", commonGridNumber=" + commonGridNumber + ", createTime="
//				+ createTime + ", loginInTime=" + loginInTime
//				+ ", loginOutTime=" + loginOutTime + ", onlineTime="
//				+ onlineTime + ", money=" + money + ", bindGold=" + bindGold
//				+ ", rechargeGold=" + rechargeGold + ", vipLevel=" + vipLevel
//				+ ", chineseZodiacId=" + chineseZodiacId + ", vits=" + vits
//				+ ", titleConfigId=" + titleConfigId + ", hp=" + hp + ", mp="
//				+ mp + ", guildId=" + guildId + ", guildName=" + guildName
//				+ ", fuBenId=" + fuBenId + ", mapUid=" + mapUid + ", dir="
//				+ dir + ", x=" + x + ", y=" + y + ", z=" + z + ", guideInfo="
//				+ guideInfo + ", mainTaskIndex=" + mainTaskIndex
//				+ ", passedFuBenUids=" + passedFuBenUids + ", counterStr="
//				+ counterStr + ", remainSkillPoint=" + remainSkillPoint
//				+ ", isNewRole=" + isNewRole + ", fubenFreeRelives="
//				+ fubenFreeRelives + ", skillPoint=" + skillPoint + "]";
//	}
	
}
