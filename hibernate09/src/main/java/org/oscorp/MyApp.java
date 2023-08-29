package org.oscorp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyApp {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("name-of-the-persistence-unit");
        entityManagerFactory.close();
    }
}