package kr.allcll.checkll.datasource;

public interface PastGradeDataSource {

    PastGradeInfo getPastGradeInfo();

    void setCredential(String credential);

    void setUp();

    void shutDown();
}
