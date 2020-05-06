package se.cloudcharge.api2poc;

import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class GraphQLDataFetchers {

    public DataFetcher getChargepointByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String cpId = dataFetchingEnvironment.getArgument("id");
            return Database.chargepoints
                    .stream()
                    .filter(cp -> cp.get("id").equals(cpId))
                    .findFirst()
                    .orElse(null);
        };
    }

    public DataFetcher getConnectorDataFetcher() {
        return dataFetchingEnvironment -> {
            Map<String, String> chargepoint = dataFetchingEnvironment.getSource();
            String connectorId = chargepoint.get("connectorId");
            return Database.connectors
                    .stream()
                    .filter(connector -> connector.get("id").equals(connectorId))
                    .findFirst()
                    .orElse(null);
        };
    }

    public DataFetcher getSocketTypeDataFetcher() {
        return dataFetchingEnvironment -> {
            Map<String, String> connector = dataFetchingEnvironment.getSource();
            return connector.get("socketType");
        };
    }
}
