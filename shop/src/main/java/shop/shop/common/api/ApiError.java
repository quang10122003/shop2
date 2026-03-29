package shop.shop.common.api;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import lombok.AccessLevel;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiError  extends RuntimeException {
        ErrorCode errorCode;

        public ApiError(ErrorCode errorCode) {
                super(errorCode.getMessage()); // đẩy thông báo lỗi của errcode vô custom exception qua hàm khởi tạo của
                                               // lớp // RuntimeException
                this.errorCode = errorCode;
        }

}