package com.revature.repos.hibernate;

import com.revature.models.ReStatusDS;
import com.revature.repos.ReStatusRepoDS;
import com.revature.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ReStatusDSHibernate implements ReStatusRepoDS {
    @Override
    public ReStatusDS add(ReStatusDS reStatus) {
        // Let's use the Transaction Interface - gives us a little more granular control
        Session s = HibernateUtil.getSession();
        // I'm going to use a try catch finally to make sure that our transaction only commits to the database
        // so long as there are no exceptions thrown.
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            s.save(reStatus);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        } finally {
            s.close();
        }
        return reStatus;
    }

    @Override
    public ReStatusDS getById(Integer id) {
        // Get Session
        Session s = HibernateUtil.getSession();

        // Query the db
        ReStatusDS a = s.get(ReStatusDS.class, id);

        // Close our connection
        s.close();

        return a;
    }

    @Override
    public List<ReStatusDS> getAll() {

        // Let's use the Query Interface
        Session s = HibernateUtil.getSession();

        // Create a query object
        String query = "from direct"; // this is HQL (NOT native sql -> select * from authors
        Query<ReStatusDS> q = s.createQuery(query, ReStatusDS.class);

        List<ReStatusDS> authors = q.getResultList();

        s.close();

        return authors;

    }

    @Override
    public void update(ReStatusDS reStatus) {

        Transaction tx = null;
        try (Session s = HibernateUtil.getSession()) {
            tx = s.beginTransaction();
            s.update(reStatus);
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

