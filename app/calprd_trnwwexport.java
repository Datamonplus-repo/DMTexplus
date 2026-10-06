package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class calprd_trnwwexport extends GXProcedure
{
   public calprd_trnwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calprd_trnwwexport.class ), "" );
   }

   public calprd_trnwwexport( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      calprd_trnwwexport.this.aP1 = new String[] {""};
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
      calprd_trnwwexport.this.aP0 = aP0;
      calprd_trnwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "Calprd_TRNWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV36TFAlbProCod) && (0==AV37TFAlbProCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero Albaran Produccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFAlbProCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFAlbProCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFAlbProPri_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFAlbProPri_Sel, GXv_char5) ;
         calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFAlbProPri)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFAlbProPri, GXv_char5) ;
            calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV86TFAlbProEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV84i = 1 ;
         AV94GXV1 = 1 ;
         while ( AV94GXV1 <= AV86TFAlbProEst_Sels.size() )
         {
            AV87TFAlbProEst_Sel = ((Number) AV86TFAlbProEst_Sels.elementAt(-1+AV94GXV1)).byteValue() ;
            if ( AV84i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV87TFAlbProEst_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pdte Imprimir", "") );
            }
            else if ( AV87TFAlbProEst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Imprimido", "") );
            }
            else if ( AV87TFAlbProEst_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Facturado", "") );
            }
            AV84i = (long)(AV84i+1) ;
            AV94GXV1 = (int)(AV94GXV1+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFAlbProfch)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV42TFAlbProfch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFAlbFecSal)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Salida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV44TFAlbFecSal );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFAlbHorSal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora Salida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFAlbHorSal_Sel, GXv_char5) ;
         calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFAlbHorSal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora Salida", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFAlbHorSal, GXv_char5) ;
            calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV91TFAlbMarca_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV84i = 1 ;
         AV95GXV2 = 1 ;
         while ( AV95GXV2 <= AV91TFAlbMarca_Sels.size() )
         {
            AV89TFAlbMarca_Sel = (String)AV91TFAlbMarca_Sels.elementAt(-1+AV95GXV2) ;
            if ( AV84i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV89TFAlbMarca_Sel), "") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Activo", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV89TFAlbMarca_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Anulado", "") );
            }
            AV84i = (long)(AV84i+1) ;
            AV95GXV2 = (int)(AV95GXV2+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV69TFAlbLic_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo AT", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFAlbLic_Sel, GXv_char5) ;
         calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFAlbLic)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo AT", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            calprd_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFAlbLic, GXv_char5) ;
            calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("Calprd_TRNWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Calprd_TRNWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV96GXV3 = 1 ;
      while ( AV96GXV3 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV96GXV3));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV96GXV3 = (int)(AV96GXV3+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV98Calprd_trnwwds_1_filterfulltext = AV18FilterFullText ;
      AV99Calprd_trnwwds_2_tfalbprocod = AV36TFAlbProCod ;
      AV100Calprd_trnwwds_3_tfalbprocod_to = AV37TFAlbProCod_To ;
      AV101Calprd_trnwwds_4_tfalbpropri = AV38TFAlbProPri ;
      AV102Calprd_trnwwds_5_tfalbpropri_sel = AV39TFAlbProPri_Sel ;
      AV103Calprd_trnwwds_6_tfalbproest_sels = AV86TFAlbProEst_Sels ;
      AV104Calprd_trnwwds_7_tfalbprofch = AV42TFAlbProfch ;
      AV105Calprd_trnwwds_8_tfalbfecsal = AV44TFAlbFecSal ;
      AV106Calprd_trnwwds_9_tfalbhorsal = AV46TFAlbHorSal ;
      AV107Calprd_trnwwds_10_tfalbhorsal_sel = AV47TFAlbHorSal_Sel ;
      AV108Calprd_trnwwds_11_tfalbmarca_sels = AV91TFAlbMarca_Sels ;
      AV109Calprd_trnwwds_12_tfalblic = AV68TFAlbLic ;
      AV110Calprd_trnwwds_13_tfalblic_sel = AV69TFAlbLic_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV103Calprd_trnwwds_6_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV108Calprd_trnwwds_11_tfalbmarca_sels ,
                                           Long.valueOf(AV99Calprd_trnwwds_2_tfalbprocod) ,
                                           Long.valueOf(AV100Calprd_trnwwds_3_tfalbprocod_to) ,
                                           AV102Calprd_trnwwds_5_tfalbpropri_sel ,
                                           AV101Calprd_trnwwds_4_tfalbpropri ,
                                           Integer.valueOf(AV103Calprd_trnwwds_6_tfalbproest_sels.size()) ,
                                           AV104Calprd_trnwwds_7_tfalbprofch ,
                                           AV105Calprd_trnwwds_8_tfalbfecsal ,
                                           AV107Calprd_trnwwds_10_tfalbhorsal_sel ,
                                           AV106Calprd_trnwwds_9_tfalbhorsal ,
                                           Integer.valueOf(AV108Calprd_trnwwds_11_tfalbmarca_sels.size()) ,
                                           AV110Calprd_trnwwds_13_tfalblic_sel ,
                                           AV109Calprd_trnwwds_12_tfalblic ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           A34AlbProfch ,
                                           A4023AlbFecSal ,
                                           A3865AlbHorSal ,
                                           A7101AlbLic ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV98Calprd_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV101Calprd_trnwwds_4_tfalbpropri = GXutil.padr( GXutil.rtrim( AV101Calprd_trnwwds_4_tfalbpropri), 1, "%") ;
      lV106Calprd_trnwwds_9_tfalbhorsal = GXutil.padr( GXutil.rtrim( AV106Calprd_trnwwds_9_tfalbhorsal), 8, "%") ;
      lV109Calprd_trnwwds_12_tfalblic = GXutil.padr( GXutil.rtrim( AV109Calprd_trnwwds_12_tfalblic), 20, "%") ;
      /* Using cursor P092Y2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV99Calprd_trnwwds_2_tfalbprocod), Long.valueOf(AV100Calprd_trnwwds_3_tfalbprocod_to), lV101Calprd_trnwwds_4_tfalbpropri, AV102Calprd_trnwwds_5_tfalbpropri_sel, AV104Calprd_trnwwds_7_tfalbprofch, AV105Calprd_trnwwds_8_tfalbfecsal, lV106Calprd_trnwwds_9_tfalbhorsal, AV107Calprd_trnwwds_10_tfalbhorsal_sel, lV109Calprd_trnwwds_12_tfalblic, AV110Calprd_trnwwds_13_tfalblic_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7101AlbLic = P092Y2_A7101AlbLic[0] ;
         A3865AlbHorSal = P092Y2_A3865AlbHorSal[0] ;
         A4023AlbFecSal = P092Y2_A4023AlbFecSal[0] ;
         A34AlbProfch = P092Y2_A34AlbProfch[0] ;
         A33AlbProEst = P092Y2_A33AlbProEst[0] ;
         A39AlbProPri = P092Y2_A39AlbProPri[0] ;
         A30AlbProCod = P092Y2_A30AlbProCod[0] ;
         A5140AlbMarca = P092Y2_A5140AlbMarca[0] ;
         A396EmprCod = P092Y2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV98Calprd_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV98Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV98Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV98Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3865AlbHorSal) , GXutil.padr( "%" + GXutil.upper( AV98Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV98Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A30AlbProCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A39AlbProPri, GXv_char5) ;
               calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( A33AlbProEst == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pdte Imprimir", "") );
               }
               else if ( A33AlbProEst == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Imprimido", "") );
               }
               else if ( A33AlbProEst == 2 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Facturado", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A34AlbProfch );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A4023AlbFecSal );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3865AlbHorSal, GXv_char5) ;
               calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A5140AlbMarca), "") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Activo", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A5140AlbMarca), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Anulado", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A7101AlbLic, GXv_char5) ;
               calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProCod", "", "Numero Albaran Produccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProPri", "", "P", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProfch", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbFecSal", "", "Fecha Salida", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbHorSal", "", "Hora Salida", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbMarca", "", "", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbLic", "", "Codigo AT", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Calprd_TRNWWColumnsSelector", GXv_char5) ;
      calprd_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Calprd_TRNWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Calprd_TRNWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Calprd_TRNWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV111GXV4 = 1 ;
      while ( AV111GXV4 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV111GXV4));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV36TFAlbProCod = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV37TFAlbProCod_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV38TFAlbProPri = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV39TFAlbProPri_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV85TFAlbProEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV86TFAlbProEst_Sels.fromJSonString(AV85TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV42TFAlbProfch = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFECSAL") == 0 )
         {
            AV44TFAlbFecSal = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHORSAL") == 0 )
         {
            AV46TFAlbHorSal = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHORSAL_SEL") == 0 )
         {
            AV47TFAlbHorSal_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV90TFAlbMarca_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV91TFAlbMarca_Sels.fromJSonString(AV90TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV68TFAlbLic = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV69TFAlbLic_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV111GXV4 = (int)(AV111GXV4+1) ;
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
      this.aP0[0] = calprd_trnwwexport.this.AV11Filename;
      this.aP1[0] = calprd_trnwwexport.this.AV12ErrorMessage;
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
      AV39TFAlbProPri_Sel = "" ;
      AV38TFAlbProPri = "" ;
      AV86TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV42TFAlbProfch = GXutil.nullDate() ;
      AV44TFAlbFecSal = GXutil.nullDate() ;
      AV47TFAlbHorSal_Sel = "" ;
      AV46TFAlbHorSal = "" ;
      AV91TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV89TFAlbMarca_Sel = "" ;
      AV69TFAlbLic_Sel = "" ;
      AV68TFAlbLic = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A5140AlbMarca = "" ;
      A7101AlbLic = "" ;
      AV98Calprd_trnwwds_1_filterfulltext = "" ;
      AV101Calprd_trnwwds_4_tfalbpropri = "" ;
      AV102Calprd_trnwwds_5_tfalbpropri_sel = "" ;
      AV103Calprd_trnwwds_6_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV104Calprd_trnwwds_7_tfalbprofch = GXutil.nullDate() ;
      AV105Calprd_trnwwds_8_tfalbfecsal = GXutil.nullDate() ;
      AV106Calprd_trnwwds_9_tfalbhorsal = "" ;
      AV107Calprd_trnwwds_10_tfalbhorsal_sel = "" ;
      AV108Calprd_trnwwds_11_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV109Calprd_trnwwds_12_tfalblic = "" ;
      AV110Calprd_trnwwds_13_tfalblic_sel = "" ;
      lV98Calprd_trnwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV101Calprd_trnwwds_4_tfalbpropri = "" ;
      lV106Calprd_trnwwds_9_tfalbhorsal = "" ;
      lV109Calprd_trnwwds_12_tfalblic = "" ;
      P092Y2_A7101AlbLic = new String[] {""} ;
      P092Y2_A3865AlbHorSal = new String[] {""} ;
      P092Y2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P092Y2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P092Y2_A33AlbProEst = new byte[1] ;
      P092Y2_A39AlbProPri = new String[] {""} ;
      P092Y2_A30AlbProCod = new long[1] ;
      P092Y2_A5140AlbMarca = new String[] {""} ;
      P092Y2_A396EmprCod = new String[] {""} ;
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
      AV85TFAlbProEst_SelsJson = "" ;
      AV90TFAlbMarca_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calprd_trnwwexport__default(),
         new Object[] {
             new Object[] {
            P092Y2_A7101AlbLic, P092Y2_A3865AlbHorSal, P092Y2_A4023AlbFecSal, P092Y2_A34AlbProfch, P092Y2_A33AlbProEst, P092Y2_A39AlbProPri, P092Y2_A30AlbProCod, P092Y2_A5140AlbMarca, P092Y2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV87TFAlbProEst_Sel ;
   private byte A33AlbProEst ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV94GXV1 ;
   private int AV95GXV2 ;
   private int AV96GXV3 ;
   private int AV103Calprd_trnwwds_6_tfalbproest_sels_size ;
   private int AV108Calprd_trnwwds_11_tfalbmarca_sels_size ;
   private int AV111GXV4 ;
   private long AV36TFAlbProCod ;
   private long AV37TFAlbProCod_To ;
   private long AV84i ;
   private long AV31VisibleColumnCount ;
   private long A30AlbProCod ;
   private long AV99Calprd_trnwwds_2_tfalbprocod ;
   private long AV100Calprd_trnwwds_3_tfalbprocod_to ;
   private String AV39TFAlbProPri_Sel ;
   private String AV38TFAlbProPri ;
   private String AV47TFAlbHorSal_Sel ;
   private String AV46TFAlbHorSal ;
   private String AV89TFAlbMarca_Sel ;
   private String AV69TFAlbLic_Sel ;
   private String AV68TFAlbLic ;
   private String A39AlbProPri ;
   private String A3865AlbHorSal ;
   private String A5140AlbMarca ;
   private String A7101AlbLic ;
   private String AV101Calprd_trnwwds_4_tfalbpropri ;
   private String AV102Calprd_trnwwds_5_tfalbpropri_sel ;
   private String AV106Calprd_trnwwds_9_tfalbhorsal ;
   private String AV107Calprd_trnwwds_10_tfalbhorsal_sel ;
   private String AV109Calprd_trnwwds_12_tfalblic ;
   private String AV110Calprd_trnwwds_13_tfalblic_sel ;
   private String scmdbuf ;
   private String lV101Calprd_trnwwds_4_tfalbpropri ;
   private String lV106Calprd_trnwwds_9_tfalbhorsal ;
   private String lV109Calprd_trnwwds_12_tfalblic ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV42TFAlbProfch ;
   private java.util.Date AV44TFAlbFecSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV104Calprd_trnwwds_7_tfalbprofch ;
   private java.util.Date AV105Calprd_trnwwds_8_tfalbfecsal ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV85TFAlbProEst_SelsJson ;
   private String AV90TFAlbMarca_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV98Calprd_trnwwds_1_filterfulltext ;
   private String lV98Calprd_trnwwds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV86TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV103Calprd_trnwwds_6_tfalbproest_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV91TFAlbMarca_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P092Y2_A7101AlbLic ;
   private String[] P092Y2_A3865AlbHorSal ;
   private java.util.Date[] P092Y2_A4023AlbFecSal ;
   private java.util.Date[] P092Y2_A34AlbProfch ;
   private byte[] P092Y2_A33AlbProEst ;
   private String[] P092Y2_A39AlbProPri ;
   private long[] P092Y2_A30AlbProCod ;
   private String[] P092Y2_A5140AlbMarca ;
   private String[] P092Y2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV108Calprd_trnwwds_11_tfalbmarca_sels ;
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

final  class calprd_trnwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P092Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV103Calprd_trnwwds_6_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV108Calprd_trnwwds_11_tfalbmarca_sels ,
                                          long AV99Calprd_trnwwds_2_tfalbprocod ,
                                          long AV100Calprd_trnwwds_3_tfalbprocod_to ,
                                          String AV102Calprd_trnwwds_5_tfalbpropri_sel ,
                                          String AV101Calprd_trnwwds_4_tfalbpropri ,
                                          int AV103Calprd_trnwwds_6_tfalbproest_sels_size ,
                                          java.util.Date AV104Calprd_trnwwds_7_tfalbprofch ,
                                          java.util.Date AV105Calprd_trnwwds_8_tfalbfecsal ,
                                          String AV107Calprd_trnwwds_10_tfalbhorsal_sel ,
                                          String AV106Calprd_trnwwds_9_tfalbhorsal ,
                                          int AV108Calprd_trnwwds_11_tfalbmarca_sels_size ,
                                          String AV110Calprd_trnwwds_13_tfalblic_sel ,
                                          String AV109Calprd_trnwwds_12_tfalblic ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          java.util.Date A4023AlbFecSal ,
                                          String A3865AlbHorSal ,
                                          String A7101AlbLic ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV98Calprd_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[10];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT AlbLic, AlbHorSal, AlbFecSal, AlbProfch, AlbProEst, AlbProPri, AlbProCod, AlbMarca, EmprCod FROM TXPCALPRD" ;
      if ( ! (0==AV99Calprd_trnwwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV100Calprd_trnwwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Calprd_trnwwds_5_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV101Calprd_trnwwds_4_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Calprd_trnwwds_5_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProPri = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( AV103Calprd_trnwwds_6_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103Calprd_trnwwds_6_tfalbproest_sels, "AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Calprd_trnwwds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Calprd_trnwwds_8_tfalbfecsal)) )
      {
         addWhere(sWhereString, "(AlbFecSal >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Calprd_trnwwds_10_tfalbhorsal_sel)==0) && ( ! (GXutil.strcmp("", AV106Calprd_trnwwds_9_tfalbhorsal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHorSal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Calprd_trnwwds_10_tfalbhorsal_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHorSal = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( AV108Calprd_trnwwds_11_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV108Calprd_trnwwds_11_tfalbmarca_sels, "AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV110Calprd_trnwwds_13_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV109Calprd_trnwwds_12_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Calprd_trnwwds_13_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(AlbLic = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProfch" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProfch DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProPri" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProPri DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProEst" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbFecSal" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbFecSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbHorSal" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbHorSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbMarca" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbMarca DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbLic" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbLic DESC" ;
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
                  return conditional_P092Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P092Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               return;
      }
   }

}

