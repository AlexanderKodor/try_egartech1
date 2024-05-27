package com.alex.egartech.dao;

import com.alex.egartech.entity.Document;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    public void saveDocument(Document document) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(document);
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
