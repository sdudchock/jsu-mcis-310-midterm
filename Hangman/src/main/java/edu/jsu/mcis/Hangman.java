package edu.jsu.mcis;

import java.util.*;

public class Hangman {
    public enum Result { WIN, LOSE, NONE };
    private String word;
    private List<Character> usedLetters;
	private int i = 0;
	private int guessNumber = 0;
    
    public Hangman() {
        word = "";
        usedLetters = new ArrayList<Character>();
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public boolean available(char c) {
		if (i < word.length()){
			if (c == word.charAt(i)){
				i++;
				return true;
			}
			else{
				return false;
			}
		}
		else{
			i = 0;
			return false;
		}
    }
    
    public int guess(char c) {
		int hits = 0;
		usedLetters.add(c);
		for (i = 0;i < word.length(); i++){
			if(c == word.charAt(i)){
				hits++;
			}
		}
		guessNumber++;
		if (hits > 0){
			return hits;
		}
        else{
			return 0;
		}
    }
    
    public Result getResult() {
        return Result.NONE;
    }
    
}












