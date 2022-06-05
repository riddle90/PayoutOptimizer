package src.main.Host;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cli {
    public Cli(){

    }
    public static void main(String[] args) {

        log.debug("Debug Enabled");
        log.info("Info Enabled");
        log.warn("Warn Enabled");
        log.error("Error Enabled");

    }
}