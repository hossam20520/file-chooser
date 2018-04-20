/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechooser;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Hossam
 */
public class FileChooser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFileChooser fs = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = fs.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fs.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
		}
    }
    
}
