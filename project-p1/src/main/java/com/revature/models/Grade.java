package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="grade")
public class Grade {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "entryid")
    private String entryid;

    @Column(name = "event_name")
    private String event_name;

    @Column(name = "event_grade")
    private String event_grade;

    @Column(name = "grade_scale")
    private String grade_scale;

    @Column(name = "rlink")
    private Integer rlink;

    public Grade(String entryid, String event_name, String event_grade, String grade_scale, Integer rlink) {
        this.entryid = entryid;
        this.event_name = event_name;
        this.event_grade = event_grade;
        this.grade_scale = grade_scale;
        this.rlink = rlink;
    }

    public String getEntryid() {
        return entryid;
    }

    public void setEntryid(String entryid) {
        this.entryid = entryid;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getEvent_grade() {
        return event_grade;
    }

    public void setEvent_grade(String event_grade) {
        this.event_grade = event_grade;
    }

    public String getGrade_scale() {
        return grade_scale;
    }

    public void setGrade_scale(String grade_scale) {
        this.grade_scale = grade_scale;
    }

    public Integer getRlink() {
        return rlink;
    }

    public void setRlink(Integer rlink) {
        this.rlink = rlink;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "entryid='" + entryid + '\'' +
                ", event_name='" + event_name + '\'' +
                ", event_grade='" + event_grade + '\'' +
                ", grade_scale='" + grade_scale + '\'' +
                ", rlink=" + rlink +
                '}';
    }
}
