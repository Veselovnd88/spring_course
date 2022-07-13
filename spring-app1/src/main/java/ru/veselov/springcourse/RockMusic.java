package ru.veselov.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music {

	@Override
	public String getSong() {
		
		return "Beyond to the Abyss";
	}

}
