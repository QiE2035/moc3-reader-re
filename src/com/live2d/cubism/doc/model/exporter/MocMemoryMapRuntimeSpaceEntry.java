package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;
import kotlin.jvm.functions.Function1;


/* renamed from: com.live2d.cubism.doc.model.exporter.cu  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cu.class */
final class MocMemoryMapRuntimeSpaceEntry extends ACMocMemoryMapEntry {

    /* renamed from: a */
    private final int mUnitSize;


    /* renamed from: b */
    private final Function1<EmMoc3Source, Integer> mGetSourceFunc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MocMemoryMapRuntimeSpaceEntry(int i, int i2, Function1<EmMoc3Source, Integer> getSourceFunc) {
        super(i2);

        this.mUnitSize = i;
        this.mGetSourceFunc = getSourceFunc;
    }

    public /* synthetic */ MocMemoryMapRuntimeSpaceEntry(int i, int i2, Function1 function1, int i3) {
        this(i, (i3 & 2) != 0 ? 64 : i2, function1);
    }

    @Override // com.live2d.cubism.doc.model.exporter.ACMocMemoryMapEntry
    /* renamed from: d */
    protected void doWriteToMemory(EmMoc3Source moc, CBinaryWriter writer) {
        writer.fill((byte) 0, this.mUnitSize * this.mGetSourceFunc.invoke(moc));
    }

    @Override
    protected void doReadToMemory(EmMoc3Source moc, CBinaryReader reader) {
//        reader.padding(this.mUnitSize * this.mGetSourceFunc.invoke(moc));
        for (int i = 0; i < this.mGetSourceFunc.invoke(moc); i++) {
            System.out.println(reader.readString(mUnitSize));
        }
    }
}
