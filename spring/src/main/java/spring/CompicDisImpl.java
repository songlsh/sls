package spring;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("compicDisImpl")
public class CompicDisImpl implements CompicDis {

    private CDPlayer cdPlayer;
    private List<String> cdList;

    public CompicDisImpl(CDPlayer cdPlayer,List<String> cdList) {
        this.cdPlayer = cdPlayer;
        this.cdList = cdList;
    }

    public CompicDisImpl() {
    }


    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public List<String> getCdList() {
        return cdList;
    }

    public void setCdList(List<String> cdList) {
        this.cdList = cdList;
    }

    public void listen(String msg) {
        for (String list: cdList) {

            System.out.println(cdPlayer+msg+list);
        }
    }
}
