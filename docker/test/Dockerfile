FROM maven:3.6.0-jdk-11

ADD . /

ENTRYPOINT exec mvn install sonar:sonar compile -U -Dsonar.login=${SONAR_TOKEN}
