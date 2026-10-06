package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class lector__wwexport extends GXProcedure
{
   public lector__wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lector__wwexport.class ), "" );
   }

   public lector__wwexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      lector__wwexport.this.aP1 = new String[] {""};
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
      lector__wwexport.this.aP0 = aP0;
      lector__wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "Lector__WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV34TFLecMaqCod)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFLecMaqCod, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( (0==AV36TFLecBarCod) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFLecBarCod );
      }
      if ( ! ( (0==AV38TFLecBarReo) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "R", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFLecBarReo );
      }
      if ( ! ( (GXutil.strcmp("", AV40TFLecBarPar)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFLecBarPar, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( (0==AV42TFLecOpeCod) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFLecOpeCod );
      }
      if ( ! ( (GXutil.strcmp("", AV44TFlecOpeNom)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFlecOpeNom, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFLecFasCod)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod.Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFLecFasCod, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFLecFasDsc)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFLecFasDsc, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( (0==AV50TFLecFasOrd) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFLecFasOrd );
      }
      if ( ! ( (0==AV52TFLecParCod) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFLecParCod );
      }
      if ( ! ( (GXutil.strcmp("", AV54TFLecParNom)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descrip.Paro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFLecParNom, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFLecHor)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFLecHor, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFLecFec)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60TFLecFec_To)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV59TFLecFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV60TFLecFec_To );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV61TFLecTipEnt)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFLecTipEnt, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( (GXutil.strcmp("", AV65TFLecEstado_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         lector__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
         if ( GXutil.strcmp(GXutil.trim( AV65TFLecEstado_Sel), httpContext.getMessage( "P", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Proceso", "") );
         }
         else if ( GXutil.strcmp(GXutil.trim( AV65TFLecEstado_Sel), httpContext.getMessage( "F", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Finalizadas", "") );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("LectorOptico.Lector__WWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("LectorOptico.Lector__WWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
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
      AV72Lectoroptico_lector__wwds_1_filterfulltext = AV18FilterFullText ;
      AV73Lectoroptico_lector__wwds_2_tflecmaqcod = AV34TFLecMaqCod ;
      AV74Lectoroptico_lector__wwds_3_tflecbarcod = AV36TFLecBarCod ;
      AV75Lectoroptico_lector__wwds_4_tflecbarreo = AV38TFLecBarReo ;
      AV76Lectoroptico_lector__wwds_5_tflecbarpar = AV40TFLecBarPar ;
      AV77Lectoroptico_lector__wwds_6_tflecopecod = AV42TFLecOpeCod ;
      AV78Lectoroptico_lector__wwds_7_tflecopenom = AV44TFlecOpeNom ;
      AV79Lectoroptico_lector__wwds_8_tflecfascod = AV46TFLecFasCod ;
      AV80Lectoroptico_lector__wwds_9_tflecfasdsc = AV48TFLecFasDsc ;
      AV81Lectoroptico_lector__wwds_10_tflecfasord = AV50TFLecFasOrd ;
      AV82Lectoroptico_lector__wwds_11_tflecparcod = AV52TFLecParCod ;
      AV83Lectoroptico_lector__wwds_12_tflecparnom = AV54TFLecParNom ;
      AV84Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV85Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV86Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV87Lectoroptico_lector__wwds_16_tflectipent = AV61TFLecTipEnt ;
      AV88Lectoroptico_lector__wwds_17_tflecestado_sel = AV65TFLecEstado_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV74Lectoroptico_lector__wwds_3_tflecbarcod) ,
                                           Byte.valueOf(AV75Lectoroptico_lector__wwds_4_tflecbarreo) ,
                                           AV76Lectoroptico_lector__wwds_5_tflecbarpar ,
                                           Integer.valueOf(AV77Lectoroptico_lector__wwds_6_tflecopecod) ,
                                           AV79Lectoroptico_lector__wwds_8_tflecfascod ,
                                           Short.valueOf(AV81Lectoroptico_lector__wwds_10_tflecfasord) ,
                                           Short.valueOf(AV82Lectoroptico_lector__wwds_11_tflecparcod) ,
                                           AV84Lectoroptico_lector__wwds_13_tflechor ,
                                           AV85Lectoroptico_lector__wwds_14_tflecfec ,
                                           AV86Lectoroptico_lector__wwds_15_tflecfec_to ,
                                           AV87Lectoroptico_lector__wwds_16_tflectipent ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV72Lectoroptico_lector__wwds_1_filterfulltext ,
                                           A1166LecMaqCod ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           A13722LecEstado ,
                                           AV73Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                           AV78Lectoroptico_lector__wwds_7_tflecopenom ,
                                           AV80Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                           AV83Lectoroptico_lector__wwds_12_tflecparnom ,
                                           AV88Lectoroptico_lector__wwds_17_tflecestado_sel } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Lectoroptico_lector__wwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV73Lectoroptico_lector__wwds_2_tflecmaqcod), 6, "%") ;
      lV76Lectoroptico_lector__wwds_5_tflecbarpar = GXutil.padr( GXutil.rtrim( AV76Lectoroptico_lector__wwds_5_tflecbarpar), 1, "%") ;
      lV79Lectoroptico_lector__wwds_8_tflecfascod = GXutil.padr( GXutil.rtrim( AV79Lectoroptico_lector__wwds_8_tflecfascod), 8, "%") ;
      lV84Lectoroptico_lector__wwds_13_tflechor = GXutil.padr( GXutil.rtrim( AV84Lectoroptico_lector__wwds_13_tflechor), 8, "%") ;
      lV87Lectoroptico_lector__wwds_16_tflectipent = GXutil.padr( GXutil.rtrim( AV87Lectoroptico_lector__wwds_16_tflectipent), 1, "%") ;
      /* Using cursor P0A352 */
      pr_default.execute(0, new Object[] {lV73Lectoroptico_lector__wwds_2_tflecmaqcod, Integer.valueOf(AV74Lectoroptico_lector__wwds_3_tflecbarcod), Byte.valueOf(AV75Lectoroptico_lector__wwds_4_tflecbarreo), lV76Lectoroptico_lector__wwds_5_tflecbarpar, Integer.valueOf(AV77Lectoroptico_lector__wwds_6_tflecopecod), lV79Lectoroptico_lector__wwds_8_tflecfascod, Short.valueOf(AV81Lectoroptico_lector__wwds_10_tflecfasord), Short.valueOf(AV82Lectoroptico_lector__wwds_11_tflecparcod), lV84Lectoroptico_lector__wwds_13_tflechor, AV85Lectoroptico_lector__wwds_14_tflecfec, AV86Lectoroptico_lector__wwds_15_tflecfec_to, lV87Lectoroptico_lector__wwds_16_tflectipent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1796LecTipEnt = P0A352_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P0A352_n1796LecTipEnt[0] ;
         A1173LecHor = P0A352_A1173LecHor[0] ;
         n1173LecHor = P0A352_n1173LecHor[0] ;
         A1166LecMaqCod = P0A352_A1166LecMaqCod[0] ;
         A1174LecFec = P0A352_A1174LecFec[0] ;
         n1174LecFec = P0A352_n1174LecFec[0] ;
         A1188LecFasOrd = P0A352_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P0A352_n1188LecFasOrd[0] ;
         A1169LecBarPar = P0A352_A1169LecBarPar[0] ;
         n1169LecBarPar = P0A352_n1169LecBarPar[0] ;
         A1168LecBarReo = P0A352_A1168LecBarReo[0] ;
         n1168LecBarReo = P0A352_n1168LecBarReo[0] ;
         A1167LecBarCod = P0A352_A1167LecBarCod[0] ;
         n1167LecBarCod = P0A352_n1167LecBarCod[0] ;
         A1170LecOpeCod = P0A352_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P0A352_n1170LecOpeCod[0] ;
         A1171LecFasCod = P0A352_A1171LecFasCod[0] ;
         n1171LecFasCod = P0A352_n1171LecFasCod[0] ;
         A1172LecParCod = P0A352_A1172LecParCod[0] ;
         n1172LecParCod = P0A352_n1172LecParCod[0] ;
         A396EmprCod = P0A352_A396EmprCod[0] ;
         GXt_char4 = A13722LecEstado ;
         GXv_char5[0] = GXt_char4 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char5) ;
         lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
         A13722LecEstado = GXt_char4 ;
         if ( (GXutil.strcmp("", AV88Lectoroptico_lector__wwds_17_tflecestado_sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV88Lectoroptico_lector__wwds_17_tflecestado_sel) == 0 ) ) )
         {
            GXt_char4 = A14259lecOpeNom ;
            GXv_char5[0] = GXt_char4 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char5) ;
            lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
            A14259lecOpeNom = GXt_char4 ;
            if ( (GXutil.strcmp("", AV78Lectoroptico_lector__wwds_7_tflecopenom)==0) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_7_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               GXt_char4 = A14260LecFasDsc ;
               GXv_char5[0] = GXt_char4 ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char5) ;
               lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
               A14260LecFasDsc = GXt_char4 ;
               if ( (GXutil.strcmp("", AV80Lectoroptico_lector__wwds_9_tflecfasdsc)==0) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV80Lectoroptico_lector__wwds_9_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
               {
                  GXt_char4 = A14261LecParNom ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char5) ;
                  lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                  A14261LecParNom = GXt_char4 ;
                  if ( (GXutil.strcmp("", AV72Lectoroptico_lector__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1167LecBarCod, 8, 0) , GXutil.padr( "%" + AV72Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1168LecBarReo, 1, 0) , GXutil.padr( "%" + AV72Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1169LecBarPar) , GXutil.padr( "%" + GXutil.upper( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV72Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV72Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV72Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV72Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                  {
                     if ( (GXutil.strcmp("", AV83Lectoroptico_lector__wwds_12_tflecparnom)==0) || ( GXutil.like( GXutil.trim( GXutil.upper( A14261LecParNom)) , GXutil.padr( "%" + GXutil.trim( GXutil.upper( AV83Lectoroptico_lector__wwds_12_tflecparnom)) , 1 , "%"),  ' ' ) ) )
                     {
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
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1166LecMaqCod, GXv_char5) ;
                           lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1167LecBarCod );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1168LecBarReo );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1169LecBarPar, GXv_char5) ;
                           lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1170LecOpeCod );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14259lecOpeNom, GXv_char5) ;
                           lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1171LecFasCod, GXv_char5) ;
                           lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14260LecFasDsc, GXv_char5) ;
                           lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1188LecFasOrd );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1172LecParCod );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14261LecParNom, GXv_char5) ;
                           lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1173LecHor, GXv_char5) ;
                           lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_dtime6 = GXutil.resetTime( A1174LecFec );
                           AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1796LecTipEnt, GXv_char5) ;
                           lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
                           if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), httpContext.getMessage( "P", "")) == 0 )
                           {
                              AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Proceso", "") );
                           }
                           else if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), httpContext.getMessage( "F", "")) == 0 )
                           {
                              AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Finalizadas", "") );
                           }
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
                     }
                  }
               }
            }
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecMaqCod", "", "Maquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecBarCod", "", "Nº Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecBarReo", "", "R", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecBarPar", "", "P", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecOpeCod", "", "Operario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "lecOpeNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecFasCod", "", "Cod.Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecFasDsc", "", "Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecFasOrd", "", "Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecParCod", "", "Paro", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecParNom", "", "Descrip.Paro", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecHor", "", "Hora", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecFec", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecTipEnt", "", "Tipo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "LecEstado", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "LectorOptico.Lector__WWColumnsSelector", GXv_char5) ;
      lector__wwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("LectorOptico.Lector__WWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "LectorOptico.Lector__WWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("LectorOptico.Lector__WWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV89GXV2 = 1 ;
      while ( AV89GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV34TFLecMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARCOD") == 0 )
         {
            AV36TFLecBarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARREO") == 0 )
         {
            AV38TFLecBarReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARPAR") == 0 )
         {
            AV40TFLecBarPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV42TFLecOpeCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV44TFlecOpeNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV46TFLecFasCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV48TFLecFasDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV50TFLecFasOrd = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV52TFLecParCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV54TFLecParNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV57TFLecHor = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV59TFLecFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV60TFLecFec_To = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV61TFLecTipEnt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV65TFLecEstado_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV89GXV2 = (int)(AV89GXV2+1) ;
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
      this.aP0[0] = lector__wwexport.this.AV11Filename;
      this.aP1[0] = lector__wwexport.this.AV12ErrorMessage;
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
      AV34TFLecMaqCod = "" ;
      AV40TFLecBarPar = "" ;
      AV44TFlecOpeNom = "" ;
      AV46TFLecFasCod = "" ;
      AV48TFLecFasDsc = "" ;
      AV54TFLecParNom = "" ;
      AV57TFLecHor = "" ;
      AV59TFLecFec = GXutil.nullDate() ;
      AV60TFLecFec_To = GXutil.nullDate() ;
      AV61TFLecTipEnt = "" ;
      AV65TFLecEstado_Sel = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A14259lecOpeNom = "" ;
      A1171LecFasCod = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      A13722LecEstado = "" ;
      AV72Lectoroptico_lector__wwds_1_filterfulltext = "" ;
      AV73Lectoroptico_lector__wwds_2_tflecmaqcod = "" ;
      AV76Lectoroptico_lector__wwds_5_tflecbarpar = "" ;
      AV78Lectoroptico_lector__wwds_7_tflecopenom = "" ;
      AV79Lectoroptico_lector__wwds_8_tflecfascod = "" ;
      AV80Lectoroptico_lector__wwds_9_tflecfasdsc = "" ;
      AV83Lectoroptico_lector__wwds_12_tflecparnom = "" ;
      AV84Lectoroptico_lector__wwds_13_tflechor = "" ;
      AV85Lectoroptico_lector__wwds_14_tflecfec = GXutil.nullDate() ;
      AV86Lectoroptico_lector__wwds_15_tflecfec_to = GXutil.nullDate() ;
      AV87Lectoroptico_lector__wwds_16_tflectipent = "" ;
      AV88Lectoroptico_lector__wwds_17_tflecestado_sel = "" ;
      scmdbuf = "" ;
      lV73Lectoroptico_lector__wwds_2_tflecmaqcod = "" ;
      lV76Lectoroptico_lector__wwds_5_tflecbarpar = "" ;
      lV79Lectoroptico_lector__wwds_8_tflecfascod = "" ;
      lV84Lectoroptico_lector__wwds_13_tflechor = "" ;
      lV87Lectoroptico_lector__wwds_16_tflectipent = "" ;
      P0A352_A1796LecTipEnt = new String[] {""} ;
      P0A352_n1796LecTipEnt = new boolean[] {false} ;
      P0A352_A1173LecHor = new String[] {""} ;
      P0A352_n1173LecHor = new boolean[] {false} ;
      P0A352_A1166LecMaqCod = new String[] {""} ;
      P0A352_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A352_n1174LecFec = new boolean[] {false} ;
      P0A352_A1188LecFasOrd = new short[1] ;
      P0A352_n1188LecFasOrd = new boolean[] {false} ;
      P0A352_A1169LecBarPar = new String[] {""} ;
      P0A352_n1169LecBarPar = new boolean[] {false} ;
      P0A352_A1168LecBarReo = new byte[1] ;
      P0A352_n1168LecBarReo = new boolean[] {false} ;
      P0A352_A1167LecBarCod = new int[1] ;
      P0A352_n1167LecBarCod = new boolean[] {false} ;
      P0A352_A1170LecOpeCod = new int[1] ;
      P0A352_n1170LecOpeCod = new boolean[] {false} ;
      P0A352_A1171LecFasCod = new String[] {""} ;
      P0A352_n1171LecFasCod = new boolean[] {false} ;
      P0A352_A1172LecParCod = new short[1] ;
      P0A352_n1172LecParCod = new boolean[] {false} ;
      P0A352_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector__wwexport__default(),
         new Object[] {
             new Object[] {
            P0A352_A1796LecTipEnt, P0A352_n1796LecTipEnt, P0A352_A1173LecHor, P0A352_n1173LecHor, P0A352_A1166LecMaqCod, P0A352_A1174LecFec, P0A352_n1174LecFec, P0A352_A1188LecFasOrd, P0A352_n1188LecFasOrd, P0A352_A1169LecBarPar,
            P0A352_n1169LecBarPar, P0A352_A1168LecBarReo, P0A352_n1168LecBarReo, P0A352_A1167LecBarCod, P0A352_n1167LecBarCod, P0A352_A1170LecOpeCod, P0A352_n1170LecOpeCod, P0A352_A1171LecFasCod, P0A352_n1171LecFasCod, P0A352_A1172LecParCod,
            P0A352_n1172LecParCod, P0A352_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38TFLecBarReo ;
   private byte A1168LecBarReo ;
   private byte AV75Lectoroptico_lector__wwds_4_tflecbarreo ;
   private short AV50TFLecFasOrd ;
   private short AV52TFLecParCod ;
   private short GXv_int3[] ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV81Lectoroptico_lector__wwds_10_tflecfasord ;
   private short AV82Lectoroptico_lector__wwds_11_tflecparcod ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV36TFLecBarCod ;
   private int AV42TFLecOpeCod ;
   private int AV70GXV1 ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int AV74Lectoroptico_lector__wwds_3_tflecbarcod ;
   private int AV77Lectoroptico_lector__wwds_6_tflecopecod ;
   private int AV89GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV34TFLecMaqCod ;
   private String AV40TFLecBarPar ;
   private String AV44TFlecOpeNom ;
   private String AV46TFLecFasCod ;
   private String AV48TFLecFasDsc ;
   private String AV54TFLecParNom ;
   private String AV57TFLecHor ;
   private String AV61TFLecTipEnt ;
   private String AV65TFLecEstado_Sel ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A14259lecOpeNom ;
   private String A1171LecFasCod ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String A1173LecHor ;
   private String A1796LecTipEnt ;
   private String A13722LecEstado ;
   private String AV73Lectoroptico_lector__wwds_2_tflecmaqcod ;
   private String AV76Lectoroptico_lector__wwds_5_tflecbarpar ;
   private String AV78Lectoroptico_lector__wwds_7_tflecopenom ;
   private String AV79Lectoroptico_lector__wwds_8_tflecfascod ;
   private String AV80Lectoroptico_lector__wwds_9_tflecfasdsc ;
   private String AV83Lectoroptico_lector__wwds_12_tflecparnom ;
   private String AV84Lectoroptico_lector__wwds_13_tflechor ;
   private String AV87Lectoroptico_lector__wwds_16_tflectipent ;
   private String AV88Lectoroptico_lector__wwds_17_tflecestado_sel ;
   private String scmdbuf ;
   private String lV73Lectoroptico_lector__wwds_2_tflecmaqcod ;
   private String lV76Lectoroptico_lector__wwds_5_tflecbarpar ;
   private String lV79Lectoroptico_lector__wwds_8_tflecfascod ;
   private String lV84Lectoroptico_lector__wwds_13_tflechor ;
   private String lV87Lectoroptico_lector__wwds_16_tflectipent ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV59TFLecFec ;
   private java.util.Date AV60TFLecFec_To ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV85Lectoroptico_lector__wwds_14_tflecfec ;
   private java.util.Date AV86Lectoroptico_lector__wwds_15_tflecfec_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1796LecTipEnt ;
   private boolean n1173LecHor ;
   private boolean n1174LecFec ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV72Lectoroptico_lector__wwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A352_A1796LecTipEnt ;
   private boolean[] P0A352_n1796LecTipEnt ;
   private String[] P0A352_A1173LecHor ;
   private boolean[] P0A352_n1173LecHor ;
   private String[] P0A352_A1166LecMaqCod ;
   private java.util.Date[] P0A352_A1174LecFec ;
   private boolean[] P0A352_n1174LecFec ;
   private short[] P0A352_A1188LecFasOrd ;
   private boolean[] P0A352_n1188LecFasOrd ;
   private String[] P0A352_A1169LecBarPar ;
   private boolean[] P0A352_n1169LecBarPar ;
   private byte[] P0A352_A1168LecBarReo ;
   private boolean[] P0A352_n1168LecBarReo ;
   private int[] P0A352_A1167LecBarCod ;
   private boolean[] P0A352_n1167LecBarCod ;
   private int[] P0A352_A1170LecOpeCod ;
   private boolean[] P0A352_n1170LecOpeCod ;
   private String[] P0A352_A1171LecFasCod ;
   private boolean[] P0A352_n1171LecFasCod ;
   private short[] P0A352_A1172LecParCod ;
   private boolean[] P0A352_n1172LecParCod ;
   private String[] P0A352_A396EmprCod ;
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

final  class lector__wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A352( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV74Lectoroptico_lector__wwds_3_tflecbarcod ,
                                          byte AV75Lectoroptico_lector__wwds_4_tflecbarreo ,
                                          String AV76Lectoroptico_lector__wwds_5_tflecbarpar ,
                                          int AV77Lectoroptico_lector__wwds_6_tflecopecod ,
                                          String AV79Lectoroptico_lector__wwds_8_tflecfascod ,
                                          short AV81Lectoroptico_lector__wwds_10_tflecfasord ,
                                          short AV82Lectoroptico_lector__wwds_11_tflecparcod ,
                                          String AV84Lectoroptico_lector__wwds_13_tflechor ,
                                          java.util.Date AV85Lectoroptico_lector__wwds_14_tflecfec ,
                                          java.util.Date AV86Lectoroptico_lector__wwds_15_tflecfec_to ,
                                          String AV87Lectoroptico_lector__wwds_16_tflectipent ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV72Lectoroptico_lector__wwds_1_filterfulltext ,
                                          String A1166LecMaqCod ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String A13722LecEstado ,
                                          String AV73Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                          String AV78Lectoroptico_lector__wwds_7_tflecopenom ,
                                          String AV80Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                          String AV83Lectoroptico_lector__wwds_12_tflecparnom ,
                                          String AV88Lectoroptico_lector__wwds_17_tflecestado_sel )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[12];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecHor, LecMaqCod, LecFec, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      addWhere(sWhereString, "(RTRIM(LTRIM(LOWER(LecMaqCod))) like '%' || RTRIM(LTRIM(LOWER(?))))");
      if ( ! (0==AV74Lectoroptico_lector__wwds_3_tflecbarcod) )
      {
         addWhere(sWhereString, "(LecBarCod = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (0==AV75Lectoroptico_lector__wwds_4_tflecbarreo) )
      {
         addWhere(sWhereString, "(LecBarReo = ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Lectoroptico_lector__wwds_5_tflecbarpar)==0) )
      {
         addWhere(sWhereString, "(LecBarPar like '%' || RTRIM(LTRIM(LOWER(?))))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Lectoroptico_lector__wwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Lectoroptico_lector__wwds_8_tflecfascod)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(UPPER(LecFasCod))) like '%' || RTRIM(LTRIM(UPPER(?))))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_lector__wwds_10_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV82Lectoroptico_lector__wwds_11_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Lectoroptico_lector__wwds_13_tflechor)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Lectoroptico_lector__wwds_14_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Lectoroptico_lector__wwds_15_tflecfec_to)) )
      {
         addWhere(sWhereString, "(LecFec <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Lectoroptico_lector__wwds_16_tflectipent)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecMaqCod, EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarReo" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarPar" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarPar DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
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
                  return conditional_P0A352(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A352", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
      }
   }

}

