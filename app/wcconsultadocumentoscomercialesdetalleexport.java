package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultadocumentoscomercialesdetalleexport extends GXProcedure
{
   public wcconsultadocumentoscomercialesdetalleexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadocumentoscomercialesdetalleexport.class ), "" );
   }

   public wcconsultadocumentoscomercialesdetalleexport( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcconsultadocumentoscomercialesdetalleexport.this.aP1 = new String[] {""};
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
      wcconsultadocumentoscomercialesdetalleexport.this.aP0 = aP0;
      wcconsultadocumentoscomercialesdetalleexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCConsultaDocumentosComercialesDetalleExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV57TFAlbComLin) && (0==AV58TFAlbComLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV57TFAlbComLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV58TFAlbComLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV60TFAlbComNRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N/Ref", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFAlbComNRef_Sel, GXv_char5) ;
         wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV59TFAlbComNRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N/Ref", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFAlbComNRef, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV62TFAlbComVDoc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "V/Doc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFAlbComVDoc_Sel, GXv_char5) ;
         wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFAlbComVDoc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "V/Doc", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFAlbComVDoc, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV63TFAlbComPzas) && (0==AV64TFAlbComPzas_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV63TFAlbComPzas );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV64TFAlbComPzas_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbComMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbComMts_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFAlbComMts)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFAlbComMts_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV68TFAlbComArt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFAlbComArt_Sel, GXv_char5) ;
         wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFAlbComArt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFAlbComArt, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV70TFAlbComArtD_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFAlbComArtD_Sel, GXv_char5) ;
         wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFAlbComArtD)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFAlbComArtD, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV72TFAlbComCol_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFAlbComCol_Sel, GXv_char5) ;
         wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFAlbComCol)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFAlbComCol, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFAlbComKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFAlbComKgs_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73TFAlbComKgs)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV74TFAlbComKgs_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV76TFAlbComDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFAlbComDsc_Sel, GXv_char5) ;
         wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFAlbComDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadocumentoscomercialesdetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFAlbComDsc, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDocumentosComercialesDetalleColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("WCConsultaDocumentosComercialesDetalleColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV79GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV18FilterFullText ;
      AV82Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV83Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV85Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV87Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV88Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV89Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV90Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV91Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV93Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV95Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV97Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV98Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV99Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV101Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV85Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV87Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV88Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV95Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV97Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV98Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV99Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV101Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56AlbComCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A14AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090S2 */
      pr_default.execute(0, new Object[] {AV55Emprcod, Integer.valueOf(AV56AlbComCod), lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV85Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV87Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV88Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV90Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV91Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV93Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV95Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV97Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV98Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV99Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV101Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P090S2_A14AlbComCod[0] ;
         A396EmprCod = P090S2_A396EmprCod[0] ;
         A15AlbComDsc = P090S2_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090S2_A13319AlbComKgs[0] ;
         A13322AlbComCol = P090S2_A13322AlbComCol[0] ;
         A13321AlbComArtD = P090S2_A13321AlbComArtD[0] ;
         A13320AlbComArt = P090S2_A13320AlbComArt[0] ;
         A13318AlbComMts = P090S2_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090S2_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = P090S2_A13316AlbComVDoc[0] ;
         A13315AlbComNRef = P090S2_A13315AlbComNRef[0] ;
         A20AlbComLin = P090S2_A20AlbComLin[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A20AlbComLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13315AlbComNRef, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13316AlbComVDoc, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13317AlbComPzas );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13318AlbComMts)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13320AlbComArt, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13321AlbComArtD, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13322AlbComCol, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13319AlbComKgs)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A15AlbComDsc, GXv_char5) ;
            wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComLin", "", "Linea", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComNRef", "", "N/Ref", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComVDoc", "", "V/Doc", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComPzas", "", "Piezas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComMts", "", "Metros", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComArt", "", "Codigo Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComArtD", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComCol", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComKgs", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbComDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDocumentosComercialesDetalleColumnsSelector", GXv_char5) ;
      wcconsultadocumentoscomercialesdetalleexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDocumentosComercialesDetalleGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDocumentosComercialesDetalleGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCConsultaDocumentosComercialesDetalleGridState"), null, null);
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
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMLIN") == 0 )
         {
            AV57TFAlbComLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFAlbComLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF") == 0 )
         {
            AV59TFAlbComNRef = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF_SEL") == 0 )
         {
            AV60TFAlbComNRef_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC") == 0 )
         {
            AV61TFAlbComVDoc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC_SEL") == 0 )
         {
            AV62TFAlbComVDoc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPZAS") == 0 )
         {
            AV63TFAlbComPzas = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFAlbComPzas_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMTS") == 0 )
         {
            AV65TFAlbComMts = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFAlbComMts_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART") == 0 )
         {
            AV67TFAlbComArt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART_SEL") == 0 )
         {
            AV68TFAlbComArt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD") == 0 )
         {
            AV69TFAlbComArtD = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD_SEL") == 0 )
         {
            AV70TFAlbComArtD_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL") == 0 )
         {
            AV71TFAlbComCol = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL_SEL") == 0 )
         {
            AV72TFAlbComCol_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMKGS") == 0 )
         {
            AV73TFAlbComKgs = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFAlbComKgs_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC") == 0 )
         {
            AV75TFAlbComDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC_SEL") == 0 )
         {
            AV76TFAlbComDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMCOD") == 0 )
         {
            AV56AlbComCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
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
      this.aP0[0] = wcconsultadocumentoscomercialesdetalleexport.this.AV11Filename;
      this.aP1[0] = wcconsultadocumentoscomercialesdetalleexport.this.AV12ErrorMessage;
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
      AV60TFAlbComNRef_Sel = "" ;
      AV59TFAlbComNRef = "" ;
      AV62TFAlbComVDoc_Sel = "" ;
      AV61TFAlbComVDoc = "" ;
      AV65TFAlbComMts = DecimalUtil.ZERO ;
      AV66TFAlbComMts_To = DecimalUtil.ZERO ;
      AV68TFAlbComArt_Sel = "" ;
      AV67TFAlbComArt = "" ;
      AV70TFAlbComArtD_Sel = "" ;
      AV69TFAlbComArtD = "" ;
      AV72TFAlbComCol_Sel = "" ;
      AV71TFAlbComCol = "" ;
      AV73TFAlbComKgs = DecimalUtil.ZERO ;
      AV74TFAlbComKgs_To = DecimalUtil.ZERO ;
      AV76TFAlbComDsc_Sel = "" ;
      AV75TFAlbComDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13315AlbComNRef = "" ;
      A13316AlbComVDoc = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13320AlbComArt = "" ;
      A13321AlbComArtD = "" ;
      A13322AlbComCol = "" ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      AV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      AV85Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = "" ;
      AV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      AV87Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = "" ;
      AV90Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = DecimalUtil.ZERO ;
      AV91Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = DecimalUtil.ZERO ;
      AV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      AV93Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = "" ;
      AV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      AV95Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = "" ;
      AV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      AV97Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = "" ;
      AV98Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = DecimalUtil.ZERO ;
      AV99Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = DecimalUtil.ZERO ;
      AV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      AV101Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = "" ;
      scmdbuf = "" ;
      lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      lV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      lV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      lV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      lV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      lV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      lV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      AV55Emprcod = "" ;
      A396EmprCod = "" ;
      P090S2_A14AlbComCod = new int[1] ;
      P090S2_A396EmprCod = new String[] {""} ;
      P090S2_A15AlbComDsc = new String[] {""} ;
      P090S2_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090S2_A13322AlbComCol = new String[] {""} ;
      P090S2_A13321AlbComArtD = new String[] {""} ;
      P090S2_A13320AlbComArt = new String[] {""} ;
      P090S2_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090S2_A13317AlbComPzas = new int[1] ;
      P090S2_A13316AlbComVDoc = new String[] {""} ;
      P090S2_A13315AlbComNRef = new String[] {""} ;
      P090S2_A20AlbComLin = new short[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadocumentoscomercialesdetalleexport__default(),
         new Object[] {
             new Object[] {
            P090S2_A14AlbComCod, P090S2_A396EmprCod, P090S2_A15AlbComDsc, P090S2_A13319AlbComKgs, P090S2_A13322AlbComCol, P090S2_A13321AlbComArtD, P090S2_A13320AlbComArt, P090S2_A13318AlbComMts, P090S2_A13317AlbComPzas, P090S2_A13316AlbComVDoc,
            P090S2_A13315AlbComNRef, P090S2_A20AlbComLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV57TFAlbComLin ;
   private short AV58TFAlbComLin_To ;
   private short GXv_int3[] ;
   private short A20AlbComLin ;
   private short AV82Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ;
   private short AV83Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV63TFAlbComPzas ;
   private int AV64TFAlbComPzas_To ;
   private int AV79GXV1 ;
   private int A13317AlbComPzas ;
   private int AV88Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ;
   private int AV89Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ;
   private int AV56AlbComCod ;
   private int A14AlbComCod ;
   private int AV102GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV65TFAlbComMts ;
   private java.math.BigDecimal AV66TFAlbComMts_To ;
   private java.math.BigDecimal AV73TFAlbComKgs ;
   private java.math.BigDecimal AV74TFAlbComKgs_To ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private java.math.BigDecimal AV90Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ;
   private java.math.BigDecimal AV91Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ;
   private java.math.BigDecimal AV98Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ;
   private java.math.BigDecimal AV99Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ;
   private String AV60TFAlbComNRef_Sel ;
   private String AV59TFAlbComNRef ;
   private String AV62TFAlbComVDoc_Sel ;
   private String AV61TFAlbComVDoc ;
   private String AV68TFAlbComArt_Sel ;
   private String AV67TFAlbComArt ;
   private String AV70TFAlbComArtD_Sel ;
   private String AV69TFAlbComArtD ;
   private String AV72TFAlbComCol_Sel ;
   private String AV71TFAlbComCol ;
   private String AV76TFAlbComDsc_Sel ;
   private String AV75TFAlbComDsc ;
   private String A13315AlbComNRef ;
   private String A13316AlbComVDoc ;
   private String A13320AlbComArt ;
   private String A13321AlbComArtD ;
   private String A13322AlbComCol ;
   private String A15AlbComDsc ;
   private String AV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String AV85Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ;
   private String AV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String AV87Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ;
   private String AV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String AV93Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ;
   private String AV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String AV95Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ;
   private String AV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String AV97Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ;
   private String AV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV101Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ;
   private String scmdbuf ;
   private String lV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String lV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String lV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String lV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String lV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String lV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV55Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String lV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P090S2_A14AlbComCod ;
   private String[] P090S2_A396EmprCod ;
   private String[] P090S2_A15AlbComDsc ;
   private java.math.BigDecimal[] P090S2_A13319AlbComKgs ;
   private String[] P090S2_A13322AlbComCol ;
   private String[] P090S2_A13321AlbComArtD ;
   private String[] P090S2_A13320AlbComArt ;
   private java.math.BigDecimal[] P090S2_A13318AlbComMts ;
   private int[] P090S2_A13317AlbComPzas ;
   private String[] P090S2_A13316AlbComVDoc ;
   private String[] P090S2_A13315AlbComNRef ;
   private short[] P090S2_A20AlbComLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class wcconsultadocumentoscomercialesdetalleexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV82Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV83Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV85Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV87Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV88Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV89Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV90Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV91Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV93Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV95Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV97Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV98Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV99Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV101Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV55Emprcod ,
                                          int AV56AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT AlbComCod, EmprCod, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV84Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV86Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV88Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV89Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV96Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComLin" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComNRef" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComNRef DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComVDoc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComVDoc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComPzas" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComPzas DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComMts" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComMts DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComArt" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComArt DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComArtD" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComArtD DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComCol" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComKgs" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComKgs DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComDsc" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComDsc DESC" ;
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
                  return conditional_P090S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
      }
   }

}

