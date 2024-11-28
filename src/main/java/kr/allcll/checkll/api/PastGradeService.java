package kr.allcll.checkll.api;

import java.time.LocalDateTime;
import java.util.List;
import kr.allcll.checkll.datasource.PastGrade.DlSummary;
import kr.allcll.checkll.datasource.PastGradeDataSource;
import kr.allcll.checkll.datasource.PastGradeInfo;
import org.springframework.stereotype.Service;

@Service
public class PastGradeService {

    private final PastGradeDataSource pastGradeDataSource;

    public PastGradeService(PastGradeDataSource pastGradeDataSource) {
        this.pastGradeDataSource = pastGradeDataSource;
    }

    public PastGradeResponse getPastGradeInfo() {
        PastGradeInfo pastGradeInfo = pastGradeDataSource.getPastGradeInfo();
        DlSummary dlSummary = getDlSummary(pastGradeInfo);
        String majorAvg = dlSummary.getMAJ_AVG_MRKS();
        String cultureAvg = dlSummary.getCUL_AVG_MRKS();
        String totalAvg = dlSummary.getAVG_MRKS();
        LocalDateTime accessAt = pastGradeInfo.getAccessAt();
        return new PastGradeResponse(majorAvg, totalAvg, cultureAvg, accessAt);
    }

    private DlSummary getDlSummary(PastGradeInfo pastGradeInfo) {
        List<DlSummary> dlSummaries = pastGradeInfo.getPastGrade().getDlSummary();
        if (dlSummaries.isEmpty()) {
            throw new IllegalArgumentException("dlSummary is empty");
        }
        return dlSummaries.getFirst();
    }
}
