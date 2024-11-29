package kr.allcll.checkll.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/api/set-credential")
    public ResponseEntity<Void> setCredential(@RequestBody SetCredentialRequest request) {
        adminService.setUpInfo(request.credential());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/start-session")
    public ResponseEntity<Void> startSession() {
        adminService.setUpSession();
        return ResponseEntity.ok().build();
    }

    @GetMapping("api/end-session")
    public ResponseEntity<Void> endSession() {
            adminService.shutDownSession();
        return ResponseEntity.ok().build();
    }
}
