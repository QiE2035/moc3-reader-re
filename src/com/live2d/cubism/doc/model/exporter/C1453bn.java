package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.bn */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bn.class */
final class C1453bn extends Lambda implements Function1<EmMoc3Source, Integer> {

    /* renamed from: a */
    public static final C1453bn f3760a = new C1453bn();

    C1453bn() {
        super();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Integer invoke(EmMoc3Source cbVar) {
        return m23802a(cbVar);
    }

    /* renamed from: a */
    public int m23802a(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return receiver.getEmModelSource().getEmGlueSources().getSize();
    }
}
