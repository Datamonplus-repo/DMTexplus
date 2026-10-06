package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class drecwwexport extends GXProcedure
{
   public drecwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( drecwwexport.class ), "" );
   }

   public drecwwexport( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      drecwwexport.this.aP1 = new String[] {""};
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
      drecwwexport.this.aP0 = aP0;
      drecwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "DRecWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      drecwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      drecwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFDRecId) && (0==AV35TFDRecId_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Id", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         drecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFDRecId );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         drecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFDRecId_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFDRecMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         drecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFDRecMaqCod_Sel, GXv_char5) ;
         drecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFDRecMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            drecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFDRecMaqCod, GXv_char5) ;
            drecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFDRecPLC_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Enlace c/PLC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         drecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFDRecPLC_Sel, GXv_char5) ;
         drecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFDRecPLC)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Enlace c/PLC", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            drecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFDRecPLC, GXv_char5) ;
            drecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFDRecVal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         drecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFDRecVal_Sel, GXv_char5) ;
         drecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFDRecVal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            drecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFDRecVal, GXv_char5) ;
            drecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV42TFDRecFec) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Recepción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         drecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV42TFDRecFec );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("Ingenieria.DRecWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Ingenieria.DRecWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV47GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV49Ingenieria_drecwwds_1_filterfulltext = AV18FilterFullText ;
      AV50Ingenieria_drecwwds_2_tfdrecid = AV34TFDRecId ;
      AV51Ingenieria_drecwwds_3_tfdrecid_to = AV35TFDRecId_To ;
      AV52Ingenieria_drecwwds_4_tfdrecmaqcod = AV36TFDRecMaqCod ;
      AV53Ingenieria_drecwwds_5_tfdrecmaqcod_sel = AV37TFDRecMaqCod_Sel ;
      AV54Ingenieria_drecwwds_6_tfdrecplc = AV38TFDRecPLC ;
      AV55Ingenieria_drecwwds_7_tfdrecplc_sel = AV39TFDRecPLC_Sel ;
      AV56Ingenieria_drecwwds_8_tfdrecval = AV40TFDRecVal ;
      AV57Ingenieria_drecwwds_9_tfdrecval_sel = AV41TFDRecVal_Sel ;
      AV58Ingenieria_drecwwds_10_tfdrecfec = AV42TFDRecFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Ingenieria_drecwwds_1_filterfulltext ,
                                           Long.valueOf(AV50Ingenieria_drecwwds_2_tfdrecid) ,
                                           Long.valueOf(AV51Ingenieria_drecwwds_3_tfdrecid_to) ,
                                           AV53Ingenieria_drecwwds_5_tfdrecmaqcod_sel ,
                                           AV52Ingenieria_drecwwds_4_tfdrecmaqcod ,
                                           AV55Ingenieria_drecwwds_7_tfdrecplc_sel ,
                                           AV54Ingenieria_drecwwds_6_tfdrecplc ,
                                           AV57Ingenieria_drecwwds_9_tfdrecval_sel ,
                                           AV56Ingenieria_drecwwds_8_tfdrecval ,
                                           AV58Ingenieria_drecwwds_10_tfdrecfec ,
                                           Long.valueOf(A14675DRecId) ,
                                           A14705DRecMaqCod ,
                                           A14706DRecPLC ,
                                           A14707DRecVal ,
                                           A14676DRecFec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV49Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV49Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV49Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV49Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV52Ingenieria_drecwwds_4_tfdrecmaqcod = GXutil.padr( GXutil.rtrim( AV52Ingenieria_drecwwds_4_tfdrecmaqcod), 6, "%") ;
      lV54Ingenieria_drecwwds_6_tfdrecplc = GXutil.concat( GXutil.rtrim( AV54Ingenieria_drecwwds_6_tfdrecplc), "%", "") ;
      lV56Ingenieria_drecwwds_8_tfdrecval = GXutil.padr( GXutil.rtrim( AV56Ingenieria_drecwwds_8_tfdrecval), 12, "%") ;
      /* Using cursor P0AUZ2 */
      pr_default.execute(0, new Object[] {lV49Ingenieria_drecwwds_1_filterfulltext, lV49Ingenieria_drecwwds_1_filterfulltext, lV49Ingenieria_drecwwds_1_filterfulltext, lV49Ingenieria_drecwwds_1_filterfulltext, Long.valueOf(AV50Ingenieria_drecwwds_2_tfdrecid), Long.valueOf(AV51Ingenieria_drecwwds_3_tfdrecid_to), lV52Ingenieria_drecwwds_4_tfdrecmaqcod, AV53Ingenieria_drecwwds_5_tfdrecmaqcod_sel, lV54Ingenieria_drecwwds_6_tfdrecplc, AV55Ingenieria_drecwwds_7_tfdrecplc_sel, lV56Ingenieria_drecwwds_8_tfdrecval, AV57Ingenieria_drecwwds_9_tfdrecval_sel, AV58Ingenieria_drecwwds_10_tfdrecfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14676DRecFec = P0AUZ2_A14676DRecFec[0] ;
         A14707DRecVal = P0AUZ2_A14707DRecVal[0] ;
         A14706DRecPLC = P0AUZ2_A14706DRecPLC[0] ;
         A14705DRecMaqCod = P0AUZ2_A14705DRecMaqCod[0] ;
         A14675DRecId = P0AUZ2_A14675DRecId[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14675DRecId );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14705DRecMaqCod, GXv_char5) ;
            drecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14706DRecPLC, GXv_char5) ;
            drecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14707DRecVal, GXv_char5) ;
            drecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A14676DRecFec );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DRecId", "", "Id", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DRecMaqCod", "", "Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DRecPLC", "", "Enlace c/PLC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DRecVal", "", "Valor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DRecFec", "", "Recepción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.DRecWWColumnsSelector", GXv_char5) ;
      drecwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Ingenieria.DRecWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.DRecWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Ingenieria.DRecWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV59GXV2 = 1 ;
      while ( AV59GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECID") == 0 )
         {
            AV34TFDRecId = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV35TFDRecId_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECMAQCOD") == 0 )
         {
            AV36TFDRecMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECMAQCOD_SEL") == 0 )
         {
            AV37TFDRecMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECPLC") == 0 )
         {
            AV38TFDRecPLC = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECPLC_SEL") == 0 )
         {
            AV39TFDRecPLC_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECVAL") == 0 )
         {
            AV40TFDRecVal = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECVAL_SEL") == 0 )
         {
            AV41TFDRecVal_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECFEC") == 0 )
         {
            AV42TFDRecFec = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV59GXV2 = (int)(AV59GXV2+1) ;
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
      this.aP0[0] = drecwwexport.this.AV11Filename;
      this.aP1[0] = drecwwexport.this.AV12ErrorMessage;
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
      AV37TFDRecMaqCod_Sel = "" ;
      AV36TFDRecMaqCod = "" ;
      AV39TFDRecPLC_Sel = "" ;
      AV38TFDRecPLC = "" ;
      AV41TFDRecVal_Sel = "" ;
      AV40TFDRecVal = "" ;
      AV42TFDRecFec = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A14705DRecMaqCod = "" ;
      A14706DRecPLC = "" ;
      A14707DRecVal = "" ;
      A14676DRecFec = GXutil.resetTime( GXutil.nullDate() );
      AV49Ingenieria_drecwwds_1_filterfulltext = "" ;
      AV52Ingenieria_drecwwds_4_tfdrecmaqcod = "" ;
      AV53Ingenieria_drecwwds_5_tfdrecmaqcod_sel = "" ;
      AV54Ingenieria_drecwwds_6_tfdrecplc = "" ;
      AV55Ingenieria_drecwwds_7_tfdrecplc_sel = "" ;
      AV56Ingenieria_drecwwds_8_tfdrecval = "" ;
      AV57Ingenieria_drecwwds_9_tfdrecval_sel = "" ;
      AV58Ingenieria_drecwwds_10_tfdrecfec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV49Ingenieria_drecwwds_1_filterfulltext = "" ;
      lV52Ingenieria_drecwwds_4_tfdrecmaqcod = "" ;
      lV54Ingenieria_drecwwds_6_tfdrecplc = "" ;
      lV56Ingenieria_drecwwds_8_tfdrecval = "" ;
      P0AUZ2_A14676DRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUZ2_A14707DRecVal = new String[] {""} ;
      P0AUZ2_A14706DRecPLC = new String[] {""} ;
      P0AUZ2_A14705DRecMaqCod = new String[] {""} ;
      P0AUZ2_A14675DRecId = new long[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.drecwwexport__default(),
         new Object[] {
             new Object[] {
            P0AUZ2_A14676DRecFec, P0AUZ2_A14707DRecVal, P0AUZ2_A14706DRecPLC, P0AUZ2_A14705DRecMaqCod, P0AUZ2_A14675DRecId
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
   private int AV47GXV1 ;
   private int AV59GXV2 ;
   private long AV34TFDRecId ;
   private long AV35TFDRecId_To ;
   private long AV31VisibleColumnCount ;
   private long A14675DRecId ;
   private long AV50Ingenieria_drecwwds_2_tfdrecid ;
   private long AV51Ingenieria_drecwwds_3_tfdrecid_to ;
   private String AV37TFDRecMaqCod_Sel ;
   private String AV36TFDRecMaqCod ;
   private String AV41TFDRecVal_Sel ;
   private String AV40TFDRecVal ;
   private String A14705DRecMaqCod ;
   private String A14707DRecVal ;
   private String AV52Ingenieria_drecwwds_4_tfdrecmaqcod ;
   private String AV53Ingenieria_drecwwds_5_tfdrecmaqcod_sel ;
   private String AV56Ingenieria_drecwwds_8_tfdrecval ;
   private String AV57Ingenieria_drecwwds_9_tfdrecval_sel ;
   private String scmdbuf ;
   private String lV52Ingenieria_drecwwds_4_tfdrecmaqcod ;
   private String lV56Ingenieria_drecwwds_8_tfdrecval ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV42TFDRecFec ;
   private java.util.Date A14676DRecFec ;
   private java.util.Date AV58Ingenieria_drecwwds_10_tfdrecfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV39TFDRecPLC_Sel ;
   private String AV38TFDRecPLC ;
   private String A14706DRecPLC ;
   private String AV49Ingenieria_drecwwds_1_filterfulltext ;
   private String AV54Ingenieria_drecwwds_6_tfdrecplc ;
   private String AV55Ingenieria_drecwwds_7_tfdrecplc_sel ;
   private String lV49Ingenieria_drecwwds_1_filterfulltext ;
   private String lV54Ingenieria_drecwwds_6_tfdrecplc ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0AUZ2_A14676DRecFec ;
   private String[] P0AUZ2_A14707DRecVal ;
   private String[] P0AUZ2_A14706DRecPLC ;
   private String[] P0AUZ2_A14705DRecMaqCod ;
   private long[] P0AUZ2_A14675DRecId ;
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

final  class drecwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Ingenieria_drecwwds_1_filterfulltext ,
                                          long AV50Ingenieria_drecwwds_2_tfdrecid ,
                                          long AV51Ingenieria_drecwwds_3_tfdrecid_to ,
                                          String AV53Ingenieria_drecwwds_5_tfdrecmaqcod_sel ,
                                          String AV52Ingenieria_drecwwds_4_tfdrecmaqcod ,
                                          String AV55Ingenieria_drecwwds_7_tfdrecplc_sel ,
                                          String AV54Ingenieria_drecwwds_6_tfdrecplc ,
                                          String AV57Ingenieria_drecwwds_9_tfdrecval_sel ,
                                          String AV56Ingenieria_drecwwds_8_tfdrecval ,
                                          java.util.Date AV58Ingenieria_drecwwds_10_tfdrecfec ,
                                          long A14675DRecId ,
                                          String A14705DRecMaqCod ,
                                          String A14706DRecPLC ,
                                          String A14707DRecVal ,
                                          java.util.Date A14676DRecFec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[13];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT DRecFec, DRecVal, DRecPLC, DRecMaqCod, DRecId FROM DRec" ;
      if ( ! (GXutil.strcmp("", AV49Ingenieria_drecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DRecId,'999999999990'), 2) like '%' || ?) or ( UPPER(DRecMaqCod) like '%' || UPPER(?)) or ( UPPER(DRecPLC) like '%' || UPPER(?)) or ( UPPER(DRecVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV50Ingenieria_drecwwds_2_tfdrecid) )
      {
         addWhere(sWhereString, "(DRecId >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV51Ingenieria_drecwwds_3_tfdrecid_to) )
      {
         addWhere(sWhereString, "(DRecId <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Ingenieria_drecwwds_5_tfdrecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Ingenieria_drecwwds_4_tfdrecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Ingenieria_drecwwds_5_tfdrecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(DRecMaqCod = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ingenieria_drecwwds_7_tfdrecplc_sel)==0) && ( ! (GXutil.strcmp("", AV54Ingenieria_drecwwds_6_tfdrecplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ingenieria_drecwwds_7_tfdrecplc_sel)==0) )
      {
         addWhere(sWhereString, "(DRecPLC = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Ingenieria_drecwwds_9_tfdrecval_sel)==0) && ( ! (GXutil.strcmp("", AV56Ingenieria_drecwwds_8_tfdrecval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Ingenieria_drecwwds_9_tfdrecval_sel)==0) )
      {
         addWhere(sWhereString, "(DRecVal = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV58Ingenieria_drecwwds_10_tfdrecfec) )
      {
         addWhere(sWhereString, "(DRecFec >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DRecMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DRecMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DRecId" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DRecId DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DRecPLC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DRecPLC DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DRecVal" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DRecVal DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DRecFec" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DRecFec DESC" ;
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
                  return conditional_P0AUZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1, true);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 12);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 12);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false, true);
               }
               return;
      }
   }

}

