package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Reimbursement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "reimburseid")
    private Integer reimburseid;

    @Column(name = "useridlink")
    private Integer useridlink;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "location")
    private String location;

    @Column(name = "descript")
    private String descript;

    @Column(name = "cost")
    private String cost;

    @Column(name = "grading_format")
    private String grading_format;

    @Column(name = "type_of_event")
    private String type_of_event;

    public Reimbursement() {
    }

    public Reimbursement(Integer reimburseid, Integer useridlink, String date, String time, String location, String descript, String cost, String grading_format, String type_of_event) {
        this.reimburseid = reimburseid;
        this.useridlink = useridlink;
        this.date = date;
        this.time = time;
        this.location = location;
        this.descript = descript;
        this.cost = cost;
        this.grading_format = grading_format;
        this.type_of_event = type_of_event;
    }

    public Integer getReimburseid() {
        return reimburseid;
    }

    public void setReimburseid(Integer reimburseid) {
        this.reimburseid = reimburseid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getGrading_format() {
        return grading_format;
    }

    public void setGrading_format(String grading_format) {
        this.grading_format = grading_format;
    }

    public String getType_of_event() {
        return type_of_event;
    }

    public void setType_of_event(String type_of_event) {
        this.type_of_event = type_of_event;
    }

    public Integer getUseridlink() {
        return useridlink;
    }

    public void setUseridlink(Integer useridlink) {
        this.useridlink = useridlink;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "reimburseid=" + reimburseid +
                ", useridlink=" + useridlink +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", descript='" + descript + '\'' +
                ", cost='" + cost + '\'' +
                ", grading_format='" + grading_format + '\'' +
                ", type_of_event='" + type_of_event + '\'' +
                '}';
    }
}
