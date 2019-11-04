FROM tomcat:8.0-alpine

MAINTAINER mihai blandu
COPY target/java-config-1.0.0-SNAPSHOT.war $CATALINA_HOME/webapps/app.war
COPY tomcat-users.xml $CATALINA_HOME/conf/tomcat-users.xml
COPY ReadMe $CATALINA_HOME/conf/ReadMe.md
EXPOSE 8080
CMD ["catalina.sh", "run"]