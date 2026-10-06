package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class analisiscostesbasicosdetalle_wcexport extends GXProcedure
{
   public analisiscostesbasicosdetalle_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscostesbasicosdetalle_wcexport.class ), "" );
   }

   public analisiscostesbasicosdetalle_wcexport( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      analisiscostesbasicosdetalle_wcexport.this.aP1 = new String[] {""};
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
      analisiscostesbasicosdetalle_wcexport.this.aP0 = aP0;
      analisiscostesbasicosdetalle_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "AnalisisCostesBasicosDetalle_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFBarOrdLin) && (0==AV35TFBarOrdLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFBarOrdLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFBarOrdLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFFasCod_Sel, GXv_char5) ;
         analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFFasCod, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFFasDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion de Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFFasDsc_Sel, GXv_char5) ;
         analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFFasDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion de Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFFasDsc, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFMaqCodBis_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFMaqCodBis_Sel, GXv_char5) ;
         analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFMaqCodBis)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFMaqCodBis, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFBarUniMed_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarUniMed_Sel, GXv_char5) ;
         analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFBarUniMed)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarUniMed, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFBarTieRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFBarTieRea_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T Real", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFBarTieRea)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFBarTieRea_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFBarTieTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarTieTeo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T Teo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFBarTieTeo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         analisiscostesbasicosdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFBarTieTeo_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("AnalisisCostesBasicosDetalle_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("AnalisisCostesBasicosDetalle_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV70GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV72Analisiscostesbasicosdetalle_wcds_1_emprcod = AV62Emprcod ;
      AV73Analisiscostesbasicosdetalle_wcds_2_barcod = AV63Barcod ;
      AV74Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV64Barcodreo ;
      AV75Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV65BarCodpar ;
      AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV18FilterFullText ;
      AV77Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV34TFBarOrdLin ;
      AV78Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV35TFBarOrdLin_To ;
      AV79Analisiscostesbasicosdetalle_wcds_8_tffascod = AV36TFFasCod ;
      AV80Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV37TFFasCod_Sel ;
      AV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV38TFFasDsc ;
      AV82Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV40TFMaqCodBis ;
      AV84Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV41TFMaqCodBis_Sel ;
      AV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV42TFBarUniMed ;
      AV86Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV43TFBarUniMed_Sel ;
      AV87Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV45TFBarTieRea ;
      AV88Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV46TFBarTieRea_To ;
      AV89Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV47TFBarTieTeo ;
      AV90Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV48TFBarTieTeo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                           Short.valueOf(AV77Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV78Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) ,
                                           AV80Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                           AV79Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                           AV82Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                           AV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                           AV84Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                           AV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                           AV86Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                           AV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                           AV87Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                           AV88Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                           AV89Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                           AV90Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A228BarUniMed ,
                                           A215BarTieRea ,
                                           A216BarTieTeo ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV72Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                           Integer.valueOf(AV73Analisiscostesbasicosdetalle_wcds_2_barcod) ,
                                           Byte.valueOf(AV74Analisiscostesbasicosdetalle_wcds_3_barcodreo) ,
                                           AV75Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicosdetalle_wcds_8_tffascod = GXutil.padr( GXutil.rtrim( AV79Analisiscostesbasicosdetalle_wcds_8_tffascod), 8, "%") ;
      lV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc), 28, "%") ;
      lV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis), 6, "%") ;
      lV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = GXutil.padr( GXutil.rtrim( AV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed), 1, "%") ;
      /* Using cursor P093F2 */
      pr_default.execute(0, new Object[] {AV72Analisiscostesbasicosdetalle_wcds_1_emprcod, Integer.valueOf(AV73Analisiscostesbasicosdetalle_wcds_2_barcod), Byte.valueOf(AV74Analisiscostesbasicosdetalle_wcds_3_barcodreo), AV75Analisiscostesbasicosdetalle_wcds_4_barcodpar, lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext, Short.valueOf(AV77Analisiscostesbasicosdetalle_wcds_6_tfbarordlin), Short.valueOf(AV78Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to), lV79Analisiscostesbasicosdetalle_wcds_8_tffascod, AV80Analisiscostesbasicosdetalle_wcds_9_tffascod_sel, lV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc, AV82Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel, lV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis, AV84Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel, lV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed, AV86Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel, AV87Analisiscostesbasicosdetalle_wcds_16_tfbartierea, AV88Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to, AV89Analisiscostesbasicosdetalle_wcds_18_tfbartieteo, AV90Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A216BarTieTeo = P093F2_A216BarTieTeo[0] ;
         A215BarTieRea = P093F2_A215BarTieRea[0] ;
         A228BarUniMed = P093F2_A228BarUniMed[0] ;
         A603MaqCodBis = P093F2_A603MaqCodBis[0] ;
         A460FasDsc = P093F2_A460FasDsc[0] ;
         A457FasCod = P093F2_A457FasCod[0] ;
         A194BarOrdLin = P093F2_A194BarOrdLin[0] ;
         A130BarCodPar = P093F2_A130BarCodPar[0] ;
         A132BarCodReo = P093F2_A132BarCodReo[0] ;
         A129BarCod = P093F2_A129BarCod[0] ;
         A396EmprCod = P093F2_A396EmprCod[0] ;
         A165BarHorIni = P093F2_A165BarHorIni[0] ;
         A164BarHorFin = P093F2_A164BarHorFin[0] ;
         A758ProCod = P093F2_A758ProCod[0] ;
         A460FasDsc = P093F2_A460FasDsc[0] ;
         A228BarUniMed = P093F2_A228BarUniMed[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A194BarOrdLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A457FasCod, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A460FasDsc, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A603MaqCodBis, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = AV61MaqDsc ;
            GXv_char5[0] = GXt_char4 ;
            new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A603MaqCodBis, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV61MaqDsc = GXt_char4 ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61MaqDsc, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A228BarUniMed, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV91Ceros4 = "0000" ;
            AV92Horini = GXutil.str( A165BarHorIni, 4, 0) ;
            AV92Horini = GXutil.ltrim( GXutil.rtrim( AV92Horini)) ;
            AV93Lenvar = DecimalUtil.doubleToDec(GXutil.len( AV92Horini)) ;
            AV93Lenvar = DecimalUtil.doubleToDec(4).subtract(AV93Lenvar) ;
            AV92Horini = GXutil.substring( AV91Ceros4, 1, (int)(DecimalUtil.decToDouble(AV93Lenvar))) + AV92Horini ;
            AV66HorIni_5 = GXutil.substring( AV92Horini, 1, 2) + "." + GXutil.substring( AV92Horini, 3, 2) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66HorIni_5, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV94Horfin = GXutil.str( A164BarHorFin, 4, 0) ;
            AV94Horfin = GXutil.ltrim( GXutil.rtrim( AV94Horfin)) ;
            AV93Lenvar = DecimalUtil.doubleToDec(GXutil.len( AV94Horfin)) ;
            AV93Lenvar = DecimalUtil.doubleToDec(4).subtract(AV93Lenvar) ;
            AV94Horfin = GXutil.substring( AV91Ceros4, 1, (int)(DecimalUtil.decToDouble(AV93Lenvar))) + AV94Horfin ;
            AV67HorFin_5 = GXutil.substring( AV94Horfin, 1, 2) + "." + GXutil.substring( AV94Horfin, 3, 2) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67HorFin_5, GXv_char5) ;
            analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A215BarTieRea)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A216BarTieTeo)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarOrdLin", "", "Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasCod", "", "Codigo Fase", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCodBis", "", "Maquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&MaqDsc", "", "Descripcion ", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Unidades", "", "Unidades", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Unidadest", "", "Und Totales", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarUniMed", "", "Und", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&HorIni_5", "", "Inicio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&HorFin_5", "", "Fin", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarTieRea", "", "T Real", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarTieTeo", "", "T Teo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Tteo", "", "", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&MaqCosMin", "", "Coste Minuto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Coste_m", "", "Coste Real", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Coste_tm", "", "Coste Teo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Tiempo_m", "", "Tiempo (m)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnalisisCostesBasicosDetalle_WCColumnsSelector", GXv_char5) ;
      analisiscostesbasicosdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("AnalisisCostesBasicosDetalle_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnalisisCostesBasicosDetalle_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("AnalisisCostesBasicosDetalle_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV95GXV2 = 1 ;
      while ( AV95GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV34TFBarOrdLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFBarOrdLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV36TFFasCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV37TFFasCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV38TFFasDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV39TFFasDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV40TFMaqCodBis = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV41TFMaqCodBis_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED") == 0 )
         {
            AV42TFBarUniMed = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED_SEL") == 0 )
         {
            AV43TFBarUniMed_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV45TFBarTieRea = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFBarTieRea_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIETEO") == 0 )
         {
            AV47TFBarTieTeo = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFBarTieTeo_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV62Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV63Barcod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV64Barcodreo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV65BarCodpar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV95GXV2 = (int)(AV95GXV2+1) ;
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
      this.aP0[0] = analisiscostesbasicosdetalle_wcexport.this.AV11Filename;
      this.aP1[0] = analisiscostesbasicosdetalle_wcexport.this.AV12ErrorMessage;
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
      AV18FilterFullText = "" ;
      AV37TFFasCod_Sel = "" ;
      AV36TFFasCod = "" ;
      AV39TFFasDsc_Sel = "" ;
      AV38TFFasDsc = "" ;
      AV41TFMaqCodBis_Sel = "" ;
      AV40TFMaqCodBis = "" ;
      AV43TFBarUniMed_Sel = "" ;
      AV42TFBarUniMed = "" ;
      AV45TFBarTieRea = DecimalUtil.ZERO ;
      AV46TFBarTieRea_To = DecimalUtil.ZERO ;
      AV47TFBarTieTeo = DecimalUtil.ZERO ;
      AV48TFBarTieTeo_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A396EmprCod = "" ;
      A228BarUniMed = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      AV72Analisiscostesbasicosdetalle_wcds_1_emprcod = "" ;
      AV62Emprcod = "" ;
      AV75Analisiscostesbasicosdetalle_wcds_4_barcodpar = "" ;
      AV65BarCodpar = "" ;
      AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = "" ;
      AV79Analisiscostesbasicosdetalle_wcds_8_tffascod = "" ;
      AV80Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = "" ;
      AV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc = "" ;
      AV82Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = "" ;
      AV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = "" ;
      AV84Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = "" ;
      AV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = "" ;
      AV86Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = "" ;
      AV87Analisiscostesbasicosdetalle_wcds_16_tfbartierea = DecimalUtil.ZERO ;
      AV88Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = DecimalUtil.ZERO ;
      AV89Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = DecimalUtil.ZERO ;
      AV90Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext = "" ;
      lV79Analisiscostesbasicosdetalle_wcds_8_tffascod = "" ;
      lV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc = "" ;
      lV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = "" ;
      lV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = "" ;
      A130BarCodPar = "" ;
      P093F2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093F2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093F2_A228BarUniMed = new String[] {""} ;
      P093F2_A603MaqCodBis = new String[] {""} ;
      P093F2_A460FasDsc = new String[] {""} ;
      P093F2_A457FasCod = new String[] {""} ;
      P093F2_A194BarOrdLin = new short[1] ;
      P093F2_A130BarCodPar = new String[] {""} ;
      P093F2_A132BarCodReo = new byte[1] ;
      P093F2_A129BarCod = new int[1] ;
      P093F2_A396EmprCod = new String[] {""} ;
      P093F2_A165BarHorIni = new short[1] ;
      P093F2_A164BarHorFin = new short[1] ;
      P093F2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV61MaqDsc = "" ;
      AV91Ceros4 = "" ;
      AV92Horini = "" ;
      AV93Lenvar = DecimalUtil.ZERO ;
      AV66HorIni_5 = "" ;
      AV94Horfin = "" ;
      AV67HorFin_5 = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.analisiscostesbasicosdetalle_wcexport__default(),
         new Object[] {
             new Object[] {
            P093F2_A216BarTieTeo, P093F2_A215BarTieRea, P093F2_A228BarUniMed, P093F2_A603MaqCodBis, P093F2_A460FasDsc, P093F2_A457FasCod, P093F2_A194BarOrdLin, P093F2_A130BarCodPar, P093F2_A132BarCodReo, P093F2_A129BarCod,
            P093F2_A396EmprCod, P093F2_A165BarHorIni, P093F2_A164BarHorFin, P093F2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV74Analisiscostesbasicosdetalle_wcds_3_barcodreo ;
   private byte AV64Barcodreo ;
   private byte A132BarCodReo ;
   private short AV34TFBarOrdLin ;
   private short AV35TFBarOrdLin_To ;
   private short GXv_int3[] ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short AV77Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ;
   private short AV78Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV70GXV1 ;
   private int AV73Analisiscostesbasicosdetalle_wcds_2_barcod ;
   private int AV63Barcod ;
   private int A129BarCod ;
   private int AV95GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV45TFBarTieRea ;
   private java.math.BigDecimal AV46TFBarTieRea_To ;
   private java.math.BigDecimal AV47TFBarTieTeo ;
   private java.math.BigDecimal AV48TFBarTieTeo_To ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV87Analisiscostesbasicosdetalle_wcds_16_tfbartierea ;
   private java.math.BigDecimal AV88Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ;
   private java.math.BigDecimal AV89Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ;
   private java.math.BigDecimal AV90Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ;
   private java.math.BigDecimal AV93Lenvar ;
   private String AV37TFFasCod_Sel ;
   private String AV36TFFasCod ;
   private String AV39TFFasDsc_Sel ;
   private String AV38TFFasDsc ;
   private String AV41TFMaqCodBis_Sel ;
   private String AV40TFMaqCodBis ;
   private String AV43TFBarUniMed_Sel ;
   private String AV42TFBarUniMed ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A228BarUniMed ;
   private String AV72Analisiscostesbasicosdetalle_wcds_1_emprcod ;
   private String AV62Emprcod ;
   private String AV75Analisiscostesbasicosdetalle_wcds_4_barcodpar ;
   private String AV65BarCodpar ;
   private String AV79Analisiscostesbasicosdetalle_wcds_8_tffascod ;
   private String AV80Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ;
   private String AV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc ;
   private String AV82Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ;
   private String AV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ;
   private String AV84Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ;
   private String AV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ;
   private String AV86Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ;
   private String scmdbuf ;
   private String lV79Analisiscostesbasicosdetalle_wcds_8_tffascod ;
   private String lV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc ;
   private String lV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ;
   private String lV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV61MaqDsc ;
   private String AV91Ceros4 ;
   private String AV92Horini ;
   private String AV66HorIni_5 ;
   private String AV94Horfin ;
   private String AV67HorFin_5 ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext ;
   private String lV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P093F2_A216BarTieTeo ;
   private java.math.BigDecimal[] P093F2_A215BarTieRea ;
   private String[] P093F2_A228BarUniMed ;
   private String[] P093F2_A603MaqCodBis ;
   private String[] P093F2_A460FasDsc ;
   private String[] P093F2_A457FasCod ;
   private short[] P093F2_A194BarOrdLin ;
   private String[] P093F2_A130BarCodPar ;
   private byte[] P093F2_A132BarCodReo ;
   private int[] P093F2_A129BarCod ;
   private String[] P093F2_A396EmprCod ;
   private short[] P093F2_A165BarHorIni ;
   private short[] P093F2_A164BarHorFin ;
   private String[] P093F2_A758ProCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class analisiscostesbasicosdetalle_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                          short AV77Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ,
                                          short AV78Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ,
                                          String AV80Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                          String AV79Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                          String AV82Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                          String AV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                          String AV84Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                          String AV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                          String AV86Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                          String AV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                          java.math.BigDecimal AV87Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV88Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                          java.math.BigDecimal AV89Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                          java.math.BigDecimal AV90Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A228BarUniMed ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV72Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                          int AV73Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                          byte AV74Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                          String AV75Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[25];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarTieTeo, T1.BarTieRea, T3.BarUniMed, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarHorIni," ;
      scmdbuf += " T1.BarHorFin, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV76Analisiscostesbasicosdetalle_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T3.BarUniMed) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieRea,'90.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV77Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV78Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Analisiscostesbasicosdetalle_wcds_8_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Analisiscostesbasicosdetalle_wcds_10_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV83Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV85Analisiscostesbasicosdetalle_wcds_14_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarUniMed = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Analisiscostesbasicosdetalle_wcds_16_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Analisiscostesbasicosdetalle_wcds_18_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.FasDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarUniMed" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.BarUniMed DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieTeo" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieTeo DESC" ;
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
                  return conditional_P093F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               return;
      }
   }

}

