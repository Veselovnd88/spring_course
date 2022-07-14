package ru.veselov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
	private List<String> songList = new ArrayList<>(Arrays.asList("Cfirst","Csecond","Cthird"));
	
	//private ClassicalMusic() {}
	
	@Override
	public String getSong() {
		int rand = (int) (Math.random()*3);
		return songList.get(rand);
		}
	
	/*
	public void doMyInit() {
		System.out.println("Я создался");
	}
	public void doMyDestroy() {
		System.out.println("я уничтожился");
	}
	public static  ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
*/}
