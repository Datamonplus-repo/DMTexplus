package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmrepuewwexport extends GXProcedure
{
   public tmrepuewwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmrepuewwexport.class ), "" );
   }

   public tmrepuewwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmrepuewwexport.this.aP1 = new String[] {""};
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
      tmrepuewwexport.this.aP0 = aP0;
      tmrepuewwexport.this.aP1 = aP1;
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
      AV11Filename = "PrivateTempStorage" + "TMRepueWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV37TFMRNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Repuesto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFMRNom_Sel, GXv_char5) ;
         tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFMRNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Repuesto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFMRNom, GXv_char5) ;
            tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV34TFMRCod) && (0==AV35TFMRCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFMRCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFMRCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFMRCodExt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Externo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFMRCodExt_Sel, GXv_char5) ;
         tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFMRCodExt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Externo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFMRCodExt, GXv_char5) ;
            tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMRStkPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMRStkPre_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFMRStkPre)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFMRStkPre_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMRStkAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMRStkAct_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFMRStkAct)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFMRStkAct_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMRStkRes)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMRStkRes_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Reservado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFMRStkRes)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFMRStkRes_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFMRStkMin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFMRStkMin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Mínimo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFMRStkMin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFMRStkMin_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFMRStkCri)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFMRStkCri_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock Crítico", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFMRStkCri)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFMRStkCri_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFMRCodPrv_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFMRCodPrv_Sel, GXv_char5) ;
         tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFMRCodPrv)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Proveedor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFMRCodPrv, GXv_char5) ;
            tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFMRActivo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Activo S/N", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmrepuewwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( GXutil.strcmp(AV57TFMRActivo_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV57TFMRActivo_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TMRepueWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TMRepueWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV69GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV71Tmrepuewwds_1_filterfulltext = AV18FilterFullText ;
      AV72Tmrepuewwds_2_tfmrnom = AV36TFMRNom ;
      AV73Tmrepuewwds_3_tfmrnom_sel = AV37TFMRNom_Sel ;
      AV74Tmrepuewwds_4_tfmrcod = AV34TFMRCod ;
      AV75Tmrepuewwds_5_tfmrcod_to = AV35TFMRCod_To ;
      AV76Tmrepuewwds_6_tfmrcodext = AV38TFMRCodExt ;
      AV77Tmrepuewwds_7_tfmrcodext_sel = AV39TFMRCodExt_Sel ;
      AV78Tmrepuewwds_8_tfmrstkpre = AV50TFMRStkPre ;
      AV79Tmrepuewwds_9_tfmrstkpre_to = AV51TFMRStkPre_To ;
      AV80Tmrepuewwds_10_tfmrstkact = AV42TFMRStkAct ;
      AV81Tmrepuewwds_11_tfmrstkact_to = AV43TFMRStkAct_To ;
      AV82Tmrepuewwds_12_tfmrstkres = AV44TFMRStkRes ;
      AV83Tmrepuewwds_13_tfmrstkres_to = AV45TFMRStkRes_To ;
      AV84Tmrepuewwds_14_tfmrstkmin = AV46TFMRStkMin ;
      AV85Tmrepuewwds_15_tfmrstkmin_to = AV47TFMRStkMin_To ;
      AV86Tmrepuewwds_16_tfmrstkcri = AV48TFMRStkCri ;
      AV87Tmrepuewwds_17_tfmrstkcri_to = AV49TFMRStkCri_To ;
      AV88Tmrepuewwds_18_tfmrcodprv = AV40TFMRCodPrv ;
      AV89Tmrepuewwds_19_tfmrcodprv_sel = AV41TFMRCodPrv_Sel ;
      AV90Tmrepuewwds_20_tfmractivo_sel = AV57TFMRActivo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Tmrepuewwds_1_filterfulltext ,
                                           AV73Tmrepuewwds_3_tfmrnom_sel ,
                                           AV72Tmrepuewwds_2_tfmrnom ,
                                           Integer.valueOf(AV74Tmrepuewwds_4_tfmrcod) ,
                                           Integer.valueOf(AV75Tmrepuewwds_5_tfmrcod_to) ,
                                           AV77Tmrepuewwds_7_tfmrcodext_sel ,
                                           AV76Tmrepuewwds_6_tfmrcodext ,
                                           AV78Tmrepuewwds_8_tfmrstkpre ,
                                           AV79Tmrepuewwds_9_tfmrstkpre_to ,
                                           AV80Tmrepuewwds_10_tfmrstkact ,
                                           AV81Tmrepuewwds_11_tfmrstkact_to ,
                                           AV82Tmrepuewwds_12_tfmrstkres ,
                                           AV83Tmrepuewwds_13_tfmrstkres_to ,
                                           AV84Tmrepuewwds_14_tfmrstkmin ,
                                           AV85Tmrepuewwds_15_tfmrstkmin_to ,
                                           AV86Tmrepuewwds_16_tfmrstkcri ,
                                           AV87Tmrepuewwds_17_tfmrstkcri_to ,
                                           AV89Tmrepuewwds_19_tfmrcodprv_sel ,
                                           AV88Tmrepuewwds_18_tfmrcodprv ,
                                           AV90Tmrepuewwds_20_tfmractivo_sel ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A9494MRCodExt ,
                                           A9499MRStkPre ,
                                           A9495MRStkAct ,
                                           A9496MRStkRes ,
                                           A9497MRStkMin ,
                                           A9498MRStkCri ,
                                           A11458MRCodPrv ,
                                           A12850MRActivo ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV71Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV72Tmrepuewwds_2_tfmrnom = GXutil.padr( GXutil.rtrim( AV72Tmrepuewwds_2_tfmrnom), 100, "%") ;
      lV76Tmrepuewwds_6_tfmrcodext = GXutil.padr( GXutil.rtrim( AV76Tmrepuewwds_6_tfmrcodext), 20, "%") ;
      lV88Tmrepuewwds_18_tfmrcodprv = GXutil.padr( GXutil.rtrim( AV88Tmrepuewwds_18_tfmrcodprv), 20, "%") ;
      /* Using cursor P08BT2 */
      pr_default.execute(0, new Object[] {lV71Tmrepuewwds_1_filterfulltext, lV71Tmrepuewwds_1_filterfulltext, lV71Tmrepuewwds_1_filterfulltext, lV71Tmrepuewwds_1_filterfulltext, lV71Tmrepuewwds_1_filterfulltext, lV71Tmrepuewwds_1_filterfulltext, lV71Tmrepuewwds_1_filterfulltext, lV71Tmrepuewwds_1_filterfulltext, lV71Tmrepuewwds_1_filterfulltext, lV72Tmrepuewwds_2_tfmrnom, AV73Tmrepuewwds_3_tfmrnom_sel, Integer.valueOf(AV74Tmrepuewwds_4_tfmrcod), Integer.valueOf(AV75Tmrepuewwds_5_tfmrcod_to), lV76Tmrepuewwds_6_tfmrcodext, AV77Tmrepuewwds_7_tfmrcodext_sel, AV78Tmrepuewwds_8_tfmrstkpre, AV79Tmrepuewwds_9_tfmrstkpre_to, AV80Tmrepuewwds_10_tfmrstkact, AV81Tmrepuewwds_11_tfmrstkact_to, AV82Tmrepuewwds_12_tfmrstkres, AV83Tmrepuewwds_13_tfmrstkres_to, AV84Tmrepuewwds_14_tfmrstkmin, AV85Tmrepuewwds_15_tfmrstkmin_to, AV86Tmrepuewwds_16_tfmrstkcri, AV87Tmrepuewwds_17_tfmrstkcri_to, lV88Tmrepuewwds_18_tfmrcodprv, AV89Tmrepuewwds_19_tfmrcodprv_sel, AV90Tmrepuewwds_20_tfmractivo_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12850MRActivo = P08BT2_A12850MRActivo[0] ;
         n12850MRActivo = P08BT2_n12850MRActivo[0] ;
         A11458MRCodPrv = P08BT2_A11458MRCodPrv[0] ;
         n11458MRCodPrv = P08BT2_n11458MRCodPrv[0] ;
         A9498MRStkCri = P08BT2_A9498MRStkCri[0] ;
         n9498MRStkCri = P08BT2_n9498MRStkCri[0] ;
         A9497MRStkMin = P08BT2_A9497MRStkMin[0] ;
         n9497MRStkMin = P08BT2_n9497MRStkMin[0] ;
         A9496MRStkRes = P08BT2_A9496MRStkRes[0] ;
         n9496MRStkRes = P08BT2_n9496MRStkRes[0] ;
         A9495MRStkAct = P08BT2_A9495MRStkAct[0] ;
         n9495MRStkAct = P08BT2_n9495MRStkAct[0] ;
         A9499MRStkPre = P08BT2_A9499MRStkPre[0] ;
         n9499MRStkPre = P08BT2_n9499MRStkPre[0] ;
         A9494MRCodExt = P08BT2_A9494MRCodExt[0] ;
         n9494MRCodExt = P08BT2_n9494MRCodExt[0] ;
         A9492MRCod = P08BT2_A9492MRCod[0] ;
         A9493MRNom = P08BT2_A9493MRNom[0] ;
         n9493MRNom = P08BT2_n9493MRNom[0] ;
         A396EmprCod = P08BT2_A396EmprCod[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9493MRNom, GXv_char5) ;
            tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9492MRCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9494MRCodExt, GXv_char5) ;
            tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9499MRStkPre)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9495MRStkAct)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9496MRStkRes)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9497MRStkMin)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9498MRStkCri)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11458MRCodPrv, GXv_char5) ;
            tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A12850MRActivo, GXv_char5) ;
            tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRNom", "", "Nombre Repuesto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRCod", "", "Cód", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRCodExt", "", "Externo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRStkPre", "", "Precio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRStkAct", "", "Stock Actual", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRStkRes", "", "Stock Reservado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRStkMin", "", "Stock Mínimo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRStkCri", "", "Stock Crítico", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRCodPrv", "", "Código Proveedor", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRActivo", "", "Activo S/N", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMRepueWWColumnsSelector", GXv_char5) ;
      tmrepuewwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMRepueWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMRepueWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TMRepueWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV91GXV2 = 1 ;
      while ( AV91GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV36TFMRNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV37TFMRNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV34TFMRCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFMRCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT") == 0 )
         {
            AV38TFMRCodExt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT_SEL") == 0 )
         {
            AV39TFMRCodExt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKPRE") == 0 )
         {
            AV50TFMRStkPre = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFMRStkPre_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKACT") == 0 )
         {
            AV42TFMRStkAct = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFMRStkAct_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKRES") == 0 )
         {
            AV44TFMRStkRes = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFMRStkRes_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKMIN") == 0 )
         {
            AV46TFMRStkMin = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFMRStkMin_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKCRI") == 0 )
         {
            AV48TFMRStkCri = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFMRStkCri_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV") == 0 )
         {
            AV40TFMRCodPrv = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV_SEL") == 0 )
         {
            AV41TFMRCodPrv_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRACTIVO_SEL") == 0 )
         {
            AV57TFMRActivo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV91GXV2 = (int)(AV91GXV2+1) ;
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
      this.aP0[0] = tmrepuewwexport.this.AV11Filename;
      this.aP1[0] = tmrepuewwexport.this.AV12ErrorMessage;
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
      AV37TFMRNom_Sel = "" ;
      AV36TFMRNom = "" ;
      AV39TFMRCodExt_Sel = "" ;
      AV38TFMRCodExt = "" ;
      AV50TFMRStkPre = DecimalUtil.ZERO ;
      AV51TFMRStkPre_To = DecimalUtil.ZERO ;
      AV42TFMRStkAct = DecimalUtil.ZERO ;
      AV43TFMRStkAct_To = DecimalUtil.ZERO ;
      AV44TFMRStkRes = DecimalUtil.ZERO ;
      AV45TFMRStkRes_To = DecimalUtil.ZERO ;
      AV46TFMRStkMin = DecimalUtil.ZERO ;
      AV47TFMRStkMin_To = DecimalUtil.ZERO ;
      AV48TFMRStkCri = DecimalUtil.ZERO ;
      AV49TFMRStkCri_To = DecimalUtil.ZERO ;
      AV41TFMRCodPrv_Sel = "" ;
      AV40TFMRCodPrv = "" ;
      AV57TFMRActivo_Sel = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9493MRNom = "" ;
      A9494MRCodExt = "" ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9498MRStkCri = DecimalUtil.ZERO ;
      A11458MRCodPrv = "" ;
      A12850MRActivo = "" ;
      AV71Tmrepuewwds_1_filterfulltext = "" ;
      AV72Tmrepuewwds_2_tfmrnom = "" ;
      AV73Tmrepuewwds_3_tfmrnom_sel = "" ;
      AV76Tmrepuewwds_6_tfmrcodext = "" ;
      AV77Tmrepuewwds_7_tfmrcodext_sel = "" ;
      AV78Tmrepuewwds_8_tfmrstkpre = DecimalUtil.ZERO ;
      AV79Tmrepuewwds_9_tfmrstkpre_to = DecimalUtil.ZERO ;
      AV80Tmrepuewwds_10_tfmrstkact = DecimalUtil.ZERO ;
      AV81Tmrepuewwds_11_tfmrstkact_to = DecimalUtil.ZERO ;
      AV82Tmrepuewwds_12_tfmrstkres = DecimalUtil.ZERO ;
      AV83Tmrepuewwds_13_tfmrstkres_to = DecimalUtil.ZERO ;
      AV84Tmrepuewwds_14_tfmrstkmin = DecimalUtil.ZERO ;
      AV85Tmrepuewwds_15_tfmrstkmin_to = DecimalUtil.ZERO ;
      AV86Tmrepuewwds_16_tfmrstkcri = DecimalUtil.ZERO ;
      AV87Tmrepuewwds_17_tfmrstkcri_to = DecimalUtil.ZERO ;
      AV88Tmrepuewwds_18_tfmrcodprv = "" ;
      AV89Tmrepuewwds_19_tfmrcodprv_sel = "" ;
      AV90Tmrepuewwds_20_tfmractivo_sel = "" ;
      scmdbuf = "" ;
      lV71Tmrepuewwds_1_filterfulltext = "" ;
      lV72Tmrepuewwds_2_tfmrnom = "" ;
      lV76Tmrepuewwds_6_tfmrcodext = "" ;
      lV88Tmrepuewwds_18_tfmrcodprv = "" ;
      P08BT2_A12850MRActivo = new String[] {""} ;
      P08BT2_n12850MRActivo = new boolean[] {false} ;
      P08BT2_A11458MRCodPrv = new String[] {""} ;
      P08BT2_n11458MRCodPrv = new boolean[] {false} ;
      P08BT2_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BT2_n9498MRStkCri = new boolean[] {false} ;
      P08BT2_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BT2_n9497MRStkMin = new boolean[] {false} ;
      P08BT2_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BT2_n9496MRStkRes = new boolean[] {false} ;
      P08BT2_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BT2_n9495MRStkAct = new boolean[] {false} ;
      P08BT2_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BT2_n9499MRStkPre = new boolean[] {false} ;
      P08BT2_A9494MRCodExt = new String[] {""} ;
      P08BT2_n9494MRCodExt = new boolean[] {false} ;
      P08BT2_A9492MRCod = new int[1] ;
      P08BT2_A9493MRNom = new String[] {""} ;
      P08BT2_n9493MRNom = new boolean[] {false} ;
      P08BT2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmrepuewwexport__default(),
         new Object[] {
             new Object[] {
            P08BT2_A12850MRActivo, P08BT2_n12850MRActivo, P08BT2_A11458MRCodPrv, P08BT2_n11458MRCodPrv, P08BT2_A9498MRStkCri, P08BT2_n9498MRStkCri, P08BT2_A9497MRStkMin, P08BT2_n9497MRStkMin, P08BT2_A9496MRStkRes, P08BT2_n9496MRStkRes,
            P08BT2_A9495MRStkAct, P08BT2_n9495MRStkAct, P08BT2_A9499MRStkPre, P08BT2_n9499MRStkPre, P08BT2_A9494MRCodExt, P08BT2_n9494MRCodExt, P08BT2_A9492MRCod, P08BT2_A9493MRNom, P08BT2_n9493MRNom, P08BT2_A396EmprCod
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
   private int AV34TFMRCod ;
   private int AV35TFMRCod_To ;
   private int AV69GXV1 ;
   private int A9492MRCod ;
   private int AV74Tmrepuewwds_4_tfmrcod ;
   private int AV75Tmrepuewwds_5_tfmrcod_to ;
   private int AV91GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV50TFMRStkPre ;
   private java.math.BigDecimal AV51TFMRStkPre_To ;
   private java.math.BigDecimal AV42TFMRStkAct ;
   private java.math.BigDecimal AV43TFMRStkAct_To ;
   private java.math.BigDecimal AV44TFMRStkRes ;
   private java.math.BigDecimal AV45TFMRStkRes_To ;
   private java.math.BigDecimal AV46TFMRStkMin ;
   private java.math.BigDecimal AV47TFMRStkMin_To ;
   private java.math.BigDecimal AV48TFMRStkCri ;
   private java.math.BigDecimal AV49TFMRStkCri_To ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9498MRStkCri ;
   private java.math.BigDecimal AV78Tmrepuewwds_8_tfmrstkpre ;
   private java.math.BigDecimal AV79Tmrepuewwds_9_tfmrstkpre_to ;
   private java.math.BigDecimal AV80Tmrepuewwds_10_tfmrstkact ;
   private java.math.BigDecimal AV81Tmrepuewwds_11_tfmrstkact_to ;
   private java.math.BigDecimal AV82Tmrepuewwds_12_tfmrstkres ;
   private java.math.BigDecimal AV83Tmrepuewwds_13_tfmrstkres_to ;
   private java.math.BigDecimal AV84Tmrepuewwds_14_tfmrstkmin ;
   private java.math.BigDecimal AV85Tmrepuewwds_15_tfmrstkmin_to ;
   private java.math.BigDecimal AV86Tmrepuewwds_16_tfmrstkcri ;
   private java.math.BigDecimal AV87Tmrepuewwds_17_tfmrstkcri_to ;
   private String AV37TFMRNom_Sel ;
   private String AV36TFMRNom ;
   private String AV39TFMRCodExt_Sel ;
   private String AV38TFMRCodExt ;
   private String AV41TFMRCodPrv_Sel ;
   private String AV40TFMRCodPrv ;
   private String AV57TFMRActivo_Sel ;
   private String A9493MRNom ;
   private String A9494MRCodExt ;
   private String A11458MRCodPrv ;
   private String A12850MRActivo ;
   private String AV72Tmrepuewwds_2_tfmrnom ;
   private String AV73Tmrepuewwds_3_tfmrnom_sel ;
   private String AV76Tmrepuewwds_6_tfmrcodext ;
   private String AV77Tmrepuewwds_7_tfmrcodext_sel ;
   private String AV88Tmrepuewwds_18_tfmrcodprv ;
   private String AV89Tmrepuewwds_19_tfmrcodprv_sel ;
   private String AV90Tmrepuewwds_20_tfmractivo_sel ;
   private String scmdbuf ;
   private String lV72Tmrepuewwds_2_tfmrnom ;
   private String lV76Tmrepuewwds_6_tfmrcodext ;
   private String lV88Tmrepuewwds_18_tfmrcodprv ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n12850MRActivo ;
   private boolean n11458MRCodPrv ;
   private boolean n9498MRStkCri ;
   private boolean n9497MRStkMin ;
   private boolean n9496MRStkRes ;
   private boolean n9495MRStkAct ;
   private boolean n9499MRStkPre ;
   private boolean n9494MRCodExt ;
   private boolean n9493MRNom ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV71Tmrepuewwds_1_filterfulltext ;
   private String lV71Tmrepuewwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08BT2_A12850MRActivo ;
   private boolean[] P08BT2_n12850MRActivo ;
   private String[] P08BT2_A11458MRCodPrv ;
   private boolean[] P08BT2_n11458MRCodPrv ;
   private java.math.BigDecimal[] P08BT2_A9498MRStkCri ;
   private boolean[] P08BT2_n9498MRStkCri ;
   private java.math.BigDecimal[] P08BT2_A9497MRStkMin ;
   private boolean[] P08BT2_n9497MRStkMin ;
   private java.math.BigDecimal[] P08BT2_A9496MRStkRes ;
   private boolean[] P08BT2_n9496MRStkRes ;
   private java.math.BigDecimal[] P08BT2_A9495MRStkAct ;
   private boolean[] P08BT2_n9495MRStkAct ;
   private java.math.BigDecimal[] P08BT2_A9499MRStkPre ;
   private boolean[] P08BT2_n9499MRStkPre ;
   private String[] P08BT2_A9494MRCodExt ;
   private boolean[] P08BT2_n9494MRCodExt ;
   private int[] P08BT2_A9492MRCod ;
   private String[] P08BT2_A9493MRNom ;
   private boolean[] P08BT2_n9493MRNom ;
   private String[] P08BT2_A396EmprCod ;
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

final  class tmrepuewwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Tmrepuewwds_1_filterfulltext ,
                                          String AV73Tmrepuewwds_3_tfmrnom_sel ,
                                          String AV72Tmrepuewwds_2_tfmrnom ,
                                          int AV74Tmrepuewwds_4_tfmrcod ,
                                          int AV75Tmrepuewwds_5_tfmrcod_to ,
                                          String AV77Tmrepuewwds_7_tfmrcodext_sel ,
                                          String AV76Tmrepuewwds_6_tfmrcodext ,
                                          java.math.BigDecimal AV78Tmrepuewwds_8_tfmrstkpre ,
                                          java.math.BigDecimal AV79Tmrepuewwds_9_tfmrstkpre_to ,
                                          java.math.BigDecimal AV80Tmrepuewwds_10_tfmrstkact ,
                                          java.math.BigDecimal AV81Tmrepuewwds_11_tfmrstkact_to ,
                                          java.math.BigDecimal AV82Tmrepuewwds_12_tfmrstkres ,
                                          java.math.BigDecimal AV83Tmrepuewwds_13_tfmrstkres_to ,
                                          java.math.BigDecimal AV84Tmrepuewwds_14_tfmrstkmin ,
                                          java.math.BigDecimal AV85Tmrepuewwds_15_tfmrstkmin_to ,
                                          java.math.BigDecimal AV86Tmrepuewwds_16_tfmrstkcri ,
                                          java.math.BigDecimal AV87Tmrepuewwds_17_tfmrstkcri_to ,
                                          String AV89Tmrepuewwds_19_tfmrcodprv_sel ,
                                          String AV88Tmrepuewwds_18_tfmrcodprv ,
                                          String AV90Tmrepuewwds_20_tfmractivo_sel ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          String A9494MRCodExt ,
                                          java.math.BigDecimal A9499MRStkPre ,
                                          java.math.BigDecimal A9495MRStkAct ,
                                          java.math.BigDecimal A9496MRStkRes ,
                                          java.math.BigDecimal A9497MRStkMin ,
                                          java.math.BigDecimal A9498MRStkCri ,
                                          String A11458MRCodPrv ,
                                          String A12850MRActivo ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[28];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT MRActivo, MRCodPrv, MRStkCri, MRStkMin, MRStkRes, MRStkAct, MRStkPre, MRCodExt, MRCod, MRNom, EmprCod FROM TXPMREPUE" ;
      if ( ! (GXutil.strcmp("", AV71Tmrepuewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRCod,'99999990'), 2) like '%' || ?) or ( UPPER(MRCodExt) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRStkPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkRes,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkMin,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkCri,'99999990.999'), 2) like '%' || ?) or ( UPPER(MRCodPrv) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Tmrepuewwds_3_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Tmrepuewwds_2_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Tmrepuewwds_3_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(MRNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmrepuewwds_4_tfmrcod) )
      {
         addWhere(sWhereString, "(MRCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmrepuewwds_5_tfmrcod_to) )
      {
         addWhere(sWhereString, "(MRCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Tmrepuewwds_7_tfmrcodext_sel)==0) && ( ! (GXutil.strcmp("", AV76Tmrepuewwds_6_tfmrcodext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Tmrepuewwds_7_tfmrcodext_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodExt = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmrepuewwds_8_tfmrstkpre)==0) )
      {
         addWhere(sWhereString, "(MRStkPre >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmrepuewwds_9_tfmrstkpre_to)==0) )
      {
         addWhere(sWhereString, "(MRStkPre <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmrepuewwds_10_tfmrstkact)==0) )
      {
         addWhere(sWhereString, "(MRStkAct >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmrepuewwds_11_tfmrstkact_to)==0) )
      {
         addWhere(sWhereString, "(MRStkAct <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Tmrepuewwds_12_tfmrstkres)==0) )
      {
         addWhere(sWhereString, "(MRStkRes >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tmrepuewwds_13_tfmrstkres_to)==0) )
      {
         addWhere(sWhereString, "(MRStkRes <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tmrepuewwds_14_tfmrstkmin)==0) )
      {
         addWhere(sWhereString, "(MRStkMin >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tmrepuewwds_15_tfmrstkmin_to)==0) )
      {
         addWhere(sWhereString, "(MRStkMin <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tmrepuewwds_16_tfmrstkcri)==0) )
      {
         addWhere(sWhereString, "(MRStkCri >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tmrepuewwds_17_tfmrstkcri_to)==0) )
      {
         addWhere(sWhereString, "(MRStkCri <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmrepuewwds_19_tfmrcodprv_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmrepuewwds_18_tfmrcodprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmrepuewwds_19_tfmrcodprv_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodPrv = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmrepuewwds_20_tfmractivo_sel)==0) )
      {
         addWhere(sWhereString, "(MRActivo = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCodExt" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCodExt DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkPre" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkPre DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkAct" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkAct DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkRes" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkRes DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkMin" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkMin DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkCri" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkCri DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCodPrv" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCodPrv DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MRActivo" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRActivo DESC" ;
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
                  return conditional_P08BT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((String[]) buf[17])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               return;
      }
   }

}

