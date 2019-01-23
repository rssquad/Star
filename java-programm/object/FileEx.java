import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class FileEx
{
    public static void main(String[] args)
    {
        FileEx f = new FileEx();
        f.fileReadOp();
    }

    public void fileReadOp()
    {     File file;
          FileOutputStream fos = null;
        try{
                 file = new File("D:/myfile.txt");
	             fos = new FileOutputStream(file);
        }catch(IOException  ne)
        {
              System.out.println("ne blick ..");
        }
    }
}