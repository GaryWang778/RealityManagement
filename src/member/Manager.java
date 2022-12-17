package member;

import dataStructure.Complaint;

public class Manager {
    /*
    TODO 情况说明收集完后，与客户沟通，并记录沟通内容
     */
    public void talk(Complaint complaint, String memcon){
        complaint.setMemcon(memcon);
    }
    /*
    TODO 关闭投诉请求
     */
    private void closeComplaint(Complaint complaint){
        complaint.setState(3);
    }


}
