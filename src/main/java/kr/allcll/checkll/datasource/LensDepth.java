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
public class LensDepth {

    @JsonProperty("dl_openDeptCd")
    private List<DlOpenDeptCd> dlOpenDeptCd;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static final class DlOpenDeptCd {

        @JsonProperty("ORGN_CLSF_CD")
        private String orgnClsfCd;

        @JsonProperty("SCH_DEPT_ALIAS")
        private String schDeptAlias;

        @JsonProperty("PRT_L_ORD")
        private String prtLOrd;

        @JsonProperty("DEPT_L_CD")
        private String deptLCd;

        @JsonProperty("DEPT_M_CD")
        private String deptMCd;

        @JsonProperty("DEPT_LEVEL_CD")
        private String deptLevelCd;

        @JsonProperty("PRT_COMBO_ORD")
        private String prtComboOrd;

        @JsonProperty("DEPT_S_CD")
        private String deptSCd;

        @JsonProperty("DEPT_CD")
        private String deptCd;

        @JsonProperty("CLOSE_DT")
        private String closeDt;
    }
}
