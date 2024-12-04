package kr.allcll.checkll.api;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kr.allcll.checkll.datasource.PopUp;
import kr.allcll.checkll.datasource.PopUpDataSource;
import kr.allcll.checkll.datasource.PopUpInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PopUpService {

    private final RemainSeatsRepository remainSeatsRepository;

    private final PopUpDataSource popUpDataSource;

    public PopUpService(RemainSeatsRepository remainSeatsRepository, PopUpDataSource popUpDataSource) {
        this.remainSeatsRepository = remainSeatsRepository;
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

    @Scheduled(fixedDelay = 1000 * 10)
    public void saveRemainSeatsOfAllCourses() {
        List<PopUpInfo> allCourseRegisterInfo = popUpDataSource.getCoursePopUp();
        List<RemainSeats> remainSeats = new ArrayList<>();
        for (PopUpInfo popUpInfo : allCourseRegisterInfo) {
            PopUp popUp = popUpInfo.getPopUp();
            remainSeats.add(new RemainSeats(
                popUp.getDlMain().getFirst().getCuriNo(),
                popUp.getDlMain().getFirst().getClassCode(),
                popUp.getDlMain().getFirst().getDeptCd(),
                popUp.getDlMain().getFirst().getRemainTotRcnt(),
                LocalDateTime.now()
            ));
        }
        remainSeatsRepository.saveAll(remainSeats);
    }
}
