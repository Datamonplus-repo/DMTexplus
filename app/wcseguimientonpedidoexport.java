package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcseguimientonpedidoexport extends GXProcedure
{
   public wcseguimientonpedidoexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcseguimientonpedidoexport.class ), "" );
   }

   public wcseguimientonpedidoexport( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcseguimientonpedidoexport.this.aP1 = new String[] {""};
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
      wcseguimientonpedidoexport.this.aP0 = aP0;
      wcseguimientonpedidoexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCSeguimientoNPedidoExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49FilterFullText, GXv_char5) ;
      wcseguimientonpedidoexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV34TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFPrdNum_Sel, GXv_char5) ;
         wcseguimientonpedidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV33TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV33TFPrdNum, GXv_char5) ;
            wcseguimientonpedidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV36TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNom_Sel, GXv_char5) ;
         wcseguimientonpedidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV35TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFPrdNom, GXv_char5) ;
            wcseguimientonpedidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPedUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPedUni_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cant Ped", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV37TFPedUni)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV38TFPedUni_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPedCanEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPedCanEnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cant Ent", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39TFPedCanEnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFPedCanEnt_To)) );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41TFPedFulEnt)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fec Ult Ent", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV41TFPedFulEnt );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( ( AV44TFPedCum_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcseguimientonpedidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV46i = 1 ;
         AV52GXV1 = 1 ;
         while ( AV52GXV1 <= AV44TFPedCum_Sels.size() )
         {
            AV45TFPedCum_Sel = (String)AV44TFPedCum_Sels.elementAt(-1+AV52GXV1) ;
            if ( AV46i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV45TFPedCum_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV45TFPedCum_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Cerrado", "") );
            }
            AV46i = (long)(AV46i+1) ;
            AV52GXV1 = (int)(AV52GXV1+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("WCSeguimientoNPedidoColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("WCSeguimientoNPedidoColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV53GXV2 = 1 ;
      while ( AV53GXV2 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV53GXV2));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV53GXV2 = (int)(AV53GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV55Wcseguimientonpedidods_1_filterfulltext = AV49FilterFullText ;
      AV56Wcseguimientonpedidods_2_tfprdnum = AV33TFPrdNum ;
      AV57Wcseguimientonpedidods_3_tfprdnum_sel = AV34TFPrdNum_Sel ;
      AV58Wcseguimientonpedidods_4_tfprdnom = AV35TFPrdNom ;
      AV59Wcseguimientonpedidods_5_tfprdnom_sel = AV36TFPrdNom_Sel ;
      AV60Wcseguimientonpedidods_6_tfpeduni = AV37TFPedUni ;
      AV61Wcseguimientonpedidods_7_tfpeduni_to = AV38TFPedUni_To ;
      AV62Wcseguimientonpedidods_8_tfpedcanent = AV39TFPedCanEnt ;
      AV63Wcseguimientonpedidods_9_tfpedcanent_to = AV40TFPedCanEnt_To ;
      AV64Wcseguimientonpedidods_10_tfpedfulent = AV41TFPedFulEnt ;
      AV65Wcseguimientonpedidods_11_tfpedcum_sels = AV44TFPedCum_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A659PedCum ,
                                           AV65Wcseguimientonpedidods_11_tfpedcum_sels ,
                                           AV55Wcseguimientonpedidods_1_filterfulltext ,
                                           AV57Wcseguimientonpedidods_3_tfprdnum_sel ,
                                           AV56Wcseguimientonpedidods_2_tfprdnum ,
                                           AV59Wcseguimientonpedidods_5_tfprdnom_sel ,
                                           AV58Wcseguimientonpedidods_4_tfprdnom ,
                                           AV60Wcseguimientonpedidods_6_tfpeduni ,
                                           AV61Wcseguimientonpedidods_7_tfpeduni_to ,
                                           AV62Wcseguimientonpedidods_8_tfpedcanent ,
                                           AV63Wcseguimientonpedidods_9_tfpedcanent_to ,
                                           AV64Wcseguimientonpedidods_10_tfpedfulent ,
                                           Integer.valueOf(AV65Wcseguimientonpedidods_11_tfpedcum_sels.size()) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A663PedFulEnt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV47Emprcod ,
                                           Integer.valueOf(AV48PedCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV55Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV55Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV55Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV55Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV55Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV56Wcseguimientonpedidods_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV56Wcseguimientonpedidods_2_tfprdnum), 6, "%") ;
      lV58Wcseguimientonpedidods_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV58Wcseguimientonpedidods_4_tfprdnom), 26, "%") ;
      /* Using cursor P08PO2 */
      pr_default.execute(0, new Object[] {AV47Emprcod, Integer.valueOf(AV48PedCod), lV55Wcseguimientonpedidods_1_filterfulltext, lV55Wcseguimientonpedidods_1_filterfulltext, lV55Wcseguimientonpedidods_1_filterfulltext, lV55Wcseguimientonpedidods_1_filterfulltext, lV55Wcseguimientonpedidods_1_filterfulltext, lV56Wcseguimientonpedidods_2_tfprdnum, AV57Wcseguimientonpedidods_3_tfprdnum_sel, lV58Wcseguimientonpedidods_4_tfprdnom, AV59Wcseguimientonpedidods_5_tfprdnom_sel, AV60Wcseguimientonpedidods_6_tfpeduni, AV61Wcseguimientonpedidods_7_tfpeduni_to, AV62Wcseguimientonpedidods_8_tfpedcanent, AV63Wcseguimientonpedidods_9_tfpedcanent_to, AV64Wcseguimientonpedidods_10_tfpedfulent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P08PO2_A658PedCod[0] ;
         A396EmprCod = P08PO2_A396EmprCod[0] ;
         A659PedCum = P08PO2_A659PedCum[0] ;
         A663PedFulEnt = P08PO2_A663PedFulEnt[0] ;
         A657PedCanEnt = P08PO2_A657PedCanEnt[0] ;
         A669PedUni = P08PO2_A669PedUni[0] ;
         A718PrdNom = P08PO2_A718PrdNom[0] ;
         A719PrdNum = P08PO2_A719PrdNum[0] ;
         A661PedFec = P08PO2_A661PedFec[0] ;
         A661PedFec = P08PO2_A661PedFec[0] ;
         A718PrdNom = P08PO2_A718PrdNom[0] ;
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
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            wcseguimientonpedidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            wcseguimientonpedidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A669PedUni)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A657PedCanEnt)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A663PedFulEnt );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( A659PedCum), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A659PedCum), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Cerrado", "") );
            }
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum", "", "Producto", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNom", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedUni", "", "Cant Ped", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedCanEnt", "", "Cant Ent", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedFulEnt", "", "Fec Ult Ent", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedCum", "", "Estado", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCSeguimientoNPedidoColumnsSelector", GXv_char5) ;
      wcseguimientonpedidoexport.this.GXt_char4 = GXv_char5[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("WCSeguimientoNPedidoGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCSeguimientoNPedidoGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("WCSeguimientoNPedidoGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV66GXV3 = 1 ;
      while ( AV66GXV3 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV3));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV33TFPrdNum = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV34TFPrdNum_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV35TFPrdNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV36TFPrdNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDUNI") == 0 )
         {
            AV37TFPedUni = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFPedUni_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCANENT") == 0 )
         {
            AV39TFPedCanEnt = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFPedCanEnt_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFULENT") == 0 )
         {
            AV41TFPedFulEnt = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCUM_SEL") == 0 )
         {
            AV43TFPedCum_SelsJson = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV44TFPedCum_Sels.fromJSonString(AV43TFPedCum_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDCOD") == 0 )
         {
            AV48PedCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV66GXV3 = (int)(AV66GXV3+1) ;
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
      this.aP0[0] = wcseguimientonpedidoexport.this.AV11Filename;
      this.aP1[0] = wcseguimientonpedidoexport.this.AV12ErrorMessage;
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
      AV49FilterFullText = "" ;
      AV34TFPrdNum_Sel = "" ;
      AV33TFPrdNum = "" ;
      AV36TFPrdNom_Sel = "" ;
      AV35TFPrdNom = "" ;
      AV37TFPedUni = DecimalUtil.ZERO ;
      AV38TFPedUni_To = DecimalUtil.ZERO ;
      AV39TFPedCanEnt = DecimalUtil.ZERO ;
      AV40TFPedCanEnt_To = DecimalUtil.ZERO ;
      AV41TFPedFulEnt = GXutil.nullDate() ;
      AV44TFPedCum_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV45TFPedCum_Sel = "" ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A663PedFulEnt = GXutil.nullDate() ;
      A659PedCum = "" ;
      AV55Wcseguimientonpedidods_1_filterfulltext = "" ;
      AV56Wcseguimientonpedidods_2_tfprdnum = "" ;
      AV57Wcseguimientonpedidods_3_tfprdnum_sel = "" ;
      AV58Wcseguimientonpedidods_4_tfprdnom = "" ;
      AV59Wcseguimientonpedidods_5_tfprdnom_sel = "" ;
      AV60Wcseguimientonpedidods_6_tfpeduni = DecimalUtil.ZERO ;
      AV61Wcseguimientonpedidods_7_tfpeduni_to = DecimalUtil.ZERO ;
      AV62Wcseguimientonpedidods_8_tfpedcanent = DecimalUtil.ZERO ;
      AV63Wcseguimientonpedidods_9_tfpedcanent_to = DecimalUtil.ZERO ;
      AV64Wcseguimientonpedidods_10_tfpedfulent = GXutil.nullDate() ;
      AV65Wcseguimientonpedidods_11_tfpedcum_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV55Wcseguimientonpedidods_1_filterfulltext = "" ;
      lV56Wcseguimientonpedidods_2_tfprdnum = "" ;
      lV58Wcseguimientonpedidods_4_tfprdnom = "" ;
      AV47Emprcod = "" ;
      A396EmprCod = "" ;
      P08PO2_A658PedCod = new int[1] ;
      P08PO2_A396EmprCod = new String[] {""} ;
      P08PO2_A659PedCum = new String[] {""} ;
      P08PO2_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PO2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PO2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PO2_A718PrdNom = new String[] {""} ;
      P08PO2_A719PrdNum = new String[] {""} ;
      P08PO2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      A661PedFec = GXutil.nullDate() ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV43TFPedCum_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcseguimientonpedidoexport__default(),
         new Object[] {
             new Object[] {
            P08PO2_A658PedCod, P08PO2_A396EmprCod, P08PO2_A659PedCum, P08PO2_A663PedFulEnt, P08PO2_A657PedCanEnt, P08PO2_A669PedUni, P08PO2_A718PrdNom, P08PO2_A719PrdNum, P08PO2_A661PedFec
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
   private int AV52GXV1 ;
   private int AV53GXV2 ;
   private int AV65Wcseguimientonpedidods_11_tfpedcum_sels_size ;
   private int AV48PedCod ;
   private int A658PedCod ;
   private int AV66GXV3 ;
   private long AV46i ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV37TFPedUni ;
   private java.math.BigDecimal AV38TFPedUni_To ;
   private java.math.BigDecimal AV39TFPedCanEnt ;
   private java.math.BigDecimal AV40TFPedCanEnt_To ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal AV60Wcseguimientonpedidods_6_tfpeduni ;
   private java.math.BigDecimal AV61Wcseguimientonpedidods_7_tfpeduni_to ;
   private java.math.BigDecimal AV62Wcseguimientonpedidods_8_tfpedcanent ;
   private java.math.BigDecimal AV63Wcseguimientonpedidods_9_tfpedcanent_to ;
   private String AV34TFPrdNum_Sel ;
   private String AV33TFPrdNum ;
   private String AV36TFPrdNom_Sel ;
   private String AV35TFPrdNom ;
   private String AV45TFPedCum_Sel ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A659PedCum ;
   private String AV56Wcseguimientonpedidods_2_tfprdnum ;
   private String AV57Wcseguimientonpedidods_3_tfprdnum_sel ;
   private String AV58Wcseguimientonpedidods_4_tfprdnom ;
   private String AV59Wcseguimientonpedidods_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV56Wcseguimientonpedidods_2_tfprdnum ;
   private String lV58Wcseguimientonpedidods_4_tfprdnom ;
   private String AV47Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV41TFPedFulEnt ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date AV64Wcseguimientonpedidods_10_tfpedfulent ;
   private java.util.Date A661PedFec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV43TFPedCum_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV49FilterFullText ;
   private String AV55Wcseguimientonpedidods_1_filterfulltext ;
   private String lV55Wcseguimientonpedidods_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private GXSimpleCollection<String> AV44TFPedCum_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P08PO2_A658PedCod ;
   private String[] P08PO2_A396EmprCod ;
   private String[] P08PO2_A659PedCum ;
   private java.util.Date[] P08PO2_A663PedFulEnt ;
   private java.math.BigDecimal[] P08PO2_A657PedCanEnt ;
   private java.math.BigDecimal[] P08PO2_A669PedUni ;
   private String[] P08PO2_A718PrdNom ;
   private String[] P08PO2_A719PrdNum ;
   private java.util.Date[] P08PO2_A661PedFec ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV65Wcseguimientonpedidods_11_tfpedcum_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class wcseguimientonpedidoexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A659PedCum ,
                                          GXSimpleCollection<String> AV65Wcseguimientonpedidods_11_tfpedcum_sels ,
                                          String AV55Wcseguimientonpedidods_1_filterfulltext ,
                                          String AV57Wcseguimientonpedidods_3_tfprdnum_sel ,
                                          String AV56Wcseguimientonpedidods_2_tfprdnum ,
                                          String AV59Wcseguimientonpedidods_5_tfprdnom_sel ,
                                          String AV58Wcseguimientonpedidods_4_tfprdnom ,
                                          java.math.BigDecimal AV60Wcseguimientonpedidods_6_tfpeduni ,
                                          java.math.BigDecimal AV61Wcseguimientonpedidods_7_tfpeduni_to ,
                                          java.math.BigDecimal AV62Wcseguimientonpedidods_8_tfpedcanent ,
                                          java.math.BigDecimal AV63Wcseguimientonpedidods_9_tfpedcanent_to ,
                                          java.util.Date AV64Wcseguimientonpedidods_10_tfpedfulent ,
                                          int AV65Wcseguimientonpedidods_11_tfpedcum_sels_size ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.util.Date A663PedFulEnt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV47Emprcod ,
                                          int AV48PedCod ,
                                          String A396EmprCod ,
                                          int A658PedCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[16];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.PedCod, T1.EmprCod, T1.PedCum, T1.PedFulEnt, T1.PedCanEnt, T1.PedUni, T3.PrdNom, T1.PrdNum, T2.PedFec FROM ((TXPLPEDID T1 INNER JOIN TXPCPEDID T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PedCod = T1.PedCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PedCod = ?)");
      if ( ! (GXutil.strcmp("", AV55Wcseguimientonpedidods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T3.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PedCum) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcseguimientonpedidods_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcseguimientonpedidods_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcseguimientonpedidods_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcseguimientonpedidods_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcseguimientonpedidods_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcseguimientonpedidods_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcseguimientonpedidods_6_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcseguimientonpedidods_7_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcseguimientonpedidods_8_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcseguimientonpedidods_9_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Wcseguimientonpedidods_10_tfpedfulent)) )
      {
         addWhere(sWhereString, "(T1.PedFulEnt >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( AV65Wcseguimientonpedidods_11_tfpedcum_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV65Wcseguimientonpedidods_11_tfpedcum_sels, "T1.PedCum IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T2.PedFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedUni" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCanEnt" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCanEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFulEnt" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFulEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCum" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCum DESC" ;
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
                  return conditional_P08PO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
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
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
      }
   }

}

