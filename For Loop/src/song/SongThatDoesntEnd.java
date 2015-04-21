//Paul Friederichsen
package song;

public class SongThatDoesntEnd {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) System.out.println("This is the song that doesn't end\nYes, it goes on and on my friend.\nSome people started singing it " + i + " times ago\nNot knowing what it was.\nAnd they'll continue singing it " + (100 - i) + " more times just because");
	}
}
