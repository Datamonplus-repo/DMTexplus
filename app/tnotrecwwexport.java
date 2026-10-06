package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tnotrecwwexport extends GXProcedure
{
   public tnotrecwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnotrecwwexport.class ), "" );
   }

   public tnotrecwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tnotrecwwexport.this.aP1 = new String[] {""};
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
      tnotrecwwexport.this.aP0 = aP0;
      tnotrecwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TNOTRECWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93FilterFullText, GXv_char5) ;
      tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV48TFNr_codigo) && (0==AV49TFNr_codigo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reclacacion ID", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFNr_codigo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFNr_codigo_To );
      }
      if ( ! ( (0==AV50TFNr_albreccod) && (0==AV51TFNr_albreccod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Recepcion Id", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFNr_albreccod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFNr_albreccod_To );
      }
      if ( ! ( (0==AV52TFNr_CliCod) && (0==AV53TFNr_CliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFNr_CliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFNr_CliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFNr_CliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFNr_CliNom_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFNr_CliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFNr_CliNom, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFNr_albent_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Albaran Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFNr_albent_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFNr_albent)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Albaran Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFNr_albent, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFNr_refcli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Referencia Albaran entrega cli", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFNr_refcli_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFNr_refcli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Referencia Albaran entrega cli", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFNr_refcli, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV61TFNr_artcod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFNr_artcod_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFNr_artcod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFNr_artcod, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFNr_artdsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFNr_artdsc_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFNr_artdsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFNr_artdsc, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFNr_colnom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFNr_colnom_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFNr_colnom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFNr_colnom, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV66TFNr_colnum) && (0==AV67TFNr_colnum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV66TFNr_colnum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV67TFNr_colnum_To );
      }
      if ( ! ( (0==AV68TFNr_piezas) && (0==AV69TFNr_piezas_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV68TFNr_piezas );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV69TFNr_piezas_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFNr_unidades)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFNr_unidades_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TFNr_unidades)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV71TFNr_unidades_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV73TFNr_unidad_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad (K,M)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFNr_unidad_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV72TFNr_unidad)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad (K,M)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFNr_unidad, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV74TFNr_barcoda) && (0==AV75TFNr_barcoda_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr Anterior", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV74TFNr_barcoda );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV75TFNr_barcoda_To );
      }
      if ( ! ( (0==AV76TFNr_barreoa) && (0==AV77TFNr_barreoa_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reopeado Anterior", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV76TFNr_barreoa );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV77TFNr_barreoa_To );
      }
      if ( ! ( (GXutil.strcmp("", AV79TFNr_barpara_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Particion Anterior", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFNr_barpara_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV78TFNr_barpara)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Particion Anterior", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFNr_barpara, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV80TFNr_NAlb) && (0==AV81TFNr_NAlb_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero Albaran Salida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV80TFNr_NAlb );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV81TFNr_NAlb_To );
      }
      if ( ! ( (GXutil.strcmp("", AV83TFNr_local_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFNr_local_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV82TFNr_local)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFNr_local, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV85TFNr_user_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario creacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFNr_user_Sel, GXv_char5) ;
         tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV84TFNr_user)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario creacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV84TFNr_user, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV86TFNr_fecreg) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha-Hora entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV86TFNr_fecreg );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88TFNr_fecent)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha entrega", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV88TFNr_fecent );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV90TFNr_barcod) && (0==AV91TFNr_barcod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV90TFNr_barcod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tnotrecwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV91TFNr_barcod_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("TNOTRECWWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("TNOTRECWWColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV96GXV1));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV98Tnotrecwwds_1_filterfulltext = AV93FilterFullText ;
      AV99Tnotrecwwds_2_tfnr_codigo = AV48TFNr_codigo ;
      AV100Tnotrecwwds_3_tfnr_codigo_to = AV49TFNr_codigo_To ;
      AV101Tnotrecwwds_4_tfnr_albreccod = AV50TFNr_albreccod ;
      AV102Tnotrecwwds_5_tfnr_albreccod_to = AV51TFNr_albreccod_To ;
      AV103Tnotrecwwds_6_tfnr_clicod = AV52TFNr_CliCod ;
      AV104Tnotrecwwds_7_tfnr_clicod_to = AV53TFNr_CliCod_To ;
      AV105Tnotrecwwds_8_tfnr_clinom = AV54TFNr_CliNom ;
      AV106Tnotrecwwds_9_tfnr_clinom_sel = AV55TFNr_CliNom_Sel ;
      AV107Tnotrecwwds_10_tfnr_albent = AV56TFNr_albent ;
      AV108Tnotrecwwds_11_tfnr_albent_sel = AV57TFNr_albent_Sel ;
      AV109Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV110Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV111Tnotrecwwds_14_tfnr_artcod = AV60TFNr_artcod ;
      AV112Tnotrecwwds_15_tfnr_artcod_sel = AV61TFNr_artcod_Sel ;
      AV113Tnotrecwwds_16_tfnr_artdsc = AV62TFNr_artdsc ;
      AV114Tnotrecwwds_17_tfnr_artdsc_sel = AV63TFNr_artdsc_Sel ;
      AV115Tnotrecwwds_18_tfnr_colnom = AV64TFNr_colnom ;
      AV116Tnotrecwwds_19_tfnr_colnom_sel = AV65TFNr_colnom_Sel ;
      AV117Tnotrecwwds_20_tfnr_colnum = AV66TFNr_colnum ;
      AV118Tnotrecwwds_21_tfnr_colnum_to = AV67TFNr_colnum_To ;
      AV119Tnotrecwwds_22_tfnr_piezas = AV68TFNr_piezas ;
      AV120Tnotrecwwds_23_tfnr_piezas_to = AV69TFNr_piezas_To ;
      AV121Tnotrecwwds_24_tfnr_unidades = AV70TFNr_unidades ;
      AV122Tnotrecwwds_25_tfnr_unidades_to = AV71TFNr_unidades_To ;
      AV123Tnotrecwwds_26_tfnr_unidad = AV72TFNr_unidad ;
      AV124Tnotrecwwds_27_tfnr_unidad_sel = AV73TFNr_unidad_Sel ;
      AV125Tnotrecwwds_28_tfnr_barcoda = AV74TFNr_barcoda ;
      AV126Tnotrecwwds_29_tfnr_barcoda_to = AV75TFNr_barcoda_To ;
      AV127Tnotrecwwds_30_tfnr_barreoa = AV76TFNr_barreoa ;
      AV128Tnotrecwwds_31_tfnr_barreoa_to = AV77TFNr_barreoa_To ;
      AV129Tnotrecwwds_32_tfnr_barpara = AV78TFNr_barpara ;
      AV130Tnotrecwwds_33_tfnr_barpara_sel = AV79TFNr_barpara_Sel ;
      AV131Tnotrecwwds_34_tfnr_nalb = AV80TFNr_NAlb ;
      AV132Tnotrecwwds_35_tfnr_nalb_to = AV81TFNr_NAlb_To ;
      AV133Tnotrecwwds_36_tfnr_local = AV82TFNr_local ;
      AV134Tnotrecwwds_37_tfnr_local_sel = AV83TFNr_local_Sel ;
      AV135Tnotrecwwds_38_tfnr_user = AV84TFNr_user ;
      AV136Tnotrecwwds_39_tfnr_user_sel = AV85TFNr_user_Sel ;
      AV137Tnotrecwwds_40_tfnr_fecreg = AV86TFNr_fecreg ;
      AV138Tnotrecwwds_41_tfnr_fecent = AV88TFNr_fecent ;
      AV139Tnotrecwwds_42_tfnr_barcod = AV90TFNr_barcod ;
      AV140Tnotrecwwds_43_tfnr_barcod_to = AV91TFNr_barcod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV98Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV99Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV100Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV101Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV102Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV103Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV104Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV106Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV105Tnotrecwwds_8_tfnr_clinom ,
                                           AV108Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV107Tnotrecwwds_10_tfnr_albent ,
                                           AV110Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV109Tnotrecwwds_12_tfnr_refcli ,
                                           AV112Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV111Tnotrecwwds_14_tfnr_artcod ,
                                           AV114Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV113Tnotrecwwds_16_tfnr_artdsc ,
                                           AV116Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV115Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV117Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV118Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV119Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV120Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV121Tnotrecwwds_24_tfnr_unidades ,
                                           AV122Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV124Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV123Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV125Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV126Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV127Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV128Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV130Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV129Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV131Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV132Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV134Tnotrecwwds_37_tfnr_local_sel ,
                                           AV133Tnotrecwwds_36_tfnr_local ,
                                           AV136Tnotrecwwds_39_tfnr_user_sel ,
                                           AV135Tnotrecwwds_38_tfnr_user ,
                                           AV137Tnotrecwwds_40_tfnr_fecreg ,
                                           AV138Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV139Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV140Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV105Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV105Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV107Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV107Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV109Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV109Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV111Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV111Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV113Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV113Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV115Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV115Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV123Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV123Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV129Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV129Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV133Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV133Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV135Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV135Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08482 */
      pr_default.execute(0, new Object[] {lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, lV98Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV99Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV100Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV101Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV102Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV103Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV104Tnotrecwwds_7_tfnr_clicod_to), lV105Tnotrecwwds_8_tfnr_clinom, AV106Tnotrecwwds_9_tfnr_clinom_sel, lV107Tnotrecwwds_10_tfnr_albent, AV108Tnotrecwwds_11_tfnr_albent_sel, lV109Tnotrecwwds_12_tfnr_refcli, AV110Tnotrecwwds_13_tfnr_refcli_sel, lV111Tnotrecwwds_14_tfnr_artcod, AV112Tnotrecwwds_15_tfnr_artcod_sel, lV113Tnotrecwwds_16_tfnr_artdsc, AV114Tnotrecwwds_17_tfnr_artdsc_sel, lV115Tnotrecwwds_18_tfnr_colnom, AV116Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV117Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV118Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV119Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV120Tnotrecwwds_23_tfnr_piezas_to), AV121Tnotrecwwds_24_tfnr_unidades, AV122Tnotrecwwds_25_tfnr_unidades_to, lV123Tnotrecwwds_26_tfnr_unidad, AV124Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV125Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV126Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV127Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV128Tnotrecwwds_31_tfnr_barreoa_to), lV129Tnotrecwwds_32_tfnr_barpara, AV130Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV131Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV132Tnotrecwwds_35_tfnr_nalb_to), lV133Tnotrecwwds_36_tfnr_local, AV134Tnotrecwwds_37_tfnr_local_sel, lV135Tnotrecwwds_38_tfnr_user, AV136Tnotrecwwds_39_tfnr_user_sel, AV137Tnotrecwwds_40_tfnr_fecreg, AV138Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV139Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV140Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5210Nr_barcod = P08482_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08482_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08482_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08482_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08482_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08482_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08482_A5215Nr_user[0] ;
         n5215Nr_user = P08482_n5215Nr_user[0] ;
         A5214Nr_local = P08482_A5214Nr_local[0] ;
         n5214Nr_local = P08482_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08482_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08482_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08482_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08482_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08482_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08482_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08482_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08482_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08482_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08482_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08482_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08482_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08482_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08482_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08482_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08482_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08482_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08482_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P08482_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08482_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P08482_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08482_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P08482_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08482_n5200Nr_refcli[0] ;
         A5199Nr_albent = P08482_A5199Nr_albent[0] ;
         n5199Nr_albent = P08482_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P08482_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08482_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08482_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08482_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08482_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08482_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08482_A5198Nr_codigo[0] ;
         A396EmprCod = P08482_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV45VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A5198Nr_codigo );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A5206Nr_albrecc );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A5340Nr_CliCod );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5341Nr_CliNom, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5199Nr_albent, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5200Nr_refcli, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5201Nr_artcod, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5202Nr_artdsc, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5203Nr_colnom, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A5204Nr_colnum );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A5207Nr_piezas );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5208Nr_unidade)) );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5209Nr_unidad, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A5222Nr_barcoda );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A5223Nr_barreoa );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5224Nr_barpara, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A12235Nr_NAlb );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5214Nr_local, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5215Nr_user, GXv_char5) ;
            tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setDate( A5216Nr_fecreg );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5217Nr_fecent );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A5210Nr_barcod );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
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
      AV37ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_codigo", "", "Reclacacion ID", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_albreccod", "", "Nº Recepcion Id", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_CliCod", "", "Cliente", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_CliNom", "", "Nombre", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_albent", "", "Nº Albaran Cliente", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_refcli", "", "Referencia Albaran entrega cli", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_artcod", "", "Articulo", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_artdsc", "", "Descripcion", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_colnom", "", "Color", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_colnum", "", "Numero", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_piezas", "", "Piezas Entrada", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_unidades", "", "Unidades Entrada", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_unidad", "", "Unidad (K,M)", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_barcoda", "", "Hdr Anterior", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_barreoa", "", "Reopeado Anterior", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_barpara", "", "Particion Anterior", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_NAlb", "", "Numero Albaran Salida", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_local", "", "Localizacion", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_user", "", "Usuario creacion", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_fecreg", "", "Fecha-Hora entrada", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_fecent", "", "Fecha entrega", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Nr_barcod", "", "Hdr", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TNOTRECWWColumnsSelector", GXv_char5) ;
      tnotrecwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV41UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV38ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV37ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV38ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV37ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("TNOTRECWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TNOTRECWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TNOTRECWWGridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV141GXV2 = 1 ;
      while ( AV141GXV2 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV141GXV2));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV93FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CODIGO") == 0 )
         {
            AV48TFNr_codigo = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFNr_codigo_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBRECCOD") == 0 )
         {
            AV50TFNr_albreccod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFNr_albreccod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLICOD") == 0 )
         {
            AV52TFNr_CliCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFNr_CliCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM") == 0 )
         {
            AV54TFNr_CliNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM_SEL") == 0 )
         {
            AV55TFNr_CliNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT") == 0 )
         {
            AV56TFNr_albent = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT_SEL") == 0 )
         {
            AV57TFNr_albent_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI") == 0 )
         {
            AV58TFNr_refcli = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI_SEL") == 0 )
         {
            AV59TFNr_refcli_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD") == 0 )
         {
            AV60TFNr_artcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD_SEL") == 0 )
         {
            AV61TFNr_artcod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC") == 0 )
         {
            AV62TFNr_artdsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC_SEL") == 0 )
         {
            AV63TFNr_artdsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM") == 0 )
         {
            AV64TFNr_colnom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM_SEL") == 0 )
         {
            AV65TFNr_colnom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNUM") == 0 )
         {
            AV66TFNr_colnum = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFNr_colnum_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_PIEZAS") == 0 )
         {
            AV68TFNr_piezas = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFNr_piezas_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDADES") == 0 )
         {
            AV70TFNr_unidades = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV71TFNr_unidades_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD") == 0 )
         {
            AV72TFNr_unidad = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD_SEL") == 0 )
         {
            AV73TFNr_unidad_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCODA") == 0 )
         {
            AV74TFNr_barcoda = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFNr_barcoda_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARREOA") == 0 )
         {
            AV76TFNr_barreoa = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFNr_barreoa_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA") == 0 )
         {
            AV78TFNr_barpara = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA_SEL") == 0 )
         {
            AV79TFNr_barpara_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_NALB") == 0 )
         {
            AV80TFNr_NAlb = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV81TFNr_NAlb_To = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL") == 0 )
         {
            AV82TFNr_local = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL_SEL") == 0 )
         {
            AV83TFNr_local_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER") == 0 )
         {
            AV84TFNr_user = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER_SEL") == 0 )
         {
            AV85TFNr_user_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECREG") == 0 )
         {
            AV86TFNr_fecreg = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECENT") == 0 )
         {
            AV88TFNr_fecent = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCOD") == 0 )
         {
            AV90TFNr_barcod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV91TFNr_barcod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV141GXV2 = (int)(AV141GXV2+1) ;
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
      this.aP0[0] = tnotrecwwexport.this.AV11Filename;
      this.aP1[0] = tnotrecwwexport.this.AV12ErrorMessage;
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
      AV93FilterFullText = "" ;
      AV55TFNr_CliNom_Sel = "" ;
      AV54TFNr_CliNom = "" ;
      AV57TFNr_albent_Sel = "" ;
      AV56TFNr_albent = "" ;
      AV59TFNr_refcli_Sel = "" ;
      AV58TFNr_refcli = "" ;
      AV61TFNr_artcod_Sel = "" ;
      AV60TFNr_artcod = "" ;
      AV63TFNr_artdsc_Sel = "" ;
      AV62TFNr_artdsc = "" ;
      AV65TFNr_colnom_Sel = "" ;
      AV64TFNr_colnom = "" ;
      AV70TFNr_unidades = DecimalUtil.ZERO ;
      AV71TFNr_unidades_To = DecimalUtil.ZERO ;
      AV73TFNr_unidad_Sel = "" ;
      AV72TFNr_unidad = "" ;
      AV79TFNr_barpara_Sel = "" ;
      AV78TFNr_barpara = "" ;
      AV83TFNr_local_Sel = "" ;
      AV82TFNr_local = "" ;
      AV85TFNr_user_Sel = "" ;
      AV84TFNr_user = "" ;
      AV86TFNr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV88TFNr_fecent = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A5341Nr_CliNom = "" ;
      A5199Nr_albent = "" ;
      A5200Nr_refcli = "" ;
      A5201Nr_artcod = "" ;
      A5202Nr_artdsc = "" ;
      A5203Nr_colnom = "" ;
      A5208Nr_unidade = DecimalUtil.ZERO ;
      A5209Nr_unidad = "" ;
      A5224Nr_barpara = "" ;
      A5214Nr_local = "" ;
      A5215Nr_user = "" ;
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      A5217Nr_fecent = GXutil.nullDate() ;
      AV98Tnotrecwwds_1_filterfulltext = "" ;
      AV105Tnotrecwwds_8_tfnr_clinom = "" ;
      AV106Tnotrecwwds_9_tfnr_clinom_sel = "" ;
      AV107Tnotrecwwds_10_tfnr_albent = "" ;
      AV108Tnotrecwwds_11_tfnr_albent_sel = "" ;
      AV109Tnotrecwwds_12_tfnr_refcli = "" ;
      AV110Tnotrecwwds_13_tfnr_refcli_sel = "" ;
      AV111Tnotrecwwds_14_tfnr_artcod = "" ;
      AV112Tnotrecwwds_15_tfnr_artcod_sel = "" ;
      AV113Tnotrecwwds_16_tfnr_artdsc = "" ;
      AV114Tnotrecwwds_17_tfnr_artdsc_sel = "" ;
      AV115Tnotrecwwds_18_tfnr_colnom = "" ;
      AV116Tnotrecwwds_19_tfnr_colnom_sel = "" ;
      AV121Tnotrecwwds_24_tfnr_unidades = DecimalUtil.ZERO ;
      AV122Tnotrecwwds_25_tfnr_unidades_to = DecimalUtil.ZERO ;
      AV123Tnotrecwwds_26_tfnr_unidad = "" ;
      AV124Tnotrecwwds_27_tfnr_unidad_sel = "" ;
      AV129Tnotrecwwds_32_tfnr_barpara = "" ;
      AV130Tnotrecwwds_33_tfnr_barpara_sel = "" ;
      AV133Tnotrecwwds_36_tfnr_local = "" ;
      AV134Tnotrecwwds_37_tfnr_local_sel = "" ;
      AV135Tnotrecwwds_38_tfnr_user = "" ;
      AV136Tnotrecwwds_39_tfnr_user_sel = "" ;
      AV137Tnotrecwwds_40_tfnr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV138Tnotrecwwds_41_tfnr_fecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV98Tnotrecwwds_1_filterfulltext = "" ;
      lV105Tnotrecwwds_8_tfnr_clinom = "" ;
      lV107Tnotrecwwds_10_tfnr_albent = "" ;
      lV109Tnotrecwwds_12_tfnr_refcli = "" ;
      lV111Tnotrecwwds_14_tfnr_artcod = "" ;
      lV113Tnotrecwwds_16_tfnr_artdsc = "" ;
      lV115Tnotrecwwds_18_tfnr_colnom = "" ;
      lV123Tnotrecwwds_26_tfnr_unidad = "" ;
      lV129Tnotrecwwds_32_tfnr_barpara = "" ;
      lV133Tnotrecwwds_36_tfnr_local = "" ;
      lV135Tnotrecwwds_38_tfnr_user = "" ;
      P08482_A5210Nr_barcod = new int[1] ;
      P08482_n5210Nr_barcod = new boolean[] {false} ;
      P08482_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08482_n5217Nr_fecent = new boolean[] {false} ;
      P08482_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08482_n5216Nr_fecreg = new boolean[] {false} ;
      P08482_A5215Nr_user = new String[] {""} ;
      P08482_n5215Nr_user = new boolean[] {false} ;
      P08482_A5214Nr_local = new String[] {""} ;
      P08482_n5214Nr_local = new boolean[] {false} ;
      P08482_A12235Nr_NAlb = new long[1] ;
      P08482_n12235Nr_NAlb = new boolean[] {false} ;
      P08482_A5224Nr_barpara = new String[] {""} ;
      P08482_n5224Nr_barpara = new boolean[] {false} ;
      P08482_A5223Nr_barreoa = new byte[1] ;
      P08482_n5223Nr_barreoa = new boolean[] {false} ;
      P08482_A5222Nr_barcoda = new int[1] ;
      P08482_n5222Nr_barcoda = new boolean[] {false} ;
      P08482_A5209Nr_unidad = new String[] {""} ;
      P08482_n5209Nr_unidad = new boolean[] {false} ;
      P08482_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08482_n5208Nr_unidade = new boolean[] {false} ;
      P08482_A5207Nr_piezas = new int[1] ;
      P08482_n5207Nr_piezas = new boolean[] {false} ;
      P08482_A5204Nr_colnum = new int[1] ;
      P08482_n5204Nr_colnum = new boolean[] {false} ;
      P08482_A5203Nr_colnom = new String[] {""} ;
      P08482_n5203Nr_colnom = new boolean[] {false} ;
      P08482_A5202Nr_artdsc = new String[] {""} ;
      P08482_n5202Nr_artdsc = new boolean[] {false} ;
      P08482_A5201Nr_artcod = new String[] {""} ;
      P08482_n5201Nr_artcod = new boolean[] {false} ;
      P08482_A5200Nr_refcli = new String[] {""} ;
      P08482_n5200Nr_refcli = new boolean[] {false} ;
      P08482_A5199Nr_albent = new String[] {""} ;
      P08482_n5199Nr_albent = new boolean[] {false} ;
      P08482_A5341Nr_CliNom = new String[] {""} ;
      P08482_n5341Nr_CliNom = new boolean[] {false} ;
      P08482_A5340Nr_CliCod = new int[1] ;
      P08482_n5340Nr_CliCod = new boolean[] {false} ;
      P08482_A5206Nr_albrecc = new int[1] ;
      P08482_n5206Nr_albrecc = new boolean[] {false} ;
      P08482_A5198Nr_codigo = new int[1] ;
      P08482_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnotrecwwexport__default(),
         new Object[] {
             new Object[] {
            P08482_A5210Nr_barcod, P08482_n5210Nr_barcod, P08482_A5217Nr_fecent, P08482_n5217Nr_fecent, P08482_A5216Nr_fecreg, P08482_n5216Nr_fecreg, P08482_A5215Nr_user, P08482_n5215Nr_user, P08482_A5214Nr_local, P08482_n5214Nr_local,
            P08482_A12235Nr_NAlb, P08482_n12235Nr_NAlb, P08482_A5224Nr_barpara, P08482_n5224Nr_barpara, P08482_A5223Nr_barreoa, P08482_n5223Nr_barreoa, P08482_A5222Nr_barcoda, P08482_n5222Nr_barcoda, P08482_A5209Nr_unidad, P08482_n5209Nr_unidad,
            P08482_A5208Nr_unidade, P08482_n5208Nr_unidade, P08482_A5207Nr_piezas, P08482_n5207Nr_piezas, P08482_A5204Nr_colnum, P08482_n5204Nr_colnum, P08482_A5203Nr_colnom, P08482_n5203Nr_colnom, P08482_A5202Nr_artdsc, P08482_n5202Nr_artdsc,
            P08482_A5201Nr_artcod, P08482_n5201Nr_artcod, P08482_A5200Nr_refcli, P08482_n5200Nr_refcli, P08482_A5199Nr_albent, P08482_n5199Nr_albent, P08482_A5341Nr_CliNom, P08482_n5341Nr_CliNom, P08482_A5340Nr_CliCod, P08482_n5340Nr_CliCod,
            P08482_A5206Nr_albrecc, P08482_n5206Nr_albrecc, P08482_A5198Nr_codigo, P08482_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV76TFNr_barreoa ;
   private byte AV77TFNr_barreoa_To ;
   private byte A5223Nr_barreoa ;
   private byte AV127Tnotrecwwds_30_tfnr_barreoa ;
   private byte AV128Tnotrecwwds_31_tfnr_barreoa_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV48TFNr_codigo ;
   private int AV49TFNr_codigo_To ;
   private int AV50TFNr_albreccod ;
   private int AV51TFNr_albreccod_To ;
   private int AV52TFNr_CliCod ;
   private int AV53TFNr_CliCod_To ;
   private int AV66TFNr_colnum ;
   private int AV67TFNr_colnum_To ;
   private int AV68TFNr_piezas ;
   private int AV69TFNr_piezas_To ;
   private int AV74TFNr_barcoda ;
   private int AV75TFNr_barcoda_To ;
   private int AV90TFNr_barcod ;
   private int AV91TFNr_barcod_To ;
   private int AV96GXV1 ;
   private int A5198Nr_codigo ;
   private int A5206Nr_albrecc ;
   private int A5340Nr_CliCod ;
   private int A5204Nr_colnum ;
   private int A5207Nr_piezas ;
   private int A5222Nr_barcoda ;
   private int A5210Nr_barcod ;
   private int AV99Tnotrecwwds_2_tfnr_codigo ;
   private int AV100Tnotrecwwds_3_tfnr_codigo_to ;
   private int AV101Tnotrecwwds_4_tfnr_albreccod ;
   private int AV102Tnotrecwwds_5_tfnr_albreccod_to ;
   private int AV103Tnotrecwwds_6_tfnr_clicod ;
   private int AV104Tnotrecwwds_7_tfnr_clicod_to ;
   private int AV117Tnotrecwwds_20_tfnr_colnum ;
   private int AV118Tnotrecwwds_21_tfnr_colnum_to ;
   private int AV119Tnotrecwwds_22_tfnr_piezas ;
   private int AV120Tnotrecwwds_23_tfnr_piezas_to ;
   private int AV125Tnotrecwwds_28_tfnr_barcoda ;
   private int AV126Tnotrecwwds_29_tfnr_barcoda_to ;
   private int AV139Tnotrecwwds_42_tfnr_barcod ;
   private int AV140Tnotrecwwds_43_tfnr_barcod_to ;
   private int AV141GXV2 ;
   private long AV80TFNr_NAlb ;
   private long AV81TFNr_NAlb_To ;
   private long AV45VisibleColumnCount ;
   private long A12235Nr_NAlb ;
   private long AV131Tnotrecwwds_34_tfnr_nalb ;
   private long AV132Tnotrecwwds_35_tfnr_nalb_to ;
   private java.math.BigDecimal AV70TFNr_unidades ;
   private java.math.BigDecimal AV71TFNr_unidades_To ;
   private java.math.BigDecimal A5208Nr_unidade ;
   private java.math.BigDecimal AV121Tnotrecwwds_24_tfnr_unidades ;
   private java.math.BigDecimal AV122Tnotrecwwds_25_tfnr_unidades_to ;
   private String AV55TFNr_CliNom_Sel ;
   private String AV54TFNr_CliNom ;
   private String AV57TFNr_albent_Sel ;
   private String AV56TFNr_albent ;
   private String AV59TFNr_refcli_Sel ;
   private String AV58TFNr_refcli ;
   private String AV61TFNr_artcod_Sel ;
   private String AV60TFNr_artcod ;
   private String AV63TFNr_artdsc_Sel ;
   private String AV62TFNr_artdsc ;
   private String AV65TFNr_colnom_Sel ;
   private String AV64TFNr_colnom ;
   private String AV73TFNr_unidad_Sel ;
   private String AV72TFNr_unidad ;
   private String AV79TFNr_barpara_Sel ;
   private String AV78TFNr_barpara ;
   private String AV83TFNr_local_Sel ;
   private String AV82TFNr_local ;
   private String AV85TFNr_user_Sel ;
   private String AV84TFNr_user ;
   private String A5341Nr_CliNom ;
   private String A5199Nr_albent ;
   private String A5200Nr_refcli ;
   private String A5201Nr_artcod ;
   private String A5202Nr_artdsc ;
   private String A5203Nr_colnom ;
   private String A5209Nr_unidad ;
   private String A5224Nr_barpara ;
   private String A5214Nr_local ;
   private String A5215Nr_user ;
   private String AV105Tnotrecwwds_8_tfnr_clinom ;
   private String AV106Tnotrecwwds_9_tfnr_clinom_sel ;
   private String AV107Tnotrecwwds_10_tfnr_albent ;
   private String AV108Tnotrecwwds_11_tfnr_albent_sel ;
   private String AV109Tnotrecwwds_12_tfnr_refcli ;
   private String AV110Tnotrecwwds_13_tfnr_refcli_sel ;
   private String AV111Tnotrecwwds_14_tfnr_artcod ;
   private String AV112Tnotrecwwds_15_tfnr_artcod_sel ;
   private String AV113Tnotrecwwds_16_tfnr_artdsc ;
   private String AV114Tnotrecwwds_17_tfnr_artdsc_sel ;
   private String AV115Tnotrecwwds_18_tfnr_colnom ;
   private String AV116Tnotrecwwds_19_tfnr_colnom_sel ;
   private String AV123Tnotrecwwds_26_tfnr_unidad ;
   private String AV124Tnotrecwwds_27_tfnr_unidad_sel ;
   private String AV129Tnotrecwwds_32_tfnr_barpara ;
   private String AV130Tnotrecwwds_33_tfnr_barpara_sel ;
   private String AV133Tnotrecwwds_36_tfnr_local ;
   private String AV134Tnotrecwwds_37_tfnr_local_sel ;
   private String AV135Tnotrecwwds_38_tfnr_user ;
   private String AV136Tnotrecwwds_39_tfnr_user_sel ;
   private String scmdbuf ;
   private String lV105Tnotrecwwds_8_tfnr_clinom ;
   private String lV107Tnotrecwwds_10_tfnr_albent ;
   private String lV109Tnotrecwwds_12_tfnr_refcli ;
   private String lV111Tnotrecwwds_14_tfnr_artcod ;
   private String lV113Tnotrecwwds_16_tfnr_artdsc ;
   private String lV115Tnotrecwwds_18_tfnr_colnom ;
   private String lV123Tnotrecwwds_26_tfnr_unidad ;
   private String lV129Tnotrecwwds_32_tfnr_barpara ;
   private String lV133Tnotrecwwds_36_tfnr_local ;
   private String lV135Tnotrecwwds_38_tfnr_user ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV86TFNr_fecreg ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date AV137Tnotrecwwds_40_tfnr_fecreg ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV88TFNr_fecent ;
   private java.util.Date A5217Nr_fecent ;
   private java.util.Date AV138Tnotrecwwds_41_tfnr_fecent ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n5210Nr_barcod ;
   private boolean n5217Nr_fecent ;
   private boolean n5216Nr_fecreg ;
   private boolean n5215Nr_user ;
   private boolean n5214Nr_local ;
   private boolean n12235Nr_NAlb ;
   private boolean n5224Nr_barpara ;
   private boolean n5223Nr_barreoa ;
   private boolean n5222Nr_barcoda ;
   private boolean n5209Nr_unidad ;
   private boolean n5208Nr_unidade ;
   private boolean n5207Nr_piezas ;
   private boolean n5204Nr_colnum ;
   private boolean n5203Nr_colnom ;
   private boolean n5202Nr_artdsc ;
   private boolean n5201Nr_artcod ;
   private boolean n5200Nr_refcli ;
   private boolean n5199Nr_albent ;
   private boolean n5341Nr_CliNom ;
   private boolean n5340Nr_CliCod ;
   private boolean n5206Nr_albrecc ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV93FilterFullText ;
   private String AV98Tnotrecwwds_1_filterfulltext ;
   private String lV98Tnotrecwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P08482_A5210Nr_barcod ;
   private boolean[] P08482_n5210Nr_barcod ;
   private java.util.Date[] P08482_A5217Nr_fecent ;
   private boolean[] P08482_n5217Nr_fecent ;
   private java.util.Date[] P08482_A5216Nr_fecreg ;
   private boolean[] P08482_n5216Nr_fecreg ;
   private String[] P08482_A5215Nr_user ;
   private boolean[] P08482_n5215Nr_user ;
   private String[] P08482_A5214Nr_local ;
   private boolean[] P08482_n5214Nr_local ;
   private long[] P08482_A12235Nr_NAlb ;
   private boolean[] P08482_n12235Nr_NAlb ;
   private String[] P08482_A5224Nr_barpara ;
   private boolean[] P08482_n5224Nr_barpara ;
   private byte[] P08482_A5223Nr_barreoa ;
   private boolean[] P08482_n5223Nr_barreoa ;
   private int[] P08482_A5222Nr_barcoda ;
   private boolean[] P08482_n5222Nr_barcoda ;
   private String[] P08482_A5209Nr_unidad ;
   private boolean[] P08482_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08482_A5208Nr_unidade ;
   private boolean[] P08482_n5208Nr_unidade ;
   private int[] P08482_A5207Nr_piezas ;
   private boolean[] P08482_n5207Nr_piezas ;
   private int[] P08482_A5204Nr_colnum ;
   private boolean[] P08482_n5204Nr_colnum ;
   private String[] P08482_A5203Nr_colnom ;
   private boolean[] P08482_n5203Nr_colnom ;
   private String[] P08482_A5202Nr_artdsc ;
   private boolean[] P08482_n5202Nr_artdsc ;
   private String[] P08482_A5201Nr_artcod ;
   private boolean[] P08482_n5201Nr_artcod ;
   private String[] P08482_A5200Nr_refcli ;
   private boolean[] P08482_n5200Nr_refcli ;
   private String[] P08482_A5199Nr_albent ;
   private boolean[] P08482_n5199Nr_albent ;
   private String[] P08482_A5341Nr_CliNom ;
   private boolean[] P08482_n5341Nr_CliNom ;
   private int[] P08482_A5340Nr_CliCod ;
   private boolean[] P08482_n5340Nr_CliCod ;
   private int[] P08482_A5206Nr_albrecc ;
   private boolean[] P08482_n5206Nr_albrecc ;
   private int[] P08482_A5198Nr_codigo ;
   private String[] P08482_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV39ColumnsSelector_Column ;
}

final  class tnotrecwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08482( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV98Tnotrecwwds_1_filterfulltext ,
                                          int AV99Tnotrecwwds_2_tfnr_codigo ,
                                          int AV100Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV101Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV102Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV103Tnotrecwwds_6_tfnr_clicod ,
                                          int AV104Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV106Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV105Tnotrecwwds_8_tfnr_clinom ,
                                          String AV108Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV107Tnotrecwwds_10_tfnr_albent ,
                                          String AV110Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV109Tnotrecwwds_12_tfnr_refcli ,
                                          String AV112Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV111Tnotrecwwds_14_tfnr_artcod ,
                                          String AV114Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV113Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV116Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV115Tnotrecwwds_18_tfnr_colnom ,
                                          int AV117Tnotrecwwds_20_tfnr_colnum ,
                                          int AV118Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV119Tnotrecwwds_22_tfnr_piezas ,
                                          int AV120Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV121Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV122Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV124Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV123Tnotrecwwds_26_tfnr_unidad ,
                                          int AV125Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV126Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV127Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV128Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV130Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV129Tnotrecwwds_32_tfnr_barpara ,
                                          long AV131Tnotrecwwds_34_tfnr_nalb ,
                                          long AV132Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV134Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV133Tnotrecwwds_36_tfnr_local ,
                                          String AV136Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV135Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV137Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV138Tnotrecwwds_41_tfnr_fecent ,
                                          int AV139Tnotrecwwds_42_tfnr_barcod ,
                                          int AV140Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[62];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom, Nr_artdsc," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV98Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
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
         GXv_int9[13] = (byte)(1) ;
         GXv_int9[14] = (byte)(1) ;
         GXv_int9[15] = (byte)(1) ;
         GXv_int9[16] = (byte)(1) ;
         GXv_int9[17] = (byte)(1) ;
         GXv_int9[18] = (byte)(1) ;
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV99Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV100Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV101Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV104Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV107Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV109Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV111Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV115Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV117Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV123Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (0==AV126Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (0==AV127Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (0==AV128Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV129Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! (0==AV131Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV133Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int9[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV135Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int9[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV137Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int9[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int9[59] = (byte)(1) ;
      }
      if ( ! (0==AV139Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int9[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int9[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_albrecc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_albrecc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_codigo" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_codigo DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_albent" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_albent DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_refcli" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_refcli DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_artcod" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_artcod DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_artdsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_artdsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_colnom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_colnom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_colnum" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_colnum DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_piezas" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_piezas DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_unidade" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_unidade DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_unidad" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_unidad DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barcoda" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barcoda DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barreoa" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barreoa DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barpara" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barpara DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_NAlb" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_NAlb DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_local" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_local DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_user" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_user DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_fecreg" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_fecreg DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_fecent" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_fecent DESC" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barcod" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barcod DESC" ;
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
                  return conditional_P08482(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Boolean) dynConstraints[66]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08482", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
      }
   }

}

