package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccintval extends GXProcedure
{
   public pccintval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccintval.class ), "" );
   }

   public pccintval( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 )
   {
      pccintval.this.A396EmprCod = aP0;
      pccintval.this.A4031CCTCod = aP1;
      pccintval.this.A4034CCTLin = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCCDef2

      */
      A4049CCTValLin = (byte)(1) ;
      A4050CCTValDsc = httpContext.getMessage( "Excelente", "") ;
      A4051CCTVal = "0" ;
      /* Using cursor P013F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P013F3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P013F3_A396EmprCod[0] ;
            A4031CCTCod = P013F3_A4031CCTCod[0] ;
            A4034CCTLin = P013F3_A4034CCTLin[0] ;
            A4049CCTValLin = P013F3_A4049CCTValLin[0] ;
            A4050CCTValDsc = P013F3_A4050CCTValDsc[0] ;
            A4051CCTVal = P013F3_A4051CCTVal[0] ;
            A4050CCTValDsc = httpContext.getMessage( "Excelente", "") ;
            A4051CCTVal = "0" ;
            /* Using cursor P013F4 */
            pr_default.execute(2, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCCDef2

      */
      A4049CCTValLin = (byte)(2) ;
      A4050CCTValDsc = httpContext.getMessage( "Correcto", "") ;
      A4051CCTVal = "1" ;
      /* Using cursor P013F5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
      if ( (pr_default.getStatus(3) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P013F6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = P013F6_A396EmprCod[0] ;
            A4031CCTCod = P013F6_A4031CCTCod[0] ;
            A4034CCTLin = P013F6_A4034CCTLin[0] ;
            A4049CCTValLin = P013F6_A4049CCTValLin[0] ;
            A4050CCTValDsc = P013F6_A4050CCTValDsc[0] ;
            A4051CCTVal = P013F6_A4051CCTVal[0] ;
            A4050CCTValDsc = httpContext.getMessage( "Correcto", "") ;
            A4051CCTVal = "1" ;
            /* Using cursor P013F7 */
            pr_default.execute(5, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCCDef2

      */
      A4049CCTValLin = (byte)(3) ;
      A4050CCTValDsc = httpContext.getMessage( "Pasado Control", "") ;
      A4051CCTVal = "2" ;
      /* Using cursor P013F8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
      if ( (pr_default.getStatus(6) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P013F9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A396EmprCod = P013F9_A396EmprCod[0] ;
            A4031CCTCod = P013F9_A4031CCTCod[0] ;
            A4034CCTLin = P013F9_A4034CCTLin[0] ;
            A4049CCTValLin = P013F9_A4049CCTValLin[0] ;
            A4050CCTValDsc = P013F9_A4050CCTValDsc[0] ;
            A4051CCTVal = P013F9_A4051CCTVal[0] ;
            A4050CCTValDsc = httpContext.getMessage( "Pasado Control", "") ;
            A4051CCTVal = "2" ;
            /* Using cursor P013F10 */
            pr_default.execute(8, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCCDef2

      */
      A4049CCTValLin = (byte)(4) ;
      A4050CCTValDsc = httpContext.getMessage( "Límite de Calidad", "") ;
      A4051CCTVal = "3" ;
      /* Using cursor P013F11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
      if ( (pr_default.getStatus(9) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P013F12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A396EmprCod = P013F12_A396EmprCod[0] ;
            A4031CCTCod = P013F12_A4031CCTCod[0] ;
            A4034CCTLin = P013F12_A4034CCTLin[0] ;
            A4049CCTValLin = P013F12_A4049CCTValLin[0] ;
            A4050CCTValDsc = P013F12_A4050CCTValDsc[0] ;
            A4051CCTVal = P013F12_A4051CCTVal[0] ;
            A4050CCTValDsc = httpContext.getMessage( "Límite de Calidad", "") ;
            A4051CCTVal = "3" ;
            /* Using cursor P013F13 */
            pr_default.execute(11, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCCDef2

      */
      A4049CCTValLin = (byte)(5) ;
      A4050CCTValDsc = httpContext.getMessage( "Incorrecto", "") ;
      A4051CCTVal = "4" ;
      /* Using cursor P013F14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
      if ( (pr_default.getStatus(12) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P013F15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A396EmprCod = P013F15_A396EmprCod[0] ;
            A4031CCTCod = P013F15_A4031CCTCod[0] ;
            A4034CCTLin = P013F15_A4034CCTLin[0] ;
            A4049CCTValLin = P013F15_A4049CCTValLin[0] ;
            A4050CCTValDsc = P013F15_A4050CCTValDsc[0] ;
            A4051CCTVal = P013F15_A4051CCTVal[0] ;
            A4050CCTValDsc = httpContext.getMessage( "Incorrecto", "") ;
            A4051CCTVal = "4" ;
            /* Using cursor P013F16 */
            pr_default.execute(14, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCCDef2

      */
      A4049CCTValLin = (byte)(6) ;
      A4050CCTValDsc = httpContext.getMessage( "Retrocedido en el control", "") ;
      A4051CCTVal = "5" ;
      /* Using cursor P013F17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
      if ( (pr_default.getStatus(15) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P013F18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         while ( (pr_default.getStatus(16) != 101) )
         {
            A396EmprCod = P013F18_A396EmprCod[0] ;
            A4031CCTCod = P013F18_A4031CCTCod[0] ;
            A4034CCTLin = P013F18_A4034CCTLin[0] ;
            A4049CCTValLin = P013F18_A4049CCTValLin[0] ;
            A4050CCTValDsc = P013F18_A4050CCTValDsc[0] ;
            A4051CCTVal = P013F18_A4051CCTVal[0] ;
            A4050CCTValDsc = httpContext.getMessage( "Retrocedido en el control", "") ;
            A4051CCTVal = "5" ;
            /* Using cursor P013F19 */
            pr_default.execute(17, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(16);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.pccintval");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P013F3_A396EmprCod = new String[] {""} ;
      P013F3_A4031CCTCod = new int[1] ;
      P013F3_A4034CCTLin = new short[1] ;
      P013F3_A4049CCTValLin = new byte[1] ;
      P013F3_A4050CCTValDsc = new String[] {""} ;
      P013F3_A4051CCTVal = new String[] {""} ;
      P013F6_A396EmprCod = new String[] {""} ;
      P013F6_A4031CCTCod = new int[1] ;
      P013F6_A4034CCTLin = new short[1] ;
      P013F6_A4049CCTValLin = new byte[1] ;
      P013F6_A4050CCTValDsc = new String[] {""} ;
      P013F6_A4051CCTVal = new String[] {""} ;
      P013F9_A396EmprCod = new String[] {""} ;
      P013F9_A4031CCTCod = new int[1] ;
      P013F9_A4034CCTLin = new short[1] ;
      P013F9_A4049CCTValLin = new byte[1] ;
      P013F9_A4050CCTValDsc = new String[] {""} ;
      P013F9_A4051CCTVal = new String[] {""} ;
      P013F12_A396EmprCod = new String[] {""} ;
      P013F12_A4031CCTCod = new int[1] ;
      P013F12_A4034CCTLin = new short[1] ;
      P013F12_A4049CCTValLin = new byte[1] ;
      P013F12_A4050CCTValDsc = new String[] {""} ;
      P013F12_A4051CCTVal = new String[] {""} ;
      P013F15_A396EmprCod = new String[] {""} ;
      P013F15_A4031CCTCod = new int[1] ;
      P013F15_A4034CCTLin = new short[1] ;
      P013F15_A4049CCTValLin = new byte[1] ;
      P013F15_A4050CCTValDsc = new String[] {""} ;
      P013F15_A4051CCTVal = new String[] {""} ;
      P013F18_A396EmprCod = new String[] {""} ;
      P013F18_A4031CCTCod = new int[1] ;
      P013F18_A4034CCTLin = new short[1] ;
      P013F18_A4049CCTValLin = new byte[1] ;
      P013F18_A4050CCTValDsc = new String[] {""} ;
      P013F18_A4051CCTVal = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccintval__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P013F3_A396EmprCod, P013F3_A4031CCTCod, P013F3_A4034CCTLin, P013F3_A4049CCTValLin, P013F3_A4050CCTValDsc, P013F3_A4051CCTVal
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P013F6_A396EmprCod, P013F6_A4031CCTCod, P013F6_A4034CCTLin, P013F6_A4049CCTValLin, P013F6_A4050CCTValDsc, P013F6_A4051CCTVal
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P013F9_A396EmprCod, P013F9_A4031CCTCod, P013F9_A4034CCTLin, P013F9_A4049CCTValLin, P013F9_A4050CCTValDsc, P013F9_A4051CCTVal
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P013F12_A396EmprCod, P013F12_A4031CCTCod, P013F12_A4034CCTLin, P013F12_A4049CCTValLin, P013F12_A4050CCTValDsc, P013F12_A4051CCTVal
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P013F15_A396EmprCod, P013F15_A4031CCTCod, P013F15_A4034CCTLin, P013F15_A4049CCTValLin, P013F15_A4050CCTValDsc, P013F15_A4051CCTVal
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P013F18_A396EmprCod, P013F18_A4031CCTCod, P013F18_A4034CCTLin, P013F18_A4049CCTValLin, P013F18_A4050CCTValDsc, P013F18_A4051CCTVal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4049CCTValLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private int GX_INS623 ;
   private String A396EmprCod ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private String[] P013F3_A396EmprCod ;
   private int[] P013F3_A4031CCTCod ;
   private short[] P013F3_A4034CCTLin ;
   private byte[] P013F3_A4049CCTValLin ;
   private String[] P013F3_A4050CCTValDsc ;
   private String[] P013F3_A4051CCTVal ;
   private String[] P013F6_A396EmprCod ;
   private int[] P013F6_A4031CCTCod ;
   private short[] P013F6_A4034CCTLin ;
   private byte[] P013F6_A4049CCTValLin ;
   private String[] P013F6_A4050CCTValDsc ;
   private String[] P013F6_A4051CCTVal ;
   private String[] P013F9_A396EmprCod ;
   private int[] P013F9_A4031CCTCod ;
   private short[] P013F9_A4034CCTLin ;
   private byte[] P013F9_A4049CCTValLin ;
   private String[] P013F9_A4050CCTValDsc ;
   private String[] P013F9_A4051CCTVal ;
   private String[] P013F12_A396EmprCod ;
   private int[] P013F12_A4031CCTCod ;
   private short[] P013F12_A4034CCTLin ;
   private byte[] P013F12_A4049CCTValLin ;
   private String[] P013F12_A4050CCTValDsc ;
   private String[] P013F12_A4051CCTVal ;
   private String[] P013F15_A396EmprCod ;
   private int[] P013F15_A4031CCTCod ;
   private short[] P013F15_A4034CCTLin ;
   private byte[] P013F15_A4049CCTValLin ;
   private String[] P013F15_A4050CCTValDsc ;
   private String[] P013F15_A4051CCTVal ;
   private String[] P013F18_A396EmprCod ;
   private int[] P013F18_A4031CCTCod ;
   private short[] P013F18_A4034CCTLin ;
   private byte[] P013F18_A4049CCTValLin ;
   private String[] P013F18_A4050CCTValDsc ;
   private String[] P013F18_A4051CCTVal ;
}

final  class pccintval__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P013F2", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new ForEachCursor("P013F3", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = 1 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P013F4", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new UpdateCursor("P013F5", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new ForEachCursor("P013F6", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = 2 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P013F7", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new UpdateCursor("P013F8", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new ForEachCursor("P013F9", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = 3 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P013F10", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new UpdateCursor("P013F11", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new ForEachCursor("P013F12", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = 4 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P013F13", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new UpdateCursor("P013F14", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new ForEachCursor("P013F15", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = 5 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P013F16", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new UpdateCursor("P013F17", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new ForEachCursor("P013F18", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = 6 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P013F19", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

