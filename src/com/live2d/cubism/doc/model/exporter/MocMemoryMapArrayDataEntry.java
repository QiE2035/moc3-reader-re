package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryReader;
import com.live2d.util.binary.CBinaryWriter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.cq  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cq.class */
final class MocMemoryMapArrayDataEntry<T> extends ACMocMemoryMapEntry {


    /* renamed from: a */
    private final Function1<EmMoc3Source, List<T>> mGetSourceFunc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MocMemoryMapArrayDataEntry(int align, Function1<EmMoc3Source, List<T>> getSourceFunc) {
        super(align);
        //Intrinsics.checkParameterIsNotNull(getSourceFunc, "getSourceFunc");
        this.mGetSourceFunc = getSourceFunc;
    }

    public /* synthetic */ MocMemoryMapArrayDataEntry(int i, Function1 function1, int i2) {
        this((i2 & 1) != 0 ? 64 : i, function1);
    }

    @Override // com.live2d.cubism.doc.model.exporter.ACMocMemoryMapEntry
    /* renamed from: d */
    protected void doWriteToMemory(EmMoc3Source moc, CBinaryWriter writer) {
        writer.writeArray((List) this.mGetSourceFunc.invoke(moc));
    }

    @Override
    protected void doReadToMemory(EmMoc3Source moc, CBinaryReader reader) {
        List data = mGetSourceFunc.invoke(moc);
        Lambda getSourceFunc = (Lambda) mGetSourceFunc;
        int count = getSourceFunc.getCount();
        if (count == -1) {
            count = (reader.getEndPos() - reader.getPosition()) / Integer.BYTES;
        }
        Class<?> type = getSourceFunc.getType();
        if (type == Integer.TYPE) {
            reader.readIntArray(data, count);
        } else if (type == Boolean.TYPE) {
            reader.readBoolArray(data, count);
        } else if (type == Float.TYPE) {
            reader.readFloatArray(data, count);
        } else if (type == Short.TYPE) {
            reader.readShortArray(data, count);
        } else if (type == Byte.TYPE) {
            reader.readByteArray(data, count);
        } else if (type == EmDeformerType.class) {
            reader.readIntArray(data, count);
            data.replaceAll(o -> EmDeformerType.fromNumber((Integer) o));
        } else if (type == EmDrawOrderGroupItemType.class) {
            reader.readIntArray(data, count);
            data.replaceAll(o -> EmDrawOrderGroupItemType.fromNumber((Integer) o));
        }
    }
}
