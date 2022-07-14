package ru.veselov.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

//	private Music music;//передан интерфейс Music для того чтобы
	private Music music1;
	private Music music2;
	private String name;
	private int volume;
	//реализовать inverison of control
	//IoC
		@Autowired
		public MusicPlayer(@Qualifier("rockMusic") Music music1,
						   @Qualifier ("classicalMusic") Music music2) {
			this.music1 = music1;
			this.music2 = music2;}
	 
	public MusicPlayer() {}
	
	public String playMusic(Genre genre) {
			if (genre==Genre.CLASSICAL){
				return music2.getSong();
			}
			else if(genre == Genre.ROCK){
				return music1.getSong();
			}
	//	musicList.forEach(x-> System.out.println(x.getSong()));
		return null;
	}
	
	/*@Autowired
	  public void setMusic(Music music) { this.music = music; }
*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getVolume() {
		return volume;
	}
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
