import java.util.function.Consumer;
import java.util.function.Supplier;

public class UseDrivetrain implements Command {
    public Consumer<Double> runMotor;
    public Supplier<Double> motorPower;

    private int countdown = 10;

    public UseDrivetrain(Supplier<Double> motorPower){
        this.runMotor = (power) -> {
            System.out.println("Set drivetrain power to " + power);
        };
        this.motorPower = motorPower;
    }

    @Override
  public void init(){
    System.out.println("bruh");
  }
  
    @Override
    public void execute(){
        this.runMotor.accept(this.motorPower.get());
    }

    @Override
    public boolean isFinished(){
        this.countdown--;
        return this.countdown == 0;
    }

    @Override
    public void end(boolean interrupted){
        this.runMotor.accept(0.0);
    }
}
