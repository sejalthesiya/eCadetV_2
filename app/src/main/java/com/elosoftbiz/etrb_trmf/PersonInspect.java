package com.elosoftbiz.etrb_trmf;

public class PersonInspect {
    Integer id;
    String person_inspect_id, person_id, comments, checked_by_id, app_by_id, date_checked, date_app, checked_remarks, app_remarks, company_id, vessel_id;

    public PersonInspect(String person_inspect_id, Integer id, String person_id, String comments, String checked_by_id, String app_by_id, String date_checked, String date_app, String checked_remarks, String app_remarks, String company_id, String vessel_id){
        this.person_inspect_id=person_inspect_id;
        this.id = id;
        this.person_id = person_id;
        this.comments = comments;
        this.checked_by_id = checked_by_id;
        this.app_by_id = app_by_id;
        this.date_checked = date_checked;
        this.date_app = date_app;
        this.checked_remarks = checked_remarks;
        this.app_remarks = app_remarks;
        this.company_id = company_id;
        this.vessel_id = vessel_id;
    }

    public PersonInspect(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPerson_inspect_id() {
        return person_inspect_id;
    }

    public void setPerson_inspect_id(String person_inspect_id) {
        this.person_inspect_id = person_inspect_id;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getChecked_by_id() {
        return checked_by_id;
    }

    public void setChecked_by_id(String checked_by_id) {
        this.checked_by_id = checked_by_id;
    }

    public String getApp_by_id() {
        return app_by_id;
    }

    public void setApp_by_id(String app_by_id) {
        this.app_by_id = app_by_id;
    }

    public String getDate_checked() {
        return date_checked;
    }

    public void setDate_checked(String date_checked) {
        this.date_checked = date_checked;
    }

    public String getDate_app() {
        return date_app;
    }

    public void setDate_app(String date_app) {
        this.date_app = date_app;
    }

    public String getChecked_remarks() {
        return checked_remarks;
    }

    public void setChecked_remarks(String checked_remarks) {
        this.checked_remarks = checked_remarks;
    }

    public String getApp_remarks() {
        return app_remarks;
    }

    public void setApp_remarks(String app_remarks) {
        this.app_remarks = app_remarks;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getVessel_id() {
        return vessel_id;
    }

    public void setVessel_id(String vessel_id) {
        this.vessel_id = vessel_id;
    }
}
