/**
 * Created by jounikauremaa on 23/06/2017.
 */
public class BankTeller extends Person {

    private String branchName;

    public BankTeller(String name) {
        super(name);
    }

    public boolean setBranchName (String branchName) {
        if (branchName.contains("Helsinki")) {
            this.branchName = branchName;
            return true;
        }
        return false;
    }

    public String getBranchName() {
        return branchName;
    }

    @Override
    public String toString() {
        return super.toString() + "| Branch: " + branchName;
    }
}
