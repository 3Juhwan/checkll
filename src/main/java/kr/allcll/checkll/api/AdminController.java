package kr.allcll.checkll.api;

import kr.allcll.checkll.client.Credential;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/api/set-credential")
    public ResponseEntity<Void> setCredential(@RequestBody SetCredentialRequest request) {
        adminService.setUpCredential(Credential.getCredential(request));
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/start-session")
    public ResponseEntity<Void> startSession() {
        adminService.setUpSession();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/end-session")
    public ResponseEntity<Void> endSession() {
        adminService.shutDownSession();
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/lensdepth")
    public ResponseEntity<Void> lensDepth() {
        adminService.doLensDepth();
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/get-subjects")
    public ResponseEntity<Void> getSubjects() {
        adminService.getDepartmentSubjects();
        return ResponseEntity.ok().build();
    }
}
