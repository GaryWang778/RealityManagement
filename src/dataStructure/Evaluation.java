package dataStructure;


public class Evaluation {
    int id; //报修编号
    int timeliness; //响应及时度
    int attitude;//服务态度
    int satisfaction;//满意度
//    Evaluation next;
    //构造函数
    public Evaluation(int id, int timeliness, int attitude, int satisfaction){
        this.id = id;
        this.timeliness = timeliness;
        this.attitude = attitude;
        this.satisfaction = satisfaction;
    }
}
