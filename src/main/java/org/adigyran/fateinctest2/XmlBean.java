/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adigyran.fateinctest2;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.servlet.http.Part;
import javax.swing.text.Document;

/**
 *
 * @author adigyran
 */
//@Startup
//@Singleton
@ManagedBean
@ViewScoped
public class XmlBean implements Serializable{
  @PostConstruct
  private void init()
  {
      
        
        //context.
       // System.out.println(cDObjFacade.find(1));
  }
  private Part file;
  private String fileContent;
  private int userNumber;

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }
 
  public void upload() {
    try {
      fileContent = new Scanner(file.getInputStream()).useDelimiter("\\A").next();
        System.out.println("org.adigyran.fateinctest2.XmlBean.upload()");
        System.out.println(file.getSize());
        System.out.println(file.getName());
        System.out.println(fileContent);
    
    } catch (IOException e) {
      // Error handling
    }
  }
  public void save() throws Exception {
    try {
      fileContent = new Scanner(file.getInputStream()).useDelimiter("\\A").next();
        System.out.println("org.adigyran.fateinctest2.XmlBean.save()");
        System.out.println(file.getSize());
        System.out.println(file.getName());
        System.out.println(fileContent);
        Document XMLDocument = XMLparser.loadXMLFromString(fileContent);
        System.out.println(XMLDocument.getDefaultRootElement().getName());
    } catch (IOException e) {
      // Error handling
    }
  }
  
 
  public Part getFile() {
    return file;
  }
 
  public void setFile(Part file) {
    this.file = file;
  }
}
