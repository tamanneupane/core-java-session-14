package day2;

public class ChaseBankApplication {

    public static void main(String[] args) {


        Menu personal = new Menu();

//        personal.menuId = 1;
        personal.setMenuId(1);
//        personal.menuName = "Personal";
        personal.setMenuName("Personal");
//        personal.url = null;
        personal.setUrl("taman@squareflakes.com");
//        personal.isLeaf = false;
        personal.setLeaf(false);
//        personal.parentMenuId = 0;
        personal.setParentMenuId(0);
//        personal.slug = null;
        personal.setSlug(null);

        Menu personal1 = new Menu(1,"Persona", "taman@squareflakes.com", false,0,null);
        personal1.setMenuName("Personal");

//        Menu personalChecking = new Menu();
////        personalChecking.menuId = 2;
//        personalChecking.setMenuId(2);
//        personalChecking.menuName = "Checking";
//        personalChecking.url = null;
//        personalChecking.isLeaf = true;
//        personalChecking.parentMenuId = 1;
//        personalChecking.slug = "personal-checking";
//        System.out.println(personalChecking);

//        long mid = personal.menuId;
        long mid = personal.getMenuId();

    }
    
}
