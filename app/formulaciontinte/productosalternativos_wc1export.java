package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class productosalternativos_wc1export extends GXProcedure
{
   public productosalternativos_wc1export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosalternativos_wc1export.class ), "" );
   }

   public productosalternativos_wc1export( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      productosalternativos_wc1export.this.aP1 = new String[] {""};
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
      productosalternativos_wc1export.this.aP0 = aP0;
      productosalternativos_wc1export.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ProductosAlternativos_WC1Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21FilterFullText, GXv_char5) ;
      productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV38TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFPrdNum_Sel, GXv_char5) ;
         productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNum, GXv_char5) ;
            productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFPrdNom_Sel, GXv_char5) ;
         productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFPrdNom, GXv_char5) ;
            productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFPrdAltNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrdAltNum_Sel, GXv_char5) ;
         productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFPrdAltNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPrdAltNum, GXv_char5) ;
            productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFPrdAltNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPrdAltNom_Sel, GXv_char5) ;
         productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFPrdAltNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPrdAltNom, GXv_char5) ;
            productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV45TFPrvAltNum) && (0==AV46TFPrvAltNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFPrvAltNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFPrvAltNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFPrvAltNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFPrvAltNom_Sel, GXv_char5) ;
         productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFPrvAltNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFPrvAltNom, GXv_char5) ;
            productosalternativos_wc1export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdAltFac)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdAltFac_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFPrdAltFac)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFPrdAltFac_To)) );
      }
      if ( ! ( (0==AV54TFPrdAltCam_Sel) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cambiar?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_wc1export.this.AV13CellRow = GXv_int3[0] ;
         if ( AV54TFPrdAltCam_Sel == 1 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( AV54TFPrdAltCam_Sel == 2 )
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
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.ProductosAlternativos_WC1ColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV22Session.getValue("FormulacionTinte.ProductosAlternativos_WC1ColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV57GXV1));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = AV21FilterFullText ;
      AV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = AV37TFPrdNum ;
      AV61Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = AV38TFPrdNum_Sel ;
      AV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = AV39TFPrdNom ;
      AV63Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = AV40TFPrdNom_Sel ;
      AV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = AV41TFPrdAltNum ;
      AV65Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = AV42TFPrdAltNum_Sel ;
      AV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = AV43TFPrdAltNom ;
      AV67Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = AV44TFPrdAltNom_Sel ;
      AV68Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum = AV45TFPrvAltNum ;
      AV69Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to = AV46TFPrvAltNum_To ;
      AV70Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = AV47TFPrvAltNom ;
      AV71Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = AV48TFPrvAltNom_Sel ;
      AV72Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = AV49TFPrdAltFac ;
      AV73Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = AV50TFPrdAltFac_To ;
      AV74Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel = AV54TFPrdAltCam_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                           AV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                           AV63Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                           AV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                           AV65Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                           AV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                           AV72Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                           AV73Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                           Byte.valueOf(AV74Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel) ,
                                           AV17Prdnumfrom ,
                                           AV18prdnumto ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           Byte.valueOf(A11718PrdAltCam) ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV67Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                           AV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                           Integer.valueOf(AV68Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV69Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to) ,
                                           AV71Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                           AV70Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom), 26, "%") ;
      lV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum), 6, "%") ;
      lV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom), 26, "%") ;
      lV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum), 6, "%") ;
      /* Using cursor P09EE2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV67Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, lV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, AV67Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV67Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, Integer.valueOf(AV68Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV68Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV69Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), Integer.valueOf(AV69Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), lV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum, AV61Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel, lV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom, AV63Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel, lV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum, AV65Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel, AV72Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac, AV73Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to, AV17Prdnumfrom, AV18prdnumto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11718PrdAltCam = P09EE2_A11718PrdAltCam[0] ;
         A678PrdAltFac = P09EE2_A678PrdAltFac[0] ;
         A680PrdAltNum = P09EE2_A680PrdAltNum[0] ;
         A718PrdNom = P09EE2_A718PrdNom[0] ;
         A719PrdNum = P09EE2_A719PrdNum[0] ;
         A679PrdAltNom = P09EE2_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EE2_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EE2_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EE2_n778PrvAltNum[0] ;
         A396EmprCod = P09EE2_A396EmprCod[0] ;
         A718PrdNom = P09EE2_A718PrdNom[0] ;
         A679PrdAltNom = P09EE2_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EE2_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EE2_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EE2_n778PrvAltNum[0] ;
         GXt_char4 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int6[0] = A778PrvAltNum ;
         GXv_char7[0] = GXt_char4 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char7) ;
         productosalternativos_wc1export.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_wc1export.this.A778PrvAltNum = GXv_int6[0] ;
         productosalternativos_wc1export.this.GXt_char4 = GXv_char7[0] ;
         A777PrvAltNom = GXt_char4 ;
         if ( (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV71Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV70Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV71Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV71Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel) == 0 ) ) )
               {
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
                  AV34VisibleColumnCount = 0 ;
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char7) ;
                     productosalternativos_wc1export.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char7) ;
                     productosalternativos_wc1export.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A680PrdAltNum, GXv_char7) ;
                     productosalternativos_wc1export.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A679PrdAltNom, GXv_char7) ;
                     productosalternativos_wc1export.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A778PrvAltNum );
                     AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A777PrvAltNom, GXv_char7) ;
                     productosalternativos_wc1export.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A678PrdAltFac)) );
                     AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A11718PrdAltCam );
                     AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
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
               }
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAltNum", "Alternativos", "Producto", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAltNom", "Alternativos", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvAltNum", "", "Proveedor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvAltNom", "", "Nombre", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAltFac", "", "Factor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAltCam", "", "Cambiar?", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char7[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ProductosAlternativos_WC1ColumnsSelector", GXv_char7) ;
      productosalternativos_wc1export.this.GXt_char4 = GXv_char7[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.ProductosAlternativos_WC1GridState"), "") == 0 )
      {
         AV24GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProductosAlternativos_WC1GridState"), null, null);
      }
      else
      {
         AV24GridState.fromxml(AV22Session.getValue("FormulacionTinte.ProductosAlternativos_WC1GridState"), null, null);
      }
      AV19OrderedBy = AV24GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV20OrderedDsc = AV24GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV75GXV2 = 1 ;
      while ( AV75GXV2 <= AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV25GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV2));
         if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV37TFPrdNum = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV38TFPrdNum_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV39TFPrdNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV40TFPrdNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM") == 0 )
         {
            AV41TFPrdAltNum = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM_SEL") == 0 )
         {
            AV42TFPrdAltNum_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM") == 0 )
         {
            AV43TFPrdAltNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM_SEL") == 0 )
         {
            AV44TFPrdAltNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNUM") == 0 )
         {
            AV45TFPrvAltNum = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFPrvAltNum_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM") == 0 )
         {
            AV47TFPrvAltNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM_SEL") == 0 )
         {
            AV48TFPrvAltNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTFAC") == 0 )
         {
            AV49TFPrdAltFac = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFPrdAltFac_To = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTCAM_SEL") == 0 )
         {
            AV54TFPrdAltCam_Sel = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV17Prdnumfrom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV18prdnumto = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV75GXV2 = (int)(AV75GXV2+1) ;
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
      this.aP0[0] = productosalternativos_wc1export.this.AV11Filename;
      this.aP1[0] = productosalternativos_wc1export.this.AV12ErrorMessage;
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
      AV21FilterFullText = "" ;
      AV38TFPrdNum_Sel = "" ;
      AV37TFPrdNum = "" ;
      AV40TFPrdNom_Sel = "" ;
      AV39TFPrdNom = "" ;
      AV42TFPrdAltNum_Sel = "" ;
      AV41TFPrdAltNum = "" ;
      AV44TFPrdAltNom_Sel = "" ;
      AV43TFPrdAltNom = "" ;
      AV48TFPrvAltNom_Sel = "" ;
      AV47TFPrvAltNom = "" ;
      AV49TFPrdAltFac = DecimalUtil.ZERO ;
      AV50TFPrdAltFac_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV22Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A680PrdAltNum = "" ;
      A679PrdAltNom = "" ;
      A777PrvAltNom = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = "" ;
      AV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = "" ;
      AV61Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = "" ;
      AV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = "" ;
      AV63Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = "" ;
      AV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = "" ;
      AV65Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = "" ;
      AV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = "" ;
      AV67Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = "" ;
      AV70Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = "" ;
      AV71Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = "" ;
      AV72Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = DecimalUtil.ZERO ;
      AV73Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = DecimalUtil.ZERO ;
      lV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = "" ;
      lV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = "" ;
      lV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = "" ;
      lV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = "" ;
      AV17Prdnumfrom = "" ;
      AV18prdnumto = "" ;
      AV16Emprcod = "" ;
      A396EmprCod = "" ;
      P09EE2_A11718PrdAltCam = new byte[1] ;
      P09EE2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EE2_A680PrdAltNum = new String[] {""} ;
      P09EE2_A718PrdNom = new String[] {""} ;
      P09EE2_A719PrdNum = new String[] {""} ;
      P09EE2_A679PrdAltNom = new String[] {""} ;
      P09EE2_n679PrdAltNom = new boolean[] {false} ;
      P09EE2_A778PrvAltNum = new int[1] ;
      P09EE2_n778PrvAltNum = new boolean[] {false} ;
      P09EE2_A396EmprCod = new String[] {""} ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char7 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV24GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_wc1export__default(),
         new Object[] {
             new Object[] {
            P09EE2_A11718PrdAltCam, P09EE2_A678PrdAltFac, P09EE2_A680PrdAltNum, P09EE2_A718PrdNom, P09EE2_A719PrdNum, P09EE2_A679PrdAltNom, P09EE2_n679PrdAltNom, P09EE2_A778PrvAltNum, P09EE2_n778PrvAltNum, P09EE2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV54TFPrdAltCam_Sel ;
   private byte A11718PrdAltCam ;
   private byte AV74Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ;
   private short GXv_int3[] ;
   private short AV19OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV45TFPrvAltNum ;
   private int AV46TFPrvAltNum_To ;
   private int AV57GXV1 ;
   private int A778PrvAltNum ;
   private int AV68Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ;
   private int AV69Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ;
   private int GXv_int6[] ;
   private int AV75GXV2 ;
   private long AV34VisibleColumnCount ;
   private java.math.BigDecimal AV49TFPrdAltFac ;
   private java.math.BigDecimal AV50TFPrdAltFac_To ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV72Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ;
   private java.math.BigDecimal AV73Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ;
   private String AV38TFPrdNum_Sel ;
   private String AV37TFPrdNum ;
   private String AV40TFPrdNom_Sel ;
   private String AV39TFPrdNom ;
   private String AV42TFPrdAltNum_Sel ;
   private String AV41TFPrdAltNum ;
   private String AV44TFPrdAltNom_Sel ;
   private String AV43TFPrdAltNom ;
   private String AV48TFPrvAltNom_Sel ;
   private String AV47TFPrvAltNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String A777PrvAltNom ;
   private String AV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ;
   private String AV61Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ;
   private String AV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ;
   private String AV63Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ;
   private String AV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ;
   private String AV65Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ;
   private String AV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ;
   private String AV67Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ;
   private String AV70Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ;
   private String AV71Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ;
   private String scmdbuf ;
   private String lV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ;
   private String lV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ;
   private String lV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ;
   private String lV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ;
   private String AV17Prdnumfrom ;
   private String AV18prdnumto ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String GXv_char5[] ;
   private String GXt_char4 ;
   private String GXv_char7[] ;
   private boolean returnInSub ;
   private boolean AV20OrderedDsc ;
   private boolean n679PrdAltNom ;
   private boolean n778PrvAltNum ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV21FilterFullText ;
   private String AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ;
   private String lV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09EE2_A11718PrdAltCam ;
   private java.math.BigDecimal[] P09EE2_A678PrdAltFac ;
   private String[] P09EE2_A680PrdAltNum ;
   private String[] P09EE2_A718PrdNom ;
   private String[] P09EE2_A719PrdNum ;
   private String[] P09EE2_A679PrdAltNom ;
   private boolean[] P09EE2_n679PrdAltNom ;
   private int[] P09EE2_A778PrvAltNum ;
   private boolean[] P09EE2_n778PrvAltNum ;
   private String[] P09EE2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV24GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV25GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
}

final  class productosalternativos_wc1export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                          String AV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                          String AV63Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                          String AV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                          String AV65Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                          String AV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV72Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV73Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                          byte AV74Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ,
                                          String AV17Prdnumfrom ,
                                          String AV18prdnumto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          byte A11718PrdAltCam ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV59Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV67Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                          String AV66Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                          int AV68Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ,
                                          int AV69Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ,
                                          String AV71Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                          String AV70Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[20];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.PrdAltCam, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T3.PrdNom, ' ') AS PrdAltNom, COALESCE( T3.PrvNum, 0) AS PrvAltNum, T1.EmprCod FROM" ;
      scmdbuf += " ((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      scmdbuf += " = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) <= ?))");
      if ( (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( AV74Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 1 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 1)");
      }
      if ( AV74Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 2 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 0)");
      }
      if ( ! (GXutil.strcmp("", AV17Prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV19OrderedBy == 1 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV19OrderedBy == 1 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum DESC" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac DESC" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltCam" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltCam DESC" ;
      }
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P09EE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
      }
   }

}

