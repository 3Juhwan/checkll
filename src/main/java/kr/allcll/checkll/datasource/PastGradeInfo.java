package kr.allcll.checkll.datasource;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class PastGradeInfo {

    private final PastGrade pastGrade;
    private final LocalDateTime accessAt;

    public PastGradeInfo(PastGrade pastGrade, LocalDateTime accessAt) {
        this.pastGrade = pastGrade;
        this.accessAt = accessAt;
    }
}
