package ru.unn.phys.javaexampleservice;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.Metrics;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
public class ExampleController {

    @Scheduled(initialDelay = 1000, fixedDelay = 1000)
    private void foo() {

        System.out.println("SOME PROCESS...");

        Process process = new Process(0);
        Gauge.builder("algorithm", process, Process::getValue)
                .baseUnit("ns")
                .strongReference(true)
                .register(Metrics.globalRegistry);

//        for (int i = 0; i < 10; i++) {
//            String name = "algorithm-" + i;
//            int n = 1_000_000 * (i + 1);
//            new Thread(() -> {
//                Process process = new Process(n);
//                Gauge.builder(name, process, Process::getValue)
//                        .baseUnit("ns")
//                        .tag("N", String.valueOf(n))
//                        .strongReference(true)
//                        .register(Metrics.globalRegistry);
//            }).start();
//        }
    }

}
