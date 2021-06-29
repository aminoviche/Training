/**
 *
 */
package spring.chapter11;



/**
 * @author amine Fouzi <amine.fouzi>
 */


public class Knight {



    private Quest quest1;
    
    private String var1;

  


	public Knight() {
    }


    public Knight(Quest quest2) {
        this.quest1 = quest2;
    }

    public Knight(Quest quest2,String value) {
        this.quest1 = quest2;
        this.var1=value;
    }


    public void embarkOnQuest() {
        quest1.embark();
        System.out.println(var1);
    }

    public Quest getQuest1() {
        return quest1;
    }

    public void setQuest1(Quest quest1) {
        this.quest1 = quest1;
    }
    
    public String getVar1() {
  		return var1;
  	}


  	public void setVar1(String var1) {
  		this.var1 = var1;
  	}


}
