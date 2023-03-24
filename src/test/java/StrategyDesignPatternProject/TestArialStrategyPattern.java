package StrategyDesignPatternProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArialStrategyPattern {

	@Test
	void testFormat() {
		TextFormatter formatter = new ArialTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		editor.publishText("Testing text in Arial formatter");
	}

}
