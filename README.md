# CrudDemoApplication 
An application for crud operations upon Employee data.

# Description
CrudDemoApplication performs various operations on Employee data such as:

save employee data into Database.

Retrieve employee data from Database.

Retrieve employee data by Id from Database.

Delete by Id from Database.

# Installation
Installation required to run the application-

  *JDK 11
  
  *Spring boot
     
  *Embedded Springboot Tomcat Server
  
  *Maven


# SetUp
Springboot inbuild H2 data base being used.

username and password are sa and empty password respectively.

The DB credentials can be modified from application.properties file.

 *Maven command : maven clean install 
 
 *Start the server as java application.
 

# Endpoints 

This application contains below endpoints-

1. POST localhost:8080/employee

	*This endpoint insert employee record into database.
	
2. GET localhost:8080/employees

    *The endpoint retrieves the employee data.
 
3. GET localhost:8080/employees/{ID}

    *The endpoint retrieves the employee data by Id.
    
4. DELETE localhost:8080/employees/{ID}

    *The endpoint deleted the employee data by Id.
 


# Actuator
Actuator does healthchecks and auditing and collect matrices.

    * Endpoint for metrics: localhost:8080/actuator/metrics
    
    
    Sample response for metrics
    
    {
    "names": [
        "hikaricp.connections",
        "hikaricp.connections.acquire",
        "hikaricp.connections.active",
        "hikaricp.connections.creation",
        "hikaricp.connections.idle",
        "hikaricp.connections.max",
        "hikaricp.connections.min",
        "hikaricp.connections.pending",
        "hikaricp.connections.timeout",
        "hikaricp.connections.usage",
        "http.server.requests",
        "jdbc.connections.active",
        "jdbc.connections.idle",
        "jdbc.connections.max",
        "jdbc.connections.min",
        "jvm.buffer.count",
        "jvm.buffer.memory.used",
        "jvm.buffer.total.capacity",
        "jvm.classes.loaded",
        "jvm.classes.unloaded",
        "jvm.gc.live.data.size",
        "jvm.gc.max.data.size",
        "jvm.gc.memory.allocated",
        "jvm.gc.memory.promoted",
        "jvm.gc.pause",
        "jvm.memory.committed",
        "jvm.memory.max",
        "jvm.memory.used",
        "jvm.threads.daemon",
        "jvm.threads.live",
        "jvm.threads.peak",
        "jvm.threads.states",
        "logback.events",
        "process.cpu.usage",
        "process.start.time",
        "process.uptime",
        "system.cpu.count",
        "system.cpu.usage",
        "tomcat.sessions.active.current",
        "tomcat.sessions.active.max",
        "tomcat.sessions.alive.max",
        "tomcat.sessions.created",
        "tomcat.sessions.expired",
        "tomcat.sessions.rejected"
    ]
    
      *To fetch the health details
  
     http://localhost:8080/actuator/health
  Response:
				  
				  {
				  
				    "status": "UP"
				}


*To fetch the each metrics  details:

		http://localhost:8080/actuator/metrics/jvm.memory.max
		
		Ex : Sample Response 
		{
    "name": "jvm.memory.max",
    "description": "The maximum amount of memory in bytes that can be used for memory management",
    "baseUnit": "bytes",
    "measurements": [
        {
            "statistic": "VALUE",
            "value": 5.586812925E9
        }
    ],
    "availableTags": [
        {
            "tag": "area",
            "values": [
                "heap",
                "nonheap"
            ]
        },
        {
            "tag": "id",
            "values": [
                "CodeHeap 'profiled nmethods'",
                "G1 Old Gen",
                "CodeHeap 'non-profiled nmethods'",
                "G1 Survivor Space",
                "Compressed Class Space",
                "Metaspace",
                "G1 Eden Space",
                "CodeHeap 'non-nmethods'"
            ]
        }
    ]
}


}
    
