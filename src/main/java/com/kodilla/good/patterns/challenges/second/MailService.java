package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.interfaces.InformationService;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Wysyłam powiadomienie o realizacji zamowienia do "+user.getName()+" "+user.getSurname()+".");
    }
}
