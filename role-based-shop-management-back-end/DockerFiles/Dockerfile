FROM java:8
COPY role-based-shop-management-back-end-0.0.1-SNAPSHOT.jar /
RUN bash -c 'touch /role-based-shop-management-back-end-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/role-based-shop-management-back-end-0.0.1-SNAPSHOT.jar", "--logging.file=loggg.log"]
