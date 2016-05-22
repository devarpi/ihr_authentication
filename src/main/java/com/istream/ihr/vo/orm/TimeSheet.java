package com.istream.ihr.vo.orm;
// Generated 21-May-2016 13:20:47 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TimeSheet generated by hbm2java
 */
@Entity
@Table(name = "time_sheet", catalog = "ihr")
public class TimeSheet implements java.io.Serializable {

	private Integer timeSheetId;
	private Employee employee;
	private Project project;
	private Date startDate;
	private Date endDate;
	private int billedHours;
	private Integer nonBilledHours;
	private String note;
	private String status;
	private Date creationTs;
	private Date lastUpdateTs;
	private Set<TimeSheetTaskAs> timeSheetTaskAses = new HashSet<TimeSheetTaskAs>(0);

	public TimeSheet() {
	}

	public TimeSheet(Project project, Date startDate, int billedHours, Date creationTs, Date lastUpdateTs) {
		this.project = project;
		this.startDate = startDate;
		this.billedHours = billedHours;
		this.creationTs = creationTs;
		this.lastUpdateTs = lastUpdateTs;
	}

	public TimeSheet(Employee employee, Project project, Date startDate, Date endDate, int billedHours,
			Integer nonBilledHours, String note, String status, Date creationTs, Date lastUpdateTs,
			Set<TimeSheetTaskAs> timeSheetTaskAses) {
		this.employee = employee;
		this.project = project;
		this.startDate = startDate;
		this.endDate = endDate;
		this.billedHours = billedHours;
		this.nonBilledHours = nonBilledHours;
		this.note = note;
		this.status = status;
		this.creationTs = creationTs;
		this.lastUpdateTs = lastUpdateTs;
		this.timeSheetTaskAses = timeSheetTaskAses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Time_sheet_id", unique = true, nullable = false)
	public Integer getTimeSheetId() {
		return this.timeSheetId;
	}

	public void setTimeSheetId(Integer timeSheetId) {
		this.timeSheetId = timeSheetId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Approver_id")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Start_Date", nullable = false, length = 0)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "End_Date", length = 0)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "Billed_Hours", nullable = false)
	public int getBilledHours() {
		return this.billedHours;
	}

	public void setBilledHours(int billedHours) {
		this.billedHours = billedHours;
	}

	@Column(name = "Non_Billed_Hours")
	public Integer getNonBilledHours() {
		return this.nonBilledHours;
	}

	public void setNonBilledHours(Integer nonBilledHours) {
		this.nonBilledHours = nonBilledHours;
	}

	@Column(name = "Note", length = 100)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "Status", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Creation_ts", nullable = false, length = 0)
	public Date getCreationTs() {
		return this.creationTs;
	}

	public void setCreationTs(Date creationTs) {
		this.creationTs = creationTs;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Last_update_ts", nullable = false, length = 0)
	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "timeSheet")
	public Set<TimeSheetTaskAs> getTimeSheetTaskAses() {
		return this.timeSheetTaskAses;
	}

	public void setTimeSheetTaskAses(Set<TimeSheetTaskAs> timeSheetTaskAses) {
		this.timeSheetTaskAses = timeSheetTaskAses;
	}

}
