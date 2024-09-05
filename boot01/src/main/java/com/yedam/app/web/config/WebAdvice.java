package com.yedam.app.web.config;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class WebAdvice {
    // 에외처리
					// SQLException
    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<String> invokeError(IllegalAccessException e){
        return new ResponseEntity<>("Error Message", HttpStatus.BAD_REQUEST);
    }
    // 공통된 변수 선언
    @ModelAttribute("contextPath")
    public String contextPath
        (HttpServletRequest request) {
        return request.getContextPath();
    }
    
}