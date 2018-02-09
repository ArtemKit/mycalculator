import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
public class ByteReader {

	public static void main(String[] args) {
		FileInputStream myFile = null;
		BufferedInputStream buff =null;
		try {
		// Открытие байтового потока, указывающего на файл
		myFile = new FileInputStream("d:\\Photo.jpg");
		buff = new BufferedInputStream(myFile);
		while (true) {
			int byteValue = buff.read();
			System.out.print(byteValue+"");
			if (byteValue == -1){
			// достигнут конец файла нужно выйти из цикла
			break;
			}
			} // конец цикла while
			// myFile.close(); не помещайте этот вызов здесь
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
			try{
			buff.close();
			myFile.close();
			} catch (IOException e1){
			e1.printStackTrace();
			}
		
			}
		}
	}
		
	


