package kr.allcll.checkll.api;

public record PopUpResponse(
    String courseName,
    String department,
    Integer remainCnt
) {
}
