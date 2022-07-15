package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;


/* renamed from: com.live2d.cubism.doc.model.exporter.cs  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cs.class */
final class MocMemoryMapHeaderEntry extends ACMocMemoryMapEntry {
    public MocMemoryMapHeaderEntry() {
        super(0, 1);
    }

    @Override
    protected void doReadToMemory(EmMoc3Source moc, CBinaryReader reader) {
        EmHeader header = moc.getEmHeader();
        reader.padding(EmHeader.COMPANION.getFILE_TYPE().length());
        header.setFormatVersion(reader.readByte());
        header.setEndianFlag(reader.readByte());
        reader.setPosition(EmHeader.COMPANION.getBODY_BYTE_SIZE());
    }

    @Override // com.live2d.cubism.doc.model.exporter.ACMocMemoryMapEntry
    /* renamed from: d */
    protected void doWriteToMemory(EmMoc3Source moc, CBinaryWriter writer) {
        int bytePosition = writer.getBytePosition();
        EmHeader header = moc.getEmHeader();
        writer.writeAnsiString(EmHeader.COMPANION.getFILE_TYPE(), false);
        writer.writeU1(header.getFormatVersion());
        writer.writeU1(header.getEndianFlag());
        int a3 = EmHeader.COMPANION.getBODY_BYTE_SIZE() - (writer.getBytePosition() - bytePosition);
        boolean z = a3 >= 0;
        if (z) {
            writer.fill((byte) 0, a3);
            return;
        }
        throw new AssertionError("Assertion failed");
    }
}
