package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wclecturasproduccionexport extends GXProcedure
{
   public wclecturasproduccionexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wclecturasproduccionexport.class ), "" );
   }

   public wclecturasproduccionexport( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wclecturasproduccionexport.this.aP1 = new String[] {""};
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
      wclecturasproduccionexport.this.aP0 = aP0;
      wclecturasproduccionexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCLecturasProduccionExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV22FilterFullText, GXv_char5) ;
      wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV40TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFMaqCod_Sel, GXv_char5) ;
         wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFMaqCod, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41TFHisProFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV41TFHisProFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV43TFHisProLin) && (0==AV44TFHisProLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFHisProLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFHisProLin_To );
      }
      if ( ! ( (0==AV45TFBarOrdLin) && (0==AV46TFBarOrdLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFBarOrdLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFBarOrdLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFFase_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFFase_Sel, GXv_char5) ;
         wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFFase)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFFase, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFFaseDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFFaseDsc_Sel, GXv_char5) ;
         wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFFaseDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFFaseDsc, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV51TFHisProTur) && (0==AV52TFHisProTur_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Turno", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFHisProTur );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFHisProTur_To );
      }
      if ( ! ( (GXutil.strcmp("", AV54TFHisProF_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFHisProF_Sel, GXv_char5) ;
         wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFHisProF)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFHisProF, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV55TFHisProDTI) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV55TFHisProDTI );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV57TFHisProDTF) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV57TFHisProDTF );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFHisProKgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFHisProKgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "kgs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFHisProKgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFHisProKgr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFHisProMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFHisProMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "mts", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFHisProMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFHisProMtr_To)) );
      }
      if ( ! ( (0==AV63TFHisProNpzs) && (0==AV64TFHisProNpzs_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "pcs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV63TFHisProNpzs );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV64TFHisProNpzs_To );
      }
      if ( ! ( (0==AV65TFGruOpeCod) && (0==AV66TFGruOpeCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV65TFGruOpeCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV66TFGruOpeCod_To );
      }
      if ( ! ( (0==AV67TFParCod) && (0==AV68TFParCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV67TFParCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV68TFParCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV70TFParCodNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFParCodNom_Sel, GXv_char5) ;
         wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFParCodNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wclecturasproduccionexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFParCodNom, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV36VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV23Session.getValue("WCLecturasProduccionColumnsSelector"), "") != 0 )
      {
         AV31ColumnsSelectorXML = AV23Session.getValue("WCLecturasProduccionColumnsSelector") ;
         AV28ColumnsSelector.fromxml(AV31ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV30ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV74GXV1));
         if ( AV30ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV30ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV30ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV30ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setColor( 11 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV76Wclecturasproduccionds_1_emprcod = AV16Emprcod ;
      AV77Wclecturasproduccionds_2_barcod = AV17Barcod ;
      AV78Wclecturasproduccionds_3_barcodreo = AV18Barcodreo ;
      AV79Wclecturasproduccionds_4_barcodpar = AV19BarCodpar ;
      AV80Wclecturasproduccionds_5_filterfulltext = AV22FilterFullText ;
      AV81Wclecturasproduccionds_6_tfmaqcod = AV39TFMaqCod ;
      AV82Wclecturasproduccionds_7_tfmaqcod_sel = AV40TFMaqCod_Sel ;
      AV83Wclecturasproduccionds_8_tfhisprofec = AV41TFHisProFec ;
      AV84Wclecturasproduccionds_9_tfhisprolin = AV43TFHisProLin ;
      AV85Wclecturasproduccionds_10_tfhisprolin_to = AV44TFHisProLin_To ;
      AV86Wclecturasproduccionds_11_tfbarordlin = AV45TFBarOrdLin ;
      AV87Wclecturasproduccionds_12_tfbarordlin_to = AV46TFBarOrdLin_To ;
      AV88Wclecturasproduccionds_13_tffase = AV47TFFase ;
      AV89Wclecturasproduccionds_14_tffase_sel = AV48TFFase_Sel ;
      AV90Wclecturasproduccionds_15_tffasedsc = AV49TFFaseDsc ;
      AV91Wclecturasproduccionds_16_tffasedsc_sel = AV50TFFaseDsc_Sel ;
      AV92Wclecturasproduccionds_17_tfhisprotur = AV51TFHisProTur ;
      AV93Wclecturasproduccionds_18_tfhisprotur_to = AV52TFHisProTur_To ;
      AV94Wclecturasproduccionds_19_tfhisprof = AV53TFHisProF ;
      AV95Wclecturasproduccionds_20_tfhisprof_sel = AV54TFHisProF_Sel ;
      AV96Wclecturasproduccionds_21_tfhisprodti = AV55TFHisProDTI ;
      AV97Wclecturasproduccionds_22_tfhisprodtf = AV57TFHisProDTF ;
      AV98Wclecturasproduccionds_23_tfhisprokgr = AV59TFHisProKgr ;
      AV99Wclecturasproduccionds_24_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV100Wclecturasproduccionds_25_tfhispromtr = AV61TFHisProMtr ;
      AV101Wclecturasproduccionds_26_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV102Wclecturasproduccionds_27_tfhispronpzs = AV63TFHisProNpzs ;
      AV103Wclecturasproduccionds_28_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV104Wclecturasproduccionds_29_tfgruopecod = AV65TFGruOpeCod ;
      AV105Wclecturasproduccionds_30_tfgruopecod_to = AV66TFGruOpeCod_To ;
      AV106Wclecturasproduccionds_31_tfparcod = AV67TFParCod ;
      AV107Wclecturasproduccionds_32_tfparcod_to = AV68TFParCod_To ;
      AV108Wclecturasproduccionds_33_tfparcodnom = AV69TFParCodNom ;
      AV109Wclecturasproduccionds_34_tfparcodnom_sel = AV70TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV82Wclecturasproduccionds_7_tfmaqcod_sel ,
                                           AV81Wclecturasproduccionds_6_tfmaqcod ,
                                           AV83Wclecturasproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV84Wclecturasproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV85Wclecturasproduccionds_10_tfhisprolin_to) ,
                                           Short.valueOf(AV86Wclecturasproduccionds_11_tfbarordlin) ,
                                           Short.valueOf(AV87Wclecturasproduccionds_12_tfbarordlin_to) ,
                                           AV89Wclecturasproduccionds_14_tffase_sel ,
                                           AV88Wclecturasproduccionds_13_tffase ,
                                           Byte.valueOf(AV92Wclecturasproduccionds_17_tfhisprotur) ,
                                           Byte.valueOf(AV93Wclecturasproduccionds_18_tfhisprotur_to) ,
                                           AV95Wclecturasproduccionds_20_tfhisprof_sel ,
                                           AV94Wclecturasproduccionds_19_tfhisprof ,
                                           AV96Wclecturasproduccionds_21_tfhisprodti ,
                                           AV97Wclecturasproduccionds_22_tfhisprodtf ,
                                           AV98Wclecturasproduccionds_23_tfhisprokgr ,
                                           AV99Wclecturasproduccionds_24_tfhisprokgr_to ,
                                           AV100Wclecturasproduccionds_25_tfhispromtr ,
                                           AV101Wclecturasproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV102Wclecturasproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV103Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                           Integer.valueOf(AV104Wclecturasproduccionds_29_tfgruopecod) ,
                                           Integer.valueOf(AV105Wclecturasproduccionds_30_tfgruopecod_to) ,
                                           Short.valueOf(AV106Wclecturasproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV107Wclecturasproduccionds_32_tfparcod_to) ,
                                           AV109Wclecturasproduccionds_34_tfparcodnom_sel ,
                                           AV108Wclecturasproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV20OrderedBy) ,
                                           Boolean.valueOf(AV21OrderedDsc) ,
                                           AV80Wclecturasproduccionds_5_filterfulltext ,
                                           A7258FaseDsc ,
                                           AV91Wclecturasproduccionds_16_tffasedsc_sel ,
                                           AV90Wclecturasproduccionds_15_tffasedsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV77Wclecturasproduccionds_2_barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV78Wclecturasproduccionds_3_barcodreo) ,
                                           A130BarCodPar ,
                                           AV79Wclecturasproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           AV16Emprcod ,
                                           Integer.valueOf(AV17Barcod) ,
                                           Byte.valueOf(AV18Barcodreo) ,
                                           AV19BarCodpar ,
                                           AV76Wclecturasproduccionds_1_emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV80Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV90Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV90Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
      lV81Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV81Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
      /* Using cursor P08UO2 */
      pr_default.execute(0, new Object[] {AV76Wclecturasproduccionds_1_emprcod, AV80Wclecturasproduccionds_5_filterfulltext, lV80Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV80Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV80Wclecturasproduccionds_5_filterfulltext, A461Fase, lV80Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV80Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV80Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV80Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV80Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV80Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV80Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV80Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV80Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV80Wclecturasproduccionds_5_filterfulltext, AV91Wclecturasproduccionds_16_tffasedsc_sel, AV90Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV90Wclecturasproduccionds_15_tffasedsc, AV91Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV91Wclecturasproduccionds_16_tffasedsc_sel, Integer.valueOf(A129BarCod), Integer.valueOf(AV77Wclecturasproduccionds_2_barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV78Wclecturasproduccionds_3_barcodreo), A130BarCodPar, AV79Wclecturasproduccionds_4_barcodpar, AV16Emprcod, Integer.valueOf(A129BarCod), Integer.valueOf(AV17Barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV18Barcodreo), A130BarCodPar, AV19BarCodpar, lV81Wclecturasproduccionds_6_tfmaqcod, AV82Wclecturasproduccionds_7_tfmaqcod_sel, AV83Wclecturasproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A558HisProFec = P08UO2_A558HisProFec[0] ;
         A602MaqCod = P08UO2_A602MaqCod[0] ;
         A396EmprCod = P08UO2_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV36VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A558HisProFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( A561HisProLin );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( A194BarOrdLin );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A461Fase, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A7258FaseDsc, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( A566HisProTur );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A557HisProF, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setDate( A4440HisProDTI );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setDate( A4441HisProDTF );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( A4714HisProNpzs );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( A503GruOpeCod );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = AV27OpeNom ;
            GXv_char5[0] = GXt_char4 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV27OpeNom = GXt_char4 ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV27OpeNom, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setNumber( A656ParCod );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A867ParCodNom, GXv_char5) ;
            wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV36VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV36VisibleColumnCount = (long)(AV36VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      AV28ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqCod", "", "Código Máquina", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProFec", "", "Fecha", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProLin", "", "Linea", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarOrdLin", "", "Orden", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Fase", "", "Fase", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FaseDsc", "", "Descripcion", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProTur", "", "Turno", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProF", "", "F?", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProDTI", "", "Inicio", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProDTF", "", "Fin", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProKgr", "", "kgs", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProMtr", "", "mts", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProNpzs", "", "pcs", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "GruOpeCod", "", "Operario", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&OpeNom", "", "Nombre", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ParCod", "", "Paro", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ParCodNom", "", "Descripcion", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV32UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCLecturasProduccionColumnsSelector", GXv_char5) ;
      wclecturasproduccionexport.this.GXt_char4 = GXv_char5[0] ;
      AV32UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV32UserCustomValue)==0) ) )
      {
         AV29ColumnsSelectorAux.fromxml(AV32UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV29ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV28ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV29ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV28ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("WCLecturasProduccionGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCLecturasProduccionGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("WCLecturasProduccionGridState"), null, null);
      }
      AV20OrderedBy = AV25GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV21OrderedDsc = AV25GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV110GXV2 = 1 ;
      while ( AV110GXV2 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV110GXV2));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV22FilterFullText = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV39TFMaqCod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV40TFMaqCod_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV41TFHisProFec = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV43TFHisProLin = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFHisProLin_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV45TFBarOrdLin = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFBarOrdLin_To = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV47TFFase = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV48TFFase_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV49TFFaseDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV50TFFaseDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV51TFHisProTur = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFHisProTur_To = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV53TFHisProF = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV54TFHisProF_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV55TFHisProDTI = localUtil.ctot( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV57TFHisProDTF = localUtil.ctot( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV59TFHisProKgr = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFHisProKgr_To = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV61TFHisProMtr = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFHisProMtr_To = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV63TFHisProNpzs = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFHisProNpzs_To = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV65TFGruOpeCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFGruOpeCod_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV67TFParCod = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFParCod_To = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV69TFParCodNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV70TFParCodNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV17Barcod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV18Barcodreo = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV19BarCodpar = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV110GXV2 = (int)(AV110GXV2+1) ;
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
      this.aP0[0] = wclecturasproduccionexport.this.AV11Filename;
      this.aP1[0] = wclecturasproduccionexport.this.AV12ErrorMessage;
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
      AV22FilterFullText = "" ;
      AV40TFMaqCod_Sel = "" ;
      AV39TFMaqCod = "" ;
      AV41TFHisProFec = GXutil.nullDate() ;
      AV48TFFase_Sel = "" ;
      AV47TFFase = "" ;
      AV50TFFaseDsc_Sel = "" ;
      AV49TFFaseDsc = "" ;
      AV54TFHisProF_Sel = "" ;
      AV53TFHisProF = "" ;
      AV55TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV57TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV59TFHisProKgr = DecimalUtil.ZERO ;
      AV60TFHisProKgr_To = DecimalUtil.ZERO ;
      AV61TFHisProMtr = DecimalUtil.ZERO ;
      AV62TFHisProMtr_To = DecimalUtil.ZERO ;
      AV70TFParCodNom_Sel = "" ;
      AV69TFParCodNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV23Session = httpContext.getWebSession();
      AV31ColumnsSelectorXML = "" ;
      AV28ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV30ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A557HisProF = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A867ParCodNom = "" ;
      AV76Wclecturasproduccionds_1_emprcod = "" ;
      AV16Emprcod = "" ;
      AV79Wclecturasproduccionds_4_barcodpar = "" ;
      AV19BarCodpar = "" ;
      AV80Wclecturasproduccionds_5_filterfulltext = "" ;
      AV81Wclecturasproduccionds_6_tfmaqcod = "" ;
      AV82Wclecturasproduccionds_7_tfmaqcod_sel = "" ;
      AV83Wclecturasproduccionds_8_tfhisprofec = GXutil.nullDate() ;
      AV88Wclecturasproduccionds_13_tffase = "" ;
      AV89Wclecturasproduccionds_14_tffase_sel = "" ;
      AV90Wclecturasproduccionds_15_tffasedsc = "" ;
      AV91Wclecturasproduccionds_16_tffasedsc_sel = "" ;
      AV94Wclecturasproduccionds_19_tfhisprof = "" ;
      AV95Wclecturasproduccionds_20_tfhisprof_sel = "" ;
      AV96Wclecturasproduccionds_21_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV97Wclecturasproduccionds_22_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV98Wclecturasproduccionds_23_tfhisprokgr = DecimalUtil.ZERO ;
      AV99Wclecturasproduccionds_24_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV100Wclecturasproduccionds_25_tfhispromtr = DecimalUtil.ZERO ;
      AV101Wclecturasproduccionds_26_tfhispromtr_to = DecimalUtil.ZERO ;
      AV108Wclecturasproduccionds_33_tfparcodnom = "" ;
      AV109Wclecturasproduccionds_34_tfparcodnom_sel = "" ;
      lV80Wclecturasproduccionds_5_filterfulltext = "" ;
      lV90Wclecturasproduccionds_15_tffasedsc = "" ;
      scmdbuf = "" ;
      lV81Wclecturasproduccionds_6_tfmaqcod = "" ;
      A130BarCodPar = "" ;
      P08UO2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08UO2_A602MaqCod = new String[] {""} ;
      P08UO2_A396EmprCod = new String[] {""} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27OpeNom = "" ;
      AV32UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV29ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wclecturasproduccionexport__default(),
         new Object[] {
             new Object[] {
            P08UO2_A558HisProFec, P08UO2_A602MaqCod, P08UO2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV51TFHisProTur ;
   private byte AV52TFHisProTur_To ;
   private byte A566HisProTur ;
   private byte AV78Wclecturasproduccionds_3_barcodreo ;
   private byte AV18Barcodreo ;
   private byte AV92Wclecturasproduccionds_17_tfhisprotur ;
   private byte AV93Wclecturasproduccionds_18_tfhisprotur_to ;
   private byte A132BarCodReo ;
   private short AV45TFBarOrdLin ;
   private short AV46TFBarOrdLin_To ;
   private short AV63TFHisProNpzs ;
   private short AV64TFHisProNpzs_To ;
   private short AV67TFParCod ;
   private short AV68TFParCod_To ;
   private short GXv_int3[] ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A656ParCod ;
   private short AV86Wclecturasproduccionds_11_tfbarordlin ;
   private short AV87Wclecturasproduccionds_12_tfbarordlin_to ;
   private short AV102Wclecturasproduccionds_27_tfhispronpzs ;
   private short AV103Wclecturasproduccionds_28_tfhispronpzs_to ;
   private short AV106Wclecturasproduccionds_31_tfparcod ;
   private short AV107Wclecturasproduccionds_32_tfparcod_to ;
   private short AV20OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV43TFHisProLin ;
   private int AV44TFHisProLin_To ;
   private int AV65TFGruOpeCod ;
   private int AV66TFGruOpeCod_To ;
   private int AV74GXV1 ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int AV77Wclecturasproduccionds_2_barcod ;
   private int AV17Barcod ;
   private int AV84Wclecturasproduccionds_9_tfhisprolin ;
   private int AV85Wclecturasproduccionds_10_tfhisprolin_to ;
   private int AV104Wclecturasproduccionds_29_tfgruopecod ;
   private int AV105Wclecturasproduccionds_30_tfgruopecod_to ;
   private int A129BarCod ;
   private int AV110GXV2 ;
   private long AV36VisibleColumnCount ;
   private java.math.BigDecimal AV59TFHisProKgr ;
   private java.math.BigDecimal AV60TFHisProKgr_To ;
   private java.math.BigDecimal AV61TFHisProMtr ;
   private java.math.BigDecimal AV62TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV98Wclecturasproduccionds_23_tfhisprokgr ;
   private java.math.BigDecimal AV99Wclecturasproduccionds_24_tfhisprokgr_to ;
   private java.math.BigDecimal AV100Wclecturasproduccionds_25_tfhispromtr ;
   private java.math.BigDecimal AV101Wclecturasproduccionds_26_tfhispromtr_to ;
   private String AV40TFMaqCod_Sel ;
   private String AV39TFMaqCod ;
   private String AV48TFFase_Sel ;
   private String AV47TFFase ;
   private String AV50TFFaseDsc_Sel ;
   private String AV49TFFaseDsc ;
   private String AV54TFHisProF_Sel ;
   private String AV53TFHisProF ;
   private String AV70TFParCodNom_Sel ;
   private String AV69TFParCodNom ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String A557HisProF ;
   private String A396EmprCod ;
   private String A867ParCodNom ;
   private String AV76Wclecturasproduccionds_1_emprcod ;
   private String AV16Emprcod ;
   private String AV79Wclecturasproduccionds_4_barcodpar ;
   private String AV19BarCodpar ;
   private String AV81Wclecturasproduccionds_6_tfmaqcod ;
   private String AV82Wclecturasproduccionds_7_tfmaqcod_sel ;
   private String AV88Wclecturasproduccionds_13_tffase ;
   private String AV89Wclecturasproduccionds_14_tffase_sel ;
   private String AV90Wclecturasproduccionds_15_tffasedsc ;
   private String AV91Wclecturasproduccionds_16_tffasedsc_sel ;
   private String AV94Wclecturasproduccionds_19_tfhisprof ;
   private String AV95Wclecturasproduccionds_20_tfhisprof_sel ;
   private String AV108Wclecturasproduccionds_33_tfparcodnom ;
   private String AV109Wclecturasproduccionds_34_tfparcodnom_sel ;
   private String lV90Wclecturasproduccionds_15_tffasedsc ;
   private String scmdbuf ;
   private String lV81Wclecturasproduccionds_6_tfmaqcod ;
   private String A130BarCodPar ;
   private String AV27OpeNom ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV55TFHisProDTI ;
   private java.util.Date AV57TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV96Wclecturasproduccionds_21_tfhisprodti ;
   private java.util.Date AV97Wclecturasproduccionds_22_tfhisprodtf ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV41TFHisProFec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV83Wclecturasproduccionds_8_tfhisprofec ;
   private boolean returnInSub ;
   private boolean AV21OrderedDsc ;
   private String AV31ColumnsSelectorXML ;
   private String AV32UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV22FilterFullText ;
   private String AV80Wclecturasproduccionds_5_filterfulltext ;
   private String lV80Wclecturasproduccionds_5_filterfulltext ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08UO2_A558HisProFec ;
   private String[] P08UO2_A602MaqCod ;
   private String[] P08UO2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV30ColumnsSelector_Column ;
}

final  class wclecturasproduccionexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08UO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV82Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV81Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV83Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV84Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV85Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV86Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV87Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV89Wclecturasproduccionds_14_tffase_sel ,
                                          String AV88Wclecturasproduccionds_13_tffase ,
                                          byte AV92Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV93Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV95Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV94Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV96Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV97Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV98Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV99Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV100Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV101Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV102Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV103Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV104Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV105Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV106Wclecturasproduccionds_31_tfparcod ,
                                          short AV107Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV109Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV108Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV20OrderedBy ,
                                          boolean AV21OrderedDsc ,
                                          String AV80Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV91Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV90Wclecturasproduccionds_15_tffasedsc ,
                                          int A129BarCod ,
                                          int AV77Wclecturasproduccionds_2_barcod ,
                                          byte A132BarCodReo ,
                                          byte AV78Wclecturasproduccionds_3_barcodreo ,
                                          String A130BarCodPar ,
                                          String AV79Wclecturasproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          String AV16Emprcod ,
                                          int AV17Barcod ,
                                          byte AV18Barcodreo ,
                                          String AV19BarCodpar ,
                                          String AV76Wclecturasproduccionds_1_emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[50];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT HisProFec, MaqCod, EmprCod FROM TXPCHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV82Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV81Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV20OrderedBy == 1 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 1 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, MaqCod" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, MaqCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, HisProFec" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, HisProFec DESC" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ! AV21OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
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
                  return conditional_P08UO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08UO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 3);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
      }
   }

}

