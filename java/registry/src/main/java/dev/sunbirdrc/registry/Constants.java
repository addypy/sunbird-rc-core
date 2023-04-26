package dev.sunbirdrc.registry;

// This class contains constants used throughout the application.
public class Constants {
    public static final String SUNBIRD_RC = "sunbird-rc";
    public static final String KEY_CONSENT = "consent";
    
    // Invitation email subject and body templates
    public static final String INVITE_SUBJECT_TEMPLATE = "INVITATION TO JOIN %s";
    public static final String INVITE_BODY_TEMPLATE = "You have been invited to join %s registry. You can complete your profile here: https://ndear.xiv.in";
    
    // Claim status email subject and body templates
    public static final String CLAIM_STATUS_SUBJECT_TEMPLATE = "CLAIM %s";
    public static final String CLAIM_STATUS_BODY_TEMPLATE = "Your claim request has been %s";
    
    // Invitation and claim status constants
    public static final String INVITE = "INVITE";
    public static final String CLAIM_GRANTED = "CLAIM_GRANTED";
    public static final String CLAIM_REJECTED = "CLAIM_REJECTED";
    
    // Anonymous user constant
    public static final String USER_ANONYMOUS = "anonymous";
    
    // Entity types
    public static final String ATTESTATION_POLICY = "AttestationPolicy";
    public static final String REVOKED_CREDENTIAL = "RevokedCredential";
    public static final String Schema = "Schema";
    
    // Template related constants
    public static final String Template = "template";
    public static final String TemplateKey = "template-key";
    
    // Common property keys
    public final static String TITLE = "title";
    public final static String PATH = "path";
    public final static String URL = "url";
    
    // Default user constant
    public final static String DEFAULT_USER = "User";
    
    // URI prefixes
    public final static String MINIO_URI_PREFIX = "minio://";
    public final static String HTTP_URI_PREFIX = "http://";
    public final static String HTTPS_URI_PREFIX = "https://";
    
    // Kafka consumer group ID
    public static final String createEntityGroupId = "create-entity-consumer-group";
    
    // Requester constant
    public static final String REQUESTER = "REQUESTER";
    
    // File URL constant
    public static final String FILE_URL = "fileUrl";
    
    // Credential template constant
    public static final String CREDENTIAL_TEMPLATE = "credentialTemplate";
}