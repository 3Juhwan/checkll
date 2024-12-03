package kr.allcll.checkll.datasource;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Entity
@Table(name = "subjects")
@NoArgsConstructor
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "class", nullable = false, length = 10)
    private String classField;

    @Column(name = "class_cd", length = 10)
    private String classCd;

    @Column(name = "curi_class", length = 20)
    private String curiClass;

    @Column(name = "curi_nm")
    private String curiNm;

    @Column(name = "curi_no", length = 20)
    private String curiNo;

    @Column(name = "dept_cd", length = 10)
    private String deptCd;

    @Column(name = "dept_cd_nm")
    private String deptCdNm;

    @Column(name = "division", length = 50)
    private String division;

    @Column(name = "limit_out_rcnt")
    private Integer limitOutRcnt;

    @Column(name = "limit_tot_rcnt")
    private Integer limitTotRcnt;

    @ColumnDefault("'Y'")
    @Column(name = "netfunnel_yn")
    private String netfunnelYn;

    @Column(name = "orgn_clsf_cd", length = 10)
    private String orgnClsfCd;

    @Column(name = "orgn_clsf_cd_nm")
    private String orgnClsfCdNm;

    @Column(name = "out_rcnt")
    private String outRcnt;

    @Column(name = "remain_rcnt")
    private Integer remainRcnt;

    @Column(name = "self_code_div", length = 20)
    private String selfCodeDiv;

    @Column(name = "smt_cd", length = 10)
    private String smtCd;

    @Column(name = "smt_cd_nm", length = 50)
    private String smtCdNm;

    @Column(name = "student_year")
    private Integer studentYear;

    @Column(name = "tot_rcnt")
    private String totRcnt;

    @ColumnDefault("'Y'")
    @Column(name = "visable")
    private String visable;

    @Column(name = "year")
    private String year;

    public Subjects(String classField, String classCd, String curiClass, String curiNm, String curiNo, String deptCd,
        String deptCdNm, String division, Integer limitOutRcnt, Integer limitTotRcnt, String orgnClsfCd,
        String orgnClsfCdNm, String outRcnt, Integer remainRcnt, String selfCodeDiv, String smtCd, String smtCdNm,
        Integer studentYear, String totRcnt, String year) {
        this.classField = classField;
        this.classCd = classCd;
        this.curiClass = curiClass;
        this.curiNm = curiNm;
        this.curiNo = curiNo;
        this.deptCd = deptCd;
        this.deptCdNm = deptCdNm;
        this.division = division;
        this.limitOutRcnt = limitOutRcnt;
        this.limitTotRcnt = limitTotRcnt;
        this.orgnClsfCd = orgnClsfCd;
        this.orgnClsfCdNm = orgnClsfCdNm;
        this.outRcnt = outRcnt;
        this.remainRcnt = remainRcnt;
        this.selfCodeDiv = selfCodeDiv;
        this.smtCd = smtCd;
        this.smtCdNm = smtCdNm;
        this.studentYear = studentYear;
        this.totRcnt = totRcnt;
        this.year = year;
    }

    public String makeSubjectPayload() {
        return String.format("{\"dm_search\":{\"ORGN_CLSF_CD\":\"%s\",\"ORGN_CLSF_CD_NM\":\"%s\","
                + "\"YEAR\":\"%s\",\"SMT_CD\":\"%s\",\"SMT_CD_NM\":\"%s\","
                + "\"DEPT_CD\":\"%s\",\"DEPT_CD_NM\":\"%s\",\"CURI_NO\":\"%s\","
                + "\"CLASS\":\"%s\",\"CURI_CLASS\":\"%s\",\"CURI_NM\":\"%s\",\"CLASS_CD\":\"\","
                + "\"VISABLE\":\"%s\",\"LIMIT_TOT_RCNT\":%d,\"LIMIT_OUT_RCNT\":%d,\"TOT_RCNT\":\"\","
                + "\"OUT_RCNT\":\"\",\"STUDENT_YEAR\":%d,\"DIV\":\"%s\",\"SELF_CODE_DIV\":\"%s\","
                + "\"REMAIN_RCNT\":\"\",\"NETFUNNEL_YN\":\"%s\"}}", orgnClsfCd, orgnClsfCdNm, year, smtCd, smtCdNm, deptCd,
            deptCdNm, curiNo, classField, curiClass, curiNm, visable, limitTotRcnt, limitOutRcnt, studentYear, division,
            selfCodeDiv, netfunnelYn);
    }
}
