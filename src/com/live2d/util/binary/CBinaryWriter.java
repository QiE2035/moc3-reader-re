package com.live2d.util.binary;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function2;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/* renamed from: com.live2d.util.c.b  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/util/c/b.class */
public final class CBinaryWriter {

    /* renamed from: d */
    private final ByteBuffer _tmpBuf;
    /* renamed from: b */
    private final ByteArrayOutputStream _bout = new ByteArrayOutputStream();

    /* renamed from: c */
    private final byte[] byteArr = new byte[8];
    /* renamed from: f */
    private final Map<Class<?>, Function2<CBinaryWriter, Object>> writeFuns = new HashMap<>();
    /* renamed from: e */
    private boolean littleEndian = true;

    public CBinaryWriter() {
        this._tmpBuf = ByteBuffer.wrap(this.byteArr);
        setLittleEndian(true);
    }

    /* renamed from: a */
    public static /* synthetic */ void doWriteAnsiString(CBinaryWriter writer, String str, boolean endZero, int i) {
        if ((i & 2) != 0) {
            endZero = false;
        }
        writer.writeAnsiString(str, endZero);
    }

    /* renamed from: a */
    public void setLittleEndian(boolean z) {
        this.littleEndian = z;
        setEndian();
    }

    /* renamed from: d */
    private void setEndian() {
        this._tmpBuf.order(this.littleEndian ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public int getBytePosition() {
        return this._bout.size();
    }

    /* renamed from: a */
    public void writeU1(byte b) {
        this._tmpBuf.position(0);
        this._tmpBuf.put(b);
        this._bout.write(this.byteArr, 0, 1);
    }

    /* renamed from: a */
    public void writeU2(short s) {
        this._tmpBuf.position(0);
        this._tmpBuf.putShort(s);
        this._bout.write(this.byteArr, 0, 2);
    }

    /* renamed from: a */
    public void writeU4(int i) {
        this._tmpBuf.position(0);
        this._tmpBuf.putInt(i);
        this._bout.write(this.byteArr, 0, 4);
    }

    /* renamed from: a */
    public void writeU4(float f) {
        this._tmpBuf.position(0);
        this._tmpBuf.putFloat(f);
        this._bout.write(this.byteArr, 0, 4);
    }

    /* renamed from: a */
    public void writeU8(long l) {
        this._tmpBuf.position(0);
        this._tmpBuf.putLong(l);
        this._bout.write(this.byteArr, 0, 8);
    }

    /* renamed from: a */
    public void writeAnsiString(String value, boolean endZero) {
        for (byte b : value.getBytes(StandardCharsets.UTF_8)) {
            write(b);
        }
        if (endZero) {
            write(0);
        }
    }

    /* renamed from: a */
    public void write(Object value) {
        if (value instanceof Byte) {
            writeU1(((Number) value).byteValue());
        } else if (value instanceof Short) {
            writeU2(((Number) value).shortValue());
        } else if (value instanceof Integer) {
            writeU4(((Number) value).intValue());
        } else if (value instanceof Float) {
            writeU4(((Number) value).floatValue());
        } else if (value instanceof Long) {
            writeU8(((Number) value).longValue());
        } else if (value instanceof String) {
            doWriteAnsiString(this, (String) value, false, 2);
        } else if (value instanceof Boolean) {
            writeU4((Boolean) value ? 1 : 0);
        } else {
            Function2<CBinaryWriter, Object> function2 = this.writeFuns.get(value.getClass());
            if (function2 != null) {
                function2.invoke(this, value);
            } else {
                throw new IllegalArgumentException("Not supported type: " + value.getClass().getSimpleName());
            }
        }
    }

    /* renamed from: a */
    public void writeArrayU1(byte[] values) {
        for (byte b : values) {
            writeU1(b);
        }
    }

    /* renamed from: a */
    public <T> void writeArray(List<? extends T> values) {
        for (T t : values) {
            write(t);
        }
    }

    /* renamed from: b */
    public void padding(int alignSize) {
        int a = getBytePosition();
        int a2 = CMemoryUtils.INSTANCE.alignOffset(a, alignSize);
        int i = a2 - a;
        if (i > 0) {
            fill((byte) 0, i);
        }
    }

    /* renamed from: a */
    public void fill(byte value, int count) {
        for (int i = 0; i < count; i++) {
            writeU1(value);
        }
    }


    /* renamed from: b */
    public byte[] toByteArray() {
        return this._bout.toByteArray();
    }


    /* renamed from: c */
    public List<Byte> toList() {
        List<Byte> list = new ArrayList<>();
        for (byte b : toByteArray()) {
            list.add(b);
        }
        return list;
    }

    /* renamed from: a */
    public <T> void addwriteFunction(Class<?> clazz, Function2<? super CBinaryWriter, ? super T> func) {
        this.writeFuns.put(clazz, (Function2) func);
    }


}
