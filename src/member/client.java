package member;
import dataStructure.Fault;
import dataStructure.Evaluation;
import dataStructure.Repairment;

import java.util.ArrayList;

public class client {
    public String telephone;
    public String wechat;
    public String name;
    //构造函数
    public client(String name, String telephone, String wechat){
            this.name = name;
            this.telephone = telephone;
            this.wechat = wechat;
    }
    public void report_fault(ArrayList<Fault> fault_list, String fault ){
        Fault newfault = new Fault(fault);
        fault_list.add(newfault);
    }
    public void evaluate(ArrayList<Evaluation> evaluation_list, int timeliness, int attitude, int satisfaction){
        int id = evaluation_list.size();
        Evaluation newEvaluation = new Evaluation(id, timeliness, attitude, satisfaction);
        evaluation_list.add(newEvaluation);
    }
    public void complain(ArrayList<Evaluation> complaint_list){
        //TODO
        //投诉后是否引起二次调度
    }
    //让调度员和工人填写情况说明
    public void send(){
        //TODO
        //？
    }
}
