package com.alex.egartech.service;

import com.alex.egartech.dao.DocumentDAO;

import com.alex.egartech.entity.Document;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentDAO documentDAO;

    @Override
    @Transactional
    public List<Document> getAllDocuments() {
        return documentDAO.getAllDocuments();
    }

    @Override
    @Transactional
    public void saveDocument(Document document) {
        documentDAO.saveDocument(document);
    }

    @Override
    @Transactional
    public Document getDocument(int id) {
        return documentDAO.getDocument(id);
    }

    @Override
    @Transactional
    public void deleteDocument(int id) {
        documentDAO.deleteDocument(id);
    }


}
