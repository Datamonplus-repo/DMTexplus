package app.albaranesproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informedemermas_export extends GXProcedure
{
   public informedemermas_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informedemermas_export.class ), "" );
   }

   public informedemermas_export( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             java.util.Date[] aP14 ,
                             java.util.Date[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             byte[] aP19 ,
                             byte[] aP20 ,
                             byte[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 )
   {
      informedemermas_export.this.aP24 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
      return aP24[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        java.util.Date[] aP14 ,
                        java.util.Date[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        byte[] aP19 ,
                        byte[] aP20 ,
                        byte[] aP21 ,
                        String[] aP22 ,
                        String[] aP23 ,
                        String[] aP24 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             java.util.Date[] aP14 ,
                             java.util.Date[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             byte[] aP19 ,
                             byte[] aP20 ,
                             byte[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 ,
                             String[] aP24 )
   {
      informedemermas_export.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      informedemermas_export.this.AV37ImpCod = aP1[0];
      this.aP1 = aP1;
      informedemermas_export.this.AV60PTipArt = aP2[0];
      this.aP2 = aP2;
      informedemermas_export.this.AV81UTipArt = aP3[0];
      this.aP3 = aP3;
      informedemermas_export.this.AV52PCliCod = aP4[0];
      this.aP4 = aP4;
      informedemermas_export.this.AV75UCliCod = aP5[0];
      this.aP5 = aP5;
      informedemermas_export.this.AV59PSerCod = aP6[0];
      this.aP6 = aP6;
      informedemermas_export.this.AV80USerCod = aP7[0];
      this.aP7 = aP7;
      informedemermas_export.this.AV54PColor = aP8[0];
      this.aP8 = aP8;
      informedemermas_export.this.AV77UColor = aP9[0];
      this.aP9 = aP9;
      informedemermas_export.this.AV53PColNum = aP10[0];
      this.aP10 = aP10;
      informedemermas_export.this.AV76UColNum = aP11[0];
      this.aP11 = aP11;
      informedemermas_export.this.AV55PDisCli = aP12[0];
      this.aP12 = aP12;
      informedemermas_export.this.AV78UDisCli = aP13[0];
      this.aP13 = aP13;
      informedemermas_export.this.AV56PFecha = aP14[0];
      this.aP14 = aP14;
      informedemermas_export.this.AV79UFecha = aP15[0];
      this.aP15 = aP15;
      informedemermas_export.this.AV16barmdlcod = aP16[0];
      this.aP16 = aP16;
      informedemermas_export.this.AV14BarItem1 = aP17[0];
      this.aP17 = aP17;
      informedemermas_export.this.AV15BarItem3 = aP18[0];
      this.aP18 = aP18;
      informedemermas_export.this.AV61SoloTotal = aP19[0];
      this.aP19 = aP19;
      informedemermas_export.this.AV24Detalle = aP20[0];
      this.aP20 = aP20;
      informedemermas_export.this.AV41KgsAut = aP21[0];
      this.aP21 = aP21;
      informedemermas_export.this.AV9Archivo = aP22[0];
      this.aP22 = aP22;
      informedemermas_export.this.aP23 = aP23;
      informedemermas_export.this.aP24 = aP24;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AFL2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P0AFL2_A407EmprNom[0] ;
         n407EmprNom = P0AFL2_n407EmprNom[0] ;
         AV29EmprNom = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV83CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV84ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV84ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV84ExcelDocument.Cells(1, 1, 1, 1).setText( AV29EmprNom );
      AV83CellRow = 2 ;
      AV82CellCol = 1 ;
      while ( AV82CellCol <= 100 )
      {
         AV84ExcelDocument.Cells(AV83CellRow, AV82CellCol, 1, 1).setBold( (short)(1) );
         AV84ExcelDocument.Cells(AV83CellRow, AV82CellCol, 1, 1).setColor( 11 );
         AV82CellCol = (int)(AV82CellCol+1) ;
      }
      AV84ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV84ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV84ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV84ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Tipo Art.", "") );
      AV84ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV84ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Ped. Cli.", "") );
      AV84ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV84ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV84ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV84ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Color Cli.", "") );
      AV84ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV84ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV84ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Kilos Ent.", "") );
      AV84ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Kilos Cru.", "") );
      AV84ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Kilos Sal.", "") );
      AV84ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Dif.", "") );
      AV84ExcelDocument.Cells(2, 17, 1, 1).setText( "%" );
      AV84ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Metros Ent.", "") );
      AV84ExcelDocument.Cells(2, 19, 1, 1).setText( httpContext.getMessage( "Metros Sal.", "") );
      AV84ExcelDocument.Cells(2, 20, 1, 1).setText( httpContext.getMessage( "Dif.", "") );
      AV84ExcelDocument.Cells(2, 21, 1, 1).setText( "%" );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69TotKgsEnt = DecimalUtil.doubleToDec(0) ;
      AV70TotKgsSal = DecimalUtil.doubleToDec(0) ;
      AV73TotMtsEnt = DecimalUtil.doubleToDec(0) ;
      AV74TotMtsSal = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AFL4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV52PCliCod), AV59PSerCod, Short.valueOf(AV60PTipArt), Short.valueOf(AV81UTipArt), AV80USerCod, AV54PColor, AV77UColor, Integer.valueOf(AV53PColNum), Integer.valueOf(AV76UColNum), AV55PDisCli, AV78UDisCli, AV56PFecha, AV79UFecha, AV16barmdlcod, AV16barmdlcod, AV14BarItem1, AV14BarItem1, AV15BarItem3, AV15BarItem3, Integer.valueOf(AV75UCliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAFL3 = false ;
         A361DisCod = P0AFL4_A361DisCod[0] ;
         A213BarSit = P0AFL4_A213BarSit[0] ;
         A9777BarItem3 = P0AFL4_A9777BarItem3[0] ;
         A9775BarItem1 = P0AFL4_A9775BarItem1[0] ;
         A4609BarMdlCod = P0AFL4_A4609BarMdlCod[0] ;
         A161BarFecSal = P0AFL4_A161BarFecSal[0] ;
         A143BarDisNum = P0AFL4_A143BarDisNum[0] ;
         A136BarColNum = P0AFL4_A136BarColNum[0] ;
         A135BarColNom = P0AFL4_A135BarColNom[0] ;
         A212BarSer = P0AFL4_A212BarSer[0] ;
         A217BarTipArt = P0AFL4_A217BarTipArt[0] ;
         n217BarTipArt = P0AFL4_n217BarTipArt[0] ;
         A4812BarEncCli = P0AFL4_A4812BarEncCli[0] ;
         A252CliCod = P0AFL4_A252CliCod[0] ;
         n252CliCod = P0AFL4_n252CliCod[0] ;
         A279CliNom = P0AFL4_A279CliNom[0] ;
         A1652BarSerDsc = P0AFL4_A1652BarSerDsc[0] ;
         A1234BarNomCli = P0AFL4_A1234BarNomCli[0] ;
         A155BarFecCli = P0AFL4_A155BarFecCli[0] ;
         A2010BarTipDis = P0AFL4_A2010BarTipDis[0] ;
         A3841DisArtMer = P0AFL4_A3841DisArtMer[0] ;
         A166BarKgm = P0AFL4_A166BarKgm[0] ;
         A184BarMtr = P0AFL4_A184BarMtr[0] ;
         A130BarCodPar = P0AFL4_A130BarCodPar[0] ;
         A132BarCodReo = P0AFL4_A132BarCodReo[0] ;
         A129BarCod = P0AFL4_A129BarCod[0] ;
         A3841DisArtMer = P0AFL4_A3841DisArtMer[0] ;
         A279CliNom = P0AFL4_A279CliNom[0] ;
         A166BarKgm = P0AFL4_A166BarKgm[0] ;
         A184BarMtr = P0AFL4_A184BarMtr[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV28DisArtMer = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AFL4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AFL4_A252CliCod[0] == A252CliCod ) )
         {
            brkAFL3 = false ;
            A361DisCod = P0AFL4_A361DisCod[0] ;
            A213BarSit = P0AFL4_A213BarSit[0] ;
            A9777BarItem3 = P0AFL4_A9777BarItem3[0] ;
            A9775BarItem1 = P0AFL4_A9775BarItem1[0] ;
            A4609BarMdlCod = P0AFL4_A4609BarMdlCod[0] ;
            A161BarFecSal = P0AFL4_A161BarFecSal[0] ;
            A143BarDisNum = P0AFL4_A143BarDisNum[0] ;
            A136BarColNum = P0AFL4_A136BarColNum[0] ;
            A135BarColNom = P0AFL4_A135BarColNom[0] ;
            A212BarSer = P0AFL4_A212BarSer[0] ;
            A217BarTipArt = P0AFL4_A217BarTipArt[0] ;
            n217BarTipArt = P0AFL4_n217BarTipArt[0] ;
            A4812BarEncCli = P0AFL4_A4812BarEncCli[0] ;
            A279CliNom = P0AFL4_A279CliNom[0] ;
            A1652BarSerDsc = P0AFL4_A1652BarSerDsc[0] ;
            A1234BarNomCli = P0AFL4_A1234BarNomCli[0] ;
            A155BarFecCli = P0AFL4_A155BarFecCli[0] ;
            A2010BarTipDis = P0AFL4_A2010BarTipDis[0] ;
            A3841DisArtMer = P0AFL4_A3841DisArtMer[0] ;
            A130BarCodPar = P0AFL4_A130BarCodPar[0] ;
            A132BarCodReo = P0AFL4_A132BarCodReo[0] ;
            A129BarCod = P0AFL4_A129BarCod[0] ;
            A3841DisArtMer = P0AFL4_A3841DisArtMer[0] ;
            A279CliNom = P0AFL4_A279CliNom[0] ;
            if ( GXutil.strcmp(A212BarSer, AV80USerCod) <= 0 )
            {
               if ( GXutil.strcmp(A212BarSer, AV59PSerCod) >= 0 )
               {
                  if ( ( A217BarTipArt >= AV60PTipArt ) && ( A217BarTipArt <= AV81UTipArt ) )
                  {
                     if ( ( GXutil.strcmp(A135BarColNom, AV54PColor) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV77UColor) <= 0 ) )
                     {
                        if ( ( A136BarColNum >= AV53PColNum ) && ( A136BarColNum <= AV76UColNum ) )
                        {
                           if ( ( GXutil.strcmp(A143BarDisNum, AV55PDisCli) >= 0 ) && ( GXutil.strcmp(A143BarDisNum, AV78UDisCli) <= 0 ) )
                           {
                              if ( (( GXutil.resetTime(A161BarFecSal).after( GXutil.resetTime( AV56PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A161BarFecSal), GXutil.resetTime(AV56PFecha)) )) && (( GXutil.resetTime(A161BarFecSal).before( GXutil.resetTime( AV79UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A161BarFecSal), GXutil.resetTime(AV79UFecha)) )) )
                              {
                                 if ( ( GXutil.strcmp(A4609BarMdlCod, AV16barmdlcod) == 0 ) || (GXutil.strcmp("", AV16barmdlcod)==0) )
                                 {
                                    if ( ( GXutil.strcmp(A9775BarItem1, AV14BarItem1) == 0 ) || (GXutil.strcmp("", AV14BarItem1)==0) )
                                    {
                                       if ( ( GXutil.strcmp(A9777BarItem3, AV15BarItem3) == 0 ) || (GXutil.strcmp("", AV15BarItem3)==0) )
                                       {
                                          if ( A213BarSit >= 9 )
                                          {
                                             /* Using cursor P0AFL6 */
                                             pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                             if ( (pr_default.getStatus(2) != 101) )
                                             {
                                                A166BarKgm = P0AFL6_A166BarKgm[0] ;
                                                A184BarMtr = P0AFL6_A184BarMtr[0] ;
                                             }
                                             else
                                             {
                                                A166BarKgm = DecimalUtil.doubleToDec(0) ;
                                                A184BarMtr = DecimalUtil.doubleToDec(0) ;
                                             }
                                             pr_default.close(2);
                                             A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                             AV38Kexp = DecimalUtil.doubleToDec(0) ;
                                             AV45Mexp = DecimalUtil.doubleToDec(0) ;
                                             AV40Kgsalp = DecimalUtil.doubleToDec(0) ;
                                             AV48Mtsalp = DecimalUtil.doubleToDec(0) ;
                                             AV39Kgentp = DecimalUtil.doubleToDec(0) ;
                                             AV47Mtentp = DecimalUtil.doubleToDec(0) ;
                                             /* Using cursor P0AFL7 */
                                             pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                             while ( (pr_default.getStatus(3) != 101) )
                                             {
                                                A30AlbProCod = P0AFL7_A30AlbProCod[0] ;
                                                A1261BarAlbKgmE = P0AFL7_A1261BarAlbKgmE[0] ;
                                                A1263BarAlbMtrE = P0AFL7_A1263BarAlbMtrE[0] ;
                                                AV38Kexp = AV38Kexp.add(A1261BarAlbKgmE) ;
                                                AV45Mexp = AV45Mexp.add(A1263BarAlbMtrE) ;
                                                /* Using cursor P0AFL8 */
                                                pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                while ( (pr_default.getStatus(4) != 101) )
                                                {
                                                   A27AlbPKilEnt = P0AFL8_A27AlbPKilEnt[0] ;
                                                   A1270AlbPMtrEnt = P0AFL8_A1270AlbPMtrEnt[0] ;
                                                   A200BarPieCod = P0AFL8_A200BarPieCod[0] ;
                                                   AV40Kgsalp = AV40Kgsalp.add(A27AlbPKilEnt) ;
                                                   AV48Mtsalp = AV48Mtsalp.add(A1270AlbPMtrEnt) ;
                                                   AV10Barcod = A129BarCod ;
                                                   AV12Barcodreo = A132BarCodReo ;
                                                   AV11barcodpar = A130BarCodPar ;
                                                   AV17Barpiecod = A200BarPieCod ;
                                                   /* Execute user subroutine: 'BARPIE' */
                                                   S136 ();
                                                   if ( returnInSub )
                                                   {
                                                      pr_default.close(4);
                                                      pr_default.close(3);
                                                      pr_default.close(2);
                                                      pr_default.close(1);
                                                      pr_default.close(1);
                                                      pr_default.close(1);
                                                      pr_default.close(1);
                                                      returnInSub = true;
                                                      if (true) return;
                                                   }
                                                   pr_default.readNext(4);
                                                }
                                                pr_default.close(4);
                                                pr_default.readNext(3);
                                             }
                                             pr_default.close(3);
                                             if ( AV41KgsAut > 0 )
                                             {
                                                AV38Kexp = DecimalUtil.doubleToDec(0) ;
                                                AV45Mexp = DecimalUtil.doubleToDec(0) ;
                                                /* Optimized group. */
                                                /* Using cursor P0AFL9 */
                                                pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                c3275BarKgsAut = P0AFL9_A3275BarKgsAut[0] ;
                                                n3275BarKgsAut = P0AFL9_n3275BarKgsAut[0] ;
                                                c3276BarMtsAut = P0AFL9_A3276BarMtsAut[0] ;
                                                n3276BarMtsAut = P0AFL9_n3276BarMtsAut[0] ;
                                                pr_default.close(5);
                                                AV38Kexp = AV38Kexp.add(c3275BarKgsAut) ;
                                                AV45Mexp = AV45Mexp.add(c3276BarMtsAut) ;
                                                /* End optimized group. */
                                             }
                                             AV69TotKgsEnt = AV69TotKgsEnt.add(A166BarKgm) ;
                                             AV70TotKgsSal = AV70TotKgsSal.add(AV38Kexp) ;
                                             AV73TotMtsEnt = AV73TotMtsEnt.add(A184BarMtr) ;
                                             AV74TotMtsSal = AV74TotMtsSal.add(AV45Mexp) ;
                                             if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38Kexp)==0) )
                                             {
                                                AV25DifKgs = AV38Kexp.subtract(A166BarKgm) ;
                                             }
                                             else
                                             {
                                                AV25DifKgs = DecimalUtil.ZERO ;
                                             }
                                             if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A166BarKgm)==0) )
                                             {
                                                AV57PorKgs = ((AV25DifKgs.divide(A166BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
                                             }
                                             else
                                             {
                                                AV57PorKgs = DecimalUtil.ZERO ;
                                             }
                                             if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45Mexp)==0) )
                                             {
                                                AV26DifMts = AV45Mexp.subtract(A184BarMtr) ;
                                             }
                                             else
                                             {
                                                AV26DifMts = DecimalUtil.ZERO ;
                                             }
                                             if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A184BarMtr)==0) )
                                             {
                                                AV58PorMts = ((AV26DifMts.divide(A184BarMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
                                             }
                                             else
                                             {
                                                AV58PorMts = DecimalUtil.ZERO ;
                                             }
                                             AV18BarTipArt = A217BarTipArt ;
                                             /* Execute user subroutine: 'TIPART' */
                                             S144 ();
                                             if ( returnInSub )
                                             {
                                                pr_default.close(2);
                                                pr_default.close(1);
                                                pr_default.close(1);
                                                pr_default.close(1);
                                                pr_default.close(1);
                                                returnInSub = true;
                                                if (true) return;
                                             }
                                             AV13Barenccli = A4812BarEncCli ;
                                             if ( GXutil.strcmp(A4812BarEncCli, " ") == 0 )
                                             {
                                                AV13Barenccli = A143BarDisNum ;
                                             }
                                             AV84ExcelDocument.Cells(AV83CellRow, 1, 1, 1).setNumber( A252CliCod );
                                             AV84ExcelDocument.Cells(AV83CellRow, 2, 1, 1).setText( A279CliNom );
                                             AV84ExcelDocument.Cells(AV83CellRow, 3, 1, 1).setText( A13696BarNHdr );
                                             AV84ExcelDocument.Cells(AV83CellRow, 4, 1, 1).setNumber( A217BarTipArt );
                                             AV84ExcelDocument.Cells(AV83CellRow, 5, 1, 1).setText( AV63TipArtDsc );
                                             AV84ExcelDocument.Cells(AV83CellRow, 6, 1, 1).setText( AV13Barenccli );
                                             AV84ExcelDocument.Cells(AV83CellRow, 7, 1, 1).setText( A212BarSer );
                                             AV84ExcelDocument.Cells(AV83CellRow, 8, 1, 1).setText( A1652BarSerDsc );
                                             AV84ExcelDocument.Cells(AV83CellRow, 9, 1, 1).setText( A135BarColNom );
                                             AV84ExcelDocument.Cells(AV83CellRow, 10, 1, 1).setText( A1234BarNomCli );
                                             AV84ExcelDocument.Cells(AV83CellRow, 11, 1, 1).setNumber( A136BarColNum );
                                             GXt_dtime1 = GXutil.resetTime( A155BarFecCli );
                                             AV84ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                             AV84ExcelDocument.Cells(AV83CellRow, 12, 1, 1).setDate( GXt_dtime1 );
                                             AV84ExcelDocument.Cells(AV83CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
                                             AV84ExcelDocument.Cells(AV83CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39Kgentp)) );
                                             AV84ExcelDocument.Cells(AV83CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV38Kexp)) );
                                             AV84ExcelDocument.Cells(AV83CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25DifKgs)) );
                                             AV84ExcelDocument.Cells(AV83CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57PorKgs)) );
                                             AV84ExcelDocument.Cells(AV83CellRow, 18, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
                                             AV84ExcelDocument.Cells(AV83CellRow, 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45Mexp)) );
                                             AV84ExcelDocument.Cells(AV83CellRow, 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26DifMts)) );
                                             AV84ExcelDocument.Cells(AV83CellRow, 21, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58PorMts)) );
                                             AV83CellRow = (int)(AV83CellRow+1) ;
                                             AV65Tot_mpk = AV65Tot_mpk.add(AV57PorKgs) ;
                                             if ( AV57PorKgs.doubleValue() != 0 )
                                             {
                                                AV66Tot_nr = (int)(AV66Tot_nr+1) ;
                                             }
                                             if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "A", "")) != 0 )
                                             {
                                                if ( DecimalUtil.compareTo(A3841DisArtMer, AV28DisArtMer) > 0 )
                                                {
                                                   AV28DisArtMer = A3841DisArtMer ;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            brkAFL3 = true ;
            pr_default.readNext(1);
         }
         if ( ! brkAFL3 )
         {
            brkAFL3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      if ( ( AV69TotKgsEnt.doubleValue() == 0 ) && ( AV73TotMtsEnt.doubleValue() == 0 ) )
      {
      }
      else
      {
         AV67TotKDif = AV70TotKgsSal.subtract(AV69TotKgsEnt) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TotKgsEnt)==0) )
         {
            AV57PorKgs = ((AV67TotKDif.divide(AV69TotKgsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         else
         {
            AV57PorKgs = DecimalUtil.ZERO ;
         }
         AV71TotMDif = AV74TotMtsSal.subtract(AV73TotMtsEnt) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TotMtsEnt)==0) )
         {
            AV58PorMts = ((AV71TotMDif.divide(AV73TotMtsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         else
         {
            AV58PorMts = DecimalUtil.ZERO ;
         }
         AV46Mpk = DecimalUtil.doubleToDec(0) ;
         if ( AV66Tot_nr > 0 )
         {
            AV46Mpk = AV65Tot_mpk.divide(DecimalUtil.doubleToDec(AV66Tot_nr), 18, java.math.RoundingMode.DOWN) ;
         }
         AV84ExcelDocument.Cells(AV83CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69TotKgsEnt)) );
         AV84ExcelDocument.Cells(AV83CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TotKgsSal)) );
         AV84ExcelDocument.Cells(AV83CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TotKDif)) );
         AV84ExcelDocument.Cells(AV83CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57PorKgs)) );
         AV84ExcelDocument.Cells(AV83CellRow, 18, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73TotMtsEnt)) );
         AV84ExcelDocument.Cells(AV83CellRow, 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV74TotMtsSal)) );
         AV84ExcelDocument.Cells(AV83CellRow, 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV71TotMDif)) );
         AV84ExcelDocument.Cells(AV83CellRow, 21, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58PorMts)) );
      }
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV84ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S161 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV84ExcelDocument.Close();
   }

   public void S171( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV85Random = (int)(GXutil.random( )*10000) ;
      AV34FileName = "InformedeMermas_Export-" + GXutil.trim( GXutil.str( AV85Random, 8, 0)) + ".xlsx" ;
      AV84ExcelDocument.Open(AV34FileName);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S161 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV84ExcelDocument.Clear();
   }

   public void S161( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV84ExcelDocument.getErrCode() != 0 )
      {
         AV34FileName = "" ;
         AV31ErrorMessage = AV84ExcelDocument.getErrDescription() ;
         AV84ExcelDocument.Close();
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S144( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV63TipArtDsc = " " ;
      /* Using cursor P0AFL10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(AV18BarTipArt)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A829TipArtCod = P0AFL10_A829TipArtCod[0] ;
         A830TipArtDsc = P0AFL10_A830TipArtDsc[0] ;
         n830TipArtDsc = P0AFL10_n830TipArtDsc[0] ;
         AV63TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S136( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P0AFL11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV10Barcod), Byte.valueOf(AV12Barcodreo), AV11barcodpar, AV17Barpiecod});
      c203BarPieKil = P0AFL11_A203BarPieKil[0] ;
      c205BarPieMet = P0AFL11_A205BarPieMet[0] ;
      pr_default.close(7);
      AV39Kgentp = AV39Kgentp.add(c203BarPieKil) ;
      AV47Mtentp = AV47Mtentp.add(c205BarPieMet) ;
      /* End optimized group. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = informedemermas_export.this.A396EmprCod;
      this.aP1[0] = informedemermas_export.this.AV37ImpCod;
      this.aP2[0] = informedemermas_export.this.AV60PTipArt;
      this.aP3[0] = informedemermas_export.this.AV81UTipArt;
      this.aP4[0] = informedemermas_export.this.AV52PCliCod;
      this.aP5[0] = informedemermas_export.this.AV75UCliCod;
      this.aP6[0] = informedemermas_export.this.AV59PSerCod;
      this.aP7[0] = informedemermas_export.this.AV80USerCod;
      this.aP8[0] = informedemermas_export.this.AV54PColor;
      this.aP9[0] = informedemermas_export.this.AV77UColor;
      this.aP10[0] = informedemermas_export.this.AV53PColNum;
      this.aP11[0] = informedemermas_export.this.AV76UColNum;
      this.aP12[0] = informedemermas_export.this.AV55PDisCli;
      this.aP13[0] = informedemermas_export.this.AV78UDisCli;
      this.aP14[0] = informedemermas_export.this.AV56PFecha;
      this.aP15[0] = informedemermas_export.this.AV79UFecha;
      this.aP16[0] = informedemermas_export.this.AV16barmdlcod;
      this.aP17[0] = informedemermas_export.this.AV14BarItem1;
      this.aP18[0] = informedemermas_export.this.AV15BarItem3;
      this.aP19[0] = informedemermas_export.this.AV61SoloTotal;
      this.aP20[0] = informedemermas_export.this.AV24Detalle;
      this.aP21[0] = informedemermas_export.this.AV41KgsAut;
      this.aP22[0] = informedemermas_export.this.AV9Archivo;
      this.aP23[0] = informedemermas_export.this.AV34FileName;
      this.aP24[0] = informedemermas_export.this.AV31ErrorMessage;
      CloseOpenCursors();
      AV84ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(2);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34FileName = "" ;
      AV31ErrorMessage = "" ;
      scmdbuf = "" ;
      P0AFL2_A396EmprCod = new String[] {""} ;
      P0AFL2_A407EmprNom = new String[] {""} ;
      P0AFL2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV29EmprNom = "" ;
      AV84ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV69TotKgsEnt = DecimalUtil.ZERO ;
      AV70TotKgsSal = DecimalUtil.ZERO ;
      AV73TotMtsEnt = DecimalUtil.ZERO ;
      AV74TotMtsSal = DecimalUtil.ZERO ;
      P0AFL4_A361DisCod = new int[1] ;
      P0AFL4_A396EmprCod = new String[] {""} ;
      P0AFL4_A213BarSit = new byte[1] ;
      P0AFL4_A9777BarItem3 = new String[] {""} ;
      P0AFL4_A9775BarItem1 = new String[] {""} ;
      P0AFL4_A4609BarMdlCod = new String[] {""} ;
      P0AFL4_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFL4_A143BarDisNum = new String[] {""} ;
      P0AFL4_A136BarColNum = new int[1] ;
      P0AFL4_A135BarColNom = new String[] {""} ;
      P0AFL4_A212BarSer = new String[] {""} ;
      P0AFL4_A217BarTipArt = new short[1] ;
      P0AFL4_n217BarTipArt = new boolean[] {false} ;
      P0AFL4_A4812BarEncCli = new String[] {""} ;
      P0AFL4_A252CliCod = new int[1] ;
      P0AFL4_n252CliCod = new boolean[] {false} ;
      P0AFL4_A279CliNom = new String[] {""} ;
      P0AFL4_A1652BarSerDsc = new String[] {""} ;
      P0AFL4_A1234BarNomCli = new String[] {""} ;
      P0AFL4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFL4_A2010BarTipDis = new String[] {""} ;
      P0AFL4_A3841DisArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL4_A130BarCodPar = new String[] {""} ;
      P0AFL4_A132BarCodReo = new byte[1] ;
      P0AFL4_A129BarCod = new int[1] ;
      A9777BarItem3 = "" ;
      A9775BarItem1 = "" ;
      A4609BarMdlCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A4812BarEncCli = "" ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A2010BarTipDis = "" ;
      A3841DisArtMer = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV28DisArtMer = DecimalUtil.ZERO ;
      P0AFL6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV38Kexp = DecimalUtil.ZERO ;
      AV45Mexp = DecimalUtil.ZERO ;
      AV40Kgsalp = DecimalUtil.ZERO ;
      AV48Mtsalp = DecimalUtil.ZERO ;
      AV39Kgentp = DecimalUtil.ZERO ;
      AV47Mtentp = DecimalUtil.ZERO ;
      P0AFL7_A396EmprCod = new String[] {""} ;
      P0AFL7_A129BarCod = new int[1] ;
      P0AFL7_A132BarCodReo = new byte[1] ;
      P0AFL7_A130BarCodPar = new String[] {""} ;
      P0AFL7_A30AlbProCod = new long[1] ;
      P0AFL7_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL7_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P0AFL8_A396EmprCod = new String[] {""} ;
      P0AFL8_A30AlbProCod = new long[1] ;
      P0AFL8_A129BarCod = new int[1] ;
      P0AFL8_A132BarCodReo = new byte[1] ;
      P0AFL8_A130BarCodPar = new String[] {""} ;
      P0AFL8_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL8_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL8_A200BarPieCod = new String[] {""} ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV11barcodpar = "" ;
      AV17Barpiecod = "" ;
      c3275BarKgsAut = DecimalUtil.ZERO ;
      c3276BarMtsAut = DecimalUtil.ZERO ;
      P0AFL9_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL9_n3275BarKgsAut = new boolean[] {false} ;
      P0AFL9_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL9_n3276BarMtsAut = new boolean[] {false} ;
      AV25DifKgs = DecimalUtil.ZERO ;
      AV57PorKgs = DecimalUtil.ZERO ;
      AV26DifMts = DecimalUtil.ZERO ;
      AV58PorMts = DecimalUtil.ZERO ;
      AV13Barenccli = "" ;
      AV63TipArtDsc = "" ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      AV65Tot_mpk = DecimalUtil.ZERO ;
      AV67TotKDif = DecimalUtil.ZERO ;
      AV71TotMDif = DecimalUtil.ZERO ;
      AV46Mpk = DecimalUtil.ZERO ;
      P0AFL10_A396EmprCod = new String[] {""} ;
      P0AFL10_A829TipArtCod = new short[1] ;
      P0AFL10_A830TipArtDsc = new String[] {""} ;
      P0AFL10_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      c203BarPieKil = DecimalUtil.ZERO ;
      c205BarPieMet = DecimalUtil.ZERO ;
      P0AFL11_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFL11_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranesproduccion.informedemermas_export__default(),
         new Object[] {
             new Object[] {
            P0AFL2_A396EmprCod, P0AFL2_A407EmprNom, P0AFL2_n407EmprNom
            }
            , new Object[] {
            P0AFL4_A361DisCod, P0AFL4_A396EmprCod, P0AFL4_A213BarSit, P0AFL4_A9777BarItem3, P0AFL4_A9775BarItem1, P0AFL4_A4609BarMdlCod, P0AFL4_A161BarFecSal, P0AFL4_A143BarDisNum, P0AFL4_A136BarColNum, P0AFL4_A135BarColNom,
            P0AFL4_A212BarSer, P0AFL4_A217BarTipArt, P0AFL4_n217BarTipArt, P0AFL4_A4812BarEncCli, P0AFL4_A252CliCod, P0AFL4_n252CliCod, P0AFL4_A279CliNom, P0AFL4_A1652BarSerDsc, P0AFL4_A1234BarNomCli, P0AFL4_A155BarFecCli,
            P0AFL4_A2010BarTipDis, P0AFL4_A3841DisArtMer, P0AFL4_A166BarKgm, P0AFL4_A184BarMtr, P0AFL4_A130BarCodPar, P0AFL4_A132BarCodReo, P0AFL4_A129BarCod
            }
            , new Object[] {
            P0AFL6_A166BarKgm, P0AFL6_A184BarMtr
            }
            , new Object[] {
            P0AFL7_A396EmprCod, P0AFL7_A129BarCod, P0AFL7_A132BarCodReo, P0AFL7_A130BarCodPar, P0AFL7_A30AlbProCod, P0AFL7_A1261BarAlbKgmE, P0AFL7_A1263BarAlbMtrE
            }
            , new Object[] {
            P0AFL8_A396EmprCod, P0AFL8_A30AlbProCod, P0AFL8_A129BarCod, P0AFL8_A132BarCodReo, P0AFL8_A130BarCodPar, P0AFL8_A27AlbPKilEnt, P0AFL8_A1270AlbPMtrEnt, P0AFL8_A200BarPieCod
            }
            , new Object[] {
            P0AFL9_A3275BarKgsAut, P0AFL9_n3275BarKgsAut, P0AFL9_A3276BarMtsAut, P0AFL9_n3276BarMtsAut
            }
            , new Object[] {
            P0AFL10_A396EmprCod, P0AFL10_A829TipArtCod, P0AFL10_A830TipArtDsc, P0AFL10_n830TipArtDsc
            }
            , new Object[] {
            P0AFL11_A203BarPieKil, P0AFL11_A205BarPieMet
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV61SoloTotal ;
   private byte AV24Detalle ;
   private byte AV41KgsAut ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV12Barcodreo ;
   private short AV60PTipArt ;
   private short AV81UTipArt ;
   private short A217BarTipArt ;
   private short AV18BarTipArt ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV52PCliCod ;
   private int AV75UCliCod ;
   private int AV53PColNum ;
   private int AV76UColNum ;
   private int AV83CellRow ;
   private int AV82CellCol ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV10Barcod ;
   private int AV66Tot_nr ;
   private int AV85Random ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV69TotKgsEnt ;
   private java.math.BigDecimal AV70TotKgsSal ;
   private java.math.BigDecimal AV73TotMtsEnt ;
   private java.math.BigDecimal AV74TotMtsSal ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV28DisArtMer ;
   private java.math.BigDecimal AV38Kexp ;
   private java.math.BigDecimal AV45Mexp ;
   private java.math.BigDecimal AV40Kgsalp ;
   private java.math.BigDecimal AV48Mtsalp ;
   private java.math.BigDecimal AV39Kgentp ;
   private java.math.BigDecimal AV47Mtentp ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal c3275BarKgsAut ;
   private java.math.BigDecimal c3276BarMtsAut ;
   private java.math.BigDecimal AV25DifKgs ;
   private java.math.BigDecimal AV57PorKgs ;
   private java.math.BigDecimal AV26DifMts ;
   private java.math.BigDecimal AV58PorMts ;
   private java.math.BigDecimal AV65Tot_mpk ;
   private java.math.BigDecimal AV67TotKDif ;
   private java.math.BigDecimal AV71TotMDif ;
   private java.math.BigDecimal AV46Mpk ;
   private java.math.BigDecimal c203BarPieKil ;
   private java.math.BigDecimal c205BarPieMet ;
   private String A396EmprCod ;
   private String AV37ImpCod ;
   private String AV59PSerCod ;
   private String AV80USerCod ;
   private String AV54PColor ;
   private String AV77UColor ;
   private String AV55PDisCli ;
   private String AV78UDisCli ;
   private String AV16barmdlcod ;
   private String AV14BarItem1 ;
   private String AV15BarItem3 ;
   private String AV9Archivo ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV29EmprNom ;
   private String A9777BarItem3 ;
   private String A9775BarItem1 ;
   private String A4609BarMdlCod ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A4812BarEncCli ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A2010BarTipDis ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String A200BarPieCod ;
   private String AV11barcodpar ;
   private String AV17Barpiecod ;
   private String AV13Barenccli ;
   private String AV63TipArtDsc ;
   private String A830TipArtDsc ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV56PFecha ;
   private java.util.Date AV79UFecha ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean brkAFL3 ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n830TipArtDsc ;
   private String AV34FileName ;
   private String AV31ErrorMessage ;
   private String[] aP24 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private java.util.Date[] aP14 ;
   private java.util.Date[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private byte[] aP19 ;
   private byte[] aP20 ;
   private byte[] aP21 ;
   private String[] aP22 ;
   private String[] aP23 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AFL2_A396EmprCod ;
   private String[] P0AFL2_A407EmprNom ;
   private boolean[] P0AFL2_n407EmprNom ;
   private int[] P0AFL4_A361DisCod ;
   private String[] P0AFL4_A396EmprCod ;
   private byte[] P0AFL4_A213BarSit ;
   private String[] P0AFL4_A9777BarItem3 ;
   private String[] P0AFL4_A9775BarItem1 ;
   private String[] P0AFL4_A4609BarMdlCod ;
   private java.util.Date[] P0AFL4_A161BarFecSal ;
   private String[] P0AFL4_A143BarDisNum ;
   private int[] P0AFL4_A136BarColNum ;
   private String[] P0AFL4_A135BarColNom ;
   private String[] P0AFL4_A212BarSer ;
   private short[] P0AFL4_A217BarTipArt ;
   private boolean[] P0AFL4_n217BarTipArt ;
   private String[] P0AFL4_A4812BarEncCli ;
   private int[] P0AFL4_A252CliCod ;
   private boolean[] P0AFL4_n252CliCod ;
   private String[] P0AFL4_A279CliNom ;
   private String[] P0AFL4_A1652BarSerDsc ;
   private String[] P0AFL4_A1234BarNomCli ;
   private java.util.Date[] P0AFL4_A155BarFecCli ;
   private String[] P0AFL4_A2010BarTipDis ;
   private java.math.BigDecimal[] P0AFL4_A3841DisArtMer ;
   private java.math.BigDecimal[] P0AFL4_A166BarKgm ;
   private java.math.BigDecimal[] P0AFL4_A184BarMtr ;
   private String[] P0AFL4_A130BarCodPar ;
   private byte[] P0AFL4_A132BarCodReo ;
   private int[] P0AFL4_A129BarCod ;
   private java.math.BigDecimal[] P0AFL6_A166BarKgm ;
   private java.math.BigDecimal[] P0AFL6_A184BarMtr ;
   private String[] P0AFL7_A396EmprCod ;
   private int[] P0AFL7_A129BarCod ;
   private byte[] P0AFL7_A132BarCodReo ;
   private String[] P0AFL7_A130BarCodPar ;
   private long[] P0AFL7_A30AlbProCod ;
   private java.math.BigDecimal[] P0AFL7_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AFL7_A1263BarAlbMtrE ;
   private String[] P0AFL8_A396EmprCod ;
   private long[] P0AFL8_A30AlbProCod ;
   private int[] P0AFL8_A129BarCod ;
   private byte[] P0AFL8_A132BarCodReo ;
   private String[] P0AFL8_A130BarCodPar ;
   private java.math.BigDecimal[] P0AFL8_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P0AFL8_A1270AlbPMtrEnt ;
   private String[] P0AFL8_A200BarPieCod ;
   private java.math.BigDecimal[] P0AFL9_A3275BarKgsAut ;
   private boolean[] P0AFL9_n3275BarKgsAut ;
   private java.math.BigDecimal[] P0AFL9_A3276BarMtsAut ;
   private boolean[] P0AFL9_n3276BarMtsAut ;
   private String[] P0AFL10_A396EmprCod ;
   private short[] P0AFL10_A829TipArtCod ;
   private String[] P0AFL10_A830TipArtDsc ;
   private boolean[] P0AFL10_n830TipArtDsc ;
   private java.math.BigDecimal[] P0AFL11_A203BarPieKil ;
   private java.math.BigDecimal[] P0AFL11_A205BarPieMet ;
   private com.genexus.gxoffice.ExcelDoc AV84ExcelDocument ;
}

final  class informedemermas_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFL2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFL4", "SELECT T1.DisCod, T1.EmprCod, T1.BarSit, T1.BarItem3, T1.BarItem1, T1.BarMdlCod, T1.BarFecSal, T1.BarDisNum, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarTipArt, T1.BarEncCli, T1.CliCod, T3.CliNom, T1.BarSerDsc, T1.BarNomCli, T1.BarFecCli, T1.BarTipDis, T2.DisArtMer, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtr, 0) AS BarMtr, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.BarSer >= ?) AND (T1.BarTipArt >= ? and T1.BarTipArt <= ?) AND (T1.BarSer <= ?) AND (T1.BarColNom >= ? and T1.BarColNom <= ?) AND (T1.BarColNum >= ? and T1.BarColNum <= ?) AND (T1.BarDisNum >= ? and T1.BarDisNum <= ?) AND (T1.BarFecSal >= ? and T1.BarFecSal <= ?) AND (T1.BarMdlCod = ? or (rtrim(?) IS NULL)) AND (T1.BarItem1 = ? or (rtrim(?) IS NULL)) AND (T1.BarItem3 = ? or (rtrim(?) IS NULL)) AND (T1.BarSit >= 9) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFL6", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFL7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFL8", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPKilEnt, AlbPMtrEnt, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFL9", "SELECT SUM(BarKgsAut), SUM(BarMtsAut) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFL10", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFL11", "SELECT SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setDate(14, (java.util.Date)parms[13]);
               stmt.setString(15, (String)parms[14], 13);
               stmt.setString(16, (String)parms[15], 13);
               stmt.setString(17, (String)parms[16], 20);
               stmt.setString(18, (String)parms[17], 20);
               stmt.setString(19, (String)parms[18], 20);
               stmt.setString(20, (String)parms[19], 20);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

