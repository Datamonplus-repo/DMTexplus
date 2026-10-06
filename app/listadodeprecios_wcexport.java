package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeprecios_wcexport extends GXProcedure
{
   public listadodeprecios_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeprecios_wcexport.class ), "" );
   }

   public listadodeprecios_wcexport( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      listadodeprecios_wcexport.this.aP1 = new String[] {""};
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
      listadodeprecios_wcexport.this.aP0 = aP0;
      listadodeprecios_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV55WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV55WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV8CellRow = 1 ;
      AV22FirstColumn = 1 ;
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
      AV35Random = (int)(GXutil.random( )*10000) ;
      AV20Filename = "./PrivateTempStorage/" + "ListadodePrecios_WCExport-" + GXutil.trim( GXutil.str( AV35Random, 8, 0)) + ".xlsx" ;
      AV19ExcelDocument.Open(AV20Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV19ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV19ExcelDocument ;
      GXv_int3[0] = (short)(AV8CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV19ExcelDocument = GXv_exceldoc2[0] ;
      listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21FilterFullText, GXv_char5) ;
      listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV42TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrdNum_Sel, GXv_char5) ;
         listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV19ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV19ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPrdNum, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFPrdNom_Sel, GXv_char5) ;
         listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV19ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV19ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFPrdNom, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV49TFPrvNum) && (0==AV50TFPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setNumber( AV49TFPrvNum );
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV22FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+3, 1, 1).setNumber( AV50TFPrvNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFPrvNom_Sel, GXv_char5) ;
         listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV19ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV19ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFPrvNom, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV46TFPrdRefPrv_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Referencia", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFPrdRefPrv_Sel, GXv_char5) ;
         listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFPrdRefPrv)==0) ) )
         {
            GXv_exceldoc2[0] = AV19ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Referencia", "")) ;
            AV19ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPrdRefPrv, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdPreAct_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFPrdPreAct)) );
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV22FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFPrdPreAct_To)) );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFPrdFecPre)) ) )
      {
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV37TFPrdFecPre );
         AV19ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV52TFValDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV19ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Validez", "")) ;
         AV19ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFValDsc_Sel, GXv_char5) ;
         listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFValDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV19ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV22FirstColumn), httpContext.getMessage( "Validez", "")) ;
            AV19ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprecios_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFValDsc, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, AV22FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV8CellRow = (int)(AV8CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV54VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV36Session.getValue("ListadodePrecios_WCColumnsSelector"), "") != 0 )
      {
         AV13ColumnsSelectorXML = AV36Session.getValue("ListadodePrecios_WCColumnsSelector") ;
         AV10ColumnsSelector.fromxml(AV13ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV11ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV58GXV1));
         if ( AV11ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV11ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV11ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV11ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setColor( 11 );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Listadodeprecios_wcds_1_filterfulltext = AV21FilterFullText ;
      AV61Listadodeprecios_wcds_2_tfprdnum = AV41TFPrdNum ;
      AV62Listadodeprecios_wcds_3_tfprdnum_sel = AV42TFPrdNum_Sel ;
      AV63Listadodeprecios_wcds_4_tfprdnom = AV39TFPrdNom ;
      AV64Listadodeprecios_wcds_5_tfprdnom_sel = AV40TFPrdNom_Sel ;
      AV65Listadodeprecios_wcds_6_tfprvnum = AV49TFPrvNum ;
      AV66Listadodeprecios_wcds_7_tfprvnum_to = AV50TFPrvNum_To ;
      AV67Listadodeprecios_wcds_8_tfprvnom = AV47TFPrvNom ;
      AV68Listadodeprecios_wcds_9_tfprvnom_sel = AV48TFPrvNom_Sel ;
      AV69Listadodeprecios_wcds_10_tfprdrefprv = AV45TFPrdRefPrv ;
      AV70Listadodeprecios_wcds_11_tfprdrefprv_sel = AV46TFPrdRefPrv_Sel ;
      AV71Listadodeprecios_wcds_12_tfprdpreact = AV43TFPrdPreAct ;
      AV72Listadodeprecios_wcds_13_tfprdpreact_to = AV44TFPrdPreAct_To ;
      AV73Listadodeprecios_wcds_14_tfprdfecpre = AV37TFPrdFecPre ;
      AV74Listadodeprecios_wcds_15_tfvaldsc = AV51TFValDsc ;
      AV75Listadodeprecios_wcds_16_tfvaldsc_sel = AV52TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV60Listadodeprecios_wcds_1_filterfulltext ,
                                           AV62Listadodeprecios_wcds_3_tfprdnum_sel ,
                                           AV61Listadodeprecios_wcds_2_tfprdnum ,
                                           AV64Listadodeprecios_wcds_5_tfprdnom_sel ,
                                           AV63Listadodeprecios_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV65Listadodeprecios_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV66Listadodeprecios_wcds_7_tfprvnum_to) ,
                                           AV68Listadodeprecios_wcds_9_tfprvnom_sel ,
                                           AV67Listadodeprecios_wcds_8_tfprvnom ,
                                           AV70Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                           AV69Listadodeprecios_wcds_10_tfprdrefprv ,
                                           AV71Listadodeprecios_wcds_12_tfprdpreact ,
                                           AV72Listadodeprecios_wcds_13_tfprdpreact_to ,
                                           AV73Listadodeprecios_wcds_14_tfprdfecpre ,
                                           AV75Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                           AV74Listadodeprecios_wcds_15_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A728PrdRefPrv ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A709PrdFecPre ,
                                           Short.valueOf(AV29OrderedBy) ,
                                           Boolean.valueOf(AV30OrderedDsc) ,
                                           Integer.valueOf(AV33PrvNum) ,
                                           Integer.valueOf(AV34PrvNum_to) ,
                                           AV17Emprcod ,
                                           AV31Prdnum ,
                                           A396EmprCod ,
                                           AV32Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV60Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV60Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV60Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV60Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV60Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV60Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV61Listadodeprecios_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Listadodeprecios_wcds_2_tfprdnum), 6, "%") ;
      lV63Listadodeprecios_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV63Listadodeprecios_wcds_4_tfprdnom), 26, "%") ;
      lV67Listadodeprecios_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV67Listadodeprecios_wcds_8_tfprvnom), 30, "%") ;
      lV69Listadodeprecios_wcds_10_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV69Listadodeprecios_wcds_10_tfprdrefprv), 30, "%") ;
      lV74Listadodeprecios_wcds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV74Listadodeprecios_wcds_15_tfvaldsc), 16, "%") ;
      /* Using cursor P09RY2 */
      pr_default.execute(0, new Object[] {AV17Emprcod, AV31Prdnum, Integer.valueOf(AV33PrvNum), Integer.valueOf(AV34PrvNum_to), AV32Prdnum_to, lV60Listadodeprecios_wcds_1_filterfulltext, lV60Listadodeprecios_wcds_1_filterfulltext, lV60Listadodeprecios_wcds_1_filterfulltext, lV60Listadodeprecios_wcds_1_filterfulltext, lV60Listadodeprecios_wcds_1_filterfulltext, lV60Listadodeprecios_wcds_1_filterfulltext, lV60Listadodeprecios_wcds_1_filterfulltext, lV61Listadodeprecios_wcds_2_tfprdnum, AV62Listadodeprecios_wcds_3_tfprdnum_sel, lV63Listadodeprecios_wcds_4_tfprdnom, AV64Listadodeprecios_wcds_5_tfprdnom_sel, Integer.valueOf(AV65Listadodeprecios_wcds_6_tfprvnum), Integer.valueOf(AV66Listadodeprecios_wcds_7_tfprvnum_to), lV67Listadodeprecios_wcds_8_tfprvnom, AV68Listadodeprecios_wcds_9_tfprvnom_sel, lV69Listadodeprecios_wcds_10_tfprdrefprv, AV70Listadodeprecios_wcds_11_tfprdrefprv_sel, AV71Listadodeprecios_wcds_12_tfprdpreact, AV72Listadodeprecios_wcds_13_tfprdpreact_to, AV73Listadodeprecios_wcds_14_tfprdfecpre, lV74Listadodeprecios_wcds_15_tfvaldsc, AV75Listadodeprecios_wcds_16_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09RY2_A856ValCod[0] ;
         A396EmprCod = P09RY2_A396EmprCod[0] ;
         A857ValDsc = P09RY2_A857ValDsc[0] ;
         n857ValDsc = P09RY2_n857ValDsc[0] ;
         A709PrdFecPre = P09RY2_A709PrdFecPre[0] ;
         A724PrdPreAct = P09RY2_A724PrdPreAct[0] ;
         A728PrdRefPrv = P09RY2_A728PrdRefPrv[0] ;
         A794PrvNom = P09RY2_A794PrvNom[0] ;
         n794PrvNom = P09RY2_n794PrvNom[0] ;
         A795PrvNum = P09RY2_A795PrvNum[0] ;
         A718PrdNom = P09RY2_A718PrdNom[0] ;
         A719PrdNum = P09RY2_A719PrdNum[0] ;
         A857ValDsc = P09RY2_A857ValDsc[0] ;
         n857ValDsc = P09RY2_n857ValDsc[0] ;
         A794PrvNom = P09RY2_A794PrvNom[0] ;
         n794PrvNom = P09RY2_n794PrvNom[0] ;
         AV8CellRow = (int)(AV8CellRow+1) ;
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
         AV54VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setNumber( A795PrvNum );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A794PrvNom, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A728PrdRefPrv, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A724PrdPreAct)) );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A709PrdFecPre );
            AV19ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A857ValDsc, GXv_char5) ;
            listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV19ExcelDocument.Cells(AV8CellRow, (int)(AV22FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
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
      AV19ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV19ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV19ExcelDocument.getErrCode() != 0 )
      {
         AV20Filename = "" ;
         AV18ErrorMessage = AV19ExcelDocument.getErrDescription() ;
         AV19ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV10ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum", "", "Producto", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNom", "", "Descripcion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrvNum", "", "Proveedor", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrvNom", "", "Nombre", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdRefPrv", "", "Referencia", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdPreAct", "", "Precio", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdFecPre", "", "Fecha", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ValDsc", "", "Validez", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV53UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListadodePrecios_WCColumnsSelector", GXv_char5) ;
      listadodeprecios_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV53UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV53UserCustomValue)==0) ) )
      {
         AV12ColumnsSelectorAux.fromxml(AV53UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV12ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV10ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV12ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV10ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("ListadodePrecios_WCGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListadodePrecios_WCGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV36Session.getValue("ListadodePrecios_WCGridState"), null, null);
      }
      AV29OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV30OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV76GXV2 = 1 ;
      while ( AV76GXV2 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV2));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV41TFPrdNum = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV42TFPrdNum_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV39TFPrdNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV40TFPrdNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV49TFPrvNum = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFPrvNum_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV47TFPrvNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV48TFPrvNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV45TFPrdRefPrv = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV46TFPrdRefPrv_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV43TFPrdPreAct = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFPrdPreAct_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFECPRE") == 0 )
         {
            AV37TFPrdFecPre = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV51TFValDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV52TFValDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV17Emprcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV31Prdnum = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV32Prdnum_to = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV33PrvNum = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM_TO") == 0 )
         {
            AV34PrvNum_to = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV76GXV2 = (int)(AV76GXV2+1) ;
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
      this.aP0[0] = listadodeprecios_wcexport.this.AV20Filename;
      this.aP1[0] = listadodeprecios_wcexport.this.AV18ErrorMessage;
      CloseOpenCursors();
      AV19ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Filename = "" ;
      AV18ErrorMessage = "" ;
      AV55WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV21FilterFullText = "" ;
      AV42TFPrdNum_Sel = "" ;
      AV41TFPrdNum = "" ;
      AV40TFPrdNom_Sel = "" ;
      AV39TFPrdNom = "" ;
      AV48TFPrvNom_Sel = "" ;
      AV47TFPrvNom = "" ;
      AV46TFPrdRefPrv_Sel = "" ;
      AV45TFPrdRefPrv = "" ;
      AV43TFPrdPreAct = DecimalUtil.ZERO ;
      AV44TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV37TFPrdFecPre = GXutil.nullDate() ;
      AV52TFValDsc_Sel = "" ;
      AV51TFValDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV36Session = httpContext.getWebSession();
      AV13ColumnsSelectorXML = "" ;
      AV10ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV11ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A728PrdRefPrv = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A857ValDsc = "" ;
      AV60Listadodeprecios_wcds_1_filterfulltext = "" ;
      AV61Listadodeprecios_wcds_2_tfprdnum = "" ;
      AV62Listadodeprecios_wcds_3_tfprdnum_sel = "" ;
      AV63Listadodeprecios_wcds_4_tfprdnom = "" ;
      AV64Listadodeprecios_wcds_5_tfprdnom_sel = "" ;
      AV67Listadodeprecios_wcds_8_tfprvnom = "" ;
      AV68Listadodeprecios_wcds_9_tfprvnom_sel = "" ;
      AV69Listadodeprecios_wcds_10_tfprdrefprv = "" ;
      AV70Listadodeprecios_wcds_11_tfprdrefprv_sel = "" ;
      AV71Listadodeprecios_wcds_12_tfprdpreact = DecimalUtil.ZERO ;
      AV72Listadodeprecios_wcds_13_tfprdpreact_to = DecimalUtil.ZERO ;
      AV73Listadodeprecios_wcds_14_tfprdfecpre = GXutil.nullDate() ;
      AV74Listadodeprecios_wcds_15_tfvaldsc = "" ;
      AV75Listadodeprecios_wcds_16_tfvaldsc_sel = "" ;
      scmdbuf = "" ;
      lV60Listadodeprecios_wcds_1_filterfulltext = "" ;
      lV61Listadodeprecios_wcds_2_tfprdnum = "" ;
      lV63Listadodeprecios_wcds_4_tfprdnom = "" ;
      lV67Listadodeprecios_wcds_8_tfprvnom = "" ;
      lV69Listadodeprecios_wcds_10_tfprdrefprv = "" ;
      lV74Listadodeprecios_wcds_15_tfvaldsc = "" ;
      AV17Emprcod = "" ;
      AV31Prdnum = "" ;
      A396EmprCod = "" ;
      AV32Prdnum_to = "" ;
      P09RY2_A856ValCod = new byte[1] ;
      P09RY2_A396EmprCod = new String[] {""} ;
      P09RY2_A857ValDsc = new String[] {""} ;
      P09RY2_n857ValDsc = new boolean[] {false} ;
      P09RY2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09RY2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RY2_A728PrdRefPrv = new String[] {""} ;
      P09RY2_A794PrvNom = new String[] {""} ;
      P09RY2_n794PrvNom = new boolean[] {false} ;
      P09RY2_A795PrvNum = new int[1] ;
      P09RY2_A718PrdNom = new String[] {""} ;
      P09RY2_A719PrdNum = new String[] {""} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV53UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV12ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadodeprecios_wcexport__default(),
         new Object[] {
             new Object[] {
            P09RY2_A856ValCod, P09RY2_A396EmprCod, P09RY2_A857ValDsc, P09RY2_n857ValDsc, P09RY2_A709PrdFecPre, P09RY2_A724PrdPreAct, P09RY2_A728PrdRefPrv, P09RY2_A794PrvNom, P09RY2_n794PrvNom, P09RY2_A795PrvNum,
            P09RY2_A718PrdNom, P09RY2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short GXv_int3[] ;
   private short AV29OrderedBy ;
   private short Gx_err ;
   private int AV8CellRow ;
   private int AV22FirstColumn ;
   private int AV35Random ;
   private int AV49TFPrvNum ;
   private int AV50TFPrvNum_To ;
   private int AV58GXV1 ;
   private int A795PrvNum ;
   private int AV65Listadodeprecios_wcds_6_tfprvnum ;
   private int AV66Listadodeprecios_wcds_7_tfprvnum_to ;
   private int AV33PrvNum ;
   private int AV34PrvNum_to ;
   private int AV76GXV2 ;
   private long AV54VisibleColumnCount ;
   private java.math.BigDecimal AV43TFPrdPreAct ;
   private java.math.BigDecimal AV44TFPrdPreAct_To ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV71Listadodeprecios_wcds_12_tfprdpreact ;
   private java.math.BigDecimal AV72Listadodeprecios_wcds_13_tfprdpreact_to ;
   private String AV42TFPrdNum_Sel ;
   private String AV41TFPrdNum ;
   private String AV40TFPrdNom_Sel ;
   private String AV39TFPrdNom ;
   private String AV48TFPrvNom_Sel ;
   private String AV47TFPrvNom ;
   private String AV46TFPrdRefPrv_Sel ;
   private String AV45TFPrdRefPrv ;
   private String AV52TFValDsc_Sel ;
   private String AV51TFValDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A728PrdRefPrv ;
   private String A857ValDsc ;
   private String AV61Listadodeprecios_wcds_2_tfprdnum ;
   private String AV62Listadodeprecios_wcds_3_tfprdnum_sel ;
   private String AV63Listadodeprecios_wcds_4_tfprdnom ;
   private String AV64Listadodeprecios_wcds_5_tfprdnom_sel ;
   private String AV67Listadodeprecios_wcds_8_tfprvnom ;
   private String AV68Listadodeprecios_wcds_9_tfprvnom_sel ;
   private String AV69Listadodeprecios_wcds_10_tfprdrefprv ;
   private String AV70Listadodeprecios_wcds_11_tfprdrefprv_sel ;
   private String AV74Listadodeprecios_wcds_15_tfvaldsc ;
   private String AV75Listadodeprecios_wcds_16_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV61Listadodeprecios_wcds_2_tfprdnum ;
   private String lV63Listadodeprecios_wcds_4_tfprdnom ;
   private String lV67Listadodeprecios_wcds_8_tfprvnom ;
   private String lV69Listadodeprecios_wcds_10_tfprdrefprv ;
   private String lV74Listadodeprecios_wcds_15_tfvaldsc ;
   private String AV17Emprcod ;
   private String AV31Prdnum ;
   private String A396EmprCod ;
   private String AV32Prdnum_to ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV37TFPrdFecPre ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date AV73Listadodeprecios_wcds_14_tfprdfecpre ;
   private boolean returnInSub ;
   private boolean AV30OrderedDsc ;
   private boolean n857ValDsc ;
   private boolean n794PrvNom ;
   private String AV13ColumnsSelectorXML ;
   private String AV53UserCustomValue ;
   private String AV20Filename ;
   private String AV18ErrorMessage ;
   private String AV21FilterFullText ;
   private String AV60Listadodeprecios_wcds_1_filterfulltext ;
   private String lV60Listadodeprecios_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09RY2_A856ValCod ;
   private String[] P09RY2_A396EmprCod ;
   private String[] P09RY2_A857ValDsc ;
   private boolean[] P09RY2_n857ValDsc ;
   private java.util.Date[] P09RY2_A709PrdFecPre ;
   private java.math.BigDecimal[] P09RY2_A724PrdPreAct ;
   private String[] P09RY2_A728PrdRefPrv ;
   private String[] P09RY2_A794PrvNom ;
   private boolean[] P09RY2_n794PrvNom ;
   private int[] P09RY2_A795PrvNum ;
   private String[] P09RY2_A718PrdNom ;
   private String[] P09RY2_A719PrdNum ;
   private com.genexus.gxoffice.ExcelDoc AV19ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV12ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV11ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV55WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodeprecios_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Listadodeprecios_wcds_1_filterfulltext ,
                                          String AV62Listadodeprecios_wcds_3_tfprdnum_sel ,
                                          String AV61Listadodeprecios_wcds_2_tfprdnum ,
                                          String AV64Listadodeprecios_wcds_5_tfprdnom_sel ,
                                          String AV63Listadodeprecios_wcds_4_tfprdnom ,
                                          int AV65Listadodeprecios_wcds_6_tfprvnum ,
                                          int AV66Listadodeprecios_wcds_7_tfprvnum_to ,
                                          String AV68Listadodeprecios_wcds_9_tfprvnom_sel ,
                                          String AV67Listadodeprecios_wcds_8_tfprvnom ,
                                          String AV70Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                          String AV69Listadodeprecios_wcds_10_tfprdrefprv ,
                                          java.math.BigDecimal AV71Listadodeprecios_wcds_12_tfprdpreact ,
                                          java.math.BigDecimal AV72Listadodeprecios_wcds_13_tfprdpreact_to ,
                                          java.util.Date AV73Listadodeprecios_wcds_14_tfprdfecpre ,
                                          String AV75Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                          String AV74Listadodeprecios_wcds_15_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          java.util.Date A709PrdFecPre ,
                                          short AV29OrderedBy ,
                                          boolean AV30OrderedDsc ,
                                          int AV33PrvNum ,
                                          int AV34PrvNum_to ,
                                          String AV17Emprcod ,
                                          String AV31Prdnum ,
                                          String A396EmprCod ,
                                          String AV32Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[27];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T2.ValDsc, T1.PrdFecPre, T1.PrdPreAct, T1.PrdRefPrv, T3.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum FROM ((TXPPRODUC T1 INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV60Listadodeprecios_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Listadodeprecios_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Listadodeprecios_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Listadodeprecios_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Listadodeprecios_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Listadodeprecios_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Listadodeprecios_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV65Listadodeprecios_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV66Listadodeprecios_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Listadodeprecios_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Listadodeprecios_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Listadodeprecios_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV69Listadodeprecios_wcds_10_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Listadodeprecios_wcds_12_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Listadodeprecios_wcds_13_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Listadodeprecios_wcds_14_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Listadodeprecios_wcds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Listadodeprecios_wcds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Listadodeprecios_wcds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV29OrderedBy == 1 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV29OrderedBy == 1 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV29OrderedBy == 2 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV29OrderedBy == 2 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV29OrderedBy == 3 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV29OrderedBy == 3 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV29OrderedBy == 4 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV29OrderedBy == 4 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV29OrderedBy == 5 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV29OrderedBy == 5 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV29OrderedBy == 6 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV29OrderedBy == 6 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV29OrderedBy == 7 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFecPre" ;
      }
      else if ( ( AV29OrderedBy == 7 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFecPre DESC" ;
      }
      else if ( ( AV29OrderedBy == 8 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ValDsc" ;
      }
      else if ( ( AV29OrderedBy == 8 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ValDsc DESC" ;
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
                  return conditional_P09RY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               return;
      }
   }

}

