package com.sean.GitRank.exception;


import com.sean.GitRank.common.BaseResponse;
import com.sean.GitRank.common.ErrorCode;
import com.sean.GitRank.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice//SpringBoot的切面注解
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)//捕获异常的注解
    public BaseResponse businessException(BusinessException e) {
        log.error("businessException：" + e.getMessage(),e);
        return ResultUtils.error(e.getCode(),e.getMessage(),e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeException(BusinessException e) {
        log.error("RuntimeException",e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR,e.getMessage(),e.getDescription());
    }
}
