package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.cr  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cr.class */
final class MocMemoryMapCountInfoEntry extends ACMocMemoryMapEntry {
    public MocMemoryMapCountInfoEntry() {
        super(0, 1);
    }

    @Override
    protected void doReadToMemory(EmMoc3Source moc, CBinaryReader reader) {
        reader.readIntArray(moc.getEmModelSource().getEmCountInfo().getCounts(), EmCountInfo.COMPANION.getMAX_COUNT());

    }

    @Override
    /* renamed from: d */
    protected void doWriteToMemory(EmMoc3Source moc, CBinaryWriter writer) {
        int a = writer.getBytePosition();
        writer.writeArray((List) moc.getEmModelSource().getEmCountInfo().getCounts());
        int a2 = EmCountInfo.COMPANION.getBODY_BYTE_SIZE() - (writer.getBytePosition() - a);
        if (a2 >= 0) {
            writer.fill((byte) 0, a2);
            return;
        }
        throw new AssertionError("Assertion failed");
    }
}
