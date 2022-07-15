package ru.veselov.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//@Component
public class MusicPlayer {
	private List<Music> musicList = new ArrayList<>();
//	private Music music;//передан интерфейс Music для того чтобы
	private Music music1;
	private Music music2;
	private String name;
	private int volume;
	//реализовать inverison of control
	//IoC
	//	@Autowired
		public MusicPlayer(List<Music> list){
			this.musicList = list;
		}
	 
	public MusicPlayer() {}
	
	public String playMusic(Genre genre) {
		Random r = new Random();
			/*if (genre==Genre.CLASSICAL){
				return music2.getSong();
			}
			else if(genre == Genre.ROCK){
				return music1.getSong();
			}*/
		//System.out.println(musicList.get(r.nextInt(2)));
		return musicList.get(r.nextInt(2)).getSong();
	}
	
	/*@Autowired
	  public void setMusic(Music music) { this.music = music; }
*/

	public String getName() {
		return name;
	}
	//@Value("${musicPlayer.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getVolume() {
		return volume;
	}
	//@Value("${musicPlayer.volume}")
	public void setVolume(int volume) {
		this.volume = volume;
	}

	//public List<Music> getMusicList() {
		//return musicList;
	//}

	//public void setMusicList(List<Music> musicList) {
		//this.musicList = musicList;
	//}
}
