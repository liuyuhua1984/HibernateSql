package com.sql.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lib.sql.DbEntity;

/**
 * ClassName:TaskData <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * Date: 2015-8-4 下午2:57:40 <br/>
 * 
 * @author yxd
 * @version
 * @see
 */
@Entity
@Table(name = "task_data", indexes = { @Index(name = "role_id", columnList = "roleId") })
public class TaskData extends DbEntity {
	
	/****/
	private static final long serialVersionUID = 1068042387585934136L;
	
	private long roleId;// 所属角色编号
	
	private int taskId;// 任务编号
	
	private Timestamp ts;// 时间搓
	
	private byte taskState;// 任务状态
	
	private int NPCId;// npc编号 只有当对话时才有的字段
	
	private String finishNumber;// 完成数量 只有已经接了但是没有完成的情况下才有
	
	private String DoneTaskInfo;
	
	public long getRoleId() {
		return roleId;
	}
	
	public TaskData() {
		// TODO Auto-generated constructor stub
	}
	
	public TaskData(long id, long roleId, byte taskState, int taskId) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.roleId = roleId;
		this.taskState = taskState;
		this.taskId = taskId;
		// this.NPCId=NPCId;
		// this.finishNumber=finishNumber;
	}
	
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	
	public Timestamp getTs() {
		return ts;
	}
	
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	
	public byte getTaskState() {
		return taskState;
	}
	
	public void setTaskState(byte taskState) {
		this.taskState = taskState;
	}
	
	public int getNPCId() {
		return NPCId;
	}
	
	public void setNPCId(int nPCId) {
		NPCId = nPCId;
	}
	
	public String getFinishNumber() {
		return finishNumber;
	}
	
	public void setFinishNumber(String finishNumber) {
		this.finishNumber = finishNumber;
	}
	
	public String getDoneTaskInfo() {
		return DoneTaskInfo;
	}
	
	public void setDoneTaskInfo(String doneTaskInfo) {
		DoneTaskInfo = doneTaskInfo;
	}
	
	public int getTaskId() {
		return taskId;
	}
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	
}
