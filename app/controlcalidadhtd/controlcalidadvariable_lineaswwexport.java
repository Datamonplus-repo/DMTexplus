package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidadvariable_lineaswwexport extends GXProcedure
{
   public controlcalidadvariable_lineaswwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadvariable_lineaswwexport.class ), "" );
   }

   public controlcalidadvariable_lineaswwexport( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      controlcalidadvariable_lineaswwexport.this.aP1 = new String[] {""};
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
      controlcalidadvariable_lineaswwexport.this.aP0 = aP0;
      controlcalidadvariable_lineaswwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ControlCalidadVariable_lineasWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFEmprCod_Sel, GXv_char5) ;
         controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
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
            controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFEmprCod, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFEmprNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFEmprNom_Sel, GXv_char5) ;
         controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFEmprNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFEmprNom, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFCCTCod) && (0==AV39TFCCTCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFCCTCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFCCTCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFCCTDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción del Test", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFCCTDsc_Sel, GXv_char5) ;
         controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFCCTDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción del Test", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFCCTDsc, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV42TFCCTLin) && (0==AV43TFCCTLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "# Lín", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFCCTLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFCCTLin_To );
      }
      if ( ! ( (0==AV44TFCCTValLin) && (0==AV45TFCCTValLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "# Lín", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFCCTValLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFCCTValLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFCCTValDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFCCTValDsc_Sel, GXv_char5) ;
         controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFCCTValDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFCCTValDsc, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFCCTVal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFCCTVal_Sel, GXv_char5) ;
         controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFCCTVal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlcalidadvariable_lineaswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCCTVal, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV53GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = AV18FilterFullText ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = AV34TFEmprCod ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = AV36TFEmprNom ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = AV37TFEmprNom_Sel ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod = AV38TFCCTCod ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to = AV39TFCCTCod_To ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = AV40TFCCTDsc ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = AV41TFCCTDsc_Sel ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin = AV42TFCCTLin ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to = AV43TFCCTLin_To ;
      AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin = AV44TFCCTValLin ;
      AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to = AV45TFCCTValLin_To ;
      AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = AV46TFCCTValDsc ;
      AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = AV47TFCCTValDsc_Sel ;
      AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = AV48TFCCTVal ;
      AV71Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = AV49TFCCTVal_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                           AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                           AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                           Integer.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) ,
                                           Integer.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) ,
                                           AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                           AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                           Short.valueOf(AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) ,
                                           Short.valueOf(AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) ,
                                           Byte.valueOf(AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) ,
                                           Byte.valueOf(AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) ,
                                           AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                           AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                           AV71Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                           AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod), 3, "%") ;
      lV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc), 30, "%") ;
      lV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc), 30, "%") ;
      lV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = GXutil.padr( GXutil.rtrim( AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval), 40, "%") ;
      /* Using cursor P0AB62 */
      pr_default.execute(0, new Object[] {lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod, AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel, lV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom, AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel, Integer.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod), Integer.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to), lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc, AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel, Short.valueOf(AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin), Short.valueOf(AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to), Byte.valueOf(AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin), Byte.valueOf(AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to), lV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc, AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel, lV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval, AV71Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4051CCTVal = P0AB62_A4051CCTVal[0] ;
         A4050CCTValDsc = P0AB62_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0AB62_A4049CCTValLin[0] ;
         A4034CCTLin = P0AB62_A4034CCTLin[0] ;
         A4036CCTDsc = P0AB62_A4036CCTDsc[0] ;
         A4031CCTCod = P0AB62_A4031CCTCod[0] ;
         A407EmprNom = P0AB62_A407EmprNom[0] ;
         n407EmprNom = P0AB62_n407EmprNom[0] ;
         A396EmprCod = P0AB62_A396EmprCod[0] ;
         A407EmprNom = P0AB62_A407EmprNom[0] ;
         n407EmprNom = P0AB62_n407EmprNom[0] ;
         A4036CCTDsc = P0AB62_A4036CCTDsc[0] ;
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A407EmprNom, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A4031CCTCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4036CCTDsc, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A4034CCTLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A4049CCTValLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4050CCTValDsc, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4051CCTVal, GXv_char5) ;
            controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCTCod", "", "Código", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCTDsc", "", "Descripción del Test", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCTLin", "", "# Lín", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCTValLin", "", "# Lín", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCTValDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CCTVal", "", "Valor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ControlCalidadHTD.ControlCalidadVariable_lineasWWColumnsSelector", GXv_char5) ;
      controlcalidadvariable_lineaswwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV2 = 1 ;
      while ( AV72GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV2));
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
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV36TFEmprNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV37TFEmprNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV38TFCCTCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCCTCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV40TFCCTDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV41TFCCTDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV42TFCCTLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFCCTLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALLIN") == 0 )
         {
            AV44TFCCTValLin = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFCCTValLin_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC") == 0 )
         {
            AV46TFCCTValDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC_SEL") == 0 )
         {
            AV47TFCCTValDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL") == 0 )
         {
            AV48TFCCTVal = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL_SEL") == 0 )
         {
            AV49TFCCTVal_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      this.aP0[0] = controlcalidadvariable_lineaswwexport.this.AV11Filename;
      this.aP1[0] = controlcalidadvariable_lineaswwexport.this.AV12ErrorMessage;
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
      AV37TFEmprNom_Sel = "" ;
      AV36TFEmprNom = "" ;
      AV41TFCCTDsc_Sel = "" ;
      AV40TFCCTDsc = "" ;
      AV47TFCCTValDsc_Sel = "" ;
      AV46TFCCTValDsc = "" ;
      AV49TFCCTVal_Sel = "" ;
      AV48TFCCTVal = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A4036CCTDsc = "" ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = "" ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = "" ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = "" ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = "" ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = "" ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = "" ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = "" ;
      AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = "" ;
      AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = "" ;
      AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = "" ;
      AV71Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = "" ;
      scmdbuf = "" ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = "" ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = "" ;
      lV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = "" ;
      lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = "" ;
      lV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = "" ;
      lV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = "" ;
      P0AB62_A4051CCTVal = new String[] {""} ;
      P0AB62_A4050CCTValDsc = new String[] {""} ;
      P0AB62_A4049CCTValLin = new byte[1] ;
      P0AB62_A4034CCTLin = new short[1] ;
      P0AB62_A4036CCTDsc = new String[] {""} ;
      P0AB62_A4031CCTCod = new int[1] ;
      P0AB62_A407EmprNom = new String[] {""} ;
      P0AB62_n407EmprNom = new boolean[] {false} ;
      P0AB62_A396EmprCod = new String[] {""} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineaswwexport__default(),
         new Object[] {
             new Object[] {
            P0AB62_A4051CCTVal, P0AB62_A4050CCTValDsc, P0AB62_A4049CCTValLin, P0AB62_A4034CCTLin, P0AB62_A4036CCTDsc, P0AB62_A4031CCTCod, P0AB62_A407EmprNom, P0AB62_n407EmprNom, P0AB62_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44TFCCTValLin ;
   private byte AV45TFCCTValLin_To ;
   private byte A4049CCTValLin ;
   private byte AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ;
   private byte AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ;
   private short AV42TFCCTLin ;
   private short AV43TFCCTLin_To ;
   private short GXv_int3[] ;
   private short A4034CCTLin ;
   private short AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ;
   private short AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFCCTCod ;
   private int AV39TFCCTCod_To ;
   private int AV53GXV1 ;
   private int A4031CCTCod ;
   private int AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ;
   private int AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ;
   private int AV72GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV35TFEmprCod_Sel ;
   private String AV34TFEmprCod ;
   private String AV37TFEmprNom_Sel ;
   private String AV36TFEmprNom ;
   private String AV41TFCCTDsc_Sel ;
   private String AV40TFCCTDsc ;
   private String AV47TFCCTValDsc_Sel ;
   private String AV46TFCCTValDsc ;
   private String AV49TFCCTVal_Sel ;
   private String AV48TFCCTVal ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A4036CCTDsc ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ;
   private String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ;
   private String AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ;
   private String AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ;
   private String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ;
   private String AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ;
   private String AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ;
   private String AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ;
   private String AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ;
   private String AV71Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ;
   private String scmdbuf ;
   private String lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ;
   private String lV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ;
   private String lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ;
   private String lV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ;
   private String lV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n407EmprNom ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ;
   private String lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AB62_A4051CCTVal ;
   private String[] P0AB62_A4050CCTValDsc ;
   private byte[] P0AB62_A4049CCTValLin ;
   private short[] P0AB62_A4034CCTLin ;
   private String[] P0AB62_A4036CCTDsc ;
   private int[] P0AB62_A4031CCTCod ;
   private String[] P0AB62_A407EmprNom ;
   private boolean[] P0AB62_n407EmprNom ;
   private String[] P0AB62_A396EmprCod ;
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

final  class controlcalidadvariable_lineaswwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AB62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                          String AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                          String AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                          int AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ,
                                          int AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ,
                                          String AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                          String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                          short AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ,
                                          short AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ,
                                          byte AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ,
                                          byte AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ,
                                          String AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                          String AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                          String AV71Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                          String AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          short A4034CCTLin ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.CCTVal, T1.CCTValDsc, T1.CCTValLin, T1.CCTLin, T3.CCTDsc, T1.CCTCod, T2.EmprNom, T1.EmprCod FROM ((TXPCCDef2 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTLin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCTValLin,'90'), 2) like '%' || ?) or ( UPPER(T1.CCTValDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTVal) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTValDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTValDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CCTDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CCTDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTLin" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTValLin" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTValLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTVal" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTVal DESC" ;
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
                  return conditional_P0AB62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AB62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
      }
   }

}

