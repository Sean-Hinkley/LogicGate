package logicRooms;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Deserialize {
	File dir;
	public File[] list;
	public Deserialize() {
		dir = new File("D:\\All\\LogicGates\\src\\savedrooms");
        list = dir.listFiles();
        for(int x = 0; x < list.length; x++) {
        	System.out.println("." + (x)  + ")" + list[x]);
        }
        
        
        
	}
	
	
	 public LogicRoom GetFile(String path) {
		  
	      LogicRoom temp = null;
	      
	      FileInputStream fileIn;
			try {
				fileIn = new FileInputStream(path);
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         temp = (LogicRoom) in.readObject();
		         in.close();
		         fileIn.close();
		      
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		  long serialVersionUID = ObjectStreamClass.lookup(temp.getClass()).getSerialVersionUID();
		  System.out.println("serialVersionUID: "+serialVersionUID);
		      
	      System.out.println("name: " + temp.name);
	      System.out.println("password: " + temp.password);

	      
	      
	      return null;
	      
	   }
	
	public File[] getFiles() {
		return list;
	}

    public static void showFiles(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getAbsolutePath());
                showFiles(file.listFiles()); // Calls same method again.
            } else {
                System.out.println("File: " + file.getAbsolutePath());
            }
        }
    }
   
   
   
   
}