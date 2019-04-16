package org.asm.labs.homework03.service;

import java.util.Locale;

public interface UserLocaleService {

    /**
     * Returns Users's Locale.
     * @param userLocale - Users's input locale choice
     * @return Users's Locale.
     */

    Locale getUserLocale(String userLocale);

}
