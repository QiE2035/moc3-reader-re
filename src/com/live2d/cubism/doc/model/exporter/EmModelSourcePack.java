package com.live2d.cubism.doc.model.exporter;


/* renamed from: com.live2d.cubism.doc.model.exporter.ce  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ce.class */
public final class EmModelSourcePack {
    /* renamed from: b */
    private final EmMoc3Source mEmMoc3Source;

    public EmModelSourcePack(EmMoc3Source mEmMoc3Source) {
        this.mEmMoc3Source = mEmMoc3Source;
    }

    public CMocExportFormat getCMocExportFormat() {
        return CMocExportFormat.fromSDKVersion(mEmMoc3Source.getEmHeader().getFormatVersion());
    }

    /* renamed from: d */
    public EmMoc3Source getEmMoc3Source() {
        return this.mEmMoc3Source;
    }
}
