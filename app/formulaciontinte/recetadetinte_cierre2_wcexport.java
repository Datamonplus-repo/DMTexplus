package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte_cierre2_wcexport extends GXProcedure
{
   public recetadetinte_cierre2_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_cierre2_wcexport.class ), "" );
   }

   public recetadetinte_cierre2_wcexport( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      recetadetinte_cierre2_wcexport.this.aP1 = new String[] {""};
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
      recetadetinte_cierre2_wcexport.this.aP0 = aP0;
      recetadetinte_cierre2_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "RecetadeTinte_Cierre2_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV24FilterFullText, GXv_char5) ;
      recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV43TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarNHdr_Sel, GXv_char5) ;
         recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarNHdr, GXv_char5) ;
            recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV44TFRecLinMaq) && (0==AV45TFRecLinMaq_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFRecLinMaq );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFRecLinMaq_To );
      }
      if ( ! ( (0==AV46TFBarSit) && (0==AV47TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "St.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFBarSit_To );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarSer_Sel, GXv_char5) ;
         recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarSer, GXv_char5) ;
            recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarSerDsc_Sel, GXv_char5) ;
         recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarSerDsc, GXv_char5) ;
            recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFBarColNom_Sel, GXv_char5) ;
         recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFBarColNom, GXv_char5) ;
            recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV54TFBarColNum) && (0==AV55TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFBarColNum_To );
      }
      if ( ! ( (0==AV56TFBarTipCol) && (0==AV57TFBarTipCol_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFBarTipCol );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFBarTipCol_To );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFBarNomCli_Sel, GXv_char5) ;
         recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFBarNomCli, GXv_char5) ;
            recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV60TFBarNumCli) && (0==AV61TFBarNumCli_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFBarNumCli );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFBarNumCli_To );
      }
      if ( ! ( (GXutil.strcmp("", AV63TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFMaqCod_Sel, GXv_char5) ;
         recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFMaqCod, GXv_char5) ;
            recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV64TFRecVolPrd) && (0==AV65TFRecVolPrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV64TFRecVolPrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV65TFRecVolPrd_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV68TFRecFecAlt) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Alta", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV68TFRecFecAlt );
      }
      if ( ! ( (0==AV70TFBarNumAny) && (0==AV71TFBarNumAny_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Añad.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV70TFBarNumAny );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre2_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV71TFBarNumAny_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV39VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV25Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV25Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCColumnsSelector") ;
         AV31ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV33ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV84GXV1));
         if ( AV33ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV33ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV33ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV33ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setColor( 11 );
            AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = AV24FilterFullText ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = AV42TFBarNHdr ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = AV43TFBarNHdr_Sel ;
      AV89Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq = AV44TFRecLinMaq ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to = AV45TFRecLinMaq_To ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit = AV46TFBarSit ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to = AV47TFBarSit_To ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = AV48TFBarSer ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = AV49TFBarSer_Sel ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = AV50TFBarSerDsc ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = AV52TFBarColNom ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV99Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum = AV54TFBarColNum ;
      AV100Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to = AV55TFBarColNum_To ;
      AV101Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol = AV56TFBarTipCol ;
      AV102Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to = AV57TFBarTipCol_To ;
      AV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = AV58TFBarNomCli ;
      AV104Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV105Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli = AV60TFBarNumCli ;
      AV106Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to = AV61TFBarNumCli_To ;
      AV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = AV62TFMaqCod ;
      AV108Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = AV63TFMaqCod_Sel ;
      AV109Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd = AV64TFRecVolPrd ;
      AV110Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to = AV65TFRecVolPrd_To ;
      AV111Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = AV68TFRecFecAlt ;
      AV112Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany = AV70TFBarNumAny ;
      AV113Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to = AV71TFBarNumAny_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV88Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                           AV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV90Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV91Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) ,
                                           AV94Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                           AV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                           AV96Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                           AV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                           AV98Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                           AV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV101Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV102Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) ,
                                           AV104Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                           AV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV105Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV106Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) ,
                                           AV108Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                           AV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV109Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV110Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) ,
                                           AV111Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                           Short.valueOf(AV112Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) ,
                                           Short.valueOf(AV113Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) ,
                                           Integer.valueOf(AV17Barcod) ,
                                           Byte.valueOf(AV18Barcodreo) ,
                                           AV19Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                           A14372RecHayAny ,
                                           A13696BarNHdr ,
                                           A6039RecAcab ,
                                           Byte.valueOf(A4700RecEnvio) ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr), 11, "%") ;
      lV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser), 16, "%") ;
      lV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc), 26, "%") ;
      lV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom), 13, "%") ;
      lV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli), 13, "%") ;
      lV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09HH2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, lV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr, AV88Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel, Short.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq), Short.valueOf(AV90Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to), Byte.valueOf(AV91Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit), Byte.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to), lV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser, AV94Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel, lV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc, AV96Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel, lV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom, AV98Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum), Integer.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to), Byte.valueOf(AV101Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol), Byte.valueOf(AV102Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to), lV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli, AV104Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV105Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli), Integer.valueOf(AV106Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to), lV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod, AV108Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel, Integer.valueOf(AV109Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd), Integer.valueOf(AV110Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to), AV111Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt, Short.valueOf(AV112Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany), Short.valueOf(AV113Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to), Integer.valueOf(AV17Barcod), Byte.valueOf(AV18Barcodreo), AV19Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4700RecEnvio = P09HH2_A4700RecEnvio[0] ;
         A6039RecAcab = P09HH2_A6039RecAcab[0] ;
         n6039RecAcab = P09HH2_n6039RecAcab[0] ;
         A189BarNumAny = P09HH2_A189BarNumAny[0] ;
         A4866RecFecAlt = P09HH2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09HH2_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09HH2_A2805RecVolPrd[0] ;
         A602MaqCod = P09HH2_A602MaqCod[0] ;
         A1235BarNumCli = P09HH2_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HH2_A1234BarNomCli[0] ;
         A218BarTipCol = P09HH2_A218BarTipCol[0] ;
         A136BarColNum = P09HH2_A136BarColNum[0] ;
         A135BarColNom = P09HH2_A135BarColNom[0] ;
         A1652BarSerDsc = P09HH2_A1652BarSerDsc[0] ;
         A212BarSer = P09HH2_A212BarSer[0] ;
         A213BarSit = P09HH2_A213BarSit[0] ;
         A13696BarNHdr = P09HH2_A13696BarNHdr[0] ;
         A120BarAgrEst = P09HH2_A120BarAgrEst[0] ;
         A2804RecLinMaq = P09HH2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09HH2_A130BarCodPar[0] ;
         A132BarCodReo = P09HH2_A132BarCodReo[0] ;
         A129BarCod = P09HH2_A129BarCod[0] ;
         A396EmprCod = P09HH2_A396EmprCod[0] ;
         A189BarNumAny = P09HH2_A189BarNumAny[0] ;
         A1235BarNumCli = P09HH2_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HH2_A1234BarNomCli[0] ;
         A218BarTipCol = P09HH2_A218BarTipCol[0] ;
         A136BarColNum = P09HH2_A136BarColNum[0] ;
         A135BarColNom = P09HH2_A135BarColNom[0] ;
         A1652BarSerDsc = P09HH2_A1652BarSerDsc[0] ;
         A212BarSer = P09HH2_A212BarSer[0] ;
         A213BarSit = P09HH2_A213BarSit[0] ;
         A13696BarNHdr = P09HH2_A13696BarNHdr[0] ;
         A120BarAgrEst = P09HH2_A120BarAgrEst[0] ;
         GXt_char4 = A14372RecHayAny ;
         GXv_char5[0] = GXt_char4 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char5) ;
         recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
         A14372RecHayAny = GXt_char4 ;
         if ( (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A14372RecHayAny) , GXutil.padr( "%" + GXutil.upper( AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2804RecLinMaq, 4, 0) , GXutil.padr( "%" + AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2805RecVolPrd, 5, 0) , GXutil.padr( "%" + AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A189BarNumAny, 3, 0) , GXutil.padr( "%" + AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
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
            AV39VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXutil.booltostr( AV29Seleccionar) );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73Pesado, GXv_char5) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV74Adicion = "N" ;
               AV74Adicion = ((A189BarNumAny>0) ? "S" : AV74Adicion) ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74Adicion, GXv_char5) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14372RecHayAny, GXv_char5) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_int6 = AV114Contval ;
               GXv_char5[0] = AV16Emprcod ;
               GXv_char7[0] = "011100" ;
               GXv_int8[0] = GXt_int6 ;
               new app.pbuscou(remoteHandle, context).execute( GXv_char5, GXv_char7, GXv_int8) ;
               recetadetinte_cierre2_wcexport.this.AV16Emprcod = GXv_char5[0] ;
               recetadetinte_cierre2_wcexport.this.GXt_int6 = GXv_int8[0] ;
               AV114Contval = GXt_int6 ;
               AV115Consumos = ((AV114Contval==1) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(0)) ;
               AV75incidencias = (byte)(0) ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setNumber( AV75incidencias );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char7) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setNumber( A2804RecLinMaq );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setNumber( A213BarSit );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV30BarAgrEst = A120BarAgrEst ;
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV30BarAgrEst, GXv_char7) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char7) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char7) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char7) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setNumber( A218BarTipCol );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char7) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setNumber( A1235BarNumCli );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char7) ;
               recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setNumber( A2805RecVolPrd );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setDate( A4866RecFecAlt );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV31ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV39VisibleColumnCount), 1, 1).setNumber( A189BarNumAny );
               AV39VisibleColumnCount = (long)(AV39VisibleColumnCount+1) ;
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
      AV31ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Seleccionar", "", "Op", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Pesado", "", "P?", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Adicion", "", "Ad?", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "RecHayAny", "", "Any?", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&incidencias", "", "Err", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNHdr", "", "N Hdr", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "RecLinMaq", "", "#", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSit", "", "St.", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarAgrEst", "", "A?", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Articulo", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripcion", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Color", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Numero", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarTipCol", "", "TC", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNomCli", "", "Color Cli.", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNumCli", "", "Numero ", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "MaqCod", "", "Código Máquina", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "RecVolPrd", "", "Volumen", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "RecFecAlt", "Fecha", "Alta", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNumAny", "", "Nº Añad.", true, "") ;
      AV31ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char4 = AV35UserCustomValue ;
      GXv_char7[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre2_WCColumnsSelector", GXv_char7) ;
      recetadetinte_cierre2_wcexport.this.GXt_char4 = GXv_char7[0] ;
      AV35UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV35UserCustomValue)==0) ) )
      {
         AV32ColumnsSelectorAux.fromxml(AV35UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV32ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV31ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV32ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV31ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), null, null);
      }
      AV22OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV23OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV116GXV2 = 1 ;
      while ( AV116GXV2 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV116GXV2));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV24FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV42TFBarNHdr = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV43TFBarNHdr_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV44TFRecLinMaq = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFRecLinMaq_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV46TFBarSit = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarSit_To = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV48TFBarSer = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV49TFBarSer_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV50TFBarSerDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV51TFBarSerDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV52TFBarColNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV53TFBarColNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV54TFBarColNum = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarColNum_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV56TFBarTipCol = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarTipCol_To = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV58TFBarNomCli = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV59TFBarNomCli_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV60TFBarNumCli = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFBarNumCli_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV62TFMaqCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV63TFMaqCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV64TFRecVolPrd = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFRecVolPrd_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV68TFRecFecAlt = localUtil.ctot( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV70TFBarNumAny = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFBarNumAny_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV17Barcod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV18Barcodreo = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV19Barcodpar = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHACIERRE") == 0 )
         {
            AV20FechaCierre = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECACAB") == 0 )
         {
            AV21RecAcab = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV116GXV2 = (int)(AV116GXV2+1) ;
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
      this.aP0[0] = recetadetinte_cierre2_wcexport.this.AV11Filename;
      this.aP1[0] = recetadetinte_cierre2_wcexport.this.AV12ErrorMessage;
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
      AV24FilterFullText = "" ;
      AV43TFBarNHdr_Sel = "" ;
      AV42TFBarNHdr = "" ;
      AV49TFBarSer_Sel = "" ;
      AV48TFBarSer = "" ;
      AV51TFBarSerDsc_Sel = "" ;
      AV50TFBarSerDsc = "" ;
      AV53TFBarColNom_Sel = "" ;
      AV52TFBarColNom = "" ;
      AV59TFBarNomCli_Sel = "" ;
      AV58TFBarNomCli = "" ;
      AV63TFMaqCod_Sel = "" ;
      AV62TFMaqCod = "" ;
      AV68TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV25Session = httpContext.getWebSession();
      AV34ColumnsSelectorXML = "" ;
      AV31ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV33ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A14372RecHayAny = "" ;
      A13696BarNHdr = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = "" ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = "" ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = "" ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = "" ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = "" ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = "" ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = "" ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = "" ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = "" ;
      AV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = "" ;
      AV104Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = "" ;
      AV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = "" ;
      AV108Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = "" ;
      AV111Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      lV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = "" ;
      lV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = "" ;
      lV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = "" ;
      lV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = "" ;
      lV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = "" ;
      lV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = "" ;
      AV19Barcodpar = "" ;
      A130BarCodPar = "" ;
      A6039RecAcab = "" ;
      AV16Emprcod = "" ;
      A396EmprCod = "" ;
      P09HH2_A4700RecEnvio = new byte[1] ;
      P09HH2_A6039RecAcab = new String[] {""} ;
      P09HH2_n6039RecAcab = new boolean[] {false} ;
      P09HH2_A189BarNumAny = new short[1] ;
      P09HH2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HH2_n4866RecFecAlt = new boolean[] {false} ;
      P09HH2_A2805RecVolPrd = new int[1] ;
      P09HH2_A602MaqCod = new String[] {""} ;
      P09HH2_A1235BarNumCli = new int[1] ;
      P09HH2_A1234BarNomCli = new String[] {""} ;
      P09HH2_A218BarTipCol = new byte[1] ;
      P09HH2_A136BarColNum = new int[1] ;
      P09HH2_A135BarColNom = new String[] {""} ;
      P09HH2_A1652BarSerDsc = new String[] {""} ;
      P09HH2_A212BarSer = new String[] {""} ;
      P09HH2_A213BarSit = new byte[1] ;
      P09HH2_A13696BarNHdr = new String[] {""} ;
      P09HH2_A120BarAgrEst = new String[] {""} ;
      P09HH2_A2804RecLinMaq = new short[1] ;
      P09HH2_A130BarCodPar = new String[] {""} ;
      P09HH2_A132BarCodReo = new byte[1] ;
      P09HH2_A129BarCod = new int[1] ;
      P09HH2_A396EmprCod = new String[] {""} ;
      AV73Pesado = "" ;
      AV74Adicion = "" ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      AV115Consumos = DecimalUtil.ZERO ;
      AV30BarAgrEst = "" ;
      AV35UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char7 = new String[1] ;
      AV32ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV21RecAcab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre2_wcexport__default(),
         new Object[] {
             new Object[] {
            P09HH2_A4700RecEnvio, P09HH2_A6039RecAcab, P09HH2_n6039RecAcab, P09HH2_A189BarNumAny, P09HH2_A4866RecFecAlt, P09HH2_n4866RecFecAlt, P09HH2_A2805RecVolPrd, P09HH2_A602MaqCod, P09HH2_A1235BarNumCli, P09HH2_A1234BarNomCli,
            P09HH2_A218BarTipCol, P09HH2_A136BarColNum, P09HH2_A135BarColNom, P09HH2_A1652BarSerDsc, P09HH2_A212BarSer, P09HH2_A213BarSit, P09HH2_A13696BarNHdr, P09HH2_A120BarAgrEst, P09HH2_A2804RecLinMaq, P09HH2_A130BarCodPar,
            P09HH2_A132BarCodReo, P09HH2_A129BarCod, P09HH2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV46TFBarSit ;
   private byte AV47TFBarSit_To ;
   private byte AV56TFBarTipCol ;
   private byte AV57TFBarTipCol_To ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV91Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ;
   private byte AV92Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ;
   private byte AV101Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ;
   private byte AV102Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ;
   private byte AV18Barcodreo ;
   private byte A132BarCodReo ;
   private byte A4700RecEnvio ;
   private byte AV75incidencias ;
   private short AV44TFRecLinMaq ;
   private short AV45TFRecLinMaq_To ;
   private short AV70TFBarNumAny ;
   private short AV71TFBarNumAny_To ;
   private short GXv_int3[] ;
   private short A189BarNumAny ;
   private short A2804RecLinMaq ;
   private short AV89Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ;
   private short AV90Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ;
   private short AV112Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ;
   private short AV113Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ;
   private short AV22OrderedBy ;
   private short AV20FechaCierre ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV54TFBarColNum ;
   private int AV55TFBarColNum_To ;
   private int AV60TFBarNumCli ;
   private int AV61TFBarNumCli_To ;
   private int AV64TFRecVolPrd ;
   private int AV65TFRecVolPrd_To ;
   private int AV84GXV1 ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV99Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ;
   private int AV100Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ;
   private int AV105Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ;
   private int AV106Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ;
   private int AV109Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ;
   private int AV110Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ;
   private int AV17Barcod ;
   private int A129BarCod ;
   private int AV114Contval ;
   private int GXt_int6 ;
   private int GXv_int8[] ;
   private int AV116GXV2 ;
   private long AV39VisibleColumnCount ;
   private java.math.BigDecimal AV115Consumos ;
   private String AV43TFBarNHdr_Sel ;
   private String AV42TFBarNHdr ;
   private String AV49TFBarSer_Sel ;
   private String AV48TFBarSer ;
   private String AV51TFBarSerDsc_Sel ;
   private String AV50TFBarSerDsc ;
   private String AV53TFBarColNom_Sel ;
   private String AV52TFBarColNom ;
   private String AV59TFBarNomCli_Sel ;
   private String AV58TFBarNomCli ;
   private String AV63TFMaqCod_Sel ;
   private String AV62TFMaqCod ;
   private String A14372RecHayAny ;
   private String A13696BarNHdr ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A602MaqCod ;
   private String AV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ;
   private String AV88Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ;
   private String AV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ;
   private String AV94Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ;
   private String AV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ;
   private String AV96Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ;
   private String AV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ;
   private String AV98Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ;
   private String AV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ;
   private String AV104Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ;
   private String AV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ;
   private String AV108Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ;
   private String lV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ;
   private String lV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ;
   private String lV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ;
   private String lV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ;
   private String lV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ;
   private String AV19Barcodpar ;
   private String A130BarCodPar ;
   private String A6039RecAcab ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String AV73Pesado ;
   private String AV74Adicion ;
   private String GXv_char5[] ;
   private String AV30BarAgrEst ;
   private String GXt_char4 ;
   private String GXv_char7[] ;
   private String AV21RecAcab ;
   private java.util.Date AV68TFRecFecAlt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV111Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ;
   private boolean returnInSub ;
   private boolean AV23OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean AV29Seleccionar ;
   private String AV34ColumnsSelectorXML ;
   private String AV35UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV24FilterFullText ;
   private String AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ;
   private String lV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09HH2_A4700RecEnvio ;
   private String[] P09HH2_A6039RecAcab ;
   private boolean[] P09HH2_n6039RecAcab ;
   private short[] P09HH2_A189BarNumAny ;
   private java.util.Date[] P09HH2_A4866RecFecAlt ;
   private boolean[] P09HH2_n4866RecFecAlt ;
   private int[] P09HH2_A2805RecVolPrd ;
   private String[] P09HH2_A602MaqCod ;
   private int[] P09HH2_A1235BarNumCli ;
   private String[] P09HH2_A1234BarNomCli ;
   private byte[] P09HH2_A218BarTipCol ;
   private int[] P09HH2_A136BarColNum ;
   private String[] P09HH2_A135BarColNom ;
   private String[] P09HH2_A1652BarSerDsc ;
   private String[] P09HH2_A212BarSer ;
   private byte[] P09HH2_A213BarSit ;
   private String[] P09HH2_A13696BarNHdr ;
   private String[] P09HH2_A120BarAgrEst ;
   private short[] P09HH2_A2804RecLinMaq ;
   private String[] P09HH2_A130BarCodPar ;
   private byte[] P09HH2_A132BarCodReo ;
   private int[] P09HH2_A129BarCod ;
   private String[] P09HH2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV31ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV32ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV33ColumnsSelector_Column ;
}

final  class recetadetinte_cierre2_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                          String AV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                          short AV89Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ,
                                          short AV90Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ,
                                          byte AV91Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ,
                                          byte AV92Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ,
                                          String AV94Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                          String AV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                          String AV96Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                          String AV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                          String AV98Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                          String AV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                          int AV99Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ,
                                          int AV100Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ,
                                          byte AV101Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ,
                                          byte AV102Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ,
                                          String AV104Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                          String AV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                          int AV105Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ,
                                          int AV106Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ,
                                          String AV108Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                          String AV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                          int AV109Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ,
                                          int AV110Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV111Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                          short AV112Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ,
                                          short AV113Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ,
                                          int AV17Barcod ,
                                          byte AV18Barcodreo ,
                                          String AV19Barcodpar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          short A189BarNumAny ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV86Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                          String A14372RecHayAny ,
                                          String A13696BarNHdr ,
                                          String A6039RecAcab ,
                                          byte A4700RecEnvio ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[31];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.RecEnvio, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T2.BarAgrEst, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod" ;
      scmdbuf += " = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecEnvio > 0)");
      if ( (GXutil.strcmp("", AV88Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV91Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV93Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV97Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV103Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV109Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV111Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV112Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (0==AV113Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV17Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV18Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV22OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.RecEnvio" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNumCli" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNumCli DESC" ;
      }
      else if ( ( AV22OrderedBy == 11 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV22OrderedBy == 11 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV22OrderedBy == 12 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV22OrderedBy == 12 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV22OrderedBy == 13 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV22OrderedBy == 13 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt DESC" ;
      }
      else if ( ( AV22OrderedBy == 14 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNumAny" ;
      }
      else if ( ( AV22OrderedBy == 14 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNumAny DESC" ;
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
                  return conditional_P09HH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 3);
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               return;
      }
   }

}

