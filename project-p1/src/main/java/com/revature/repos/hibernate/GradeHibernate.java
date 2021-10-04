package com.revature.repos.hibernate;

import com.revature.models.Grade;
import com.revature.repos.GradeRepo;
import com.revature.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class GradeHibernate implements GradeRepo {
    @Override
    public Grade add(Grade grade) {

        // Let's use the Transaction Interface - gives us a little more granular control
        Session s = HibernateUtil.getSession();
        // I'm going to use a try catch finally to make sure that our transaction only commits to the database
        // so long as there are no exceptions thrown.
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            s.save(grade);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        } finally {
            s.close();
        }
        return grade;
    }

    @Override
    public Grade getById(Integer id) {

        Session s = HibernateUtil.getSession();

        // Query the db
        Grade a = s.get(Grade.class, id);

        // Close our connection
        s.close();

        return a;
    }

    @Override
    public List<Grade> getAll() {

        // Let's use the Query Interface
        Session s = HibernateUtil.getSession();

        // Create a query object
        String query = "from grade"; // this is HQL (NOT native sql -> select * from authors
        Query<Grade> q = s.createQuery(query, Grade.class);

        List<Grade> grades = q.getResultList();

        s.close();

        return grades;
    }

    @Override
    public void update(Grade grade) {

        Transaction tx = null;
        try (Session s = HibernateUtil.getSession()) {
            tx = s.beginTransaction();
            s.update(grade);
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
