package org.oscorp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Mainly {

    public static void main(String[] args) {

        EntityManagerFactory n = Persistence.createEntityManagerFactory("the-persistence-unit");
        n.close();
    }
}
