package com.altimetrik.ticketmanagementsystem.domain;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TS_TicketDetails")
public class TicketInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	private int userId;
	private String ticket;
	private String type;
	private String description;
	private boolean isattached;
	private Date createdDate;
	private String version;
	private String status;
	private Date dueDate;

	public TicketInfo() {
	}

	public TicketInfo(int ticketId, int userId, String ticket, String type, String description, boolean isattached,
			Date createdDate, String version, String status, Date dueDate) {
		super();
		this.ticketId = ticketId;
		this.userId = userId;
		this.ticket = ticket;
		this.type = type;
		this.description = description;
		this.isattached = isattached;
		this.createdDate = createdDate;
		this.version = version;
		this.status = status;
		this.dueDate = dueDate;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getUserIid() {
		return userId;
	}

	public void setUserIid(int userIid) {
		this.userId = userIid;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isIsattached() {
		return isattached;
	}

	public void setIsattached(boolean isattached) {
		this.isattached = isattached;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
