package com.revature.services;

import com.revature.models.Reimbursement;
import com.revature.repos.hibernate.ReinbursementHibernate;

import java.util.List;

public class ReimbursementServices {

    ReinbursementHibernate rein = new ReinbursementHibernate();

    public Reimbursement createRe(Reimbursement a) {
        return rein.add(a);
    }

    public Reimbursement searchReById(Integer id) {
        return rein.getById(id);
    }

    public List<Reimbursement> getAllRe() {
        return rein.getAll();
    }

    public void updateRe(Reimbursement a) {
        rein.update(a);
    }

    public void deleteRe(Integer id) {
        rein.delete(id);
    }
}
