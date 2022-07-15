package ru.veselov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//@Component
//@Scope("prototype")//указание типа создания бинов
public class ClassicalMusic implements Music{
	private List<String> songList = new ArrayList<>(Arrays.asList("Cfirst","Csecond","Cthird"));
	
	//private ClassicalMusic() {}
	
	@Override
	public String getSong() {
		Random random = new Random();
		int rand = random.nextInt(3);
		return songList.get(rand);
		}
	
	//@PostConstruct
	public void doMyInit() {
		System.out.println("Я создался");
	}
	//@PreDestroy
	public void doMyDestroy() {
		System.out.println("я уничтожился");
	}/*
	public static  ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
*/}
