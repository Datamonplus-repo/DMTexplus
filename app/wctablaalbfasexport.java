package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wctablaalbfasexport extends GXProcedure
{
   public wctablaalbfasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctablaalbfasexport.class ), "" );
   }

   public wctablaalbfasexport( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wctablaalbfasexport.this.aP1 = new String[] {""};
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
      wctablaalbfasexport.this.aP0 = aP0;
      wctablaalbfasexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCTablaAlbfasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (0==AV53TFGuiFasMaxLin) && (0==AV54TFGuiFasMaxLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Línea Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV53TFGuiFasMaxLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV54TFGuiFasMaxLin_To );
      }
      if ( ! ( (0==AV32TFGuiFasLin) && (0==AV33TFGuiFasLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV32TFGuiFasLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV33TFGuiFasLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFFasCod_Sel, GXv_char5) ;
         wctablaalbfasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFFasCod, GXv_char5) ;
            wctablaalbfasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFFasDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descriçao", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFFasDsc_Sel, GXv_char5) ;
         wctablaalbfasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFFasDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descriçao", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFFasDsc, GXv_char5) ;
            wctablaalbfasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFFasKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFFasKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Quilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFFasKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFFasKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFGuiFasPKg)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFGuiFasPKg_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Preço", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFGuiFasPKg)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFGuiFasPKg_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFFasMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFFasMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFFasMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFFasMtr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFGuiFasPMt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFGuiFasPMt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Preço", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFGuiFasPMt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctablaalbfasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFGuiFasPMt_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV29VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV17Session.getValue("WCTablaAlbfasColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV17Session.getValue("WCTablaAlbfasColumnsSelector") ;
         AV21ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV23ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV78GXV1));
         if ( AV23ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV23ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV23ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV23ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setColor( 11 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV80Wctablaalbfasds_1_emprcod = AV48Emprcod ;
      AV81Wctablaalbfasds_2_albprocod = AV49AlbProcod ;
      AV82Wctablaalbfasds_3_barcod = AV50Barcod ;
      AV83Wctablaalbfasds_4_barcodreo = AV51Barcodreo ;
      AV84Wctablaalbfasds_5_tfguifasmaxlin = AV53TFGuiFasMaxLin ;
      AV85Wctablaalbfasds_6_tfguifasmaxlin_to = AV54TFGuiFasMaxLin_To ;
      AV86Wctablaalbfasds_7_tfguifaslin = AV32TFGuiFasLin ;
      AV87Wctablaalbfasds_8_tfguifaslin_to = AV33TFGuiFasLin_To ;
      AV88Wctablaalbfasds_9_tffascod = AV36TFFasCod ;
      AV89Wctablaalbfasds_10_tffascod_sel = AV37TFFasCod_Sel ;
      AV90Wctablaalbfasds_11_tffasdsc = AV38TFFasDsc ;
      AV91Wctablaalbfasds_12_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV92Wctablaalbfasds_13_tffaskgm = AV40TFFasKgm ;
      AV93Wctablaalbfasds_14_tffaskgm_to = AV41TFFasKgm_To ;
      AV94Wctablaalbfasds_15_tfguifaspkg = AV42TFGuiFasPKg ;
      AV95Wctablaalbfasds_16_tfguifaspkg_to = AV43TFGuiFasPKg_To ;
      AV96Wctablaalbfasds_17_tffasmtr = AV44TFFasMtr ;
      AV97Wctablaalbfasds_18_tffasmtr_to = AV45TFFasMtr_To ;
      AV98Wctablaalbfasds_19_tfguifaspmt = AV46TFGuiFasPMt ;
      AV99Wctablaalbfasds_20_tfguifaspmt_to = AV47TFGuiFasPMt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV86Wctablaalbfasds_7_tfguifaslin) ,
                                           Short.valueOf(AV87Wctablaalbfasds_8_tfguifaslin_to) ,
                                           AV89Wctablaalbfasds_10_tffascod_sel ,
                                           AV88Wctablaalbfasds_9_tffascod ,
                                           AV91Wctablaalbfasds_12_tffasdsc_sel ,
                                           AV90Wctablaalbfasds_11_tffasdsc ,
                                           AV92Wctablaalbfasds_13_tffaskgm ,
                                           AV93Wctablaalbfasds_14_tffaskgm_to ,
                                           AV94Wctablaalbfasds_15_tfguifaspkg ,
                                           AV95Wctablaalbfasds_16_tfguifaspkg_to ,
                                           AV96Wctablaalbfasds_17_tffasmtr ,
                                           AV97Wctablaalbfasds_18_tffasmtr_to ,
                                           AV98Wctablaalbfasds_19_tfguifaspmt ,
                                           AV99Wctablaalbfasds_20_tfguifaspmt_to ,
                                           Short.valueOf(A1240GuiFasLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A1275FasKgm ,
                                           A1241GuiFasPKg ,
                                           A1276FasMtr ,
                                           A1242GuiFasPMt ,
                                           Short.valueOf(AV35OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           Short.valueOf(AV84Wctablaalbfasds_5_tfguifasmaxlin) ,
                                           Short.valueOf(A13786GuiFasMaxL) ,
                                           Short.valueOf(AV85Wctablaalbfasds_6_tfguifasmaxlin_to) ,
                                           AV80Wctablaalbfasds_1_emprcod ,
                                           Long.valueOf(AV81Wctablaalbfasds_2_albprocod) ,
                                           Integer.valueOf(AV82Wctablaalbfasds_3_barcod) ,
                                           Byte.valueOf(AV83Wctablaalbfasds_4_barcodreo) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV88Wctablaalbfasds_9_tffascod = GXutil.padr( GXutil.rtrim( AV88Wctablaalbfasds_9_tffascod), 8, "%") ;
      lV90Wctablaalbfasds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV90Wctablaalbfasds_11_tffasdsc), 28, "%") ;
      /* Using cursor P08F83 */
      pr_default.execute(0, new Object[] {AV80Wctablaalbfasds_1_emprcod, Long.valueOf(AV81Wctablaalbfasds_2_albprocod), Integer.valueOf(AV82Wctablaalbfasds_3_barcod), Byte.valueOf(AV83Wctablaalbfasds_4_barcodreo), Short.valueOf(AV84Wctablaalbfasds_5_tfguifasmaxlin), Short.valueOf(AV84Wctablaalbfasds_5_tfguifasmaxlin), Short.valueOf(AV85Wctablaalbfasds_6_tfguifasmaxlin_to), Short.valueOf(AV85Wctablaalbfasds_6_tfguifasmaxlin_to), Short.valueOf(AV86Wctablaalbfasds_7_tfguifaslin), Short.valueOf(AV87Wctablaalbfasds_8_tfguifaslin_to), lV88Wctablaalbfasds_9_tffascod, AV89Wctablaalbfasds_10_tffascod_sel, lV90Wctablaalbfasds_11_tffasdsc, AV91Wctablaalbfasds_12_tffasdsc_sel, AV92Wctablaalbfasds_13_tffaskgm, AV93Wctablaalbfasds_14_tffaskgm_to, AV94Wctablaalbfasds_15_tfguifaspkg, AV95Wctablaalbfasds_16_tfguifaspkg_to, AV96Wctablaalbfasds_17_tffasmtr, AV97Wctablaalbfasds_18_tffasmtr_to, AV98Wctablaalbfasds_19_tfguifaspmt, AV99Wctablaalbfasds_20_tfguifaspmt_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P08F83_A130BarCodPar[0] ;
         A1242GuiFasPMt = P08F83_A1242GuiFasPMt[0] ;
         A1276FasMtr = P08F83_A1276FasMtr[0] ;
         A1241GuiFasPKg = P08F83_A1241GuiFasPKg[0] ;
         A1275FasKgm = P08F83_A1275FasKgm[0] ;
         A460FasDsc = P08F83_A460FasDsc[0] ;
         A457FasCod = P08F83_A457FasCod[0] ;
         A1240GuiFasLin = P08F83_A1240GuiFasLin[0] ;
         A132BarCodReo = P08F83_A132BarCodReo[0] ;
         A129BarCod = P08F83_A129BarCod[0] ;
         A30AlbProCod = P08F83_A30AlbProCod[0] ;
         A396EmprCod = P08F83_A396EmprCod[0] ;
         A13786GuiFasMaxL = P08F83_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08F83_n13786GuiFasMaxL[0] ;
         A460FasDsc = P08F83_A460FasDsc[0] ;
         A13786GuiFasMaxL = P08F83_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08F83_n13786GuiFasMaxL[0] ;
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
         AV29VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A13786GuiFasMaxL );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A1240GuiFasLin );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A457FasCod, GXv_char5) ;
            wctablaalbfasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A460FasDsc, GXv_char5) ;
            wctablaalbfasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1275FasKgm)) );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1241GuiFasPKg)) );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1276FasMtr)) );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1242GuiFasPMt)) );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
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
      AV21ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "GuiFasMaxLin", "", "Línea Fase", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "GuiFasLin", "", "Linha", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasCod", "", "Codigo Fase", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasDsc", "", "Descriçao", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasKgm", "", "Quilos", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "GuiFasPKg", "", "Preço", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasMtr", "", "Metros", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "GuiFasPMt", "", "Preço", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV25UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCTablaAlbfasColumnsSelector", GXv_char5) ;
      wctablaalbfasexport.this.GXt_char4 = GXv_char5[0] ;
      AV25UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV25UserCustomValue)==0) ) )
      {
         AV22ColumnsSelectorAux.fromxml(AV25UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV22ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV17Session.getValue("WCTablaAlbfasGridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCTablaAlbfasGridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV17Session.getValue("WCTablaAlbfasGridState"), null, null);
      }
      AV35OrderedBy = AV19GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV16OrderedDsc = AV19GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV2 = 1 ;
      while ( AV100GXV2 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV2));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASMAXLIN") == 0 )
         {
            AV53TFGuiFasMaxLin = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFGuiFasMaxLin_To = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASLIN") == 0 )
         {
            AV32TFGuiFasLin = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFGuiFasLin_To = (short)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV36TFFasCod = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV37TFFasCod_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV38TFFasDsc = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV39TFFasDsc_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGM") == 0 )
         {
            AV40TFFasKgm = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFFasKgm_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPKG") == 0 )
         {
            AV42TFGuiFasPKg = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFGuiFasPKg_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASMTR") == 0 )
         {
            AV44TFFasMtr = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFFasMtr_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPMT") == 0 )
         {
            AV46TFGuiFasPMt = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFGuiFasPMt_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROCOD") == 0 )
         {
            AV49AlbProcod = GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV50Barcod = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV51Barcodreo = (byte)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV100GXV2 = (int)(AV100GXV2+1) ;
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
      this.aP0[0] = wctablaalbfasexport.this.AV11Filename;
      this.aP1[0] = wctablaalbfasexport.this.AV12ErrorMessage;
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
      AV37TFFasCod_Sel = "" ;
      AV36TFFasCod = "" ;
      AV39TFFasDsc_Sel = "" ;
      AV38TFFasDsc = "" ;
      AV40TFFasKgm = DecimalUtil.ZERO ;
      AV41TFFasKgm_To = DecimalUtil.ZERO ;
      AV42TFGuiFasPKg = DecimalUtil.ZERO ;
      AV43TFGuiFasPKg_To = DecimalUtil.ZERO ;
      AV44TFFasMtr = DecimalUtil.ZERO ;
      AV45TFFasMtr_To = DecimalUtil.ZERO ;
      AV46TFGuiFasPMt = DecimalUtil.ZERO ;
      AV47TFGuiFasPMt_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV17Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      AV21ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV23ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      AV80Wctablaalbfasds_1_emprcod = "" ;
      AV48Emprcod = "" ;
      AV88Wctablaalbfasds_9_tffascod = "" ;
      AV89Wctablaalbfasds_10_tffascod_sel = "" ;
      AV90Wctablaalbfasds_11_tffasdsc = "" ;
      AV91Wctablaalbfasds_12_tffasdsc_sel = "" ;
      AV92Wctablaalbfasds_13_tffaskgm = DecimalUtil.ZERO ;
      AV93Wctablaalbfasds_14_tffaskgm_to = DecimalUtil.ZERO ;
      AV94Wctablaalbfasds_15_tfguifaspkg = DecimalUtil.ZERO ;
      AV95Wctablaalbfasds_16_tfguifaspkg_to = DecimalUtil.ZERO ;
      AV96Wctablaalbfasds_17_tffasmtr = DecimalUtil.ZERO ;
      AV97Wctablaalbfasds_18_tffasmtr_to = DecimalUtil.ZERO ;
      AV98Wctablaalbfasds_19_tfguifaspmt = DecimalUtil.ZERO ;
      AV99Wctablaalbfasds_20_tfguifaspmt_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV88Wctablaalbfasds_9_tffascod = "" ;
      lV90Wctablaalbfasds_11_tffasdsc = "" ;
      A396EmprCod = "" ;
      P08F83_A130BarCodPar = new String[] {""} ;
      P08F83_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F83_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F83_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F83_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F83_A460FasDsc = new String[] {""} ;
      P08F83_A457FasCod = new String[] {""} ;
      P08F83_A1240GuiFasLin = new short[1] ;
      P08F83_A132BarCodReo = new byte[1] ;
      P08F83_A129BarCod = new int[1] ;
      P08F83_A30AlbProCod = new long[1] ;
      P08F83_A396EmprCod = new String[] {""} ;
      P08F83_A13786GuiFasMaxL = new short[1] ;
      P08F83_n13786GuiFasMaxL = new boolean[] {false} ;
      A130BarCodPar = "" ;
      AV25UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV22ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctablaalbfasexport__default(),
         new Object[] {
             new Object[] {
            P08F83_A130BarCodPar, P08F83_A1242GuiFasPMt, P08F83_A1276FasMtr, P08F83_A1241GuiFasPKg, P08F83_A1275FasKgm, P08F83_A460FasDsc, P08F83_A457FasCod, P08F83_A1240GuiFasLin, P08F83_A132BarCodReo, P08F83_A129BarCod,
            P08F83_A30AlbProCod, P08F83_A396EmprCod, P08F83_A13786GuiFasMaxL, P08F83_n13786GuiFasMaxL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV83Wctablaalbfasds_4_barcodreo ;
   private byte AV51Barcodreo ;
   private byte A132BarCodReo ;
   private short AV53TFGuiFasMaxLin ;
   private short AV54TFGuiFasMaxLin_To ;
   private short AV32TFGuiFasLin ;
   private short AV33TFGuiFasLin_To ;
   private short GXv_int3[] ;
   private short A13786GuiFasMaxL ;
   private short A1240GuiFasLin ;
   private short AV84Wctablaalbfasds_5_tfguifasmaxlin ;
   private short AV85Wctablaalbfasds_6_tfguifasmaxlin_to ;
   private short AV86Wctablaalbfasds_7_tfguifaslin ;
   private short AV87Wctablaalbfasds_8_tfguifaslin_to ;
   private short AV35OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV78GXV1 ;
   private int AV82Wctablaalbfasds_3_barcod ;
   private int AV50Barcod ;
   private int A129BarCod ;
   private int AV100GXV2 ;
   private long AV29VisibleColumnCount ;
   private long AV81Wctablaalbfasds_2_albprocod ;
   private long AV49AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV40TFFasKgm ;
   private java.math.BigDecimal AV41TFFasKgm_To ;
   private java.math.BigDecimal AV42TFGuiFasPKg ;
   private java.math.BigDecimal AV43TFGuiFasPKg_To ;
   private java.math.BigDecimal AV44TFFasMtr ;
   private java.math.BigDecimal AV45TFFasMtr_To ;
   private java.math.BigDecimal AV46TFGuiFasPMt ;
   private java.math.BigDecimal AV47TFGuiFasPMt_To ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV92Wctablaalbfasds_13_tffaskgm ;
   private java.math.BigDecimal AV93Wctablaalbfasds_14_tffaskgm_to ;
   private java.math.BigDecimal AV94Wctablaalbfasds_15_tfguifaspkg ;
   private java.math.BigDecimal AV95Wctablaalbfasds_16_tfguifaspkg_to ;
   private java.math.BigDecimal AV96Wctablaalbfasds_17_tffasmtr ;
   private java.math.BigDecimal AV97Wctablaalbfasds_18_tffasmtr_to ;
   private java.math.BigDecimal AV98Wctablaalbfasds_19_tfguifaspmt ;
   private java.math.BigDecimal AV99Wctablaalbfasds_20_tfguifaspmt_to ;
   private String AV37TFFasCod_Sel ;
   private String AV36TFFasCod ;
   private String AV39TFFasDsc_Sel ;
   private String AV38TFFasDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV80Wctablaalbfasds_1_emprcod ;
   private String AV48Emprcod ;
   private String AV88Wctablaalbfasds_9_tffascod ;
   private String AV89Wctablaalbfasds_10_tffascod_sel ;
   private String AV90Wctablaalbfasds_11_tffasdsc ;
   private String AV91Wctablaalbfasds_12_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV88Wctablaalbfasds_9_tffascod ;
   private String lV90Wctablaalbfasds_11_tffasdsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV16OrderedDsc ;
   private boolean n13786GuiFasMaxL ;
   private String AV24ColumnsSelectorXML ;
   private String AV25UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08F83_A130BarCodPar ;
   private java.math.BigDecimal[] P08F83_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P08F83_A1276FasMtr ;
   private java.math.BigDecimal[] P08F83_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P08F83_A1275FasKgm ;
   private String[] P08F83_A460FasDsc ;
   private String[] P08F83_A457FasCod ;
   private short[] P08F83_A1240GuiFasLin ;
   private byte[] P08F83_A132BarCodReo ;
   private int[] P08F83_A129BarCod ;
   private long[] P08F83_A30AlbProCod ;
   private String[] P08F83_A396EmprCod ;
   private short[] P08F83_A13786GuiFasMaxL ;
   private boolean[] P08F83_n13786GuiFasMaxL ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV23ColumnsSelector_Column ;
}

final  class wctablaalbfasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08F83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV86Wctablaalbfasds_7_tfguifaslin ,
                                          short AV87Wctablaalbfasds_8_tfguifaslin_to ,
                                          String AV89Wctablaalbfasds_10_tffascod_sel ,
                                          String AV88Wctablaalbfasds_9_tffascod ,
                                          String AV91Wctablaalbfasds_12_tffasdsc_sel ,
                                          String AV90Wctablaalbfasds_11_tffasdsc ,
                                          java.math.BigDecimal AV92Wctablaalbfasds_13_tffaskgm ,
                                          java.math.BigDecimal AV93Wctablaalbfasds_14_tffaskgm_to ,
                                          java.math.BigDecimal AV94Wctablaalbfasds_15_tfguifaspkg ,
                                          java.math.BigDecimal AV95Wctablaalbfasds_16_tfguifaspkg_to ,
                                          java.math.BigDecimal AV96Wctablaalbfasds_17_tffasmtr ,
                                          java.math.BigDecimal AV97Wctablaalbfasds_18_tffasmtr_to ,
                                          java.math.BigDecimal AV98Wctablaalbfasds_19_tfguifaspmt ,
                                          java.math.BigDecimal AV99Wctablaalbfasds_20_tfguifaspmt_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1276FasMtr ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          short AV35OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          short AV84Wctablaalbfasds_5_tfguifasmaxlin ,
                                          short A13786GuiFasMaxL ,
                                          short AV85Wctablaalbfasds_6_tfguifasmaxlin_to ,
                                          String AV80Wctablaalbfasds_1_emprcod ,
                                          long AV81Wctablaalbfasds_2_albprocod ,
                                          int AV82Wctablaalbfasds_3_barcod ,
                                          byte AV83Wctablaalbfasds_4_barcodreo ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[22];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.GuiFasPMt, T1.FasMtr, T1.GuiFasPKg, T1.FasKgm, T2.FasDsc, T1.FasCod, T1.GuiFasLin, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod, COALESCE(" ;
      scmdbuf += " T3.GuiFasMaxL, 0) AS GuiFasMaxL FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) LEFT JOIN (SELECT MAX(GuiFasLin)" ;
      scmdbuf += " AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.AlbProCod = T1.AlbProCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.GuiFasMaxL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.GuiFasMaxL, 0) <= ?))");
      if ( ! (0==AV86Wctablaalbfasds_7_tfguifaslin) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Wctablaalbfasds_8_tfguifaslin_to) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wctablaalbfasds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV88Wctablaalbfasds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wctablaalbfasds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wctablaalbfasds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Wctablaalbfasds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wctablaalbfasds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wctablaalbfasds_13_tffaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wctablaalbfasds_14_tffaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Wctablaalbfasds_15_tfguifaspkg)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Wctablaalbfasds_16_tfguifaspkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Wctablaalbfasds_17_tffasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wctablaalbfasds_18_tffasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Wctablaalbfasds_19_tfguifaspmt)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Wctablaalbfasds_20_tfguifaspmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV35OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.GuiFasLin" ;
      }
      else if ( ( AV35OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.GuiFasLin DESC" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasCod" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T2.FasDsc" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T2.FasDsc DESC" ;
      }
      else if ( ( AV35OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasKgm" ;
      }
      else if ( ( AV35OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.FasKgm DESC" ;
      }
      else if ( ( AV35OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.GuiFasPKg" ;
      }
      else if ( ( AV35OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.GuiFasPKg DESC" ;
      }
      else if ( ( AV35OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasMtr" ;
      }
      else if ( ( AV35OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.FasMtr DESC" ;
      }
      else if ( ( AV35OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.GuiFasPMt" ;
      }
      else if ( ( AV35OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.AlbProCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.GuiFasPMt DESC" ;
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
                  return conditional_P08F83(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08F83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((long[]) buf[10])[0] = rslt.getLong(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 5);
               }
               return;
      }
   }

}

