package com.l221404;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestErrorSum {


    @Test
    public void testError() {
        RequestData req = new RequestData();
        req.strNumber1 = "2";
        req.strNumber2 = "a";
        ResponseError error = null;
        AddUIConsoleOutput output = new AddUIConsoleOutput();

        //InputBoundary inputBoundary = new AddUseCaseControl();
        AddUseCaseControl addUseCaseControl = new AddUseCaseControl();
        addUseCaseControl.setAddUIConsoleOutput(output);

        addUseCaseControl.execute(req);
        
        error = output.getErrr();

        assertEquals("KHONG_HOP_LE", error.content);



        
        
    }

}
