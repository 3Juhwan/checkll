package kr.allcll.checkll.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PastGradeController {

    private final PastGradeService pastGradeService;

    public PastGradeController(PastGradeService pastGradeService) {
        this.pastGradeService = pastGradeService;
    }

    @GetMapping("/api/pastgrade")
    public ResponseEntity<PastGradeResponse> getPastGrade() {
        PastGradeResponse pastGradeResponse = pastGradeService.getPastGradeInfo();
        return ResponseEntity.ok().body(pastGradeResponse);
    }
}
