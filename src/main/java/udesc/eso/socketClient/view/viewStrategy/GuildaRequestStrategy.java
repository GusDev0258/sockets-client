package udesc.eso.socketClient.view.viewStrategy;

import java.util.Arrays;
import java.util.Map;

public class GuildaRequestStrategy implements RequestStrategyProtocol {
    @Override
    public String buildRequest(String operation, Map<String, String> attributes) {
        StringBuilder builder = new StringBuilder(operation);
        builder.append(";").append("Guilda");
        if(Arrays.asList("Get", "Delete").contains(operation)) {
            builder.append(";nome=").append(attributes.get("nome"));
        } else if (Arrays.asList("AddMember", "GetMember", "DeleteMember").contains(operation)) {
            builder.append(";nome=").append(attributes.get("nome")).append(";cpf=").append(attributes.get("cpf"));
        } else {
            builder.append(";nome=").append(attributes.get("nome"))
                    .append(";cidade=").append(attributes.get("cidade"))
                    .append(";fundos=").append(attributes.get("fundos"));
        }
        return builder.toString();
    }
}
