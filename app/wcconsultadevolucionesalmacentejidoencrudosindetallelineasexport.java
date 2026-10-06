package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport extends GXProcedure
{
   public wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.class ), "" );
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport( int remoteHandle ,
                                                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.aP1 = new String[] {""};
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
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.aP0 = aP0;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV53TFAlbRecCod) && (0==AV54TFAlbRecCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV53TFAlbRecCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV54TFAlbRecCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV64TFAlbREnt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFAlbREnt_Sel, GXv_char5) ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFAlbREnt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Documento", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFAlbREnt, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV56TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Referencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFAlbRef_Sel, GXv_char5) ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFAlbRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Referencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFAlbRef, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFAlbRefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFAlbRefDsc_Sel, GXv_char5) ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFAlbRefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFAlbRefDsc, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV59TFDevCruPzs) && (0==AV60TFDevCruPzs_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFDevCruPzs );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFDevCruPzs_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFDevCruUnd)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFDevCruUnd_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFDevCruUnd)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFDevCruUnd_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV67GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV18FilterFullText ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV53TFAlbRecCod ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV54TFAlbRecCod_To ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV63TFAlbREnt ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV64TFAlbREnt_Sel ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV55TFAlbRef ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV56TFAlbRef_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV57TFAlbRefDsc ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV58TFAlbRefDsc_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV59TFDevCruPzs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV60TFDevCruPzs_To ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV61TFDevCruUnd ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV62TFDevCruUnd_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                           Integer.valueOf(AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) ,
                                           Integer.valueOf(AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) ,
                                           AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                           AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                           AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                           AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                           AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                           AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                           Integer.valueOf(AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) ,
                                           Integer.valueOf(AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) ,
                                           AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                           AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           A11683DevCruUnd ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV51Emprcod ,
                                           Integer.valueOf(AV52DevCruId) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A11669DevCruId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent), 8, "%") ;
      lV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = GXutil.padr( GXutil.rtrim( AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref), 16, "%") ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc), 26, "%") ;
      /* Using cursor P090C2 */
      pr_default.execute(0, new Object[] {AV51Emprcod, Integer.valueOf(AV52DevCruId), lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, Integer.valueOf(AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod), Integer.valueOf(AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to), lV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent, AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel, lV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref, AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel, lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc, AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel, Integer.valueOf(AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs), Integer.valueOf(AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to), AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund, AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11669DevCruId = P090C2_A11669DevCruId[0] ;
         A396EmprCod = P090C2_A396EmprCod[0] ;
         A11683DevCruUnd = P090C2_A11683DevCruUnd[0] ;
         A11684DevCruPzs = P090C2_A11684DevCruPzs[0] ;
         A3613AlbRefDsc = P090C2_A3613AlbRefDsc[0] ;
         A45AlbRef = P090C2_A45AlbRef[0] ;
         A46AlbREnt = P090C2_A46AlbREnt[0] ;
         A44AlbRecCod = P090C2_A44AlbRecCod[0] ;
         A11670DevCruFec = P090C2_A11670DevCruFec[0] ;
         A11670DevCruFec = P090C2_A11670DevCruFec[0] ;
         A3613AlbRefDsc = P090C2_A3613AlbRefDsc[0] ;
         A45AlbRef = P090C2_A45AlbRef[0] ;
         A46AlbREnt = P090C2_A46AlbREnt[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A44AlbRecCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A46AlbREnt, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3613AlbRefDsc, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A11684DevCruPzs );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11683DevCruUnd)) );
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
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbREnt", "", "Nº Documento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRef", "", "Referencia", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "AlbRefDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DevCruPzs", "", "Piezas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DevCruUnd", "", "Unidades", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasColumnsSelector", GXv_char5) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV82GXV2 = 1 ;
      while ( AV82GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV53TFAlbRecCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFAlbRecCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV63TFAlbREnt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV64TFAlbREnt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV55TFAlbRef = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV56TFAlbRef_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV57TFAlbRefDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV58TFAlbRefDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUPZS") == 0 )
         {
            AV59TFDevCruPzs = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFDevCruPzs_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUUND") == 0 )
         {
            AV61TFDevCruUnd = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFDevCruUnd_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUID") == 0 )
         {
            AV52DevCruId = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV82GXV2 = (int)(AV82GXV2+1) ;
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
      this.aP0[0] = wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV11Filename;
      this.aP1[0] = wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport.this.AV12ErrorMessage;
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
      AV64TFAlbREnt_Sel = "" ;
      AV63TFAlbREnt = "" ;
      AV56TFAlbRef_Sel = "" ;
      AV55TFAlbRef = "" ;
      AV58TFAlbRefDsc_Sel = "" ;
      AV57TFAlbRefDsc = "" ;
      AV61TFDevCruUnd = DecimalUtil.ZERO ;
      AV62TFDevCruUnd_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = "" ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = "" ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = "" ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = "" ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = "" ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = "" ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = "" ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = DecimalUtil.ZERO ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = "" ;
      lV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = "" ;
      lV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = "" ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = "" ;
      AV51Emprcod = "" ;
      A396EmprCod = "" ;
      P090C2_A11669DevCruId = new int[1] ;
      P090C2_A396EmprCod = new String[] {""} ;
      P090C2_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090C2_A11684DevCruPzs = new int[1] ;
      P090C2_A3613AlbRefDsc = new String[] {""} ;
      P090C2_A45AlbRef = new String[] {""} ;
      P090C2_A46AlbREnt = new String[] {""} ;
      P090C2_A44AlbRecCod = new int[1] ;
      P090C2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      A11670DevCruFec = GXutil.nullDate() ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport__default(),
         new Object[] {
             new Object[] {
            P090C2_A11669DevCruId, P090C2_A396EmprCod, P090C2_A11683DevCruUnd, P090C2_A11684DevCruPzs, P090C2_A3613AlbRefDsc, P090C2_A45AlbRef, P090C2_A46AlbREnt, P090C2_A44AlbRecCod, P090C2_A11670DevCruFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV53TFAlbRecCod ;
   private int AV54TFAlbRecCod_To ;
   private int AV59TFDevCruPzs ;
   private int AV60TFDevCruPzs_To ;
   private int AV67GXV1 ;
   private int A44AlbRecCod ;
   private int A11684DevCruPzs ;
   private int AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ;
   private int AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ;
   private int AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ;
   private int AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ;
   private int AV52DevCruId ;
   private int A11669DevCruId ;
   private int AV82GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV61TFDevCruUnd ;
   private java.math.BigDecimal AV62TFDevCruUnd_To ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ;
   private java.math.BigDecimal AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ;
   private String AV64TFAlbREnt_Sel ;
   private String AV63TFAlbREnt ;
   private String AV56TFAlbRef_Sel ;
   private String AV55TFAlbRef ;
   private String AV58TFAlbRefDsc_Sel ;
   private String AV57TFAlbRefDsc ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ;
   private String AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ;
   private String AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ;
   private String AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ;
   private String AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ;
   private String AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ;
   private String lV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ;
   private String lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ;
   private String AV51Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date A11670DevCruFec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ;
   private String lV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P090C2_A11669DevCruId ;
   private String[] P090C2_A396EmprCod ;
   private java.math.BigDecimal[] P090C2_A11683DevCruUnd ;
   private int[] P090C2_A11684DevCruPzs ;
   private String[] P090C2_A3613AlbRefDsc ;
   private String[] P090C2_A45AlbRef ;
   private String[] P090C2_A46AlbREnt ;
   private int[] P090C2_A44AlbRecCod ;
   private java.util.Date[] P090C2_A11670DevCruFec ;
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

final  class wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                          int AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ,
                                          int AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ,
                                          String AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                          String AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                          String AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                          String AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                          int AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ,
                                          int AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ,
                                          java.math.BigDecimal AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                          java.math.BigDecimal AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A11684DevCruPzs ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV51Emprcod ,
                                          int AV52DevCruId ,
                                          String A396EmprCod ,
                                          int A11669DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.DevCruId, T1.EmprCod, T1.DevCruUnd, T1.DevCruPzs, T3.AlbRefDsc, T3.AlbRef, T3.AlbREnt, T1.AlbRecCod, T2.DevCruFec FROM ((TXPDEVCR1 T1 INNER JOIN TXPDEVCRU" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.DevCruId = T1.DevCruId) INNER JOIN TXPALBREC T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DevCruId = ?)");
      if ( ! (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbRecCod,'99999990'), 2) like '%' || ?) or ( UPPER(T3.AlbREnt) like '%' || UPPER(?)) or ( UPPER(T3.AlbRef) like '%' || UPPER(?)) or ( UPPER(T3.AlbRefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DevCruPzs,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.DevCruUnd,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T3.AlbREnt = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T3.AlbRef = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T2.DevCruFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbREnt" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbREnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbRef" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbRef DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbRefDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbRefDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruPzs" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruPzs DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruUnd" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruUnd DESC" ;
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
                  return conditional_P090C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
      }
   }

}

