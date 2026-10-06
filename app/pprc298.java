package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc298 extends GXProcedure
{
   public pprc298( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc298.class ), "" );
   }

   public pprc298( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      pprc298.this.A396EmprCod = aP0;
      pprc298.this.AV27Hisprodtf = aP1;
      pprc298.this.AV28Hisprodtf_to = aP2;
      pprc298.this.AV21maqcod1 = aP3;
      pprc298.this.AV22maqcod2 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17Treal ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int2) ;
      pprc298.this.GXt_int1 = GXv_int2[0] ;
      AV17Treal = GXt_int1 ;
      GXt_int1 = AV19Lavan ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int2) ;
      pprc298.this.GXt_int1 = GXv_int2[0] ;
      AV19Lavan = GXt_int1 ;
      GXt_int1 = AV26Grulec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      pprc298.this.GXt_int1 = GXv_int2[0] ;
      AV26Grulec = GXt_int1 ;
      AV20Emprcod = A396EmprCod ;
      /* Using cursor P09QF2 */
      pr_default.execute(0, new Object[] {AV21maqcod1, AV27Hisprodtf, A396EmprCod, AV28Hisprodtf_to, AV22maqcod2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9QF2 = false ;
         A656ParCod = P09QF2_A656ParCod[0] ;
         n656ParCod = P09QF2_n656ParCod[0] ;
         A556HisProEst = P09QF2_A556HisProEst[0] ;
         A461Fase = P09QF2_A461Fase[0] ;
         A130BarCodPar = P09QF2_A130BarCodPar[0] ;
         A132BarCodReo = P09QF2_A132BarCodReo[0] ;
         A129BarCod = P09QF2_A129BarCod[0] ;
         A3610HisProLot = P09QF2_A3610HisProLot[0] ;
         A3612HisProReo = P09QF2_A3612HisProReo[0] ;
         A568HisProUni = P09QF2_A568HisProUni[0] ;
         A1525HisProKgr = P09QF2_A1525HisProKgr[0] ;
         A4714HisProNpzs = P09QF2_A4714HisProNpzs[0] ;
         A1526HisProMtr = P09QF2_A1526HisProMtr[0] ;
         A10360HisProFd = P09QF2_A10360HisProFd[0] ;
         A602MaqCod = P09QF2_A602MaqCod[0] ;
         A563HisProMin = P09QF2_A563HisProMin[0] ;
         A560HisProHin = P09QF2_A560HisProHin[0] ;
         A562HisProMfi = P09QF2_A562HisProMfi[0] ;
         A559HisProHfi = P09QF2_A559HisProHfi[0] ;
         A4440HisProDTI = P09QF2_A4440HisProDTI[0] ;
         n4440HisProDTI = P09QF2_n4440HisProDTI[0] ;
         A4441HisProDTF = P09QF2_A4441HisProDTF[0] ;
         n4441HisProDTF = P09QF2_n4441HisProDTF[0] ;
         A558HisProFec = P09QF2_A558HisProFec[0] ;
         A561HisProLin = P09QF2_A561HisProLin[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         /*
            INSERT RECORD ON TABLE TXPCMHPRO

         */
         W396EmprCod = A396EmprCod ;
         A396EmprCod = AV20Emprcod ;
         A634MhiMes = (byte)(GXutil.month( A10360HisProFd)) ;
         A632MhiAny = (short)(GXutil.year( A10360HisProFd)) ;
         /* Using cursor P09QF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Byte.valueOf(A634MhiMes), Short.valueOf(A632MhiAny)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMHPRO");
         if ( (pr_default.getStatus(1) == 1) )
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
         /* End Insert */
         AV10TotTie = 0 ;
         AV11TotUniPro = DecimalUtil.doubleToDec(0) ;
         AV12TotUniReo = DecimalUtil.doubleToDec(0) ;
         AV13TotProKgr = DecimalUtil.doubleToDec(0) ;
         AV14TotProMtr = DecimalUtil.doubleToDec(0) ;
         AV15TotReoMtr = DecimalUtil.doubleToDec(0) ;
         AV16TotReoKgr = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09QF2_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(P09QF2_A4441HisProDTF[0], A4441HisProDTF) )
         {
            brk9QF2 = false ;
            A656ParCod = P09QF2_A656ParCod[0] ;
            n656ParCod = P09QF2_n656ParCod[0] ;
            A556HisProEst = P09QF2_A556HisProEst[0] ;
            A461Fase = P09QF2_A461Fase[0] ;
            A130BarCodPar = P09QF2_A130BarCodPar[0] ;
            A132BarCodReo = P09QF2_A132BarCodReo[0] ;
            A129BarCod = P09QF2_A129BarCod[0] ;
            A3610HisProLot = P09QF2_A3610HisProLot[0] ;
            A3612HisProReo = P09QF2_A3612HisProReo[0] ;
            A568HisProUni = P09QF2_A568HisProUni[0] ;
            A1525HisProKgr = P09QF2_A1525HisProKgr[0] ;
            A4714HisProNpzs = P09QF2_A4714HisProNpzs[0] ;
            A1526HisProMtr = P09QF2_A1526HisProMtr[0] ;
            A10360HisProFd = P09QF2_A10360HisProFd[0] ;
            A563HisProMin = P09QF2_A563HisProMin[0] ;
            A560HisProHin = P09QF2_A560HisProHin[0] ;
            A562HisProMfi = P09QF2_A562HisProMfi[0] ;
            A559HisProHfi = P09QF2_A559HisProHfi[0] ;
            A4440HisProDTI = P09QF2_A4440HisProDTI[0] ;
            n4440HisProDTI = P09QF2_n4440HisProDTI[0] ;
            A558HisProFec = P09QF2_A558HisProFec[0] ;
            A561HisProLin = P09QF2_A561HisProLin[0] ;
            if ( GXutil.strcmp(P09QF2_A396EmprCod[0], A396EmprCod) == 0 )
            {
               if ( A556HisProEst != 9 )
               {
                  if ( (0==A656ParCod) )
                  {
                     if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                     {
                        A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                     }
                     else
                     {
                        A5605HisProTr2 = (short)(0) ;
                     }
                     if ( A560HisProHin <= A559HisProHfi )
                     {
                        A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                     }
                     else
                     {
                        A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                     }
                     GXv_char3[0] = A396EmprCod ;
                     GXv_char4[0] = A461Fase ;
                     GXv_char5[0] = AV23FasActTin ;
                     new app.pfasest(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
                     pprc298.this.A396EmprCod = GXv_char3[0] ;
                     pprc298.this.A461Fase = GXv_char4[0] ;
                     pprc298.this.AV23FasActTin = GXv_char5[0] ;
                     AV24FlagMarca = (byte)(0) ;
                     AV25HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                     AV24FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV25HisProLot)==0) ? 1 : AV24FlagMarca)) ;
                     AV24FlagMarca = (byte)(((AV26Grulec==0)&&(GXutil.strcmp(AV23FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : ((AV26Grulec==1)&&(GXutil.strcmp(A3610HisProLot, AV25HisProLot)==0)&&(GXutil.strcmp(AV23FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV24FlagMarca))) ;
                     if ( AV24FlagMarca == 1 )
                     {
                        AV18HisProTre = ((AV17Treal==0) ? A564HisProTre : A5605HisProTr2) ;
                        AV10TotTie = (long)(AV10TotTie+(((0==A656ParCod)&&!(0==A556HisProEst) ? AV18HisProTre : 0))) ;
                     }
                     if ( A3612HisProReo == 0 )
                     {
                        AV11TotUniPro = AV11TotUniPro.add(A568HisProUni) ;
                        AV13TotProKgr = AV13TotProKgr.add(A1525HisProKgr) ;
                        AV14TotProMtr = AV14TotProMtr.add((((AV19Lavan==0) ? A1526HisProMtr : DecimalUtil.doubleToDec(A4714HisProNpzs)))) ;
                     }
                     else
                     {
                        AV12TotUniReo = AV12TotUniReo.add(A568HisProUni) ;
                        AV16TotReoKgr = AV16TotReoKgr.add(A1525HisProKgr) ;
                        AV15TotReoMtr = AV15TotReoMtr.add((((AV19Lavan==0) ? A1526HisProMtr : DecimalUtil.doubleToDec(A4714HisProNpzs)))) ;
                     }
                     A556HisProEst = (byte)(9) ;
                     AV39HisProFd = A10360HisProFd ;
                     /* Using cursor P09QF4 */
                     pr_default.execute(2, new Object[] {Byte.valueOf(A556HisProEst), A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
                  }
               }
            }
            brk9QF2 = true ;
            pr_default.readNext(0);
         }
         /*
            INSERT RECORD ON TABLE TXPLMHPRO

         */
         W396EmprCod = A396EmprCod ;
         A396EmprCod = AV20Emprcod ;
         A634MhiMes = (byte)(GXutil.month( AV39HisProFd)) ;
         A632MhiAny = (short)(GXutil.year( AV39HisProFd)) ;
         A633MhiLin = (byte)(GXutil.day( AV39HisProFd)) ;
         A635MhiPro = ((DecimalUtil.compareTo(AV11TotUniPro, DecimalUtil.stringToDec("999999999.99"))>0) ? DecimalUtil.stringToDec("999999999.99") : AV11TotUniPro) ;
         n635MhiPro = false ;
         A865MhiReo = ((DecimalUtil.compareTo(AV12TotUniReo, DecimalUtil.stringToDec("999999999.99"))>0) ? DecimalUtil.stringToDec("999999999.99") : AV12TotUniReo) ;
         n865MhiReo = false ;
         A636MhiTie = (short)(((AV10TotTie>9999999999L) ? 9999999999L : AV10TotTie)) ;
         n636MhiTie = false ;
         A1527MhiProKg = AV13TotProKgr ;
         n1527MhiProKg = false ;
         A1528MhiProMt = AV14TotProMtr ;
         n1528MhiProMt = false ;
         A1529MhiReoKg = AV16TotReoKgr ;
         n1529MhiReoKg = false ;
         A1530MhiReoMt = AV15TotReoMtr ;
         n1530MhiReoMt = false ;
         /* Using cursor P09QF5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, Byte.valueOf(A634MhiMes), Short.valueOf(A632MhiAny), Byte.valueOf(A633MhiLin), Boolean.valueOf(n635MhiPro), A635MhiPro, Boolean.valueOf(n636MhiTie), Short.valueOf(A636MhiTie), Boolean.valueOf(n865MhiReo), A865MhiReo, Boolean.valueOf(n1527MhiProKg), A1527MhiProKg, Boolean.valueOf(n1528MhiProMt), A1528MhiProMt, Boolean.valueOf(n1529MhiReoKg), A1529MhiReoKg, Boolean.valueOf(n1530MhiReoMt), A1530MhiReoMt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMHPRO");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n1530MhiReoMt = false ;
            n1529MhiReoKg = false ;
            n1528MhiProMt = false ;
            n1527MhiProKg = false ;
            n636MhiTie = false ;
            n865MhiReo = false ;
            n635MhiPro = false ;
            /* Optimized UPDATE. */
            /* Using cursor P09QF6 */
            pr_default.execute(4, new Object[] {AV15TotReoMtr, AV16TotReoKgr, AV14TotProMtr, AV13TotProKgr, Long.valueOf(AV10TotTie), Long.valueOf(AV10TotTie), AV12TotUniReo, AV12TotUniReo, AV11TotUniPro, AV11TotUniPro, A396EmprCod, A602MaqCod, Byte.valueOf(A634MhiMes), Short.valueOf(A632MhiAny), Byte.valueOf(A633MhiLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMHPRO");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         if ( ! brk9QF2 )
         {
            brk9QF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc298");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV20Emprcod = "" ;
      scmdbuf = "" ;
      P09QF2_A396EmprCod = new String[] {""} ;
      P09QF2_A656ParCod = new short[1] ;
      P09QF2_n656ParCod = new boolean[] {false} ;
      P09QF2_A556HisProEst = new byte[1] ;
      P09QF2_A461Fase = new String[] {""} ;
      P09QF2_A130BarCodPar = new String[] {""} ;
      P09QF2_A132BarCodReo = new byte[1] ;
      P09QF2_A129BarCod = new int[1] ;
      P09QF2_A3610HisProLot = new String[] {""} ;
      P09QF2_A3612HisProReo = new byte[1] ;
      P09QF2_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QF2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QF2_A4714HisProNpzs = new short[1] ;
      P09QF2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QF2_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      P09QF2_A602MaqCod = new String[] {""} ;
      P09QF2_A563HisProMin = new byte[1] ;
      P09QF2_A560HisProHin = new byte[1] ;
      P09QF2_A562HisProMfi = new byte[1] ;
      P09QF2_A559HisProHfi = new byte[1] ;
      P09QF2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09QF2_n4440HisProDTI = new boolean[] {false} ;
      P09QF2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09QF2_n4441HisProDTF = new boolean[] {false} ;
      P09QF2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09QF2_A561HisProLin = new int[1] ;
      A461Fase = "" ;
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A10360HisProFd = GXutil.nullDate() ;
      A602MaqCod = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      W396EmprCod = "" ;
      Gx_emsg = "" ;
      AV11TotUniPro = DecimalUtil.ZERO ;
      AV12TotUniReo = DecimalUtil.ZERO ;
      AV13TotProKgr = DecimalUtil.ZERO ;
      AV14TotProMtr = DecimalUtil.ZERO ;
      AV15TotReoMtr = DecimalUtil.ZERO ;
      AV16TotReoKgr = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV23FasActTin = "" ;
      GXv_char5 = new String[1] ;
      AV25HisProLot = "" ;
      AV39HisProFd = GXutil.nullDate() ;
      A635MhiPro = DecimalUtil.ZERO ;
      A865MhiReo = DecimalUtil.ZERO ;
      A1527MhiProKg = DecimalUtil.ZERO ;
      A1528MhiProMt = DecimalUtil.ZERO ;
      A1529MhiReoKg = DecimalUtil.ZERO ;
      A1530MhiReoMt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc298__default(),
         new Object[] {
             new Object[] {
            P09QF2_A396EmprCod, P09QF2_A656ParCod, P09QF2_n656ParCod, P09QF2_A556HisProEst, P09QF2_A461Fase, P09QF2_A130BarCodPar, P09QF2_A132BarCodReo, P09QF2_A129BarCod, P09QF2_A3610HisProLot, P09QF2_A3612HisProReo,
            P09QF2_A568HisProUni, P09QF2_A1525HisProKgr, P09QF2_A4714HisProNpzs, P09QF2_A1526HisProMtr, P09QF2_A10360HisProFd, P09QF2_A602MaqCod, P09QF2_A563HisProMin, P09QF2_A560HisProHin, P09QF2_A562HisProMfi, P09QF2_A559HisProHfi,
            P09QF2_A4440HisProDTI, P09QF2_n4440HisProDTI, P09QF2_A4441HisProDTF, P09QF2_n4441HisProDTF, P09QF2_A558HisProFec, P09QF2_A561HisProLin
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

   private byte AV17Treal ;
   private byte AV19Lavan ;
   private byte AV26Grulec ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private byte A3612HisProReo ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte A634MhiMes ;
   private byte AV24FlagMarca ;
   private byte A633MhiLin ;
   private short A656ParCod ;
   private short A4714HisProNpzs ;
   private short A5605HisProTr2 ;
   private short A564HisProTre ;
   private short A632MhiAny ;
   private short Gx_err ;
   private short AV18HisProTre ;
   private short A636MhiTie ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int GX_INS71 ;
   private int GX_INS72 ;
   private long AV10TotTie ;
   private java.math.BigDecimal A568HisProUni ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV11TotUniPro ;
   private java.math.BigDecimal AV12TotUniReo ;
   private java.math.BigDecimal AV13TotProKgr ;
   private java.math.BigDecimal AV14TotProMtr ;
   private java.math.BigDecimal AV15TotReoMtr ;
   private java.math.BigDecimal AV16TotReoKgr ;
   private java.math.BigDecimal A635MhiPro ;
   private java.math.BigDecimal A865MhiReo ;
   private java.math.BigDecimal A1527MhiProKg ;
   private java.math.BigDecimal A1528MhiProMt ;
   private java.math.BigDecimal A1529MhiReoKg ;
   private java.math.BigDecimal A1530MhiReoMt ;
   private String A396EmprCod ;
   private String AV21maqcod1 ;
   private String AV22maqcod2 ;
   private String AV20Emprcod ;
   private String scmdbuf ;
   private String A461Fase ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A602MaqCod ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV23FasActTin ;
   private String GXv_char5[] ;
   private String AV25HisProLot ;
   private java.util.Date AV27Hisprodtf ;
   private java.util.Date AV28Hisprodtf_to ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A10360HisProFd ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV39HisProFd ;
   private boolean brk9QF2 ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n635MhiPro ;
   private boolean n865MhiReo ;
   private boolean n636MhiTie ;
   private boolean n1527MhiProKg ;
   private boolean n1528MhiProMt ;
   private boolean n1529MhiReoKg ;
   private boolean n1530MhiReoMt ;
   private IDataStoreProvider pr_default ;
   private String[] P09QF2_A396EmprCod ;
   private short[] P09QF2_A656ParCod ;
   private boolean[] P09QF2_n656ParCod ;
   private byte[] P09QF2_A556HisProEst ;
   private String[] P09QF2_A461Fase ;
   private String[] P09QF2_A130BarCodPar ;
   private byte[] P09QF2_A132BarCodReo ;
   private int[] P09QF2_A129BarCod ;
   private String[] P09QF2_A3610HisProLot ;
   private byte[] P09QF2_A3612HisProReo ;
   private java.math.BigDecimal[] P09QF2_A568HisProUni ;
   private java.math.BigDecimal[] P09QF2_A1525HisProKgr ;
   private short[] P09QF2_A4714HisProNpzs ;
   private java.math.BigDecimal[] P09QF2_A1526HisProMtr ;
   private java.util.Date[] P09QF2_A10360HisProFd ;
   private String[] P09QF2_A602MaqCod ;
   private byte[] P09QF2_A563HisProMin ;
   private byte[] P09QF2_A560HisProHin ;
   private byte[] P09QF2_A562HisProMfi ;
   private byte[] P09QF2_A559HisProHfi ;
   private java.util.Date[] P09QF2_A4440HisProDTI ;
   private boolean[] P09QF2_n4440HisProDTI ;
   private java.util.Date[] P09QF2_A4441HisProDTF ;
   private boolean[] P09QF2_n4441HisProDTF ;
   private java.util.Date[] P09QF2_A558HisProFec ;
   private int[] P09QF2_A561HisProLin ;
}

final  class pprc298__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QF2", "SELECT EmprCod, ParCod, HisProEst, Fase, BarCodPar, BarCodReo, BarCod, HisProLot, HisProReo, HisProUni, HisProKgr, HisProNpzs, HisProMtr, HisProFd, MaqCod, HisProMin, HisProHin, HisProMfi, HisProHfi, HisProDTI, HisProDTF, HisProFec, HisProLin FROM TXPLHIPRO WHERE (MaqCod >= ? and HisProDTF >= ?) AND (EmprCod = ?) AND ((ParCod = 0)) AND (HisProDTF <= ?) AND (MaqCod <= ?) ORDER BY MaqCod, HisProDTF ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09QF3", "INSERT INTO TXPCMHPRO(EmprCod, MaqCod, MhiMes, MhiAny) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMHPRO")
         ,new UpdateCursor("P09QF4", "UPDATE TXPLHIPRO SET HisProEst=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
         ,new UpdateCursor("P09QF5", "INSERT INTO TXPLMHPRO(EmprCod, MaqCod, MhiMes, MhiAny, MhiLin, MhiPro, MhiTie, MhiReo, MhiProKg, MhiProMt, MhiReoKg, MhiReoMt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMHPRO")
         ,new UpdateCursor("P09QF6", "UPDATE TXPLMHPRO SET MhiReoMt=MhiReoMt + ?, MhiReoKg=MhiReoKg + ?, MhiProMt=MhiProMt + ?, MhiProKg=MhiProKg + ?, MhiTie=MhiTie + ( CASE  WHEN ( ? + MhiTie) > 9999999999 THEN 0 ELSE ? END), MhiReo=MhiReo + ( CASE  WHEN ? > 999999999.99 THEN 0 ELSE ? END), MhiPro=MhiPro + ( CASE  WHEN ? > 999999999.99 THEN 0 ELSE ? END)  WHERE EmprCod = ? and MaqCod = ? and MhiMes = ? and MhiAny = ? and MhiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMHPRO")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 10);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 6);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(22);
               ((int[]) buf[25])[0] = rslt.getInt(23);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setString(12, (String)parms[11], 6);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               return;
      }
   }

}

