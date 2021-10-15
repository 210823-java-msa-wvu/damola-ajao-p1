package com.revature.models;

import javax.persistence.*;


@Entity
@Table(name="depart")
public class ReStatusDH {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "statusid")
        private Integer statusid;

        @Column(name = "rlink")
        private Integer rlink;

        @Column(name = "depart_head")
        private String depart_head;

        @Column(name = "dh_approval")
        private boolean dh_approval;

        @Column(name = "dh_date")
        private String dh_date;

    public ReStatusDH(Integer statusid, Integer rlink, String depart_head, boolean dh_approval, String dh_date) {
        this.statusid = statusid;
        this.rlink = rlink;
        this.depart_head = depart_head;
        this.dh_approval = dh_approval;
        this.dh_date = dh_date;
    }

    public ReStatusDH() {

    }

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public Integer getRlink() {
        return rlink;
    }

    public void setRlink(Integer rlink) {
        this.rlink = rlink;
    }

    public String getDepart_head() {
        return depart_head;
    }

    public void setDepart_head(String depart_head) {
        this.depart_head = depart_head;
    }

    public boolean isDh_approval() {
        return dh_approval;
    }

    public void setDh_approval(boolean dh_approval) {
        this.dh_approval = dh_approval;
    }

    public String getDh_date() {
        return dh_date;
    }

    public void setDh_date(String dh_date) {
        this.dh_date = dh_date;
    }

    @Override
    public String toString() {
        return "ReStatusDH{" +
                "statusid=" + statusid +
                ", rlink=" + rlink +
                ", depart_head='" + depart_head + '\'' +
                ", dh_approval=" + dh_approval +
                ", dh_date='" + dh_date + '\'' +
                '}';
    }
}
