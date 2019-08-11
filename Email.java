package com.nucleus.spellchecker;

public class Email implements SpellChecker {
	private SpellChecker spellchecker;
	private String name;

	
	
	public SpellChecker getSpellchecker() {
		return spellchecker;
	}




	public String getName() {
		return name;
	}





	public Email(SpellChecker spellchecker, String name) {
		
		this.spellchecker = spellchecker;
		this.name = name;
	}




	@Override
	public void spellchecker() {
	
		System.out.println("Spelling Checked");
		
	}

	
	
}
