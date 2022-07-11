package ru.veselov.springcourse;
//урок 5
//dependency injection - создаются классы - будущие бины
//создаются зависимости с помощью спринг -аннотации, хml или код
//все объекты берутся из контейнера спринга

import org.springframework.context.support.ClassPathXmlApplicationContext;
//внедрение через конструктор
//внедрение зависимости через сеттер - 
//в xml файле 
public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");//создается контекст
		//Music music = context.getBean("musicBean",Music.class);//внедрение зависимости
		//объект создается не в классе, а передается, поэтому в xml constructor-arg не надо.
		//бин мьюзик внедряется вручную
		//MusicPlayer mp = new MusicPlayer(music);//внедрение вручную
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);//внедрение зависимости через
		//xml
		musicPlayer.playMusic();
		context.close();
	}
}
