package se.cloudcharge.api2poc;

import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Database {

    static List<Map<String, String>> chargepoints = Arrays.asList(
            ImmutableMap.of("id", "laddare-1",
                    "name", "Närmast garaget",
                    "connectorId", "c-1"),
            ImmutableMap.of("id", "laddare-2",
                    "name", "Utanför",
                    "connectorId", "c-2")
    );

    static List<Map<String, String>> connectors = Arrays.asList(
            ImmutableMap.of("id", "c-1",
                    "socketType", "2-fas"),
            ImmutableMap.of("id", "c-2",
                    "socketType", "3-fas"),
            ImmutableMap.of("id", "c-3",
                    "socketType", "1-fas"),
            ImmutableMap.of("id", "c-4",
                    "socketType", "5-fas")
    );
}
