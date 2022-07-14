package ru.veselov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
	private List<String> songList = new ArrayList<>(Arrays.asList("Rfirst","Rsecond","Rthird"));

	@Override
	public String getSong() {
		Random random = new Random();
		int rand = random.nextInt(3);
		return songList.get(rand);
	}

}
