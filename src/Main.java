import java.io.*;

public class Main
{
	private static int[] a;
	private static int[] b;
	private static String input;


	public static void main(String[] s) throws Exception{
		try{
			FileInputStream fstream = new FileInputStream("teams");
			DataInputStream in = new DataInputStream(fstream);
			while (in.available() !=0){
				input = in.readLine();
			}
		in.close();
		} 
		catch (Exception e){
			System.err.println("File input error");
		}
	}
}