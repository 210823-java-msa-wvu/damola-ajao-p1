package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="direct")
public class ReStatusDS {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "statusid")
    private Integer statusid;
    
    @Column(name = "rlink")
    private Integer rlink;

    @Column(name = "direct_supervisor")
    private String direct_supervisor;

    @Column(name = "ds_approval")
    private boolean ds_approval;

    @Column(name = "ds_date")
    private String ds_date;


    public ReStatusDS(Integer statusid, Integer rlink, String direct_supervisor, boolean ds_approval, String ds_date, String depart_head, boolean dh_approval, String dh_date, String benco, boolean b_approval, String b_date) {
        this.statusid = statusid;
        this.rlink = rlink;
        this.direct_supervisor = direct_supervisor;
        this.ds_approval = ds_approval;
        this.ds_date = ds_date;

    }

    public ReStatusDS() {
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



    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    @Override
    public String toString() {
        return "ReStatus{" +
                "statusid=" + statusid +
                ", rlink=" + rlink +
                ", direct_supervisor='" + direct_supervisor + '\'' +
                ", ds_approval=" + ds_approval +
                ", ds_date='" + ds_date + '\'' +
                '}';
    }
}
