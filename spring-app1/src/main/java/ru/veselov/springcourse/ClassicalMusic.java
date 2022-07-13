package ru.veselov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
	
	
	//private ClassicalMusic() {}
	
	@Override
	public String getSong() {
	
		return "Bogemian Rapsodia";
		}
	
	
	public void doMyInit() {
		System.out.println("Я создался");
	}
	public void doMyDestroy() {
		System.out.println("я уничтожился");
	}
	public static  ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
}
