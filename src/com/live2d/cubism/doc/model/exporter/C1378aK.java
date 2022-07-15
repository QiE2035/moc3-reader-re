package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aK */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aK.class */
final class C1378aK extends Lambda implements Function1<EmMoc3Source, List<Float>> {

    /* renamed from: a */
    public static final C1378aK f3552a = new C1378aK();


    C1378aK() {
        super();
    }

    /* renamed from: a */
    public List<Float> invoke(EmMoc3Source receiver) {

        type = Float.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(8);
        return receiver.getEmModelSource().getEmRotationDeformerKeyformSources().getAngle();
    }
}
