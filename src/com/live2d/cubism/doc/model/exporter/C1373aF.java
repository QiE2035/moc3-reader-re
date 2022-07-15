package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aF */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aF.class */
final class C1373aF extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1373aF f3547a = new C1373aF();


    C1373aF() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(6);
        type = Float.TYPE;
        return receiver.getEmModelSource().getEmPartKeyformSources().getDrawOrder();
    }
}
