package com.tencent.mm.pluginsdk.j.a.c;

import com.tencent.mm.sdk.platformtools.be;
import java.util.Iterator;
import java.util.List;

final class h$2
  implements Runnable
{
  h$2(h paramh, List paramList, k paramk, String paramString) {}
  
  public final void run()
  {
    Iterator localIterator = jbe.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (be.li(localc.aPA()).equals(jbf.jbl)) {
        localc.a(iZV, jbf);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.pluginsdk.j.a.c.h.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */