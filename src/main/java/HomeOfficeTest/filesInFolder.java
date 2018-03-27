package HomeOfficeTest;

import org.apache.commons.io.FilenameUtils;
import java.io.File;
import java.io.IOException;

public class filesInFolder {

static File folder = new File("/Volumes/D Drive/Gdrive/jagsEvergreenPractice/src/main/resources");

    public static void main(String args[]){

        findFilesInfo(folder);

    }

   static void findFilesInfo(File folder){

      String[] numberOfFiles = folder.list();

      for(int i =0;i<numberOfFiles.length;i++){

          System.out.println("File Name:  "+numberOfFiles[i].toString());

          File fileInFolder = new File("/Volumes/D Drive/Gdrive/jagsEvergreenPractice/src/main/resources/"+numberOfFiles[i].toString());

          System.out.println("File Size:  "+fileInFolder.length());
          try {
              System.out.println("File Type:  "+fileInFolder.toURL().openConnection().getContentType());
          } catch (IOException e) {
              e.printStackTrace();
          }

          System.out.println("File Extension:  "+FilenameUtils.getExtension(fileInFolder.toString()));
      }


  }



}
