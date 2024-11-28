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
public class PastGrade {

    @JsonProperty("dl_main")
    private List<DlMain> dlMain;

    @JsonProperty("dl_summary")
    private List<DlSummary> dlSummary;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public static final class DlMain {

        private final String SMT_CD;
        private final String RE_SMT_CD;
        private final String DEPT_CD_ALIAS;
        private final String OUT_ORGN_NM;
        private final String STUDENT_NO;
        private final String CURI_TYPE_CD;
        private final String CLASS;
        private final String DEPT_S_ALIAS;
        private final String SLT_DOMAIN_CD_NM;
        private final String CDT;
        private final Double EXAM2_SCO;
        private final String YEAR;
        private final String SLT_DOMAIN_CD;
        private final String DEPT_M_ALIAS;
        private final Double EXAM1_SCO;
        private final String DOMAIN_CD_NM;
        private final String ATTEND_YN;
        private final String GVUP_CURI_CD;
        private final Integer STUDENT_YEAR;
        private final String CURI_TYPE_CD_NM;
        private final String GDT_EXCEPT_CD;
        private final String RE_YEAR;
        private final String PREF_INFO;
        private final String ORGN_CLSF_CD_NM;
        private final String ORGN_CLSF_CD;
        private final String PREF_CURI_NO;
        private final String PREF_CURI_NM;
        private final String GVUP_CURI_CD_NM;
        private final String GRADE;
        private final String EMP_FINISH_YN;
        private final String OUT_RECORD_CD_NM;
        private final String GRADE_TYPE_CD;
        private final String GVUP_SMT_CD;
        private final String NM;
        private final String DOMAIN_CD;
        private final Integer ATTEND_SCO;
        private final String PREF_ORGN_CLSF_CD;
        private final String RE_INFO;
        private final String CURI_NO;
        private final String CURI_NM;
        private final String MRKS;
        private final String CURI_CLASS;
        private final String DEPT_CD;
        private final Double REPORT_SCO;
        private final String RE_CURI_NO;
        private final String RE_CURI_NM;
        private final String RE_ORGN_CLSF_CD;
        private final String GRADE_TYPE_CD_NM;
        private final String CURI_DEPT_CD;
        private final String SMT_CD_NM;
        private final String GRADE_VALID;
        private final String GDT_EXCEPT_CD_NM;
        private final Double SCO;
    }

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public static final class DlSummary {

        private final String EDU_TOT;
        private final String MAJ_BAS;
        private final String MAJ_CDT;
        private final String CUL_CDT;
        private final String MAJ_AVG_MRKS;
        private final String OUT_TOT;
        private final String REQ_CDT;
        private final String BOK_TOT;
        private final String ETC_TOT;
        private final Integer WARN_CNT;
        private final String AVG_MRKS;
        private final String CUL_AVG_MRKS;
        private final Double TOT_MRKS;
        private final String BOO_CDT;
        private final String APP_CDT;
        private final String MAJ_TOT;
        private final String MAJ_SEL;
        private final String CUL_TOT;
        private final Double SCO;
        private final String GRU_CDT;
    }
}
