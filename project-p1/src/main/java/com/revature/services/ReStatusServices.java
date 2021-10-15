package com.revature.services;

import com.revature.models.ReStatus;
import com.revature.repos.hibernate.ReStatusHibernate;

import java.util.List;

public class ReStatusServices {


    ReStatusHibernate statusRepo = new ReStatusHibernate();

    public ReStatus createBook(ReStatus b) {
        return statusRepo.add(b);

    }

    public ReStatus searchById(Integer id) {
        return statusRepo.getById(id);
    }

    public List<ReStatus> getAllStats() {
        return statusRepo.getAll();
    }

    public void updateBook(ReStatus b) {

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
            System.out.println("That book did not exist");
    }
}
