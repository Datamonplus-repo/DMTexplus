package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientorollos_wcexport extends GXProcedure
{
   public mantenimientorollos_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientorollos_wcexport.class ), "" );
   }

   public mantenimientorollos_wcexport( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      mantenimientorollos_wcexport.this.aP1 = new String[] {""};
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
      mantenimientorollos_wcexport.this.aP0 = aP0;
      mantenimientorollos_wcexport.this.aP1 = aP1;
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
      S191 ();
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
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
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
      AV11Filename = "./PrivateTempStorage/" + "MantenimientoRollos_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV40TFMetTerCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFMetTerCod_Sel, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFMetTerCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFMetTerCod, GXv_char5) ;
            mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFMetPieCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pieza", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFMetPieCod_Sel, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFMetPieCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pieza", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFMetPieCod, GXv_char5) ;
            mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMetPieKil)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMetPieKil_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFMetPieKil)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFMetPieKil_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMetPieMet)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFMetPieMet_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFMetPieMet)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFMetPieMet_To)) );
      }
      if ( ! ( (0==AV47TFMetPieAnc) && (0==AV48TFMetPieAnc_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ancho", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV47TFMetPieAnc );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV48TFMetPieAnc_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFMetPieMtD)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMetPieMtD_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Grm2", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFMetPieMtD)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFMetPieMtD_To)) );
      }
      if ( ! ( (0==AV51TFMetPieEst) && (0==AV52TFMetPieEst_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFMetPieEst );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFMetPieEst_To );
      }
      if ( ! ( (GXutil.strcmp("", AV54TFMetPieLoc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localicacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFMetPieLoc_Sel, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFMetPieLoc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localicacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFMetPieLoc, GXv_char5) ;
            mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV56TFMetPieDCP_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Calidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFMetPieDCP_Sel, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFMetPieDCP)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Calidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientorollos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFMetPieDCP, GXv_char5) ;
            mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Terminal", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Pieza", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Ancho", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Grm2", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( httpContext.getMessage( "E", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( httpContext.getMessage( "Control", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setText( httpContext.getMessage( "Localicacion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setText( httpContext.getMessage( "Calidad", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setText( httpContext.getMessage( "Orden", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV39TFMetTerCod ;
      AV61Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV40TFMetTerCod_Sel ;
      AV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV41TFMetPieCod ;
      AV63Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV42TFMetPieCod_Sel ;
      AV64Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV43TFMetPieKil ;
      AV65Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV44TFMetPieKil_To ;
      AV66Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV45TFMetPieMet ;
      AV67Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV46TFMetPieMet_To ;
      AV68Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV47TFMetPieAnc ;
      AV69Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV48TFMetPieAnc_To ;
      AV70Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV49TFMetPieMtD ;
      AV71Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV50TFMetPieMtD_To ;
      AV72Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV51TFMetPieEst ;
      AV73Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV52TFMetPieEst_To ;
      AV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV53TFMetPieLoc ;
      AV75Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV54TFMetPieLoc_Sel ;
      AV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV55TFMetPieDCP ;
      AV77Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV56TFMetPieDCP_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                           AV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                           AV63Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                           AV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                           AV64Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                           AV65Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                           AV66Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                           AV67Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                           Short.valueOf(AV68Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) ,
                                           Short.valueOf(AV69Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) ,
                                           AV70Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                           AV71Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                           Byte.valueOf(AV72Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) ,
                                           Byte.valueOf(AV73Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) ,
                                           AV75Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                           AV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                           AV77Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                           AV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4913MetPieLoc ,
                                           A4915MetPieDCP ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           AV16Emprcod ,
                                           Integer.valueOf(AV17Barcod) ,
                                           Byte.valueOf(AV18Barcodreo) ,
                                           AV19Barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = GXutil.padr( GXutil.rtrim( AV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod), 10, "%") ;
      lV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod), 9, "%") ;
      lV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = GXutil.padr( GXutil.rtrim( AV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc), 10, "%") ;
      lV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp), 1, "%") ;
      /* Using cursor P0AAG2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, Integer.valueOf(AV17Barcod), Byte.valueOf(AV18Barcodreo), AV19Barcodpar, lV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod, AV61Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel, lV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod, AV63Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel, AV64Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil, AV65Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to, AV66Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet, AV67Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to, Short.valueOf(AV68Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc), Short.valueOf(AV69Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to), AV70Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd, AV71Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to, Byte.valueOf(AV72Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest), Byte.valueOf(AV73Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to), lV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc, AV75Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel, lV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp, AV77Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AAG2_A130BarCodPar[0] ;
         A132BarCodReo = P0AAG2_A132BarCodReo[0] ;
         A129BarCod = P0AAG2_A129BarCod[0] ;
         A396EmprCod = P0AAG2_A396EmprCod[0] ;
         A4915MetPieDCP = P0AAG2_A4915MetPieDCP[0] ;
         A4913MetPieLoc = P0AAG2_A4913MetPieLoc[0] ;
         A2816MetPieEst = P0AAG2_A2816MetPieEst[0] ;
         A4910MetPieMtD = P0AAG2_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P0AAG2_A6635MetPieAnc[0] ;
         A2815MetPieMet = P0AAG2_A2815MetPieMet[0] ;
         A2814MetPieKil = P0AAG2_A2814MetPieKil[0] ;
         A2813MetPieCod = P0AAG2_A2813MetPieCod[0] ;
         A2809MetTerCod = P0AAG2_A2809MetTerCod[0] ;
         A4917MetPieObs = P0AAG2_A4917MetPieObs[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2809MetTerCod, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2813MetPieCod, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2814MetPieKil)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2815MetPieMet)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setNumber( A6635MetPieAnc );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4910MetPieMtD)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setNumber( A2816MetPieEst );
         AV37VControl = GXutil.substring( A4917MetPieObs, 1, 30) ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37VControl, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4913MetPieLoc, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4915MetPieDCP, GXv_char5) ;
         mantenimientorollos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setText( GXt_char4 );
         AV38barOrdlinGRID = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setNumber( AV38barOrdlinGRID );
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
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

   public void S181( )
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

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue("PedidosClienteSinDetalle.MantenimientoRollos_WCGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.MantenimientoRollos_WCGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV32Session.getValue("PedidosClienteSinDetalle.MantenimientoRollos_WCGridState"), null, null);
      }
      AV30OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV39TFMetTerCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV40TFMetTerCod_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV41TFMetPieCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV42TFMetPieCod_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV43TFMetPieKil = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFMetPieKil_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV45TFMetPieMet = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFMetPieMet_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV47TFMetPieAnc = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFMetPieAnc_To = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMTD") == 0 )
         {
            AV49TFMetPieMtD = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFMetPieMtD_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV51TFMetPieEst = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFMetPieEst_To = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIELOC") == 0 )
         {
            AV53TFMetPieLoc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIELOC_SEL") == 0 )
         {
            AV54TFMetPieLoc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDCP") == 0 )
         {
            AV55TFMetPieDCP = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDCP_SEL") == 0 )
         {
            AV56TFMetPieDCP_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV17Barcod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV18Barcodreo = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV19Barcodpar = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&KMS") == 0 )
         {
            AV20Kms = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV21Maqcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPECOD") == 0 )
         {
            AV22Opecod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MENSAJE") == 0 )
         {
            AV23Mensaje = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARKGM") == 0 )
         {
            AV24Barkgm = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARMTR") == 0 )
         {
            AV25BarMtr = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARANCACA1") == 0 )
         {
            AV26BarAncAca1 = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARRDT") == 0 )
         {
            AV27BarRdt = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARPES") == 0 )
         {
            AV28Barpes = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARUNIMED") == 0 )
         {
            AV29BarUnimed = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = mantenimientorollos_wcexport.this.AV11Filename;
      this.aP1[0] = mantenimientorollos_wcexport.this.AV12ErrorMessage;
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
      AV40TFMetTerCod_Sel = "" ;
      AV39TFMetTerCod = "" ;
      AV42TFMetPieCod_Sel = "" ;
      AV41TFMetPieCod = "" ;
      AV43TFMetPieKil = DecimalUtil.ZERO ;
      AV44TFMetPieKil_To = DecimalUtil.ZERO ;
      AV45TFMetPieMet = DecimalUtil.ZERO ;
      AV46TFMetPieMet_To = DecimalUtil.ZERO ;
      AV49TFMetPieMtD = DecimalUtil.ZERO ;
      AV50TFMetPieMtD_To = DecimalUtil.ZERO ;
      AV54TFMetPieLoc_Sel = "" ;
      AV53TFMetPieLoc = "" ;
      AV56TFMetPieDCP_Sel = "" ;
      AV55TFMetPieDCP = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A2809MetTerCod = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      A4913MetPieLoc = "" ;
      A4915MetPieDCP = "" ;
      AV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = "" ;
      AV61Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = "" ;
      AV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = "" ;
      AV63Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = "" ;
      AV64Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = DecimalUtil.ZERO ;
      AV65Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV66Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = DecimalUtil.ZERO ;
      AV67Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV70Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = DecimalUtil.ZERO ;
      AV71Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = DecimalUtil.ZERO ;
      AV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = "" ;
      AV75Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = "" ;
      AV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = "" ;
      AV77Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = "" ;
      scmdbuf = "" ;
      lV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = "" ;
      lV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = "" ;
      lV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = "" ;
      lV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = "" ;
      AV16Emprcod = "" ;
      AV19Barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P0AAG2_A130BarCodPar = new String[] {""} ;
      P0AAG2_A132BarCodReo = new byte[1] ;
      P0AAG2_A129BarCod = new int[1] ;
      P0AAG2_A396EmprCod = new String[] {""} ;
      P0AAG2_A4915MetPieDCP = new String[] {""} ;
      P0AAG2_A4913MetPieLoc = new String[] {""} ;
      P0AAG2_A2816MetPieEst = new byte[1] ;
      P0AAG2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAG2_A6635MetPieAnc = new short[1] ;
      P0AAG2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAG2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAG2_A2813MetPieCod = new String[] {""} ;
      P0AAG2_A2809MetTerCod = new String[] {""} ;
      P0AAG2_A4917MetPieObs = new String[] {""} ;
      AV37VControl = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV32Session = httpContext.getWebSession();
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV20Kms = "" ;
      AV21Maqcod = "" ;
      AV23Mensaje = "" ;
      AV24Barkgm = DecimalUtil.ZERO ;
      AV25BarMtr = DecimalUtil.ZERO ;
      AV27BarRdt = DecimalUtil.ZERO ;
      AV29BarUnimed = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.mantenimientorollos_wcexport__default(),
         new Object[] {
             new Object[] {
            P0AAG2_A130BarCodPar, P0AAG2_A132BarCodReo, P0AAG2_A129BarCod, P0AAG2_A396EmprCod, P0AAG2_A4915MetPieDCP, P0AAG2_A4913MetPieLoc, P0AAG2_A2816MetPieEst, P0AAG2_A4910MetPieMtD, P0AAG2_A6635MetPieAnc, P0AAG2_A2815MetPieMet,
            P0AAG2_A2814MetPieKil, P0AAG2_A2813MetPieCod, P0AAG2_A2809MetTerCod, P0AAG2_A4917MetPieObs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV51TFMetPieEst ;
   private byte AV52TFMetPieEst_To ;
   private byte A2816MetPieEst ;
   private byte AV72Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ;
   private byte AV73Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ;
   private byte AV18Barcodreo ;
   private byte A132BarCodReo ;
   private short AV47TFMetPieAnc ;
   private short AV48TFMetPieAnc_To ;
   private short GXv_int3[] ;
   private short A6635MetPieAnc ;
   private short AV68Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ;
   private short AV69Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ;
   private short AV30OrderedBy ;
   private short AV38barOrdlinGRID ;
   private short AV26BarAncAca1 ;
   private short AV28Barpes ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV17Barcod ;
   private int A129BarCod ;
   private int AV78GXV1 ;
   private int AV22Opecod ;
   private java.math.BigDecimal AV43TFMetPieKil ;
   private java.math.BigDecimal AV44TFMetPieKil_To ;
   private java.math.BigDecimal AV45TFMetPieMet ;
   private java.math.BigDecimal AV46TFMetPieMet_To ;
   private java.math.BigDecimal AV49TFMetPieMtD ;
   private java.math.BigDecimal AV50TFMetPieMtD_To ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal AV64Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ;
   private java.math.BigDecimal AV65Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ;
   private java.math.BigDecimal AV66Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ;
   private java.math.BigDecimal AV67Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ;
   private java.math.BigDecimal AV70Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ;
   private java.math.BigDecimal AV71Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ;
   private java.math.BigDecimal AV24Barkgm ;
   private java.math.BigDecimal AV25BarMtr ;
   private java.math.BigDecimal AV27BarRdt ;
   private String AV40TFMetTerCod_Sel ;
   private String AV39TFMetTerCod ;
   private String AV42TFMetPieCod_Sel ;
   private String AV41TFMetPieCod ;
   private String AV54TFMetPieLoc_Sel ;
   private String AV53TFMetPieLoc ;
   private String AV56TFMetPieDCP_Sel ;
   private String AV55TFMetPieDCP ;
   private String A2809MetTerCod ;
   private String A2813MetPieCod ;
   private String A4913MetPieLoc ;
   private String A4915MetPieDCP ;
   private String AV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ;
   private String AV61Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ;
   private String AV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ;
   private String AV63Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ;
   private String AV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ;
   private String AV75Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ;
   private String AV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ;
   private String AV77Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ;
   private String scmdbuf ;
   private String lV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ;
   private String lV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ;
   private String lV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ;
   private String lV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ;
   private String AV16Emprcod ;
   private String AV19Barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV37VControl ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV20Kms ;
   private String AV21Maqcod ;
   private String AV29BarUnimed ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String A4917MetPieObs ;
   private String AV23Mensaje ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAG2_A130BarCodPar ;
   private byte[] P0AAG2_A132BarCodReo ;
   private int[] P0AAG2_A129BarCod ;
   private String[] P0AAG2_A396EmprCod ;
   private String[] P0AAG2_A4915MetPieDCP ;
   private String[] P0AAG2_A4913MetPieLoc ;
   private byte[] P0AAG2_A2816MetPieEst ;
   private java.math.BigDecimal[] P0AAG2_A4910MetPieMtD ;
   private short[] P0AAG2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AAG2_A2815MetPieMet ;
   private java.math.BigDecimal[] P0AAG2_A2814MetPieKil ;
   private String[] P0AAG2_A2813MetPieCod ;
   private String[] P0AAG2_A2809MetTerCod ;
   private String[] P0AAG2_A4917MetPieObs ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class mantenimientorollos_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AAG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                          String AV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                          String AV63Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                          String AV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                          java.math.BigDecimal AV64Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                          java.math.BigDecimal AV65Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                          java.math.BigDecimal AV66Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                          java.math.BigDecimal AV67Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                          short AV68Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ,
                                          short AV69Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ,
                                          java.math.BigDecimal AV70Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                          java.math.BigDecimal AV71Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                          byte AV72Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ,
                                          byte AV73Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ,
                                          String AV75Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                          String AV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                          String AV77Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                          String AV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4913MetPieLoc ,
                                          String A4915MetPieDCP ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String AV16Emprcod ,
                                          int AV17Barcod ,
                                          byte AV18Barcodreo ,
                                          String AV19Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, MetPieDCP, MetPieLoc, MetPieEst, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod, MetTerCod, MetPieObs FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV61Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV60Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV73Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV74Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieLoc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieDCP) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieDCP = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV30OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetTerCod" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetTerCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetPieCod" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetPieCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetPieKil" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetPieKil DESC" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetPieMet" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetPieMet DESC" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetPieAnc" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetPieAnc DESC" ;
      }
      else if ( ( AV30OrderedBy == 7 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetPieMtD" ;
      }
      else if ( ( AV30OrderedBy == 7 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetPieMtD DESC" ;
      }
      else if ( ( AV30OrderedBy == 8 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetPieEst" ;
      }
      else if ( ( AV30OrderedBy == 8 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetPieEst DESC" ;
      }
      else if ( ( AV30OrderedBy == 9 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetPieLoc" ;
      }
      else if ( ( AV30OrderedBy == 9 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetPieLoc DESC" ;
      }
      else if ( ( AV30OrderedBy == 10 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY MetPieDCP" ;
      }
      else if ( ( AV30OrderedBy == 10 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MetPieDCP DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0AAG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
      }
   }

}

