package comatching.comatching3.users.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;

@Getter
public enum Hobby {
	운동(1, "운동"),
	스포츠시청(2, "스포츠시청"),
	요리(3, "요리"),
	맛집탐방(4, "맛집탐방"),
	예술관람(5, "예술관람"),
	음악감상(6, "음악감상"),
	악기(7, "악기"),
	사진(8, "사진"),
	테크(9, "테크"),
	창작(10, "창작"),
	야외활동(11, "야외활동"),
	여행(12, "여행"),
	ott시청(13, "ott시청"),
	게임(14, "게임"),
	독서(15, "독서"),
	UNSELECTED(-1, "UNSELECTED");

	private final Integer vector;
	private final String value;

	Hobby(Integer vector, String value) {
		this.vector = vector;
		this.value = value;
	}

 	@JsonCreator
	public static Hobby from(String value) {
		for (Hobby hobby : Hobby.values()) {
			if (hobby.getValue().equals(value)) {
				return hobby;
			}
		}
		return null;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public static String convertHobbiesString(List<Hobby> hobbies) {
		StringBuilder hobbiesString = new StringBuilder();

		for (int i = 0; i < hobbies.size(); i++) {
			hobbiesString.append(hobbies.get(i).getValue());
			if (i < hobbies.size() - 1) {
				hobbiesString.append(", ");
			}
		}

		return hobbiesString.toString();
	}
	public static List<Hobby> convertStringToHobbies(String hobbiesString) {
		List<Hobby> hobbiesList = new ArrayList<>();

		// 문자열을 콤마로 분리
		List<String> hobbyNames = Arrays.asList(hobbiesString.split(","));

		for (String hobbyName : hobbyNames) {
			Hobby hobby = Hobby.from(hobbyName);
			if (hobby != null) {
				hobbiesList.add(hobby);
			}
		}

		return hobbiesList;
	}

}
