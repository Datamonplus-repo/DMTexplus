package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class productosalternativos_trnwwexport extends GXProcedure
{
   public productosalternativos_trnwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosalternativos_trnwwexport.class ), "" );
   }

   public productosalternativos_trnwwexport( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      productosalternativos_trnwwexport.this.aP1 = new String[] {""};
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
      productosalternativos_trnwwexport.this.aP0 = aP0;
      productosalternativos_trnwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ProductosAlternativos_TRNWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFPrdNum_Sel, GXv_char5) ;
         productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFPrdNum, GXv_char5) ;
            productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNom_Sel, GXv_char5) ;
         productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNom, GXv_char5) ;
            productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFPrdAltNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPrdAltNum_Sel, GXv_char5) ;
         productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFPrdAltNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrdAltNum, GXv_char5) ;
            productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFPrdAltNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPrdAltNom_Sel, GXv_char5) ;
         productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFPrdAltNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPrdAltNom, GXv_char5) ;
            productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFPrvAltNum) && (0==AV49TFPrvAltNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFPrvAltNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFPrvAltNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFPrvAltNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFPrvAltNom_Sel, GXv_char5) ;
         productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFPrvAltNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFPrvAltNom, GXv_char5) ;
            productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdAltFac)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdAltFac_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFPrdAltFac)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFPrdAltFac_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFValDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Validez", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFValDsc_Sel, GXv_char5) ;
         productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFValDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Validez", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosalternativos_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFValDsc, GXv_char5) ;
            productosalternativos_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV54GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV18FilterFullText ;
      AV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV34TFPrdNum ;
      AV58Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV36TFPrdNom ;
      AV60Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV42TFPrdAltNum ;
      AV62Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV43TFPrdAltNum_Sel ;
      AV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV44TFPrdAltNom ;
      AV64Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV45TFPrdAltNom_Sel ;
      AV65Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV48TFPrvAltNum ;
      AV66Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV49TFPrvAltNum_To ;
      AV67Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV50TFPrvAltNom ;
      AV68Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV51TFPrvAltNom_Sel ;
      AV69Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV46TFPrdAltFac ;
      AV70Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV47TFPrdAltFac_To ;
      AV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV38TFValDsc ;
      AV72Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV39TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV60Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV69Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV70Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV72Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV64Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV65Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV66Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV68Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV67Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor P09E42 */
      pr_default.execute(0, new Object[] {AV64Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV64Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV64Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV65Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV65Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV66Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV66Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV58Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV60Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV62Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV69Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV70Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV72Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09E42_A856ValCod[0] ;
         A857ValDsc = P09E42_A857ValDsc[0] ;
         n857ValDsc = P09E42_n857ValDsc[0] ;
         A678PrdAltFac = P09E42_A678PrdAltFac[0] ;
         A680PrdAltNum = P09E42_A680PrdAltNum[0] ;
         A718PrdNom = P09E42_A718PrdNom[0] ;
         A719PrdNum = P09E42_A719PrdNum[0] ;
         A679PrdAltNom = P09E42_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E42_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E42_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E42_n778PrvAltNum[0] ;
         A396EmprCod = P09E42_A396EmprCod[0] ;
         A856ValCod = P09E42_A856ValCod[0] ;
         A718PrdNom = P09E42_A718PrdNom[0] ;
         A857ValDsc = P09E42_A857ValDsc[0] ;
         n857ValDsc = P09E42_n857ValDsc[0] ;
         A679PrdAltNom = P09E42_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E42_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E42_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E42_n778PrvAltNum[0] ;
         GXt_char4 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int6[0] = A778PrvAltNum ;
         GXv_char7[0] = GXt_char4 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char7) ;
         productosalternativos_trnwwexport.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_trnwwexport.this.A778PrvAltNum = GXv_int6[0] ;
         productosalternativos_trnwwexport.this.GXt_char4 = GXv_char7[0] ;
         A777PrvAltNom = GXt_char4 ;
         if ( (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV68Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV67Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV68Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV68Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  AV13CellRow = (int)(AV13CellRow+1) ;
                  /* Execute user subroutine: 'BEFOREWRITELINE' */
                  S172 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV31VisibleColumnCount = 0 ;
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char7) ;
                     productosalternativos_trnwwexport.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char7) ;
                     productosalternativos_trnwwexport.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A680PrdAltNum, GXv_char7) ;
                     productosalternativos_trnwwexport.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A679PrdAltNom, GXv_char7) ;
                     productosalternativos_trnwwexport.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A778PrvAltNum );
                     AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A777PrvAltNom, GXv_char7) ;
                     productosalternativos_trnwwexport.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A678PrdAltFac)) );
                     AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char7[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A857ValDsc, GXv_char7) ;
                     productosalternativos_trnwwexport.this.GXt_char4 = GXv_char7[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                  }
                  /* Execute user subroutine: 'AFTERWRITELINE' */
                  S182 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAltNum", "Alternativo", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAltNom", "Alternativo", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvAltNum", "", "Proveedor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvAltNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAltFac", "", "Factor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ValDsc", "", "Validez", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char7[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ProductosAlternativos_TRNWWColumnsSelector", GXv_char7) ;
      productosalternativos_trnwwexport.this.GXt_char4 = GXv_char7[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProductosAlternativos_TRNWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV73GXV2 = 1 ;
      while ( AV73GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV36TFPrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV37TFPrdNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM") == 0 )
         {
            AV42TFPrdAltNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM_SEL") == 0 )
         {
            AV43TFPrdAltNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM") == 0 )
         {
            AV44TFPrdAltNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM_SEL") == 0 )
         {
            AV45TFPrdAltNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNUM") == 0 )
         {
            AV48TFPrvAltNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFPrvAltNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM") == 0 )
         {
            AV50TFPrvAltNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM_SEL") == 0 )
         {
            AV51TFPrvAltNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTFAC") == 0 )
         {
            AV46TFPrdAltFac = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFPrdAltFac_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV38TFValDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV39TFValDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV73GXV2 = (int)(AV73GXV2+1) ;
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
      this.aP0[0] = productosalternativos_trnwwexport.this.AV11Filename;
      this.aP1[0] = productosalternativos_trnwwexport.this.AV12ErrorMessage;
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
      AV35TFPrdNum_Sel = "" ;
      AV34TFPrdNum = "" ;
      AV37TFPrdNom_Sel = "" ;
      AV36TFPrdNom = "" ;
      AV43TFPrdAltNum_Sel = "" ;
      AV42TFPrdAltNum = "" ;
      AV45TFPrdAltNom_Sel = "" ;
      AV44TFPrdAltNom = "" ;
      AV51TFPrvAltNom_Sel = "" ;
      AV50TFPrvAltNom = "" ;
      AV46TFPrdAltFac = DecimalUtil.ZERO ;
      AV47TFPrdAltFac_To = DecimalUtil.ZERO ;
      AV39TFValDsc_Sel = "" ;
      AV38TFValDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A680PrdAltNum = "" ;
      A679PrdAltNom = "" ;
      A777PrvAltNom = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = "" ;
      AV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = "" ;
      AV58Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = "" ;
      AV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = "" ;
      AV60Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = "" ;
      AV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = "" ;
      AV62Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = "" ;
      AV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = "" ;
      AV64Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = "" ;
      AV67Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = "" ;
      AV68Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = "" ;
      AV69Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = DecimalUtil.ZERO ;
      AV70Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = DecimalUtil.ZERO ;
      AV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = "" ;
      AV72Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = "" ;
      lV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = "" ;
      lV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = "" ;
      lV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = "" ;
      lV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = "" ;
      lV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = "" ;
      P09E42_A856ValCod = new byte[1] ;
      P09E42_A857ValDsc = new String[] {""} ;
      P09E42_n857ValDsc = new boolean[] {false} ;
      P09E42_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09E42_A680PrdAltNum = new String[] {""} ;
      P09E42_A718PrdNom = new String[] {""} ;
      P09E42_A719PrdNum = new String[] {""} ;
      P09E42_A679PrdAltNom = new String[] {""} ;
      P09E42_n679PrdAltNom = new boolean[] {false} ;
      P09E42_A778PrvAltNum = new int[1] ;
      P09E42_n778PrvAltNum = new boolean[] {false} ;
      P09E42_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char7 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trnwwexport__default(),
         new Object[] {
             new Object[] {
            P09E42_A856ValCod, P09E42_A857ValDsc, P09E42_n857ValDsc, P09E42_A678PrdAltFac, P09E42_A680PrdAltNum, P09E42_A718PrdNom, P09E42_A719PrdNum, P09E42_A679PrdAltNom, P09E42_n679PrdAltNom, P09E42_A778PrvAltNum,
            P09E42_n778PrvAltNum, P09E42_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV48TFPrvAltNum ;
   private int AV49TFPrvAltNum_To ;
   private int AV54GXV1 ;
   private int A778PrvAltNum ;
   private int AV65Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ;
   private int AV66Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ;
   private int GXv_int6[] ;
   private int AV73GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV46TFPrdAltFac ;
   private java.math.BigDecimal AV47TFPrdAltFac_To ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV69Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ;
   private java.math.BigDecimal AV70Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ;
   private String AV35TFPrdNum_Sel ;
   private String AV34TFPrdNum ;
   private String AV37TFPrdNom_Sel ;
   private String AV36TFPrdNom ;
   private String AV43TFPrdAltNum_Sel ;
   private String AV42TFPrdAltNum ;
   private String AV45TFPrdAltNom_Sel ;
   private String AV44TFPrdAltNom ;
   private String AV51TFPrvAltNom_Sel ;
   private String AV50TFPrvAltNom ;
   private String AV39TFValDsc_Sel ;
   private String AV38TFValDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String A777PrvAltNom ;
   private String A857ValDsc ;
   private String AV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ;
   private String AV58Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ;
   private String AV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ;
   private String AV60Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ;
   private String AV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ;
   private String AV62Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ;
   private String AV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ;
   private String AV64Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ;
   private String AV67Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom ;
   private String AV68Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ;
   private String AV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ;
   private String AV72Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ;
   private String lV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ;
   private String lV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ;
   private String lV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ;
   private String lV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ;
   private String A396EmprCod ;
   private String GXv_char5[] ;
   private String GXt_char4 ;
   private String GXv_char7[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n857ValDsc ;
   private boolean n679PrdAltNom ;
   private boolean n778PrvAltNum ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ;
   private String lV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09E42_A856ValCod ;
   private String[] P09E42_A857ValDsc ;
   private boolean[] P09E42_n857ValDsc ;
   private java.math.BigDecimal[] P09E42_A678PrdAltFac ;
   private String[] P09E42_A680PrdAltNum ;
   private String[] P09E42_A718PrdNom ;
   private String[] P09E42_A719PrdNum ;
   private String[] P09E42_A679PrdAltNom ;
   private boolean[] P09E42_n679PrdAltNom ;
   private int[] P09E42_A778PrvAltNum ;
   private boolean[] P09E42_n778PrvAltNum ;
   private String[] P09E42_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class productosalternativos_trnwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09E42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV60Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV69Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV70Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV72Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV56Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV64Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV63Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV65Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV66Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV68Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV67Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[19];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum, T1.EmprCod" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
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
         scmdbuf += " ORDER BY T1.PrdAltNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ValDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ValDsc DESC" ;
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
                  return conditional_P09E42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09E42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
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
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               return;
      }
   }

}

