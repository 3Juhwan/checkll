package kr.allcll.checkll.api;

import java.time.LocalDateTime;

public record PastGradeResponse(
    String majorAvg,
    String totalAvg,
    String cultureAvg,
    LocalDateTime accessAt
) {

}
