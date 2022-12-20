package dataStructure;
package member;

import dataStructure.Evaluation;
import dataStructure.Repairment;
import dataStructure.Complaint;
import dataStructure.Maintenance;
import java.util.Random;

import java.util.ArrayList;


public class worker {
    public int state;//是否空闲
    public int ability;//处理故障类别
    public int id;//员工编号
    private Random rand = new Random(47);
    private void generate_m(Maintenance maintenance, float start_time, float finished_time){
        maintenance.frequency++;
        maintenance.start_time.add(start_time);
        maintenance.start_time.add(finished_time);
        maintenance.cumulative_time += (finished_time - start_time);


    }
    //构造函数
    public worker(int state, int ability, int id){
        this.state = state;
        this.ability = ability;
        this.id = id;
    }

    // 如果有投诉进行情况说明
    public void explain(Complaint complaint, String explanation) {
        complaint.explanation(explanation);
    }

    //检查环境
    public boolean check_scene(Repairment repair, ArrayList<Repairment> repair_list) {
        //if(rand.nextBoolean()) {
        //}
        if (repair.fault_type == 4) {
            Repairment newrepair = repair;
            newrepair.id = 1 + repair_list.size();//
            newrepair.fault_type = 1;
            repair.state = 3;//(调度完成)
            repair_list.add(newrepair);
            return true;
        } else
            return false;

    }
    public void maintenance(Repairment repair, ArrayList<Maintenance> maintenances_list){
        float start_time = 0;
        float finished_time = start_time + 1;
        if (repair.state == 3){
            for (int i = 0; i < maintenances_list.size(); i++){
                if (maintenances_list[i].id == repair.id){
                    generate_m(maintenances_list[i]);
                }
            }


        }
        else{
            if (repair.fault_type <= 2){
                Maintenance maintenance = new Maintenance();
                maintenance.id = repair.id;
                generate_m(maintenance, start_time, finished_time);
                maintenances_list.add(maintenance);
                repair.state = 2;
            }
            else{
                Maintenance maintenance = new Maintenance();
                maintenance.id = repair.id;
                generate_m(maintenance, start_time, finished_time);
                maintenances_list.add(maintenance);
                repair.state = 3;
                //更改调度位置，还没写

            }
        }

    }
}


