package com.zubiri;

import java.lang.CharSequence;

public class Sequence implements CharSequence {

	private String word = "";

	public void setWord(String word) {
		this.word = word;
	}

	public String getWord() {
		return this.word;
	}

	@Override
	public int length() {

		return this.word.length();
	}

	@Override
	public char charAt(int index) {
		index = index - 1;
		return this.word.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		start = start - 1;
		return this.word.subSequence(start, end);
	}

}
