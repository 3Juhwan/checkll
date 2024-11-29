package kr.allcll.checkll.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/api/setinfo")
    public ResponseEntity<Void> setUpInfo() {
        adminService.setUpInfoByString(""); //수동으로 넣나
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/start-session")
    public ResponseEntity<Void> startSession() {
        adminService.startInitialSession();
        return ResponseEntity.ok().build();
    }

    @GetMapping("api/end-session")
    public ResponseEntity<Void> endSession() {
        adminService.endUpSession();
        return ResponseEntity.ok().build();
    }
}
