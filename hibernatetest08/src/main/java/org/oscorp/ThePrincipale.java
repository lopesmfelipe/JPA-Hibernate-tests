package org.oscorp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ThePrincipale {
    public static void main(String[] args) {

        EntityManagerFactory myEmf = Persistence.createEntityManagerFactory("someName");
        myEmf.close();

    }
}
