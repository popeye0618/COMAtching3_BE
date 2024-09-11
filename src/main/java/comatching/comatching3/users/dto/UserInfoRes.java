package comatching.comatching3.users.dto;

import java.util.List;

import comatching.comatching3.users.enums.ContactFrequency;
import comatching.comatching3.users.enums.Gender;
import comatching.comatching3.users.enums.Hobby;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserInfoRes {
    private String username;
    private String major;
    private Integer age;
    private String song;
    private String mbti;
    private String contactId;
    private Integer point;
    private Integer pickMe;
    private Boolean canRequestCharge;
    private Long participations;
    private List<Hobby> hobbies;
    private ContactFrequency contactFrequency;
    private Gender gender;
    private String comment;
    private Integer admissionYear;
    private Boolean event1;
}
