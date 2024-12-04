package kr.allcll.checkll.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RemainSeats {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String courseId;

    private String classId;

    private String courseName;

    private Integer remainCnt;

    private LocalDateTime createdAt;

    public RemainSeats(String courseId, String classId, String courseName, Integer remainCnt, LocalDateTime createdAt) {
        this.courseId = courseId;
        this.classId = classId;
        this.courseName = courseName;
        this.remainCnt = remainCnt;
        this.createdAt = createdAt;
    }
}
