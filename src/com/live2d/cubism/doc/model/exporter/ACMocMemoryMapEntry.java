package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;


/* renamed from: com.live2d.cubism.doc.model.exporter.a  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/a.class */
abstract class ACMocMemoryMapEntry {

    /* renamed from: c */
    private final int mAlign;
    /* renamed from: a */
    private int mBeginOffset;

    public ACMocMemoryMapEntry(int align) {
        this.mAlign = align;
    }

    public /* synthetic */ ACMocMemoryMapEntry(int i, int i2) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public ACMocMemoryMapEntry() {
        this(0, 1);
    }

    /* renamed from: a */
    public final void writeToMemory(EmMoc3Source moc, CBinaryWriter writer) {
        alignBeginPosition(writer);
        this.mBeginOffset = writer.getBytePosition();
        doWriteToMemory(moc, writer);
    }

    /* renamed from: c */
    protected final void alignBeginPosition(CBinaryWriter writer) {
        if (this.mAlign > 0) {
            writer.padding(this.mAlign);
        }
    }

    /* renamed from: d */
    protected abstract void doWriteToMemory(EmMoc3Source moc, CBinaryWriter writer);

    /* renamed from: a */
    public final int getBeginOffset() {
        return this.mBeginOffset;
    }

    protected abstract void doReadToMemory(EmMoc3Source moc, CBinaryReader reader);
}
