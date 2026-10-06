package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayospendientesenvio_wcexport extends GXProcedure
{
   public ensayospendientesenvio_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayospendientesenvio_wcexport.class ), "" );
   }

   public ensayospendientesenvio_wcexport( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ensayospendientesenvio_wcexport.this.aP1 = new String[] {""};
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
      ensayospendientesenvio_wcexport.this.aP0 = aP0;
      ensayospendientesenvio_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "EnsayosPendientesEnvio_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFCliNom_Sel, GXv_char5) ;
         ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFCliNom, GXv_char5) ;
            ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV36TFLb_numero) && (0==AV37TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFLb_numero );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFLb_numero_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFLb_Cartaz_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFLb_Cartaz_Sel, GXv_char5) ;
         ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFLb_Cartaz)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFLb_Cartaz, GXv_char5) ;
            ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFLb_cartazf)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV40TFLb_cartazf );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFLb_ArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFLb_ArtCod_Sel, GXv_char5) ;
         ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFLb_ArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFLb_ArtCod, GXv_char5) ;
            ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFLb_ArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFLb_ArtDsc_Sel, GXv_char5) ;
         ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFLb_ArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFLb_ArtDsc, GXv_char5) ;
            ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFLb_ColNomC_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFLb_ColNomC_Sel, GXv_char5) ;
         ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFLb_ColNomC)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFLb_ColNomC, GXv_char5) ;
            ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFLb_ColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFLb_ColNom_Sel, GXv_char5) ;
         ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFLb_ColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFLb_ColNom, GXv_char5) ;
            ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV50TFLb_ColNum) && (0==AV51TFLb_ColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFLb_ColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFLb_ColNum_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFLb_FechaE)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV52TFLb_FechaE );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV63TFLb_Tipo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFLb_Tipo_Sel, GXv_char5) ;
         ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFLb_Tipo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientesenvio_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFLb_Tipo, GXv_char5) ;
            ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV66GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV18FilterFullText ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV34TFCliNom ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV35TFCliNom_Sel ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV36TFLb_numero ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV37TFLb_numero_To ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV38TFLb_Cartaz ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV39TFLb_Cartaz_Sel ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV40TFLb_cartazf ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV42TFLb_ArtCod ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV43TFLb_ArtCod_Sel ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV44TFLb_ArtDsc ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV45TFLb_ArtDsc_Sel ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV46TFLb_ColNomC ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV47TFLb_ColNomC_Sel ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV48TFLb_ColNom ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV49TFLb_ColNom_Sel ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV50TFLb_ColNum ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV51TFLb_ColNum_To ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV52TFLb_FechaE ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV62TFLb_Tipo ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV63TFLb_Tipo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV71Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV77Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV83Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV84Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV85Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV86Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV88Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV58Clicod) ,
                                           AV59lb_fechaefrom ,
                                           AV60lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) ,
                                           AV57Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PM2 */
      pr_default.execute(0, new Object[] {AV57Emprcod, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV70Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV71Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV72Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV74Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV75Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV77Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV79Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV83Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV84Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV85Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV86Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV88Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV58Clicod), AV59lb_fechaefrom, AV60lb_fechaeto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5569Lb_EstEns = P09PM2_A5569Lb_EstEns[0] ;
         A252CliCod = P09PM2_A252CliCod[0] ;
         A5570Lb_Tipo = P09PM2_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PM2_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PM2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09PM2_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09PM2_A5538Lb_ColNomC[0] ;
         A5534Lb_ArtDsc = P09PM2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09PM2_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09PM2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09PM2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09PM2_A279CliNom[0] ;
         A5532Lb_numero = P09PM2_A5532Lb_numero[0] ;
         A396EmprCod = P09PM2_A396EmprCod[0] ;
         A279CliNom = P09PM2_A279CliNom[0] ;
         GXt_int7 = A14098Lb_Enviado ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int8[0] = A5532Lb_numero ;
         GXv_int9[0] = GXt_int7 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_int9) ;
         ensayospendientesenvio_wcexport.this.A396EmprCod = GXv_char5[0] ;
         ensayospendientesenvio_wcexport.this.A5532Lb_numero = GXv_int8[0] ;
         ensayospendientesenvio_wcexport.this.GXt_int7 = GXv_int9[0] ;
         A14098Lb_Enviado = GXt_int7 ;
         if ( A14098Lb_Enviado == 0 )
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
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5540Lb_Cartaz, GXv_char5) ;
               ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A5594Lb_cartazf );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5533Lb_ArtCod, GXv_char5) ;
               ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5534Lb_ArtDsc, GXv_char5) ;
               ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5538Lb_ColNomC, GXv_char5) ;
               ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5536Lb_ColNom, GXv_char5) ;
               ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5537Lb_ColNum );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A5541Lb_FechaE );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5570Lb_Tipo, GXv_char5) ;
               ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV61Dias = (short)((GXutil.ddiff(Gx_date,A5541Lb_FechaE))) ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV61Dias );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_cartazf", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_ColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_ColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_FechaE", "", "Fecha Entrada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_Tipo", "", "Tipo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&Dias", "", "Dias", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector", GXv_char5) ;
      ensayospendientesenvio_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV90GXV2 = 1 ;
      while ( AV90GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV34TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV35TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV36TFLb_numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFLb_numero_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV38TFLb_Cartaz = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV39TFLb_Cartaz_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV40TFLb_cartazf = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV42TFLb_ArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV43TFLb_ArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV44TFLb_ArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV45TFLb_ArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV46TFLb_ColNomC = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV47TFLb_ColNomC_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV48TFLb_ColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV49TFLb_ColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV50TFLb_ColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFLb_ColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV52TFLb_FechaE = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV62TFLb_Tipo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV63TFLb_Tipo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV57Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV58Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV59lb_fechaefrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV60lb_fechaeto = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV90GXV2 = (int)(AV90GXV2+1) ;
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
      this.aP0[0] = ensayospendientesenvio_wcexport.this.AV11Filename;
      this.aP1[0] = ensayospendientesenvio_wcexport.this.AV12ErrorMessage;
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
      AV35TFCliNom_Sel = "" ;
      AV34TFCliNom = "" ;
      AV39TFLb_Cartaz_Sel = "" ;
      AV38TFLb_Cartaz = "" ;
      AV40TFLb_cartazf = GXutil.nullDate() ;
      AV43TFLb_ArtCod_Sel = "" ;
      AV42TFLb_ArtCod = "" ;
      AV45TFLb_ArtDsc_Sel = "" ;
      AV44TFLb_ArtDsc = "" ;
      AV47TFLb_ColNomC_Sel = "" ;
      AV46TFLb_ColNomC = "" ;
      AV49TFLb_ColNom_Sel = "" ;
      AV48TFLb_ColNom = "" ;
      AV52TFLb_FechaE = GXutil.nullDate() ;
      AV63TFLb_Tipo_Sel = "" ;
      AV62TFLb_Tipo = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5570Lb_Tipo = "" ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = "" ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = "" ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = "" ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = "" ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = "" ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = GXutil.nullDate() ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = "" ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = "" ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = "" ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = "" ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = "" ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = "" ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = "" ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = "" ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = GXutil.nullDate() ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = "" ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = "" ;
      scmdbuf = "" ;
      lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = "" ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = "" ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = "" ;
      lV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = "" ;
      lV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = "" ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = "" ;
      lV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = "" ;
      lV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = "" ;
      AV59lb_fechaefrom = GXutil.nullDate() ;
      AV60lb_fechaeto = GXutil.nullDate() ;
      AV57Emprcod = "" ;
      A396EmprCod = "" ;
      P09PM2_A5569Lb_EstEns = new byte[1] ;
      P09PM2_A252CliCod = new int[1] ;
      P09PM2_A5570Lb_Tipo = new String[] {""} ;
      P09PM2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PM2_A5537Lb_ColNum = new int[1] ;
      P09PM2_A5536Lb_ColNom = new String[] {""} ;
      P09PM2_A5538Lb_ColNomC = new String[] {""} ;
      P09PM2_A5534Lb_ArtDsc = new String[] {""} ;
      P09PM2_A5533Lb_ArtCod = new String[] {""} ;
      P09PM2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PM2_A5540Lb_Cartaz = new String[] {""} ;
      P09PM2_A279CliNom = new String[] {""} ;
      P09PM2_A5532Lb_numero = new int[1] ;
      P09PM2_A396EmprCod = new String[] {""} ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      Gx_date = GXutil.nullDate() ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayospendientesenvio_wcexport__default(),
         new Object[] {
             new Object[] {
            P09PM2_A5569Lb_EstEns, P09PM2_A252CliCod, P09PM2_A5570Lb_Tipo, P09PM2_A5541Lb_FechaE, P09PM2_A5537Lb_ColNum, P09PM2_A5536Lb_ColNom, P09PM2_A5538Lb_ColNomC, P09PM2_A5534Lb_ArtDsc, P09PM2_A5533Lb_ArtCod, P09PM2_A5594Lb_cartazf,
            P09PM2_A5540Lb_Cartaz, P09PM2_A279CliNom, P09PM2_A5532Lb_numero, P09PM2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A5569Lb_EstEns ;
   private byte A14098Lb_Enviado ;
   private byte GXt_int7 ;
   private byte GXv_int9[] ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV61Dias ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV36TFLb_numero ;
   private int AV37TFLb_numero_To ;
   private int AV50TFLb_ColNum ;
   private int AV51TFLb_ColNum_To ;
   private int AV66GXV1 ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int AV71Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ;
   private int AV72Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ;
   private int AV84Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ;
   private int AV85Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ;
   private int AV58Clicod ;
   private int A252CliCod ;
   private int GXv_int8[] ;
   private int AV90GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV35TFCliNom_Sel ;
   private String AV34TFCliNom ;
   private String AV39TFLb_Cartaz_Sel ;
   private String AV38TFLb_Cartaz ;
   private String AV43TFLb_ArtCod_Sel ;
   private String AV42TFLb_ArtCod ;
   private String AV45TFLb_ArtDsc_Sel ;
   private String AV44TFLb_ArtDsc ;
   private String AV47TFLb_ColNomC_Sel ;
   private String AV46TFLb_ColNomC ;
   private String AV49TFLb_ColNom_Sel ;
   private String AV48TFLb_ColNom ;
   private String AV63TFLb_Tipo_Sel ;
   private String AV62TFLb_Tipo ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5570Lb_Tipo ;
   private String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ;
   private String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ;
   private String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ;
   private String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ;
   private String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ;
   private String AV77Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ;
   private String AV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ;
   private String AV79Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ;
   private String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ;
   private String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ;
   private String AV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ;
   private String AV83Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ;
   private String AV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ;
   private String AV88Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ;
   private String scmdbuf ;
   private String lV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ;
   private String lV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ;
   private String lV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ;
   private String lV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ;
   private String lV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ;
   private String lV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ;
   private String lV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ;
   private String AV57Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV40TFLb_cartazf ;
   private java.util.Date AV52TFLb_FechaE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV75Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ;
   private java.util.Date AV86Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ;
   private java.util.Date AV59lb_fechaefrom ;
   private java.util.Date AV60lb_fechaeto ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ;
   private String lV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09PM2_A5569Lb_EstEns ;
   private int[] P09PM2_A252CliCod ;
   private String[] P09PM2_A5570Lb_Tipo ;
   private java.util.Date[] P09PM2_A5541Lb_FechaE ;
   private int[] P09PM2_A5537Lb_ColNum ;
   private String[] P09PM2_A5536Lb_ColNom ;
   private String[] P09PM2_A5538Lb_ColNomC ;
   private String[] P09PM2_A5534Lb_ArtDsc ;
   private String[] P09PM2_A5533Lb_ArtCod ;
   private java.util.Date[] P09PM2_A5594Lb_cartazf ;
   private String[] P09PM2_A5540Lb_Cartaz ;
   private String[] P09PM2_A279CliNom ;
   private int[] P09PM2_A5532Lb_numero ;
   private String[] P09PM2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class ensayospendientesenvio_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV71Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV72Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV75Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV77Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV79Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV83Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV84Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV85Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV86Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV88Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV58Clicod ,
                                          java.util.Date AV59lb_fechaefrom ,
                                          java.util.Date AV60lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado ,
                                          String AV57Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[33];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV84Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV58Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo DESC" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P09PM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
      }
   }

}

