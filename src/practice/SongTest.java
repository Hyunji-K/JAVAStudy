package practice;

public class SongTest {

	public static void main(String[] args) {
		//객체 생성
		Song s1 = new Song("에잇", "아이유");
		Song s2 = new Song("마리아", "화사");
		Song s3 = new Song("암실", "이영지");
		
		//객체 배열
		Song[] songs = { s1, s2, s3};
		
		for(int i=0;  i< songs.length; i++) {
			System.out.println(songs[i].toStr());
		}
	}

}
 class Song{
	 String name;
	 String singer;
	 
	 Song(String n, String s){
		 name = n;
		 singer = s;
	 }
	 
	 String toStr() {
		 return String.format("Song { name: %s, singer: %s}", name, singer);
	 }
 }