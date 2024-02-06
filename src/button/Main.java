package button;

public class Main {
    public static void main(String[] args) {
        Button button1 =new Button('1',1);
        Button buttonPlus =new Button('+',3);
        Button buttonClear =new Button('C',2);

        Button[] buttons={button1,buttonPlus,buttonClear};


        for(Button button :buttons){button.place();}

        Button.switchMode();

        for(Button button :buttons){button.place();}

        buttonClear.print='X';
        buttonClear.place();
        }

}
