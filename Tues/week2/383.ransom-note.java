public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
	char[] ransom = ransomNote.toCharArray();
	char[] mag = magazine.toCharArray();
	int[] map = new int[256];

	for(char ch: mag) {
	    map[ch - 'a']++;
	}

	for(char ch: ransom) {
	    if (--map[ch - 'a'] < 0) {
		return false;
	    }
	}

	return true;
    }
}
