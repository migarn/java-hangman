package pl.edu.agh.hangman;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class HangmanTest {
    @Test
    public void testLetterCheckerDifferentCases() {
    	LetterChecker letterChecker = new LetterChecker("mama");
        Assert.assertTrue(letterChecker.checkLetter('A'));
    }
    
    @Test
    public void testLetterCheckerSameCases() {
    	LetterChecker letterChecker = new LetterChecker("mama");
        Assert.assertTrue(letterChecker.checkLetter('m'));
    }
    
    @Test
    public void testLetterCheckerFalse() {
    	LetterChecker letterChecker = new LetterChecker("mama");
        Assert.assertFalse(letterChecker.checkLetter('r'));
    }
    
    @Test
    public void testLetterCheckerIndices() {
    	LetterChecker letterChecker = new LetterChecker("mama");
    	ArrayList<Integer> indices = new ArrayList<Integer>();
    	indices.add(0);
    	indices.add(2);
        Assert.assertEquals(indices,letterChecker.foundLetterIndices('m'));
    }
}
