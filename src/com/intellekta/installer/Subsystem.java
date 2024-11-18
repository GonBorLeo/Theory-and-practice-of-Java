package com.intellekta.installer;

public interface Subsystem {
    String getName();

    int getVersion();

    void install();

    Subsystem[] getPrerequisites();
}
