package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_incidencias_wcexport extends GXProcedure
{
   public cierrerecetastinte_incidencias_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_incidencias_wcexport.class ), "" );
   }

   public cierrerecetastinte_incidencias_wcexport( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      cierrerecetastinte_incidencias_wcexport.this.aP1 = new String[] {""};
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
      cierrerecetastinte_incidencias_wcexport.this.aP0 = aP0;
      cierrerecetastinte_incidencias_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "CierreRecetasTinte_Incidencias_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV56TFRecPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFRecPrdNum_Sel, GXv_char5) ;
         cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFRecPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFRecPrdNum, GXv_char5) ;
            cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFRecPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFRecPrdDsc_Sel, GXv_char5) ;
         cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFRecPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFRecPrdDsc, GXv_char5) ;
            cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFFacCon)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFFacCon_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFFacCon)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFFacCon_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrdExiAlm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFPrdExiAlm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Almacen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFPrdExiAlm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFPrdExiAlm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFPrdExiCC)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFPrdExiCC_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "C.C.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TFPrdExiCC)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFPrdExiCC_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFPrdCanRes)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdCanRes_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reservada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFPrdCanRes)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFPrdCanRes_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV68TFRecLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFRecLote_Sel, GXv_char5) ;
         cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFRecLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFRecLote, GXv_char5) ;
            cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV44TFRecLinPro) && (0==AV45TFRecLinPro_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "##") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFRecLinPro );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFRecLinPro_To );
      }
      if ( ! ( (0==AV53TFRecLin) && (0==AV54TFRecLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV53TFRecLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV54TFRecLin_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV79GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV69emprcod ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV70barcod ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV71barcodreo ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV72barcodpar ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV73reclinmaq ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV18FilterFullText ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV55TFRecPrdNum ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV56TFRecPrdNum_Sel ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV57TFRecPrdDsc ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV58TFRecPrdDsc_Sel ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV59TFFacCon ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV60TFFacCon_To ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV61TFPrdExiAlm ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV62TFPrdExiAlm_To ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV63TFPrdExiCC ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV64TFPrdExiCC_To ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV65TFPrdCanRes ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV66TFPrdCanRes_To ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV67TFRecLote ;
      AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV68TFRecLote_Sel ;
      AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV44TFRecLinPro ;
      AV102Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV103Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV53TFRecLin ;
      AV104Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV54TFRecLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                           AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                           AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                           AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                           AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                           AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                           AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                           AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                           AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                           AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                           AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                           AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                           AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                           AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                           AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                           Byte.valueOf(AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) ,
                                           Byte.valueOf(AV102Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) ,
                                           Short.valueOf(AV103Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) ,
                                           Short.valueOf(AV104Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A396EmprCod ,
                                           AV69emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV70barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV71barcodreo) ,
                                           A130BarCodPar ,
                                           AV72barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV73reclinmaq) ,
                                           AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo) ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum), 6, "%") ;
      lV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc), 26, "%") ;
      lV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = GXutil.padr( GXutil.rtrim( AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote), 26, "%") ;
      /* Using cursor P09EW2 */
      pr_default.execute(0, new Object[] {AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, Integer.valueOf(AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod), Byte.valueOf(AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo), AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, Short.valueOf(AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq), AV69emprcod, Integer.valueOf(AV70barcod), Byte.valueOf(AV71barcodreo), AV72barcodpar, Short.valueOf(AV73reclinmaq), lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum, AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel, lV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc, AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel, AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon, AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to, AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm, AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to, AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc, AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to, AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres, AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to, lV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote, AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel, Byte.valueOf(AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro), Byte.valueOf(AV102Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to), Short.valueOf(AV103Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin), Short.valueOf(AV104Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09EW2_A719PrdNum[0] ;
         n719PrdNum = P09EW2_n719PrdNum[0] ;
         A811RecLin = P09EW2_A811RecLin[0] ;
         A1273RecLinPro = P09EW2_A1273RecLinPro[0] ;
         A5725RecLote = P09EW2_A5725RecLote[0] ;
         A685PrdCanRes = P09EW2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EW2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EW2_A704PrdExiAlm[0] ;
         A431FacCon = P09EW2_A431FacCon[0] ;
         A875RecPrdDsc = P09EW2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09EW2_A872RecPrdNum[0] ;
         A2804RecLinMaq = P09EW2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09EW2_A130BarCodPar[0] ;
         A132BarCodReo = P09EW2_A132BarCodReo[0] ;
         A129BarCod = P09EW2_A129BarCod[0] ;
         A396EmprCod = P09EW2_A396EmprCod[0] ;
         A686PrdCant = P09EW2_A686PrdCant[0] ;
         A490ForPrdUMe = P09EW2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09EW2_n490ForPrdUMe[0] ;
         A488ForPrdDsc = P09EW2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EW2_n488ForPrdDsc[0] ;
         A707PrdFacCon = P09EW2_A707PrdFacCon[0] ;
         A1797PrdCanAny = P09EW2_A1797PrdCanAny[0] ;
         A685PrdCanRes = P09EW2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EW2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EW2_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09EW2_A707PrdFacCon[0] ;
         A488ForPrdDsc = P09EW2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EW2_n488ForPrdDsc[0] ;
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
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A872RecPrdNum, GXv_char5) ;
            cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A875RecPrdDsc, GXv_char5) ;
            cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A431FacCon)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV49PrdCant = ((AV76todosproductos==0) ? A686PrdCant : A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49PrdCant)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV50ForPrdDsc = ((AV76todosproductos==0) ? A488ForPrdDsc : ((A490ForPrdUMe==2) ? httpContext.getMessage( "Lt", "") : ((A490ForPrdUMe==1) ? httpContext.getMessage( "Kg", "") : httpContext.getMessage( "Kg", "")))) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50ForPrdDsc, GXv_char5) ;
            cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV47Existencias = DecimalUtil.doubleToDec(0) ;
            if ( ( GXutil.strcmp(A872RecPrdNum, "100000") >= 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") <= 0 ) )
            {
               AV47Existencias = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
            }
            Gx_err = (short)(0) ;
            if ( ( GXutil.strcmp(A872RecPrdNum, "100000") >= 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") <= 0 ) )
            {
               if ( AV75consumos == 1 )
               {
                  Gx_err = (short)(((DecimalUtil.compareTo(AV47Existencias, A704PrdExiAlm)>0) ? 1 : 0)) ;
               }
               else
               {
                  Gx_err = (short)(((DecimalUtil.compareTo(AV47Existencias, A705PrdExiCC)>0) ? 1 : 0)) ;
               }
            }
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( Gx_err );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A704PrdExiAlm)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A705PrdExiCC)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A685PrdCanRes)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5725RecLote, GXv_char5) ;
            cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1273RecLinPro );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A811RecLin );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPrdDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FacCon", "", "Factor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&PrdCant", "", "Cantidad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ForPrdDsc", "", "Und", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&err", "", "", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdExiAlm", "Existencias", "Almacen", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_char5[0] = AV69emprcod ;
      GXv_char7[0] = "011100" ;
      if ( new app.pbuscou(remoteHandle, context).executeUdp( GXv_char5, GXv_char7) != 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      cierrerecetastinte_incidencias_wcexport.this.AV69emprcod = GXv_char5[0] ;
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdExiCC", "Existencias", "C.C.", true, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdCanRes", "", "Reservada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLote", "", "Lote", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLinPro", "", "##", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLin", "", "#", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char7[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector", GXv_char7) ;
      cierrerecetastinte_incidencias_wcexport.this.GXt_char4 = GXv_char7[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV105GXV2 = 1 ;
      while ( AV105GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV55TFRecPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV56TFRecPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV57TFRecPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV58TFRecPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV59TFFacCon = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFFacCon_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV61TFPrdExiAlm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFPrdExiAlm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV63TFPrdExiCC = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFPrdExiCC_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV65TFPrdCanRes = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFPrdCanRes_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV67TFRecLote = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV68TFRecLote_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV44TFRecLinPro = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFRecLinPro_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV53TFRecLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFRecLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV69emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV70barcod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV71barcodreo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV72barcodpar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV73reclinmaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV105GXV2 = (int)(AV105GXV2+1) ;
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
      this.aP0[0] = cierrerecetastinte_incidencias_wcexport.this.AV11Filename;
      this.aP1[0] = cierrerecetastinte_incidencias_wcexport.this.AV12ErrorMessage;
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
      AV56TFRecPrdNum_Sel = "" ;
      AV55TFRecPrdNum = "" ;
      AV58TFRecPrdDsc_Sel = "" ;
      AV57TFRecPrdDsc = "" ;
      AV59TFFacCon = DecimalUtil.ZERO ;
      AV60TFFacCon_To = DecimalUtil.ZERO ;
      AV61TFPrdExiAlm = DecimalUtil.ZERO ;
      AV62TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV63TFPrdExiCC = DecimalUtil.ZERO ;
      AV64TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV65TFPrdCanRes = DecimalUtil.ZERO ;
      AV66TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV68TFRecLote_Sel = "" ;
      AV67TFRecLote = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = "" ;
      AV69emprcod = "" ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = "" ;
      AV72barcodpar = "" ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = "" ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = "" ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = "" ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = "" ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = "" ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = DecimalUtil.ZERO ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = DecimalUtil.ZERO ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = DecimalUtil.ZERO ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = DecimalUtil.ZERO ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = DecimalUtil.ZERO ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = DecimalUtil.ZERO ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = DecimalUtil.ZERO ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = DecimalUtil.ZERO ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = "" ;
      AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = "" ;
      scmdbuf = "" ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = "" ;
      lV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = "" ;
      lV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = "" ;
      lV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09EW2_A719PrdNum = new String[] {""} ;
      P09EW2_n719PrdNum = new boolean[] {false} ;
      P09EW2_A811RecLin = new short[1] ;
      P09EW2_A1273RecLinPro = new byte[1] ;
      P09EW2_A5725RecLote = new String[] {""} ;
      P09EW2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EW2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EW2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EW2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EW2_A875RecPrdDsc = new String[] {""} ;
      P09EW2_A872RecPrdNum = new String[] {""} ;
      P09EW2_A2804RecLinMaq = new short[1] ;
      P09EW2_A130BarCodPar = new String[] {""} ;
      P09EW2_A132BarCodReo = new byte[1] ;
      P09EW2_A129BarCod = new int[1] ;
      P09EW2_A396EmprCod = new String[] {""} ;
      P09EW2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EW2_A490ForPrdUMe = new byte[1] ;
      P09EW2_n490ForPrdUMe = new boolean[] {false} ;
      P09EW2_A488ForPrdDsc = new String[] {""} ;
      P09EW2_n488ForPrdDsc = new boolean[] {false} ;
      P09EW2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EW2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      AV49PrdCant = DecimalUtil.ZERO ;
      AV50ForPrdDsc = "" ;
      AV47Existencias = DecimalUtil.ZERO ;
      GXv_char5 = new String[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char7 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_incidencias_wcexport__default(),
         new Object[] {
             new Object[] {
            P09EW2_A719PrdNum, P09EW2_n719PrdNum, P09EW2_A811RecLin, P09EW2_A1273RecLinPro, P09EW2_A5725RecLote, P09EW2_A685PrdCanRes, P09EW2_A705PrdExiCC, P09EW2_A704PrdExiAlm, P09EW2_A431FacCon, P09EW2_A875RecPrdDsc,
            P09EW2_A872RecPrdNum, P09EW2_A2804RecLinMaq, P09EW2_A130BarCodPar, P09EW2_A132BarCodReo, P09EW2_A129BarCod, P09EW2_A396EmprCod, P09EW2_A686PrdCant, P09EW2_A490ForPrdUMe, P09EW2_n490ForPrdUMe, P09EW2_A488ForPrdDsc,
            P09EW2_n488ForPrdDsc, P09EW2_A707PrdFacCon, P09EW2_A1797PrdCanAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44TFRecLinPro ;
   private byte AV45TFRecLinPro_To ;
   private byte A490ForPrdUMe ;
   private byte A1273RecLinPro ;
   private byte AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ;
   private byte AV71barcodreo ;
   private byte AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ;
   private byte AV102Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ;
   private byte A132BarCodReo ;
   private short AV53TFRecLin ;
   private short AV54TFRecLin_To ;
   private short GXv_int3[] ;
   private short A811RecLin ;
   private short AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq ;
   private short AV73reclinmaq ;
   private short AV103Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ;
   private short AV104Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ;
   private short AV16OrderedBy ;
   private short A2804RecLinMaq ;
   private short AV76todosproductos ;
   private short Gx_err ;
   private short AV75consumos ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV79GXV1 ;
   private int AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ;
   private int AV70barcod ;
   private int A129BarCod ;
   private int AV105GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV59TFFacCon ;
   private java.math.BigDecimal AV60TFFacCon_To ;
   private java.math.BigDecimal AV61TFPrdExiAlm ;
   private java.math.BigDecimal AV62TFPrdExiAlm_To ;
   private java.math.BigDecimal AV63TFPrdExiCC ;
   private java.math.BigDecimal AV64TFPrdExiCC_To ;
   private java.math.BigDecimal AV65TFPrdCanRes ;
   private java.math.BigDecimal AV66TFPrdCanRes_To ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ;
   private java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ;
   private java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ;
   private java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ;
   private java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ;
   private java.math.BigDecimal AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ;
   private java.math.BigDecimal AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ;
   private java.math.BigDecimal AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ;
   private java.math.BigDecimal AV49PrdCant ;
   private java.math.BigDecimal AV47Existencias ;
   private String AV56TFRecPrdNum_Sel ;
   private String AV55TFRecPrdNum ;
   private String AV58TFRecPrdDsc_Sel ;
   private String AV57TFRecPrdDsc ;
   private String AV68TFRecLote_Sel ;
   private String AV67TFRecLote ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ;
   private String AV69emprcod ;
   private String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ;
   private String AV72barcodpar ;
   private String AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ;
   private String AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ;
   private String AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ;
   private String AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ;
   private String AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ;
   private String AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ;
   private String scmdbuf ;
   private String lV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ;
   private String lV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ;
   private String lV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String AV50ForPrdDsc ;
   private String GXv_char5[] ;
   private String GXt_char4 ;
   private String GXv_char7[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean Cond_result ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ;
   private String lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09EW2_A719PrdNum ;
   private boolean[] P09EW2_n719PrdNum ;
   private short[] P09EW2_A811RecLin ;
   private byte[] P09EW2_A1273RecLinPro ;
   private String[] P09EW2_A5725RecLote ;
   private java.math.BigDecimal[] P09EW2_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EW2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EW2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EW2_A431FacCon ;
   private String[] P09EW2_A875RecPrdDsc ;
   private String[] P09EW2_A872RecPrdNum ;
   private short[] P09EW2_A2804RecLinMaq ;
   private String[] P09EW2_A130BarCodPar ;
   private byte[] P09EW2_A132BarCodReo ;
   private int[] P09EW2_A129BarCod ;
   private String[] P09EW2_A396EmprCod ;
   private java.math.BigDecimal[] P09EW2_A686PrdCant ;
   private byte[] P09EW2_A490ForPrdUMe ;
   private boolean[] P09EW2_n490ForPrdUMe ;
   private String[] P09EW2_A488ForPrdDsc ;
   private boolean[] P09EW2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09EW2_A707PrdFacCon ;
   private java.math.BigDecimal[] P09EW2_A1797PrdCanAny ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class cierrerecetastinte_incidencias_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                          String AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                          String AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                          String AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                          String AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                          java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                          java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                          java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                          java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                          java.math.BigDecimal AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                          java.math.BigDecimal AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                          java.math.BigDecimal AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                          String AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                          String AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                          byte AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ,
                                          byte AV102Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ,
                                          short AV103Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ,
                                          short AV104Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV69emprcod ,
                                          int A129BarCod ,
                                          int AV70barcod ,
                                          byte A132BarCodReo ,
                                          byte AV71barcodreo ,
                                          String A130BarCodPar ,
                                          String AV72barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV73reclinmaq ,
                                          String AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                          int AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ,
                                          byte AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                          short AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[37];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.RecLin, T1.RecLinPro, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLinMaq, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.PrdCant, T1.ForPrdUMe, T3.ForPrdDsc, T2.PrdFacCon, T1.PrdCanAny FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
         GXv_int9[12] = (byte)(1) ;
         GXv_int9[13] = (byte)(1) ;
         GXv_int9[14] = (byte)(1) ;
         GXv_int9[15] = (byte)(1) ;
         GXv_int9[16] = (byte)(1) ;
         GXv_int9[17] = (byte)(1) ;
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLinPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLin" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.FacCon" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.FacCon DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiAlm" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiCC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiCC DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdCanRes" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdCanRes DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLote DESC" ;
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
                  return conditional_P09EW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,3);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,3);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               return;
      }
   }

}

