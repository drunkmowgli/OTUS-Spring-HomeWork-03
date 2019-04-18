package org.asm.labs.homework03.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class UserLocaleServiceImpl implements UserLocaleService {

    public Locale getUserLocale(String userLocale) {

        Locale locale;
        switch (userLocale.toLowerCase()) {
            case "en":
                locale = Locale.US;
                break;
            case "ru":
                locale = new Locale("ru", "RU");
                break;
            default:
                locale = Locale.getDefault();
        }
        return locale;

    }
}
