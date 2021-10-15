package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="rstatus")
public class ReStatus {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "rlink")
    private Integer rlink;

    @Column(name = "direct_supervisor")
    private String direct_supervisor;

    @Column(name = "ds_approval")
    private boolean ds_approval;

    @Column(name = "ds_date")
    private String ds_date;

    @Column(name = "depart_head")
    private String depart_head;

    @Column(name = "dh_approval")
    private boolean dh_approval;

    @Column(name = "dh_date")
    private String dh_date;

    @Column(name = "benco")
    private String benco;

    @Column(name = "b_approval")
    private boolean b_approval;

    @Column(name = "b_date")
    private String b_date;


    public ReStatus(Integer rlink, String direct_supervisor, boolean ds_approval, String ds_date, String depart_head, boolean dh_approval, String dh_date, String benco, boolean b_approval, String b_date) {
        this.rlink = rlink;
        this.direct_supervisor = direct_supervisor;
        this.ds_approval = ds_approval;
        this.ds_date = ds_date;
        this.depart_head = depart_head;
        this.dh_approval = dh_approval;
        this.dh_date = dh_date;
        this.benco = benco;
        this.b_approval = b_approval;
        this.b_date = b_date;
    }

    public ReStatus() {
    }

    public Integer getRlink() {
        return rlink;
    }

    public void setRlink(Integer rlink) {
        this.rlink = rlink;
    }

    public String getDirect_supervisor() {
        return direct_supervisor;
    }

    public void setDirect_supervisor(String direct_supervisor) {
        this.direct_supervisor = direct_supervisor;
    }

    public boolean isDs_approval() {
        return ds_approval;
    }

    public void setDs_approval(boolean ds_approval) {
        this.ds_approval = ds_approval;
    }

    public String getDs_date() {
        return ds_date;
    }

    public void setDs_date(String ds_date) {
        this.ds_date = ds_date;
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
        return "ReStatus{" +
                "rlink=" + rlink +
                ", direct_supervisor='" + direct_supervisor + '\'' +
                ", ds_approval=" + ds_approval +
                ", ds_date='" + ds_date + '\'' +
                ", depart_head='" + depart_head + '\'' +
                ", dh_approval=" + dh_approval +
                ", dh_date='" + dh_date + '\'' +
                ", benco='" + benco + '\'' +
                ", b_approval=" + b_approval +
                ", b_date='" + b_date + '\'' +
                '}';
    }
}
