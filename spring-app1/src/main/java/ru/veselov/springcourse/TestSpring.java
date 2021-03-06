package ru.veselov.springcourse;
//урок 5
//dependency injection - создаются классы - будущие бины
//создаются зависимости с помощью спринг -аннотации, хml или код
//все объекты берутся из контейнера спринга

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//внедрение через конструктор
//внедрение зависимости через сеттер - 
//в xml файле 
public class TestSpring {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		//		"applicationContext.xml");//создается контекст
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		//Music music = context.getBean("musicBean",Music.class);//внедрение зависимости
		//объект создается не в классе, а передается, поэтому в xml constructor-arg не надо.
		//бин мьюзик внедряется вручную
		//MusicPlayer mp = new MusicPlayer(music);//внедрение вручную
		//спринг читает кэмел кейс и ищет сеттер с этим бином в проперти - и сам устанавливает этот бин в 
		//в сеттер
		//спринг создает музик плейер конструктором без аргументов, потом вызывает метод, который указан в нейм
		//и туда передает ссылку на бин
		//MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);//внедрение зависимости через
		//xml
		//System.out.println(musicPlayer.getMusicList());
		
		
		//musicPlayer.playMusic();
	//	System.out.println(musicPlayer.getName()+ "000"+ musicPlayer.getVolume());
	//	MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);//внедрение зависимости через
	//	System.out.println(musicPlayer == musicPlayer1);
		//musicPlayer.setVolume(100);
		//System.out.println(musicPlayer1.getVolume());
		
		/*Music rm = context.getBean("musicBean", Music.class);
		Music cm = context.getBean("classicalMusic", Music.class);
		System.out.println(rm.getSong());
		System.out.println(cm.getSong());
		*/
		/* создать список из 3 песен в рок мьюзик и классикал мбюзтк
		* в плеер внедрются два бина
		* енам с двумя жанрами, плей музик принимает енам, в зависимости от енама плеер должен играть рандомную песню*/


		Computer computer = context.getBean("computer", Computer.class);
		System.out.println(computer.toString());
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		System.out.println(musicPlayer.getName());
//		System.out.println(musicPlayer.getVolume());
		ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
		classicalMusic1.getSong();

		context.close();
	}
}
