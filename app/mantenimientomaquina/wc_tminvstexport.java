package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wc_tminvstexport extends GXProcedure
{
   public wc_tminvstexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wc_tminvstexport.class ), "" );
   }

   public wc_tminvstexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wc_tminvstexport.this.aP1 = new String[] {""};
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
      wc_tminvstexport.this.aP0 = aP0;
      wc_tminvstexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WC_TMInvStExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      wc_tminvstexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV54TFMISRCod) && (0==AV55TFMISRCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Repuesto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFMISRCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFMISRCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFMISRNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Repuesto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFMISRNom_Sel, GXv_char5) ;
         wc_tminvstexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFMISRNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Repuesto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFMISRNom, GXv_char5) ;
            wc_tminvstexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFMISRStkAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFMISRStkAct_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFMISRStkAct)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFMISRStkAct_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFMISRStkTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFMISRStkTeo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Teorico", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFMISRStkTeo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFMISRStkTeo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFMISRStkRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFMISRStkRea_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Real", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFMISRStkRea)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TFMISRStkRea_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFMISRStkDif)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFMISRStkDif_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Diferencia de Stock", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFMISRStkDif)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_tminvstexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFMISRStkDif_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.WC_TMInvStColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.WC_TMInvStColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV68GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV70Mantenimientomaquina_wc_tminvstds_1_emprcod = AV52EmprCod ;
      AV71Mantenimientomaquina_wc_tminvstds_2_miscod = AV53MISCod ;
      AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = AV18FilterFullText ;
      AV73Mantenimientomaquina_wc_tminvstds_4_tfmisrcod = AV54TFMISRCod ;
      AV74Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to = AV55TFMISRCod_To ;
      AV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = AV56TFMISRNom ;
      AV76Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel = AV57TFMISRNom_Sel ;
      AV77Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact = AV58TFMISRStkAct ;
      AV78Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to = AV59TFMISRStkAct_To ;
      AV79Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo = AV60TFMISRStkTeo ;
      AV80Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to = AV61TFMISRStkTeo_To ;
      AV81Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea = AV62TFMISRStkRea ;
      AV82Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to = AV63TFMISRStkRea_To ;
      AV83Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif = AV64TFMISRStkDif ;
      AV84Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to = AV65TFMISRStkDif_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext ,
                                           Integer.valueOf(AV73Mantenimientomaquina_wc_tminvstds_4_tfmisrcod) ,
                                           Integer.valueOf(AV74Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to) ,
                                           AV76Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ,
                                           AV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ,
                                           AV77Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ,
                                           AV78Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ,
                                           AV79Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ,
                                           AV80Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ,
                                           AV81Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ,
                                           AV82Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ,
                                           AV83Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ,
                                           AV84Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ,
                                           Integer.valueOf(A9403MISRCod) ,
                                           A9404MISRNom ,
                                           A9405MISRStkAct ,
                                           A9406MISRStkTeo ,
                                           A9407MISRStkRea ,
                                           A9408MISRStkDif ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV70Mantenimientomaquina_wc_tminvstds_1_emprcod ,
                                           Integer.valueOf(AV71Mantenimientomaquina_wc_tminvstds_2_miscod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A9398MISCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = GXutil.padr( GXutil.rtrim( AV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom), 100, "%") ;
      /* Using cursor P08WP2 */
      pr_default.execute(0, new Object[] {AV70Mantenimientomaquina_wc_tminvstds_1_emprcod, Integer.valueOf(AV71Mantenimientomaquina_wc_tminvstds_2_miscod), lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext, Integer.valueOf(AV73Mantenimientomaquina_wc_tminvstds_4_tfmisrcod), Integer.valueOf(AV74Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to), lV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom, AV76Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel, AV77Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact, AV78Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to, AV79Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo, AV80Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to, AV81Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea, AV82Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to, AV83Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif, AV84Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9408MISRStkDif = P08WP2_A9408MISRStkDif[0] ;
         A9407MISRStkRea = P08WP2_A9407MISRStkRea[0] ;
         A9406MISRStkTeo = P08WP2_A9406MISRStkTeo[0] ;
         A9405MISRStkAct = P08WP2_A9405MISRStkAct[0] ;
         n9405MISRStkAct = P08WP2_n9405MISRStkAct[0] ;
         A9404MISRNom = P08WP2_A9404MISRNom[0] ;
         n9404MISRNom = P08WP2_n9404MISRNom[0] ;
         A9403MISRCod = P08WP2_A9403MISRCod[0] ;
         A9398MISCod = P08WP2_A9398MISCod[0] ;
         A396EmprCod = P08WP2_A396EmprCod[0] ;
         A9399MISFch = P08WP2_A9399MISFch[0] ;
         n9399MISFch = P08WP2_n9399MISFch[0] ;
         A9399MISFch = P08WP2_A9399MISFch[0] ;
         n9399MISFch = P08WP2_n9399MISFch[0] ;
         A9405MISRStkAct = P08WP2_A9405MISRStkAct[0] ;
         n9405MISRStkAct = P08WP2_n9405MISRStkAct[0] ;
         A9404MISRNom = P08WP2_A9404MISRNom[0] ;
         n9404MISRNom = P08WP2_n9404MISRNom[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9403MISRCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9404MISRNom, GXv_char5) ;
            wc_tminvstexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9405MISRStkAct)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9406MISRStkTeo)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9407MISRStkRea)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9408MISRStkDif)) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MISRCod", "", "Repuesto", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MISRNom", "", "Repuesto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MISRStkAct", "", "Stock Actual", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MISRStkTeo", "", "Stock Teorico", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MISRStkRea", "", "Stock Real", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MISRStkDif", "", "Diferencia de Stock", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.WC_TMInvStColumnsSelector", GXv_char5) ;
      wc_tminvstexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.WC_TMInvStGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WC_TMInvStGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.WC_TMInvStGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV85GXV2 = 1 ;
      while ( AV85GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRCOD") == 0 )
         {
            AV54TFMISRCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFMISRCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRNOM") == 0 )
         {
            AV56TFMISRNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRNOM_SEL") == 0 )
         {
            AV57TFMISRNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKACT") == 0 )
         {
            AV58TFMISRStkAct = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFMISRStkAct_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKTEO") == 0 )
         {
            AV60TFMISRStkTeo = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFMISRStkTeo_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKREA") == 0 )
         {
            AV62TFMISRStkRea = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFMISRStkRea_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKDIF") == 0 )
         {
            AV64TFMISRStkDif = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFMISRStkDif_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV52EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MISCOD") == 0 )
         {
            AV53MISCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV85GXV2 = (int)(AV85GXV2+1) ;
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
      this.aP0[0] = wc_tminvstexport.this.AV11Filename;
      this.aP1[0] = wc_tminvstexport.this.AV12ErrorMessage;
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
      AV57TFMISRNom_Sel = "" ;
      AV56TFMISRNom = "" ;
      AV58TFMISRStkAct = DecimalUtil.ZERO ;
      AV59TFMISRStkAct_To = DecimalUtil.ZERO ;
      AV60TFMISRStkTeo = DecimalUtil.ZERO ;
      AV61TFMISRStkTeo_To = DecimalUtil.ZERO ;
      AV62TFMISRStkRea = DecimalUtil.ZERO ;
      AV63TFMISRStkRea_To = DecimalUtil.ZERO ;
      AV64TFMISRStkDif = DecimalUtil.ZERO ;
      AV65TFMISRStkDif_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9404MISRNom = "" ;
      A9405MISRStkAct = DecimalUtil.ZERO ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      AV70Mantenimientomaquina_wc_tminvstds_1_emprcod = "" ;
      AV52EmprCod = "" ;
      AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = "" ;
      AV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = "" ;
      AV76Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel = "" ;
      AV77Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact = DecimalUtil.ZERO ;
      AV78Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to = DecimalUtil.ZERO ;
      AV79Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo = DecimalUtil.ZERO ;
      AV80Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to = DecimalUtil.ZERO ;
      AV81Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea = DecimalUtil.ZERO ;
      AV82Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to = DecimalUtil.ZERO ;
      AV83Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif = DecimalUtil.ZERO ;
      AV84Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext = "" ;
      lV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = "" ;
      A396EmprCod = "" ;
      P08WP2_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WP2_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WP2_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WP2_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WP2_n9405MISRStkAct = new boolean[] {false} ;
      P08WP2_A9404MISRNom = new String[] {""} ;
      P08WP2_n9404MISRNom = new boolean[] {false} ;
      P08WP2_A9403MISRCod = new int[1] ;
      P08WP2_A9398MISCod = new int[1] ;
      P08WP2_A396EmprCod = new String[] {""} ;
      P08WP2_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08WP2_n9399MISFch = new boolean[] {false} ;
      A9399MISFch = GXutil.nullDate() ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wc_tminvstexport__default(),
         new Object[] {
             new Object[] {
            P08WP2_A9408MISRStkDif, P08WP2_A9407MISRStkRea, P08WP2_A9406MISRStkTeo, P08WP2_A9405MISRStkAct, P08WP2_n9405MISRStkAct, P08WP2_A9404MISRNom, P08WP2_n9404MISRNom, P08WP2_A9403MISRCod, P08WP2_A9398MISCod, P08WP2_A396EmprCod,
            P08WP2_A9399MISFch, P08WP2_n9399MISFch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV54TFMISRCod ;
   private int AV55TFMISRCod_To ;
   private int AV68GXV1 ;
   private int A9403MISRCod ;
   private int AV71Mantenimientomaquina_wc_tminvstds_2_miscod ;
   private int AV53MISCod ;
   private int AV73Mantenimientomaquina_wc_tminvstds_4_tfmisrcod ;
   private int AV74Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to ;
   private int A9398MISCod ;
   private int AV85GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV58TFMISRStkAct ;
   private java.math.BigDecimal AV59TFMISRStkAct_To ;
   private java.math.BigDecimal AV60TFMISRStkTeo ;
   private java.math.BigDecimal AV61TFMISRStkTeo_To ;
   private java.math.BigDecimal AV62TFMISRStkRea ;
   private java.math.BigDecimal AV63TFMISRStkRea_To ;
   private java.math.BigDecimal AV64TFMISRStkDif ;
   private java.math.BigDecimal AV65TFMISRStkDif_To ;
   private java.math.BigDecimal A9405MISRStkAct ;
   private java.math.BigDecimal A9406MISRStkTeo ;
   private java.math.BigDecimal A9407MISRStkRea ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private java.math.BigDecimal AV77Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ;
   private java.math.BigDecimal AV78Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ;
   private java.math.BigDecimal AV79Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ;
   private java.math.BigDecimal AV80Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ;
   private java.math.BigDecimal AV81Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ;
   private java.math.BigDecimal AV82Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ;
   private java.math.BigDecimal AV83Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ;
   private java.math.BigDecimal AV84Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ;
   private String AV57TFMISRNom_Sel ;
   private String AV56TFMISRNom ;
   private String A9404MISRNom ;
   private String AV70Mantenimientomaquina_wc_tminvstds_1_emprcod ;
   private String AV52EmprCod ;
   private String AV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ;
   private String AV76Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ;
   private String scmdbuf ;
   private String lV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date A9399MISFch ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n9405MISRStkAct ;
   private boolean n9404MISRNom ;
   private boolean n9399MISFch ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext ;
   private String lV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08WP2_A9408MISRStkDif ;
   private java.math.BigDecimal[] P08WP2_A9407MISRStkRea ;
   private java.math.BigDecimal[] P08WP2_A9406MISRStkTeo ;
   private java.math.BigDecimal[] P08WP2_A9405MISRStkAct ;
   private boolean[] P08WP2_n9405MISRStkAct ;
   private String[] P08WP2_A9404MISRNom ;
   private boolean[] P08WP2_n9404MISRNom ;
   private int[] P08WP2_A9403MISRCod ;
   private int[] P08WP2_A9398MISCod ;
   private String[] P08WP2_A396EmprCod ;
   private java.util.Date[] P08WP2_A9399MISFch ;
   private boolean[] P08WP2_n9399MISFch ;
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

final  class wc_tminvstexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext ,
                                          int AV73Mantenimientomaquina_wc_tminvstds_4_tfmisrcod ,
                                          int AV74Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to ,
                                          String AV76Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ,
                                          String AV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ,
                                          java.math.BigDecimal AV77Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ,
                                          java.math.BigDecimal AV78Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ,
                                          java.math.BigDecimal AV79Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ,
                                          java.math.BigDecimal AV80Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ,
                                          java.math.BigDecimal AV81Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ,
                                          java.math.BigDecimal AV82Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ,
                                          java.math.BigDecimal AV83Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ,
                                          java.math.BigDecimal AV84Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ,
                                          int A9403MISRCod ,
                                          String A9404MISRNom ,
                                          java.math.BigDecimal A9405MISRStkAct ,
                                          java.math.BigDecimal A9406MISRStkTeo ,
                                          java.math.BigDecimal A9407MISRStkRea ,
                                          java.math.BigDecimal A9408MISRStkDif ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV70Mantenimientomaquina_wc_tminvstds_1_emprcod ,
                                          int AV71Mantenimientomaquina_wc_tminvstds_2_miscod ,
                                          String A396EmprCod ,
                                          int A9398MISCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MISRStkDif, T1.MISRStkRea, T1.MISRStkTeo, T3.MRStkAct AS MISRStkAct, T3.MRNom AS MISRNom, T1.MISRCod AS MISRCod, T1.MISCod, T1.EmprCod, T2.MISFch FROM" ;
      scmdbuf += " ((TXPMInSRe T1 INNER JOIN TXPMINVST T2 ON T2.EmprCod = T1.EmprCod AND T2.MISCod = T1.MISCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = T1.EmprCod AND T3.MRCod = T1.MISRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MISCod = ?)");
      if ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_wc_tminvstds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MISRCod,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkTeo,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkRea,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkDif,'999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Mantenimientomaquina_wc_tminvstds_4_tfmisrcod) )
      {
         addWhere(sWhereString, "(T1.MISRCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to) )
      {
         addWhere(sWhereString, "(T1.MISRCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Mantenimientomaquina_wc_tminvstds_6_tfmisrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MRNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact)==0) )
      {
         addWhere(sWhereString, "(T3.MRStkAct >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to)==0) )
      {
         addWhere(sWhereString, "(T3.MRStkAct <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkTeo >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkTeo <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkRea >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkRea <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkDif >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkDif <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T2.MISFch" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T3.MRNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T3.MRNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T3.MRStkAct" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T3.MRStkAct DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkTeo" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkTeo DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkRea" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkRea DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkDif" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkDif DESC" ;
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
                  return conditional_P08WP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               return;
      }
   }

}

