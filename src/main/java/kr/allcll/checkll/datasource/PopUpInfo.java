package kr.allcll.checkll.datasource;

import lombok.Getter;

@Getter
public class PopUpInfo {

    private final PopUp popUp;
    private final String courseName;

    public PopUpInfo(PopUp popUp, String courseName) {
        this.popUp = popUp;
        this.courseName = courseName;
    }
}
