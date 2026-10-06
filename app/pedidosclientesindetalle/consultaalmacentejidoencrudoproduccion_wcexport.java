package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultaalmacentejidoencrudoproduccion_wcexport extends GXProcedure
{
   public consultaalmacentejidoencrudoproduccion_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaalmacentejidoencrudoproduccion_wcexport.class ), "" );
   }

   public consultaalmacentejidoencrudoproduccion_wcexport( int remoteHandle ,
                                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultaalmacentejidoencrudoproduccion_wcexport.this.aP1 = new String[] {""};
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
      consultaalmacentejidoencrudoproduccion_wcexport.this.aP0 = aP0;
      consultaalmacentejidoencrudoproduccion_wcexport.this.aP1 = aP1;
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
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV64WebSession.remove(httpContext.getMessage( "Emprcod", ""));
      AV64WebSession.remove(httpContext.getMessage( "ALbrecCod", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "ConsultaAlmacenTejidoencrudoProduccion_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFBarNHdr_Sel, GXv_char5) ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFBarNHdr, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFBarSer_Sel, GXv_char5) ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFBarSer, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFBarSerDsc_Sel, GXv_char5) ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFBarSerDsc, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarColNom_Sel, GXv_char5) ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarColNom, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV44TFBarColNum) && (0==AV45TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFBarColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFBarNomCli_Sel, GXv_char5) ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFBarNomCli, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarPieKil)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFBarPieKil_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFBarPieKil)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFBarPieKil_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFBarPieMet)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarPieMet_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFBarPieMet)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFBarPieMet_To)) );
      }
      if ( ! ( (0==AV52TFBarPiePie) && (0==AV53TFBarPiePie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFBarPiePie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFBarPiePie_To );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFBarAgrEst_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ag?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFBarAgrEst_Sel, GXv_char5) ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFBarAgrEst)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ag?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFBarAgrEst, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFBarFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFBarFasCod_Sel, GXv_char5) ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFBarFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFBarFasCod, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFBarFecCum)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fech Ult", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaalmacentejidoencrudoproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV58TFBarFecCum );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV33VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCColumnsSelector"), "") != 0 )
      {
         AV28ColumnsSelectorXML = AV19Session.getValue("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV28ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV27ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV67GXV1));
         if ( AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setColor( 11 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61Emprcod = AV64WebSession.getValue(httpContext.getMessage( "Emprcod", "")) ;
      AV62ALbrecCod = (int)(GXutil.lval( AV64WebSession.getValue(httpContext.getMessage( "ALbrecCod", "")))) ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV18FilterFullText ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV36TFBarNHdr ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV38TFBarSer ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV39TFBarSer_Sel ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV40TFBarSerDsc ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV41TFBarSerDsc_Sel ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV42TFBarColNom ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV43TFBarColNom_Sel ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV44TFBarColNum ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV45TFBarColNum_To ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV46TFBarNomCli ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV48TFBarPieKil ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV49TFBarPieKil_To ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV50TFBarPieMet ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV51TFBarPieMet_To ;
      AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV52TFBarPiePie ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV53TFBarPiePie_To ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV54TFBarAgrEst ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV55TFBarAgrEst_Sel ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV56TFBarFasCod ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV57TFBarFasCod_Sel ;
      AV92Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV58TFBarFecCum ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV92Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV61Emprcod ,
                                           Integer.valueOf(AV62ALbrecCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P09JZ8 */
      pr_default.execute(0, new Object[] {AV61Emprcod, Integer.valueOf(AV62ALbrecCod), AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV92Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV92Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P09JZ8_A44AlbRecCod[0] ;
         A396EmprCod = P09JZ8_A396EmprCod[0] ;
         A120BarAgrEst = P09JZ8_A120BarAgrEst[0] ;
         A1501BarPiePie = P09JZ8_A1501BarPiePie[0] ;
         A205BarPieMet = P09JZ8_A205BarPieMet[0] ;
         A203BarPieKil = P09JZ8_A203BarPieKil[0] ;
         A1234BarNomCli = P09JZ8_A1234BarNomCli[0] ;
         A136BarColNum = P09JZ8_A136BarColNum[0] ;
         A135BarColNom = P09JZ8_A135BarColNom[0] ;
         A1652BarSerDsc = P09JZ8_A1652BarSerDsc[0] ;
         A212BarSer = P09JZ8_A212BarSer[0] ;
         A13696BarNHdr = P09JZ8_A13696BarNHdr[0] ;
         A143BarDisNum = P09JZ8_A143BarDisNum[0] ;
         A4812BarEncCli = P09JZ8_A4812BarEncCli[0] ;
         A156BarFecCum = P09JZ8_A156BarFecCum[0] ;
         n156BarFecCum = P09JZ8_n156BarFecCum[0] ;
         A151BarFasCod = P09JZ8_A151BarFasCod[0] ;
         n151BarFasCod = P09JZ8_n151BarFasCod[0] ;
         A129BarCod = P09JZ8_A129BarCod[0] ;
         A132BarCodReo = P09JZ8_A132BarCodReo[0] ;
         A130BarCodPar = P09JZ8_A130BarCodPar[0] ;
         A200BarPieCod = P09JZ8_A200BarPieCod[0] ;
         A120BarAgrEst = P09JZ8_A120BarAgrEst[0] ;
         A1234BarNomCli = P09JZ8_A1234BarNomCli[0] ;
         A136BarColNum = P09JZ8_A136BarColNum[0] ;
         A135BarColNom = P09JZ8_A135BarColNom[0] ;
         A1652BarSerDsc = P09JZ8_A1652BarSerDsc[0] ;
         A212BarSer = P09JZ8_A212BarSer[0] ;
         A13696BarNHdr = P09JZ8_A13696BarNHdr[0] ;
         A143BarDisNum = P09JZ8_A143BarDisNum[0] ;
         A4812BarEncCli = P09JZ8_A4812BarEncCli[0] ;
         A156BarFecCum = P09JZ8_A156BarFecCum[0] ;
         n156BarFecCum = P09JZ8_n156BarFecCum[0] ;
         A151BarFasCod = P09JZ8_A151BarFasCod[0] ;
         n151BarFasCod = P09JZ8_n151BarFasCod[0] ;
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
         AV33VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = AV23CliNom ;
            GXv_int7[0] = AV63Clicod ;
            GXv_char5[0] = GXt_char4 ;
            new app.cliente_tabla_barcad(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.AV63Clicod = GXv_int7[0] ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV23CliNom = GXt_char4 ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23CliNom, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV24BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV24BarEncCli, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A203BarPieKil)) );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A205BarPieMet)) );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( A1501BarPiePie );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A120BarAgrEst, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A151BarFasCod, GXv_char5) ;
            consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A156BarFecCum );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
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
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNHdr", "", "N Hdr", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&CliNom", "", "Cliente", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&BarEncCli", "", "Disp Cliente", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSer", "", "Articulo", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSerDsc", "", "Descripcion", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNom", "", "Color", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNum", "", "Numero", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNomCli", "", "Color Cli", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPieKil", "", "Kilos", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPieMet", "", "Metros", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPiePie", "", "Piezas", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarAgrEst", "", "Ag?", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarFasCod", "Fase", "Codigo", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarFecCum", "Fase", "Fech Ult", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char4 = AV29UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCColumnsSelector", GXv_char5) ;
      consultaalmacentejidoencrudoproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV29UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV29UserCustomValue)==0) ) )
      {
         AV26ColumnsSelectorAux.fromxml(AV29UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV25ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV26ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV25ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV93GXV2 = 1 ;
      while ( AV93GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV36TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV37TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV38TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV39TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV40TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV41TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV42TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV43TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV44TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV46TFBarNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV47TFBarNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV48TFBarPieKil = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFBarPieKil_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV50TFBarPieMet = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFBarPieMet_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEPIE") == 0 )
         {
            AV52TFBarPiePie = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFBarPiePie_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV54TFBarAgrEst = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV55TFBarAgrEst_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV56TFBarFasCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV57TFBarFasCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCUM") == 0 )
         {
            AV58TFBarFecCum = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV93GXV2 = (int)(AV93GXV2+1) ;
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
      this.aP0[0] = consultaalmacentejidoencrudoproduccion_wcexport.this.AV11Filename;
      this.aP1[0] = consultaalmacentejidoencrudoproduccion_wcexport.this.AV12ErrorMessage;
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
      AV64WebSession = httpContext.getWebSession();
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV18FilterFullText = "" ;
      AV37TFBarNHdr_Sel = "" ;
      AV36TFBarNHdr = "" ;
      AV39TFBarSer_Sel = "" ;
      AV38TFBarSer = "" ;
      AV41TFBarSerDsc_Sel = "" ;
      AV40TFBarSerDsc = "" ;
      AV43TFBarColNom_Sel = "" ;
      AV42TFBarColNom = "" ;
      AV47TFBarNomCli_Sel = "" ;
      AV46TFBarNomCli = "" ;
      AV48TFBarPieKil = DecimalUtil.ZERO ;
      AV49TFBarPieKil_To = DecimalUtil.ZERO ;
      AV50TFBarPieMet = DecimalUtil.ZERO ;
      AV51TFBarPieMet_To = DecimalUtil.ZERO ;
      AV55TFBarAgrEst_Sel = "" ;
      AV54TFBarAgrEst = "" ;
      AV57TFBarFasCod_Sel = "" ;
      AV56TFBarFasCod = "" ;
      AV58TFBarFecCum = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV28ColumnsSelectorXML = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV27ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13696BarNHdr = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      AV61Emprcod = "" ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = "" ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = "" ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = "" ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = "" ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = "" ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = "" ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = "" ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = "" ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = "" ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = "" ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = "" ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = DecimalUtil.ZERO ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = DecimalUtil.ZERO ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = "" ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = "" ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = "" ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = "" ;
      AV92Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = GXutil.nullDate() ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = "" ;
      lV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = "" ;
      scmdbuf = "" ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = "" ;
      lV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = "" ;
      lV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = "" ;
      lV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = "" ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = "" ;
      lV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = "" ;
      P09JZ8_A44AlbRecCod = new int[1] ;
      P09JZ8_A396EmprCod = new String[] {""} ;
      P09JZ8_A120BarAgrEst = new String[] {""} ;
      P09JZ8_A1501BarPiePie = new int[1] ;
      P09JZ8_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09JZ8_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09JZ8_A1234BarNomCli = new String[] {""} ;
      P09JZ8_A136BarColNum = new int[1] ;
      P09JZ8_A135BarColNom = new String[] {""} ;
      P09JZ8_A1652BarSerDsc = new String[] {""} ;
      P09JZ8_A212BarSer = new String[] {""} ;
      P09JZ8_A13696BarNHdr = new String[] {""} ;
      P09JZ8_A143BarDisNum = new String[] {""} ;
      P09JZ8_A4812BarEncCli = new String[] {""} ;
      P09JZ8_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09JZ8_n156BarFecCum = new boolean[] {false} ;
      P09JZ8_A151BarFasCod = new String[] {""} ;
      P09JZ8_n151BarFasCod = new boolean[] {false} ;
      P09JZ8_A129BarCod = new int[1] ;
      P09JZ8_A132BarCodReo = new byte[1] ;
      P09JZ8_A130BarCodPar = new String[] {""} ;
      P09JZ8_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV23CliNom = "" ;
      GXv_int7 = new int[1] ;
      AV24BarEncCli = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV29UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wcexport__default(),
         new Object[] {
             new Object[] {
            P09JZ8_A44AlbRecCod, P09JZ8_A396EmprCod, P09JZ8_A120BarAgrEst, P09JZ8_A1501BarPiePie, P09JZ8_A205BarPieMet, P09JZ8_A203BarPieKil, P09JZ8_A1234BarNomCli, P09JZ8_A136BarColNum, P09JZ8_A135BarColNom, P09JZ8_A1652BarSerDsc,
            P09JZ8_A212BarSer, P09JZ8_A13696BarNHdr, P09JZ8_A143BarDisNum, P09JZ8_A4812BarEncCli, P09JZ8_A156BarFecCum, P09JZ8_n156BarFecCum, P09JZ8_A151BarFasCod, P09JZ8_n151BarFasCod, P09JZ8_A129BarCod, P09JZ8_A132BarCodReo,
            P09JZ8_A130BarCodPar, P09JZ8_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV44TFBarColNum ;
   private int AV45TFBarColNum_To ;
   private int AV52TFBarPiePie ;
   private int AV53TFBarPiePie_To ;
   private int AV67GXV1 ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1501BarPiePie ;
   private int AV62ALbrecCod ;
   private int AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ;
   private int AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ;
   private int AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ;
   private int AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ;
   private int A44AlbRecCod ;
   private int AV63Clicod ;
   private int GXv_int7[] ;
   private int AV93GXV2 ;
   private long AV33VisibleColumnCount ;
   private java.math.BigDecimal AV48TFBarPieKil ;
   private java.math.BigDecimal AV49TFBarPieKil_To ;
   private java.math.BigDecimal AV50TFBarPieMet ;
   private java.math.BigDecimal AV51TFBarPieMet_To ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ;
   private java.math.BigDecimal AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ;
   private java.math.BigDecimal AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ;
   private java.math.BigDecimal AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ;
   private String AV37TFBarNHdr_Sel ;
   private String AV36TFBarNHdr ;
   private String AV39TFBarSer_Sel ;
   private String AV38TFBarSer ;
   private String AV41TFBarSerDsc_Sel ;
   private String AV40TFBarSerDsc ;
   private String AV43TFBarColNom_Sel ;
   private String AV42TFBarColNom ;
   private String AV47TFBarNomCli_Sel ;
   private String AV46TFBarNomCli ;
   private String AV55TFBarAgrEst_Sel ;
   private String AV54TFBarAgrEst ;
   private String AV57TFBarFasCod_Sel ;
   private String AV56TFBarFasCod ;
   private String A13696BarNHdr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A120BarAgrEst ;
   private String A151BarFasCod ;
   private String AV61Emprcod ;
   private String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ;
   private String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ;
   private String AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ;
   private String AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ;
   private String AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ;
   private String AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ;
   private String AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ;
   private String AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ;
   private String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ;
   private String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ;
   private String AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ;
   private String AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ;
   private String AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ;
   private String AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ;
   private String lV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ;
   private String scmdbuf ;
   private String lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ;
   private String lV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ;
   private String lV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ;
   private String lV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ;
   private String lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ;
   private String lV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ;
   private String A200BarPieCod ;
   private String AV23CliNom ;
   private String AV24BarEncCli ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV58TFBarFecCum ;
   private java.util.Date A156BarFecCum ;
   private java.util.Date AV92Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n156BarFecCum ;
   private boolean n151BarFasCod ;
   private String AV28ColumnsSelectorXML ;
   private String AV29UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ;
   private String lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09JZ8_A44AlbRecCod ;
   private String[] P09JZ8_A396EmprCod ;
   private String[] P09JZ8_A120BarAgrEst ;
   private int[] P09JZ8_A1501BarPiePie ;
   private java.math.BigDecimal[] P09JZ8_A205BarPieMet ;
   private java.math.BigDecimal[] P09JZ8_A203BarPieKil ;
   private String[] P09JZ8_A1234BarNomCli ;
   private int[] P09JZ8_A136BarColNum ;
   private String[] P09JZ8_A135BarColNom ;
   private String[] P09JZ8_A1652BarSerDsc ;
   private String[] P09JZ8_A212BarSer ;
   private String[] P09JZ8_A13696BarNHdr ;
   private String[] P09JZ8_A143BarDisNum ;
   private String[] P09JZ8_A4812BarEncCli ;
   private java.util.Date[] P09JZ8_A156BarFecCum ;
   private boolean[] P09JZ8_n156BarFecCum ;
   private String[] P09JZ8_A151BarFasCod ;
   private boolean[] P09JZ8_n151BarFasCod ;
   private int[] P09JZ8_A129BarCod ;
   private byte[] P09JZ8_A132BarCodReo ;
   private String[] P09JZ8_A130BarCodPar ;
   private String[] P09JZ8_A200BarPieCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private com.genexus.webpanels.WebSession AV64WebSession ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV27ColumnsSelector_Column ;
}

final  class consultaalmacentejidoencrudoproduccion_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09JZ8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                          String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                          String AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                          String AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                          String AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                          String AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                          String AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                          String AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                          int AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                          int AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                          String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                          String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                          java.math.BigDecimal AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                          java.math.BigDecimal AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                          java.math.BigDecimal AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                          java.math.BigDecimal AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                          int AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                          int AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                          String AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                          String AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          int A1501BarPiePie ,
                                          String A120BarAgrEst ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A151BarFasCod ,
                                          String AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                          String AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                          java.util.Date AV92Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                          java.util.Date A156BarFecCum ,
                                          String AV61Emprcod ,
                                          int AV62ALbrecCod ,
                                          String A396EmprCod ,
                                          int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[41];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T2.BarDisNum, T2.BarEncCli, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01'," ;
      scmdbuf += " 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS" ;
      scmdbuf += " BarFecCum, COALESCE( T6.BarProCod, '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS" ;
      scmdbuf += " T5 LEFT JOIN (SELECT MIN(T8.ProCod) AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin," ;
      scmdbuf += " 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T5.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " WHERE T5.ProCod = COALESCE( T6.BarProCod, '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo," ;
      scmdbuf += " T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod)" ;
      scmdbuf += " AS BarFasCod, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo =" ;
      scmdbuf += " T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar) WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar" ;
      scmdbuf += " ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRecCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieKil" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieKil DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieMet" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieMet DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPiePie" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPiePie DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarAgrEst" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarAgrEst DESC" ;
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
                  return conditional_P09JZ8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JZ8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 11);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 9);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
      }
   }

}

