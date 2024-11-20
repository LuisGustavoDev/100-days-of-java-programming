package cellphone;

import java.util.ArrayList;

public class CallRepository {
    private ArrayList<Call> calls;

    public CallRepository() {
        this.calls = new ArrayList<Call>();
    }
    public void addCall(Call call) {
        this.calls.add(call);
    }

    @Override
    public String toString() {
        String information = "Calls:\n";
        for (Call call : calls) {
            information += call.toString() + "\n";
        }
        return information;
    }
}
