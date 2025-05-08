package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        User user = new User("Sahil", "sahil@example.com");
        session.save(user);

        tx.commit();
        session.close();

        System.out.println("✅ User saved to database!");
    }
}
