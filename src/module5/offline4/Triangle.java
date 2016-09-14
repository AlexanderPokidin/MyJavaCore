package module5.offline4;

public final class Triangle extends View{
    private boolean isShowing = false;

    @Override
    public void show() {
        /*if (isShowing){
            System.out.println("Sorry, this triangle is showing now");}
        else {
            System.out.println("Showing triangle");
            isShowing = true;
        }*/
        changeViewState("showing");

    }

    @Override
    public void hide() {
        /*if (!isShowing){
            System.out.println("Sorry, this triangle is showing now");}
        else {
            System.out.println("Hiding triangle");
            isShowing = false;}*/
        changeViewState("hiding");
    }

    private  void changeViewState(String message) {
        String hiding = "hiding";
        String showing = "showing";
        if (message.equals(hiding)){
            System.out.println("Sorry, this triangle is not " + message + " now");}
        else {
            if (message.equals(showing)) message = hiding;
            System.out.println(message + " triangle");
            isShowing = false;}
    }

    public boolean isShowing(){
        System.out.println("Triangle is " + (isShowing ? "showing" : "not showing"));
        return isShowing;
    }
}
