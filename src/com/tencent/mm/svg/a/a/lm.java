package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class lm
  extends c
{
  private final int height = 80;
  private final int width = 120;
  
  protected final int i(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 120;
      return 80;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.d(paramVarArgs);
      Object localObject2 = c.c(paramVarArgs);
      Paint localPaint1 = c.g(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.g(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 22.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.h(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(14.0F, 0.0F);
      ((Path)localObject2).lineTo(14.0F, 14.0F);
      ((Path)localObject2).lineTo(0.0F, 14.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(22.0F, 0.0F);
      ((Path)localObject2).lineTo(36.0F, 0.0F);
      ((Path)localObject2).lineTo(36.0F, 14.0F);
      ((Path)localObject2).lineTo(22.0F, 14.0F);
      ((Path)localObject2).lineTo(22.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(44.0F, 0.0F);
      ((Path)localObject2).lineTo(58.0F, 0.0F);
      ((Path)localObject2).lineTo(58.0F, 14.0F);
      ((Path)localObject2).lineTo(44.0F, 14.0F);
      ((Path)localObject2).lineTo(44.0F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 22.0F);
      ((Path)localObject2).lineTo(14.0F, 22.0F);
      ((Path)localObject2).lineTo(14.0F, 36.0F);
      ((Path)localObject2).lineTo(0.0F, 36.0F);
      ((Path)localObject2).lineTo(0.0F, 22.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(22.0F, 22.0F);
      ((Path)localObject2).lineTo(36.0F, 22.0F);
      ((Path)localObject2).lineTo(36.0F, 36.0F);
      ((Path)localObject2).lineTo(22.0F, 36.0F);
      ((Path)localObject2).lineTo(22.0F, 22.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(44.0F, 22.0F);
      ((Path)localObject2).lineTo(58.0F, 22.0F);
      ((Path)localObject2).lineTo(58.0F, 36.0F);
      ((Path)localObject2).lineTo(44.0F, 36.0F);
      ((Path)localObject2).lineTo(44.0F, 22.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.f(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.svg.a.a.lm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */