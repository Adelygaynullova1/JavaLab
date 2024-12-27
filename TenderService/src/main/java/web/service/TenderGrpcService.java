package web.service;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.pb.*;


@Service
@RequiredArgsConstructor
public class TenderGrpcService extends TenderServiceGrpc.TenderServiceImplBase {

    private final TenderService tenderService;

    @Override
    public void getWinnerCompany( Empty request,StreamObserver<TenderResponse> responseObserver) {
        TenderResponse response = TenderResponse.newBuilder()
                .setCompanyName(tenderService.getBestCompany())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}