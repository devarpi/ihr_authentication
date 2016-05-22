package com.istream.ihr.vo.orm;
// Generated 21-May-2016 13:20:47 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address", catalog = "ihr")
public class Address implements java.io.Serializable {

	private Integer addressId;
	private Employee employee;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private Date effectiveDate;
	private Date termDate;
	private Date creationTs;
	private Date lastUpdateTs;

	public Address() {
	}

	public Address(Employee employee, String street1, String city, String state, String zipcode, String country,
			Date effectiveDate, Date creationTs, Date lastUpdateTs) {
		this.employee = employee;
		this.street1 = street1;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.effectiveDate = effectiveDate;
		this.creationTs = creationTs;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Address(Employee employee, String street1, String street2, String city, String state, String zipcode,
			String country, Date effectiveDate, Date termDate, Date creationTs, Date lastUpdateTs) {
		this.employee = employee;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.effectiveDate = effectiveDate;
		this.termDate = termDate;
		this.creationTs = creationTs;
		this.lastUpdateTs = lastUpdateTs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Address_id", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id", nullable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name = "Street1", nullable = false, length = 100)
	public String getStreet1() {
		return this.street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	@Column(name = "Street2", length = 100)
	public String getStreet2() {
		return this.street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	@Column(name = "City", nullable = false, length = 40)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "State", nullable = false, length = 2)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "Zipcode", nullable = false, length = 15)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "Country", nullable = false, length = 100)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Effective_date", nullable = false, length = 0)
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Term_date", length = 0)
	public Date getTermDate() {
		return this.termDate;
	}

	public void setTermDate(Date termDate) {
		this.termDate = termDate;
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

}
