package org.usadamasa.autoapp.workflows;

import com.google.cloud.workflows.executions.v1.CreateExecutionRequest;
import com.google.cloud.workflows.executions.v1.Execution;
import com.google.cloud.workflows.executions.v1.ExecutionsClient;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class WorkflowWrapper {
    private static volatile boolean finished;

    public void workflowsQuickstart(String projectId, String location, String workflow)
        throws IOException, InterruptedException, ExecutionException {
        try (ExecutionsClient executionsClient = ExecutionsClient.create()) {
            // Construct the fully qualified location path.

            // Creates the execution object.
            CreateExecutionRequest request =
                CreateExecutionRequest.newBuilder()
                    .setParent("parent")
                    .setExecution(Execution.newBuilder().build())
                    .build();
            Execution response = executionsClient.createExecution(request);

            String executionName = response.getName();
            System.out.printf("Created execution: %s%n", executionName);

            long backoffTime = 0;
            long backoffDelay = 1_000; // Start wait with delay of 1,000 ms
            final long backoffTimeout = 10 * 60 * 1_000; // Time out at 10 minutes
            System.out.println("Poll for results...");

            // Wait for execution to finish, then print results.
            while (!finished && backoffTime < backoffTimeout) {
                Execution execution = executionsClient.getExecution(executionName);
                finished = execution.getState() != Execution.State.ACTIVE;

                // If we haven't seen the results yet, wait.
                if (!finished) {
                    System.out.println("- Waiting for results");
                    Thread.sleep(backoffDelay);
                    backoffTime += backoffDelay;
                    backoffDelay *= 2; // Double the delay to provide exponential backoff.
                } else {
                    System.out.println("Execution finished with state: " + execution.getState().name());
                    System.out.println("Execution results: " + execution.getResult());
                }
            }
        }
    }
}
