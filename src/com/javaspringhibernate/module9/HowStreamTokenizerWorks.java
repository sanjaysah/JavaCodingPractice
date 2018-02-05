package com.javaspringhibernate.module9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.StreamTokenizer;

public class HowStreamTokenizerWorks {

	public static void main(String[] args) {
		String text = "ABS IJJLKLKALKLKL 12989389819 :;;o0909 +_)";
		
		try{
			FileOutputStream fos = new FileOutputStream("D://A.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeUTF(text);
			oos.flush();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D://A.txt"));
			Reader r = new BufferedReader(new InputStreamReader(ois));
			StreamTokenizer st = new StreamTokenizer(r);
			
			boolean eof = false;
			do{
				int token = st.nextToken();
				switch (token) {
				case StreamTokenizer.TT_EOF:
					System.out.println("End of File Encountered");
					eof = true;
					break;
				case StreamTokenizer.TT_EOL:
					System.out.println("End of Line Encountered");
					break;
				case StreamTokenizer.TT_NUMBER:
					System.out.println("Number : "+st.nval);
					break;
				case StreamTokenizer.TT_WORD:
					System.out.println("WORD : "+st.sval);
					break;

				default:
					System.out.println((char)token+"encountered...");
					break;
				}
			}while(!eof);
			oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
