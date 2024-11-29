package kr.allcll.checkll.api;

import kr.allcll.checkll.datasource.PastGradeDataSource;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final PastGradeDataSource pastGradeDataSource;

    public AdminService(PastGradeDataSource pastGradeDataSource) {
        this.pastGradeDataSource = pastGradeDataSource;
    }

    public void setUpInfoByString(String credentialInfo) {
        pastGradeDataSource.setCredential(credentialInfo);
    }

    public void startInitialSession() {
        pastGradeDataSource.setUp();
    }

    public void endUpSession() {
        pastGradeDataSource.shutDown();
    }
}
