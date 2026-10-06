package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn09wwexport extends GXProcedure
{
   public ttrn09wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn09wwexport.class ), "" );
   }

   public ttrn09wwexport( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttrn09wwexport.this.aP1 = new String[] {""};
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
      ttrn09wwexport.this.aP0 = aP0;
      ttrn09wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TTrn09WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54FilterFullText, GXv_char5) ;
      ttrn09wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV45TFAlbProCod) && (0==AV46TFAlbProCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero Albaran Produccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFAlbProCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFAlbProCod_To );
      }
      if ( ! ( (0==AV47TFBarCod) && (0==AV48TFBarCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV47TFBarCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV48TFBarCod_To );
      }
      if ( ! ( (0==AV49TFBarCodReo) && (0==AV50TFBarCodReo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV49TFBarCodReo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV50TFBarCodReo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV52TFBarCodPar_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFBarCodPar_Sel, GXv_char5) ;
         ttrn09wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFBarCodPar)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Particion Barcada", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarCodPar, GXv_char5) ;
            ttrn09wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV55TFGuiFasMaxLin) && (0==AV56TFGuiFasMaxLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Línea Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFGuiFasMaxLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn09wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFGuiFasMaxLin_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV42VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV30Session.getValue("TTrn09WWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV30Session.getValue("TTrn09WWColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV59GXV1));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61Ttrn09wwds_1_filterfulltext = AV54FilterFullText ;
      AV62Ttrn09wwds_2_tfalbprocod = AV45TFAlbProCod ;
      AV63Ttrn09wwds_3_tfalbprocod_to = AV46TFAlbProCod_To ;
      AV64Ttrn09wwds_4_tfbarcod = AV47TFBarCod ;
      AV65Ttrn09wwds_5_tfbarcod_to = AV48TFBarCod_To ;
      AV66Ttrn09wwds_6_tfbarcodreo = AV49TFBarCodReo ;
      AV67Ttrn09wwds_7_tfbarcodreo_to = AV50TFBarCodReo_To ;
      AV68Ttrn09wwds_8_tfbarcodpar = AV51TFBarCodPar ;
      AV69Ttrn09wwds_9_tfbarcodpar_sel = AV52TFBarCodPar_Sel ;
      AV70Ttrn09wwds_10_tfguifasmaxlin = AV55TFGuiFasMaxLin ;
      AV71Ttrn09wwds_11_tfguifasmaxlin_to = AV56TFGuiFasMaxLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV62Ttrn09wwds_2_tfalbprocod) ,
                                           Long.valueOf(AV63Ttrn09wwds_3_tfalbprocod_to) ,
                                           Integer.valueOf(AV64Ttrn09wwds_4_tfbarcod) ,
                                           Integer.valueOf(AV65Ttrn09wwds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV66Ttrn09wwds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV67Ttrn09wwds_7_tfbarcodreo_to) ,
                                           AV69Ttrn09wwds_9_tfbarcodpar_sel ,
                                           AV68Ttrn09wwds_8_tfbarcodpar ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV61Ttrn09wwds_1_filterfulltext ,
                                           Short.valueOf(A13786GuiFasMaxL) ,
                                           Short.valueOf(AV70Ttrn09wwds_10_tfguifasmaxlin) ,
                                           Short.valueOf(AV71Ttrn09wwds_11_tfguifasmaxlin_to) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV61Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV61Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV61Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV61Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV61Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV68Ttrn09wwds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV68Ttrn09wwds_8_tfbarcodpar), 1, "%") ;
      /* Using cursor P08FC3 */
      pr_default.execute(0, new Object[] {AV61Ttrn09wwds_1_filterfulltext, lV61Ttrn09wwds_1_filterfulltext, lV61Ttrn09wwds_1_filterfulltext, lV61Ttrn09wwds_1_filterfulltext, lV61Ttrn09wwds_1_filterfulltext, lV61Ttrn09wwds_1_filterfulltext, Short.valueOf(AV70Ttrn09wwds_10_tfguifasmaxlin), Short.valueOf(AV70Ttrn09wwds_10_tfguifasmaxlin), Short.valueOf(AV71Ttrn09wwds_11_tfguifasmaxlin_to), Short.valueOf(AV71Ttrn09wwds_11_tfguifasmaxlin_to), Long.valueOf(AV62Ttrn09wwds_2_tfalbprocod), Long.valueOf(AV63Ttrn09wwds_3_tfalbprocod_to), Integer.valueOf(AV64Ttrn09wwds_4_tfbarcod), Integer.valueOf(AV65Ttrn09wwds_5_tfbarcod_to), Byte.valueOf(AV66Ttrn09wwds_6_tfbarcodreo), Byte.valueOf(AV67Ttrn09wwds_7_tfbarcodreo_to), lV68Ttrn09wwds_8_tfbarcodpar, AV69Ttrn09wwds_9_tfbarcodpar_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08FC3_A396EmprCod[0] ;
         A130BarCodPar = P08FC3_A130BarCodPar[0] ;
         A132BarCodReo = P08FC3_A132BarCodReo[0] ;
         A129BarCod = P08FC3_A129BarCod[0] ;
         A30AlbProCod = P08FC3_A30AlbProCod[0] ;
         A1248GuiFasULin = P08FC3_A1248GuiFasULin[0] ;
         A13786GuiFasMaxL = P08FC3_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FC3_n13786GuiFasMaxL[0] ;
         A13786GuiFasMaxL = P08FC3_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FC3_n13786GuiFasMaxL[0] ;
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
         AV42VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A30AlbProCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A129BarCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A132BarCodReo );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A130BarCodPar, GXv_char5) ;
            ttrn09wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A13786GuiFasMaxL );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
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
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbProCod", "", "Numero Albaran Produccion", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCod", "", "Codigo Barcada", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCodReo", "", "Codigo Reoperado Barcada", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCodPar", "", "Codigo Particion Barcada", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "GuiFasMaxLin", "", "Línea Fase", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTrn09WWColumnsSelector", GXv_char5) ;
      ttrn09wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV38UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue("TTrn09WWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn09WWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV30Session.getValue("TTrn09WWGridState"), null, null);
      }
      AV16OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV2 = 1 ;
      while ( AV72GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV45TFAlbProCod = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV46TFAlbProCod_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV47TFBarCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFBarCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV49TFBarCodReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFBarCodReo_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV51TFBarCodPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV52TFBarCodPar_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASMAXLIN") == 0 )
         {
            AV55TFGuiFasMaxLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFGuiFasMaxLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV72GXV2 = (int)(AV72GXV2+1) ;
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
      this.aP0[0] = ttrn09wwexport.this.AV11Filename;
      this.aP1[0] = ttrn09wwexport.this.AV12ErrorMessage;
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
      AV54FilterFullText = "" ;
      AV52TFBarCodPar_Sel = "" ;
      AV51TFBarCodPar = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV30Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A130BarCodPar = "" ;
      AV61Ttrn09wwds_1_filterfulltext = "" ;
      AV68Ttrn09wwds_8_tfbarcodpar = "" ;
      AV69Ttrn09wwds_9_tfbarcodpar_sel = "" ;
      lV61Ttrn09wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV68Ttrn09wwds_8_tfbarcodpar = "" ;
      P08FC3_A396EmprCod = new String[] {""} ;
      P08FC3_A130BarCodPar = new String[] {""} ;
      P08FC3_A132BarCodReo = new byte[1] ;
      P08FC3_A129BarCod = new int[1] ;
      P08FC3_A30AlbProCod = new long[1] ;
      P08FC3_A1248GuiFasULin = new short[1] ;
      P08FC3_A13786GuiFasMaxL = new short[1] ;
      P08FC3_n13786GuiFasMaxL = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn09wwexport__default(),
         new Object[] {
             new Object[] {
            P08FC3_A396EmprCod, P08FC3_A130BarCodPar, P08FC3_A132BarCodReo, P08FC3_A129BarCod, P08FC3_A30AlbProCod, P08FC3_A1248GuiFasULin, P08FC3_A13786GuiFasMaxL, P08FC3_n13786GuiFasMaxL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV49TFBarCodReo ;
   private byte AV50TFBarCodReo_To ;
   private byte A132BarCodReo ;
   private byte AV66Ttrn09wwds_6_tfbarcodreo ;
   private byte AV67Ttrn09wwds_7_tfbarcodreo_to ;
   private short AV55TFGuiFasMaxLin ;
   private short AV56TFGuiFasMaxLin_To ;
   private short GXv_int3[] ;
   private short A13786GuiFasMaxL ;
   private short AV70Ttrn09wwds_10_tfguifasmaxlin ;
   private short AV71Ttrn09wwds_11_tfguifasmaxlin_to ;
   private short AV16OrderedBy ;
   private short A1248GuiFasULin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV47TFBarCod ;
   private int AV48TFBarCod_To ;
   private int AV59GXV1 ;
   private int A129BarCod ;
   private int AV64Ttrn09wwds_4_tfbarcod ;
   private int AV65Ttrn09wwds_5_tfbarcod_to ;
   private int AV72GXV2 ;
   private long AV45TFAlbProCod ;
   private long AV46TFAlbProCod_To ;
   private long AV42VisibleColumnCount ;
   private long A30AlbProCod ;
   private long AV62Ttrn09wwds_2_tfalbprocod ;
   private long AV63Ttrn09wwds_3_tfalbprocod_to ;
   private String AV52TFBarCodPar_Sel ;
   private String AV51TFBarCodPar ;
   private String A130BarCodPar ;
   private String AV68Ttrn09wwds_8_tfbarcodpar ;
   private String AV69Ttrn09wwds_9_tfbarcodpar_sel ;
   private String scmdbuf ;
   private String lV68Ttrn09wwds_8_tfbarcodpar ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13786GuiFasMaxL ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV54FilterFullText ;
   private String AV61Ttrn09wwds_1_filterfulltext ;
   private String lV61Ttrn09wwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08FC3_A396EmprCod ;
   private String[] P08FC3_A130BarCodPar ;
   private byte[] P08FC3_A132BarCodReo ;
   private int[] P08FC3_A129BarCod ;
   private long[] P08FC3_A30AlbProCod ;
   private short[] P08FC3_A1248GuiFasULin ;
   private short[] P08FC3_A13786GuiFasMaxL ;
   private boolean[] P08FC3_n13786GuiFasMaxL ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
}

final  class ttrn09wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV62Ttrn09wwds_2_tfalbprocod ,
                                          long AV63Ttrn09wwds_3_tfalbprocod_to ,
                                          int AV64Ttrn09wwds_4_tfbarcod ,
                                          int AV65Ttrn09wwds_5_tfbarcod_to ,
                                          byte AV66Ttrn09wwds_6_tfbarcodreo ,
                                          byte AV67Ttrn09wwds_7_tfbarcodreo_to ,
                                          String AV69Ttrn09wwds_9_tfbarcodpar_sel ,
                                          String AV68Ttrn09wwds_8_tfbarcodpar ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV61Ttrn09wwds_1_filterfulltext ,
                                          short A13786GuiFasMaxL ,
                                          short AV70Ttrn09wwds_10_tfguifasmaxlin ,
                                          short AV71Ttrn09wwds_11_tfguifasmaxlin_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.GuiFasULin, COALESCE( T2.GuiFasMaxL, 0) AS GuiFasMaxL FROM (TXPALBBAR T1 LEFT JOIN (SELECT" ;
      scmdbuf += " MAX(GuiFasLin) AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbProCod,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.GuiFasMaxL, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) <= ?))");
      if ( ! (0==AV62Ttrn09wwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV63Ttrn09wwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Ttrn09wwds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Ttrn09wwds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Ttrn09wwds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Ttrn09wwds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ttrn09wwds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV68Ttrn09wwds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ttrn09wwds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.GuiFasULin" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
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
                  return conditional_P08FC3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

