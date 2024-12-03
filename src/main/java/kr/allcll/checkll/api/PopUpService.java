package kr.allcll.checkll.api;

import java.util.ArrayList;
import java.util.List;
import kr.allcll.checkll.datasource.PopUp;
import kr.allcll.checkll.datasource.PopUpDataSource;
import kr.allcll.checkll.datasource.PopUpInfo;
import org.springframework.stereotype.Service;

@Service
public class PopUpService {

    private final PopUpDataSource popUpDataSource;

    public PopUpService(PopUpDataSource popUpDataSource) {
        this.popUpDataSource = popUpDataSource;
    }

    public List<PopUpResponse> getAllCourseRegister() {
        List<PopUpInfo> allCourseRegisterInfo = popUpDataSource.getCoursePopUp();
        List<PopUpResponse> result = new ArrayList<>();
        for (PopUpInfo popUpInfo : allCourseRegisterInfo) {
            PopUp popUp = popUpInfo.getPopUp();
            Integer remainCnt = popUp.getDlMain().getFirst().getRemainTotRcnt();
            String department = popUp.getDlMain().getFirst().getStudentDeptCdNm();
            String courseName = popUpInfo.getCourseName();
            result.add(new PopUpResponse(courseName, department, remainCnt));
        }
        return result;
    }
}
