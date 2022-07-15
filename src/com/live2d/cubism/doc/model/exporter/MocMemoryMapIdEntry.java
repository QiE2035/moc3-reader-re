package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ct  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ct.class */
final class MocMemoryMapIdEntry extends ACMocMemoryMapEntry {


    /* renamed from: b */
    private final Function1<EmMoc3Source, List<String>> mGetSourceFunc;
    /* renamed from: a */
    private final int mLimitCount = 64;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MocMemoryMapIdEntry(Function1<EmMoc3Source, List<String>> getSourceFunc) {
        super(0, 1);

        this.mGetSourceFunc = getSourceFunc;
    }

    @Override // com.live2d.cubism.doc.model.exporter.ACMocMemoryMapEntry
    /* renamed from: d */
    protected void doWriteToMemory(EmMoc3Source moc, CBinaryWriter writer) {
        List<String> ids = this.mGetSourceFunc.invoke(moc);
        for (String id : ids) {
            if (id.length() >= this.mLimitCount) {
                throw new IllegalStateException("Id length is greater than " + this.mLimitCount);
            }
        }
        for (String id : ids) {
            int pos = writer.getBytePosition();
            writer.write(id);
            int fillSize = this.mLimitCount - (writer.getBytePosition() - pos);
            if (fillSize >= 0) {
                writer.fill((byte) 0, fillSize);
            } else {
                throw new AssertionError("Assertion failed");
            }
        }
    }

    @Override
    protected void doReadToMemory(EmMoc3Source moc, CBinaryReader reader) {
        List<String> ids = this.mGetSourceFunc.invoke(moc);
        reader.readStrArray(ids, ((Lambda) mGetSourceFunc).getCount(), mLimitCount);
    }
}
