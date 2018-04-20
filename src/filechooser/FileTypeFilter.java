/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechooser;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Hossam
 */
public class FileTypeFilter  extends FileFilter{
  private final String extension;
  private final String description;
  public FileTypeFilter(String extension, String  description ){
      this.extension = extension;
      this.description =description; 
  }
    @Override
    public boolean accept(File f) {
         //To change body of generated methods, choose Tools | Templates.
         if(f.isDirectory()){
             return true;
         }
         return f.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
       //To change body of generated methods, choose Tools | Templates.
       
       
       return description + String.format("  (*%s)",extension);
    }
    
}
