package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptaritr extends GXProcedure
{
   public ptaritr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptaritr.class ), "" );
   }

   public ptaritr( int remoteHandle ,
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
      ptaritr.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      ptaritr.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ptaritr.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ptaritr.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      ptaritr.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      ptaritr.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      ptaritr.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      ptaritr.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      ptaritr.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      ptaritr.this.AV23Recar = aP8[0];
      this.aP8 = aP8;
      ptaritr.this.AV24Dtos = aP9[0];
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
      AV25PreDef = httpContext.getMessage( "N", "") ;
      /* Using cursor P00VX3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A132BarCodReo = P00VX3_A132BarCodReo[0] ;
         A130BarCodPar = P00VX3_A130BarCodPar[0] ;
         A129BarCod = P00VX3_A129BarCod[0] ;
         A396EmprCod = P00VX3_A396EmprCod[0] ;
         A161BarFecSal = P00VX3_A161BarFecSal[0] ;
         A212BarSer = P00VX3_A212BarSer[0] ;
         A135BarColNom = P00VX3_A135BarColNom[0] ;
         A136BarColNum = P00VX3_A136BarColNum[0] ;
         A218BarTipCol = P00VX3_A218BarTipCol[0] ;
         A252CliCod = P00VX3_A252CliCod[0] ;
         n252CliCod = P00VX3_n252CliCod[0] ;
         A120BarAgrEst = P00VX3_A120BarAgrEst[0] ;
         A3310BarFac = P00VX3_A3310BarFac[0] ;
         A193BarOpeEsp = P00VX3_A193BarOpeEsp[0] ;
         A166BarKgm = P00VX3_A166BarKgm[0] ;
         n166BarKgm = P00VX3_n166BarKgm[0] ;
         A166BarKgm = P00VX3_A166BarKgm[0] ;
         n166BarKgm = P00VX3_n166BarKgm[0] ;
         A161BarFecSal = Gx_date ;
         AV27BarSer = A212BarSer ;
         AV28BarColNom = A135BarColNom ;
         AV29BarColNum = A136BarColNum ;
         AV30TipColCod = A218BarTipCol ;
         AV31CliCod = A252CliCod ;
         AV41BarKgm = A166BarKgm ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int5[0] = AV31CliCod ;
            GXv_decimal6[0] = AV41BarKgm ;
            new app.pkgsclag(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_decimal6) ;
            ptaritr.this.A396EmprCod = GXv_char1[0] ;
            ptaritr.this.A129BarCod = GXv_int2[0] ;
            ptaritr.this.A132BarCodReo = GXv_int3[0] ;
            ptaritr.this.A130BarCodPar = GXv_char4[0] ;
            ptaritr.this.AV31CliCod = GXv_int5[0] ;
            ptaritr.this.AV41BarKgm = GXv_decimal6[0] ;
         }
         if ( GXutil.strcmp(A3310BarFac, httpContext.getMessage( "N", "")) == 0 )
         {
            AV21Operesp = (byte)(10) ;
            AV19PreKgm = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            /* Execute user subroutine: 'LEOFORM' */
            S111 ();
            if ( returnInSub )
            {
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
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV21Operesp = (byte)(10) ;
            if ( ( GXutil.strcmp(AV25PreDef, httpContext.getMessage( "N", "")) == 0 ) || (GXutil.strcmp("", AV25PreDef)==0) )
            {
               AV21Operesp = A193BarOpeEsp ;
               if ( AV21Operesp == 0 )
               {
                  AV21Operesp = (byte)(2) ;
               }
            }
         }
         /* Using cursor P00VX4 */
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
      AV26IntCod = (byte)(0) ;
      AV46FlagCformu = (byte)(0) ;
      AV47PreKgFormu = DecimalUtil.doubleToDec(0) ;
      AV48PreDefFor = "" ;
      /* Using cursor P00VX5 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV27BarSer, AV28BarColNom, Integer.valueOf(AV29BarColNum), Byte.valueOf(AV30TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P00VX5_A831TipColCod[0] ;
         A483ForColNum = P00VX5_A483ForColNum[0] ;
         A482ForColNom = P00VX5_A482ForColNom[0] ;
         A494ForSer = P00VX5_A494ForSer[0] ;
         A252CliCod = P00VX5_A252CliCod[0] ;
         n252CliCod = P00VX5_n252CliCod[0] ;
         A396EmprCod = P00VX5_A396EmprCod[0] ;
         A583IntCod = P00VX5_A583IntCod[0] ;
         A492ForPreKgm = P00VX5_A492ForPreKgm[0] ;
         n492ForPreKgm = P00VX5_n492ForPreKgm[0] ;
         A491ForPreDef = P00VX5_A491ForPreDef[0] ;
         n491ForPreDef = P00VX5_n491ForPreDef[0] ;
         AV46FlagCformu = (byte)(1) ;
         AV26IntCod = A583IntCod ;
         AV47PreKgFormu = A492ForPreKgm ;
         AV48PreDefFor = A491ForPreDef ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'TARIFAS' Routine */
      returnInSub = false ;
      /* Using cursor P00VX6 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV27BarSer});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P00VX6_A65ArtCod[0] ;
         A252CliCod = P00VX6_A252CliCod[0] ;
         n252CliCod = P00VX6_n252CliCod[0] ;
         A396EmprCod = P00VX6_A396EmprCod[0] ;
         A92ArtPreKgm = P00VX6_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P00VX6_n92ArtPreKgm[0] ;
         A91ArtPreDef = P00VX6_A91ArtPreDef[0] ;
         n91ArtPreDef = P00VX6_n91ArtPreDef[0] ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A92ArtPreKgm)==0) )
         {
            AV19PreKgm = A92ArtPreKgm ;
            AV25PreDef = A91ArtPreDef ;
         }
         /* Using cursor P00VX7 */
         pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV27BarSer, AV41BarKgm});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A2931Limite2 = P00VX7_A2931Limite2[0] ;
            A65ArtCod = P00VX7_A65ArtCod[0] ;
            A252CliCod = P00VX7_A252CliCod[0] ;
            n252CliCod = P00VX7_n252CliCod[0] ;
            A396EmprCod = P00VX7_A396EmprCod[0] ;
            A2932Precio2 = P00VX7_A2932Precio2[0] ;
            n2932Precio2 = P00VX7_n2932Precio2[0] ;
            AV19PreKgm = A2932Precio2 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV45FlagLimK = (byte)(0) ;
      /* Using cursor P00VX8 */
      pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A252CliCod = P00VX8_A252CliCod[0] ;
         n252CliCod = P00VX8_n252CliCod[0] ;
         A396EmprCod = P00VX8_A396EmprCod[0] ;
         A3320CliLimKgs = P00VX8_A3320CliLimKgs[0] ;
         A3321CliPreKgs = P00VX8_A3321CliPreKgs[0] ;
         n3321CliPreKgs = P00VX8_n3321CliPreKgs[0] ;
         if ( DecimalUtil.compareTo(A3320CliLimKgs, AV41BarKgm) > 0 )
         {
            AV23Recar = DecimalUtil.doubleToDec(0) ;
            AV25PreDef = httpContext.getMessage( "S", "") ;
            AV19PreKgm = A3321CliPreKgs ;
            AV45FlagLimK = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( AV45FlagLimK == 0 )
      {
         /* Using cursor P00VX9 */
         pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV27BarSer, Byte.valueOf(AV30TipColCod), Byte.valueOf(AV26IntCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A583IntCod = P00VX9_A583IntCod[0] ;
            A831TipColCod = P00VX9_A831TipColCod[0] ;
            A65ArtCod = P00VX9_A65ArtCod[0] ;
            A252CliCod = P00VX9_A252CliCod[0] ;
            n252CliCod = P00VX9_n252CliCod[0] ;
            A396EmprCod = P00VX9_A396EmprCod[0] ;
            A586IntPreKgm = P00VX9_A586IntPreKgm[0] ;
            n586IntPreKgm = P00VX9_n586IntPreKgm[0] ;
            A585IntPreDef = P00VX9_A585IntPreDef[0] ;
            n585IntPreDef = P00VX9_n585IntPreDef[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A586IntPreKgm)==0) )
            {
               AV25PreDef = A585IntPreDef ;
               AV19PreKgm = A586IntPreKgm ;
               /* Using cursor P00VX10 */
               pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV27BarSer, Byte.valueOf(AV26IntCod)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A2937RecIntCod = P00VX10_A2937RecIntCod[0] ;
                  A65ArtCod = P00VX10_A65ArtCod[0] ;
                  A252CliCod = P00VX10_A252CliCod[0] ;
                  n252CliCod = P00VX10_n252CliCod[0] ;
                  A396EmprCod = P00VX10_A396EmprCod[0] ;
                  A2939Limite4 = P00VX10_A2939Limite4[0] ;
                  A2940Precio4 = P00VX10_A2940Precio4[0] ;
                  n2940Precio4 = P00VX10_n2940Precio4[0] ;
                  if ( A2939Limite4 > AV41BarKgm.doubleValue() )
                  {
                     AV19PreKgm = A2940Precio4 ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  pr_default.readNext(7);
               }
               pr_default.close(7);
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47PreKgFormu)==0) )
         {
            AV25PreDef = AV48PreDefFor ;
            AV19PreKgm = AV47PreKgFormu ;
            /* Using cursor P00VX11 */
            pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV27BarSer, AV28BarColNom, Integer.valueOf(AV29BarColNum), Byte.valueOf(AV30TipColCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A831TipColCod = P00VX11_A831TipColCod[0] ;
               A483ForColNum = P00VX11_A483ForColNum[0] ;
               A482ForColNom = P00VX11_A482ForColNom[0] ;
               A494ForSer = P00VX11_A494ForSer[0] ;
               A252CliCod = P00VX11_A252CliCod[0] ;
               n252CliCod = P00VX11_n252CliCod[0] ;
               A396EmprCod = P00VX11_A396EmprCod[0] ;
               A1521RecValFin = P00VX11_A1521RecValFin[0] ;
               n1521RecValFin = P00VX11_n1521RecValFin[0] ;
               A1520RecValIni = P00VX11_A1520RecValIni[0] ;
               n1520RecValIni = P00VX11_n1520RecValIni[0] ;
               A1522RecCanRec = P00VX11_A1522RecCanRec[0] ;
               n1522RecCanRec = P00VX11_n1522RecCanRec[0] ;
               A1519RecCorLin = P00VX11_A1519RecCorLin[0] ;
               if ( ( ( AV41BarKgm.doubleValue() >= A1520RecValIni ) && ( AV41BarKgm.doubleValue() <= A1521RecValFin ) ) || ( ( AV41BarKgm.doubleValue() >= A1520RecValIni ) && (0==A1521RecValFin) ) )
               {
                  AV19PreKgm = A1522RecCanRec ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptaritr.this.AV15EmprCod;
      this.aP1[0] = ptaritr.this.AV16BarCod;
      this.aP2[0] = ptaritr.this.AV17BarReo;
      this.aP3[0] = ptaritr.this.AV18BarPar;
      this.aP4[0] = ptaritr.this.AV19PreKgm;
      this.aP5[0] = ptaritr.this.AV20PreMts;
      this.aP6[0] = ptaritr.this.AV21Operesp;
      this.aP7[0] = ptaritr.this.AV22TotRec;
      this.aP8[0] = ptaritr.this.AV23Recar;
      this.aP9[0] = ptaritr.this.AV24Dtos;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptaritr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25PreDef = "" ;
      scmdbuf = "" ;
      P00VX3_A132BarCodReo = new byte[1] ;
      P00VX3_A130BarCodPar = new String[] {""} ;
      P00VX3_A129BarCod = new int[1] ;
      P00VX3_A396EmprCod = new String[] {""} ;
      P00VX3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P00VX3_A212BarSer = new String[] {""} ;
      P00VX3_A135BarColNom = new String[] {""} ;
      P00VX3_A136BarColNum = new int[1] ;
      P00VX3_A218BarTipCol = new byte[1] ;
      P00VX3_A252CliCod = new int[1] ;
      P00VX3_n252CliCod = new boolean[] {false} ;
      P00VX3_A120BarAgrEst = new String[] {""} ;
      P00VX3_A3310BarFac = new String[] {""} ;
      P00VX3_A193BarOpeEsp = new byte[1] ;
      P00VX3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX3_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A120BarAgrEst = "" ;
      A3310BarFac = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV27BarSer = "" ;
      AV28BarColNom = "" ;
      AV41BarKgm = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV47PreKgFormu = DecimalUtil.ZERO ;
      AV48PreDefFor = "" ;
      P00VX5_A831TipColCod = new byte[1] ;
      P00VX5_A483ForColNum = new int[1] ;
      P00VX5_A482ForColNom = new String[] {""} ;
      P00VX5_A494ForSer = new String[] {""} ;
      P00VX5_A252CliCod = new int[1] ;
      P00VX5_n252CliCod = new boolean[] {false} ;
      P00VX5_A396EmprCod = new String[] {""} ;
      P00VX5_A583IntCod = new byte[1] ;
      P00VX5_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX5_n492ForPreKgm = new boolean[] {false} ;
      P00VX5_A491ForPreDef = new String[] {""} ;
      P00VX5_n491ForPreDef = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      P00VX6_A65ArtCod = new String[] {""} ;
      P00VX6_A252CliCod = new int[1] ;
      P00VX6_n252CliCod = new boolean[] {false} ;
      P00VX6_A396EmprCod = new String[] {""} ;
      P00VX6_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX6_n92ArtPreKgm = new boolean[] {false} ;
      P00VX6_A91ArtPreDef = new String[] {""} ;
      P00VX6_n91ArtPreDef = new boolean[] {false} ;
      A65ArtCod = "" ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      P00VX7_A2931Limite2 = new short[1] ;
      P00VX7_A65ArtCod = new String[] {""} ;
      P00VX7_A252CliCod = new int[1] ;
      P00VX7_n252CliCod = new boolean[] {false} ;
      P00VX7_A396EmprCod = new String[] {""} ;
      P00VX7_A2932Precio2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX7_n2932Precio2 = new boolean[] {false} ;
      A2932Precio2 = DecimalUtil.ZERO ;
      P00VX8_A252CliCod = new int[1] ;
      P00VX8_n252CliCod = new boolean[] {false} ;
      P00VX8_A396EmprCod = new String[] {""} ;
      P00VX8_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX8_A3321CliPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX8_n3321CliPreKgs = new boolean[] {false} ;
      A3320CliLimKgs = DecimalUtil.ZERO ;
      A3321CliPreKgs = DecimalUtil.ZERO ;
      P00VX9_A583IntCod = new byte[1] ;
      P00VX9_A831TipColCod = new byte[1] ;
      P00VX9_A65ArtCod = new String[] {""} ;
      P00VX9_A252CliCod = new int[1] ;
      P00VX9_n252CliCod = new boolean[] {false} ;
      P00VX9_A396EmprCod = new String[] {""} ;
      P00VX9_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX9_n586IntPreKgm = new boolean[] {false} ;
      P00VX9_A585IntPreDef = new String[] {""} ;
      P00VX9_n585IntPreDef = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      P00VX10_A2937RecIntCod = new byte[1] ;
      P00VX10_A65ArtCod = new String[] {""} ;
      P00VX10_A252CliCod = new int[1] ;
      P00VX10_n252CliCod = new boolean[] {false} ;
      P00VX10_A396EmprCod = new String[] {""} ;
      P00VX10_A2939Limite4 = new short[1] ;
      P00VX10_A2940Precio4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX10_n2940Precio4 = new boolean[] {false} ;
      A2940Precio4 = DecimalUtil.ZERO ;
      P00VX11_A831TipColCod = new byte[1] ;
      P00VX11_A483ForColNum = new int[1] ;
      P00VX11_A482ForColNom = new String[] {""} ;
      P00VX11_A494ForSer = new String[] {""} ;
      P00VX11_A252CliCod = new int[1] ;
      P00VX11_n252CliCod = new boolean[] {false} ;
      P00VX11_A396EmprCod = new String[] {""} ;
      P00VX11_A1521RecValFin = new int[1] ;
      P00VX11_n1521RecValFin = new boolean[] {false} ;
      P00VX11_A1520RecValIni = new int[1] ;
      P00VX11_n1520RecValIni = new boolean[] {false} ;
      P00VX11_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VX11_n1522RecCanRec = new boolean[] {false} ;
      P00VX11_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptaritr__default(),
         new Object[] {
             new Object[] {
            P00VX3_A132BarCodReo, P00VX3_A130BarCodPar, P00VX3_A129BarCod, P00VX3_A396EmprCod, P00VX3_A161BarFecSal, P00VX3_A212BarSer, P00VX3_A135BarColNom, P00VX3_A136BarColNum, P00VX3_A218BarTipCol, P00VX3_A252CliCod,
            P00VX3_n252CliCod, P00VX3_A120BarAgrEst, P00VX3_A3310BarFac, P00VX3_A193BarOpeEsp, P00VX3_A166BarKgm, P00VX3_n166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P00VX5_A831TipColCod, P00VX5_A483ForColNum, P00VX5_A482ForColNom, P00VX5_A494ForSer, P00VX5_A252CliCod, P00VX5_A396EmprCod, P00VX5_A583IntCod, P00VX5_A492ForPreKgm, P00VX5_n492ForPreKgm, P00VX5_A491ForPreDef,
            P00VX5_n491ForPreDef
            }
            , new Object[] {
            P00VX6_A65ArtCod, P00VX6_A252CliCod, P00VX6_A396EmprCod, P00VX6_A92ArtPreKgm, P00VX6_n92ArtPreKgm, P00VX6_A91ArtPreDef, P00VX6_n91ArtPreDef
            }
            , new Object[] {
            P00VX7_A2931Limite2, P00VX7_A65ArtCod, P00VX7_A252CliCod, P00VX7_A396EmprCod, P00VX7_A2932Precio2, P00VX7_n2932Precio2
            }
            , new Object[] {
            P00VX8_A252CliCod, P00VX8_A396EmprCod, P00VX8_A3320CliLimKgs, P00VX8_A3321CliPreKgs, P00VX8_n3321CliPreKgs
            }
            , new Object[] {
            P00VX9_A583IntCod, P00VX9_A831TipColCod, P00VX9_A65ArtCod, P00VX9_A252CliCod, P00VX9_A396EmprCod, P00VX9_A586IntPreKgm, P00VX9_n586IntPreKgm, P00VX9_A585IntPreDef, P00VX9_n585IntPreDef
            }
            , new Object[] {
            P00VX10_A2937RecIntCod, P00VX10_A65ArtCod, P00VX10_A252CliCod, P00VX10_A396EmprCod, P00VX10_A2939Limite4, P00VX10_A2940Precio4, P00VX10_n2940Precio4
            }
            , new Object[] {
            P00VX11_A831TipColCod, P00VX11_A483ForColNum, P00VX11_A482ForColNom, P00VX11_A494ForSer, P00VX11_A252CliCod, P00VX11_A396EmprCod, P00VX11_A1521RecValFin, P00VX11_n1521RecValFin, P00VX11_A1520RecValIni, P00VX11_n1520RecValIni,
            P00VX11_A1522RecCanRec, P00VX11_n1522RecCanRec, P00VX11_A1519RecCorLin
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
   private byte AV30TipColCod ;
   private byte GXv_int3[] ;
   private byte AV26IntCod ;
   private byte AV46FlagCformu ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV45FlagLimK ;
   private byte A2937RecIntCod ;
   private byte A1519RecCorLin ;
   private short A2931Limite2 ;
   private short A2939Limite4 ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV29BarColNum ;
   private int AV31CliCod ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int A483ForColNum ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal AV23Recar ;
   private java.math.BigDecimal AV24Dtos ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV41BarKgm ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV47PreKgFormu ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A2932Precio2 ;
   private java.math.BigDecimal A3320CliLimKgs ;
   private java.math.BigDecimal A3321CliPreKgs ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A2940Precio4 ;
   private java.math.BigDecimal A1522RecCanRec ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String AV25PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A120BarAgrEst ;
   private String A3310BarFac ;
   private String AV27BarSer ;
   private String AV28BarColNom ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV48PreDefFor ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A491ForPreDef ;
   private String A65ArtCod ;
   private String A91ArtPreDef ;
   private String A585IntPreDef ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n492ForPreKgm ;
   private boolean n491ForPreDef ;
   private boolean n92ArtPreKgm ;
   private boolean n91ArtPreDef ;
   private boolean n2932Precio2 ;
   private boolean n3321CliPreKgs ;
   private boolean n586IntPreKgm ;
   private boolean n585IntPreDef ;
   private boolean n2940Precio4 ;
   private boolean n1521RecValFin ;
   private boolean n1520RecValIni ;
   private boolean n1522RecCanRec ;
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
   private byte[] P00VX3_A132BarCodReo ;
   private String[] P00VX3_A130BarCodPar ;
   private int[] P00VX3_A129BarCod ;
   private String[] P00VX3_A396EmprCod ;
   private java.util.Date[] P00VX3_A161BarFecSal ;
   private String[] P00VX3_A212BarSer ;
   private String[] P00VX3_A135BarColNom ;
   private int[] P00VX3_A136BarColNum ;
   private byte[] P00VX3_A218BarTipCol ;
   private int[] P00VX3_A252CliCod ;
   private boolean[] P00VX3_n252CliCod ;
   private String[] P00VX3_A120BarAgrEst ;
   private String[] P00VX3_A3310BarFac ;
   private byte[] P00VX3_A193BarOpeEsp ;
   private java.math.BigDecimal[] P00VX3_A166BarKgm ;
   private boolean[] P00VX3_n166BarKgm ;
   private byte[] P00VX5_A831TipColCod ;
   private int[] P00VX5_A483ForColNum ;
   private String[] P00VX5_A482ForColNom ;
   private String[] P00VX5_A494ForSer ;
   private int[] P00VX5_A252CliCod ;
   private boolean[] P00VX5_n252CliCod ;
   private String[] P00VX5_A396EmprCod ;
   private byte[] P00VX5_A583IntCod ;
   private java.math.BigDecimal[] P00VX5_A492ForPreKgm ;
   private boolean[] P00VX5_n492ForPreKgm ;
   private String[] P00VX5_A491ForPreDef ;
   private boolean[] P00VX5_n491ForPreDef ;
   private String[] P00VX6_A65ArtCod ;
   private int[] P00VX6_A252CliCod ;
   private boolean[] P00VX6_n252CliCod ;
   private String[] P00VX6_A396EmprCod ;
   private java.math.BigDecimal[] P00VX6_A92ArtPreKgm ;
   private boolean[] P00VX6_n92ArtPreKgm ;
   private String[] P00VX6_A91ArtPreDef ;
   private boolean[] P00VX6_n91ArtPreDef ;
   private short[] P00VX7_A2931Limite2 ;
   private String[] P00VX7_A65ArtCod ;
   private int[] P00VX7_A252CliCod ;
   private boolean[] P00VX7_n252CliCod ;
   private String[] P00VX7_A396EmprCod ;
   private java.math.BigDecimal[] P00VX7_A2932Precio2 ;
   private boolean[] P00VX7_n2932Precio2 ;
   private int[] P00VX8_A252CliCod ;
   private boolean[] P00VX8_n252CliCod ;
   private String[] P00VX8_A396EmprCod ;
   private java.math.BigDecimal[] P00VX8_A3320CliLimKgs ;
   private java.math.BigDecimal[] P00VX8_A3321CliPreKgs ;
   private boolean[] P00VX8_n3321CliPreKgs ;
   private byte[] P00VX9_A583IntCod ;
   private byte[] P00VX9_A831TipColCod ;
   private String[] P00VX9_A65ArtCod ;
   private int[] P00VX9_A252CliCod ;
   private boolean[] P00VX9_n252CliCod ;
   private String[] P00VX9_A396EmprCod ;
   private java.math.BigDecimal[] P00VX9_A586IntPreKgm ;
   private boolean[] P00VX9_n586IntPreKgm ;
   private String[] P00VX9_A585IntPreDef ;
   private boolean[] P00VX9_n585IntPreDef ;
   private byte[] P00VX10_A2937RecIntCod ;
   private String[] P00VX10_A65ArtCod ;
   private int[] P00VX10_A252CliCod ;
   private boolean[] P00VX10_n252CliCod ;
   private String[] P00VX10_A396EmprCod ;
   private short[] P00VX10_A2939Limite4 ;
   private java.math.BigDecimal[] P00VX10_A2940Precio4 ;
   private boolean[] P00VX10_n2940Precio4 ;
   private byte[] P00VX11_A831TipColCod ;
   private int[] P00VX11_A483ForColNum ;
   private String[] P00VX11_A482ForColNom ;
   private String[] P00VX11_A494ForSer ;
   private int[] P00VX11_A252CliCod ;
   private boolean[] P00VX11_n252CliCod ;
   private String[] P00VX11_A396EmprCod ;
   private int[] P00VX11_A1521RecValFin ;
   private boolean[] P00VX11_n1521RecValFin ;
   private int[] P00VX11_A1520RecValIni ;
   private boolean[] P00VX11_n1520RecValIni ;
   private java.math.BigDecimal[] P00VX11_A1522RecCanRec ;
   private boolean[] P00VX11_n1522RecCanRec ;
   private byte[] P00VX11_A1519RecCorLin ;
}

final  class ptaritr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00VX3", "SELECT T1.BarCodReo, T1.BarCodPar, T1.BarCod, T1.EmprCod, T1.BarFecSal, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.CliCod, T1.BarAgrEst, T1.BarFac, T1.BarOpeEsp, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00VX4", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00VX5", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod, ForPreKgm, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VX6", "SELECT ArtCod, CliCod, EmprCod, ArtPreKgm, ArtPreDef FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VX7", "SELECT * FROM (SELECT Limite2, ArtCod, CliCod, EmprCod, Precio2 FROM TXPRECARB WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Limite2 > ? ORDER BY EmprCod, CliCod, ArtCod, Limite2) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VX8", "SELECT CliCod, EmprCod, CliLimKgs, CliPreKgs FROM TXPPREKIL WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VX9", "SELECT IntCod, TipColCod, ArtCod, CliCod, EmprCod, IntPreKgm, IntPreDef FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VX10", "SELECT RecIntCod, ArtCod, CliCod, EmprCod, Limite4, Precio4 FROM TXPLRBART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and RecIntCod = ? ORDER BY EmprCod, CliCod, ArtCod, RecIntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VX11", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
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

