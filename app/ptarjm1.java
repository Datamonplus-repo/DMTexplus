package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptarjm1 extends GXProcedure
{
   public ptarjm1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptarjm1.class ), "" );
   }

   public ptarjm1( int remoteHandle ,
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
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 )
   {
      ptarjm1.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      ptarjm1.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ptarjm1.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ptarjm1.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      ptarjm1.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      ptarjm1.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      ptarjm1.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      ptarjm1.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      ptarjm1.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      ptarjm1.this.AV23Recar = aP8[0];
      this.aP8 = aP8;
      ptarjm1.this.AV24Dtos = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19PreKgm = DecimalUtil.ZERO ;
      AV20PreMts = DecimalUtil.ZERO ;
      AV23Recar = DecimalUtil.ZERO ;
      AV24Dtos = DecimalUtil.ZERO ;
      /* Using cursor P00FQ3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00FQ3_A361DisCod[0] ;
         A132BarCodReo = P00FQ3_A132BarCodReo[0] ;
         A130BarCodPar = P00FQ3_A130BarCodPar[0] ;
         A129BarCod = P00FQ3_A129BarCod[0] ;
         A396EmprCod = P00FQ3_A396EmprCod[0] ;
         A161BarFecSal = P00FQ3_A161BarFecSal[0] ;
         A212BarSer = P00FQ3_A212BarSer[0] ;
         A135BarColNom = P00FQ3_A135BarColNom[0] ;
         A136BarColNum = P00FQ3_A136BarColNum[0] ;
         A218BarTipCol = P00FQ3_A218BarTipCol[0] ;
         A2010BarTipDis = P00FQ3_A2010BarTipDis[0] ;
         A217BarTipArt = P00FQ3_A217BarTipArt[0] ;
         n217BarTipArt = P00FQ3_n217BarTipArt[0] ;
         A252CliCod = P00FQ3_A252CliCod[0] ;
         n252CliCod = P00FQ3_n252CliCod[0] ;
         A966PartCod = P00FQ3_A966PartCod[0] ;
         n966PartCod = P00FQ3_n966PartCod[0] ;
         A2746BarCodTex = P00FQ3_A2746BarCodTex[0] ;
         n2746BarCodTex = P00FQ3_n2746BarCodTex[0] ;
         A1157TipConCod = P00FQ3_A1157TipConCod[0] ;
         n1157TipConCod = P00FQ3_n1157TipConCod[0] ;
         A898BarPieNDes = P00FQ3_A898BarPieNDes[0] ;
         A166BarKgm = P00FQ3_A166BarKgm[0] ;
         A966PartCod = P00FQ3_A966PartCod[0] ;
         n966PartCod = P00FQ3_n966PartCod[0] ;
         A1157TipConCod = P00FQ3_A1157TipConCod[0] ;
         n1157TipConCod = P00FQ3_n1157TipConCod[0] ;
         A898BarPieNDes = P00FQ3_A898BarPieNDes[0] ;
         A166BarKgm = P00FQ3_A166BarKgm[0] ;
         A161BarFecSal = Gx_date ;
         AV27BarSer = A212BarSer ;
         AV28BarColNom = A135BarColNom ;
         AV29BarColNum = A136BarColNum ;
         AV30TipColCod = A218BarTipCol ;
         AV33Sec = A2010BarTipDis ;
         AV34TipArtCod = A217BarTipArt ;
         AV31CliCod = A252CliCod ;
         AV35PartCod = A966PartCod ;
         AV36BarCodTex = A2746BarCodTex ;
         AV37ForCon = A1157TipConCod ;
         AV38NumCon = A898BarPieNDes ;
         AV41KgsFac = A166BarKgm ;
         AV43LimCon = DecimalUtil.ZERO ;
         if ( ! (0==AV38NumCon) )
         {
            AV43LimCon = (AV41KgsFac.divide(DecimalUtil.doubleToDec(AV38NumCon), 18, java.math.RoundingMode.DOWN)) ;
         }
         if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "L", "")) == 0 )
         {
            AV21Operesp = (byte)(2) ;
         }
         else
         {
            /* Execute user subroutine: 'LEOFORM' */
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
            /* Execute user subroutine: 'TARIFAS' */
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
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19PreKgm)==0) )
            {
               AV21Operesp = (byte)(10) ;
            }
            else
            {
               AV21Operesp = (byte)(2) ;
            }
         }
         /* Using cursor P00FQ4 */
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
      /* 'LEOFORM' Routine */
      returnInSub = false ;
      /* Using cursor P00FQ5 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV27BarSer, AV28BarColNom, Integer.valueOf(AV29BarColNum), Byte.valueOf(AV30TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P00FQ5_A831TipColCod[0] ;
         A483ForColNum = P00FQ5_A483ForColNum[0] ;
         A482ForColNom = P00FQ5_A482ForColNom[0] ;
         A494ForSer = P00FQ5_A494ForSer[0] ;
         A252CliCod = P00FQ5_A252CliCod[0] ;
         n252CliCod = P00FQ5_n252CliCod[0] ;
         A396EmprCod = P00FQ5_A396EmprCod[0] ;
         A583IntCod = P00FQ5_A583IntCod[0] ;
         if ( (0==A583IntCod) )
         {
            AV39IntCodA = "00" ;
         }
         else
         {
            AV39IntCodA = GXutil.str( A583IntCod, 2, 0) ;
         }
         AV40IntCodN = (byte)(GXutil.lval( GXutil.substring( AV39IntCodA, 2, 1))) ;
         AV26IntCod = AV40IntCodN ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'TARIFAS' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Sec, httpContext.getMessage( "C", "")) == 0 )
      {
         /* Using cursor P00FQ6 */
         pr_default.execute(3, new Object[] {AV15EmprCod, AV33Sec, Integer.valueOf(AV31CliCod), Short.valueOf(AV34TipArtCod), Byte.valueOf(AV30TipColCod), Byte.valueOf(AV26IntCod), Short.valueOf(AV37ForCon), Integer.valueOf(AV38NumCon)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2723TarNumCon = P00FQ6_A2723TarNumCon[0] ;
            n2723TarNumCon = P00FQ6_n2723TarNumCon[0] ;
            A996TipCon = P00FQ6_A996TipCon[0] ;
            n996TipCon = P00FQ6_n996TipCon[0] ;
            A583IntCod = P00FQ6_A583IntCod[0] ;
            A831TipColCod = P00FQ6_A831TipColCod[0] ;
            A829TipArtCod = P00FQ6_A829TipArtCod[0] ;
            A252CliCod = P00FQ6_A252CliCod[0] ;
            n252CliCod = P00FQ6_n252CliCod[0] ;
            A2720TarSec = P00FQ6_A2720TarSec[0] ;
            A396EmprCod = P00FQ6_A396EmprCod[0] ;
            A2722TarLin = P00FQ6_A2722TarLin[0] ;
            A2725TarPrecio = P00FQ6_A2725TarPrecio[0] ;
            n2725TarPrecio = P00FQ6_n2725TarPrecio[0] ;
            AV19PreKgm = A2725TarPrecio ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      if ( GXutil.strcmp(AV33Sec, httpContext.getMessage( "M", "")) == 0 )
      {
         /* Using cursor P00FQ7 */
         pr_default.execute(4, new Object[] {AV15EmprCod, AV33Sec, Integer.valueOf(AV31CliCod), Short.valueOf(AV34TipArtCod), Byte.valueOf(AV30TipColCod), Byte.valueOf(AV26IntCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A583IntCod = P00FQ7_A583IntCod[0] ;
            A831TipColCod = P00FQ7_A831TipColCod[0] ;
            A829TipArtCod = P00FQ7_A829TipArtCod[0] ;
            A252CliCod = P00FQ7_A252CliCod[0] ;
            n252CliCod = P00FQ7_n252CliCod[0] ;
            A2720TarSec = P00FQ7_A2720TarSec[0] ;
            A396EmprCod = P00FQ7_A396EmprCod[0] ;
            A2727TarLin2 = P00FQ7_A2727TarLin2[0] ;
            A2728TarLim2 = P00FQ7_A2728TarLim2[0] ;
            n2728TarLim2 = P00FQ7_n2728TarLim2[0] ;
            A2729TarPreMad = P00FQ7_A2729TarPreMad[0] ;
            n2729TarPreMad = P00FQ7_n2729TarPreMad[0] ;
            if ( DecimalUtil.compareTo(A2728TarLim2, AV41KgsFac) > 0 )
            {
               AV19PreKgm = A2729TarPreMad ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      /* Using cursor P00FQ8 */
      pr_default.execute(5, new Object[] {AV15EmprCod, Short.valueOf(AV37ForCon), Integer.valueOf(AV31CliCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A2730RecTipCo = P00FQ8_A2730RecTipCo[0] ;
         A252CliCod = P00FQ8_A252CliCod[0] ;
         n252CliCod = P00FQ8_n252CliCod[0] ;
         A396EmprCod = P00FQ8_A396EmprCod[0] ;
         A2733RecLim = P00FQ8_A2733RecLim[0] ;
         n2733RecLim = P00FQ8_n2733RecLim[0] ;
         A2734RecPor = P00FQ8_A2734RecPor[0] ;
         n2734RecPor = P00FQ8_n2734RecPor[0] ;
         A2732RecLin1 = P00FQ8_A2732RecLin1[0] ;
         if ( DecimalUtil.compareTo(A2733RecLim, AV43LimCon) > 0 )
         {
            AV23Recar = A2734RecPor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptarjm1.this.AV15EmprCod;
      this.aP1[0] = ptarjm1.this.AV16BarCod;
      this.aP2[0] = ptarjm1.this.AV17BarReo;
      this.aP3[0] = ptarjm1.this.AV18BarPar;
      this.aP4[0] = ptarjm1.this.AV19PreKgm;
      this.aP5[0] = ptarjm1.this.AV20PreMts;
      this.aP6[0] = ptarjm1.this.AV21Operesp;
      this.aP7[0] = ptarjm1.this.AV22TotRec;
      this.aP8[0] = ptarjm1.this.AV23Recar;
      this.aP9[0] = ptarjm1.this.AV24Dtos;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptarjm1");
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
      P00FQ3_A361DisCod = new int[1] ;
      P00FQ3_A132BarCodReo = new byte[1] ;
      P00FQ3_A130BarCodPar = new String[] {""} ;
      P00FQ3_A129BarCod = new int[1] ;
      P00FQ3_A396EmprCod = new String[] {""} ;
      P00FQ3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P00FQ3_A212BarSer = new String[] {""} ;
      P00FQ3_A135BarColNom = new String[] {""} ;
      P00FQ3_A136BarColNum = new int[1] ;
      P00FQ3_A218BarTipCol = new byte[1] ;
      P00FQ3_A2010BarTipDis = new String[] {""} ;
      P00FQ3_A217BarTipArt = new short[1] ;
      P00FQ3_n217BarTipArt = new boolean[] {false} ;
      P00FQ3_A252CliCod = new int[1] ;
      P00FQ3_n252CliCod = new boolean[] {false} ;
      P00FQ3_A966PartCod = new String[] {""} ;
      P00FQ3_n966PartCod = new boolean[] {false} ;
      P00FQ3_A2746BarCodTex = new String[] {""} ;
      P00FQ3_n2746BarCodTex = new boolean[] {false} ;
      P00FQ3_A1157TipConCod = new short[1] ;
      P00FQ3_n1157TipConCod = new boolean[] {false} ;
      P00FQ3_A898BarPieNDes = new int[1] ;
      P00FQ3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A966PartCod = "" ;
      A2746BarCodTex = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV27BarSer = "" ;
      AV28BarColNom = "" ;
      AV33Sec = "" ;
      AV35PartCod = "" ;
      AV36BarCodTex = "" ;
      AV41KgsFac = DecimalUtil.ZERO ;
      AV43LimCon = DecimalUtil.ZERO ;
      P00FQ5_A831TipColCod = new byte[1] ;
      P00FQ5_A483ForColNum = new int[1] ;
      P00FQ5_A482ForColNom = new String[] {""} ;
      P00FQ5_A494ForSer = new String[] {""} ;
      P00FQ5_A252CliCod = new int[1] ;
      P00FQ5_n252CliCod = new boolean[] {false} ;
      P00FQ5_A396EmprCod = new String[] {""} ;
      P00FQ5_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV39IntCodA = "" ;
      P00FQ6_A2723TarNumCon = new short[1] ;
      P00FQ6_n2723TarNumCon = new boolean[] {false} ;
      P00FQ6_A996TipCon = new short[1] ;
      P00FQ6_n996TipCon = new boolean[] {false} ;
      P00FQ6_A583IntCod = new byte[1] ;
      P00FQ6_A831TipColCod = new byte[1] ;
      P00FQ6_A829TipArtCod = new short[1] ;
      P00FQ6_A252CliCod = new int[1] ;
      P00FQ6_n252CliCod = new boolean[] {false} ;
      P00FQ6_A2720TarSec = new String[] {""} ;
      P00FQ6_A396EmprCod = new String[] {""} ;
      P00FQ6_A2722TarLin = new short[1] ;
      P00FQ6_A2725TarPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FQ6_n2725TarPrecio = new boolean[] {false} ;
      A2720TarSec = "" ;
      A2725TarPrecio = DecimalUtil.ZERO ;
      P00FQ7_A583IntCod = new byte[1] ;
      P00FQ7_A831TipColCod = new byte[1] ;
      P00FQ7_A829TipArtCod = new short[1] ;
      P00FQ7_A252CliCod = new int[1] ;
      P00FQ7_n252CliCod = new boolean[] {false} ;
      P00FQ7_A2720TarSec = new String[] {""} ;
      P00FQ7_A396EmprCod = new String[] {""} ;
      P00FQ7_A2727TarLin2 = new short[1] ;
      P00FQ7_A2728TarLim2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FQ7_n2728TarLim2 = new boolean[] {false} ;
      P00FQ7_A2729TarPreMad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FQ7_n2729TarPreMad = new boolean[] {false} ;
      A2728TarLim2 = DecimalUtil.ZERO ;
      A2729TarPreMad = DecimalUtil.ZERO ;
      P00FQ8_A2730RecTipCo = new short[1] ;
      P00FQ8_A252CliCod = new int[1] ;
      P00FQ8_n252CliCod = new boolean[] {false} ;
      P00FQ8_A396EmprCod = new String[] {""} ;
      P00FQ8_A2733RecLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FQ8_n2733RecLim = new boolean[] {false} ;
      P00FQ8_A2734RecPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FQ8_n2734RecPor = new boolean[] {false} ;
      P00FQ8_A2732RecLin1 = new short[1] ;
      A2733RecLim = DecimalUtil.ZERO ;
      A2734RecPor = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptarjm1__default(),
         new Object[] {
             new Object[] {
            P00FQ3_A361DisCod, P00FQ3_A132BarCodReo, P00FQ3_A130BarCodPar, P00FQ3_A129BarCod, P00FQ3_A396EmprCod, P00FQ3_A161BarFecSal, P00FQ3_A212BarSer, P00FQ3_A135BarColNom, P00FQ3_A136BarColNum, P00FQ3_A218BarTipCol,
            P00FQ3_A2010BarTipDis, P00FQ3_A217BarTipArt, P00FQ3_n217BarTipArt, P00FQ3_A252CliCod, P00FQ3_n252CliCod, P00FQ3_A966PartCod, P00FQ3_n966PartCod, P00FQ3_A2746BarCodTex, P00FQ3_n2746BarCodTex, P00FQ3_A1157TipConCod,
            P00FQ3_n1157TipConCod, P00FQ3_A898BarPieNDes, P00FQ3_A166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P00FQ5_A831TipColCod, P00FQ5_A483ForColNum, P00FQ5_A482ForColNom, P00FQ5_A494ForSer, P00FQ5_A252CliCod, P00FQ5_A396EmprCod, P00FQ5_A583IntCod
            }
            , new Object[] {
            P00FQ6_A2723TarNumCon, P00FQ6_n2723TarNumCon, P00FQ6_A996TipCon, P00FQ6_n996TipCon, P00FQ6_A583IntCod, P00FQ6_A831TipColCod, P00FQ6_A829TipArtCod, P00FQ6_A252CliCod, P00FQ6_A2720TarSec, P00FQ6_A396EmprCod,
            P00FQ6_A2722TarLin, P00FQ6_A2725TarPrecio, P00FQ6_n2725TarPrecio
            }
            , new Object[] {
            P00FQ7_A583IntCod, P00FQ7_A831TipColCod, P00FQ7_A829TipArtCod, P00FQ7_A252CliCod, P00FQ7_A2720TarSec, P00FQ7_A396EmprCod, P00FQ7_A2727TarLin2, P00FQ7_A2728TarLim2, P00FQ7_n2728TarLim2, P00FQ7_A2729TarPreMad,
            P00FQ7_n2729TarPreMad
            }
            , new Object[] {
            P00FQ8_A2730RecTipCo, P00FQ8_A252CliCod, P00FQ8_A396EmprCod, P00FQ8_A2733RecLim, P00FQ8_n2733RecLim, P00FQ8_A2734RecPor, P00FQ8_n2734RecPor, P00FQ8_A2732RecLin1
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
   private byte AV30TipColCod ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV40IntCodN ;
   private byte AV26IntCod ;
   private short A217BarTipArt ;
   private short A1157TipConCod ;
   private short AV34TipArtCod ;
   private short AV37ForCon ;
   private short A2723TarNumCon ;
   private short A996TipCon ;
   private short A829TipArtCod ;
   private short A2722TarLin ;
   private short A2727TarLin2 ;
   private short A2730RecTipCo ;
   private short A2732RecLin1 ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int AV29BarColNum ;
   private int AV31CliCod ;
   private int AV38NumCon ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal AV23Recar ;
   private java.math.BigDecimal AV24Dtos ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV41KgsFac ;
   private java.math.BigDecimal AV43LimCon ;
   private java.math.BigDecimal A2725TarPrecio ;
   private java.math.BigDecimal A2728TarLim2 ;
   private java.math.BigDecimal A2729TarPreMad ;
   private java.math.BigDecimal A2733RecLim ;
   private java.math.BigDecimal A2734RecPor ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A966PartCod ;
   private String A2746BarCodTex ;
   private String AV27BarSer ;
   private String AV28BarColNom ;
   private String AV33Sec ;
   private String AV35PartCod ;
   private String AV36BarCodTex ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV39IntCodA ;
   private String A2720TarSec ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n2746BarCodTex ;
   private boolean n1157TipConCod ;
   private boolean returnInSub ;
   private boolean n2723TarNumCon ;
   private boolean n996TipCon ;
   private boolean n2725TarPrecio ;
   private boolean n2728TarLim2 ;
   private boolean n2729TarPreMad ;
   private boolean n2733RecLim ;
   private boolean n2734RecPor ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private int[] P00FQ3_A361DisCod ;
   private byte[] P00FQ3_A132BarCodReo ;
   private String[] P00FQ3_A130BarCodPar ;
   private int[] P00FQ3_A129BarCod ;
   private String[] P00FQ3_A396EmprCod ;
   private java.util.Date[] P00FQ3_A161BarFecSal ;
   private String[] P00FQ3_A212BarSer ;
   private String[] P00FQ3_A135BarColNom ;
   private int[] P00FQ3_A136BarColNum ;
   private byte[] P00FQ3_A218BarTipCol ;
   private String[] P00FQ3_A2010BarTipDis ;
   private short[] P00FQ3_A217BarTipArt ;
   private boolean[] P00FQ3_n217BarTipArt ;
   private int[] P00FQ3_A252CliCod ;
   private boolean[] P00FQ3_n252CliCod ;
   private String[] P00FQ3_A966PartCod ;
   private boolean[] P00FQ3_n966PartCod ;
   private String[] P00FQ3_A2746BarCodTex ;
   private boolean[] P00FQ3_n2746BarCodTex ;
   private short[] P00FQ3_A1157TipConCod ;
   private boolean[] P00FQ3_n1157TipConCod ;
   private int[] P00FQ3_A898BarPieNDes ;
   private java.math.BigDecimal[] P00FQ3_A166BarKgm ;
   private byte[] P00FQ5_A831TipColCod ;
   private int[] P00FQ5_A483ForColNum ;
   private String[] P00FQ5_A482ForColNom ;
   private String[] P00FQ5_A494ForSer ;
   private int[] P00FQ5_A252CliCod ;
   private boolean[] P00FQ5_n252CliCod ;
   private String[] P00FQ5_A396EmprCod ;
   private byte[] P00FQ5_A583IntCod ;
   private short[] P00FQ6_A2723TarNumCon ;
   private boolean[] P00FQ6_n2723TarNumCon ;
   private short[] P00FQ6_A996TipCon ;
   private boolean[] P00FQ6_n996TipCon ;
   private byte[] P00FQ6_A583IntCod ;
   private byte[] P00FQ6_A831TipColCod ;
   private short[] P00FQ6_A829TipArtCod ;
   private int[] P00FQ6_A252CliCod ;
   private boolean[] P00FQ6_n252CliCod ;
   private String[] P00FQ6_A2720TarSec ;
   private String[] P00FQ6_A396EmprCod ;
   private short[] P00FQ6_A2722TarLin ;
   private java.math.BigDecimal[] P00FQ6_A2725TarPrecio ;
   private boolean[] P00FQ6_n2725TarPrecio ;
   private byte[] P00FQ7_A583IntCod ;
   private byte[] P00FQ7_A831TipColCod ;
   private short[] P00FQ7_A829TipArtCod ;
   private int[] P00FQ7_A252CliCod ;
   private boolean[] P00FQ7_n252CliCod ;
   private String[] P00FQ7_A2720TarSec ;
   private String[] P00FQ7_A396EmprCod ;
   private short[] P00FQ7_A2727TarLin2 ;
   private java.math.BigDecimal[] P00FQ7_A2728TarLim2 ;
   private boolean[] P00FQ7_n2728TarLim2 ;
   private java.math.BigDecimal[] P00FQ7_A2729TarPreMad ;
   private boolean[] P00FQ7_n2729TarPreMad ;
   private short[] P00FQ8_A2730RecTipCo ;
   private int[] P00FQ8_A252CliCod ;
   private boolean[] P00FQ8_n252CliCod ;
   private String[] P00FQ8_A396EmprCod ;
   private java.math.BigDecimal[] P00FQ8_A2733RecLim ;
   private boolean[] P00FQ8_n2733RecLim ;
   private java.math.BigDecimal[] P00FQ8_A2734RecPor ;
   private boolean[] P00FQ8_n2734RecPor ;
   private short[] P00FQ8_A2732RecLin1 ;
}

final  class ptarjm1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FQ3", "SELECT T1.DisCod, T1.BarCodReo, T1.BarCodPar, T1.BarCod, T1.EmprCod, T1.BarFecSal, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipDis, T1.BarTipArt, T1.CliCod, T2.PartCod, T1.BarCodTex, T2.TipConCod, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00FQ4", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00FQ5", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FQ6", "SELECT TarNumCon, TipCon, IntCod, TipColCod, TipArtCod, CliCod, TarSec, EmprCod, TarLin, TarPrecio FROM TXPLTARC2 WHERE (EmprCod = ? and TarSec = ? and CliCod = ? and TipArtCod = ? and TipColCod = ? and IntCod = ?) AND (TipCon = ?) AND (TarNumCon = ?) ORDER BY EmprCod, TarSec, CliCod, TipArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00FQ7", "SELECT IntCod, TipColCod, TipArtCod, CliCod, TarSec, EmprCod, TarLin2, TarLim2, TarPreMad FROM TXPLTARC3 WHERE EmprCod = ? and TarSec = ? and CliCod = ? and TipArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, TarSec, CliCod, TipArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00FQ8", "SELECT RecTipCo, CliCod, EmprCod, RecLim, RecPor, RecLin1 FROM TXPLRECLT WHERE EmprCod = ? and RecTipCo = ? and CliCod = ? ORDER BY EmprCod, RecTipCo, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(18,2);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

