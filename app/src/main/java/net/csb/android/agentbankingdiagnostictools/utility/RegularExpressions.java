package net.csb.android.agentbankingdiagnostictools.utility;

/**
 * Created by anis on 4/6/16.
 */

public class RegularExpressions {
    public static final String regexForWhiteSpaceAtFirst = "^\\s.*$"; //(true)Regex that checks white space as first letter
    public static final String regexForFirstLetterOnlyAlphabet = "^[a-zA-Z].*"; //(false)Regex that doesn't allow anything except alphabet as first letter
    public static final String regexForNoNumber = "^.[a-zA-Z\\D ]*$"; //(false)Regex that doesn't contain any number except first character
    public static final String regexForNoSpecialCharExceptDotDash = "^.[a-zA-Z\\.\\- ]*$"; //(false)Regex that doesn't allow any symbol except (.) and (-)
    public static final String regexForNoConsecutiveSingleCharMoreThanThree = "^(?!.*([A-Za-z])\\1{2}).*$"; //(false)Regex that doesn't allow consecutive repetition of single character more than three times
    //    public static final String regexForFirstLetterNotAlphabetInAnyWord = "/\\s[^a-zA-Z]/"; //Regex that doesn't allow anything except alphabet as first letter in any word, it allows (.) or (-) at end of word
    public static final String regexForTwoConsecutiveDuplicateWords = "\\b(\\w+)\\s+\\1\\b"; //(true)
    public static final String regexForName[][] = {
            {regexForWhiteSpaceAtFirst, "no white space at first", "true"},
            {regexForFirstLetterOnlyAlphabet, "first letter must be alphabet", "false"},
            {regexForNoNumber, "no digit", "false"},
            {regexForNoSpecialCharExceptDotDash, "no special character", "false"},
            {regexForNoConsecutiveSingleCharMoreThanThree, "no character of 3 sequence", "false"},
//            {regexForFirstLetterNotAlphabetInAnyWord, "regexForFirstLetterNotAlphabetInAnyWord"},
            {regexForTwoConsecutiveDuplicateWords, "regexForTwoConsecutiveDuplicateWords", "true"},
    };

}
