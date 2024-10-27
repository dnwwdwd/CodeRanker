package com.sean.GitRank.common;
/**
 * 工具类
 */
public class ResultUtils {

    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"ok");
    }




    /**
     * 失败
     * @param errorCode
     * @param message
     * @param description
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode,String message, String description){
        return new BaseResponse(errorCode.getCode(),null, message , description);
    }

    /**
     * 失败
     * @param errorCode
     * @param description
     * @return
     */
    public static  BaseResponse error(ErrorCode errorCode,String description){
        return new BaseResponse(errorCode.getCode(),null,"",description);
    }

    /**
     * 失败
     * @param code
     * @param message
     * @param description
     * @return
     */
    public static  BaseResponse error(int code,String message, String description){
        return new BaseResponse(code,null,message,description);
    }

    public static BaseResponse<Boolean> success(boolean result, String message) {
        return new BaseResponse(result,message);
    }
}
