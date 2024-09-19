package net.coderbot.iris.compliance;

import net.coderbot.iris.Iris;

public enum ComplianceVersion {
    NO_COMPLIANCE,
    v1;

    public int getInternalComplianceLevel() {
        switch (this) {
            case NO_COMPLIANCE -> {
                return 0;
            }
            case v1 -> {
                return 1;
            }
            default -> throw new IllegalStateException("Unexpected value: " + this);
        }
    }

    public static ComplianceVersion getComplianceLevel(String complianceLevel) {
        try {
            int complianceLevelInt = Integer.parseInt(complianceLevel);
            return ComplianceVersion.valueOf("v" + complianceLevelInt);
        } catch (IllegalArgumentException e) {
            Iris.logger.warn("Invalid compliance level: " + complianceLevel + "; defaulting to NONCOMPLIANT.");
            return NO_COMPLIANCE;
        }
    }
}

