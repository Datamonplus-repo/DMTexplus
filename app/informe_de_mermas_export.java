package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informe_de_mermas_export extends GXProcedure
{
   public informe_de_mermas_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informe_de_mermas_export.class ), "" );
   }

   public informe_de_mermas_export( int remoteHandle ,
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
                             short[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 )
   {
      informe_de_mermas_export.this.aP24 = new String[] {""};
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
                        short[] aP19 ,
                        String[] aP20 ,
                        String[] aP21 ,
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
                             short[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 ,
                             String[] aP24 )
   {
      informe_de_mermas_export.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      informe_de_mermas_export.this.AV8ImpCod = aP1[0];
      this.aP1 = aP1;
      informe_de_mermas_export.this.AV9PTipArt = aP2[0];
      this.aP2 = aP2;
      informe_de_mermas_export.this.AV10UTipArt = aP3[0];
      this.aP3 = aP3;
      informe_de_mermas_export.this.AV11PCliCod = aP4[0];
      this.aP4 = aP4;
      informe_de_mermas_export.this.AV12UCliCod = aP5[0];
      this.aP5 = aP5;
      informe_de_mermas_export.this.AV19PSerCod = aP6[0];
      this.aP6 = aP6;
      informe_de_mermas_export.this.AV18USerCod = aP7[0];
      this.aP7 = aP7;
      informe_de_mermas_export.this.AV17PColor = aP8[0];
      this.aP8 = aP8;
      informe_de_mermas_export.this.AV16UColor = aP9[0];
      this.aP9 = aP9;
      informe_de_mermas_export.this.AV15PColNum = aP10[0];
      this.aP10 = aP10;
      informe_de_mermas_export.this.AV14UColNum = aP11[0];
      this.aP11 = aP11;
      informe_de_mermas_export.this.AV13PDisCli = aP12[0];
      this.aP12 = aP12;
      informe_de_mermas_export.this.AV20UDisCli = aP13[0];
      this.aP13 = aP13;
      informe_de_mermas_export.this.AV21PFecha = aP14[0];
      this.aP14 = aP14;
      informe_de_mermas_export.this.AV22UFecha = aP15[0];
      this.aP15 = aP15;
      informe_de_mermas_export.this.AV23barmdlcod = aP16[0];
      this.aP16 = aP16;
      informe_de_mermas_export.this.AV24BarItem1 = aP17[0];
      this.aP17 = aP17;
      informe_de_mermas_export.this.AV25BarItem3 = aP18[0];
      this.aP18 = aP18;
      informe_de_mermas_export.this.AV26SoloTotal = aP19[0];
      this.aP19 = aP19;
      informe_de_mermas_export.this.AV27Enccli1 = aP20[0];
      this.aP20 = aP20;
      informe_de_mermas_export.this.AV28Enccli2 = aP21[0];
      this.aP21 = aP21;
      informe_de_mermas_export.this.AV29BarItem5 = aP22[0];
      this.aP22 = aP22;
      informe_de_mermas_export.this.aP23 = aP23;
      informe_de_mermas_export.this.aP24 = aP24;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV30Enc20c) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int2) ;
      informe_de_mermas_export.this.GXt_int1 = GXv_int2[0] ;
      AV30Enc20c = GXt_int1 ;
      GXt_int1 = (byte)(AV31etm) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      informe_de_mermas_export.this.GXt_int1 = GXv_int2[0] ;
      AV31etm = GXt_int1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S161 ();
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
      AV47CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S141 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV47CellRow = 2 ;
      AV59cellcol = 1 ;
      while ( AV59cellcol <= 50 )
      {
         AV34ExcelDocument.Cells(AV47CellRow, AV59cellcol, 1, 1).setBold( (short)(1) );
         AV34ExcelDocument.Cells(AV47CellRow, AV59cellcol, 1, 1).setColor( 11 );
         AV59cellcol = (int)(AV59cellcol+1) ;
      }
      AV34ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV34ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV34ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Nº Hdr", "") );
      AV34ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Tipo Articulo", "") );
      AV34ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV34ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Pedido Cliente", "") );
      AV34ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV34ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "COlor", "") );
      AV34ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Color Cliente", "") );
      AV34ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Numero ", "") );
      AV34ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Fecha Ped. Cli.", "") );
      AV34ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV34ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Kilos Sal.", "") );
      AV34ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Dif. Kilos", "") );
      AV34ExcelDocument.Cells(2, 15, 1, 1).setText( "% " );
      AV34ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV34ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Metros Sal.", "") );
      AV34ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Dif. Metros", "") );
      AV34ExcelDocument.Cells(2, 19, 1, 1).setText( "% " );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV42TotKgsEnt = DecimalUtil.doubleToDec(0) ;
      AV43TotKgsSal = DecimalUtil.doubleToDec(0) ;
      AV44TotMtsEnt = DecimalUtil.doubleToDec(0) ;
      AV45TotMtsSal = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AHN3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11PCliCod), AV19PSerCod, Short.valueOf(AV9PTipArt), Short.valueOf(AV10UTipArt), AV18USerCod, AV17PColor, AV16UColor, Integer.valueOf(AV15PColNum), Integer.valueOf(AV14UColNum), Short.valueOf(AV30Enc20c), AV13PDisCli, AV20UDisCli, Short.valueOf(AV30Enc20c), AV27Enccli1, AV28Enccli2, AV21PFecha, AV22UFecha, AV23barmdlcod, AV23barmdlcod, AV24BarItem1, AV24BarItem1, AV25BarItem3, AV25BarItem3, AV29BarItem5, AV29BarItem5, Integer.valueOf(AV12UCliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAHN2 = false ;
         A213BarSit = P0AHN3_A213BarSit[0] ;
         A9789BarItem5 = P0AHN3_A9789BarItem5[0] ;
         A9777BarItem3 = P0AHN3_A9777BarItem3[0] ;
         A9775BarItem1 = P0AHN3_A9775BarItem1[0] ;
         A4609BarMdlCod = P0AHN3_A4609BarMdlCod[0] ;
         A161BarFecSal = P0AHN3_A161BarFecSal[0] ;
         A4812BarEncCli = P0AHN3_A4812BarEncCli[0] ;
         A143BarDisNum = P0AHN3_A143BarDisNum[0] ;
         A136BarColNum = P0AHN3_A136BarColNum[0] ;
         A135BarColNom = P0AHN3_A135BarColNom[0] ;
         A212BarSer = P0AHN3_A212BarSer[0] ;
         A217BarTipArt = P0AHN3_A217BarTipArt[0] ;
         n217BarTipArt = P0AHN3_n217BarTipArt[0] ;
         A252CliCod = P0AHN3_A252CliCod[0] ;
         n252CliCod = P0AHN3_n252CliCod[0] ;
         A279CliNom = P0AHN3_A279CliNom[0] ;
         A1234BarNomCli = P0AHN3_A1234BarNomCli[0] ;
         A155BarFecCli = P0AHN3_A155BarFecCli[0] ;
         A1652BarSerDsc = P0AHN3_A1652BarSerDsc[0] ;
         A166BarKgm = P0AHN3_A166BarKgm[0] ;
         A184BarMtr = P0AHN3_A184BarMtr[0] ;
         A130BarCodPar = P0AHN3_A130BarCodPar[0] ;
         A132BarCodReo = P0AHN3_A132BarCodReo[0] ;
         A129BarCod = P0AHN3_A129BarCod[0] ;
         A279CliNom = P0AHN3_A279CliNom[0] ;
         A166BarKgm = P0AHN3_A166BarKgm[0] ;
         A184BarMtr = P0AHN3_A184BarMtr[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36DisArtMer = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AHN3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AHN3_A252CliCod[0] == A252CliCod ) )
         {
            brkAHN2 = false ;
            A213BarSit = P0AHN3_A213BarSit[0] ;
            A9789BarItem5 = P0AHN3_A9789BarItem5[0] ;
            A9777BarItem3 = P0AHN3_A9777BarItem3[0] ;
            A9775BarItem1 = P0AHN3_A9775BarItem1[0] ;
            A4609BarMdlCod = P0AHN3_A4609BarMdlCod[0] ;
            A161BarFecSal = P0AHN3_A161BarFecSal[0] ;
            A4812BarEncCli = P0AHN3_A4812BarEncCli[0] ;
            A143BarDisNum = P0AHN3_A143BarDisNum[0] ;
            A136BarColNum = P0AHN3_A136BarColNum[0] ;
            A135BarColNom = P0AHN3_A135BarColNom[0] ;
            A212BarSer = P0AHN3_A212BarSer[0] ;
            A217BarTipArt = P0AHN3_A217BarTipArt[0] ;
            n217BarTipArt = P0AHN3_n217BarTipArt[0] ;
            A279CliNom = P0AHN3_A279CliNom[0] ;
            A1234BarNomCli = P0AHN3_A1234BarNomCli[0] ;
            A155BarFecCli = P0AHN3_A155BarFecCli[0] ;
            A1652BarSerDsc = P0AHN3_A1652BarSerDsc[0] ;
            A130BarCodPar = P0AHN3_A130BarCodPar[0] ;
            A132BarCodReo = P0AHN3_A132BarCodReo[0] ;
            A129BarCod = P0AHN3_A129BarCod[0] ;
            A279CliNom = P0AHN3_A279CliNom[0] ;
            if ( GXutil.strcmp(A212BarSer, AV18USerCod) <= 0 )
            {
               if ( GXutil.strcmp(A212BarSer, AV19PSerCod) >= 0 )
               {
                  if ( ( A217BarTipArt >= AV9PTipArt ) && ( A217BarTipArt <= AV10UTipArt ) )
                  {
                     if ( ( GXutil.strcmp(A135BarColNom, AV17PColor) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV16UColor) <= 0 ) )
                     {
                        if ( ( A136BarColNum >= AV15PColNum ) && ( A136BarColNum <= AV14UColNum ) )
                        {
                           if ( ( ( AV30Enc20c == 0 ) && ( GXutil.strcmp(A143BarDisNum, AV13PDisCli) >= 0 ) && ( GXutil.strcmp(A143BarDisNum, AV20UDisCli) <= 0 ) ) || ( ( AV30Enc20c == 1 ) && ( GXutil.strcmp(A4812BarEncCli, AV27Enccli1) >= 0 ) && ( GXutil.strcmp(A4812BarEncCli, AV28Enccli2) <= 0 ) ) )
                           {
                              if ( (( GXutil.resetTime(A161BarFecSal).after( GXutil.resetTime( AV21PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A161BarFecSal), GXutil.resetTime(AV21PFecha)) )) && (( GXutil.resetTime(A161BarFecSal).before( GXutil.resetTime( AV22UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A161BarFecSal), GXutil.resetTime(AV22UFecha)) )) )
                              {
                                 if ( ( GXutil.strcmp(A4609BarMdlCod, AV23barmdlcod) == 0 ) || (GXutil.strcmp("", AV23barmdlcod)==0) )
                                 {
                                    if ( ( GXutil.strcmp(A9775BarItem1, AV24BarItem1) == 0 ) || (GXutil.strcmp("", AV24BarItem1)==0) )
                                    {
                                       if ( ( GXutil.strcmp(A9777BarItem3, AV25BarItem3) == 0 ) || (GXutil.strcmp("", AV25BarItem3)==0) )
                                       {
                                          if ( ( GXutil.strcmp(A9789BarItem5, AV29BarItem5) == 0 ) || (GXutil.strcmp("", AV29BarItem5)==0) )
                                          {
                                             if ( A213BarSit >= 9 )
                                             {
                                                /* Using cursor P0AHN5 */
                                                pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                if ( (pr_default.getStatus(1) != 101) )
                                                {
                                                   A166BarKgm = P0AHN5_A166BarKgm[0] ;
                                                   A184BarMtr = P0AHN5_A184BarMtr[0] ;
                                                }
                                                else
                                                {
                                                   A166BarKgm = DecimalUtil.doubleToDec(0) ;
                                                   A184BarMtr = DecimalUtil.doubleToDec(0) ;
                                                }
                                                pr_default.close(1);
                                                A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                                AV55Kexp = DecimalUtil.doubleToDec(0) ;
                                                AV56Mexp = DecimalUtil.doubleToDec(0) ;
                                                /* Optimized group. */
                                                /* Using cursor P0AHN6 */
                                                pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                c1261BarAlbKgmE = P0AHN6_A1261BarAlbKgmE[0] ;
                                                c1263BarAlbMtrE = P0AHN6_A1263BarAlbMtrE[0] ;
                                                pr_default.close(2);
                                                AV55Kexp = AV55Kexp.add(c1261BarAlbKgmE) ;
                                                AV56Mexp = AV56Mexp.add(c1263BarAlbMtrE) ;
                                                /* End optimized group. */
                                                AV42TotKgsEnt = AV42TotKgsEnt.add(A166BarKgm) ;
                                                AV43TotKgsSal = AV43TotKgsSal.add(AV55Kexp) ;
                                                AV44TotMtsEnt = AV44TotMtsEnt.add(A184BarMtr) ;
                                                AV45TotMtsSal = AV45TotMtsSal.add(AV56Mexp) ;
                                                if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Kexp)==0) )
                                                {
                                                   AV57DifKgs = AV55Kexp.subtract(A166BarKgm) ;
                                                }
                                                else
                                                {
                                                   AV57DifKgs = DecimalUtil.ZERO ;
                                                }
                                                if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A166BarKgm)==0) )
                                                {
                                                   AV50PorKgs = ((AV57DifKgs.divide(A166BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
                                                }
                                                else
                                                {
                                                   AV50PorKgs = DecimalUtil.ZERO ;
                                                }
                                                if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Mexp)==0) )
                                                {
                                                   AV58DifMts = AV56Mexp.subtract(A184BarMtr) ;
                                                }
                                                else
                                                {
                                                   AV58DifMts = DecimalUtil.ZERO ;
                                                }
                                                if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A184BarMtr)==0) )
                                                {
                                                   AV52PorMts = ((AV58DifMts.divide(A184BarMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
                                                }
                                                else
                                                {
                                                   AV52PorMts = DecimalUtil.ZERO ;
                                                }
                                                AV37BarTipArt = A217BarTipArt ;
                                                /* Execute user subroutine: 'TIPART' */
                                                S133 ();
                                                if ( returnInSub )
                                                {
                                                   pr_default.close(1);
                                                   pr_default.close(0);
                                                   pr_default.close(0);
                                                   pr_default.close(0);
                                                   returnInSub = true;
                                                   if (true) return;
                                                }
                                                if ( AV26SoloTotal == 0 )
                                                {
                                                   AV34ExcelDocument.Cells(AV47CellRow, 1, 1, 1).setNumber( A252CliCod );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 2, 1, 1).setText( A279CliNom );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 3, 1, 1).setText( A13696BarNHdr );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 4, 1, 1).setNumber( A217BarTipArt );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 5, 1, 1).setText( AV41TipArtDsc );
                                                   AV46barenccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                                                   AV34ExcelDocument.Cells(AV47CellRow, 6, 1, 1).setText( AV46barenccli );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 7, 1, 1).setText( A212BarSer );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 8, 1, 1).setText( A135BarColNom );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 9, 1, 1).setText( A1234BarNomCli );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 10, 1, 1).setNumber( A136BarColNum );
                                                   GXt_dtime3 = GXutil.resetTime( A155BarFecCli );
                                                   AV34ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                   AV34ExcelDocument.Cells(AV47CellRow, 11, 1, 1).setDate( GXt_dtime3 );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55Kexp)) );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57DifKgs)) );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50PorKgs)) );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56Mexp)) );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 18, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58DifMts)) );
                                                   AV34ExcelDocument.Cells(AV47CellRow, 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52PorMts)) );
                                                   AV47CellRow = (int)(AV47CellRow+1) ;
                                                }
                                                AV48Tot_mpk = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV48Tot_mpk).add(AV50PorKgs))) ;
                                                if ( AV50PorKgs.doubleValue() != 0 )
                                                {
                                                   AV53Tot_nr = (int)(AV53Tot_nr+1) ;
                                                }
                                                AV38Clicod = A252CliCod ;
                                                AV39CliNom = A279CliNom ;
                                                AV40BarSerdsc = A1652BarSerDsc ;
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
            brkAHN2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brkAHN2 )
         {
            brkAHN2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      if ( ( AV42TotKgsEnt.doubleValue() == 0 ) && ( AV44TotMtsEnt.doubleValue() == 0 ) )
      {
      }
      else
      {
         AV49TotKDif = AV43TotKgsSal.subtract(AV42TotKgsEnt) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TotKgsEnt)==0) )
         {
            AV50PorKgs = ((AV49TotKDif.divide(AV42TotKgsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         else
         {
            AV50PorKgs = DecimalUtil.ZERO ;
         }
         AV51TotMDif = AV45TotMtsSal.subtract(AV44TotMtsEnt) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TotMtsEnt)==0) )
         {
            AV52PorMts = ((AV51TotMDif.divide(AV44TotMtsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         else
         {
            AV52PorMts = DecimalUtil.ZERO ;
         }
         AV54Mpk = DecimalUtil.doubleToDec(0) ;
         if ( AV53Tot_nr > 0 )
         {
            AV54Mpk = DecimalUtil.doubleToDec(AV48Tot_mpk/ (double) (AV53Tot_nr)) ;
         }
         AV59cellcol = 12 ;
         while ( AV59cellcol <= 19 )
         {
            AV34ExcelDocument.Cells(AV47CellRow, AV59cellcol, 1, 1).setBold( (short)(1) );
            AV34ExcelDocument.Cells(AV47CellRow, AV59cellcol, 1, 1).setColor( 11 );
            AV59cellcol = (int)(AV59cellcol+1) ;
         }
         AV34ExcelDocument.Cells(AV47CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TotKgsEnt)) );
         AV34ExcelDocument.Cells(AV47CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TotKgsSal)) );
         AV34ExcelDocument.Cells(AV47CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TotKDif)) );
         AV34ExcelDocument.Cells(AV47CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50PorKgs)) );
         AV34ExcelDocument.Cells(AV47CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TotMtsEnt)) );
         AV34ExcelDocument.Cells(AV47CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TotMtsSal)) );
         AV34ExcelDocument.Cells(AV47CellRow, 18, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TotMDif)) );
         AV34ExcelDocument.Cells(AV47CellRow, 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52PorMts)) );
      }
   }

   public void S141( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV34ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV34ExcelDocument.Close();
   }

   public void S161( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV35Random = (int)(GXutil.random( )*10000) ;
      AV32Filename = "Informe_de_mermas_Export-" + GXutil.trim( GXutil.str( AV35Random, 8, 0)) + ".xlsx" ;
      AV34ExcelDocument.Open(AV32Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV34ExcelDocument.Clear();
   }

   public void S151( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV34ExcelDocument.getErrCode() != 0 )
      {
         AV32Filename = "" ;
         AV33ErrorMessage = AV34ExcelDocument.getErrDescription() ;
         AV34ExcelDocument.Close();
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S133( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV41TipArtDsc = " " ;
      /* Using cursor P0AHN7 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(AV37BarTipArt)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A829TipArtCod = P0AHN7_A829TipArtCod[0] ;
         A830TipArtDsc = P0AHN7_A830TipArtDsc[0] ;
         n830TipArtDsc = P0AHN7_n830TipArtDsc[0] ;
         AV41TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = informe_de_mermas_export.this.A396EmprCod;
      this.aP1[0] = informe_de_mermas_export.this.AV8ImpCod;
      this.aP2[0] = informe_de_mermas_export.this.AV9PTipArt;
      this.aP3[0] = informe_de_mermas_export.this.AV10UTipArt;
      this.aP4[0] = informe_de_mermas_export.this.AV11PCliCod;
      this.aP5[0] = informe_de_mermas_export.this.AV12UCliCod;
      this.aP6[0] = informe_de_mermas_export.this.AV19PSerCod;
      this.aP7[0] = informe_de_mermas_export.this.AV18USerCod;
      this.aP8[0] = informe_de_mermas_export.this.AV17PColor;
      this.aP9[0] = informe_de_mermas_export.this.AV16UColor;
      this.aP10[0] = informe_de_mermas_export.this.AV15PColNum;
      this.aP11[0] = informe_de_mermas_export.this.AV14UColNum;
      this.aP12[0] = informe_de_mermas_export.this.AV13PDisCli;
      this.aP13[0] = informe_de_mermas_export.this.AV20UDisCli;
      this.aP14[0] = informe_de_mermas_export.this.AV21PFecha;
      this.aP15[0] = informe_de_mermas_export.this.AV22UFecha;
      this.aP16[0] = informe_de_mermas_export.this.AV23barmdlcod;
      this.aP17[0] = informe_de_mermas_export.this.AV24BarItem1;
      this.aP18[0] = informe_de_mermas_export.this.AV25BarItem3;
      this.aP19[0] = informe_de_mermas_export.this.AV26SoloTotal;
      this.aP20[0] = informe_de_mermas_export.this.AV27Enccli1;
      this.aP21[0] = informe_de_mermas_export.this.AV28Enccli2;
      this.aP22[0] = informe_de_mermas_export.this.AV29BarItem5;
      this.aP23[0] = informe_de_mermas_export.this.AV32Filename;
      this.aP24[0] = informe_de_mermas_export.this.AV33ErrorMessage;
      CloseOpenCursors();
      AV34ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32Filename = "" ;
      AV33ErrorMessage = "" ;
      GXv_int2 = new byte[1] ;
      AV34ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV42TotKgsEnt = DecimalUtil.ZERO ;
      AV43TotKgsSal = DecimalUtil.ZERO ;
      AV44TotMtsEnt = DecimalUtil.ZERO ;
      AV45TotMtsSal = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AHN3_A396EmprCod = new String[] {""} ;
      P0AHN3_A213BarSit = new byte[1] ;
      P0AHN3_A9789BarItem5 = new String[] {""} ;
      P0AHN3_A9777BarItem3 = new String[] {""} ;
      P0AHN3_A9775BarItem1 = new String[] {""} ;
      P0AHN3_A4609BarMdlCod = new String[] {""} ;
      P0AHN3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHN3_A4812BarEncCli = new String[] {""} ;
      P0AHN3_A143BarDisNum = new String[] {""} ;
      P0AHN3_A136BarColNum = new int[1] ;
      P0AHN3_A135BarColNom = new String[] {""} ;
      P0AHN3_A212BarSer = new String[] {""} ;
      P0AHN3_A217BarTipArt = new short[1] ;
      P0AHN3_n217BarTipArt = new boolean[] {false} ;
      P0AHN3_A252CliCod = new int[1] ;
      P0AHN3_n252CliCod = new boolean[] {false} ;
      P0AHN3_A279CliNom = new String[] {""} ;
      P0AHN3_A1234BarNomCli = new String[] {""} ;
      P0AHN3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHN3_A1652BarSerDsc = new String[] {""} ;
      P0AHN3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHN3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHN3_A130BarCodPar = new String[] {""} ;
      P0AHN3_A132BarCodReo = new byte[1] ;
      P0AHN3_A129BarCod = new int[1] ;
      A9789BarItem5 = "" ;
      A9777BarItem3 = "" ;
      A9775BarItem1 = "" ;
      A4609BarMdlCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A279CliNom = "" ;
      A1234BarNomCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A1652BarSerDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV36DisArtMer = DecimalUtil.ZERO ;
      P0AHN5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHN5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV55Kexp = DecimalUtil.ZERO ;
      AV56Mexp = DecimalUtil.ZERO ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      c1263BarAlbMtrE = DecimalUtil.ZERO ;
      P0AHN6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHN6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV57DifKgs = DecimalUtil.ZERO ;
      AV50PorKgs = DecimalUtil.ZERO ;
      AV58DifMts = DecimalUtil.ZERO ;
      AV52PorMts = DecimalUtil.ZERO ;
      AV41TipArtDsc = "" ;
      AV46barenccli = "" ;
      GXt_dtime3 = GXutil.resetTime( GXutil.nullDate() );
      AV39CliNom = "" ;
      AV40BarSerdsc = "" ;
      AV49TotKDif = DecimalUtil.ZERO ;
      AV51TotMDif = DecimalUtil.ZERO ;
      AV54Mpk = DecimalUtil.ZERO ;
      P0AHN7_A396EmprCod = new String[] {""} ;
      P0AHN7_A829TipArtCod = new short[1] ;
      P0AHN7_A830TipArtDsc = new String[] {""} ;
      P0AHN7_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informe_de_mermas_export__default(),
         new Object[] {
             new Object[] {
            P0AHN3_A396EmprCod, P0AHN3_A213BarSit, P0AHN3_A9789BarItem5, P0AHN3_A9777BarItem3, P0AHN3_A9775BarItem1, P0AHN3_A4609BarMdlCod, P0AHN3_A161BarFecSal, P0AHN3_A4812BarEncCli, P0AHN3_A143BarDisNum, P0AHN3_A136BarColNum,
            P0AHN3_A135BarColNom, P0AHN3_A212BarSer, P0AHN3_A217BarTipArt, P0AHN3_n217BarTipArt, P0AHN3_A252CliCod, P0AHN3_n252CliCod, P0AHN3_A279CliNom, P0AHN3_A1234BarNomCli, P0AHN3_A155BarFecCli, P0AHN3_A1652BarSerDsc,
            P0AHN3_A166BarKgm, P0AHN3_A184BarMtr, P0AHN3_A130BarCodPar, P0AHN3_A132BarCodReo, P0AHN3_A129BarCod
            }
            , new Object[] {
            P0AHN5_A166BarKgm, P0AHN5_A184BarMtr
            }
            , new Object[] {
            P0AHN6_A1261BarAlbKgmE, P0AHN6_A1263BarAlbMtrE
            }
            , new Object[] {
            P0AHN7_A396EmprCod, P0AHN7_A829TipArtCod, P0AHN7_A830TipArtDsc, P0AHN7_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short AV9PTipArt ;
   private short AV10UTipArt ;
   private short AV26SoloTotal ;
   private short AV30Enc20c ;
   private short AV31etm ;
   private short A217BarTipArt ;
   private short AV37BarTipArt ;
   private short AV48Tot_mpk ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV11PCliCod ;
   private int AV12UCliCod ;
   private int AV15PColNum ;
   private int AV14UColNum ;
   private int AV47CellRow ;
   private int AV59cellcol ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV53Tot_nr ;
   private int AV38Clicod ;
   private int AV35Random ;
   private java.math.BigDecimal AV42TotKgsEnt ;
   private java.math.BigDecimal AV43TotKgsSal ;
   private java.math.BigDecimal AV44TotMtsEnt ;
   private java.math.BigDecimal AV45TotMtsSal ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV36DisArtMer ;
   private java.math.BigDecimal AV55Kexp ;
   private java.math.BigDecimal AV56Mexp ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private java.math.BigDecimal c1263BarAlbMtrE ;
   private java.math.BigDecimal AV57DifKgs ;
   private java.math.BigDecimal AV50PorKgs ;
   private java.math.BigDecimal AV58DifMts ;
   private java.math.BigDecimal AV52PorMts ;
   private java.math.BigDecimal AV49TotKDif ;
   private java.math.BigDecimal AV51TotMDif ;
   private java.math.BigDecimal AV54Mpk ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV19PSerCod ;
   private String AV18USerCod ;
   private String AV17PColor ;
   private String AV16UColor ;
   private String AV13PDisCli ;
   private String AV20UDisCli ;
   private String AV23barmdlcod ;
   private String AV24BarItem1 ;
   private String AV25BarItem3 ;
   private String AV27Enccli1 ;
   private String AV28Enccli2 ;
   private String AV29BarItem5 ;
   private String scmdbuf ;
   private String A9789BarItem5 ;
   private String A9777BarItem3 ;
   private String A9775BarItem1 ;
   private String A4609BarMdlCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A279CliNom ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV41TipArtDsc ;
   private String AV46barenccli ;
   private String AV39CliNom ;
   private String AV40BarSerdsc ;
   private String A830TipArtDsc ;
   private java.util.Date GXt_dtime3 ;
   private java.util.Date AV21PFecha ;
   private java.util.Date AV22UFecha ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private boolean returnInSub ;
   private boolean brkAHN2 ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n830TipArtDsc ;
   private String AV32Filename ;
   private String AV33ErrorMessage ;
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
   private short[] aP19 ;
   private String[] aP20 ;
   private String[] aP21 ;
   private String[] aP22 ;
   private String[] aP23 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHN3_A396EmprCod ;
   private byte[] P0AHN3_A213BarSit ;
   private String[] P0AHN3_A9789BarItem5 ;
   private String[] P0AHN3_A9777BarItem3 ;
   private String[] P0AHN3_A9775BarItem1 ;
   private String[] P0AHN3_A4609BarMdlCod ;
   private java.util.Date[] P0AHN3_A161BarFecSal ;
   private String[] P0AHN3_A4812BarEncCli ;
   private String[] P0AHN3_A143BarDisNum ;
   private int[] P0AHN3_A136BarColNum ;
   private String[] P0AHN3_A135BarColNom ;
   private String[] P0AHN3_A212BarSer ;
   private short[] P0AHN3_A217BarTipArt ;
   private boolean[] P0AHN3_n217BarTipArt ;
   private int[] P0AHN3_A252CliCod ;
   private boolean[] P0AHN3_n252CliCod ;
   private String[] P0AHN3_A279CliNom ;
   private String[] P0AHN3_A1234BarNomCli ;
   private java.util.Date[] P0AHN3_A155BarFecCli ;
   private String[] P0AHN3_A1652BarSerDsc ;
   private java.math.BigDecimal[] P0AHN3_A166BarKgm ;
   private java.math.BigDecimal[] P0AHN3_A184BarMtr ;
   private String[] P0AHN3_A130BarCodPar ;
   private byte[] P0AHN3_A132BarCodReo ;
   private int[] P0AHN3_A129BarCod ;
   private java.math.BigDecimal[] P0AHN5_A166BarKgm ;
   private java.math.BigDecimal[] P0AHN5_A184BarMtr ;
   private java.math.BigDecimal[] P0AHN6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AHN6_A1263BarAlbMtrE ;
   private String[] P0AHN7_A396EmprCod ;
   private short[] P0AHN7_A829TipArtCod ;
   private String[] P0AHN7_A830TipArtDsc ;
   private boolean[] P0AHN7_n830TipArtDsc ;
   private com.genexus.gxoffice.ExcelDoc AV34ExcelDocument ;
}

final  class informe_de_mermas_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHN3", "SELECT T1.EmprCod, T1.BarSit, T1.BarItem5, T1.BarItem3, T1.BarItem1, T1.BarMdlCod, T1.BarFecSal, T1.BarEncCli, T1.BarDisNum, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarTipArt, T1.CliCod, T2.CliNom, T1.BarNomCli, T1.BarFecCli, T1.BarSerDsc, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.BarSer >= ?) AND (T1.BarTipArt >= ? and T1.BarTipArt <= ?) AND (T1.BarSer <= ?) AND (T1.BarColNom >= ? and T1.BarColNom <= ?) AND (T1.BarColNum >= ? and T1.BarColNum <= ?) AND (( ? = 0 and T1.BarDisNum >= ? and T1.BarDisNum <= ?) or ( ? = 1 and T1.BarEncCli >= ? and T1.BarEncCli <= ?)) AND (T1.BarFecSal >= ? and T1.BarFecSal <= ?) AND (T1.BarMdlCod = ? or (rtrim(?) IS NULL)) AND (T1.BarItem1 = ? or (rtrim(?) IS NULL)) AND (T1.BarItem3 = ? or (rtrim(?) IS NULL)) AND (T1.BarItem5 = ? or (rtrim(?) IS NULL)) AND (T1.BarSit >= 9) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHN5", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHN6", "SELECT SUM(BarAlbKgmE), SUM(BarAlbMtrE) FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHN7", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               ((int[]) buf[24])[0] = rslt.getInt(23);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 8);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 20);
               stmt.setString(16, (String)parms[15], 20);
               stmt.setDate(17, (java.util.Date)parms[16]);
               stmt.setDate(18, (java.util.Date)parms[17]);
               stmt.setString(19, (String)parms[18], 13);
               stmt.setString(20, (String)parms[19], 13);
               stmt.setString(21, (String)parms[20], 20);
               stmt.setString(22, (String)parms[21], 20);
               stmt.setString(23, (String)parms[22], 20);
               stmt.setString(24, (String)parms[23], 20);
               stmt.setString(25, (String)parms[24], 20);
               stmt.setString(26, (String)parms[25], 20);
               stmt.setInt(27, ((Number) parms[26]).intValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

