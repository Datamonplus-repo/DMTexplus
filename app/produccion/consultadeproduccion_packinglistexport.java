package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_packinglistexport extends GXProcedure
{
   public consultadeproduccion_packinglistexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_packinglistexport.class ), "" );
   }

   public consultadeproduccion_packinglistexport( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultadeproduccion_packinglistexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      consultadeproduccion_packinglistexport.this.aP0 = aP0;
      consultadeproduccion_packinglistexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV68Var_Hdr = AV69WebSession.getValue("&Var_Hdr") ;
      AV64EmprCod = GXutil.substring( AV68Var_Hdr, 1, 3) ;
      AV65BarCod = (int)(GXutil.lval( GXutil.substring( AV68Var_Hdr, 4, 8))) ;
      AV66BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV68Var_Hdr, 12, 1))) ;
      AV67BarCodPar = GXutil.substring( AV68Var_Hdr, 13, 1) ;
      AV69WebSession.remove("&Var_Hdr");
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_PackingListExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      if ( ! ( (GXutil.strcmp("", AV39TFMetTerCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFMetTerCod_Sel, GXv_char5) ;
         consultadeproduccion_packinglistexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFMetTerCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFMetTerCod, GXv_char5) ;
            consultadeproduccion_packinglistexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV54TFMetPieCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pieza", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFMetPieCod_Sel, GXv_char5) ;
         consultadeproduccion_packinglistexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFMetPieCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pieza", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFMetPieCod, GXv_char5) ;
            consultadeproduccion_packinglistexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFMetPieMet)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFMetPieMet_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFMetPieMet)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFMetPieMet_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFMetPieKil)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFMetPieKil_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFMetPieKil)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFMetPieKil_To)) );
      }
      if ( ! ( (0==AV62TFMetPieAnc) && (0==AV63TFMetPieAnc_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ancho", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV62TFMetPieAnc );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV63TFMetPieAnc_To );
      }
      if ( ! ( (0==AV70TFMetPieEst) && (0==AV71TFMetPieEst_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV70TFMetPieEst );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_packinglistexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV71TFMetPieEst_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_PackingListColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Produccion.ConsultadeProduccion_PackingListColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV81GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV83Produccion_consultadeproduccion_packinglistds_1_emprcod = AV64EmprCod ;
      AV84Produccion_consultadeproduccion_packinglistds_2_barcod = AV65BarCod ;
      AV85Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV66BarCodReo ;
      AV86Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV67BarCodPar ;
      AV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV38TFMetTerCod ;
      AV88Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV39TFMetTerCod_Sel ;
      AV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV53TFMetPieCod ;
      AV90Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV54TFMetPieCod_Sel ;
      AV91Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV58TFMetPieMet ;
      AV92Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV59TFMetPieMet_To ;
      AV93Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV60TFMetPieKil ;
      AV94Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV61TFMetPieKil_To ;
      AV95Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV62TFMetPieAnc ;
      AV96Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV63TFMetPieAnc_To ;
      AV97Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV70TFMetPieEst ;
      AV98Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV71TFMetPieEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV88Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                           AV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                           AV90Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                           AV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                           AV91Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                           AV92Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                           AV93Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                           AV94Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                           Short.valueOf(AV95Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) ,
                                           Short.valueOf(AV96Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) ,
                                           Byte.valueOf(AV97Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) ,
                                           Byte.valueOf(AV98Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV83Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_packinglistds_2_barcod) ,
                                           Byte.valueOf(AV85Produccion_consultadeproduccion_packinglistds_3_barcodreo) ,
                                           AV86Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod = GXutil.padr( GXutil.rtrim( AV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod), 10, "%") ;
      lV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod), 9, "%") ;
      /* Using cursor P09LM2 */
      pr_default.execute(0, new Object[] {AV83Produccion_consultadeproduccion_packinglistds_1_emprcod, Integer.valueOf(AV84Produccion_consultadeproduccion_packinglistds_2_barcod), Byte.valueOf(AV85Produccion_consultadeproduccion_packinglistds_3_barcodreo), AV86Produccion_consultadeproduccion_packinglistds_4_barcodpar, lV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod, AV88Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel, lV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod, AV90Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel, AV91Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet, AV92Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to, AV93Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil, AV94Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to, Short.valueOf(AV95Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc), Short.valueOf(AV96Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to), Byte.valueOf(AV97Produccion_consultadeproduccion_packinglistds_15_tfmetpieest), Byte.valueOf(AV98Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2816MetPieEst = P09LM2_A2816MetPieEst[0] ;
         A6635MetPieAnc = P09LM2_A6635MetPieAnc[0] ;
         A2814MetPieKil = P09LM2_A2814MetPieKil[0] ;
         A2815MetPieMet = P09LM2_A2815MetPieMet[0] ;
         A2813MetPieCod = P09LM2_A2813MetPieCod[0] ;
         A2809MetTerCod = P09LM2_A2809MetTerCod[0] ;
         A130BarCodPar = P09LM2_A130BarCodPar[0] ;
         A132BarCodReo = P09LM2_A132BarCodReo[0] ;
         A129BarCod = P09LM2_A129BarCod[0] ;
         A396EmprCod = P09LM2_A396EmprCod[0] ;
         A4917MetPieObs = P09LM2_A4917MetPieObs[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2809MetTerCod, GXv_char5) ;
            consultadeproduccion_packinglistexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2813MetPieCod, GXv_char5) ;
            consultadeproduccion_packinglistexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2815MetPieMet)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2814MetPieKil)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A6635MetPieAnc );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2816MetPieEst );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV55MaqCod = GXutil.substring( A4917MetPieObs, 4, 6) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55MaqCod, GXv_char5) ;
            consultadeproduccion_packinglistexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV56HisProFec = localUtil.ctod( GXutil.substring( A4917MetPieObs, 10, 8), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            GXt_dtime6 = GXutil.resetTime( AV56HisProFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV57BarOrdLin = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV57BarOrdLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
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

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MetTerCod", "", "Terminal", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MetPieCod", "", "Pieza", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MetPieMet", "", "Metros", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MetPieKil", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MetPieAnc", "", "Ancho", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MetPieEst", "", "E", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&MaqCod", "", "Maquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&HisProFec", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarOrdLin", "", "Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_PackingListColumnsSelector", GXv_char5) ;
      consultadeproduccion_packinglistexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_PackingListGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_PackingListGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Produccion.ConsultadeProduccion_PackingListGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV99GXV2 = 1 ;
      while ( AV99GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV38TFMetTerCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV39TFMetTerCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV53TFMetPieCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV54TFMetPieCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV58TFMetPieMet = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFMetPieMet_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV60TFMetPieKil = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFMetPieKil_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV62TFMetPieAnc = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFMetPieAnc_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV70TFMetPieEst = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFMetPieEst_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV64EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV65BarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV66BarCodReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV67BarCodPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV72Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV73CliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV74PedidoCliente = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV75Barser = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV76BarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV77Barcolnom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV78Barcolnum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV99GXV2 = (int)(AV99GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = consultadeproduccion_packinglistexport.this.AV11Filename;
      this.aP1[0] = consultadeproduccion_packinglistexport.this.AV12ErrorMessage;
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
      AV68Var_Hdr = "" ;
      AV69WebSession = httpContext.getWebSession();
      AV64EmprCod = "" ;
      AV67BarCodPar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV39TFMetTerCod_Sel = "" ;
      AV38TFMetTerCod = "" ;
      AV54TFMetPieCod_Sel = "" ;
      AV53TFMetPieCod = "" ;
      AV58TFMetPieMet = DecimalUtil.ZERO ;
      AV59TFMetPieMet_To = DecimalUtil.ZERO ;
      AV60TFMetPieKil = DecimalUtil.ZERO ;
      AV61TFMetPieKil_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A2809MetTerCod = "" ;
      A2813MetPieCod = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      AV83Produccion_consultadeproduccion_packinglistds_1_emprcod = "" ;
      AV86Produccion_consultadeproduccion_packinglistds_4_barcodpar = "" ;
      AV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod = "" ;
      AV88Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = "" ;
      AV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = "" ;
      AV90Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = "" ;
      AV91Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = DecimalUtil.ZERO ;
      AV92Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV93Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = DecimalUtil.ZERO ;
      AV94Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod = "" ;
      lV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09LM2_A2816MetPieEst = new byte[1] ;
      P09LM2_A6635MetPieAnc = new short[1] ;
      P09LM2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LM2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LM2_A2813MetPieCod = new String[] {""} ;
      P09LM2_A2809MetTerCod = new String[] {""} ;
      P09LM2_A130BarCodPar = new String[] {""} ;
      P09LM2_A132BarCodReo = new byte[1] ;
      P09LM2_A129BarCod = new int[1] ;
      P09LM2_A396EmprCod = new String[] {""} ;
      P09LM2_A4917MetPieObs = new String[] {""} ;
      AV55MaqCod = "" ;
      AV56HisProFec = GXutil.nullDate() ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV73CliNom = "" ;
      AV74PedidoCliente = "" ;
      AV75Barser = "" ;
      AV76BarSerDsc = "" ;
      AV77Barcolnom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_packinglistexport__default(),
         new Object[] {
             new Object[] {
            P09LM2_A2816MetPieEst, P09LM2_A6635MetPieAnc, P09LM2_A2814MetPieKil, P09LM2_A2815MetPieMet, P09LM2_A2813MetPieCod, P09LM2_A2809MetTerCod, P09LM2_A130BarCodPar, P09LM2_A132BarCodReo, P09LM2_A129BarCod, P09LM2_A396EmprCod,
            P09LM2_A4917MetPieObs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV66BarCodReo ;
   private byte AV70TFMetPieEst ;
   private byte AV71TFMetPieEst_To ;
   private byte A2816MetPieEst ;
   private byte AV85Produccion_consultadeproduccion_packinglistds_3_barcodreo ;
   private byte AV97Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ;
   private byte AV98Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ;
   private byte A132BarCodReo ;
   private short AV62TFMetPieAnc ;
   private short AV63TFMetPieAnc_To ;
   private short GXv_int3[] ;
   private short A6635MetPieAnc ;
   private short AV95Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ;
   private short AV96Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ;
   private short AV16OrderedBy ;
   private short AV57BarOrdLin ;
   private short Gx_err ;
   private int AV65BarCod ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV81GXV1 ;
   private int AV84Produccion_consultadeproduccion_packinglistds_2_barcod ;
   private int A129BarCod ;
   private int AV99GXV2 ;
   private int AV72Clicod ;
   private int AV78Barcolnum ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV58TFMetPieMet ;
   private java.math.BigDecimal AV59TFMetPieMet_To ;
   private java.math.BigDecimal AV60TFMetPieKil ;
   private java.math.BigDecimal AV61TFMetPieKil_To ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal AV91Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ;
   private java.math.BigDecimal AV92Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ;
   private java.math.BigDecimal AV93Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ;
   private java.math.BigDecimal AV94Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ;
   private String AV68Var_Hdr ;
   private String AV64EmprCod ;
   private String AV67BarCodPar ;
   private String AV39TFMetTerCod_Sel ;
   private String AV38TFMetTerCod ;
   private String AV54TFMetPieCod_Sel ;
   private String AV53TFMetPieCod ;
   private String A2809MetTerCod ;
   private String A2813MetPieCod ;
   private String AV83Produccion_consultadeproduccion_packinglistds_1_emprcod ;
   private String AV86Produccion_consultadeproduccion_packinglistds_4_barcodpar ;
   private String AV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod ;
   private String AV88Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ;
   private String AV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ;
   private String AV90Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ;
   private String scmdbuf ;
   private String lV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod ;
   private String lV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV55MaqCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV73CliNom ;
   private String AV74PedidoCliente ;
   private String AV75Barser ;
   private String AV76BarSerDsc ;
   private String AV77Barcolnom ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV56HisProFec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String A4917MetPieObs ;
   private com.genexus.webpanels.WebSession AV69WebSession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09LM2_A2816MetPieEst ;
   private short[] P09LM2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09LM2_A2814MetPieKil ;
   private java.math.BigDecimal[] P09LM2_A2815MetPieMet ;
   private String[] P09LM2_A2813MetPieCod ;
   private String[] P09LM2_A2809MetTerCod ;
   private String[] P09LM2_A130BarCodPar ;
   private byte[] P09LM2_A132BarCodReo ;
   private int[] P09LM2_A129BarCod ;
   private String[] P09LM2_A396EmprCod ;
   private String[] P09LM2_A4917MetPieObs ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class consultadeproduccion_packinglistexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                          String AV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                          String AV90Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                          String AV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                          java.math.BigDecimal AV92Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                          java.math.BigDecimal AV93Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                          java.math.BigDecimal AV94Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                          short AV95Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ,
                                          short AV96Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ,
                                          byte AV97Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ,
                                          byte AV98Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          byte A2816MetPieEst ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV83Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                          int AV84Produccion_consultadeproduccion_packinglistds_2_barcod ,
                                          byte AV85Produccion_consultadeproduccion_packinglistds_3_barcodreo ,
                                          String AV86Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[16];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT MetPieEst, MetPieAnc, MetPieKil, MetPieMet, MetPieCod, MetTerCod, BarCodPar, BarCodReo, BarCod, EmprCod, MetPieObs FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV88Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV87Produccion_consultadeproduccion_packinglistds_5_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV95Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV96Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV97Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV98Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetTerCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieMet" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieMet DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieKil" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieKil DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieAnc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieAnc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieEst" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieEst DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P09LM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               return;
      }
   }

}

