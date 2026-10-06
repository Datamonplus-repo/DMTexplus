package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_analisishdrexport extends GXProcedure
{
   public mrec_analisishdrexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_analisishdrexport.class ), "" );
   }

   public mrec_analisishdrexport( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String aP6 ,
                             String aP7 ,
                             java.util.Date aP8 ,
                             String aP9 ,
                             String[] aP10 )
   {
      mrec_analisishdrexport.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        String aP6 ,
                        String aP7 ,
                        java.util.Date aP8 ,
                        String aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String aP6 ,
                             String aP7 ,
                             java.util.Date aP8 ,
                             String aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      mrec_analisishdrexport.this.AV104inEmprCod = aP0;
      mrec_analisishdrexport.this.AV38MaqCodJSON = aP1;
      mrec_analisishdrexport.this.AV39FasCodJSON = aP2;
      mrec_analisishdrexport.this.AV40HdrJSON = aP3;
      mrec_analisishdrexport.this.AV43Desde = aP4;
      mrec_analisishdrexport.this.AV44Hasta = aP5;
      mrec_analisishdrexport.this.AV105inUsurCod = aP6;
      mrec_analisishdrexport.this.AV100Ip = aP7;
      mrec_analisishdrexport.this.AV46Now = aP8;
      mrec_analisishdrexport.this.AV47MTkn = aP9;
      mrec_analisishdrexport.this.aP10 = aP10;
      mrec_analisishdrexport.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV101MaqCod.fromJSonString(AV38MaqCodJSON, null);
      AV102FasCod.fromJSonString(AV39FasCodJSON, null);
      AV103Hdr.fromJSonString(AV40HdrJSON, null);
      AV108AntMrPrHdr2 = "" ;
      AV35EmprCod = AV104inEmprCod ;
      AV45UsurCod = AV105inUsurCod ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Report: empresa:%1, usuario:%2, maquinas:%3, fases:%4, hdrs:%5.", ""), AV35EmprCod, AV45UsurCod, AV101MaqCod.toJSonString(false), AV102FasCod.toJSonString(false), AV103Hdr.toJSonString(false), "", "", "", ""), AV119Pgmname) ;
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
      AV11Filename = "./PrivateTempStorage/" + "MRec_AnalisisHdrExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV17FilterFullText, GXv_char5) ;
      mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV53TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFEmprCod_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFEmprCod, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV54TFBarCod) && (0==AV55TFBarCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFBarCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFBarCod_To );
      }
      if ( ! ( (0==AV56TFBarCodReo) && (0==AV57TFBarCodReo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFBarCodReo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFBarCodReo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFBarCodPar_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFBarCodPar_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFBarCodPar)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Particion Barcada", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFBarCodPar, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV73TFMRPrHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFMRPrHdr_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV72TFMRPrHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFMRPrHdr, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV75TFMRPrHdr2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFMRPrHdr2_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV74TFMRPrHdr2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFMRPrHdr2, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV60TFMRPrOrd) && (0==AV61TFMRPrOrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFMRPrOrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFMRPrOrd_To );
      }
      if ( ! ( (0==AV62TFMRPrLin) && (0==AV63TFMRPrLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lìnea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV62TFMRPrLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV63TFMRPrLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV69TFMRPrMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod. Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFMRPrMaqCod_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFMRPrMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod. Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFMRPrMaqCod, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV71TFMRPrMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFMRPrMaqDsc_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFMRPrMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFMRPrMaqDsc, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFMRPrFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFMRPrFasCod_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFMRPrFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFMRPrFasCod, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFMRPrFasDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFMRPrFasDsc_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFMRPrFasDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFMRPrFasDsc, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV90TFMRPrParId) && (0==AV91TFMRPrParId_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Parametro Id", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV90TFMRPrParId );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV91TFMRPrParId_To );
      }
      if ( ! ( (0==AV86TFMRPrParCod) && (0==AV87TFMRPrParCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód Parametro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV86TFMRPrParCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV87TFMRPrParCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV89TFMRPrParDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Parametro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFMRPrParDsc_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV88TFMRPrParDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Parametro", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV88TFMRPrParDsc, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV85TFMRPrPLC_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "c/PLC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFMRPrPLC_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV84TFMRPrPLC)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "c/PLC", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV84TFMRPrPLC, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV77TFMRPrFec) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Registrado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV77TFMRPrFec );
      }
      if ( ! ( (GXutil.strcmp("", AV81TFMRPrValMin_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Val Min", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFMRPrValMin_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV80TFMRPrValMin)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Val Min", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFMRPrValMin, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV79TFMRPrVal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFMRPrVal_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV78TFMRPrVal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFMRPrVal, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV83TFMRPrValMax_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Val Max", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFMRPrValMax_Sel, GXv_char5) ;
         mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV82TFMRPrValMax)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Val Max", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFMRPrValMax, GXv_char5) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV76TFMRPrEr_Sel) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Error", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         if ( AV76TFMRPrEr_Sel == 1 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( AV76TFMRPrEr_Sel == 2 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV92TFMRPrFecEv) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Evaluado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mrec_analisishdrexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV92TFMRPrFecEv );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV31VisibleColumnCount = 0 ;
         if ( GXutil.strcmp(AV18Session.getValue("Ingenieria.MRec_AnalisisHdrColumnsSelector"), "") != 0 )
         {
            AV26ColumnsSelectorXML = AV18Session.getValue("Ingenieria.MRec_AnalisisHdrColumnsSelector") ;
            AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
         }
         else
         {
            /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
            S151 ();
            if (returnInSub) return;
         }
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
         AV120GXV1 = 1 ;
         while ( AV120GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
         {
            AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV120GXV1));
            if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            AV120GXV1 = (int)(AV120GXV1+1) ;
         }
      }
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("Ingenieria.MRec_AnalisisHdrColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV18Session.getValue("Ingenieria.MRec_AnalisisHdrColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV121GXV2 = 1 ;
      while ( AV121GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV121GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV121GXV2 = (int)(AV121GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV123Ingenieria_mrec_analisishdrds_1_filterfulltext = AV17FilterFullText ;
         AV124Ingenieria_mrec_analisishdrds_2_tfemprcod = AV52TFEmprCod ;
         AV125Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV53TFEmprCod_Sel ;
         AV126Ingenieria_mrec_analisishdrds_4_tfbarcod = AV54TFBarCod ;
         AV127Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV55TFBarCod_To ;
         AV128Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV56TFBarCodReo ;
         AV129Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV57TFBarCodReo_To ;
         AV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV58TFBarCodPar ;
         AV131Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV59TFBarCodPar_Sel ;
         AV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV72TFMRPrHdr ;
         AV133Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV73TFMRPrHdr_Sel ;
         AV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV74TFMRPrHdr2 ;
         AV135Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV75TFMRPrHdr2_Sel ;
         AV136Ingenieria_mrec_analisishdrds_14_tfmrprord = AV60TFMRPrOrd ;
         AV137Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV61TFMRPrOrd_To ;
         AV138Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV62TFMRPrLin ;
         AV139Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV63TFMRPrLin_To ;
         AV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV68TFMRPrMaqCod ;
         AV141Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV69TFMRPrMaqCod_Sel ;
         AV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV70TFMRPrMaqDsc ;
         AV143Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV71TFMRPrMaqDsc_Sel ;
         AV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV64TFMRPrFasCod ;
         AV145Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV65TFMRPrFasCod_Sel ;
         AV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV66TFMRPrFasDsc ;
         AV147Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV67TFMRPrFasDsc_Sel ;
         AV148Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV90TFMRPrParId ;
         AV149Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV91TFMRPrParId_To ;
         AV150Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV86TFMRPrParCod ;
         AV151Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV87TFMRPrParCod_To ;
         AV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV88TFMRPrParDsc ;
         AV153Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV89TFMRPrParDsc_Sel ;
         AV154Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV84TFMRPrPLC ;
         AV155Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV85TFMRPrPLC_Sel ;
         AV156Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV77TFMRPrFec ;
         AV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV80TFMRPrValMin ;
         AV158Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV81TFMRPrValMin_Sel ;
         AV159Ingenieria_mrec_analisishdrds_37_tfmrprval = AV78TFMRPrVal ;
         AV160Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV79TFMRPrVal_Sel ;
         AV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV82TFMRPrValMax ;
         AV162Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV83TFMRPrValMax_Sel ;
         AV163Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV76TFMRPrEr_Sel ;
         AV164Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV92TFMRPrFecEv ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A14720MRPrMaqCod ,
                                              AV101MaqCod ,
                                              A14719MRPrFasCod ,
                                              AV102FasCod ,
                                              A14755MRPrHdr ,
                                              AV103Hdr ,
                                              AV123Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                              AV125Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                              AV124Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                              Integer.valueOf(AV126Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                              Integer.valueOf(AV127Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                              Byte.valueOf(AV128Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                              Byte.valueOf(AV129Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                              AV131Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                              AV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                              AV133Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                              AV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                              AV135Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                              AV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                              Short.valueOf(AV136Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                              Short.valueOf(AV137Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                              Long.valueOf(AV138Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                              Long.valueOf(AV139Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                              AV141Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                              AV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                              AV143Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                              AV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                              AV145Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                              AV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                              AV147Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                              AV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                              Long.valueOf(AV148Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                              Long.valueOf(AV149Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                              Short.valueOf(AV150Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                              Short.valueOf(AV151Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                              AV153Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                              AV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                              AV155Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                              AV154Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                              AV156Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                              AV158Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                              AV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                              AV160Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                              AV159Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                              AV162Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                              AV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                              Byte.valueOf(AV163Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                              AV164Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                              Integer.valueOf(AV101MaqCod.size()) ,
                                              Integer.valueOf(AV102FasCod.size()) ,
                                              Integer.valueOf(AV103Hdr.size()) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A14754MRPrHdr2 ,
                                              Short.valueOf(A14761MRPrOrd) ,
                                              Long.valueOf(A14762MRPrLin) ,
                                              A14760MRPrMaqDsc ,
                                              A14759MRPrFasDsc ,
                                              Long.valueOf(A14723MRPrParId) ,
                                              Short.valueOf(A14750MRPrParCod) ,
                                              A14758MRPrParDsc ,
                                              A14757MRPrPLC ,
                                              A14764MRPrValMin ,
                                              A14721MRPrVal ,
                                              A14765MRPrValMax ,
                                              A14682MRPrFec ,
                                              Boolean.valueOf(A14722MRPrEr) ,
                                              A14763MRPrFecEv ,
                                              Short.valueOf(AV48OrderedBy) ,
                                              Boolean.valueOf(AV49OrderedDsc) ,
                                              AV43Desde ,
                                              AV44Hasta ,
                                              A14753MRPrReg ,
                                              AV46Now ,
                                              A14751MRPrUsu ,
                                              AV45UsurCod ,
                                              A14752MRPrIp ,
                                              AV100Ip ,
                                              A14756MRPrTkn ,
                                              AV47MTkn ,
                                              AV35EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV124Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV124Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
         lV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
         lV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
         lV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
         lV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
         lV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
         lV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
         lV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
         lV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
         lV154Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV154Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
         lV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
         lV159Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV159Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
         lV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
         /* Using cursor P0AV82 */
         pr_default.execute(0, new Object[] {AV35EmprCod, AV43Desde, AV44Hasta, AV46Now, AV45UsurCod, AV100Ip, AV47MTkn, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV123Ingenieria_mrec_analisishdrds_1_filterfulltext, lV124Ingenieria_mrec_analisishdrds_2_tfemprcod, AV125Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV126Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV127Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV128Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV129Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV131Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV133Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV135Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV136Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV137Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV138Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV139Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV141Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV143Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV145Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV147Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV148Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV149Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV150Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV151Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV153Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV154Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV155Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV156Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV158Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV159Ingenieria_mrec_analisishdrds_37_tfmrprval, AV160Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV162Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV164Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14756MRPrTkn = P0AV82_A14756MRPrTkn[0] ;
            A14753MRPrReg = P0AV82_A14753MRPrReg[0] ;
            A14752MRPrIp = P0AV82_A14752MRPrIp[0] ;
            A14751MRPrUsu = P0AV82_A14751MRPrUsu[0] ;
            A14763MRPrFecEv = P0AV82_A14763MRPrFecEv[0] ;
            A14722MRPrEr = P0AV82_A14722MRPrEr[0] ;
            A14765MRPrValMax = P0AV82_A14765MRPrValMax[0] ;
            A14721MRPrVal = P0AV82_A14721MRPrVal[0] ;
            A14764MRPrValMin = P0AV82_A14764MRPrValMin[0] ;
            A14682MRPrFec = P0AV82_A14682MRPrFec[0] ;
            A14757MRPrPLC = P0AV82_A14757MRPrPLC[0] ;
            A14758MRPrParDsc = P0AV82_A14758MRPrParDsc[0] ;
            A14750MRPrParCod = P0AV82_A14750MRPrParCod[0] ;
            A14723MRPrParId = P0AV82_A14723MRPrParId[0] ;
            A14759MRPrFasDsc = P0AV82_A14759MRPrFasDsc[0] ;
            A14719MRPrFasCod = P0AV82_A14719MRPrFasCod[0] ;
            A14760MRPrMaqDsc = P0AV82_A14760MRPrMaqDsc[0] ;
            A14720MRPrMaqCod = P0AV82_A14720MRPrMaqCod[0] ;
            A14762MRPrLin = P0AV82_A14762MRPrLin[0] ;
            A14761MRPrOrd = P0AV82_A14761MRPrOrd[0] ;
            A14754MRPrHdr2 = P0AV82_A14754MRPrHdr2[0] ;
            A14755MRPrHdr = P0AV82_A14755MRPrHdr[0] ;
            A130BarCodPar = P0AV82_A130BarCodPar[0] ;
            A132BarCodReo = P0AV82_A132BarCodReo[0] ;
            A129BarCod = P0AV82_A129BarCod[0] ;
            A396EmprCod = P0AV82_A396EmprCod[0] ;
            A14681MRPrId = P0AV82_A14681MRPrId[0] ;
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A129BarCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A132BarCodReo );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A130BarCodPar, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14755MRPrHdr, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14754MRPrHdr2, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14761MRPrOrd );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14762MRPrLin );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14720MRPrMaqCod, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14760MRPrMaqDsc, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14719MRPrFasCod, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14759MRPrFasDsc, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14723MRPrParId );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14750MRPrParCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14758MRPrParDsc, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14757MRPrPLC, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A14682MRPrFec );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14764MRPrValMin, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14721MRPrVal, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14765MRPrValMax, GXv_char5) ;
               mrec_analisishdrexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXutil.booltostr( A14722MRPrEr) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A14763MRPrFecEv );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV101MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV102FasCod ,
                                           A14755MRPrHdr ,
                                           AV103Hdr ,
                                           AV17FilterFullText ,
                                           AV53TFEmprCod_Sel ,
                                           AV52TFEmprCod ,
                                           Integer.valueOf(AV54TFBarCod) ,
                                           Integer.valueOf(AV55TFBarCod_To) ,
                                           Byte.valueOf(AV56TFBarCodReo) ,
                                           Byte.valueOf(AV57TFBarCodReo_To) ,
                                           AV59TFBarCodPar_Sel ,
                                           AV58TFBarCodPar ,
                                           AV73TFMRPrHdr_Sel ,
                                           AV72TFMRPrHdr ,
                                           AV75TFMRPrHdr2_Sel ,
                                           AV74TFMRPrHdr2 ,
                                           Short.valueOf(AV60TFMRPrOrd) ,
                                           Short.valueOf(AV61TFMRPrOrd_To) ,
                                           Long.valueOf(AV62TFMRPrLin) ,
                                           Long.valueOf(AV63TFMRPrLin_To) ,
                                           AV69TFMRPrMaqCod_Sel ,
                                           AV68TFMRPrMaqCod ,
                                           AV71TFMRPrMaqDsc_Sel ,
                                           AV70TFMRPrMaqDsc ,
                                           AV65TFMRPrFasCod_Sel ,
                                           AV64TFMRPrFasCod ,
                                           AV67TFMRPrFasDsc_Sel ,
                                           AV66TFMRPrFasDsc ,
                                           Long.valueOf(AV90TFMRPrParId) ,
                                           Long.valueOf(AV91TFMRPrParId_To) ,
                                           Short.valueOf(AV86TFMRPrParCod) ,
                                           Short.valueOf(AV87TFMRPrParCod_To) ,
                                           AV89TFMRPrParDsc_Sel ,
                                           AV88TFMRPrParDsc ,
                                           AV85TFMRPrPLC_Sel ,
                                           AV84TFMRPrPLC ,
                                           AV77TFMRPrFec ,
                                           AV81TFMRPrValMin_Sel ,
                                           AV80TFMRPrValMin ,
                                           AV79TFMRPrVal_Sel ,
                                           AV78TFMRPrVal ,
                                           AV83TFMRPrValMax_Sel ,
                                           AV82TFMRPrValMax ,
                                           Byte.valueOf(AV76TFMRPrEr_Sel) ,
                                           AV92TFMRPrFecEv ,
                                           Integer.valueOf(AV101MaqCod.size()) ,
                                           Integer.valueOf(AV102FasCod.size()) ,
                                           Integer.valueOf(AV103Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           Short.valueOf(AV48OrderedBy) ,
                                           Boolean.valueOf(AV49OrderedDsc) ,
                                           AV43Desde ,
                                           AV44Hasta ,
                                           A14753MRPrReg ,
                                           AV46Now ,
                                           A14751MRPrUsu ,
                                           AV45UsurCod ,
                                           A14752MRPrIp ,
                                           AV100Ip ,
                                           A14756MRPrTkn ,
                                           AV47MTkn ,
                                           AV35EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV17FilterFullText = GXutil.concat( GXutil.rtrim( AV17FilterFullText), "%", "") ;
      lV52TFEmprCod = GXutil.padr( GXutil.rtrim( AV52TFEmprCod), 3, "%") ;
      lV58TFBarCodPar = GXutil.padr( GXutil.rtrim( AV58TFBarCodPar), 1, "%") ;
      lV72TFMRPrHdr = GXutil.padr( GXutil.rtrim( AV72TFMRPrHdr), 10, "%") ;
      lV74TFMRPrHdr2 = GXutil.concat( GXutil.rtrim( AV74TFMRPrHdr2), "%", "") ;
      lV68TFMRPrMaqCod = GXutil.padr( GXutil.rtrim( AV68TFMRPrMaqCod), 6, "%") ;
      lV70TFMRPrMaqDsc = GXutil.concat( GXutil.rtrim( AV70TFMRPrMaqDsc), "%", "") ;
      lV64TFMRPrFasCod = GXutil.padr( GXutil.rtrim( AV64TFMRPrFasCod), 8, "%") ;
      lV66TFMRPrFasDsc = GXutil.concat( GXutil.rtrim( AV66TFMRPrFasDsc), "%", "") ;
      lV88TFMRPrParDsc = GXutil.concat( GXutil.rtrim( AV88TFMRPrParDsc), "%", "") ;
      lV84TFMRPrPLC = GXutil.concat( GXutil.rtrim( AV84TFMRPrPLC), "%", "") ;
      lV80TFMRPrValMin = GXutil.padr( GXutil.rtrim( AV80TFMRPrValMin), 12, "%") ;
      lV78TFMRPrVal = GXutil.padr( GXutil.rtrim( AV78TFMRPrVal), 12, "%") ;
      lV82TFMRPrValMax = GXutil.padr( GXutil.rtrim( AV82TFMRPrValMax), 12, "%") ;
      /* Using cursor P0AV83 */
      pr_default.execute(1, new Object[] {AV35EmprCod, AV43Desde, AV44Hasta, AV46Now, AV45UsurCod, AV100Ip, AV47MTkn, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV17FilterFullText, lV52TFEmprCod, AV53TFEmprCod_Sel, Integer.valueOf(AV54TFBarCod), Integer.valueOf(AV55TFBarCod_To), Byte.valueOf(AV56TFBarCodReo), Byte.valueOf(AV57TFBarCodReo_To), lV58TFBarCodPar, AV59TFBarCodPar_Sel, lV72TFMRPrHdr, AV73TFMRPrHdr_Sel, lV74TFMRPrHdr2, AV75TFMRPrHdr2_Sel, Short.valueOf(AV60TFMRPrOrd), Short.valueOf(AV61TFMRPrOrd_To), Long.valueOf(AV62TFMRPrLin), Long.valueOf(AV63TFMRPrLin_To), lV68TFMRPrMaqCod, AV69TFMRPrMaqCod_Sel, lV70TFMRPrMaqDsc, AV71TFMRPrMaqDsc_Sel, lV64TFMRPrFasCod, AV65TFMRPrFasCod_Sel, lV66TFMRPrFasDsc, AV67TFMRPrFasDsc_Sel, Long.valueOf(AV90TFMRPrParId), Long.valueOf(AV91TFMRPrParId_To), Short.valueOf(AV86TFMRPrParCod), Short.valueOf(AV87TFMRPrParCod_To), lV88TFMRPrParDsc, AV89TFMRPrParDsc_Sel, lV84TFMRPrPLC, AV85TFMRPrPLC_Sel, AV77TFMRPrFec, lV80TFMRPrValMin, AV81TFMRPrValMin_Sel, lV78TFMRPrVal, AV79TFMRPrVal_Sel, lV82TFMRPrValMax, AV83TFMRPrValMax_Sel, AV92TFMRPrFecEv});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14756MRPrTkn = P0AV83_A14756MRPrTkn[0] ;
         A14753MRPrReg = P0AV83_A14753MRPrReg[0] ;
         A14752MRPrIp = P0AV83_A14752MRPrIp[0] ;
         A14751MRPrUsu = P0AV83_A14751MRPrUsu[0] ;
         A14763MRPrFecEv = P0AV83_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV83_A14722MRPrEr[0] ;
         A14682MRPrFec = P0AV83_A14682MRPrFec[0] ;
         A14765MRPrValMax = P0AV83_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV83_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV83_A14764MRPrValMin[0] ;
         A14757MRPrPLC = P0AV83_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV83_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV83_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV83_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV83_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV83_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV83_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV83_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV83_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV83_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV83_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV83_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV83_A130BarCodPar[0] ;
         A132BarCodReo = P0AV83_A132BarCodReo[0] ;
         A129BarCod = P0AV83_A129BarCod[0] ;
         A396EmprCod = P0AV83_A396EmprCod[0] ;
         A14681MRPrId = P0AV83_A14681MRPrId[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         if ( ! ( GXutil.strcmp(AV108AntMrPrHdr2, A14754MRPrHdr2) == 0 ) )
         {
            GXt_boolean6 = AV109Existe ;
            GXv_int7[0] = AV110CliCod ;
            GXv_char5[0] = AV111CliNom ;
            GXv_char8[0] = AV112BarSer ;
            GXv_char9[0] = AV113BarSerDsc ;
            GXv_int10[0] = AV114BarColNum ;
            GXv_char11[0] = AV115BarColNom ;
            GXv_int12[0] = AV116BarTipCol ;
            GXv_boolean13[0] = GXt_boolean6 ;
            new app.ingenieria.barcadaget(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7, GXv_char5, GXv_char8, GXv_char9, GXv_int10, GXv_char11, GXv_int12, GXv_boolean13) ;
            mrec_analisishdrexport.this.AV110CliCod = GXv_int7[0] ;
            mrec_analisishdrexport.this.AV111CliNom = GXv_char5[0] ;
            mrec_analisishdrexport.this.AV112BarSer = GXv_char8[0] ;
            mrec_analisishdrexport.this.AV113BarSerDsc = GXv_char9[0] ;
            mrec_analisishdrexport.this.AV114BarColNum = GXv_int10[0] ;
            mrec_analisishdrexport.this.AV115BarColNom = GXv_char11[0] ;
            mrec_analisishdrexport.this.AV116BarTipCol = GXv_int12[0] ;
            mrec_analisishdrexport.this.GXt_boolean6 = GXv_boolean13[0] ;
            AV109Existe = GXt_boolean6 ;
            AV108AntMrPrHdr2 = A14754MRPrHdr2 ;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A129BarCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A132BarCodReo );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A130BarCodPar, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14755MRPrHdr, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14754MRPrHdr2, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14761MRPrOrd );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14762MRPrLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14720MRPrMaqCod, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14760MRPrMaqDsc, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14719MRPrFasCod, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14759MRPrFasDsc, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14723MRPrParId );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14750MRPrParCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14758MRPrParDsc, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14757MRPrPLC, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A14682MRPrFec );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14764MRPrValMin, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14721MRPrVal, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14765MRPrValMax, GXv_char11) ;
            mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXutil.booltostr( A14722MRPrEr) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A14763MRPrFecEv );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV110CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( AV111CliNom );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( AV112BarSer );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( AV113BarSerDsc );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV114BarColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( AV115BarColNom );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV116BarTipCol );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
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
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EmprCod", "", "Empresa", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarCod", "", "Codigo Barcada", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarCodReo", "", "Codigo Reoperado Barcada", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarCodPar", "", "Codigo Particion Barcada", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrHdr", "", "Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrHdr2", "", "Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrOrd", "", "Orden", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrLin", "", "Lìnea", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrMaqCod", "", "Cod. Máquina", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrMaqDsc", "", "Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrFasCod", "", "Cód. Fase", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrFasDsc", "", "Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrParId", "", "Parametro Id", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrParCod", "", "Cód Parametro", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrParDsc", "", "Parametro", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrPLC", "", "c/PLC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrFec", "", "Registrado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrValMin", "", "Val Min", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrVal", "", "Valor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrValMax", "", "Val Max", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrEr", "", "Error", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrFecEv", "", "Evaluado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CliCod", "", "Cod. Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarSer", "", "Cod. Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarSerDsc", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarColNum", "", "Nro Color", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarTipCol", "", "Cod Tipo Color", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char11[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.MRec_AnalisisHdrColumnsSelector", GXv_char11) ;
      mrec_analisishdrexport.this.GXt_char4 = GXv_char11[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("Ingenieria.MRec_AnalisisHdrGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.MRec_AnalisisHdrGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("Ingenieria.MRec_AnalisisHdrGridState"), null, null);
      }
      AV48OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV49OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV166GXV3 = 1 ;
      while ( AV166GXV3 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV166GXV3));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV17FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV52TFEmprCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV53TFEmprCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV54TFBarCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV56TFBarCodReo = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarCodReo_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV58TFBarCodPar = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV59TFBarCodPar_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR") == 0 )
         {
            AV72TFMRPrHdr = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR_SEL") == 0 )
         {
            AV73TFMRPrHdr_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR2") == 0 )
         {
            AV74TFMRPrHdr2 = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR2_SEL") == 0 )
         {
            AV75TFMRPrHdr2_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRORD") == 0 )
         {
            AV60TFMRPrOrd = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFMRPrOrd_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRLIN") == 0 )
         {
            AV62TFMRPrLin = GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV63TFMRPrLin_To = GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQCOD") == 0 )
         {
            AV68TFMRPrMaqCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQCOD_SEL") == 0 )
         {
            AV69TFMRPrMaqCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQDSC") == 0 )
         {
            AV70TFMRPrMaqDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQDSC_SEL") == 0 )
         {
            AV71TFMRPrMaqDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASCOD") == 0 )
         {
            AV64TFMRPrFasCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASCOD_SEL") == 0 )
         {
            AV65TFMRPrFasCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASDSC") == 0 )
         {
            AV66TFMRPrFasDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASDSC_SEL") == 0 )
         {
            AV67TFMRPrFasDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARID") == 0 )
         {
            AV90TFMRPrParId = GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV91TFMRPrParId_To = GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARCOD") == 0 )
         {
            AV86TFMRPrParCod = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV87TFMRPrParCod_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARDSC") == 0 )
         {
            AV88TFMRPrParDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARDSC_SEL") == 0 )
         {
            AV89TFMRPrParDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPLC") == 0 )
         {
            AV84TFMRPrPLC = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPLC_SEL") == 0 )
         {
            AV85TFMRPrPLC_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFEC") == 0 )
         {
            AV77TFMRPrFec = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMIN") == 0 )
         {
            AV80TFMRPrValMin = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMIN_SEL") == 0 )
         {
            AV81TFMRPrValMin_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVAL") == 0 )
         {
            AV78TFMRPrVal = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVAL_SEL") == 0 )
         {
            AV79TFMRPrVal_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMAX") == 0 )
         {
            AV82TFMRPrValMax = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMAX_SEL") == 0 )
         {
            AV83TFMRPrValMax_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRER_SEL") == 0 )
         {
            AV76TFMRPrEr_Sel = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFECEV") == 0 )
         {
            AV92TFMRPrFecEv = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INEMPRCOD") == 0 )
         {
            AV104inEmprCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODJSON") == 0 )
         {
            AV38MaqCodJSON = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCODJSON") == 0 )
         {
            AV39FasCodJSON = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HDRJSON") == 0 )
         {
            AV40HdrJSON = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DESDE") == 0 )
         {
            AV43Desde = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HASTA") == 0 )
         {
            AV44Hasta = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INUSURCOD") == 0 )
         {
            AV105inUsurCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&IP") == 0 )
         {
            AV100Ip = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&NOW") == 0 )
         {
            AV46Now = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MTKN") == 0 )
         {
            AV47MTkn = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV166GXV3 = (int)(AV166GXV3+1) ;
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
      this.aP10[0] = mrec_analisishdrexport.this.AV11Filename;
      this.aP11[0] = mrec_analisishdrexport.this.AV12ErrorMessage;
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
      AV101MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV102FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV103Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV108AntMrPrHdr2 = "" ;
      AV35EmprCod = "" ;
      AV45UsurCod = "" ;
      AV119Pgmname = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV17FilterFullText = "" ;
      AV53TFEmprCod_Sel = "" ;
      AV52TFEmprCod = "" ;
      AV59TFBarCodPar_Sel = "" ;
      AV58TFBarCodPar = "" ;
      AV73TFMRPrHdr_Sel = "" ;
      AV72TFMRPrHdr = "" ;
      AV75TFMRPrHdr2_Sel = "" ;
      AV74TFMRPrHdr2 = "" ;
      AV69TFMRPrMaqCod_Sel = "" ;
      AV68TFMRPrMaqCod = "" ;
      AV71TFMRPrMaqDsc_Sel = "" ;
      AV70TFMRPrMaqDsc = "" ;
      AV65TFMRPrFasCod_Sel = "" ;
      AV64TFMRPrFasCod = "" ;
      AV67TFMRPrFasDsc_Sel = "" ;
      AV66TFMRPrFasDsc = "" ;
      AV89TFMRPrParDsc_Sel = "" ;
      AV88TFMRPrParDsc = "" ;
      AV85TFMRPrPLC_Sel = "" ;
      AV84TFMRPrPLC = "" ;
      AV77TFMRPrFec = GXutil.resetTime( GXutil.nullDate() );
      AV81TFMRPrValMin_Sel = "" ;
      AV80TFMRPrValMin = "" ;
      AV79TFMRPrVal_Sel = "" ;
      AV78TFMRPrVal = "" ;
      AV83TFMRPrValMax_Sel = "" ;
      AV82TFMRPrValMax = "" ;
      AV92TFMRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A14755MRPrHdr = "" ;
      A14754MRPrHdr2 = "" ;
      A14720MRPrMaqCod = "" ;
      A14760MRPrMaqDsc = "" ;
      A14719MRPrFasCod = "" ;
      A14759MRPrFasDsc = "" ;
      A14758MRPrParDsc = "" ;
      A14757MRPrPLC = "" ;
      A14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      A14764MRPrValMin = "" ;
      A14721MRPrVal = "" ;
      A14765MRPrValMax = "" ;
      A14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      AV123Ingenieria_mrec_analisishdrds_1_filterfulltext = "" ;
      AV124Ingenieria_mrec_analisishdrds_2_tfemprcod = "" ;
      AV125Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = "" ;
      AV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar = "" ;
      AV131Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = "" ;
      AV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr = "" ;
      AV133Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = "" ;
      AV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = "" ;
      AV135Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = "" ;
      AV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = "" ;
      AV141Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = "" ;
      AV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = "" ;
      AV143Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = "" ;
      AV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod = "" ;
      AV145Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = "" ;
      AV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = "" ;
      AV147Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = "" ;
      AV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = "" ;
      AV153Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = "" ;
      AV154Ingenieria_mrec_analisishdrds_32_tfmrprplc = "" ;
      AV155Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = "" ;
      AV156Ingenieria_mrec_analisishdrds_34_tfmrprfec = GXutil.resetTime( GXutil.nullDate() );
      AV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = "" ;
      AV158Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = "" ;
      AV159Ingenieria_mrec_analisishdrds_37_tfmrprval = "" ;
      AV160Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = "" ;
      AV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = "" ;
      AV162Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = "" ;
      AV164Ingenieria_mrec_analisishdrds_42_tfmrprfecev = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV123Ingenieria_mrec_analisishdrds_1_filterfulltext = "" ;
      lV124Ingenieria_mrec_analisishdrds_2_tfemprcod = "" ;
      lV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar = "" ;
      lV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr = "" ;
      lV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = "" ;
      lV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = "" ;
      lV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = "" ;
      lV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod = "" ;
      lV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = "" ;
      lV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = "" ;
      lV154Ingenieria_mrec_analisishdrds_32_tfmrprplc = "" ;
      lV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = "" ;
      lV159Ingenieria_mrec_analisishdrds_37_tfmrprval = "" ;
      lV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = "" ;
      A14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14751MRPrUsu = "" ;
      A14752MRPrIp = "" ;
      A14756MRPrTkn = "" ;
      P0AV82_A14756MRPrTkn = new String[] {""} ;
      P0AV82_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV82_A14752MRPrIp = new String[] {""} ;
      P0AV82_A14751MRPrUsu = new String[] {""} ;
      P0AV82_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV82_A14722MRPrEr = new boolean[] {false} ;
      P0AV82_A14765MRPrValMax = new String[] {""} ;
      P0AV82_A14721MRPrVal = new String[] {""} ;
      P0AV82_A14764MRPrValMin = new String[] {""} ;
      P0AV82_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV82_A14757MRPrPLC = new String[] {""} ;
      P0AV82_A14758MRPrParDsc = new String[] {""} ;
      P0AV82_A14750MRPrParCod = new short[1] ;
      P0AV82_A14723MRPrParId = new long[1] ;
      P0AV82_A14759MRPrFasDsc = new String[] {""} ;
      P0AV82_A14719MRPrFasCod = new String[] {""} ;
      P0AV82_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV82_A14720MRPrMaqCod = new String[] {""} ;
      P0AV82_A14762MRPrLin = new long[1] ;
      P0AV82_A14761MRPrOrd = new short[1] ;
      P0AV82_A14754MRPrHdr2 = new String[] {""} ;
      P0AV82_A14755MRPrHdr = new String[] {""} ;
      P0AV82_A130BarCodPar = new String[] {""} ;
      P0AV82_A132BarCodReo = new byte[1] ;
      P0AV82_A129BarCod = new int[1] ;
      P0AV82_A396EmprCod = new String[] {""} ;
      P0AV82_A14681MRPrId = new long[1] ;
      lV17FilterFullText = "" ;
      lV52TFEmprCod = "" ;
      lV58TFBarCodPar = "" ;
      lV72TFMRPrHdr = "" ;
      lV74TFMRPrHdr2 = "" ;
      lV68TFMRPrMaqCod = "" ;
      lV70TFMRPrMaqDsc = "" ;
      lV64TFMRPrFasCod = "" ;
      lV66TFMRPrFasDsc = "" ;
      lV88TFMRPrParDsc = "" ;
      lV84TFMRPrPLC = "" ;
      lV80TFMRPrValMin = "" ;
      lV78TFMRPrVal = "" ;
      lV82TFMRPrValMax = "" ;
      P0AV83_A14756MRPrTkn = new String[] {""} ;
      P0AV83_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV83_A14752MRPrIp = new String[] {""} ;
      P0AV83_A14751MRPrUsu = new String[] {""} ;
      P0AV83_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV83_A14722MRPrEr = new boolean[] {false} ;
      P0AV83_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV83_A14765MRPrValMax = new String[] {""} ;
      P0AV83_A14721MRPrVal = new String[] {""} ;
      P0AV83_A14764MRPrValMin = new String[] {""} ;
      P0AV83_A14757MRPrPLC = new String[] {""} ;
      P0AV83_A14758MRPrParDsc = new String[] {""} ;
      P0AV83_A14750MRPrParCod = new short[1] ;
      P0AV83_A14723MRPrParId = new long[1] ;
      P0AV83_A14759MRPrFasDsc = new String[] {""} ;
      P0AV83_A14719MRPrFasCod = new String[] {""} ;
      P0AV83_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV83_A14720MRPrMaqCod = new String[] {""} ;
      P0AV83_A14762MRPrLin = new long[1] ;
      P0AV83_A14761MRPrOrd = new short[1] ;
      P0AV83_A14754MRPrHdr2 = new String[] {""} ;
      P0AV83_A14755MRPrHdr = new String[] {""} ;
      P0AV83_A130BarCodPar = new String[] {""} ;
      P0AV83_A132BarCodReo = new byte[1] ;
      P0AV83_A129BarCod = new int[1] ;
      P0AV83_A396EmprCod = new String[] {""} ;
      P0AV83_A14681MRPrId = new long[1] ;
      GXv_int7 = new int[1] ;
      AV111CliNom = "" ;
      GXv_char5 = new String[1] ;
      AV112BarSer = "" ;
      GXv_char8 = new String[1] ;
      AV113BarSerDsc = "" ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      AV115BarColNom = "" ;
      GXv_int12 = new byte[1] ;
      GXv_boolean13 = new boolean[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char11 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_analisishdrexport__default(),
         new Object[] {
             new Object[] {
            P0AV82_A14756MRPrTkn, P0AV82_A14753MRPrReg, P0AV82_A14752MRPrIp, P0AV82_A14751MRPrUsu, P0AV82_A14763MRPrFecEv, P0AV82_A14722MRPrEr, P0AV82_A14765MRPrValMax, P0AV82_A14721MRPrVal, P0AV82_A14764MRPrValMin, P0AV82_A14682MRPrFec,
            P0AV82_A14757MRPrPLC, P0AV82_A14758MRPrParDsc, P0AV82_A14750MRPrParCod, P0AV82_A14723MRPrParId, P0AV82_A14759MRPrFasDsc, P0AV82_A14719MRPrFasCod, P0AV82_A14760MRPrMaqDsc, P0AV82_A14720MRPrMaqCod, P0AV82_A14762MRPrLin, P0AV82_A14761MRPrOrd,
            P0AV82_A14754MRPrHdr2, P0AV82_A14755MRPrHdr, P0AV82_A130BarCodPar, P0AV82_A132BarCodReo, P0AV82_A129BarCod, P0AV82_A396EmprCod, P0AV82_A14681MRPrId
            }
            , new Object[] {
            P0AV83_A14756MRPrTkn, P0AV83_A14753MRPrReg, P0AV83_A14752MRPrIp, P0AV83_A14751MRPrUsu, P0AV83_A14763MRPrFecEv, P0AV83_A14722MRPrEr, P0AV83_A14682MRPrFec, P0AV83_A14765MRPrValMax, P0AV83_A14721MRPrVal, P0AV83_A14764MRPrValMin,
            P0AV83_A14757MRPrPLC, P0AV83_A14758MRPrParDsc, P0AV83_A14750MRPrParCod, P0AV83_A14723MRPrParId, P0AV83_A14759MRPrFasDsc, P0AV83_A14719MRPrFasCod, P0AV83_A14760MRPrMaqDsc, P0AV83_A14720MRPrMaqCod, P0AV83_A14762MRPrLin, P0AV83_A14761MRPrOrd,
            P0AV83_A14754MRPrHdr2, P0AV83_A14755MRPrHdr, P0AV83_A130BarCodPar, P0AV83_A132BarCodReo, P0AV83_A129BarCod, P0AV83_A396EmprCod, P0AV83_A14681MRPrId
            }
         }
      );
      AV119Pgmname = "Ingenieria.MRec_AnalisisHdrExport" ;
      /* GeneXus formulas. */
      AV119Pgmname = "Ingenieria.MRec_AnalisisHdrExport" ;
      Gx_err = (short)(0) ;
   }

   private byte AV56TFBarCodReo ;
   private byte AV57TFBarCodReo_To ;
   private byte AV76TFMRPrEr_Sel ;
   private byte A132BarCodReo ;
   private byte AV128Ingenieria_mrec_analisishdrds_6_tfbarcodreo ;
   private byte AV129Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ;
   private byte AV163Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ;
   private byte AV116BarTipCol ;
   private byte GXv_int12[] ;
   private short AV60TFMRPrOrd ;
   private short AV61TFMRPrOrd_To ;
   private short AV86TFMRPrParCod ;
   private short AV87TFMRPrParCod_To ;
   private short GXv_int3[] ;
   private short A14761MRPrOrd ;
   private short A14750MRPrParCod ;
   private short AV136Ingenieria_mrec_analisishdrds_14_tfmrprord ;
   private short AV137Ingenieria_mrec_analisishdrds_15_tfmrprord_to ;
   private short AV150Ingenieria_mrec_analisishdrds_28_tfmrprparcod ;
   private short AV151Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ;
   private short AV48OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV54TFBarCod ;
   private int AV55TFBarCod_To ;
   private int AV120GXV1 ;
   private int AV121GXV2 ;
   private int A129BarCod ;
   private int AV126Ingenieria_mrec_analisishdrds_4_tfbarcod ;
   private int AV127Ingenieria_mrec_analisishdrds_5_tfbarcod_to ;
   private int AV101MaqCod_size ;
   private int AV102FasCod_size ;
   private int AV103Hdr_size ;
   private int AV110CliCod ;
   private int GXv_int7[] ;
   private int AV114BarColNum ;
   private int GXv_int10[] ;
   private int AV166GXV3 ;
   private long AV62TFMRPrLin ;
   private long AV63TFMRPrLin_To ;
   private long AV90TFMRPrParId ;
   private long AV91TFMRPrParId_To ;
   private long AV31VisibleColumnCount ;
   private long A14762MRPrLin ;
   private long A14723MRPrParId ;
   private long AV138Ingenieria_mrec_analisishdrds_16_tfmrprlin ;
   private long AV139Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ;
   private long AV148Ingenieria_mrec_analisishdrds_26_tfmrprparid ;
   private long AV149Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ;
   private long A14681MRPrId ;
   private String AV104inEmprCod ;
   private String AV105inUsurCod ;
   private String AV35EmprCod ;
   private String AV45UsurCod ;
   private String AV119Pgmname ;
   private String AV53TFEmprCod_Sel ;
   private String AV52TFEmprCod ;
   private String AV59TFBarCodPar_Sel ;
   private String AV58TFBarCodPar ;
   private String AV73TFMRPrHdr_Sel ;
   private String AV72TFMRPrHdr ;
   private String AV69TFMRPrMaqCod_Sel ;
   private String AV68TFMRPrMaqCod ;
   private String AV65TFMRPrFasCod_Sel ;
   private String AV64TFMRPrFasCod ;
   private String AV81TFMRPrValMin_Sel ;
   private String AV80TFMRPrValMin ;
   private String AV79TFMRPrVal_Sel ;
   private String AV78TFMRPrVal ;
   private String AV83TFMRPrValMax_Sel ;
   private String AV82TFMRPrValMax ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A14755MRPrHdr ;
   private String A14720MRPrMaqCod ;
   private String A14719MRPrFasCod ;
   private String A14764MRPrValMin ;
   private String A14721MRPrVal ;
   private String A14765MRPrValMax ;
   private String AV124Ingenieria_mrec_analisishdrds_2_tfemprcod ;
   private String AV125Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ;
   private String AV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar ;
   private String AV131Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ;
   private String AV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr ;
   private String AV133Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ;
   private String AV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ;
   private String AV141Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ;
   private String AV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod ;
   private String AV145Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ;
   private String AV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ;
   private String AV158Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ;
   private String AV159Ingenieria_mrec_analisishdrds_37_tfmrprval ;
   private String AV160Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ;
   private String AV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ;
   private String AV162Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ;
   private String scmdbuf ;
   private String lV124Ingenieria_mrec_analisishdrds_2_tfemprcod ;
   private String lV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar ;
   private String lV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr ;
   private String lV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ;
   private String lV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod ;
   private String lV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ;
   private String lV159Ingenieria_mrec_analisishdrds_37_tfmrprval ;
   private String lV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ;
   private String A14751MRPrUsu ;
   private String lV52TFEmprCod ;
   private String lV58TFBarCodPar ;
   private String lV72TFMRPrHdr ;
   private String lV68TFMRPrMaqCod ;
   private String lV64TFMRPrFasCod ;
   private String lV80TFMRPrValMin ;
   private String lV78TFMRPrVal ;
   private String lV82TFMRPrValMax ;
   private String AV111CliNom ;
   private String GXv_char5[] ;
   private String AV112BarSer ;
   private String GXv_char8[] ;
   private String AV113BarSerDsc ;
   private String GXv_char9[] ;
   private String AV115BarColNom ;
   private String GXt_char4 ;
   private String GXv_char11[] ;
   private java.util.Date AV43Desde ;
   private java.util.Date AV44Hasta ;
   private java.util.Date AV46Now ;
   private java.util.Date AV77TFMRPrFec ;
   private java.util.Date AV92TFMRPrFecEv ;
   private java.util.Date A14682MRPrFec ;
   private java.util.Date A14763MRPrFecEv ;
   private java.util.Date AV156Ingenieria_mrec_analisishdrds_34_tfmrprfec ;
   private java.util.Date AV164Ingenieria_mrec_analisishdrds_42_tfmrprfecev ;
   private java.util.Date A14753MRPrReg ;
   private boolean returnInSub ;
   private boolean A14722MRPrEr ;
   private boolean AV49OrderedDsc ;
   private boolean AV109Existe ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean13[] ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV38MaqCodJSON ;
   private String AV39FasCodJSON ;
   private String AV40HdrJSON ;
   private String AV100Ip ;
   private String AV47MTkn ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV108AntMrPrHdr2 ;
   private String AV17FilterFullText ;
   private String AV75TFMRPrHdr2_Sel ;
   private String AV74TFMRPrHdr2 ;
   private String AV71TFMRPrMaqDsc_Sel ;
   private String AV70TFMRPrMaqDsc ;
   private String AV67TFMRPrFasDsc_Sel ;
   private String AV66TFMRPrFasDsc ;
   private String AV89TFMRPrParDsc_Sel ;
   private String AV88TFMRPrParDsc ;
   private String AV85TFMRPrPLC_Sel ;
   private String AV84TFMRPrPLC ;
   private String A14754MRPrHdr2 ;
   private String A14760MRPrMaqDsc ;
   private String A14759MRPrFasDsc ;
   private String A14758MRPrParDsc ;
   private String A14757MRPrPLC ;
   private String AV123Ingenieria_mrec_analisishdrds_1_filterfulltext ;
   private String AV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ;
   private String AV135Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ;
   private String AV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ;
   private String AV143Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ;
   private String AV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ;
   private String AV147Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ;
   private String AV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ;
   private String AV153Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ;
   private String AV154Ingenieria_mrec_analisishdrds_32_tfmrprplc ;
   private String AV155Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ;
   private String lV123Ingenieria_mrec_analisishdrds_1_filterfulltext ;
   private String lV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ;
   private String lV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ;
   private String lV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ;
   private String lV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ;
   private String lV154Ingenieria_mrec_analisishdrds_32_tfmrprplc ;
   private String A14752MRPrIp ;
   private String A14756MRPrTkn ;
   private String lV17FilterFullText ;
   private String lV74TFMRPrHdr2 ;
   private String lV70TFMRPrMaqDsc ;
   private String lV66TFMRPrFasDsc ;
   private String lV88TFMRPrParDsc ;
   private String lV84TFMRPrPLC ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP11 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AV82_A14756MRPrTkn ;
   private java.util.Date[] P0AV82_A14753MRPrReg ;
   private String[] P0AV82_A14752MRPrIp ;
   private String[] P0AV82_A14751MRPrUsu ;
   private java.util.Date[] P0AV82_A14763MRPrFecEv ;
   private boolean[] P0AV82_A14722MRPrEr ;
   private String[] P0AV82_A14765MRPrValMax ;
   private String[] P0AV82_A14721MRPrVal ;
   private String[] P0AV82_A14764MRPrValMin ;
   private java.util.Date[] P0AV82_A14682MRPrFec ;
   private String[] P0AV82_A14757MRPrPLC ;
   private String[] P0AV82_A14758MRPrParDsc ;
   private short[] P0AV82_A14750MRPrParCod ;
   private long[] P0AV82_A14723MRPrParId ;
   private String[] P0AV82_A14759MRPrFasDsc ;
   private String[] P0AV82_A14719MRPrFasCod ;
   private String[] P0AV82_A14760MRPrMaqDsc ;
   private String[] P0AV82_A14720MRPrMaqCod ;
   private long[] P0AV82_A14762MRPrLin ;
   private short[] P0AV82_A14761MRPrOrd ;
   private String[] P0AV82_A14754MRPrHdr2 ;
   private String[] P0AV82_A14755MRPrHdr ;
   private String[] P0AV82_A130BarCodPar ;
   private byte[] P0AV82_A132BarCodReo ;
   private int[] P0AV82_A129BarCod ;
   private String[] P0AV82_A396EmprCod ;
   private long[] P0AV82_A14681MRPrId ;
   private String[] P0AV83_A14756MRPrTkn ;
   private java.util.Date[] P0AV83_A14753MRPrReg ;
   private String[] P0AV83_A14752MRPrIp ;
   private String[] P0AV83_A14751MRPrUsu ;
   private java.util.Date[] P0AV83_A14763MRPrFecEv ;
   private boolean[] P0AV83_A14722MRPrEr ;
   private java.util.Date[] P0AV83_A14682MRPrFec ;
   private String[] P0AV83_A14765MRPrValMax ;
   private String[] P0AV83_A14721MRPrVal ;
   private String[] P0AV83_A14764MRPrValMin ;
   private String[] P0AV83_A14757MRPrPLC ;
   private String[] P0AV83_A14758MRPrParDsc ;
   private short[] P0AV83_A14750MRPrParCod ;
   private long[] P0AV83_A14723MRPrParId ;
   private String[] P0AV83_A14759MRPrFasDsc ;
   private String[] P0AV83_A14719MRPrFasCod ;
   private String[] P0AV83_A14760MRPrMaqDsc ;
   private String[] P0AV83_A14720MRPrMaqCod ;
   private long[] P0AV83_A14762MRPrLin ;
   private short[] P0AV83_A14761MRPrOrd ;
   private String[] P0AV83_A14754MRPrHdr2 ;
   private String[] P0AV83_A14755MRPrHdr ;
   private String[] P0AV83_A130BarCodPar ;
   private byte[] P0AV83_A132BarCodReo ;
   private int[] P0AV83_A129BarCod ;
   private String[] P0AV83_A396EmprCod ;
   private long[] P0AV83_A14681MRPrId ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV101MaqCod ;
   private GXSimpleCollection<String> AV102FasCod ;
   private GXSimpleCollection<String> AV103Hdr ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class mrec_analisishdrexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AV82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV101MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV102FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV103Hdr ,
                                          String AV123Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV125Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV124Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV126Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV127Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV128Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV129Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV131Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV133Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV135Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV136Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV137Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV138Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV139Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV141Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV143Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV145Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV147Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV148Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV149Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV150Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV151Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV153Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV155Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV154Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV156Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV158Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV160Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV159Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV162Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV163Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV164Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV101MaqCod_size ,
                                          int AV102FasCod_size ,
                                          int AV103Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          short AV48OrderedBy ,
                                          boolean AV49OrderedDsc ,
                                          java.util.Date AV43Desde ,
                                          java.util.Date AV44Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV46Now ,
                                          String A14751MRPrUsu ,
                                          String AV45UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV100Ip ,
                                          String A14756MRPrTkn ,
                                          String AV47MTkn ,
                                          String AV35EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[66];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT MRPrTkn, MRPrReg, MRPrIp, MRPrUsu, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId, MRPrFasDsc, MRPrFasCod," ;
      scmdbuf += " MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, EmprCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
         GXv_int16[12] = (byte)(1) ;
         GXv_int16[13] = (byte)(1) ;
         GXv_int16[14] = (byte)(1) ;
         GXv_int16[15] = (byte)(1) ;
         GXv_int16[16] = (byte)(1) ;
         GXv_int16[17] = (byte)(1) ;
         GXv_int16[18] = (byte)(1) ;
         GXv_int16[19] = (byte)(1) ;
         GXv_int16[20] = (byte)(1) ;
         GXv_int16[21] = (byte)(1) ;
         GXv_int16[22] = (byte)(1) ;
         GXv_int16[23] = (byte)(1) ;
         GXv_int16[24] = (byte)(1) ;
         GXv_int16[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (0==AV126Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV130Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (0==AV136Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (0==AV137Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (0==AV138Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (0==AV139Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV144Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV146Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( ! (0==AV148Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      if ( ! (0==AV149Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int16[51] = (byte)(1) ;
      }
      if ( ! (0==AV150Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int16[52] = (byte)(1) ;
      }
      if ( ! (0==AV151Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int16[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV152Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int16[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV154Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int16[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV156Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int16[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV157Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int16[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV159Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int16[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV161Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int16[64] = (byte)(1) ;
      }
      if ( AV163Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV163Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV164Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int16[65] = (byte)(1) ;
      }
      if ( AV101MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV102FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV102FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV103Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV48OrderedBy == 1 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrPLC" ;
      }
      else if ( ( AV48OrderedBy == 1 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrPLC DESC" ;
      }
      else if ( AV48OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY MRPrHdr, MRPrMaqDsc" ;
      }
      else if ( ( AV48OrderedBy == 3 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV48OrderedBy == 3 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 4 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCod" ;
      }
      else if ( ( AV48OrderedBy == 4 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 5 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodReo" ;
      }
      else if ( ( AV48OrderedBy == 5 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodReo DESC" ;
      }
      else if ( ( AV48OrderedBy == 6 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodPar" ;
      }
      else if ( ( AV48OrderedBy == 6 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodPar DESC" ;
      }
      else if ( ( AV48OrderedBy == 7 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrHdr" ;
      }
      else if ( ( AV48OrderedBy == 7 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrHdr DESC" ;
      }
      else if ( ( AV48OrderedBy == 8 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrHdr2" ;
      }
      else if ( ( AV48OrderedBy == 8 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrHdr2 DESC" ;
      }
      else if ( ( AV48OrderedBy == 9 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrOrd" ;
      }
      else if ( ( AV48OrderedBy == 9 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrOrd DESC" ;
      }
      else if ( ( AV48OrderedBy == 10 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrLin" ;
      }
      else if ( ( AV48OrderedBy == 10 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrLin DESC" ;
      }
      else if ( ( AV48OrderedBy == 11 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrMaqCod" ;
      }
      else if ( ( AV48OrderedBy == 11 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrMaqCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 12 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrMaqDsc" ;
      }
      else if ( ( AV48OrderedBy == 12 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrMaqDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 13 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrFasCod" ;
      }
      else if ( ( AV48OrderedBy == 13 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrFasCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 14 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrFasDsc" ;
      }
      else if ( ( AV48OrderedBy == 14 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrFasDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 15 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrParId" ;
      }
      else if ( ( AV48OrderedBy == 15 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrParId DESC" ;
      }
      else if ( ( AV48OrderedBy == 16 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrParCod" ;
      }
      else if ( ( AV48OrderedBy == 16 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrParCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 17 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrParDsc" ;
      }
      else if ( ( AV48OrderedBy == 17 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrParDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 18 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrFec" ;
      }
      else if ( ( AV48OrderedBy == 18 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrFec DESC" ;
      }
      else if ( ( AV48OrderedBy == 19 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrValMin" ;
      }
      else if ( ( AV48OrderedBy == 19 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrValMin DESC" ;
      }
      else if ( ( AV48OrderedBy == 20 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrVal" ;
      }
      else if ( ( AV48OrderedBy == 20 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrVal DESC" ;
      }
      else if ( ( AV48OrderedBy == 21 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrValMax" ;
      }
      else if ( ( AV48OrderedBy == 21 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrValMax DESC" ;
      }
      else if ( ( AV48OrderedBy == 22 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrEr" ;
      }
      else if ( ( AV48OrderedBy == 22 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrEr DESC" ;
      }
      else if ( ( AV48OrderedBy == 23 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrFecEv" ;
      }
      else if ( ( AV48OrderedBy == 23 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrFecEv DESC" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P0AV83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV101MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV102FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV103Hdr ,
                                          String AV17FilterFullText ,
                                          String AV53TFEmprCod_Sel ,
                                          String AV52TFEmprCod ,
                                          int AV54TFBarCod ,
                                          int AV55TFBarCod_To ,
                                          byte AV56TFBarCodReo ,
                                          byte AV57TFBarCodReo_To ,
                                          String AV59TFBarCodPar_Sel ,
                                          String AV58TFBarCodPar ,
                                          String AV73TFMRPrHdr_Sel ,
                                          String AV72TFMRPrHdr ,
                                          String AV75TFMRPrHdr2_Sel ,
                                          String AV74TFMRPrHdr2 ,
                                          short AV60TFMRPrOrd ,
                                          short AV61TFMRPrOrd_To ,
                                          long AV62TFMRPrLin ,
                                          long AV63TFMRPrLin_To ,
                                          String AV69TFMRPrMaqCod_Sel ,
                                          String AV68TFMRPrMaqCod ,
                                          String AV71TFMRPrMaqDsc_Sel ,
                                          String AV70TFMRPrMaqDsc ,
                                          String AV65TFMRPrFasCod_Sel ,
                                          String AV64TFMRPrFasCod ,
                                          String AV67TFMRPrFasDsc_Sel ,
                                          String AV66TFMRPrFasDsc ,
                                          long AV90TFMRPrParId ,
                                          long AV91TFMRPrParId_To ,
                                          short AV86TFMRPrParCod ,
                                          short AV87TFMRPrParCod_To ,
                                          String AV89TFMRPrParDsc_Sel ,
                                          String AV88TFMRPrParDsc ,
                                          String AV85TFMRPrPLC_Sel ,
                                          String AV84TFMRPrPLC ,
                                          java.util.Date AV77TFMRPrFec ,
                                          String AV81TFMRPrValMin_Sel ,
                                          String AV80TFMRPrValMin ,
                                          String AV79TFMRPrVal_Sel ,
                                          String AV78TFMRPrVal ,
                                          String AV83TFMRPrValMax_Sel ,
                                          String AV82TFMRPrValMax ,
                                          byte AV76TFMRPrEr_Sel ,
                                          java.util.Date AV92TFMRPrFecEv ,
                                          int AV101MaqCod_size ,
                                          int AV102FasCod_size ,
                                          int AV103Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          short AV48OrderedBy ,
                                          boolean AV49OrderedDsc ,
                                          java.util.Date AV43Desde ,
                                          java.util.Date AV44Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV46Now ,
                                          String A14751MRPrUsu ,
                                          String AV45UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV100Ip ,
                                          String A14756MRPrTkn ,
                                          String AV47MTkn ,
                                          String AV35EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[66];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT MRPrTkn, MRPrReg, MRPrIp, MRPrUsu, MRPrFecEv, MRPrEr, MRPrFec, MRPrValMax, MRPrVal, MRPrValMin, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId, MRPrFasDsc, MRPrFasCod," ;
      scmdbuf += " MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, EmprCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV17FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
         GXv_int19[9] = (byte)(1) ;
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
         GXv_int19[13] = (byte)(1) ;
         GXv_int19[14] = (byte)(1) ;
         GXv_int19[15] = (byte)(1) ;
         GXv_int19[16] = (byte)(1) ;
         GXv_int19[17] = (byte)(1) ;
         GXv_int19[18] = (byte)(1) ;
         GXv_int19[19] = (byte)(1) ;
         GXv_int19[20] = (byte)(1) ;
         GXv_int19[21] = (byte)(1) ;
         GXv_int19[22] = (byte)(1) ;
         GXv_int19[23] = (byte)(1) ;
         GXv_int19[24] = (byte)(1) ;
         GXv_int19[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarCod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarCod_To) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarCodReo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV57TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFMRPrHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFMRPrHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFMRPrHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75TFMRPrHdr2_Sel)==0) && ( ! (GXutil.strcmp("", AV74TFMRPrHdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75TFMRPrHdr2_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (0==AV60TFMRPrOrd) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( ! (0==AV61TFMRPrOrd_To) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int19[39] = (byte)(1) ;
      }
      if ( ! (0==AV62TFMRPrLin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int19[40] = (byte)(1) ;
      }
      if ( ! (0==AV63TFMRPrLin_To) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int19[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69TFMRPrMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFMRPrMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69TFMRPrMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int19[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71TFMRPrMaqDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV70TFMRPrMaqDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71TFMRPrMaqDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int19[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65TFMRPrFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV64TFMRPrFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65TFMRPrFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int19[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFMRPrFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFMRPrFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFMRPrFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int19[49] = (byte)(1) ;
      }
      if ( ! (0==AV90TFMRPrParId) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int19[50] = (byte)(1) ;
      }
      if ( ! (0==AV91TFMRPrParId_To) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int19[51] = (byte)(1) ;
      }
      if ( ! (0==AV86TFMRPrParCod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int19[52] = (byte)(1) ;
      }
      if ( ! (0==AV87TFMRPrParCod_To) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int19[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89TFMRPrParDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV88TFMRPrParDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89TFMRPrParDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int19[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85TFMRPrPLC_Sel)==0) && ( ! (GXutil.strcmp("", AV84TFMRPrPLC)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85TFMRPrPLC_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int19[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77TFMRPrFec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int19[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81TFMRPrValMin_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMRPrValMin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMRPrValMin_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int19[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79TFMRPrVal_Sel)==0) && ( ! (GXutil.strcmp("", AV78TFMRPrVal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79TFMRPrVal_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int19[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83TFMRPrValMax_Sel)==0) && ( ! (GXutil.strcmp("", AV82TFMRPrValMax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83TFMRPrValMax_Sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int19[64] = (byte)(1) ;
      }
      if ( AV76TFMRPrEr_Sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV76TFMRPrEr_Sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92TFMRPrFecEv) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int19[65] = (byte)(1) ;
      }
      if ( AV101MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV102FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV102FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV103Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV48OrderedBy == 1 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrPLC" ;
      }
      else if ( ( AV48OrderedBy == 1 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrPLC DESC" ;
      }
      else if ( AV48OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY MRPrHdr, MRPrMaqDsc" ;
      }
      else if ( ( AV48OrderedBy == 3 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV48OrderedBy == 3 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 4 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCod" ;
      }
      else if ( ( AV48OrderedBy == 4 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 5 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodReo" ;
      }
      else if ( ( AV48OrderedBy == 5 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodReo DESC" ;
      }
      else if ( ( AV48OrderedBy == 6 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodPar" ;
      }
      else if ( ( AV48OrderedBy == 6 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodPar DESC" ;
      }
      else if ( ( AV48OrderedBy == 7 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrHdr" ;
      }
      else if ( ( AV48OrderedBy == 7 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrHdr DESC" ;
      }
      else if ( ( AV48OrderedBy == 8 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrHdr2" ;
      }
      else if ( ( AV48OrderedBy == 8 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrHdr2 DESC" ;
      }
      else if ( ( AV48OrderedBy == 9 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrOrd" ;
      }
      else if ( ( AV48OrderedBy == 9 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrOrd DESC" ;
      }
      else if ( ( AV48OrderedBy == 10 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrLin" ;
      }
      else if ( ( AV48OrderedBy == 10 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrLin DESC" ;
      }
      else if ( ( AV48OrderedBy == 11 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrMaqCod" ;
      }
      else if ( ( AV48OrderedBy == 11 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrMaqCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 12 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrMaqDsc" ;
      }
      else if ( ( AV48OrderedBy == 12 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrMaqDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 13 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrFasCod" ;
      }
      else if ( ( AV48OrderedBy == 13 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrFasCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 14 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrFasDsc" ;
      }
      else if ( ( AV48OrderedBy == 14 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrFasDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 15 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrParId" ;
      }
      else if ( ( AV48OrderedBy == 15 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrParId DESC" ;
      }
      else if ( ( AV48OrderedBy == 16 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrParCod" ;
      }
      else if ( ( AV48OrderedBy == 16 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrParCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 17 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrParDsc" ;
      }
      else if ( ( AV48OrderedBy == 17 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrParDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 18 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrFec" ;
      }
      else if ( ( AV48OrderedBy == 18 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrFec DESC" ;
      }
      else if ( ( AV48OrderedBy == 19 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrValMin" ;
      }
      else if ( ( AV48OrderedBy == 19 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrValMin DESC" ;
      }
      else if ( ( AV48OrderedBy == 20 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrVal" ;
      }
      else if ( ( AV48OrderedBy == 20 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrVal DESC" ;
      }
      else if ( ( AV48OrderedBy == 21 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrValMax" ;
      }
      else if ( ( AV48OrderedBy == 21 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrValMax DESC" ;
      }
      else if ( ( AV48OrderedBy == 22 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrEr" ;
      }
      else if ( ( AV48OrderedBy == 22 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrEr DESC" ;
      }
      else if ( ( AV48OrderedBy == 23 ) && ! AV49OrderedDsc )
      {
         scmdbuf += " ORDER BY MRPrFecEv" ;
      }
      else if ( ( AV48OrderedBy == 23 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRPrFecEv DESC" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_P0AV82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , ((Number) dynConstraints[70]).shortValue() , ((Boolean) dynConstraints[71]).booleanValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 1 :
                  return conditional_P0AV83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , ((Number) dynConstraints[70]).shortValue() , ((Boolean) dynConstraints[71]).booleanValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AV82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.getBoolean(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((long[]) buf[18])[0] = rslt.getLong(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 10);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.getBoolean(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((long[]) buf[18])[0] = rslt.getLong(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 10);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((long[]) buf[26])[0] = rslt.getLong(27);
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
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[69], false, true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[69], false, true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
      }
   }

}

