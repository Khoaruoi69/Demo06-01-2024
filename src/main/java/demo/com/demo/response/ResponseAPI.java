package demo.com.demo.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAPI {
    private int code;
    private Object data;
    private String message;

    public ResponseAPI(int errorCreateSkill, Objects ok, String ok1) {
    }
}
