package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayospendientes_wcexport extends GXProcedure
{
   public ensayospendientes_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayospendientes_wcexport.class ), "" );
   }

   public ensayospendientes_wcexport( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ensayospendientes_wcexport.this.aP1 = new String[] {""};
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
      ensayospendientes_wcexport.this.aP0 = aP0;
      ensayospendientes_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV62WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV62WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV8CellRow = 1 ;
      AV23FirstColumn = 1 ;
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
      AV34Random = (int)(GXutil.random( )*10000) ;
      AV21Filename = "./PrivateTempStorage/" + "EnsayosPendientes_WCExport-" + GXutil.trim( GXutil.str( AV34Random, 8, 0)) + ".xlsx" ;
      AV20ExcelDocument.Open(AV21Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV20ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV20ExcelDocument ;
      GXv_int3[0] = (short)(AV8CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV20ExcelDocument = GXv_exceldoc2[0] ;
      ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV22FilterFullText, GXv_char5) ;
      ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV36TFCliCod) && (0==AV37TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setNumber( AV36TFCliCod );
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV23FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+3, 1, 1).setNumber( AV37TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFCliNom_Sel, GXv_char5) ;
         ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV20ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV20ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFCliNom, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFLb_Cartaz_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFLb_Cartaz_Sel, GXv_char5) ;
         ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFLb_Cartaz)==0) ) )
         {
            GXv_exceldoc2[0] = AV20ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV20ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFLb_Cartaz, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFLb_cartazf)) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV46TFLb_cartazf );
         AV20ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFLb_FechaE)) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Entrada", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV54TFLb_FechaE );
         AV20ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFLb_ArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFLb_ArtCod_Sel, GXv_char5) ;
         ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFLb_ArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV20ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV20ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFLb_ArtCod, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFLb_ArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFLb_ArtDsc_Sel, GXv_char5) ;
         ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFLb_ArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV20ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV20ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFLb_ArtDsc, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFLb_ColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFLb_ColNom_Sel, GXv_char5) ;
         ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFLb_ColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV20ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV20ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFLb_ColNom, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV52TFLb_ColNum) && (0==AV53TFLb_ColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setNumber( AV52TFLb_ColNum );
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV23FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+3, 1, 1).setNumber( AV53TFLb_ColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFLb_ColNomC_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFLb_ColNomC_Sel, GXv_char5) ;
         ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFLb_ColNomC)==0) ) )
         {
            GXv_exceldoc2[0] = AV20ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV20ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFLb_ColNomC, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV56TFLb_numero) && (0==AV57TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Nº Ensayo", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setNumber( AV56TFLb_numero );
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV23FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+3, 1, 1).setNumber( AV57TFLb_numero_To );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFLb_Tipo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV20ExcelDocument ;
         GXv_int3[0] = (short)(AV8CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV20ExcelDocument = GXv_exceldoc2[0] ;
         ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFLb_Tipo_Sel, GXv_char5) ;
         ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFLb_Tipo)==0) ) )
         {
            GXv_exceldoc2[0] = AV20ExcelDocument ;
            GXv_int3[0] = (short)(AV8CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV23FirstColumn), httpContext.getMessage( "Tipo", "")) ;
            AV20ExcelDocument = GXv_exceldoc2[0] ;
            ensayospendientes_wcexport.this.AV8CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFLb_Tipo, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, AV23FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV8CellRow = (int)(AV8CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV61VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV35Session.getValue("GestionLaboratorio.EnsayosPendientes_WCColumnsSelector"), "") != 0 )
      {
         AV14ColumnsSelectorXML = AV35Session.getValue("GestionLaboratorio.EnsayosPendientes_WCColumnsSelector") ;
         AV11ColumnsSelector.fromxml(AV14ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV12ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV67GXV1));
         if ( AV12ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV12ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV12ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV12ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setColor( 11 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV22FilterFullText ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV36TFCliCod ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV37TFCliCod_To ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV38TFCliNom ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV39TFCliNom_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV44TFLb_Cartaz ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV45TFLb_Cartaz_Sel ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV46TFLb_cartazf ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV54TFLb_FechaE ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV40TFLb_ArtCod ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV41TFLb_ArtCod_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV42TFLb_ArtDsc ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV43TFLb_ArtDsc_Sel ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV48TFLb_ColNom ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV49TFLb_ColNom_Sel ;
      AV84Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV52TFLb_ColNum ;
      AV85Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV53TFLb_ColNum_To ;
      AV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV50TFLb_ColNomC ;
      AV87Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV51TFLb_ColNomC_Sel ;
      AV88Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV56TFLb_numero ;
      AV89Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV57TFLb_numero_To ;
      AV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV58TFLb_Tipo ;
      AV91Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV59TFLb_Tipo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV70Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV76Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV77Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV81Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV83Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV84Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV85Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV87Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV88Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV89Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV91Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV9Clicod) ,
                                           AV29Lb_FechaEfrom ,
                                           AV30Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Short.valueOf(AV32OrderedBy) ,
                                           Boolean.valueOf(AV33OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV18Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O72 */
      pr_default.execute(0, new Object[] {AV18Emprcod, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV70Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV71Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV73Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV75Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV76Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV77Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV79Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV81Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV83Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV84Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV85Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV87Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV88Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV89Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV91Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV9Clicod), AV29Lb_FechaEfrom, AV30Lb_FechaEto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P09O72_A5532Lb_numero[0] ;
         A396EmprCod = P09O72_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O72_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09O72_A5570Lb_Tipo[0] ;
         A5538Lb_ColNomC = P09O72_A5538Lb_ColNomC[0] ;
         A5537Lb_ColNum = P09O72_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09O72_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09O72_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09O72_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09O72_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O72_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09O72_A5540Lb_Cartaz[0] ;
         A279CliNom = P09O72_A279CliNom[0] ;
         A252CliCod = P09O72_A252CliCod[0] ;
         A279CliNom = P09O72_A279CliNom[0] ;
         AV8CellRow = (int)(AV8CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV61VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5540Lb_Cartaz, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5594Lb_cartazf );
            AV20ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5541Lb_FechaE );
            AV20ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5533Lb_ArtCod, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5534Lb_ArtDsc, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5536Lb_ColNom, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setNumber( A5537Lb_ColNum );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5538Lb_ColNomC, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5570Lb_Tipo, GXv_char5) ;
            ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV63N_opc = (short)(0) ;
            /* Optimized group. */
            /* Using cursor P09O73 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            cV63N_opc = P09O73_AV63N_opc[0] ;
            pr_default.close(1);
            AV63N_opc = (short)(AV63N_opc+cV63N_opc*1) ;
            /* End optimized group. */
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setNumber( AV63N_opc );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV64Dias = (short)(GXutil.ddiff(Gx_date,A5541Lb_FechaE)) ;
            AV20ExcelDocument.Cells(AV8CellRow, (int)(AV23FirstColumn+AV61VisibleColumnCount), 1, 1).setNumber( AV64Dias );
            AV61VisibleColumnCount = (long)(AV61VisibleColumnCount+1) ;
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
      AV20ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV20ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV20ExcelDocument.getErrCode() != 0 )
      {
         AV21Filename = "" ;
         AV19ErrorMessage = AV20ExcelDocument.getErrDescription() ;
         AV20ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV11ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_cartazf", "Fecha", "Coleccion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNom", "", "Color", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNum", "", "Numero", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numero", "", "Nº Ensayo", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Tipo", "", "Tipo", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&N_opc", "", "#", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Dias", "", "Dias", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV60UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnsayosPendientes_WCColumnsSelector", GXv_char5) ;
      ensayospendientes_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV60UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV60UserCustomValue)==0) ) )
      {
         AV13ColumnsSelectorAux.fromxml(AV60UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV13ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV13ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("GestionLaboratorio.EnsayosPendientes_WCGridState"), "") == 0 )
      {
         AV24GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EnsayosPendientes_WCGridState"), null, null);
      }
      else
      {
         AV24GridState.fromxml(AV35Session.getValue("GestionLaboratorio.EnsayosPendientes_WCGridState"), null, null);
      }
      AV32OrderedBy = AV24GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV33OrderedDsc = AV24GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV94GXV2 = 1 ;
      while ( AV94GXV2 <= AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV25GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV2));
         if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV22FilterFullText = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCliCod_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV38TFCliNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV39TFCliNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV44TFLb_Cartaz = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV45TFLb_Cartaz_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV46TFLb_cartazf = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV54TFLb_FechaE = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV40TFLb_ArtCod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV41TFLb_ArtCod_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV42TFLb_ArtDsc = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV43TFLb_ArtDsc_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV48TFLb_ColNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV49TFLb_ColNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV52TFLb_ColNum = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFLb_ColNum_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV50TFLb_ColNomC = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV51TFLb_ColNomC_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV56TFLb_numero = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFLb_numero_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV58TFLb_Tipo = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV59TFLb_Tipo_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV18Emprcod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV9Clicod = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV29Lb_FechaEfrom = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV30Lb_FechaEto = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV94GXV2 = (int)(AV94GXV2+1) ;
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
      this.aP0[0] = ensayospendientes_wcexport.this.AV21Filename;
      this.aP1[0] = ensayospendientes_wcexport.this.AV19ErrorMessage;
      CloseOpenCursors();
      AV20ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Filename = "" ;
      AV19ErrorMessage = "" ;
      AV62WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV22FilterFullText = "" ;
      AV39TFCliNom_Sel = "" ;
      AV38TFCliNom = "" ;
      AV45TFLb_Cartaz_Sel = "" ;
      AV44TFLb_Cartaz = "" ;
      AV46TFLb_cartazf = GXutil.nullDate() ;
      AV54TFLb_FechaE = GXutil.nullDate() ;
      AV41TFLb_ArtCod_Sel = "" ;
      AV40TFLb_ArtCod = "" ;
      AV43TFLb_ArtDsc_Sel = "" ;
      AV42TFLb_ArtDsc = "" ;
      AV49TFLb_ColNom_Sel = "" ;
      AV48TFLb_ColNom = "" ;
      AV51TFLb_ColNomC_Sel = "" ;
      AV50TFLb_ColNomC = "" ;
      AV59TFLb_Tipo_Sel = "" ;
      AV58TFLb_Tipo = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV35Session = httpContext.getWebSession();
      AV14ColumnsSelectorXML = "" ;
      AV11ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV12ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5570Lb_Tipo = "" ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = "" ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = "" ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = "" ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = "" ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = "" ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = GXutil.nullDate() ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = GXutil.nullDate() ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = "" ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = "" ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = "" ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = "" ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = "" ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = "" ;
      AV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = "" ;
      AV87Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = "" ;
      AV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = "" ;
      AV91Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = "" ;
      scmdbuf = "" ;
      lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = "" ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = "" ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = "" ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = "" ;
      lV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = "" ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = "" ;
      lV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = "" ;
      lV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = "" ;
      AV29Lb_FechaEfrom = GXutil.nullDate() ;
      AV30Lb_FechaEto = GXutil.nullDate() ;
      AV18Emprcod = "" ;
      A396EmprCod = "" ;
      P09O72_A5532Lb_numero = new int[1] ;
      P09O72_A396EmprCod = new String[] {""} ;
      P09O72_A5569Lb_EstEns = new byte[1] ;
      P09O72_A5570Lb_Tipo = new String[] {""} ;
      P09O72_A5538Lb_ColNomC = new String[] {""} ;
      P09O72_A5537Lb_ColNum = new int[1] ;
      P09O72_A5536Lb_ColNom = new String[] {""} ;
      P09O72_A5534Lb_ArtDsc = new String[] {""} ;
      P09O72_A5533Lb_ArtCod = new String[] {""} ;
      P09O72_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O72_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O72_A5540Lb_Cartaz = new String[] {""} ;
      P09O72_A279CliNom = new String[] {""} ;
      P09O72_A252CliCod = new int[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      P09O73_AV63N_opc = new short[1] ;
      Gx_date = GXutil.nullDate() ;
      AV60UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV13ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV24GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayospendientes_wcexport__default(),
         new Object[] {
             new Object[] {
            P09O72_A5532Lb_numero, P09O72_A396EmprCod, P09O72_A5569Lb_EstEns, P09O72_A5570Lb_Tipo, P09O72_A5538Lb_ColNomC, P09O72_A5537Lb_ColNum, P09O72_A5536Lb_ColNom, P09O72_A5534Lb_ArtDsc, P09O72_A5533Lb_ArtCod, P09O72_A5541Lb_FechaE,
            P09O72_A5594Lb_cartazf, P09O72_A5540Lb_Cartaz, P09O72_A279CliNom, P09O72_A252CliCod
            }
            , new Object[] {
            P09O73_AV63N_opc
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A5569Lb_EstEns ;
   private short GXv_int3[] ;
   private short AV32OrderedBy ;
   private short AV63N_opc ;
   private short cV63N_opc ;
   private short AV64Dias ;
   private short Gx_err ;
   private int AV8CellRow ;
   private int AV23FirstColumn ;
   private int AV34Random ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int AV52TFLb_ColNum ;
   private int AV53TFLb_ColNum_To ;
   private int AV56TFLb_numero ;
   private int AV57TFLb_numero_To ;
   private int AV67GXV1 ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int AV70Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ;
   private int AV71Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ;
   private int AV84Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ;
   private int AV85Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ;
   private int AV88Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ;
   private int AV89Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ;
   private int AV9Clicod ;
   private int AV94GXV2 ;
   private long AV61VisibleColumnCount ;
   private String AV39TFCliNom_Sel ;
   private String AV38TFCliNom ;
   private String AV45TFLb_Cartaz_Sel ;
   private String AV44TFLb_Cartaz ;
   private String AV41TFLb_ArtCod_Sel ;
   private String AV40TFLb_ArtCod ;
   private String AV43TFLb_ArtDsc_Sel ;
   private String AV42TFLb_ArtDsc ;
   private String AV49TFLb_ColNom_Sel ;
   private String AV48TFLb_ColNom ;
   private String AV51TFLb_ColNomC_Sel ;
   private String AV50TFLb_ColNomC ;
   private String AV59TFLb_Tipo_Sel ;
   private String AV58TFLb_Tipo ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5570Lb_Tipo ;
   private String AV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ;
   private String AV73Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ;
   private String AV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ;
   private String AV75Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ;
   private String AV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ;
   private String AV79Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ;
   private String AV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ;
   private String AV81Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ;
   private String AV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ;
   private String AV83Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ;
   private String AV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ;
   private String AV87Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ;
   private String AV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ;
   private String AV91Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ;
   private String scmdbuf ;
   private String lV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ;
   private String lV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ;
   private String lV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ;
   private String lV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ;
   private String lV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ;
   private String lV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ;
   private String lV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ;
   private String AV18Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV46TFLb_cartazf ;
   private java.util.Date AV54TFLb_FechaE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV76Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ;
   private java.util.Date AV77Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ;
   private java.util.Date AV29Lb_FechaEfrom ;
   private java.util.Date AV30Lb_FechaEto ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean AV33OrderedDsc ;
   private String AV14ColumnsSelectorXML ;
   private String AV60UserCustomValue ;
   private String AV21Filename ;
   private String AV19ErrorMessage ;
   private String AV22FilterFullText ;
   private String AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ;
   private String lV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09O72_A5532Lb_numero ;
   private String[] P09O72_A396EmprCod ;
   private byte[] P09O72_A5569Lb_EstEns ;
   private String[] P09O72_A5570Lb_Tipo ;
   private String[] P09O72_A5538Lb_ColNomC ;
   private int[] P09O72_A5537Lb_ColNum ;
   private String[] P09O72_A5536Lb_ColNom ;
   private String[] P09O72_A5534Lb_ArtDsc ;
   private String[] P09O72_A5533Lb_ArtCod ;
   private java.util.Date[] P09O72_A5541Lb_FechaE ;
   private java.util.Date[] P09O72_A5594Lb_cartazf ;
   private String[] P09O72_A5540Lb_Cartaz ;
   private String[] P09O72_A279CliNom ;
   private int[] P09O72_A252CliCod ;
   private short[] P09O73_AV63N_opc ;
   private com.genexus.gxoffice.ExcelDoc AV20ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV13ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV12ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV24GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV25GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV62WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class ensayospendientes_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09O72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV70Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV71Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV75Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV76Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV77Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV81Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV83Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV84Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV85Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV87Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV88Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV89Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV91Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV9Clicod ,
                                          java.util.Date AV29Lb_FechaEfrom ,
                                          java.util.Date AV30Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          short AV32OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          String AV18Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[36];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_cartazf, T1.Lb_Cartaz," ;
      scmdbuf += " T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV84Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV88Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV89Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV9Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV32OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV32OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf DESC" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo DESC" ;
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
                  return conditional_P09O72(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09O72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O73", "SELECT COUNT(*) FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

