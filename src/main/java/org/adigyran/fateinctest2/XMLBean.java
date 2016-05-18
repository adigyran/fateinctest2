/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adigyran.fateinctest2;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.servlet.http.Part;

/**
 *
 * @author adigyran
 */
@Startup
@Singleton
public class XMLBean implements Serializable{
    @PostConstruct
    private void init()
    {
      
        
        //context.
       // System.out.println(cDObjFacade.find(1));
    }
    private Part file;
  private String fileContent;
 
  public void upload() {
    //try {
    ///  fileContent = new Scanner(file.getInputStream())
    //      .useDelimiter("\\A").next();
    //} catch (IOException e) {
      // Error handling
   // }
  }
 
  public Part getFile() {
    return file;
  }
 
  public void setFile(Part file) {
    this.file = file;
  }
}
