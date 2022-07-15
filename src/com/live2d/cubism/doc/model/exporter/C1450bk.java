package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bk */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bk.class */
final class C1450bk extends Lambda implements Function1<EmMoc3Source, List<EmDrawOrderGroupItemType>> {

    /* renamed from: a */
    public static final C1450bk f3757a = new C1450bk();


    C1450bk() {
        super();
    }

    /* renamed from: a */
    public List<EmDrawOrderGroupItemType> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        type = EmDrawOrderGroupItemType.class;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(19);
        return receiver.getEmModelSource().getEmDrawOrderGroupObjectSources().getType();
    }
}
