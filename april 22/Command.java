public interface Command {

    public void init();
    
    public void execute();

    public boolean isFinished();

    public void end(boolean interrupted);

public static void main(String[] args) {
        UseDrivetrain myCommand = new UseDrivetrain(() -> {
            return Math.random();
        });


  
        while(!myCommand.isFinished()){
            myCommand.execute();
        }
        myCommand.end(false);

        ShootBall myCommandbruh = new ShootBall(() -> {
            return Math.random();
        });


  
        while(!myCommand.isFinished()){
            myCommand.execute();
        }
        myCommand.end(false);
}
