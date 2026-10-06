package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbushis extends GXProcedure
{
   public pbushis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbushis.class ), "" );
   }

   public pbushis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pbushis.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pbushis.this.AV17EmprCod = aP0[0];
      this.aP0 = aP0;
      pbushis.this.AV37Barcod = aP1[0];
      this.aP1 = aP1;
      pbushis.this.AV35BarReo = aP2[0];
      this.aP2 = aP2;
      pbushis.this.AV36BarPar = aP3[0];
      this.aP3 = aP3;
      pbushis.this.AV40PreKgm = aP4[0];
      this.aP4 = aP4;
      pbushis.this.AV19Premts = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40PreKgm = DecimalUtil.doubleToDec(0) ;
      AV19Premts = DecimalUtil.doubleToDec(0) ;
      AV34PreDef = httpContext.getMessage( "S", "") ;
      /* Using cursor P00Q54 */
      pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV37Barcod), Byte.valueOf(AV35BarReo), AV36BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00Q54_A130BarCodPar[0] ;
         A132BarCodReo = P00Q54_A132BarCodReo[0] ;
         A129BarCod = P00Q54_A129BarCod[0] ;
         A396EmprCod = P00Q54_A396EmprCod[0] ;
         A252CliCod = P00Q54_A252CliCod[0] ;
         n252CliCod = P00Q54_n252CliCod[0] ;
         A212BarSer = P00Q54_A212BarSer[0] ;
         A135BarColNom = P00Q54_A135BarColNom[0] ;
         A136BarColNum = P00Q54_A136BarColNum[0] ;
         A218BarTipCol = P00Q54_A218BarTipCol[0] ;
         A2010BarTipDis = P00Q54_A2010BarTipDis[0] ;
         A361DisCod = P00Q54_A361DisCod[0] ;
         A228BarUniMed = P00Q54_A228BarUniMed[0] ;
         A118BarAcaQui = P00Q54_A118BarAcaQui[0] ;
         A166BarKgm = P00Q54_A166BarKgm[0] ;
         A219BarTotAgr = P00Q54_A219BarTotAgr[0] ;
         A184BarMtr = P00Q54_A184BarMtr[0] ;
         A870BarTotMtr = P00Q54_A870BarTotMtr[0] ;
         A219BarTotAgr = P00Q54_A219BarTotAgr[0] ;
         A870BarTotMtr = P00Q54_A870BarTotMtr[0] ;
         A166BarKgm = P00Q54_A166BarKgm[0] ;
         A184BarMtr = P00Q54_A184BarMtr[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
         }
         AV16CliCod = A252CliCod ;
         AV20Barser = A212BarSer ;
         AV21Barcolnom = A135BarColNom ;
         AV22Barcolnum = A136BarColNum ;
         AV23TipColcod = A218BarTipCol ;
         AV32BarTipdis = A2010BarTipDis ;
         AV33Discod = A361DisCod ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char4[0] = A135BarColNom ;
         GXv_int5[0] = A136BarColNum ;
         GXv_int6[0] = A218BarTipCol ;
         GXv_int7[0] = AV39ForNumcol ;
         new app.pnformu(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7) ;
         pbushis.this.A396EmprCod = GXv_char1[0] ;
         pbushis.this.A252CliCod = GXv_int2[0] ;
         pbushis.this.A212BarSer = GXv_char3[0] ;
         pbushis.this.A135BarColNom = GXv_char4[0] ;
         pbushis.this.A136BarColNum = GXv_int5[0] ;
         pbushis.this.A218BarTipCol = GXv_int6[0] ;
         pbushis.this.AV39ForNumcol = GXv_int7[0] ;
         AV31Aplico_mn = httpContext.getMessage( "N", "") ;
         if ( ( AV39ForNumcol >= 100000 ) && ( AV39ForNumcol <= 899999 ) )
         {
            AV31Aplico_mn = httpContext.getMessage( "S", "") ;
            if ( ( AV39ForNumcol == 180000 ) || ( AV39ForNumcol == 190000 ) || ( AV39ForNumcol == 104999 ) )
            {
               AV31Aplico_mn = httpContext.getMessage( "N", "") ;
            }
         }
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            AV30LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A871RecTotMtr, 0))) ;
            AV29UniMed = httpContext.getMessage( "M", "") ;
         }
         else
         {
            AV30LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A812RecTotKgm, 0))) ;
            AV29UniMed = httpContext.getMessage( "K", "") ;
         }
         AV26Proforpm = DecimalUtil.doubleToDec(0) ;
         AV25Proforpk = DecimalUtil.doubleToDec(0) ;
         AV27P_forcod = A118BarAcaQui ;
         /* Using cursor P00Q55 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4905BarFasAcab = P00Q55_A4905BarFasAcab[0] ;
            A4287BarFasFor = P00Q55_A4287BarFasFor[0] ;
            A764ProForCod = P00Q55_A764ProForCod[0] ;
            A5371FasQuiLin = P00Q55_A5371FasQuiLin[0] ;
            A194BarOrdLin = P00Q55_A194BarOrdLin[0] ;
            A758ProCod = P00Q55_A758ProCod[0] ;
            A4905BarFasAcab = P00Q55_A4905BarFasAcab[0] ;
            A4287BarFasFor = P00Q55_A4287BarFasFor[0] ;
            if ( ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 ) )
            {
               AV38BarAcaqui = A764ProForCod ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( GXutil.strcmp(AV38BarAcaqui, " ") != 0 ) && ( GXutil.strcmp(AV38BarAcaqui, AV27P_forcod) != 0 ) )
         {
            AV27P_forcod = AV38BarAcaqui ;
         }
         /* Execute user subroutine: 'PREQL' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV28BarALbTar = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'CLARPD' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV19Premts.doubleValue() > 0 ) && ( AV25Proforpk.doubleValue() > 0 ) )
         {
            AV25Proforpk = DecimalUtil.doubleToDec(0) ;
         }
         AV40PreKgm = AV40PreKgm.add(AV25Proforpk) ;
         AV19Premts = AV19Premts.add(AV26Proforpm) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PREQL' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P00Q56 */
      pr_default.execute(2, new Object[] {AV17EmprCod, Integer.valueOf(AV16CliCod), AV27P_forcod});
      c5448ProForPK = P00Q56_A5448ProForPK[0] ;
      n5448ProForPK = P00Q56_n5448ProForPK[0] ;
      c5447ProForPM = P00Q56_A5447ProForPM[0] ;
      n5447ProForPM = P00Q56_n5447ProForPM[0] ;
      pr_default.close(2);
      AV25Proforpk = AV25Proforpk.add(c5448ProForPK) ;
      AV26Proforpm = AV26Proforpm.add(c5447ProForPM) ;
      /* End optimized group. */
   }

   public void S121( )
   {
      /* 'CLARPD' Routine */
      returnInSub = false ;
      /* Using cursor P00Q57 */
      pr_default.execute(3, new Object[] {AV17EmprCod, Integer.valueOf(AV37Barcod), Byte.valueOf(AV35BarReo), AV36BarPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P00Q57_A130BarCodPar[0] ;
         A132BarCodReo = P00Q57_A132BarCodReo[0] ;
         A129BarCod = P00Q57_A129BarCod[0] ;
         A396EmprCod = P00Q57_A396EmprCod[0] ;
         A758ProCod = P00Q57_A758ProCod[0] ;
         AV24ForProc = A758ProCod ;
         /* Execute user subroutine: 'PRECIOP' */
         S135 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S135( )
   {
      /* 'PRECIOP' Routine */
      returnInSub = false ;
      /* Using cursor P00Q58 */
      pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV16CliCod), AV20Barser, AV21Barcolnom, Integer.valueOf(AV22Barcolnum), Byte.valueOf(AV23TipColcod), AV24ForProc});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A9766ForProC = P00Q58_A9766ForProC[0] ;
         A831TipColCod = P00Q58_A831TipColCod[0] ;
         A483ForColNum = P00Q58_A483ForColNum[0] ;
         A482ForColNom = P00Q58_A482ForColNom[0] ;
         A494ForSer = P00Q58_A494ForSer[0] ;
         A252CliCod = P00Q58_A252CliCod[0] ;
         n252CliCod = P00Q58_n252CliCod[0] ;
         A396EmprCod = P00Q58_A396EmprCod[0] ;
         A9768ForProPK = P00Q58_A9768ForProPK[0] ;
         n9768ForProPK = P00Q58_n9768ForProPK[0] ;
         A9769ForProPM = P00Q58_A9769ForProPM[0] ;
         n9769ForProPM = P00Q58_n9769ForProPM[0] ;
         AV40PreKgm = A9768ForProPK ;
         AV19Premts = A9769ForProPM ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbushis.this.AV17EmprCod;
      this.aP1[0] = pbushis.this.AV37Barcod;
      this.aP2[0] = pbushis.this.AV35BarReo;
      this.aP3[0] = pbushis.this.AV36BarPar;
      this.aP4[0] = pbushis.this.AV40PreKgm;
      this.aP5[0] = pbushis.this.AV19Premts;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34PreDef = "" ;
      scmdbuf = "" ;
      P00Q54_A130BarCodPar = new String[] {""} ;
      P00Q54_A132BarCodReo = new byte[1] ;
      P00Q54_A129BarCod = new int[1] ;
      P00Q54_A396EmprCod = new String[] {""} ;
      P00Q54_A252CliCod = new int[1] ;
      P00Q54_n252CliCod = new boolean[] {false} ;
      P00Q54_A212BarSer = new String[] {""} ;
      P00Q54_A135BarColNom = new String[] {""} ;
      P00Q54_A136BarColNum = new int[1] ;
      P00Q54_A218BarTipCol = new byte[1] ;
      P00Q54_A2010BarTipDis = new String[] {""} ;
      P00Q54_A361DisCod = new int[1] ;
      P00Q54_A228BarUniMed = new String[] {""} ;
      P00Q54_A118BarAcaQui = new String[] {""} ;
      P00Q54_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q54_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q54_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q54_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A228BarUniMed = "" ;
      A118BarAcaQui = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV20Barser = "" ;
      AV21Barcolnom = "" ;
      AV32BarTipdis = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      AV31Aplico_mn = "" ;
      AV29UniMed = "" ;
      AV26Proforpm = DecimalUtil.ZERO ;
      AV25Proforpk = DecimalUtil.ZERO ;
      AV27P_forcod = "" ;
      P00Q55_A396EmprCod = new String[] {""} ;
      P00Q55_A129BarCod = new int[1] ;
      P00Q55_A132BarCodReo = new byte[1] ;
      P00Q55_A130BarCodPar = new String[] {""} ;
      P00Q55_A4905BarFasAcab = new String[] {""} ;
      P00Q55_A4287BarFasFor = new String[] {""} ;
      P00Q55_A764ProForCod = new String[] {""} ;
      P00Q55_A5371FasQuiLin = new short[1] ;
      P00Q55_A194BarOrdLin = new short[1] ;
      P00Q55_A758ProCod = new String[] {""} ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A764ProForCod = "" ;
      A758ProCod = "" ;
      AV38BarAcaqui = "" ;
      AV28BarALbTar = DecimalUtil.ZERO ;
      c5448ProForPK = DecimalUtil.ZERO ;
      c5447ProForPM = DecimalUtil.ZERO ;
      P00Q56_A5448ProForPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q56_n5448ProForPK = new boolean[] {false} ;
      P00Q56_A5447ProForPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q56_n5447ProForPM = new boolean[] {false} ;
      P00Q57_A130BarCodPar = new String[] {""} ;
      P00Q57_A132BarCodReo = new byte[1] ;
      P00Q57_A129BarCod = new int[1] ;
      P00Q57_A396EmprCod = new String[] {""} ;
      P00Q57_A758ProCod = new String[] {""} ;
      AV24ForProc = "" ;
      P00Q58_A9766ForProC = new String[] {""} ;
      P00Q58_A831TipColCod = new byte[1] ;
      P00Q58_A483ForColNum = new int[1] ;
      P00Q58_A482ForColNom = new String[] {""} ;
      P00Q58_A494ForSer = new String[] {""} ;
      P00Q58_A252CliCod = new int[1] ;
      P00Q58_n252CliCod = new boolean[] {false} ;
      P00Q58_A396EmprCod = new String[] {""} ;
      P00Q58_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q58_n9768ForProPK = new boolean[] {false} ;
      P00Q58_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q58_n9769ForProPM = new boolean[] {false} ;
      A9766ForProC = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A9768ForProPK = DecimalUtil.ZERO ;
      A9769ForProPM = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbushis__default(),
         new Object[] {
             new Object[] {
            P00Q54_A130BarCodPar, P00Q54_A132BarCodReo, P00Q54_A129BarCod, P00Q54_A396EmprCod, P00Q54_A252CliCod, P00Q54_n252CliCod, P00Q54_A212BarSer, P00Q54_A135BarColNom, P00Q54_A136BarColNum, P00Q54_A218BarTipCol,
            P00Q54_A2010BarTipDis, P00Q54_A361DisCod, P00Q54_A228BarUniMed, P00Q54_A118BarAcaQui, P00Q54_A166BarKgm, P00Q54_A219BarTotAgr, P00Q54_A184BarMtr, P00Q54_A870BarTotMtr
            }
            , new Object[] {
            P00Q55_A396EmprCod, P00Q55_A129BarCod, P00Q55_A132BarCodReo, P00Q55_A130BarCodPar, P00Q55_A4905BarFasAcab, P00Q55_A4287BarFasFor, P00Q55_A764ProForCod, P00Q55_A5371FasQuiLin, P00Q55_A194BarOrdLin, P00Q55_A758ProCod
            }
            , new Object[] {
            P00Q56_A5448ProForPK, P00Q56_n5448ProForPK, P00Q56_A5447ProForPM, P00Q56_n5447ProForPM
            }
            , new Object[] {
            P00Q57_A130BarCodPar, P00Q57_A132BarCodReo, P00Q57_A129BarCod, P00Q57_A396EmprCod, P00Q57_A758ProCod
            }
            , new Object[] {
            P00Q58_A9766ForProC, P00Q58_A831TipColCod, P00Q58_A483ForColNum, P00Q58_A482ForColNom, P00Q58_A494ForSer, P00Q58_A252CliCod, P00Q58_A396EmprCod, P00Q58_A9768ForProPK, P00Q58_n9768ForProPK, P00Q58_A9769ForProPM,
            P00Q58_n9769ForProPM
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35BarReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV23TipColcod ;
   private byte GXv_int6[] ;
   private byte A831TipColCod ;
   private short A5371FasQuiLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV37Barcod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int AV16CliCod ;
   private int AV22Barcolnum ;
   private int AV33Discod ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int AV39ForNumcol ;
   private int GXv_int7[] ;
   private int AV30LimUni ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV40PreKgm ;
   private java.math.BigDecimal AV19Premts ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal AV26Proforpm ;
   private java.math.BigDecimal AV25Proforpk ;
   private java.math.BigDecimal AV28BarALbTar ;
   private java.math.BigDecimal c5448ProForPK ;
   private java.math.BigDecimal c5447ProForPM ;
   private java.math.BigDecimal A9768ForProPK ;
   private java.math.BigDecimal A9769ForProPM ;
   private String AV17EmprCod ;
   private String AV36BarPar ;
   private String AV34PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A228BarUniMed ;
   private String A118BarAcaQui ;
   private String AV20Barser ;
   private String AV21Barcolnom ;
   private String AV32BarTipdis ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV31Aplico_mn ;
   private String AV29UniMed ;
   private String AV27P_forcod ;
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String A764ProForCod ;
   private String A758ProCod ;
   private String AV38BarAcaqui ;
   private String AV24ForProc ;
   private String A9766ForProC ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n5448ProForPK ;
   private boolean n5447ProForPM ;
   private boolean n9768ForProPK ;
   private boolean n9769ForProPM ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Q54_A130BarCodPar ;
   private byte[] P00Q54_A132BarCodReo ;
   private int[] P00Q54_A129BarCod ;
   private String[] P00Q54_A396EmprCod ;
   private int[] P00Q54_A252CliCod ;
   private boolean[] P00Q54_n252CliCod ;
   private String[] P00Q54_A212BarSer ;
   private String[] P00Q54_A135BarColNom ;
   private int[] P00Q54_A136BarColNum ;
   private byte[] P00Q54_A218BarTipCol ;
   private String[] P00Q54_A2010BarTipDis ;
   private int[] P00Q54_A361DisCod ;
   private String[] P00Q54_A228BarUniMed ;
   private String[] P00Q54_A118BarAcaQui ;
   private java.math.BigDecimal[] P00Q54_A166BarKgm ;
   private java.math.BigDecimal[] P00Q54_A219BarTotAgr ;
   private java.math.BigDecimal[] P00Q54_A184BarMtr ;
   private java.math.BigDecimal[] P00Q54_A870BarTotMtr ;
   private String[] P00Q55_A396EmprCod ;
   private int[] P00Q55_A129BarCod ;
   private byte[] P00Q55_A132BarCodReo ;
   private String[] P00Q55_A130BarCodPar ;
   private String[] P00Q55_A4905BarFasAcab ;
   private String[] P00Q55_A4287BarFasFor ;
   private String[] P00Q55_A764ProForCod ;
   private short[] P00Q55_A5371FasQuiLin ;
   private short[] P00Q55_A194BarOrdLin ;
   private String[] P00Q55_A758ProCod ;
   private java.math.BigDecimal[] P00Q56_A5448ProForPK ;
   private boolean[] P00Q56_n5448ProForPK ;
   private java.math.BigDecimal[] P00Q56_A5447ProForPM ;
   private boolean[] P00Q56_n5447ProForPM ;
   private String[] P00Q57_A130BarCodPar ;
   private byte[] P00Q57_A132BarCodReo ;
   private int[] P00Q57_A129BarCod ;
   private String[] P00Q57_A396EmprCod ;
   private String[] P00Q57_A758ProCod ;
   private String[] P00Q58_A9766ForProC ;
   private byte[] P00Q58_A831TipColCod ;
   private int[] P00Q58_A483ForColNum ;
   private String[] P00Q58_A482ForColNom ;
   private String[] P00Q58_A494ForSer ;
   private int[] P00Q58_A252CliCod ;
   private boolean[] P00Q58_n252CliCod ;
   private String[] P00Q58_A396EmprCod ;
   private java.math.BigDecimal[] P00Q58_A9768ForProPK ;
   private boolean[] P00Q58_n9768ForProPK ;
   private java.math.BigDecimal[] P00Q58_A9769ForProPM ;
   private boolean[] P00Q58_n9769ForProPM ;
}

final  class pbushis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Q54", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipDis, T1.DisCod, T1.BarUniMed, T1.BarAcaQui, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T2.BarTotMtr, 0) AS BarTotMtr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(KgmAgr) AS BarTotAgr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00Q55", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarFasAcab, T2.BarFasFor, T1.ProForCod, T1.FasQuiLin, T1.BarOrdLin, T1.ProCod FROM (TXPFASQUI T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q56", "SELECT SUM(ProForPK), SUM(ProForPM) FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q57", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Q58", "SELECT ForProC, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForProPK, ForProPM FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
      }
   }

}

