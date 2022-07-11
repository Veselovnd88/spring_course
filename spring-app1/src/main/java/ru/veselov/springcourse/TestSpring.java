package ru.veselov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//внедрение через конструктор
//внедрение зависимости через сеттер - 
//в xml файле 
public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");//создается контекст
		Music music = context.getBean("musicBean",Music.class);//внедрение зависимости
		//объект создается не в классе, а передается, поэтому в xml constructor-arg не надо.
		//если бы создавался внутри класса - то передавали как параметр конструктора
		MusicPlayer mp = new MusicPlayer(music);
		mp.playMusic();
		
		context.close();
	}
}
