package com.example.demo;

import org.springframework.context.i18n.LocaleContextHolder;


@org.springframework.stereotype.Service
public class Service {

    public void getException() throws Exception{
        throw new Exception(Messages.getMessageForLocale("message.exception", LocaleContextHolder.getLocale()));
    }
}
