
package com.l221404;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleOutput implements OutputBoundary {
   private ResponseError errr = null;
    //fields
    //PrintWriter stdOut = null;

    // AddUIConsoleOutput(){
    //     stdOut = new 
    //     PrintWriter(new OutputStreamWriter(System.out));
    // }


    public void showResult(ResponseData responseData) {

        // stdOut.println("LOI TE LE");
        // stdOut.flush();
        // stdOut.println("ERROR: " + responseData.error +
        //  "" + responseData.strNumber1);
        //  stdOut.flush();
        
    }

    public void showError(ResponseError error){
        this.errr = error;
    }

    public ResponseError getErrr() {
        return errr;
    }
}
