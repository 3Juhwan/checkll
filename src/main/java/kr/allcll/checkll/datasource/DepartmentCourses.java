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
public class DepartmentCourses {

    @JsonProperty("dl_main")
    private List<DlMain> dlMain;

    @JsonProperty("dl_sub")
    private List<Object> dlSub;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public static class DlMain {

        @JsonProperty("SMT_CD")
        private final String smtCd;

        @JsonProperty("CURI_DIV_CD")
        private final String curiDivCd;

        @JsonProperty("CURI_LANG_CD")
        private final String curiLangCd;

        @JsonProperty("INTENSIVE_YN")
        private final String intensiveYn;

        @JsonProperty("INTERNSHIP_TYPE_CD")
        private final String internshipTypeCd;

        @JsonProperty("DEPT_ALIAS")
        private final String deptAlias;

        @JsonProperty("E12_YN")
        private final String e12Yn;

        @JsonProperty("OUT_LIMIT_RCNT")
        private final Integer outLimitRcnt;

        @JsonProperty("CURI_TYPE_CD")
        private final String curiTypeCd;

        @JsonProperty("CLASS")
        private final String classCode;

        @JsonProperty("SEASON_CD")
        private final String seasonCd;

        @JsonProperty("CDT")
        private final Integer cdt;

        @JsonProperty("ENGLISH_YN")
        private final String englishYn;

        @JsonProperty("YEAR")
        private final String year;

        @JsonProperty("PLAN_REG_YN")
        private final String planRegYn;

        @JsonProperty("LEC_TIME")
        private final String lecTime;

        @JsonProperty("REMARK")
        private final String remark;

        @JsonProperty("TM_NUM")
        private final String tmNum;

        @JsonProperty("COLL_DIV_FOREIGNER_YN")
        private final String collDivForeignerYn;

        @JsonProperty("CURI_LANG_NM")
        private final String curiLangNm;

        @JsonProperty("CYBER_TYPE_NM")
        private final String cyberTypeNm;

        @JsonProperty("CURI_NO")
        private final String curiNo;

        @JsonProperty("STUDENT_YEAR")
        private final Integer studentYear;

        @JsonProperty("CURI_TYPE_CD_NM")
        private final String curiTypeCdNm;

        @JsonProperty("CURI_NM")
        private final String curiNm;

        @JsonProperty("E34_YN")
        private final String e34Yn;

        @JsonProperty("GDT_CURI_CD")
        private final String gdtCuriCd;

        @JsonProperty("TOT_LIMIT_RCNT")
        private final Integer totLimitRcnt;

        @JsonProperty("CURI_DIV_CD_NM")
        private final String curiDivCdNm;

        @JsonProperty("FROM_STUDENT_YEAR")
        private final Integer fromStudentYear;

        @JsonProperty("DAN_CD")
        private final String danCd;

        @JsonProperty("DEPT_CD")
        private final String deptCd;

        @JsonProperty("ORGN_CLSF_CD")
        private final String orgnClsfCd;

        @JsonProperty("TO_STUDENT_YEAR")
        private final Integer toStudentYear;

        @JsonProperty("COLL_DIV_LOCAL_YN")
        private final String collDivLocalYn;

        @JsonProperty("CYBER_TYPE_CD")
        private final String cyberTypeCd;

        @JsonProperty("CHAPEL_YN")
        private final String chapelYn;
    }
}
