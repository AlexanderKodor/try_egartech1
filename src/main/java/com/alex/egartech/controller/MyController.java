package com.alex.egartech.controller;

import com.alex.egartech.entity.Document;
import com.alex.egartech.entity.Employee;
import com.alex.egartech.service.DocumentService;
import com.alex.egartech.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DocumentService documentService;
//    @RequestMapping("/")
//    public String showAllEmployees(Model model){
//        List<Employee> allEmployees = employeeService.getAllEmployees();
//        model.addAttribute("allEmps", allEmployees);
//        return "all-employees";
//    }
    @RequestMapping("/")
    public String showAllDocuments(Model model){
        List<Document> allDocuments = documentService.getAllDocuments();
        model.addAttribute("allDocuments", allDocuments);
        return "all-documents";
    }
    @RequestMapping("/addNewDocument")
    public String addNewDocument(Model model){
        Document document = new Document();
        model.addAttribute("document", document);
        return "document-info";
    }
    @RequestMapping("/saveDocument")
    public String saveDocument(@ModelAttribute("document") Document document){
        documentService.saveDocument(document);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String updateDocument(@RequestParam("docId") int id
            , Model model){
        Document document = documentService.getDocument(id);
        model.addAttribute("document", document);
        return "document-info";
    }
    @RequestMapping("/deleteDocument")
    public String deleteDocument(@RequestParam("docId") int id
            , Model model){
        documentService.deleteDocument(id);
        return "redirect:/";
    }
}
