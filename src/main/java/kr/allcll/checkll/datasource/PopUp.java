package kr.allcll.checkll.datasource;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class PopUp {

    @JsonProperty("dl_main")
    private List<DlMain> dlMain;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public static final class DlMain {

        @JsonProperty("SMT_CD")
        private final String smtCd;

        @JsonProperty("REMAIN_TOT_RCNT")
        private final Integer remainTotRcnt;

        @JsonProperty("TOT_LIMIT_RCNT_1")
        private final Integer totLimitRcnt1;

        @JsonProperty("OUT_LIMIT_RCNT")
        private final Integer outLimitRcnt;

        @JsonProperty("CLASS")
        private final String classCode;

        @JsonProperty("TOT_LIMIT_RCNT_4")
        private final Integer totLimitRcnt4;

        @JsonProperty("TOT_LIMIT_RCNT_3")
        private final Integer totLimitRcnt3;

        @JsonProperty("TOT_LIMIT_RCNT_2")
        private final Integer totLimitRcnt2;

        @JsonProperty("RCNT")
        private final Integer rcnt;

        @JsonProperty("YEAR")
        private final String year;

        @JsonProperty("OUT_LIMIT_RCNT_2")
        private final Integer outLimitRcnt2;

        @JsonProperty("OUT_LIMIT_RCNT_1")
        private final Integer outLimitRcnt1;

        @JsonProperty("TOT_RCNT")
        private final Integer totRcnt;

        @JsonProperty("STUDENT_DIV_NM")
        private final String studentDivNm;

        @JsonProperty("STUDENT_DEPT_CD_NM")
        private final String studentDeptCdNm;

        @JsonProperty("CURI_NO")
        private final String curiNo;

        @JsonProperty("OUT_LIMIT_RCNT_4")
        private final Integer outLimitRcnt4;

        @JsonProperty("OUT_LIMIT_RCNT_3")
        private final Integer outLimitRcnt3;

        @JsonProperty("TOT_LIMIT_RCNT")
        private final Integer totLimitRcnt;

        @JsonProperty("REMAIN_OTHER_RCNT")
        private final Integer remainOtherRcnt;

        @JsonProperty("TOT_OUT_RCNT")
        private final Integer totOutRcnt;

        @JsonProperty("REMAIN_OUT_RCNT")
        private final Integer remainOutRcnt;

        @JsonProperty("DEPT_CD")
        private final String deptCd;

        @JsonProperty("STUDENT_DEPT_CD")
        private final String studentDeptCd;

        @JsonProperty("ORGN_CLSF_CD")
        private final String orgnClsfCd;

        @JsonProperty("STUDENT_DIV")
        private final String studentDiv;
    }
}
