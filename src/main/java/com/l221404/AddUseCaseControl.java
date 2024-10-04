
package com.l221404;
public class AddUseCaseControl implements InputBoundary {
    //fields
    AddEntity addEntity = null;
    //AddUIConsoleOutput addUIConsoleOutput = null;
    private OutputBoundary addUIConsoleOutput = null;
    ResponseData responseData = null;
    AddUseCaseControl(){
        addEntity = new AddEntity();
        //addUIConsoleOutput = new AddUIConsoleOutput();
        responseData = new ResponseData();
    }

    //methods
    public void execute(RequestData requestData){
        //nhận 2 số
       if(this.isInteger(requestData.strNumber1) && 
        this.isInteger(requestData.strNumber2)){
            //họp lệ
        addEntity.setNumber1(Integer.parseInt(requestData.strNumber1));
        addEntity.setNumber2(Integer.parseInt(requestData.strNumber2));

       int ketQua =  this.addEntity.add();
            responseData.result = ketQua;

            addUIConsoleOutput.showResult(responseData);

        }else{
            //khong hợp lệ
            ResponseError error = new ResponseError();
            error.content = "KHONG_HOP_LE";
            //responseData.error = "KHONG_HOP_LE";
            //responseData.strNumber1 = requestData.strNumber1;
            //responseData.strNumber2 = requestData.strNumber2;
            addUIConsoleOutput.showError(error);

            
            //6
           // addUIConsoleOutput.output(responseData);
        }
        //thẩm định hợp lệ
        //hợp lệ - gửi meessage đến Entity
        //addEntity.add();
        //không hợp lệ
        
    }

    public boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str); // cố gắng chuyển chuỗi sang số nguyên
            return true; // nếu thành công thì chuỗi là số nguyên
        } catch (NumberFormatException e) {
            return false; // nếu có lỗi NumberFormatException thì không phải số nguyên
        }
    }

    public void setAddUIConsoleOutput(OutputBoundary addUIConsoleOutput) {
        this.addUIConsoleOutput = addUIConsoleOutput;
    }



}
