package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webverformulacompletaexport extends GXProcedure
{
   public webverformulacompletaexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webverformulacompletaexport.class ), "" );
   }

   public webverformulacompletaexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webverformulacompletaexport.this.aP1 = new String[] {""};
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
      webverformulacompletaexport.this.aP0 = aP0;
      webverformulacompletaexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV62Clave = AV63WebSession.getValue("&Clave") ;
      AV57CliCod = (int)(GXutil.lval( GXutil.substring( AV62Clave, 1, 6))) ;
      AV58ForSer = GXutil.substring( AV62Clave, 7, 16) ;
      AV59ForColNom = GXutil.substring( AV62Clave, 23, 13) ;
      AV60ForColNum = (int)(GXutil.lval( GXutil.substring( AV62Clave, 36, 6))) ;
      AV61TipColCod = (byte)(GXutil.lval( GXutil.substring( AV62Clave, 42, 2))) ;
      AV63WebSession.remove("&Clave");
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
      AV11Filename = "./PrivateTempStorage/" + "WebVerFormulaCompletaExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV10ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV10ExcelDocument.Cells(1, 2, 1, 1).setNumber( AV57CliCod );
      AV10ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Artigo", "") );
      AV10ExcelDocument.Cells(1, 4, 1, 1).setText( AV58ForSer );
      AV10ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV10ExcelDocument.Cells(1, 6, 1, 1).setText( AV59ForColNom );
      AV10ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV10ExcelDocument.Cells(1, 8, 1, 1).setNumber( AV60ForColNum );
      AV10ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "TC", "") );
      AV10ExcelDocument.Cells(1, 10, 1, 1).setNumber( AV61TipColCod );
      if ( ! ( (0==AV33TFEscMLin) && (0==AV34TFEscMLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV33TFEscMLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV34TFEscMLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV36TFProForCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proceso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFProForCod_Sel, GXv_char5) ;
         webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV35TFProForCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proceso", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFProForCod, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV38TFProForDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFProForDsc_Sel, GXv_char5) ;
         webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFProForDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFProForDsc, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFPrdNum_Sel, GXv_char5) ;
         webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFPrdNum, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrdNom_Sel, GXv_char5) ;
         webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPrdNom, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFEscMFacCon)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFEscMFacCon_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFEscMFacCon)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFEscMFacCon_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFForPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFForPrdDsc_Sel, GXv_char5) ;
         webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFForPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFForPrdDsc, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFEscMCan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFEscMCan_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFEscMCan)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverformulacompletaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFEscMCan_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.WebVerFormulaCompletaColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("FormulacionTinte.WebVerFormulaCompletaColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV66GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV68Formulaciontinte_webverformulacompletads_1_tfescmlin = AV33TFEscMLin ;
      AV69Formulaciontinte_webverformulacompletads_2_tfescmlin_to = AV34TFEscMLin_To ;
      AV70Formulaciontinte_webverformulacompletads_3_tfproforcod = AV35TFProForCod ;
      AV71Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV72Formulaciontinte_webverformulacompletads_5_tfprofordsc = AV37TFProForDsc ;
      AV73Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = AV38TFProForDsc_Sel ;
      AV74Formulaciontinte_webverformulacompletads_7_tfprdnum = AV39TFPrdNum ;
      AV75Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = AV40TFPrdNum_Sel ;
      AV76Formulaciontinte_webverformulacompletads_9_tfprdnom = AV41TFPrdNom ;
      AV77Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = AV42TFPrdNom_Sel ;
      AV78Formulaciontinte_webverformulacompletads_11_tfescmfaccon = AV43TFEscMFacCon ;
      AV79Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = AV44TFEscMFacCon_To ;
      AV80Formulaciontinte_webverformulacompletads_13_tfforprddsc = AV45TFForPrdDsc ;
      AV81Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = AV46TFForPrdDsc_Sel ;
      AV82Formulaciontinte_webverformulacompletads_15_tfescmcan = AV47TFEscMCan ;
      AV83Formulaciontinte_webverformulacompletads_16_tfescmcan_to = AV48TFEscMCan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV68Formulaciontinte_webverformulacompletads_1_tfescmlin) ,
                                           Integer.valueOf(AV69Formulaciontinte_webverformulacompletads_2_tfescmlin_to) ,
                                           AV71Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                           AV70Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                           AV73Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                           AV72Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                           AV75Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                           AV74Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                           AV77Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                           AV76Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                           AV78Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                           AV79Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                           AV81Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                           AV80Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                           AV82Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                           AV83Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                           Integer.valueOf(A887EscMLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4712EscMFacCon ,
                                           A488ForPrdDsc ,
                                           A890EscMCan ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV52Emprcod ,
                                           AV53Station ,
                                           A396EmprCod ,
                                           A910Workstat } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Formulaciontinte_webverformulacompletads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_webverformulacompletads_3_tfproforcod), 6, "%") ;
      lV72Formulaciontinte_webverformulacompletads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_webverformulacompletads_5_tfprofordsc), 30, "%") ;
      lV74Formulaciontinte_webverformulacompletads_7_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_webverformulacompletads_7_tfprdnum), 6, "%") ;
      lV76Formulaciontinte_webverformulacompletads_9_tfprdnom = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_webverformulacompletads_9_tfprdnom), 26, "%") ;
      lV80Formulaciontinte_webverformulacompletads_13_tfforprddsc = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_webverformulacompletads_13_tfforprddsc), 5, "%") ;
      /* Using cursor P08KD2 */
      pr_default.execute(0, new Object[] {AV52Emprcod, AV53Station, Integer.valueOf(AV68Formulaciontinte_webverformulacompletads_1_tfescmlin), Integer.valueOf(AV69Formulaciontinte_webverformulacompletads_2_tfescmlin_to), lV70Formulaciontinte_webverformulacompletads_3_tfproforcod, AV71Formulaciontinte_webverformulacompletads_4_tfproforcod_sel, lV72Formulaciontinte_webverformulacompletads_5_tfprofordsc, AV73Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel, lV74Formulaciontinte_webverformulacompletads_7_tfprdnum, AV75Formulaciontinte_webverformulacompletads_8_tfprdnum_sel, lV76Formulaciontinte_webverformulacompletads_9_tfprdnom, AV77Formulaciontinte_webverformulacompletads_10_tfprdnom_sel, AV78Formulaciontinte_webverformulacompletads_11_tfescmfaccon, AV79Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to, lV80Formulaciontinte_webverformulacompletads_13_tfforprddsc, AV81Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel, AV82Formulaciontinte_webverformulacompletads_15_tfescmcan, AV83Formulaciontinte_webverformulacompletads_16_tfescmcan_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A490ForPrdUMe = P08KD2_A490ForPrdUMe[0] ;
         A910Workstat = P08KD2_A910Workstat[0] ;
         A396EmprCod = P08KD2_A396EmprCod[0] ;
         A890EscMCan = P08KD2_A890EscMCan[0] ;
         A488ForPrdDsc = P08KD2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KD2_n488ForPrdDsc[0] ;
         A4712EscMFacCon = P08KD2_A4712EscMFacCon[0] ;
         A718PrdNom = P08KD2_A718PrdNom[0] ;
         A719PrdNum = P08KD2_A719PrdNum[0] ;
         A766ProForDsc = P08KD2_A766ProForDsc[0] ;
         A764ProForCod = P08KD2_A764ProForCod[0] ;
         A887EscMLin = P08KD2_A887EscMLin[0] ;
         A488ForPrdDsc = P08KD2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08KD2_n488ForPrdDsc[0] ;
         A718PrdNom = P08KD2_A718PrdNom[0] ;
         A766ProForDsc = P08KD2_A766ProForDsc[0] ;
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
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A887EscMLin );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A764ProForCod, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A766ProForDsc, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4712EscMFacCon)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A488ForPrdDsc, GXv_char5) ;
            webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A890EscMCan)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
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
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EscMLin", "", "#", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProForCod", "", "Proceso", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProForDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNom", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EscMFacCon", "", "Factor", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ForPrdDsc", "", "Unidad", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EscMCan", "", "Cantidad", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WebVerFormulaCompletaColumnsSelector", GXv_char5) ;
      webverformulacompletaexport.this.GXt_char4 = GXv_char5[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.WebVerFormulaCompletaGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WebVerFormulaCompletaGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("FormulacionTinte.WebVerFormulaCompletaGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV84GXV2 = 1 ;
      while ( AV84GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMLIN") == 0 )
         {
            AV33TFEscMLin = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFEscMLin_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV35TFProForCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV36TFProForCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV37TFProForDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV38TFProForDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV39TFPrdNum = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV40TFPrdNum_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV41TFPrdNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV42TFPrdNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMFACCON") == 0 )
         {
            AV43TFEscMFacCon = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFEscMFacCon_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV45TFForPrdDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV46TFForPrdDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESCMCAN") == 0 )
         {
            AV47TFEscMCan = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFEscMCan_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV52Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV57CliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV58ForSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV59ForColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV60ForColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV61TipColCod = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&STATION") == 0 )
         {
            AV53Station = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORRELBAN") == 0 )
         {
            AV54ForRelBan = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
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
      this.aP0[0] = webverformulacompletaexport.this.AV11Filename;
      this.aP1[0] = webverformulacompletaexport.this.AV12ErrorMessage;
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
      AV62Clave = "" ;
      AV63WebSession = httpContext.getWebSession();
      AV58ForSer = "" ;
      AV59ForColNom = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV36TFProForCod_Sel = "" ;
      AV35TFProForCod = "" ;
      AV38TFProForDsc_Sel = "" ;
      AV37TFProForDsc = "" ;
      AV40TFPrdNum_Sel = "" ;
      AV39TFPrdNum = "" ;
      AV42TFPrdNom_Sel = "" ;
      AV41TFPrdNom = "" ;
      AV43TFEscMFacCon = DecimalUtil.ZERO ;
      AV44TFEscMFacCon_To = DecimalUtil.ZERO ;
      AV46TFForPrdDsc_Sel = "" ;
      AV45TFForPrdDsc = "" ;
      AV47TFEscMCan = DecimalUtil.ZERO ;
      AV48TFEscMCan_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A890EscMCan = DecimalUtil.ZERO ;
      AV70Formulaciontinte_webverformulacompletads_3_tfproforcod = "" ;
      AV71Formulaciontinte_webverformulacompletads_4_tfproforcod_sel = "" ;
      AV72Formulaciontinte_webverformulacompletads_5_tfprofordsc = "" ;
      AV73Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel = "" ;
      AV74Formulaciontinte_webverformulacompletads_7_tfprdnum = "" ;
      AV75Formulaciontinte_webverformulacompletads_8_tfprdnum_sel = "" ;
      AV76Formulaciontinte_webverformulacompletads_9_tfprdnom = "" ;
      AV77Formulaciontinte_webverformulacompletads_10_tfprdnom_sel = "" ;
      AV78Formulaciontinte_webverformulacompletads_11_tfescmfaccon = DecimalUtil.ZERO ;
      AV79Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to = DecimalUtil.ZERO ;
      AV80Formulaciontinte_webverformulacompletads_13_tfforprddsc = "" ;
      AV81Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel = "" ;
      AV82Formulaciontinte_webverformulacompletads_15_tfescmcan = DecimalUtil.ZERO ;
      AV83Formulaciontinte_webverformulacompletads_16_tfescmcan_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV70Formulaciontinte_webverformulacompletads_3_tfproforcod = "" ;
      lV72Formulaciontinte_webverformulacompletads_5_tfprofordsc = "" ;
      lV74Formulaciontinte_webverformulacompletads_7_tfprdnum = "" ;
      lV76Formulaciontinte_webverformulacompletads_9_tfprdnom = "" ;
      lV80Formulaciontinte_webverformulacompletads_13_tfforprddsc = "" ;
      AV52Emprcod = "" ;
      AV53Station = "" ;
      A396EmprCod = "" ;
      A910Workstat = "" ;
      P08KD2_A490ForPrdUMe = new byte[1] ;
      P08KD2_A910Workstat = new String[] {""} ;
      P08KD2_A396EmprCod = new String[] {""} ;
      P08KD2_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KD2_A488ForPrdDsc = new String[] {""} ;
      P08KD2_n488ForPrdDsc = new boolean[] {false} ;
      P08KD2_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08KD2_A718PrdNom = new String[] {""} ;
      P08KD2_A719PrdNum = new String[] {""} ;
      P08KD2_A766ProForDsc = new String[] {""} ;
      P08KD2_A764ProForCod = new String[] {""} ;
      P08KD2_A887EscMLin = new int[1] ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54ForRelBan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.webverformulacompletaexport__default(),
         new Object[] {
             new Object[] {
            P08KD2_A490ForPrdUMe, P08KD2_A910Workstat, P08KD2_A396EmprCod, P08KD2_A890EscMCan, P08KD2_A488ForPrdDsc, P08KD2_n488ForPrdDsc, P08KD2_A4712EscMFacCon, P08KD2_A718PrdNom, P08KD2_A719PrdNum, P08KD2_A766ProForDsc,
            P08KD2_A764ProForCod, P08KD2_A887EscMLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV61TipColCod ;
   private byte A490ForPrdUMe ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV57CliCod ;
   private int AV60ForColNum ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV33TFEscMLin ;
   private int AV34TFEscMLin_To ;
   private int AV66GXV1 ;
   private int A887EscMLin ;
   private int AV68Formulaciontinte_webverformulacompletads_1_tfescmlin ;
   private int AV69Formulaciontinte_webverformulacompletads_2_tfescmlin_to ;
   private int AV84GXV2 ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV43TFEscMFacCon ;
   private java.math.BigDecimal AV44TFEscMFacCon_To ;
   private java.math.BigDecimal AV47TFEscMCan ;
   private java.math.BigDecimal AV48TFEscMCan_To ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal AV78Formulaciontinte_webverformulacompletads_11_tfescmfaccon ;
   private java.math.BigDecimal AV79Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ;
   private java.math.BigDecimal AV82Formulaciontinte_webverformulacompletads_15_tfescmcan ;
   private java.math.BigDecimal AV83Formulaciontinte_webverformulacompletads_16_tfescmcan_to ;
   private java.math.BigDecimal AV54ForRelBan ;
   private String AV62Clave ;
   private String AV58ForSer ;
   private String AV59ForColNom ;
   private String AV36TFProForCod_Sel ;
   private String AV35TFProForCod ;
   private String AV38TFProForDsc_Sel ;
   private String AV37TFProForDsc ;
   private String AV40TFPrdNum_Sel ;
   private String AV39TFPrdNum ;
   private String AV42TFPrdNom_Sel ;
   private String AV41TFPrdNom ;
   private String AV46TFForPrdDsc_Sel ;
   private String AV45TFForPrdDsc ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String AV70Formulaciontinte_webverformulacompletads_3_tfproforcod ;
   private String AV71Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ;
   private String AV72Formulaciontinte_webverformulacompletads_5_tfprofordsc ;
   private String AV73Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ;
   private String AV74Formulaciontinte_webverformulacompletads_7_tfprdnum ;
   private String AV75Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ;
   private String AV76Formulaciontinte_webverformulacompletads_9_tfprdnom ;
   private String AV77Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ;
   private String AV80Formulaciontinte_webverformulacompletads_13_tfforprddsc ;
   private String AV81Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV70Formulaciontinte_webverformulacompletads_3_tfproforcod ;
   private String lV72Formulaciontinte_webverformulacompletads_5_tfprofordsc ;
   private String lV74Formulaciontinte_webverformulacompletads_7_tfprdnum ;
   private String lV76Formulaciontinte_webverformulacompletads_9_tfprdnom ;
   private String lV80Formulaciontinte_webverformulacompletads_13_tfforprddsc ;
   private String AV52Emprcod ;
   private String AV53Station ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n488ForPrdDsc ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV63WebSession ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08KD2_A490ForPrdUMe ;
   private String[] P08KD2_A910Workstat ;
   private String[] P08KD2_A396EmprCod ;
   private java.math.BigDecimal[] P08KD2_A890EscMCan ;
   private String[] P08KD2_A488ForPrdDsc ;
   private boolean[] P08KD2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P08KD2_A4712EscMFacCon ;
   private String[] P08KD2_A718PrdNom ;
   private String[] P08KD2_A719PrdNum ;
   private String[] P08KD2_A766ProForDsc ;
   private String[] P08KD2_A764ProForCod ;
   private int[] P08KD2_A887EscMLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class webverformulacompletaexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV68Formulaciontinte_webverformulacompletads_1_tfescmlin ,
                                          int AV69Formulaciontinte_webverformulacompletads_2_tfescmlin_to ,
                                          String AV71Formulaciontinte_webverformulacompletads_4_tfproforcod_sel ,
                                          String AV70Formulaciontinte_webverformulacompletads_3_tfproforcod ,
                                          String AV73Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel ,
                                          String AV72Formulaciontinte_webverformulacompletads_5_tfprofordsc ,
                                          String AV75Formulaciontinte_webverformulacompletads_8_tfprdnum_sel ,
                                          String AV74Formulaciontinte_webverformulacompletads_7_tfprdnum ,
                                          String AV77Formulaciontinte_webverformulacompletads_10_tfprdnom_sel ,
                                          String AV76Formulaciontinte_webverformulacompletads_9_tfprdnom ,
                                          java.math.BigDecimal AV78Formulaciontinte_webverformulacompletads_11_tfescmfaccon ,
                                          java.math.BigDecimal AV79Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to ,
                                          String AV81Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel ,
                                          String AV80Formulaciontinte_webverformulacompletads_13_tfforprddsc ,
                                          java.math.BigDecimal AV82Formulaciontinte_webverformulacompletads_15_tfescmcan ,
                                          java.math.BigDecimal AV83Formulaciontinte_webverformulacompletads_16_tfescmcan_to ,
                                          int A887EscMLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4712EscMFacCon ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A890EscMCan ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV52Emprcod ,
                                          String AV53Station ,
                                          String A396EmprCod ,
                                          String A910Workstat )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.Workstat, T1.EmprCod, T1.EscMCan, T2.ForPrdDsc, T1.EscMFacCon, T3.PrdNom, T1.PrdNum, T4.ProForDsc, T1.ProForCod, T1.EscMLin FROM (((TXPESCMAN" ;
      scmdbuf += " T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      scmdbuf += " INNER JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Workstat = ?)");
      if ( ! (0==AV68Formulaciontinte_webverformulacompletads_1_tfescmlin) )
      {
         addWhere(sWhereString, "(T1.EscMLin >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_webverformulacompletads_2_tfescmlin_to) )
      {
         addWhere(sWhereString, "(T1.EscMLin <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_webverformulacompletads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_webverformulacompletads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_webverformulacompletads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_webverformulacompletads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_webverformulacompletads_7_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_webverformulacompletads_8_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_webverformulacompletads_9_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_webverformulacompletads_10_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_webverformulacompletads_11_tfescmfaccon)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Formulaciontinte_webverformulacompletads_12_tfescmfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMFacCon <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_webverformulacompletads_13_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_webverformulacompletads_14_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_webverformulacompletads_15_tfescmcan)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_webverformulacompletads_16_tfescmcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.EscMCan <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EscMLin" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EscMLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProForCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProForDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProForDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EscMFacCon" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EscMFacCon DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EscMCan" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EscMCan DESC" ;
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
                  return conditional_P08KD2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
      }
   }

}

