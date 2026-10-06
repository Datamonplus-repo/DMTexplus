package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class xlsrem0005 extends GXProcedure
{
   public xlsrem0005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( xlsrem0005.class ), "" );
   }

   public xlsrem0005( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             byte[] aP18 ,
                             String[] aP19 )
   {
      xlsrem0005.this.aP20 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        byte[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        byte[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             byte[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 )
   {
      xlsrem0005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      xlsrem0005.this.AV9ImpCod = aP1[0];
      this.aP1 = aP1;
      xlsrem0005.this.AV11PCliente = aP2[0];
      this.aP2 = aP2;
      xlsrem0005.this.AV12UCliente = aP3[0];
      this.aP3 = aP3;
      xlsrem0005.this.AV13PFecha = aP4[0];
      this.aP4 = aP4;
      xlsrem0005.this.AV14UFecha = aP5[0];
      this.aP5 = aP5;
      xlsrem0005.this.AV32ALbRef_i = aP6[0];
      this.aP6 = aP6;
      xlsrem0005.this.AV33AlbRef_f = aP7[0];
      this.aP7 = aP7;
      xlsrem0005.this.AV66Albrenti = aP8[0];
      this.aP8 = aP8;
      xlsrem0005.this.AV67Albrentf = aP9[0];
      this.aP9 = aP9;
      xlsrem0005.this.AV210Tipentcod = aP10[0];
      this.aP10 = aP10;
      xlsrem0005.this.AV80Tipartcod1 = aP11[0];
      this.aP11 = aP11;
      xlsrem0005.this.AV81Tipartcod2 = aP12[0];
      this.aP12 = aP12;
      xlsrem0005.this.AV149Enc20c = aP13[0];
      this.aP13 = aP13;
      xlsrem0005.this.AV183Palb = aP14[0];
      this.aP14 = aP14;
      xlsrem0005.this.AV226UAlb = aP15[0];
      this.aP15 = aP15;
      xlsrem0005.this.AV119AlbRReo = aP16[0];
      this.aP16 = aP16;
      xlsrem0005.this.AV82Estado_a = aP17[0];
      this.aP17 = aP17;
      xlsrem0005.this.AV146detalle = aP18[0];
      this.aP18 = aP18;
      xlsrem0005.this.AV96Filename = aP19[0];
      this.aP19 = aP19;
      xlsrem0005.this.AV94ErrorMessage = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV31ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
      xlsrem0005.this.AV31ContDsc = GXv_char1[0] ;
      GXt_int2 = AV68Moda21 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
      xlsrem0005.this.GXt_int2 = GXv_int3[0] ;
      AV68Moda21 = GXt_int2 ;
      GXt_int2 = AV69Cli350 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int3) ;
      xlsrem0005.this.GXt_int2 = GXv_int3[0] ;
      AV69Cli350 = GXt_int2 ;
      GXt_int4 = AV70ContVal ;
      GXv_int5[0] = GXt_int4 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int5) ;
      xlsrem0005.this.GXt_int4 = GXv_int5[0] ;
      AV70ContVal = GXt_int4 ;
      AV97Random = (int)(GXutil.random( )*10000) ;
      AV96Filename = GXutil.trim( AV234Pgmdesc) + "_" + GXutil.trim( GXutil.str( AV97Random, 8, 0)) + ".xlsx" ;
      AV95ExcelDocument.Open(AV96Filename);
      if ( AV95ExcelDocument.getErrCode() != 0 )
      {
         AV96Filename = "" ;
         AV94ErrorMessage = AV95ExcelDocument.getErrDescription() ;
         AV95ExcelDocument.Close();
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV95ExcelDocument.Clear();
      AV98Row = (short)(1) ;
      AV93Col = (short)(1) ;
      while ( AV93Col <= 27 )
      {
         AV95ExcelDocument.Cells(AV98Row, AV93Col, 1, 1).setBold( (short)(1) );
         AV95ExcelDocument.Cells(AV98Row, AV93Col, 1, 1).setColor( 11 );
         AV93Col = (short)(AV93Col+1) ;
      }
      AV95ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Client", "") );
      AV95ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV95ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "N Recepcion", "") );
      AV95ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV95ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Nº Documento", "") );
      AV95ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Lote", "") );
      AV95ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Und Ent", "") );
      AV95ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Pzs Ent", "") );
      AV95ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV95ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Und Stock", "") );
      AV95ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Pzs Stock", "") );
      AV95ExcelDocument.Cells(1, 12, 1, 1).setText( " " );
      AV95ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV95ExcelDocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Fecha Hdr", "") );
      AV95ExcelDocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV95ExcelDocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV95ExcelDocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV95ExcelDocument.Cells(1, 18, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV95ExcelDocument.Cells(1, 19, 1, 1).setText( httpContext.getMessage( "Tc", "") );
      AV95ExcelDocument.Cells(1, 20, 1, 1).setText( httpContext.getMessage( "Kgs", "") );
      AV95ExcelDocument.Cells(1, 21, 1, 1).setText( httpContext.getMessage( "Mts", "") );
      AV95ExcelDocument.Cells(1, 22, 1, 1).setText( httpContext.getMessage( "Pzs", "") );
      AV95ExcelDocument.Cells(1, 23, 1, 1).setText( httpContext.getMessage( "Nº Albaran", "") );
      AV95ExcelDocument.Cells(1, 24, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV95ExcelDocument.Cells(1, 25, 1, 1).setText( httpContext.getMessage( "Kgs", "") );
      AV95ExcelDocument.Cells(1, 26, 1, 1).setText( httpContext.getMessage( "Mts", "") );
      AV95ExcelDocument.Cells(1, 27, 1, 1).setText( httpContext.getMessage( "Pzs", "") );
      AV98Row = (short)(2) ;
      AV83PAlbRest = (byte)(0) ;
      AV84UALbRest = (byte)(1) ;
      if ( GXutil.strcmp(AV82Estado_a, "0") == 0 )
      {
         AV83PAlbRest = (byte)(0) ;
         AV84UALbRest = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV82Estado_a, "1") == 0 )
      {
         AV83PAlbRest = (byte)(1) ;
         AV84UALbRest = (byte)(1) ;
      }
      /* Using cursor P08532 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11PCliente), AV13PFecha, AV14UFecha, AV32ALbRef_i, AV33AlbRef_f, AV66Albrenti, AV67Albrentf, Short.valueOf(AV80Tipartcod1), Short.valueOf(AV81Tipartcod2), Short.valueOf(AV210Tipentcod), Short.valueOf(AV210Tipentcod), AV119AlbRReo, AV119AlbRReo, Byte.valueOf(AV83PAlbRest), Byte.valueOf(AV84UALbRest), Integer.valueOf(AV12UCliente)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A47AlbREst = P08532_A47AlbREst[0] ;
         A55AlbRReo = P08532_A55AlbRReo[0] ;
         A1211TipEntCod = P08532_A1211TipEntCod[0] ;
         n1211TipEntCod = P08532_n1211TipEntCod[0] ;
         A6263AlbRTartC = P08532_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08532_n6263AlbRTartC[0] ;
         A46AlbREnt = P08532_A46AlbREnt[0] ;
         A45AlbRef = P08532_A45AlbRef[0] ;
         A252CliCod = P08532_A252CliCod[0] ;
         A49AlbRFen = P08532_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08532_A5806AlbREnt2[0] ;
         A279CliNom = P08532_A279CliNom[0] ;
         A6463AlbRLote = P08532_A6463AlbRLote[0] ;
         A56AlbRUni = P08532_A56AlbRUni[0] ;
         A44AlbRecCod = P08532_A44AlbRecCod[0] ;
         A54AlbRPieUti = P08532_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P08532_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P08532_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P08532_A58AlbRUniEnt[0] ;
         A279CliNom = P08532_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV112AlbRent2 = ((GXutil.strcmp(A5806AlbREnt2, " ")==0) ? A46AlbREnt : A5806AlbREnt2) ;
         AV106ALbReccod = A44AlbRecCod ;
         AV17CliCod = A252CliCod ;
         AV140CliNom = A279CliNom ;
         AV115albrfen = A49AlbRFen ;
         AV116AlbRlote = A6463AlbRLote ;
         AV122AlbRUniEnt = A58AlbRUniEnt ;
         AV118AlbRPieEnt = A52AlbRPieEnt ;
         AV120AlbRUni = A56AlbRUni ;
         AV121AlbRUniDis = A57AlbRUniDis ;
         AV117AlbRPieDis = A51AlbRPieDis ;
         /* Execute user subroutine: 'BARPIE' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV95ExcelDocument.Save();
      if ( AV95ExcelDocument.getErrCode() != 0 )
      {
         AV96Filename = "" ;
         AV94ErrorMessage = AV95ExcelDocument.getErrDescription() ;
         AV95ExcelDocument.Close();
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV95ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      AV197t = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV198tab_Hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV201tab_recep[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV202tab_st[GX_I-1] = (byte)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV199tab_kg[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV200tab_mt[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV163Kgsacum = DecimalUtil.doubleToDec(0) ;
      AV175Mtsacum = DecimalUtil.doubleToDec(0) ;
      AV191Pzsasumar = 0 ;
      AV190Pzasacum = 0 ;
      AV164Kgsasumar = DecimalUtil.doubleToDec(0) ;
      AV176Mtsasumar = DecimalUtil.doubleToDec(0) ;
      AV236GXLvl132 = (byte)(0) ;
      /* Using cursor P08533 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV106ALbReccod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8533 = false ;
         A205BarPieMet = P08533_A205BarPieMet[0] ;
         A1501BarPiePie = P08533_A1501BarPiePie[0] ;
         A365DisDes = P08533_A365DisDes[0] ;
         A200BarPieCod = P08533_A200BarPieCod[0] ;
         A44AlbRecCod = P08533_A44AlbRecCod[0] ;
         A203BarPieKil = P08533_A203BarPieKil[0] ;
         A146BarEst = P08533_A146BarEst[0] ;
         A159BarFecGen = P08533_A159BarFecGen[0] ;
         A212BarSer = P08533_A212BarSer[0] ;
         A1652BarSerDsc = P08533_A1652BarSerDsc[0] ;
         A135BarColNom = P08533_A135BarColNom[0] ;
         A136BarColNum = P08533_A136BarColNum[0] ;
         A218BarTipCol = P08533_A218BarTipCol[0] ;
         A130BarCodPar = P08533_A130BarCodPar[0] ;
         A132BarCodReo = P08533_A132BarCodReo[0] ;
         A129BarCod = P08533_A129BarCod[0] ;
         A365DisDes = P08533_A365DisDes[0] ;
         A146BarEst = P08533_A146BarEst[0] ;
         A159BarFecGen = P08533_A159BarFecGen[0] ;
         A212BarSer = P08533_A212BarSer[0] ;
         A1652BarSerDsc = P08533_A1652BarSerDsc[0] ;
         A135BarColNom = P08533_A135BarColNom[0] ;
         A136BarColNum = P08533_A136BarColNum[0] ;
         A218BarTipCol = P08533_A218BarTipCol[0] ;
         AV236GXLvl132 = (byte)(1) ;
         while ( (pr_default.getStatus(1) != 101) && ( P08533_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(P08533_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8533 = false ;
            A205BarPieMet = P08533_A205BarPieMet[0] ;
            A1501BarPiePie = P08533_A1501BarPiePie[0] ;
            A365DisDes = P08533_A365DisDes[0] ;
            A200BarPieCod = P08533_A200BarPieCod[0] ;
            A203BarPieKil = P08533_A203BarPieKil[0] ;
            A146BarEst = P08533_A146BarEst[0] ;
            A159BarFecGen = P08533_A159BarFecGen[0] ;
            A212BarSer = P08533_A212BarSer[0] ;
            A1652BarSerDsc = P08533_A1652BarSerDsc[0] ;
            A135BarColNom = P08533_A135BarColNom[0] ;
            A136BarColNum = P08533_A136BarColNum[0] ;
            A218BarTipCol = P08533_A218BarTipCol[0] ;
            A130BarCodPar = P08533_A130BarCodPar[0] ;
            A132BarCodReo = P08533_A132BarCodReo[0] ;
            A129BarCod = P08533_A129BarCod[0] ;
            A365DisDes = P08533_A365DisDes[0] ;
            A146BarEst = P08533_A146BarEst[0] ;
            A159BarFecGen = P08533_A159BarFecGen[0] ;
            A212BarSer = P08533_A212BarSer[0] ;
            A1652BarSerDsc = P08533_A1652BarSerDsc[0] ;
            A135BarColNom = P08533_A135BarColNom[0] ;
            A136BarColNum = P08533_A136BarColNum[0] ;
            A218BarTipCol = P08533_A218BarTipCol[0] ;
            AV162Kgs = DecimalUtil.doubleToDec(0) ;
            AV174Mts = DecimalUtil.doubleToDec(0) ;
            AV187piezas = 0 ;
            GX_I = 1 ;
            while ( GX_I <= 1000 )
            {
               AV205Tabpza[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 1000 )
            {
               AV203Tabkg[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 1000 )
            {
               AV204Tabmt[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV160i = (short)(1) ;
            while ( (pr_default.getStatus(1) != 101) && ( P08533_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(P08533_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08533_A129BarCod[0] == A129BarCod ) && ( P08533_A132BarCodReo[0] == A132BarCodReo ) )
            {
               if ( ! ( ( GXutil.strcmp(P08533_A130BarCodPar[0], A130BarCodPar) == 0 ) ) )
               {
                  if (true) break;
               }
               brk8533 = false ;
               A205BarPieMet = P08533_A205BarPieMet[0] ;
               A1501BarPiePie = P08533_A1501BarPiePie[0] ;
               A365DisDes = P08533_A365DisDes[0] ;
               A200BarPieCod = P08533_A200BarPieCod[0] ;
               A203BarPieKil = P08533_A203BarPieKil[0] ;
               A365DisDes = P08533_A365DisDes[0] ;
               if ( AV129Artextil == 0 )
               {
                  AV162Kgs = AV162Kgs.add(A203BarPieKil) ;
                  AV174Mts = AV174Mts.add(A205BarPieMet) ;
                  AV187piezas = (int)(AV187piezas+(((GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", ""))==0) ? 1 : A1501BarPiePie))) ;
               }
               else
               {
                  AV107AlbRecPie = A200BarPieCod ;
                  /* Execute user subroutine: 'PIEZAS_CRUDO' */
                  S125 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     pr_default.close(1);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV162Kgs = AV162Kgs.add(AV100AlbDetKgm) ;
                  AV174Mts = AV174Mts.add(AV101AlbDetMtr) ;
                  AV187piezas = (int)(AV187piezas+AV102AlbDetPie) ;
               }
               if ( AV160i <= 1000 )
               {
                  AV205Tabpza[AV160i-1] = A200BarPieCod ;
                  AV203Tabkg[AV160i-1] = A203BarPieKil ;
                  AV204Tabmt[AV160i-1] = A205BarPieMet ;
               }
               AV160i = (short)(AV160i+1) ;
               brk8533 = true ;
               pr_default.readNext(1);
            }
            AV157Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV77Barcod = A129BarCod ;
            AV78Barcodreo = A132BarCodReo ;
            AV79barcodpar = A130BarCodPar ;
            /* Execute user subroutine: 'ALBBAR' */
            S134 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            AV95ExcelDocument.Cells(AV98Row, 1, 1, 1).setNumber( AV17CliCod );
            AV95ExcelDocument.Cells(AV98Row, 2, 1, 1).setText( AV140CliNom );
            AV95ExcelDocument.Cells(AV98Row, 3, 1, 1).setNumber( AV106ALbReccod );
            GXt_dtime6 = GXutil.resetTime( AV115albrfen );
            AV95ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV95ExcelDocument.Cells(AV98Row, 4, 1, 1).setDate( GXt_dtime6 );
            AV95ExcelDocument.Cells(AV98Row, 5, 1, 1).setText( AV112AlbRent2 );
            AV95ExcelDocument.Cells(AV98Row, 6, 1, 1).setText( AV116AlbRlote );
            AV95ExcelDocument.Cells(AV98Row, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV122AlbRUniEnt)) );
            AV95ExcelDocument.Cells(AV98Row, 8, 1, 1).setNumber( AV118AlbRPieEnt );
            AV95ExcelDocument.Cells(AV98Row, 9, 1, 1).setText( AV120AlbRUni );
            AV164Kgsasumar = ((A146BarEst==1) ? DecimalUtil.doubleToDec(0) : AV162Kgs) ;
            AV176Mtsasumar = ((A146BarEst==1) ? DecimalUtil.doubleToDec(0) : AV174Mts) ;
            AV191Pzsasumar = ((A146BarEst==1) ? 0 : AV187piezas) ;
            AV121AlbRUniDis = ((GXutil.strcmp(AV120AlbRUni, httpContext.getMessage( "K", ""))==0) ? AV122AlbRUniEnt.subtract((AV162Kgs.add(AV163Kgsacum))) : AV122AlbRUniEnt.subtract((AV174Mts.add(AV175Mtsacum)))) ;
            AV121AlbRUniDis = ((AV121AlbRUniDis.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV121AlbRUniDis) ;
            AV117AlbRPieDis = (int)(AV118AlbRPieEnt-(AV187piezas+AV190Pzasacum)) ;
            AV117AlbRPieDis = ((AV117AlbRPieDis<0) ? 0 : AV117AlbRPieDis) ;
            AV95ExcelDocument.Cells(AV98Row, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121AlbRUniDis)) );
            AV95ExcelDocument.Cells(AV98Row, 11, 1, 1).setNumber( AV117AlbRPieDis );
            AV196Stki = ((A146BarEst==1) ? httpContext.getMessage( "Stki", "") : "") ;
            AV95ExcelDocument.Cells(AV98Row, 12, 1, 1).setText( AV196Stki );
            AV95ExcelDocument.Cells(AV98Row, 13, 1, 1).setText( AV157Hdr );
            GXt_dtime6 = GXutil.resetTime( A159BarFecGen );
            AV95ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV95ExcelDocument.Cells(AV98Row, 14, 1, 1).setDate( GXt_dtime6 );
            AV95ExcelDocument.Cells(AV98Row, 15, 1, 1).setText( A212BarSer );
            AV95ExcelDocument.Cells(AV98Row, 16, 1, 1).setText( A1652BarSerDsc );
            AV95ExcelDocument.Cells(AV98Row, 17, 1, 1).setText( A135BarColNom );
            AV95ExcelDocument.Cells(AV98Row, 18, 1, 1).setNumber( A136BarColNum );
            AV95ExcelDocument.Cells(AV98Row, 19, 1, 1).setNumber( A218BarTipCol );
            AV95ExcelDocument.Cells(AV98Row, 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV162Kgs)) );
            AV95ExcelDocument.Cells(AV98Row, 21, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV174Mts)) );
            AV95ExcelDocument.Cells(AV98Row, 22, 1, 1).setNumber( AV187piezas );
            AV95ExcelDocument.Cells(AV98Row, 23, 1, 1).setNumber( AV75ALbprocod );
            GXt_dtime6 = GXutil.resetTime( AV76Albprofch );
            AV95ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV95ExcelDocument.Cells(AV98Row, 24, 1, 1).setDate( GXt_dtime6 );
            AV95ExcelDocument.Cells(AV98Row, 25, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV165Kgse)) );
            AV95ExcelDocument.Cells(AV98Row, 26, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV177Mtse)) );
            AV95ExcelDocument.Cells(AV98Row, 27, 1, 1).setNumber( AV192pzse );
            AV163Kgsacum = AV163Kgsacum.add(AV164Kgsasumar) ;
            AV175Mtsacum = AV175Mtsacum.add(AV176Mtsasumar) ;
            AV190Pzasacum = (int)(AV190Pzasacum+AV191Pzsasumar) ;
            if ( AV146detalle == 1 )
            {
               AV160i = (short)(1) ;
               while ( AV160i <= 1000 )
               {
                  if ( GXutil.strcmp(AV205Tabpza[AV160i-1], "") == 0 )
                  {
                     if (true) break;
                  }
                  AV134BarPiecod = AV205Tabpza[AV160i-1] ;
                  AV135BarPiekil = AV203Tabkg[AV160i-1] ;
                  AV136barpiemet = AV204Tabmt[AV160i-1] ;
                  AV95ExcelDocument.Cells(AV98Row, 28, 1, 1).setText( AV134BarPiecod );
                  AV95ExcelDocument.Cells(AV98Row, 29, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV135BarPiekil)) );
                  AV95ExcelDocument.Cells(AV98Row, 30, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV136barpiemet)) );
                  if ( AV125Anahuac == 1 )
                  {
                     GXv_int5[0] = AV159hrTej ;
                     new app.pvxrohrtej(remoteHandle, context).execute( AV134BarPiecod, GXv_int5) ;
                     xlsrem0005.this.AV159hrTej = GXv_int5[0] ;
                     GXv_int5[0] = AV195RolloMadre ;
                     new app.pvxroromadre(remoteHandle, context).execute( AV134BarPiecod, GXv_int5) ;
                     xlsrem0005.this.AV195RolloMadre = GXv_int5[0] ;
                     GXv_char1[0] = AV170LoteLo ;
                     GXv_char7[0] = AV169LoDsc ;
                     new app.pvxrohrlot(remoteHandle, context).execute( AV134BarPiecod, GXv_char1, GXv_char7) ;
                     xlsrem0005.this.AV170LoteLo = GXv_char1[0] ;
                     xlsrem0005.this.AV169LoDsc = GXv_char7[0] ;
                     AV95ExcelDocument.Cells(AV98Row, 31, 1, 1).setNumber( AV159hrTej );
                     AV95ExcelDocument.Cells(AV98Row, 32, 1, 1).setNumber( AV195RolloMadre );
                     AV95ExcelDocument.Cells(AV98Row, 33, 1, 1).setText( AV170LoteLo );
                     AV95ExcelDocument.Cells(AV98Row, 34, 1, 1).setText( AV169LoDsc );
                  }
                  AV160i = (short)(AV160i+1) ;
                  AV98Row = (short)(AV98Row+1) ;
               }
            }
            else
            {
               AV98Row = (short)(AV98Row+1) ;
            }
            if ( ! brk8533 )
            {
               brk8533 = true ;
               pr_default.readNext(1);
            }
         }
         if ( ! brk8533 )
         {
            brk8533 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      if ( AV236GXLvl132 == 0 )
      {
         AV95ExcelDocument.Cells(AV98Row, 1, 1, 1).setNumber( AV17CliCod );
         AV95ExcelDocument.Cells(AV98Row, 2, 1, 1).setText( AV140CliNom );
         AV95ExcelDocument.Cells(AV98Row, 3, 1, 1).setNumber( AV106ALbReccod );
         GXt_dtime6 = GXutil.resetTime( AV115albrfen );
         AV95ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV95ExcelDocument.Cells(AV98Row, 4, 1, 1).setDate( GXt_dtime6 );
         AV95ExcelDocument.Cells(AV98Row, 5, 1, 1).setText( AV112AlbRent2 );
         AV95ExcelDocument.Cells(AV98Row, 6, 1, 1).setText( AV116AlbRlote );
         AV95ExcelDocument.Cells(AV98Row, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV122AlbRUniEnt)) );
         AV95ExcelDocument.Cells(AV98Row, 8, 1, 1).setNumber( AV118AlbRPieEnt );
         AV95ExcelDocument.Cells(AV98Row, 9, 1, 1).setText( AV120AlbRUni );
         AV164Kgsasumar = ((A146BarEst==1) ? DecimalUtil.doubleToDec(0) : AV162Kgs) ;
         AV176Mtsasumar = ((A146BarEst==1) ? DecimalUtil.doubleToDec(0) : AV174Mts) ;
         AV191Pzsasumar = ((A146BarEst==1) ? 0 : AV187piezas) ;
         AV121AlbRUniDis = ((GXutil.strcmp(AV120AlbRUni, httpContext.getMessage( "K", ""))==0) ? AV122AlbRUniEnt.subtract((AV162Kgs.add(AV163Kgsacum))) : AV122AlbRUniEnt.subtract((AV174Mts.add(AV175Mtsacum)))) ;
         AV121AlbRUniDis = ((AV121AlbRUniDis.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV121AlbRUniDis) ;
         AV117AlbRPieDis = (int)(AV118AlbRPieEnt-(AV187piezas+AV190Pzasacum)) ;
         AV117AlbRPieDis = ((AV117AlbRPieDis<0) ? 0 : AV117AlbRPieDis) ;
         AV95ExcelDocument.Cells(AV98Row, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121AlbRUniDis)) );
         AV95ExcelDocument.Cells(AV98Row, 11, 1, 1).setNumber( AV117AlbRPieDis );
         AV98Row = (short)(AV98Row+1) ;
      }
   }

   public void S134( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV75ALbprocod = 0 ;
      AV76Albprofch = GXutil.nullDate() ;
      AV165Kgse = DecimalUtil.doubleToDec(0) ;
      AV177Mtse = DecimalUtil.doubleToDec(0) ;
      AV192pzse = 0 ;
      /* Using cursor P08534 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), AV79barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P08534_A130BarCodPar[0] ;
         A132BarCodReo = P08534_A132BarCodReo[0] ;
         A129BarCod = P08534_A129BarCod[0] ;
         A30AlbProCod = P08534_A30AlbProCod[0] ;
         A34AlbProfch = P08534_A34AlbProfch[0] ;
         A1261BarAlbKgmE = P08534_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P08534_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P08534_A1265BarAlbPie[0] ;
         A34AlbProfch = P08534_A34AlbProfch[0] ;
         AV75ALbprocod = A30AlbProCod ;
         AV76Albprofch = A34AlbProfch ;
         AV165Kgse = AV165Kgse.add(A1261BarAlbKgmE) ;
         AV177Mtse = AV177Mtse.add(A1263BarAlbMtrE) ;
         AV192pzse = (int)(AV192pzse+A1265BarAlbPie) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S125( )
   {
      /* 'PIEZAS_CRUDO' Routine */
      returnInSub = false ;
      AV100AlbDetKgm = DecimalUtil.doubleToDec(0) ;
      AV101AlbDetMtr = DecimalUtil.doubleToDec(0) ;
      AV102AlbDetPie = (short)(0) ;
      /* Using cursor P08535 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV106ALbReccod), AV107AlbRecPie});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2159AlbRecPie = P08535_A2159AlbRecPie[0] ;
         A44AlbRecCod = P08535_A44AlbRecCod[0] ;
         A2155AlbRecKgm = P08535_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = P08535_A2157AlbRecMtr[0] ;
         AV100AlbDetKgm = A2155AlbRecKgm ;
         AV101AlbDetMtr = A2157AlbRecMtr ;
         AV102AlbDetPie = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = xlsrem0005.this.A396EmprCod;
      this.aP1[0] = xlsrem0005.this.AV9ImpCod;
      this.aP2[0] = xlsrem0005.this.AV11PCliente;
      this.aP3[0] = xlsrem0005.this.AV12UCliente;
      this.aP4[0] = xlsrem0005.this.AV13PFecha;
      this.aP5[0] = xlsrem0005.this.AV14UFecha;
      this.aP6[0] = xlsrem0005.this.AV32ALbRef_i;
      this.aP7[0] = xlsrem0005.this.AV33AlbRef_f;
      this.aP8[0] = xlsrem0005.this.AV66Albrenti;
      this.aP9[0] = xlsrem0005.this.AV67Albrentf;
      this.aP10[0] = xlsrem0005.this.AV210Tipentcod;
      this.aP11[0] = xlsrem0005.this.AV80Tipartcod1;
      this.aP12[0] = xlsrem0005.this.AV81Tipartcod2;
      this.aP13[0] = xlsrem0005.this.AV149Enc20c;
      this.aP14[0] = xlsrem0005.this.AV183Palb;
      this.aP15[0] = xlsrem0005.this.AV226UAlb;
      this.aP16[0] = xlsrem0005.this.AV119AlbRReo;
      this.aP17[0] = xlsrem0005.this.AV82Estado_a;
      this.aP18[0] = xlsrem0005.this.AV146detalle;
      this.aP19[0] = xlsrem0005.this.AV96Filename;
      this.aP20[0] = xlsrem0005.this.AV94ErrorMessage;
      CloseOpenCursors();
      AV95ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31ContDsc = "" ;
      GXv_int3 = new byte[1] ;
      AV234Pgmdesc = "" ;
      AV95ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P08532_A396EmprCod = new String[] {""} ;
      P08532_A47AlbREst = new byte[1] ;
      P08532_A55AlbRReo = new String[] {""} ;
      P08532_A1211TipEntCod = new short[1] ;
      P08532_n1211TipEntCod = new boolean[] {false} ;
      P08532_A6263AlbRTartC = new short[1] ;
      P08532_n6263AlbRTartC = new boolean[] {false} ;
      P08532_A46AlbREnt = new String[] {""} ;
      P08532_A45AlbRef = new String[] {""} ;
      P08532_A252CliCod = new int[1] ;
      P08532_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08532_A5806AlbREnt2 = new String[] {""} ;
      P08532_A279CliNom = new String[] {""} ;
      P08532_A6463AlbRLote = new String[] {""} ;
      P08532_A56AlbRUni = new String[] {""} ;
      P08532_A44AlbRecCod = new int[1] ;
      P08532_A54AlbRPieUti = new int[1] ;
      P08532_A52AlbRPieEnt = new int[1] ;
      P08532_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08532_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A55AlbRReo = "" ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A5806AlbREnt2 = "" ;
      A279CliNom = "" ;
      A6463AlbRLote = "" ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV112AlbRent2 = "" ;
      AV140CliNom = "" ;
      AV115albrfen = GXutil.nullDate() ;
      AV116AlbRlote = "" ;
      AV122AlbRUniEnt = DecimalUtil.ZERO ;
      AV120AlbRUni = "" ;
      AV121AlbRUniDis = DecimalUtil.ZERO ;
      AV198tab_Hdr = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV198tab_Hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV201tab_recep = new int[1000] ;
      AV202tab_st = new byte[1000] ;
      AV199tab_kg = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV199tab_kg[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV200tab_mt = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV200tab_mt[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV163Kgsacum = DecimalUtil.ZERO ;
      AV175Mtsacum = DecimalUtil.ZERO ;
      AV164Kgsasumar = DecimalUtil.ZERO ;
      AV176Mtsasumar = DecimalUtil.ZERO ;
      P08533_A396EmprCod = new String[] {""} ;
      P08533_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08533_A1501BarPiePie = new int[1] ;
      P08533_A365DisDes = new String[] {""} ;
      P08533_A200BarPieCod = new String[] {""} ;
      P08533_A44AlbRecCod = new int[1] ;
      P08533_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08533_A146BarEst = new byte[1] ;
      P08533_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08533_A212BarSer = new String[] {""} ;
      P08533_A1652BarSerDsc = new String[] {""} ;
      P08533_A135BarColNom = new String[] {""} ;
      P08533_A136BarColNum = new int[1] ;
      P08533_A218BarTipCol = new byte[1] ;
      P08533_A130BarCodPar = new String[] {""} ;
      P08533_A132BarCodReo = new byte[1] ;
      P08533_A129BarCod = new int[1] ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A130BarCodPar = "" ;
      AV162Kgs = DecimalUtil.ZERO ;
      AV174Mts = DecimalUtil.ZERO ;
      AV205Tabpza = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV205Tabpza[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV203Tabkg = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV203Tabkg[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV204Tabmt = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV204Tabmt[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV107AlbRecPie = "" ;
      AV100AlbDetKgm = DecimalUtil.ZERO ;
      AV101AlbDetMtr = DecimalUtil.ZERO ;
      AV157Hdr = "" ;
      AV79barcodpar = "" ;
      AV196Stki = "" ;
      AV76Albprofch = GXutil.nullDate() ;
      AV165Kgse = DecimalUtil.ZERO ;
      AV177Mtse = DecimalUtil.ZERO ;
      AV134BarPiecod = "" ;
      AV135BarPiekil = DecimalUtil.ZERO ;
      AV136barpiemet = DecimalUtil.ZERO ;
      GXv_int5 = new int[1] ;
      AV170LoteLo = "" ;
      GXv_char1 = new String[1] ;
      AV169LoDsc = "" ;
      GXv_char7 = new String[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      P08534_A396EmprCod = new String[] {""} ;
      P08534_A130BarCodPar = new String[] {""} ;
      P08534_A132BarCodReo = new byte[1] ;
      P08534_A129BarCod = new int[1] ;
      P08534_A30AlbProCod = new long[1] ;
      P08534_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08534_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08534_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08534_A1265BarAlbPie = new int[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P08535_A396EmprCod = new String[] {""} ;
      P08535_A2159AlbRecPie = new String[] {""} ;
      P08535_A44AlbRecCod = new int[1] ;
      P08535_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08535_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.xlsrem0005__default(),
         new Object[] {
             new Object[] {
            P08532_A396EmprCod, P08532_A47AlbREst, P08532_A55AlbRReo, P08532_A1211TipEntCod, P08532_n1211TipEntCod, P08532_A6263AlbRTartC, P08532_n6263AlbRTartC, P08532_A46AlbREnt, P08532_A45AlbRef, P08532_A252CliCod,
            P08532_A49AlbRFen, P08532_A5806AlbREnt2, P08532_A279CliNom, P08532_A6463AlbRLote, P08532_A56AlbRUni, P08532_A44AlbRecCod, P08532_A54AlbRPieUti, P08532_A52AlbRPieEnt, P08532_A60AlbRUniUti, P08532_A58AlbRUniEnt
            }
            , new Object[] {
            P08533_A396EmprCod, P08533_A205BarPieMet, P08533_A1501BarPiePie, P08533_A365DisDes, P08533_A200BarPieCod, P08533_A44AlbRecCod, P08533_A203BarPieKil, P08533_A146BarEst, P08533_A159BarFecGen, P08533_A212BarSer,
            P08533_A1652BarSerDsc, P08533_A135BarColNom, P08533_A136BarColNum, P08533_A218BarTipCol, P08533_A130BarCodPar, P08533_A132BarCodReo, P08533_A129BarCod
            }
            , new Object[] {
            P08534_A396EmprCod, P08534_A130BarCodPar, P08534_A132BarCodReo, P08534_A129BarCod, P08534_A30AlbProCod, P08534_A34AlbProfch, P08534_A1261BarAlbKgmE, P08534_A1263BarAlbMtrE, P08534_A1265BarAlbPie
            }
            , new Object[] {
            P08535_A396EmprCod, P08535_A2159AlbRecPie, P08535_A44AlbRecCod, P08535_A2155AlbRecKgm, P08535_A2157AlbRecMtr
            }
         }
      );
      AV234Pgmdesc = httpContext.getMessage( "Listado Entradas Distribucion por Hdr", "") ;
      /* GeneXus formulas. */
      AV234Pgmdesc = httpContext.getMessage( "Listado Entradas Distribucion por Hdr", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV149Enc20c ;
   private byte AV146detalle ;
   private byte AV68Moda21 ;
   private byte AV69Cli350 ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private byte AV83PAlbRest ;
   private byte AV84UALbRest ;
   private byte A47AlbREst ;
   private byte A146BarEst ;
   private byte AV202tab_st[] ;
   private byte AV236GXLvl132 ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte AV129Artextil ;
   private byte AV78Barcodreo ;
   private byte AV125Anahuac ;
   private short AV210Tipentcod ;
   private short AV80Tipartcod1 ;
   private short AV81Tipartcod2 ;
   private short AV98Row ;
   private short AV93Col ;
   private short A1211TipEntCod ;
   private short A6263AlbRTartC ;
   private short AV197t ;
   private short AV160i ;
   private short AV102AlbDetPie ;
   private short Gx_err ;
   private int AV11PCliente ;
   private int AV12UCliente ;
   private int AV70ContVal ;
   private int GXt_int4 ;
   private int AV97Random ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int AV106ALbReccod ;
   private int AV17CliCod ;
   private int AV118AlbRPieEnt ;
   private int AV117AlbRPieDis ;
   private int GX_I ;
   private int AV201tab_recep[] ;
   private int AV191Pzsasumar ;
   private int AV190Pzasacum ;
   private int A1501BarPiePie ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV187piezas ;
   private int AV77Barcod ;
   private int AV192pzse ;
   private int AV159hrTej ;
   private int AV195RolloMadre ;
   private int GXv_int5[] ;
   private int A1265BarAlbPie ;
   private long AV75ALbprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV122AlbRUniEnt ;
   private java.math.BigDecimal AV121AlbRUniDis ;
   private java.math.BigDecimal AV199tab_kg[] ;
   private java.math.BigDecimal AV200tab_mt[] ;
   private java.math.BigDecimal AV163Kgsacum ;
   private java.math.BigDecimal AV175Mtsacum ;
   private java.math.BigDecimal AV164Kgsasumar ;
   private java.math.BigDecimal AV176Mtsasumar ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV162Kgs ;
   private java.math.BigDecimal AV174Mts ;
   private java.math.BigDecimal AV203Tabkg[] ;
   private java.math.BigDecimal AV204Tabmt[] ;
   private java.math.BigDecimal AV100AlbDetKgm ;
   private java.math.BigDecimal AV101AlbDetMtr ;
   private java.math.BigDecimal AV165Kgse ;
   private java.math.BigDecimal AV177Mtse ;
   private java.math.BigDecimal AV135BarPiekil ;
   private java.math.BigDecimal AV136barpiemet ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private String A396EmprCod ;
   private String AV9ImpCod ;
   private String AV32ALbRef_i ;
   private String AV33AlbRef_f ;
   private String AV66Albrenti ;
   private String AV67Albrentf ;
   private String AV183Palb ;
   private String AV226UAlb ;
   private String AV119AlbRReo ;
   private String AV82Estado_a ;
   private String AV31ContDsc ;
   private String AV234Pgmdesc ;
   private String scmdbuf ;
   private String A55AlbRReo ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A5806AlbREnt2 ;
   private String A279CliNom ;
   private String A6463AlbRLote ;
   private String A56AlbRUni ;
   private String AV112AlbRent2 ;
   private String AV140CliNom ;
   private String AV116AlbRlote ;
   private String AV120AlbRUni ;
   private String AV198tab_Hdr[] ;
   private String A365DisDes ;
   private String A200BarPieCod ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A130BarCodPar ;
   private String AV205Tabpza[] ;
   private String AV107AlbRecPie ;
   private String AV157Hdr ;
   private String AV79barcodpar ;
   private String AV196Stki ;
   private String AV134BarPiecod ;
   private String AV170LoteLo ;
   private String GXv_char1[] ;
   private String AV169LoDsc ;
   private String GXv_char7[] ;
   private String A2159AlbRecPie ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV13PFecha ;
   private java.util.Date AV14UFecha ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV115albrfen ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV76Albprofch ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private boolean brk8533 ;
   private String AV96Filename ;
   private String AV94ErrorMessage ;
   private String[] aP20 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private byte[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private byte[] aP18 ;
   private String[] aP19 ;
   private IDataStoreProvider pr_default ;
   private String[] P08532_A396EmprCod ;
   private byte[] P08532_A47AlbREst ;
   private String[] P08532_A55AlbRReo ;
   private short[] P08532_A1211TipEntCod ;
   private boolean[] P08532_n1211TipEntCod ;
   private short[] P08532_A6263AlbRTartC ;
   private boolean[] P08532_n6263AlbRTartC ;
   private String[] P08532_A46AlbREnt ;
   private String[] P08532_A45AlbRef ;
   private int[] P08532_A252CliCod ;
   private java.util.Date[] P08532_A49AlbRFen ;
   private String[] P08532_A5806AlbREnt2 ;
   private String[] P08532_A279CliNom ;
   private String[] P08532_A6463AlbRLote ;
   private String[] P08532_A56AlbRUni ;
   private int[] P08532_A44AlbRecCod ;
   private int[] P08532_A54AlbRPieUti ;
   private int[] P08532_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08532_A60AlbRUniUti ;
   private java.math.BigDecimal[] P08532_A58AlbRUniEnt ;
   private String[] P08533_A396EmprCod ;
   private java.math.BigDecimal[] P08533_A205BarPieMet ;
   private int[] P08533_A1501BarPiePie ;
   private String[] P08533_A365DisDes ;
   private String[] P08533_A200BarPieCod ;
   private int[] P08533_A44AlbRecCod ;
   private java.math.BigDecimal[] P08533_A203BarPieKil ;
   private byte[] P08533_A146BarEst ;
   private java.util.Date[] P08533_A159BarFecGen ;
   private String[] P08533_A212BarSer ;
   private String[] P08533_A1652BarSerDsc ;
   private String[] P08533_A135BarColNom ;
   private int[] P08533_A136BarColNum ;
   private byte[] P08533_A218BarTipCol ;
   private String[] P08533_A130BarCodPar ;
   private byte[] P08533_A132BarCodReo ;
   private int[] P08533_A129BarCod ;
   private String[] P08534_A396EmprCod ;
   private String[] P08534_A130BarCodPar ;
   private byte[] P08534_A132BarCodReo ;
   private int[] P08534_A129BarCod ;
   private long[] P08534_A30AlbProCod ;
   private java.util.Date[] P08534_A34AlbProfch ;
   private java.math.BigDecimal[] P08534_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P08534_A1263BarAlbMtrE ;
   private int[] P08534_A1265BarAlbPie ;
   private String[] P08535_A396EmprCod ;
   private String[] P08535_A2159AlbRecPie ;
   private int[] P08535_A44AlbRecCod ;
   private java.math.BigDecimal[] P08535_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P08535_A2157AlbRecMtr ;
   private com.genexus.gxoffice.ExcelDoc AV95ExcelDocument ;
}

final  class xlsrem0005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08532", "SELECT T1.EmprCod, T1.AlbREst, T1.AlbRReo, T1.TipEntCod, T1.AlbRTartC, T1.AlbREnt, T1.AlbRef, T1.CliCod, T1.AlbRFen, T1.AlbREnt2, T2.CliNom, T1.AlbRLote, T1.AlbRUni, T1.AlbRecCod, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ?) AND (T1.AlbRFen >= ? and T1.AlbRFen <= ?) AND (T1.AlbRef >= ? and T1.AlbRef <= ?) AND (T1.AlbREnt >= ? and T1.AlbREnt <= ?) AND (T1.AlbRTartC >= ?) AND (T1.AlbRTartC <= ?) AND (T1.TipEntCod <> 9999) AND (( T1.TipEntCod = ?) or (? = 0)) AND (T1.AlbRReo = ? or ? = '*') AND (T1.AlbREst >= ? and T1.AlbREst <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08533", "SELECT T1.EmprCod, T1.BarPieMet, T1.BarPiePie, T2.DisDes, T1.BarPieCod, T1.AlbRecCod, T1.BarPieKil, T2.BarEst, T2.BarFecGen, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08534", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.AlbProfch, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08535", "SELECT EmprCod, AlbRecPie, AlbRecCod, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((String[]) buf[13])[0] = rslt.getString(12, 20);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 2);
               stmt.setString(14, (String)parms[13], 2);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

