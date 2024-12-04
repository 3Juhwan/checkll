package kr.allcll.checkll.api;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PopUpController {

    private final PopUpService popUpService;

    public PopUpController(PopUpService popUpService) {
        this.popUpService = popUpService;
    }

    @PostMapping("/api/popup")
    public ResponseEntity<List<PopUpResponse>> getCourseRegister() {
        List<PopUpResponse> allCourseRegister = popUpService.getAllCourseRegister();
        return ResponseEntity.ok().body(allCourseRegister);
    }
}
