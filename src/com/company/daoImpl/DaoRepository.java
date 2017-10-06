package com.company.daoImpl;

import com.company.dao.Dao;
import com.company.model.Accountant;
import com.company.model.Menager;
import com.company.model.Worker;

import java.util.ArrayList;
import java.util.List;

public class DaoRepository implements Dao {
    public List<Worker> listWorker = new ArrayList<>();
    public List<Accountant> listAccountant = new ArrayList<>();
    public List<Menager> listMenager = new ArrayList<>();

    @Override
    public void addWorker(Worker worker) {
        listWorker.add(worker);
        System.out.println(listWorker.toString());
    }

    @Override
    public void addAccountant(Accountant accountant) {
        listAccountant.add(accountant);
        System.out.println(listAccountant.toString());
    }

    @Override
    public void addMenager(Menager menager) {
        listMenager.add(menager);
        System.out.println(listMenager.toString());
    }

    @Override
    public void searchByName(String name) {
        for (Worker worker : listWorker) {
            if (worker.getMenagerName().equals(name)) {
                System.out.println(worker);
            } else {
                System.out.println("This manager has no employees");
            }
        }
    }
}
