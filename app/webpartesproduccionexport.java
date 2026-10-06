package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webpartesproduccionexport extends GXProcedure
{
   public webpartesproduccionexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webpartesproduccionexport.class ), "" );
   }

   public webpartesproduccionexport( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webpartesproduccionexport.this.aP1 = new String[] {""};
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
      webpartesproduccionexport.this.aP0 = aP0;
      webpartesproduccionexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebPartesProduccionExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV104FilterFullText, GXv_char5) ;
      webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV48TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFMaqCod_Sel, GXv_char5) ;
         webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFMaqCod, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV100TFMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV100TFMaqDsc_Sel, GXv_char5) ;
         webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV99TFMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99TFMaqDsc, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFHisProFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV49TFHisProFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV69TFHisProLin) && (0==AV70TFHisProLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV69TFHisProLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV70TFHisProLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV72TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFBarNHdr_Sel, GXv_char5) ;
         webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFBarNHdr, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV73TFGruOpeCod) && (0==AV74TFGruOpeCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV73TFGruOpeCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV74TFGruOpeCod_To );
      }
      if ( ! ( (0==AV75TFBarOrdLin) && (0==AV76TFBarOrdLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV75TFBarOrdLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV76TFBarOrdLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV78TFFase_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFFase_Sel, GXv_char5) ;
         webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFFase)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFFase, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV81TFHisProDTI) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV81TFHisProDTI );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV83TFHisProDTF) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV83TFHisProDTF );
      }
      if ( ! ( (GXutil.strcmp("", AV86TFHisProF_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV86TFHisProF_Sel, GXv_char5) ;
         webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV85TFHisProF)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFHisProF, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV87TFHisProTur) && (0==AV88TFHisProTur_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV87TFHisProTur );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV88TFHisProTur_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFHisProKgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFHisProKgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89TFHisProKgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV90TFHisProKgr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFHisProMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFHisProMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV91TFHisProMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV92TFHisProMtr_To)) );
      }
      if ( ! ( (0==AV93TFHisProNpzs) && (0==AV94TFHisProNpzs_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pcs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV93TFHisProNpzs );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV94TFHisProNpzs_To );
      }
      if ( ! ( (GXutil.strcmp("", AV98TFParCodNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV98TFParCodNom_Sel, GXv_char5) ;
         webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV97TFParCodNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webpartesproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV97TFParCodNom, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV42VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV30Session.getValue("WebPartesProduccionColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV30Session.getValue("WebPartesProduccionColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV107GXV1 = 1 ;
      while ( AV107GXV1 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV107GXV1));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV107GXV1 = (int)(AV107GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV109Webpartesproduccionds_1_filterfulltext = AV104FilterFullText ;
      AV110Webpartesproduccionds_2_tfmaqcod = AV47TFMaqCod ;
      AV111Webpartesproduccionds_3_tfmaqcod_sel = AV48TFMaqCod_Sel ;
      AV112Webpartesproduccionds_4_tfmaqdsc = AV99TFMaqDsc ;
      AV113Webpartesproduccionds_5_tfmaqdsc_sel = AV100TFMaqDsc_Sel ;
      AV114Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV115Webpartesproduccionds_7_tfhisprolin = AV69TFHisProLin ;
      AV116Webpartesproduccionds_8_tfhisprolin_to = AV70TFHisProLin_To ;
      AV117Webpartesproduccionds_9_tfbarnhdr = AV71TFBarNHdr ;
      AV118Webpartesproduccionds_10_tfbarnhdr_sel = AV72TFBarNHdr_Sel ;
      AV119Webpartesproduccionds_11_tfgruopecod = AV73TFGruOpeCod ;
      AV120Webpartesproduccionds_12_tfgruopecod_to = AV74TFGruOpeCod_To ;
      AV121Webpartesproduccionds_13_tfbarordlin = AV75TFBarOrdLin ;
      AV122Webpartesproduccionds_14_tfbarordlin_to = AV76TFBarOrdLin_To ;
      AV123Webpartesproduccionds_15_tffase = AV77TFFase ;
      AV124Webpartesproduccionds_16_tffase_sel = AV78TFFase_Sel ;
      AV125Webpartesproduccionds_17_tfhisprodti = AV81TFHisProDTI ;
      AV126Webpartesproduccionds_18_tfhisprodtf = AV83TFHisProDTF ;
      AV127Webpartesproduccionds_19_tfhisprof = AV85TFHisProF ;
      AV128Webpartesproduccionds_20_tfhisprof_sel = AV86TFHisProF_Sel ;
      AV129Webpartesproduccionds_21_tfhisprotur = AV87TFHisProTur ;
      AV130Webpartesproduccionds_22_tfhisprotur_to = AV88TFHisProTur_To ;
      AV131Webpartesproduccionds_23_tfhisprokgr = AV89TFHisProKgr ;
      AV132Webpartesproduccionds_24_tfhisprokgr_to = AV90TFHisProKgr_To ;
      AV133Webpartesproduccionds_25_tfhispromtr = AV91TFHisProMtr ;
      AV134Webpartesproduccionds_26_tfhispromtr_to = AV92TFHisProMtr_To ;
      AV135Webpartesproduccionds_27_tfhispronpzs = AV93TFHisProNpzs ;
      AV136Webpartesproduccionds_28_tfhispronpzs_to = AV94TFHisProNpzs_To ;
      AV137Webpartesproduccionds_29_tfparcodnom = AV97TFParCodNom ;
      AV138Webpartesproduccionds_30_tfparcodnom_sel = AV98TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV109Webpartesproduccionds_1_filterfulltext ,
                                           AV111Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV110Webpartesproduccionds_2_tfmaqcod ,
                                           AV113Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV112Webpartesproduccionds_4_tfmaqdsc ,
                                           AV114Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV115Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV116Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV118Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV117Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV119Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV120Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV121Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV122Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV124Webpartesproduccionds_16_tffase_sel ,
                                           AV123Webpartesproduccionds_15_tffase ,
                                           AV125Webpartesproduccionds_17_tfhisprodti ,
                                           AV126Webpartesproduccionds_18_tfhisprodtf ,
                                           AV128Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV127Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV129Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV130Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV131Webpartesproduccionds_23_tfhisprokgr ,
                                           AV132Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV133Webpartesproduccionds_25_tfhispromtr ,
                                           AV134Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV135Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV136Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV138Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV137Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV109Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV109Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV110Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV110Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV112Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV112Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV117Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV117Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV123Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV123Webpartesproduccionds_15_tffase), 8, "%") ;
      lV127Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV127Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV137Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV137Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor P08BB2 */
      pr_default.execute(0, new Object[] {lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV109Webpartesproduccionds_1_filterfulltext, lV110Webpartesproduccionds_2_tfmaqcod, AV111Webpartesproduccionds_3_tfmaqcod_sel, lV112Webpartesproduccionds_4_tfmaqdsc, AV113Webpartesproduccionds_5_tfmaqdsc_sel, AV114Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV115Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV116Webpartesproduccionds_8_tfhisprolin_to), lV117Webpartesproduccionds_9_tfbarnhdr, AV118Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV119Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV120Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV121Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV122Webpartesproduccionds_14_tfbarordlin_to), lV123Webpartesproduccionds_15_tffase, AV124Webpartesproduccionds_16_tffase_sel, AV125Webpartesproduccionds_17_tfhisprodti, AV126Webpartesproduccionds_18_tfhisprodtf, lV127Webpartesproduccionds_19_tfhisprof, AV128Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV129Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV130Webpartesproduccionds_22_tfhisprotur_to), AV131Webpartesproduccionds_23_tfhisprokgr, AV132Webpartesproduccionds_24_tfhisprokgr_to, AV133Webpartesproduccionds_25_tfhispromtr, AV134Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV135Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV136Webpartesproduccionds_28_tfhispronpzs_to), lV137Webpartesproduccionds_29_tfparcodnom, AV138Webpartesproduccionds_30_tfparcodnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08BB2_A396EmprCod[0] ;
         A656ParCod = P08BB2_A656ParCod[0] ;
         n656ParCod = P08BB2_n656ParCod[0] ;
         A867ParCodNom = P08BB2_A867ParCodNom[0] ;
         n867ParCodNom = P08BB2_n867ParCodNom[0] ;
         A4714HisProNpzs = P08BB2_A4714HisProNpzs[0] ;
         A1526HisProMtr = P08BB2_A1526HisProMtr[0] ;
         A1525HisProKgr = P08BB2_A1525HisProKgr[0] ;
         A566HisProTur = P08BB2_A566HisProTur[0] ;
         A557HisProF = P08BB2_A557HisProF[0] ;
         A4441HisProDTF = P08BB2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08BB2_n4441HisProDTF[0] ;
         A4440HisProDTI = P08BB2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08BB2_n4440HisProDTI[0] ;
         A461Fase = P08BB2_A461Fase[0] ;
         A194BarOrdLin = P08BB2_A194BarOrdLin[0] ;
         A503GruOpeCod = P08BB2_A503GruOpeCod[0] ;
         A561HisProLin = P08BB2_A561HisProLin[0] ;
         A558HisProFec = P08BB2_A558HisProFec[0] ;
         A606MaqDsc = P08BB2_A606MaqDsc[0] ;
         n606MaqDsc = P08BB2_n606MaqDsc[0] ;
         A602MaqCod = P08BB2_A602MaqCod[0] ;
         A130BarCodPar = P08BB2_A130BarCodPar[0] ;
         A132BarCodReo = P08BB2_A132BarCodReo[0] ;
         A129BarCod = P08BB2_A129BarCod[0] ;
         A867ParCodNom = P08BB2_A867ParCodNom[0] ;
         n867ParCodNom = P08BB2_n867ParCodNom[0] ;
         A606MaqDsc = P08BB2_A606MaqDsc[0] ;
         n606MaqDsc = P08BB2_n606MaqDsc[0] ;
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
         AV42VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A606MaqDsc, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A558HisProFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A561HisProLin );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A503GruOpeCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A194BarOrdLin );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A461Fase, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setDate( A4440HisProDTI );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setDate( A4441HisProDTF );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A557HisProF, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A566HisProTur );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A4714HisProNpzs );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A867ParCodNom, GXv_char5) ;
            webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
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
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqCod", "", "Código Máquina", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqDsc", "", "Descripcion Maquina", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProFec", "", "Fecha", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProLin", "", "#", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNHdr", "", "N Hdr", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "GruOpeCod", "", "Operario", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarOrdLin", "", "Orden", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Fase", "", "Fase", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProDTI", "", "Inicio", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProDTF", "", "Fin", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProF", "", "F?", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProTur", "", "T", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProKgr", "", "Kgs", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProMtr", "", "Mts", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProNpzs", "", "Pcs", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ParCodNom", "", "Paro", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebPartesProduccionColumnsSelector", GXv_char5) ;
      webpartesproduccionexport.this.GXt_char4 = GXv_char5[0] ;
      AV38UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue("WebPartesProduccionGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebPartesProduccionGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV30Session.getValue("WebPartesProduccionGridState"), null, null);
      }
      AV16OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV139GXV2 = 1 ;
      while ( AV139GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV139GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV104FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV47TFMaqCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV48TFMaqCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV99TFMaqDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV100TFMaqDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV49TFHisProFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV69TFHisProLin = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFHisProLin_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV71TFBarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV72TFBarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV73TFGruOpeCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFGruOpeCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV75TFBarOrdLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV76TFBarOrdLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV77TFFase = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV78TFFase_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV81TFHisProDTI = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV83TFHisProDTF = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV85TFHisProF = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV86TFHisProF_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV87TFHisProTur = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV88TFHisProTur_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV89TFHisProKgr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV90TFHisProKgr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV91TFHisProMtr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV92TFHisProMtr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV93TFHisProNpzs = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94TFHisProNpzs_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV97TFParCodNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV98TFParCodNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV139GXV2 = (int)(AV139GXV2+1) ;
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
      this.aP0[0] = webpartesproduccionexport.this.AV11Filename;
      this.aP1[0] = webpartesproduccionexport.this.AV12ErrorMessage;
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
      AV104FilterFullText = "" ;
      AV48TFMaqCod_Sel = "" ;
      AV47TFMaqCod = "" ;
      AV100TFMaqDsc_Sel = "" ;
      AV99TFMaqDsc = "" ;
      AV49TFHisProFec = GXutil.nullDate() ;
      AV72TFBarNHdr_Sel = "" ;
      AV71TFBarNHdr = "" ;
      AV78TFFase_Sel = "" ;
      AV77TFFase = "" ;
      AV81TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV83TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV86TFHisProF_Sel = "" ;
      AV85TFHisProF = "" ;
      AV89TFHisProKgr = DecimalUtil.ZERO ;
      AV90TFHisProKgr_To = DecimalUtil.ZERO ;
      AV91TFHisProMtr = DecimalUtil.ZERO ;
      AV92TFHisProMtr_To = DecimalUtil.ZERO ;
      AV98TFParCodNom_Sel = "" ;
      AV97TFParCodNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV30Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A461Fase = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      AV109Webpartesproduccionds_1_filterfulltext = "" ;
      AV110Webpartesproduccionds_2_tfmaqcod = "" ;
      AV111Webpartesproduccionds_3_tfmaqcod_sel = "" ;
      AV112Webpartesproduccionds_4_tfmaqdsc = "" ;
      AV113Webpartesproduccionds_5_tfmaqdsc_sel = "" ;
      AV114Webpartesproduccionds_6_tfhisprofec = GXutil.nullDate() ;
      AV117Webpartesproduccionds_9_tfbarnhdr = "" ;
      AV118Webpartesproduccionds_10_tfbarnhdr_sel = "" ;
      AV123Webpartesproduccionds_15_tffase = "" ;
      AV124Webpartesproduccionds_16_tffase_sel = "" ;
      AV125Webpartesproduccionds_17_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV126Webpartesproduccionds_18_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV127Webpartesproduccionds_19_tfhisprof = "" ;
      AV128Webpartesproduccionds_20_tfhisprof_sel = "" ;
      AV131Webpartesproduccionds_23_tfhisprokgr = DecimalUtil.ZERO ;
      AV132Webpartesproduccionds_24_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV133Webpartesproduccionds_25_tfhispromtr = DecimalUtil.ZERO ;
      AV134Webpartesproduccionds_26_tfhispromtr_to = DecimalUtil.ZERO ;
      AV137Webpartesproduccionds_29_tfparcodnom = "" ;
      AV138Webpartesproduccionds_30_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV109Webpartesproduccionds_1_filterfulltext = "" ;
      lV110Webpartesproduccionds_2_tfmaqcod = "" ;
      lV112Webpartesproduccionds_4_tfmaqdsc = "" ;
      lV117Webpartesproduccionds_9_tfbarnhdr = "" ;
      lV123Webpartesproduccionds_15_tffase = "" ;
      lV127Webpartesproduccionds_19_tfhisprof = "" ;
      lV137Webpartesproduccionds_29_tfparcodnom = "" ;
      A130BarCodPar = "" ;
      P08BB2_A396EmprCod = new String[] {""} ;
      P08BB2_A656ParCod = new short[1] ;
      P08BB2_n656ParCod = new boolean[] {false} ;
      P08BB2_A867ParCodNom = new String[] {""} ;
      P08BB2_n867ParCodNom = new boolean[] {false} ;
      P08BB2_A4714HisProNpzs = new short[1] ;
      P08BB2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BB2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BB2_A566HisProTur = new byte[1] ;
      P08BB2_A557HisProF = new String[] {""} ;
      P08BB2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08BB2_n4441HisProDTF = new boolean[] {false} ;
      P08BB2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08BB2_n4440HisProDTI = new boolean[] {false} ;
      P08BB2_A461Fase = new String[] {""} ;
      P08BB2_A194BarOrdLin = new short[1] ;
      P08BB2_A503GruOpeCod = new int[1] ;
      P08BB2_A561HisProLin = new int[1] ;
      P08BB2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BB2_A606MaqDsc = new String[] {""} ;
      P08BB2_n606MaqDsc = new boolean[] {false} ;
      P08BB2_A602MaqCod = new String[] {""} ;
      P08BB2_A130BarCodPar = new String[] {""} ;
      P08BB2_A132BarCodReo = new byte[1] ;
      P08BB2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webpartesproduccionexport__default(),
         new Object[] {
             new Object[] {
            P08BB2_A396EmprCod, P08BB2_A656ParCod, P08BB2_n656ParCod, P08BB2_A867ParCodNom, P08BB2_n867ParCodNom, P08BB2_A4714HisProNpzs, P08BB2_A1526HisProMtr, P08BB2_A1525HisProKgr, P08BB2_A566HisProTur, P08BB2_A557HisProF,
            P08BB2_A4441HisProDTF, P08BB2_n4441HisProDTF, P08BB2_A4440HisProDTI, P08BB2_n4440HisProDTI, P08BB2_A461Fase, P08BB2_A194BarOrdLin, P08BB2_A503GruOpeCod, P08BB2_A561HisProLin, P08BB2_A558HisProFec, P08BB2_A606MaqDsc,
            P08BB2_n606MaqDsc, P08BB2_A602MaqCod, P08BB2_A130BarCodPar, P08BB2_A132BarCodReo, P08BB2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV87TFHisProTur ;
   private byte AV88TFHisProTur_To ;
   private byte A566HisProTur ;
   private byte AV129Webpartesproduccionds_21_tfhisprotur ;
   private byte AV130Webpartesproduccionds_22_tfhisprotur_to ;
   private byte A132BarCodReo ;
   private short AV75TFBarOrdLin ;
   private short AV76TFBarOrdLin_To ;
   private short AV93TFHisProNpzs ;
   private short AV94TFHisProNpzs_To ;
   private short GXv_int3[] ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short AV121Webpartesproduccionds_13_tfbarordlin ;
   private short AV122Webpartesproduccionds_14_tfbarordlin_to ;
   private short AV135Webpartesproduccionds_27_tfhispronpzs ;
   private short AV136Webpartesproduccionds_28_tfhispronpzs_to ;
   private short AV16OrderedBy ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV69TFHisProLin ;
   private int AV70TFHisProLin_To ;
   private int AV73TFGruOpeCod ;
   private int AV74TFGruOpeCod_To ;
   private int AV107GXV1 ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int AV115Webpartesproduccionds_7_tfhisprolin ;
   private int AV116Webpartesproduccionds_8_tfhisprolin_to ;
   private int AV119Webpartesproduccionds_11_tfgruopecod ;
   private int AV120Webpartesproduccionds_12_tfgruopecod_to ;
   private int A129BarCod ;
   private int AV139GXV2 ;
   private long AV42VisibleColumnCount ;
   private java.math.BigDecimal AV89TFHisProKgr ;
   private java.math.BigDecimal AV90TFHisProKgr_To ;
   private java.math.BigDecimal AV91TFHisProMtr ;
   private java.math.BigDecimal AV92TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV131Webpartesproduccionds_23_tfhisprokgr ;
   private java.math.BigDecimal AV132Webpartesproduccionds_24_tfhisprokgr_to ;
   private java.math.BigDecimal AV133Webpartesproduccionds_25_tfhispromtr ;
   private java.math.BigDecimal AV134Webpartesproduccionds_26_tfhispromtr_to ;
   private String AV48TFMaqCod_Sel ;
   private String AV47TFMaqCod ;
   private String AV100TFMaqDsc_Sel ;
   private String AV99TFMaqDsc ;
   private String AV72TFBarNHdr_Sel ;
   private String AV71TFBarNHdr ;
   private String AV78TFFase_Sel ;
   private String AV77TFFase ;
   private String AV86TFHisProF_Sel ;
   private String AV85TFHisProF ;
   private String AV98TFParCodNom_Sel ;
   private String AV97TFParCodNom ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A13696BarNHdr ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String AV110Webpartesproduccionds_2_tfmaqcod ;
   private String AV111Webpartesproduccionds_3_tfmaqcod_sel ;
   private String AV112Webpartesproduccionds_4_tfmaqdsc ;
   private String AV113Webpartesproduccionds_5_tfmaqdsc_sel ;
   private String AV117Webpartesproduccionds_9_tfbarnhdr ;
   private String AV118Webpartesproduccionds_10_tfbarnhdr_sel ;
   private String AV123Webpartesproduccionds_15_tffase ;
   private String AV124Webpartesproduccionds_16_tffase_sel ;
   private String AV127Webpartesproduccionds_19_tfhisprof ;
   private String AV128Webpartesproduccionds_20_tfhisprof_sel ;
   private String AV137Webpartesproduccionds_29_tfparcodnom ;
   private String AV138Webpartesproduccionds_30_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV110Webpartesproduccionds_2_tfmaqcod ;
   private String lV112Webpartesproduccionds_4_tfmaqdsc ;
   private String lV117Webpartesproduccionds_9_tfbarnhdr ;
   private String lV123Webpartesproduccionds_15_tffase ;
   private String lV127Webpartesproduccionds_19_tfhisprof ;
   private String lV137Webpartesproduccionds_29_tfparcodnom ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV81TFHisProDTI ;
   private java.util.Date AV83TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV125Webpartesproduccionds_17_tfhisprodti ;
   private java.util.Date AV126Webpartesproduccionds_18_tfhisprodtf ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV49TFHisProFec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV114Webpartesproduccionds_6_tfhisprofec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV104FilterFullText ;
   private String AV109Webpartesproduccionds_1_filterfulltext ;
   private String lV109Webpartesproduccionds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08BB2_A396EmprCod ;
   private short[] P08BB2_A656ParCod ;
   private boolean[] P08BB2_n656ParCod ;
   private String[] P08BB2_A867ParCodNom ;
   private boolean[] P08BB2_n867ParCodNom ;
   private short[] P08BB2_A4714HisProNpzs ;
   private java.math.BigDecimal[] P08BB2_A1526HisProMtr ;
   private java.math.BigDecimal[] P08BB2_A1525HisProKgr ;
   private byte[] P08BB2_A566HisProTur ;
   private String[] P08BB2_A557HisProF ;
   private java.util.Date[] P08BB2_A4441HisProDTF ;
   private boolean[] P08BB2_n4441HisProDTF ;
   private java.util.Date[] P08BB2_A4440HisProDTI ;
   private boolean[] P08BB2_n4440HisProDTI ;
   private String[] P08BB2_A461Fase ;
   private short[] P08BB2_A194BarOrdLin ;
   private int[] P08BB2_A503GruOpeCod ;
   private int[] P08BB2_A561HisProLin ;
   private java.util.Date[] P08BB2_A558HisProFec ;
   private String[] P08BB2_A606MaqDsc ;
   private boolean[] P08BB2_n606MaqDsc ;
   private String[] P08BB2_A602MaqCod ;
   private String[] P08BB2_A130BarCodPar ;
   private byte[] P08BB2_A132BarCodReo ;
   private int[] P08BB2_A129BarCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
}

final  class webpartesproduccionexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV109Webpartesproduccionds_1_filterfulltext ,
                                          String AV111Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV110Webpartesproduccionds_2_tfmaqcod ,
                                          String AV113Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV112Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV114Webpartesproduccionds_6_tfhisprofec ,
                                          int AV115Webpartesproduccionds_7_tfhisprolin ,
                                          int AV116Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV118Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV117Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV119Webpartesproduccionds_11_tfgruopecod ,
                                          int AV120Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV121Webpartesproduccionds_13_tfbarordlin ,
                                          short AV122Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV124Webpartesproduccionds_16_tffase_sel ,
                                          String AV123Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV125Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV126Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV128Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV127Webpartesproduccionds_19_tfhisprof ,
                                          byte AV129Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV130Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV131Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV132Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV133Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV134Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV135Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV136Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV138Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV137Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[42];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParCod, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.HisProDTF, T1.HisProDTI, T1.Fase, T1.BarOrdLin," ;
      scmdbuf += " T1.GruOpeCod, T1.HisProLin, T1.HisProFec, T3.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV109Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T3.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
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
         GXv_int9[11] = (byte)(1) ;
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV115Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV116Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV117Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV119Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV120Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV121Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV122Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV123Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV125Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV126Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV127Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV129Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV130Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV135Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (0==AV136Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV137Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.HisProFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLin" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ParCodNom" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ParCodNom DESC" ;
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
                  return conditional_P08BB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
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
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
      }
   }

}

