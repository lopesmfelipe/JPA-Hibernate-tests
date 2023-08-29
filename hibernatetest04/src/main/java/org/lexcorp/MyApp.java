package org.lexcorp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyApp {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("thePu");
        entityManagerFactory.close();

    }
}