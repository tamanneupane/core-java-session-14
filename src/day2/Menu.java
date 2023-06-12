package day2;

public class Menu {

    private long menuId;
    private String menuName;
    private String url;
    private boolean isLeaf;
    private long parentMenuId;
    private String slug;

    // Default Constructor
    public Menu() {
    }

    // Parameterized Constructor
    public Menu(long menuId, String menuName, String url, boolean isLeaf, long parentMenuId, String slug){
        this.menuId = menuId;
        this.menuName = menuName;
        this.url = url;
        this.isLeaf = isLeaf;
        this.parentMenuId = parentMenuId;
        this.slug = slug;
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        // Some extra logic can be added to check the url is valid or not
        this.url = url;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public long getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(long parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public static void main(String[] args) {

        Menu personal = new Menu();
        personal.menuId = 1;
        personal.menuName = "Personal";
        personal.url = null;
        personal.isLeaf = false;
        personal.parentMenuId = 0;
        personal.slug = null;
        System.out.println(personal);


        Menu personalChecking = new Menu();
        personalChecking.menuId = 2;
        personalChecking.menuName = "Checking";
        personalChecking.url = null;
        personalChecking.isLeaf = true;
        personalChecking.parentMenuId = 1;
        personalChecking.slug = "personal-checking";
        System.out.println(personalChecking);


        String name = personalChecking.menuName;
        System.out.println(name);

    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", isLeaf=" + isLeaf +
                ", parentMenuId=" + parentMenuId +
                ", slug='" + slug + '\'' +
                '}';
    }

    /*

    Menu Id
    Menu Name
    URL
    Is Leaf
    Parent Menu Id
    Slug

    */
}

/*
    Personal
        Menu Id - 1
        Menu Name - Personal
        URL -
        Is Leaf - false
        Parent Menu Id - 0
        Slug -

        Personal -> Checking
        Menu Id - 2
        Menu Name - Checking
        URL -
        Is Leaf - true
        Parent Menu Id - 1
        slug - personal-checking

        Personal -> Saving & CDs
        Menu Id - 3
        Menu Name - Saving & CDs
        URL -
        Is Leaf - true
        Parent Menu Id - 1
        Slug - deposit

      Business
        Menu Id - 4
        Menu Name - Business
        URL -
        Is Leaf - false
        Parent Menu Id - 0
        slug - smallbusiness

        Business -> Checking
        Menu Id - 5
        Menu Name - Checking
        URL -
        Is Leaf - true
        Parent Menu Id - 4
        Slug -

        Business -> Business Service
        Menu Id - 6
        Menu Name - Business Service
        URL -
        Is Leaf - false
        Parent Menu Id - 4
        slug -

        Business -> Business Service -> Accept Credit Card Payments
        Menu Id - 7
        Menu Name - Accept Credit Card Payments
        URL -
        Is Leaf - true
        Parent Menu Id - 6
        Slug - merchant-services

        Wealth Management
        Menu Id - 8
        Menu Name - Wealth Management
        URL - https://www.ml.com/wealthmanagement.html
        Is Leaf - true
        Parent Menu Id - 0
 */
