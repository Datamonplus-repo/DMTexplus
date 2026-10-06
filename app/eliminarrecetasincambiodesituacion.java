package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminarrecetasincambiodesituacion extends GXProcedure
{
   public eliminarrecetasincambiodesituacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminarrecetasincambiodesituacion.class ), "" );
   }

   public eliminarrecetasincambiodesituacion( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      eliminarrecetasincambiodesituacion.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      eliminarrecetasincambiodesituacion.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      eliminarrecetasincambiodesituacion.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      eliminarrecetasincambiodesituacion.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      eliminarrecetasincambiodesituacion.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      eliminarrecetasincambiodesituacion.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV11Flag2)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "038001", GXv_int1) ;
      eliminarrecetasincambiodesituacion.this.AV11Flag2 = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXt_char2 = AV19Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      eliminarrecetasincambiodesituacion.this.GXt_char2 = GXv_char3[0] ;
      AV19Station = GXt_char2 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV20EmprNom ;
      GXv_char5[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char3, GXv_char4, GXv_char5) ;
      eliminarrecetasincambiodesituacion.this.A396EmprCod = GXv_char3[0] ;
      eliminarrecetasincambiodesituacion.this.AV20EmprNom = GXv_char4[0] ;
      eliminarrecetasincambiodesituacion.this.AV21UsurCod = GXv_char5[0] ;
      AV15Num_r = (short)(0) ;
      AV16Num_rt = (short)(0) ;
      AV17Num_ra = (short)(0) ;
      /* Using cursor P0ADD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P0ADD2_A6039RecAcab[0] ;
         n6039RecAcab = P0ADD2_n6039RecAcab[0] ;
         AV15Num_r = (short)(AV15Num_r+1) ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV17Num_ra = (short)(AV17Num_ra+1) ;
         }
         else
         {
            AV16Num_rt = (short)(AV16Num_rt+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV18RECACAB = httpContext.getMessage( "N", "") ;
      /* Using cursor P0ADD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6039RecAcab = P0ADD3_A6039RecAcab[0] ;
         n6039RecAcab = P0ADD3_n6039RecAcab[0] ;
         AV18RECACAB = A6039RecAcab ;
         /* Using cursor P0ADD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1273RecLinPro = P0ADD4_A1273RecLinPro[0] ;
            A764ProForCod = P0ADD4_A764ProForCod[0] ;
            if ( AV11Flag2.doubleValue() == 1 )
            {
               /* Using cursor P0ADD5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A686PrdCant = P0ADD5_A686PrdCant[0] ;
                  A719PrdNum = P0ADD5_A719PrdNum[0] ;
                  n719PrdNum = P0ADD5_n719PrdNum[0] ;
                  A811RecLin = P0ADD5_A811RecLin[0] ;
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A686PrdCant)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
                     {
                        GXv_char5[0] = A396EmprCod ;
                        GXv_char4[0] = A719PrdNum ;
                        GXv_decimal6[0] = A686PrdCant ;
                        new app.pactres4(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_decimal6) ;
                        eliminarrecetasincambiodesituacion.this.A396EmprCod = GXv_char5[0] ;
                        eliminarrecetasincambiodesituacion.this.A719PrdNum = GXv_char4[0] ;
                        eliminarrecetasincambiodesituacion.this.A686PrdCant = GXv_decimal6[0] ;
                     }
                     else
                     {
                        AV12PrdNum = A719PrdNum ;
                        AV13PrdCant = A686PrdCant ;
                        /* Execute user subroutine: 'COMPUESTOS' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(3);
                           pr_default.close(2);
                           pr_default.close(1);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            /* Optimized DELETE. */
            /* Using cursor P0ADD6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P0ADD7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P0ADD8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSREC");
            /* End optimized DELETE. */
            GXv_char5[0] = A396EmprCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int8[0] = A2804RecLinMaq ;
            GXv_int9[0] = A1273RecLinPro ;
            new app.pbajpre(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_int1, GXv_char4, GXv_int8, GXv_int9) ;
            eliminarrecetasincambiodesituacion.this.A396EmprCod = GXv_char5[0] ;
            eliminarrecetasincambiodesituacion.this.A129BarCod = GXv_int7[0] ;
            eliminarrecetasincambiodesituacion.this.A132BarCodReo = GXv_int1[0] ;
            eliminarrecetasincambiodesituacion.this.A130BarCodPar = GXv_char4[0] ;
            eliminarrecetasincambiodesituacion.this.A2804RecLinMaq = GXv_int8[0] ;
            eliminarrecetasincambiodesituacion.this.A1273RecLinPro = GXv_int9[0] ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P0ADD9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV18RECACAB, httpContext.getMessage( "S", "")) != 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P0ADD10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* End optimized UPDATE. */
      }
      /* Using cursor P0ADD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A2792TermiCod = P0ADD11_A2792TermiCod[0] ;
         A2793BarULinMaq = P0ADD11_A2793BarULinMaq[0] ;
         n2793BarULinMaq = P0ADD11_n2793BarULinMaq[0] ;
         /* Using cursor P0ADD12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A2794BarLinMaq = P0ADD12_A2794BarLinMaq[0] ;
            A2795BarMaqPrf = P0ADD12_A2795BarMaqPrf[0] ;
            n2795BarMaqPrf = P0ADD12_n2795BarMaqPrf[0] ;
            /* Optimized DELETE. */
            /* Using cursor P0ADD13 */
            pr_default.execute(11, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
            /* End optimized DELETE. */
            /* Using cursor P0ADD14 */
            pr_default.execute(12, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
            pr_default.readNext(10);
         }
         pr_default.close(10);
         /* Using cursor P0ADD15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /* Optimized DELETE. */
      /* Using cursor P0ADD16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
      /* End optimized DELETE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
      /* Using cursor P0ADD17 */
      pr_default.execute(15, new Object[] {A396EmprCod, AV12PrdNum});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A688PrdComCod = P0ADD17_A688PrdComCod[0] ;
         A690PrdComFN = P0ADD17_A690PrdComFN[0] ;
         A719PrdNum = P0ADD17_A719PrdNum[0] ;
         n719PrdNum = P0ADD17_n719PrdNum[0] ;
         AV10Cantidad = AV13PrdCant.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_decimal6[0] = AV10Cantidad ;
         new app.pactres4(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_decimal6) ;
         eliminarrecetasincambiodesituacion.this.A396EmprCod = GXv_char5[0] ;
         eliminarrecetasincambiodesituacion.this.A719PrdNum = GXv_char4[0] ;
         eliminarrecetasincambiodesituacion.this.AV10Cantidad = GXv_decimal6[0] ;
         pr_default.readNext(15);
      }
      pr_default.close(15);
   }

   protected void cleanup( )
   {
      this.aP0[0] = eliminarrecetasincambiodesituacion.this.A396EmprCod;
      this.aP1[0] = eliminarrecetasincambiodesituacion.this.A129BarCod;
      this.aP2[0] = eliminarrecetasincambiodesituacion.this.A132BarCodReo;
      this.aP3[0] = eliminarrecetasincambiodesituacion.this.A130BarCodPar;
      this.aP4[0] = eliminarrecetasincambiodesituacion.this.A2804RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "eliminarrecetasincambiodesituacion");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Flag2 = DecimalUtil.ZERO ;
      AV19Station = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV20EmprNom = "" ;
      AV21UsurCod = "" ;
      scmdbuf = "" ;
      P0ADD2_A396EmprCod = new String[] {""} ;
      P0ADD2_A129BarCod = new int[1] ;
      P0ADD2_A132BarCodReo = new byte[1] ;
      P0ADD2_A130BarCodPar = new String[] {""} ;
      P0ADD2_A2804RecLinMaq = new short[1] ;
      P0ADD2_A6039RecAcab = new String[] {""} ;
      P0ADD2_n6039RecAcab = new boolean[] {false} ;
      A6039RecAcab = "" ;
      AV18RECACAB = "" ;
      P0ADD3_A396EmprCod = new String[] {""} ;
      P0ADD3_A129BarCod = new int[1] ;
      P0ADD3_A132BarCodReo = new byte[1] ;
      P0ADD3_A130BarCodPar = new String[] {""} ;
      P0ADD3_A2804RecLinMaq = new short[1] ;
      P0ADD3_A6039RecAcab = new String[] {""} ;
      P0ADD3_n6039RecAcab = new boolean[] {false} ;
      P0ADD4_A396EmprCod = new String[] {""} ;
      P0ADD4_A129BarCod = new int[1] ;
      P0ADD4_A132BarCodReo = new byte[1] ;
      P0ADD4_A130BarCodPar = new String[] {""} ;
      P0ADD4_A2804RecLinMaq = new short[1] ;
      P0ADD4_A1273RecLinPro = new byte[1] ;
      P0ADD4_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      P0ADD5_A396EmprCod = new String[] {""} ;
      P0ADD5_A129BarCod = new int[1] ;
      P0ADD5_A132BarCodReo = new byte[1] ;
      P0ADD5_A130BarCodPar = new String[] {""} ;
      P0ADD5_A2804RecLinMaq = new short[1] ;
      P0ADD5_A1273RecLinPro = new byte[1] ;
      P0ADD5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADD5_A719PrdNum = new String[] {""} ;
      P0ADD5_n719PrdNum = new boolean[] {false} ;
      P0ADD5_A811RecLin = new short[1] ;
      A686PrdCant = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV12PrdNum = "" ;
      AV13PrdCant = DecimalUtil.ZERO ;
      GXv_int7 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new byte[1] ;
      P0ADD11_A396EmprCod = new String[] {""} ;
      P0ADD11_A129BarCod = new int[1] ;
      P0ADD11_A132BarCodReo = new byte[1] ;
      P0ADD11_A130BarCodPar = new String[] {""} ;
      P0ADD11_A2792TermiCod = new String[] {""} ;
      P0ADD11_A2793BarULinMaq = new short[1] ;
      P0ADD11_n2793BarULinMaq = new boolean[] {false} ;
      A2792TermiCod = "" ;
      P0ADD12_A396EmprCod = new String[] {""} ;
      P0ADD12_A2792TermiCod = new String[] {""} ;
      P0ADD12_A129BarCod = new int[1] ;
      P0ADD12_A132BarCodReo = new byte[1] ;
      P0ADD12_A130BarCodPar = new String[] {""} ;
      P0ADD12_A2794BarLinMaq = new short[1] ;
      P0ADD12_A2795BarMaqPrf = new String[] {""} ;
      P0ADD12_n2795BarMaqPrf = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      P0ADD17_A396EmprCod = new String[] {""} ;
      P0ADD17_A688PrdComCod = new String[] {""} ;
      P0ADD17_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADD17_A719PrdNum = new String[] {""} ;
      P0ADD17_n719PrdNum = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      AV10Cantidad = DecimalUtil.ZERO ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.eliminarrecetasincambiodesituacion__default(),
         new Object[] {
             new Object[] {
            P0ADD2_A396EmprCod, P0ADD2_A129BarCod, P0ADD2_A132BarCodReo, P0ADD2_A130BarCodPar, P0ADD2_A2804RecLinMaq, P0ADD2_A6039RecAcab, P0ADD2_n6039RecAcab
            }
            , new Object[] {
            P0ADD3_A396EmprCod, P0ADD3_A129BarCod, P0ADD3_A132BarCodReo, P0ADD3_A130BarCodPar, P0ADD3_A2804RecLinMaq, P0ADD3_A6039RecAcab, P0ADD3_n6039RecAcab
            }
            , new Object[] {
            P0ADD4_A396EmprCod, P0ADD4_A129BarCod, P0ADD4_A132BarCodReo, P0ADD4_A130BarCodPar, P0ADD4_A2804RecLinMaq, P0ADD4_A1273RecLinPro, P0ADD4_A764ProForCod
            }
            , new Object[] {
            P0ADD5_A396EmprCod, P0ADD5_A129BarCod, P0ADD5_A132BarCodReo, P0ADD5_A130BarCodPar, P0ADD5_A2804RecLinMaq, P0ADD5_A1273RecLinPro, P0ADD5_A686PrdCant, P0ADD5_A719PrdNum, P0ADD5_n719PrdNum, P0ADD5_A811RecLin
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
            , new Object[] {
            P0ADD11_A396EmprCod, P0ADD11_A129BarCod, P0ADD11_A132BarCodReo, P0ADD11_A130BarCodPar, P0ADD11_A2792TermiCod, P0ADD11_A2793BarULinMaq, P0ADD11_n2793BarULinMaq
            }
            , new Object[] {
            P0ADD12_A396EmprCod, P0ADD12_A2792TermiCod, P0ADD12_A129BarCod, P0ADD12_A132BarCodReo, P0ADD12_A130BarCodPar, P0ADD12_A2794BarLinMaq, P0ADD12_A2795BarMaqPrf, P0ADD12_n2795BarMaqPrf
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
            P0ADD17_A396EmprCod, P0ADD17_A688PrdComCod, P0ADD17_A690PrdComFN, P0ADD17_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte GXv_int1[] ;
   private byte GXv_int9[] ;
   private short A2804RecLinMaq ;
   private short AV15Num_r ;
   private short AV16Num_rt ;
   private short AV17Num_ra ;
   private short A811RecLin ;
   private short GXv_int8[] ;
   private short A2793BarULinMaq ;
   private short A2794BarLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int7[] ;
   private java.math.BigDecimal AV11Flag2 ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV13PrdCant ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV10Cantidad ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV19Station ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV20EmprNom ;
   private String AV21UsurCod ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String AV18RECACAB ;
   private String A764ProForCod ;
   private String A719PrdNum ;
   private String AV12PrdNum ;
   private String A2792TermiCod ;
   private String A2795BarMaqPrf ;
   private String A688PrdComCod ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private boolean n6039RecAcab ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n2793BarULinMaq ;
   private boolean n2795BarMaqPrf ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADD2_A396EmprCod ;
   private int[] P0ADD2_A129BarCod ;
   private byte[] P0ADD2_A132BarCodReo ;
   private String[] P0ADD2_A130BarCodPar ;
   private short[] P0ADD2_A2804RecLinMaq ;
   private String[] P0ADD2_A6039RecAcab ;
   private boolean[] P0ADD2_n6039RecAcab ;
   private String[] P0ADD3_A396EmprCod ;
   private int[] P0ADD3_A129BarCod ;
   private byte[] P0ADD3_A132BarCodReo ;
   private String[] P0ADD3_A130BarCodPar ;
   private short[] P0ADD3_A2804RecLinMaq ;
   private String[] P0ADD3_A6039RecAcab ;
   private boolean[] P0ADD3_n6039RecAcab ;
   private String[] P0ADD4_A396EmprCod ;
   private int[] P0ADD4_A129BarCod ;
   private byte[] P0ADD4_A132BarCodReo ;
   private String[] P0ADD4_A130BarCodPar ;
   private short[] P0ADD4_A2804RecLinMaq ;
   private byte[] P0ADD4_A1273RecLinPro ;
   private String[] P0ADD4_A764ProForCod ;
   private String[] P0ADD5_A396EmprCod ;
   private int[] P0ADD5_A129BarCod ;
   private byte[] P0ADD5_A132BarCodReo ;
   private String[] P0ADD5_A130BarCodPar ;
   private short[] P0ADD5_A2804RecLinMaq ;
   private byte[] P0ADD5_A1273RecLinPro ;
   private java.math.BigDecimal[] P0ADD5_A686PrdCant ;
   private String[] P0ADD5_A719PrdNum ;
   private boolean[] P0ADD5_n719PrdNum ;
   private short[] P0ADD5_A811RecLin ;
   private String[] P0ADD11_A396EmprCod ;
   private int[] P0ADD11_A129BarCod ;
   private byte[] P0ADD11_A132BarCodReo ;
   private String[] P0ADD11_A130BarCodPar ;
   private String[] P0ADD11_A2792TermiCod ;
   private short[] P0ADD11_A2793BarULinMaq ;
   private boolean[] P0ADD11_n2793BarULinMaq ;
   private String[] P0ADD12_A396EmprCod ;
   private String[] P0ADD12_A2792TermiCod ;
   private int[] P0ADD12_A129BarCod ;
   private byte[] P0ADD12_A132BarCodReo ;
   private String[] P0ADD12_A130BarCodPar ;
   private short[] P0ADD12_A2794BarLinMaq ;
   private String[] P0ADD12_A2795BarMaqPrf ;
   private boolean[] P0ADD12_n2795BarMaqPrf ;
   private String[] P0ADD17_A396EmprCod ;
   private String[] P0ADD17_A688PrdComCod ;
   private java.math.BigDecimal[] P0ADD17_A690PrdComFN ;
   private String[] P0ADD17_A719PrdNum ;
   private boolean[] P0ADD17_n719PrdNum ;
}

final  class eliminarrecetasincambiodesituacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADD2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecAcab FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ADD3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecAcab FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ADD4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADD5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, PrdCant, PrdNum, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0ADD6", "DELETE FROM TXPLRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P0ADD7", "DELETE FROM TXPLANYAD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMAL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
         ,new UpdateCursor("P0ADD8", "DELETE FROM TXPOBSREC  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSREC")
         ,new UpdateCursor("P0ADD9", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new UpdateCursor("P0ADD10", "UPDATE TXPBARCAD SET BarMacPro=' '  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P0ADD11", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, TermiCod, BarULinMaq FROM TXPBARTER WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADD12", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0ADD13", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P0ADD14", "DELETE FROM TXPBARMAQ  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P0ADD15", "DELETE FROM TXPBARTER  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new UpdateCursor("P0ADD16", "DELETE FROM TXPLANYAD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMAL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
         ,new ForEachCursor("P0ADD17", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE (EmprCod = ?) AND (PrdComCod = ?) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

