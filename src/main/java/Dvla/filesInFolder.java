package Dvla;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import static org.apache.commons.lang3.BooleanUtils.or;

public class filesInFolder {

static File folder = new File(System.getProperty("user.dir") + "/src/main/resources/filesinfolder/");

    public static void main(String args[]) throws IOException {

        findFilesInfo(folder);

    }

   public static String findFilesInfo(File folder) throws IOException {

        String value=null;

      String[] numberOfFiles = folder.list();

      for(int i =0;i<numberOfFiles.length;i++){

          System.out.println("File Name:  "+numberOfFiles[i].toString());

          File fileInFolder = new File(System.getProperty("user.dir") + "/src/main/resources/filesinfolder/"+numberOfFiles[i].toString());

          System.out.println("File Size:  "+ numberOfFiles[i].toString().length());
          try {
              System.out.println("File Type:  "+fileInFolder.toURL().openConnection().getContentType());
          } catch (IOException e) {
              e.printStackTrace();
          }

          System.out.println("File Extension:  "+FilenameUtils.getExtension(fileInFolder.toString()));

         if(FilenameUtils.getExtension(fileInFolder.toString()).equalsIgnoreCase( "csv" ) || FilenameUtils.getExtension(fileInFolder.toString()).equalsIgnoreCase( "xlsx" ) ){

             System.out.println("found valid files");
            value = readFileContent(System.getProperty("user.dir") + "/src/main/resources/filesinfolder/"+numberOfFiles[i]);


         }
      }
       return value;
  }

    static String readFileContent(String currentfile ) throws IOException {
        String value=null;
       System.out.println("Pukaaa     :    " + currentfile);
      File myFile = new File(currentfile );
      FileInputStream fis = new FileInputStream( myFile );

      // Finds the workbook instance for XLSX file
      XSSFWorkbook myWorkBook = new XSSFWorkbook( fis );

      // Return first sheet from the XLSX workbook
      XSSFSheet mySheet = myWorkBook.getSheetAt( 0 );

      // Get iterator to all the rows in current sheet
      Iterator<Row> rowIterator = mySheet.iterator();

      // Traversing over each row of XLSX file
      while (rowIterator.hasNext()) {
          Row row = rowIterator.next();

          // For each row, iterate through each columns
          Iterator<Cell> cellIterator = row.cellIterator();
          while (cellIterator.hasNext()) {

              Cell cell = cellIterator.next();

                value = cell.getStringCellValue();
              System.out.print("getStringCellValue  : " + cell.getStringCellValue() + "\t" );

//              switch (cell.getCellType()) {
//                  case Cell.CELL_TYPE_STRING:
//                      System.out.print("getStringCellValue  : " + cell.getStringCellValue() + "\t" );
//                      break;
//                  case Cell.CELL_TYPE_NUMERIC:
//                      System.out.print("getNumericCellValue : " +cell.getNumericCellValue() + "\t" );
//                      break;
//                  case Cell.CELL_TYPE_BOOLEAN:
//                      System.out.print( "getBooleanCellValue:  " + cell.getBooleanCellValue() + "\t" );
//                      break;
//                  default:
//
//              }
          }

      }


        return value;
    }




}
