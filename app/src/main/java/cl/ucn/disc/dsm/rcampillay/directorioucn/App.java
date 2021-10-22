package cl.ucn.disc.dsm.rcampillay.directorioucn;

import android.app.Application;
import android.content.Context;

import org.acra.ACRA;
import org.acra.annotation.AcraCore;
import org.acra.config.CoreConfigurationBuilder;
import org.acra.data.StringFormat;

/**
 * Main app
 *
 * @author Ronald Campillay-Pizarro.
 */
@AcraCore(buildConfigClass = BuildConfig.class)
public class App extends Application{

    /**
     * The starting point.
     * @param base context to use.
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        CoreConfigurationBuilder builder = new CoreConfigurationBuilder(this);
        builder.withBuildConfigClass(BuildConfig.class).withReportFormat(StringFormat.JSON).withEnabled(true);

        // The following Line triggers the initialization of ACRA
        ACRA.init(this);

    }
}
