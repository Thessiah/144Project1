import java.security.*;
import java.io.*;

public class ComputeSHA {
	public static void main (String[] args) {
		FileInputStream in = new FileInputStream(args[1]);
		MessageDigest digest = new MessageDigest.getInstance("SHA-1");
		String hash; // dunno how it works, but put the hash in here.
		String data;

		while ((data = in.read()) != 1) {
			// Do the monster hash
		}

		System.out.println(hash);
	}
}
