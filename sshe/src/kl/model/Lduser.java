package kl.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Lduser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "LDUSER", schema = "LIS", uniqueConstraints = { @UniqueConstraint(columnNames = { "USERCODE", "USERNAME" }), @UniqueConstraint(columnNames = { "CLAIMPOPEDOM", "COMCODE", "USERCODE", "USERSTATE" }) })
public class Lduser implements java.io.Serializable {

	// Fields

	private String usercode;
	private String username;
	private String comcode;
	private String password;
	private String userdescription;
	private String userstate;
	private String uwpopedom;
	private String claimpopedom;
	private String otherpopedom;
	private String popuwflag;
	private String superpopedomflag;
	private String operator;
	private Date makedate;
	private String maketime;
	private Date validstartdate;
	private Date validenddate;
	private String certifyflag;
	private String edorpopedom;
	private String agentcom;
	private BigDecimal loginfailcount;
	private String crsCheckStatus;
	private Date modifydate;
	private String modifytime;
	private String modifyoperator;
	private Date pmodifydate;
	private String email;

	// Constructors

	/** default constructor */
	public Lduser() {
	}

	/** minimal constructor */
	public Lduser(String usercode, String comcode, String operator, Date makedate, String maketime) {
		this.usercode = usercode;
		this.comcode = comcode;
		this.operator = operator;
		this.makedate = makedate;
		this.maketime = maketime;
	}

	/** full constructor */
	public Lduser(String usercode, String username, String comcode, String password, String userdescription, String userstate, String uwpopedom, String claimpopedom, String otherpopedom, String popuwflag, String superpopedomflag, String operator, Date makedate, String maketime, Date validstartdate, Date validenddate, String certifyflag, String edorpopedom, String agentcom, BigDecimal loginfailcount, String crsCheckStatus, Date modifydate, String modifytime, String modifyoperator, Date pmodifydate, String email) {
		this.usercode = usercode;
		this.username = username;
		this.comcode = comcode;
		this.password = password;
		this.userdescription = userdescription;
		this.userstate = userstate;
		this.uwpopedom = uwpopedom;
		this.claimpopedom = claimpopedom;
		this.otherpopedom = otherpopedom;
		this.popuwflag = popuwflag;
		this.superpopedomflag = superpopedomflag;
		this.operator = operator;
		this.makedate = makedate;
		this.maketime = maketime;
		this.validstartdate = validstartdate;
		this.validenddate = validenddate;
		this.certifyflag = certifyflag;
		this.edorpopedom = edorpopedom;
		this.agentcom = agentcom;
		this.loginfailcount = loginfailcount;
		this.crsCheckStatus = crsCheckStatus;
		this.modifydate = modifydate;
		this.modifytime = modifytime;
		this.modifyoperator = modifyoperator;
		this.pmodifydate = pmodifydate;
		this.email = email;
	}

	// Property accessors
	@Id
	@Column(name = "USERCODE", unique = true, nullable = false, length = 6)
	public String getUsercode() {
		return this.usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	@Column(name = "USERNAME", length = 30)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "COMCODE", nullable = false, length = 10)
	public String getComcode() {
		return this.comcode;
	}

	public void setComcode(String comcode) {
		this.comcode = comcode;
	}

	@Column(name = "PASSWORD", length = 16)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USERDESCRIPTION", length = 50)
	public String getUserdescription() {
		return this.userdescription;
	}

	public void setUserdescription(String userdescription) {
		this.userdescription = userdescription;
	}

	@Column(name = "USERSTATE", length = 1)
	public String getUserstate() {
		return this.userstate;
	}

	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}

	@Column(name = "UWPOPEDOM", length = 2)
	public String getUwpopedom() {
		return this.uwpopedom;
	}

	public void setUwpopedom(String uwpopedom) {
		this.uwpopedom = uwpopedom;
	}

	@Column(name = "CLAIMPOPEDOM", length = 2)
	public String getClaimpopedom() {
		return this.claimpopedom;
	}

	public void setClaimpopedom(String claimpopedom) {
		this.claimpopedom = claimpopedom;
	}

	@Column(name = "OTHERPOPEDOM", length = 2)
	public String getOtherpopedom() {
		return this.otherpopedom;
	}

	public void setOtherpopedom(String otherpopedom) {
		this.otherpopedom = otherpopedom;
	}

	@Column(name = "POPUWFLAG", length = 1)
	public String getPopuwflag() {
		return this.popuwflag;
	}

	public void setPopuwflag(String popuwflag) {
		this.popuwflag = popuwflag;
	}

	@Column(name = "SUPERPOPEDOMFLAG", length = 1)
	public String getSuperpopedomflag() {
		return this.superpopedomflag;
	}

	public void setSuperpopedomflag(String superpopedomflag) {
		this.superpopedomflag = superpopedomflag;
	}

	@Column(name = "OPERATOR", nullable = false, length = 10)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MAKEDATE", nullable = false, length = 7)
	public Date getMakedate() {
		return this.makedate;
	}

	public void setMakedate(Date makedate) {
		this.makedate = makedate;
	}

	@Column(name = "MAKETIME", nullable = false, length = 8)
	public String getMaketime() {
		return this.maketime;
	}

	public void setMaketime(String maketime) {
		this.maketime = maketime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VALIDSTARTDATE", length = 7)
	public Date getValidstartdate() {
		return this.validstartdate;
	}

	public void setValidstartdate(Date validstartdate) {
		this.validstartdate = validstartdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VALIDENDDATE", length = 7)
	public Date getValidenddate() {
		return this.validenddate;
	}

	public void setValidenddate(Date validenddate) {
		this.validenddate = validenddate;
	}

	@Column(name = "CERTIFYFLAG", length = 1)
	public String getCertifyflag() {
		return this.certifyflag;
	}

	public void setCertifyflag(String certifyflag) {
		this.certifyflag = certifyflag;
	}

	@Column(name = "EDORPOPEDOM", length = 2)
	public String getEdorpopedom() {
		return this.edorpopedom;
	}

	public void setEdorpopedom(String edorpopedom) {
		this.edorpopedom = edorpopedom;
	}

	@Column(name = "AGENTCOM", length = 20)
	public String getAgentcom() {
		return this.agentcom;
	}

	public void setAgentcom(String agentcom) {
		this.agentcom = agentcom;
	}

	@Column(name = "LOGINFAILCOUNT", precision = 22, scale = 0)
	public BigDecimal getLoginfailcount() {
		return this.loginfailcount;
	}

	public void setLoginfailcount(BigDecimal loginfailcount) {
		this.loginfailcount = loginfailcount;
	}

	@Column(name = "CRS_CHECK_STATUS", length = 2)
	public String getCrsCheckStatus() {
		return this.crsCheckStatus;
	}

	public void setCrsCheckStatus(String crsCheckStatus) {
		this.crsCheckStatus = crsCheckStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFYDATE", length = 7)
	public Date getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	@Column(name = "MODIFYTIME", length = 8)
	public String getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
	}

	@Column(name = "MODIFYOPERATOR", length = 10)
	public String getModifyoperator() {
		return this.modifyoperator;
	}

	public void setModifyoperator(String modifyoperator) {
		this.modifyoperator = modifyoperator;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PMODIFYDATE", length = 7)
	public Date getPmodifydate() {
		return this.pmodifydate;
	}

	public void setPmodifydate(Date pmodifydate) {
		this.pmodifydate = pmodifydate;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}