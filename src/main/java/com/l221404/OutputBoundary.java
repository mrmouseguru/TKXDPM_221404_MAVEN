package com.l221404;

public interface OutputBoundary {

    void showError(ResponseError error);
    void showResult(ResponseData responseData);

}
