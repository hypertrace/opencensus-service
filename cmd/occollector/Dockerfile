FROM alpine:latest as certs
RUN apk --update add ca-certificates
FROM scratch
COPY --from=certs /etc/ssl/certs/ca-certificates.crt /etc/ssl/certs/ca-certificates.crt
COPY occollector_linux /
COPY config/config.yaml /config/collector-config.yaml
ENTRYPOINT ["/occollector_linux"]
EXPOSE 55678 14267 14268 9411