package web.service;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import web.pb.Empty;
import web.pb.TenderResponse;
import web.pb.TenderServiceGrpc;

@Service
public class GrpcTenderService {

    @GrpcClient("tender-service")
    private TenderServiceGrpc.TenderServiceBlockingStub tenderServiceBlockingStub;

    public TenderResponse getWinnerCompany(Empty empty) {

        TenderResponse response;

        try {
            response = tenderServiceBlockingStub.getWinnerCompany(empty);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Ошибка gRPC: " + e.getStatus());
        }
        return response;
    }
}