package ru.veselov.springcourse;

public class MusicPlayer {
	private Music music;//передан интерфейс Music для того чтобы 
	//реализовать inverison of control
	//IoC
	public MusicPlayer(Music music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println("Playing "+ music.getSong());
	}
}
