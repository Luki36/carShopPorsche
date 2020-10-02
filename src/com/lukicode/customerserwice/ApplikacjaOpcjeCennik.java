package com.lukicode.customerserwice;

import com.lukicode.porschemodel.Spyder718;
import com.lukicode.porschemodels.*;

public class ApplikacjaOpcjeCennik {

    public static void main(String[] args) {
        ModelsCayenne modelsCayenne = new ModelsCayenne();
        System.out.println("\""+"########## Cayenne And Cayenne Coupe Models #########"+"\"");
        modelsCayenne.printCayenmodels();

        Model718 model718 = new Model718();
        model718.addModel718ToList(new Spyder718());
        System.out.println("\""+"####### 718 Models ########"+"\"");
        model718.print718Models();

        Models911 models911 = new Models911();
        System.out.println("\""+"####### 911 Models #######" + "\"");
        models911.printModels911();
    }

}
