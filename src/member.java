/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author guest-VTUToQ
 */
public class member {
    private String nama,team;
    private int umur,suara,attitude,penampilan;
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setTeam(String team){
        this.team=team;
    }
    public String getTeam(){
        return team;
    }
    public void setUmur(int umur){
        this.umur=umur;
    }
    public int getUmur(){
        return umur;
    }
    public void setSuara(int suara){
        this.suara=suara;
    }
    public void setPenampilan(int penampilan){
        this.penampilan=penampilan;
    }
    public void setAttitude(int attitude){
        this.attitude=attitude;
    }
    public int nilai(){
        return (suara+penampilan+attitude)/3;
    }
   
}
