package com.sunyard.sb_mb_fm.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Model model,Exception e){
        model.addAttribute("errMsg",e.getMessage());
        return "/500";
    }

    @ModelAttribute
    public Map<String,Object>modelAttribute() throws UnknownHostException {
        Map<String, Object> map = new HashMap<>();
        InetAddress localHost = InetAddress.getLocalHost();
        map.put("baseUrl",localHost);
        return map;
    }

}
