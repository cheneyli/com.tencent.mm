package com.tencent.mm.plugin.sns.d;

import android.content.SharedPreferences;
import com.tencent.mm.model.ah;
import com.tencent.mm.model.h;
import com.tencent.mm.plugin.sns.h.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.u;

public final class y$a
  extends com.tencent.mm.pluginsdk.model.i
{
  private String buL = "";
  private SharedPreferences bxg = null;
  private String gNV = "";
  PInt gNW = new PInt();
  PInt gNX = new PInt();
  private String gNY;
  private String username;
  
  public y$a(y paramy)
  {
    if (!ah.rh()) {}
    do
    {
      return;
      username = h.sc();
      gNV = ("remove_key_base" + username);
      buL = ("remove_key" + username);
    } while ((!ah.rh()) || (ad.ayQ()) || (ad.rm() == null) || (ad.azk() == null));
    com.tencent.mm.plugin.sns.h.i locali = ad.azk().vr(username);
    if (locali != null) {
      gNY = field_bgId;
    }
    u.d("!32@/B4Tb64lLpL4QFaq/WRDBZyP8HOcjvPZ", "my bgid %s", new Object[] { gNY });
    y.a(paramy, true);
  }
  
  private Boolean ayH()
  {
    u.d("!32@/B4Tb64lLpL4QFaq/WRDBZyP8HOcjvPZ", "simpleCleans sns");
    if (!y.eLm) {
      return Boolean.valueOf(false);
    }
    if (!y.c(gNU)) {
      return Boolean.valueOf(false);
    }
    if (ad.ayQ())
    {
      y.eLm = false;
      return Boolean.valueOf(false);
    }
    gNW.value = bxg.getInt(gNV, 0);
    gNX.value = bxg.getInt(buL, 0);
    String str = ad.ayV();
    try
    {
      long l = System.currentTimeMillis();
      if (!y.A(str + y.gNT[(gNW.value % 36)] + "/" + y.gNT[(gNX.value % 36)], gNY, username)) {
        return Boolean.valueOf(false);
      }
      u.d("!32@/B4Tb64lLpL4QFaq/WRDBZyP8HOcjvPZ", "clean sns uses time : " + (System.currentTimeMillis() - l) + " " + gNW.value + " " + gNX.value);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return Boolean.valueOf(true);
  }
  
  public final aa IA()
  {
    return ad.ayT();
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.sns.d.y.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */