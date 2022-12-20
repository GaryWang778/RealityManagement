package member;

import dataStructure.Complaint;
import dataStructure.Evaluation;
import dataStructure.Fault;
import dataStructure.Repairment;
import member.worker;

import java.util.ArrayList;

public class yardman {
    public yardman(){
        System.out.println("new yardman created");
    }
    public void report_information(ArrayList<Repairment> repair_list){
        int temp = 0;
        for(Repairment i : repair_list){
            if(i.state == 1)
                System.out.println("Repairment id : " + i.id);
                System.out.println("Report time : " + i.report_time);
                System.out.println("fault type : " + i.fault_type);
                System.out.println("report person : " + i.report_person);
                System.out.println("report method : " + i.report_method + '\n');
                temp ++;
        }
        if (temp ==0)
            System.out.println("no current repairment information");
    }
    public void diapatch(ArrayList<Repairment> repair_list, ArrayList<worker> worker_list){
        int flag = 0;
        for(int i=0; i < repair_list.size(); i++){
            if (flag == 1)
                break;
            if (repair_list.get(i).state == 0)
                continue;
            for(worker j : worker_list){
                if (j.ability.contains(repair_list.get(i).fault_type) || j.state == 0)
                    repair_list.get(i).worker = j.id;
                    j.state = 1;
                    i.stete = 1;
                    flag = 1;
                    break;
                }
        }

    }
    // 如果有投诉进行情况说明
    public void explain(Complaint complaint){

    }

}
