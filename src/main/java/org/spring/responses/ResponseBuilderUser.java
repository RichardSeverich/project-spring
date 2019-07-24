package org.spring.responses;

import org.spring.models.User;
import org.spring.services.users.HelperUser;
import org.springframework.http.HttpStatus;

/**
 * Response Builder.
 */
public final class ResponseBuilderUser {


    /**
     * Constructor.
     */
    private ResponseBuilderUser() {

    }

    /**
     * @return responses.
     */
    public static Response<User> getResponseOkForGet() {
        Response<User> response = ResponseManager.getResponseUser();
        response
                .setHttpStatus(HttpStatus.OK)
                .getBody()
                .setTextMessage(ResponseMessage.getSuccessfully(HelperUser.getEntity()))
                .setData(HelperUser.getList());
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<User> getResponseOkForPost() {
        Response<User> response = ResponseManager.getResponseUser();
        response
                .setHttpStatus(HttpStatus.CREATED)
                .getBody()
                .setTextMessage(ResponseMessage.createdSuccessfully(HelperUser.getEntity()))
                .setData(HelperUser.getList());
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<User> getResponseOkForPut() {
        Response<User> response = ResponseManager.getResponseUser();
        response
                .setHttpStatus(HttpStatus.OK)
                .getBody()
                .setTextMessage(ResponseMessage.updatedSuccessfully(HelperUser.getEntity()))
                .setData(HelperUser.getList());
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<User> getResponseOkForDelete() {
        Response<User> response = ResponseManager.getResponseUser();
        response
                .setHttpStatus(HttpStatus.OK)
                .getBody()
                .setTextMessage(ResponseMessage.deletedSuccessfully(HelperUser.getEntity()))
                .setData(null);
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<User> getResponseConflict() {
        Response<User> response = ResponseManager.getResponseUser();
        response
                .setHttpStatus(HttpStatus.CONFLICT)
                .getBody()
                .setTextMessage(ResponseMessage.entityAlreadyExist(HelperUser.getEntity()))
                .setData(HelperUser.getList());
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<User> getResponseNotFound() {
        Response<User> response = ResponseManager.getResponseUser();
        response
                .setHttpStatus(HttpStatus.NOT_FOUND)
                .getBody()
                .setTextMessage(ResponseMessage.getNotContent(HelperUser.getEntity()))
                .setData(null);
        return response;
    }
}