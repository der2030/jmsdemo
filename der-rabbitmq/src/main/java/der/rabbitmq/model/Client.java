package der.rabbitmq.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
* @FileName:Client
* @Description:
* @Author: Derrick Ye
*/
public class Client implements Serializable {

    private String cname;
    private String caddress;
    private String cemail;
    private LocalDate registerdate;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public LocalDate getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(LocalDate registerdate) {
        this.registerdate = registerdate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cname='" + cname + '\'' +
                ", caddress='" + caddress + '\'' +
                ", cemail='" + cemail + '\'' +
                ", registerdate=" + registerdate +
                '}';
    }
}
