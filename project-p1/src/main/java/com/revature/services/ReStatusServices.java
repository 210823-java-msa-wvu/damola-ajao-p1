package com.revature.services;

import com.revature.models.ReStatusDS;
import com.revature.repos.hibernate.ReStatusDSHibernate;

import java.util.List;

public class ReStatusServices {


    ReStatusDSHibernate statusRepo = new ReStatusDSHibernate();

    public ReStatusDS createBook(ReStatusDS b) {
        return statusRepo.add(b);

    }

    public ReStatusDS searchById(Integer id) {
        return statusRepo.getById(id);
    }

    public List<ReStatusDS> getAllStats() {
        return statusRepo.getAll();
    }

    public void updateBook(ReStatusDS b) {

        // check to make sure book exists
        if (statusRepo.getById(b.getRlink()) != null) {
            statusRepo.update(b);
        } else {
            System.out.println("That status does not exist...");
        }

    }

    public void deleteBook(Integer id) {

        if (statusRepo.getById(id) != null)
            statusRepo.delete(id);
        else
            System.out.println("That status did not exist");
    }
}
