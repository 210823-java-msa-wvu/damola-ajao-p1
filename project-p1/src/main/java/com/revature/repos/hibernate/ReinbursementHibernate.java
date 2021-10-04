package com.revature.repos.hibernate;

import com.revature.models.Reimbursement;
import com.revature.repos.ReimbursementRepo;
import com.revature.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ReinbursementHibernate implements ReimbursementRepo {
    @Override
    public Reimbursement add(Reimbursement reimbursement) {

        // Let's use the Transaction Interface - gives us a little more granular control
        Session s = HibernateUtil.getSession();
        // I'm going to use a try catch finally to make sure that our transaction only commits to the database
        // so long as there are no exceptions thrown.
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            s.save(reimbursement);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        } finally {
            s.close();
        }
        return reimbursement;
    }

    @Override
    public Reimbursement getById(Integer id) {

        Session s = HibernateUtil.getSession();

        // Query the db
        Reimbursement a = s.get(Reimbursement.class, id);

        // Close our connection
        s.close();

        return a;
    }

    @Override
    public List<Reimbursement> getAll() {

        // Let's use the Query Interface
        Session s = HibernateUtil.getSession();

        // Create a query object
        String query = "from reimbursement"; // this is HQL (NOT native sql -> select * from authors
        Query<Reimbursement> q = s.createQuery(query, Reimbursement.class);

        List<Reimbursement> reins = q.getResultList();

        s.close();

        return reins;
    }

    @Override
    public void update(Reimbursement reimbursement) {

        Transaction tx = null;
        try (Session s = HibernateUtil.getSession()) {
            tx = s.beginTransaction();
            s.update(reimbursement);
            tx.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        }
    }

    @Override
    public void delete(Integer id) {

        Transaction tx = null;

        try (Session s = HibernateUtil.getSession()) {
            tx = s.beginTransaction();
            s.delete(id);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        }
    }
}
