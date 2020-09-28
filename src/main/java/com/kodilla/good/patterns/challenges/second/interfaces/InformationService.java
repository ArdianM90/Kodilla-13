package com.kodilla.good.patterns.challenges.second.interfaces;

import com.kodilla.good.patterns.challenges.second.User;

public interface InformationService {
    void inform(User user);
    //enum (mail, sms, ...)
    //interfejs contactData zamiast User - w zaleznosci od tego wysylam sms, mail....
}
