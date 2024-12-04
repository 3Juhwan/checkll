package kr.allcll.checkll.datasource;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PopUp {

    @JsonProperty("dl_main")
    private List<DlMain> dlMain;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static final class DlMain {

        @JsonProperty("SMT_CD")
        private String smtCd;

        @JsonProperty("REMAIN_TOT_RCNT")
        private Integer remainTotRcnt;

        @JsonProperty("TOT_LIMIT_RCNT_1")
        private Integer totLimitRcnt1;

        @JsonProperty("OUT_LIMIT_RCNT")
        private Integer outLimitRcnt;

        @JsonProperty("CLASS")
        private String classCode;

        @JsonProperty("TOT_LIMIT_RCNT_4")
        private Integer totLimitRcnt4;

        @JsonProperty("TOT_LIMIT_RCNT_3")
        private Integer totLimitRcnt3;

        @JsonProperty("TOT_LIMIT_RCNT_2")
        private Integer totLimitRcnt2;

        @JsonProperty("RCNT")
        private Integer rcnt;

        @JsonProperty("YEAR")
        private String year;

        @JsonProperty("OUT_LIMIT_RCNT_2")
        private Integer outLimitRcnt2;

        @JsonProperty("OUT_LIMIT_RCNT_1")
        private Integer outLimitRcnt1;

        @JsonProperty("TOT_RCNT")
        private Integer totRcnt;

        @JsonProperty("STUDENT_DIV_NM")
        private String studentDivNm;

        @JsonProperty("STUDENT_DEPT_CD_NM")
        private String studentDeptCdNm;

        @JsonProperty("CURI_NO")
        private String curiNo;

        @JsonProperty("OUT_LIMIT_RCNT_4")
        private Integer outLimitRcnt4;

        @JsonProperty("OUT_LIMIT_RCNT_3")
        private Integer outLimitRcnt3;

        @JsonProperty("TOT_LIMIT_RCNT")
        private Integer totLimitRcnt;

        @JsonProperty("REMAIN_OTHER_RCNT")
        private Integer remainOtherRcnt;

        @JsonProperty("TOT_OUT_RCNT")
        private Integer totOutRcnt;

        @JsonProperty("REMAIN_OUT_RCNT")
        private Integer remainOutRcnt;

        @JsonProperty("DEPT_CD")
        private String deptCd;

        @JsonProperty("STUDENT_DEPT_CD")
        private String studentDeptCd;

        @JsonProperty("ORGN_CLSF_CD")
        private String orgnClsfCd;

        @JsonProperty("STUDENT_DIV")
        private String studentDiv;
    }
}
