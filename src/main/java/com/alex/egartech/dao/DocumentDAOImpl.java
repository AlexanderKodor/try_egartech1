package com.alex.egartech.dao;

import com.alex.egartech.entity.Document;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DocumentDAOImpl implements DocumentDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Document> getAllDocuments() {
        Session session = sessionFactory.getCurrentSession();
//        Query<Document> query = session.createQuery("from Document", Document.class);
//        List<Document> documentList = query.getResultList();
        List<Document> documentList = session.createQuery("from Document", Document.class)
                .getResultList();
        return documentList;
    }

    @Override
    public boolean saveDocument(Document document) {
        Session session = sessionFactory.getCurrentSession();
        Query<Document> query = session.createQuery("from Document where number = :number and date = :date and department = :department and type = :type ", Document.class);
        query.setParameter("number", document.getNumber());
        query.setParameter("date", document.getDate());
        query.setParameter("department", document.getDepartment());
        query.setParameter("type", document.getType());

        List<Document> documentList = query.getResultList();
        if(!(documentList.size() >0)) {
            session.merge(document);
            return true;
        }
        else
            return false;
    }

    @Override
    public Document getDocument(int id) {
        Session session = sessionFactory.getCurrentSession();
        Document document = session.get(Document.class, id);
        return document;
    }

    @Override
    public void deleteDocument(int id) {
        Session session = sessionFactory.getCurrentSession();
        Document document = session.get(Document.class, id);
        session.remove(document);
    }
}
