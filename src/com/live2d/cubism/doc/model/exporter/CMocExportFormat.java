package com.live2d.cubism.doc.model.exporter;

//@SerializableClass

/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/CMocExportFormat.class */
public enum CMocExportFormat {
    V3_00_00(1),
    V3_03_00(2),
    V4_00_00(3);


    /* renamed from: sdkVersion */
    private final int mSDKVersion;

    CMocExportFormat(int sdkVersion) {
        this.mSDKVersion = sdkVersion;
    }

    public static CMocExportFormat fromSDKVersion(int sdkVersion) {
        for (CMocExportFormat format : CMocExportFormat.values()) {
            if (format.getSDKVersion() == sdkVersion) {
                return format;
            }
        }
        return V3_00_00;
    }

    /* renamed from: a */
    public final int getSDKVersion() {
        return this.mSDKVersion;
    }
}
