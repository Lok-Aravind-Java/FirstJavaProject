package com.apptrics.javabasics;

import java.util.regex.Pattern;

public class DNAStandard {

	public DNAStandard(String dna) {
		this.dna = dna;
	}

	// instance variables
	String dna;

	// Returns true if the DNA is valid, i.e, only contains the
	// letters, A,T,C,G (in uppercase) and at least one of these characters.
	public boolean isValidDNA() {
		return Pattern.matches("[ATCG]+", dna);
	}

	// Returns theWatson Crick complement, which is a string representing the
	// complementary DNA strand
	// (i.e., the other strand in the double helix). So swap all T�s with A�s,
	// all A�s with T�s, all C�s
	// with G�s and all G�s with C�s.
	public String complementWC() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < dna.length(); i++) {
			char a = dna.charAt(i);

			switch (a) {
			case 'A':
				sb.append("T");
				break;
			case 'T':
				sb.append("A");
				break;
			case 'C':
				sb.append("G");
				break;
			case 'G':
				sb.append("C");
				break;
			}
		}

		return sb.toString();
	}

	// Returns the Watson Crick Palindrome, which is the reversed sequence of
	// the complement.
	public String palindromeWC() {
		StringBuilder sb = new StringBuilder(complementWC());
		return sb.reverse().toString();
	}

	// Returns true if the DNA contains the subsequence seq.
	public boolean containsSequence(String seq) {
		return Pattern.matches("(.*)(" + seq + ")(.*)", dna);
	}

	// Returns the underlying DNA sequence string.
	public String toString() {
		return new String(dna);
	}
	
	
	
}
