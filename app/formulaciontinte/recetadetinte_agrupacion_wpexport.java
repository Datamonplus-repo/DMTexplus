package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte_agrupacion_wpexport extends GXProcedure
{
   public recetadetinte_agrupacion_wpexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_agrupacion_wpexport.class ), "" );
   }

   public recetadetinte_agrupacion_wpexport( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      recetadetinte_agrupacion_wpexport.this.aP1 = new String[] {""};
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
      recetadetinte_agrupacion_wpexport.this.aP0 = aP0;
      recetadetinte_agrupacion_wpexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "RecetadeTinte_Agrupacion_WPExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV89TFBarAgrNhdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº HDR", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFBarAgrNhdr_Sel, GXv_char5) ;
         recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV88TFBarAgrNhdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº HDR", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV88TFBarAgrNhdr, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFKgmAgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFKgmAgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFKgmAgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TFKgmAgr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFMtrAgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFMtrAgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFMtrAgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFMtrAgr_To)) );
      }
      if ( ! ( (0==AV64TFPieAgr) && (0==AV65TFPieAgr_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV64TFPieAgr );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV65TFPieAgr_To );
      }
      if ( ! ( (GXutil.strcmp("", AV69TFBarAgrSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFBarAgrSer_Sel, GXv_char5) ;
         recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFBarAgrSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFBarAgrSer, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV71TFBarAgrDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFBarAgrDsc_Sel, GXv_char5) ;
         recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFBarAgrDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFBarAgrDsc, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV72TFCliCodAgr) && (0==AV73TFCliCodAgr_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV72TFCliCodAgr );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV73TFCliCodAgr_To );
      }
      if ( ! ( (GXutil.strcmp("", AV77TFColNomAgr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFColNomAgr_Sel, GXv_char5) ;
         recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV76TFColNomAgr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFColNomAgr, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV78TFColNumAgr) && (0==AV79TFColNumAgr_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV78TFColNumAgr );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV79TFColNumAgr_To );
      }
      if ( ! ( (GXutil.strcmp("", AV81TFColNoCAgr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFColNoCAgr_Sel, GXv_char5) ;
         recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV80TFColNoCAgr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFColNoCAgr, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV82TFColNuCAgr) && (0==AV83TFColNuCAgr_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV82TFColNuCAgr );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_agrupacion_wpexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV83TFColNuCAgr_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV93GXV1 = 1 ;
      while ( AV93GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV93GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV93GXV1 = (int)(AV93GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV18FilterFullText ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV88TFBarAgrNhdr ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV89TFBarAgrNhdr_Sel ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV62TFKgmAgr ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV63TFKgmAgr_To ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV66TFMtrAgr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV67TFMtrAgr_To ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV64TFPieAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV65TFPieAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV68TFBarAgrSer ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV69TFBarAgrSer_Sel ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV70TFBarAgrDsc ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV71TFBarAgrDsc_Sel ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV72TFCliCodAgr ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV73TFCliCodAgr_To ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV76TFColNomAgr ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV77TFColNomAgr_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV78TFColNumAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV79TFColNumAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV80TFColNoCAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV81TFColNoCAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV82TFColNuCAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV83TFColNuCAgr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV97Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV98Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV100Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV101Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV107Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV108Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV109Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV111Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV112Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV113Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV115Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV116Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV117Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor P09H72 */
      pr_default.execute(0, new Object[] {lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV97Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV98Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV100Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV107Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV108Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV109Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV111Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV112Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV113Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV115Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV116Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV117Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1511ColNuCAgr = P09H72_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P09H72_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = P09H72_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09H72_A1510ColNomAgr[0] ;
         A1508CliCodAgr = P09H72_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P09H72_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P09H72_A1245BarAgrSer[0] ;
         A671PieAgr = P09H72_A671PieAgr[0] ;
         A869MtrAgr = P09H72_A869MtrAgr[0] ;
         A590KgmAgr = P09H72_A590KgmAgr[0] ;
         A122BarAgrPar = P09H72_A122BarAgrPar[0] ;
         A124BarAgrReo = P09H72_A124BarAgrReo[0] ;
         A119BarAgrCod = P09H72_A119BarAgrCod[0] ;
         A396EmprCod = P09H72_A396EmprCod[0] ;
         A129BarCod = P09H72_A129BarCod[0] ;
         A132BarCodReo = P09H72_A132BarCodReo[0] ;
         A130BarCodPar = P09H72_A130BarCodPar[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13792BarAgrNhdr, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A590KgmAgr)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A869MtrAgr)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A671PieAgr );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1245BarAgrSer, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1507BarAgrDsc, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1508CliCodAgr );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1510ColNomAgr, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1512ColNumAgr );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1509ColNoCAgr, GXv_char5) ;
            recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1511ColNuCAgr );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarAgrNhdr", "", "Nº HDR", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "KgmAgr", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MtrAgr", "", "Metros", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PieAgr", "", "Piezas", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarAgrSer", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarAgrDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCodAgr", "", "Cód Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ColNomAgr", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ColNumAgr", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ColNoCAgr", "", "Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ColNuCAgr", "", "N° Color Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector", GXv_char5) ;
      recetadetinte_agrupacion_wpexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV118GXV2 = 1 ;
      while ( AV118GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV118GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV88TFBarAgrNhdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV89TFBarAgrNhdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV62TFKgmAgr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFKgmAgr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV66TFMtrAgr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFMtrAgr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV64TFPieAgr = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFPieAgr_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV68TFBarAgrSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV69TFBarAgrSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC") == 0 )
         {
            AV70TFBarAgrDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC_SEL") == 0 )
         {
            AV71TFBarAgrDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICODAGR") == 0 )
         {
            AV72TFCliCodAgr = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFCliCodAgr_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV76TFColNomAgr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV77TFColNomAgr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV78TFColNumAgr = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV79TFColNumAgr_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR") == 0 )
         {
            AV80TFColNoCAgr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR_SEL") == 0 )
         {
            AV81TFColNoCAgr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUCAGR") == 0 )
         {
            AV82TFColNuCAgr = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV83TFColNuCAgr_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV118GXV2 = (int)(AV118GXV2+1) ;
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
      this.aP0[0] = recetadetinte_agrupacion_wpexport.this.AV11Filename;
      this.aP1[0] = recetadetinte_agrupacion_wpexport.this.AV12ErrorMessage;
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
      AV89TFBarAgrNhdr_Sel = "" ;
      AV88TFBarAgrNhdr = "" ;
      AV62TFKgmAgr = DecimalUtil.ZERO ;
      AV63TFKgmAgr_To = DecimalUtil.ZERO ;
      AV66TFMtrAgr = DecimalUtil.ZERO ;
      AV67TFMtrAgr_To = DecimalUtil.ZERO ;
      AV69TFBarAgrSer_Sel = "" ;
      AV68TFBarAgrSer = "" ;
      AV71TFBarAgrDsc_Sel = "" ;
      AV70TFBarAgrDsc = "" ;
      AV77TFColNomAgr_Sel = "" ;
      AV76TFColNomAgr = "" ;
      AV81TFColNoCAgr_Sel = "" ;
      AV80TFColNoCAgr = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13792BarAgrNhdr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = "" ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = "" ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = "" ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = DecimalUtil.ZERO ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = DecimalUtil.ZERO ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = DecimalUtil.ZERO ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = DecimalUtil.ZERO ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = "" ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = "" ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = "" ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = "" ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = "" ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = "" ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = "" ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = "" ;
      scmdbuf = "" ;
      lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = "" ;
      lV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = "" ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = "" ;
      lV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = "" ;
      lV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = "" ;
      lV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = "" ;
      A122BarAgrPar = "" ;
      P09H72_A1511ColNuCAgr = new int[1] ;
      P09H72_A1509ColNoCAgr = new String[] {""} ;
      P09H72_A1512ColNumAgr = new int[1] ;
      P09H72_A1510ColNomAgr = new String[] {""} ;
      P09H72_A1508CliCodAgr = new int[1] ;
      P09H72_A1507BarAgrDsc = new String[] {""} ;
      P09H72_A1245BarAgrSer = new String[] {""} ;
      P09H72_A671PieAgr = new short[1] ;
      P09H72_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H72_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H72_A122BarAgrPar = new String[] {""} ;
      P09H72_A124BarAgrReo = new byte[1] ;
      P09H72_A119BarAgrCod = new int[1] ;
      P09H72_A396EmprCod = new String[] {""} ;
      P09H72_A129BarCod = new int[1] ;
      P09H72_A132BarCodReo = new byte[1] ;
      P09H72_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_agrupacion_wpexport__default(),
         new Object[] {
             new Object[] {
            P09H72_A1511ColNuCAgr, P09H72_A1509ColNoCAgr, P09H72_A1512ColNumAgr, P09H72_A1510ColNomAgr, P09H72_A1508CliCodAgr, P09H72_A1507BarAgrDsc, P09H72_A1245BarAgrSer, P09H72_A671PieAgr, P09H72_A869MtrAgr, P09H72_A590KgmAgr,
            P09H72_A122BarAgrPar, P09H72_A124BarAgrReo, P09H72_A119BarAgrCod, P09H72_A396EmprCod, P09H72_A129BarCod, P09H72_A132BarCodReo, P09H72_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private byte A132BarCodReo ;
   private short AV64TFPieAgr ;
   private short AV65TFPieAgr_To ;
   private short GXv_int3[] ;
   private short A671PieAgr ;
   private short AV102Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ;
   private short AV103Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV72TFCliCodAgr ;
   private int AV73TFCliCodAgr_To ;
   private int AV78TFColNumAgr ;
   private int AV79TFColNumAgr_To ;
   private int AV82TFColNuCAgr ;
   private int AV83TFColNuCAgr_To ;
   private int AV93GXV1 ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int AV108Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ;
   private int AV109Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ;
   private int AV112Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ;
   private int AV113Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ;
   private int AV116Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ;
   private int AV117Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ;
   private int A119BarAgrCod ;
   private int A129BarCod ;
   private int AV118GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV62TFKgmAgr ;
   private java.math.BigDecimal AV63TFKgmAgr_To ;
   private java.math.BigDecimal AV66TFMtrAgr ;
   private java.math.BigDecimal AV67TFMtrAgr_To ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV98Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ;
   private java.math.BigDecimal AV99Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ;
   private java.math.BigDecimal AV100Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ;
   private java.math.BigDecimal AV101Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ;
   private String AV89TFBarAgrNhdr_Sel ;
   private String AV88TFBarAgrNhdr ;
   private String AV69TFBarAgrSer_Sel ;
   private String AV68TFBarAgrSer ;
   private String AV71TFBarAgrDsc_Sel ;
   private String AV70TFBarAgrDsc ;
   private String AV77TFColNomAgr_Sel ;
   private String AV76TFColNomAgr ;
   private String AV81TFColNoCAgr_Sel ;
   private String AV80TFColNoCAgr ;
   private String A13792BarAgrNhdr ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String A1510ColNomAgr ;
   private String A1509ColNoCAgr ;
   private String AV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ;
   private String AV97Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ;
   private String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ;
   private String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ;
   private String AV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ;
   private String AV107Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ;
   private String AV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ;
   private String AV111Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ;
   private String AV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ;
   private String AV115Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ;
   private String scmdbuf ;
   private String lV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ;
   private String lV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ;
   private String lV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ;
   private String lV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ;
   private String lV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ;
   private String A122BarAgrPar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ;
   private String lV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09H72_A1511ColNuCAgr ;
   private String[] P09H72_A1509ColNoCAgr ;
   private int[] P09H72_A1512ColNumAgr ;
   private String[] P09H72_A1510ColNomAgr ;
   private int[] P09H72_A1508CliCodAgr ;
   private String[] P09H72_A1507BarAgrDsc ;
   private String[] P09H72_A1245BarAgrSer ;
   private short[] P09H72_A671PieAgr ;
   private java.math.BigDecimal[] P09H72_A869MtrAgr ;
   private java.math.BigDecimal[] P09H72_A590KgmAgr ;
   private String[] P09H72_A122BarAgrPar ;
   private byte[] P09H72_A124BarAgrReo ;
   private int[] P09H72_A119BarAgrCod ;
   private String[] P09H72_A396EmprCod ;
   private int[] P09H72_A129BarCod ;
   private byte[] P09H72_A132BarCodReo ;
   private String[] P09H72_A130BarCodPar ;
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

final  class recetadetinte_agrupacion_wpexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09H72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV97Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV98Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV99Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV100Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV101Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV102Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV103Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV107Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV108Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV109Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV111Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV112Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV113Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV115Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV116Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV117Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR" ;
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
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
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV108Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV109Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV112Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV113Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY KgmAgr" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY KgmAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MtrAgr" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MtrAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PieAgr" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PieAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY BarAgrSer" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarAgrSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY BarAgrDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarAgrDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CliCodAgr" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliCodAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ColNomAgr" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ColNomAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ColNumAgr" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ColNumAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ColNoCAgr" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ColNoCAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ColNuCAgr" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ColNuCAgr DESC" ;
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
                  return conditional_P09H72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09H72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
      }
   }

}

