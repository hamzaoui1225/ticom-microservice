package com.ticom.service;

import com.ticom.models.order.TicomOrder;
import com.ticom.models.order.action.TicomActions;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ChangeContractStatusService {

    Map<String, Integer> actionList = new HashMap<>() {{
        put("change_contract_status_active", 2);
        put("change_contract_status_suspend", 3);
        put("change_contract_status_deactivate", 3);
    }};

    Boolean actionSelector(TicomActions action) {
        return actionList.containsKey(action.getActionCode().toLowerCase()) &&
                (
                        action.getActionProcessedStatus() == null ||
                        action.getActionProcessedStatus().equalsIgnoreCase("Processed")
                );
    }

    void checkForWorks(TicomOrder order) {
        var actions = order.getActions().stream().filter(this::actionSelector).toList();
        for (TicomActions action: actions) {
            // pending
            changeContractStatus(collectDataFromAction(action));
        }
    }

    private Object collectDataFromAction(TicomActions action) {
        String coIdPublic = action.getContractSpec().getCoCode();
        Integer status = actionList.get(action.getActionCode().toLowerCase());
        int retention = 3;
        int reason = 0;

        return null;
    }


    public void changeContractStatus(Object request) {

    }

}
