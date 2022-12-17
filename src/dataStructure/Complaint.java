package dataStructure;


import java.util.ArrayList;
import java.util.List;

public class Complaint {
    int state;//投诉状态  0 未处理，1 情况说明未完整，2 处理中，3 已完成
    String complaint; //投诉内容
    List<String> explanation; //情况说明
    String memcon; //谈话记录
    //构造函数
    public Complaint(int state, String complaint) {
        this.state = state;
        this.complaint = complaint;
        this.explanation = new ArrayList<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public List<String> getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation.add(explanation);
    }

    public String getMemcon() {
        return memcon;
    }

    public void setMemcon(String memcon) {
        this.memcon = memcon;
    }
}
