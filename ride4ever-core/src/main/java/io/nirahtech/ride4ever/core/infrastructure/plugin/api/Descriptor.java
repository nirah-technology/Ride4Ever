package io.nirahtech.ride4ever.core.infrastructure.plugin.api;

/**
 * Interface that represents a Descriptor.
 * 
 * @author METIVIER Nicolas <nicolas.a.metivier@gmail.com>
 * @since 1.0.0
 */
public interface Descriptor {

    /**
     * Get the Artifact ID.
     * @return Artifact ID.
     */
    public String getArtifactId();

    /**
     * Get the description.
     * @return Description.
     */
    public String getDescription();

    /**
     * Get the Group ID.
     * @return Group ID.
     */
    public String getGroupId();

    /**
     * Get the name.
     * @return Name.
     */
    public String getName();

    /**
     * Get the version.
     * @return Version.
     */
    public String getVersion();
}
