//Import file class responsible for handling files
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html#%3Cinit%3E(java.lang.String)
import java.io.File;

//Import Exception class associated with file handling
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileNotFoundException.html
import java.io.FileNotFoundException;

//Import Exception class with reading / writing / creating files
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/IOException.html
import java.io.IOException;

//Import print writer utility class, providing simple interface to write lines of text to a file
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/PrintWriter.html
import java.io.PrintWriter;

//Import Scanner utility class, providing simple interface for reading and parsing input
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {

		boolean overwriteAllowed=false;
		boolean capital=false;
		
		for(String arg:args) {
			if(arg.equals("-f")){
				overwriteAllowed=true;
			}
			
			if(arg.equals("-capital")){
				capital=true;
			}
			
		}
		
		//Create a file object to read from
		File sourceFile= new File(args[0]);
		
		//Create a target file object to write to
		File targetFile = new File(args[1]);
		
		//Declare variable of type PrintWriter, will be used to write to target file
		PrintWriter writer = null;
		try {
			// Prevent overwriting
			if (!targetFile.exists()||overwriteAllowed)
				targetFile.createNewFile();
			else {
				System.out.println("File already exists, use -f option to force overwrite");
				System.exit(0);
			}

			// File reader
			Scanner reader = new Scanner(sourceFile);
			// File writer
			writer = new PrintWriter(targetFile);

			while (reader.hasNext()) {
				String line=reader.nextLine();
				if(capital) {
					writer.println(line.toUpperCase());
				}
				else {
					writer.println(line);
				}
				
			}
		} catch (FileNotFoundException fne) {
			System.out.println(fne.getMessage());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		finally {
			if(writer!=null)writer.close();
		}

	}
}