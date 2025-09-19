package com.example.demo.global.RsData;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// return data를 json형식으로 규칙을 맞추어 보내주는 역할 (RsData = ResultData)
// ex) 보고서 양식
@Getter
@Setter
@AllArgsConstructor
public class RsData<T> {
    // 성공 코드 200,400
    private String resultCode;
    // 게시물 다건 조회 성공
    private String msg;
    private T data;

    public static <T> RsData<T> of(String resultCode, String msg, T data) {
        return new RsData<>(resultCode, msg, data);
    }

    // data 필요없는경우 사용됨
    public static <T> RsData<T> of(String resultCode, String msg) {
        return new RsData<>(resultCode, msg, null);
    }

    // @JsonIgnore : json 형태를 출력할 때 특정 필드 출력되지 않게.
    // 양방향(무한루프?), 민감한 정보 등,,
    @JsonIgnore
    public boolean isSuccess() {
        return resultCode.startsWith("200");
    }

    @JsonIgnore
    public boolean isFail() {
        return !isSuccess();
    }
}
