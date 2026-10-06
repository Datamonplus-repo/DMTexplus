package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwhdrpziexport extends GXProcedure
{
   public webwhdrpziexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwhdrpziexport.class ), "" );
   }

   public webwhdrpziexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webwhdrpziexport.this.aP1 = new String[] {""};
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
      webwhdrpziexport.this.aP0 = aP0;
      webwhdrpziexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebWHDRPZIExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV32FilterFullText, GXv_char5) ;
      webwhdrpziexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV49TFBarPieCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Pieza", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarPieCod_Sel, GXv_char5) ;
         webwhdrpziexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBarPieCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Pieza", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarPieCod, GXv_char5) ;
            webwhdrpziexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFBarPieKil)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarPieKil_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFBarPieKil)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFBarPieKil_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarPieMet)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarPieMet_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFBarPieMet)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFBarPieMet_To)) );
      }
      if ( ! ( (0==AV54TFBarPieAnc) && (0==AV55TFBarPieAnc_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ancho Acabado Pieza", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFBarPieAnc );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFBarPieAnc_To );
      }
      if ( ! ( (0==AV56TFBarPieEst) && (0==AV57TFBarPieEst_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFBarPieEst );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwhdrpziexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFBarPieEst_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV61GXV1));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV16EmprCod ;
      AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV32FilterFullText ;
      AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV48TFBarPieCod ;
      AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV49TFBarPieCod_Sel ;
      AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV50TFBarPieKil ;
      AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV51TFBarPieKil_To ;
      AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV52TFBarPieMet ;
      AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV53TFBarPieMet_To ;
      AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV54TFBarPieAnc ;
      AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV55TFBarPieAnc_To ;
      AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV56TFBarPieEst ;
      AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV57TFBarPieEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                           AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                           AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                           AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                           AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                           AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                           AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                           Short.valueOf(AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) ,
                                           Short.valueOf(AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) ,
                                           A200BarPieCod ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Short.valueOf(A1691BarPieAnc) ,
                                           A6116BarPieImp ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           A396EmprCod ,
                                           AV16EmprCod ,
                                           AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                           Integer.valueOf(AV23BarCod) ,
                                           Byte.valueOf(AV24BarCodReo) ,
                                           AV25BarCodPar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod), 9, "%") ;
      /* Using cursor P09C12 */
      pr_default.execute(0, new Object[] {AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, AV16EmprCod, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod, AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel, AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil, AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to, AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet, AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to, Short.valueOf(AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc), Short.valueOf(AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to), Byte.valueOf(AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest), Byte.valueOf(AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09C12_A130BarCodPar[0] ;
         A132BarCodReo = P09C12_A132BarCodReo[0] ;
         A129BarCod = P09C12_A129BarCod[0] ;
         A6116BarPieImp = P09C12_A6116BarPieImp[0] ;
         n6116BarPieImp = P09C12_n6116BarPieImp[0] ;
         A201BarPieEst = P09C12_A201BarPieEst[0] ;
         A1691BarPieAnc = P09C12_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P09C12_n1691BarPieAnc[0] ;
         A205BarPieMet = P09C12_A205BarPieMet[0] ;
         A203BarPieKil = P09C12_A203BarPieKil[0] ;
         A200BarPieCod = P09C12_A200BarPieCod[0] ;
         A396EmprCod = P09C12_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV45VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A200BarPieCod, GXv_char5) ;
            webwhdrpziexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A203BarPieKil)) );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A205BarPieMet)) );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A1691BarPieAnc );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6116BarPieImp, GXv_char5) ;
            webwhdrpziexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A201BarPieEst );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
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
      AV37ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieCod", "", "Nº Pieza", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieKil", "", "Kilos", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieMet", "", "Metros", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieAnc", "", "Ancho Acabado Pieza", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieImp", "", "Impresa?", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieEst", "", "Estado", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector", GXv_char5) ;
      webwhdrpziexport.this.GXt_char4 = GXv_char5[0] ;
      AV41UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV38ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV38ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV38ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebWHDRPZIGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIGridState"), null, null);
      }
      AV30OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV75GXV2 = 1 ;
      while ( AV75GXV2 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV2));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV48TFBarPieCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV49TFBarPieCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV50TFBarPieKil = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFBarPieKil_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV52TFBarPieMet = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFBarPieMet_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEANC") == 0 )
         {
            AV54TFBarPieAnc = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarPieAnc_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV56TFBarPieEst = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarPieEst_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPECOD") == 0 )
         {
            AV17OpeCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPENOM") == 0 )
         {
            AV18OpeNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV19MaqCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQNOM") == 0 )
         {
            AV20MaqNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCOD") == 0 )
         {
            AV21FasCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASDSC") == 0 )
         {
            AV22FasDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV23BarCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV24BarCodReo = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV25BarCodPar = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARORDLIN") == 0 )
         {
            AV26BarOrdlin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARANCACA1") == 0 )
         {
            AV27BarAncAca1 = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MSG_I") == 0 )
         {
            AV28Msg_i = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LECFEC") == 0 )
         {
            AV29Lecfec = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV75GXV2 = (int)(AV75GXV2+1) ;
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
      this.aP0[0] = webwhdrpziexport.this.AV11Filename;
      this.aP1[0] = webwhdrpziexport.this.AV12ErrorMessage;
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
      AV32FilterFullText = "" ;
      AV49TFBarPieCod_Sel = "" ;
      AV48TFBarPieCod = "" ;
      AV50TFBarPieKil = DecimalUtil.ZERO ;
      AV51TFBarPieKil_To = DecimalUtil.ZERO ;
      AV52TFBarPieMet = DecimalUtil.ZERO ;
      AV53TFBarPieMet_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A6116BarPieImp = "" ;
      AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod = "" ;
      AV16EmprCod = "" ;
      AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = "" ;
      AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = DecimalUtil.ZERO ;
      AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = DecimalUtil.ZERO ;
      AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      lV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      A396EmprCod = "" ;
      AV25BarCodPar = "" ;
      A130BarCodPar = "" ;
      P09C12_A130BarCodPar = new String[] {""} ;
      P09C12_A132BarCodReo = new byte[1] ;
      P09C12_A129BarCod = new int[1] ;
      P09C12_A6116BarPieImp = new String[] {""} ;
      P09C12_n6116BarPieImp = new boolean[] {false} ;
      P09C12_A201BarPieEst = new byte[1] ;
      P09C12_A1691BarPieAnc = new short[1] ;
      P09C12_n1691BarPieAnc = new boolean[] {false} ;
      P09C12_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C12_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C12_A200BarPieCod = new String[] {""} ;
      P09C12_A396EmprCod = new String[] {""} ;
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV18OpeNom = "" ;
      AV19MaqCod = "" ;
      AV20MaqNom = "" ;
      AV21FasCod = "" ;
      AV22FasDsc = "" ;
      AV28Msg_i = "" ;
      AV29Lecfec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webwhdrpziexport__default(),
         new Object[] {
             new Object[] {
            P09C12_A130BarCodPar, P09C12_A132BarCodReo, P09C12_A129BarCod, P09C12_A6116BarPieImp, P09C12_n6116BarPieImp, P09C12_A201BarPieEst, P09C12_A1691BarPieAnc, P09C12_n1691BarPieAnc, P09C12_A205BarPieMet, P09C12_A203BarPieKil,
            P09C12_A200BarPieCod, P09C12_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV56TFBarPieEst ;
   private byte AV57TFBarPieEst_To ;
   private byte A201BarPieEst ;
   private byte AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ;
   private byte AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ;
   private byte AV24BarCodReo ;
   private byte A132BarCodReo ;
   private short AV54TFBarPieAnc ;
   private short AV55TFBarPieAnc_To ;
   private short GXv_int3[] ;
   private short A1691BarPieAnc ;
   private short AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ;
   private short AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ;
   private short AV30OrderedBy ;
   private short AV26BarOrdlin ;
   private short AV27BarAncAca1 ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV61GXV1 ;
   private int AV23BarCod ;
   private int A129BarCod ;
   private int AV75GXV2 ;
   private int AV17OpeCod ;
   private long AV45VisibleColumnCount ;
   private java.math.BigDecimal AV50TFBarPieKil ;
   private java.math.BigDecimal AV51TFBarPieKil_To ;
   private java.math.BigDecimal AV52TFBarPieMet ;
   private java.math.BigDecimal AV53TFBarPieMet_To ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ;
   private java.math.BigDecimal AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ;
   private java.math.BigDecimal AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ;
   private java.math.BigDecimal AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ;
   private String AV49TFBarPieCod_Sel ;
   private String AV48TFBarPieCod ;
   private String A200BarPieCod ;
   private String A6116BarPieImp ;
   private String AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod ;
   private String AV16EmprCod ;
   private String AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ;
   private String scmdbuf ;
   private String lV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String A396EmprCod ;
   private String AV25BarCodPar ;
   private String A130BarCodPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV18OpeNom ;
   private String AV19MaqCod ;
   private String AV20MaqNom ;
   private String AV21FasCod ;
   private String AV22FasDsc ;
   private String AV28Msg_i ;
   private java.util.Date AV29Lecfec ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private boolean n6116BarPieImp ;
   private boolean n1691BarPieAnc ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV32FilterFullText ;
   private String AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09C12_A130BarCodPar ;
   private byte[] P09C12_A132BarCodReo ;
   private int[] P09C12_A129BarCod ;
   private String[] P09C12_A6116BarPieImp ;
   private boolean[] P09C12_n6116BarPieImp ;
   private byte[] P09C12_A201BarPieEst ;
   private short[] P09C12_A1691BarPieAnc ;
   private boolean[] P09C12_n1691BarPieAnc ;
   private java.math.BigDecimal[] P09C12_A205BarPieMet ;
   private java.math.BigDecimal[] P09C12_A203BarPieKil ;
   private String[] P09C12_A200BarPieCod ;
   private String[] P09C12_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV39ColumnsSelector_Column ;
}

final  class webwhdrpziexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09C12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                          String AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                          String AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                          java.math.BigDecimal AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                          java.math.BigDecimal AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                          short AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ,
                                          short AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ,
                                          byte AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ,
                                          byte AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ,
                                          String A200BarPieCod ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          short A1691BarPieAnc ,
                                          String A6116BarPieImp ,
                                          byte A201BarPieEst ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV16EmprCod ,
                                          String AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                          int AV23BarCod ,
                                          byte AV24BarCodReo ,
                                          String AV25BarCodPar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[21];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, BarPieImp, BarPieEst, BarPieAnc, BarPieMet, BarPieKil, BarPieCod, EmprCod FROM TXPBARPIE" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(BarPieKil > 0)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieAnc,'9990'), 2) like '%' || ?) or ( UPPER(BarPieImp) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(BarPieCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(BarPieKil >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(BarPieKil <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(BarPieMet >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(BarPieMet <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) )
      {
         addWhere(sWhereString, "(BarPieAnc >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) )
      {
         addWhere(sWhereString, "(BarPieAnc <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) )
      {
         addWhere(sWhereString, "(BarPieEst >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(BarPieEst <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV30OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieCod" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieKil" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieKil DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieMet" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieMet DESC" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieAnc" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieAnc DESC" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieEst" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieEst DESC" ;
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
                  return conditional_P09C12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09C12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 9);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 9);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

