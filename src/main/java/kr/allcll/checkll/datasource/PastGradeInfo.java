package kr.allcll.checkll.datasource;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import lombok.Getter;

@Getter
public class PastGradeInfo {

    private static PastGradeInfo instance;

    private final PastGrade pastGrade;
    private final LocalDateTime accessAt;

    public PastGradeInfo(PastGrade pastGrade, LocalDateTime accessAt) {
        this.pastGrade = pastGrade;
        this.accessAt = accessAt;
    }

    public static PastGradeInfo getInstance() {
        if (instance == null) {
            throw new NoSuchElementException("Past grade is not ready.");
        }
        return instance;
    }

    public static void update(PastGradeInfo pastGradeInfo) {
        instance = pastGradeInfo;
    }
}
