package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwldifrecexport extends GXProcedure
{
   public webwldifrecexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwldifrecexport.class ), "" );
   }

   public webwldifrecexport( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webwldifrecexport.this.aP1 = new String[] {""};
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
      webwldifrecexport.this.aP0 = aP0;
      webwldifrecexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebWldifrecExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52FilterFullText, GXv_char5) ;
      webwldifrecexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_dtime6 = GXutil.resetTime( AV18RecFec );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35TFRecFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV35TFRecFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV37TFRechora) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV37TFRechora );
      }
      if ( ! ( (GXutil.strcmp("", AV40TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFPrdNum_Sel, GXv_char5) ;
         webwldifrecexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFPrdNum, GXv_char5) ;
            webwldifrecexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrdNom_Sel, GXv_char5) ;
         webwldifrecexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPrdNom, GXv_char5) ;
            webwldifrecexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFRecExiTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFRecExiTeo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Existencia Inicial", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFRecExiTeo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFRecExiTeo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFRecExiRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFRecExiRea_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFRecExiRea)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwldifrecexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFRecExiRea_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV20Session.getValue("WebWldifrecColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV20Session.getValue("WebWldifrecColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV55GXV1));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Webwldifrecds_1_filterfulltext = AV52FilterFullText ;
      AV58Webwldifrecds_2_recfec = AV18RecFec ;
      AV59Webwldifrecds_3_tfrecfec = AV35TFRecFec ;
      AV60Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV61Webwldifrecds_5_tfprdnum = AV39TFPrdNum ;
      AV62Webwldifrecds_6_tfprdnum_sel = AV40TFPrdNum_Sel ;
      AV63Webwldifrecds_7_tfprdnom = AV41TFPrdNom ;
      AV64Webwldifrecds_8_tfprdnom_sel = AV42TFPrdNom_Sel ;
      AV65Webwldifrecds_9_tfrecexiteo = AV45TFRecExiTeo ;
      AV66Webwldifrecds_10_tfrecexiteo_to = AV46TFRecExiTeo_To ;
      AV67Webwldifrecds_11_tfrecexirea = AV47TFRecExiRea ;
      AV68Webwldifrecds_12_tfrecexirea_to = AV48TFRecExiRea_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Webwldifrecds_1_filterfulltext ,
                                           AV59Webwldifrecds_3_tfrecfec ,
                                           AV60Webwldifrecds_4_tfrechora ,
                                           AV62Webwldifrecds_6_tfprdnum_sel ,
                                           AV61Webwldifrecds_5_tfprdnum ,
                                           AV64Webwldifrecds_8_tfprdnom_sel ,
                                           AV63Webwldifrecds_7_tfprdnom ,
                                           AV65Webwldifrecds_9_tfrecexiteo ,
                                           AV66Webwldifrecds_10_tfrecexiteo_to ,
                                           AV67Webwldifrecds_11_tfrecexirea ,
                                           AV68Webwldifrecds_12_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV58Webwldifrecds_2_recfec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE
                                           }
      });
      lV61Webwldifrecds_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Webwldifrecds_5_tfprdnum), 6, "%") ;
      lV63Webwldifrecds_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV63Webwldifrecds_7_tfprdnom), 26, "%") ;
      /* Using cursor P08LY2 */
      pr_default.execute(0, new Object[] {A810RecFec, AV58Webwldifrecds_2_recfec, lV61Webwldifrecds_5_tfprdnum, AV62Webwldifrecds_6_tfprdnum_sel, lV63Webwldifrecds_7_tfprdnom, AV64Webwldifrecds_8_tfprdnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A718PrdNom = P08LY2_A718PrdNom[0] ;
         A719PrdNum = P08LY2_A719PrdNum[0] ;
         A396EmprCod = P08LY2_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV32VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A810RecFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( A13455Rechora );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            webwldifrecexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            webwldifrecexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A809RecExiTeo)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV44ValorInicial = GXutil.roundDecimal( (A809RecExiTeo.multiply(A6573RecPreRec)), 2) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44ValorInicial)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A807RecExiRea)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV51ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51ValorActual)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecFec", "", "Fecha", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Rechora", "", "Hora", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum", "", "Producto", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNom", "", "Descripcion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecExiTeo", "", "Existencia Inicial", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&ValorInicial", "", "Valor", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecExiRea", "", "Stock Actual", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&ValorActual", "", "Valor", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWldifrecColumnsSelector", GXv_char5) ;
      webwldifrecexport.this.GXt_char4 = GXv_char5[0] ;
      AV28UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("WebWldifrecGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWldifrecGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("WebWldifrecGridState"), null, null);
      }
      AV16OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV69GXV2 = 1 ;
      while ( AV69GXV2 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV2));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "RECFEC") == 0 )
         {
            AV18RecFec = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV35TFRecFec = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV37TFRechora = localUtil.ctot( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV39TFPrdNum = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV40TFPrdNum_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV41TFPrdNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV42TFPrdNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV45TFRecExiTeo = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFRecExiTeo_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV47TFRecExiRea = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFRecExiRea_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV69GXV2 = (int)(AV69GXV2+1) ;
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
      this.aP0[0] = webwldifrecexport.this.AV11Filename;
      this.aP1[0] = webwldifrecexport.this.AV12ErrorMessage;
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
      AV52FilterFullText = "" ;
      AV18RecFec = GXutil.nullDate() ;
      AV35TFRecFec = GXutil.nullDate() ;
      AV37TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV40TFPrdNum_Sel = "" ;
      AV39TFPrdNum = "" ;
      AV42TFPrdNom_Sel = "" ;
      AV41TFPrdNom = "" ;
      AV45TFRecExiTeo = DecimalUtil.ZERO ;
      AV46TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV47TFRecExiRea = DecimalUtil.ZERO ;
      AV48TFRecExiRea_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV20Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A810RecFec = GXutil.nullDate() ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      AV57Webwldifrecds_1_filterfulltext = "" ;
      AV58Webwldifrecds_2_recfec = GXutil.nullDate() ;
      AV59Webwldifrecds_3_tfrecfec = GXutil.nullDate() ;
      AV60Webwldifrecds_4_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV61Webwldifrecds_5_tfprdnum = "" ;
      AV62Webwldifrecds_6_tfprdnum_sel = "" ;
      AV63Webwldifrecds_7_tfprdnom = "" ;
      AV64Webwldifrecds_8_tfprdnom_sel = "" ;
      AV65Webwldifrecds_9_tfrecexiteo = DecimalUtil.ZERO ;
      AV66Webwldifrecds_10_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV67Webwldifrecds_11_tfrecexirea = DecimalUtil.ZERO ;
      AV68Webwldifrecds_12_tfrecexirea_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV61Webwldifrecds_5_tfprdnum = "" ;
      lV63Webwldifrecds_7_tfprdnom = "" ;
      P08LY2_A718PrdNom = new String[] {""} ;
      P08LY2_A719PrdNum = new String[] {""} ;
      P08LY2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV44ValorInicial = DecimalUtil.ZERO ;
      AV51ValorActual = DecimalUtil.ZERO ;
      AV28UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwldifrecexport__default(),
         new Object[] {
             new Object[] {
            P08LY2_A718PrdNom, P08LY2_A719PrdNum, P08LY2_A396EmprCod
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
   private int AV55GXV1 ;
   private int AV69GXV2 ;
   private long AV32VisibleColumnCount ;
   private java.math.BigDecimal AV45TFRecExiTeo ;
   private java.math.BigDecimal AV46TFRecExiTeo_To ;
   private java.math.BigDecimal AV47TFRecExiRea ;
   private java.math.BigDecimal AV48TFRecExiRea_To ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV65Webwldifrecds_9_tfrecexiteo ;
   private java.math.BigDecimal AV66Webwldifrecds_10_tfrecexiteo_to ;
   private java.math.BigDecimal AV67Webwldifrecds_11_tfrecexirea ;
   private java.math.BigDecimal AV68Webwldifrecds_12_tfrecexirea_to ;
   private java.math.BigDecimal AV44ValorInicial ;
   private java.math.BigDecimal AV51ValorActual ;
   private String AV40TFPrdNum_Sel ;
   private String AV39TFPrdNum ;
   private String AV42TFPrdNom_Sel ;
   private String AV41TFPrdNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV61Webwldifrecds_5_tfprdnum ;
   private String AV62Webwldifrecds_6_tfprdnum_sel ;
   private String AV63Webwldifrecds_7_tfprdnom ;
   private String AV64Webwldifrecds_8_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV61Webwldifrecds_5_tfprdnum ;
   private String lV63Webwldifrecds_7_tfprdnom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV37TFRechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV60Webwldifrecds_4_tfrechora ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV18RecFec ;
   private java.util.Date AV35TFRecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV58Webwldifrecds_2_recfec ;
   private java.util.Date AV59Webwldifrecds_3_tfrecfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV52FilterFullText ;
   private String AV57Webwldifrecds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08LY2_A718PrdNom ;
   private String[] P08LY2_A719PrdNum ;
   private String[] P08LY2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class webwldifrecexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08LY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Webwldifrecds_1_filterfulltext ,
                                          java.util.Date AV59Webwldifrecds_3_tfrecfec ,
                                          java.util.Date AV60Webwldifrecds_4_tfrechora ,
                                          String AV62Webwldifrecds_6_tfprdnum_sel ,
                                          String AV61Webwldifrecds_5_tfprdnum ,
                                          String AV64Webwldifrecds_8_tfprdnom_sel ,
                                          String AV63Webwldifrecds_7_tfprdnom ,
                                          java.math.BigDecimal AV65Webwldifrecds_9_tfrecexiteo ,
                                          java.math.BigDecimal AV66Webwldifrecds_10_tfrecexiteo_to ,
                                          java.math.BigDecimal AV67Webwldifrecds_11_tfrecexirea ,
                                          java.math.BigDecimal AV68Webwldifrecds_12_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          java.util.Date AV58Webwldifrecds_2_recfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[6];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT PrdNom, PrdNum, EmprCod FROM TXPPRODUC" ;
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV62Webwldifrecds_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Webwldifrecds_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Webwldifrecds_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Webwldifrecds_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Webwldifrecds_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Webwldifrecds_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P08LY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (java.util.Date)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 26);
               }
               return;
      }
   }

}

