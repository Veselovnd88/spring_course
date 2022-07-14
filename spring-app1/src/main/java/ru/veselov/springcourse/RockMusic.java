package ru.veselov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
	private List<String> songList = new ArrayList<>(Arrays.asList("Rfirst","Rsecond","Rthird"));

	@Override
	public String getSong() {
		int rand = (int) (Math.random()*3);
		return songList.get(rand);
	}

}
