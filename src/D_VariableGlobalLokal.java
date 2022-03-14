public class D_VariableGlobalLokal {

    static int varGlobal = 34;

    public static void main(String[] args){
        varGlobal = 25;
        System.out.println("varGlobal diakses di method dengan nilai = " + varGlobal);
        double varLokal = 3.14;
        System.out.println("varLokal hanya bisa diakses di method main dengan nilai = " + varLokal);
        aksesVariableLokal();
        }

    public static void aksesVariableLokal(){
        System.out.println("varGlobal bisa diakses di method aksesVariableLokal dengan nilai =" + varGlobal);
        //varLokal = 2.5;
        System.out.println("varLokal tidak bisa diakses di method aksesVariableLokal ini");
    }
}
