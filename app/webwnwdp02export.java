package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwnwdp02export extends GXProcedure
{
   public webwnwdp02export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwnwdp02export.class ), "" );
   }

   public webwnwdp02export( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webwnwdp02export.this.aP1 = new String[] {""};
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
      webwnwdp02export.this.aP0 = aP0;
      webwnwdp02export.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebWNwDP02Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV38TFDisCod) && (0==AV39TFDisCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Disposicion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFDisCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFDisCod_To );
      }
      if ( ! ( (0==AV40TFCliCod) && (0==AV41TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFCliCod_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFDisFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Pedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV42TFDisFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFDisArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFDisArtCod_Sel, GXv_char5) ;
         webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFDisArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFDisArtCod, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFDisArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFDisArtDsc_Sel, GXv_char5) ;
         webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFDisArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFDisArtDsc, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFDisColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFDisColNom_Sel, GXv_char5) ;
         webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFDisColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFDisColNom, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFDisNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFDisNomCli_Sel, GXv_char5) ;
         webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFDisNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFDisNomCli, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV52TFDisColNum) && (0==AV53TFDisColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFDisColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFDisColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFDibCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dibujo del Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFDibCli_Sel, GXv_char5) ;
         webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFDibCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dibujo del Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFDibCli, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV56TFDibInt) && (0==AV57TFDibInt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dibujo Interno", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFDibInt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFDibInt_To );
      }
      if ( ! ( (0==AV70TFDisMaxObsLin) && (0==AV71TFDisMaxObsLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máxima Observación", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV70TFDisMaxObsLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV71TFDisMaxObsLin_To );
      }
      if ( ! ( (0==AV72TFDisCanRec) && (0==AV73TFDisCanRec_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reclamaciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV72TFDisCanRec );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwnwdp02export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV73TFDisCanRec_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("WebWNwDP02ColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("WebWNwDP02ColumnsSelector") ;
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
      AV78Webwnwdp02ds_1_filterfulltext = AV18FilterFullText ;
      AV79Webwnwdp02ds_2_tfdiscod = AV38TFDisCod ;
      AV80Webwnwdp02ds_3_tfdiscod_to = AV39TFDisCod_To ;
      AV81Webwnwdp02ds_4_tfclicod = AV40TFCliCod ;
      AV82Webwnwdp02ds_5_tfclicod_to = AV41TFCliCod_To ;
      AV83Webwnwdp02ds_6_tfdisfec = AV42TFDisFec ;
      AV84Webwnwdp02ds_7_tfdisartcod = AV44TFDisArtCod ;
      AV85Webwnwdp02ds_8_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV86Webwnwdp02ds_9_tfdisartdsc = AV46TFDisArtDsc ;
      AV87Webwnwdp02ds_10_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV88Webwnwdp02ds_11_tfdiscolnom = AV48TFDisColNom ;
      AV89Webwnwdp02ds_12_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV90Webwnwdp02ds_13_tfdisnomcli = AV50TFDisNomCli ;
      AV91Webwnwdp02ds_14_tfdisnomcli_sel = AV51TFDisNomCli_Sel ;
      AV92Webwnwdp02ds_15_tfdiscolnum = AV52TFDisColNum ;
      AV93Webwnwdp02ds_16_tfdiscolnum_to = AV53TFDisColNum_To ;
      AV94Webwnwdp02ds_17_tfdibcli = AV54TFDibCli ;
      AV95Webwnwdp02ds_18_tfdibcli_sel = AV55TFDibCli_Sel ;
      AV96Webwnwdp02ds_19_tfdibint = AV56TFDibInt ;
      AV97Webwnwdp02ds_20_tfdibint_to = AV57TFDibInt_To ;
      AV98Webwnwdp02ds_21_tfdismaxobslin = AV70TFDisMaxObsLin ;
      AV99Webwnwdp02ds_22_tfdismaxobslin_to = AV71TFDisMaxObsLin_To ;
      AV100Webwnwdp02ds_23_tfdiscanrec = AV72TFDisCanRec ;
      AV101Webwnwdp02ds_24_tfdiscanrec_to = AV73TFDisCanRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV79Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV80Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV81Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV82Webwnwdp02ds_5_tfclicod_to) ,
                                           AV83Webwnwdp02ds_6_tfdisfec ,
                                           AV85Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV84Webwnwdp02ds_7_tfdisartcod ,
                                           AV87Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV86Webwnwdp02ds_9_tfdisartdsc ,
                                           AV89Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV88Webwnwdp02ds_11_tfdiscolnom ,
                                           AV91Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV90Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV92Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV93Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV95Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV94Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV96Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV97Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV69Discodp) ,
                                           Integer.valueOf(AV62CliCod) ,
                                           AV63DisCliNum ,
                                           AV64DisArtCod ,
                                           AV65Disartdsc ,
                                           AV66DisColNom ,
                                           AV67Disnomcli ,
                                           AV68DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV78Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV98Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV99Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV100Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV101Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV61pricod ,
                                           AV60Disfec ,
                                           AV59EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV78Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV84Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV84Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV86Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV86Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV88Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV88Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV90Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV90Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV94Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV94Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV63DisCliNum = GXutil.padr( GXutil.rtrim( AV63DisCliNum), 8, "%") ;
      lV64DisArtCod = GXutil.padr( GXutil.rtrim( AV64DisArtCod), 16, "%") ;
      lV65Disartdsc = GXutil.padr( GXutil.rtrim( AV65Disartdsc), 26, "%") ;
      lV66DisColNom = GXutil.padr( GXutil.rtrim( AV66DisColNom), 13, "%") ;
      lV67Disnomcli = GXutil.padr( GXutil.rtrim( AV67Disnomcli), 13, "%") ;
      /* Using cursor P08EO4 */
      pr_default.execute(0, new Object[] {AV59EmprCod, AV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, lV78Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV98Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV98Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV99Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV99Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV100Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV100Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV101Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV101Webwnwdp02ds_24_tfdiscanrec_to), AV61pricod, AV61pricod, AV60Disfec, Integer.valueOf(AV79Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV80Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV81Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV82Webwnwdp02ds_5_tfclicod_to), AV83Webwnwdp02ds_6_tfdisfec, lV84Webwnwdp02ds_7_tfdisartcod, AV85Webwnwdp02ds_8_tfdisartcod_sel, lV86Webwnwdp02ds_9_tfdisartdsc, AV87Webwnwdp02ds_10_tfdisartdsc_sel, lV88Webwnwdp02ds_11_tfdiscolnom, AV89Webwnwdp02ds_12_tfdiscolnom_sel, lV90Webwnwdp02ds_13_tfdisnomcli, AV91Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV92Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV93Webwnwdp02ds_16_tfdiscolnum_to), lV94Webwnwdp02ds_17_tfdibcli, AV95Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV96Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV97Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV69Discodp), Integer.valueOf(AV62CliCod), lV63DisCliNum, lV64DisArtCod, lV65Disartdsc, lV66DisColNom, lV67Disnomcli, AV68DisUsrcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4348DisUsrCod = P08EO4_A4348DisUsrCod[0] ;
         A360DisCliNum = P08EO4_A360DisCliNum[0] ;
         A757PriCod = P08EO4_A757PriCod[0] ;
         A396EmprCod = P08EO4_A396EmprCod[0] ;
         A1014DibInt = P08EO4_A1014DibInt[0] ;
         n1014DibInt = P08EO4_n1014DibInt[0] ;
         A1013DibCli = P08EO4_A1013DibCli[0] ;
         n1013DibCli = P08EO4_n1013DibCli[0] ;
         A363DisColNum = P08EO4_A363DisColNum[0] ;
         n363DisColNum = P08EO4_n363DisColNum[0] ;
         A1195DisNomCli = P08EO4_A1195DisNomCli[0] ;
         A362DisColNom = P08EO4_A362DisColNom[0] ;
         n362DisColNom = P08EO4_n362DisColNom[0] ;
         A337DisArtDsc = P08EO4_A337DisArtDsc[0] ;
         A335DisArtCod = P08EO4_A335DisArtCod[0] ;
         A369DisFec = P08EO4_A369DisFec[0] ;
         A252CliCod = P08EO4_A252CliCod[0] ;
         A361DisCod = P08EO4_A361DisCod[0] ;
         A367DisEst = P08EO4_A367DisEst[0] ;
         A13732DisCanRec = P08EO4_A13732DisCanRec[0] ;
         n13732DisCanRec = P08EO4_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08EO4_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08EO4_n13737DisMaxObsL[0] ;
         A13732DisCanRec = P08EO4_A13732DisCanRec[0] ;
         n13732DisCanRec = P08EO4_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08EO4_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08EO4_n13737DisMaxObsL[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A361DisCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A369DisFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A335DisArtCod, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A337DisArtDsc, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A362DisColNom, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1195DisNomCli, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A363DisColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1013DibCli, GXv_char5) ;
            webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1014DibInt );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13737DisMaxObsL );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13732DisCanRec );
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
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisCod", "", "Codigo Disposicion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisFec", "", "Fecha Pedido", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisArtCod", "", "Código Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisArtDsc", "", "Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisColNom", "", "Nombre Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNomCli", "", "Nombre Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisColNum", "", "Numero Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DibCli", "", "Dibujo del Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DibInt", "", "Dibujo Interno", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisMaxObsLin", "", "Máxima Observación", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisCanRec", "", "Reclamaciones", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWNwDP02ColumnsSelector", GXv_char5) ;
      webwnwdp02export.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WebWNwDP02GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWNwDP02GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WebWNwDP02GridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV102GXV2 = 1 ;
      while ( AV102GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV38TFDisCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFDisCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV40TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV42TFDisFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV44TFDisArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV45TFDisArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV46TFDisArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV47TFDisArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV48TFDisColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV49TFDisColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV50TFDisNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV51TFDisNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV52TFDisColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFDisColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI") == 0 )
         {
            AV54TFDibCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI_SEL") == 0 )
         {
            AV55TFDibCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBINT") == 0 )
         {
            AV56TFDibInt = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFDibInt_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISMAXOBSLIN") == 0 )
         {
            AV70TFDisMaxObsLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFDisMaxObsLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV72TFDisCanRec = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFDisCanRec_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV102GXV2 = (int)(AV102GXV2+1) ;
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
      this.aP0[0] = webwnwdp02export.this.AV11Filename;
      this.aP1[0] = webwnwdp02export.this.AV12ErrorMessage;
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
      AV18FilterFullText = "" ;
      AV42TFDisFec = GXutil.nullDate() ;
      AV45TFDisArtCod_Sel = "" ;
      AV44TFDisArtCod = "" ;
      AV47TFDisArtDsc_Sel = "" ;
      AV46TFDisArtDsc = "" ;
      AV49TFDisColNom_Sel = "" ;
      AV48TFDisColNom = "" ;
      AV51TFDisNomCli_Sel = "" ;
      AV50TFDisNomCli = "" ;
      AV55TFDibCli_Sel = "" ;
      AV54TFDibCli = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A369DisFec = GXutil.nullDate() ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1013DibCli = "" ;
      AV78Webwnwdp02ds_1_filterfulltext = "" ;
      AV83Webwnwdp02ds_6_tfdisfec = GXutil.nullDate() ;
      AV84Webwnwdp02ds_7_tfdisartcod = "" ;
      AV85Webwnwdp02ds_8_tfdisartcod_sel = "" ;
      AV86Webwnwdp02ds_9_tfdisartdsc = "" ;
      AV87Webwnwdp02ds_10_tfdisartdsc_sel = "" ;
      AV88Webwnwdp02ds_11_tfdiscolnom = "" ;
      AV89Webwnwdp02ds_12_tfdiscolnom_sel = "" ;
      AV90Webwnwdp02ds_13_tfdisnomcli = "" ;
      AV91Webwnwdp02ds_14_tfdisnomcli_sel = "" ;
      AV94Webwnwdp02ds_17_tfdibcli = "" ;
      AV95Webwnwdp02ds_18_tfdibcli_sel = "" ;
      lV78Webwnwdp02ds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV84Webwnwdp02ds_7_tfdisartcod = "" ;
      lV86Webwnwdp02ds_9_tfdisartdsc = "" ;
      lV88Webwnwdp02ds_11_tfdiscolnom = "" ;
      lV90Webwnwdp02ds_13_tfdisnomcli = "" ;
      lV94Webwnwdp02ds_17_tfdibcli = "" ;
      lV63DisCliNum = "" ;
      lV64DisArtCod = "" ;
      lV65Disartdsc = "" ;
      lV66DisColNom = "" ;
      lV67Disnomcli = "" ;
      AV63DisCliNum = "" ;
      AV64DisArtCod = "" ;
      AV65Disartdsc = "" ;
      AV66DisColNom = "" ;
      AV67Disnomcli = "" ;
      AV68DisUsrcod = "" ;
      A360DisCliNum = "" ;
      A4348DisUsrCod = "" ;
      A757PriCod = "" ;
      AV61pricod = "" ;
      AV60Disfec = GXutil.nullDate() ;
      AV59EmprCod = "" ;
      A396EmprCod = "" ;
      P08EO4_A4348DisUsrCod = new String[] {""} ;
      P08EO4_A360DisCliNum = new String[] {""} ;
      P08EO4_A757PriCod = new String[] {""} ;
      P08EO4_A396EmprCod = new String[] {""} ;
      P08EO4_A1014DibInt = new int[1] ;
      P08EO4_n1014DibInt = new boolean[] {false} ;
      P08EO4_A1013DibCli = new String[] {""} ;
      P08EO4_n1013DibCli = new boolean[] {false} ;
      P08EO4_A363DisColNum = new int[1] ;
      P08EO4_n363DisColNum = new boolean[] {false} ;
      P08EO4_A1195DisNomCli = new String[] {""} ;
      P08EO4_A362DisColNom = new String[] {""} ;
      P08EO4_n362DisColNom = new boolean[] {false} ;
      P08EO4_A337DisArtDsc = new String[] {""} ;
      P08EO4_A335DisArtCod = new String[] {""} ;
      P08EO4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08EO4_A252CliCod = new int[1] ;
      P08EO4_A361DisCod = new int[1] ;
      P08EO4_A367DisEst = new byte[1] ;
      P08EO4_A13732DisCanRec = new short[1] ;
      P08EO4_n13732DisCanRec = new boolean[] {false} ;
      P08EO4_A13737DisMaxObsL = new short[1] ;
      P08EO4_n13737DisMaxObsL = new boolean[] {false} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwnwdp02export__default(),
         new Object[] {
             new Object[] {
            P08EO4_A4348DisUsrCod, P08EO4_A360DisCliNum, P08EO4_A757PriCod, P08EO4_A396EmprCod, P08EO4_A1014DibInt, P08EO4_n1014DibInt, P08EO4_A1013DibCli, P08EO4_n1013DibCli, P08EO4_A363DisColNum, P08EO4_n363DisColNum,
            P08EO4_A1195DisNomCli, P08EO4_A362DisColNom, P08EO4_n362DisColNom, P08EO4_A337DisArtDsc, P08EO4_A335DisArtCod, P08EO4_A369DisFec, P08EO4_A252CliCod, P08EO4_A361DisCod, P08EO4_A367DisEst, P08EO4_A13732DisCanRec,
            P08EO4_n13732DisCanRec, P08EO4_A13737DisMaxObsL, P08EO4_n13737DisMaxObsL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private short AV70TFDisMaxObsLin ;
   private short AV71TFDisMaxObsLin_To ;
   private short AV72TFDisCanRec ;
   private short AV73TFDisCanRec_To ;
   private short GXv_int3[] ;
   private short A13737DisMaxObsL ;
   private short A13732DisCanRec ;
   private short AV98Webwnwdp02ds_21_tfdismaxobslin ;
   private short AV99Webwnwdp02ds_22_tfdismaxobslin_to ;
   private short AV100Webwnwdp02ds_23_tfdiscanrec ;
   private short AV101Webwnwdp02ds_24_tfdiscanrec_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFDisCod ;
   private int AV39TFDisCod_To ;
   private int AV40TFCliCod ;
   private int AV41TFCliCod_To ;
   private int AV52TFDisColNum ;
   private int AV53TFDisColNum_To ;
   private int AV56TFDibInt ;
   private int AV57TFDibInt_To ;
   private int AV76GXV1 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1014DibInt ;
   private int AV79Webwnwdp02ds_2_tfdiscod ;
   private int AV80Webwnwdp02ds_3_tfdiscod_to ;
   private int AV81Webwnwdp02ds_4_tfclicod ;
   private int AV82Webwnwdp02ds_5_tfclicod_to ;
   private int AV92Webwnwdp02ds_15_tfdiscolnum ;
   private int AV93Webwnwdp02ds_16_tfdiscolnum_to ;
   private int AV96Webwnwdp02ds_19_tfdibint ;
   private int AV97Webwnwdp02ds_20_tfdibint_to ;
   private int AV69Discodp ;
   private int AV62CliCod ;
   private int AV102GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV45TFDisArtCod_Sel ;
   private String AV44TFDisArtCod ;
   private String AV47TFDisArtDsc_Sel ;
   private String AV46TFDisArtDsc ;
   private String AV49TFDisColNom_Sel ;
   private String AV48TFDisColNom ;
   private String AV51TFDisNomCli_Sel ;
   private String AV50TFDisNomCli ;
   private String AV55TFDibCli_Sel ;
   private String AV54TFDibCli ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1013DibCli ;
   private String AV84Webwnwdp02ds_7_tfdisartcod ;
   private String AV85Webwnwdp02ds_8_tfdisartcod_sel ;
   private String AV86Webwnwdp02ds_9_tfdisartdsc ;
   private String AV87Webwnwdp02ds_10_tfdisartdsc_sel ;
   private String AV88Webwnwdp02ds_11_tfdiscolnom ;
   private String AV89Webwnwdp02ds_12_tfdiscolnom_sel ;
   private String AV90Webwnwdp02ds_13_tfdisnomcli ;
   private String AV91Webwnwdp02ds_14_tfdisnomcli_sel ;
   private String AV94Webwnwdp02ds_17_tfdibcli ;
   private String AV95Webwnwdp02ds_18_tfdibcli_sel ;
   private String scmdbuf ;
   private String lV84Webwnwdp02ds_7_tfdisartcod ;
   private String lV86Webwnwdp02ds_9_tfdisartdsc ;
   private String lV88Webwnwdp02ds_11_tfdiscolnom ;
   private String lV90Webwnwdp02ds_13_tfdisnomcli ;
   private String lV94Webwnwdp02ds_17_tfdibcli ;
   private String lV63DisCliNum ;
   private String lV64DisArtCod ;
   private String lV65Disartdsc ;
   private String lV66DisColNom ;
   private String lV67Disnomcli ;
   private String AV63DisCliNum ;
   private String AV64DisArtCod ;
   private String AV65Disartdsc ;
   private String AV66DisColNom ;
   private String AV67Disnomcli ;
   private String AV68DisUsrcod ;
   private String A360DisCliNum ;
   private String A4348DisUsrCod ;
   private String A757PriCod ;
   private String AV61pricod ;
   private String AV59EmprCod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV42TFDisFec ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV83Webwnwdp02ds_6_tfdisfec ;
   private java.util.Date AV60Disfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n13732DisCanRec ;
   private boolean n13737DisMaxObsL ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV78Webwnwdp02ds_1_filterfulltext ;
   private String lV78Webwnwdp02ds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08EO4_A4348DisUsrCod ;
   private String[] P08EO4_A360DisCliNum ;
   private String[] P08EO4_A757PriCod ;
   private String[] P08EO4_A396EmprCod ;
   private int[] P08EO4_A1014DibInt ;
   private boolean[] P08EO4_n1014DibInt ;
   private String[] P08EO4_A1013DibCli ;
   private boolean[] P08EO4_n1013DibCli ;
   private int[] P08EO4_A363DisColNum ;
   private boolean[] P08EO4_n363DisColNum ;
   private String[] P08EO4_A1195DisNomCli ;
   private String[] P08EO4_A362DisColNom ;
   private boolean[] P08EO4_n362DisColNom ;
   private String[] P08EO4_A337DisArtDsc ;
   private String[] P08EO4_A335DisArtCod ;
   private java.util.Date[] P08EO4_A369DisFec ;
   private int[] P08EO4_A252CliCod ;
   private int[] P08EO4_A361DisCod ;
   private byte[] P08EO4_A367DisEst ;
   private short[] P08EO4_A13732DisCanRec ;
   private boolean[] P08EO4_n13732DisCanRec ;
   private short[] P08EO4_A13737DisMaxObsL ;
   private boolean[] P08EO4_n13737DisMaxObsL ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class webwnwdp02export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV79Webwnwdp02ds_2_tfdiscod ,
                                          int AV80Webwnwdp02ds_3_tfdiscod_to ,
                                          int AV81Webwnwdp02ds_4_tfclicod ,
                                          int AV82Webwnwdp02ds_5_tfclicod_to ,
                                          java.util.Date AV83Webwnwdp02ds_6_tfdisfec ,
                                          String AV85Webwnwdp02ds_8_tfdisartcod_sel ,
                                          String AV84Webwnwdp02ds_7_tfdisartcod ,
                                          String AV87Webwnwdp02ds_10_tfdisartdsc_sel ,
                                          String AV86Webwnwdp02ds_9_tfdisartdsc ,
                                          String AV89Webwnwdp02ds_12_tfdiscolnom_sel ,
                                          String AV88Webwnwdp02ds_11_tfdiscolnom ,
                                          String AV91Webwnwdp02ds_14_tfdisnomcli_sel ,
                                          String AV90Webwnwdp02ds_13_tfdisnomcli ,
                                          int AV92Webwnwdp02ds_15_tfdiscolnum ,
                                          int AV93Webwnwdp02ds_16_tfdiscolnum_to ,
                                          String AV95Webwnwdp02ds_18_tfdibcli_sel ,
                                          String AV94Webwnwdp02ds_17_tfdibcli ,
                                          int AV96Webwnwdp02ds_19_tfdibint ,
                                          int AV97Webwnwdp02ds_20_tfdibint_to ,
                                          int AV69Discodp ,
                                          int AV62CliCod ,
                                          String AV63DisCliNum ,
                                          String AV64DisArtCod ,
                                          String AV65Disartdsc ,
                                          String AV66DisColNom ,
                                          String AV67Disnomcli ,
                                          String AV68DisUsrcod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          java.util.Date A369DisFec ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          String A1195DisNomCli ,
                                          int A363DisColNum ,
                                          String A1013DibCli ,
                                          int A1014DibInt ,
                                          String A360DisCliNum ,
                                          String A4348DisUsrCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV78Webwnwdp02ds_1_filterfulltext ,
                                          short A13737DisMaxObsL ,
                                          short A13732DisCanRec ,
                                          short AV98Webwnwdp02ds_21_tfdismaxobslin ,
                                          short AV99Webwnwdp02ds_22_tfdismaxobslin_to ,
                                          short AV100Webwnwdp02ds_23_tfdiscanrec ,
                                          short AV101Webwnwdp02ds_24_tfdiscanrec_to ,
                                          String A757PriCod ,
                                          String AV61pricod ,
                                          java.util.Date AV60Disfec ,
                                          String AV59EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[51];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.DisUsrCod, T1.DisCliNum, T1.PriCod, T1.EmprCod, T1.DibInt, T1.DibCli, T1.DisColNum, T1.DisNomCli, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisFec," ;
      scmdbuf += " T1.CliCod, T1.DisCod, T1.DisEst, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisMaxObsL, 0) AS DisMaxObsL FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*)" ;
      scmdbuf += " AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI'" ;
      scmdbuf += " GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV" ;
      scmdbuf += " GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV79Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV80Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV81Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV82Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV90Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (0==AV92Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV94Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (0==AV96Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (0==AV69Discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (0==AV62CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibCli" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibInt" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibInt DESC" ;
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
                  return conditional_P08EO4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(17);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
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
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               return;
      }
   }

}

