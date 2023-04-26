package dev.sunbirdrc.registry.config.validation;

import dev.sunbirdrc.registry.model.DBConnectionInfo;
import dev.sunbirdrc.registry.model.DBConnectionInfoMgr;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

// This class is responsible for validating the database configuration
@Component
public class DatabaseConfigValidator implements ConstraintValidator<ValidDatabaseConfig, DBConnectionInfoMgr> {

    @Override
    public boolean isValid(DBConnectionInfoMgr mgr, ConstraintValidatorContext context) {
        boolean isValidFlag = false;
        String message = null;

        // Check if provider and uuidPropertyName are not empty
        if (mgr.getProvider().isEmpty() || mgr.getUuidPropertyName().isEmpty()) {
            message = "database.provider or database.uuidPropertyName is empty";
        }
        // Check if at least one connectionInfo is specified
        if (mgr.getConnectionInfo().size() < 1) {
            message = "At least one connectionInfo must be specified";
        }

        boolean nShardsExist = mgr.getConnectionInfo().size() > 1;
        for (DBConnectionInfo info : mgr.getConnectionInfo()) {
            // Check if shardId and uri are not empty
            if (info.getShardId().isEmpty() || info.getUri().isEmpty()) {
                message = "database.connectionInfo.shardId or database.connectionInfo.uri is empty";
                break;
            }
            // Check if shardLabel is not empty when multiple shards exist
            if (nShardsExist && info.getShardLabel().isEmpty()) {
                message = "database.connectionInfo.shardLabel is empty";
                break;
            }
            // Check if shardId is unique when multiple shards exist
            if (nShardsExist && !isUniqueShardId(mgr.getConnectionInfo(), info.getShardId())) {
                message = "database.connectionInfo.shardId must be unique";
                break;
            }
            // Check if shardLabel is unique when multiple shards exist
            if (nShardsExist
                    && !isUniqueShardLabel(mgr.getConnectionInfo(), info.getShardLabel())) {
                message = "database.connectionInfo.shardLabel must be unique";
                break;
            }
        }
        // Set the error message if any validation fails
        if (message != null)
            setMessage(context, message);
        else
            isValidFlag = true;
        return isValidFlag;
    }

    // Set the error message in the ConstraintValidatorContext
    private void setMessage(ConstraintValidatorContext context, String message) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
    }

    // Check if the shardId is unique in the list of DBConnectionInfo
    private boolean isUniqueShardId(final List<DBConnectionInfo> dbConnectionInfoList, final String shardId) {
        boolean shardIdUnique = dbConnectionInfoList.stream().filter(o -> o.getShardId().equals(shardId)).count() == 1;
        return shardIdUnique;
    }

    // Check if the shardLabel is unique in the list of DBConnectionInfo
    private boolean isUniqueShardLabel(final List<DBConnectionInfo> dbConnectionInfoList, String shardLabel) {
        boolean shardLabelUnique = dbConnectionInfoList.stream().filter(o -> o.getShardLabel().equals(shardLabel))
                .count() == 1;
        return shardLabelUnique;
    }
}