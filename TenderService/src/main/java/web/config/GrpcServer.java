package web.config;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import web.service.TenderGrpcService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@RequiredArgsConstructor
public class GrpcServer {

    private Server server;

    private final TenderGrpcService grpcService;

    @PostConstruct
    public void start() throws Exception {
        server = ServerBuilder.forPort(7863)
                .addService(grpcService)
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread(GrpcServer.this::stop));
    }

    @PreDestroy
    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
}