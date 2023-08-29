package org.oscorp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory theEmf = Persistence.createEntityManagerFactory("pu-name");

    }
}