package app.costesbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class costesbasicos_fases_ficha_export extends GXProcedure
{
   public costesbasicos_fases_ficha_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesbasicos_fases_ficha_export.class ), "" );
   }

   public costesbasicos_fases_ficha_export( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             int aP10 ,
                             java.math.BigDecimal aP11 ,
                             java.math.BigDecimal aP12 ,
                             java.math.BigDecimal aP13 ,
                             byte aP14 ,
                             java.math.BigDecimal aP15 ,
                             java.math.BigDecimal aP16 ,
                             java.math.BigDecimal aP17 ,
                             java.math.BigDecimal aP18 ,
                             java.math.BigDecimal aP19 ,
                             java.math.BigDecimal aP20 ,
                             java.math.BigDecimal aP21 ,
                             java.math.BigDecimal aP22 ,
                             java.math.BigDecimal aP23 ,
                             String[] aP24 )
   {
      costesbasicos_fases_ficha_export.this.aP25 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25);
      return aP25[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        int aP10 ,
                        java.math.BigDecimal aP11 ,
                        java.math.BigDecimal aP12 ,
                        java.math.BigDecimal aP13 ,
                        byte aP14 ,
                        java.math.BigDecimal aP15 ,
                        java.math.BigDecimal aP16 ,
                        java.math.BigDecimal aP17 ,
                        java.math.BigDecimal aP18 ,
                        java.math.BigDecimal aP19 ,
                        java.math.BigDecimal aP20 ,
                        java.math.BigDecimal aP21 ,
                        java.math.BigDecimal aP22 ,
                        java.math.BigDecimal aP23 ,
                        String[] aP24 ,
                        String[] aP25 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             int aP10 ,
                             java.math.BigDecimal aP11 ,
                             java.math.BigDecimal aP12 ,
                             java.math.BigDecimal aP13 ,
                             byte aP14 ,
                             java.math.BigDecimal aP15 ,
                             java.math.BigDecimal aP16 ,
                             java.math.BigDecimal aP17 ,
                             java.math.BigDecimal aP18 ,
                             java.math.BigDecimal aP19 ,
                             java.math.BigDecimal aP20 ,
                             java.math.BigDecimal aP21 ,
                             java.math.BigDecimal aP22 ,
                             java.math.BigDecimal aP23 ,
                             String[] aP24 ,
                             String[] aP25 )
   {
      costesbasicos_fases_ficha_export.this.AV35Emprcod = aP0;
      costesbasicos_fases_ficha_export.this.AV36Barcod = aP1;
      costesbasicos_fases_ficha_export.this.AV37Barcodreo = aP2;
      costesbasicos_fases_ficha_export.this.AV38Barcodpar = aP3;
      costesbasicos_fases_ficha_export.this.AV42Station = aP4;
      costesbasicos_fases_ficha_export.this.AV47clicod = aP5;
      costesbasicos_fases_ficha_export.this.AV48Clinom = aP6;
      costesbasicos_fases_ficha_export.this.AV49barser = aP7;
      costesbasicos_fases_ficha_export.this.AV50barserdsc = aP8;
      costesbasicos_fases_ficha_export.this.AV51barcolnom = aP9;
      costesbasicos_fases_ficha_export.this.AV52Barcolnum = aP10;
      costesbasicos_fases_ficha_export.this.AV53barkgm = aP11;
      costesbasicos_fases_ficha_export.this.AV54Barmtr = aP12;
      costesbasicos_fases_ficha_export.this.AV96costefab2 = aP13;
      costesbasicos_fases_ficha_export.this.AV73reoperados = aP14;
      costesbasicos_fases_ficha_export.this.AV97mAgua = aP15;
      costesbasicos_fases_ficha_export.this.AV98menergia = aP16;
      costesbasicos_fases_ficha_export.this.AV99mgas = aP17;
      costesbasicos_fases_ficha_export.this.AV100mmod = aP18;
      costesbasicos_fases_ficha_export.this.AV101mmoi = aP19;
      costesbasicos_fases_ficha_export.this.AV102madc = aP20;
      costesbasicos_fases_ficha_export.this.AV103mam = aP21;
      costesbasicos_fases_ficha_export.this.AV104mgi = aP22;
      costesbasicos_fases_ficha_export.this.AV105costeoperario1 = aP23;
      costesbasicos_fases_ficha_export.this.aP24 = aP24;
      costesbasicos_fases_ficha_export.this.aP25 = aP25;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV46Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV35Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      costesbasicos_fases_ficha_export.this.GXt_int1 = GXv_int2[0] ;
      AV46Moda21 = GXt_int1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "CostesBasicos_Fases_Ficha_Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      /* Using cursor P0ATJ2 */
      pr_default.execute(0, new Object[] {AV35Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0ATJ2_A396EmprCod[0] ;
         A407EmprNom = P0ATJ2_A407EmprNom[0] ;
         n407EmprNom = P0ATJ2_n407EmprNom[0] ;
         AV43EmprNom = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV10ExcelDocument.Cells(1, 2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(1, 2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Informe Costes Estandars", "") );
      AV10ExcelDocument.Cells(1, 4, 1, 1).setText( GXutil.trim( AV43EmprNom) );
      AV13CellRow = 2 ;
      AV106CellCol = 1 ;
      while ( AV106CellCol <= 10 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV106CellCol, 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells(AV13CellRow, AV106CellCol, 1, 1).setColor( 11 );
         AV106CellCol = (int)(AV106CellCol+1) ;
      }
      AV10ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "N Hdr", "") );
      AV10ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV10ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV10ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV10ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV10ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV10ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Metros", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV13CellRow = 3 ;
      AV10ExcelDocument.Cells(AV13CellRow, 1, 1, 1).setText( GXutil.str( AV36Barcod, 8, 0)+"-"+GXutil.str( AV37Barcodreo, 1, 0)+AV38Barcodpar );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( AV48Clinom );
      AV10ExcelDocument.Cells(AV13CellRow, 3, 1, 1).setText( AV49barser );
      AV10ExcelDocument.Cells(AV13CellRow, 4, 1, 1).setText( AV50barserdsc );
      AV10ExcelDocument.Cells(AV13CellRow, 5, 1, 1).setText( AV51barcolnom );
      AV10ExcelDocument.Cells(AV13CellRow, 6, 1, 1).setNumber( AV52Barcolnum );
      AV10ExcelDocument.Cells(AV13CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53barkgm)) );
      AV10ExcelDocument.Cells(AV13CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54Barmtr)) );
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV13CellRow = 4 ;
      AV106CellCol = 1 ;
      while ( AV106CellCol <= 10 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV106CellCol, 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells(AV13CellRow, AV106CellCol, 1, 1).setColor( 11 );
         AV106CellCol = (int)(AV106CellCol+1) ;
      }
      AV10ExcelDocument.Cells(AV13CellRow, 1, 1, 1).setText( httpContext.getMessage( "Orden", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 3, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 5, 1, 1).setText( httpContext.getMessage( "Unidades", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 6, 1, 1).setText( " " );
      AV10ExcelDocument.Cells(AV13CellRow, 7, 1, 1).setText( httpContext.getMessage( "Total", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 8, 1, 1).setText( " " );
      AV10ExcelDocument.Cells(AV13CellRow, 9, 1, 1).setText( httpContext.getMessage( "TReal", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 10, 1, 1).setText( httpContext.getMessage( "Tteorico", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 11, 1, 1).setText( httpContext.getMessage( "Coste Mm", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 12, 1, 1).setText( httpContext.getMessage( "Coste Kg", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 13, 1, 1).setText( httpContext.getMessage( "Coste Real", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setText( httpContext.getMessage( "Coste Teo.", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 15, 1, 1).setText( httpContext.getMessage( "Tiempo(mm)", "") );
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV55Coste_f = DecimalUtil.doubleToDec(0) ;
      AV56Coste_fagua = DecimalUtil.doubleToDec(0) ;
      AV57Coste_fene = DecimalUtil.doubleToDec(0) ;
      AV58Coste_fgas = DecimalUtil.doubleToDec(0) ;
      AV59Coste_fmod = DecimalUtil.doubleToDec(0) ;
      AV60Coste_fmoi = DecimalUtil.doubleToDec(0) ;
      AV61Coste_teo = DecimalUtil.doubleToDec(0) ;
      AV62coste_foper = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ATJ3 */
      pr_default.execute(1, new Object[] {AV35Emprcod, Integer.valueOf(AV36Barcod), Byte.valueOf(AV37Barcodreo), AV38Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P0ATJ3_A130BarCodPar[0] ;
         A132BarCodReo = P0ATJ3_A132BarCodReo[0] ;
         A129BarCod = P0ATJ3_A129BarCod[0] ;
         A396EmprCod = P0ATJ3_A396EmprCod[0] ;
         A212BarSer = P0ATJ3_A212BarSer[0] ;
         A218BarTipCol = P0ATJ3_A218BarTipCol[0] ;
         A141BarCosPro = P0ATJ3_A141BarCosPro[0] ;
         A140BarCosAny = P0ATJ3_A140BarCosAny[0] ;
         A228BarUniMed = P0ATJ3_A228BarUniMed[0] ;
         AV63BarTipCol = A218BarTipCol ;
         AV64BarCosPro = A141BarCosPro ;
         AV65BarCosAny = A140BarCosAny ;
         AV66Valor = DecimalUtil.doubleToDec(0) ;
         AV67BarUniMed = A228BarUniMed ;
         /* Execute user subroutine: 'ALBBAR' */
         S153 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         AV68Valor_c = AV114Valor_cor.multiply(AV53barkgm) ;
         /* Using cursor P0ATJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = P0ATJ4_A457FasCod[0] ;
            A603MaqCodBis = P0ATJ4_A603MaqCodBis[0] ;
            A460FasDsc = P0ATJ4_A460FasDsc[0] ;
            A602MaqCod = P0ATJ4_A602MaqCod[0] ;
            n602MaqCod = P0ATJ4_n602MaqCod[0] ;
            A194BarOrdLin = P0ATJ4_A194BarOrdLin[0] ;
            A758ProCod = P0ATJ4_A758ProCod[0] ;
            A460FasDsc = P0ATJ4_A460FasDsc[0] ;
            A602MaqCod = P0ATJ4_A602MaqCod[0] ;
            n602MaqCod = P0ATJ4_n602MaqCod[0] ;
            AV69MaqCod = A603MaqCodBis ;
            GXt_char3 = AV70maqDsc ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char5[0] = AV69MaqCod ;
            GXv_char6[0] = GXt_char3 ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
            costesbasicos_fases_ficha_export.this.A396EmprCod = GXv_char4[0] ;
            costesbasicos_fases_ficha_export.this.AV69MaqCod = GXv_char5[0] ;
            costesbasicos_fases_ficha_export.this.GXt_char3 = GXv_char6[0] ;
            AV70maqDsc = GXt_char3 ;
            AV71MaqCosMin = DecimalUtil.ZERO ;
            GXv_decimal7[0] = AV71MaqCosMin ;
            GXv_decimal8[0] = AV74tteo ;
            GXv_decimal9[0] = AV75Coste_p_k ;
            GXv_char6[0] = AV76HorFin_5 ;
            GXv_char5[0] = AV77HorIni_5 ;
            GXv_decimal10[0] = AV78Coste_tm ;
            GXv_int11[0] = AV79teotixfi ;
            GXv_decimal12[0] = AV80TieTeo ;
            GXv_decimal13[0] = AV81Unidades ;
            GXv_decimal14[0] = AV82Unidadest ;
            GXv_decimal15[0] = AV83Coste_mam ;
            GXv_decimal16[0] = AV84Coste_madc ;
            GXv_decimal17[0] = AV85Coste_mgi ;
            GXv_decimal18[0] = AV86Coste_mmoi ;
            GXv_decimal19[0] = AV87Coste_mmod ;
            GXv_decimal20[0] = AV88Coste_mgas ;
            GXv_decimal21[0] = AV89Coste_menergia ;
            GXv_decimal22[0] = AV90Coste_mAgua ;
            GXv_decimal23[0] = AV91Coste_m ;
            GXv_decimal24[0] = AV92BarTieRea ;
            GXv_int25[0] = AV93Tiempo_m ;
            GXv_int2[0] = AV94Lhipro ;
            GXv_decimal26[0] = AV95costeoperario ;
            new app.costesbasicos.pcostesmaquina(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV72CosTiR, AV73reoperados, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_char6, GXv_char5, GXv_decimal10, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_decimal18, GXv_decimal19, GXv_decimal20, GXv_decimal21, GXv_decimal22, GXv_decimal23, GXv_decimal24, GXv_int25, GXv_int2, GXv_decimal26) ;
            costesbasicos_fases_ficha_export.this.AV71MaqCosMin = GXv_decimal7[0] ;
            costesbasicos_fases_ficha_export.this.AV74tteo = GXv_decimal8[0] ;
            costesbasicos_fases_ficha_export.this.AV75Coste_p_k = GXv_decimal9[0] ;
            costesbasicos_fases_ficha_export.this.AV76HorFin_5 = GXv_char6[0] ;
            costesbasicos_fases_ficha_export.this.AV77HorIni_5 = GXv_char5[0] ;
            costesbasicos_fases_ficha_export.this.AV78Coste_tm = GXv_decimal10[0] ;
            costesbasicos_fases_ficha_export.this.AV79teotixfi = GXv_int11[0] ;
            costesbasicos_fases_ficha_export.this.AV80TieTeo = GXv_decimal12[0] ;
            costesbasicos_fases_ficha_export.this.AV81Unidades = GXv_decimal13[0] ;
            costesbasicos_fases_ficha_export.this.AV82Unidadest = GXv_decimal14[0] ;
            costesbasicos_fases_ficha_export.this.AV83Coste_mam = GXv_decimal15[0] ;
            costesbasicos_fases_ficha_export.this.AV84Coste_madc = GXv_decimal16[0] ;
            costesbasicos_fases_ficha_export.this.AV85Coste_mgi = GXv_decimal17[0] ;
            costesbasicos_fases_ficha_export.this.AV86Coste_mmoi = GXv_decimal18[0] ;
            costesbasicos_fases_ficha_export.this.AV87Coste_mmod = GXv_decimal19[0] ;
            costesbasicos_fases_ficha_export.this.AV88Coste_mgas = GXv_decimal20[0] ;
            costesbasicos_fases_ficha_export.this.AV89Coste_menergia = GXv_decimal21[0] ;
            costesbasicos_fases_ficha_export.this.AV90Coste_mAgua = GXv_decimal22[0] ;
            costesbasicos_fases_ficha_export.this.AV91Coste_m = GXv_decimal23[0] ;
            costesbasicos_fases_ficha_export.this.AV92BarTieRea = GXv_decimal24[0] ;
            costesbasicos_fases_ficha_export.this.AV93Tiempo_m = GXv_int25[0] ;
            costesbasicos_fases_ficha_export.this.AV94Lhipro = GXv_int2[0] ;
            costesbasicos_fases_ficha_export.this.AV95costeoperario = GXv_decimal26[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, 1, 1, 1).setNumber( A194BarOrdLin );
            AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( A460FasDsc );
            AV10ExcelDocument.Cells(AV13CellRow, 3, 1, 1).setText( A602MaqCod );
            AV10ExcelDocument.Cells(AV13CellRow, 4, 1, 1).setText( AV70maqDsc );
            AV10ExcelDocument.Cells(AV13CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV81Unidades)) );
            AV10ExcelDocument.Cells(AV13CellRow, 6, 1, 1).setText( AV67BarUniMed );
            AV10ExcelDocument.Cells(AV13CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV82Unidadest)) );
            AV10ExcelDocument.Cells(AV13CellRow, 8, 1, 1).setText( AV67BarUniMed );
            AV10ExcelDocument.Cells(AV13CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV92BarTieRea)) );
            AV10ExcelDocument.Cells(AV13CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV80TieTeo)) );
            AV10ExcelDocument.Cells(AV13CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV71MaqCosMin)) );
            AV10ExcelDocument.Cells(AV13CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV75Coste_p_k)) );
            AV10ExcelDocument.Cells(AV13CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV91Coste_m)) );
            AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV78Coste_tm)) );
            AV10ExcelDocument.Cells(AV13CellRow, 15, 1, 1).setNumber( AV93Tiempo_m );
            AV13CellRow = (int)(AV13CellRow+1) ;
            if ( AV91Coste_m.doubleValue() > 0 )
            {
               AV55Coste_f = AV55Coste_f.add(AV91Coste_m) ;
               AV56Coste_fagua = AV56Coste_fagua.add(AV90Coste_mAgua) ;
               AV58Coste_fgas = AV58Coste_fgas.add(AV88Coste_mgas) ;
               AV57Coste_fene = AV57Coste_fene.add(AV89Coste_menergia) ;
               AV60Coste_fmoi = AV60Coste_fmoi.add(AV86Coste_mmoi) ;
               AV59Coste_fmod = AV59Coste_fmod.add(AV87Coste_mmod) ;
               AV107Coste_fgi = AV107Coste_fgi.add(AV85Coste_mgi) ;
               AV108Coste_fadc = AV108Coste_fadc.add(AV84Coste_madc) ;
               AV109Coste_fam = AV109Coste_fam.add(AV83Coste_mam) ;
               AV62coste_foper = AV62coste_foper.add(AV95costeoperario) ;
            }
            if ( AV78Coste_tm.doubleValue() > 0 )
            {
               AV61Coste_teo = AV61Coste_teo.add(AV78Coste_tm) ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV110Coste_p = A141BarCosPro.add(A140BarCosAny) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV111Coste_t = AV55Coste_f.add(AV110Coste_p) ;
      AV112Coste_tt = AV61Coste_teo.add(AV68Valor_c) ;
      AV113Margen = AV66Valor.subtract(AV111Coste_t) ;
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( httpContext.getMessage( "Total Costes Fabrica", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55Coste_f)) );
      AV13CellRow = (int)(AV13CellRow+1) ;
      if ( AV96costefab2.doubleValue() > 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setColor( 11 );
         AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( httpContext.getMessage( "Total Costes Fabrica 2", "") );
         AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV96costefab2)) );
         AV13CellRow = (int)(AV13CellRow+1) ;
      }
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( httpContext.getMessage( "Total Costes Productos", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV110Coste_p)) );
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( httpContext.getMessage( "Total Costes", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV111Coste_t)) );
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( httpContext.getMessage( "Total Fact Bruto", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66Valor)) );
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( httpContext.getMessage( "Margen", "") );
      AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV113Margen)) );
      AV13CellRow = (int)(AV13CellRow+1) ;
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S153( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV66Valor = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ATJ5 */
      pr_default.execute(3, new Object[] {AV35Emprcod, Integer.valueOf(AV36Barcod), Byte.valueOf(AV37Barcodreo), AV38Barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P0ATJ5_A130BarCodPar[0] ;
         A132BarCodReo = P0ATJ5_A132BarCodReo[0] ;
         A129BarCod = P0ATJ5_A129BarCod[0] ;
         A30AlbProCod = P0ATJ5_A30AlbProCod[0] ;
         A396EmprCod = P0ATJ5_A396EmprCod[0] ;
         A32AlbProEsp = P0ATJ5_A32AlbProEsp[0] ;
         A1264BarPreMtr = P0ATJ5_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P0ATJ5_A1263BarAlbMtrE[0] ;
         A1262BarPreKgm = P0ATJ5_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P0ATJ5_A1261BarAlbKgmE[0] ;
         AV66Valor = AV66Valor.add((GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 2).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 2)))) ;
         /* Using cursor P0ATJ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1242GuiFasPMt = P0ATJ6_A1242GuiFasPMt[0] ;
            A1276FasMtr = P0ATJ6_A1276FasMtr[0] ;
            A1241GuiFasPKg = P0ATJ6_A1241GuiFasPKg[0] ;
            A1275FasKgm = P0ATJ6_A1275FasKgm[0] ;
            A1240GuiFasLin = P0ATJ6_A1240GuiFasLin[0] ;
            AV66Valor = AV66Valor.add((GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)))) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV46Moda21 == 1 )
      {
         AV66Valor = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P0ATJ7 */
         pr_default.execute(5, new Object[] {AV35Emprcod, Integer.valueOf(AV36Barcod), Byte.valueOf(AV37Barcodreo), AV38Barcodpar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1296FacBarPar = P0ATJ7_A1296FacBarPar[0] ;
            A1295FacBarReo = P0ATJ7_A1295FacBarReo[0] ;
            A1294FacBarCod = P0ATJ7_A1294FacBarCod[0] ;
            A396EmprCod = P0ATJ7_A396EmprCod[0] ;
            A430FacCod = P0ATJ7_A430FacCod[0] ;
            A446FacLin = P0ATJ7_A446FacLin[0] ;
            AV115facbarcod = A1294FacBarCod ;
            AV116FacBarReo = A1295FacBarReo ;
            AV117FacBarPar = A1296FacBarPar ;
            GXv_char6[0] = AV35Emprcod ;
            GXv_int25[0] = A430FacCod ;
            GXv_int27[0] = AV115facbarcod ;
            GXv_int2[0] = AV116FacBarReo ;
            GXv_char5[0] = AV117FacBarPar ;
            GXv_decimal26[0] = AV66Valor ;
            new app.pm21totliquido(remoteHandle, context).execute( GXv_char6, GXv_int25, GXv_int27, GXv_int2, GXv_char5, GXv_decimal26) ;
            costesbasicos_fases_ficha_export.this.AV35Emprcod = GXv_char6[0] ;
            costesbasicos_fases_ficha_export.this.A430FacCod = GXv_int25[0] ;
            costesbasicos_fases_ficha_export.this.AV115facbarcod = GXv_int27[0] ;
            costesbasicos_fases_ficha_export.this.AV116FacBarReo = GXv_int2[0] ;
            costesbasicos_fases_ficha_export.this.AV117FacBarPar = GXv_char5[0] ;
            costesbasicos_fases_ficha_export.this.AV66Valor = GXv_decimal26[0] ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
   }

   protected void cleanup( )
   {
      this.aP24[0] = costesbasicos_fases_ficha_export.this.AV11Filename;
      this.aP25[0] = costesbasicos_fases_ficha_export.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P0ATJ2_A396EmprCod = new String[] {""} ;
      P0ATJ2_A407EmprNom = new String[] {""} ;
      P0ATJ2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV43EmprNom = "" ;
      AV55Coste_f = DecimalUtil.ZERO ;
      AV56Coste_fagua = DecimalUtil.ZERO ;
      AV57Coste_fene = DecimalUtil.ZERO ;
      AV58Coste_fgas = DecimalUtil.ZERO ;
      AV59Coste_fmod = DecimalUtil.ZERO ;
      AV60Coste_fmoi = DecimalUtil.ZERO ;
      AV61Coste_teo = DecimalUtil.ZERO ;
      AV62coste_foper = DecimalUtil.ZERO ;
      P0ATJ3_A130BarCodPar = new String[] {""} ;
      P0ATJ3_A132BarCodReo = new byte[1] ;
      P0ATJ3_A129BarCod = new int[1] ;
      P0ATJ3_A396EmprCod = new String[] {""} ;
      P0ATJ3_A212BarSer = new String[] {""} ;
      P0ATJ3_A218BarTipCol = new byte[1] ;
      P0ATJ3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ3_A228BarUniMed = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      AV64BarCosPro = DecimalUtil.ZERO ;
      AV65BarCosAny = DecimalUtil.ZERO ;
      AV66Valor = DecimalUtil.ZERO ;
      AV67BarUniMed = "" ;
      AV68Valor_c = DecimalUtil.ZERO ;
      AV114Valor_cor = DecimalUtil.ZERO ;
      P0ATJ4_A457FasCod = new String[] {""} ;
      P0ATJ4_A396EmprCod = new String[] {""} ;
      P0ATJ4_A129BarCod = new int[1] ;
      P0ATJ4_A132BarCodReo = new byte[1] ;
      P0ATJ4_A130BarCodPar = new String[] {""} ;
      P0ATJ4_A603MaqCodBis = new String[] {""} ;
      P0ATJ4_A460FasDsc = new String[] {""} ;
      P0ATJ4_A602MaqCod = new String[] {""} ;
      P0ATJ4_n602MaqCod = new boolean[] {false} ;
      P0ATJ4_A194BarOrdLin = new short[1] ;
      P0ATJ4_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A758ProCod = "" ;
      AV69MaqCod = "" ;
      AV70maqDsc = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV71MaqCosMin = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV74tteo = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV75Coste_p_k = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV76HorFin_5 = "" ;
      AV77HorIni_5 = "" ;
      AV78Coste_tm = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      AV80TieTeo = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV81Unidades = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV82Unidadest = DecimalUtil.ZERO ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      AV83Coste_mam = DecimalUtil.ZERO ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      AV84Coste_madc = DecimalUtil.ZERO ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      AV85Coste_mgi = DecimalUtil.ZERO ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      AV86Coste_mmoi = DecimalUtil.ZERO ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      AV87Coste_mmod = DecimalUtil.ZERO ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      AV88Coste_mgas = DecimalUtil.ZERO ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      AV89Coste_menergia = DecimalUtil.ZERO ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      AV90Coste_mAgua = DecimalUtil.ZERO ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      AV91Coste_m = DecimalUtil.ZERO ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      AV92BarTieRea = DecimalUtil.ZERO ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      AV95costeoperario = DecimalUtil.ZERO ;
      AV107Coste_fgi = DecimalUtil.ZERO ;
      AV108Coste_fadc = DecimalUtil.ZERO ;
      AV109Coste_fam = DecimalUtil.ZERO ;
      AV110Coste_p = DecimalUtil.ZERO ;
      AV111Coste_t = DecimalUtil.ZERO ;
      AV112Coste_tt = DecimalUtil.ZERO ;
      AV113Margen = DecimalUtil.ZERO ;
      P0ATJ5_A130BarCodPar = new String[] {""} ;
      P0ATJ5_A132BarCodReo = new byte[1] ;
      P0ATJ5_A129BarCod = new int[1] ;
      P0ATJ5_A30AlbProCod = new long[1] ;
      P0ATJ5_A396EmprCod = new String[] {""} ;
      P0ATJ5_A32AlbProEsp = new byte[1] ;
      P0ATJ5_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ5_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P0ATJ6_A396EmprCod = new String[] {""} ;
      P0ATJ6_A30AlbProCod = new long[1] ;
      P0ATJ6_A129BarCod = new int[1] ;
      P0ATJ6_A132BarCodReo = new byte[1] ;
      P0ATJ6_A130BarCodPar = new String[] {""} ;
      P0ATJ6_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ6_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ6_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ6_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATJ6_A1240GuiFasLin = new short[1] ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      P0ATJ7_A1296FacBarPar = new String[] {""} ;
      P0ATJ7_A1295FacBarReo = new byte[1] ;
      P0ATJ7_A1294FacBarCod = new int[1] ;
      P0ATJ7_A396EmprCod = new String[] {""} ;
      P0ATJ7_A430FacCod = new int[1] ;
      P0ATJ7_A446FacLin = new int[1] ;
      A1296FacBarPar = "" ;
      AV117FacBarPar = "" ;
      GXv_char6 = new String[1] ;
      GXv_int25 = new int[1] ;
      GXv_int27 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.costesbasicos_fases_ficha_export__default(),
         new Object[] {
             new Object[] {
            P0ATJ2_A396EmprCod, P0ATJ2_A407EmprNom, P0ATJ2_n407EmprNom
            }
            , new Object[] {
            P0ATJ3_A130BarCodPar, P0ATJ3_A132BarCodReo, P0ATJ3_A129BarCod, P0ATJ3_A396EmprCod, P0ATJ3_A212BarSer, P0ATJ3_A218BarTipCol, P0ATJ3_A141BarCosPro, P0ATJ3_A140BarCosAny, P0ATJ3_A228BarUniMed
            }
            , new Object[] {
            P0ATJ4_A457FasCod, P0ATJ4_A396EmprCod, P0ATJ4_A129BarCod, P0ATJ4_A132BarCodReo, P0ATJ4_A130BarCodPar, P0ATJ4_A603MaqCodBis, P0ATJ4_A460FasDsc, P0ATJ4_A602MaqCod, P0ATJ4_n602MaqCod, P0ATJ4_A194BarOrdLin,
            P0ATJ4_A758ProCod
            }
            , new Object[] {
            P0ATJ5_A130BarCodPar, P0ATJ5_A132BarCodReo, P0ATJ5_A129BarCod, P0ATJ5_A30AlbProCod, P0ATJ5_A396EmprCod, P0ATJ5_A32AlbProEsp, P0ATJ5_A1264BarPreMtr, P0ATJ5_A1263BarAlbMtrE, P0ATJ5_A1262BarPreKgm, P0ATJ5_A1261BarAlbKgmE
            }
            , new Object[] {
            P0ATJ6_A396EmprCod, P0ATJ6_A30AlbProCod, P0ATJ6_A129BarCod, P0ATJ6_A132BarCodReo, P0ATJ6_A130BarCodPar, P0ATJ6_A1242GuiFasPMt, P0ATJ6_A1276FasMtr, P0ATJ6_A1241GuiFasPKg, P0ATJ6_A1275FasKgm, P0ATJ6_A1240GuiFasLin
            }
            , new Object[] {
            P0ATJ7_A1296FacBarPar, P0ATJ7_A1295FacBarReo, P0ATJ7_A1294FacBarCod, P0ATJ7_A396EmprCod, P0ATJ7_A430FacCod, P0ATJ7_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37Barcodreo ;
   private byte AV73reoperados ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV63BarTipCol ;
   private byte AV72CosTiR ;
   private byte AV94Lhipro ;
   private byte A32AlbProEsp ;
   private byte A1295FacBarReo ;
   private byte AV116FacBarReo ;
   private byte GXv_int2[] ;
   private short AV46Moda21 ;
   private short A194BarOrdLin ;
   private short AV79teotixfi ;
   private short GXv_int11[] ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV36Barcod ;
   private int AV47clicod ;
   private int AV52Barcolnum ;
   private int AV15Random ;
   private int AV13CellRow ;
   private int AV106CellCol ;
   private int A129BarCod ;
   private int AV93Tiempo_m ;
   private int A1294FacBarCod ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int AV115facbarcod ;
   private int GXv_int25[] ;
   private int GXv_int27[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV53barkgm ;
   private java.math.BigDecimal AV54Barmtr ;
   private java.math.BigDecimal AV96costefab2 ;
   private java.math.BigDecimal AV97mAgua ;
   private java.math.BigDecimal AV98menergia ;
   private java.math.BigDecimal AV99mgas ;
   private java.math.BigDecimal AV100mmod ;
   private java.math.BigDecimal AV101mmoi ;
   private java.math.BigDecimal AV102madc ;
   private java.math.BigDecimal AV103mam ;
   private java.math.BigDecimal AV104mgi ;
   private java.math.BigDecimal AV105costeoperario1 ;
   private java.math.BigDecimal AV55Coste_f ;
   private java.math.BigDecimal AV56Coste_fagua ;
   private java.math.BigDecimal AV57Coste_fene ;
   private java.math.BigDecimal AV58Coste_fgas ;
   private java.math.BigDecimal AV59Coste_fmod ;
   private java.math.BigDecimal AV60Coste_fmoi ;
   private java.math.BigDecimal AV61Coste_teo ;
   private java.math.BigDecimal AV62coste_foper ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV64BarCosPro ;
   private java.math.BigDecimal AV65BarCosAny ;
   private java.math.BigDecimal AV66Valor ;
   private java.math.BigDecimal AV68Valor_c ;
   private java.math.BigDecimal AV114Valor_cor ;
   private java.math.BigDecimal AV71MaqCosMin ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV74tteo ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV75Coste_p_k ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV78Coste_tm ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV80TieTeo ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal AV81Unidades ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal AV82Unidadest ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal AV83Coste_mam ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal AV84Coste_madc ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal AV85Coste_mgi ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal AV86Coste_mmoi ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal AV87Coste_mmod ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal AV88Coste_mgas ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal AV89Coste_menergia ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal AV90Coste_mAgua ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal AV91Coste_m ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private java.math.BigDecimal AV92BarTieRea ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal AV95costeoperario ;
   private java.math.BigDecimal AV107Coste_fgi ;
   private java.math.BigDecimal AV108Coste_fadc ;
   private java.math.BigDecimal AV109Coste_fam ;
   private java.math.BigDecimal AV110Coste_p ;
   private java.math.BigDecimal AV111Coste_t ;
   private java.math.BigDecimal AV112Coste_tt ;
   private java.math.BigDecimal AV113Margen ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private String AV35Emprcod ;
   private String AV38Barcodpar ;
   private String AV42Station ;
   private String AV48Clinom ;
   private String AV49barser ;
   private String AV50barserdsc ;
   private String AV51barcolnom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV43EmprNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A228BarUniMed ;
   private String AV67BarUniMed ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A602MaqCod ;
   private String A758ProCod ;
   private String AV69MaqCod ;
   private String AV70maqDsc ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV76HorFin_5 ;
   private String AV77HorIni_5 ;
   private String A1296FacBarPar ;
   private String AV117FacBarPar ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n602MaqCod ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String[] aP25 ;
   private String[] aP24 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATJ2_A396EmprCod ;
   private String[] P0ATJ2_A407EmprNom ;
   private boolean[] P0ATJ2_n407EmprNom ;
   private String[] P0ATJ3_A130BarCodPar ;
   private byte[] P0ATJ3_A132BarCodReo ;
   private int[] P0ATJ3_A129BarCod ;
   private String[] P0ATJ3_A396EmprCod ;
   private String[] P0ATJ3_A212BarSer ;
   private byte[] P0ATJ3_A218BarTipCol ;
   private java.math.BigDecimal[] P0ATJ3_A141BarCosPro ;
   private java.math.BigDecimal[] P0ATJ3_A140BarCosAny ;
   private String[] P0ATJ3_A228BarUniMed ;
   private String[] P0ATJ4_A457FasCod ;
   private String[] P0ATJ4_A396EmprCod ;
   private int[] P0ATJ4_A129BarCod ;
   private byte[] P0ATJ4_A132BarCodReo ;
   private String[] P0ATJ4_A130BarCodPar ;
   private String[] P0ATJ4_A603MaqCodBis ;
   private String[] P0ATJ4_A460FasDsc ;
   private String[] P0ATJ4_A602MaqCod ;
   private boolean[] P0ATJ4_n602MaqCod ;
   private short[] P0ATJ4_A194BarOrdLin ;
   private String[] P0ATJ4_A758ProCod ;
   private String[] P0ATJ5_A130BarCodPar ;
   private byte[] P0ATJ5_A132BarCodReo ;
   private int[] P0ATJ5_A129BarCod ;
   private long[] P0ATJ5_A30AlbProCod ;
   private String[] P0ATJ5_A396EmprCod ;
   private byte[] P0ATJ5_A32AlbProEsp ;
   private java.math.BigDecimal[] P0ATJ5_A1264BarPreMtr ;
   private java.math.BigDecimal[] P0ATJ5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0ATJ5_A1262BarPreKgm ;
   private java.math.BigDecimal[] P0ATJ5_A1261BarAlbKgmE ;
   private String[] P0ATJ6_A396EmprCod ;
   private long[] P0ATJ6_A30AlbProCod ;
   private int[] P0ATJ6_A129BarCod ;
   private byte[] P0ATJ6_A132BarCodReo ;
   private String[] P0ATJ6_A130BarCodPar ;
   private java.math.BigDecimal[] P0ATJ6_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0ATJ6_A1276FasMtr ;
   private java.math.BigDecimal[] P0ATJ6_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P0ATJ6_A1275FasKgm ;
   private short[] P0ATJ6_A1240GuiFasLin ;
   private String[] P0ATJ7_A1296FacBarPar ;
   private byte[] P0ATJ7_A1295FacBarReo ;
   private int[] P0ATJ7_A1294FacBarCod ;
   private String[] P0ATJ7_A396EmprCod ;
   private int[] P0ATJ7_A430FacCod ;
   private int[] P0ATJ7_A446FacLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
}

final  class costesbasicos_fases_ficha_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATJ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATJ3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSer, BarTipCol, BarCosPro, BarCosAny, BarUniMed FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATJ4", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis, T2.FasDsc, T2.MaqCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATJ5", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, AlbProEsp, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATJ6", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasPMt, FasMtr, GuiFasPKg, FasKgm, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATJ7", "SELECT FacBarPar, FacBarReo, FacBarCod, EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ? ORDER BY EmprCod, FacBarCod, FacBarReo, FacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
      }
   }

}

