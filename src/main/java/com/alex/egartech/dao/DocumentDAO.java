package com.alex.egartech.dao;

import com.alex.egartech.entity.Document;

import java.util.List;

public interface DocumentDAO {
    public List<Document> getAllDocuments();
    public void saveDocument(Document document);
    public Document getDocument(int id);
    public void deleteDocument(int id);

}
