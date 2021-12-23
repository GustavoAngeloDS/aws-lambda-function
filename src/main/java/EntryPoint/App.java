package EntryPoint;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<String, String> {

    private static final String MESSAGE = "First AWS Lambda function. Your input was: %s";

    @Override
    public String handleRequest(String s, Context context) {
        return String.format(MESSAGE, s);
    }
}
