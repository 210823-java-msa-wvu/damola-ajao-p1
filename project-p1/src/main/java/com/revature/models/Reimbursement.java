package com.revature.models;

public class Reimbursement {
    private Integer remiburseid;
    private String date;
    private String time;
    private String location;
    private String descript;
    private String cost;
    private String grading_format;
    private String type_of_event;

    public Reimbursement(Integer remiburseid, String date, String time, String location, String descript, String cost, String grading_format, String type_of_event) {
        this.remiburseid = remiburseid;
        this.date = date;
        this.time = time;
        this.location = location;
        this.descript = descript;
        this.cost = cost;
        this.grading_format = grading_format;
        this.type_of_event = type_of_event;
    }

    public Integer getRemiburseid() {
        return remiburseid;
    }

    public void setRemiburseid(Integer remiburseid) {
        this.remiburseid = remiburseid;
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

    @Override
    public String toString() {
        return "Reimbursement{" +
                "remiburseid=" + remiburseid +
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
