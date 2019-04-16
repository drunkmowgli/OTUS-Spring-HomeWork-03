package org.asm.labs.homework03.service;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserLocaleServiceImplTest {

    @Test
    void getUserLocale() {
        UserLocaleService userLocaleService = new UserLocaleServiceImpl();
        assertEquals(userLocaleService.getUserLocale("en"), Locale.US);
        assertEquals(userLocaleService.getUserLocale("EN"), Locale.US);
        assertEquals(userLocaleService.getUserLocale("ru"), new Locale("ru", "RU"));
        assertEquals(userLocaleService.getUserLocale("RU"), new Locale("ru", "RU"));
        assertEquals(userLocaleService.getUserLocale("default"), Locale.getDefault());
    }
}