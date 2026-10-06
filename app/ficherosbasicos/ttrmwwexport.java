package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrmwwexport extends GXProcedure
{
   public ttrmwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrmwwexport.class ), "" );
   }

   public ttrmwwexport( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttrmwwexport.this.aP1 = new String[] {""};
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
      ttrmwwexport.this.aP0 = aP0;
      ttrmwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TTRMWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      ttrmwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFTRMDivID) && (0==AV35TFTRMDivID_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Divisa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFTRMDivID );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFTRMDivID_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFTRMDivNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFTRMDivNom_Sel, GXv_char5) ;
         ttrmwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFTRMDivNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFTRMDivNom, GXv_char5) ;
            ttrmwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV38TFTRMFecha) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV38TFTRMFecha );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFTRMCompra)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFTRMCompra_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "$ compra", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFTRMCompra)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFTRMCompra_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFTRMVenta)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFTRMVenta_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "$ venta", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFTRMVenta)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFTRMVenta_To)) );
      }
      if ( ! ( ( AV45TFTRMAutMan_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Registración", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrmwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV47i = 1 ;
         AV50GXV1 = 1 ;
         while ( AV50GXV1 <= AV45TFTRMAutMan_Sels.size() )
         {
            AV46TFTRMAutMan_Sel = (String)AV45TFTRMAutMan_Sels.elementAt(-1+AV50GXV1) ;
            if ( AV47i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV46TFTRMAutMan_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Automática", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV46TFTRMAutMan_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Manual", "") );
            }
            AV47i = (long)(AV47i+1) ;
            AV50GXV1 = (int)(AV50GXV1+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TTRMWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FicherosBasicos.TTRMWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV51GXV2 = 1 ;
      while ( AV51GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV51GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV51GXV2 = (int)(AV51GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Ficherosbasicos_ttrmwwds_1_filterfulltext = AV18FilterFullText ;
      AV54Ficherosbasicos_ttrmwwds_2_tftrmdivid = AV34TFTRMDivID ;
      AV55Ficherosbasicos_ttrmwwds_3_tftrmdivid_to = AV35TFTRMDivID_To ;
      AV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom = AV36TFTRMDivNom ;
      AV57Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel = AV37TFTRMDivNom_Sel ;
      AV58Ficherosbasicos_ttrmwwds_6_tftrmfecha = AV38TFTRMFecha ;
      AV59Ficherosbasicos_ttrmwwds_7_tftrmcompra = AV40TFTRMCompra ;
      AV60Ficherosbasicos_ttrmwwds_8_tftrmcompra_to = AV41TFTRMCompra_To ;
      AV61Ficherosbasicos_ttrmwwds_9_tftrmventa = AV42TFTRMVenta ;
      AV62Ficherosbasicos_ttrmwwds_10_tftrmventa_to = AV43TFTRMVenta_To ;
      AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels = AV45TFTRMAutMan_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14110TRMAutMan ,
                                           AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ,
                                           Byte.valueOf(AV54Ficherosbasicos_ttrmwwds_2_tftrmdivid) ,
                                           Byte.valueOf(AV55Ficherosbasicos_ttrmwwds_3_tftrmdivid_to) ,
                                           AV57Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ,
                                           AV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom ,
                                           AV58Ficherosbasicos_ttrmwwds_6_tftrmfecha ,
                                           AV59Ficherosbasicos_ttrmwwds_7_tftrmcompra ,
                                           AV60Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ,
                                           AV61Ficherosbasicos_ttrmwwds_9_tftrmventa ,
                                           AV62Ficherosbasicos_ttrmwwds_10_tftrmventa_to ,
                                           Integer.valueOf(AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels.size()) ,
                                           Byte.valueOf(A14105TRMDivID) ,
                                           A14107TRMDivNom ,
                                           A14106TRMFecha ,
                                           A14108TRMCompra ,
                                           A14109TRMVenta ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV53Ficherosbasicos_ttrmwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom = GXutil.padr( GXutil.rtrim( AV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom), 30, "%") ;
      /* Using cursor P09QK2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV54Ficherosbasicos_ttrmwwds_2_tftrmdivid), Byte.valueOf(AV55Ficherosbasicos_ttrmwwds_3_tftrmdivid_to), lV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom, AV57Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel, AV58Ficherosbasicos_ttrmwwds_6_tftrmfecha, AV59Ficherosbasicos_ttrmwwds_7_tftrmcompra, AV60Ficherosbasicos_ttrmwwds_8_tftrmcompra_to, AV61Ficherosbasicos_ttrmwwds_9_tftrmventa, AV62Ficherosbasicos_ttrmwwds_10_tftrmventa_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14109TRMVenta = P09QK2_A14109TRMVenta[0] ;
         A14108TRMCompra = P09QK2_A14108TRMCompra[0] ;
         A14106TRMFecha = P09QK2_A14106TRMFecha[0] ;
         A14107TRMDivNom = P09QK2_A14107TRMDivNom[0] ;
         n14107TRMDivNom = P09QK2_n14107TRMDivNom[0] ;
         A14105TRMDivID = P09QK2_A14105TRMDivID[0] ;
         A14110TRMAutMan = P09QK2_A14110TRMAutMan[0] ;
         A396EmprCod = P09QK2_A396EmprCod[0] ;
         A14107TRMDivNom = P09QK2_A14107TRMDivNom[0] ;
         n14107TRMDivNom = P09QK2_n14107TRMDivNom[0] ;
         if ( (GXutil.strcmp("", AV53Ficherosbasicos_ttrmwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A14105TRMDivID, 2, 0) , GXutil.padr( "%" + AV53Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14107TRMDivNom) , GXutil.padr( "%" + GXutil.upper( AV53Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14108TRMCompra, 11, 2) , GXutil.padr( "%" + AV53Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14109TRMVenta, 11, 2) , GXutil.padr( "%" + AV53Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automática", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "M", "")) == 0 ) ) ) )
         {
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
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14105TRMDivID );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14107TRMDivNom, GXv_char5) ;
               ttrmwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A14106TRMFecha );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14108TRMCompra)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14109TRMVenta)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A14110TRMAutMan), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Automática", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A14110TRMAutMan), httpContext.getMessage( "M", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Manual", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TRMDivID", "", "Divisa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TRMDivNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TRMFecha", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TRMCompra", "", "$ compra", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TRMVenta", "", "$ venta", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TRMAutMan", "", "Registración", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TTRMWWColumnsSelector", GXv_char5) ;
      ttrmwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TTRMWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTRMWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FicherosBasicos.TTRMWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV64GXV3 = 1 ;
      while ( AV64GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVID") == 0 )
         {
            AV34TFTRMDivID = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFTRMDivID_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVNOM") == 0 )
         {
            AV36TFTRMDivNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVNOM_SEL") == 0 )
         {
            AV37TFTRMDivNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMFECHA") == 0 )
         {
            AV38TFTRMFecha = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMCOMPRA") == 0 )
         {
            AV40TFTRMCompra = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFTRMCompra_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMVENTA") == 0 )
         {
            AV42TFTRMVenta = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFTRMVenta_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMAUTMAN_SEL") == 0 )
         {
            AV44TFTRMAutMan_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFTRMAutMan_Sels.fromJSonString(AV44TFTRMAutMan_SelsJson, null);
         }
         AV64GXV3 = (int)(AV64GXV3+1) ;
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
      this.aP0[0] = ttrmwwexport.this.AV11Filename;
      this.aP1[0] = ttrmwwexport.this.AV12ErrorMessage;
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
      AV37TFTRMDivNom_Sel = "" ;
      AV36TFTRMDivNom = "" ;
      AV38TFTRMFecha = GXutil.resetTime( GXutil.nullDate() );
      AV40TFTRMCompra = DecimalUtil.ZERO ;
      AV41TFTRMCompra_To = DecimalUtil.ZERO ;
      AV42TFTRMVenta = DecimalUtil.ZERO ;
      AV43TFTRMVenta_To = DecimalUtil.ZERO ;
      AV45TFTRMAutMan_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV46TFTRMAutMan_Sel = "" ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A14107TRMDivNom = "" ;
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A14108TRMCompra = DecimalUtil.ZERO ;
      A14109TRMVenta = DecimalUtil.ZERO ;
      A14110TRMAutMan = "" ;
      AV53Ficherosbasicos_ttrmwwds_1_filterfulltext = "" ;
      AV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom = "" ;
      AV57Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel = "" ;
      AV58Ficherosbasicos_ttrmwwds_6_tftrmfecha = GXutil.resetTime( GXutil.nullDate() );
      AV59Ficherosbasicos_ttrmwwds_7_tftrmcompra = DecimalUtil.ZERO ;
      AV60Ficherosbasicos_ttrmwwds_8_tftrmcompra_to = DecimalUtil.ZERO ;
      AV61Ficherosbasicos_ttrmwwds_9_tftrmventa = DecimalUtil.ZERO ;
      AV62Ficherosbasicos_ttrmwwds_10_tftrmventa_to = DecimalUtil.ZERO ;
      AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom = "" ;
      P09QK2_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QK2_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QK2_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P09QK2_A14107TRMDivNom = new String[] {""} ;
      P09QK2_n14107TRMDivNom = new boolean[] {false} ;
      P09QK2_A14105TRMDivID = new byte[1] ;
      P09QK2_A14110TRMAutMan = new String[] {""} ;
      P09QK2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44TFTRMAutMan_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrmwwexport__default(),
         new Object[] {
             new Object[] {
            P09QK2_A14109TRMVenta, P09QK2_A14108TRMCompra, P09QK2_A14106TRMFecha, P09QK2_A14107TRMDivNom, P09QK2_n14107TRMDivNom, P09QK2_A14105TRMDivID, P09QK2_A14110TRMAutMan, P09QK2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34TFTRMDivID ;
   private byte AV35TFTRMDivID_To ;
   private byte A14105TRMDivID ;
   private byte AV54Ficherosbasicos_ttrmwwds_2_tftrmdivid ;
   private byte AV55Ficherosbasicos_ttrmwwds_3_tftrmdivid_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV50GXV1 ;
   private int AV51GXV2 ;
   private int AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size ;
   private int AV64GXV3 ;
   private long AV47i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV40TFTRMCompra ;
   private java.math.BigDecimal AV41TFTRMCompra_To ;
   private java.math.BigDecimal AV42TFTRMVenta ;
   private java.math.BigDecimal AV43TFTRMVenta_To ;
   private java.math.BigDecimal A14108TRMCompra ;
   private java.math.BigDecimal A14109TRMVenta ;
   private java.math.BigDecimal AV59Ficherosbasicos_ttrmwwds_7_tftrmcompra ;
   private java.math.BigDecimal AV60Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ;
   private java.math.BigDecimal AV61Ficherosbasicos_ttrmwwds_9_tftrmventa ;
   private java.math.BigDecimal AV62Ficherosbasicos_ttrmwwds_10_tftrmventa_to ;
   private String AV37TFTRMDivNom_Sel ;
   private String AV36TFTRMDivNom ;
   private String AV46TFTRMAutMan_Sel ;
   private String A14107TRMDivNom ;
   private String A14110TRMAutMan ;
   private String AV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom ;
   private String AV57Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ;
   private String scmdbuf ;
   private String lV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV38TFTRMFecha ;
   private java.util.Date A14106TRMFecha ;
   private java.util.Date AV58Ficherosbasicos_ttrmwwds_6_tftrmfecha ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n14107TRMDivNom ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV44TFTRMAutMan_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV53Ficherosbasicos_ttrmwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV45TFTRMAutMan_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09QK2_A14109TRMVenta ;
   private java.math.BigDecimal[] P09QK2_A14108TRMCompra ;
   private java.util.Date[] P09QK2_A14106TRMFecha ;
   private String[] P09QK2_A14107TRMDivNom ;
   private boolean[] P09QK2_n14107TRMDivNom ;
   private byte[] P09QK2_A14105TRMDivID ;
   private String[] P09QK2_A14110TRMAutMan ;
   private String[] P09QK2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ;
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

final  class ttrmwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09QK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14110TRMAutMan ,
                                          GXSimpleCollection<String> AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ,
                                          byte AV54Ficherosbasicos_ttrmwwds_2_tftrmdivid ,
                                          byte AV55Ficherosbasicos_ttrmwwds_3_tftrmdivid_to ,
                                          String AV57Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ,
                                          String AV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom ,
                                          java.util.Date AV58Ficherosbasicos_ttrmwwds_6_tftrmfecha ,
                                          java.math.BigDecimal AV59Ficherosbasicos_ttrmwwds_7_tftrmcompra ,
                                          java.math.BigDecimal AV60Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ,
                                          java.math.BigDecimal AV61Ficherosbasicos_ttrmwwds_9_tftrmventa ,
                                          java.math.BigDecimal AV62Ficherosbasicos_ttrmwwds_10_tftrmventa_to ,
                                          int AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size ,
                                          byte A14105TRMDivID ,
                                          String A14107TRMDivNom ,
                                          java.util.Date A14106TRMFecha ,
                                          java.math.BigDecimal A14108TRMCompra ,
                                          java.math.BigDecimal A14109TRMVenta ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV53Ficherosbasicos_ttrmwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[9];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.TRMVenta, T1.TRMCompra, T1.TRMFecha, T2.DivNom AS TRMDivNom, T1.TRMDivID AS TRMDivID, T1.TRMAutMan, T1.EmprCod FROM (TXPTRM T1 INNER JOIN TXPDIVISA T2" ;
      scmdbuf += " ON T2.DivCod = T1.TRMDivID)" ;
      if ( ! (0==AV54Ficherosbasicos_ttrmwwds_2_tftrmdivid) )
      {
         addWhere(sWhereString, "(T1.TRMDivID >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV55Ficherosbasicos_ttrmwwds_3_tftrmdivid_to) )
      {
         addWhere(sWhereString, "(T1.TRMDivID <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Ficherosbasicos_ttrmwwds_4_tftrmdivnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivNom = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV58Ficherosbasicos_ttrmwwds_6_tftrmfecha) )
      {
         addWhere(sWhereString, "(T1.TRMFecha >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Ficherosbasicos_ttrmwwds_7_tftrmcompra)==0) )
      {
         addWhere(sWhereString, "(T1.TRMCompra >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Ficherosbasicos_ttrmwwds_8_tftrmcompra_to)==0) )
      {
         addWhere(sWhereString, "(T1.TRMCompra <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Ficherosbasicos_ttrmwwds_9_tftrmventa)==0) )
      {
         addWhere(sWhereString, "(T1.TRMVenta >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Ficherosbasicos_ttrmwwds_10_tftrmventa_to)==0) )
      {
         addWhere(sWhereString, "(T1.TRMVenta <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV63Ficherosbasicos_ttrmwwds_11_tftrmautman_sels, "T1.TRMAutMan IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMFecha" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMFecha DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMDivID" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMDivID DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DivNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DivNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMCompra" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMCompra DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMVenta" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMVenta DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMAutMan" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMAutMan DESC" ;
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
                  return conditional_P09QK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
      }
   }

}

