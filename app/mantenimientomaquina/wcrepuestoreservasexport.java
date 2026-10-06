package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrepuestoreservasexport extends GXProcedure
{
   public wcrepuestoreservasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrepuestoreservasexport.class ), "" );
   }

   public wcrepuestoreservasexport( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcrepuestoreservasexport.this.aP1 = new String[] {""};
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
      wcrepuestoreservasexport.this.aP0 = aP0;
      wcrepuestoreservasexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCRepuestoReservasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21FilterFullText, GXv_char5) ;
      wcrepuestoreservasexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV41TFMRRes) && (0==AV42TFMRRes_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reserva", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV41TFMRRes );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV42TFMRRes_To );
      }
      if ( ! ( (0==AV43TFMRResOrd) && (0==AV44TFMRResOrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFMRResOrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFMRResOrd_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV53TFMRResFch) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV53TFMRResFch );
      }
      if ( ! ( (0==AV45TFMRResTpo) && (0==AV46TFMRResTpo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFMRResTpo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFMRResTpo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFMRResTpoD_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desc Tipo Movimiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFMRResTpoD_Sel, GXv_char5) ;
         wcrepuestoreservasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFMRResTpoD)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desc Tipo Movimiento", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFMRResTpoD, GXv_char5) ;
            wcrepuestoreservasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFMRResDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFMRResDsc_Sel, GXv_char5) ;
         wcrepuestoreservasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFMRResDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFMRResDsc, GXv_char5) ;
            wcrepuestoreservasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMRResCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMRResCnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFMRResCnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrepuestoreservasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFMRResCnt_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV22Session.getValue("MantenimientoMaquina.WCRepuestoReservasColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV22Session.getValue("MantenimientoMaquina.WCRepuestoReservasColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV58GXV1));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Mantenimientomaquina_wcrepuestoreservasds_1_emprcod = AV16EmprCod ;
      AV61Mantenimientomaquina_wcrepuestoreservasds_2_mrcod = AV17MrCod ;
      AV62Mantenimientomaquina_wcrepuestoreservasds_3_mrnom = AV18MRNom ;
      AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = AV21FilterFullText ;
      AV64Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres = AV41TFMRRes ;
      AV65Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to = AV42TFMRRes_To ;
      AV66Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord = AV43TFMRResOrd ;
      AV67Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to = AV44TFMRResOrd_To ;
      AV68Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch = AV53TFMRResFch ;
      AV69Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo = AV45TFMRResTpo ;
      AV70Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to = AV46TFMRResTpo_To ;
      AV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = AV47TFMRResTpoD ;
      AV72Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel = AV48TFMRResTpoD_Sel ;
      AV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = AV49TFMRResDsc ;
      AV74Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel = AV50TFMRResDsc_Sel ;
      AV75Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt = AV51TFMRResCnt ;
      AV76Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to = AV52TFMRResCnt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ,
                                           Long.valueOf(AV64Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres) ,
                                           Long.valueOf(AV65Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to) ,
                                           Integer.valueOf(AV66Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord) ,
                                           Integer.valueOf(AV67Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to) ,
                                           AV68Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch ,
                                           Integer.valueOf(AV69Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo) ,
                                           Integer.valueOf(AV70Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to) ,
                                           AV72Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                           AV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ,
                                           AV74Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                           AV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ,
                                           AV75Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt ,
                                           AV76Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to ,
                                           Long.valueOf(A9510MRRes) ,
                                           Integer.valueOf(A9511MRResOrd) ,
                                           Integer.valueOf(A9513MRResTpo) ,
                                           A9514MRResTpoD ,
                                           A9515MRResDsc ,
                                           A9516MRResCnt ,
                                           A9512MRResFch ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           A9493MRNom ,
                                           AV62Mantenimientomaquina_wcrepuestoreservasds_3_mrnom ,
                                           A396EmprCod ,
                                           AV16EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV17MrCod) ,
                                           AV60Mantenimientomaquina_wcrepuestoreservasds_1_emprcod ,
                                           Integer.valueOf(AV61Mantenimientomaquina_wcrepuestoreservasds_2_mrcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = GXutil.padr( GXutil.rtrim( AV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod), 30, "%") ;
      lV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = GXutil.padr( GXutil.rtrim( AV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc), 50, "%") ;
      /* Using cursor P08VV2 */
      pr_default.execute(0, new Object[] {AV60Mantenimientomaquina_wcrepuestoreservasds_1_emprcod, Integer.valueOf(AV61Mantenimientomaquina_wcrepuestoreservasds_2_mrcod), AV62Mantenimientomaquina_wcrepuestoreservasds_3_mrnom, AV16EmprCod, Integer.valueOf(AV17MrCod), lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, Long.valueOf(AV64Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres), Long.valueOf(AV65Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to), Integer.valueOf(AV66Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord), Integer.valueOf(AV67Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to), AV68Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch, Integer.valueOf(AV69Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo), Integer.valueOf(AV70Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to), lV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod, AV72Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel, lV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc, AV74Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel, AV75Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt, AV76Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9516MRResCnt = P08VV2_A9516MRResCnt[0] ;
         A9515MRResDsc = P08VV2_A9515MRResDsc[0] ;
         A9514MRResTpoD = P08VV2_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08VV2_n9514MRResTpoD[0] ;
         A9513MRResTpo = P08VV2_A9513MRResTpo[0] ;
         A9512MRResFch = P08VV2_A9512MRResFch[0] ;
         A9511MRResOrd = P08VV2_A9511MRResOrd[0] ;
         A9510MRRes = P08VV2_A9510MRRes[0] ;
         A9493MRNom = P08VV2_A9493MRNom[0] ;
         n9493MRNom = P08VV2_n9493MRNom[0] ;
         A9492MRCod = P08VV2_A9492MRCod[0] ;
         A396EmprCod = P08VV2_A396EmprCod[0] ;
         A9493MRNom = P08VV2_A9493MRNom[0] ;
         n9493MRNom = P08VV2_n9493MRNom[0] ;
         A9514MRResTpoD = P08VV2_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08VV2_n9514MRResTpoD[0] ;
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
         AV34VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A9510MRRes );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A9511MRResOrd );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( A9512MRResFch );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A9513MRResTpo );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9514MRResTpoD, GXv_char5) ;
            wcrepuestoreservasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9515MRResDsc, GXv_char5) ;
            wcrepuestoreservasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9516MRResCnt)) );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRRes", "", "Reserva", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRResOrd", "", "Orden", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRResFch", "", "Fecha", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRResTpo", "", "Tipo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRResTpoD", "", "Desc Tipo Movimiento", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRResDsc", "", "Descripción", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRResCnt", "", "Cantidad", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.WCRepuestoReservasColumnsSelector", GXv_char5) ;
      wcrepuestoreservasexport.this.GXt_char4 = GXv_char5[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue("MantenimientoMaquina.WCRepuestoReservasGridState"), "") == 0 )
      {
         AV24GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WCRepuestoReservasGridState"), null, null);
      }
      else
      {
         AV24GridState.fromxml(AV22Session.getValue("MantenimientoMaquina.WCRepuestoReservasGridState"), null, null);
      }
      AV19OrderedBy = AV24GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV20OrderedDsc = AV24GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV2 = 1 ;
      while ( AV77GXV2 <= AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV25GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV2));
         if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRES") == 0 )
         {
            AV41TFMRRes = GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV42TFMRRes_To = GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESORD") == 0 )
         {
            AV43TFMRResOrd = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFMRResOrd_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESFCH") == 0 )
         {
            AV53TFMRResFch = localUtil.ctot( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPO") == 0 )
         {
            AV45TFMRResTpo = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFMRResTpo_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPOD") == 0 )
         {
            AV47TFMRResTpoD = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPOD_SEL") == 0 )
         {
            AV48TFMRResTpoD_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESDSC") == 0 )
         {
            AV49TFMRResDsc = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESDSC_SEL") == 0 )
         {
            AV50TFMRResDsc_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESCNT") == 0 )
         {
            AV51TFMRResCnt = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFMRResCnt_To = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRCOD") == 0 )
         {
            AV17MrCod = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRNOM") == 0 )
         {
            AV18MRNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV77GXV2 = (int)(AV77GXV2+1) ;
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
      this.aP0[0] = wcrepuestoreservasexport.this.AV11Filename;
      this.aP1[0] = wcrepuestoreservasexport.this.AV12ErrorMessage;
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
      AV21FilterFullText = "" ;
      AV53TFMRResFch = GXutil.resetTime( GXutil.nullDate() );
      AV48TFMRResTpoD_Sel = "" ;
      AV47TFMRResTpoD = "" ;
      AV50TFMRResDsc_Sel = "" ;
      AV49TFMRResDsc = "" ;
      AV51TFMRResCnt = DecimalUtil.ZERO ;
      AV52TFMRResCnt_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV22Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      A9514MRResTpoD = "" ;
      A9515MRResDsc = "" ;
      A9516MRResCnt = DecimalUtil.ZERO ;
      AV60Mantenimientomaquina_wcrepuestoreservasds_1_emprcod = "" ;
      AV16EmprCod = "" ;
      AV62Mantenimientomaquina_wcrepuestoreservasds_3_mrnom = "" ;
      AV18MRNom = "" ;
      AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = "" ;
      AV68Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch = GXutil.resetTime( GXutil.nullDate() );
      AV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = "" ;
      AV72Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel = "" ;
      AV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = "" ;
      AV74Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel = "" ;
      AV75Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt = DecimalUtil.ZERO ;
      AV76Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = "" ;
      lV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = "" ;
      lV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = "" ;
      A9493MRNom = "" ;
      A396EmprCod = "" ;
      P08VV2_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VV2_A9515MRResDsc = new String[] {""} ;
      P08VV2_A9514MRResTpoD = new String[] {""} ;
      P08VV2_n9514MRResTpoD = new boolean[] {false} ;
      P08VV2_A9513MRResTpo = new int[1] ;
      P08VV2_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08VV2_A9511MRResOrd = new int[1] ;
      P08VV2_A9510MRRes = new long[1] ;
      P08VV2_A9493MRNom = new String[] {""} ;
      P08VV2_n9493MRNom = new boolean[] {false} ;
      P08VV2_A9492MRCod = new int[1] ;
      P08VV2_A396EmprCod = new String[] {""} ;
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV24GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wcrepuestoreservasexport__default(),
         new Object[] {
             new Object[] {
            P08VV2_A9516MRResCnt, P08VV2_A9515MRResDsc, P08VV2_A9514MRResTpoD, P08VV2_n9514MRResTpoD, P08VV2_A9513MRResTpo, P08VV2_A9512MRResFch, P08VV2_A9511MRResOrd, P08VV2_A9510MRRes, P08VV2_A9493MRNom, P08VV2_n9493MRNom,
            P08VV2_A9492MRCod, P08VV2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV19OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV43TFMRResOrd ;
   private int AV44TFMRResOrd_To ;
   private int AV45TFMRResTpo ;
   private int AV46TFMRResTpo_To ;
   private int AV58GXV1 ;
   private int A9511MRResOrd ;
   private int A9513MRResTpo ;
   private int AV61Mantenimientomaquina_wcrepuestoreservasds_2_mrcod ;
   private int AV17MrCod ;
   private int AV66Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord ;
   private int AV67Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to ;
   private int AV69Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo ;
   private int AV70Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to ;
   private int A9492MRCod ;
   private int AV77GXV2 ;
   private long AV41TFMRRes ;
   private long AV42TFMRRes_To ;
   private long AV34VisibleColumnCount ;
   private long A9510MRRes ;
   private long AV64Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres ;
   private long AV65Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to ;
   private java.math.BigDecimal AV51TFMRResCnt ;
   private java.math.BigDecimal AV52TFMRResCnt_To ;
   private java.math.BigDecimal A9516MRResCnt ;
   private java.math.BigDecimal AV75Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt ;
   private java.math.BigDecimal AV76Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to ;
   private String AV48TFMRResTpoD_Sel ;
   private String AV47TFMRResTpoD ;
   private String AV50TFMRResDsc_Sel ;
   private String AV49TFMRResDsc ;
   private String A9514MRResTpoD ;
   private String A9515MRResDsc ;
   private String AV60Mantenimientomaquina_wcrepuestoreservasds_1_emprcod ;
   private String AV16EmprCod ;
   private String AV62Mantenimientomaquina_wcrepuestoreservasds_3_mrnom ;
   private String AV18MRNom ;
   private String AV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ;
   private String AV72Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel ;
   private String AV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ;
   private String AV74Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel ;
   private String scmdbuf ;
   private String lV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ;
   private String lV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ;
   private String A9493MRNom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV53TFMRResFch ;
   private java.util.Date A9512MRResFch ;
   private java.util.Date AV68Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch ;
   private boolean returnInSub ;
   private boolean AV20OrderedDsc ;
   private boolean n9514MRResTpoD ;
   private boolean n9493MRNom ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV21FilterFullText ;
   private String AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ;
   private String lV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08VV2_A9516MRResCnt ;
   private String[] P08VV2_A9515MRResDsc ;
   private String[] P08VV2_A9514MRResTpoD ;
   private boolean[] P08VV2_n9514MRResTpoD ;
   private int[] P08VV2_A9513MRResTpo ;
   private java.util.Date[] P08VV2_A9512MRResFch ;
   private int[] P08VV2_A9511MRResOrd ;
   private long[] P08VV2_A9510MRRes ;
   private String[] P08VV2_A9493MRNom ;
   private boolean[] P08VV2_n9493MRNom ;
   private int[] P08VV2_A9492MRCod ;
   private String[] P08VV2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV24GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV25GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
}

final  class wcrepuestoreservasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ,
                                          long AV64Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres ,
                                          long AV65Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to ,
                                          int AV66Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord ,
                                          int AV67Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to ,
                                          java.util.Date AV68Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch ,
                                          int AV69Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo ,
                                          int AV70Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to ,
                                          String AV72Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                          String AV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ,
                                          String AV74Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                          String AV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ,
                                          java.math.BigDecimal AV75Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt ,
                                          java.math.BigDecimal AV76Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to ,
                                          long A9510MRRes ,
                                          int A9511MRResOrd ,
                                          int A9513MRResTpo ,
                                          String A9514MRResTpoD ,
                                          String A9515MRResDsc ,
                                          java.math.BigDecimal A9516MRResCnt ,
                                          java.util.Date A9512MRResFch ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String A9493MRNom ,
                                          String AV62Mantenimientomaquina_wcrepuestoreservasds_3_mrnom ,
                                          String A396EmprCod ,
                                          String AV16EmprCod ,
                                          int A9492MRCod ,
                                          int AV17MrCod ,
                                          String AV60Mantenimientomaquina_wcrepuestoreservasds_1_emprcod ,
                                          int AV61Mantenimientomaquina_wcrepuestoreservasds_2_mrcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MRResCnt, T1.MRResDsc, T3.MTMovNom AS MRResTpoD, T1.MRResTpo AS MRResTpo, T1.MRResFch, T1.MRResOrd, T1.MRRes, T2.MRNom, T1.MRCod, T1.EmprCod FROM ((TXPMReRes" ;
      scmdbuf += " T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod = T1.MRResTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRRes,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRResDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRResCnt,'999990.999'), 2) like '%' || ?))");
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
      if ( ! (0==AV64Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres) )
      {
         addWhere(sWhereString, "(T1.MRRes >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV65Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to) )
      {
         addWhere(sWhereString, "(T1.MRRes <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord) )
      {
         addWhere(sWhereString, "(T1.MRResOrd >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV67Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to) )
      {
         addWhere(sWhereString, "(T1.MRResOrd <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch) )
      {
         addWhere(sWhereString, "(T1.MRResFch >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV69Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo) )
      {
         addWhere(sWhereString, "(T1.MRResTpo >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV70Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to) )
      {
         addWhere(sWhereString, "(T1.MRResTpo <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel)==0) && ( ! (GXutil.strcmp("", AV71Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRResDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRResDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV19OrderedBy == 1 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRRes" ;
      }
      else if ( ( AV19OrderedBy == 1 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRRes DESC" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResOrd" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResOrd DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResFch" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResFch DESC" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResTpo" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResTpo DESC" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T3.MTMovNom" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T3.MTMovNom DESC" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResDsc" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResDsc DESC" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResCnt" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResCnt DESC" ;
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
                  return conditional_P08VV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 50);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 50);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               return;
      }
   }

}

