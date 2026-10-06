package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_t_wcexport extends GXProcedure
{
   public upq_cuentacorriente_t_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_t_wcexport.class ), "" );
   }

   public upq_cuentacorriente_t_wcexport( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      upq_cuentacorriente_t_wcexport.this.aP1 = new String[] {""};
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
      upq_cuentacorriente_t_wcexport.this.aP0 = aP0;
      upq_cuentacorriente_t_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "UPQ_CuentaCorriente_t_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV39TFCCStkLin) && (0==AV40TFCCStkLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV39TFCCStkLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV40TFCCStkLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV42TFTipMovCc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFTipMovCc_Sel, GXv_char5) ;
         upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFTipMovCc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFTipMovCc, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFCCStkDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFCCStkDsc_Sel, GXv_char5) ;
         upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFCCStkDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFCCStkDsc, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFCCStkPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFCCStkPre_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFCCStkPre)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFCCStkPre_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFCCStkLot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCCStkLot_Sel, GXv_char5) ;
         upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFCCStkLot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFCCStkLot, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFCCStkUsu_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFCCStkUsu_Sel, GXv_char5) ;
         upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFCCStkUsu)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFCCStkUsu, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFCCStkFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV56TFCCStkFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFCCStkHor_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFCCStkHor_Sel, GXv_char5) ;
         upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFCCStkHor)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            upq_cuentacorriente_t_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFCCStkHor, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV36VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector"), "") != 0 )
      {
         AV31ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector") ;
         AV28ColumnsSelector.fromxml(AV31ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV30ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV70GXV1));
         if ( AV30ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV30ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV30ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV30ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setColor( 11 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV18FilterFullText ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV39TFCCStkLin ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV40TFCCStkLin_To ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV41TFTipMovCc ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV42TFTipMovCc_Sel ;
      AV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV43TFCCStkDsc ;
      AV78Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV44TFCCStkDsc_Sel ;
      AV79Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV45TFCCStkPre ;
      AV80Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV46TFCCStkPre_To ;
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV47TFCCStkLot ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV48TFCCStkLot_Sel ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV49TFCCStkUsu ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV50TFCCStkUsu_Sel ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV56TFCCStkFec ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV58TFCCStkHor ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV59TFCCStkHor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                           Long.valueOf(AV73Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                           Long.valueOf(AV74Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                           AV76Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                           AV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                           AV78Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                           AV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                           AV79Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                           AV80Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                           AV82Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                           AV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                           AV84Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                           AV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                           AV85Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                           AV87Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                           AV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                           AV53CCstkfecfrom ,
                                           AV54CCstkfecto ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3345TipMovCc ,
                                           A3357CCStkDsc ,
                                           A3349CCStkPre ,
                                           A5722CCStkLot ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3348CCStkFec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV52Emprcod ,
                                           AV55Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
      lV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
      lV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
      lV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
      /* Using cursor P09MP2 */
      pr_default.execute(0, new Object[] {AV52Emprcod, AV55Prdnum, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV73Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV74Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV76Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV78Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV79Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV80Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV82Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV84Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV85Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV87Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV53CCstkfecfrom, AV54CCstkfecto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09MP2_A719PrdNum[0] ;
         A396EmprCod = P09MP2_A396EmprCod[0] ;
         A3356CCStkHor = P09MP2_A3356CCStkHor[0] ;
         A3348CCStkFec = P09MP2_A3348CCStkFec[0] ;
         A3355CCStkUsu = P09MP2_A3355CCStkUsu[0] ;
         A5722CCStkLot = P09MP2_A5722CCStkLot[0] ;
         A3349CCStkPre = P09MP2_A3349CCStkPre[0] ;
         A3357CCStkDsc = P09MP2_A3357CCStkDsc[0] ;
         A3345TipMovCc = P09MP2_A3345TipMovCc[0] ;
         A3342CCStkLin = P09MP2_A3342CCStkLin[0] ;
         A3343CCStkCanE = P09MP2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P09MP2_A3344CCStkCanS[0] ;
         A3352CCStkPar = P09MP2_A3352CCStkPar[0] ;
         A3351CCStkReo = P09MP2_A3351CCStkReo[0] ;
         A3350CCStkBar = P09MP2_A3350CCStkBar[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV36VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( A3342CCStkLin );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV23DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23DiaHora, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3345TipMovCc, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3357CCStkDsc, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV24CCStkCanE = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3343CCStkCanE) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24CCStkCanE)) );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV25CCStkCanS = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3344CCStkCanS) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25CCStkCanS)) );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3349CCStkPre)) );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV26Exis = AV26Exis.add((A3343CCStkCanE.subtract(A3344CCStkCanS))) ;
            GXt_decimal7 = AV26Exis ;
            GXv_decimal8[0] = GXt_decimal7 ;
            new app.stocksquimicos.upq_cuentacorriente_recuento(remoteHandle, context).execute( AV52Emprcod, AV55Prdnum, A3348CCStkFec, GXv_decimal8) ;
            upq_cuentacorriente_t_wcexport.this.GXt_decimal7 = GXv_decimal8[0] ;
            AV26Exis = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? GXt_decimal7 : AV26Exis) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26Exis)) );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5722CCStkLot, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV27Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV27Hdr, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3355CCStkUsu, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A3348CCStkFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3356CCStkHor, GXv_char5) ;
            upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
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
      AV28ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CCStkLin", "", "Linea", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&DiaHora", "", "Dia Hora", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "TipMovCc", "", "Tipo", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CCStkDsc", "", "Descripcion", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&CCStkCanE", "Cantidad", "Entrada", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&CCStkCanS", "Cantidad", "Salida", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CCStkPre", "", "Precio", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Exis", "", "Saldo", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CCStkLot", "", "Lote", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Hdr", "", "N Hdr", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CCStkUsu", "", "Usuario", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CCStkFec", "", "Fecha", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CCStkHor", "", "Hora", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char4 = AV32UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.UPQ_CuentaCorriente_t_WCColumnsSelector", GXv_char5) ;
      upq_cuentacorriente_t_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV32UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV32UserCustomValue)==0) ) )
      {
         AV29ColumnsSelectorAux.fromxml(AV32UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV29ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV28ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV29ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV28ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV88GXV2 = 1 ;
      while ( AV88GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV39TFCCStkLin = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV40TFCCStkLin_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV41TFTipMovCc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV42TFTipMovCc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV43TFCCStkDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV44TFCCStkDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV45TFCCStkPre = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFCCStkPre_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLOT") == 0 )
         {
            AV47TFCCStkLot = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLOT_SEL") == 0 )
         {
            AV48TFCCStkLot_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV49TFCCStkUsu = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV50TFCCStkUsu_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV56TFCCStkFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV58TFCCStkHor = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV59TFCCStkHor_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV52Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV55Prdnum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFECFROM") == 0 )
         {
            AV53CCstkfecfrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFECTO") == 0 )
         {
            AV54CCstkfecto = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COMPRAS") == 0 )
         {
            AV60compras = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CONSUMOS") == 0 )
         {
            AV61consumos = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVOLUCIONES") == 0 )
         {
            AV62devoluciones = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALDOINICIAL") == 0 )
         {
            AV63SaldoInicial = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EXISTENCIASCUENTACORRIENTE") == 0 )
         {
            AV64Existenciascuentacorriente = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDEXIALM") == 0 )
         {
            AV65PrdExialm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDCANRES") == 0 )
         {
            AV66PrdCanres = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV67PrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV88GXV2 = (int)(AV88GXV2+1) ;
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
      this.aP0[0] = upq_cuentacorriente_t_wcexport.this.AV11Filename;
      this.aP1[0] = upq_cuentacorriente_t_wcexport.this.AV12ErrorMessage;
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
      AV42TFTipMovCc_Sel = "" ;
      AV41TFTipMovCc = "" ;
      AV44TFCCStkDsc_Sel = "" ;
      AV43TFCCStkDsc = "" ;
      AV45TFCCStkPre = DecimalUtil.ZERO ;
      AV46TFCCStkPre_To = DecimalUtil.ZERO ;
      AV48TFCCStkLot_Sel = "" ;
      AV47TFCCStkLot = "" ;
      AV50TFCCStkUsu_Sel = "" ;
      AV49TFCCStkUsu = "" ;
      AV56TFCCStkFec = GXutil.nullDate() ;
      AV59TFCCStkHor_Sel = "" ;
      AV58TFCCStkHor = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV31ColumnsSelectorXML = "" ;
      AV28ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV30ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A3348CCStkFec = GXutil.nullDate() ;
      A3356CCStkHor = "" ;
      A3345TipMovCc = "" ;
      A3357CCStkDsc = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3352CCStkPar = "" ;
      A3355CCStkUsu = "" ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = "" ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = "" ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = "" ;
      AV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = "" ;
      AV78Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = "" ;
      AV79Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = DecimalUtil.ZERO ;
      AV80Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = DecimalUtil.ZERO ;
      AV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = "" ;
      AV82Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = "" ;
      AV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = "" ;
      AV84Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = "" ;
      AV85Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = GXutil.nullDate() ;
      AV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = "" ;
      AV87Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = "" ;
      scmdbuf = "" ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = "" ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = "" ;
      lV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = "" ;
      lV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = "" ;
      lV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = "" ;
      lV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = "" ;
      AV53CCstkfecfrom = GXutil.nullDate() ;
      AV54CCstkfecto = GXutil.nullDate() ;
      AV52Emprcod = "" ;
      AV55Prdnum = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09MP2_A719PrdNum = new String[] {""} ;
      P09MP2_A396EmprCod = new String[] {""} ;
      P09MP2_A3356CCStkHor = new String[] {""} ;
      P09MP2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09MP2_A3355CCStkUsu = new String[] {""} ;
      P09MP2_A5722CCStkLot = new String[] {""} ;
      P09MP2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MP2_A3357CCStkDsc = new String[] {""} ;
      P09MP2_A3345TipMovCc = new String[] {""} ;
      P09MP2_A3342CCStkLin = new long[1] ;
      P09MP2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MP2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MP2_A3352CCStkPar = new String[] {""} ;
      P09MP2_A3351CCStkReo = new byte[1] ;
      P09MP2_A3350CCStkBar = new int[1] ;
      AV23DiaHora = "" ;
      AV24CCStkCanE = DecimalUtil.ZERO ;
      AV25CCStkCanS = DecimalUtil.ZERO ;
      AV26Exis = DecimalUtil.ZERO ;
      GXt_decimal7 = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV27Hdr = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV32UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV29ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV60compras = DecimalUtil.ZERO ;
      AV61consumos = DecimalUtil.ZERO ;
      AV62devoluciones = DecimalUtil.ZERO ;
      AV63SaldoInicial = DecimalUtil.ZERO ;
      AV64Existenciascuentacorriente = DecimalUtil.ZERO ;
      AV65PrdExialm = DecimalUtil.ZERO ;
      AV66PrdCanres = DecimalUtil.ZERO ;
      AV67PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_t_wcexport__default(),
         new Object[] {
             new Object[] {
            P09MP2_A719PrdNum, P09MP2_A396EmprCod, P09MP2_A3356CCStkHor, P09MP2_A3348CCStkFec, P09MP2_A3355CCStkUsu, P09MP2_A5722CCStkLot, P09MP2_A3349CCStkPre, P09MP2_A3357CCStkDsc, P09MP2_A3345TipMovCc, P09MP2_A3342CCStkLin,
            P09MP2_A3343CCStkCanE, P09MP2_A3344CCStkCanS, P09MP2_A3352CCStkPar, P09MP2_A3351CCStkReo, P09MP2_A3350CCStkBar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3351CCStkReo ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV70GXV1 ;
   private int A3350CCStkBar ;
   private int AV88GXV2 ;
   private long AV39TFCCStkLin ;
   private long AV40TFCCStkLin_To ;
   private long AV36VisibleColumnCount ;
   private long A3342CCStkLin ;
   private long AV73Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ;
   private long AV74Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ;
   private java.math.BigDecimal AV45TFCCStkPre ;
   private java.math.BigDecimal AV46TFCCStkPre_To ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal AV79Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ;
   private java.math.BigDecimal AV80Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ;
   private java.math.BigDecimal AV24CCStkCanE ;
   private java.math.BigDecimal AV25CCStkCanS ;
   private java.math.BigDecimal AV26Exis ;
   private java.math.BigDecimal GXt_decimal7 ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV60compras ;
   private java.math.BigDecimal AV61consumos ;
   private java.math.BigDecimal AV62devoluciones ;
   private java.math.BigDecimal AV63SaldoInicial ;
   private java.math.BigDecimal AV64Existenciascuentacorriente ;
   private java.math.BigDecimal AV65PrdExialm ;
   private java.math.BigDecimal AV66PrdCanres ;
   private String AV42TFTipMovCc_Sel ;
   private String AV41TFTipMovCc ;
   private String AV44TFCCStkDsc_Sel ;
   private String AV43TFCCStkDsc ;
   private String AV48TFCCStkLot_Sel ;
   private String AV47TFCCStkLot ;
   private String AV50TFCCStkUsu_Sel ;
   private String AV49TFCCStkUsu ;
   private String AV59TFCCStkHor_Sel ;
   private String AV58TFCCStkHor ;
   private String A3356CCStkHor ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3352CCStkPar ;
   private String A3355CCStkUsu ;
   private String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ;
   private String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ;
   private String AV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ;
   private String AV78Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ;
   private String AV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ;
   private String AV82Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ;
   private String AV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ;
   private String AV84Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ;
   private String AV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ;
   private String AV87Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ;
   private String scmdbuf ;
   private String lV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ;
   private String lV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ;
   private String lV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ;
   private String lV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ;
   private String lV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ;
   private String AV52Emprcod ;
   private String AV55Prdnum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV23DiaHora ;
   private String AV27Hdr ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV67PrdNom ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV56TFCCStkFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV85Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ;
   private java.util.Date AV53CCstkfecfrom ;
   private java.util.Date AV54CCstkfecto ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV31ColumnsSelectorXML ;
   private String AV32UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ;
   private String lV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09MP2_A719PrdNum ;
   private String[] P09MP2_A396EmprCod ;
   private String[] P09MP2_A3356CCStkHor ;
   private java.util.Date[] P09MP2_A3348CCStkFec ;
   private String[] P09MP2_A3355CCStkUsu ;
   private String[] P09MP2_A5722CCStkLot ;
   private java.math.BigDecimal[] P09MP2_A3349CCStkPre ;
   private String[] P09MP2_A3357CCStkDsc ;
   private String[] P09MP2_A3345TipMovCc ;
   private long[] P09MP2_A3342CCStkLin ;
   private java.math.BigDecimal[] P09MP2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09MP2_A3344CCStkCanS ;
   private String[] P09MP2_A3352CCStkPar ;
   private byte[] P09MP2_A3351CCStkReo ;
   private int[] P09MP2_A3350CCStkBar ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV30ColumnsSelector_Column ;
}

final  class upq_cuentacorriente_t_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09MP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV73Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV74Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV78Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV79Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV80Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV82Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV84Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV85Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV87Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV53CCstkfecfrom ,
                                          java.util.Date AV54CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV52Emprcod ,
                                          String AV55Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[26];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT PrdNum, EmprCod, CCStkHor, CCStkFec, CCStkUsu, CCStkLot, CCStkPre, CCStkDsc, TipMovCc, CCStkLin, CCStkCanE, CCStkCanS, CCStkPar, CCStkReo, CCStkBar FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      if ( ! (GXutil.strcmp("", AV72Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV86Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( AV16OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkFec" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkHor" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkHor DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkLin" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMovCc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMovCc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkPre" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkPre DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkLot" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkLot DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkUsu" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkUsu DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P09MP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09MP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
      }
   }

}

