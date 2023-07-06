package com.itcast.mall.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL )
public class ServerResponse<T>{

    private int status;
    private String msg;
    private T data;

    private ServerResponse(int status){
        this.status=status;
    }

    private ServerResponse(int status,String msg){
        this.status=status;
        this.msg=msg;
    }

    private ServerResponse(int status,T data){
        this.status=status;
        this.data=data;
    }

    private ServerResponse(int status,String msg,T data){
        this.status=status;
        this.msg=msg;
        this.data=data;
    }

    public static ServerResponse createSuccess(){
        return new ServerResponse(ResponseCode.SUCCESS.getCode());
    }

    public static ServerResponse createSuccessMsg(String msg){
        return new ServerResponse(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> ServerResponse createSuccessData(String msg,T data){
        return new ServerResponse(ResponseCode.SUCCESS.getCode(),msg,data);
    }

    public static ServerResponse createError(){
        return new ServerResponse(ResponseCode.ERROR.getCode());
    }

    public static ServerResponse createErrorMsg(String msg){
        return new ServerResponse(ResponseCode.ERROR.getCode(),msg);
    }

    @JsonIgnore
    public boolean isSuccess(){
        return status==ResponseCode.SUCCESS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
