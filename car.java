class Objects {
    public String name;
    public String colour;
    public int engine;
    public int Wsize;

    public void Acc(){
        System.out.println("Car is moving forward");
    }

    public Objects(String n, String c, int e, int w){
        this.colour=c;
        this.engine=e;
        this.name=n;
        this.Wsize=w;
    }

    public static void main(String[] args) {
     
    Objects Honda = new Objects("Sedan","Blue",5000, 20 );

    System.out.println("");


    }
}