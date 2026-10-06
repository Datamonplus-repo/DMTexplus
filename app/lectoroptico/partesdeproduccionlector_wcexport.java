package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partesdeproduccionlector_wcexport extends GXProcedure
{
   public partesdeproduccionlector_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partesdeproduccionlector_wcexport.class ), "" );
   }

   public partesdeproduccionlector_wcexport( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      partesdeproduccionlector_wcexport.this.aP1 = new String[] {""};
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
      partesdeproduccionlector_wcexport.this.aP0 = aP0;
      partesdeproduccionlector_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "PartesdeProduccionLector_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (0==AV43TFHisProLin) && (0==AV44TFHisProLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFHisProLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFHisProLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFBarNHdr_Sel, GXv_char5) ;
         partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarNHdr, GXv_char5) ;
            partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV47TFGruOpeCod) && (0==AV48TFGruOpeCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV47TFGruOpeCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV48TFGruOpeCod_To );
      }
      if ( ! ( (0==AV49TFBarOrdLin) && (0==AV50TFBarOrdLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV49TFBarOrdLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV50TFBarOrdLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV52TFFase_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFFase_Sel, GXv_char5) ;
         partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFFase)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFFase, GXv_char5) ;
            partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV71TFFaseDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFFaseDsc_Sel, GXv_char5) ;
         partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFFaseDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFFaseDsc, GXv_char5) ;
            partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV53TFHisProDTI) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV53TFHisProDTI );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV55TFHisProDTF) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV55TFHisProDTF );
      }
      if ( ! ( (GXutil.strcmp("", AV58TFHisProF_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFHisProF_Sel, GXv_char5) ;
         partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFHisProF)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "F?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFHisProF, GXv_char5) ;
            partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV59TFHisProTur) && (0==AV60TFHisProTur_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFHisProTur );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFHisProTur_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFHisProKgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFHisProKgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFHisProKgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFHisProKgr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFHisProMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFHisProMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TFHisProMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFHisProMtr_To)) );
      }
      if ( ! ( (0==AV65TFHisProNpzs) && (0==AV66TFHisProNpzs_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pcs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV65TFHisProNpzs );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV66TFHisProNpzs_To );
      }
      if ( ! ( (GXutil.strcmp("", AV73TFHisProLot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFHisProLot_Sel, GXv_char5) ;
         partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV72TFHisProLot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFHisProLot, GXv_char5) ;
            partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV68TFParCodNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFParCodNom_Sel, GXv_char5) ;
         partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFParCodNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFParCodNom, GXv_char5) ;
            partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV74TFHisProTr2) && (0==AV75TFHisProTr2_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T. real(m)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV74TFHisProTr2 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         partesdeproduccionlector_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV75TFHisProTr2_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV22Session.getValue("LectorOptico.PartesdeProduccionLector_WCColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV22Session.getValue("LectorOptico.PartesdeProduccionLector_WCColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV79GXV1));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV81Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV43TFHisProLin ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV44TFHisProLin_To ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV45TFBarNHdr ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV47TFGruOpeCod ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV48TFGruOpeCod_To ;
      AV87Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV49TFBarOrdLin ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV50TFBarOrdLin_To ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV51TFFase ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV52TFFase_Sel ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV70TFFaseDsc ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV71TFFaseDsc_Sel ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV53TFHisProDTI ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV55TFHisProDTF ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV57TFHisProF ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV58TFHisProF_Sel ;
      AV97Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV59TFHisProTur ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV60TFHisProTur_To ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV61TFHisProKgr ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV62TFHisProKgr_To ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV63TFHisProMtr ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV64TFHisProMtr_To ;
      AV103Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV65TFHisProNpzs ;
      AV104Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV66TFHisProNpzs_To ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV72TFHisProLot ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV73TFHisProLot_Sel ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV67TFParCodNom ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV68TFParCodNom_Sel ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV74TFHisProTr2 ;
      AV110Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV75TFHisProTr2_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV82Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV84Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV85Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV86Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV87Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV88Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV90Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV93Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV94Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV96Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV98Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV99Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV100Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV101Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV102Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV104Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV106Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV108Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV109Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV110Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           AV92Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV91Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           AV16Emprcod ,
                                           AV17Maqcod ,
                                           AV18HisProfec ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A558HisProFec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P096J2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV17Maqcod, AV18HisProfec, Integer.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV82Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV84Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV85Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV86Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV87Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV88Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV90Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV93Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV94Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV96Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV98Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV99Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV100Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV101Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV102Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV104Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV106Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV108Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV109Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV110Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A656ParCod = P096J2_A656ParCod[0] ;
         n656ParCod = P096J2_n656ParCod[0] ;
         A558HisProFec = P096J2_A558HisProFec[0] ;
         A602MaqCod = P096J2_A602MaqCod[0] ;
         A867ParCodNom = P096J2_A867ParCodNom[0] ;
         n867ParCodNom = P096J2_n867ParCodNom[0] ;
         A3610HisProLot = P096J2_A3610HisProLot[0] ;
         A4714HisProNpzs = P096J2_A4714HisProNpzs[0] ;
         A1526HisProMtr = P096J2_A1526HisProMtr[0] ;
         A1525HisProKgr = P096J2_A1525HisProKgr[0] ;
         A566HisProTur = P096J2_A566HisProTur[0] ;
         A557HisProF = P096J2_A557HisProF[0] ;
         A194BarOrdLin = P096J2_A194BarOrdLin[0] ;
         A503GruOpeCod = P096J2_A503GruOpeCod[0] ;
         A561HisProLin = P096J2_A561HisProLin[0] ;
         A130BarCodPar = P096J2_A130BarCodPar[0] ;
         A132BarCodReo = P096J2_A132BarCodReo[0] ;
         A129BarCod = P096J2_A129BarCod[0] ;
         A461Fase = P096J2_A461Fase[0] ;
         A396EmprCod = P096J2_A396EmprCod[0] ;
         A4440HisProDTI = P096J2_A4440HisProDTI[0] ;
         n4440HisProDTI = P096J2_n4440HisProDTI[0] ;
         A4441HisProDTF = P096J2_A4441HisProDTF[0] ;
         n4441HisProDTF = P096J2_n4441HisProDTF[0] ;
         A867ParCodNom = P096J2_A867ParCodNom[0] ;
         n867ParCodNom = P096J2_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char4 = A7258FaseDsc ;
         GXv_char5[0] = GXt_char4 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char5) ;
         partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
         A7258FaseDsc = GXt_char4 ;
         if ( ! ( (GXutil.strcmp("", AV92Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV91Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV92Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV92Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
               AV34VisibleColumnCount = 0 ;
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A561HisProLin );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV76M = "" ;
                  if ( GXutil.strcmp(A3610HisProLot, GXutil.str( A129BarCod, 8, 0)+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar) == 0 )
                  {
                     AV76M = "*" ;
                  }
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76M, GXv_char5) ;
                  partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
                  partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A503GruOpeCod );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A194BarOrdLin );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A461Fase, GXv_char5) ;
                  partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A7258FaseDsc, GXv_char5) ;
                  partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( A4440HisProDTI );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( A4441HisProDTF );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A557HisProF, GXv_char5) ;
                  partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A566HisProTur );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A4714HisProNpzs );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3610HisProLot, GXv_char5) ;
                  partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A867ParCodNom, GXv_char5) ;
                  partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A5605HisProTr2 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Seleccionar", "", "Op", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProLin", "", "#", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&M", "", "M", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N Hdr", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "GruOpeCod", "", "Operario", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarOrdLin", "", "Orden", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Fase", "", "Fase", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FaseDsc", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProDTI", "", "Inicio", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProDTF", "", "Fin", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProF", "", "F?", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProTur", "", "T", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProKgr", "", "Kgs", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProMtr", "", "Mts", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProNpzs", "", "Pcs", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProLot", "", "Lote", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ParCodNom", "", "Paro", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProTr2", "", "T. real(m)", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "LectorOptico.PartesdeProduccionLector_WCColumnsSelector", GXv_char5) ;
      partesdeproduccionlector_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue("LectorOptico.PartesdeProduccionLector_WCGridState"), "") == 0 )
      {
         AV24GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "LectorOptico.PartesdeProduccionLector_WCGridState"), null, null);
      }
      else
      {
         AV24GridState.fromxml(AV22Session.getValue("LectorOptico.PartesdeProduccionLector_WCGridState"), null, null);
      }
      AV19OrderedBy = AV24GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV20OrderedDsc = AV24GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV111GXV2 = 1 ;
      while ( AV111GXV2 <= AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV25GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV111GXV2));
         if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV43TFHisProLin = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFHisProLin_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV45TFBarNHdr = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV46TFBarNHdr_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV47TFGruOpeCod = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFGruOpeCod_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV49TFBarOrdLin = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFBarOrdLin_To = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV51TFFase = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV52TFFase_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV70TFFaseDsc = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV71TFFaseDsc_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV53TFHisProDTI = localUtil.ctot( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV55TFHisProDTF = localUtil.ctot( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV57TFHisProF = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV58TFHisProF_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV59TFHisProTur = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFHisProTur_To = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV61TFHisProKgr = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFHisProKgr_To = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV63TFHisProMtr = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFHisProMtr_To = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV65TFHisProNpzs = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFHisProNpzs_To = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT") == 0 )
         {
            AV72TFHisProLot = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT_SEL") == 0 )
         {
            AV73TFHisProLot_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV67TFParCodNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV68TFParCodNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTR2") == 0 )
         {
            AV74TFHisProTr2 = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFHisProTr2_To = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV17Maqcod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC") == 0 )
         {
            AV18HisProfec = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV111GXV2 = (int)(AV111GXV2+1) ;
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
      this.aP0[0] = partesdeproduccionlector_wcexport.this.AV11Filename;
      this.aP1[0] = partesdeproduccionlector_wcexport.this.AV12ErrorMessage;
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
      AV46TFBarNHdr_Sel = "" ;
      AV45TFBarNHdr = "" ;
      AV52TFFase_Sel = "" ;
      AV51TFFase = "" ;
      AV71TFFaseDsc_Sel = "" ;
      AV70TFFaseDsc = "" ;
      AV53TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV55TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV58TFHisProF_Sel = "" ;
      AV57TFHisProF = "" ;
      AV61TFHisProKgr = DecimalUtil.ZERO ;
      AV62TFHisProKgr_To = DecimalUtil.ZERO ;
      AV63TFHisProMtr = DecimalUtil.ZERO ;
      AV64TFHisProMtr_To = DecimalUtil.ZERO ;
      AV73TFHisProLot_Sel = "" ;
      AV72TFHisProLot = "" ;
      AV68TFParCodNom_Sel = "" ;
      AV67TFParCodNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV22Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A3610HisProLot = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = "" ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = "" ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase = "" ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = "" ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = "" ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = "" ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV94Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = "" ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = "" ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = "" ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = "" ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = "" ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = "" ;
      lV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase = "" ;
      lV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = "" ;
      lV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = "" ;
      lV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = "" ;
      AV16Emprcod = "" ;
      AV17Maqcod = "" ;
      AV18HisProfec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      P096J2_A656ParCod = new short[1] ;
      P096J2_n656ParCod = new boolean[] {false} ;
      P096J2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096J2_A602MaqCod = new String[] {""} ;
      P096J2_A867ParCodNom = new String[] {""} ;
      P096J2_n867ParCodNom = new boolean[] {false} ;
      P096J2_A3610HisProLot = new String[] {""} ;
      P096J2_A4714HisProNpzs = new short[1] ;
      P096J2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096J2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096J2_A566HisProTur = new byte[1] ;
      P096J2_A557HisProF = new String[] {""} ;
      P096J2_A194BarOrdLin = new short[1] ;
      P096J2_A503GruOpeCod = new int[1] ;
      P096J2_A561HisProLin = new int[1] ;
      P096J2_A130BarCodPar = new String[] {""} ;
      P096J2_A132BarCodReo = new byte[1] ;
      P096J2_A129BarCod = new int[1] ;
      P096J2_A461Fase = new String[] {""} ;
      P096J2_A396EmprCod = new String[] {""} ;
      P096J2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P096J2_n4440HisProDTI = new boolean[] {false} ;
      P096J2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P096J2_n4441HisProDTF = new boolean[] {false} ;
      AV76M = "" ;
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV24GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.partesdeproduccionlector_wcexport__default(),
         new Object[] {
             new Object[] {
            P096J2_A656ParCod, P096J2_n656ParCod, P096J2_A558HisProFec, P096J2_A602MaqCod, P096J2_A867ParCodNom, P096J2_n867ParCodNom, P096J2_A3610HisProLot, P096J2_A4714HisProNpzs, P096J2_A1526HisProMtr, P096J2_A1525HisProKgr,
            P096J2_A566HisProTur, P096J2_A557HisProF, P096J2_A194BarOrdLin, P096J2_A503GruOpeCod, P096J2_A561HisProLin, P096J2_A130BarCodPar, P096J2_A132BarCodReo, P096J2_A129BarCod, P096J2_A461Fase, P096J2_A396EmprCod,
            P096J2_A4440HisProDTI, P096J2_n4440HisProDTI, P096J2_A4441HisProDTF, P096J2_n4441HisProDTF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV59TFHisProTur ;
   private byte AV60TFHisProTur_To ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte AV97Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ;
   private byte AV98Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ;
   private short AV49TFBarOrdLin ;
   private short AV50TFBarOrdLin_To ;
   private short AV65TFHisProNpzs ;
   private short AV66TFHisProNpzs_To ;
   private short AV74TFHisProTr2 ;
   private short AV75TFHisProTr2_To ;
   private short GXv_int3[] ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A5605HisProTr2 ;
   private short AV87Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ;
   private short AV88Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ;
   private short AV103Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ;
   private short AV104Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ;
   private short AV109Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ;
   private short AV110Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ;
   private short AV19OrderedBy ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV43TFHisProLin ;
   private int AV44TFHisProLin_To ;
   private int AV47TFGruOpeCod ;
   private int AV48TFGruOpeCod_To ;
   private int AV79GXV1 ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int AV81Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ;
   private int AV82Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ;
   private int AV85Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ;
   private int AV86Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ;
   private int AV111GXV2 ;
   private long AV34VisibleColumnCount ;
   private java.math.BigDecimal AV61TFHisProKgr ;
   private java.math.BigDecimal AV62TFHisProKgr_To ;
   private java.math.BigDecimal AV63TFHisProMtr ;
   private java.math.BigDecimal AV64TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV99Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ;
   private java.math.BigDecimal AV100Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV101Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ;
   private java.math.BigDecimal AV102Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ;
   private String AV46TFBarNHdr_Sel ;
   private String AV45TFBarNHdr ;
   private String AV52TFFase_Sel ;
   private String AV51TFFase ;
   private String AV71TFFaseDsc_Sel ;
   private String AV70TFFaseDsc ;
   private String AV58TFHisProF_Sel ;
   private String AV57TFHisProF ;
   private String AV73TFHisProLot_Sel ;
   private String AV72TFHisProLot ;
   private String AV68TFParCodNom_Sel ;
   private String AV67TFParCodNom ;
   private String A3610HisProLot ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String AV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ;
   private String AV84Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ;
   private String AV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase ;
   private String AV90Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ;
   private String AV91Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ;
   private String AV92Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ;
   private String AV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ;
   private String AV96Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ;
   private String AV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ;
   private String AV106Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ;
   private String AV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ;
   private String AV108Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ;
   private String lV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase ;
   private String lV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ;
   private String lV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ;
   private String lV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ;
   private String AV16Emprcod ;
   private String AV17Maqcod ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV76M ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV53TFHisProDTI ;
   private java.util.Date AV55TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV93Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ;
   private java.util.Date AV94Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ;
   private java.util.Date AV18HisProfec ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean AV20OrderedDsc ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P096J2_A656ParCod ;
   private boolean[] P096J2_n656ParCod ;
   private java.util.Date[] P096J2_A558HisProFec ;
   private String[] P096J2_A602MaqCod ;
   private String[] P096J2_A867ParCodNom ;
   private boolean[] P096J2_n867ParCodNom ;
   private String[] P096J2_A3610HisProLot ;
   private short[] P096J2_A4714HisProNpzs ;
   private java.math.BigDecimal[] P096J2_A1526HisProMtr ;
   private java.math.BigDecimal[] P096J2_A1525HisProKgr ;
   private byte[] P096J2_A566HisProTur ;
   private String[] P096J2_A557HisProF ;
   private short[] P096J2_A194BarOrdLin ;
   private int[] P096J2_A503GruOpeCod ;
   private int[] P096J2_A561HisProLin ;
   private String[] P096J2_A130BarCodPar ;
   private byte[] P096J2_A132BarCodReo ;
   private int[] P096J2_A129BarCod ;
   private String[] P096J2_A461Fase ;
   private String[] P096J2_A396EmprCod ;
   private java.util.Date[] P096J2_A4440HisProDTI ;
   private boolean[] P096J2_n4440HisProDTI ;
   private java.util.Date[] P096J2_A4441HisProDTF ;
   private boolean[] P096J2_n4441HisProDTF ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV24GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV25GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
}

final  class partesdeproduccionlector_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P096J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV81Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV82Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV84Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV85Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV86Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV87Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV88Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV90Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV93Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV94Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV96Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV97Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV98Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV99Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV100Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV102Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV103Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV104Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV106Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV108Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV109Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV110Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV92Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV91Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String AV16Emprcod ,
                                          String AV17Maqcod ,
                                          java.util.Date AV18HisProfec ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[31];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T1.HisProFec, T1.MaqCod, T2.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod," ;
      scmdbuf += " T1.HisProLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( ! (0==AV81Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV85Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV88Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV94Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV95Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV97Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV98Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV103Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV104Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV105Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV109Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV110Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV19OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec DESC, T1.HisProLin DESC" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLin" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLin DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV19OrderedBy == 11 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV19OrderedBy == 11 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV19OrderedBy == 12 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs" ;
      }
      else if ( ( AV19OrderedBy == 12 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs DESC" ;
      }
      else if ( ( AV19OrderedBy == 13 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLot" ;
      }
      else if ( ( AV19OrderedBy == 13 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLot DESC" ;
      }
      else if ( ( AV19OrderedBy == 14 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ParCodNom" ;
      }
      else if ( ( AV19OrderedBy == 14 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ParCodNom DESC" ;
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
                  return conditional_P096J2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Boolean) dynConstraints[45]).booleanValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P096J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
      }
   }

}

