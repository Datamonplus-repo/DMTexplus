package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte_cierre_wcexport extends GXProcedure
{
   public recetadetinte_cierre_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_cierre_wcexport.class ), "" );
   }

   public recetadetinte_cierre_wcexport( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      recetadetinte_cierre_wcexport.this.aP1 = new String[] {""};
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
      recetadetinte_cierre_wcexport.this.aP0 = aP0;
      recetadetinte_cierre_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "RecetadeTinte_Cierre_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFBarNHdr_Sel, GXv_char5) ;
         recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFBarNHdr, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV36TFRecLinMaq) && (0==AV37TFRecLinMaq_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFRecLinMaq );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFRecLinMaq_To );
      }
      if ( ! ( (0==AV38TFBarSit) && (0==AV39TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Situacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFBarSit_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFBarSer_Sel, GXv_char5) ;
         recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFBarSer, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarSerDsc_Sel, GXv_char5) ;
         recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarSerDsc, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarColNom_Sel, GXv_char5) ;
         recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarColNom, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV46TFBarColNum) && (0==AV47TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFBarColNum_To );
      }
      if ( ! ( (0==AV48TFBarTipCol) && (0==AV49TFBarTipCol_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFBarTipCol );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFBarTipCol_To );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarNomCli_Sel, GXv_char5) ;
         recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarNomCli, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV52TFBarNumCli) && (0==AV53TFBarNumCli_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFBarNumCli );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFBarNumCli_To );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFMaqCod_Sel, GXv_char5) ;
         recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFMaqCod, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV56TFRecVolPrd) && (0==AV57TFRecVolPrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFRecVolPrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFRecVolPrd_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFRecTotKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFRecTotKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFRecTotKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFRecTotKgm_To)) );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV60TFRecFecAlt) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Alta", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV60TFRecFecAlt );
      }
      if ( ! ( (0==AV62TFBarNumAny) && (0==AV63TFBarNumAny_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Añad.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV62TFBarNumAny );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadetinte_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV63TFBarNumAny_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Cierre_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.RecetadeTinte_Cierre_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV78GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV18FilterFullText ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV34TFBarNHdr ;
      AV82Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV83Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV36TFRecLinMaq ;
      AV84Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV37TFRecLinMaq_To ;
      AV85Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV38TFBarSit ;
      AV86Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV39TFBarSit_To ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV40TFBarSer ;
      AV88Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV41TFBarSer_Sel ;
      AV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV42TFBarSerDsc ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV44TFBarColNom ;
      AV92Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV45TFBarColNom_Sel ;
      AV93Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV46TFBarColNum ;
      AV94Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV47TFBarColNum_To ;
      AV95Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV48TFBarTipCol ;
      AV96Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV49TFBarTipCol_To ;
      AV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV50TFBarNomCli ;
      AV98Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV51TFBarNomCli_Sel ;
      AV99Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV52TFBarNumCli ;
      AV100Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV53TFBarNumCli_To ;
      AV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV54TFMaqCod ;
      AV102Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV55TFMaqCod_Sel ;
      AV103Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV56TFRecVolPrd ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV57TFRecVolPrd_To ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV58TFRecTotKgm ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV59TFRecTotKgm_To ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV108Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV62TFBarNumAny ;
      AV109Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV63TFBarNumAny_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV82Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           AV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV86Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                           AV88Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           AV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           AV90Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           AV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           AV92Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           AV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV94Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV95Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV96Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                           AV98Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           AV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV99Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV100Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                           AV102Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           AV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV103Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV104Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                           AV107Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           Short.valueOf(AV108Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                           Short.valueOf(AV109Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           AV105Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           AV106Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           Integer.valueOf(AV66Barcod) ,
                                           Byte.valueOf(AV67Barcodreo) ,
                                           AV68Barcodpar ,
                                           A6039RecAcab ,
                                           AV70RecAcab ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
      lV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
      lV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
      lV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
      lV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
      lV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09GW5 */
      pr_default.execute(0, new Object[] {AV65Emprcod, AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV105Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV105Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV106Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV106Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV66Barcod), Integer.valueOf(AV66Barcod), Byte.valueOf(AV67Barcodreo), Byte.valueOf(AV67Barcodreo), AV68Barcodpar, AV68Barcodpar, AV70RecAcab, lV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV82Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV86Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV88Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV90Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV92Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV94Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV95Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV96Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV98Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV99Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV100Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV102Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV103Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV104Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV107Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV108Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV109Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09GW5_A2804RecLinMaq[0] ;
         A396EmprCod = P09GW5_A396EmprCod[0] ;
         A6039RecAcab = P09GW5_A6039RecAcab[0] ;
         n6039RecAcab = P09GW5_n6039RecAcab[0] ;
         A189BarNumAny = P09GW5_A189BarNumAny[0] ;
         A4866RecFecAlt = P09GW5_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09GW5_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09GW5_A2805RecVolPrd[0] ;
         A602MaqCod = P09GW5_A602MaqCod[0] ;
         A1235BarNumCli = P09GW5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GW5_A1234BarNomCli[0] ;
         A218BarTipCol = P09GW5_A218BarTipCol[0] ;
         A136BarColNum = P09GW5_A136BarColNum[0] ;
         A135BarColNom = P09GW5_A135BarColNom[0] ;
         A1652BarSerDsc = P09GW5_A1652BarSerDsc[0] ;
         A212BarSer = P09GW5_A212BarSer[0] ;
         A213BarSit = P09GW5_A213BarSit[0] ;
         A13696BarNHdr = P09GW5_A13696BarNHdr[0] ;
         A120BarAgrEst = P09GW5_A120BarAgrEst[0] ;
         A812RecTotKgm = P09GW5_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GW5_n812RecTotKgm[0] ;
         A129BarCod = P09GW5_A129BarCod[0] ;
         A132BarCodReo = P09GW5_A132BarCodReo[0] ;
         A130BarCodPar = P09GW5_A130BarCodPar[0] ;
         A189BarNumAny = P09GW5_A189BarNumAny[0] ;
         A1235BarNumCli = P09GW5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GW5_A1234BarNomCli[0] ;
         A218BarTipCol = P09GW5_A218BarTipCol[0] ;
         A136BarColNum = P09GW5_A136BarColNum[0] ;
         A135BarColNom = P09GW5_A135BarColNom[0] ;
         A1652BarSerDsc = P09GW5_A1652BarSerDsc[0] ;
         A212BarSer = P09GW5_A212BarSer[0] ;
         A213BarSit = P09GW5_A213BarSit[0] ;
         A13696BarNHdr = P09GW5_A13696BarNHdr[0] ;
         A120BarAgrEst = P09GW5_A120BarAgrEst[0] ;
         A812RecTotKgm = P09GW5_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GW5_n812RecTotKgm[0] ;
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
            AV71Seleccionar = "N" ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71Seleccionar, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            /* Using cursor P09GW6 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4576RecLinUsr = P09GW6_A4576RecLinUsr[0] ;
               A811RecLin = P09GW6_A811RecLin[0] ;
               A1273RecLinPro = P09GW6_A1273RecLinPro[0] ;
               AV72Pesado = (!(GXutil.strcmp("", A4576RecLinUsr)==0) ? "S" : "N") ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72Pesado, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV73Adicion = "N" ;
            /* Using cursor P09GW7 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1377RecNumAny = P09GW7_A1377RecNumAny[0] ;
               A2808RecLinMAL = P09GW7_A2808RecLinMAL[0] ;
               A719PrdNum = P09GW7_A719PrdNum[0] ;
               AV73Adicion = "S" ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV73Adicion = ((A189BarNumAny>0) ? "S" : AV73Adicion) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73Adicion, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int6 = AV74incidencias ;
            GXv_int3[0] = GXt_int6 ;
            new app.puti016(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_int3) ;
            recetadetinte_cierre_wcexport.this.GXt_int6 = GXv_int3[0] ;
            AV74incidencias = GXt_int6 ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV74incidencias );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2804RecLinMaq );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A213BarSit );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV75BarAgrEst = A120BarAgrEst ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75BarAgrEst, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A218BarTipCol );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1235BarNumCli );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2805RecVolPrd );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A812RecTotKgm)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4866RecFecAlt );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A189BarNumAny );
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
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Seleccionar", "", "Op", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Pesado", "", "P?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Adicion", "", "Ad?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&incidencias", "", "Err", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNHdr", "", "N Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecLinMaq", "", "#", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSit", "", "Situacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAgrEst", "", "A?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSer", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSerDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarTipCol", "", "TC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNomCli", "", "Color Cli.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNumCli", "", "Numero ", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqCod", "", "Código Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecVolPrd", "", "Volumen", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecTotKgm", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecFecAlt", "Fecha", "Alta", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNumAny", "", "Nº Añad.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre_WCColumnsSelector", GXv_char5) ;
      recetadetinte_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Cierre_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte_Cierre_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Cierre_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV112GXV2 = 1 ;
      while ( AV112GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV112GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV34TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV35TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV36TFRecLinMaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFRecLinMaq_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV38TFBarSit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarSit_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV40TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV41TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV42TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV43TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV44TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV45TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV46TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV48TFBarTipCol = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarTipCol_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV50TFBarNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV51TFBarNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV52TFBarNumCli = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFBarNumCli_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV54TFMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV55TFMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV56TFRecVolPrd = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFRecVolPrd_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV58TFRecTotKgm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFRecTotKgm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV60TFRecFecAlt = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV62TFBarNumAny = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFBarNumAny_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV65Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV66Barcod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV67Barcodreo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV68Barcodpar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHACIERRE") == 0 )
         {
            AV69FechaCierre = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECACAB") == 0 )
         {
            AV70RecAcab = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV112GXV2 = (int)(AV112GXV2+1) ;
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
      this.aP0[0] = recetadetinte_cierre_wcexport.this.AV11Filename;
      this.aP1[0] = recetadetinte_cierre_wcexport.this.AV12ErrorMessage;
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
      AV35TFBarNHdr_Sel = "" ;
      AV34TFBarNHdr = "" ;
      AV41TFBarSer_Sel = "" ;
      AV40TFBarSer = "" ;
      AV43TFBarSerDsc_Sel = "" ;
      AV42TFBarSerDsc = "" ;
      AV45TFBarColNom_Sel = "" ;
      AV44TFBarColNom = "" ;
      AV51TFBarNomCli_Sel = "" ;
      AV50TFBarNomCli = "" ;
      AV55TFMaqCod_Sel = "" ;
      AV54TFMaqCod = "" ;
      AV58TFRecTotKgm = DecimalUtil.ZERO ;
      AV59TFRecTotKgm_To = DecimalUtil.ZERO ;
      AV60TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = "" ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = "" ;
      AV82Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = "" ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = "" ;
      AV88Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = "" ;
      AV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = "" ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = "" ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = "" ;
      AV92Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = "" ;
      AV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = "" ;
      AV98Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = "" ;
      AV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = "" ;
      AV102Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = "" ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = DecimalUtil.ZERO ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = DecimalUtil.ZERO ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = "" ;
      lV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = "" ;
      lV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = "" ;
      lV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = "" ;
      lV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = "" ;
      lV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = "" ;
      AV68Barcodpar = "" ;
      A6039RecAcab = "" ;
      AV70RecAcab = "" ;
      AV65Emprcod = "" ;
      P09GW5_A2804RecLinMaq = new short[1] ;
      P09GW5_A396EmprCod = new String[] {""} ;
      P09GW5_A6039RecAcab = new String[] {""} ;
      P09GW5_n6039RecAcab = new boolean[] {false} ;
      P09GW5_A189BarNumAny = new short[1] ;
      P09GW5_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09GW5_n4866RecFecAlt = new boolean[] {false} ;
      P09GW5_A2805RecVolPrd = new int[1] ;
      P09GW5_A602MaqCod = new String[] {""} ;
      P09GW5_A1235BarNumCli = new int[1] ;
      P09GW5_A1234BarNomCli = new String[] {""} ;
      P09GW5_A218BarTipCol = new byte[1] ;
      P09GW5_A136BarColNum = new int[1] ;
      P09GW5_A135BarColNom = new String[] {""} ;
      P09GW5_A1652BarSerDsc = new String[] {""} ;
      P09GW5_A212BarSer = new String[] {""} ;
      P09GW5_A213BarSit = new byte[1] ;
      P09GW5_A13696BarNHdr = new String[] {""} ;
      P09GW5_A120BarAgrEst = new String[] {""} ;
      P09GW5_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GW5_n812RecTotKgm = new boolean[] {false} ;
      P09GW5_A129BarCod = new int[1] ;
      P09GW5_A132BarCodReo = new byte[1] ;
      P09GW5_A130BarCodPar = new String[] {""} ;
      AV71Seleccionar = "" ;
      P09GW6_A396EmprCod = new String[] {""} ;
      P09GW6_A129BarCod = new int[1] ;
      P09GW6_A132BarCodReo = new byte[1] ;
      P09GW6_A130BarCodPar = new String[] {""} ;
      P09GW6_A2804RecLinMaq = new short[1] ;
      P09GW6_A4576RecLinUsr = new String[] {""} ;
      P09GW6_A811RecLin = new short[1] ;
      P09GW6_A1273RecLinPro = new byte[1] ;
      A4576RecLinUsr = "" ;
      AV72Pesado = "" ;
      AV73Adicion = "" ;
      P09GW7_A396EmprCod = new String[] {""} ;
      P09GW7_A129BarCod = new int[1] ;
      P09GW7_A132BarCodReo = new byte[1] ;
      P09GW7_A130BarCodPar = new String[] {""} ;
      P09GW7_A1377RecNumAny = new byte[1] ;
      P09GW7_A2808RecLinMAL = new short[1] ;
      P09GW7_A719PrdNum = new String[] {""} ;
      A719PrdNum = "" ;
      GXv_int3 = new short[1] ;
      AV75BarAgrEst = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre_wcexport__default(),
         new Object[] {
             new Object[] {
            P09GW5_A2804RecLinMaq, P09GW5_A396EmprCod, P09GW5_A6039RecAcab, P09GW5_n6039RecAcab, P09GW5_A189BarNumAny, P09GW5_A4866RecFecAlt, P09GW5_n4866RecFecAlt, P09GW5_A2805RecVolPrd, P09GW5_A602MaqCod, P09GW5_A1235BarNumCli,
            P09GW5_A1234BarNomCli, P09GW5_A218BarTipCol, P09GW5_A136BarColNum, P09GW5_A135BarColNom, P09GW5_A1652BarSerDsc, P09GW5_A212BarSer, P09GW5_A213BarSit, P09GW5_A13696BarNHdr, P09GW5_A120BarAgrEst, P09GW5_A812RecTotKgm,
            P09GW5_n812RecTotKgm, P09GW5_A129BarCod, P09GW5_A132BarCodReo, P09GW5_A130BarCodPar
            }
            , new Object[] {
            P09GW6_A396EmprCod, P09GW6_A129BarCod, P09GW6_A132BarCodReo, P09GW6_A130BarCodPar, P09GW6_A2804RecLinMaq, P09GW6_A4576RecLinUsr, P09GW6_A811RecLin, P09GW6_A1273RecLinPro
            }
            , new Object[] {
            P09GW7_A396EmprCod, P09GW7_A129BarCod, P09GW7_A132BarCodReo, P09GW7_A130BarCodPar, P09GW7_A1377RecNumAny, P09GW7_A2808RecLinMAL, P09GW7_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38TFBarSit ;
   private byte AV39TFBarSit_To ;
   private byte AV48TFBarTipCol ;
   private byte AV49TFBarTipCol_To ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV85Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ;
   private byte AV86Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ;
   private byte AV95Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ;
   private byte AV96Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ;
   private byte AV67Barcodreo ;
   private byte A1273RecLinPro ;
   private byte A1377RecNumAny ;
   private short AV36TFRecLinMaq ;
   private short AV37TFRecLinMaq_To ;
   private short AV62TFBarNumAny ;
   private short AV63TFBarNumAny_To ;
   private short A189BarNumAny ;
   private short A2804RecLinMaq ;
   private short AV83Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ;
   private short AV84Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ;
   private short AV108Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ;
   private short AV109Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ;
   private short AV16OrderedBy ;
   private short A811RecLin ;
   private short A2808RecLinMAL ;
   private short AV74incidencias ;
   private short GXt_int6 ;
   private short GXv_int3[] ;
   private short AV69FechaCierre ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV46TFBarColNum ;
   private int AV47TFBarColNum_To ;
   private int AV52TFBarNumCli ;
   private int AV53TFBarNumCli_To ;
   private int AV56TFRecVolPrd ;
   private int AV57TFRecVolPrd_To ;
   private int AV78GXV1 ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV93Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ;
   private int AV94Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ;
   private int AV99Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ;
   private int AV100Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ;
   private int AV103Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ;
   private int AV104Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ;
   private int AV66Barcod ;
   private int AV112GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV58TFRecTotKgm ;
   private java.math.BigDecimal AV59TFRecTotKgm_To ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV105Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ;
   private java.math.BigDecimal AV106Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ;
   private String AV35TFBarNHdr_Sel ;
   private String AV34TFBarNHdr ;
   private String AV41TFBarSer_Sel ;
   private String AV40TFBarSer ;
   private String AV43TFBarSerDsc_Sel ;
   private String AV42TFBarSerDsc ;
   private String AV45TFBarColNom_Sel ;
   private String AV44TFBarColNom ;
   private String AV51TFBarNomCli_Sel ;
   private String AV50TFBarNomCli ;
   private String AV55TFMaqCod_Sel ;
   private String AV54TFMaqCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A602MaqCod ;
   private String AV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ;
   private String AV82Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ;
   private String AV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ;
   private String AV88Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ;
   private String AV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ;
   private String AV90Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ;
   private String AV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ;
   private String AV92Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ;
   private String AV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ;
   private String AV98Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ;
   private String AV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ;
   private String AV102Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ;
   private String lV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ;
   private String lV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ;
   private String lV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ;
   private String lV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ;
   private String lV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ;
   private String AV68Barcodpar ;
   private String A6039RecAcab ;
   private String AV70RecAcab ;
   private String AV65Emprcod ;
   private String AV71Seleccionar ;
   private String A4576RecLinUsr ;
   private String AV72Pesado ;
   private String AV73Adicion ;
   private String A719PrdNum ;
   private String AV75BarAgrEst ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV60TFRecFecAlt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV107Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean n812RecTotKgm ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ;
   private String lV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P09GW5_A2804RecLinMaq ;
   private String[] P09GW5_A396EmprCod ;
   private String[] P09GW5_A6039RecAcab ;
   private boolean[] P09GW5_n6039RecAcab ;
   private short[] P09GW5_A189BarNumAny ;
   private java.util.Date[] P09GW5_A4866RecFecAlt ;
   private boolean[] P09GW5_n4866RecFecAlt ;
   private int[] P09GW5_A2805RecVolPrd ;
   private String[] P09GW5_A602MaqCod ;
   private int[] P09GW5_A1235BarNumCli ;
   private String[] P09GW5_A1234BarNomCli ;
   private byte[] P09GW5_A218BarTipCol ;
   private int[] P09GW5_A136BarColNum ;
   private String[] P09GW5_A135BarColNom ;
   private String[] P09GW5_A1652BarSerDsc ;
   private String[] P09GW5_A212BarSer ;
   private byte[] P09GW5_A213BarSit ;
   private String[] P09GW5_A13696BarNHdr ;
   private String[] P09GW5_A120BarAgrEst ;
   private java.math.BigDecimal[] P09GW5_A812RecTotKgm ;
   private boolean[] P09GW5_n812RecTotKgm ;
   private int[] P09GW5_A129BarCod ;
   private byte[] P09GW5_A132BarCodReo ;
   private String[] P09GW5_A130BarCodPar ;
   private String[] P09GW6_A396EmprCod ;
   private int[] P09GW6_A129BarCod ;
   private byte[] P09GW6_A132BarCodReo ;
   private String[] P09GW6_A130BarCodPar ;
   private short[] P09GW6_A2804RecLinMaq ;
   private String[] P09GW6_A4576RecLinUsr ;
   private short[] P09GW6_A811RecLin ;
   private byte[] P09GW6_A1273RecLinPro ;
   private String[] P09GW7_A396EmprCod ;
   private int[] P09GW7_A129BarCod ;
   private byte[] P09GW7_A132BarCodReo ;
   private String[] P09GW7_A130BarCodPar ;
   private byte[] P09GW7_A1377RecNumAny ;
   private short[] P09GW7_A2808RecLinMAL ;
   private String[] P09GW7_A719PrdNum ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class recetadetinte_cierre_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GW5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV82Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                          String AV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                          short AV83Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                          short AV84Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                          byte AV85Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                          byte AV86Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                          String AV88Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                          String AV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                          String AV90Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                          String AV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                          String AV92Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                          String AV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                          int AV93Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                          int AV94Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                          byte AV95Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                          byte AV96Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                          String AV98Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                          String AV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                          int AV99Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                          int AV100Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                          String AV102Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                          String AV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                          int AV103Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                          int AV104Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV107Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                          short AV108Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                          short AV109Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV80Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV105Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                          java.math.BigDecimal AV106Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                          int AV66Barcod ,
                                          byte AV67Barcodreo ,
                                          String AV68Barcodpar ,
                                          String A6039RecAcab ,
                                          String AV70RecAcab ,
                                          String AV65Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[54];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSerDsc, T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T2.BarAgrEst, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0)" ;
      scmdbuf += " <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV82Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV107Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! (0==AV108Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( ! (0==AV109Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNumCli" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNumCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNumAny" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNumAny DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09GW5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GW5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GW6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinUsr, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GW7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecNumAny, RecLinMAL, PrdNum FROM TXPLANYAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 11);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((byte[]) buf[22])[0] = rslt.getByte(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
                  stmt.setString(sIdx, (String)parms[54], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[105], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

