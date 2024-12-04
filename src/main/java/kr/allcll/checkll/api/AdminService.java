package kr.allcll.checkll.api;

import kr.allcll.checkll.datasource.DepartmentCourseDataSource;
import kr.allcll.checkll.datasource.LensDepthDataSource;
import kr.allcll.checkll.datasource.PastGradeDataSource;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final PastGradeDataSource pastGradeDataSource;
    private final LensDepthDataSource lensDepthDataSource;
    private final DepartmentCourseDataSource departmentCourseDataSource;

    public AdminService(PastGradeDataSource pastGradeDataSource, LensDepthDataSource lensDepthDataSource,
        DepartmentCourseDataSource departmentCourseDataSource) {
        this.pastGradeDataSource = pastGradeDataSource;
        this.lensDepthDataSource = lensDepthDataSource;
        this.departmentCourseDataSource = departmentCourseDataSource;
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

    public void doLensDepth() {
        lensDepthDataSource.getLensDepthInfo();
    }

    public void getDepartmentSubjects() {
        departmentCourseDataSource.getDepartmentCourse();
    }
}
