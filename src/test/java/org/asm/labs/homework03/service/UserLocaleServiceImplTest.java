package org.asm.labs.homework03.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserLocaleServiceImplTest {

    @Autowired
    UserLocaleService userLocaleService;

    @Test
    void getUserLocale() {
        assertEquals(userLocaleService.getUserLocale("en"), Locale.US);
        assertEquals(userLocaleService.getUserLocale("EN"), Locale.US);
        assertEquals(userLocaleService.getUserLocale("ru"), new Locale("ru", "RU"));
        assertEquals(userLocaleService.getUserLocale("RU"), new Locale("ru", "RU"));
        assertEquals(userLocaleService.getUserLocale("default"), Locale.getDefault());
    }
}