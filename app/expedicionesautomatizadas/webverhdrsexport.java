package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webverhdrsexport extends GXProcedure
{
   public webverhdrsexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webverhdrsexport.class ), "" );
   }

   public webverhdrsexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webverhdrsexport.this.aP1 = new String[] {""};
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
      webverhdrsexport.this.aP0 = aP0;
      webverhdrsexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebVerhdrsExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21FilterFullText, GXv_char5) ;
      webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV22HisProDTF );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setItalic( (short)(1) );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( AV23HisProDTF_To );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV24MaqCod, GXv_char5) ;
      webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV40TFBarCod) && (0==AV41TFBarCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFBarCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFBarCod_To );
      }
      if ( ! ( (0==AV42TFBarCodReo) && (0==AV43TFBarCodReo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFBarCodReo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFBarCodReo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFBarCodPar_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarCodPar_Sel, GXv_char5) ;
         webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFBarCodPar)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Particion Barcada", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarCodPar, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV46TFCliCod) && (0==AV47TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFCliNom_Sel, GXv_char5) ;
         webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCliNom, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarSer_Sel, GXv_char5) ;
         webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarSer, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFBarSerDsc_Sel, GXv_char5) ;
         webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFBarSerDsc, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFHisProKgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFHisProKgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HisProKgr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFHisProKgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55TFHisProKgr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFHisProMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFHisProMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HisProMtr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TFHisProMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFHisProMtr_To)) );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV58TFHisProDTF) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV58TFHisProDTF );
      }
      if ( ! ( (GXutil.strcmp("", AV61TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFBarColNom_Sel, GXv_char5) ;
         webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFBarColNom, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFHisProCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Proceso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFHisProCod_Sel, GXv_char5) ;
         webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFHisProCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Proceso", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFHisProCod, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFMaqCod_Sel, GXv_char5) ;
         webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFMaqCod, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFMaqCDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo+Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFMaqCDsc_Sel, GXv_char5) ;
         webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFMaqCDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo+Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webverhdrsexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFMaqCDsc, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV37VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV25Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector"), "") != 0 )
      {
         AV32ColumnsSelectorXML = AV25Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector") ;
         AV29ColumnsSelector.fromxml(AV32ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV31ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV71GXV1));
         if ( AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setColor( 11 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV21FilterFullText ;
      AV74Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV22HisProDTF ;
      AV75Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV23HisProDTF_To ;
      AV76Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV24MaqCod ;
      AV77Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV40TFBarCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV41TFBarCod_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV42TFBarCodReo ;
      AV80Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV43TFBarCodReo_To ;
      AV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV44TFBarCodPar ;
      AV82Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV45TFBarCodPar_Sel ;
      AV83Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV46TFCliCod ;
      AV84Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV47TFCliCod_To ;
      AV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV48TFCliNom ;
      AV86Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV49TFCliNom_Sel ;
      AV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV50TFBarSer ;
      AV88Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV51TFBarSer_Sel ;
      AV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV52TFBarSerDsc ;
      AV90Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV53TFBarSerDsc_Sel ;
      AV91Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV54TFHisProKgr ;
      AV92Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV55TFHisProKgr_To ;
      AV93Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV56TFHisProMtr ;
      AV94Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV57TFHisProMtr_To ;
      AV95Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV58TFHisProDTF ;
      AV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV60TFBarColNom ;
      AV97Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV62TFHisProCod ;
      AV99Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV63TFHisProCod_Sel ;
      AV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV64TFMaqCod ;
      AV101Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV65TFMaqCod_Sel ;
      AV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV66TFMaqCDsc ;
      AV103Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV67TFMaqCDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV74Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV79Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV80Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV83Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV84Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV99Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV101Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV103Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           AV16EmprCod ,
                                           AV17Maqcod1 ,
                                           A396EmprCod ,
                                           AV18Maqcod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09782 */
      pr_default.execute(0, new Object[] {AV16EmprCod, AV17Maqcod1, AV18Maqcod2, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV74Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV75Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV76Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV77Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV79Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV80Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV82Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV83Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV84Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV86Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV88Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV90Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV91Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV92Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV93Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV94Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV95Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV97Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV99Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV101Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV103Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09782_A396EmprCod[0] ;
         A2504HisProCod = P09782_A2504HisProCod[0] ;
         A135BarColNom = P09782_A135BarColNom[0] ;
         A1526HisProMtr = P09782_A1526HisProMtr[0] ;
         A1525HisProKgr = P09782_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09782_A1652BarSerDsc[0] ;
         A212BarSer = P09782_A212BarSer[0] ;
         A279CliNom = P09782_A279CliNom[0] ;
         A252CliCod = P09782_A252CliCod[0] ;
         n252CliCod = P09782_n252CliCod[0] ;
         A130BarCodPar = P09782_A130BarCodPar[0] ;
         A132BarCodReo = P09782_A132BarCodReo[0] ;
         A129BarCod = P09782_A129BarCod[0] ;
         A4441HisProDTF = P09782_A4441HisProDTF[0] ;
         n4441HisProDTF = P09782_n4441HisProDTF[0] ;
         A606MaqDsc = P09782_A606MaqDsc[0] ;
         n606MaqDsc = P09782_n606MaqDsc[0] ;
         A602MaqCod = P09782_A602MaqCod[0] ;
         A558HisProFec = P09782_A558HisProFec[0] ;
         A561HisProLin = P09782_A561HisProLin[0] ;
         A135BarColNom = P09782_A135BarColNom[0] ;
         A1652BarSerDsc = P09782_A1652BarSerDsc[0] ;
         A212BarSer = P09782_A212BarSer[0] ;
         A252CliCod = P09782_A252CliCod[0] ;
         n252CliCod = P09782_n252CliCod[0] ;
         A279CliNom = P09782_A279CliNom[0] ;
         A606MaqDsc = P09782_A606MaqDsc[0] ;
         n606MaqDsc = P09782_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
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
         AV37VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A129BarCod );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A132BarCodReo );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A130BarCodPar, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setDate( A4441HisProDTF );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2504HisProCod, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13734MaqCDsc, GXv_char5) ;
            webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
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
      AV29ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCod", "", "Codigo Barcada", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCodReo", "", "Codigo Reoperado Barcada", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCodPar", "", "Codigo Particion Barcada", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre Cliente", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSer", "", "Serie", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&TipArtDsc", "", "Tipo Artículo", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&FasDsc", "", "Descripcion ", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProKgr", "", "HisProKgr", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProMtr", "", "HisProMtr", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProDTF", "", "Fin", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNom", "", "Nombre Color", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Turno", "", "Turno", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HisProCod", "", "Codigo Proceso", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCod", "", "Código Máquina", false, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCDsc", "", "Codigo+Descripcion", false, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV33UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector", GXv_char5) ;
      webverhdrsexport.this.GXt_char4 = GXv_char5[0] ;
      AV33UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV33UserCustomValue)==0) ) )
      {
         AV30ColumnsSelectorAux.fromxml(AV33UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV30ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV30ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebVerhdrsGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsGridState"), null, null);
      }
      AV19OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV20OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV104GXV2 = 1 ;
      while ( AV104GXV2 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV104GXV2));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPRODTF") == 0 )
         {
            AV22HisProDTF = localUtil.ctot( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV23HisProDTF_To = localUtil.ctot( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "MAQCOD") == 0 )
         {
            AV24MaqCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV40TFBarCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFBarCod_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV42TFBarCodReo = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFBarCodReo_To = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV44TFBarCodPar = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV45TFBarCodPar_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV46TFCliCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFCliCod_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV48TFCliNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV49TFCliNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV50TFBarSer = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV51TFBarSer_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV52TFBarSerDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV53TFBarSerDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV54TFHisProKgr = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFHisProKgr_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV56TFHisProMtr = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFHisProMtr_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV58TFHisProDTF = localUtil.ctot( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV60TFBarColNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV61TFBarColNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD") == 0 )
         {
            AV62TFHisProCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD_SEL") == 0 )
         {
            AV63TFHisProCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV64TFMaqCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV65TFMaqCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC") == 0 )
         {
            AV66TFMaqCDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC_SEL") == 0 )
         {
            AV67TFMaqCDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD1") == 0 )
         {
            AV17Maqcod1 = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD2") == 0 )
         {
            AV18Maqcod2 = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV104GXV2 = (int)(AV104GXV2+1) ;
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
      this.aP0[0] = webverhdrsexport.this.AV11Filename;
      this.aP1[0] = webverhdrsexport.this.AV12ErrorMessage;
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
      AV21FilterFullText = "" ;
      AV22HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV23HisProDTF_To = GXutil.resetTime( GXutil.nullDate() );
      AV24MaqCod = "" ;
      AV45TFBarCodPar_Sel = "" ;
      AV44TFBarCodPar = "" ;
      AV49TFCliNom_Sel = "" ;
      AV48TFCliNom = "" ;
      AV51TFBarSer_Sel = "" ;
      AV50TFBarSer = "" ;
      AV53TFBarSerDsc_Sel = "" ;
      AV52TFBarSerDsc = "" ;
      AV54TFHisProKgr = DecimalUtil.ZERO ;
      AV55TFHisProKgr_To = DecimalUtil.ZERO ;
      AV56TFHisProMtr = DecimalUtil.ZERO ;
      AV57TFHisProMtr_To = DecimalUtil.ZERO ;
      AV58TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV61TFBarColNom_Sel = "" ;
      AV60TFBarColNom = "" ;
      AV63TFHisProCod_Sel = "" ;
      AV62TFHisProCod = "" ;
      AV65TFMaqCod_Sel = "" ;
      AV64TFMaqCod = "" ;
      AV67TFMaqCDsc_Sel = "" ;
      AV66TFMaqCDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV25Session = httpContext.getWebSession();
      AV32ColumnsSelectorXML = "" ;
      AV29ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV31ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A135BarColNom = "" ;
      A2504HisProCod = "" ;
      A602MaqCod = "" ;
      A13734MaqCDsc = "" ;
      AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      AV74Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV75Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = GXutil.resetTime( GXutil.nullDate() );
      AV76Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      AV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      AV82Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = "" ;
      AV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      AV86Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = "" ;
      AV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      AV88Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = "" ;
      AV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      AV90Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = "" ;
      AV91Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV92Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV93Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV94Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV95Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      AV97Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = "" ;
      AV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      AV99Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = "" ;
      AV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      AV101Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = "" ;
      AV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      AV103Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = "" ;
      scmdbuf = "" ;
      lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      lV76Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      lV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      lV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      lV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      lV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      lV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      lV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      lV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      lV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      A606MaqDsc = "" ;
      AV16EmprCod = "" ;
      AV17Maqcod1 = "" ;
      A396EmprCod = "" ;
      AV18Maqcod2 = "" ;
      P09782_A396EmprCod = new String[] {""} ;
      P09782_A2504HisProCod = new String[] {""} ;
      P09782_A135BarColNom = new String[] {""} ;
      P09782_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09782_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09782_A1652BarSerDsc = new String[] {""} ;
      P09782_A212BarSer = new String[] {""} ;
      P09782_A279CliNom = new String[] {""} ;
      P09782_A252CliCod = new int[1] ;
      P09782_n252CliCod = new boolean[] {false} ;
      P09782_A130BarCodPar = new String[] {""} ;
      P09782_A132BarCodReo = new byte[1] ;
      P09782_A129BarCod = new int[1] ;
      P09782_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09782_n4441HisProDTF = new boolean[] {false} ;
      P09782_A606MaqDsc = new String[] {""} ;
      P09782_n606MaqDsc = new boolean[] {false} ;
      P09782_A602MaqCod = new String[] {""} ;
      P09782_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09782_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      AV33UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV30ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webverhdrsexport__default(),
         new Object[] {
             new Object[] {
            P09782_A396EmprCod, P09782_A2504HisProCod, P09782_A135BarColNom, P09782_A1526HisProMtr, P09782_A1525HisProKgr, P09782_A1652BarSerDsc, P09782_A212BarSer, P09782_A279CliNom, P09782_A252CliCod, P09782_n252CliCod,
            P09782_A130BarCodPar, P09782_A132BarCodReo, P09782_A129BarCod, P09782_A4441HisProDTF, P09782_n4441HisProDTF, P09782_A606MaqDsc, P09782_n606MaqDsc, P09782_A602MaqCod, P09782_A558HisProFec, P09782_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42TFBarCodReo ;
   private byte AV43TFBarCodReo_To ;
   private byte A132BarCodReo ;
   private byte AV79Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ;
   private byte AV80Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ;
   private short GXv_int3[] ;
   private short AV19OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV40TFBarCod ;
   private int AV41TFBarCod_To ;
   private int AV46TFCliCod ;
   private int AV47TFCliCod_To ;
   private int AV71GXV1 ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV77Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ;
   private int AV78Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ;
   private int AV83Expedicionesautomatizadas_webverhdrsds_11_tfclicod ;
   private int AV84Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ;
   private int A561HisProLin ;
   private int AV104GXV2 ;
   private long AV37VisibleColumnCount ;
   private java.math.BigDecimal AV54TFHisProKgr ;
   private java.math.BigDecimal AV55TFHisProKgr_To ;
   private java.math.BigDecimal AV56TFHisProMtr ;
   private java.math.BigDecimal AV57TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV91Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ;
   private java.math.BigDecimal AV92Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV93Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ;
   private java.math.BigDecimal AV94Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ;
   private String AV24MaqCod ;
   private String AV45TFBarCodPar_Sel ;
   private String AV44TFBarCodPar ;
   private String AV49TFCliNom_Sel ;
   private String AV48TFCliNom ;
   private String AV51TFBarSer_Sel ;
   private String AV50TFBarSer ;
   private String AV53TFBarSerDsc_Sel ;
   private String AV52TFBarSerDsc ;
   private String AV61TFBarColNom_Sel ;
   private String AV60TFBarColNom ;
   private String AV63TFHisProCod_Sel ;
   private String AV62TFHisProCod ;
   private String AV65TFMaqCod_Sel ;
   private String AV64TFMaqCod ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A2504HisProCod ;
   private String A602MaqCod ;
   private String AV76Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String AV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String AV82Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ;
   private String AV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String AV86Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ;
   private String AV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String AV88Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ;
   private String AV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String AV90Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ;
   private String AV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String AV97Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ;
   private String AV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String AV99Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ;
   private String AV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String AV101Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV76Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String lV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String lV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String lV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String lV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String lV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String lV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String lV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String A606MaqDsc ;
   private String AV16EmprCod ;
   private String AV17Maqcod1 ;
   private String A396EmprCod ;
   private String AV18Maqcod2 ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV22HisProDTF ;
   private java.util.Date AV23HisProDTF_To ;
   private java.util.Date AV58TFHisProDTF ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV74Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ;
   private java.util.Date AV75Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ;
   private java.util.Date AV95Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean AV20OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n4441HisProDTF ;
   private boolean n606MaqDsc ;
   private String AV32ColumnsSelectorXML ;
   private String AV33UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV21FilterFullText ;
   private String AV67TFMaqCDsc_Sel ;
   private String AV66TFMaqCDsc ;
   private String A13734MaqCDsc ;
   private String AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String AV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String AV103Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ;
   private String lV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String lV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09782_A396EmprCod ;
   private String[] P09782_A2504HisProCod ;
   private String[] P09782_A135BarColNom ;
   private java.math.BigDecimal[] P09782_A1526HisProMtr ;
   private java.math.BigDecimal[] P09782_A1525HisProKgr ;
   private String[] P09782_A1652BarSerDsc ;
   private String[] P09782_A212BarSer ;
   private String[] P09782_A279CliNom ;
   private int[] P09782_A252CliCod ;
   private boolean[] P09782_n252CliCod ;
   private String[] P09782_A130BarCodPar ;
   private byte[] P09782_A132BarCodReo ;
   private int[] P09782_A129BarCod ;
   private java.util.Date[] P09782_A4441HisProDTF ;
   private boolean[] P09782_n4441HisProDTF ;
   private String[] P09782_A606MaqDsc ;
   private boolean[] P09782_n606MaqDsc ;
   private String[] P09782_A602MaqCod ;
   private java.util.Date[] P09782_A558HisProFec ;
   private int[] P09782_A561HisProLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV31ColumnsSelector_Column ;
}

final  class webverhdrsexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09782( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV74Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV75Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV77Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV79Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV80Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV83Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV84Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV86Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV88Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV91Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV92Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV93Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV94Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV95Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV99Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV101Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV103Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV16EmprCod ,
                                          String AV17Maqcod1 ,
                                          String A396EmprCod ,
                                          String AV18Maqcod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[46];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV73Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV79Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV80Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV81Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV85Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV87Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV98Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV19OrderedBy == 1 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV19OrderedBy == 1 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV19OrderedBy == 11 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV19OrderedBy == 11 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV19OrderedBy == 12 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProCod" ;
      }
      else if ( ( AV19OrderedBy == 12 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProCod DESC" ;
      }
      else if ( ( AV19OrderedBy == 13 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV19OrderedBy == 13 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
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
                  return conditional_P09782(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09782", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
      }
   }

}

