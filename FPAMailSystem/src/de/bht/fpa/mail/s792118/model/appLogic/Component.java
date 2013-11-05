/*
 * This is the component part of a composite pattern.
 * */
package de.bht.fpa.mail.s792118.model.appLogic;
import java.io.File;
import java.util.List;
/**
 *
 * @author Rebecca Ritter aufbauend auf der Vorlage von Frau Prof.Simone Strippgen
 */

public abstract class Component {
    // absolute directory path to this component
    private String path;
    // name of the component (without path)
    private String name;

    public Component(File path) {
        this.path = path.getAbsolutePath();
        this.name = path.getName();
    }
    
    public void addComponent(Component comp) {
        throw new UnsupportedOperationException("Not supported."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Component> getComponents() {
        throw new UnsupportedOperationException("Not supported."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // @return is the component expandable
    public abstract boolean isExpandable();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String p) {
        path = p;
    }

    public String getPath() {
        return path;
    }

    public String toString() {
        return name;
    }
    
    public void print (String prefix) {
        System.out.println(prefix + "|");
        System.out.println(prefix + "--");
        System.out.println(name);
    }
    
}
