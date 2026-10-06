package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrexwpasoflag extends GXProcedure
{
   public phdrexwpasoflag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrexwpasoflag.class ), "" );
   }

   public phdrexwpasoflag( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             byte[] aP7 ,
                             int[] aP8 ,
                             short[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 )
   {
      phdrexwpasoflag.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        java.util.Date[] aP6 ,
                        byte[] aP7 ,
                        int[] aP8 ,
                        short[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             byte[] aP7 ,
                             int[] aP8 ,
                             short[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             String[] aP12 )
   {
      phdrexwpasoflag.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrexwpasoflag.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phdrexwpasoflag.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrexwpasoflag.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrexwpasoflag.this.AV8BarOrdlin = aP4[0];
      this.aP4 = aP4;
      phdrexwpasoflag.this.AV9FasCod = aP5[0];
      this.aP5 = aP5;
      phdrexwpasoflag.this.AV10FechaE = aP6[0];
      this.aP6 = aP6;
      phdrexwpasoflag.this.AV11BarExt = aP7[0];
      this.aP7 = aP7;
      phdrexwpasoflag.this.AV12SalExtAlb = aP8[0];
      this.aP8 = aP8;
      phdrexwpasoflag.this.AV26RpExHdCns = aP9[0];
      this.aP9 = aP9;
      phdrexwpasoflag.this.AV27RpExHdKgs = aP10[0];
      this.aP10 = aP10;
      phdrexwpasoflag.this.AV28RpExHdMts = aP11[0];
      this.aP11 = aP11;
      phdrexwpasoflag.this.AV18Flag = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19IncidenciasObservaciones_SDT.clear();
      /* Using cursor P091F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2265BarExt = P091F2_A2265BarExt[0] ;
         n2265BarExt = P091F2_n2265BarExt[0] ;
         AV20IncidenciasObservaciones_SDT_item = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV20IncidenciasObservaciones_SDT_item.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Trabajos externos.Barcad.Barext= ", "")+GXutil.str( A2265BarExt, 1, 0)+httpContext.getMessage( " cambia a ", "")+GXutil.str( AV11BarExt, 1, 0) );
         AV19IncidenciasObservaciones_SDT.add(AV20IncidenciasObservaciones_SDT_item, 0);
         A2265BarExt = AV11BarExt ;
         n2265BarExt = false ;
         AV13Barcod = A129BarCod ;
         AV14Barcodreo = A132BarCodReo ;
         AV15Barcodpar = A130BarCodPar ;
         /* Using cursor P091F3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2265BarExt), Byte.valueOf(A2265BarExt), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV19IncidenciasObservaciones_SDT.size() > 0 )
      {
         AV21inc_obs = AV19IncidenciasObservaciones_SDT.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV22UsurCod, AV23Station, AV21inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      if ( GXutil.strcmp(AV18Flag, "N") == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19IncidenciasObservaciones_SDT.clear();
      AV33GXLvl32 = (byte)(0) ;
      /* Using cursor P091F4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV9FasCod, Short.valueOf(AV8BarOrdlin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A194BarOrdLin = P091F4_A194BarOrdLin[0] ;
         A457FasCod = P091F4_A457FasCod[0] ;
         A153BarFasEst = P091F4_A153BarFasEst[0] ;
         A4442BarFasDTI = P091F4_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P091F4_n4442BarFasDTI[0] ;
         A4443BarFasDTF = P091F4_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P091F4_n4443BarFasDTF[0] ;
         A3837BarFasKgm = P091F4_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P091F4_n3837BarFasKgm[0] ;
         A3838BarFasMtr = P091F4_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P091F4_n3838BarFasMtr[0] ;
         A227BarUni = P091F4_A227BarUni[0] ;
         A12454TsSolTLcq = P091F4_A12454TsSolTLcq[0] ;
         n12454TsSolTLcq = P091F4_n12454TsSolTLcq[0] ;
         A460FasDsc = P091F4_A460FasDsc[0] ;
         A160BarFecRea = P091F4_A160BarFecRea[0] ;
         A3298BarFecRIni = P091F4_A3298BarFecRIni[0] ;
         A603MaqCodBis = P091F4_A603MaqCodBis[0] ;
         A228BarUniMed = P091F4_A228BarUniMed[0] ;
         A758ProCod = P091F4_A758ProCod[0] ;
         A460FasDsc = P091F4_A460FasDsc[0] ;
         A228BarUniMed = P091F4_A228BarUniMed[0] ;
         AV33GXLvl32 = (byte)(1) ;
         if ( AV11BarExt == 0 )
         {
            A153BarFasEst = (byte)(0) ;
            A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            n4442BarFasDTI = false ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
            A3837BarFasKgm = DecimalUtil.ZERO ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = DecimalUtil.ZERO ;
            n3838BarFasMtr = false ;
            A227BarUni = DecimalUtil.ZERO ;
            A12454TsSolTLcq = 0 ;
            n12454TsSolTLcq = false ;
            AV20IncidenciasObservaciones_SDT_item = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV20IncidenciasObservaciones_SDT_item.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Trabajos externos.BarFas, Orden ", "")+GXutil.str( A194BarOrdLin, 4, 0)+httpContext.getMessage( " Fase ", "")+GXutil.trim( A457FasCod)+" "+GXutil.trim( A460FasDsc)+httpContext.getMessage( " BarFasEst ", "")+GXutil.str( A153BarFasEst, 1, 0) );
            AV19IncidenciasObservaciones_SDT.add(AV20IncidenciasObservaciones_SDT_item, 0);
         }
         if ( AV11BarExt == 1 )
         {
            A153BarFasEst = (byte)(1) ;
            A160BarFecRea = AV10FechaE ;
            A3298BarFecRIni = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) ? AV10FechaE : A3298BarFecRIni) ;
            A4442BarFasDTI = GXutil.serverNow( context, remoteHandle, pr_default) ;
            n4442BarFasDTI = false ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
            A3837BarFasKgm = DecimalUtil.ZERO ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = DecimalUtil.ZERO ;
            n3838BarFasMtr = false ;
            A227BarUni = DecimalUtil.ZERO ;
            A12454TsSolTLcq = 1 ;
            n12454TsSolTLcq = false ;
            AV24MaqCodBis = A603MaqCodBis ;
            A603MaqCodBis = ((AV25endutex==1) ? httpContext.getMessage( "ACCA00", "") : A603MaqCodBis) ;
            AV20IncidenciasObservaciones_SDT_item = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV20IncidenciasObservaciones_SDT_item.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Trabajos externos.BarFas, Orden ", "")+GXutil.str( A194BarOrdLin, 4, 0)+httpContext.getMessage( " Fase ", "")+GXutil.trim( A457FasCod)+" "+GXutil.trim( A460FasDsc)+httpContext.getMessage( " BarFasEst ", "")+GXutil.str( A153BarFasEst, 1, 0) );
            AV19IncidenciasObservaciones_SDT.add(AV20IncidenciasObservaciones_SDT_item, 0);
         }
         if ( AV11BarExt == 2 )
         {
            A153BarFasEst = (byte)(2) ;
            A160BarFecRea = AV10FechaE ;
            A3298BarFecRIni = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) ? AV10FechaE : A3298BarFecRIni) ;
            A4443BarFasDTF = GXutil.serverNow( context, remoteHandle, pr_default) ;
            n4443BarFasDTF = false ;
            A3837BarFasKgm = AV27RpExHdKgs ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = AV28RpExHdMts ;
            n3838BarFasMtr = false ;
            A227BarUni = ((GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", ""))==0) ? AV27RpExHdKgs : AV28RpExHdMts) ;
            A12454TsSolTLcq = 2 ;
            n12454TsSolTLcq = false ;
            AV20IncidenciasObservaciones_SDT_item = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV20IncidenciasObservaciones_SDT_item.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Trabajos externos.BarFas, Orden ", "")+GXutil.str( A194BarOrdLin, 4, 0)+httpContext.getMessage( " Fase ", "")+GXutil.trim( A457FasCod)+" "+GXutil.trim( A460FasDsc)+httpContext.getMessage( " BarFasEst ", "")+GXutil.str( A153BarFasEst, 1, 0) );
            AV19IncidenciasObservaciones_SDT.add(AV20IncidenciasObservaciones_SDT_item, 0);
         }
         /* Using cursor P091F5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, A227BarUni, Boolean.valueOf(n12454TsSolTLcq), Integer.valueOf(A12454TsSolTLcq), A160BarFecRea, A3298BarFecRIni, A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV33GXLvl32 == 0 )
      {
         System.out.println( httpContext.getMessage( "NO existe BARFAS", "") );
      }
      if ( AV19IncidenciasObservaciones_SDT.size() > 0 )
      {
         AV21inc_obs = AV19IncidenciasObservaciones_SDT.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV22UsurCod, AV23Station, AV21inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrexwpasoflag.this.A396EmprCod;
      this.aP1[0] = phdrexwpasoflag.this.A129BarCod;
      this.aP2[0] = phdrexwpasoflag.this.A132BarCodReo;
      this.aP3[0] = phdrexwpasoflag.this.A130BarCodPar;
      this.aP4[0] = phdrexwpasoflag.this.AV8BarOrdlin;
      this.aP5[0] = phdrexwpasoflag.this.AV9FasCod;
      this.aP6[0] = phdrexwpasoflag.this.AV10FechaE;
      this.aP7[0] = phdrexwpasoflag.this.AV11BarExt;
      this.aP8[0] = phdrexwpasoflag.this.AV12SalExtAlb;
      this.aP9[0] = phdrexwpasoflag.this.AV26RpExHdCns;
      this.aP10[0] = phdrexwpasoflag.this.AV27RpExHdKgs;
      this.aP11[0] = phdrexwpasoflag.this.AV28RpExHdMts;
      this.aP12[0] = phdrexwpasoflag.this.AV18Flag;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrexwpasoflag");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19IncidenciasObservaciones_SDT = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P091F2_A396EmprCod = new String[] {""} ;
      P091F2_A129BarCod = new int[1] ;
      P091F2_A132BarCodReo = new byte[1] ;
      P091F2_A130BarCodPar = new String[] {""} ;
      P091F2_A2265BarExt = new byte[1] ;
      P091F2_n2265BarExt = new boolean[] {false} ;
      AV20IncidenciasObservaciones_SDT_item = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV15Barcodpar = "" ;
      AV21inc_obs = "" ;
      AV32Pgmname = "" ;
      AV22UsurCod = "" ;
      AV23Station = "" ;
      P091F4_A396EmprCod = new String[] {""} ;
      P091F4_A129BarCod = new int[1] ;
      P091F4_A132BarCodReo = new byte[1] ;
      P091F4_A130BarCodPar = new String[] {""} ;
      P091F4_A194BarOrdLin = new short[1] ;
      P091F4_A457FasCod = new String[] {""} ;
      P091F4_A153BarFasEst = new byte[1] ;
      P091F4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P091F4_n4442BarFasDTI = new boolean[] {false} ;
      P091F4_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P091F4_n4443BarFasDTF = new boolean[] {false} ;
      P091F4_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091F4_n3837BarFasKgm = new boolean[] {false} ;
      P091F4_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091F4_n3838BarFasMtr = new boolean[] {false} ;
      P091F4_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091F4_A12454TsSolTLcq = new int[1] ;
      P091F4_n12454TsSolTLcq = new boolean[] {false} ;
      P091F4_A460FasDsc = new String[] {""} ;
      P091F4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P091F4_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P091F4_A603MaqCodBis = new String[] {""} ;
      P091F4_A228BarUniMed = new String[] {""} ;
      P091F4_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A603MaqCodBis = "" ;
      A228BarUniMed = "" ;
      A758ProCod = "" ;
      AV24MaqCodBis = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrexwpasoflag__default(),
         new Object[] {
             new Object[] {
            P091F2_A396EmprCod, P091F2_A129BarCod, P091F2_A132BarCodReo, P091F2_A130BarCodPar, P091F2_A2265BarExt, P091F2_n2265BarExt
            }
            , new Object[] {
            }
            , new Object[] {
            P091F4_A396EmprCod, P091F4_A129BarCod, P091F4_A132BarCodReo, P091F4_A130BarCodPar, P091F4_A194BarOrdLin, P091F4_A457FasCod, P091F4_A153BarFasEst, P091F4_A4442BarFasDTI, P091F4_n4442BarFasDTI, P091F4_A4443BarFasDTF,
            P091F4_n4443BarFasDTF, P091F4_A3837BarFasKgm, P091F4_n3837BarFasKgm, P091F4_A3838BarFasMtr, P091F4_n3838BarFasMtr, P091F4_A227BarUni, P091F4_A12454TsSolTLcq, P091F4_n12454TsSolTLcq, P091F4_A460FasDsc, P091F4_A160BarFecRea,
            P091F4_A3298BarFecRIni, P091F4_A603MaqCodBis, P091F4_A228BarUniMed, P091F4_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      AV32Pgmname = "PHDREXWPasoFlag" ;
      /* GeneXus formulas. */
      AV32Pgmname = "PHDREXWPasoFlag" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11BarExt ;
   private byte A2265BarExt ;
   private byte AV14Barcodreo ;
   private byte AV33GXLvl32 ;
   private byte A153BarFasEst ;
   private short AV8BarOrdlin ;
   private short AV26RpExHdCns ;
   private short A194BarOrdLin ;
   private short AV25endutex ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12SalExtAlb ;
   private int AV13Barcod ;
   private int A12454TsSolTLcq ;
   private java.math.BigDecimal AV27RpExHdKgs ;
   private java.math.BigDecimal AV28RpExHdMts ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A227BarUni ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9FasCod ;
   private String AV18Flag ;
   private String scmdbuf ;
   private String AV15Barcodpar ;
   private String AV32Pgmname ;
   private String AV22UsurCod ;
   private String AV23Station ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A228BarUniMed ;
   private String A758ProCod ;
   private String AV24MaqCodBis ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV10FechaE ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n2265BarExt ;
   private boolean returnInSub ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n12454TsSolTLcq ;
   private String AV21inc_obs ;
   private String[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private java.util.Date[] aP6 ;
   private byte[] aP7 ;
   private int[] aP8 ;
   private short[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P091F2_A396EmprCod ;
   private int[] P091F2_A129BarCod ;
   private byte[] P091F2_A132BarCodReo ;
   private String[] P091F2_A130BarCodPar ;
   private byte[] P091F2_A2265BarExt ;
   private boolean[] P091F2_n2265BarExt ;
   private String[] P091F4_A396EmprCod ;
   private int[] P091F4_A129BarCod ;
   private byte[] P091F4_A132BarCodReo ;
   private String[] P091F4_A130BarCodPar ;
   private short[] P091F4_A194BarOrdLin ;
   private String[] P091F4_A457FasCod ;
   private byte[] P091F4_A153BarFasEst ;
   private java.util.Date[] P091F4_A4442BarFasDTI ;
   private boolean[] P091F4_n4442BarFasDTI ;
   private java.util.Date[] P091F4_A4443BarFasDTF ;
   private boolean[] P091F4_n4443BarFasDTF ;
   private java.math.BigDecimal[] P091F4_A3837BarFasKgm ;
   private boolean[] P091F4_n3837BarFasKgm ;
   private java.math.BigDecimal[] P091F4_A3838BarFasMtr ;
   private boolean[] P091F4_n3838BarFasMtr ;
   private java.math.BigDecimal[] P091F4_A227BarUni ;
   private int[] P091F4_A12454TsSolTLcq ;
   private boolean[] P091F4_n12454TsSolTLcq ;
   private String[] P091F4_A460FasDsc ;
   private java.util.Date[] P091F4_A160BarFecRea ;
   private java.util.Date[] P091F4_A3298BarFecRIni ;
   private String[] P091F4_A603MaqCodBis ;
   private String[] P091F4_A228BarUniMed ;
   private String[] P091F4_A758ProCod ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV19IncidenciasObservaciones_SDT ;
   private app.SdtIncidenciasObservaciones_SDT AV20IncidenciasObservaciones_SDT_item ;
}

final  class phdrexwpasoflag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091F2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarExt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P091F3", "UPDATE TXPBARCAD SET BarExt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P091F4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.FasCod, T1.BarFasEst, T1.BarFasDTI, T1.BarFasDTF, T1.BarFasKgm, T1.BarFasMtr, T1.BarUni, T1.TsSolTLcq, T2.FasDsc, T1.BarFecRea, T1.BarFecRIni, T1.MaqCodBis, T3.BarUniMed, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.FasCod = ?) AND (T1.BarOrdLin = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P091F5", "UPDATE TXPBARFAS SET BarFasEst=?, BarFasDTI=?, BarFasDTF=?, BarFasKgm=?, BarFasMtr=?, BarUni=?, TsSolTLcq=?, BarFecRea=?, BarFecRIni=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 28);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((String[]) buf[23])[0] = rslt.getString(19, 8);
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
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[11]).intValue());
               }
               stmt.setDate(8, (java.util.Date)parms[12]);
               stmt.setDate(9, (java.util.Date)parms[13]);
               stmt.setString(10, (String)parms[14], 6);
               stmt.setString(11, (String)parms[15], 3);
               stmt.setInt(12, ((Number) parms[16]).intValue());
               stmt.setByte(13, ((Number) parms[17]).byteValue());
               stmt.setString(14, (String)parms[18], 1);
               stmt.setString(15, (String)parms[19], 8);
               stmt.setShort(16, ((Number) parms[20]).shortValue());
               return;
      }
   }

}

