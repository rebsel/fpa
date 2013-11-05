package de.bht.fpa.mail.s792118.model.appLogic;
import java.io.File;
import java.util.List;


/*
 * This is the leaf part of a composite pattern.
 * 
 * @author Rebecca Ritter
 */

public class FileElement extends Component {

    public FileElement(File path) {
        super(path);
    }

    @Override
    public boolean isExpandable() {
        return false;
    }
    
    
    
}
