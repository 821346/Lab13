import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PossessivePronouns implements Runnable{
	private String pnoun, file;
	public PossessivePronouns(String Xpnoun, String Xfile) {
		this.pnoun=Xpnoun;
		this.file=Xfile;
	}

	@Override
	public void run() {
		try {
			Path path = Paths.get(this.file);
			readFile(path);
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	private void readFile(Path Xpath) {
		int counter=0;
		try {
			String line;
			
			// You need to use a 'BufferedReader' to read a line from the 
			BufferedReader bRead = new BufferedReader(new FileReader("War_n_Peace.txt"));
			while(bRead.readLine()!=null) {
				String[] arrBook=bRead.toStringArray();
				for(int i=0; i<arrBook.length; i++) {
					if(arrBook[i].equals(this.pnoun){
						counter++;
					}
				}
				
				//how to convert a line into an array of Strings 
				//forLoop parse array 
				System.out.println(counter);
			}
			
			// 'War_n_Peace.txt' file.
			// While the readline() is not null, split the 'line' into an
			// array of strings and search for the 'this.pnoun' for a match.
			// When a match is found, increment the counter and after all 
			// lines are processed, print the counter for the particular
			// 'this.pnoun' from the file.(see output in instruction document)
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
