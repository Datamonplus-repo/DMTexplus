package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informediferenciasrecuento_wcexport extends GXProcedure
{
   public informediferenciasrecuento_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informediferenciasrecuento_wcexport.class ), "" );
   }

   public informediferenciasrecuento_wcexport( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      informediferenciasrecuento_wcexport.this.aP1 = new String[] {""};
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
      informediferenciasrecuento_wcexport.this.aP0 = aP0;
      informediferenciasrecuento_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "InformeDiferenciasRecuento_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV20FilterFullText, GXv_char5) ;
      informediferenciasrecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFRecFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV38TFRecFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV40TFRechora) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV40TFRechora );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPrdNum_Sel, GXv_char5) ;
         informediferenciasrecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrdNum, GXv_char5) ;
            informediferenciasrecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPrdNom_Sel, GXv_char5) ;
         informediferenciasrecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPrdNom, GXv_char5) ;
            informediferenciasrecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFRecExiTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFRecExiTeo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Existencia Inicial", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFRecExiTeo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFRecExiTeo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFRecExiRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFRecExiRea_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFRecExiRea)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informediferenciasrecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFRecExiRea_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV35VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV21Session.getValue("InformeDiferenciasRecuento_WCColumnsSelector"), "") != 0 )
      {
         AV30ColumnsSelectorXML = AV21Session.getValue("InformeDiferenciasRecuento_WCColumnsSelector") ;
         AV27ColumnsSelector.fromxml(AV30ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV29ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV74GXV1));
         if ( AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setColor( 11 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV76Informediferenciasrecuento_wcds_1_filterfulltext = AV20FilterFullText ;
      AV77Informediferenciasrecuento_wcds_2_tfrecfec = AV38TFRecFec ;
      AV78Informediferenciasrecuento_wcds_3_tfrechora = AV40TFRechora ;
      AV79Informediferenciasrecuento_wcds_4_tfprdnum = AV42TFPrdNum ;
      AV80Informediferenciasrecuento_wcds_5_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV81Informediferenciasrecuento_wcds_6_tfprdnom = AV44TFPrdNom ;
      AV82Informediferenciasrecuento_wcds_7_tfprdnom_sel = AV45TFPrdNom_Sel ;
      AV83Informediferenciasrecuento_wcds_8_tfrecexiteo = AV46TFRecExiTeo ;
      AV84Informediferenciasrecuento_wcds_9_tfrecexiteo_to = AV47TFRecExiTeo_To ;
      AV85Informediferenciasrecuento_wcds_10_tfrecexirea = AV48TFRecExiRea ;
      AV86Informediferenciasrecuento_wcds_11_tfrecexirea_to = AV49TFRecExiRea_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV76Informediferenciasrecuento_wcds_1_filterfulltext ,
                                           AV77Informediferenciasrecuento_wcds_2_tfrecfec ,
                                           AV78Informediferenciasrecuento_wcds_3_tfrechora ,
                                           AV80Informediferenciasrecuento_wcds_5_tfprdnum_sel ,
                                           AV79Informediferenciasrecuento_wcds_4_tfprdnum ,
                                           AV82Informediferenciasrecuento_wcds_7_tfprdnom_sel ,
                                           AV81Informediferenciasrecuento_wcds_6_tfprdnom ,
                                           AV83Informediferenciasrecuento_wcds_8_tfrecexiteo ,
                                           AV84Informediferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                           AV85Informediferenciasrecuento_wcds_10_tfrecexirea ,
                                           AV86Informediferenciasrecuento_wcds_11_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV16Emprcod ,
                                           AV17RecFec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV76Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV76Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV76Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV76Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV79Informediferenciasrecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV79Informediferenciasrecuento_wcds_4_tfprdnum), 6, "%") ;
      lV81Informediferenciasrecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV81Informediferenciasrecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor P08VA2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV17RecFec, lV76Informediferenciasrecuento_wcds_1_filterfulltext, lV76Informediferenciasrecuento_wcds_1_filterfulltext, lV76Informediferenciasrecuento_wcds_1_filterfulltext, lV76Informediferenciasrecuento_wcds_1_filterfulltext, AV77Informediferenciasrecuento_wcds_2_tfrecfec, AV78Informediferenciasrecuento_wcds_3_tfrechora, lV79Informediferenciasrecuento_wcds_4_tfprdnum, AV80Informediferenciasrecuento_wcds_5_tfprdnum_sel, lV81Informediferenciasrecuento_wcds_6_tfprdnom, AV82Informediferenciasrecuento_wcds_7_tfprdnom_sel, AV83Informediferenciasrecuento_wcds_8_tfrecexiteo, AV84Informediferenciasrecuento_wcds_9_tfrecexiteo_to, AV85Informediferenciasrecuento_wcds_10_tfrecexirea, AV86Informediferenciasrecuento_wcds_11_tfrecexirea_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08VA2_A396EmprCod[0] ;
         A807RecExiRea = P08VA2_A807RecExiRea[0] ;
         A809RecExiTeo = P08VA2_A809RecExiTeo[0] ;
         A718PrdNom = P08VA2_A718PrdNom[0] ;
         A719PrdNum = P08VA2_A719PrdNum[0] ;
         A13455Rechora = P08VA2_A13455Rechora[0] ;
         A810RecFec = P08VA2_A810RecFec[0] ;
         A6573RecPreRec = P08VA2_A6573RecPreRec[0] ;
         A718PrdNom = P08VA2_A718PrdNom[0] ;
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
         AV35VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A810RecFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setDate( A13455Rechora );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            informediferenciasrecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            informediferenciasrecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A809RecExiTeo)) );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV25ValorInicial = GXutil.roundDecimal( (A809RecExiTeo.multiply(A6573RecPreRec)), 2) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25ValorInicial)) );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A807RecExiRea)) );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV26ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26ValorActual)) );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
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
      AV27ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecFec", "", "Fecha", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Rechora", "", "Hora", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum", "", "Producto", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNom", "", "Descripcion", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecExiTeo", "", "Existencia Inicial", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&ValorInicial", "", "Valor", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecExiRea", "", "Stock Actual", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&ValorActual", "", "Valor", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV31UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "InformeDiferenciasRecuento_WCColumnsSelector", GXv_char5) ;
      informediferenciasrecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV31UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV31UserCustomValue)==0) ) )
      {
         AV28ColumnsSelectorAux.fromxml(AV31UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV27ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV28ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV27ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("InformeDiferenciasRecuento_WCGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeDiferenciasRecuento_WCGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("InformeDiferenciasRecuento_WCGridState"), null, null);
      }
      AV18OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV87GXV2 = 1 ;
      while ( AV87GXV2 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV2));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV38TFRecFec = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV40TFRechora = localUtil.ctot( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV42TFPrdNum = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV43TFPrdNum_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV44TFPrdNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV45TFPrdNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV46TFRecExiTeo = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFRecExiTeo_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV48TFRecExiRea = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFRecExiRea_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV17RecFec = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DESVIOS") == 0 )
         {
            AV51Desvios = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV87GXV2 = (int)(AV87GXV2+1) ;
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
      this.aP0[0] = informediferenciasrecuento_wcexport.this.AV11Filename;
      this.aP1[0] = informediferenciasrecuento_wcexport.this.AV12ErrorMessage;
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
      AV20FilterFullText = "" ;
      AV38TFRecFec = GXutil.nullDate() ;
      AV40TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV43TFPrdNum_Sel = "" ;
      AV42TFPrdNum = "" ;
      AV45TFPrdNom_Sel = "" ;
      AV44TFPrdNom = "" ;
      AV46TFRecExiTeo = DecimalUtil.ZERO ;
      AV47TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV48TFRecExiRea = DecimalUtil.ZERO ;
      AV49TFRecExiRea_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV21Session = httpContext.getWebSession();
      AV30ColumnsSelectorXML = "" ;
      AV27ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A810RecFec = GXutil.nullDate() ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      AV76Informediferenciasrecuento_wcds_1_filterfulltext = "" ;
      AV77Informediferenciasrecuento_wcds_2_tfrecfec = GXutil.nullDate() ;
      AV78Informediferenciasrecuento_wcds_3_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV79Informediferenciasrecuento_wcds_4_tfprdnum = "" ;
      AV80Informediferenciasrecuento_wcds_5_tfprdnum_sel = "" ;
      AV81Informediferenciasrecuento_wcds_6_tfprdnom = "" ;
      AV82Informediferenciasrecuento_wcds_7_tfprdnom_sel = "" ;
      AV83Informediferenciasrecuento_wcds_8_tfrecexiteo = DecimalUtil.ZERO ;
      AV84Informediferenciasrecuento_wcds_9_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV85Informediferenciasrecuento_wcds_10_tfrecexirea = DecimalUtil.ZERO ;
      AV86Informediferenciasrecuento_wcds_11_tfrecexirea_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV76Informediferenciasrecuento_wcds_1_filterfulltext = "" ;
      lV79Informediferenciasrecuento_wcds_4_tfprdnum = "" ;
      lV81Informediferenciasrecuento_wcds_6_tfprdnom = "" ;
      AV16Emprcod = "" ;
      AV17RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P08VA2_A396EmprCod = new String[] {""} ;
      P08VA2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VA2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VA2_A718PrdNom = new String[] {""} ;
      P08VA2_A719PrdNum = new String[] {""} ;
      P08VA2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P08VA2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08VA2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV25ValorInicial = DecimalUtil.ZERO ;
      AV26ValorActual = DecimalUtil.ZERO ;
      AV31UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV28ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV51Desvios = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informediferenciasrecuento_wcexport__default(),
         new Object[] {
             new Object[] {
            P08VA2_A396EmprCod, P08VA2_A807RecExiRea, P08VA2_A809RecExiTeo, P08VA2_A718PrdNom, P08VA2_A719PrdNum, P08VA2_A13455Rechora, P08VA2_A810RecFec, P08VA2_A6573RecPreRec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV18OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV74GXV1 ;
   private int AV87GXV2 ;
   private long AV35VisibleColumnCount ;
   private java.math.BigDecimal AV46TFRecExiTeo ;
   private java.math.BigDecimal AV47TFRecExiTeo_To ;
   private java.math.BigDecimal AV48TFRecExiRea ;
   private java.math.BigDecimal AV49TFRecExiRea_To ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV83Informediferenciasrecuento_wcds_8_tfrecexiteo ;
   private java.math.BigDecimal AV84Informediferenciasrecuento_wcds_9_tfrecexiteo_to ;
   private java.math.BigDecimal AV85Informediferenciasrecuento_wcds_10_tfrecexirea ;
   private java.math.BigDecimal AV86Informediferenciasrecuento_wcds_11_tfrecexirea_to ;
   private java.math.BigDecimal AV25ValorInicial ;
   private java.math.BigDecimal AV26ValorActual ;
   private String AV43TFPrdNum_Sel ;
   private String AV42TFPrdNum ;
   private String AV45TFPrdNom_Sel ;
   private String AV44TFPrdNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV79Informediferenciasrecuento_wcds_4_tfprdnum ;
   private String AV80Informediferenciasrecuento_wcds_5_tfprdnum_sel ;
   private String AV81Informediferenciasrecuento_wcds_6_tfprdnom ;
   private String AV82Informediferenciasrecuento_wcds_7_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV79Informediferenciasrecuento_wcds_4_tfprdnum ;
   private String lV81Informediferenciasrecuento_wcds_6_tfprdnom ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV51Desvios ;
   private java.util.Date AV40TFRechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV78Informediferenciasrecuento_wcds_3_tfrechora ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV38TFRecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV77Informediferenciasrecuento_wcds_2_tfrecfec ;
   private java.util.Date AV17RecFec ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private String AV30ColumnsSelectorXML ;
   private String AV31UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV20FilterFullText ;
   private String AV76Informediferenciasrecuento_wcds_1_filterfulltext ;
   private String lV76Informediferenciasrecuento_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08VA2_A396EmprCod ;
   private java.math.BigDecimal[] P08VA2_A807RecExiRea ;
   private java.math.BigDecimal[] P08VA2_A809RecExiTeo ;
   private String[] P08VA2_A718PrdNom ;
   private String[] P08VA2_A719PrdNum ;
   private java.util.Date[] P08VA2_A13455Rechora ;
   private java.util.Date[] P08VA2_A810RecFec ;
   private java.math.BigDecimal[] P08VA2_A6573RecPreRec ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV29ColumnsSelector_Column ;
}

final  class informediferenciasrecuento_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Informediferenciasrecuento_wcds_1_filterfulltext ,
                                          java.util.Date AV77Informediferenciasrecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV78Informediferenciasrecuento_wcds_3_tfrechora ,
                                          String AV80Informediferenciasrecuento_wcds_5_tfprdnum_sel ,
                                          String AV79Informediferenciasrecuento_wcds_4_tfprdnum ,
                                          String AV82Informediferenciasrecuento_wcds_7_tfprdnom_sel ,
                                          String AV81Informediferenciasrecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV83Informediferenciasrecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV84Informediferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV85Informediferenciasrecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV86Informediferenciasrecuento_wcds_11_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV16Emprcod ,
                                          java.util.Date AV17RecFec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[16];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecExiRea, T1.RecExiTeo, T2.PrdNom, T1.PrdNum, T1.Rechora, T1.RecFec, T1.RecPreRec FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV76Informediferenciasrecuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Informediferenciasrecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV78Informediferenciasrecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Informediferenciasrecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Informediferenciasrecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Informediferenciasrecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Informediferenciasrecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Informediferenciasrecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Informediferenciasrecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Informediferenciasrecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Informediferenciasrecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Informediferenciasrecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Informediferenciasrecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFec" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFec DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Rechora" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Rechora DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiRea" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiRea DESC" ;
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
                  return conditional_P08VA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               return;
      }
   }

}

