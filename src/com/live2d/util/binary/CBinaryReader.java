package com.live2d.util.binary;

import kotlin.jvm.internal.Intrinsics;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.util.List;


/* renamed from: com.live2d.util.c.a  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/util/c/a.class */
public final class CBinaryReader {

    /* renamed from: b */
    private final ByteBuffer mBuffer;
    /* renamed from: c */
    private boolean isLittelEndian;

    public CBinaryReader(byte[] bytes) {
        Intrinsics.checkParameterIsNotNull(bytes, "bytes");
        /* renamed from: a */
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        Intrinsics.checkExpressionValueIsNotNull(wrap, "ByteBuffer.wrap(_rawBuf)");
        this.mBuffer = wrap;
        this.isLittelEndian = true;
        setLittleEndian(true);
    }

    public static CBinaryReader newFromFile(File file) {
        try {
            return new CBinaryReader(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void setLittleEndian(boolean z) {
        this.isLittelEndian = z;
        setEndian();
    }

    /* renamed from: d */
    private void setEndian() {
        this.mBuffer.order(this.isLittelEndian ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public int readInt() {
        return this.mBuffer.getInt();
    }

    public void readIntArray(List list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(readInt());
        }
    }

    public byte readByte() {
        return mBuffer.get();
    }

    public void padding(int size) {
        mBuffer.position(getPosition() + size);
    }

    public int getPosition() {
        return mBuffer.position();
    }

    public void setPosition(int position) {
        mBuffer.position(position);
    }

    public float readFloat() {
        return mBuffer.getFloat();
    }

    public void readStrArray(List list, int count, int size) {
        for (int i = 0; i < count; i++) {
            list.add(readString(size));
        }
    }

    public String readString(int size) {
        byte[] data = new byte[size];
        mBuffer.get(data);
        return new String(data).trim();
    }

    public void readBoolArray(List list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(readBool());
        }
    }

    public void readFloatArray(List list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(readFloat());
        }
    }

    public void readShortArray(List list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(mBuffer.getShort());
        }
    }

    public boolean readBool() {
        return mBuffer.getInt() == 1;
    }

    public int getEndPos() {
        return mBuffer.limit();
    }

    public void readByteArray(List list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(mBuffer.get());
        }
    }
}
