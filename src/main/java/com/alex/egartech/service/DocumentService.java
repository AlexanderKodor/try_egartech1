package com.alex.egartech.service;

import com.alex.egartech.entity.Document;



import java.util.List;

public interface DocumentService {
    public List<Document> getAllDocuments();

    public boolean saveDocument(Document document);

    public Document getDocument(int id);

    public void deleteDocument(int id);
}


