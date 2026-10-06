package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadeacabado_cierre_wcexport extends GXProcedure
{
   public recetadeacabado_cierre_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadeacabado_cierre_wcexport.class ), "" );
   }

   public recetadeacabado_cierre_wcexport( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      recetadeacabado_cierre_wcexport.this.aP1 = new String[] {""};
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
      recetadeacabado_cierre_wcexport.this.aP0 = aP0;
      recetadeacabado_cierre_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "RecetadeAcabado_Cierre_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV43TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarNHdr_Sel, GXv_char5) ;
         recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
            recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarNHdr, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV58TFRecLinMaq) && (0==AV59TFRecLinMaq_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV58TFRecLinMaq );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV59TFRecLinMaq_To );
      }
      if ( ! ( (0==AV162TFBarSit) && (0==AV163TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Situacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV162TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV163TFBarSit_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarSer_Sel, GXv_char5) ;
         recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarSer, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFBarSerDsc_Sel, GXv_char5) ;
         recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFBarSerDsc, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarColNom_Sel, GXv_char5) ;
         recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarColNom, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV50TFBarColNum) && (0==AV51TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFBarColNum_To );
      }
      if ( ! ( (0==AV52TFBarTipCol) && (0==AV53TFBarTipCol_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFBarTipCol );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFBarTipCol_To );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFBarNomCli_Sel, GXv_char5) ;
         recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFBarNomCli, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV56TFBarNumCli) && (0==AV57TFBarNumCli_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFBarNumCli );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFBarNumCli_To );
      }
      if ( ! ( (GXutil.strcmp("", AV61TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFMaqCod_Sel, GXv_char5) ;
         recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFMaqCod, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV62TFRecVolPrd) && (0==AV63TFRecVolPrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV62TFRecVolPrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV63TFRecVolPrd_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164TFRecTotKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165TFRecTotKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV164TFRecTotKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV165TFRecTotKgm_To)) );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV166TFRecFecAlt) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Alta", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV166TFRecFecAlt );
      }
      if ( ! ( (0==AV168TFBarNumAny) && (0==AV169TFBarNumAny_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Añad.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV168TFBarNumAny );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recetadeacabado_cierre_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV169TFBarNumAny_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV172GXV1 = 1 ;
      while ( AV172GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV172GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV172GXV1 = (int)(AV172GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV42TFBarNHdr ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV43TFBarNHdr_Sel ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV58TFRecLinMaq ;
      AV177Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV59TFRecLinMaq_To ;
      AV178Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV162TFBarSit ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV163TFBarSit_To ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV44TFBarSer ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV45TFBarSer_Sel ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV46TFBarSerDsc ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV47TFBarSerDsc_Sel ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV48TFBarColNom ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV49TFBarColNom_Sel ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV50TFBarColNum ;
      AV187Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV51TFBarColNum_To ;
      AV188Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV52TFBarTipCol ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV53TFBarTipCol_To ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV54TFBarNomCli ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV55TFBarNomCli_Sel ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV56TFBarNumCli ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV57TFBarNumCli_To ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV60TFMaqCod ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV61TFMaqCod_Sel ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV62TFRecVolPrd ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV63TFRecVolPrd_To ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV164TFRecTotKgm ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV165TFRecTotKgm_To ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV166TFRecFecAlt ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV175Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV176Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV181Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV183Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV185Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV186Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV189Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV195Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV196Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV197Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV200Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV201Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV202Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV156Barcod) ,
                                           Byte.valueOf(AV157Barcodreo) ,
                                           AV158Barcodpar ,
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
                                           AV198Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV199Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           A6039RecAcab ,
                                           AV160RecAcab ,
                                           AV155Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor P09GZ5 */
      pr_default.execute(0, new Object[] {AV155Emprcod, AV198Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV198Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV199Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV199Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV160RecAcab, lV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV175Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV176Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV181Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV183Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV185Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV186Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV189Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV191Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV195Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV196Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV197Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV200Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV201Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV202Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV156Barcod), Byte.valueOf(AV157Barcodreo), AV158Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09GZ5_A396EmprCod[0] ;
         A6039RecAcab = P09GZ5_A6039RecAcab[0] ;
         n6039RecAcab = P09GZ5_n6039RecAcab[0] ;
         A189BarNumAny = P09GZ5_A189BarNumAny[0] ;
         A4866RecFecAlt = P09GZ5_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09GZ5_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09GZ5_A2805RecVolPrd[0] ;
         A602MaqCod = P09GZ5_A602MaqCod[0] ;
         A1235BarNumCli = P09GZ5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GZ5_A1234BarNomCli[0] ;
         A218BarTipCol = P09GZ5_A218BarTipCol[0] ;
         A136BarColNum = P09GZ5_A136BarColNum[0] ;
         A135BarColNom = P09GZ5_A135BarColNom[0] ;
         A1652BarSerDsc = P09GZ5_A1652BarSerDsc[0] ;
         A212BarSer = P09GZ5_A212BarSer[0] ;
         A213BarSit = P09GZ5_A213BarSit[0] ;
         A2804RecLinMaq = P09GZ5_A2804RecLinMaq[0] ;
         A812RecTotKgm = P09GZ5_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GZ5_n812RecTotKgm[0] ;
         A130BarCodPar = P09GZ5_A130BarCodPar[0] ;
         A132BarCodReo = P09GZ5_A132BarCodReo[0] ;
         A129BarCod = P09GZ5_A129BarCod[0] ;
         A189BarNumAny = P09GZ5_A189BarNumAny[0] ;
         A1235BarNumCli = P09GZ5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GZ5_A1234BarNomCli[0] ;
         A218BarTipCol = P09GZ5_A218BarTipCol[0] ;
         A136BarColNum = P09GZ5_A136BarColNum[0] ;
         A135BarColNom = P09GZ5_A135BarColNom[0] ;
         A1652BarSerDsc = P09GZ5_A1652BarSerDsc[0] ;
         A212BarSer = P09GZ5_A212BarSer[0] ;
         A213BarSit = P09GZ5_A213BarSit[0] ;
         A812RecTotKgm = P09GZ5_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GZ5_n812RecTotKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
            AV153Seleccionar = "N" ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV153Seleccionar, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int6 = AV154incidencias ;
            GXv_int3[0] = GXt_int6 ;
            new app.puti016(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_int3) ;
            recetadeacabado_cierre_wcexport.this.GXt_int6 = GXv_int3[0] ;
            AV154incidencias = GXt_int6 ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV154incidencias );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2804RecLinMaq );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A213BarSit );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV161BarAgrEst = "N" ;
            /* Using cursor P09GZ6 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A6034Ac_Metros = P09GZ6_A6034Ac_Metros[0] ;
               n6034Ac_Metros = P09GZ6_n6034Ac_Metros[0] ;
               A6031Ac_Barcod = P09GZ6_A6031Ac_Barcod[0] ;
               A6032Ac_BarReo = P09GZ6_A6032Ac_BarReo[0] ;
               A6033Ac_BarPar = P09GZ6_A6033Ac_BarPar[0] ;
               AV161BarAgrEst = "S" ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV161BarAgrEst, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A218BarTipCol );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1235BarNumCli );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2805RecVolPrd );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A812RecTotKgm)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4866RecFecAlt );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector", GXv_char5) ;
      recetadeacabado_cierre_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV204GXV2 = 1 ;
      while ( AV204GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV204GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV42TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV43TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV58TFRecLinMaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFRecLinMaq_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV162TFBarSit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV163TFBarSit_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV44TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV45TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV46TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV47TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV48TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV49TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV50TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV52TFBarTipCol = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFBarTipCol_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV54TFBarNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV55TFBarNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV56TFBarNumCli = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarNumCli_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV60TFMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV61TFMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV62TFRecVolPrd = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFRecVolPrd_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV164TFRecTotKgm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV165TFRecTotKgm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV166TFRecFecAlt = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV168TFBarNumAny = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV169TFBarNumAny_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV155Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV156Barcod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV157Barcodreo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV158Barcodpar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHACIERRE") == 0 )
         {
            AV159FechaCierre = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECACAB") == 0 )
         {
            AV160RecAcab = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV204GXV2 = (int)(AV204GXV2+1) ;
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
      this.aP0[0] = recetadeacabado_cierre_wcexport.this.AV11Filename;
      this.aP1[0] = recetadeacabado_cierre_wcexport.this.AV12ErrorMessage;
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
      AV43TFBarNHdr_Sel = "" ;
      AV42TFBarNHdr = "" ;
      AV45TFBarSer_Sel = "" ;
      AV44TFBarSer = "" ;
      AV47TFBarSerDsc_Sel = "" ;
      AV46TFBarSerDsc = "" ;
      AV49TFBarColNom_Sel = "" ;
      AV48TFBarColNom = "" ;
      AV55TFBarNomCli_Sel = "" ;
      AV54TFBarNomCli = "" ;
      AV61TFMaqCod_Sel = "" ;
      AV60TFMaqCod = "" ;
      AV164TFRecTotKgm = DecimalUtil.ZERO ;
      AV165TFRecTotKgm_To = DecimalUtil.ZERO ;
      AV166TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = "" ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = "" ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = "" ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = "" ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = "" ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = "" ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = "" ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = "" ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = "" ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = "" ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = "" ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = "" ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = DecimalUtil.ZERO ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = DecimalUtil.ZERO ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = "" ;
      lV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = "" ;
      lV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = "" ;
      lV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = "" ;
      lV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = "" ;
      lV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = "" ;
      AV158Barcodpar = "" ;
      A6039RecAcab = "" ;
      AV160RecAcab = "" ;
      AV155Emprcod = "" ;
      P09GZ5_A396EmprCod = new String[] {""} ;
      P09GZ5_A6039RecAcab = new String[] {""} ;
      P09GZ5_n6039RecAcab = new boolean[] {false} ;
      P09GZ5_A189BarNumAny = new short[1] ;
      P09GZ5_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09GZ5_n4866RecFecAlt = new boolean[] {false} ;
      P09GZ5_A2805RecVolPrd = new int[1] ;
      P09GZ5_A602MaqCod = new String[] {""} ;
      P09GZ5_A1235BarNumCli = new int[1] ;
      P09GZ5_A1234BarNomCli = new String[] {""} ;
      P09GZ5_A218BarTipCol = new byte[1] ;
      P09GZ5_A136BarColNum = new int[1] ;
      P09GZ5_A135BarColNom = new String[] {""} ;
      P09GZ5_A1652BarSerDsc = new String[] {""} ;
      P09GZ5_A212BarSer = new String[] {""} ;
      P09GZ5_A213BarSit = new byte[1] ;
      P09GZ5_A2804RecLinMaq = new short[1] ;
      P09GZ5_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GZ5_n812RecTotKgm = new boolean[] {false} ;
      P09GZ5_A130BarCodPar = new String[] {""} ;
      P09GZ5_A132BarCodReo = new byte[1] ;
      P09GZ5_A129BarCod = new int[1] ;
      AV153Seleccionar = "" ;
      GXv_int3 = new short[1] ;
      AV161BarAgrEst = "" ;
      P09GZ6_A396EmprCod = new String[] {""} ;
      P09GZ6_A129BarCod = new int[1] ;
      P09GZ6_A132BarCodReo = new byte[1] ;
      P09GZ6_A130BarCodPar = new String[] {""} ;
      P09GZ6_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GZ6_n6034Ac_Metros = new boolean[] {false} ;
      P09GZ6_A6031Ac_Barcod = new int[1] ;
      P09GZ6_A6032Ac_BarReo = new byte[1] ;
      P09GZ6_A6033Ac_BarPar = new String[] {""} ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A6033Ac_BarPar = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.recetadeacabado_cierre_wcexport__default(),
         new Object[] {
             new Object[] {
            P09GZ5_A396EmprCod, P09GZ5_A6039RecAcab, P09GZ5_n6039RecAcab, P09GZ5_A189BarNumAny, P09GZ5_A4866RecFecAlt, P09GZ5_n4866RecFecAlt, P09GZ5_A2805RecVolPrd, P09GZ5_A602MaqCod, P09GZ5_A1235BarNumCli, P09GZ5_A1234BarNomCli,
            P09GZ5_A218BarTipCol, P09GZ5_A136BarColNum, P09GZ5_A135BarColNom, P09GZ5_A1652BarSerDsc, P09GZ5_A212BarSer, P09GZ5_A213BarSit, P09GZ5_A2804RecLinMaq, P09GZ5_A812RecTotKgm, P09GZ5_n812RecTotKgm, P09GZ5_A130BarCodPar,
            P09GZ5_A132BarCodReo, P09GZ5_A129BarCod
            }
            , new Object[] {
            P09GZ6_A396EmprCod, P09GZ6_A129BarCod, P09GZ6_A132BarCodReo, P09GZ6_A130BarCodPar, P09GZ6_A6034Ac_Metros, P09GZ6_n6034Ac_Metros, P09GZ6_A6031Ac_Barcod, P09GZ6_A6032Ac_BarReo, P09GZ6_A6033Ac_BarPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV162TFBarSit ;
   private byte AV163TFBarSit_To ;
   private byte AV52TFBarTipCol ;
   private byte AV53TFBarTipCol_To ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV178Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ;
   private byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ;
   private byte AV188Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ;
   private byte AV189Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ;
   private byte AV157Barcodreo ;
   private byte A6032Ac_BarReo ;
   private short AV58TFRecLinMaq ;
   private short AV59TFRecLinMaq_To ;
   private short AV168TFBarNumAny ;
   private short AV169TFBarNumAny_To ;
   private short A2804RecLinMaq ;
   private short A189BarNumAny ;
   private short AV176Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ;
   private short AV177Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ;
   private short AV201Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ;
   private short AV202Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ;
   private short AV16OrderedBy ;
   private short AV154incidencias ;
   private short GXt_int6 ;
   private short GXv_int3[] ;
   private short AV159FechaCierre ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV50TFBarColNum ;
   private int AV51TFBarColNum_To ;
   private int AV56TFBarNumCli ;
   private int AV57TFBarNumCli_To ;
   private int AV62TFRecVolPrd ;
   private int AV63TFRecVolPrd_To ;
   private int AV172GXV1 ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV186Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ;
   private int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ;
   private int AV192Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ;
   private int AV193Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ;
   private int AV196Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ;
   private int AV197Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ;
   private int AV156Barcod ;
   private int A6031Ac_Barcod ;
   private int AV204GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV164TFRecTotKgm ;
   private java.math.BigDecimal AV165TFRecTotKgm_To ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV198Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ;
   private java.math.BigDecimal AV199Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private String AV43TFBarNHdr_Sel ;
   private String AV42TFBarNHdr ;
   private String AV45TFBarSer_Sel ;
   private String AV44TFBarSer ;
   private String AV47TFBarSerDsc_Sel ;
   private String AV46TFBarSerDsc ;
   private String AV49TFBarColNom_Sel ;
   private String AV48TFBarColNom ;
   private String AV55TFBarNomCli_Sel ;
   private String AV54TFBarNomCli ;
   private String AV61TFMaqCod_Sel ;
   private String AV60TFMaqCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A602MaqCod ;
   private String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ;
   private String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ;
   private String AV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ;
   private String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ;
   private String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ;
   private String AV183Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ;
   private String AV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ;
   private String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ;
   private String AV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ;
   private String AV191Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ;
   private String AV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ;
   private String AV195Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ;
   private String lV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ;
   private String lV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ;
   private String lV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ;
   private String lV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ;
   private String lV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ;
   private String AV158Barcodpar ;
   private String A6039RecAcab ;
   private String AV160RecAcab ;
   private String AV155Emprcod ;
   private String AV153Seleccionar ;
   private String AV161BarAgrEst ;
   private String A6033Ac_BarPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV166TFRecFecAlt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV200Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean n812RecTotKgm ;
   private boolean n6034Ac_Metros ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09GZ5_A396EmprCod ;
   private String[] P09GZ5_A6039RecAcab ;
   private boolean[] P09GZ5_n6039RecAcab ;
   private short[] P09GZ5_A189BarNumAny ;
   private java.util.Date[] P09GZ5_A4866RecFecAlt ;
   private boolean[] P09GZ5_n4866RecFecAlt ;
   private int[] P09GZ5_A2805RecVolPrd ;
   private String[] P09GZ5_A602MaqCod ;
   private int[] P09GZ5_A1235BarNumCli ;
   private String[] P09GZ5_A1234BarNomCli ;
   private byte[] P09GZ5_A218BarTipCol ;
   private int[] P09GZ5_A136BarColNum ;
   private String[] P09GZ5_A135BarColNom ;
   private String[] P09GZ5_A1652BarSerDsc ;
   private String[] P09GZ5_A212BarSer ;
   private byte[] P09GZ5_A213BarSit ;
   private short[] P09GZ5_A2804RecLinMaq ;
   private java.math.BigDecimal[] P09GZ5_A812RecTotKgm ;
   private boolean[] P09GZ5_n812RecTotKgm ;
   private String[] P09GZ5_A130BarCodPar ;
   private byte[] P09GZ5_A132BarCodReo ;
   private int[] P09GZ5_A129BarCod ;
   private String[] P09GZ6_A396EmprCod ;
   private int[] P09GZ6_A129BarCod ;
   private byte[] P09GZ6_A132BarCodReo ;
   private String[] P09GZ6_A130BarCodPar ;
   private java.math.BigDecimal[] P09GZ6_A6034Ac_Metros ;
   private boolean[] P09GZ6_n6034Ac_Metros ;
   private int[] P09GZ6_A6031Ac_Barcod ;
   private byte[] P09GZ6_A6032Ac_BarReo ;
   private String[] P09GZ6_A6033Ac_BarPar ;
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

final  class recetadeacabado_cierre_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GZ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                          String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                          short AV176Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                          short AV177Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                          byte AV178Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                          byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                          String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                          String AV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                          String AV183Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                          String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                          String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                          String AV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                          int AV186Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                          int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                          byte AV188Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                          byte AV189Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                          String AV191Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                          String AV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                          int AV192Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                          int AV193Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                          String AV195Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                          String AV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                          int AV196Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                          int AV197Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                          java.util.Date AV200Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                          short AV201Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                          short AV202Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                          int AV156Barcod ,
                                          byte AV157Barcodreo ,
                                          String AV158Barcodpar ,
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
                                          java.math.BigDecimal AV198Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV199Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                          String A6039RecAcab ,
                                          String AV160RecAcab ,
                                          String AV155Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[36];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV175Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV175Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV176Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV177Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV178Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV179Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV180Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV183Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV183Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV185Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV184Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV185Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV186Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV187Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV188Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV189Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV191Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV190Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV191Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV192Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV195Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV194Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV196Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV197Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV200Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV201Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV202Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV156Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV157Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
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
                  return conditional_P09GZ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GZ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GZ6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Metros, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

