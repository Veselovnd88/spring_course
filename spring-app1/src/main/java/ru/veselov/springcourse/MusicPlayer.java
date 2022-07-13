package ru.veselov.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MusicPlayer {
	private Music music;//передан интерфейс Music для того чтобы
	//private List<Music> musicList = new ArrayList<>();
	
	private String name;
	private int volume;
	//реализовать inverison of control
	//IoC
	@Autowired
	public MusicPlayer(Music music) { this.music = music; }
	 
	public MusicPlayer() {}
	
	public void playMusic() {
	//	musicList.forEach(x-> System.out.println(x.getSong()));
		music.getSong();
	}
	
	
	  public void setMusic(Music music) { this.music = music; }
	 
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
