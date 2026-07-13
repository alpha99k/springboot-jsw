package net.likelion.bebc25.spring.lifecycle;

// 임시로 파일을 만들어서 파일에 로그를 출력
public class TempFileSupport {
    private String filePath; // 파일 경로

    public TempFileSupport(){
        System.out.println("생성자 호출됨." + filePath);
    }

    public void writeLog(String msg){
        System.out.println(filePath + "에 로그 저장: " + msg);
    }
}