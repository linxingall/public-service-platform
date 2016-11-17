package com.ygjt.gdn.psp.controller.common.valid.handle;


import com.ygjt.gdn.psp.exception.ValidateException;

/**
 *
 */
public interface IValidateHandle {

    /**
     *
     * @param request
     * @param <T>
     * @throws ValidateException
     */
    <T> void validate(T request) throws ValidateException;
}
