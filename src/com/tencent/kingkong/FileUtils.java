package com.tencent.kingkong;

import com.tencent.kingkong.support.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtils
{
  private static final Pattern SAFE_FILENAME_PATTERN = Pattern.compile("[\\w%+,./=_-]+");
  public static final int S_IRGRP = 32;
  public static final int S_IROTH = 4;
  public static final int S_IRUSR = 256;
  public static final int S_IRWXG = 56;
  public static final int S_IRWXO = 7;
  public static final int S_IRWXU = 448;
  public static final int S_IWGRP = 16;
  public static final int S_IWOTH = 2;
  public static final int S_IWUSR = 128;
  public static final int S_IXGRP = 8;
  public static final int S_IXOTH = 1;
  public static final int S_IXUSR = 64;
  private static final String TAG = "FileUtils";
  
  /* Error */
  public static long checksumCrc32(File paramFile)
  {
    // Byte code:
    //   0: new 59	java/util/zip/CRC32
    //   3: dup
    //   4: invokespecial 60	java/util/zip/CRC32:<init>	()V
    //   7: astore 4
    //   9: new 62	java/util/zip/CheckedInputStream
    //   12: dup
    //   13: new 64	java/io/FileInputStream
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 67	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   21: aload 4
    //   23: invokespecial 70	java/util/zip/CheckedInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Checksum;)V
    //   26: astore_3
    //   27: sipush 128
    //   30: newarray <illegal type>
    //   32: astore_0
    //   33: aload_3
    //   34: aload_0
    //   35: invokevirtual 74	java/util/zip/CheckedInputStream:read	([B)I
    //   38: ifge -5 -> 33
    //   41: aload 4
    //   43: invokevirtual 78	java/util/zip/CRC32:getValue	()J
    //   46: lstore_1
    //   47: aload_3
    //   48: invokevirtual 81	java/util/zip/CheckedInputStream:close	()V
    //   51: lload_1
    //   52: lreturn
    //   53: astore_0
    //   54: aconst_null
    //   55: astore_3
    //   56: aload_3
    //   57: ifnull +7 -> 64
    //   60: aload_3
    //   61: invokevirtual 81	java/util/zip/CheckedInputStream:close	()V
    //   64: aload_0
    //   65: athrow
    //   66: astore_0
    //   67: lload_1
    //   68: lreturn
    //   69: astore_3
    //   70: goto -6 -> 64
    //   73: astore_0
    //   74: goto -18 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	paramFile	File
    //   46	22	1	l	long
    //   26	35	3	localCheckedInputStream	java.util.zip.CheckedInputStream
    //   69	1	3	localIOException	IOException
    //   7	35	4	localCRC32	java.util.zip.CRC32
    // Exception table:
    //   from	to	target	type
    //   9	27	53	finally
    //   47	51	66	java/io/IOException
    //   60	64	69	java/io/IOException
    //   27	33	73	finally
    //   33	47	73	finally
  }
  
  public static boolean copyFile(File paramFile1, File paramFile2)
  {
    try
    {
      paramFile1 = new FileInputStream(paramFile1);
      try
      {
        boolean bool = copyToFile(paramFile1, paramFile2);
        return bool;
      }
      finally
      {
        paramFile1.close();
      }
      return false;
    }
    catch (IOException paramFile1) {}
  }
  
  /* Error */
  public static boolean copyToFile(InputStream paramInputStream, File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 96	java/io/File:exists	()Z
    //   4: ifeq +8 -> 12
    //   7: aload_1
    //   8: invokevirtual 99	java/io/File:delete	()Z
    //   11: pop
    //   12: new 101	java/io/FileOutputStream
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 102	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   20: astore_1
    //   21: sipush 4096
    //   24: newarray <illegal type>
    //   26: astore_3
    //   27: aload_0
    //   28: aload_3
    //   29: invokevirtual 103	java/io/InputStream:read	([B)I
    //   32: istore_2
    //   33: iload_2
    //   34: iflt +31 -> 65
    //   37: aload_1
    //   38: aload_3
    //   39: iconst_0
    //   40: iload_2
    //   41: invokevirtual 107	java/io/FileOutputStream:write	([BII)V
    //   44: goto -17 -> 27
    //   47: astore_0
    //   48: aload_1
    //   49: invokevirtual 110	java/io/FileOutputStream:flush	()V
    //   52: aload_1
    //   53: invokevirtual 114	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   56: invokevirtual 119	java/io/FileDescriptor:sync	()V
    //   59: aload_1
    //   60: invokevirtual 120	java/io/FileOutputStream:close	()V
    //   63: aload_0
    //   64: athrow
    //   65: aload_1
    //   66: invokevirtual 110	java/io/FileOutputStream:flush	()V
    //   69: aload_1
    //   70: invokevirtual 114	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   73: invokevirtual 119	java/io/FileDescriptor:sync	()V
    //   76: aload_1
    //   77: invokevirtual 120	java/io/FileOutputStream:close	()V
    //   80: iconst_1
    //   81: ireturn
    //   82: astore_3
    //   83: goto -24 -> 59
    //   86: astore_0
    //   87: goto -11 -> 76
    //   90: astore_0
    //   91: iconst_0
    //   92: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	paramInputStream	InputStream
    //   0	93	1	paramFile	File
    //   32	9	2	i	int
    //   26	13	3	arrayOfByte	byte[]
    //   82	1	3	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   21	27	47	finally
    //   27	33	47	finally
    //   37	44	47	finally
    //   52	59	82	java/io/IOException
    //   69	76	86	java/io/IOException
    //   0	12	90	java/io/IOException
    //   12	21	90	java/io/IOException
    //   48	52	90	java/io/IOException
    //   59	65	90	java/io/IOException
    //   65	69	90	java/io/IOException
    //   76	80	90	java/io/IOException
  }
  
  public static void deleteOlderFiles(File paramFile, int paramInt, long paramLong)
  {
    if ((paramInt < 0) || (paramLong < 0L)) {
      throw new IllegalArgumentException("Constraints must be positive or 0");
    }
    paramFile = paramFile.listFiles();
    if (paramFile == null) {}
    for (;;)
    {
      return;
      Arrays.sort(paramFile, new Comparator()
      {
        public final int compare(File paramAnonymousFile1, File paramAnonymousFile2)
        {
          return (int)(paramAnonymousFile2.lastModified() - paramAnonymousFile1.lastModified());
        }
      });
      while (paramInt < paramFile.length)
      {
        Object localObject = paramFile[paramInt];
        if (System.currentTimeMillis() - ((File)localObject).lastModified() > paramLong)
        {
          Log.d("FileUtils", "Deleting old file " + localObject);
          ((File)localObject).delete();
        }
        paramInt += 1;
      }
    }
  }
  
  public static boolean isFilenameSafe(File paramFile)
  {
    return SAFE_FILENAME_PATTERN.matcher(paramFile.getPath()).matches();
  }
  
  public static String readTextFile(File paramFile, int paramInt, String paramString)
  {
    File localFile = null;
    int j = 1;
    int i = 0;
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(localFileInputStream);
    for (;;)
    {
      long l;
      Object localObject;
      try
      {
        l = paramFile.length();
        if (paramInt > 0) {
          break label456;
        }
        if ((l > 0L) && (paramInt == 0))
        {
          break label456;
          paramFile = new byte[i + 1];
          paramInt = localBufferedInputStream.read(paramFile);
          if (paramInt <= 0) {
            return "";
          }
          if (paramInt <= i)
          {
            paramFile = new String(paramFile, 0, paramInt);
            return paramFile;
          }
          if (paramString == null)
          {
            paramFile = new String(paramFile, 0, i);
            return paramFile;
          }
          paramFile = new String(paramFile, 0, i) + paramString;
          return paramFile;
        }
        if (paramInt < 0)
        {
          paramFile = null;
          if (localFile != null) {
            i = 1;
          }
          localObject = localFile;
          if (localFile == null)
          {
            k = -paramInt;
            localObject = new byte[k];
          }
          int k = localBufferedInputStream.read((byte[])localObject);
          if (k == localObject.length) {
            break label447;
          }
          if ((paramFile == null) && (k <= 0)) {
            return "";
          }
          if (paramFile == null)
          {
            paramFile = new String((byte[])localObject, 0, k);
            return paramFile;
          }
          if (k > 0)
          {
            System.arraycopy(paramFile, k, paramFile, 0, paramFile.length - k);
            System.arraycopy(localObject, 0, paramFile, paramFile.length - k, k);
            i = j;
            break label486;
            paramFile = new String(paramFile);
            return paramFile;
            paramFile = paramString + new String(paramFile);
            return paramFile;
          }
        }
        else
        {
          paramFile = new ByteArrayOutputStream();
          paramString = new byte['Ѐ'];
          paramInt = localBufferedInputStream.read(paramString);
          if (paramInt > 0) {
            paramFile.write(paramString, 0, paramInt);
          }
          if (paramInt == 1024) {
            continue;
          }
          paramFile = paramFile.toString();
          return paramFile;
        }
      }
      finally
      {
        localBufferedInputStream.close();
        localFileInputStream.close();
      }
      break label486;
      label447:
      localFile = paramFile;
      paramFile = (File)localObject;
      continue;
      label456:
      i = paramInt;
      if (l > 0L) {
        if (paramInt != 0)
        {
          i = paramInt;
          if (l >= paramInt) {}
        }
        else
        {
          i = (int)l;
          continue;
          label486:
          if (paramString != null) {
            if (i != 0) {}
          }
        }
      }
    }
  }
  
  public static native int setPermissions(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public static void stringToFile(String paramString1, String paramString2)
  {
    paramString1 = new FileWriter(paramString1);
    try
    {
      paramString1.write(paramString2);
      return;
    }
    finally
    {
      paramString1.close();
    }
  }
  
  public static boolean sync(FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream != null) {}
    try
    {
      paramFileOutputStream.getFD().sync();
      return true;
    }
    catch (IOException paramFileOutputStream) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     com.tencent.kingkong.FileUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */