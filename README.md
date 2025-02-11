****WebMethods Integration Server Health Check****

****Overview****

This project provides WebMethods Flow Services to monitor and analyze the health of WebMethods Integration Servers. The services perform remote invocation to different WebMethods Integration Servers to collect and log health-related metrics, including JVM thread dumps, memory usage, and service statistics.

**Features
**

The health check implementation includes the following key services:

**1. JVM Thread Dump Analysis**

Retrieves a JVM thread dump from the target Integration Server.

Counts the different types of threads.

Identifies hanging threads.

Analyzes the current status of active threads.

**2. Service Statistics Collection**

Extracts service statistics based on the results from the thread dump.

Identifies bottlenecks in service execution.

Provides insights into long-running services.

**3. Memory Utilization Monitoring**

Retrieves memory usage details of the Virtual Machine (VM) and Integration Server.

Monitors memory thresholds and available resources.

Provides early warnings for potential memory issues.

**4. Health Check Logging**

Logs all gathered health check information into a dedicated health check log file.

Enables historical analysis and debugging of server health issues.

**Installation**

Import the provided Flow Services into your WebMethods Integration Server.

Configure remote servers for health checks.

Deploy and schedule the services as needed.

**Usage**

Invoke the health check Flow Services manually or via scheduler.

Review the logs for server health insights.

Adjust threshold limits as per server performance requirements.

**Contribution**

Feel free to contribute by submitting issues, feature requests, or pull requests.
