package ru.veselov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	@Override
	public String getSong() {
		
		return "Beyond to the Abyss";
	}

}
