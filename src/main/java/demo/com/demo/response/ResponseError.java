package demo.com.demo.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseError {
    private int code; // code: 0005 ---> FE: Loi nguoi dung nhap sai ( thieu field , sai field, .....)
    private Object error;
}
