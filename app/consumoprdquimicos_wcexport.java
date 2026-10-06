package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consumoprdquimicos_wcexport extends GXProcedure
{
   public consumoprdquimicos_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consumoprdquimicos_wcexport.class ), "" );
   }

   public consumoprdquimicos_wcexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consumoprdquimicos_wcexport.this.aP1 = new String[] {""};
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
      consumoprdquimicos_wcexport.this.aP0 = aP0;
      consumoprdquimicos_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ConsumoPrdQuimicos_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      consumoprdquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFEmprCod_Sel, GXv_char5) ;
         consumoprdquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFEmprCod, GXv_char5) ;
            consumoprdquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNum_Sel, GXv_char5) ;
         consumoprdquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNum, GXv_char5) ;
            consumoprdquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFPrdAny) && (0==AV39TFPrdAny_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Año estadistica Productos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFPrdAny );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFPrdAny_To );
      }
      if ( ! ( (0==AV40TFPrdNumMes) && (0==AV41TFPrdNumMes_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mes de la Estadistica de Prod.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFPrdNumMes );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFPrdNumMes_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPrdAcuCprA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdAcuCprA_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acumulado Unidades Compra Año", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFPrdAcuCprA)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFPrdAcuCprA_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdAcuConA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPrdAcuConA_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acumulado Unidades Consumo Año", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFPrdAcuConA)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFPrdAcuConA_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdValCprA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdValCprA_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor Compra Productos Año", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFPrdValCprA)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFPrdValCprA_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdValConA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdValConA_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor Consumo Productos Año", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFPrdValConA)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFPrdValConA_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFDifValConA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFDifValConA_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "orden ascendente val. con. año", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFDifValConA)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consumoprdquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFDifValConA_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("ConsumoPrdQuimicos_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("ConsumoPrdQuimicos_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV63GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV65Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV66Consumoprdquimicos_wcds_2_tfemprcod = AV34TFEmprCod ;
      AV67Consumoprdquimicos_wcds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV68Consumoprdquimicos_wcds_4_tfprdnum = AV36TFPrdNum ;
      AV69Consumoprdquimicos_wcds_5_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV70Consumoprdquimicos_wcds_6_tfprdany = AV38TFPrdAny ;
      AV71Consumoprdquimicos_wcds_7_tfprdany_to = AV39TFPrdAny_To ;
      AV72Consumoprdquimicos_wcds_8_tfprdnummes = AV40TFPrdNumMes ;
      AV73Consumoprdquimicos_wcds_9_tfprdnummes_to = AV41TFPrdNumMes_To ;
      AV74Consumoprdquimicos_wcds_10_tfprdacucpra = AV42TFPrdAcuCprA ;
      AV75Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV43TFPrdAcuCprA_To ;
      AV76Consumoprdquimicos_wcds_12_tfprdacucona = AV44TFPrdAcuConA ;
      AV77Consumoprdquimicos_wcds_13_tfprdacucona_to = AV45TFPrdAcuConA_To ;
      AV78Consumoprdquimicos_wcds_14_tfprdvalcpra = AV46TFPrdValCprA ;
      AV79Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV47TFPrdValCprA_To ;
      AV80Consumoprdquimicos_wcds_16_tfprdvalcona = AV48TFPrdValConA ;
      AV81Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV49TFPrdValConA_To ;
      AV82Consumoprdquimicos_wcds_18_tfdifvalcona = AV50TFDifValConA ;
      AV83Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV51TFDifValConA_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Consumoprdquimicos_wcds_1_filterfulltext ,
                                           AV67Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                           AV66Consumoprdquimicos_wcds_2_tfemprcod ,
                                           AV69Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                           AV68Consumoprdquimicos_wcds_4_tfprdnum ,
                                           Short.valueOf(AV70Consumoprdquimicos_wcds_6_tfprdany) ,
                                           Short.valueOf(AV71Consumoprdquimicos_wcds_7_tfprdany_to) ,
                                           Byte.valueOf(AV72Consumoprdquimicos_wcds_8_tfprdnummes) ,
                                           Byte.valueOf(AV73Consumoprdquimicos_wcds_9_tfprdnummes_to) ,
                                           AV74Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                           AV75Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                           AV76Consumoprdquimicos_wcds_12_tfprdacucona ,
                                           AV77Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                           AV78Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                           AV79Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                           AV80Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                           AV81Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                           AV82Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                           AV83Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                           Short.valueOf(AV53Anyo) ,
                                           Byte.valueOf(AV54MesI) ,
                                           Byte.valueOf(AV55MesF) ,
                                           Byte.valueOf(AV60Opcion) ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Short.valueOf(A681PrdAny) ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A677PrdAcuCprA ,
                                           A676PrdAcuConA ,
                                           A748PrdValCprA ,
                                           A746PrdValConA ,
                                           A331DifValConA ,
                                           AV58PrdNumFrom ,
                                           AV59PrdNumTo ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV66Consumoprdquimicos_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV66Consumoprdquimicos_wcds_2_tfemprcod), 3, "%") ;
      lV68Consumoprdquimicos_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV68Consumoprdquimicos_wcds_4_tfprdnum), 6, "%") ;
      /* Using cursor P09G93 */
      pr_default.execute(0, new Object[] {lV66Consumoprdquimicos_wcds_2_tfemprcod, AV67Consumoprdquimicos_wcds_3_tfemprcod_sel, lV68Consumoprdquimicos_wcds_4_tfprdnum, AV69Consumoprdquimicos_wcds_5_tfprdnum_sel, Short.valueOf(AV70Consumoprdquimicos_wcds_6_tfprdany), Short.valueOf(AV71Consumoprdquimicos_wcds_7_tfprdany_to), AV74Consumoprdquimicos_wcds_10_tfprdacucpra, AV75Consumoprdquimicos_wcds_11_tfprdacucpra_to, AV76Consumoprdquimicos_wcds_12_tfprdacucona, AV77Consumoprdquimicos_wcds_13_tfprdacucona_to, AV78Consumoprdquimicos_wcds_14_tfprdvalcpra, AV79Consumoprdquimicos_wcds_15_tfprdvalcpra_to, AV80Consumoprdquimicos_wcds_16_tfprdvalcona, AV81Consumoprdquimicos_wcds_17_tfprdvalcona_to, AV82Consumoprdquimicos_wcds_18_tfdifvalcona, AV83Consumoprdquimicos_wcds_19_tfdifvalcona_to, AV58PrdNumFrom, AV59PrdNumTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A331DifValConA = P09G93_A331DifValConA[0] ;
         n331DifValConA = P09G93_n331DifValConA[0] ;
         A676PrdAcuConA = P09G93_A676PrdAcuConA[0] ;
         A681PrdAny = P09G93_A681PrdAny[0] ;
         A719PrdNum = P09G93_A719PrdNum[0] ;
         A396EmprCod = P09G93_A396EmprCod[0] ;
         A746PrdValConA = P09G93_A746PrdValConA[0] ;
         A748PrdValCprA = P09G93_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09G93_A677PrdAcuCprA[0] ;
         A746PrdValConA = P09G93_A746PrdValConA[0] ;
         A748PrdValCprA = P09G93_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09G93_A677PrdAcuCprA[0] ;
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
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            consumoprdquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            consumoprdquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A681PrdAny );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A720PrdNumMes );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A677PrdAcuCprA)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A676PrdAcuConA)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A748PrdValCprA)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A746PrdValConA)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A331DifValConA)) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCod", "", "Código Empresa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdAny", "", "Año estadistica Productos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNumMes", "", "Mes de la Estadistica de Prod.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdAcuCprA", "", "Acumulado Unidades Compra Año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdAcuConA", "", "Acumulado Unidades Consumo Año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdValCprA", "", "Valor Compra Productos Año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdValConA", "", "Valor Consumo Productos Año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DifValConA", "", "orden ascendente val. con. año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsumoPrdQuimicos_WCColumnsSelector", GXv_char5) ;
      consumoprdquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsumoPrdQuimicos_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsumoPrdQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ConsumoPrdQuimicos_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV84GXV2 = 1 ;
      while ( AV84GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDANY") == 0 )
         {
            AV38TFPrdAny = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFPrdAny_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMMES") == 0 )
         {
            AV40TFPrdNumMes = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFPrdNumMes_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCPRA") == 0 )
         {
            AV42TFPrdAcuCprA = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFPrdAcuCprA_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCONA") == 0 )
         {
            AV44TFPrdAcuConA = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFPrdAcuConA_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCPRA") == 0 )
         {
            AV46TFPrdValCprA = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFPrdValCprA_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCONA") == 0 )
         {
            AV48TFPrdValConA = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPrdValConA_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFVALCONA") == 0 )
         {
            AV50TFDifValConA = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFDifValConA_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV84GXV2 = (int)(AV84GXV2+1) ;
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
      this.aP0[0] = consumoprdquimicos_wcexport.this.AV11Filename;
      this.aP1[0] = consumoprdquimicos_wcexport.this.AV12ErrorMessage;
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
      AV35TFEmprCod_Sel = "" ;
      AV34TFEmprCod = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV36TFPrdNum = "" ;
      AV42TFPrdAcuCprA = DecimalUtil.ZERO ;
      AV43TFPrdAcuCprA_To = DecimalUtil.ZERO ;
      AV44TFPrdAcuConA = DecimalUtil.ZERO ;
      AV45TFPrdAcuConA_To = DecimalUtil.ZERO ;
      AV46TFPrdValCprA = DecimalUtil.ZERO ;
      AV47TFPrdValCprA_To = DecimalUtil.ZERO ;
      AV48TFPrdValConA = DecimalUtil.ZERO ;
      AV49TFPrdValConA_To = DecimalUtil.ZERO ;
      AV50TFDifValConA = DecimalUtil.ZERO ;
      AV51TFDifValConA_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A677PrdAcuCprA = DecimalUtil.ZERO ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      A748PrdValCprA = DecimalUtil.ZERO ;
      A746PrdValConA = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      AV65Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      AV66Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      AV67Consumoprdquimicos_wcds_3_tfemprcod_sel = "" ;
      AV68Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      AV69Consumoprdquimicos_wcds_5_tfprdnum_sel = "" ;
      AV74Consumoprdquimicos_wcds_10_tfprdacucpra = DecimalUtil.ZERO ;
      AV75Consumoprdquimicos_wcds_11_tfprdacucpra_to = DecimalUtil.ZERO ;
      AV76Consumoprdquimicos_wcds_12_tfprdacucona = DecimalUtil.ZERO ;
      AV77Consumoprdquimicos_wcds_13_tfprdacucona_to = DecimalUtil.ZERO ;
      AV78Consumoprdquimicos_wcds_14_tfprdvalcpra = DecimalUtil.ZERO ;
      AV79Consumoprdquimicos_wcds_15_tfprdvalcpra_to = DecimalUtil.ZERO ;
      AV80Consumoprdquimicos_wcds_16_tfprdvalcona = DecimalUtil.ZERO ;
      AV81Consumoprdquimicos_wcds_17_tfprdvalcona_to = DecimalUtil.ZERO ;
      AV82Consumoprdquimicos_wcds_18_tfdifvalcona = DecimalUtil.ZERO ;
      AV83Consumoprdquimicos_wcds_19_tfdifvalcona_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV65Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      lV66Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      lV68Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      AV58PrdNumFrom = "" ;
      AV59PrdNumTo = "" ;
      P09G93_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G93_n331DifValConA = new boolean[] {false} ;
      P09G93_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G93_A681PrdAny = new short[1] ;
      P09G93_A719PrdNum = new String[] {""} ;
      P09G93_A396EmprCod = new String[] {""} ;
      P09G93_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G93_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G93_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consumoprdquimicos_wcexport__default(),
         new Object[] {
             new Object[] {
            P09G93_A331DifValConA, P09G93_n331DifValConA, P09G93_A676PrdAcuConA, P09G93_A681PrdAny, P09G93_A719PrdNum, P09G93_A396EmprCod, P09G93_A746PrdValConA, P09G93_A748PrdValCprA, P09G93_A677PrdAcuCprA
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40TFPrdNumMes ;
   private byte AV41TFPrdNumMes_To ;
   private byte A720PrdNumMes ;
   private byte AV72Consumoprdquimicos_wcds_8_tfprdnummes ;
   private byte AV73Consumoprdquimicos_wcds_9_tfprdnummes_to ;
   private byte AV54MesI ;
   private byte AV55MesF ;
   private byte AV60Opcion ;
   private short AV38TFPrdAny ;
   private short AV39TFPrdAny_To ;
   private short GXv_int3[] ;
   private short A681PrdAny ;
   private short AV70Consumoprdquimicos_wcds_6_tfprdany ;
   private short AV71Consumoprdquimicos_wcds_7_tfprdany_to ;
   private short AV53Anyo ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV63GXV1 ;
   private int AV84GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV42TFPrdAcuCprA ;
   private java.math.BigDecimal AV43TFPrdAcuCprA_To ;
   private java.math.BigDecimal AV44TFPrdAcuConA ;
   private java.math.BigDecimal AV45TFPrdAcuConA_To ;
   private java.math.BigDecimal AV46TFPrdValCprA ;
   private java.math.BigDecimal AV47TFPrdValCprA_To ;
   private java.math.BigDecimal AV48TFPrdValConA ;
   private java.math.BigDecimal AV49TFPrdValConA_To ;
   private java.math.BigDecimal AV50TFDifValConA ;
   private java.math.BigDecimal AV51TFDifValConA_To ;
   private java.math.BigDecimal A677PrdAcuCprA ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal A748PrdValCprA ;
   private java.math.BigDecimal A746PrdValConA ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal AV74Consumoprdquimicos_wcds_10_tfprdacucpra ;
   private java.math.BigDecimal AV75Consumoprdquimicos_wcds_11_tfprdacucpra_to ;
   private java.math.BigDecimal AV76Consumoprdquimicos_wcds_12_tfprdacucona ;
   private java.math.BigDecimal AV77Consumoprdquimicos_wcds_13_tfprdacucona_to ;
   private java.math.BigDecimal AV78Consumoprdquimicos_wcds_14_tfprdvalcpra ;
   private java.math.BigDecimal AV79Consumoprdquimicos_wcds_15_tfprdvalcpra_to ;
   private java.math.BigDecimal AV80Consumoprdquimicos_wcds_16_tfprdvalcona ;
   private java.math.BigDecimal AV81Consumoprdquimicos_wcds_17_tfprdvalcona_to ;
   private java.math.BigDecimal AV82Consumoprdquimicos_wcds_18_tfdifvalcona ;
   private java.math.BigDecimal AV83Consumoprdquimicos_wcds_19_tfdifvalcona_to ;
   private String AV35TFEmprCod_Sel ;
   private String AV34TFEmprCod ;
   private String AV37TFPrdNum_Sel ;
   private String AV36TFPrdNum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV66Consumoprdquimicos_wcds_2_tfemprcod ;
   private String AV67Consumoprdquimicos_wcds_3_tfemprcod_sel ;
   private String AV68Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV69Consumoprdquimicos_wcds_5_tfprdnum_sel ;
   private String scmdbuf ;
   private String lV66Consumoprdquimicos_wcds_2_tfemprcod ;
   private String lV68Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV58PrdNumFrom ;
   private String AV59PrdNumTo ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n331DifValConA ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV65Consumoprdquimicos_wcds_1_filterfulltext ;
   private String lV65Consumoprdquimicos_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09G93_A331DifValConA ;
   private boolean[] P09G93_n331DifValConA ;
   private java.math.BigDecimal[] P09G93_A676PrdAcuConA ;
   private short[] P09G93_A681PrdAny ;
   private String[] P09G93_A719PrdNum ;
   private String[] P09G93_A396EmprCod ;
   private java.math.BigDecimal[] P09G93_A746PrdValConA ;
   private java.math.BigDecimal[] P09G93_A748PrdValCprA ;
   private java.math.BigDecimal[] P09G93_A677PrdAcuCprA ;
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

final  class consumoprdquimicos_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09G93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Consumoprdquimicos_wcds_1_filterfulltext ,
                                          String AV67Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                          String AV66Consumoprdquimicos_wcds_2_tfemprcod ,
                                          String AV69Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                          String AV68Consumoprdquimicos_wcds_4_tfprdnum ,
                                          short AV70Consumoprdquimicos_wcds_6_tfprdany ,
                                          short AV71Consumoprdquimicos_wcds_7_tfprdany_to ,
                                          byte AV72Consumoprdquimicos_wcds_8_tfprdnummes ,
                                          byte AV73Consumoprdquimicos_wcds_9_tfprdnummes_to ,
                                          java.math.BigDecimal AV74Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                          java.math.BigDecimal AV75Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                          java.math.BigDecimal AV76Consumoprdquimicos_wcds_12_tfprdacucona ,
                                          java.math.BigDecimal AV77Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                          java.math.BigDecimal AV78Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                          java.math.BigDecimal AV79Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                          java.math.BigDecimal AV80Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                          java.math.BigDecimal AV81Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                          java.math.BigDecimal AV82Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                          java.math.BigDecimal AV83Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                          short AV53Anyo ,
                                          byte AV54MesI ,
                                          byte AV55MesF ,
                                          byte AV60Opcion ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          short A681PrdAny ,
                                          byte A720PrdNumMes ,
                                          java.math.BigDecimal A677PrdAcuCprA ,
                                          java.math.BigDecimal A676PrdAcuConA ,
                                          java.math.BigDecimal A748PrdValCprA ,
                                          java.math.BigDecimal A746PrdValConA ,
                                          java.math.BigDecimal A331DifValConA ,
                                          String AV58PrdNumFrom ,
                                          String AV59PrdNumTo ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.DifValConA, T1.PrdAcuConA, T1.PrdAny, T1.PrdNum, T1.EmprCod, COALESCE( T2.PrdValConA, 0) AS PrdValConA, COALESCE( T2.PrdValCprA, 0) AS PrdValCprA, COALESCE(" ;
      scmdbuf += " T2.PrdAcuCprA, 0) AS PrdAcuCprA FROM (TXPCPRDES T1 LEFT JOIN (SELECT SUM(PrdValConM) AS PrdValConA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdUniCprM)" ;
      scmdbuf += " AS PrdAcuCprA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum AND T2.PrdAny = T1.PrdAny)" ;
      if ( (GXutil.strcmp("", AV67Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Consumoprdquimicos_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV68Consumoprdquimicos_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV70Consumoprdquimicos_wcds_6_tfprdany) )
      {
         addWhere(sWhereString, "(T1.PrdAny >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV71Consumoprdquimicos_wcds_7_tfprdany_to) )
      {
         addWhere(sWhereString, "(T1.PrdAny <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Consumoprdquimicos_wcds_10_tfprdacucpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Consumoprdquimicos_wcds_11_tfprdacucpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Consumoprdquimicos_wcds_12_tfprdacucona)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Consumoprdquimicos_wcds_13_tfprdacucona_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Consumoprdquimicos_wcds_14_tfprdvalcpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consumoprdquimicos_wcds_15_tfprdvalcpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consumoprdquimicos_wcds_16_tfprdvalcona)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Consumoprdquimicos_wcds_17_tfprdvalcona_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Consumoprdquimicos_wcds_18_tfdifvalcona)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Consumoprdquimicos_wcds_19_tfdifvalcona_to)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( AV60Opcion > 1 )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ? and T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
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
         scmdbuf += " ORDER BY T1.PrdAny" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAny DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAcuConA" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAcuConA DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DifValConA" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DifValConA DESC" ;
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
                  return conditional_P09G93(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09G93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,4);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
      }
   }

}

