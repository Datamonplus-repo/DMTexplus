package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_almacentejidoexport extends GXProcedure
{
   public consultadeproduccion_almacentejidoexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_almacentejidoexport.class ), "" );
   }

   public consultadeproduccion_almacentejidoexport( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultadeproduccion_almacentejidoexport.this.aP1 = new String[] {""};
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
      consultadeproduccion_almacentejidoexport.this.aP0 = aP0;
      consultadeproduccion_almacentejidoexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_AlmacenTejidoExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV34TFBarPieCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Pieza", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFBarPieCod_Sel, GXv_char5) ;
         consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV33TFBarPieCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Pieza", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV33TFBarPieCod, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV35TFAlbRecCod) && (0==AV36TFAlbRecCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFAlbRecCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFAlbRecCod_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarKilLan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFBarKilLan_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs. Lanz.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV37TFBarKilLan)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV38TFBarKilLan_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFBarMetLan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFBarMetLan_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts. Lanz.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39TFBarMetLan)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFBarMetLan_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarPieKil)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarPieKil_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFBarPieKil)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFBarPieKil_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarPieMet)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarPieMet_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFBarPieMet)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFBarPieMet_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFBarPieLoc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFBarPieLoc_Sel, GXv_char5) ;
         consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFBarPieLoc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarPieLoc, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV47TFBarPieEst) && (0==AV48TFBarPieEst_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV47TFBarPieEst );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV48TFBarPieEst_To );
      }
      if ( ! ( (GXutil.strcmp("", AV50TFAlbREnt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Doc. Entr.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFAlbREnt_Sel, GXv_char5) ;
         consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFAlbREnt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Doc. Entr.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFAlbREnt, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFAlbRLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFAlbRLote_Sel, GXv_char5) ;
         consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFAlbRLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFAlbRLote, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV54TFAlbRTelar_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFAlbRTelar_Sel, GXv_char5) ;
         consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFAlbRTelar)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fio", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFAlbRTelar, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV56TFAlbRMdlCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Jogo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFAlbRMdlCod_Sel, GXv_char5) ;
         consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFAlbRMdlCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Jogo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFAlbRMdlCod, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFAlbRLu)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFAlbRLu_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pgadas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFAlbRLu)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFAlbRLu_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFAlbRTara)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFAlbRTara_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "LFA", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFAlbRTara)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFAlbRTara_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV62TFAlbMaqTej_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maq", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFAlbMaqTej_Sel, GXv_char5) ;
         consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFAlbMaqTej)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maq", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_almacentejidoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFAlbMaqTej, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV84GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV33TFBarPieCod ;
      AV87Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV34TFBarPieCod_Sel ;
      AV88Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV35TFAlbRecCod ;
      AV89Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV36TFAlbRecCod_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV37TFBarKilLan ;
      AV91Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV38TFBarKilLan_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV39TFBarMetLan ;
      AV93Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV40TFBarMetLan_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV41TFBarPieKil ;
      AV95Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV42TFBarPieKil_To ;
      AV96Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV43TFBarPieMet ;
      AV97Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV44TFBarPieMet_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV45TFBarPieLoc ;
      AV99Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV46TFBarPieLoc_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV47TFBarPieEst ;
      AV101Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV48TFBarPieEst_To ;
      AV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV49TFAlbREnt ;
      AV103Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV51TFAlbRLote ;
      AV105Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV52TFAlbRLote_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV53TFAlbRTelar ;
      AV107Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV54TFAlbRTelar_Sel ;
      AV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV55TFAlbRMdlCod ;
      AV109Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV56TFAlbRMdlCod_Sel ;
      AV110Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV57TFAlbRLu ;
      AV111Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV58TFAlbRLu_To ;
      AV112Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV59TFAlbRTara ;
      AV113Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV60TFAlbRTara_To ;
      AV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV61TFAlbMaqTej ;
      AV115Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV62TFAlbMaqTej_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV87Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV89Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV97Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV100Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV101Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV103Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV105Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV107Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV109Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV110Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV111Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV112Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV113Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV115Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV64Emprcod ,
                                           Integer.valueOf(AV65Barcod) ,
                                           Byte.valueOf(AV66Barcodreo) ,
                                           AV67Barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X12 */
      pr_default.execute(0, new Object[] {AV64Emprcod, Integer.valueOf(AV65Barcod), Byte.valueOf(AV66Barcodreo), AV67Barcodpar, lV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV87Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV89Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV90Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV91Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV92Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV93Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV94Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV95Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV96Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV97Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV99Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV100Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV101Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV103Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV105Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV107Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV109Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV110Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV111Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV112Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV113Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV115Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09X12_A130BarCodPar[0] ;
         A132BarCodReo = P09X12_A132BarCodReo[0] ;
         A129BarCod = P09X12_A129BarCod[0] ;
         A396EmprCod = P09X12_A396EmprCod[0] ;
         A8035AlbMaqTej = P09X12_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X12_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X12_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X12_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X12_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X12_A6463AlbRLote[0] ;
         A46AlbREnt = P09X12_A46AlbREnt[0] ;
         A201BarPieEst = P09X12_A201BarPieEst[0] ;
         A2186BarPieLoc = P09X12_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X12_n2186BarPieLoc[0] ;
         A205BarPieMet = P09X12_A205BarPieMet[0] ;
         A203BarPieKil = P09X12_A203BarPieKil[0] ;
         A183BarMetLan = P09X12_A183BarMetLan[0] ;
         A170BarKilLan = P09X12_A170BarKilLan[0] ;
         A44AlbRecCod = P09X12_A44AlbRecCod[0] ;
         A200BarPieCod = P09X12_A200BarPieCod[0] ;
         A8035AlbMaqTej = P09X12_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X12_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X12_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X12_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X12_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X12_A6463AlbRLote[0] ;
         A46AlbREnt = P09X12_A46AlbREnt[0] ;
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
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A200BarPieCod, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A44AlbRecCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A170BarKilLan)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A183BarMetLan)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A203BarPieKil)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A205BarPieMet)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2186BarPieLoc, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A201BarPieEst );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A46AlbREnt, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6463AlbRLote, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6464AlbRTelar, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4602AlbRMdlCod, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A6465AlbRLu)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A6470AlbRTara)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A8035AlbMaqTej, GXv_char5) ;
            consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieCod", "", "Nº Pieza", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarKilLan", "", "Kgs. Lanz.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarMetLan", "", "Mts. Lanz.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieKil", "", "Kgs", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieMet", "", "Mts", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieLoc", "", "Localizacion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarPieEst", "", "E", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbREnt", "", "Nº Doc. Entr.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      if ( AV116Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRLote", "", "Lote", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      if ( AV116Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRTelar", "", "Fio", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      if ( AV116Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRMdlCod", "", "Jogo", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      if ( AV116Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRLu", "", "Pgadas", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      if ( AV116Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRTara", "", "LFA", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      if ( AV116Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbMaqTej", "", "Maq", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector", GXv_char5) ;
      consultadeproduccion_almacentejidoexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV18Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV117GXV2 = 1 ;
      while ( AV117GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV117GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV33TFBarPieCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV34TFBarPieCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV35TFAlbRecCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFAlbRecCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKILLAN") == 0 )
         {
            AV37TFBarKilLan = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFBarKilLan_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMETLAN") == 0 )
         {
            AV39TFBarMetLan = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFBarMetLan_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV41TFBarPieKil = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFBarPieKil_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV43TFBarPieMet = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFBarPieMet_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIELOC") == 0 )
         {
            AV45TFBarPieLoc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIELOC_SEL") == 0 )
         {
            AV46TFBarPieLoc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV47TFBarPieEst = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFBarPieEst_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV49TFAlbREnt = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV50TFAlbREnt_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV51TFAlbRLote = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV52TFAlbRLote_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR") == 0 )
         {
            AV53TFAlbRTelar = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR_SEL") == 0 )
         {
            AV54TFAlbRTelar_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD") == 0 )
         {
            AV55TFAlbRMdlCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD_SEL") == 0 )
         {
            AV56TFAlbRMdlCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLU") == 0 )
         {
            AV57TFAlbRLu = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFAlbRLu_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARA") == 0 )
         {
            AV59TFAlbRTara = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFAlbRTara_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ") == 0 )
         {
            AV61TFAlbMaqTej = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ_SEL") == 0 )
         {
            AV62TFAlbMaqTej_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV64Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV65Barcod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV66Barcodreo = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV67Barcodpar = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV75Clicod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV76CliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV77PedidoCliente = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV78Barser = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV79BarSerDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV80Barcolnom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV81Barcolnum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV117GXV2 = (int)(AV117GXV2+1) ;
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
      this.aP0[0] = consultadeproduccion_almacentejidoexport.this.AV11Filename;
      this.aP1[0] = consultadeproduccion_almacentejidoexport.this.AV12ErrorMessage;
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
      AV34TFBarPieCod_Sel = "" ;
      AV33TFBarPieCod = "" ;
      AV37TFBarKilLan = DecimalUtil.ZERO ;
      AV38TFBarKilLan_To = DecimalUtil.ZERO ;
      AV39TFBarMetLan = DecimalUtil.ZERO ;
      AV40TFBarMetLan_To = DecimalUtil.ZERO ;
      AV41TFBarPieKil = DecimalUtil.ZERO ;
      AV42TFBarPieKil_To = DecimalUtil.ZERO ;
      AV43TFBarPieMet = DecimalUtil.ZERO ;
      AV44TFBarPieMet_To = DecimalUtil.ZERO ;
      AV46TFBarPieLoc_Sel = "" ;
      AV45TFBarPieLoc = "" ;
      AV50TFAlbREnt_Sel = "" ;
      AV49TFAlbREnt = "" ;
      AV52TFAlbRLote_Sel = "" ;
      AV51TFAlbRLote = "" ;
      AV54TFAlbRTelar_Sel = "" ;
      AV53TFAlbRTelar = "" ;
      AV56TFAlbRMdlCod_Sel = "" ;
      AV55TFAlbRMdlCod = "" ;
      AV57TFAlbRLu = DecimalUtil.ZERO ;
      AV58TFAlbRLu_To = DecimalUtil.ZERO ;
      AV59TFAlbRTara = DecimalUtil.ZERO ;
      AV60TFAlbRTara_To = DecimalUtil.ZERO ;
      AV62TFAlbMaqTej_Sel = "" ;
      AV61TFAlbMaqTej = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A200BarPieCod = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A46AlbREnt = "" ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A4602AlbRMdlCod = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A8035AlbMaqTej = "" ;
      AV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = "" ;
      AV87Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = "" ;
      AV90Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = DecimalUtil.ZERO ;
      AV91Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = DecimalUtil.ZERO ;
      AV92Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = DecimalUtil.ZERO ;
      AV93Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = DecimalUtil.ZERO ;
      AV94Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = DecimalUtil.ZERO ;
      AV95Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV96Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = DecimalUtil.ZERO ;
      AV97Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = "" ;
      AV99Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = "" ;
      AV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = "" ;
      AV103Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = "" ;
      AV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = "" ;
      AV105Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = "" ;
      AV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = "" ;
      AV107Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = "" ;
      AV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = "" ;
      AV109Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = "" ;
      AV110Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = DecimalUtil.ZERO ;
      AV111Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = DecimalUtil.ZERO ;
      AV112Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = DecimalUtil.ZERO ;
      AV113Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = DecimalUtil.ZERO ;
      AV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = "" ;
      AV115Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = "" ;
      scmdbuf = "" ;
      lV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = "" ;
      lV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = "" ;
      lV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = "" ;
      lV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = "" ;
      lV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = "" ;
      lV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = "" ;
      lV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = "" ;
      AV64Emprcod = "" ;
      AV67Barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09X12_A130BarCodPar = new String[] {""} ;
      P09X12_A132BarCodReo = new byte[1] ;
      P09X12_A129BarCod = new int[1] ;
      P09X12_A396EmprCod = new String[] {""} ;
      P09X12_A8035AlbMaqTej = new String[] {""} ;
      P09X12_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X12_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X12_A4602AlbRMdlCod = new String[] {""} ;
      P09X12_A6464AlbRTelar = new String[] {""} ;
      P09X12_A6463AlbRLote = new String[] {""} ;
      P09X12_A46AlbREnt = new String[] {""} ;
      P09X12_A201BarPieEst = new byte[1] ;
      P09X12_A2186BarPieLoc = new String[] {""} ;
      P09X12_n2186BarPieLoc = new boolean[] {false} ;
      P09X12_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X12_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X12_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X12_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X12_A44AlbRecCod = new int[1] ;
      P09X12_A200BarPieCod = new String[] {""} ;
      AV116Moda21 = DecimalUtil.ZERO ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV76CliNom = "" ;
      AV77PedidoCliente = "" ;
      AV78Barser = "" ;
      AV79BarSerDsc = "" ;
      AV80Barcolnom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_almacentejidoexport__default(),
         new Object[] {
             new Object[] {
            P09X12_A130BarCodPar, P09X12_A132BarCodReo, P09X12_A129BarCod, P09X12_A396EmprCod, P09X12_A8035AlbMaqTej, P09X12_A6470AlbRTara, P09X12_A6465AlbRLu, P09X12_A4602AlbRMdlCod, P09X12_A6464AlbRTelar, P09X12_A6463AlbRLote,
            P09X12_A46AlbREnt, P09X12_A201BarPieEst, P09X12_A2186BarPieLoc, P09X12_n2186BarPieLoc, P09X12_A205BarPieMet, P09X12_A203BarPieKil, P09X12_A183BarMetLan, P09X12_A170BarKilLan, P09X12_A44AlbRecCod, P09X12_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV47TFBarPieEst ;
   private byte AV48TFBarPieEst_To ;
   private byte A201BarPieEst ;
   private byte AV100Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ;
   private byte AV101Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ;
   private byte AV66Barcodreo ;
   private byte A132BarCodReo ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV35TFAlbRecCod ;
   private int AV36TFAlbRecCod_To ;
   private int AV84GXV1 ;
   private int A44AlbRecCod ;
   private int AV88Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ;
   private int AV89Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ;
   private int AV65Barcod ;
   private int A129BarCod ;
   private int AV117GXV2 ;
   private int AV75Clicod ;
   private int AV81Barcolnum ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV37TFBarKilLan ;
   private java.math.BigDecimal AV38TFBarKilLan_To ;
   private java.math.BigDecimal AV39TFBarMetLan ;
   private java.math.BigDecimal AV40TFBarMetLan_To ;
   private java.math.BigDecimal AV41TFBarPieKil ;
   private java.math.BigDecimal AV42TFBarPieKil_To ;
   private java.math.BigDecimal AV43TFBarPieMet ;
   private java.math.BigDecimal AV44TFBarPieMet_To ;
   private java.math.BigDecimal AV57TFAlbRLu ;
   private java.math.BigDecimal AV58TFAlbRLu_To ;
   private java.math.BigDecimal AV59TFAlbRTara ;
   private java.math.BigDecimal AV60TFAlbRTara_To ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal AV90Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ;
   private java.math.BigDecimal AV91Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ;
   private java.math.BigDecimal AV92Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ;
   private java.math.BigDecimal AV93Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ;
   private java.math.BigDecimal AV94Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ;
   private java.math.BigDecimal AV95Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ;
   private java.math.BigDecimal AV96Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ;
   private java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ;
   private java.math.BigDecimal AV110Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ;
   private java.math.BigDecimal AV111Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ;
   private java.math.BigDecimal AV112Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ;
   private java.math.BigDecimal AV113Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ;
   private java.math.BigDecimal AV116Moda21 ;
   private String AV34TFBarPieCod_Sel ;
   private String AV33TFBarPieCod ;
   private String AV46TFBarPieLoc_Sel ;
   private String AV45TFBarPieLoc ;
   private String AV50TFAlbREnt_Sel ;
   private String AV49TFAlbREnt ;
   private String AV52TFAlbRLote_Sel ;
   private String AV51TFAlbRLote ;
   private String AV54TFAlbRTelar_Sel ;
   private String AV53TFAlbRTelar ;
   private String AV56TFAlbRMdlCod_Sel ;
   private String AV55TFAlbRMdlCod ;
   private String AV62TFAlbMaqTej_Sel ;
   private String AV61TFAlbMaqTej ;
   private String A200BarPieCod ;
   private String A2186BarPieLoc ;
   private String A46AlbREnt ;
   private String A6463AlbRLote ;
   private String A6464AlbRTelar ;
   private String A4602AlbRMdlCod ;
   private String A8035AlbMaqTej ;
   private String AV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ;
   private String AV87Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ;
   private String AV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ;
   private String AV99Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ;
   private String AV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ;
   private String AV103Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ;
   private String AV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ;
   private String AV105Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ;
   private String AV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ;
   private String AV107Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ;
   private String AV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ;
   private String AV109Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ;
   private String AV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ;
   private String AV115Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ;
   private String scmdbuf ;
   private String lV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ;
   private String lV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ;
   private String lV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ;
   private String lV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ;
   private String lV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ;
   private String lV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ;
   private String lV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ;
   private String AV64Emprcod ;
   private String AV67Barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV76CliNom ;
   private String AV77PedidoCliente ;
   private String AV78Barser ;
   private String AV79BarSerDsc ;
   private String AV80Barcolnom ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n2186BarPieLoc ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09X12_A130BarCodPar ;
   private byte[] P09X12_A132BarCodReo ;
   private int[] P09X12_A129BarCod ;
   private String[] P09X12_A396EmprCod ;
   private String[] P09X12_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X12_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X12_A6465AlbRLu ;
   private String[] P09X12_A4602AlbRMdlCod ;
   private String[] P09X12_A6464AlbRTelar ;
   private String[] P09X12_A6463AlbRLote ;
   private String[] P09X12_A46AlbREnt ;
   private byte[] P09X12_A201BarPieEst ;
   private String[] P09X12_A2186BarPieLoc ;
   private boolean[] P09X12_n2186BarPieLoc ;
   private java.math.BigDecimal[] P09X12_A205BarPieMet ;
   private java.math.BigDecimal[] P09X12_A203BarPieKil ;
   private java.math.BigDecimal[] P09X12_A183BarMetLan ;
   private java.math.BigDecimal[] P09X12_A170BarKilLan ;
   private int[] P09X12_A44AlbRecCod ;
   private String[] P09X12_A200BarPieCod ;
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

final  class consultadeproduccion_almacentejidoexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09X12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV88Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV89Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV92Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV93Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV94Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV95Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV96Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV99Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV100Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV101Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV103Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV105Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV107Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV109Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV110Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV111Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV112Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV113Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV115Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV64Emprcod ,
                                          int AV65Barcod ,
                                          byte AV66Barcodreo ,
                                          String AV67Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[34];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbRLote, T2.AlbREnt, T1.BarPieEst," ;
      scmdbuf += " T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV89Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV98Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV101Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV104Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV106Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV108Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKilLan" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKilLan DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMetLan" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMetLan DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieKil" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieKil DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieMet" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieMet DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieLoc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieLoc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieEst" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbREnt" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbREnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRLote" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRLote DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRTelar" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRTelar DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRMdlCod" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRMdlCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRLu" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRLu DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRTara" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRTara DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbMaqTej" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbMaqTej DESC" ;
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
                  return conditional_P09X12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09X12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
      }
   }

}

