package com.icthh.xm.ms.otp.config.tenant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides command for schema change for particular database.
 */
@Slf4j
@Component
public class SchemaChangeResolver {

    private static final String DEFAULT_COMMAND = "USE %s";

    private static final Map<String, String> DB_COMMANDS = new HashMap<>();

    static {
        DB_COMMANDS.put("POSTGRESQL", "SET search_path TO %s");
        DB_COMMANDS.put("ORACLE", "ALTER SESSION SET CURRENT_SCHEMA = %s_OTP");
        DB_COMMANDS.put("H2", DEFAULT_COMMAND);
    }

    private String dbSchemaChangeCommand;

    /**
     * SchemaChangeResolver constructor.
     * @param env the environment
     */
    public SchemaChangeResolver(Environment env) {
        String db = env.getProperty("spring.jpa.database");
        this.dbSchemaChangeCommand = DB_COMMANDS.getOrDefault(db, DEFAULT_COMMAND);
        log.info("Database {} will use command '{}' for schema changing", db, dbSchemaChangeCommand);
    }

    public String getSchemaSwitchCommand() {
        return this.dbSchemaChangeCommand;
    }

}
