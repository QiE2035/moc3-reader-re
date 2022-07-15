package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.cv  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cv.class */
final class MocMemoryMapSectionOffsetEntry extends ACMocMemoryMapEntry {
    public MocMemoryMapSectionOffsetEntry() {
        super(0, 1);
    }

    @Override
    protected void doReadToMemory(EmMoc3Source moc, CBinaryReader reader) {
        reader.readIntArray(moc.getEmSectionOffset().getOffsets(), EmSectionOffset.COMPANION.getBODY_BYTE_SIZE());
    }

    @Override // com.live2d.cubism.doc.model.exporter.ACMocMemoryMapEntry
    /* renamed from: d */
    protected void doWriteToMemory(EmMoc3Source moc, CBinaryWriter writer) {
        int bytePosition = writer.getBytePosition();
        writer.writeArray((List) moc.getEmSectionOffset().getOffsets());
        int a2 = EmSectionOffset.COMPANION.getBODY_BYTE_SIZE() - (writer.getBytePosition() - bytePosition);
        if (a2 >= 0) {
            writer.fill((byte) 0, a2);
            return;
        }
        throw new AssertionError("Assertion failed");
    }
}
