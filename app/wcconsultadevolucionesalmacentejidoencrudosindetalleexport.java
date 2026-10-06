package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultadevolucionesalmacentejidoencrudosindetalleexport extends GXProcedure
{
   public wcconsultadevolucionesalmacentejidoencrudosindetalleexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetalleexport.class ), "" );
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetalleexport( int remoteHandle ,
                                                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.aP1 = new String[] {""};
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
      wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.aP0 = aP0;
      wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFDevCruId) && (0==AV35TFDevCruId_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Devolucion Id", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFDevCruId );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFDevCruId_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFDevCruFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Devolucion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV36TFDevCruFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV38TFCliCod) && (0==AV39TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFCliNom_Sel, GXv_char5) ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFCliNom, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV42TFTrnCod) && (0==AV43TFTrnCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod Transp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFTrnCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFTrnCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFTrnNom_Sel, GXv_char5) ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFTrnNom, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFDevCruMat_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matricula", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFDevCruMat_Sel, GXv_char5) ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFDevCruMat)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matricula", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFDevCruMat, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFDevCruObs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFDevCruObs_Sel, GXv_char5) ;
         wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFDevCruObs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFDevCruObs, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV63GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV18FilterFullText ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV34TFDevCruId ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV35TFDevCruId_To ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV36TFDevCruFec ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV38TFCliCod ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV39TFCliCod_To ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV40TFCliNom ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV41TFCliNom_Sel ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV42TFTrnCod ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV43TFTrnCod_To ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV44TFTrnNom ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV45TFTrnNom_Sel ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV46TFDevCruMat ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV47TFDevCruMat_Sel ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV48TFDevCruObs ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV49TFDevCruObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                           Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                           Integer.valueOf(AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                           Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                           Integer.valueOf(AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                           AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                           Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                           Short.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                           AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                           AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                           AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                           AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                           AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                           AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                           Integer.valueOf(AV54CliCod) ,
                                           Integer.valueOf(AV55CliCod_to) ,
                                           AV52DevCruFec ,
                                           AV53DevCruFec_to ,
                                           Integer.valueOf(AV60AlbRecCod) ,
                                           AV58AlbRef ,
                                           AV59AlbREnt ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV51Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
      lV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
      lV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
      lV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
      lV58AlbRef = GXutil.padr( GXutil.rtrim( AV58AlbRef), 16, "%") ;
      lV59AlbREnt = GXutil.padr( GXutil.rtrim( AV59AlbREnt), 8, "%") ;
      /* Using cursor P09083 */
      pr_default.execute(0, new Object[] {AV51Emprcod, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV54CliCod), Integer.valueOf(AV55CliCod_to), AV52DevCruFec, AV53DevCruFec_to, Integer.valueOf(AV60AlbRecCod), lV58AlbRef, lV59AlbREnt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46AlbREnt = P09083_A46AlbREnt[0] ;
         A45AlbRef = P09083_A45AlbRef[0] ;
         A44AlbRecCod = P09083_A44AlbRecCod[0] ;
         A396EmprCod = P09083_A396EmprCod[0] ;
         A11682DevCruObs = P09083_A11682DevCruObs[0] ;
         A11672DevCruMat = P09083_A11672DevCruMat[0] ;
         A841TrnNom = P09083_A841TrnNom[0] ;
         n841TrnNom = P09083_n841TrnNom[0] ;
         A840TrnCod = P09083_A840TrnCod[0] ;
         n840TrnCod = P09083_n840TrnCod[0] ;
         A279CliNom = P09083_A279CliNom[0] ;
         A252CliCod = P09083_A252CliCod[0] ;
         A11670DevCruFec = P09083_A11670DevCruFec[0] ;
         A11669DevCruId = P09083_A11669DevCruId[0] ;
         A40000GXC1 = P09083_A40000GXC1[0] ;
         n40000GXC1 = P09083_n40000GXC1[0] ;
         A40001GXC2 = P09083_A40001GXC2[0] ;
         n40001GXC2 = P09083_n40001GXC2[0] ;
         A46AlbREnt = P09083_A46AlbREnt[0] ;
         A45AlbRef = P09083_A45AlbRef[0] ;
         A840TrnCod = P09083_A840TrnCod[0] ;
         n840TrnCod = P09083_n840TrnCod[0] ;
         A252CliCod = P09083_A252CliCod[0] ;
         A279CliNom = P09083_A279CliNom[0] ;
         A841TrnNom = P09083_A841TrnNom[0] ;
         n841TrnNom = P09083_n841TrnNom[0] ;
         A11682DevCruObs = P09083_A11682DevCruObs[0] ;
         A11672DevCruMat = P09083_A11672DevCruMat[0] ;
         A11670DevCruFec = P09083_A11670DevCruFec[0] ;
         A40000GXC1 = P09083_A40000GXC1[0] ;
         n40000GXC1 = P09083_n40000GXC1[0] ;
         A40001GXC2 = P09083_A40001GXC2[0] ;
         n40001GXC2 = P09083_n40001GXC2[0] ;
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
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A11669DevCruId );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A11670DevCruFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A840TrnCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A841TrnNom, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11672DevCruMat, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11682DevCruObs, GXv_char5) ;
            wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV56DevCruUnd = A40000GXC1 ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56DevCruUnd)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV57DevCruPzs = A40001GXC2 ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV57DevCruPzs );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruId", "", "Devolucion Id", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruFec", "", "Fecha Devolucion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnCod", "", "Cod Transp", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnNom", "", "Transportista", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruMat", "", "Matricula", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruObs", "", "Observaciones", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&DevCruUnd", "Devolucion", "Unidades", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&DevCruPzs", "Devolucion", "Piezas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector", GXv_char5) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV81GXV2 = 1 ;
      while ( AV81GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV34TFDevCruId = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFDevCruId_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV36TFDevCruFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV42TFTrnCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFTrnCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV44TFTrnNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV45TFTrnNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV46TFDevCruMat = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV47TFDevCruMat_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV48TFDevCruObs = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV49TFDevCruObs_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC") == 0 )
         {
            AV52DevCruFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC_TO") == 0 )
         {
            AV53DevCruFec_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV54CliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV55CliCod_to = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF") == 0 )
         {
            AV58AlbRef = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRENT") == 0 )
         {
            AV59AlbREnt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRECCOD") == 0 )
         {
            AV60AlbRecCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV81GXV2 = (int)(AV81GXV2+1) ;
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
      this.aP0[0] = wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV11Filename;
      this.aP1[0] = wcconsultadevolucionesalmacentejidoencrudosindetalleexport.this.AV12ErrorMessage;
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
      AV36TFDevCruFec = GXutil.nullDate() ;
      AV41TFCliNom_Sel = "" ;
      AV40TFCliNom = "" ;
      AV45TFTrnNom_Sel = "" ;
      AV44TFTrnNom = "" ;
      AV47TFDevCruMat_Sel = "" ;
      AV46TFDevCruMat = "" ;
      AV49TFDevCruObs_Sel = "" ;
      AV48TFDevCruObs = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A11670DevCruFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      A40000GXC1 = DecimalUtil.ZERO ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = GXutil.nullDate() ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = "" ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = "" ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = "" ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = "" ;
      scmdbuf = "" ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      lV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      lV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      lV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      lV58AlbRef = "" ;
      lV59AlbREnt = "" ;
      AV52DevCruFec = GXutil.nullDate() ;
      AV53DevCruFec_to = GXutil.nullDate() ;
      AV58AlbRef = "" ;
      AV59AlbREnt = "" ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      AV51Emprcod = "" ;
      A396EmprCod = "" ;
      P09083_A46AlbREnt = new String[] {""} ;
      P09083_A45AlbRef = new String[] {""} ;
      P09083_A44AlbRecCod = new int[1] ;
      P09083_A396EmprCod = new String[] {""} ;
      P09083_A11682DevCruObs = new String[] {""} ;
      P09083_A11672DevCruMat = new String[] {""} ;
      P09083_A841TrnNom = new String[] {""} ;
      P09083_n841TrnNom = new boolean[] {false} ;
      P09083_A840TrnCod = new short[1] ;
      P09083_n840TrnCod = new boolean[] {false} ;
      P09083_A279CliNom = new String[] {""} ;
      P09083_A252CliCod = new int[1] ;
      P09083_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09083_A11669DevCruId = new int[1] ;
      P09083_A40000GXC1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09083_n40000GXC1 = new boolean[] {false} ;
      P09083_A40001GXC2 = new int[1] ;
      P09083_n40001GXC2 = new boolean[] {false} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV56DevCruUnd = DecimalUtil.ZERO ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadevolucionesalmacentejidoencrudosindetalleexport__default(),
         new Object[] {
             new Object[] {
            P09083_A46AlbREnt, P09083_A45AlbRef, P09083_A44AlbRecCod, P09083_A396EmprCod, P09083_A11682DevCruObs, P09083_A11672DevCruMat, P09083_A841TrnNom, P09083_n841TrnNom, P09083_A840TrnCod, P09083_n840TrnCod,
            P09083_A279CliNom, P09083_A252CliCod, P09083_A11670DevCruFec, P09083_A11669DevCruId, P09083_A40000GXC1, P09083_n40000GXC1, P09083_A40001GXC2, P09083_n40001GXC2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV42TFTrnCod ;
   private short AV43TFTrnCod_To ;
   private short GXv_int3[] ;
   private short A840TrnCod ;
   private short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ;
   private short AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFDevCruId ;
   private int AV35TFDevCruId_To ;
   private int AV38TFCliCod ;
   private int AV39TFCliCod_To ;
   private int AV63GXV1 ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int A40001GXC2 ;
   private int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ;
   private int AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ;
   private int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ;
   private int AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ;
   private int AV54CliCod ;
   private int AV55CliCod_to ;
   private int AV60AlbRecCod ;
   private int A44AlbRecCod ;
   private int AV57DevCruPzs ;
   private int AV81GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal A40000GXC1 ;
   private java.math.BigDecimal AV56DevCruUnd ;
   private String AV41TFCliNom_Sel ;
   private String AV40TFCliNom ;
   private String AV45TFTrnNom_Sel ;
   private String AV44TFTrnNom ;
   private String AV47TFDevCruMat_Sel ;
   private String AV46TFDevCruMat ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ;
   private String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ;
   private String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ;
   private String scmdbuf ;
   private String lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String lV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String lV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String lV58AlbRef ;
   private String lV59AlbREnt ;
   private String AV58AlbRef ;
   private String AV59AlbREnt ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String AV51Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV36TFDevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ;
   private java.util.Date AV52DevCruFec ;
   private java.util.Date AV53DevCruFec_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV49TFDevCruObs_Sel ;
   private String AV48TFDevCruObs ;
   private String A11682DevCruObs ;
   private String AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ;
   private String lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String lV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09083_A46AlbREnt ;
   private String[] P09083_A45AlbRef ;
   private int[] P09083_A44AlbRecCod ;
   private String[] P09083_A396EmprCod ;
   private String[] P09083_A11682DevCruObs ;
   private String[] P09083_A11672DevCruMat ;
   private String[] P09083_A841TrnNom ;
   private boolean[] P09083_n841TrnNom ;
   private short[] P09083_A840TrnCod ;
   private boolean[] P09083_n840TrnCod ;
   private String[] P09083_A279CliNom ;
   private int[] P09083_A252CliCod ;
   private java.util.Date[] P09083_A11670DevCruFec ;
   private int[] P09083_A11669DevCruId ;
   private java.math.BigDecimal[] P09083_A40000GXC1 ;
   private boolean[] P09083_n40000GXC1 ;
   private int[] P09083_A40001GXC2 ;
   private boolean[] P09083_n40001GXC2 ;
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

final  class wcconsultadevolucionesalmacentejidoencrudosindetalleexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09083( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV54CliCod ,
                                          int AV55CliCod_to ,
                                          java.util.Date AV52DevCruFec ,
                                          java.util.Date AV53DevCruFec_to ,
                                          int AV60AlbRecCod ,
                                          String AV58AlbRef ,
                                          String AV59AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV51Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[30];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS AlbREnt, NULL AS AlbRef, NULL AS AlbRecCod, NULL AS EmprCod, DevCruObs, DevCruMat, TrnNom, TrnCod, CliNom, CliCod, DevCruFec, DevCruId, GXC1," ;
      scmdbuf += " GXC2 FROM ( SELECT T2.AlbREnt, T2.AlbRef, T1.AlbRecCod, T1.EmprCod, T5.DevCruObs, T5.DevCruMat, T4.TrnNom, T2.TrnCod, T3.CliNom, T2.CliCod, T5.DevCruFec, T1.DevCruId," ;
      scmdbuf += " COALESCE( T6.GXC1, 0) AS GXC1, COALESCE( T6.GXC2, 0) AS GXC2 FROM (((((TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T2.TrnCod) INNER" ;
      scmdbuf += " JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod AND T5.DevCruId = T1.DevCruId) LEFT JOIN (SELECT SUM(T7.DevCruUnd) AS GXC1, T7.DevCruId, SUM(T7.DevCruPzs) AS GXC2" ;
      scmdbuf += " FROM ((((TXPDEVCR1 T7 INNER JOIN TXPALBREC T8 ON T8.EmprCod = T7.EmprCod AND T8.AlbRecCod = T7.AlbRecCod) LEFT JOIN TXPCLIENT T9 ON T9.EmprCod = T7.EmprCod AND" ;
      scmdbuf += " T9.CliCod = T8.CliCod) LEFT JOIN TXPTRANSP T10 ON T10.EmprCod = T7.EmprCod AND T10.TrnCod = T8.TrnCod) INNER JOIN TXPDEVCRU T11 ON T11.EmprCod = T7.EmprCod AND" ;
      scmdbuf += " T11.DevCruId = T7.DevCruId) GROUP BY T7.DevCruId ) T6 ON T6.DevCruId = T1.DevCruId)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T4.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV54CliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV55CliCod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV60AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruFec" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruMat" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruMat DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruObs" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruObs DESC" ;
      }
      scmdbuf += ") DistinctT" ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruFec" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruId" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruId DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TrnCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TrnCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruMat" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruMat DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruObs" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruObs DESC" ;
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
                  return conditional_P09083(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09083", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

