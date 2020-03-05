package Main;

import java.math.BigInteger;

import extendedEuclidAlgorithm.AES;
import extendedEuclidAlgorithm.ExtendedEuclidAlgorithm;
import extendedEuclidAlgorithm.FastModularExponentitation;
import extendedEuclidAlgorithm.FermatsLittleTheorem;

public class Main {
	public static void main(String[] args) {
		
		//BigInteger Number for examples
		BigInteger x = BigInteger.valueOf(11);
		BigInteger y = BigInteger.valueOf(5);
		BigInteger p = BigInteger.valueOf(19);
		
		System.out.println("Only Greatest Common Divisor : " + ExtendedEuclidAlgorithm.gcd(x, y));
		
		System.out.println("Extended Euclid Algorithm Example :" + ExtendedEuclidAlgorithm.gcdExtended(x, y));
		
		System.out.println("Multiplicative Inverse Example :" + ExtendedEuclidAlgorithm.multiplicativeInverse(x, y));
		
		System.out.println("Is Relatively Prime Example : " + ExtendedEuclidAlgorithm.isRelativelyPrime(x, y));
		
		System.out.println("Fermat's Little Theorem Example : " + FermatsLittleTheorem.isPrime(x));
		
		System.out.println("Fast Modular Exponentiation Example : " + FastModularExponentitation.fastModExp(x, y, p));
		
		
		final String secretKey = "merve";
	     
	    String originalString = "mervebozoglu";
	    String encryptedString = AES.encrypt(originalString, secretKey) ;
	    String decryptedString = AES.decrypt(encryptedString, secretKey) ;
	     
	    System.out.println("AES plain-text :" + originalString);
	    System.out.println("AES cipher-text :" + encryptedString);
	    System.out.println("AES decryption :" + decryptedString);
	}
}
