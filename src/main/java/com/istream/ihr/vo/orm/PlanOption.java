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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PlanOption generated by hbm2java
 */
@Entity
@Table(name = "plan_option", catalog = "ihr")
public class PlanOption implements java.io.Serializable {

	private Integer planOptId;
	private String optionCode;
	private String name;
	private String description;
	private Date creationTs;
	private Date lastUpdateTs;
	private Set<HealthPlanDtl> healthPlanDtls = new HashSet<HealthPlanDtl>(0);

	public PlanOption() {
	}

	public PlanOption(String name, Date creationTs, Date lastUpdateTs) {
		this.name = name;
		this.creationTs = creationTs;
		this.lastUpdateTs = lastUpdateTs;
	}

	public PlanOption(String optionCode, String name, String description, Date creationTs, Date lastUpdateTs,
			Set<HealthPlanDtl> healthPlanDtls) {
		this.optionCode = optionCode;
		this.name = name;
		this.description = description;
		this.creationTs = creationTs;
		this.lastUpdateTs = lastUpdateTs;
		this.healthPlanDtls = healthPlanDtls;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Plan_opt_id", unique = true, nullable = false)
	public Integer getPlanOptId() {
		return this.planOptId;
	}

	public void setPlanOptId(Integer planOptId) {
		this.planOptId = planOptId;
	}

	@Column(name = "Option_code", length = 10)
	public String getOptionCode() {
		return this.optionCode;
	}

	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	@Column(name = "Name", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Description", length = 10)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planOption")
	public Set<HealthPlanDtl> getHealthPlanDtls() {
		return this.healthPlanDtls;
	}

	public void setHealthPlanDtls(Set<HealthPlanDtl> healthPlanDtls) {
		this.healthPlanDtls = healthPlanDtls;
	}

}
