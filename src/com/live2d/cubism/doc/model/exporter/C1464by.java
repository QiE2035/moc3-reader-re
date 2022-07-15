package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.by */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/by.class */
final class C1464by extends Lambda implements Function1<EmMoc3Source, List<Short>> {

    /* renamed from: a */
    public static final C1464by f3771a = new C1464by();


    C1464by() {
        super();
    }

    /* renamed from: a */
    public List<Short> invoke(EmMoc3Source receiver) {

        type = Short.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(21);
        return receiver.getEmModelSource().getEmGlueInfoSources().getPositionIndex();
    }
}
