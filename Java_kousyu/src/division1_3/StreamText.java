package division1_3;

import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;



public class StreamText {
	public static void main(String[] args) throws Exception {
		String filename = "c:\\test.txt";
		FileReader fr = new FileReader(filename);
		fr.close();

		URL u = new URL("http://www.impressjapan.jp/");
		InputStream is = u.openStream();

		int i = is.read();
		while(i!=-1){
			char c = (char)i;
			System.out.print(c);
			i=is.read();
		}
	}

}
