package com.ygjt.gdn.psp.controller.common;


import com.ygjt.gdn.psp.controller.common.model.Result;
import com.ygjt.gdn.psp.controller.common.model.ResultData;

/**
 * Created by linx on 16/10/23.
 */
public class ResultFactory {



    public static  <T> ResultData<T> createSuccessResultData(T data){

        return new ResultData<T>(Constants.RESULT_CODE_SUCCESS,Constants.RESULT_MESSAGE_SUCCESS,data);
    }




    public static  <T> ResultData<T> createWarmingResultData(T data){

        return new ResultData<T>(Constants.RESULT_CODE_SUCCESS,Constants.RESULT_MESSAGE_SUCCESS,data);
    }




    public static <T> ResultData<T> createWarmingResultData(String message , T data){

        return new ResultData<T>(Constants.RESULT_CODE_WARMING,message,data);
    }


    public static <T> ResultData<T> createFailResultData(String message , T data){

        return new ResultData<T>(Constants.RESULT_CODE_FAIL,message,data);
    }

    public static <T> ResultData<T> createFailResultData(String message){

        return new ResultData<T>(Constants.RESULT_CODE_FAIL,message,null);
    }

    public static <T> ResultData<T> createResultData(Result result, T object){

        return new ResultData<T>(result.getCode(),result.getMessage(),object);
    }




}
