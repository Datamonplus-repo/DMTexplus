package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultaalmacentejidoencrudoexport extends GXProcedure
{
   public wcconsultaalmacentejidoencrudoexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultaalmacentejidoencrudoexport.class ), "" );
   }

   public wcconsultaalmacentejidoencrudoexport( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcconsultaalmacentejidoencrudoexport.this.aP1 = new String[] {""};
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
      wcconsultaalmacentejidoencrudoexport.this.aP0 = aP0;
      wcconsultaalmacentejidoencrudoexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCConsultaAlmacenTejidoencrudoExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV17FilterFullText, GXv_char5) ;
      wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFAlbRecCod) && (0==AV35TFAlbRecCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFAlbRecCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFAlbRecCod_To );
      }
      if ( ! ( ( AV83TFAlbRReo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rec?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV36i = 1 ;
         AV102GXV1 = 1 ;
         while ( AV102GXV1 <= AV83TFAlbRReo_Sels.size() )
         {
            AV84TFAlbRReo_Sel = (String)AV83TFAlbRReo_Sels.elementAt(-1+AV102GXV1) ;
            if ( AV36i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV84TFAlbRReo_Sel), httpContext.getMessage( "NO", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "NO", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV84TFAlbRReo_Sel), httpContext.getMessage( "SI", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "SI", "") );
            }
            AV36i = (long)(AV36i+1) ;
            AV102GXV1 = (int)(AV102GXV1+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFAlbRFen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV38TFAlbRFen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV40TFCliCod) && (0==AV41TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFCliNom_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFCliNom, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Referencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFAlbRef_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFAlbRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Referencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFAlbRef, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFAlbRefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFAlbRefDsc_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFAlbRefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFAlbRefDsc, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFAlbRDisCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disp. Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFAlbRDisCli_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFAlbRDisCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disp. Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFAlbRDisCli, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFAlbRTartD_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFAlbRTartD_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFAlbRTartD)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFAlbRTartD, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFAlbRLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFAlbRLote_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFAlbRLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFAlbRLote, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFAlbRLoc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFAlbRLoc_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFAlbRLoc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFAlbRLoc, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV56TFAlbRPieEnt) && (0==AV57TFAlbRPieEnt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entradas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFAlbRPieEnt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFAlbRPieEnt_To );
      }
      if ( ! ( (0==AV58TFAlbRPieUti) && (0==AV59TFAlbRPieUti_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Utilizadas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV58TFAlbRPieUti );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV59TFAlbRPieUti_To );
      }
      if ( ! ( (0==AV60TFAlbRPieDis) && (0==AV61TFAlbRPieDis_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disponibles", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFAlbRPieDis );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFAlbRPieDis_To );
      }
      if ( ! ( ( AV63TFAlbRUni_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV36i = 1 ;
         AV103GXV2 = 1 ;
         while ( AV103GXV2 <= AV63TFAlbRUni_Sels.size() )
         {
            AV64TFAlbRUni_Sel = (String)AV63TFAlbRUni_Sels.elementAt(-1+AV103GXV2) ;
            if ( AV36i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV64TFAlbRUni_Sel), httpContext.getMessage( "K", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "K", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV64TFAlbRUni_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "M", "") );
            }
            AV36i = (long)(AV36i+1) ;
            AV103GXV2 = (int)(AV103GXV2+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbRUniEnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entradas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFAlbRUniEnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFAlbRUniEnt_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFAlbRUniUti)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFAlbRUniUti_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Utilizadas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFAlbRUniUti)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TFAlbRUniUti_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFAlbRUniDis)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFAlbRUniDis_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disponibles", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69TFAlbRUniDis)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TFAlbRUniDis_To)) );
      }
      if ( ! ( ( AV80TFAlbREst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         AV36i = 1 ;
         AV104GXV3 = 1 ;
         while ( AV104GXV3 <= AV80TFAlbREst_Sels.size() )
         {
            AV81TFAlbREst_Sel = ((Number) AV80TFAlbREst_Sels.elementAt(-1+AV104GXV3)).byteValue() ;
            if ( AV36i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV81TFAlbREst_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Abierta", "") );
            }
            else if ( AV81TFAlbREst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Cerrada", "") );
            }
            AV36i = (long)(AV36i+1) ;
            AV104GXV3 = (int)(AV104GXV3+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV88TFProceNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Procedencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV88TFProceNom_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV87TFProceNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Procedencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV87TFProceNom, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV90TFComposicion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Composicion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFComposicion_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV89TFComposicion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Composicion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFComposicion, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV97TFTipEntNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV97TFTipEntNom_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV96TFTipEntNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Entrada", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96TFTipEntNom, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV99TFAlbRDes_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Destino", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99TFAlbRDes_Sel, GXv_char5) ;
         wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV98TFAlbRDes)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Destino", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultaalmacentejidoencrudoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV98TFAlbRDes, GXv_char5) ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV18Session.getValue("WCConsultaAlmacenTejidoencrudoColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV18Session.getValue("WCConsultaAlmacenTejidoencrudoColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV105GXV4 = 1 ;
      while ( AV105GXV4 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV105GXV4));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV105GXV4 = (int)(AV105GXV4+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV17FilterFullText ;
      AV108Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV34TFAlbRecCod ;
      AV109Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV35TFAlbRecCod_To ;
      AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV83TFAlbRReo_Sels ;
      AV111Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV38TFAlbRFen ;
      AV112Wcconsultaalmacentejidoencrudods_6_tfclicod = AV40TFCliCod ;
      AV113Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV41TFCliCod_To ;
      AV114Wcconsultaalmacentejidoencrudods_8_tfclinom = AV42TFCliNom ;
      AV115Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV43TFCliNom_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_10_tfalbref = AV44TFAlbRef ;
      AV117Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV46TFAlbRefDsc ;
      AV119Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV47TFAlbRefDsc_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV48TFAlbRDisCli ;
      AV121Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV49TFAlbRDisCli_Sel ;
      AV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV50TFAlbRTartD ;
      AV123Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV51TFAlbRTartD_Sel ;
      AV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV52TFAlbRLote ;
      AV125Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV53TFAlbRLote_Sel ;
      AV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV54TFAlbRLoc ;
      AV127Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV55TFAlbRLoc_Sel ;
      AV128Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV129Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV130Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV131Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV132Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV133Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV135Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV65TFAlbRUniEnt ;
      AV136Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV66TFAlbRUniEnt_To ;
      AV137Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV67TFAlbRUniUti ;
      AV138Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV68TFAlbRUniUti_To ;
      AV139Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV69TFAlbRUniDis ;
      AV140Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV70TFAlbRUniDis_To ;
      AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV80TFAlbREst_Sels ;
      AV142Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV87TFProceNom ;
      AV143Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV88TFProceNom_Sel ;
      AV144Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV89TFComposicion ;
      AV145Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV90TFComposicion_Sel ;
      AV146Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV96TFTipEntNom ;
      AV147Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV97TFTipEntNom_Sel ;
      AV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV98TFAlbRDes ;
      AV149Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV99TFAlbRDes_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV108Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV109Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV111Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV112Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV113Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV115Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV114Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV117Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV116Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV119Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV121Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV123Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV125Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV127Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV129Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV130Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV131Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV132Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV133Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV135Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV136Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV137Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV138Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV139Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV140Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV143Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV142Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV147Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV146Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV149Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           Short.valueOf(AV37OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV145Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV144Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV76AlbRef ,
                                           AV93albref_to ,
                                           AV72Albrfen ,
                                           AV73Albrfen_to ,
                                           Integer.valueOf(AV74Clicod) ,
                                           Integer.valueOf(AV75Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV85Procecod) ,
                                           Short.valueOf(AV86ProceCod_to) ,
                                           AV77AlbRReo ,
                                           Byte.valueOf(AV78AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV94TipEntCod) ,
                                           AV95AlbRUni ,
                                           AV71Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV114Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV114Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV116Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV116Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV142Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV142Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV146Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV146Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZQ2 */
      pr_default.execute(0, new Object[] {AV71Emprcod, AV76AlbRef, AV93albref_to, AV72Albrfen, AV73Albrfen_to, Integer.valueOf(AV74Clicod), Integer.valueOf(AV75Clicod_to), Short.valueOf(AV85Procecod), Short.valueOf(AV86ProceCod_to), Byte.valueOf(AV78AlbREst), Byte.valueOf(AV78AlbREst), Short.valueOf(AV94TipEntCod), Short.valueOf(AV94TipEntCod), AV95AlbRUni, Integer.valueOf(AV108Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV109Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV111Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV112Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV113Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV114Wcconsultaalmacentejidoencrudods_8_tfclinom, AV115Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV116Wcconsultaalmacentejidoencrudods_10_tfalbref, AV117Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV119Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV121Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV123Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV125Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV127Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV129Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV130Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV131Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV132Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV133Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV135Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV136Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV137Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV138Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV139Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV140Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV142Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV143Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV146Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV147Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV149Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6263AlbRTartC = P08ZQ2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZQ2_n6263AlbRTartC[0] ;
         A1211TipEntCod = P08ZQ2_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZQ2_n1211TipEntCod[0] ;
         A970ProceCod = P08ZQ2_A970ProceCod[0] ;
         n970ProceCod = P08ZQ2_n970ProceCod[0] ;
         A1291AlbRDes = P08ZQ2_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZQ2_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZQ2_n1212TipEntNom[0] ;
         A971ProceNom = P08ZQ2_A971ProceNom[0] ;
         n971ProceNom = P08ZQ2_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZQ2_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZQ2_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZQ2_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZQ2_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZQ2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZQ2_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZQ2_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZQ2_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZQ2_A279CliNom[0] ;
         A49AlbRFen = P08ZQ2_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZQ2_A44AlbRecCod[0] ;
         A47AlbREst = P08ZQ2_A47AlbREst[0] ;
         A56AlbRUni = P08ZQ2_A56AlbRUni[0] ;
         A55AlbRReo = P08ZQ2_A55AlbRReo[0] ;
         A46AlbREnt = P08ZQ2_A46AlbREnt[0] ;
         A5806AlbREnt2 = P08ZQ2_A5806AlbREnt2[0] ;
         A58AlbRUniEnt = P08ZQ2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZQ2_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZQ2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZQ2_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZQ2_A45AlbRef[0] ;
         A252CliCod = P08ZQ2_A252CliCod[0] ;
         A396EmprCod = P08ZQ2_A396EmprCod[0] ;
         A279CliNom = P08ZQ2_A279CliNom[0] ;
         A6264AlbRTartD = P08ZQ2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZQ2_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZQ2_A971ProceNom[0] ;
         n971ProceNom = P08ZQ2_n971ProceNom[0] ;
         A1212TipEntNom = P08ZQ2_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZQ2_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV77AlbRReo) == 0 ) || ( GXutil.strcmp(AV77AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char4 = A13981Composicio ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int7[0] = A252CliCod ;
            GXv_char8[0] = A45AlbRef ;
            GXv_char9[0] = GXt_char4 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_char8, GXv_char9) ;
            wcconsultaalmacentejidoencrudoexport.this.A396EmprCod = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudoexport.this.A252CliCod = GXv_int7[0] ;
            wcconsultaalmacentejidoencrudoexport.this.A45AlbRef = GXv_char8[0] ;
            wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
            A13981Composicio = GXt_char4 ;
            if ( (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV145Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV144Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV144Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV145Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV145Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
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
                        pr_default.close(0);
                        returnInSub = true;
                        if (true) return;
                     }
                     AV31VisibleColumnCount = 0 ;
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A44AlbRecCod );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
                        if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), httpContext.getMessage( "NO", "")) == 0 )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "NO", "") );
                        }
                        else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), httpContext.getMessage( "SI", "")) == 0 )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "SI", "") );
                        }
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_dtime6 = GXutil.resetTime( A49AlbRFen );
                        AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV22AlbREnt2 = ((GXutil.strcmp("", A5806AlbREnt2)==0) ? A46AlbREnt : A5806AlbREnt2) ;
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV22AlbREnt2, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3613AlbRefDsc, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3359AlbRDisCli, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6264AlbRTartD, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6463AlbRLote, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A50AlbRLoc, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A52AlbRPieEnt );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A54AlbRPieUti );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A51AlbRPieDis );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
                        if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "K", "")) == 0 )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "K", "") );
                        }
                        else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "M", "")) == 0 )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "M", "") );
                        }
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A58AlbRUniEnt)) );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A60AlbRUniUti)) );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A57AlbRUniDis)) );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
                        if ( A47AlbREst == 0 )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Abierta", "") );
                        }
                        else if ( A47AlbREst == 1 )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Cerrada", "") );
                        }
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A971ProceNom, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13981Composicio, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1212TipEntNom, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char9[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1291AlbRDes, GXv_char9) ;
                        wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
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
                        pr_default.close(0);
                        returnInSub = true;
                        if (true) return;
                     }
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
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRReo", "", "Rec?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRFen", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&AlbREnt2", "", "Nº Documento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCod", "", "Codigo", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRef", "", "Referencia", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRefDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRDisCli", "", "Disp. Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRTartD", "", "Tipo Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRLote", "", "Lote", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRLoc", "", "Localizacion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRPieEnt", "Piezas", "Entradas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRPieUti", "Piezas", "Utilizadas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRPieDis", "Piezas", "Disponibles", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRUni", "", "Und", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRUniEnt", "Unidades", "Entradas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRUniUti", "Unidades", "Utilizadas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRUniDis", "Unidades", "Disponibles", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbREst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ProceNom", "", "Procedencia", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Composicion", "", "Composicion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "TipEntNom", "", "Tipo Entrada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRDes", "", "Destino", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char9[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaAlmacenTejidoencrudoColumnsSelector", GXv_char9) ;
      wcconsultaalmacentejidoencrudoexport.this.GXt_char4 = GXv_char9[0] ;
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
      if ( GXutil.strcmp(AV18Session.getValue("WCConsultaAlmacenTejidoencrudoGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaAlmacenTejidoencrudoGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("WCConsultaAlmacenTejidoencrudoGridState"), null, null);
      }
      AV37OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV16OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV150GXV5 = 1 ;
      while ( AV150GXV5 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV150GXV5));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV17FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV34TFAlbRecCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFAlbRecCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV82TFAlbRReo_SelsJson = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV83TFAlbRReo_Sels.fromJSonString(AV82TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV38TFAlbRFen = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV40TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV42TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV43TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV44TFAlbRef = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV45TFAlbRef_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV46TFAlbRefDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV47TFAlbRefDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDISCLI") == 0 )
         {
            AV48TFAlbRDisCli = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDISCLI_SEL") == 0 )
         {
            AV49TFAlbRDisCli_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD") == 0 )
         {
            AV50TFAlbRTartD = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD_SEL") == 0 )
         {
            AV51TFAlbRTartD_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV52TFAlbRLote = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV53TFAlbRLote_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV54TFAlbRLoc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV55TFAlbRLoc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV56TFAlbRPieEnt = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFAlbRPieEnt_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV58TFAlbRPieUti = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFAlbRPieUti_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV60TFAlbRPieDis = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFAlbRPieDis_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV62TFAlbRUni_SelsJson = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV63TFAlbRUni_Sels.fromJSonString(AV62TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV65TFAlbRUniEnt = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFAlbRUniEnt_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV67TFAlbRUniUti = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFAlbRUniUti_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV69TFAlbRUniDis = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV70TFAlbRUniDis_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV79TFAlbREst_SelsJson = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV80TFAlbREst_Sels.fromJSonString(AV79TFAlbREst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV87TFProceNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV88TFProceNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOMPOSICION") == 0 )
         {
            AV89TFComposicion = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOMPOSICION_SEL") == 0 )
         {
            AV90TFComposicion_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV96TFTipEntNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV97TFTipEntNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV98TFAlbRDes = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV99TFAlbRDes_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV71Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRFEN") == 0 )
         {
            AV72Albrfen = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRFEN_TO") == 0 )
         {
            AV73Albrfen_to = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV74Clicod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV75Clicod_to = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF") == 0 )
         {
            AV76AlbRef = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF_TO") == 0 )
         {
            AV93albref_to = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECOD") == 0 )
         {
            AV85Procecod = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECOD_TO") == 0 )
         {
            AV86ProceCod_to = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRREO") == 0 )
         {
            AV77AlbRReo = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREST") == 0 )
         {
            AV78AlbREst = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPENTCOD") == 0 )
         {
            AV94TipEntCod = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRUNI") == 0 )
         {
            AV95AlbRUni = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV150GXV5 = (int)(AV150GXV5+1) ;
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
      this.aP0[0] = wcconsultaalmacentejidoencrudoexport.this.AV11Filename;
      this.aP1[0] = wcconsultaalmacentejidoencrudoexport.this.AV12ErrorMessage;
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
      AV17FilterFullText = "" ;
      AV83TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV84TFAlbRReo_Sel = "" ;
      AV38TFAlbRFen = GXutil.nullDate() ;
      AV43TFCliNom_Sel = "" ;
      AV42TFCliNom = "" ;
      AV45TFAlbRef_Sel = "" ;
      AV44TFAlbRef = "" ;
      AV47TFAlbRefDsc_Sel = "" ;
      AV46TFAlbRefDsc = "" ;
      AV49TFAlbRDisCli_Sel = "" ;
      AV48TFAlbRDisCli = "" ;
      AV51TFAlbRTartD_Sel = "" ;
      AV50TFAlbRTartD = "" ;
      AV53TFAlbRLote_Sel = "" ;
      AV52TFAlbRLote = "" ;
      AV55TFAlbRLoc_Sel = "" ;
      AV54TFAlbRLoc = "" ;
      AV63TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64TFAlbRUni_Sel = "" ;
      AV65TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV66TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV67TFAlbRUniUti = DecimalUtil.ZERO ;
      AV68TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV69TFAlbRUniDis = DecimalUtil.ZERO ;
      AV70TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV80TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV88TFProceNom_Sel = "" ;
      AV87TFProceNom = "" ;
      AV90TFComposicion_Sel = "" ;
      AV89TFComposicion = "" ;
      AV97TFTipEntNom_Sel = "" ;
      AV96TFTipEntNom = "" ;
      AV99TFAlbRDes_Sel = "" ;
      AV98TFAlbRDes = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A55AlbRReo = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A5806AlbREnt2 = "" ;
      A46AlbREnt = "" ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A3359AlbRDisCli = "" ;
      A6264AlbRTartD = "" ;
      A6463AlbRLote = "" ;
      A50AlbRLoc = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A971ProceNom = "" ;
      A13981Composicio = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext = "" ;
      AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV111Wcconsultaalmacentejidoencrudods_5_tfalbrfen = GXutil.nullDate() ;
      AV114Wcconsultaalmacentejidoencrudods_8_tfclinom = "" ;
      AV115Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = "" ;
      AV116Wcconsultaalmacentejidoencrudods_10_tfalbref = "" ;
      AV117Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = "" ;
      AV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = "" ;
      AV119Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = "" ;
      AV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = "" ;
      AV121Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = "" ;
      AV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = "" ;
      AV123Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = "" ;
      AV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote = "" ;
      AV125Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = "" ;
      AV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc = "" ;
      AV127Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = "" ;
      AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV135Wcconsultaalmacentejidoencrudods_29_tfalbrunient = DecimalUtil.ZERO ;
      AV136Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = DecimalUtil.ZERO ;
      AV137Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = DecimalUtil.ZERO ;
      AV138Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV139Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = DecimalUtil.ZERO ;
      AV140Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV142Wcconsultaalmacentejidoencrudods_36_tfprocenom = "" ;
      AV143Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = "" ;
      AV144Wcconsultaalmacentejidoencrudods_38_tfcomposicion = "" ;
      AV145Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = "" ;
      AV146Wcconsultaalmacentejidoencrudods_40_tftipentnom = "" ;
      AV147Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = "" ;
      AV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes = "" ;
      AV149Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = "" ;
      lV107Wcconsultaalmacentejidoencrudods_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV114Wcconsultaalmacentejidoencrudods_8_tfclinom = "" ;
      lV116Wcconsultaalmacentejidoencrudods_10_tfalbref = "" ;
      lV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = "" ;
      lV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = "" ;
      lV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = "" ;
      lV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote = "" ;
      lV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc = "" ;
      lV142Wcconsultaalmacentejidoencrudods_36_tfprocenom = "" ;
      lV146Wcconsultaalmacentejidoencrudods_40_tftipentnom = "" ;
      lV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes = "" ;
      AV76AlbRef = "" ;
      AV93albref_to = "" ;
      AV72Albrfen = GXutil.nullDate() ;
      AV73Albrfen_to = GXutil.nullDate() ;
      AV77AlbRReo = "" ;
      AV95AlbRUni = "" ;
      AV71Emprcod = "" ;
      A396EmprCod = "" ;
      P08ZQ2_A6263AlbRTartC = new short[1] ;
      P08ZQ2_n6263AlbRTartC = new boolean[] {false} ;
      P08ZQ2_A1211TipEntCod = new short[1] ;
      P08ZQ2_n1211TipEntCod = new boolean[] {false} ;
      P08ZQ2_A970ProceCod = new short[1] ;
      P08ZQ2_n970ProceCod = new boolean[] {false} ;
      P08ZQ2_A1291AlbRDes = new String[] {""} ;
      P08ZQ2_A1212TipEntNom = new String[] {""} ;
      P08ZQ2_n1212TipEntNom = new boolean[] {false} ;
      P08ZQ2_A971ProceNom = new String[] {""} ;
      P08ZQ2_n971ProceNom = new boolean[] {false} ;
      P08ZQ2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZQ2_A51AlbRPieDis = new int[1] ;
      P08ZQ2_A50AlbRLoc = new String[] {""} ;
      P08ZQ2_A6463AlbRLote = new String[] {""} ;
      P08ZQ2_A6264AlbRTartD = new String[] {""} ;
      P08ZQ2_n6264AlbRTartD = new boolean[] {false} ;
      P08ZQ2_A3359AlbRDisCli = new String[] {""} ;
      P08ZQ2_A3613AlbRefDsc = new String[] {""} ;
      P08ZQ2_A279CliNom = new String[] {""} ;
      P08ZQ2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZQ2_A44AlbRecCod = new int[1] ;
      P08ZQ2_A47AlbREst = new byte[1] ;
      P08ZQ2_A56AlbRUni = new String[] {""} ;
      P08ZQ2_A55AlbRReo = new String[] {""} ;
      P08ZQ2_A46AlbREnt = new String[] {""} ;
      P08ZQ2_A5806AlbREnt2 = new String[] {""} ;
      P08ZQ2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZQ2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZQ2_A52AlbRPieEnt = new int[1] ;
      P08ZQ2_A54AlbRPieUti = new int[1] ;
      P08ZQ2_A45AlbRef = new String[] {""} ;
      P08ZQ2_A252CliCod = new int[1] ;
      P08ZQ2_A396EmprCod = new String[] {""} ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV22AlbREnt2 = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char9 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV82TFAlbRReo_SelsJson = "" ;
      AV62TFAlbRUni_SelsJson = "" ;
      AV79TFAlbREst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultaalmacentejidoencrudoexport__default(),
         new Object[] {
             new Object[] {
            P08ZQ2_A6263AlbRTartC, P08ZQ2_n6263AlbRTartC, P08ZQ2_A1211TipEntCod, P08ZQ2_n1211TipEntCod, P08ZQ2_A970ProceCod, P08ZQ2_n970ProceCod, P08ZQ2_A1291AlbRDes, P08ZQ2_A1212TipEntNom, P08ZQ2_n1212TipEntNom, P08ZQ2_A971ProceNom,
            P08ZQ2_n971ProceNom, P08ZQ2_A57AlbRUniDis, P08ZQ2_A51AlbRPieDis, P08ZQ2_A50AlbRLoc, P08ZQ2_A6463AlbRLote, P08ZQ2_A6264AlbRTartD, P08ZQ2_n6264AlbRTartD, P08ZQ2_A3359AlbRDisCli, P08ZQ2_A3613AlbRefDsc, P08ZQ2_A279CliNom,
            P08ZQ2_A49AlbRFen, P08ZQ2_A44AlbRecCod, P08ZQ2_A47AlbREst, P08ZQ2_A56AlbRUni, P08ZQ2_A55AlbRReo, P08ZQ2_A46AlbREnt, P08ZQ2_A5806AlbREnt2, P08ZQ2_A58AlbRUniEnt, P08ZQ2_A60AlbRUniUti, P08ZQ2_A52AlbRPieEnt,
            P08ZQ2_A54AlbRPieUti, P08ZQ2_A45AlbRef, P08ZQ2_A252CliCod, P08ZQ2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV81TFAlbREst_Sel ;
   private byte A47AlbREst ;
   private byte AV78AlbREst ;
   private short GXv_int3[] ;
   private short AV37OrderedBy ;
   private short A970ProceCod ;
   private short AV85Procecod ;
   private short AV86ProceCod_to ;
   private short A1211TipEntCod ;
   private short AV94TipEntCod ;
   private short A6263AlbRTartC ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFAlbRecCod ;
   private int AV35TFAlbRecCod_To ;
   private int AV102GXV1 ;
   private int AV40TFCliCod ;
   private int AV41TFCliCod_To ;
   private int AV56TFAlbRPieEnt ;
   private int AV57TFAlbRPieEnt_To ;
   private int AV58TFAlbRPieUti ;
   private int AV59TFAlbRPieUti_To ;
   private int AV60TFAlbRPieDis ;
   private int AV61TFAlbRPieDis_To ;
   private int AV103GXV2 ;
   private int AV104GXV3 ;
   private int AV105GXV4 ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV108Wcconsultaalmacentejidoencrudods_2_tfalbreccod ;
   private int AV109Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ;
   private int AV112Wcconsultaalmacentejidoencrudods_6_tfclicod ;
   private int AV113Wcconsultaalmacentejidoencrudods_7_tfclicod_to ;
   private int AV128Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ;
   private int AV129Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ;
   private int AV130Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ;
   private int AV131Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ;
   private int AV132Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ;
   private int AV133Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ;
   private int AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ;
   private int AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ;
   private int AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ;
   private int AV74Clicod ;
   private int AV75Clicod_to ;
   private int GXv_int7[] ;
   private int AV150GXV5 ;
   private long AV36i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV65TFAlbRUniEnt ;
   private java.math.BigDecimal AV66TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV67TFAlbRUniUti ;
   private java.math.BigDecimal AV68TFAlbRUniUti_To ;
   private java.math.BigDecimal AV69TFAlbRUniDis ;
   private java.math.BigDecimal AV70TFAlbRUniDis_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV135Wcconsultaalmacentejidoencrudods_29_tfalbrunient ;
   private java.math.BigDecimal AV136Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ;
   private java.math.BigDecimal AV137Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ;
   private java.math.BigDecimal AV138Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ;
   private java.math.BigDecimal AV139Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ;
   private java.math.BigDecimal AV140Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ;
   private String AV84TFAlbRReo_Sel ;
   private String AV43TFCliNom_Sel ;
   private String AV42TFCliNom ;
   private String AV45TFAlbRef_Sel ;
   private String AV44TFAlbRef ;
   private String AV47TFAlbRefDsc_Sel ;
   private String AV46TFAlbRefDsc ;
   private String AV49TFAlbRDisCli_Sel ;
   private String AV48TFAlbRDisCli ;
   private String AV51TFAlbRTartD_Sel ;
   private String AV50TFAlbRTartD ;
   private String AV53TFAlbRLote_Sel ;
   private String AV52TFAlbRLote ;
   private String AV55TFAlbRLoc_Sel ;
   private String AV54TFAlbRLoc ;
   private String AV64TFAlbRUni_Sel ;
   private String AV88TFProceNom_Sel ;
   private String AV87TFProceNom ;
   private String AV90TFComposicion_Sel ;
   private String AV89TFComposicion ;
   private String AV97TFTipEntNom_Sel ;
   private String AV96TFTipEntNom ;
   private String AV99TFAlbRDes_Sel ;
   private String AV98TFAlbRDes ;
   private String A55AlbRReo ;
   private String A5806AlbREnt2 ;
   private String A46AlbREnt ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A3359AlbRDisCli ;
   private String A6264AlbRTartD ;
   private String A6463AlbRLote ;
   private String A50AlbRLoc ;
   private String A56AlbRUni ;
   private String A971ProceNom ;
   private String A13981Composicio ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String AV114Wcconsultaalmacentejidoencrudods_8_tfclinom ;
   private String AV115Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ;
   private String AV116Wcconsultaalmacentejidoencrudods_10_tfalbref ;
   private String AV117Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ;
   private String AV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ;
   private String AV119Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ;
   private String AV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ;
   private String AV121Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ;
   private String AV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ;
   private String AV123Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ;
   private String AV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote ;
   private String AV125Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ;
   private String AV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc ;
   private String AV127Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ;
   private String AV142Wcconsultaalmacentejidoencrudods_36_tfprocenom ;
   private String AV143Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ;
   private String AV144Wcconsultaalmacentejidoencrudods_38_tfcomposicion ;
   private String AV145Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ;
   private String AV146Wcconsultaalmacentejidoencrudods_40_tftipentnom ;
   private String AV147Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ;
   private String AV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes ;
   private String AV149Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ;
   private String scmdbuf ;
   private String lV114Wcconsultaalmacentejidoencrudods_8_tfclinom ;
   private String lV116Wcconsultaalmacentejidoencrudods_10_tfalbref ;
   private String lV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ;
   private String lV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ;
   private String lV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ;
   private String lV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote ;
   private String lV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc ;
   private String lV142Wcconsultaalmacentejidoencrudods_36_tfprocenom ;
   private String lV146Wcconsultaalmacentejidoencrudods_40_tftipentnom ;
   private String lV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes ;
   private String AV76AlbRef ;
   private String AV93albref_to ;
   private String AV77AlbRReo ;
   private String AV95AlbRUni ;
   private String AV71Emprcod ;
   private String A396EmprCod ;
   private String GXv_char5[] ;
   private String GXv_char8[] ;
   private String AV22AlbREnt2 ;
   private String GXt_char4 ;
   private String GXv_char9[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV38TFAlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV111Wcconsultaalmacentejidoencrudods_5_tfalbrfen ;
   private java.util.Date AV72Albrfen ;
   private java.util.Date AV73Albrfen_to ;
   private boolean returnInSub ;
   private boolean AV16OrderedDsc ;
   private boolean n6263AlbRTartC ;
   private boolean n1211TipEntCod ;
   private boolean n970ProceCod ;
   private boolean n1212TipEntNom ;
   private boolean n971ProceNom ;
   private boolean n6264AlbRTartD ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV82TFAlbRReo_SelsJson ;
   private String AV62TFAlbRUni_SelsJson ;
   private String AV79TFAlbREst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV17FilterFullText ;
   private String AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext ;
   private String lV107Wcconsultaalmacentejidoencrudods_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV80TFAlbREst_Sels ;
   private GXSimpleCollection<Byte> AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private GXSimpleCollection<String> AV83TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV63TFAlbRUni_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P08ZQ2_A6263AlbRTartC ;
   private boolean[] P08ZQ2_n6263AlbRTartC ;
   private short[] P08ZQ2_A1211TipEntCod ;
   private boolean[] P08ZQ2_n1211TipEntCod ;
   private short[] P08ZQ2_A970ProceCod ;
   private boolean[] P08ZQ2_n970ProceCod ;
   private String[] P08ZQ2_A1291AlbRDes ;
   private String[] P08ZQ2_A1212TipEntNom ;
   private boolean[] P08ZQ2_n1212TipEntNom ;
   private String[] P08ZQ2_A971ProceNom ;
   private boolean[] P08ZQ2_n971ProceNom ;
   private java.math.BigDecimal[] P08ZQ2_A57AlbRUniDis ;
   private int[] P08ZQ2_A51AlbRPieDis ;
   private String[] P08ZQ2_A50AlbRLoc ;
   private String[] P08ZQ2_A6463AlbRLote ;
   private String[] P08ZQ2_A6264AlbRTartD ;
   private boolean[] P08ZQ2_n6264AlbRTartD ;
   private String[] P08ZQ2_A3359AlbRDisCli ;
   private String[] P08ZQ2_A3613AlbRefDsc ;
   private String[] P08ZQ2_A279CliNom ;
   private java.util.Date[] P08ZQ2_A49AlbRFen ;
   private int[] P08ZQ2_A44AlbRecCod ;
   private byte[] P08ZQ2_A47AlbREst ;
   private String[] P08ZQ2_A56AlbRUni ;
   private String[] P08ZQ2_A55AlbRReo ;
   private String[] P08ZQ2_A46AlbREnt ;
   private String[] P08ZQ2_A5806AlbREnt2 ;
   private java.math.BigDecimal[] P08ZQ2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZQ2_A60AlbRUniUti ;
   private int[] P08ZQ2_A52AlbRPieEnt ;
   private int[] P08ZQ2_A54AlbRPieUti ;
   private String[] P08ZQ2_A45AlbRef ;
   private int[] P08ZQ2_A252CliCod ;
   private String[] P08ZQ2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wcconsultaalmacentejidoencrudoexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV108Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV109Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV111Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV112Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV113Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV115Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV114Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV117Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV116Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV119Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV121Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV123Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV125Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV127Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV128Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV129Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV130Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV131Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV132Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV133Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV135Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV136Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV137Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV138Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV139Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV140Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV143Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV142Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV147Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV146Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV149Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          short AV37OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV107Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV145Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV144Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV76AlbRef ,
                                          String AV93albref_to ,
                                          java.util.Date AV72Albrfen ,
                                          java.util.Date AV73Albrfen_to ,
                                          int AV74Clicod ,
                                          int AV75Clicod_to ,
                                          short A970ProceCod ,
                                          short AV85Procecod ,
                                          short AV86ProceCod_to ,
                                          String AV77AlbRReo ,
                                          byte AV78AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV94TipEntCod ,
                                          String AV95AlbRUni ,
                                          String AV71Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[51];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt" ;
      scmdbuf += " - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc, T1.AlbRLote, T3.TipArtDsc" ;
      scmdbuf += " AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbREnt, T1.AlbREnt2, T1.AlbRUniEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod)" ;
      scmdbuf += " LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV108Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (0==AV112Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV113Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV120Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV122Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV124Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV126Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV128Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV129Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (0==AV130Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (0==AV131Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (0==AV132Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (0==AV133Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV134Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV141Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV143Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV142Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV146Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV148Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV37OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV37OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDisCli" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDisCli DESC" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLote" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLote DESC" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV37OrderedBy == 17 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV37OrderedBy == 17 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      else if ( ( AV37OrderedBy == 18 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV37OrderedBy == 18 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 19 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipEntNom" ;
      }
      else if ( ( AV37OrderedBy == 19 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipEntNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 20 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV37OrderedBy == 20 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
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
                  return conditional_P08ZQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Boolean) dynConstraints[64]).booleanValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).shortValue() , ((Number) dynConstraints[78]).shortValue() , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , ((Number) dynConstraints[81]).byteValue() , ((Number) dynConstraints[82]).shortValue() , ((Number) dynConstraints[83]).shortValue() , (String)dynConstraints[84] , (String)dynConstraints[85] , (String)dynConstraints[86] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 20);
               ((String[]) buf[7])[0] = rslt.getString(5, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((String[]) buf[25])[0] = rslt.getString(20, 8);
               ((String[]) buf[26])[0] = rslt.getString(21, 20);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 16);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               ((String[]) buf[33])[0] = rslt.getString(28, 3);
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
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
      }
   }

}

