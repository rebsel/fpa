/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bht.fpa.mail.s792118.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 *
 * @author Rebecca
 */
public class SampleController  {
    
  //FXML Annotation sagt dem Loader der Application die Variable zu injizieren vor der initalisierung
  @FXML private TreeView<String> treeview;
 
  //die Initialize-Methode wird automatisch von dem FXMLLoader aufgerufen
  public void initialize() {
    configureTree(new String[] {"String 1", "String 2", "String 3"}); //hier dann ohne new String[] {}
  }  
 
  // Strings werden in den TreeView und weiter in die Application geladen
        //die 3 punkte: dieser variablentyp kann nun beliebig oft folgen-->varargs (neu seit java 5)es können beliebig viele (mind. 1) Objekte (in dem Falle Strings) übergeben werden
  public void configureTree(String[] rootItems) {   //analog ginge auch: (String... rootItems)
    TreeItem<String> root = new TreeItem<String>("Root Item");
    root.setExpanded(true);
    for (String itemString: rootItems) {
      root.getChildren().add(new TreeItem<String>(itemString));
    }
    treeview.setRoot(root);
  }
}    

