#!/bin/bash
#STOP SERVER IF  ALREADY RUNNING BY EXECUTING SHUTDOWN.SH FILE BEFORE RUNNING THIS FILE

echo "
-------CREATING WAR-------
"
sh /Users/akshay.patwari/IdeaProjects/cicd/gradlew build
echo "
---------REMOVING PREVIOUS BUILDS WAR-------------
"
rm /Users/akshay.patwari/Downloads/apache-tomcat-9.0.31/webapps/*.war
rm -rf /Users/akshay.patwari/Downloads/apache-tomcat-9.0.31/webapps/cicd-0.0.1-SNAPSHOT
echo "
---------DEPLOYING WAR TO SERVER-------------
"
cp /Users/akshay.patwari/IdeaProjects/cicd/build/libs/cicd-0.0.1-SNAPSHOT.war /Users/akshay.patwari/Downloads/apache-tomcat-9.0.31/webapps/
echo "
---------STARTING SERVER-------------
"
sh /Users/akshay.patwari/Downloads/apache-tomcat-9.0.31/bin/catalina.sh run