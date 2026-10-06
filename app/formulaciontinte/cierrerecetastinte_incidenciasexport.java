package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_incidenciasexport extends GXProcedure
{
   public cierrerecetastinte_incidenciasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_incidenciasexport.class ), "" );
   }

   public cierrerecetastinte_incidenciasexport( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      cierrerecetastinte_incidenciasexport.this.aP1 = new String[] {""};
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
      cierrerecetastinte_incidenciasexport.this.aP0 = aP0;
      cierrerecetastinte_incidenciasexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "CierreRecetasTinte_IncidenciasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV24FilterFullText, GXv_char5) ;
      cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV40TFRecLin) && (0==AV41TFRecLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFRecLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFRecLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFRecPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFRecPrdNum_Sel, GXv_char5) ;
         cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFRecPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFRecPrdNum, GXv_char5) ;
            cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFRecPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFRecPrdDsc_Sel, GXv_char5) ;
         cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFRecPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFRecPrdDsc, GXv_char5) ;
            cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFFacCon)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFFacCon_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFFacCon)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFFacCon_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPrdExiAlm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrdExiAlm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Existencias Almacen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFPrdExiAlm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFPrdExiAlm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrdExiCC)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFPrdExiCC_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Exis C.C.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFPrdExiCC)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55TFPrdExiCC_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdCanRes)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrdCanRes_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad Reservada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TFPrdCanRes)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFPrdCanRes_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFRecLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFRecLote_Sel, GXv_char5) ;
         cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFRecLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_incidenciasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFRecLote, GXv_char5) ;
            cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV25Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector"), "") != 0 )
      {
         AV32ColumnsSelectorXML = AV25Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector") ;
         AV29ColumnsSelector.fromxml(AV32ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV31ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV69GXV1));
         if ( AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setColor( 11 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV16emprcod ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV17barcod ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV18barcodreo ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV19barcodpar ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV20reclinmaq ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV24FilterFullText ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV40TFRecLin ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV41TFRecLin_To ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV42TFRecPrdNum ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV43TFRecPrdNum_Sel ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV44TFRecPrdDsc ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV45TFRecPrdDsc_Sel ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV46TFFacCon ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV47TFFacCon_To ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV52TFPrdExiAlm ;
      AV86Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV53TFPrdExiAlm_To ;
      AV87Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV54TFPrdExiCC ;
      AV88Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV55TFPrdExiCC_To ;
      AV89Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV56TFPrdCanRes ;
      AV90Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV57TFPrdCanRes_To ;
      AV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV58TFRecLote ;
      AV92Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV59TFRecLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                           Short.valueOf(AV77Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) ,
                                           Short.valueOf(AV78Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                           AV82Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                           AV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                           AV83Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                           AV85Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                           AV86Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                           AV87Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                           AV88Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                           AV89Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                           AV90Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                           AV92Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                           AV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           AV71Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                           Integer.valueOf(AV72Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod) ,
                                           Byte.valueOf(AV73Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo) ,
                                           AV74Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                           Short.valueOf(AV75Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum), 6, "%") ;
      lV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc), 26, "%") ;
      lV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote), 26, "%") ;
      /* Using cursor P09ET2 */
      pr_default.execute(0, new Object[] {AV71Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, Integer.valueOf(AV72Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod), Byte.valueOf(AV73Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo), AV74Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, Short.valueOf(AV75Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq), lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, Short.valueOf(AV77Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin), Short.valueOf(AV78Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to), lV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel, lV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc, AV82Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel, AV83Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon, AV84Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to, AV85Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm, AV86Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to, AV87Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc, AV88Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to, AV89Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres, AV90Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to, lV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote, AV92Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09ET2_A719PrdNum[0] ;
         n719PrdNum = P09ET2_n719PrdNum[0] ;
         A5725RecLote = P09ET2_A5725RecLote[0] ;
         A685PrdCanRes = P09ET2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09ET2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09ET2_A704PrdExiAlm[0] ;
         A431FacCon = P09ET2_A431FacCon[0] ;
         A875RecPrdDsc = P09ET2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09ET2_A872RecPrdNum[0] ;
         A811RecLin = P09ET2_A811RecLin[0] ;
         A2804RecLinMaq = P09ET2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09ET2_A130BarCodPar[0] ;
         A132BarCodReo = P09ET2_A132BarCodReo[0] ;
         A129BarCod = P09ET2_A129BarCod[0] ;
         A396EmprCod = P09ET2_A396EmprCod[0] ;
         A707PrdFacCon = P09ET2_A707PrdFacCon[0] ;
         A1797PrdCanAny = P09ET2_A1797PrdCanAny[0] ;
         A686PrdCant = P09ET2_A686PrdCant[0] ;
         A490ForPrdUMe = P09ET2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09ET2_n490ForPrdUMe[0] ;
         A488ForPrdDsc = P09ET2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09ET2_n488ForPrdDsc[0] ;
         A1273RecLinPro = P09ET2_A1273RecLinPro[0] ;
         A685PrdCanRes = P09ET2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09ET2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09ET2_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09ET2_A707PrdFacCon[0] ;
         A488ForPrdDsc = P09ET2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09ET2_n488ForPrdDsc[0] ;
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
         AV37VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A811RecLin );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV66Existencias = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66Existencias)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( AV93Consumos.doubleValue() == 1 )
            {
               AV61RecMar = (byte)(((DecimalUtil.compareTo(AV66Existencias, A704PrdExiAlm)>0) ? 1 : 0)) ;
            }
            else
            {
               AV61RecMar = (byte)(((DecimalUtil.compareTo(AV66Existencias, A705PrdExiCC)>0) ? 1 : 0)) ;
            }
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( AV61RecMar );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A872RecPrdNum, GXv_char5) ;
            cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A875RecPrdDsc, GXv_char5) ;
            cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A431FacCon)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV62PrdCant = ((AV94Todosproductos.doubleValue()==0) ? A686PrdCant : A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62PrdCant)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV63ForPrdDsc = ((AV94Todosproductos.doubleValue()==0) ? A488ForPrdDsc : ((A490ForPrdUMe==2) ? httpContext.getMessage( "Lt", "") : ((A490ForPrdUMe==1) ? httpContext.getMessage( "Kg", "") : httpContext.getMessage( "Kg", "")))) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63ForPrdDsc, GXv_char5) ;
            cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A704PrdExiAlm)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A705PrdExiCC)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A685PrdCanRes)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5725RecLote, GXv_char5) ;
            cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
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
      AV29ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLin", "", "Linea", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Existencias", "", "Exis", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&RecMar", "", "", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPrdNum", "", "Codigo", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPrdDsc", "", "Producto", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FacCon", "", "Factor", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&PrdCant", "", "Cantidad", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ForPrdDsc", "", "Unidad", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char7[0] = "011100" ;
      if ( new app.pbuscou(remoteHandle, context).executeUdp( GXv_char5, GXv_char7) == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      cierrerecetastinte_incidenciasexport.this.A396EmprCod = GXv_char5[0] ;
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdExiCC", "", "Exis C.C.", true, "") ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdCanRes", "", "Cantidad Reservada", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLote", "", "Lote", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV33UserCustomValue ;
      GXv_char7[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector", GXv_char7) ;
      cierrerecetastinte_incidenciasexport.this.GXt_char4 = GXv_char7[0] ;
      AV33UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV33UserCustomValue)==0) ) )
      {
         AV30ColumnsSelectorAux.fromxml(AV33UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV30ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector8) ;
         AV30ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasGridState"), null, null);
      }
      AV22OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV23OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV95GXV2 = 1 ;
      while ( AV95GXV2 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV2));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV24FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV40TFRecLin = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFRecLin_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV42TFRecPrdNum = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV43TFRecPrdNum_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV44TFRecPrdDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV45TFRecPrdDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV46TFFacCon = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFFacCon_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV52TFPrdExiAlm = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFPrdExiAlm_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV54TFPrdExiCC = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFPrdExiCC_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV56TFPrdCanRes = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFPrdCanRes_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV58TFRecLote = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV59TFRecLote_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16emprcod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV17barcod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV18barcodreo = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV19barcodpar = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV20reclinmaq = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
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
      this.aP0[0] = cierrerecetastinte_incidenciasexport.this.AV11Filename;
      this.aP1[0] = cierrerecetastinte_incidenciasexport.this.AV12ErrorMessage;
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
      AV43TFRecPrdNum_Sel = "" ;
      AV42TFRecPrdNum = "" ;
      AV45TFRecPrdDsc_Sel = "" ;
      AV44TFRecPrdDsc = "" ;
      AV46TFFacCon = DecimalUtil.ZERO ;
      AV47TFFacCon_To = DecimalUtil.ZERO ;
      AV52TFPrdExiAlm = DecimalUtil.ZERO ;
      AV53TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV54TFPrdExiCC = DecimalUtil.ZERO ;
      AV55TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV56TFPrdCanRes = DecimalUtil.ZERO ;
      AV57TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV59TFRecLote_Sel = "" ;
      AV58TFRecLote = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A396EmprCod = "" ;
      AV25Session = httpContext.getWebSession();
      AV32ColumnsSelectorXML = "" ;
      AV29ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV31ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A686PrdCant = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = "" ;
      AV16emprcod = "" ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = "" ;
      AV19barcodpar = "" ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = "" ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = "" ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = "" ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = "" ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = "" ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = DecimalUtil.ZERO ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = DecimalUtil.ZERO ;
      AV86Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = DecimalUtil.ZERO ;
      AV87Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = DecimalUtil.ZERO ;
      AV88Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = DecimalUtil.ZERO ;
      AV89Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = DecimalUtil.ZERO ;
      AV90Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = DecimalUtil.ZERO ;
      AV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = "" ;
      AV92Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = "" ;
      scmdbuf = "" ;
      lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = "" ;
      lV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = "" ;
      lV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = "" ;
      lV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = "" ;
      A130BarCodPar = "" ;
      P09ET2_A719PrdNum = new String[] {""} ;
      P09ET2_n719PrdNum = new boolean[] {false} ;
      P09ET2_A5725RecLote = new String[] {""} ;
      P09ET2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ET2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ET2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ET2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ET2_A875RecPrdDsc = new String[] {""} ;
      P09ET2_A872RecPrdNum = new String[] {""} ;
      P09ET2_A811RecLin = new short[1] ;
      P09ET2_A2804RecLinMaq = new short[1] ;
      P09ET2_A130BarCodPar = new String[] {""} ;
      P09ET2_A132BarCodReo = new byte[1] ;
      P09ET2_A129BarCod = new int[1] ;
      P09ET2_A396EmprCod = new String[] {""} ;
      P09ET2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ET2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ET2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ET2_A490ForPrdUMe = new byte[1] ;
      P09ET2_n490ForPrdUMe = new boolean[] {false} ;
      P09ET2_A488ForPrdDsc = new String[] {""} ;
      P09ET2_n488ForPrdDsc = new boolean[] {false} ;
      P09ET2_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      AV66Existencias = DecimalUtil.ZERO ;
      AV93Consumos = DecimalUtil.ZERO ;
      AV62PrdCant = DecimalUtil.ZERO ;
      AV94Todosproductos = DecimalUtil.ZERO ;
      AV63ForPrdDsc = "" ;
      GXv_char5 = new String[1] ;
      AV33UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char7 = new String[1] ;
      AV30ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_incidenciasexport__default(),
         new Object[] {
             new Object[] {
            P09ET2_A719PrdNum, P09ET2_n719PrdNum, P09ET2_A5725RecLote, P09ET2_A685PrdCanRes, P09ET2_A705PrdExiCC, P09ET2_A704PrdExiAlm, P09ET2_A431FacCon, P09ET2_A875RecPrdDsc, P09ET2_A872RecPrdNum, P09ET2_A811RecLin,
            P09ET2_A2804RecLinMaq, P09ET2_A130BarCodPar, P09ET2_A132BarCodReo, P09ET2_A129BarCod, P09ET2_A396EmprCod, P09ET2_A707PrdFacCon, P09ET2_A1797PrdCanAny, P09ET2_A686PrdCant, P09ET2_A490ForPrdUMe, P09ET2_n490ForPrdUMe,
            P09ET2_A488ForPrdDsc, P09ET2_n488ForPrdDsc, P09ET2_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private byte AV73Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ;
   private byte AV18barcodreo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV61RecMar ;
   private short AV40TFRecLin ;
   private short AV41TFRecLin_To ;
   private short GXv_int3[] ;
   private short A811RecLin ;
   private short AV75Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ;
   private short AV20reclinmaq ;
   private short AV77Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ;
   private short AV78Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ;
   private short AV22OrderedBy ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV69GXV1 ;
   private int AV72Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ;
   private int AV17barcod ;
   private int A129BarCod ;
   private int AV95GXV2 ;
   private long AV37VisibleColumnCount ;
   private java.math.BigDecimal AV46TFFacCon ;
   private java.math.BigDecimal AV47TFFacCon_To ;
   private java.math.BigDecimal AV52TFPrdExiAlm ;
   private java.math.BigDecimal AV53TFPrdExiAlm_To ;
   private java.math.BigDecimal AV54TFPrdExiCC ;
   private java.math.BigDecimal AV55TFPrdExiCC_To ;
   private java.math.BigDecimal AV56TFPrdCanRes ;
   private java.math.BigDecimal AV57TFPrdCanRes_To ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ;
   private java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ;
   private java.math.BigDecimal AV85Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ;
   private java.math.BigDecimal AV86Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ;
   private java.math.BigDecimal AV87Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ;
   private java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ;
   private java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ;
   private java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ;
   private java.math.BigDecimal AV66Existencias ;
   private java.math.BigDecimal AV93Consumos ;
   private java.math.BigDecimal AV62PrdCant ;
   private java.math.BigDecimal AV94Todosproductos ;
   private String AV43TFRecPrdNum_Sel ;
   private String AV42TFRecPrdNum ;
   private String AV45TFRecPrdDsc_Sel ;
   private String AV44TFRecPrdDsc ;
   private String AV59TFRecLote_Sel ;
   private String AV58TFRecLote ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String AV71Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ;
   private String AV16emprcod ;
   private String AV74Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ;
   private String AV19barcodpar ;
   private String AV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ;
   private String AV80Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ;
   private String AV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ;
   private String AV82Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ;
   private String AV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ;
   private String AV92Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ;
   private String scmdbuf ;
   private String lV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ;
   private String lV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ;
   private String lV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String AV63ForPrdDsc ;
   private String GXv_char5[] ;
   private String GXt_char4 ;
   private String GXv_char7[] ;
   private boolean returnInSub ;
   private boolean AV23OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean Cond_result ;
   private String AV32ColumnsSelectorXML ;
   private String AV33UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV24FilterFullText ;
   private String AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ;
   private String lV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ET2_A719PrdNum ;
   private boolean[] P09ET2_n719PrdNum ;
   private String[] P09ET2_A5725RecLote ;
   private java.math.BigDecimal[] P09ET2_A685PrdCanRes ;
   private java.math.BigDecimal[] P09ET2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09ET2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09ET2_A431FacCon ;
   private String[] P09ET2_A875RecPrdDsc ;
   private String[] P09ET2_A872RecPrdNum ;
   private short[] P09ET2_A811RecLin ;
   private short[] P09ET2_A2804RecLinMaq ;
   private String[] P09ET2_A130BarCodPar ;
   private byte[] P09ET2_A132BarCodReo ;
   private int[] P09ET2_A129BarCod ;
   private String[] P09ET2_A396EmprCod ;
   private java.math.BigDecimal[] P09ET2_A707PrdFacCon ;
   private java.math.BigDecimal[] P09ET2_A1797PrdCanAny ;
   private java.math.BigDecimal[] P09ET2_A686PrdCant ;
   private byte[] P09ET2_A490ForPrdUMe ;
   private boolean[] P09ET2_n490ForPrdUMe ;
   private String[] P09ET2_A488ForPrdDsc ;
   private boolean[] P09ET2_n488ForPrdDsc ;
   private byte[] P09ET2_A1273RecLinPro ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV31ColumnsSelector_Column ;
}

final  class cierrerecetastinte_incidenciasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ET2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                          short AV77Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ,
                                          short AV78Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ,
                                          String AV80Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                          String AV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                          String AV82Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                          String AV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                          java.math.BigDecimal AV84Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                          java.math.BigDecimal AV85Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                          java.math.BigDecimal AV86Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                          java.math.BigDecimal AV87Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                          java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                          java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                          java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                          String AV92Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                          String AV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV71Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                          int AV72Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ,
                                          byte AV73Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ,
                                          String AV74Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                          short AV75Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[29];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.ForPrdUMe, T3.ForPrdDsc, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV76Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV22OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLin" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLin DESC" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdNum DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.FacCon" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.FacCon DESC" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiAlm" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiCC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiCC DESC" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdCanRes" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdCanRes DESC" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
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
                  return conditional_P09ET2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ET2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,4);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,3);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(20);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
      }
   }

}

