

import java.util.ArrayList;
import java.util.Scanner;

public class AP {
 static ArrayList <member> fikri=new ArrayList <>();
    public static void main(String[] args) {
        member le=new member ();
        member la=new member();
       member lc=new member();
        fikri.add(le);
        fikri.add(la);
        fikri.add(lc);
        le.setNama("fikri");
        le.setTeam("lele");
        le.setUmur(19);
        le.setAttitude(40);
        le.setSuara(80);
        le.setPenampilan(70);
        
         la.setNama("fikr");
        la.setTeam("lel");
        la.setUmur(12);
        la.setAttitude(50);
        la.setSuara(90);
        la.setPenampilan(70);
        
         lc.setNama("ikri");
        lc.setTeam("ele");
        lc.setUmur(29);
        lc.setAttitude(20);
        lc.setSuara(90);
        lc.setPenampilan(70);
        
        display();
       
    }
     public static void display(){
         
         for(int i=0;i<fikri.size();i++){
        System.out.println("Nama:"+fikri.get(i).getNama()+"\nTeam:"+fikri.get(i).getTeam()+"\nUmur:"+fikri.get(i).getUmur()+"\nNilai:"+fikri.get(i).nilai());
         System.out.println();
		 }
    }

}
