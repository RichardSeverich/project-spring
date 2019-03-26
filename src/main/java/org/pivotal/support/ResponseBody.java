package org.pivotal.support;

import java.util.List;

public class ResponseBody<T> {

    private String message;
    private List<T> data;

    /**
     * Constructor.
     */
    public ResponseBody() {
    }

    /**
     * @param textMessage textMessage.
     */
    public ResponseBody<T> setTextMessage(final String textMessage) {
        this.message = textMessage;
        return this;
    }

    /**
     * @return textMessage.
     */
    public String getTextMessage() {
        return message;
    }

    /**
     * @return data.
     */
    public List<T> getData() {
        return data;
    }

    /**
     * @param data data.
     */
    public ResponseBody<T> setData(final List<T> data) {
        this.data = data;
        return this;
    }
}