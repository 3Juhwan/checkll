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
public class LensDepth {

    @JsonProperty("dl_openDeptCd")
    private List<DlOpenDeptCd> dlOpenDeptCd;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public static final class DlOpenDeptCd {

        @JsonProperty("ORGN_CLSF_CD")
        private final String orgnClsfCd;

        @JsonProperty("SCH_DEPT_ALIAS")
        private final String schDeptAlias;

        @JsonProperty("PRT_L_ORD")
        private final String prtLOrd;

        @JsonProperty("DEPT_L_CD")
        private final String deptLCd;

        @JsonProperty("DEPT_M_CD")
        private final String deptMCd;

        @JsonProperty("DEPT_LEVEL_CD")
        private final String deptLevelCd;

        @JsonProperty("PRT_COMBO_ORD")
        private final String prtComboOrd;

        @JsonProperty("DEPT_S_CD")
        private final String deptSCd;

        @JsonProperty("DEPT_CD")
        private final String deptCd;

        @JsonProperty("CLOSE_DT")
        private final String closeDt;
    }
}
