package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_wcexport extends GXProcedure
{
   public consultadeproduccion_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_wcexport.class ), "" );
   }

   public consultadeproduccion_wcexport( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultadeproduccion_wcexport.this.aP1 = new String[] {""};
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
      consultadeproduccion_wcexport.this.aP0 = aP0;
      consultadeproduccion_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (0==AV48TFCliCod) && (0==AV49TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFCliNom_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFCliNom, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFBarNHdr_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFBarNHdr, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV182TFBarAgrEst_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "A?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV182TFBarAgrEst_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV181TFBarAgrEst)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "A?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV181TFBarAgrEst, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFBarSer_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFBarSer, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFBarSerDsc_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFBarSerDsc, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV56TFBarTipArt) && (0==AV57TFBarTipArt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tip Art", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFBarTipArt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFBarTipArt_To );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFBarTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFBarTipArtDsc_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFBarTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFBarTipArtDsc, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV61TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFBarColNom_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFBarColNom, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV62TFBarColNum) && (0==AV63TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV62TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV63TFBarColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV226TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV226TFBarNomCli_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV225TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV225TFBarNomCli, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV149TFBarSit) && (0==AV150TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "St", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV149TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV150TFBarSit_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFBarFecGen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Generacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV64TFBarFecGen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66TFBarFecCli)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disp Cli", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV66TFBarFecCli );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV169TFBarFecFpr)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( " Ent Prev", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV169TFBarFecFpr );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70TFBarFecSal)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Salida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV70TFBarFecSal );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV90TFBarFasSig_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Siguiente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFBarFasSig_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV89TFBarFasSig)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Siguiente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFBarFasSig, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV476TFBarAlbUltimo) && (0==AV477TFBarAlbUltimo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Albaran", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV476TFBarAlbUltimo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV477TFBarAlbUltimo_To );
      }
      if ( ! ( (0==AV488TFBarAlbFact) && (0==AV489TFBarAlbFact_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factura", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV488TFBarAlbFact );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV489TFBarAlbFact_To );
      }
      if ( ! ( (GXutil.strcmp("", AV350TFBarGirar_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV350TFBarGirar_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV349TFBarGirar)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV349TFBarGirar, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV397TFBarAcaAnh) && (0==AV398TFBarAcaAnh_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cuaderno", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV397TFBarAcaAnh );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV398TFBarAcaAnh_To );
      }
      if ( ! ( (GXutil.strcmp("", AV272TFBarProPer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "CTW", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV272TFBarProPer_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV271TFBarProPer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "CTW", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV271TFBarProPer, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV485TFBarNormas_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estandars Textiles", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV485TFBarNormas_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV484TFBarNormas)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estandars Textiles", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV484TFBarNormas, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV487TFDisUsrCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV487TFDisUsrCod_Sel, GXv_char5) ;
         consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV486TFDisUsrCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadeproduccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV486TFDisUsrCod, GXv_char5) ;
            consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Produccion.ConsultadeProduccion_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV528GXV1 = 1 ;
      while ( AV528GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV528GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV528GXV1 = (int)(AV528GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV48TFCliCod) ,
                                           Integer.valueOf(AV49TFCliCod_To) ,
                                           AV51TFCliNom_Sel ,
                                           AV50TFCliNom ,
                                           AV41TFBarNHdr_Sel ,
                                           AV40TFBarNHdr ,
                                           AV182TFBarAgrEst_Sel ,
                                           AV181TFBarAgrEst ,
                                           AV53TFBarSer_Sel ,
                                           AV52TFBarSer ,
                                           AV55TFBarSerDsc_Sel ,
                                           AV54TFBarSerDsc ,
                                           Short.valueOf(AV56TFBarTipArt) ,
                                           Short.valueOf(AV57TFBarTipArt_To) ,
                                           AV59TFBarTipArtDsc_Sel ,
                                           AV58TFBarTipArtDsc ,
                                           AV61TFBarColNom_Sel ,
                                           AV60TFBarColNom ,
                                           Integer.valueOf(AV62TFBarColNum) ,
                                           Integer.valueOf(AV63TFBarColNum_To) ,
                                           AV226TFBarNomCli_Sel ,
                                           AV225TFBarNomCli ,
                                           Byte.valueOf(AV149TFBarSit) ,
                                           Byte.valueOf(AV150TFBarSit_To) ,
                                           AV64TFBarFecGen ,
                                           AV66TFBarFecCli ,
                                           AV169TFBarFecFpr ,
                                           AV70TFBarFecSal ,
                                           AV350TFBarGirar_Sel ,
                                           AV349TFBarGirar ,
                                           Short.valueOf(AV397TFBarAcaAnh) ,
                                           Short.valueOf(AV398TFBarAcaAnh_To) ,
                                           AV272TFBarProPer_Sel ,
                                           AV271TFBarProPer ,
                                           AV487TFDisUsrCod_Sel ,
                                           AV486TFDisUsrCod ,
                                           Integer.valueOf(AV468clicodfrom) ,
                                           Integer.valueOf(AV469clicodto) ,
                                           AV472barfecgenfrom ,
                                           AV473barfecgento ,
                                           AV494barfecsalfrom ,
                                           AV495barfecsalto ,
                                           AV490barfecclifrom ,
                                           AV491barfecclito ,
                                           AV492BarFecFprfrom ,
                                           AV493BarFecFprto ,
                                           AV496barserfrom ,
                                           AV497barserto ,
                                           AV500BarColNomfrom ,
                                           AV501BarColNomto ,
                                           Integer.valueOf(AV502BarColNumfrom) ,
                                           Integer.valueOf(AV503BarColNumto) ,
                                           AV504BarNomClifrom ,
                                           AV505BarNomClito ,
                                           Integer.valueOf(AV506BarNumclifrom) ,
                                           Integer.valueOf(AV507barnumclito) ,
                                           Short.valueOf(AV498BarTipArtfrom) ,
                                           Short.valueOf(AV499BarTipArtto) ,
                                           AV509muestras ,
                                           Integer.valueOf(AV510barcodfrom) ,
                                           Integer.valueOf(AV511barcodto) ,
                                           Byte.valueOf(AV512barcodreofrom) ,
                                           Byte.valueOf(AV513barcodreoto) ,
                                           AV514barcodparfrom ,
                                           AV515barcodparto ,
                                           AV522Cod_idtx ,
                                           AV525BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV90TFBarFasSig_Sel ,
                                           AV89TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV476TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV477TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV488TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV489TFBarAlbFact_To) ,
                                           AV485TFBarNormas_Sel ,
                                           AV484TFBarNormas ,
                                           A13934BarNormas ,
                                           AV470bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV471bardisnumto ,
                                           Byte.valueOf(AV474barsitfrom) ,
                                           Byte.valueOf(AV475barsitto) ,
                                           AV467Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV89TFBarFasSig = GXutil.padr( GXutil.rtrim( AV89TFBarFasSig), 8, "%") ;
      lV50TFCliNom = GXutil.padr( GXutil.rtrim( AV50TFCliNom), 30, "%") ;
      lV40TFBarNHdr = GXutil.padr( GXutil.rtrim( AV40TFBarNHdr), 11, "%") ;
      lV181TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV181TFBarAgrEst), 1, "%") ;
      lV52TFBarSer = GXutil.padr( GXutil.rtrim( AV52TFBarSer), 16, "%") ;
      lV54TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV54TFBarSerDsc), 26, "%") ;
      lV58TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV58TFBarTipArtDsc), 30, "%") ;
      lV60TFBarColNom = GXutil.padr( GXutil.rtrim( AV60TFBarColNom), 13, "%") ;
      lV225TFBarNomCli = GXutil.padr( GXutil.rtrim( AV225TFBarNomCli), 13, "%") ;
      lV349TFBarGirar = GXutil.padr( GXutil.rtrim( AV349TFBarGirar), 20, "%") ;
      lV271TFBarProPer = GXutil.padr( GXutil.rtrim( AV271TFBarProPer), 8, "%") ;
      lV486TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV486TFDisUsrCod), 8, "%") ;
      /* Using cursor P09DO6 */
      pr_default.execute(0, new Object[] {AV467Emprcod, AV90TFBarFasSig_Sel, AV89TFBarFasSig, lV89TFBarFasSig, AV90TFBarFasSig_Sel, AV90TFBarFasSig_Sel, Byte.valueOf(AV474barsitfrom), Byte.valueOf(AV475barsitto), Integer.valueOf(AV48TFCliCod), Integer.valueOf(AV49TFCliCod_To), lV50TFCliNom, AV51TFCliNom_Sel, lV40TFBarNHdr, AV41TFBarNHdr_Sel, lV181TFBarAgrEst, AV182TFBarAgrEst_Sel, lV52TFBarSer, AV53TFBarSer_Sel, lV54TFBarSerDsc, AV55TFBarSerDsc_Sel, Short.valueOf(AV56TFBarTipArt), Short.valueOf(AV57TFBarTipArt_To), lV58TFBarTipArtDsc, AV59TFBarTipArtDsc_Sel, lV60TFBarColNom, AV61TFBarColNom_Sel, Integer.valueOf(AV62TFBarColNum), Integer.valueOf(AV63TFBarColNum_To), lV225TFBarNomCli, AV226TFBarNomCli_Sel, Byte.valueOf(AV149TFBarSit), Byte.valueOf(AV150TFBarSit_To), AV64TFBarFecGen, AV66TFBarFecCli, AV169TFBarFecFpr, AV70TFBarFecSal, lV349TFBarGirar, AV350TFBarGirar_Sel, Short.valueOf(AV397TFBarAcaAnh), Short.valueOf(AV398TFBarAcaAnh_To), lV271TFBarProPer, AV272TFBarProPer_Sel, lV486TFDisUsrCod, AV487TFDisUsrCod_Sel, Integer.valueOf(AV468clicodfrom), Integer.valueOf(AV469clicodto), AV472barfecgenfrom, AV473barfecgento, AV494barfecsalfrom, AV495barfecsalto, AV490barfecclifrom, AV491barfecclito, AV492BarFecFprfrom, AV493BarFecFprto, AV496barserfrom, AV497barserto, AV500BarColNomfrom, AV501BarColNomto, Integer.valueOf(AV502BarColNumfrom), Integer.valueOf(AV503BarColNumto), AV504BarNomClifrom, AV505BarNomClito, Integer.valueOf(AV506BarNumclifrom), Integer.valueOf(AV507barnumclito), Short.valueOf(AV498BarTipArtfrom), Short.valueOf(AV499BarTipArtto), AV509muestras, Integer.valueOf(AV510barcodfrom), Integer.valueOf(AV511barcodto), Byte.valueOf(AV512barcodreofrom), Byte.valueOf(AV513barcodreoto), AV514barcodparfrom, AV515barcodparto, AV522Cod_idtx, AV525BarGirar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3030BarPlf = P09DO6_A3030BarPlf[0] ;
         A1235BarNumCli = P09DO6_A1235BarNumCli[0] ;
         A4348DisUsrCod = P09DO6_A4348DisUsrCod[0] ;
         A2829BarProPer = P09DO6_A2829BarProPer[0] ;
         A4466BarAcaAnh = P09DO6_A4466BarAcaAnh[0] ;
         A2454BarGirar = P09DO6_A2454BarGirar[0] ;
         A161BarFecSal = P09DO6_A161BarFecSal[0] ;
         A158BarFecFpr = P09DO6_A158BarFecFpr[0] ;
         A155BarFecCli = P09DO6_A155BarFecCli[0] ;
         A159BarFecGen = P09DO6_A159BarFecGen[0] ;
         A213BarSit = P09DO6_A213BarSit[0] ;
         A1234BarNomCli = P09DO6_A1234BarNomCli[0] ;
         A136BarColNum = P09DO6_A136BarColNum[0] ;
         A135BarColNom = P09DO6_A135BarColNom[0] ;
         A13711BarTipArtD = P09DO6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DO6_n13711BarTipArtD[0] ;
         A217BarTipArt = P09DO6_A217BarTipArt[0] ;
         n217BarTipArt = P09DO6_n217BarTipArt[0] ;
         A1652BarSerDsc = P09DO6_A1652BarSerDsc[0] ;
         A212BarSer = P09DO6_A212BarSer[0] ;
         A120BarAgrEst = P09DO6_A120BarAgrEst[0] ;
         A279CliNom = P09DO6_A279CliNom[0] ;
         A252CliCod = P09DO6_A252CliCod[0] ;
         n252CliCod = P09DO6_n252CliCod[0] ;
         A1955BarFasSig = P09DO6_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DO6_n1955BarFasSig[0] ;
         A130BarCodPar = P09DO6_A130BarCodPar[0] ;
         A132BarCodReo = P09DO6_A132BarCodReo[0] ;
         A129BarCod = P09DO6_A129BarCod[0] ;
         A361DisCod = P09DO6_A361DisCod[0] ;
         A143BarDisNum = P09DO6_A143BarDisNum[0] ;
         A4812BarEncCli = P09DO6_A4812BarEncCli[0] ;
         A396EmprCod = P09DO6_A396EmprCod[0] ;
         A4348DisUsrCod = P09DO6_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P09DO6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09DO6_n13711BarTipArtD[0] ;
         A279CliNom = P09DO6_A279CliNom[0] ;
         A1955BarFasSig = P09DO6_A1955BarFasSig[0] ;
         n1955BarFasSig = P09DO6_n1955BarFasSig[0] ;
         GXt_int7 = A13930BarAlbUlti ;
         GXv_int8[0] = GXt_int7 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
         consultadeproduccion_wcexport.this.GXt_int7 = GXv_int8[0] ;
         A13930BarAlbUlti = GXt_int7 ;
         if ( (0==AV476TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV476TFBarAlbUltimo ) ) )
         {
            if ( (0==AV477TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV477TFBarAlbUltimo_To ) ) )
            {
               GXt_int9 = A13935BarAlbFact ;
               GXv_int10[0] = GXt_int9 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
               consultadeproduccion_wcexport.this.GXt_int9 = GXv_int10[0] ;
               A13935BarAlbFact = GXt_int9 ;
               if ( (0==AV488TFBarAlbFact) || ( ( A13935BarAlbFact >= AV488TFBarAlbFact ) ) )
               {
                  if ( (0==AV489TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV489TFBarAlbFact_To ) ) )
                  {
                     GXt_char4 = A13934BarNormas ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
                     consultadeproduccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
                     A13934BarNormas = GXt_char4 ;
                     if ( ! ( (GXutil.strcmp("", AV485TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV484TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV484TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV485TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV485TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char4 = A13878PedidoClie ;
                           GXv_char5[0] = A396EmprCod ;
                           GXv_char11[0] = A4812BarEncCli ;
                           GXv_char12[0] = A143BarDisNum ;
                           GXv_char13[0] = GXt_char4 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char11, GXv_char12, GXv_char13) ;
                           consultadeproduccion_wcexport.this.A396EmprCod = GXv_char5[0] ;
                           consultadeproduccion_wcexport.this.A4812BarEncCli = GXv_char11[0] ;
                           consultadeproduccion_wcexport.this.A143BarDisNum = GXv_char12[0] ;
                           consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                           A13878PedidoClie = GXt_char4 ;
                           if ( (GXutil.strcmp("", AV470bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV470bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV471bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV471bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A120BarAgrEst, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A217BarTipArt );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13711BarTipArtD, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A213BarSit );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_dtime6 = GXutil.resetTime( A159BarFecGen );
                                    AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_dtime6 = GXutil.resetTime( A155BarFecCli );
                                    AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_dtime6 = GXutil.resetTime( A158BarFecFpr );
                                    AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_dtime6 = GXutil.resetTime( A161BarFecSal );
                                    AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1955BarFasSig, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13930BarAlbUlti );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13935BarAlbFact );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2454BarGirar, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A4466BarAcaAnh );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2829BarProPer, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13934BarNormas, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char13[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4348DisUsrCod, GXv_char13) ;
                                    consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
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
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Nombre Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNHdr", "", "N° Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAgrEst", "", "A?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&PedidoCliente", "", "Disp. Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSer", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSerDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArt", "", "Tip Art", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArtDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNomCli", "", "Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarKgm", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarMtr", "", "Metros", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarPie", "", "Piezas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSit", "", "St", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecGen", "Fecha", "Generacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecCli", "Fecha", "Disp Cli", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecFpr", "Fecha", " Ent Prev", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecSal", "Fecha", "Salida", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarFasCod", "", "Ultima", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFasSig", "Fase", "Siguiente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbUltimo", "", "Albaran", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbFact", "", "Factura", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarAlbMts", "", "Metros", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarAlbKgs", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarGirar", "", "Coleccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV467Emprcod, httpContext.getMessage( "CNOENC", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAcaAnh", "", "Cuaderno", true, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "", "", "", false, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
      if ( AV530Cuaderno.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarCuaderno", "", "Descripcion", true, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "", "", "", false, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarProPer", "", "CTW", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarProPerIdtx", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      if ( AV531Stnorm.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNormas", "", "Estandars Textiles", true, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "", "", "", false, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "DisUsrCod", "", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char13[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_WCColumnsSelector", GXv_char13) ;
      consultadeproduccion_wcexport.this.GXt_char4 = GXv_char13[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Produccion.ConsultadeProduccion_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV532GXV2 = 1 ;
      while ( AV532GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV532GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV48TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV50TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV51TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV40TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV41TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV181TFBarAgrEst = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV182TFBarAgrEst_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV52TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV53TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV54TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV55TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV56TFBarTipArt = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarTipArt_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV58TFBarTipArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV59TFBarTipArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV60TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV61TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV62TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV225TFBarNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV226TFBarNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV149TFBarSit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV150TFBarSit_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV64TFBarFecGen = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV66TFBarFecCli = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV169TFBarFecFpr = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV70TFBarFecSal = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV89TFBarFasSig = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV90TFBarFasSig_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBULTIMO") == 0 )
         {
            AV476TFBarAlbUltimo = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV477TFBarAlbUltimo_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBFACT") == 0 )
         {
            AV488TFBarAlbFact = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV489TFBarAlbFact_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGIRAR") == 0 )
         {
            AV349TFBarGirar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGIRAR_SEL") == 0 )
         {
            AV350TFBarGirar_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAANH") == 0 )
         {
            AV397TFBarAcaAnh = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV398TFBarAcaAnh_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPROPER") == 0 )
         {
            AV271TFBarProPer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPROPER_SEL") == 0 )
         {
            AV272TFBarProPer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS") == 0 )
         {
            AV484TFBarNormas = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS_SEL") == 0 )
         {
            AV485TFBarNormas_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV486TFDisUsrCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV487TFDisUsrCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV467Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODFROM") == 0 )
         {
            AV468clicodfrom = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODTO") == 0 )
         {
            AV469clicodto = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUMFROM") == 0 )
         {
            AV470bardisnumfrom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUMTO") == 0 )
         {
            AV471bardisnumto = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGENFROM") == 0 )
         {
            AV472barfecgenfrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGENTO") == 0 )
         {
            AV473barfecgento = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSITFROM") == 0 )
         {
            AV474barsitfrom = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSITTO") == 0 )
         {
            AV475barsitto = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLIFROM") == 0 )
         {
            AV490barfecclifrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLITO") == 0 )
         {
            AV491barfecclito = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECFPRFROM") == 0 )
         {
            AV492BarFecFprfrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECFPRTO") == 0 )
         {
            AV493BarFecFprto = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSALFROM") == 0 )
         {
            AV494barfecsalfrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSALTO") == 0 )
         {
            AV495barfecsalto = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERFROM") == 0 )
         {
            AV496barserfrom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERTO") == 0 )
         {
            AV497barserto = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTFROM") == 0 )
         {
            AV498BarTipArtfrom = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTTO") == 0 )
         {
            AV499BarTipArtto = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOMFROM") == 0 )
         {
            AV500BarColNomfrom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOMTO") == 0 )
         {
            AV501BarColNomto = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUMFROM") == 0 )
         {
            AV502BarColNumfrom = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUMTO") == 0 )
         {
            AV503BarColNumto = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLIFROM") == 0 )
         {
            AV504BarNomClifrom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLITO") == 0 )
         {
            AV505BarNomClito = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLIFROM") == 0 )
         {
            AV506BarNumclifrom = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLITO") == 0 )
         {
            AV507barnumclito = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTFROM") == 0 )
         {
            AV498BarTipArtfrom = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTTO") == 0 )
         {
            AV499BarTipArtto = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MUESTRAS") == 0 )
         {
            AV509muestras = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODFROM") == 0 )
         {
            AV510barcodfrom = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODTO") == 0 )
         {
            AV511barcodto = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOFROM") == 0 )
         {
            AV512barcodreofrom = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOTO") == 0 )
         {
            AV513barcodreoto = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARFROM") == 0 )
         {
            AV514barcodparfrom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARTO") == 0 )
         {
            AV515barcodparto = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COD_IDTX") == 0 )
         {
            AV522Cod_idtx = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARGIRAR") == 0 )
         {
            AV525BarGirar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV532GXV2 = (int)(AV532GXV2+1) ;
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
      this.aP0[0] = consultadeproduccion_wcexport.this.AV11Filename;
      this.aP1[0] = consultadeproduccion_wcexport.this.AV12ErrorMessage;
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
      AV51TFCliNom_Sel = "" ;
      AV50TFCliNom = "" ;
      AV41TFBarNHdr_Sel = "" ;
      AV40TFBarNHdr = "" ;
      AV182TFBarAgrEst_Sel = "" ;
      AV181TFBarAgrEst = "" ;
      AV53TFBarSer_Sel = "" ;
      AV52TFBarSer = "" ;
      AV55TFBarSerDsc_Sel = "" ;
      AV54TFBarSerDsc = "" ;
      AV59TFBarTipArtDsc_Sel = "" ;
      AV58TFBarTipArtDsc = "" ;
      AV61TFBarColNom_Sel = "" ;
      AV60TFBarColNom = "" ;
      AV226TFBarNomCli_Sel = "" ;
      AV225TFBarNomCli = "" ;
      AV64TFBarFecGen = GXutil.nullDate() ;
      AV66TFBarFecCli = GXutil.nullDate() ;
      AV169TFBarFecFpr = GXutil.nullDate() ;
      AV70TFBarFecSal = GXutil.nullDate() ;
      AV90TFBarFasSig_Sel = "" ;
      AV89TFBarFasSig = "" ;
      AV350TFBarGirar_Sel = "" ;
      AV349TFBarGirar = "" ;
      AV272TFBarProPer_Sel = "" ;
      AV271TFBarProPer = "" ;
      AV485TFBarNormas_Sel = "" ;
      AV484TFBarNormas = "" ;
      AV487TFDisUsrCod_Sel = "" ;
      AV486TFDisUsrCod = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      lV89TFBarFasSig = "" ;
      scmdbuf = "" ;
      lV50TFCliNom = "" ;
      lV40TFBarNHdr = "" ;
      lV181TFBarAgrEst = "" ;
      lV52TFBarSer = "" ;
      lV54TFBarSerDsc = "" ;
      lV58TFBarTipArtDsc = "" ;
      lV60TFBarColNom = "" ;
      lV225TFBarNomCli = "" ;
      lV349TFBarGirar = "" ;
      lV271TFBarProPer = "" ;
      lV486TFDisUsrCod = "" ;
      AV472barfecgenfrom = GXutil.nullDate() ;
      AV473barfecgento = GXutil.nullDate() ;
      AV494barfecsalfrom = GXutil.nullDate() ;
      AV495barfecsalto = GXutil.nullDate() ;
      AV490barfecclifrom = GXutil.nullDate() ;
      AV491barfecclito = GXutil.nullDate() ;
      AV492BarFecFprfrom = GXutil.nullDate() ;
      AV493BarFecFprto = GXutil.nullDate() ;
      AV496barserfrom = "" ;
      AV497barserto = "" ;
      AV500BarColNomfrom = "" ;
      AV501BarColNomto = "" ;
      AV504BarNomClifrom = "" ;
      AV505BarNomClito = "" ;
      AV509muestras = "" ;
      AV514barcodparfrom = "" ;
      AV515barcodparto = "" ;
      AV522Cod_idtx = "" ;
      AV525BarGirar = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A2454BarGirar = "" ;
      A2829BarProPer = "" ;
      A4348DisUsrCod = "" ;
      A3030BarPlf = "" ;
      A1955BarFasSig = "" ;
      A13934BarNormas = "" ;
      AV470bardisnumfrom = "" ;
      A13878PedidoClie = "" ;
      AV471bardisnumto = "" ;
      AV467Emprcod = "" ;
      A396EmprCod = "" ;
      P09DO6_A3030BarPlf = new String[] {""} ;
      P09DO6_A1235BarNumCli = new int[1] ;
      P09DO6_A4348DisUsrCod = new String[] {""} ;
      P09DO6_A2829BarProPer = new String[] {""} ;
      P09DO6_A4466BarAcaAnh = new short[1] ;
      P09DO6_A2454BarGirar = new String[] {""} ;
      P09DO6_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09DO6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09DO6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09DO6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09DO6_A213BarSit = new byte[1] ;
      P09DO6_A1234BarNomCli = new String[] {""} ;
      P09DO6_A136BarColNum = new int[1] ;
      P09DO6_A135BarColNom = new String[] {""} ;
      P09DO6_A13711BarTipArtD = new String[] {""} ;
      P09DO6_n13711BarTipArtD = new boolean[] {false} ;
      P09DO6_A217BarTipArt = new short[1] ;
      P09DO6_n217BarTipArt = new boolean[] {false} ;
      P09DO6_A1652BarSerDsc = new String[] {""} ;
      P09DO6_A212BarSer = new String[] {""} ;
      P09DO6_A120BarAgrEst = new String[] {""} ;
      P09DO6_A279CliNom = new String[] {""} ;
      P09DO6_A252CliCod = new int[1] ;
      P09DO6_n252CliCod = new boolean[] {false} ;
      P09DO6_A1955BarFasSig = new String[] {""} ;
      P09DO6_n1955BarFasSig = new boolean[] {false} ;
      P09DO6_A130BarCodPar = new String[] {""} ;
      P09DO6_A132BarCodReo = new byte[1] ;
      P09DO6_A129BarCod = new int[1] ;
      P09DO6_A361DisCod = new int[1] ;
      P09DO6_A143BarDisNum = new String[] {""} ;
      P09DO6_A4812BarEncCli = new String[] {""} ;
      P09DO6_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXv_int8 = new long[1] ;
      GXv_int10 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      A13696BarNHdr = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV530Cuaderno = DecimalUtil.ZERO ;
      AV531Stnorm = DecimalUtil.ZERO ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char13 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_wcexport__default(),
         new Object[] {
             new Object[] {
            P09DO6_A3030BarPlf, P09DO6_A1235BarNumCli, P09DO6_A4348DisUsrCod, P09DO6_A2829BarProPer, P09DO6_A4466BarAcaAnh, P09DO6_A2454BarGirar, P09DO6_A161BarFecSal, P09DO6_A158BarFecFpr, P09DO6_A155BarFecCli, P09DO6_A159BarFecGen,
            P09DO6_A213BarSit, P09DO6_A1234BarNomCli, P09DO6_A136BarColNum, P09DO6_A135BarColNom, P09DO6_A13711BarTipArtD, P09DO6_n13711BarTipArtD, P09DO6_A217BarTipArt, P09DO6_n217BarTipArt, P09DO6_A1652BarSerDsc, P09DO6_A212BarSer,
            P09DO6_A120BarAgrEst, P09DO6_A279CliNom, P09DO6_A252CliCod, P09DO6_n252CliCod, P09DO6_A1955BarFasSig, P09DO6_n1955BarFasSig, P09DO6_A130BarCodPar, P09DO6_A132BarCodReo, P09DO6_A129BarCod, P09DO6_A361DisCod,
            P09DO6_A143BarDisNum, P09DO6_A4812BarEncCli, P09DO6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV149TFBarSit ;
   private byte AV150TFBarSit_To ;
   private byte AV512barcodreofrom ;
   private byte AV513barcodreoto ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV474barsitfrom ;
   private byte AV475barsitto ;
   private short AV56TFBarTipArt ;
   private short AV57TFBarTipArt_To ;
   private short AV397TFBarAcaAnh ;
   private short AV398TFBarAcaAnh_To ;
   private short GXv_int3[] ;
   private short AV498BarTipArtfrom ;
   private short AV499BarTipArtto ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV48TFCliCod ;
   private int AV49TFCliCod_To ;
   private int AV62TFBarColNum ;
   private int AV63TFBarColNum_To ;
   private int AV488TFBarAlbFact ;
   private int AV489TFBarAlbFact_To ;
   private int AV528GXV1 ;
   private int AV468clicodfrom ;
   private int AV469clicodto ;
   private int AV502BarColNumfrom ;
   private int AV503BarColNumto ;
   private int AV506BarNumclifrom ;
   private int AV507barnumclito ;
   private int AV510barcodfrom ;
   private int AV511barcodto ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A13935BarAlbFact ;
   private int A361DisCod ;
   private int GXt_int9 ;
   private int GXv_int10[] ;
   private int AV532GXV2 ;
   private long AV476TFBarAlbUltimo ;
   private long AV477TFBarAlbUltimo_To ;
   private long AV31VisibleColumnCount ;
   private long A13930BarAlbUlti ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private java.math.BigDecimal AV530Cuaderno ;
   private java.math.BigDecimal AV531Stnorm ;
   private String AV51TFCliNom_Sel ;
   private String AV50TFCliNom ;
   private String AV41TFBarNHdr_Sel ;
   private String AV40TFBarNHdr ;
   private String AV182TFBarAgrEst_Sel ;
   private String AV181TFBarAgrEst ;
   private String AV53TFBarSer_Sel ;
   private String AV52TFBarSer ;
   private String AV55TFBarSerDsc_Sel ;
   private String AV54TFBarSerDsc ;
   private String AV59TFBarTipArtDsc_Sel ;
   private String AV58TFBarTipArtDsc ;
   private String AV61TFBarColNom_Sel ;
   private String AV60TFBarColNom ;
   private String AV226TFBarNomCli_Sel ;
   private String AV225TFBarNomCli ;
   private String AV90TFBarFasSig_Sel ;
   private String AV89TFBarFasSig ;
   private String AV350TFBarGirar_Sel ;
   private String AV349TFBarGirar ;
   private String AV272TFBarProPer_Sel ;
   private String AV271TFBarProPer ;
   private String AV487TFDisUsrCod_Sel ;
   private String AV486TFDisUsrCod ;
   private String lV89TFBarFasSig ;
   private String scmdbuf ;
   private String lV50TFCliNom ;
   private String lV40TFBarNHdr ;
   private String lV181TFBarAgrEst ;
   private String lV52TFBarSer ;
   private String lV54TFBarSerDsc ;
   private String lV58TFBarTipArtDsc ;
   private String lV60TFBarColNom ;
   private String lV225TFBarNomCli ;
   private String lV349TFBarGirar ;
   private String lV271TFBarProPer ;
   private String lV486TFDisUsrCod ;
   private String AV496barserfrom ;
   private String AV497barserto ;
   private String AV500BarColNomfrom ;
   private String AV501BarColNomto ;
   private String AV504BarNomClifrom ;
   private String AV505BarNomClito ;
   private String AV509muestras ;
   private String AV514barcodparfrom ;
   private String AV515barcodparto ;
   private String AV522Cod_idtx ;
   private String AV525BarGirar ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A2454BarGirar ;
   private String A2829BarProPer ;
   private String A4348DisUsrCod ;
   private String A3030BarPlf ;
   private String A1955BarFasSig ;
   private String AV470bardisnumfrom ;
   private String A13878PedidoClie ;
   private String AV471bardisnumto ;
   private String AV467Emprcod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXv_char5[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String A13696BarNHdr ;
   private String GXt_char4 ;
   private String GXv_char13[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV64TFBarFecGen ;
   private java.util.Date AV66TFBarFecCli ;
   private java.util.Date AV169TFBarFecFpr ;
   private java.util.Date AV70TFBarFecSal ;
   private java.util.Date AV472barfecgenfrom ;
   private java.util.Date AV473barfecgento ;
   private java.util.Date AV494barfecsalfrom ;
   private java.util.Date AV495barfecsalto ;
   private java.util.Date AV490barfecclifrom ;
   private java.util.Date AV491barfecclito ;
   private java.util.Date AV492BarFecFprfrom ;
   private java.util.Date AV493BarFecFprto ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13711BarTipArtD ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n1955BarFasSig ;
   private boolean Cond_result ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV485TFBarNormas_Sel ;
   private String AV484TFBarNormas ;
   private String A13934BarNormas ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09DO6_A3030BarPlf ;
   private int[] P09DO6_A1235BarNumCli ;
   private String[] P09DO6_A4348DisUsrCod ;
   private String[] P09DO6_A2829BarProPer ;
   private short[] P09DO6_A4466BarAcaAnh ;
   private String[] P09DO6_A2454BarGirar ;
   private java.util.Date[] P09DO6_A161BarFecSal ;
   private java.util.Date[] P09DO6_A158BarFecFpr ;
   private java.util.Date[] P09DO6_A155BarFecCli ;
   private java.util.Date[] P09DO6_A159BarFecGen ;
   private byte[] P09DO6_A213BarSit ;
   private String[] P09DO6_A1234BarNomCli ;
   private int[] P09DO6_A136BarColNum ;
   private String[] P09DO6_A135BarColNom ;
   private String[] P09DO6_A13711BarTipArtD ;
   private boolean[] P09DO6_n13711BarTipArtD ;
   private short[] P09DO6_A217BarTipArt ;
   private boolean[] P09DO6_n217BarTipArt ;
   private String[] P09DO6_A1652BarSerDsc ;
   private String[] P09DO6_A212BarSer ;
   private String[] P09DO6_A120BarAgrEst ;
   private String[] P09DO6_A279CliNom ;
   private int[] P09DO6_A252CliCod ;
   private boolean[] P09DO6_n252CliCod ;
   private String[] P09DO6_A1955BarFasSig ;
   private boolean[] P09DO6_n1955BarFasSig ;
   private String[] P09DO6_A130BarCodPar ;
   private byte[] P09DO6_A132BarCodReo ;
   private int[] P09DO6_A129BarCod ;
   private int[] P09DO6_A361DisCod ;
   private String[] P09DO6_A143BarDisNum ;
   private String[] P09DO6_A4812BarEncCli ;
   private String[] P09DO6_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class consultadeproduccion_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09DO6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV48TFCliCod ,
                                          int AV49TFCliCod_To ,
                                          String AV51TFCliNom_Sel ,
                                          String AV50TFCliNom ,
                                          String AV41TFBarNHdr_Sel ,
                                          String AV40TFBarNHdr ,
                                          String AV182TFBarAgrEst_Sel ,
                                          String AV181TFBarAgrEst ,
                                          String AV53TFBarSer_Sel ,
                                          String AV52TFBarSer ,
                                          String AV55TFBarSerDsc_Sel ,
                                          String AV54TFBarSerDsc ,
                                          short AV56TFBarTipArt ,
                                          short AV57TFBarTipArt_To ,
                                          String AV59TFBarTipArtDsc_Sel ,
                                          String AV58TFBarTipArtDsc ,
                                          String AV61TFBarColNom_Sel ,
                                          String AV60TFBarColNom ,
                                          int AV62TFBarColNum ,
                                          int AV63TFBarColNum_To ,
                                          String AV226TFBarNomCli_Sel ,
                                          String AV225TFBarNomCli ,
                                          byte AV149TFBarSit ,
                                          byte AV150TFBarSit_To ,
                                          java.util.Date AV64TFBarFecGen ,
                                          java.util.Date AV66TFBarFecCli ,
                                          java.util.Date AV169TFBarFecFpr ,
                                          java.util.Date AV70TFBarFecSal ,
                                          String AV350TFBarGirar_Sel ,
                                          String AV349TFBarGirar ,
                                          short AV397TFBarAcaAnh ,
                                          short AV398TFBarAcaAnh_To ,
                                          String AV272TFBarProPer_Sel ,
                                          String AV271TFBarProPer ,
                                          String AV487TFDisUsrCod_Sel ,
                                          String AV486TFDisUsrCod ,
                                          int AV468clicodfrom ,
                                          int AV469clicodto ,
                                          java.util.Date AV472barfecgenfrom ,
                                          java.util.Date AV473barfecgento ,
                                          java.util.Date AV494barfecsalfrom ,
                                          java.util.Date AV495barfecsalto ,
                                          java.util.Date AV490barfecclifrom ,
                                          java.util.Date AV491barfecclito ,
                                          java.util.Date AV492BarFecFprfrom ,
                                          java.util.Date AV493BarFecFprto ,
                                          String AV496barserfrom ,
                                          String AV497barserto ,
                                          String AV500BarColNomfrom ,
                                          String AV501BarColNomto ,
                                          int AV502BarColNumfrom ,
                                          int AV503BarColNumto ,
                                          String AV504BarNomClifrom ,
                                          String AV505BarNomClito ,
                                          int AV506BarNumclifrom ,
                                          int AV507barnumclito ,
                                          short AV498BarTipArtfrom ,
                                          short AV499BarTipArtto ,
                                          String AV509muestras ,
                                          int AV510barcodfrom ,
                                          int AV511barcodto ,
                                          byte AV512barcodreofrom ,
                                          byte AV513barcodreoto ,
                                          String AV514barcodparfrom ,
                                          String AV515barcodparto ,
                                          String AV522Cod_idtx ,
                                          String AV525BarGirar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A120BarAgrEst ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A217BarTipArt ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          String A2454BarGirar ,
                                          short A4466BarAcaAnh ,
                                          String A2829BarProPer ,
                                          String A4348DisUsrCod ,
                                          int A1235BarNumCli ,
                                          String A3030BarPlf ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV90TFBarFasSig_Sel ,
                                          String AV89TFBarFasSig ,
                                          String A1955BarFasSig ,
                                          long AV476TFBarAlbUltimo ,
                                          long A13930BarAlbUlti ,
                                          long AV477TFBarAlbUltimo_To ,
                                          int AV488TFBarAlbFact ,
                                          int A13935BarAlbFact ,
                                          int AV489TFBarAlbFact_To ,
                                          String AV485TFBarNormas_Sel ,
                                          String AV484TFBarNormas ,
                                          String A13934BarNormas ,
                                          String AV470bardisnumfrom ,
                                          String A13878PedidoClie ,
                                          String AV471bardisnumto ,
                                          byte AV474barsitfrom ,
                                          byte AV475barsitto ,
                                          String AV467Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[75];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.BarPlf, T1.BarNumCli, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.BarFasSig," ;
      scmdbuf += " ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasSig, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo," ;
      scmdbuf += " T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC1, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT" ;
      scmdbuf += " JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin" ;
      scmdbuf += " > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod" ;
      scmdbuf += " AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC1) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin" ;
      scmdbuf += " > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV48TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV49TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV181TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV57TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV60TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV62TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV225TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (0==AV149TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV150TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV169TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV350TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV349TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV350TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (0==AV397TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (0==AV398TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV272TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV271TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV272TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV487TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV486TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV487TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (0==AV468clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (0==AV469clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV472barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV473barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV494barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV495barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV490barfecclifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV491barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int16[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV492BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int16[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV493BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int16[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV496barserfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int16[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV497barserto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int16[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV500BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int16[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV501BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int16[57] = (byte)(1) ;
      }
      if ( ! (0==AV502BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int16[58] = (byte)(1) ;
      }
      if ( ! (0==AV503BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int16[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV504BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int16[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV505BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int16[61] = (byte)(1) ;
      }
      if ( ! (0==AV506BarNumclifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int16[62] = (byte)(1) ;
      }
      if ( ! (0==AV507barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int16[63] = (byte)(1) ;
      }
      if ( ! (0==AV498BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int16[64] = (byte)(1) ;
      }
      if ( ! (0==AV499BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int16[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV509muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int16[66] = (byte)(1) ;
      }
      if ( ! (0==AV510barcodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int16[67] = (byte)(1) ;
      }
      if ( ! (0==AV511barcodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int16[68] = (byte)(1) ;
      }
      if ( ! (0==AV512barcodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int16[69] = (byte)(1) ;
      }
      if ( ! (0==AV513barcodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int16[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV514barcodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int16[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV515barcodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int16[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV522Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int16[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV525BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int16[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarGirar" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarGirar DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaAnh" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaAnh DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarProPer" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarProPer DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DisUsrCod" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DisUsrCod DESC" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P09DO6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , ((Number) dynConstraints[91]).shortValue() , ((Boolean) dynConstraints[92]).booleanValue() , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).longValue() , ((Number) dynConstraints[98]).longValue() , ((Number) dynConstraints[99]).intValue() , ((Number) dynConstraints[100]).intValue() , ((Number) dynConstraints[101]).intValue() , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , (String)dynConstraints[106] , (String)dynConstraints[107] , ((Number) dynConstraints[108]).byteValue() , ((Number) dynConstraints[109]).byteValue() , (String)dynConstraints[110] , (String)dynConstraints[111] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DO6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 3);
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
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
      }
   }

}

