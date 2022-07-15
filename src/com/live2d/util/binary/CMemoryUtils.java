package com.live2d.util.binary;

//import kotlin.Metadata;

/* renamed from: com.live2d.util.c.c  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/util/c/c.class */
public final class CMemoryUtils {

    /* renamed from: a */
    public static final CMemoryUtils INSTANCE = new CMemoryUtils();

    private CMemoryUtils() {
    }

    /* renamed from: a */
    public int alignOffset(int i, int i2) {
        return ((i + i2) - 1) & (-i2);
    }
}
