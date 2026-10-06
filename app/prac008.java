package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prac008 extends GXProcedure
{
   public prac008( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prac008.class ), "" );
   }

   public prac008( int remoteHandle ,
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
      prac008.this.aP4 = new short[] {0};
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
      prac008.this.AV20EmprCod = aP0[0];
      this.aP0 = aP0;
      prac008.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      prac008.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      prac008.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      prac008.this.AV11RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      prac008.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char4[0] = AV14Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      prac008.this.AV20EmprCod = GXv_char2[0] ;
      prac008.this.AV15EmprNom = GXv_char3[0] ;
      prac008.this.AV14Usurcod = GXv_char4[0] ;
      AV16Tot_rgtos = (short)(0) ;
      /* Using cursor P027Y2 */
      pr_default.execute(0, new Object[] {AV20EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P027Y2_A2804RecLinMaq[0] ;
         A130BarCodPar = P027Y2_A130BarCodPar[0] ;
         A132BarCodReo = P027Y2_A132BarCodReo[0] ;
         A129BarCod = P027Y2_A129BarCod[0] ;
         A396EmprCod = P027Y2_A396EmprCod[0] ;
         A2805RecVolPrd = P027Y2_A2805RecVolPrd[0] ;
         A4259RecTotKgs = P027Y2_A4259RecTotKgs[0] ;
         AV17Kgs_for = A4259RecTotKgs ;
         AV16Tot_rgtos = (short)(AV16Tot_rgtos+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P027Y3 */
      pr_default.execute(1, new Object[] {AV20EmprCod, AV12Station, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
      /* End optimized DELETE. */
      /* Using cursor P027Y4 */
      pr_default.execute(2, new Object[] {AV20EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1273RecLinPro = P027Y4_A1273RecLinPro[0] ;
         A764ProForCod = P027Y4_A764ProForCod[0] ;
         A4695RecVolPrf = P027Y4_A4695RecVolPrf[0] ;
         A4696RecTiempo = P027Y4_A4696RecTiempo[0] ;
         n4696RecTiempo = P027Y4_n4696RecTiempo[0] ;
         A4697RecNroPrg = P027Y4_A4697RecNroPrg[0] ;
         A2804RecLinMaq = P027Y4_A2804RecLinMaq[0] ;
         A130BarCodPar = P027Y4_A130BarCodPar[0] ;
         A132BarCodReo = P027Y4_A132BarCodReo[0] ;
         A129BarCod = P027Y4_A129BarCod[0] ;
         A396EmprCod = P027Y4_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPBARPR2

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A396EmprCod = AV20EmprCod ;
         A2792TermiCod = AV12Station ;
         A129BarCod = AV8BarCod ;
         A132BarCodReo = AV9BarCodReo ;
         A130BarCodPar = AV10BarCodPar ;
         A2794BarLinMaq = AV11RecLinMaq ;
         A1255BarPrfLin = A1273RecLinPro ;
         A207BarPrfCod = A764ProForCod ;
         n207BarPrfCod = false ;
         A4869BarPrfVol = A4695RecVolPrf ;
         n4869BarPrfVol = false ;
         A4870BarPrfTie = A4696RecTiempo ;
         n4870BarPrfTie = false ;
         A4871BarPrfPrg = A4697RecNroPrg ;
         n4871BarPrfPrg = false ;
         /* Using cursor P027Y5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin), Boolean.valueOf(n207BarPrfCod), A207BarPrfCod, Boolean.valueOf(n4869BarPrfVol), Integer.valueOf(A4869BarPrfVol), Boolean.valueOf(n4870BarPrfTie), Short.valueOf(A4870BarPrfTie), Boolean.valueOf(n4871BarPrfPrg), Integer.valueOf(A4871BarPrfPrg)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
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
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Application.commitDataStores(context, remoteHandle, pr_default, "prac008");
      GXv_char4[0] = AV20EmprCod ;
      GXv_int5[0] = AV8BarCod ;
      GXv_int6[0] = AV9BarCodReo ;
      GXv_char3[0] = AV10BarCodPar ;
      GXv_int7[0] = AV11RecLinMaq ;
      new app.prac009(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7) ;
      prac008.this.AV20EmprCod = GXv_char4[0] ;
      prac008.this.AV8BarCod = GXv_int5[0] ;
      prac008.this.AV9BarCodReo = GXv_int6[0] ;
      prac008.this.AV10BarCodPar = GXv_char3[0] ;
      prac008.this.AV11RecLinMaq = GXv_int7[0] ;
      /* Using cursor P027Y6 */
      pr_default.execute(4, new Object[] {AV20EmprCod, AV12Station, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A207BarPrfCod = P027Y6_A207BarPrfCod[0] ;
         n207BarPrfCod = P027Y6_n207BarPrfCod[0] ;
         A4869BarPrfVol = P027Y6_A4869BarPrfVol[0] ;
         n4869BarPrfVol = P027Y6_n4869BarPrfVol[0] ;
         A4870BarPrfTie = P027Y6_A4870BarPrfTie[0] ;
         n4870BarPrfTie = P027Y6_n4870BarPrfTie[0] ;
         A4871BarPrfPrg = P027Y6_A4871BarPrfPrg[0] ;
         n4871BarPrfPrg = P027Y6_n4871BarPrfPrg[0] ;
         A2794BarLinMaq = P027Y6_A2794BarLinMaq[0] ;
         A130BarCodPar = P027Y6_A130BarCodPar[0] ;
         A132BarCodReo = P027Y6_A132BarCodReo[0] ;
         A129BarCod = P027Y6_A129BarCod[0] ;
         A2792TermiCod = P027Y6_A2792TermiCod[0] ;
         A396EmprCod = P027Y6_A396EmprCod[0] ;
         A1255BarPrfLin = P027Y6_A1255BarPrfLin[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV13RecLinPro = (byte)(A1255BarPrfLin) ;
         /*
            INSERT RECORD ON TABLE TXPCRECET

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A396EmprCod = AV20EmprCod ;
         A129BarCod = AV8BarCod ;
         A132BarCodReo = AV9BarCodReo ;
         A130BarCodPar = AV10BarCodPar ;
         A2804RecLinMaq = AV11RecLinMaq ;
         A1273RecLinPro = AV13RecLinPro ;
         A764ProForCod = A207BarPrfCod ;
         A4695RecVolPrf = A4869BarPrfVol ;
         A4696RecTiempo = A4870BarPrfTie ;
         n4696RecTiempo = false ;
         A4697RecNroPrg = A4871BarPrfPrg ;
         /* Using cursor P027Y7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
         if ( (pr_default.getStatus(5) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         /* Using cursor P027Y8 */
         pr_default.execute(6, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      n4868RecUsrMod = false ;
      n4867RecFecMod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P027Y9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n4868RecUsrMod), AV14Usurcod, AV20EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
      /* End optimized UPDATE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "prac008");
      GXv_char4[0] = AV20EmprCod ;
      GXv_int5[0] = AV8BarCod ;
      GXv_int6[0] = AV9BarCodReo ;
      GXv_char3[0] = AV10BarCodPar ;
      GXv_int7[0] = AV11RecLinMaq ;
      GXv_char2[0] = httpContext.getMessage( "N", "") ;
      new app.prac004(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_char2) ;
      prac008.this.AV20EmprCod = GXv_char4[0] ;
      prac008.this.AV8BarCod = GXv_int5[0] ;
      prac008.this.AV9BarCodReo = GXv_int6[0] ;
      prac008.this.AV10BarCodPar = GXv_char3[0] ;
      prac008.this.AV11RecLinMaq = GXv_int7[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prac008.this.AV20EmprCod;
      this.aP1[0] = prac008.this.AV8BarCod;
      this.aP2[0] = prac008.this.AV9BarCodReo;
      this.aP3[0] = prac008.this.AV10BarCodPar;
      this.aP4[0] = prac008.this.AV11RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "prac008");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV15EmprNom = "" ;
      AV14Usurcod = "" ;
      scmdbuf = "" ;
      P027Y2_A2804RecLinMaq = new short[1] ;
      P027Y2_A130BarCodPar = new String[] {""} ;
      P027Y2_A132BarCodReo = new byte[1] ;
      P027Y2_A129BarCod = new int[1] ;
      P027Y2_A396EmprCod = new String[] {""} ;
      P027Y2_A2805RecVolPrd = new int[1] ;
      P027Y2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      AV17Kgs_for = DecimalUtil.ZERO ;
      P027Y4_A1273RecLinPro = new byte[1] ;
      P027Y4_A764ProForCod = new String[] {""} ;
      P027Y4_A4695RecVolPrf = new int[1] ;
      P027Y4_A4696RecTiempo = new short[1] ;
      P027Y4_n4696RecTiempo = new boolean[] {false} ;
      P027Y4_A4697RecNroPrg = new int[1] ;
      P027Y4_A2804RecLinMaq = new short[1] ;
      P027Y4_A130BarCodPar = new String[] {""} ;
      P027Y4_A132BarCodReo = new byte[1] ;
      P027Y4_A129BarCod = new int[1] ;
      P027Y4_A396EmprCod = new String[] {""} ;
      A764ProForCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A2792TermiCod = "" ;
      A207BarPrfCod = "" ;
      Gx_emsg = "" ;
      P027Y6_A207BarPrfCod = new String[] {""} ;
      P027Y6_n207BarPrfCod = new boolean[] {false} ;
      P027Y6_A4869BarPrfVol = new int[1] ;
      P027Y6_n4869BarPrfVol = new boolean[] {false} ;
      P027Y6_A4870BarPrfTie = new short[1] ;
      P027Y6_n4870BarPrfTie = new boolean[] {false} ;
      P027Y6_A4871BarPrfPrg = new int[1] ;
      P027Y6_n4871BarPrfPrg = new boolean[] {false} ;
      P027Y6_A2794BarLinMaq = new short[1] ;
      P027Y6_A130BarCodPar = new String[] {""} ;
      P027Y6_A132BarCodReo = new byte[1] ;
      P027Y6_A129BarCod = new int[1] ;
      P027Y6_A2792TermiCod = new String[] {""} ;
      P027Y6_A396EmprCod = new String[] {""} ;
      P027Y6_A1255BarPrfLin = new short[1] ;
      A4868RecUsrMod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_char2 = new String[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.prac008__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.prac008__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.prac008__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prac008__default(),
         new Object[] {
             new Object[] {
            P027Y2_A2804RecLinMaq, P027Y2_A130BarCodPar, P027Y2_A132BarCodReo, P027Y2_A129BarCod, P027Y2_A396EmprCod, P027Y2_A2805RecVolPrd, P027Y2_A4259RecTotKgs
            }
            , new Object[] {
            }
            , new Object[] {
            P027Y4_A1273RecLinPro, P027Y4_A764ProForCod, P027Y4_A4695RecVolPrf, P027Y4_A4696RecTiempo, P027Y4_n4696RecTiempo, P027Y4_A4697RecNroPrg, P027Y4_A2804RecLinMaq, P027Y4_A130BarCodPar, P027Y4_A132BarCodReo, P027Y4_A129BarCod,
            P027Y4_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P027Y6_A207BarPrfCod, P027Y6_n207BarPrfCod, P027Y6_A4869BarPrfVol, P027Y6_n4869BarPrfVol, P027Y6_A4870BarPrfTie, P027Y6_n4870BarPrfTie, P027Y6_A4871BarPrfPrg, P027Y6_n4871BarPrfPrg, P027Y6_A2794BarLinMaq, P027Y6_A130BarCodPar,
            P027Y6_A132BarCodReo, P027Y6_A129BarCod, P027Y6_A2792TermiCod, P027Y6_A396EmprCod, P027Y6_A1255BarPrfLin
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

   private byte AV9BarCodReo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte W132BarCodReo ;
   private byte AV13RecLinPro ;
   private byte GXv_int6[] ;
   private short AV11RecLinMaq ;
   private short AV16Tot_rgtos ;
   private short A2804RecLinMaq ;
   private short A4696RecTiempo ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short A4870BarPrfTie ;
   private short Gx_err ;
   private short GXv_int7[] ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int A4695RecVolPrf ;
   private int A4697RecNroPrg ;
   private int W129BarCod ;
   private int GX_INS407 ;
   private int A4869BarPrfVol ;
   private int A4871BarPrfPrg ;
   private int GX_INS409 ;
   private int GXv_int5[] ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal AV17Kgs_for ;
   private String AV20EmprCod ;
   private String AV10BarCodPar ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV15EmprNom ;
   private String AV14Usurcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A2792TermiCod ;
   private String A207BarPrfCod ;
   private String Gx_emsg ;
   private String A4868RecUsrMod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean n4696RecTiempo ;
   private boolean n207BarPrfCod ;
   private boolean n4869BarPrfVol ;
   private boolean n4870BarPrfTie ;
   private boolean n4871BarPrfPrg ;
   private boolean n4868RecUsrMod ;
   private boolean n4867RecFecMod ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P027Y2_A2804RecLinMaq ;
   private String[] P027Y2_A130BarCodPar ;
   private byte[] P027Y2_A132BarCodReo ;
   private int[] P027Y2_A129BarCod ;
   private String[] P027Y2_A396EmprCod ;
   private int[] P027Y2_A2805RecVolPrd ;
   private java.math.BigDecimal[] P027Y2_A4259RecTotKgs ;
   private byte[] P027Y4_A1273RecLinPro ;
   private String[] P027Y4_A764ProForCod ;
   private int[] P027Y4_A4695RecVolPrf ;
   private short[] P027Y4_A4696RecTiempo ;
   private boolean[] P027Y4_n4696RecTiempo ;
   private int[] P027Y4_A4697RecNroPrg ;
   private short[] P027Y4_A2804RecLinMaq ;
   private String[] P027Y4_A130BarCodPar ;
   private byte[] P027Y4_A132BarCodReo ;
   private int[] P027Y4_A129BarCod ;
   private String[] P027Y4_A396EmprCod ;
   private String[] P027Y6_A207BarPrfCod ;
   private boolean[] P027Y6_n207BarPrfCod ;
   private int[] P027Y6_A4869BarPrfVol ;
   private boolean[] P027Y6_n4869BarPrfVol ;
   private short[] P027Y6_A4870BarPrfTie ;
   private boolean[] P027Y6_n4870BarPrfTie ;
   private int[] P027Y6_A4871BarPrfPrg ;
   private boolean[] P027Y6_n4871BarPrfPrg ;
   private short[] P027Y6_A2794BarLinMaq ;
   private String[] P027Y6_A130BarCodPar ;
   private byte[] P027Y6_A132BarCodReo ;
   private int[] P027Y6_A129BarCod ;
   private String[] P027Y6_A2792TermiCod ;
   private String[] P027Y6_A396EmprCod ;
   private short[] P027Y6_A1255BarPrfLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class prac008__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class prac008__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class prac008__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class prac008__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027Y2", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecVolPrd, RecTotKgs FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P027Y3", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new ForEachCursor("P027Y4", "SELECT RecLinPro, ProForCod, RecVolPrf, RecTiempo, RecNroPrg, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P027Y5", "INSERT INTO TXPBARPR2(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin, BarPrfCod, BarPrfVol, BarPrfTie, BarPrfPrg, BarPrfTmp, BarPrfPhx, BarPrfPhm, BarPrfRb, BarPrfRec, BarPrfH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new ForEachCursor("P027Y6", "SELECT BarPrfCod, BarPrfVol, BarPrfTie, BarPrfPrg, BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarPrfLin FROM TXPBARPR2 WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P027Y7", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, RecVolPrf, RecTiempo, RecNroPrg, ProRecObs, RecTemp, RecPhMx, RecPhMn, RecRb, RecNumRec, RecNH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P027Y8", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ? AND BarPrfLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P027Y9", "UPDATE TXPRECMAQ SET RecUsrMod=?, RecFecMod=(SYSDATE)  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 10);
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((short[]) buf[14])[0] = rslt.getShort(11);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[14]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[9]).shortValue());
               }
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

