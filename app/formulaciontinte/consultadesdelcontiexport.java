package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadesdelcontiexport extends GXProcedure
{
   public consultadesdelcontiexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadesdelcontiexport.class ), "" );
   }

   public consultadesdelcontiexport( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultadesdelcontiexport.this.aP1 = new String[] {""};
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
      consultadesdelcontiexport.this.aP0 = aP0;
      consultadesdelcontiexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadesdeLcontiExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61TFEstFecCier)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime4 = GXutil.resetTime( AV61TFEstFecCier );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime4 );
      }
      if ( ! ( (0==AV63TFEstTinNr) && (0==AV64TFEstTinNr_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV63TFEstTinNr );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV64TFEstTinNr_To );
      }
      if ( ! ( (0==AV117TFBarCodTin) && (0==AV118TFBarCodTin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV117TFBarCodTin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV118TFBarCodTin_To );
      }
      if ( ! ( (0==AV119TFBarReoTin) && (0==AV120TFBarReoTin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "R", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV119TFBarReoTin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV120TFBarReoTin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV122TFBarParTin_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV122TFBarParTin_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV121TFBarParTin)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV121TFBarParTin, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV68TFBarAgrLot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFBarAgrLot_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFBarAgrLot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFBarAgrLot, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (0==AV69TFCliCod) && (0==AV70TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV69TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV70TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV72TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFCliNom_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFCliNom, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV74TFBarSerTin_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFBarSerTin_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFBarSerTin)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFBarSerTin, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV76TFBarDscTin_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFBarDscTin_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFBarDscTin)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFBarDscTin, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (0==AV100TFBarArtTin) && (0==AV101TFBarArtTin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tip. Art.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV100TFBarArtTin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV101TFBarArtTin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV103TFBarArtTinD_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV103TFBarArtTinD_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV102TFBarArtTinD)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV102TFBarArtTinD, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV78TFBarColNoT_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFBarColNoT_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFBarColNoT)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFBarColNoT, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (0==AV79TFBarColNuT) && (0==AV80TFBarColNuT_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV79TFBarColNuT );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV80TFBarColNuT_To );
      }
      if ( ! ( (0==AV81TFBarTipCoT) && (0==AV82TFBarTipCoT_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV81TFBarTipCoT );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV82TFBarTipCoT_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFBarKgmTin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFBarKgmTin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV83TFBarKgmTin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV84TFBarKgmTin_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFBarKgsTt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFBarKgsTt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs Tot", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV85TFBarKgsTt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86TFBarKgsTt_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFBarMtrTin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFBarMtrTin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87TFBarMtrTin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88TFBarMtrTin_To)) );
      }
      if ( ! ( (0==AV107TFBarNumtint) && (0==AV108TFBarNumtint_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV107TFBarNumtint );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV108TFBarNumtint_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFBarMtsTt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFBarMtsTt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts Tot", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89TFBarMtsTt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV90TFBarMtsTt_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV92TFBarMaqTin_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFBarMaqTin_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV91TFBarMaqTin)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFBarMaqTin, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (0==AV93TFBarVolTin) && (0==AV94TFBarVolTin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Volumen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV93TFBarVolTin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV94TFBarVolTin_To );
      }
      if ( ! ( (0==AV104TFBarNumEny) && (0==AV105TFBarNumEny_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV104TFBarNumEny );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV105TFBarNumEny_To );
      }
      if ( ! ( (GXutil.strcmp("", AV96TFBarDispCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disp Cli", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96TFBarDispCli_Sel, GXv_char6) ;
         consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV95TFBarDispCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disp Cli", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV95TFBarDispCli, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (0==AV97TFBarNumAna) && (0==AV98TFBarNumAna_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Adi", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV97TFBarNumAna );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV98TFBarNumAna_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113TFCosteInicial)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114TFCosteInicial_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicial", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV113TFCosteInicial)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV114TFCosteInicial_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115TFCosteAnyadidas)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116TFCosteAnyadidas_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Añadidas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115TFCosteAnyadidas)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultadesdelcontiexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116TFCosteAnyadidas_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV58VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV41Session.getValue("FormulacionTinte.ConsultadesdeLcontiColumnsSelector"), "") != 0 )
      {
         AV53ColumnsSelectorXML = AV41Session.getValue("FormulacionTinte.ConsultadesdeLcontiColumnsSelector") ;
         AV50ColumnsSelector.fromxml(AV53ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV125GXV1 = 1 ;
      while ( AV125GXV1 <= AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV52ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV125GXV1));
         if ( AV52ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV52ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV52ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV52ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setColor( 11 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         AV125GXV1 = (int)(AV125GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV127Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV61TFEstFecCier ;
      AV128Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV63TFEstTinNr ;
      AV129Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV64TFEstTinNr_To ;
      AV130Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV117TFBarCodTin ;
      AV131Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV118TFBarCodTin_To ;
      AV132Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV119TFBarReoTin ;
      AV133Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV120TFBarReoTin_To ;
      AV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV121TFBarParTin ;
      AV135Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV122TFBarParTin_Sel ;
      AV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV67TFBarAgrLot ;
      AV137Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV68TFBarAgrLot_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_12_tfclicod = AV69TFCliCod ;
      AV139Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV70TFCliCod_To ;
      AV140Formulaciontinte_consultadesdelcontids_14_tfclinom = AV71TFCliNom ;
      AV141Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV72TFCliNom_Sel ;
      AV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV73TFBarSerTin ;
      AV143Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV74TFBarSerTin_Sel ;
      AV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV75TFBarDscTin ;
      AV145Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV76TFBarDscTin_Sel ;
      AV146Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV100TFBarArtTin ;
      AV147Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV101TFBarArtTin_To ;
      AV148Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV102TFBarArtTinD ;
      AV149Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV103TFBarArtTinD_Sel ;
      AV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV77TFBarColNoT ;
      AV151Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV78TFBarColNoT_Sel ;
      AV152Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV79TFBarColNuT ;
      AV153Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV80TFBarColNuT_To ;
      AV154Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV81TFBarTipCoT ;
      AV155Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV82TFBarTipCoT_To ;
      AV156Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV83TFBarKgmTin ;
      AV157Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV84TFBarKgmTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV85TFBarKgsTt ;
      AV159Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV86TFBarKgsTt_To ;
      AV160Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV87TFBarMtrTin ;
      AV161Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV88TFBarMtrTin_To ;
      AV162Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV107TFBarNumtint ;
      AV163Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV108TFBarNumtint_To ;
      AV164Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV89TFBarMtsTt ;
      AV165Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV90TFBarMtsTt_To ;
      AV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV91TFBarMaqTin ;
      AV167Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV92TFBarMaqTin_Sel ;
      AV168Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV93TFBarVolTin ;
      AV169Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV94TFBarVolTin_To ;
      AV170Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV104TFBarNumEny ;
      AV171Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV105TFBarNumEny_To ;
      AV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV95TFBarDispCli ;
      AV173Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV96TFBarDispCli_Sel ;
      AV174Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV97TFBarNumAna ;
      AV175Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV98TFBarNumAna_To ;
      AV176Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV113TFCosteInicial ;
      AV177Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV114TFCosteInicial_To ;
      AV178Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV115TFCosteAnyadidas ;
      AV179Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV116TFCosteAnyadidas_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV127Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV128Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV129Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV130Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV131Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV132Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV133Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV135Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV137Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV138Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV139Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV141Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV140Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV143Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV145Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV146Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV147Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV151Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV152Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV153Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV154Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV155Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV156Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV157Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV158Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV159Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV160Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV161Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV165Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV167Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV169Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV173Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV174Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV175Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV176Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV177Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV178Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV179Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV24BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           Short.valueOf(AV38OrderedBy) ,
                                           Boolean.valueOf(AV39OrderedDsc) ,
                                           AV149Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV148Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV170Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV171Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV17Fec1 ,
                                           AV18Fec3 ,
                                           Integer.valueOf(AV19PCliCod) ,
                                           Integer.valueOf(AV20CliCodP) ,
                                           Integer.valueOf(AV21PBarCod) ,
                                           Integer.valueOf(AV22Barcodp) ,
                                           Byte.valueOf(AV23PBarCodReo) ,
                                           AV25PBarCodPar ,
                                           AV26BarCodParP ,
                                           AV27PSerie ,
                                           AV28SerieP ,
                                           AV29PColor ,
                                           AV30ColorP ,
                                           Integer.valueOf(AV31PColNum) ,
                                           Integer.valueOf(AV32ColNumP) ,
                                           AV33DispCli1 ,
                                           AV34DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV35HreRacab ,
                                           AV36MaqCodi ,
                                           AV37MaqCod3 ,
                                           Short.valueOf(AV109TipArtCodfrom) ,
                                           Short.valueOf(AV110TipArtCodto) ,
                                           AV111SoloAd ,
                                           AV112CorAdi ,
                                           A14200CosteAnyad ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV148Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV148Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV140Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV140Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YI2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV149Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV148Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV148Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV149Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV149Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV170Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV170Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV171Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV171Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV17Fec1, AV18Fec3, Integer.valueOf(AV19PCliCod), Integer.valueOf(AV20CliCodP), Integer.valueOf(AV21PBarCod), Integer.valueOf(AV22Barcodp), Byte.valueOf(AV23PBarCodReo), AV25PBarCodPar, AV26BarCodParP, AV27PSerie, AV28SerieP, AV29PColor, AV30ColorP, Integer.valueOf(AV31PColNum), Integer.valueOf(AV32ColNumP), AV33DispCli1, AV34DispCli3, AV35HreRacab, AV35HreRacab, AV36MaqCodi, AV37MaqCod3, Short.valueOf(AV109TipArtCodfrom), Short.valueOf(AV110TipArtCodto), AV111SoloAd, AV111SoloAd, AV112CorAdi, AV111SoloAd, AV112CorAdi, AV127Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV128Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV129Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV130Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV131Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV132Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV133Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV135Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV137Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV138Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV139Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV140Formulaciontinte_consultadesdelcontids_14_tfclinom, AV141Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV143Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV145Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV146Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV147Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV151Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV152Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV153Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV154Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV155Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV156Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV157Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV158Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV159Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV160Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV161Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV164Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV165Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV167Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV169Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV173Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV174Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV175Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV176Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV177Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV178Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV179Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV24BarCodReoP)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6634BarRecAcb = P08YI2_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YI2_n6634BarRecAcb[0] ;
         A396EmprCod = P08YI2_A396EmprCod[0] ;
         A14200CosteAnyad = P08YI2_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YI2_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YI2_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YI2_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YI2_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YI2_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YI2_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YI2_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YI2_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YI2_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YI2_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YI2_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YI2_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YI2_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YI2_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YI2_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YI2_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YI2_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YI2_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YI2_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YI2_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YI2_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YI2_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YI2_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YI2_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YI2_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YI2_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YI2_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YI2_n1936BarSerTin[0] ;
         A279CliNom = P08YI2_A279CliNom[0] ;
         A252CliCod = P08YI2_A252CliCod[0] ;
         A1929EstTinNr = P08YI2_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YI2_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YI2_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YI2_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YI2_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YI2_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YI2_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YI2_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YI2_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YI2_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YI2_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YI2_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YI2_A1935BarParTin[0] ;
         n1935BarParTin = P08YI2_n1935BarParTin[0] ;
         A1934BarReoTin = P08YI2_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YI2_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YI2_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YI2_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YI2_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YI2_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YI2_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YI2_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YI2_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YI2_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YI2_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YI2_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YI2_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YI2_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YI2_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YI2_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YI2_n13962BarArtTinD[0] ;
         A279CliNom = P08YI2_A279CliNom[0] ;
         A13967BarNumEny = P08YI2_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YI2_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
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
         AV58VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime4 = GXutil.resetTime( A13759EstFecCier );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setDate( GXt_dtime4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1929EstTinNr );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV106Marca = ((A1933BarCodTin==AV180Barcod)&&(A1934BarReoTin==AV181Barcodreo)&&(GXutil.strcmp(A1935BarParTin, AV182Barcodpar)==0) ? "*" : " ") ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV106Marca, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1933BarCodTin );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1934BarReoTin );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1935BarParTin, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2316BarAgrLot, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1936BarSerTin, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1937BarDscTin, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1939BarArtTin );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13962BarArtTinD, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1940BarColNoT, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1941BarColNuT );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1942BarTipCoT );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1947BarKgmTin)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A8563BarKgsTt)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1948BarMtrTin)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A13975BarNumtint );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A12993BarMtsTt)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1945BarMaqTin, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1946BarVolTin );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A13967BarNumEny );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11762BarDispCli, GXv_char6) ;
            consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A3650BarNumAna );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14199CosteInici)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14200CosteAnyad)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48CosteKg = ((A8563BarKgsTt.doubleValue()>0) ? (A14199CosteInici.add(A14200CosteAnyad)).divide(A8563BarKgsTt, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48CosteKg)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV49CosteMT = ((A1948BarMtrTin.doubleValue()>0) ? (A14199CosteInici.add(A14200CosteAnyad)).divide(A1948BarMtrTin, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49CosteMT)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
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
      AV50ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "EstFecCier", "", "Fecha", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "EstTinNr", "", "#", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Marca", "", "M", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarCodTin", "", "Nº Hdr", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarReoTin", "", "R", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarParTin", "", "P", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarAgrLot", "", "Lote", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", false, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSerTin", "", "Articulo", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarDscTin", "", "Descripcion", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarArtTin", "", "Tip. Art.", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarArtTinD", "", "Descripcion", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNoT", "", "Color", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNuT", "", "Numero", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarTipCoT", "", "Tc", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarKgmTin", "", "Kgs", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarKgsTt", "", "Kgs Tot", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarMtrTin", "", "Mts", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNumtint", "", "#", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarMtsTt", "", "Mts Tot", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarMaqTin", "", "Maquina", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarVolTin", "", "Volumen", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNumEny", "", "Nº Ensayo", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarDispCli", "", "Disp Cli", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNumAna", "", "Nº Adi", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CosteInicial", "Coste", "Inicial", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CosteAnyadidas", "Coste", "Añadidas", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&CosteKg", "Coste", "Kg", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&CosteMT", "Coste", "Mt", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char5 = AV54UserCustomValue ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ConsultadesdeLcontiColumnsSelector", GXv_char6) ;
      consultadesdelcontiexport.this.GXt_char5 = GXv_char6[0] ;
      AV54UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV54UserCustomValue)==0) ) )
      {
         AV51ColumnsSelectorAux.fromxml(AV54UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV51ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV51ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("FormulacionTinte.ConsultadesdeLcontiGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ConsultadesdeLcontiGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("FormulacionTinte.ConsultadesdeLcontiGridState"), null, null);
      }
      AV38OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV39OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV183GXV2 = 1 ;
      while ( AV183GXV2 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV183GXV2));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTFECCIER") == 0 )
         {
            AV61TFEstFecCier = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTTINNR") == 0 )
         {
            AV63TFEstTinNr = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFEstTinNr_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODTIN") == 0 )
         {
            AV117TFBarCodTin = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV118TFBarCodTin_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARREOTIN") == 0 )
         {
            AV119TFBarReoTin = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV120TFBarReoTin_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPARTIN") == 0 )
         {
            AV121TFBarParTin = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPARTIN_SEL") == 0 )
         {
            AV122TFBarParTin_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT") == 0 )
         {
            AV67TFBarAgrLot = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT_SEL") == 0 )
         {
            AV68TFBarAgrLot_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV69TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV71TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV72TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN") == 0 )
         {
            AV73TFBarSerTin = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN_SEL") == 0 )
         {
            AV74TFBarSerTin_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN") == 0 )
         {
            AV75TFBarDscTin = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN_SEL") == 0 )
         {
            AV76TFBarDscTin_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIN") == 0 )
         {
            AV100TFBarArtTin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV101TFBarArtTin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIND") == 0 )
         {
            AV102TFBarArtTinD = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIND_SEL") == 0 )
         {
            AV103TFBarArtTinD_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT") == 0 )
         {
            AV77TFBarColNoT = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT_SEL") == 0 )
         {
            AV78TFBarColNoT_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUT") == 0 )
         {
            AV79TFBarColNuT = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFBarColNuT_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOT") == 0 )
         {
            AV81TFBarTipCoT = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV82TFBarTipCoT_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGMTIN") == 0 )
         {
            AV83TFBarKgmTin = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFBarKgmTin_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGSTT") == 0 )
         {
            AV85TFBarKgsTt = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV86TFBarKgsTt_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTRTIN") == 0 )
         {
            AV87TFBarMtrTin = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV88TFBarMtrTin_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMTINT") == 0 )
         {
            AV107TFBarNumtint = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV108TFBarNumtint_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTSTT") == 0 )
         {
            AV89TFBarMtsTt = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV90TFBarMtsTt_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN") == 0 )
         {
            AV91TFBarMaqTin = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN_SEL") == 0 )
         {
            AV92TFBarMaqTin_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARVOLTIN") == 0 )
         {
            AV93TFBarVolTin = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94TFBarVolTin_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMENY") == 0 )
         {
            AV104TFBarNumEny = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV105TFBarNumEny_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI") == 0 )
         {
            AV95TFBarDispCli = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI_SEL") == 0 )
         {
            AV96TFBarDispCli_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANA") == 0 )
         {
            AV97TFBarNumAna = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV98TFBarNumAna_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTEINICIAL") == 0 )
         {
            AV113TFCosteInicial = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV114TFCosteInicial_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTEANYADIDAS") == 0 )
         {
            AV115TFCosteAnyadidas = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV116TFCosteAnyadidas_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV17Fec1 = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC3") == 0 )
         {
            AV18Fec3 = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCLICOD") == 0 )
         {
            AV19PCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODP") == 0 )
         {
            AV20CliCodP = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCOD") == 0 )
         {
            AV21PBarCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODP") == 0 )
         {
            AV22Barcodp = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODREO") == 0 )
         {
            AV23PBarCodReo = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOP") == 0 )
         {
            AV24BarCodReoP = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODPAR") == 0 )
         {
            AV25PBarCodPar = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARP") == 0 )
         {
            AV26BarCodParP = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PSERIE") == 0 )
         {
            AV27PSerie = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SERIEP") == 0 )
         {
            AV28SerieP = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLOR") == 0 )
         {
            AV29PColor = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLORP") == 0 )
         {
            AV30ColorP = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLNUM") == 0 )
         {
            AV31PColNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLNUMP") == 0 )
         {
            AV32ColNumP = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI1") == 0 )
         {
            AV33DispCli1 = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI3") == 0 )
         {
            AV34DispCli3 = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV35HreRacab = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODI") == 0 )
         {
            AV36MaqCodi = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD3") == 0 )
         {
            AV37MaqCod3 = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCODFROM") == 0 )
         {
            AV109TipArtCodfrom = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCODTO") == 0 )
         {
            AV110TipArtCodto = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SOLOAD") == 0 )
         {
            AV111SoloAd = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CORADI") == 0 )
         {
            AV112CorAdi = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV183GXV2 = (int)(AV183GXV2+1) ;
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
      this.aP0[0] = consultadesdelcontiexport.this.AV11Filename;
      this.aP1[0] = consultadesdelcontiexport.this.AV12ErrorMessage;
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
      AV61TFEstFecCier = GXutil.nullDate() ;
      AV122TFBarParTin_Sel = "" ;
      AV121TFBarParTin = "" ;
      AV68TFBarAgrLot_Sel = "" ;
      AV67TFBarAgrLot = "" ;
      AV72TFCliNom_Sel = "" ;
      AV71TFCliNom = "" ;
      AV74TFBarSerTin_Sel = "" ;
      AV73TFBarSerTin = "" ;
      AV76TFBarDscTin_Sel = "" ;
      AV75TFBarDscTin = "" ;
      AV103TFBarArtTinD_Sel = "" ;
      AV102TFBarArtTinD = "" ;
      AV78TFBarColNoT_Sel = "" ;
      AV77TFBarColNoT = "" ;
      AV83TFBarKgmTin = DecimalUtil.ZERO ;
      AV84TFBarKgmTin_To = DecimalUtil.ZERO ;
      AV85TFBarKgsTt = DecimalUtil.ZERO ;
      AV86TFBarKgsTt_To = DecimalUtil.ZERO ;
      AV87TFBarMtrTin = DecimalUtil.ZERO ;
      AV88TFBarMtrTin_To = DecimalUtil.ZERO ;
      AV89TFBarMtsTt = DecimalUtil.ZERO ;
      AV90TFBarMtsTt_To = DecimalUtil.ZERO ;
      AV92TFBarMaqTin_Sel = "" ;
      AV91TFBarMaqTin = "" ;
      AV96TFBarDispCli_Sel = "" ;
      AV95TFBarDispCli = "" ;
      AV113TFCosteInicial = DecimalUtil.ZERO ;
      AV114TFCosteInicial_To = DecimalUtil.ZERO ;
      AV115TFCosteAnyadidas = DecimalUtil.ZERO ;
      AV116TFCosteAnyadidas_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV41Session = httpContext.getWebSession();
      AV53ColumnsSelectorXML = "" ;
      AV50ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV52ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13759EstFecCier = GXutil.nullDate() ;
      A1935BarParTin = "" ;
      A2316BarAgrLot = "" ;
      A279CliNom = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A13962BarArtTinD = "" ;
      A1940BarColNoT = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A1945BarMaqTin = "" ;
      A11762BarDispCli = "" ;
      A14199CosteInici = DecimalUtil.ZERO ;
      A14200CosteAnyad = DecimalUtil.ZERO ;
      AV127Formulaciontinte_consultadesdelcontids_1_tfestfeccier = GXutil.nullDate() ;
      AV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin = "" ;
      AV135Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = "" ;
      AV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = "" ;
      AV137Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = "" ;
      AV140Formulaciontinte_consultadesdelcontids_14_tfclinom = "" ;
      AV141Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = "" ;
      AV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin = "" ;
      AV143Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = "" ;
      AV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin = "" ;
      AV145Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = "" ;
      AV148Formulaciontinte_consultadesdelcontids_22_tfbararttind = "" ;
      AV149Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = "" ;
      AV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = "" ;
      AV151Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = "" ;
      AV156Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = DecimalUtil.ZERO ;
      AV157Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = DecimalUtil.ZERO ;
      AV158Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = DecimalUtil.ZERO ;
      AV159Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = DecimalUtil.ZERO ;
      AV160Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = DecimalUtil.ZERO ;
      AV161Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = DecimalUtil.ZERO ;
      AV164Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = DecimalUtil.ZERO ;
      AV165Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = DecimalUtil.ZERO ;
      AV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = "" ;
      AV167Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = "" ;
      AV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli = "" ;
      AV173Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = "" ;
      AV176Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = DecimalUtil.ZERO ;
      AV177Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = DecimalUtil.ZERO ;
      AV178Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = DecimalUtil.ZERO ;
      AV179Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = DecimalUtil.ZERO ;
      lV148Formulaciontinte_consultadesdelcontids_22_tfbararttind = "" ;
      scmdbuf = "" ;
      lV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin = "" ;
      lV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = "" ;
      lV140Formulaciontinte_consultadesdelcontids_14_tfclinom = "" ;
      lV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin = "" ;
      lV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin = "" ;
      lV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = "" ;
      lV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = "" ;
      lV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      AV17Fec1 = GXutil.nullDate() ;
      AV18Fec3 = GXutil.nullDate() ;
      AV25PBarCodPar = "" ;
      AV26BarCodParP = "" ;
      AV27PSerie = "" ;
      AV28SerieP = "" ;
      AV29PColor = "" ;
      AV30ColorP = "" ;
      AV33DispCli1 = "" ;
      AV34DispCli3 = "" ;
      A6634BarRecAcb = "" ;
      AV35HreRacab = "" ;
      AV36MaqCodi = "" ;
      AV37MaqCod3 = "" ;
      AV111SoloAd = "" ;
      AV112CorAdi = "" ;
      AV16Emprcod = "" ;
      A396EmprCod = "" ;
      P08YI2_A494ForSer = new String[] {""} ;
      P08YI2_A482ForColNom = new String[] {""} ;
      P08YI2_A483ForColNum = new int[1] ;
      P08YI2_A831TipColCod = new byte[1] ;
      P08YI2_A829TipArtCod = new short[1] ;
      P08YI2_A6634BarRecAcb = new String[] {""} ;
      P08YI2_n6634BarRecAcb = new boolean[] {false} ;
      P08YI2_A396EmprCod = new String[] {""} ;
      P08YI2_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_A3650BarNumAna = new short[1] ;
      P08YI2_n3650BarNumAna = new boolean[] {false} ;
      P08YI2_A11762BarDispCli = new String[] {""} ;
      P08YI2_n11762BarDispCli = new boolean[] {false} ;
      P08YI2_A1946BarVolTin = new int[1] ;
      P08YI2_n1946BarVolTin = new boolean[] {false} ;
      P08YI2_A1945BarMaqTin = new String[] {""} ;
      P08YI2_n1945BarMaqTin = new boolean[] {false} ;
      P08YI2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n12993BarMtsTt = new boolean[] {false} ;
      P08YI2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n1948BarMtrTin = new boolean[] {false} ;
      P08YI2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n8563BarKgsTt = new boolean[] {false} ;
      P08YI2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n1947BarKgmTin = new boolean[] {false} ;
      P08YI2_A1942BarTipCoT = new byte[1] ;
      P08YI2_n1942BarTipCoT = new boolean[] {false} ;
      P08YI2_A1941BarColNuT = new int[1] ;
      P08YI2_n1941BarColNuT = new boolean[] {false} ;
      P08YI2_A1940BarColNoT = new String[] {""} ;
      P08YI2_n1940BarColNoT = new boolean[] {false} ;
      P08YI2_A1939BarArtTin = new short[1] ;
      P08YI2_n1939BarArtTin = new boolean[] {false} ;
      P08YI2_A1937BarDscTin = new String[] {""} ;
      P08YI2_n1937BarDscTin = new boolean[] {false} ;
      P08YI2_A1936BarSerTin = new String[] {""} ;
      P08YI2_n1936BarSerTin = new boolean[] {false} ;
      P08YI2_A279CliNom = new String[] {""} ;
      P08YI2_A252CliCod = new int[1] ;
      P08YI2_A1929EstTinNr = new short[1] ;
      P08YI2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YI2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n3656BarCosAD = new boolean[] {false} ;
      P08YI2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n3657BarCosAA = new boolean[] {false} ;
      P08YI2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n3706BarCosAnc = new boolean[] {false} ;
      P08YI2_A13967BarNumEny = new int[1] ;
      P08YI2_n13967BarNumEny = new boolean[] {false} ;
      P08YI2_A13962BarArtTinD = new String[] {""} ;
      P08YI2_n13962BarArtTinD = new boolean[] {false} ;
      P08YI2_A1935BarParTin = new String[] {""} ;
      P08YI2_n1935BarParTin = new boolean[] {false} ;
      P08YI2_A1934BarReoTin = new byte[1] ;
      P08YI2_n1934BarReoTin = new boolean[] {false} ;
      P08YI2_A1933BarCodTin = new int[1] ;
      P08YI2_n1933BarCodTin = new boolean[] {false} ;
      P08YI2_A2316BarAgrLot = new String[] {""} ;
      P08YI2_n2316BarAgrLot = new boolean[] {false} ;
      P08YI2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n3705BarCosCol = new boolean[] {false} ;
      P08YI2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n3658BarCosPA = new boolean[] {false} ;
      P08YI2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YI2_n3654BarCosPD = new boolean[] {false} ;
      P08YI2_A3646EstTinAny = new short[1] ;
      P08YI2_A3647EstTinMes = new byte[1] ;
      P08YI2_A3648EstTinDia = new byte[1] ;
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      AV106Marca = "" ;
      AV182Barcodpar = "" ;
      AV48CosteKg = DecimalUtil.ZERO ;
      AV49CosteMT = DecimalUtil.ZERO ;
      AV54UserCustomValue = "" ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      AV51ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultadesdelcontiexport__default(),
         new Object[] {
             new Object[] {
            P08YI2_A494ForSer, P08YI2_A482ForColNom, P08YI2_A483ForColNum, P08YI2_A831TipColCod, P08YI2_A829TipArtCod, P08YI2_A6634BarRecAcb, P08YI2_n6634BarRecAcb, P08YI2_A396EmprCod, P08YI2_A14200CosteAnyad, P08YI2_A3650BarNumAna,
            P08YI2_n3650BarNumAna, P08YI2_A11762BarDispCli, P08YI2_n11762BarDispCli, P08YI2_A1946BarVolTin, P08YI2_n1946BarVolTin, P08YI2_A1945BarMaqTin, P08YI2_n1945BarMaqTin, P08YI2_A12993BarMtsTt, P08YI2_n12993BarMtsTt, P08YI2_A1948BarMtrTin,
            P08YI2_n1948BarMtrTin, P08YI2_A8563BarKgsTt, P08YI2_n8563BarKgsTt, P08YI2_A1947BarKgmTin, P08YI2_n1947BarKgmTin, P08YI2_A1942BarTipCoT, P08YI2_n1942BarTipCoT, P08YI2_A1941BarColNuT, P08YI2_n1941BarColNuT, P08YI2_A1940BarColNoT,
            P08YI2_n1940BarColNoT, P08YI2_A1939BarArtTin, P08YI2_n1939BarArtTin, P08YI2_A1937BarDscTin, P08YI2_n1937BarDscTin, P08YI2_A1936BarSerTin, P08YI2_n1936BarSerTin, P08YI2_A279CliNom, P08YI2_A252CliCod, P08YI2_A1929EstTinNr,
            P08YI2_A13759EstFecCier, P08YI2_A3656BarCosAD, P08YI2_n3656BarCosAD, P08YI2_A3657BarCosAA, P08YI2_n3657BarCosAA, P08YI2_A3706BarCosAnc, P08YI2_n3706BarCosAnc, P08YI2_A13967BarNumEny, P08YI2_n13967BarNumEny, P08YI2_A13962BarArtTinD,
            P08YI2_n13962BarArtTinD, P08YI2_A1935BarParTin, P08YI2_n1935BarParTin, P08YI2_A1934BarReoTin, P08YI2_n1934BarReoTin, P08YI2_A1933BarCodTin, P08YI2_n1933BarCodTin, P08YI2_A2316BarAgrLot, P08YI2_n2316BarAgrLot, P08YI2_A3705BarCosCol,
            P08YI2_n3705BarCosCol, P08YI2_A3658BarCosPA, P08YI2_n3658BarCosPA, P08YI2_A3654BarCosPD, P08YI2_n3654BarCosPD, P08YI2_A3646EstTinAny, P08YI2_A3647EstTinMes, P08YI2_A3648EstTinDia
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV119TFBarReoTin ;
   private byte AV120TFBarReoTin_To ;
   private byte AV81TFBarTipCoT ;
   private byte AV82TFBarTipCoT_To ;
   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte AV132Formulaciontinte_consultadesdelcontids_6_tfbarreotin ;
   private byte AV133Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ;
   private byte AV154Formulaciontinte_consultadesdelcontids_28_tfbartipcot ;
   private byte AV155Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ;
   private byte AV24BarCodReoP ;
   private byte AV23PBarCodReo ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private byte AV181Barcodreo ;
   private short AV63TFEstTinNr ;
   private short AV64TFEstTinNr_To ;
   private short AV100TFBarArtTin ;
   private short AV101TFBarArtTin_To ;
   private short AV107TFBarNumtint ;
   private short AV108TFBarNumtint_To ;
   private short AV97TFBarNumAna ;
   private short AV98TFBarNumAna_To ;
   private short GXv_int3[] ;
   private short A1929EstTinNr ;
   private short A1939BarArtTin ;
   private short A13975BarNumtint ;
   private short A3650BarNumAna ;
   private short AV128Formulaciontinte_consultadesdelcontids_2_tfesttinnr ;
   private short AV129Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ;
   private short AV146Formulaciontinte_consultadesdelcontids_20_tfbararttin ;
   private short AV147Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ;
   private short AV162Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ;
   private short AV163Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ;
   private short AV174Formulaciontinte_consultadesdelcontids_48_tfbarnumana ;
   private short AV175Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ;
   private short AV38OrderedBy ;
   private short AV109TipArtCodfrom ;
   private short AV110TipArtCodto ;
   private short A3646EstTinAny ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV117TFBarCodTin ;
   private int AV118TFBarCodTin_To ;
   private int AV69TFCliCod ;
   private int AV70TFCliCod_To ;
   private int AV79TFBarColNuT ;
   private int AV80TFBarColNuT_To ;
   private int AV93TFBarVolTin ;
   private int AV94TFBarVolTin_To ;
   private int AV104TFBarNumEny ;
   private int AV105TFBarNumEny_To ;
   private int AV125GXV1 ;
   private int A1933BarCodTin ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int A1946BarVolTin ;
   private int A13967BarNumEny ;
   private int AV130Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ;
   private int AV131Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ;
   private int AV138Formulaciontinte_consultadesdelcontids_12_tfclicod ;
   private int AV139Formulaciontinte_consultadesdelcontids_13_tfclicod_to ;
   private int AV152Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ;
   private int AV153Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ;
   private int AV168Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ;
   private int AV169Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ;
   private int AV170Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ;
   private int AV171Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ;
   private int AV19PCliCod ;
   private int AV20CliCodP ;
   private int AV21PBarCod ;
   private int AV22Barcodp ;
   private int AV31PColNum ;
   private int AV32ColNumP ;
   private int AV180Barcod ;
   private int AV183GXV2 ;
   private long AV58VisibleColumnCount ;
   private java.math.BigDecimal AV83TFBarKgmTin ;
   private java.math.BigDecimal AV84TFBarKgmTin_To ;
   private java.math.BigDecimal AV85TFBarKgsTt ;
   private java.math.BigDecimal AV86TFBarKgsTt_To ;
   private java.math.BigDecimal AV87TFBarMtrTin ;
   private java.math.BigDecimal AV88TFBarMtrTin_To ;
   private java.math.BigDecimal AV89TFBarMtsTt ;
   private java.math.BigDecimal AV90TFBarMtsTt_To ;
   private java.math.BigDecimal AV113TFCosteInicial ;
   private java.math.BigDecimal AV114TFCosteInicial_To ;
   private java.math.BigDecimal AV115TFCosteAnyadidas ;
   private java.math.BigDecimal AV116TFCosteAnyadidas_To ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A14199CosteInici ;
   private java.math.BigDecimal A14200CosteAnyad ;
   private java.math.BigDecimal AV156Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ;
   private java.math.BigDecimal AV157Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ;
   private java.math.BigDecimal AV158Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ;
   private java.math.BigDecimal AV159Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ;
   private java.math.BigDecimal AV160Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ;
   private java.math.BigDecimal AV161Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ;
   private java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ;
   private java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ;
   private java.math.BigDecimal AV176Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ;
   private java.math.BigDecimal AV177Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ;
   private java.math.BigDecimal AV178Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ;
   private java.math.BigDecimal AV179Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal AV48CosteKg ;
   private java.math.BigDecimal AV49CosteMT ;
   private String AV122TFBarParTin_Sel ;
   private String AV121TFBarParTin ;
   private String AV68TFBarAgrLot_Sel ;
   private String AV67TFBarAgrLot ;
   private String AV72TFCliNom_Sel ;
   private String AV71TFCliNom ;
   private String AV74TFBarSerTin_Sel ;
   private String AV73TFBarSerTin ;
   private String AV76TFBarDscTin_Sel ;
   private String AV75TFBarDscTin ;
   private String AV103TFBarArtTinD_Sel ;
   private String AV102TFBarArtTinD ;
   private String AV78TFBarColNoT_Sel ;
   private String AV77TFBarColNoT ;
   private String AV92TFBarMaqTin_Sel ;
   private String AV91TFBarMaqTin ;
   private String AV96TFBarDispCli_Sel ;
   private String AV95TFBarDispCli ;
   private String A1935BarParTin ;
   private String A2316BarAgrLot ;
   private String A279CliNom ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A13962BarArtTinD ;
   private String A1940BarColNoT ;
   private String A1945BarMaqTin ;
   private String A11762BarDispCli ;
   private String AV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin ;
   private String AV135Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ;
   private String AV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ;
   private String AV137Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ;
   private String AV140Formulaciontinte_consultadesdelcontids_14_tfclinom ;
   private String AV141Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ;
   private String AV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin ;
   private String AV143Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ;
   private String AV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin ;
   private String AV145Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ;
   private String AV148Formulaciontinte_consultadesdelcontids_22_tfbararttind ;
   private String AV149Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ;
   private String AV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ;
   private String AV151Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ;
   private String AV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ;
   private String AV167Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ;
   private String AV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli ;
   private String AV173Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ;
   private String lV148Formulaciontinte_consultadesdelcontids_22_tfbararttind ;
   private String scmdbuf ;
   private String lV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin ;
   private String lV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ;
   private String lV140Formulaciontinte_consultadesdelcontids_14_tfclinom ;
   private String lV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin ;
   private String lV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin ;
   private String lV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ;
   private String lV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ;
   private String lV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli ;
   private String AV25PBarCodPar ;
   private String AV26BarCodParP ;
   private String AV27PSerie ;
   private String AV28SerieP ;
   private String AV29PColor ;
   private String AV30ColorP ;
   private String AV33DispCli1 ;
   private String AV34DispCli3 ;
   private String A6634BarRecAcb ;
   private String AV35HreRacab ;
   private String AV36MaqCodi ;
   private String AV37MaqCod3 ;
   private String AV111SoloAd ;
   private String AV112CorAdi ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String AV106Marca ;
   private String AV182Barcodpar ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private java.util.Date GXt_dtime4 ;
   private java.util.Date AV61TFEstFecCier ;
   private java.util.Date A13759EstFecCier ;
   private java.util.Date AV127Formulaciontinte_consultadesdelcontids_1_tfestfeccier ;
   private java.util.Date AV17Fec1 ;
   private java.util.Date AV18Fec3 ;
   private boolean returnInSub ;
   private boolean AV39OrderedDsc ;
   private boolean n6634BarRecAcb ;
   private boolean n3650BarNumAna ;
   private boolean n11762BarDispCli ;
   private boolean n1946BarVolTin ;
   private boolean n1945BarMaqTin ;
   private boolean n12993BarMtsTt ;
   private boolean n1948BarMtrTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1947BarKgmTin ;
   private boolean n1942BarTipCoT ;
   private boolean n1941BarColNuT ;
   private boolean n1940BarColNoT ;
   private boolean n1939BarArtTin ;
   private boolean n1937BarDscTin ;
   private boolean n1936BarSerTin ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n3706BarCosAnc ;
   private boolean n13967BarNumEny ;
   private boolean n13962BarArtTinD ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private String AV53ColumnsSelectorXML ;
   private String AV54UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08YI2_A494ForSer ;
   private String[] P08YI2_A482ForColNom ;
   private int[] P08YI2_A483ForColNum ;
   private byte[] P08YI2_A831TipColCod ;
   private short[] P08YI2_A829TipArtCod ;
   private String[] P08YI2_A6634BarRecAcb ;
   private boolean[] P08YI2_n6634BarRecAcb ;
   private String[] P08YI2_A396EmprCod ;
   private java.math.BigDecimal[] P08YI2_A14200CosteAnyad ;
   private short[] P08YI2_A3650BarNumAna ;
   private boolean[] P08YI2_n3650BarNumAna ;
   private String[] P08YI2_A11762BarDispCli ;
   private boolean[] P08YI2_n11762BarDispCli ;
   private int[] P08YI2_A1946BarVolTin ;
   private boolean[] P08YI2_n1946BarVolTin ;
   private String[] P08YI2_A1945BarMaqTin ;
   private boolean[] P08YI2_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YI2_A12993BarMtsTt ;
   private boolean[] P08YI2_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YI2_A1948BarMtrTin ;
   private boolean[] P08YI2_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YI2_A8563BarKgsTt ;
   private boolean[] P08YI2_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YI2_A1947BarKgmTin ;
   private boolean[] P08YI2_n1947BarKgmTin ;
   private byte[] P08YI2_A1942BarTipCoT ;
   private boolean[] P08YI2_n1942BarTipCoT ;
   private int[] P08YI2_A1941BarColNuT ;
   private boolean[] P08YI2_n1941BarColNuT ;
   private String[] P08YI2_A1940BarColNoT ;
   private boolean[] P08YI2_n1940BarColNoT ;
   private short[] P08YI2_A1939BarArtTin ;
   private boolean[] P08YI2_n1939BarArtTin ;
   private String[] P08YI2_A1937BarDscTin ;
   private boolean[] P08YI2_n1937BarDscTin ;
   private String[] P08YI2_A1936BarSerTin ;
   private boolean[] P08YI2_n1936BarSerTin ;
   private String[] P08YI2_A279CliNom ;
   private int[] P08YI2_A252CliCod ;
   private short[] P08YI2_A1929EstTinNr ;
   private java.util.Date[] P08YI2_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YI2_A3656BarCosAD ;
   private boolean[] P08YI2_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YI2_A3657BarCosAA ;
   private boolean[] P08YI2_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YI2_A3706BarCosAnc ;
   private boolean[] P08YI2_n3706BarCosAnc ;
   private int[] P08YI2_A13967BarNumEny ;
   private boolean[] P08YI2_n13967BarNumEny ;
   private String[] P08YI2_A13962BarArtTinD ;
   private boolean[] P08YI2_n13962BarArtTinD ;
   private String[] P08YI2_A1935BarParTin ;
   private boolean[] P08YI2_n1935BarParTin ;
   private byte[] P08YI2_A1934BarReoTin ;
   private boolean[] P08YI2_n1934BarReoTin ;
   private int[] P08YI2_A1933BarCodTin ;
   private boolean[] P08YI2_n1933BarCodTin ;
   private String[] P08YI2_A2316BarAgrLot ;
   private boolean[] P08YI2_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YI2_A3705BarCosCol ;
   private boolean[] P08YI2_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YI2_A3658BarCosPA ;
   private boolean[] P08YI2_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YI2_A3654BarCosPD ;
   private boolean[] P08YI2_n3654BarCosPD ;
   private short[] P08YI2_A3646EstTinAny ;
   private byte[] P08YI2_A3647EstTinMes ;
   private byte[] P08YI2_A3648EstTinDia ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV51ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV52ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class consultadesdelcontiexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08YI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV127Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV128Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV129Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV130Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV131Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV132Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV133Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV135Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV137Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV138Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV139Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV141Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV140Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV143Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV145Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV146Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV147Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV151Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV152Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV153Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV154Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV155Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV156Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV157Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV158Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV159Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV160Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV161Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV162Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV163Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV167Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV168Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV169Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV173Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV174Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV175Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV176Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV177Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV178Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV179Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV24BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          short AV38OrderedBy ,
                                          boolean AV39OrderedDsc ,
                                          String AV149Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV148Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV170Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV171Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV17Fec1 ,
                                          java.util.Date AV18Fec3 ,
                                          int AV19PCliCod ,
                                          int AV20CliCodP ,
                                          int AV21PBarCod ,
                                          int AV22Barcodp ,
                                          byte AV23PBarCodReo ,
                                          String AV25PBarCodPar ,
                                          String AV26BarCodParP ,
                                          String AV27PSerie ,
                                          String AV28SerieP ,
                                          String AV29PColor ,
                                          String AV30ColorP ,
                                          int AV31PColNum ,
                                          int AV32ColNumP ,
                                          String AV33DispCli1 ,
                                          String AV34DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV35HreRacab ,
                                          String AV36MaqCodi ,
                                          String AV37MaqCod3 ,
                                          short AV109TipArtCodfrom ,
                                          short AV110TipArtCodto ,
                                          String AV111SoloAd ,
                                          String AV112CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[88];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.BarRecAcb, T1.EmprCod, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE(" ;
      scmdbuf += " T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT," ;
      scmdbuf += " T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (0==AV128Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (0==AV129Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (0==AV130Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (0==AV131Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (0==AV132Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (0==AV133Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV134Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV136Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV140Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV142Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV144Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int9[56] = (byte)(1) ;
      }
      if ( ! (0==AV146Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int9[57] = (byte)(1) ;
      }
      if ( ! (0==AV147Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int9[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV150Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int9[60] = (byte)(1) ;
      }
      if ( ! (0==AV152Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int9[61] = (byte)(1) ;
      }
      if ( ! (0==AV153Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int9[62] = (byte)(1) ;
      }
      if ( ! (0==AV154Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int9[63] = (byte)(1) ;
      }
      if ( ! (0==AV155Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int9[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int9[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int9[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int9[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV159Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int9[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int9[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int9[70] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int9[71] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int9[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int9[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int9[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV166Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int9[76] = (byte)(1) ;
      }
      if ( ! (0==AV168Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int9[77] = (byte)(1) ;
      }
      if ( ! (0==AV169Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int9[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV173Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV172Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int9[80] = (byte)(1) ;
      }
      if ( ! (0==AV174Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int9[81] = (byte)(1) ;
      }
      if ( ! (0==AV175Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int9[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int9[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int9[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int9[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int9[86] = (byte)(1) ;
      }
      if ( ! (0==AV24BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int9[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV38OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.EstFecCier, T1.EstTinNr" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstFecCier" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstFecCier DESC" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstTinNr" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstTinNr DESC" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodTin" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarReoTin" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarReoTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarParTin" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarParTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrLot" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrLot DESC" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerTin" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarDscTin" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarDscTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarArtTin" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarArtTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNoT" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNoT DESC" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNuT" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNuT DESC" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipCoT" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipCoT DESC" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKgmTin" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKgmTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 17 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKgsTt" ;
      }
      else if ( ( AV38OrderedBy == 17 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKgsTt DESC" ;
      }
      else if ( ( AV38OrderedBy == 18 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMtrTin" ;
      }
      else if ( ( AV38OrderedBy == 18 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMtrTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 19 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMtsTt" ;
      }
      else if ( ( AV38OrderedBy == 19 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMtsTt DESC" ;
      }
      else if ( ( AV38OrderedBy == 20 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqTin" ;
      }
      else if ( ( AV38OrderedBy == 20 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 21 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarVolTin" ;
      }
      else if ( ( AV38OrderedBy == 21 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarVolTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 22 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarDispCli" ;
      }
      else if ( ( AV38OrderedBy == 22 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarDispCli DESC" ;
      }
      else if ( ( AV38OrderedBy == 23 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumAna" ;
      }
      else if ( ( AV38OrderedBy == 23 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumAna DESC" ;
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
                  return conditional_P08YI2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , ((Number) dynConstraints[78]).shortValue() , ((Boolean) dynConstraints[79]).booleanValue() , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).intValue() , (java.util.Date)dynConstraints[86] , (java.util.Date)dynConstraints[87] , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).intValue() , ((Number) dynConstraints[91]).intValue() , ((Number) dynConstraints[92]).byteValue() , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , (String)dynConstraints[98] , ((Number) dynConstraints[99]).intValue() , ((Number) dynConstraints[100]).intValue() , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , (String)dynConstraints[106] , ((Number) dynConstraints[107]).shortValue() , ((Number) dynConstraints[108]).shortValue() , (String)dynConstraints[109] , (String)dynConstraints[110] , (java.math.BigDecimal)dynConstraints[111] , (String)dynConstraints[112] , (String)dynConstraints[113] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
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
                  stmt.setString(sIdx, (String)parms[88], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
      }
   }

}

