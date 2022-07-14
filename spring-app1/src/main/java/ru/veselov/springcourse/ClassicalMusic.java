package ru.veselov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
	private List<String> songList = new ArrayList<>(Arrays.asList("Cfirst","Csecond","Cthird"));
	
	//private ClassicalMusic() {}
	
	@Override
	public String getSong() {
		Random random = new Random();
		int rand = random.nextInt(3);
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
