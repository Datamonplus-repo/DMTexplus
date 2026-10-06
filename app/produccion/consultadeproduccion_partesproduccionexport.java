package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_partesproduccionexport extends GXProcedure
{
   public consultadeproduccion_partesproduccionexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_partesproduccionexport.class ), "" );
   }

   public consultadeproduccion_partesproduccionexport( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultadeproduccion_partesproduccionexport.this.aP1 = new String[] {""};
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
      consultadeproduccion_partesproduccionexport.this.aP0 = aP0;
      consultadeproduccion_partesproduccionexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV65Var_Hdr = AV66WebSession.getValue("&Var_Hdr") ;
      AV61EmprCod = GXutil.substring( AV65Var_Hdr, 1, 3) ;
      AV62BarCod = (int)(GXutil.lval( GXutil.substring( AV65Var_Hdr, 4, 8))) ;
      AV63BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV65Var_Hdr, 12, 1))) ;
      AV64BarCodPar = GXutil.substring( AV65Var_Hdr, 13, 1) ;
      AV66WebSession.remove("&Var_Hdr");
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_PartesProduccionExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (0==AV34TFBarOrdLin) && (0==AV35TFBarOrdLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFBarOrdLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFBarOrdLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFFase_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFFase_Sel, GXv_char5) ;
         consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFFase)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFFase, GXv_char5) ;
            consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFFase_Dsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFFase_Dsc_Sel, GXv_char5) ;
         consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFFase_Dsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFFase_Dsc, GXv_char5) ;
            consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFMaqCod_Sel, GXv_char5) ;
         consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFMaqCod, GXv_char5) ;
            consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFMaqDsc_Sel, GXv_char5) ;
         consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFMaqDsc, GXv_char5) ;
            consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV46TFGruOpeCod) && (0==AV47TFGruOpeCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFGruOpeCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFGruOpeCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFGruopecod_Nombre_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFGruopecod_Nombre_Sel, GXv_char5) ;
         consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFGruopecod_Nombre)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFGruopecod_Nombre, GXv_char5) ;
            consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFHisProKgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFHisProKgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFHisProKgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFHisProKgr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFHisProMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFHisProMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFHisProMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFHisProMtr_To)) );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV52TFHisProDTI) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV52TFHisProDTI );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV54TFHisProDTF) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV54TFHisProDTF );
      }
      if ( ! ( (0==AV56TFParCod) && (0==AV57TFParCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFParCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFParCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFParCodNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFParCodNom_Sel, GXv_char5) ;
         consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFParCodNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_partesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFParCodNom, GXv_char5) ;
            consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV76GXV1 = 1 ;
      while ( AV76GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV76GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV76GXV1 = (int)(AV76GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV78Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV61EmprCod ;
      AV79Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV62BarCod ;
      AV80Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV63BarCodReo ;
      AV81Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV64BarCodPar ;
      AV82Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV34TFBarOrdLin ;
      AV83Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV35TFBarOrdLin_To ;
      AV84Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV36TFFase ;
      AV85Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV37TFFase_Sel ;
      AV86Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV38TFFase_Dsc ;
      AV87Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV39TFFase_Dsc_Sel ;
      AV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV40TFMaqCod ;
      AV89Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV42TFMaqDsc ;
      AV91Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV92Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV46TFGruOpeCod ;
      AV93Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV47TFGruOpeCod_To ;
      AV94Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV44TFGruopecod_Nombre ;
      AV95Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV45TFGruopecod_Nombre_Sel ;
      AV96Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV48TFHisProKgr ;
      AV97Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV49TFHisProKgr_To ;
      AV98Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV50TFHisProMtr ;
      AV99Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV51TFHisProMtr_To ;
      AV100Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV52TFHisProDTI ;
      AV101Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV54TFHisProDTF ;
      AV102Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV56TFParCod ;
      AV103Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV57TFParCod_To ;
      AV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV58TFParCodNom ;
      AV105Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV59TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV82Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV83Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV85Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV84Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV91Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV92Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV93Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV98Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV99Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV100Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV101Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV102Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV103Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV105Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV95Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV94Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV78Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV79Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV80Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV81Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV84Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV84Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P09LJ2 */
      pr_default.execute(0, new Object[] {AV78Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV79Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV80Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV81Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV82Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV83Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV84Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV85Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV89Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV91Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV92Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV93Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV96Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV97Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV98Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV99Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV100Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV101Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV102Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV103Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV105Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A867ParCodNom = P09LJ2_A867ParCodNom[0] ;
         n867ParCodNom = P09LJ2_n867ParCodNom[0] ;
         A656ParCod = P09LJ2_A656ParCod[0] ;
         n656ParCod = P09LJ2_n656ParCod[0] ;
         A4441HisProDTF = P09LJ2_A4441HisProDTF[0] ;
         n4441HisProDTF = P09LJ2_n4441HisProDTF[0] ;
         A4440HisProDTI = P09LJ2_A4440HisProDTI[0] ;
         n4440HisProDTI = P09LJ2_n4440HisProDTI[0] ;
         A1526HisProMtr = P09LJ2_A1526HisProMtr[0] ;
         A1525HisProKgr = P09LJ2_A1525HisProKgr[0] ;
         A606MaqDsc = P09LJ2_A606MaqDsc[0] ;
         n606MaqDsc = P09LJ2_n606MaqDsc[0] ;
         A602MaqCod = P09LJ2_A602MaqCod[0] ;
         A194BarOrdLin = P09LJ2_A194BarOrdLin[0] ;
         A130BarCodPar = P09LJ2_A130BarCodPar[0] ;
         A132BarCodReo = P09LJ2_A132BarCodReo[0] ;
         A129BarCod = P09LJ2_A129BarCod[0] ;
         A461Fase = P09LJ2_A461Fase[0] ;
         A503GruOpeCod = P09LJ2_A503GruOpeCod[0] ;
         A396EmprCod = P09LJ2_A396EmprCod[0] ;
         A558HisProFec = P09LJ2_A558HisProFec[0] ;
         A561HisProLin = P09LJ2_A561HisProLin[0] ;
         A606MaqDsc = P09LJ2_A606MaqDsc[0] ;
         n606MaqDsc = P09LJ2_n606MaqDsc[0] ;
         A867ParCodNom = P09LJ2_A867ParCodNom[0] ;
         n867ParCodNom = P09LJ2_n867ParCodNom[0] ;
         GXt_char4 = A14027Fase_Dsc ;
         GXv_char5[0] = GXt_char4 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char5) ;
         consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         A14027Fase_Dsc = GXt_char4 ;
         if ( ! ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV86Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV87Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char4 = A14028Gruopecod_ ;
               GXv_char5[0] = GXt_char4 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char5) ;
               consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
               A14028Gruopecod_ = GXt_char4 ;
               if ( ! ( (GXutil.strcmp("", AV95Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV94Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV95Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV95Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
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
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A194BarOrdLin );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A461Fase, GXv_char5) ;
                        consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14027Fase_Dsc, GXv_char5) ;
                        consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
                        consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A606MaqDsc, GXv_char5) ;
                        consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A503GruOpeCod );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14028Gruopecod_, GXv_char5) ;
                        consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4440HisProDTI );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4441HisProDTF );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A656ParCod );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A867ParCodNom, GXv_char5) ;
                        consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
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
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarOrdLin", "", "Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Fase", "", "Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Fase_Dsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCod", "", "Código Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "GruOpeCod", "", "Operario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Gruopecod_Nombre", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProKgr", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProMtr", "", "Metros", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProDTI", "", "Inicio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProDTF", "", "Fin", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ParCod", "", "Paro", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ParCodNom", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector", GXv_char5) ;
      consultadeproduccion_partesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_PartesProduccionGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV106GXV2 = 1 ;
      while ( AV106GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV106GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV34TFBarOrdLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFBarOrdLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV36TFFase = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV37TFFase_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_DSC") == 0 )
         {
            AV38TFFase_Dsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_DSC_SEL") == 0 )
         {
            AV39TFFase_Dsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV40TFMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV41TFMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV42TFMaqDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV43TFMaqDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV46TFGruOpeCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFGruOpeCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD_NOMBRE") == 0 )
         {
            AV44TFGruopecod_Nombre = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD_NOMBRE_SEL") == 0 )
         {
            AV45TFGruopecod_Nombre_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV48TFHisProKgr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFHisProKgr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV50TFHisProMtr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFHisProMtr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV52TFHisProDTI = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV54TFHisProDTF = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV56TFParCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFParCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV58TFParCodNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV59TFParCodNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV61EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV62BarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV63BarCodReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV64BarCodPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV67Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV68CliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV69PedidoCliente = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV70Barser = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV71BarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV72Barcolnom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV73Barcolnum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV106GXV2 = (int)(AV106GXV2+1) ;
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
      this.aP0[0] = consultadeproduccion_partesproduccionexport.this.AV11Filename;
      this.aP1[0] = consultadeproduccion_partesproduccionexport.this.AV12ErrorMessage;
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
      AV65Var_Hdr = "" ;
      AV66WebSession = httpContext.getWebSession();
      AV61EmprCod = "" ;
      AV64BarCodPar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV37TFFase_Sel = "" ;
      AV36TFFase = "" ;
      AV39TFFase_Dsc_Sel = "" ;
      AV38TFFase_Dsc = "" ;
      AV41TFMaqCod_Sel = "" ;
      AV40TFMaqCod = "" ;
      AV43TFMaqDsc_Sel = "" ;
      AV42TFMaqDsc = "" ;
      AV45TFGruopecod_Nombre_Sel = "" ;
      AV44TFGruopecod_Nombre = "" ;
      AV48TFHisProKgr = DecimalUtil.ZERO ;
      AV49TFHisProKgr_To = DecimalUtil.ZERO ;
      AV50TFHisProMtr = DecimalUtil.ZERO ;
      AV51TFHisProMtr_To = DecimalUtil.ZERO ;
      AV52TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV54TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV59TFParCodNom_Sel = "" ;
      AV58TFParCodNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A461Fase = "" ;
      A14027Fase_Dsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A14028Gruopecod_ = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A867ParCodNom = "" ;
      AV78Produccion_consultadeproduccion_partesproduccionds_1_emprcod = "" ;
      AV81Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = "" ;
      AV84Produccion_consultadeproduccion_partesproduccionds_7_tffase = "" ;
      AV85Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = "" ;
      AV86Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = "" ;
      AV87Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = "" ;
      AV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = "" ;
      AV89Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = "" ;
      AV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = "" ;
      AV91Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = "" ;
      AV94Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = "" ;
      AV95Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = "" ;
      AV96Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV97Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV98Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV99Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV100Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV101Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = "" ;
      AV105Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV84Produccion_consultadeproduccion_partesproduccionds_7_tffase = "" ;
      lV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = "" ;
      lV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = "" ;
      lV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09LJ2_A867ParCodNom = new String[] {""} ;
      P09LJ2_n867ParCodNom = new boolean[] {false} ;
      P09LJ2_A656ParCod = new short[1] ;
      P09LJ2_n656ParCod = new boolean[] {false} ;
      P09LJ2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09LJ2_n4441HisProDTF = new boolean[] {false} ;
      P09LJ2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09LJ2_n4440HisProDTI = new boolean[] {false} ;
      P09LJ2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LJ2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LJ2_A606MaqDsc = new String[] {""} ;
      P09LJ2_n606MaqDsc = new boolean[] {false} ;
      P09LJ2_A602MaqCod = new String[] {""} ;
      P09LJ2_A194BarOrdLin = new short[1] ;
      P09LJ2_A130BarCodPar = new String[] {""} ;
      P09LJ2_A132BarCodReo = new byte[1] ;
      P09LJ2_A129BarCod = new int[1] ;
      P09LJ2_A461Fase = new String[] {""} ;
      P09LJ2_A503GruOpeCod = new int[1] ;
      P09LJ2_A396EmprCod = new String[] {""} ;
      P09LJ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LJ2_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV68CliNom = "" ;
      AV69PedidoCliente = "" ;
      AV70Barser = "" ;
      AV71BarSerDsc = "" ;
      AV72Barcolnom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_partesproduccionexport__default(),
         new Object[] {
             new Object[] {
            P09LJ2_A867ParCodNom, P09LJ2_n867ParCodNom, P09LJ2_A656ParCod, P09LJ2_n656ParCod, P09LJ2_A4441HisProDTF, P09LJ2_n4441HisProDTF, P09LJ2_A4440HisProDTI, P09LJ2_n4440HisProDTI, P09LJ2_A1526HisProMtr, P09LJ2_A1525HisProKgr,
            P09LJ2_A606MaqDsc, P09LJ2_n606MaqDsc, P09LJ2_A602MaqCod, P09LJ2_A194BarOrdLin, P09LJ2_A130BarCodPar, P09LJ2_A132BarCodReo, P09LJ2_A129BarCod, P09LJ2_A461Fase, P09LJ2_A503GruOpeCod, P09LJ2_A396EmprCod,
            P09LJ2_A558HisProFec, P09LJ2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV63BarCodReo ;
   private byte AV80Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ;
   private byte A132BarCodReo ;
   private short AV34TFBarOrdLin ;
   private short AV35TFBarOrdLin_To ;
   private short AV56TFParCod ;
   private short AV57TFParCod_To ;
   private short GXv_int3[] ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short AV82Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ;
   private short AV83Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ;
   private short AV102Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ;
   private short AV103Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV62BarCod ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV46TFGruOpeCod ;
   private int AV47TFGruOpeCod_To ;
   private int AV76GXV1 ;
   private int A503GruOpeCod ;
   private int AV79Produccion_consultadeproduccion_partesproduccionds_2_barcod ;
   private int AV92Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ;
   private int AV93Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV106GXV2 ;
   private int AV67Clicod ;
   private int AV73Barcolnum ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV48TFHisProKgr ;
   private java.math.BigDecimal AV49TFHisProKgr_To ;
   private java.math.BigDecimal AV50TFHisProMtr ;
   private java.math.BigDecimal AV51TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV96Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ;
   private java.math.BigDecimal AV97Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV98Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ;
   private java.math.BigDecimal AV99Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ;
   private String AV65Var_Hdr ;
   private String AV61EmprCod ;
   private String AV64BarCodPar ;
   private String AV37TFFase_Sel ;
   private String AV36TFFase ;
   private String AV39TFFase_Dsc_Sel ;
   private String AV38TFFase_Dsc ;
   private String AV41TFMaqCod_Sel ;
   private String AV40TFMaqCod ;
   private String AV43TFMaqDsc_Sel ;
   private String AV42TFMaqDsc ;
   private String AV45TFGruopecod_Nombre_Sel ;
   private String AV44TFGruopecod_Nombre ;
   private String AV59TFParCodNom_Sel ;
   private String AV58TFParCodNom ;
   private String A461Fase ;
   private String A14027Fase_Dsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A14028Gruopecod_ ;
   private String A867ParCodNom ;
   private String AV78Produccion_consultadeproduccion_partesproduccionds_1_emprcod ;
   private String AV81Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ;
   private String AV84Produccion_consultadeproduccion_partesproduccionds_7_tffase ;
   private String AV85Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ;
   private String AV86Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ;
   private String AV87Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ;
   private String AV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ;
   private String AV89Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ;
   private String AV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ;
   private String AV91Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ;
   private String AV94Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ;
   private String AV95Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ;
   private String AV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ;
   private String AV105Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV84Produccion_consultadeproduccion_partesproduccionds_7_tffase ;
   private String lV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ;
   private String lV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ;
   private String lV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV68CliNom ;
   private String AV69PedidoCliente ;
   private String AV70Barser ;
   private String AV71BarSerDsc ;
   private String AV72Barcolnom ;
   private java.util.Date AV52TFHisProDTI ;
   private java.util.Date AV54TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV100Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ;
   private java.util.Date AV101Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n867ParCodNom ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV66WebSession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LJ2_A867ParCodNom ;
   private boolean[] P09LJ2_n867ParCodNom ;
   private short[] P09LJ2_A656ParCod ;
   private boolean[] P09LJ2_n656ParCod ;
   private java.util.Date[] P09LJ2_A4441HisProDTF ;
   private boolean[] P09LJ2_n4441HisProDTF ;
   private java.util.Date[] P09LJ2_A4440HisProDTI ;
   private boolean[] P09LJ2_n4440HisProDTI ;
   private java.math.BigDecimal[] P09LJ2_A1526HisProMtr ;
   private java.math.BigDecimal[] P09LJ2_A1525HisProKgr ;
   private String[] P09LJ2_A606MaqDsc ;
   private boolean[] P09LJ2_n606MaqDsc ;
   private String[] P09LJ2_A602MaqCod ;
   private short[] P09LJ2_A194BarOrdLin ;
   private String[] P09LJ2_A130BarCodPar ;
   private byte[] P09LJ2_A132BarCodReo ;
   private int[] P09LJ2_A129BarCod ;
   private String[] P09LJ2_A461Fase ;
   private int[] P09LJ2_A503GruOpeCod ;
   private String[] P09LJ2_A396EmprCod ;
   private java.util.Date[] P09LJ2_A558HisProFec ;
   private int[] P09LJ2_A561HisProLin ;
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

final  class consultadeproduccion_partesproduccionexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV82Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV83Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV85Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV84Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV89Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV91Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV92Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV93Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV96Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV100Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV101Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV102Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV103Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV105Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV95Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV94Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV78Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV79Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV80Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV81Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc, T1.MaqCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.Fase, T1.GruOpeCod, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      scmdbuf += " LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV82Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV83Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV84Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV92Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV93Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV100Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV102Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Fase" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.Fase DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GruOpeCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.GruOpeCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProKgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProMtr" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProMtr DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTI" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProDTI DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTF" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProDTF DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ParCod" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ParCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ParCodNom" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.ParCodNom DESC" ;
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
                  return conditional_P09LJ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
      }
   }

}

