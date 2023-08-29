package org.oscorp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyApplication {
    public static void main(String[] args) {

        EntityManagerFactory myEmf = Persistence.createEntityManagerFactory("whatever-name");
        myEmf.close();

    }
}