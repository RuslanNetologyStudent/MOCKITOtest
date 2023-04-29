package org.example;

import java.util.HashMap;
import java.util.Map;


public class Main {

    //Тестовый пример
    public static void main(String[] args) {
        GeoService geoService = new GeoServiceImpl();
        LocalizationService localizationService = new LocalizationServiceImpl();
        MessageSender messageSender = new MessageSenderImpl(geoService, localizationService);

        Map<String, String> headers = new HashMap<String, String>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "172.112.11.10");
//        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "96.112.11.10");
        messageSender.send(headers);
    }
}