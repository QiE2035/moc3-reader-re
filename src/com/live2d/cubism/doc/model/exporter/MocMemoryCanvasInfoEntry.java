package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;


/* renamed from: com.live2d.cubism.doc.model.exporter.cp  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cp.class */
final class MocMemoryCanvasInfoEntry extends ACMocMemoryMapEntry {
    public MocMemoryCanvasInfoEntry() {
        super(0, 1);
    }

    @Override
    protected void doReadToMemory(EmMoc3Source moc, CBinaryReader reader) {
        EmCanvasInfo canvasInfo = moc.getEmModelSource().getEmCanvasInfo();
        canvasInfo.setPixelsPerUnit(reader.readFloat());
        canvasInfo.setOriginX(reader.readFloat());
        canvasInfo.setOriginY(reader.readFloat());
        canvasInfo.setCanvasWidth(reader.readFloat());
        canvasInfo.setCanvasHeight(reader.readFloat());
        canvasInfo.setCanvasFlag(reader.readByte());
        reader.padding(EmCanvasInfo.COMPANION.getBODY_BYTE_SIZE());
    }

    @Override // com.live2d.cubism.doc.model.exporter.ACMocMemoryMapEntry
    /* renamed from: d */
    protected void doWriteToMemory(EmMoc3Source moc, CBinaryWriter writer) {
        int a = writer.getBytePosition();
        EmCanvasInfo canvasInfo = moc.getEmModelSource().getEmCanvasInfo();
        writer.write(canvasInfo.getPixelsPerUnit());
        writer.write(canvasInfo.getOriginX());
        writer.write(canvasInfo.getOriginY());
        writer.write(canvasInfo.getCanvasWidth());
        writer.write(canvasInfo.getCanvasHeight());
        writer.writeU1(canvasInfo.getCanvasFlag());
        int a2 = EmCanvasInfo.COMPANION.getBODY_BYTE_SIZE() - (writer.getBytePosition() - a);
        boolean z = a2 >= 0;
        if (z) {
            writer.fill((byte) 0, a2);
            return;
        }
        throw new AssertionError("Assertion failed");
    }
}
