package com.javaspringhibernate.module9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class HowStreamTokenizerWorks {
	//my second commit and push upsteam
	public static void main(String[] args) {
		String text = "ABS IJJLKLKALKLKL 1 29 893 8981 98765 987654 9876543 98765432 987654321 9876543210 :;; o0909 +_ 9olkjh)";
		
		try{
			/*FileOutputStream fos = new FileOutputStream("D://A.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeUTF(text);
			oos.flush();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D://A.txt"));*/
			//Reader r = new BufferedReader(new InputStreamReader(ois));
			Reader r = new StringReader("ABS IJJLKLKALKLKL 1 29 893 8981 98765 987654 9876543 98765432 987654321 9876543210 :;; o0909 +_ 9olkjh)");
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
			//oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
/*		//Reader reader = new StringReader("This is a test string for JCG Stream Tokenizer Example");
		Reader reader = new StringReader("ABS IJJLKLKALKLKL 1 29 893 8981 98765 987654 9876543 98765432 987654321 9876543210 :;; o0909 +_ 9olkjh)");
        StreamTokenizer tokenizer = new StreamTokenizer(reader);
        try {
        	int token = tokenizer.nextToken();
			while(token!=StreamTokenizer.TT_EOF){
			    if(tokenizer.ttype==StreamTokenizer.TT_WORD){
			    	System.out.println(tokenizer.sval);
			    	continue;
			    }
			    else if(tokenizer.ttype==StreamTokenizer.TT_NUMBER){
			    	System.out.println(tokenizer.nval);
			    	continue;
			    }
			    else{
			    	System.out.println((char)token+"encountered...");
			    	continue;
			    }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}

}
