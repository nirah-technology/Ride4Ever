package io.nirahtech.ride4ever.core.infrastructure.plugin.api;

/**
 * Interface that represents a Micro-Service Plugin.
 * 
 * @author METIVIER Nicolas <nicolas.a.metivier@gmail.com>
 * @since 1.0.0
 */
public interface MicroServicePlugin {

    /**
     * Start the plugin.
     * @param arguments Parameter to customize the plugin runtime.
     */
    public void start(final String... arguments);

    /**
     * Load the pluging.
     */
    public void load();

    /**
     * Shut down the plugin.
     */
    public void shutdown();

    /**
     * Get the descriptor of the plugin.
     * @return Descriptor that contains plugin's properties.
     */
    public Descriptor getDescriptor();
}
