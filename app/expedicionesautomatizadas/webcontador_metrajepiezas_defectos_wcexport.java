package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webcontador_metrajepiezas_defectos_wcexport extends GXProcedure
{
   public webcontador_metrajepiezas_defectos_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webcontador_metrajepiezas_defectos_wcexport.class ), "" );
   }

   public webcontador_metrajepiezas_defectos_wcexport( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webcontador_metrajepiezas_defectos_wcexport.this.aP1 = new String[] {""};
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
      webcontador_metrajepiezas_defectos_wcexport.this.aP0 = aP0;
      webcontador_metrajepiezas_defectos_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
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
      AV11Filename = "./PrivateTempStorage/" + "WebContador_MetrajePiezas_Defectos_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV24FilterFullText, GXv_char5) ;
      webcontador_metrajepiezas_defectos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV40TFMetPieDfLin) && (0==AV41TFMetPieDfLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFMetPieDfLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFMetPieDfLin_To );
      }
      if ( ! ( (0==AV42TFMetPieDfID) && (0==AV43TFMetPieDfID_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Defecto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFMetPieDfID );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFMetPieDfID_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFMetPieDfDc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFMetPieDfDc_Sel, GXv_char5) ;
         webcontador_metrajepiezas_defectos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFMetPieDfDc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFMetPieDfDc, GXv_char5) ;
            webcontador_metrajepiezas_defectos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFMetPieDfMin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFMetPieDfMin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros Iniciales", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFMetPieDfMin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFMetPieDfMin_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFMetPieDfMax)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFMetPieDfMax_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros Finales", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFMetPieDfMax)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFMetPieDfMax_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFMetPieDfFase_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFMetPieDfFase_Sel, GXv_char5) ;
         webcontador_metrajepiezas_defectos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFMetPieDfFase)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webcontador_metrajepiezas_defectos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFMetPieDfFase, GXv_char5) ;
            webcontador_metrajepiezas_defectos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV37VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV25Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector"), "") != 0 )
      {
         AV32ColumnsSelectorXML = AV25Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector") ;
         AV29ColumnsSelector.fromxml(AV32ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV31ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV55GXV1));
         if ( AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setColor( 11 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV16EmprCod ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV17MetTerCod ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV18BarCod ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV19BarCodReo ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV20BarCodPar ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV21MetPieCod ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV24FilterFullText ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV40TFMetPieDfLin ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV41TFMetPieDfLin_To ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV42TFMetPieDfID ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV43TFMetPieDfID_To ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV44TFMetPieDfDc ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV45TFMetPieDfDc_Sel ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV46TFMetPieDfMin ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV47TFMetPieDfMin_To ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV48TFMetPieDfMax ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV49TFMetPieDfMax_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV50TFMetPieDfFase ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV51TFMetPieDfFase_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                           Short.valueOf(AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) ,
                                           Short.valueOf(AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) ,
                                           Short.valueOf(AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) ,
                                           Short.valueOf(AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                           AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                           AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                           AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                           AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                           AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                           Short.valueOf(A12995MetPieDfLi) ,
                                           Short.valueOf(A12996MetPieDfID) ,
                                           A12997MetPieDfDc ,
                                           A12998MetPieDfMi ,
                                           A12999MetPieDfMa ,
                                           A13000MetPieDfFa ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           A396EmprCod ,
                                           AV16EmprCod ,
                                           A2809MetTerCod ,
                                           AV17MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV18BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV19BarCodReo) ,
                                           A130BarCodPar ,
                                           AV20BarCodPar ,
                                           A2813MetPieCod ,
                                           AV21MetPieCod ,
                                           AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                           AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                           Integer.valueOf(AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod) ,
                                           Byte.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo) ,
                                           AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                           AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = GXutil.padr( GXutil.rtrim( AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc), 30, "%") ;
      lV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = GXutil.padr( GXutil.rtrim( AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase), 8, "%") ;
      /* Using cursor P09AR2 */
      pr_default.execute(0, new Object[] {AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, Integer.valueOf(AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod), Byte.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo), AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, AV16EmprCod, AV17MetTerCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV21MetPieCod, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, Short.valueOf(AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin), Short.valueOf(AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to), Short.valueOf(AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid), Short.valueOf(AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to), lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to, AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax, AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to, lV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13000MetPieDfFa = P09AR2_A13000MetPieDfFa[0] ;
         A12999MetPieDfMa = P09AR2_A12999MetPieDfMa[0] ;
         A12998MetPieDfMi = P09AR2_A12998MetPieDfMi[0] ;
         A12997MetPieDfDc = P09AR2_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AR2_n12997MetPieDfDc[0] ;
         A12996MetPieDfID = P09AR2_A12996MetPieDfID[0] ;
         A12995MetPieDfLi = P09AR2_A12995MetPieDfLi[0] ;
         A2813MetPieCod = P09AR2_A2813MetPieCod[0] ;
         A130BarCodPar = P09AR2_A130BarCodPar[0] ;
         A132BarCodReo = P09AR2_A132BarCodReo[0] ;
         A129BarCod = P09AR2_A129BarCod[0] ;
         A2809MetTerCod = P09AR2_A2809MetTerCod[0] ;
         A396EmprCod = P09AR2_A396EmprCod[0] ;
         A12997MetPieDfDc = P09AR2_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AR2_n12997MetPieDfDc[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV37VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A12995MetPieDfLi );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A12996MetPieDfID );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A12997MetPieDfDc, GXv_char5) ;
            webcontador_metrajepiezas_defectos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A12998MetPieDfMi)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A12999MetPieDfMa)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13000MetPieDfFa, GXv_char5) ;
            webcontador_metrajepiezas_defectos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
      AV29ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MetPieDfLin", "", "Linea", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MetPieDfID", "", "Defecto", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MetPieDfDc", "", "Descripcion", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MetPieDfMin", "", "Metros Iniciales", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MetPieDfMax", "", "Metros Finales", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MetPieDfFase", "", "Fase", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV33UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector", GXv_char5) ;
      webcontador_metrajepiezas_defectos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV33UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV33UserCustomValue)==0) ) )
      {
         AV30ColumnsSelectorAux.fromxml(AV33UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV30ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV30ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), null, null);
      }
      AV22OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV23OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV76GXV2 = 1 ;
      while ( AV76GXV2 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV2));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV24FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFLIN") == 0 )
         {
            AV40TFMetPieDfLin = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFMetPieDfLin_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFID") == 0 )
         {
            AV42TFMetPieDfID = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFMetPieDfID_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC") == 0 )
         {
            AV44TFMetPieDfDc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC_SEL") == 0 )
         {
            AV45TFMetPieDfDc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMIN") == 0 )
         {
            AV46TFMetPieDfMin = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFMetPieDfMin_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMAX") == 0 )
         {
            AV48TFMetPieDfMax = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFMetPieDfMax_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE") == 0 )
         {
            AV50TFMetPieDfFase = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE_SEL") == 0 )
         {
            AV51TFMetPieDfFase_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&METTERCOD") == 0 )
         {
            AV17MetTerCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV18BarCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV19BarCodReo = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV20BarCodPar = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&METPIECOD") == 0 )
         {
            AV21MetPieCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV76GXV2 = (int)(AV76GXV2+1) ;
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
      this.aP0[0] = webcontador_metrajepiezas_defectos_wcexport.this.AV11Filename;
      this.aP1[0] = webcontador_metrajepiezas_defectos_wcexport.this.AV12ErrorMessage;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV24FilterFullText = "" ;
      AV45TFMetPieDfDc_Sel = "" ;
      AV44TFMetPieDfDc = "" ;
      AV46TFMetPieDfMin = DecimalUtil.ZERO ;
      AV47TFMetPieDfMin_To = DecimalUtil.ZERO ;
      AV48TFMetPieDfMax = DecimalUtil.ZERO ;
      AV49TFMetPieDfMax_To = DecimalUtil.ZERO ;
      AV51TFMetPieDfFase_Sel = "" ;
      AV50TFMetPieDfFase = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV25Session = httpContext.getWebSession();
      AV32ColumnsSelectorXML = "" ;
      AV29ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV31ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A12997MetPieDfDc = "" ;
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      A12999MetPieDfMa = DecimalUtil.ZERO ;
      A13000MetPieDfFa = "" ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = "" ;
      AV16EmprCod = "" ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = "" ;
      AV17MetTerCod = "" ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = "" ;
      AV20BarCodPar = "" ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = "" ;
      AV21MetPieCod = "" ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = "" ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = DecimalUtil.ZERO ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = DecimalUtil.ZERO ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = DecimalUtil.ZERO ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = DecimalUtil.ZERO ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = "" ;
      scmdbuf = "" ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      lV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      P09AR2_A13000MetPieDfFa = new String[] {""} ;
      P09AR2_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AR2_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AR2_A12997MetPieDfDc = new String[] {""} ;
      P09AR2_n12997MetPieDfDc = new boolean[] {false} ;
      P09AR2_A12996MetPieDfID = new short[1] ;
      P09AR2_A12995MetPieDfLi = new short[1] ;
      P09AR2_A2813MetPieCod = new String[] {""} ;
      P09AR2_A130BarCodPar = new String[] {""} ;
      P09AR2_A132BarCodReo = new byte[1] ;
      P09AR2_A129BarCod = new int[1] ;
      P09AR2_A2809MetTerCod = new String[] {""} ;
      P09AR2_A396EmprCod = new String[] {""} ;
      AV33UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV30ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexport__default(),
         new Object[] {
             new Object[] {
            P09AR2_A13000MetPieDfFa, P09AR2_A12999MetPieDfMa, P09AR2_A12998MetPieDfMi, P09AR2_A12997MetPieDfDc, P09AR2_n12997MetPieDfDc, P09AR2_A12996MetPieDfID, P09AR2_A12995MetPieDfLi, P09AR2_A2813MetPieCod, P09AR2_A130BarCodPar, P09AR2_A132BarCodReo,
            P09AR2_A129BarCod, P09AR2_A2809MetTerCod, P09AR2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ;
   private byte AV19BarCodReo ;
   private byte A132BarCodReo ;
   private short AV40TFMetPieDfLin ;
   private short AV41TFMetPieDfLin_To ;
   private short AV42TFMetPieDfID ;
   private short AV43TFMetPieDfID_To ;
   private short GXv_int3[] ;
   private short A12995MetPieDfLi ;
   private short A12996MetPieDfID ;
   private short AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ;
   private short AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ;
   private short AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ;
   private short AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ;
   private short AV22OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV55GXV1 ;
   private int AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int AV76GXV2 ;
   private long AV37VisibleColumnCount ;
   private java.math.BigDecimal AV46TFMetPieDfMin ;
   private java.math.BigDecimal AV47TFMetPieDfMin_To ;
   private java.math.BigDecimal AV48TFMetPieDfMax ;
   private java.math.BigDecimal AV49TFMetPieDfMax_To ;
   private java.math.BigDecimal A12998MetPieDfMi ;
   private java.math.BigDecimal A12999MetPieDfMa ;
   private java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ;
   private java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ;
   private java.math.BigDecimal AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ;
   private java.math.BigDecimal AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ;
   private String AV45TFMetPieDfDc_Sel ;
   private String AV44TFMetPieDfDc ;
   private String AV51TFMetPieDfFase_Sel ;
   private String AV50TFMetPieDfFase ;
   private String A12997MetPieDfDc ;
   private String A13000MetPieDfFa ;
   private String AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ;
   private String AV16EmprCod ;
   private String AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ;
   private String AV17MetTerCod ;
   private String AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ;
   private String AV20BarCodPar ;
   private String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod ;
   private String AV21MetPieCod ;
   private String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ;
   private String AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ;
   private String scmdbuf ;
   private String lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String lV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV23OrderedDsc ;
   private boolean n12997MetPieDfDc ;
   private String AV32ColumnsSelectorXML ;
   private String AV33UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV24FilterFullText ;
   private String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09AR2_A13000MetPieDfFa ;
   private java.math.BigDecimal[] P09AR2_A12999MetPieDfMa ;
   private java.math.BigDecimal[] P09AR2_A12998MetPieDfMi ;
   private String[] P09AR2_A12997MetPieDfDc ;
   private boolean[] P09AR2_n12997MetPieDfDc ;
   private short[] P09AR2_A12996MetPieDfID ;
   private short[] P09AR2_A12995MetPieDfLi ;
   private String[] P09AR2_A2813MetPieCod ;
   private String[] P09AR2_A130BarCodPar ;
   private byte[] P09AR2_A132BarCodReo ;
   private int[] P09AR2_A129BarCod ;
   private String[] P09AR2_A2809MetTerCod ;
   private String[] P09AR2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV31ColumnsSelector_Column ;
}

final  class webcontador_metrajepiezas_defectos_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09AR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                          short AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ,
                                          short AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ,
                                          short AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ,
                                          short AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ,
                                          String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                          String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                          java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                          java.math.BigDecimal AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                          java.math.BigDecimal AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                          String AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                          String AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                          short A12995MetPieDfLi ,
                                          short A12996MetPieDfID ,
                                          String A12997MetPieDfDc ,
                                          java.math.BigDecimal A12998MetPieDfMi ,
                                          java.math.BigDecimal A12999MetPieDfMa ,
                                          String A13000MetPieDfFa ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV16EmprCod ,
                                          String A2809MetTerCod ,
                                          String AV17MetTerCod ,
                                          int A129BarCod ,
                                          int AV18BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV19BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV20BarCodPar ,
                                          String A2813MetPieCod ,
                                          String AV21MetPieCod ,
                                          String AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                          String AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                          int AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ,
                                          byte AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ,
                                          String AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                          String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MetPieDfFa, T1.MetPieDfMa, T1.MetPieDfMi, T2.TipDefDsc AS MetPieDfDc, T1.MetPieDfID AS MetPieDfID, T1.MetPieDfLi, T1.MetPieCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.MetTerCod, T1.EmprCod FROM (TXPMETPID T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.MetPieDfID)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MetTerCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MetPieCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MetTerCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieCod = ?)");
      if ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MetPieDfLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfID,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipDefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfMi,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfMa,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.MetPieDfFa) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) && ( ! (GXutil.strcmp("", AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipDefDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) && ( ! (GXutil.strcmp("", AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieDfFa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfFa = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV22OrderedBy == 1 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfFa" ;
      }
      else if ( ( AV22OrderedBy == 1 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfFa DESC" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfLi" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfLi DESC" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfID" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfID DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T2.TipDefDsc" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T2.TipDefDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfMi" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfMi DESC" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfMa" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfMa DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09AR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

