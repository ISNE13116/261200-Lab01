public class Main{
    public static void main(String[] args) {
        Turtle turd = new Turtle();
        turd.speed(0.01);
        turd.up();


        // CRAB //

        int toggle_side = 1;

        for (int j=0;j<2;j++) {
            turd.setPosition(-55, -100);
            turd.penColor("orangered");
            turd.down();
            turd.setDirection(90-(90*toggle_side));
            turd.forward(20);
            turd.left(100*toggle_side);

            for (int i=0;i<4;i++) { // legs
                turd.right(80*toggle_side);
                turd.forward(5);
                turd.right(60*toggle_side);
                turd.forward(20);
                turd.right(30*toggle_side);
                turd.forward(20);
                turd.left(150*toggle_side);
                turd.forward(20);
                turd.left(45*toggle_side);
                turd.forward(20);
            }

            turd.right(70*toggle_side);
            turd.forward(10);

            turd.right(95*toggle_side); // pincher
            turd.forward(40);
            turd.left(50*toggle_side);
            turd.forward(45);
            turd.left(45*toggle_side);
            turd.forward(30);
            turd.left(130*toggle_side);
            turd.forward(40);
            turd.right(140*toggle_side);
            turd.forward(25);
            turd.left(130*toggle_side);
            turd.forward(20);
            turd.left(25*toggle_side);
            turd.forward(25);
            turd.left(45*toggle_side);
            turd.forward(10);
            turd.right(90*toggle_side);
            turd.forward(15);
            turd.right(85*toggle_side);
            turd.forward(15);

            turd.setDirection(90+(90*toggle_side));
            turd.forward(10);

            turd.penColor("black");
            turd.right(90*toggle_side); // eye
            turd.forward(10);
            turd.right(90*toggle_side);
            for (int i=0;i<360;i++) {
                turd.forward(0.1);
                turd.left(toggle_side);
            }
            turd.right(90*toggle_side);
            turd.forward(10);

            turd.penColor("red");
            turd.right(90*toggle_side);
            turd.forward(25);
            turd.up();

            toggle_side = -toggle_side;
        }

        // END CRAB //

        turd.speed(0.01);

        // ROSE //

        double[] temp_pos = {0,0};
        int[] rose_posx = {-115,-220,220,85,-22};
        int[] rose_posy = {-255,-245,-260,-250,-255};
        double[] rose_size = {0.6,0.8,1,0.7,0.5};
        int[] toggle_flip = {-1,1,1,1,-1};

        for(int j=0;j<5;j++) { // rose
            turd.setPosition(rose_posx[j], rose_posy[j]); // right side
            turd.penColor("crimson");
            turd.down();
            turd.setDirection(90-(90*toggle_flip[j]));
            turd.forward(15*rose_size[j]);
            for (int i = 0; i < 60; i++) {
                turd.forward(1*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            temp_pos[0] = turd.getX();
            temp_pos[1] = turd.getY();

            turd.setDirection(270-(65*toggle_flip[j]));
            for (int i = 0; i < 20; i++) {
                turd.forward(2*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            for (int i = 0; i < 15; i++) {
                turd.forward(1.5*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            turd.up();

            turd.setPosition(temp_pos[0], temp_pos[1]);
            turd.down();
            turd.setDirection(90-(45*toggle_flip[j]));
            for (int i = 0; i < 45; i++) {
                turd.forward(1*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            turd.forward(10*rose_size[j]);
            for (int i = 0; i < 90; i++) {
                turd.forward(0.3*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            temp_pos[0] = turd.getX();
            temp_pos[1] = turd.getY();

            turd.setDirection(-90);
            for (int i = 0; i < 100; i++) {
                turd.forward(0.5*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            turd.forward(30*rose_size[j]);
            turd.up();

            turd.setPosition(temp_pos[0], temp_pos[1]);
            turd.down();
            turd.setDirection(90);
            turd.forward(20*rose_size[j]);
            for (int i = 0; i < 100; i++) {
                turd.forward(0.5*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            turd.forward(25*rose_size[j]);
            turd.up();

            turd.setPosition(rose_posx[j], rose_posy[j]); // left side
            turd.down();
            turd.setDirection(90+(90*toggle_flip[j]));
            turd.forward(30*rose_size[j]);
            for (int i = 0; i < 80; i++) {
                turd.forward(0.8*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            for (int i=0;i<60;i++){
                turd.forward(0.2*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            turd.up();
            turd.setPosition(rose_posx[j], rose_posy[j]+(7.5*rose_size[j]));
            turd.down();
            turd.setDirection(90+(70*toggle_flip[j]));
            for(int i=0;i<20;i++){
                turd.forward(5*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            for(int i=0;i<170;i++){
                turd.forward(0.1*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            turd.forward(45*rose_size[j]);
            temp_pos[0] = turd.getX();
            temp_pos[1] = turd.getY();
            for(int i=0;i<70;i++){
                turd.forward(0.5*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            turd.up();

            turd.setPosition(temp_pos[0], temp_pos[1]);
            turd.down();
            turd.setDirection(90-(24*toggle_flip[j]));
            for(int i=0;i<60;i++){
                turd.forward(1*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            turd.up();
            turd.setPosition(rose_posx[j]-((75*rose_size[j])*toggle_flip[j]), rose_posy[j]+(72*rose_size[j]));
            turd.down();
            turd.setDirection(90+(60*toggle_flip[j]));
            for(int i=0;i<90;i++){
                turd.forward(0.6*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            for(int i=0;i<60;i++){
                turd.forward(0.2*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            temp_pos[0] = turd.getX();
            temp_pos[1] = turd.getY();
            turd.setDirection(-90+(10*toggle_flip[j]));
            for(int i=0;i<65;i++){
                turd.forward(1.2*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            turd.up();
            turd.setPosition(temp_pos[0], temp_pos[1]);
            turd.down();
            turd.setDirection(90);
            for(int i=0;i<90;i++){
                turd.forward(0.5*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            turd.setDirection(90-(85*toggle_flip[j]));
            for(int i=0;i<20;i++){
                turd.forward(3*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            turd.up();

            turd.setPosition(rose_posx[j]-((25*rose_size[j])*toggle_flip[j]), rose_posy[j]+(80*rose_size[j])); // middle
            turd.down();
            turd.setDirection(90+(20*toggle_flip[j]));
            for(int i=0;i<5;i++){
                turd.forward(3*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            turd.setDirection(90-(90*toggle_flip[j]));
            for(int i=0;i<15;i++){
                turd.forward(2*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            for(int i=0;i<150;i++){
                turd.forward(0.35*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            turd.up();
            turd.setPosition(rose_posx[j], rose_posy[j]+(105*rose_size[j]));
            turd.down();
            turd.setDirection(90+(75*toggle_flip[j]));
            turd.forward(20*rose_size[j]);
            for(int i=0;i<190;i++){
                turd.forward(0.3*rose_size[j]);
                turd.right(toggle_flip[j]);
            }
            turd.up();
            turd.setPosition(rose_posx[j]-((10*rose_size[j])*toggle_flip[j]), rose_posy[j]+(115*rose_size[j]));
            turd.down();
            turd.setDirection(90-(90*toggle_flip[j]));
            for(int i=0;i<150;i++){
                turd.forward(0.15*rose_size[j]);
                turd.left(toggle_flip[j]);
            }
            turd.up();

            for(int i=1;i>=-1;i-=2) { // leaves
                turd.setPosition(rose_posx[j], rose_posy[j]-10);
                turd.penColor("darkgreen");
                turd.down();
                turd.setDirection(90-(90*i));
                turd.forward(30*rose_size[j]);
                for(int k=0;k<60;k++){
                    turd.forward(1.25*rose_size[j]);
                    turd.left(i);
                }
                turd.setDirection(-90-(50*i));
                for(int k=0;k<45;k++){
                    turd.forward(2*rose_size[j]);
                    turd.right(i);
                }
                turd.setDirection(90-(90*i));
                for(int k=0;k<50;k++){
                    turd.forward(1.6*rose_size[j]);
                    turd.left(i);
                }
                turd.setDirection(-90-(80*i));
                for(int k=0;k<20;k++){
                    turd.forward(3*rose_size[j]);
                    turd.left(i);
                }
                if(i==1){
                    turd.setDirection(35);
                    for (int k = 0; k < 20; k++) {
                        turd.forward(2 * rose_size[j]);
                        turd.left(1);
                    }
                }
                else{
                    turd.setDirection(40);
                    for (int k = 0; k < 40; k++) {
                        turd.forward(2 * rose_size[j]);
                        turd.right(1);
                    }
                }
                turd.up();
            }

            turd.up();
        }

        // END ROSE //

        turd.speed(0.01);

        // RAIN //

        int[] rain_posx = {90,230,170,-180,-220,120,-120,-25,210};
        int[] rain_posy = {-70,-40,5,-60,45,80,140,90,130};
        double[] rain_size = {1.5,1.2,0.9,1,1.3,1.1,1.4,0.8,1.6};

        for (int i=0;i<9;i++) {
            turd.setPosition(rain_posx[i],rain_posy[i]);
            turd.penColor("blue");
            turd.down();
            turd.setDirection(-75);
            turd.forward(25*rain_size[i]);
            while (turd.getDirection() >= 75) {
                turd.forward(0.12*rain_size[i]);
                turd.right(1);
            }
            turd.forward(25*rain_size[i]);
            turd.up();
        }

        // END RAIN //

        turd.speed(0.01);

        // RAINBOW //

        double height = 80;
        String[] roygbiv = {"indigo","lightblue","blue","green","yellow","orange","red"};

        for(int j=0;j<56;j++) {
            turd.setPosition(-255, height);
            turd.penColor(roygbiv[j/8]);
            turd.down();
            turd.setDirection(45);
            for(int i=0;i<90;i++){
                turd.forward(7);
                turd.right(1);
            }
            turd.up();

            height += 1.5;
        }

        // END RAINBOW //

        turd.setPosition(9999,9999);
    }
}