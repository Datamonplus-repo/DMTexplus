package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetasdeacabado05_wcexport extends GXProcedure
{
   public recetasdeacabado05_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado05_wcexport.class ), "" );
   }

   public recetasdeacabado05_wcexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      recetasdeacabado05_wcexport.this.aP1 = new String[] {""};
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
      recetasdeacabado05_wcexport.this.aP0 = aP0;
      recetasdeacabado05_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "RecetasdeAcabado05_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV36TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFBarNHdr_Sel, GXv_char5) ;
         recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV35TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFBarNHdr, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV37TFRecLinMaq) && (0==AV38TFRecLinMaq_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV37TFRecLinMaq );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV38TFRecLinMaq_To );
      }
      if ( ! ( (0==AV39TFBarSit) && (0==AV40TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Situacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV39TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV40TFBarSit_To );
      }
      if ( ! ( (GXutil.strcmp("", AV42TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarSer_Sel, GXv_char5) ;
         recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFBarSer, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarSerDsc_Sel, GXv_char5) ;
         recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarSerDsc, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV46TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFMaqCod_Sel, GXv_char5) ;
         recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFMaqCod, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV47TFRecVolPrd) && (0==AV48TFRecVolPrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV47TFRecVolPrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV48TFRecVolPrd_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV49TFRecFecAlt) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Alta Receta", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetasdeacabado05_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV49TFRecFecAlt );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("RecetasdeAcabado05_WCColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV19Session.getValue("RecetasdeAcabado05_WCColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV59GXV1));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61Recetasdeacabado05_wcds_1_filterfulltext = AV18FilterFullText ;
      AV62Recetasdeacabado05_wcds_2_tfbarnhdr = AV35TFBarNHdr ;
      AV63Recetasdeacabado05_wcds_3_tfbarnhdr_sel = AV36TFBarNHdr_Sel ;
      AV64Recetasdeacabado05_wcds_4_tfreclinmaq = AV37TFRecLinMaq ;
      AV65Recetasdeacabado05_wcds_5_tfreclinmaq_to = AV38TFRecLinMaq_To ;
      AV66Recetasdeacabado05_wcds_6_tfbarsit = AV39TFBarSit ;
      AV67Recetasdeacabado05_wcds_7_tfbarsit_to = AV40TFBarSit_To ;
      AV68Recetasdeacabado05_wcds_8_tfbarser = AV41TFBarSer ;
      AV69Recetasdeacabado05_wcds_9_tfbarser_sel = AV42TFBarSer_Sel ;
      AV70Recetasdeacabado05_wcds_10_tfbarserdsc = AV43TFBarSerDsc ;
      AV71Recetasdeacabado05_wcds_11_tfbarserdsc_sel = AV44TFBarSerDsc_Sel ;
      AV72Recetasdeacabado05_wcds_12_tfmaqcod = AV45TFMaqCod ;
      AV73Recetasdeacabado05_wcds_13_tfmaqcod_sel = AV46TFMaqCod_Sel ;
      AV74Recetasdeacabado05_wcds_14_tfrecvolprd = AV47TFRecVolPrd ;
      AV75Recetasdeacabado05_wcds_15_tfrecvolprd_to = AV48TFRecVolPrd_To ;
      AV76Recetasdeacabado05_wcds_16_tfrecfecalt = AV49TFRecFecAlt ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Recetasdeacabado05_wcds_1_filterfulltext ,
                                           AV63Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                           AV62Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV64Recetasdeacabado05_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV65Recetasdeacabado05_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV66Recetasdeacabado05_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV67Recetasdeacabado05_wcds_7_tfbarsit_to) ,
                                           AV69Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                           AV68Recetasdeacabado05_wcds_8_tfbarser ,
                                           AV71Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                           AV70Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                           AV73Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                           AV72Recetasdeacabado05_wcds_12_tfmaqcod ,
                                           Integer.valueOf(AV74Recetasdeacabado05_wcds_14_tfrecvolprd) ,
                                           Integer.valueOf(AV75Recetasdeacabado05_wcds_15_tfrecvolprd_to) ,
                                           AV76Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           Integer.valueOf(AV53Barcod) ,
                                           Byte.valueOf(AV54Barcodreo) ,
                                           AV55Barcodpar ,
                                           A6039RecAcab ,
                                           AV52Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV61Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV61Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV61Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV61Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV61Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV61Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV62Recetasdeacabado05_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Recetasdeacabado05_wcds_2_tfbarnhdr), 11, "%") ;
      lV68Recetasdeacabado05_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV68Recetasdeacabado05_wcds_8_tfbarser), 16, "%") ;
      lV70Recetasdeacabado05_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Recetasdeacabado05_wcds_10_tfbarserdsc), 26, "%") ;
      lV72Recetasdeacabado05_wcds_12_tfmaqcod = GXutil.padr( GXutil.rtrim( AV72Recetasdeacabado05_wcds_12_tfmaqcod), 6, "%") ;
      /* Using cursor P09BM2 */
      pr_default.execute(0, new Object[] {AV52Emprcod, Integer.valueOf(AV53Barcod), Integer.valueOf(AV53Barcod), Byte.valueOf(AV54Barcodreo), Byte.valueOf(AV54Barcodreo), AV55Barcodpar, AV55Barcodpar, lV61Recetasdeacabado05_wcds_1_filterfulltext, lV61Recetasdeacabado05_wcds_1_filterfulltext, lV61Recetasdeacabado05_wcds_1_filterfulltext, lV61Recetasdeacabado05_wcds_1_filterfulltext, lV61Recetasdeacabado05_wcds_1_filterfulltext, lV61Recetasdeacabado05_wcds_1_filterfulltext, lV61Recetasdeacabado05_wcds_1_filterfulltext, lV62Recetasdeacabado05_wcds_2_tfbarnhdr, AV63Recetasdeacabado05_wcds_3_tfbarnhdr_sel, Short.valueOf(AV64Recetasdeacabado05_wcds_4_tfreclinmaq), Short.valueOf(AV65Recetasdeacabado05_wcds_5_tfreclinmaq_to), Byte.valueOf(AV66Recetasdeacabado05_wcds_6_tfbarsit), Byte.valueOf(AV67Recetasdeacabado05_wcds_7_tfbarsit_to), lV68Recetasdeacabado05_wcds_8_tfbarser, AV69Recetasdeacabado05_wcds_9_tfbarser_sel, lV70Recetasdeacabado05_wcds_10_tfbarserdsc, AV71Recetasdeacabado05_wcds_11_tfbarserdsc_sel, lV72Recetasdeacabado05_wcds_12_tfmaqcod, AV73Recetasdeacabado05_wcds_13_tfmaqcod_sel, Integer.valueOf(AV74Recetasdeacabado05_wcds_14_tfrecvolprd), Integer.valueOf(AV75Recetasdeacabado05_wcds_15_tfrecvolprd_to), AV76Recetasdeacabado05_wcds_16_tfrecfecalt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P09BM2_A6039RecAcab[0] ;
         n6039RecAcab = P09BM2_n6039RecAcab[0] ;
         A396EmprCod = P09BM2_A396EmprCod[0] ;
         A4866RecFecAlt = P09BM2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BM2_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BM2_A2805RecVolPrd[0] ;
         A602MaqCod = P09BM2_A602MaqCod[0] ;
         A1652BarSerDsc = P09BM2_A1652BarSerDsc[0] ;
         A212BarSer = P09BM2_A212BarSer[0] ;
         A213BarSit = P09BM2_A213BarSit[0] ;
         A2804RecLinMaq = P09BM2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BM2_A130BarCodPar[0] ;
         A132BarCodReo = P09BM2_A132BarCodReo[0] ;
         A129BarCod = P09BM2_A129BarCod[0] ;
         A1652BarSerDsc = P09BM2_A1652BarSerDsc[0] ;
         A212BarSer = P09BM2_A212BarSer[0] ;
         A213BarSit = P09BM2_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
         AV32VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV23Seleccionar = "N" ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23Seleccionar, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A2804RecLinMaq );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A213BarSit );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A2805RecVolPrd );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( A4866RecFecAlt );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Seleccionar", "", "Op", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLinMaq", "", "#", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSit", "", "Situacion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSer", "", "Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCod", "", "Código Máquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecVolPrd", "", "Volumen", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecFecAlt", "", "Fecha Alta Receta", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecetasdeAcabado05_WCColumnsSelector", GXv_char5) ;
      recetasdeacabado05_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV28UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("RecetasdeAcabado05_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasdeAcabado05_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("RecetasdeAcabado05_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV2 = 1 ;
      while ( AV77GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV35TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV36TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV37TFRecLinMaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFRecLinMaq_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV39TFBarSit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFBarSit_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV41TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV42TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV43TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV44TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV45TFMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV46TFMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV47TFRecVolPrd = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFRecVolPrd_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV49TFRecFecAlt = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV52Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV53Barcod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV54Barcodreo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV55Barcodpar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      this.aP0[0] = recetasdeacabado05_wcexport.this.AV11Filename;
      this.aP1[0] = recetasdeacabado05_wcexport.this.AV12ErrorMessage;
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
      AV36TFBarNHdr_Sel = "" ;
      AV35TFBarNHdr = "" ;
      AV42TFBarSer_Sel = "" ;
      AV41TFBarSer = "" ;
      AV44TFBarSerDsc_Sel = "" ;
      AV43TFBarSerDsc = "" ;
      AV46TFMaqCod_Sel = "" ;
      AV45TFMaqCod = "" ;
      AV49TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A602MaqCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV61Recetasdeacabado05_wcds_1_filterfulltext = "" ;
      AV62Recetasdeacabado05_wcds_2_tfbarnhdr = "" ;
      AV63Recetasdeacabado05_wcds_3_tfbarnhdr_sel = "" ;
      AV68Recetasdeacabado05_wcds_8_tfbarser = "" ;
      AV69Recetasdeacabado05_wcds_9_tfbarser_sel = "" ;
      AV70Recetasdeacabado05_wcds_10_tfbarserdsc = "" ;
      AV71Recetasdeacabado05_wcds_11_tfbarserdsc_sel = "" ;
      AV72Recetasdeacabado05_wcds_12_tfmaqcod = "" ;
      AV73Recetasdeacabado05_wcds_13_tfmaqcod_sel = "" ;
      AV76Recetasdeacabado05_wcds_16_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV61Recetasdeacabado05_wcds_1_filterfulltext = "" ;
      lV62Recetasdeacabado05_wcds_2_tfbarnhdr = "" ;
      lV68Recetasdeacabado05_wcds_8_tfbarser = "" ;
      lV70Recetasdeacabado05_wcds_10_tfbarserdsc = "" ;
      lV72Recetasdeacabado05_wcds_12_tfmaqcod = "" ;
      A130BarCodPar = "" ;
      AV55Barcodpar = "" ;
      A6039RecAcab = "" ;
      AV52Emprcod = "" ;
      A396EmprCod = "" ;
      P09BM2_A6039RecAcab = new String[] {""} ;
      P09BM2_n6039RecAcab = new boolean[] {false} ;
      P09BM2_A396EmprCod = new String[] {""} ;
      P09BM2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BM2_n4866RecFecAlt = new boolean[] {false} ;
      P09BM2_A2805RecVolPrd = new int[1] ;
      P09BM2_A602MaqCod = new String[] {""} ;
      P09BM2_A1652BarSerDsc = new String[] {""} ;
      P09BM2_A212BarSer = new String[] {""} ;
      P09BM2_A213BarSit = new byte[1] ;
      P09BM2_A2804RecLinMaq = new short[1] ;
      P09BM2_A130BarCodPar = new String[] {""} ;
      P09BM2_A132BarCodReo = new byte[1] ;
      P09BM2_A129BarCod = new int[1] ;
      AV23Seleccionar = "" ;
      AV28UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado05_wcexport__default(),
         new Object[] {
             new Object[] {
            P09BM2_A6039RecAcab, P09BM2_n6039RecAcab, P09BM2_A396EmprCod, P09BM2_A4866RecFecAlt, P09BM2_n4866RecFecAlt, P09BM2_A2805RecVolPrd, P09BM2_A602MaqCod, P09BM2_A1652BarSerDsc, P09BM2_A212BarSer, P09BM2_A213BarSit,
            P09BM2_A2804RecLinMaq, P09BM2_A130BarCodPar, P09BM2_A132BarCodReo, P09BM2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV39TFBarSit ;
   private byte AV40TFBarSit_To ;
   private byte A213BarSit ;
   private byte AV66Recetasdeacabado05_wcds_6_tfbarsit ;
   private byte AV67Recetasdeacabado05_wcds_7_tfbarsit_to ;
   private byte A132BarCodReo ;
   private byte AV54Barcodreo ;
   private short AV37TFRecLinMaq ;
   private short AV38TFRecLinMaq_To ;
   private short GXv_int3[] ;
   private short A2804RecLinMaq ;
   private short AV64Recetasdeacabado05_wcds_4_tfreclinmaq ;
   private short AV65Recetasdeacabado05_wcds_5_tfreclinmaq_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV47TFRecVolPrd ;
   private int AV48TFRecVolPrd_To ;
   private int AV59GXV1 ;
   private int A2805RecVolPrd ;
   private int AV74Recetasdeacabado05_wcds_14_tfrecvolprd ;
   private int AV75Recetasdeacabado05_wcds_15_tfrecvolprd_to ;
   private int A129BarCod ;
   private int AV53Barcod ;
   private int AV77GXV2 ;
   private long AV32VisibleColumnCount ;
   private String AV36TFBarNHdr_Sel ;
   private String AV35TFBarNHdr ;
   private String AV42TFBarSer_Sel ;
   private String AV41TFBarSer ;
   private String AV44TFBarSerDsc_Sel ;
   private String AV43TFBarSerDsc ;
   private String AV46TFMaqCod_Sel ;
   private String AV45TFMaqCod ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A602MaqCod ;
   private String AV62Recetasdeacabado05_wcds_2_tfbarnhdr ;
   private String AV63Recetasdeacabado05_wcds_3_tfbarnhdr_sel ;
   private String AV68Recetasdeacabado05_wcds_8_tfbarser ;
   private String AV69Recetasdeacabado05_wcds_9_tfbarser_sel ;
   private String AV70Recetasdeacabado05_wcds_10_tfbarserdsc ;
   private String AV71Recetasdeacabado05_wcds_11_tfbarserdsc_sel ;
   private String AV72Recetasdeacabado05_wcds_12_tfmaqcod ;
   private String AV73Recetasdeacabado05_wcds_13_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV62Recetasdeacabado05_wcds_2_tfbarnhdr ;
   private String lV68Recetasdeacabado05_wcds_8_tfbarser ;
   private String lV70Recetasdeacabado05_wcds_10_tfbarserdsc ;
   private String lV72Recetasdeacabado05_wcds_12_tfmaqcod ;
   private String A130BarCodPar ;
   private String AV55Barcodpar ;
   private String A6039RecAcab ;
   private String AV52Emprcod ;
   private String A396EmprCod ;
   private String AV23Seleccionar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV49TFRecFecAlt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV76Recetasdeacabado05_wcds_16_tfrecfecalt ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV61Recetasdeacabado05_wcds_1_filterfulltext ;
   private String lV61Recetasdeacabado05_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09BM2_A6039RecAcab ;
   private boolean[] P09BM2_n6039RecAcab ;
   private String[] P09BM2_A396EmprCod ;
   private java.util.Date[] P09BM2_A4866RecFecAlt ;
   private boolean[] P09BM2_n4866RecFecAlt ;
   private int[] P09BM2_A2805RecVolPrd ;
   private String[] P09BM2_A602MaqCod ;
   private String[] P09BM2_A1652BarSerDsc ;
   private String[] P09BM2_A212BarSer ;
   private byte[] P09BM2_A213BarSit ;
   private short[] P09BM2_A2804RecLinMaq ;
   private String[] P09BM2_A130BarCodPar ;
   private byte[] P09BM2_A132BarCodReo ;
   private int[] P09BM2_A129BarCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class recetasdeacabado05_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Recetasdeacabado05_wcds_1_filterfulltext ,
                                          String AV63Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                          String AV62Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                          short AV64Recetasdeacabado05_wcds_4_tfreclinmaq ,
                                          short AV65Recetasdeacabado05_wcds_5_tfreclinmaq_to ,
                                          byte AV66Recetasdeacabado05_wcds_6_tfbarsit ,
                                          byte AV67Recetasdeacabado05_wcds_7_tfbarsit_to ,
                                          String AV69Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                          String AV68Recetasdeacabado05_wcds_8_tfbarser ,
                                          String AV71Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                          String AV70Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                          String AV73Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                          String AV72Recetasdeacabado05_wcds_12_tfmaqcod ,
                                          int AV74Recetasdeacabado05_wcds_14_tfrecvolprd ,
                                          int AV75Recetasdeacabado05_wcds_15_tfrecvolprd_to ,
                                          java.util.Date AV76Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          int AV53Barcod ,
                                          byte AV54Barcodreo ,
                                          String AV55Barcodpar ,
                                          String A6039RecAcab ,
                                          String AV52Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[29];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.RecAcab, T1.EmprCod, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarSerDsc, T2.BarSer, T2.BarSit, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM" ;
      scmdbuf += " (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV61Recetasdeacabado05_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV64Recetasdeacabado05_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV65Recetasdeacabado05_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Recetasdeacabado05_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetasdeacabado05_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetasdeacabado05_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetasdeacabado05_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetasdeacabado05_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetasdeacabado05_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetasdeacabado05_wcds_12_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV74Recetasdeacabado05_wcds_14_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV75Recetasdeacabado05_wcds_15_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Recetasdeacabado05_wcds_16_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt DESC" ;
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
                  return conditional_P09BM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
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
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], false);
               }
               return;
      }
   }

}

