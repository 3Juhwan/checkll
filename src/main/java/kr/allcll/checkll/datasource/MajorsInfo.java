package kr.allcll.checkll.datasource;

import java.util.NoSuchElementException;
import lombok.Getter;

@Getter
public class MajorsInfo {

    private static MajorsInfo instance;

    private final LensDepth lensDepth;

    public MajorsInfo(LensDepth lensDepth) {
        this.lensDepth = lensDepth;
    }

    public static MajorsInfo getInstance() {
        if (instance == null) {
            throw new NoSuchElementException("Past grade is not ready.");
        }
        return instance;
    }

    public static void update(MajorsInfo majorsInfo) {
        instance = majorsInfo;
    }

    public boolean isReset() {
        return lensDepth.getDlOpenDeptCd().isEmpty();
    }
}
