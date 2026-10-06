package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprecarv extends GXProcedure
{
   public pprecarv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprecarv.class ), "" );
   }

   public pprecarv( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           byte[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      pprecarv.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      pprecarv.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pprecarv.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pprecarv.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      pprecarv.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      pprecarv.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      pprecarv.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      pprecarv.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      pprecarv.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      pprecarv.this.AV92Albdto = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Calculando Precio segun Carvema....", "") );
      AV19PreKgm = DecimalUtil.doubleToDec(0) ;
      AV20PreMts = DecimalUtil.doubleToDec(0) ;
      AV24PreDef = httpContext.getMessage( "S", "") ;
      AV22TotRec = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P036Z3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A132BarCodReo = P036Z3_A132BarCodReo[0] ;
         A130BarCodPar = P036Z3_A130BarCodPar[0] ;
         A129BarCod = P036Z3_A129BarCod[0] ;
         A396EmprCod = P036Z3_A396EmprCod[0] ;
         A161BarFecSal = P036Z3_A161BarFecSal[0] ;
         A252CliCod = P036Z3_A252CliCod[0] ;
         n252CliCod = P036Z3_n252CliCod[0] ;
         A212BarSer = P036Z3_A212BarSer[0] ;
         A135BarColNom = P036Z3_A135BarColNom[0] ;
         A136BarColNum = P036Z3_A136BarColNum[0] ;
         A218BarTipCol = P036Z3_A218BarTipCol[0] ;
         A2010BarTipDis = P036Z3_A2010BarTipDis[0] ;
         A361DisCod = P036Z3_A361DisCod[0] ;
         A228BarUniMed = P036Z3_A228BarUniMed[0] ;
         A120BarAgrEst = P036Z3_A120BarAgrEst[0] ;
         A193BarOpeEsp = P036Z3_A193BarOpeEsp[0] ;
         A184BarMtr = P036Z3_A184BarMtr[0] ;
         A166BarKgm = P036Z3_A166BarKgm[0] ;
         A184BarMtr = P036Z3_A184BarMtr[0] ;
         A166BarKgm = P036Z3_A166BarKgm[0] ;
         A161BarFecSal = Gx_date ;
         AV35CliCod = A252CliCod ;
         AV31BarSer = A212BarSer ;
         AV32BarColNom = A135BarColNom ;
         AV33BarColNum = A136BarColNum ;
         AV34TipColCod = A218BarTipCol ;
         AV87BarTipDis = A2010BarTipDis ;
         AV74DisCod = A361DisCod ;
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A184BarMtr, 0))) ;
            AV44UniMed = httpContext.getMessage( "M", "") ;
         }
         else
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A166BarKgm, 0))) ;
            AV44UniMed = httpContext.getMessage( "K", "") ;
         }
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(AV27LimUni) ;
            new app.ppreagr(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5) ;
            pprecarv.this.A396EmprCod = GXv_char1[0] ;
            pprecarv.this.A129BarCod = GXv_int2[0] ;
            pprecarv.this.A132BarCodReo = GXv_int3[0] ;
            pprecarv.this.A130BarCodPar = GXv_char4[0] ;
            pprecarv.this.AV27LimUni = (int)(DecimalUtil.decToDouble(GXv_decimal5[0])) ;
         }
         else
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(A166BarKgm)) ;
         }
         /* Execute user subroutine: 'CLIINF' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'LOCFOR' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19PreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20PreMts)==0) )
         {
            AV36Noprecio = httpContext.getMessage( "N", "") ;
         }
         else
         {
            AV36Noprecio = httpContext.getMessage( "S", "") ;
         }
         if ( ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "N", "")) == 0 ) || ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "N", "")) == 0 ) )
         {
            AV21Operesp = (byte)(2) ;
         }
         if ( ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "N", "")) == 0 ) && ( A193BarOpeEsp == 4 ) )
         {
            AV21Operesp = (byte)(4) ;
         }
         if ( ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( ( A193BarOpeEsp == 1 ) || ( A193BarOpeEsp == 5 ) || ( A193BarOpeEsp == 7 ) )
            {
               AV21Operesp = A193BarOpeEsp ;
            }
            else
            {
               AV21Operesp = (byte)(A193BarOpeEsp+10) ;
            }
         }
         A161BarFecSal = GXutil.today( ) ;
         /* Using cursor P036Z4 */
         pr_default.execute(1, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CLIINF' Routine */
      returnInSub = false ;
      AV54PorRec = DecimalUtil.doubleToDec(0) ;
      AV92Albdto = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P036Z5 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P036Z5_A252CliCod[0] ;
         n252CliCod = P036Z5_n252CliCod[0] ;
         A396EmprCod = P036Z5_A396EmprCod[0] ;
         A5504CliifVal = P036Z5_A5504CliifVal[0] ;
         n5504CliifVal = P036Z5_n5504CliifVal[0] ;
         A5505CliifPor = P036Z5_A5505CliifPor[0] ;
         n5505CliifPor = P036Z5_n5505CliifPor[0] ;
         A5503CliifLin = P036Z5_A5503CliifLin[0] ;
         if ( AV27LimUni <= A5504CliifVal.doubleValue() )
         {
            AV54PorRec = A5505CliifPor ;
            AV92Albdto = A5505CliifPor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      AV22TotRec = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P036Z6 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A831TipColCod = P036Z6_A831TipColCod[0] ;
         A483ForColNum = P036Z6_A483ForColNum[0] ;
         A482ForColNom = P036Z6_A482ForColNom[0] ;
         A494ForSer = P036Z6_A494ForSer[0] ;
         A252CliCod = P036Z6_A252CliCod[0] ;
         n252CliCod = P036Z6_n252CliCod[0] ;
         A396EmprCod = P036Z6_A396EmprCod[0] ;
         A493ForPreMtr = P036Z6_A493ForPreMtr[0] ;
         n493ForPreMtr = P036Z6_n493ForPreMtr[0] ;
         A492ForPreKgm = P036Z6_A492ForPreKgm[0] ;
         n492ForPreKgm = P036Z6_n492ForPreKgm[0] ;
         A491ForPreDef = P036Z6_A491ForPreDef[0] ;
         n491ForPreDef = P036Z6_n491ForPreDef[0] ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A492ForPreKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A493ForPreMtr)==0) )
         {
            AV19PreKgm = A492ForPreKgm ;
            if ( A492ForPreKgm.doubleValue() > 0 )
            {
               AV22TotRec = GXutil.roundDecimal( AV19PreKgm.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
               AV19PreKgm = AV19PreKgm.add(AV22TotRec) ;
            }
            AV20PreMts = A493ForPreMtr ;
            if ( A493ForPreMtr.doubleValue() > 0 )
            {
               AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
            if ( GXutil.strcmp(A491ForPreDef, httpContext.getMessage( "N", "")) == 0 )
            {
               AV24PreDef = httpContext.getMessage( "N", "") ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprecarv.this.AV15EmprCod;
      this.aP1[0] = pprecarv.this.AV16BarCod;
      this.aP2[0] = pprecarv.this.AV17BarReo;
      this.aP3[0] = pprecarv.this.AV18BarPar;
      this.aP4[0] = pprecarv.this.AV19PreKgm;
      this.aP5[0] = pprecarv.this.AV20PreMts;
      this.aP6[0] = pprecarv.this.AV21Operesp;
      this.aP7[0] = pprecarv.this.AV22TotRec;
      this.aP8[0] = pprecarv.this.AV92Albdto;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprecarv");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24PreDef = "" ;
      scmdbuf = "" ;
      P036Z3_A132BarCodReo = new byte[1] ;
      P036Z3_A130BarCodPar = new String[] {""} ;
      P036Z3_A129BarCod = new int[1] ;
      P036Z3_A396EmprCod = new String[] {""} ;
      P036Z3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P036Z3_A252CliCod = new int[1] ;
      P036Z3_n252CliCod = new boolean[] {false} ;
      P036Z3_A212BarSer = new String[] {""} ;
      P036Z3_A135BarColNom = new String[] {""} ;
      P036Z3_A136BarColNum = new int[1] ;
      P036Z3_A218BarTipCol = new byte[1] ;
      P036Z3_A2010BarTipDis = new String[] {""} ;
      P036Z3_A361DisCod = new int[1] ;
      P036Z3_A228BarUniMed = new String[] {""} ;
      P036Z3_A120BarAgrEst = new String[] {""} ;
      P036Z3_A193BarOpeEsp = new byte[1] ;
      P036Z3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036Z3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A228BarUniMed = "" ;
      A120BarAgrEst = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV87BarTipDis = "" ;
      AV44UniMed = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV36Noprecio = "" ;
      AV54PorRec = DecimalUtil.ZERO ;
      P036Z5_A252CliCod = new int[1] ;
      P036Z5_n252CliCod = new boolean[] {false} ;
      P036Z5_A396EmprCod = new String[] {""} ;
      P036Z5_A5504CliifVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036Z5_n5504CliifVal = new boolean[] {false} ;
      P036Z5_A5505CliifPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036Z5_n5505CliifPor = new boolean[] {false} ;
      P036Z5_A5503CliifLin = new short[1] ;
      A5504CliifVal = DecimalUtil.ZERO ;
      A5505CliifPor = DecimalUtil.ZERO ;
      P036Z6_A831TipColCod = new byte[1] ;
      P036Z6_A483ForColNum = new int[1] ;
      P036Z6_A482ForColNom = new String[] {""} ;
      P036Z6_A494ForSer = new String[] {""} ;
      P036Z6_A252CliCod = new int[1] ;
      P036Z6_n252CliCod = new boolean[] {false} ;
      P036Z6_A396EmprCod = new String[] {""} ;
      P036Z6_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036Z6_n493ForPreMtr = new boolean[] {false} ;
      P036Z6_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036Z6_n492ForPreKgm = new boolean[] {false} ;
      P036Z6_A491ForPreDef = new String[] {""} ;
      P036Z6_n491ForPreDef = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprecarv__default(),
         new Object[] {
             new Object[] {
            P036Z3_A132BarCodReo, P036Z3_A130BarCodPar, P036Z3_A129BarCod, P036Z3_A396EmprCod, P036Z3_A161BarFecSal, P036Z3_A252CliCod, P036Z3_n252CliCod, P036Z3_A212BarSer, P036Z3_A135BarColNom, P036Z3_A136BarColNum,
            P036Z3_A218BarTipCol, P036Z3_A2010BarTipDis, P036Z3_A361DisCod, P036Z3_A228BarUniMed, P036Z3_A120BarAgrEst, P036Z3_A193BarOpeEsp, P036Z3_A184BarMtr, P036Z3_A166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P036Z5_A252CliCod, P036Z5_A396EmprCod, P036Z5_A5504CliifVal, P036Z5_n5504CliifVal, P036Z5_A5505CliifPor, P036Z5_n5505CliifPor, P036Z5_A5503CliifLin
            }
            , new Object[] {
            P036Z6_A831TipColCod, P036Z6_A483ForColNum, P036Z6_A482ForColNom, P036Z6_A494ForSer, P036Z6_A252CliCod, P036Z6_A396EmprCod, P036Z6_A493ForPreMtr, P036Z6_n493ForPreMtr, P036Z6_A492ForPreKgm, P036Z6_n492ForPreKgm,
            P036Z6_A491ForPreDef, P036Z6_n491ForPreDef
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte AV21Operesp ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte GXv_int3[] ;
   private byte A831TipColCod ;
   private short A5503CliifLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int AV35CliCod ;
   private int AV33BarColNum ;
   private int AV74DisCod ;
   private int AV27LimUni ;
   private int GXv_int2[] ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal AV92Albdto ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV54PorRec ;
   private java.math.BigDecimal A5504CliifVal ;
   private java.math.BigDecimal A5505CliifPor ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A492ForPreKgm ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String AV24PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A228BarUniMed ;
   private String A120BarAgrEst ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
   private String AV87BarTipDis ;
   private String AV44UniMed ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV36Noprecio ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A491ForPreDef ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n5504CliifVal ;
   private boolean n5505CliifPor ;
   private boolean n493ForPreMtr ;
   private boolean n492ForPreKgm ;
   private boolean n491ForPreDef ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private byte[] P036Z3_A132BarCodReo ;
   private String[] P036Z3_A130BarCodPar ;
   private int[] P036Z3_A129BarCod ;
   private String[] P036Z3_A396EmprCod ;
   private java.util.Date[] P036Z3_A161BarFecSal ;
   private int[] P036Z3_A252CliCod ;
   private boolean[] P036Z3_n252CliCod ;
   private String[] P036Z3_A212BarSer ;
   private String[] P036Z3_A135BarColNom ;
   private int[] P036Z3_A136BarColNum ;
   private byte[] P036Z3_A218BarTipCol ;
   private String[] P036Z3_A2010BarTipDis ;
   private int[] P036Z3_A361DisCod ;
   private String[] P036Z3_A228BarUniMed ;
   private String[] P036Z3_A120BarAgrEst ;
   private byte[] P036Z3_A193BarOpeEsp ;
   private java.math.BigDecimal[] P036Z3_A184BarMtr ;
   private java.math.BigDecimal[] P036Z3_A166BarKgm ;
   private int[] P036Z5_A252CliCod ;
   private boolean[] P036Z5_n252CliCod ;
   private String[] P036Z5_A396EmprCod ;
   private java.math.BigDecimal[] P036Z5_A5504CliifVal ;
   private boolean[] P036Z5_n5504CliifVal ;
   private java.math.BigDecimal[] P036Z5_A5505CliifPor ;
   private boolean[] P036Z5_n5505CliifPor ;
   private short[] P036Z5_A5503CliifLin ;
   private byte[] P036Z6_A831TipColCod ;
   private int[] P036Z6_A483ForColNum ;
   private String[] P036Z6_A482ForColNom ;
   private String[] P036Z6_A494ForSer ;
   private int[] P036Z6_A252CliCod ;
   private boolean[] P036Z6_n252CliCod ;
   private String[] P036Z6_A396EmprCod ;
   private java.math.BigDecimal[] P036Z6_A493ForPreMtr ;
   private boolean[] P036Z6_n493ForPreMtr ;
   private java.math.BigDecimal[] P036Z6_A492ForPreKgm ;
   private boolean[] P036Z6_n492ForPreKgm ;
   private String[] P036Z6_A491ForPreDef ;
   private boolean[] P036Z6_n491ForPreDef ;
}

final  class pprecarv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036Z3", "SELECT T1.BarCodReo, T1.BarCodPar, T1.BarCod, T1.EmprCod, T1.BarFecSal, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipDis, T1.DisCod, T1.BarUniMed, T1.BarAgrEst, T1.BarOpeEsp, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P036Z4", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P036Z5", "SELECT CliCod, EmprCod, CliifVal, CliifPor, CliifLin FROM TXPCLIINF WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliifLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P036Z6", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForPreMtr, ForPreKgm, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

