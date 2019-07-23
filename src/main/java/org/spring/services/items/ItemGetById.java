package org.spring.services.items;

import org.spring.models.Item;
import org.spring.services.StrategyResponse;
import org.spring.support.MessageManager;
import org.spring.support.Response;
import org.spring.support.ResponseManager;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Get by Id.
 */
public class ItemGetById implements StrategyResponse {

    /**
     * {@inheritDoc}
     */
    @Override
    public Response getResponse() {
        Response<Item> response = ResponseManager.getResponseItem();
        response
                .setHttpStatus(HttpStatus.NO_CONTENT)
                .getBody()
                .setTextMessage(MessageManager.getNotContent(HelperItemList.getEntity()))
                .setData(null);
        for (Item item : HelperItemList.getModelProjectList()) {
            if (item.getId().equals(HelperItem.getId())) {
                List<Item> newItemList = new ArrayList<>();
                newItemList.add(item);
                response
                        .setHttpStatus(HttpStatus.OK)
                        .getBody()
                        .setTextMessage(MessageManager.getSuccessfully(HelperItemList.getEntity()))
                        .setData(newItemList);
            }
        }
        return response;
    }
}