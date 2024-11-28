package kr.allcll.checkll.api;

import java.time.LocalDateTime;

public class PastGradeResponse {

    private final String majorAvg;
    private final String totalAvg;
    private final String cultureAvg;
    private final LocalDateTime accessAt;

    public PastGradeResponse(String majorAvg, String totalAvg, String cultureAvg, LocalDateTime accessAt) {
        this.majorAvg = majorAvg;
        this.totalAvg = totalAvg;
        this.cultureAvg = cultureAvg;
        this.accessAt = accessAt;
    }
}
