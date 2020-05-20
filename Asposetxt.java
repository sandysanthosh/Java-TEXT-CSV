import java.io.PrintWriter;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

import aspose.pdf.*;

public class tt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter("F:\\starwalt\\ava aspose jars\\text.txt");
		StringBuilder csvcontact = new StringBuilder();

		csvcontact.append("so");
		csvcontact.append("bookname");
		csvcontact.append("category");
		csvcontact.append("\r\n");


		csvcontact.append("1");
		csvcontact.append("bookname 1");
		csvcontact.append("sandy");
		csvcontact.append("\r\n");


		csvcontact.append("2");
		csvcontact.append("bookname 2");
		csvcontact.append("sandy");
		csvcontact.append("\r\n");
		
		csvcontact.append("3");
		csvcontact.append("bookname 3");
		csvcontact.append("kumar");
		csvcontact.append("\r\n");

		pw.write(csvcontact.toString());
		pw.close();



        }

}
