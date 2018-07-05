/*
* CreateDate : 2018-01-19 10:47:12
* CreateBy   : wilson wei  
 */
package com.batch.entities.live;

import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_info")
public class UserInfo {

    @GeneratedValue(generator = "JDBC")
    @Id
    @Column(name = "id")
    @ApiModelProperty(value = "自增id")
    private Integer id;

    @Column(name = "name")
    @ApiModelProperty(value = "姓名")
    private String name;

    @Column(name = "nick_name")
    @ApiModelProperty(value = "昵称")
    private String nickName;

    @Column(name = "email")
    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @Column(name = "mobile_phone")
    @ApiModelProperty(value = "手机号")
    private String mobilePhone;

    @Column(name = "company")
    @ApiModelProperty(value = "单位/医院/学校")
    private String company;

    @Column(name = "department")
    @ApiModelProperty(value = "部门/科室/专业")
    private String department;

    @Column(name = "postion")
    @ApiModelProperty(value = "职务/职位")
    private String postion;

    @Column(name = "hospital")
    @ApiModelProperty(value = "所在医院")
    private String hospital;

    @Column(name = "sex")
    @ApiModelProperty(value = "性别")
    private String sex;

    @Column(name = "birthday")
    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @Column(name = "title")
    @ApiModelProperty(value = "职称")
    private String title;

    @Column(name = "address")
    @ApiModelProperty(value = "详细地址")
    private String address;

    @Column(name = "country")
    @ApiModelProperty(value = "国家")
    private String country;

    @Column(name = "province")
    @ApiModelProperty(value = "省/直辖市")
    private String province;

    @Column(name = "city")
    @ApiModelProperty(value = "市/区")
    private String city;

    @Column(name = "county")
    @ApiModelProperty(value = "县/区")
    private String county;

    @Column(name = "zip_code")
    @ApiModelProperty(value = "邮编")
    private String zipCode;

    @Column(name = "id_code")
    @ApiModelProperty(value = "证件号")
    private String idCode;

    @Column(name = "status")
    @ApiModelProperty(value = "账号状态（A:可用，X不可用）")
    private String status;

    @Column(name = "state_date")
    @ApiModelProperty(value = "创建时间")
    private Date stateDate;

    @Column(name = "confirm_number")
    @ApiModelProperty(value = "签到确认码（永久）")
    private String confirmNumber;

    @Column(name = "phone")
    @ApiModelProperty(value = "固定电话")
    private String phone;

    @Column(name = "user_type")
    @ApiModelProperty(value = "账号类型（1:toc,2:tob,3:team）")
    private String userType;

    @Column(name = "user_source")
    @ApiModelProperty(value = "账号来源（'ios','pc','an'）")
    private String userSource;

    @Column(name = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    @Column(name = "open_id")
    @ApiModelProperty(value = "第三方登录主键")
    private String openId;

    @Column(name = "login_source")
    @ApiModelProperty(value = "第三方注册来源")
    private String loginSource;

    @Column(name = "user_pic")
    @ApiModelProperty(value = "用户头像")
    private String userPic;

    @Column(name = "authen_status")
    @ApiModelProperty(value = "认证状态('A:实名认证','B:待认证','C:大咖认证',''X:未认证')")
    private String authenStatus;

    @Column(name = "token_id")
    @ApiModelProperty(value = "移动端接口请求使用的token_id")
    private String tokenId;

    @Column(name = "my_template_email")
    @ApiModelProperty(value = "主办方用于接收以及发送的邮件账号")
    private String myTemplateEmail;

    @Column(name = "medical")
    @ApiModelProperty(value = "用户身份CODE")
    private String medical;

    @Column(name = "qq_open_id")
    @ApiModelProperty(value = "qq登录openId")
    private String qqOpenId;

    @ApiModelProperty(value = "上次密码更新时间")
    @Column(name = "last_pwd_reset_time")
    private Date lastPwdResetTime;

    @Column(name = "tob_port_status")
    @ApiModelProperty(value = "B端认证状态（D:'未认证',B:'待认证',A:'已认证',X:'认证未通过'）")
    private String tobPortStatus;

    @Column(name = "toc_port_status")
    @ApiModelProperty(value = "C端激活认证状态（wait_activation:待激活，done_activation:已激活，done_authen:已认证）")
    private String tocPortStatus;

    @Column(name = "diploma")
    @ApiModelProperty(value = "学历")
    private String diploma;

    @Column(name = "entrance_date")
    @ApiModelProperty(value = "入学年份")
    private String entranceDate;

    @Column(name = "des")
    @ApiModelProperty(value = "个人简介")
    private String des;

    @Column(name = "company_web_site")
    @ApiModelProperty(value = "单位网址")
    private String companyWebSite;

    @Transient
    private int pojoId;

    @Transient
    @ApiModelProperty(value = "省")
    private String provinceName;

    @Transient
    @ApiModelProperty(value = "市")
    private String cityName;

    @Transient
    @ApiModelProperty(value = "感兴趣的学科分类")
    private String labelName;

    @Transient
    @ApiModelProperty(value = "激活身份类别")
    private String identityCode;

    @Transient
    @ApiModelProperty(value = "认证身份类别")
    private String category;

    public UserInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStateDate() {
        return stateDate;
    }

    public void setStateDate(Date stateDate) {
        this.stateDate = stateDate;
    }

    public String getConfirmNumber() {
        return confirmNumber;
    }

    public void setConfirmNumber(String confirmNumber) {
        this.confirmNumber = confirmNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getLoginSource() {
        return loginSource;
    }

    public void setLoginSource(String loginSource) {
        this.loginSource = loginSource;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public String getAuthenStatus() {
        return authenStatus;
    }

    public void setAuthenStatus(String authenStatus) {
        this.authenStatus = authenStatus;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getMyTemplateEmail() {
        return myTemplateEmail;
    }

    public void setMyTemplateEmail(String myTemplateEmail) {
        this.myTemplateEmail = myTemplateEmail;
    }

    public String getMedical() {
        return medical;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public Date getLastPwdResetTime() {
        return lastPwdResetTime;
    }

    public void setLastPwdResetTime(Date lastPwdResetTime) {
        this.lastPwdResetTime = lastPwdResetTime;
    }

    public String getTobPortStatus() {
        return tobPortStatus;
    }

    public void setTobPortStatus(String tobPortStatus) {
        this.tobPortStatus = tobPortStatus;
    }

    public String getTocPortStatus() {
        return tocPortStatus;
    }

    public void setTocPortStatus(String tocPortStatus) {
        this.tocPortStatus = tocPortStatus;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(String entranceDate) {
        this.entranceDate = entranceDate;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCompanyWebSite() {
        return companyWebSite;
    }

    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }

    public int getPojoId() {
        return pojoId;
    }

    public void setPojoId(int pojoId) {
        this.pojoId = pojoId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}