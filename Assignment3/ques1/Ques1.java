package Assignment3.ques1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ques1 {


	public static void main(String[] args) {

	
		try {
			FileReader fr1 = new FileReader("D:/Users/Dell/Downloads/login.jpeg");
			FileWriter fw1=new FileWriter("D:/Users/Dell/Downloads/login.jpeg");
			int i=0;
			while((i=fr1.read())!=-1) {
				fw1.write(i);
			}
			fr1.close();
			fw1.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}	
		System.out.println("file is written");
	}
}
