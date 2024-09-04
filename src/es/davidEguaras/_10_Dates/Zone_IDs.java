package es.davidEguaras._10_Dates;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Zone_IDs {
    public static void main(String[] args) {
        LocalDateTime nowInSydney = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("nowInSydney = " + nowInSydney);
        for(String zone : ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
            System.out.println(LocalDateTime.now(ZoneId.of(zone)));
        }
    }
}
