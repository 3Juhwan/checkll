package kr.allcll.checkll.api;

import kr.allcll.checkll.datasource.PastGradeDataSource;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final PastGradeDataSource pastGradeDataSource;

    public AdminService(PastGradeDataSource pastGradeDataSource) {
        this.pastGradeDataSource = pastGradeDataSource;
    }

    public void setUpCredential(String credential) {
        pastGradeDataSource.setCredential(credential);
    }

    public void setUpSession() {
        pastGradeDataSource.setUp();
    }

    public void shutDownSession() {
        pastGradeDataSource.shutDown();
    }
}
