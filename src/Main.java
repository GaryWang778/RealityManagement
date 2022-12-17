import dataStructure.Fault;
import dataStructure.Repairment;
import dataStructure.Maintenance;
import dataStructure.Evaluation;
import dataStructure.Complaint;
import member.Manager;
import member.worker;

import java.util.ArrayList;

public class Main {
//    public ArrayList<Fault> fault_list = new ArrayList<Fault>();
//    public ArrayList<Repairment> repair_list = new ArrayList<Repairment>();
//    public ArrayList<Evaluation> evaluation_list = new ArrayList<Evaluation>();
//    public ArrayList<Maintenance> maintenance_list = new ArrayList<Maintenance>();
    public static ArrayList<Complaint> complaint_list = new ArrayList<Complaint>();
//    public ArrayList<worker> work_list = new ArrayList<worker>();
    public static void main(String[] args) {
        // 用户提交投诉
        Complaint complaint = new Complaint(0, "dfsdssd");

        complaint_list.add(complaint);
        Manager manager = new Manager();
        manager.talk(complaint_list.get(0), "memcon did！");

        System.out.println(complaint_list.get(0).getMemcon());


    }
}