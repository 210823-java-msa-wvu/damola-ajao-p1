package com.revature.models;

import javax.persistence.*;


@Entity
@Table(name="benco")
public class ReStatusB {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "statusid")
        private Integer statusid;

        @Column(name = "rlink")
        private Integer rlink;

        @Column(name = "benco")
        private String benco;

        @Column(name = "b_approval")
        private boolean b_approval;

        @Column(name = "b_date")
        private String b_date;

    public ReStatusB() {
    }

    public ReStatusB(Integer statusid, Integer rlink, String benco, boolean b_approval, String b_date) {
        this.statusid = statusid;
        this.rlink = rlink;
        this.benco = benco;
        this.b_approval = b_approval;
        this.b_date = b_date;
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

    public String getBenco() {
        return benco;
    }

    public void setBenco(String benco) {
        this.benco = benco;
    }

    public boolean isB_approval() {
        return b_approval;
    }

    public void setB_approval(boolean b_approval) {
        this.b_approval = b_approval;
    }

    public String getB_date() {
        return b_date;
    }

    public void setB_date(String b_date) {
        this.b_date = b_date;
    }

    @Override
    public String toString() {
        return "ReStatusB{" +
                "statusid=" + statusid +
                ", rlink=" + rlink +
                ", benco='" + benco + '\'' +
                ", b_approval=" + b_approval +
                ", b_date='" + b_date + '\'' +
                '}';
    }
}
