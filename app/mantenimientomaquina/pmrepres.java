package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmrepres extends GXProcedure
{
   public pmrepres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmrepres.class ), "" );
   }

   public pmrepres( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     int[] aP2 ,
                                     int[] aP3 ,
                                     String[] aP4 ,
                                     byte[] aP5 ,
                                     java.math.BigDecimal[] aP6 ,
                                     java.math.BigDecimal[] aP7 ,
                                     String[] aP8 )
   {
      pmrepres.this.aP9 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        java.util.Date[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             java.util.Date[] aP9 )
   {
      pmrepres.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmrepres.this.A9425OMCod = aP1[0];
      this.aP1 = aP1;
      pmrepres.this.A9446OMRepCod = aP2[0];
      this.aP2 = aP2;
      pmrepres.this.AV13MRResTpo = aP3[0];
      this.aP3 = aP3;
      pmrepres.this.AV12MRResDsc = aP4[0];
      this.aP4 = aP4;
      pmrepres.this.AV14Sal = aP5[0];
      this.aP5 = aP5;
      pmrepres.this.AV9oOMRRCnt = aP6[0];
      this.aP6 = aP6;
      pmrepres.this.AV8nOMRRCnt = aP7[0];
      this.aP7 = aP7;
      pmrepres.this.AV16Op = aP8[0];
      this.aP8 = aP8;
      pmrepres.this.AV15MRResFch = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV16Op, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(AV16Op, httpContext.getMessage( "O", "")) == 0 ) )
      {
         AV19GXLvl4 = (byte)(0) ;
         /* Using cursor P03MP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9449OMRTpo = P03MP2_A9449OMRTpo[0] ;
            A9450OMRRCnt = P03MP2_A9450OMRRCnt[0] ;
            if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 )
            {
               AV19GXLvl4 = (byte)(1) ;
               A9450OMRRCnt = A9450OMRRCnt.add((AV8nOMRRCnt.subtract(AV9oOMRRCnt))) ;
               if ( A9450OMRRCnt.doubleValue() <= 0 )
               {
                  /* Using cursor P03MP3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
               }
               /* Using cursor P03MP4 */
               pr_default.execute(2, new Object[] {A9450OMRRCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV19GXLvl4 == 0 )
         {
            if ( AV8nOMRRCnt.doubleValue() > 0 )
            {
               /*
                  INSERT RECORD ON TABLE TXPMOrRep

               */
               A9449OMRTpo = httpContext.getMessage( "R", "") ;
               A9450OMRRCnt = AV8nOMRRCnt.subtract(AV9oOMRRCnt) ;
               /* Using cursor P03MP5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo, A9450OMRRCnt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
               if ( (pr_default.getStatus(3) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
               /* Using cursor P03MP6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A9449OMRTpo = P03MP6_A9449OMRTpo[0] ;
                  A9448OMRepPre = P03MP6_A9448OMRepPre[0] ;
                  n9448OMRepPre = P03MP6_n9448OMRepPre[0] ;
                  A9451OMRRPre = P03MP6_A9451OMRRPre[0] ;
                  A9448OMRepPre = P03MP6_A9448OMRepPre[0] ;
                  n9448OMRepPre = P03MP6_n9448OMRepPre[0] ;
                  if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9451OMRRPre = A9448OMRepPre ;
                     /* Using cursor P03MP7 */
                     pr_default.execute(5, new Object[] {A9451OMRRPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                  }
                  pr_default.readNext(4);
               }
               pr_default.close(4);
            }
         }
      }
      if ( ( GXutil.strcmp(AV16Op, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(AV16Op, httpContext.getMessage( "R", "")) == 0 ) )
      {
         /* Using cursor P03MP8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A9492MRCod = P03MP8_A9492MRCod[0] ;
            A9501MRUltRes = P03MP8_A9501MRUltRes[0] ;
            n9501MRUltRes = P03MP8_n9501MRUltRes[0] ;
            A9496MRStkRes = P03MP8_A9496MRStkRes[0] ;
            n9496MRStkRes = P03MP8_n9496MRStkRes[0] ;
            /* Noskip command */
            A9496MRStkRes = A9496MRStkRes.add((AV8nOMRRCnt.subtract(AV9oOMRRCnt))) ;
            n9496MRStkRes = false ;
            /* Using cursor P03MP9 */
            pr_default.execute(7, new Object[] {Boolean.valueOf(n9496MRStkRes), A9496MRStkRes, A396EmprCod, Integer.valueOf(A9492MRCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         /* Using cursor P03MP10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A9492MRCod = P03MP10_A9492MRCod[0] ;
            A9501MRUltRes = P03MP10_A9501MRUltRes[0] ;
            n9501MRUltRes = P03MP10_n9501MRUltRes[0] ;
            AV23GXLvl40 = (byte)(0) ;
            /* Using cursor P03MP11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9425OMCod), Integer.valueOf(AV13MRResTpo)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A9511MRResOrd = P03MP11_A9511MRResOrd[0] ;
               A9513MRResTpo = P03MP11_A9513MRResTpo[0] ;
               A9516MRResCnt = P03MP11_A9516MRResCnt[0] ;
               A9512MRResFch = P03MP11_A9512MRResFch[0] ;
               A9510MRRes = P03MP11_A9510MRRes[0] ;
               AV23GXLvl40 = (byte)(1) ;
               /* Noskip command */
               A9516MRResCnt = A9516MRResCnt.add((AV8nOMRRCnt.subtract(AV9oOMRRCnt))) ;
               A9512MRResFch = AV15MRResFch ;
               if ( ( A9516MRResCnt.doubleValue() == 0 ) || ( ( A9516MRResCnt.doubleValue() < 0 ) && ( AV14Sal == 0 ) ) )
               {
                  /* Using cursor P03MP12 */
                  pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P03MP13 */
               pr_default.execute(11, new Object[] {A9516MRResCnt, A9512MRResFch, A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
               if (true) break;
               /* Using cursor P03MP14 */
               pr_default.execute(12, new Object[] {A9516MRResCnt, A9512MRResFch, A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
               pr_default.readNext(9);
            }
            pr_default.close(9);
            if ( AV23GXLvl40 == 0 )
            {
               if ( ( AV8nOMRRCnt.subtract(AV9oOMRRCnt).doubleValue() > 0 ) || ( ( AV8nOMRRCnt.subtract(AV9oOMRRCnt).doubleValue() < 0 ) && ( AV14Sal == 1 ) ) )
               {
                  A9501MRUltRes = (long)(A9501MRUltRes+1) ;
                  n9501MRUltRes = false ;
                  AV10MRUltRes = A9501MRUltRes ;
                  /*
                     INSERT RECORD ON TABLE TXPMReRes

                  */
                  A9510MRRes = AV10MRUltRes ;
                  A9515MRResDsc = AV12MRResDsc ;
                  A9512MRResFch = AV15MRResFch ;
                  A9511MRResOrd = A9425OMCod ;
                  A9513MRResTpo = AV13MRResTpo ;
                  A9516MRResCnt = AV8nOMRRCnt.subtract(AV9oOMRRCnt) ;
                  /* Using cursor P03MP15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes), Integer.valueOf(A9511MRResOrd), A9512MRResFch, Integer.valueOf(A9513MRResTpo), A9515MRResDsc, A9516MRResCnt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
                  if ( (pr_default.getStatus(13) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
               }
            }
            /* Using cursor P03MP16 */
            pr_default.execute(14, new Object[] {Boolean.valueOf(n9501MRUltRes), Long.valueOf(A9501MRUltRes), A396EmprCod, Integer.valueOf(A9492MRCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmrepres.this.A396EmprCod;
      this.aP1[0] = pmrepres.this.A9425OMCod;
      this.aP2[0] = pmrepres.this.A9446OMRepCod;
      this.aP3[0] = pmrepres.this.AV13MRResTpo;
      this.aP4[0] = pmrepres.this.AV12MRResDsc;
      this.aP5[0] = pmrepres.this.AV14Sal;
      this.aP6[0] = pmrepres.this.AV9oOMRRCnt;
      this.aP7[0] = pmrepres.this.AV8nOMRRCnt;
      this.aP8[0] = pmrepres.this.AV16Op;
      this.aP9[0] = pmrepres.this.AV15MRResFch;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P03MP2_A396EmprCod = new String[] {""} ;
      P03MP2_A9425OMCod = new int[1] ;
      P03MP2_A9446OMRepCod = new int[1] ;
      P03MP2_A9449OMRTpo = new String[] {""} ;
      P03MP2_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9449OMRTpo = "" ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P03MP6_A396EmprCod = new String[] {""} ;
      P03MP6_A9425OMCod = new int[1] ;
      P03MP6_A9446OMRepCod = new int[1] ;
      P03MP6_A9449OMRTpo = new String[] {""} ;
      P03MP6_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MP6_n9448OMRepPre = new boolean[] {false} ;
      P03MP6_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      P03MP8_A396EmprCod = new String[] {""} ;
      P03MP8_A9492MRCod = new int[1] ;
      P03MP8_A9501MRUltRes = new long[1] ;
      P03MP8_n9501MRUltRes = new boolean[] {false} ;
      P03MP8_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MP8_n9496MRStkRes = new boolean[] {false} ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      P03MP10_A396EmprCod = new String[] {""} ;
      P03MP10_A9492MRCod = new int[1] ;
      P03MP10_A9501MRUltRes = new long[1] ;
      P03MP10_n9501MRUltRes = new boolean[] {false} ;
      P03MP11_A396EmprCod = new String[] {""} ;
      P03MP11_A9492MRCod = new int[1] ;
      P03MP11_A9511MRResOrd = new int[1] ;
      P03MP11_A9513MRResTpo = new int[1] ;
      P03MP11_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MP11_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      P03MP11_A9510MRRes = new long[1] ;
      A9516MRResCnt = DecimalUtil.ZERO ;
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      A9515MRResDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmrepres__default(),
         new Object[] {
             new Object[] {
            P03MP2_A396EmprCod, P03MP2_A9425OMCod, P03MP2_A9446OMRepCod, P03MP2_A9449OMRTpo, P03MP2_A9450OMRRCnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03MP6_A396EmprCod, P03MP6_A9425OMCod, P03MP6_A9446OMRepCod, P03MP6_A9449OMRTpo, P03MP6_A9448OMRepPre, P03MP6_n9448OMRepPre, P03MP6_A9451OMRRPre
            }
            , new Object[] {
            }
            , new Object[] {
            P03MP8_A396EmprCod, P03MP8_A9492MRCod, P03MP8_A9501MRUltRes, P03MP8_n9501MRUltRes, P03MP8_A9496MRStkRes, P03MP8_n9496MRStkRes
            }
            , new Object[] {
            }
            , new Object[] {
            P03MP10_A396EmprCod, P03MP10_A9492MRCod, P03MP10_A9501MRUltRes, P03MP10_n9501MRUltRes
            }
            , new Object[] {
            P03MP11_A396EmprCod, P03MP11_A9492MRCod, P03MP11_A9511MRResOrd, P03MP11_A9513MRResTpo, P03MP11_A9516MRResCnt, P03MP11_A9512MRResFch, P03MP11_A9510MRRes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Sal ;
   private byte AV19GXLvl4 ;
   private byte AV23GXLvl40 ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int A9446OMRepCod ;
   private int AV13MRResTpo ;
   private int GX_INS1233 ;
   private int A9492MRCod ;
   private int Gx_OldLine ;
   private int A9511MRResOrd ;
   private int A9513MRResTpo ;
   private int GX_INS1240 ;
   private long A9501MRUltRes ;
   private long A9510MRRes ;
   private long AV10MRUltRes ;
   private java.math.BigDecimal AV9oOMRRCnt ;
   private java.math.BigDecimal AV8nOMRRCnt ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9448OMRepPre ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal A9516MRResCnt ;
   private String A396EmprCod ;
   private String AV12MRResDsc ;
   private String AV16Op ;
   private String scmdbuf ;
   private String A9449OMRTpo ;
   private String Gx_emsg ;
   private String A9515MRResDsc ;
   private java.util.Date AV15MRResFch ;
   private java.util.Date A9512MRResFch ;
   private boolean n9448OMRepPre ;
   private boolean n9501MRUltRes ;
   private boolean n9496MRStkRes ;
   private java.util.Date[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MP2_A396EmprCod ;
   private int[] P03MP2_A9425OMCod ;
   private int[] P03MP2_A9446OMRepCod ;
   private String[] P03MP2_A9449OMRTpo ;
   private java.math.BigDecimal[] P03MP2_A9450OMRRCnt ;
   private String[] P03MP6_A396EmprCod ;
   private int[] P03MP6_A9425OMCod ;
   private int[] P03MP6_A9446OMRepCod ;
   private String[] P03MP6_A9449OMRTpo ;
   private java.math.BigDecimal[] P03MP6_A9448OMRepPre ;
   private boolean[] P03MP6_n9448OMRepPre ;
   private java.math.BigDecimal[] P03MP6_A9451OMRRPre ;
   private String[] P03MP8_A396EmprCod ;
   private int[] P03MP8_A9492MRCod ;
   private long[] P03MP8_A9501MRUltRes ;
   private boolean[] P03MP8_n9501MRUltRes ;
   private java.math.BigDecimal[] P03MP8_A9496MRStkRes ;
   private boolean[] P03MP8_n9496MRStkRes ;
   private String[] P03MP10_A396EmprCod ;
   private int[] P03MP10_A9492MRCod ;
   private long[] P03MP10_A9501MRUltRes ;
   private boolean[] P03MP10_n9501MRUltRes ;
   private String[] P03MP11_A396EmprCod ;
   private int[] P03MP11_A9492MRCod ;
   private int[] P03MP11_A9511MRResOrd ;
   private int[] P03MP11_A9513MRResTpo ;
   private java.math.BigDecimal[] P03MP11_A9516MRResCnt ;
   private java.util.Date[] P03MP11_A9512MRResFch ;
   private long[] P03MP11_A9510MRRes ;
}

final  class pmrepres__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MP2", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo, OMRRCnt FROM TXPMOrRep WHERE EmprCod = ? and OMCod = ? and OMRepCod = ? ORDER BY EmprCod, OMCod, OMRepCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MP3", "DELETE FROM TXPMOrRep  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new UpdateCursor("P03MP4", "UPDATE TXPMOrRep SET OMRRCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new UpdateCursor("P03MP5", "INSERT INTO TXPMOrRep(EmprCod, OMCod, OMRepCod, OMRTpo, OMRRCnt, OMRRPre, OMRCCnt, OMRCPre, OMRObs) VALUES(?, ?, ?, ?, ?, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new ForEachCursor("P03MP6", "SELECT T1.EmprCod, T1.OMCod, T1.OMRepCod AS OMRepCod, T1.OMRTpo, T2.MRStkPre AS OMRepPre, T1.OMRRPre FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMRepCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MP7", "UPDATE TXPMOrRep SET OMRRPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new ForEachCursor("P03MP8", "SELECT EmprCod, MRCod, MRUltRes, MRStkRes FROM TXPMREPUE WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03MP9", "UPDATE TXPMREPUE SET MRStkRes=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
         ,new ForEachCursor("P03MP10", "SELECT EmprCod, MRCod, MRUltRes FROM TXPMREPUE WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03MP11", "SELECT EmprCod, MRCod, MRResOrd, MRResTpo, MRResCnt, MRResFch, MRRes FROM TXPMReRes WHERE (EmprCod = ? and MRCod = ?) AND (MRResOrd = ?) AND (MRResTpo = ?) ORDER BY EmprCod, MRCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MP12", "DELETE FROM TXPMReRes  WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReRes")
         ,new UpdateCursor("P03MP13", "UPDATE TXPMReRes SET MRResCnt=?, MRResFch=?  WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReRes")
         ,new UpdateCursor("P03MP14", "UPDATE TXPMReRes SET MRResCnt=?, MRResFch=?  WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReRes")
         ,new UpdateCursor("P03MP15", "INSERT INTO TXPMReRes(EmprCod, MRCod, MRRes, MRResOrd, MRResFch, MRResTpo, MRResDsc, MRResCnt) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReRes")
         ,new UpdateCursor("P03MP16", "UPDATE TXPMREPUE SET MRUltRes=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 12 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 50);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

