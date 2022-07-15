package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;


/* renamed from: com.live2d.cubism.doc.model.exporter.bV  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bV.class */
public final class EmHeader {
//    @NotNull

    /* renamed from: b */
//    private String f3735b = FILE_TYPE;

    /* renamed from: a */
    public static final Companion COMPANION = new Companion();
    /* renamed from: e */
    private static final int BODY_BYTE_SIZE = 64;
    /* renamed from: f */
    private static final String FILE_TYPE = "MOC3";
    /* renamed from: c */
    private byte mFormatVersion;
    /* renamed from: d */
    private byte mEndianFlag;

    /* renamed from: a */
    public byte getFormatVersion() {
        return this.mFormatVersion;
    }

    /* renamed from: a */
    public void setFormatVersion(byte formatVersion) {
        this.mFormatVersion = formatVersion;
    }

    /* renamed from: b */
    public byte getEndianFlag() {
        return this.mEndianFlag;
    }

    /* renamed from: b */
    public void setEndianFlag(byte endianFlag) {
        this.mEndianFlag = endianFlag;
    }

    /* renamed from: com.live2d.cubism.doc.model.exporter.bV$a */
    /* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bV$a.class */
    public static final class Companion {
        private  /* synthetic */ Companion() {
        }

        /* renamed from: a */
        public int getBODY_BYTE_SIZE() {
            return EmHeader.BODY_BYTE_SIZE;
        }

        /* renamed from: b */
        public String getFILE_TYPE() {
            return EmHeader.FILE_TYPE;
        }
    }

}
