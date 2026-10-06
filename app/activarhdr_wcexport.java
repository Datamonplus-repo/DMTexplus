package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class activarhdr_wcexport extends GXProcedure
{
   public activarhdr_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( activarhdr_wcexport.class ), "" );
   }

   public activarhdr_wcexport( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      activarhdr_wcexport.this.aP1 = new String[] {""};
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
      activarhdr_wcexport.this.aP0 = aP0;
      activarhdr_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ActivarHdr_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21FilterFullText, GXv_char5) ;
      activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV37TFStp_Lin) && (0==AV38TFStp_Lin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV37TFStp_Lin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV38TFStp_Lin_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV39TFStp_Dia) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV39TFStp_Dia );
      }
      if ( ! ( (GXutil.strcmp("", AV42TFStp_Mot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Motivo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFStp_Mot_Sel, GXv_char5) ;
         activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFStp_Mot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Motivo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFStp_Mot, GXv_char5) ;
            activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFStpHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFStpHdr_Sel, GXv_char5) ;
         activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFStpHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFStpHdr, GXv_char5) ;
            activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV45TFStpClicod) && (0==AV46TFStpClicod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFStpClicod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFStpClicod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFStpCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFStpCliNom_Sel, GXv_char5) ;
         activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFStpCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFStpCliNom, GXv_char5) ;
            activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFStpBarser_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFStpBarser_Sel, GXv_char5) ;
         activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFStpBarser)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFStpBarser, GXv_char5) ;
            activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFStpBarserDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFStpBarserDsc_Sel, GXv_char5) ;
         activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFStpBarserDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFStpBarserDsc, GXv_char5) ;
            activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV54TFStpColor_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFStpColor_Sel, GXv_char5) ;
         activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFStpColor)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            activarhdr_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFStpColor, GXv_char5) ;
            activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV22Session.getValue("ActivarHdr_WCColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV22Session.getValue("ActivarHdr_WCColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV58GXV1));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Activarhdr_wcds_1_filterfulltext = AV21FilterFullText ;
      AV61Activarhdr_wcds_2_tfstp_lin = AV37TFStp_Lin ;
      AV62Activarhdr_wcds_3_tfstp_lin_to = AV38TFStp_Lin_To ;
      AV63Activarhdr_wcds_4_tfstp_dia = AV39TFStp_Dia ;
      AV64Activarhdr_wcds_5_tfstp_mot = AV41TFStp_Mot ;
      AV65Activarhdr_wcds_6_tfstp_mot_sel = AV42TFStp_Mot_Sel ;
      AV66Activarhdr_wcds_7_tfstphdr = AV43TFStpHdr ;
      AV67Activarhdr_wcds_8_tfstphdr_sel = AV44TFStpHdr_Sel ;
      AV68Activarhdr_wcds_9_tfstpclicod = AV45TFStpClicod ;
      AV69Activarhdr_wcds_10_tfstpclicod_to = AV46TFStpClicod_To ;
      AV70Activarhdr_wcds_11_tfstpclinom = AV47TFStpCliNom ;
      AV71Activarhdr_wcds_12_tfstpclinom_sel = AV48TFStpCliNom_Sel ;
      AV72Activarhdr_wcds_13_tfstpbarser = AV49TFStpBarser ;
      AV73Activarhdr_wcds_14_tfstpbarser_sel = AV50TFStpBarser_Sel ;
      AV74Activarhdr_wcds_15_tfstpbarserdsc = AV51TFStpBarserDsc ;
      AV75Activarhdr_wcds_16_tfstpbarserdsc_sel = AV52TFStpBarserDsc_Sel ;
      AV76Activarhdr_wcds_17_tfstpcolor = AV53TFStpColor ;
      AV77Activarhdr_wcds_18_tfstpcolor_sel = AV54TFStpColor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV61Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV62Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV63Activarhdr_wcds_4_tfstp_dia ,
                                           AV65Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV64Activarhdr_wcds_5_tfstp_mot ,
                                           AV67Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV66Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           AV60Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV68Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV69Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV71Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV70Activarhdr_wcds_11_tfstpclinom ,
                                           AV73Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV72Activarhdr_wcds_13_tfstpbarser ,
                                           AV75Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV74Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV77Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV76Activarhdr_wcds_17_tfstpcolor ,
                                           AV17DiaInicial ,
                                           AV18DiaInicial_to ,
                                           Byte.valueOf(A10755Stp_Est) ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV60Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV60Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV60Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV60Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV60Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV60Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV60Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV70Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV70Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV72Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV72Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV74Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV74Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV76Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV76Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV64Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV64Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV66Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV66Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor P095Z3 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV60Activarhdr_wcds_1_filterfulltext, lV60Activarhdr_wcds_1_filterfulltext, lV60Activarhdr_wcds_1_filterfulltext, lV60Activarhdr_wcds_1_filterfulltext, lV60Activarhdr_wcds_1_filterfulltext, lV60Activarhdr_wcds_1_filterfulltext, lV60Activarhdr_wcds_1_filterfulltext, lV60Activarhdr_wcds_1_filterfulltext, lV60Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV68Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV68Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV69Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV69Activarhdr_wcds_10_tfstpclicod_to), AV71Activarhdr_wcds_12_tfstpclinom_sel, AV70Activarhdr_wcds_11_tfstpclinom, lV70Activarhdr_wcds_11_tfstpclinom, AV71Activarhdr_wcds_12_tfstpclinom_sel, AV71Activarhdr_wcds_12_tfstpclinom_sel, AV73Activarhdr_wcds_14_tfstpbarser_sel, AV72Activarhdr_wcds_13_tfstpbarser, lV72Activarhdr_wcds_13_tfstpbarser, AV73Activarhdr_wcds_14_tfstpbarser_sel, AV73Activarhdr_wcds_14_tfstpbarser_sel, AV75Activarhdr_wcds_16_tfstpbarserdsc_sel, AV74Activarhdr_wcds_15_tfstpbarserdsc, lV74Activarhdr_wcds_15_tfstpbarserdsc, AV75Activarhdr_wcds_16_tfstpbarserdsc_sel, AV75Activarhdr_wcds_16_tfstpbarserdsc_sel, AV77Activarhdr_wcds_18_tfstpcolor_sel, AV76Activarhdr_wcds_17_tfstpcolor, lV76Activarhdr_wcds_17_tfstpcolor, AV77Activarhdr_wcds_18_tfstpcolor_sel, AV77Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV61Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV62Activarhdr_wcds_3_tfstp_lin_to), AV63Activarhdr_wcds_4_tfstp_dia, lV64Activarhdr_wcds_5_tfstp_mot, AV65Activarhdr_wcds_6_tfstp_mot_sel, lV66Activarhdr_wcds_7_tfstphdr, AV67Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10755Stp_Est = P095Z3_A10755Stp_Est[0] ;
         A396EmprCod = P095Z3_A396EmprCod[0] ;
         A13723StpHdr = P095Z3_A13723StpHdr[0] ;
         A10752Stp_Mot = P095Z3_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P095Z3_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P095Z3_A10750Stp_Lin[0] ;
         A13728StpColor = P095Z3_A13728StpColor[0] ;
         n13728StpColor = P095Z3_n13728StpColor[0] ;
         A13725StpBarserD = P095Z3_A13725StpBarserD[0] ;
         n13725StpBarserD = P095Z3_n13725StpBarserD[0] ;
         A13724StpBarser = P095Z3_A13724StpBarser[0] ;
         n13724StpBarser = P095Z3_n13724StpBarser[0] ;
         A13727StpCliNom = P095Z3_A13727StpCliNom[0] ;
         n13727StpCliNom = P095Z3_n13727StpCliNom[0] ;
         A13726StpClicod = P095Z3_A13726StpClicod[0] ;
         n13726StpClicod = P095Z3_n13726StpClicod[0] ;
         A10746Stp_hdr = P095Z3_A10746Stp_hdr[0] ;
         A10747Stp_r = P095Z3_A10747Stp_r[0] ;
         A10748Stp_p = P095Z3_A10748Stp_p[0] ;
         A13723StpHdr = P095Z3_A13723StpHdr[0] ;
         A13728StpColor = P095Z3_A13728StpColor[0] ;
         n13728StpColor = P095Z3_n13728StpColor[0] ;
         A13725StpBarserD = P095Z3_A13725StpBarserD[0] ;
         n13725StpBarserD = P095Z3_n13725StpBarserD[0] ;
         A13724StpBarser = P095Z3_A13724StpBarser[0] ;
         n13724StpBarser = P095Z3_n13724StpBarser[0] ;
         A13726StpClicod = P095Z3_A13726StpClicod[0] ;
         n13726StpClicod = P095Z3_n13726StpClicod[0] ;
         A13727StpCliNom = P095Z3_A13727StpCliNom[0] ;
         n13727StpCliNom = P095Z3_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV17DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV17DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV18DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV18DiaInicial_to)) )) )
            {
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
               AV34VisibleColumnCount = 0 ;
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A10750Stp_Lin );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( A10751Stp_Dia );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10752Stp_Mot, GXv_char5) ;
                  activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13723StpHdr, GXv_char5) ;
                  activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A13726StpClicod );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13727StpCliNom, GXv_char5) ;
                  activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13724StpBarser, GXv_char5) ;
                  activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13725StpBarserD, GXv_char5) ;
                  activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13728StpColor, GXv_char5) ;
                  activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Stp_Lin", "", "#", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Stp_Dia", "", "Dia", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Stp_Mot", "", "Motivo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpHdr", "", "Hdr", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpClicod", "", "Cliente", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpCliNom", "", "Nombre", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpBarser", "", "Articulo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpBarserDsc", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpColor", "", "Color", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ActivarHdr_WCColumnsSelector", GXv_char5) ;
      activarhdr_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue("ActivarHdr_WCGridState"), "") == 0 )
      {
         AV24GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ActivarHdr_WCGridState"), null, null);
      }
      else
      {
         AV24GridState.fromxml(AV22Session.getValue("ActivarHdr_WCGridState"), null, null);
      }
      AV19OrderedBy = AV24GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV20OrderedDsc = AV24GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV78GXV2 = 1 ;
      while ( AV78GXV2 <= AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV25GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV2));
         if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_LIN") == 0 )
         {
            AV37TFStp_Lin = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFStp_Lin_To = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV39TFStp_Dia = localUtil.ctot( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV41TFStp_Mot = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV42TFStp_Mot_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV43TFStpHdr = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV44TFStpHdr_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV45TFStpClicod = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFStpClicod_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV47TFStpCliNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV48TFStpCliNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV49TFStpBarser = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV50TFStpBarser_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV51TFStpBarserDsc = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV52TFStpBarserDsc_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV53TFStpColor = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV54TFStpColor_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAINICIAL") == 0 )
         {
            AV17DiaInicial = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAINICIAL_TO") == 0 )
         {
            AV18DiaInicial_to = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV78GXV2 = (int)(AV78GXV2+1) ;
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
      this.aP0[0] = activarhdr_wcexport.this.AV11Filename;
      this.aP1[0] = activarhdr_wcexport.this.AV12ErrorMessage;
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
      AV39TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV42TFStp_Mot_Sel = "" ;
      AV41TFStp_Mot = "" ;
      AV44TFStpHdr_Sel = "" ;
      AV43TFStpHdr = "" ;
      AV48TFStpCliNom_Sel = "" ;
      AV47TFStpCliNom = "" ;
      AV50TFStpBarser_Sel = "" ;
      AV49TFStpBarser = "" ;
      AV52TFStpBarserDsc_Sel = "" ;
      AV51TFStpBarserDsc = "" ;
      AV54TFStpColor_Sel = "" ;
      AV53TFStpColor = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV22Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      AV60Activarhdr_wcds_1_filterfulltext = "" ;
      AV63Activarhdr_wcds_4_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV64Activarhdr_wcds_5_tfstp_mot = "" ;
      AV65Activarhdr_wcds_6_tfstp_mot_sel = "" ;
      AV66Activarhdr_wcds_7_tfstphdr = "" ;
      AV67Activarhdr_wcds_8_tfstphdr_sel = "" ;
      AV70Activarhdr_wcds_11_tfstpclinom = "" ;
      AV71Activarhdr_wcds_12_tfstpclinom_sel = "" ;
      AV72Activarhdr_wcds_13_tfstpbarser = "" ;
      AV73Activarhdr_wcds_14_tfstpbarser_sel = "" ;
      AV74Activarhdr_wcds_15_tfstpbarserdsc = "" ;
      AV75Activarhdr_wcds_16_tfstpbarserdsc_sel = "" ;
      AV76Activarhdr_wcds_17_tfstpcolor = "" ;
      AV77Activarhdr_wcds_18_tfstpcolor_sel = "" ;
      lV60Activarhdr_wcds_1_filterfulltext = "" ;
      lV70Activarhdr_wcds_11_tfstpclinom = "" ;
      lV72Activarhdr_wcds_13_tfstpbarser = "" ;
      lV74Activarhdr_wcds_15_tfstpbarserdsc = "" ;
      lV76Activarhdr_wcds_17_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV64Activarhdr_wcds_5_tfstp_mot = "" ;
      lV66Activarhdr_wcds_7_tfstphdr = "" ;
      A10748Stp_p = "" ;
      AV17DiaInicial = GXutil.nullDate() ;
      AV18DiaInicial_to = GXutil.nullDate() ;
      AV16Emprcod = "" ;
      A396EmprCod = "" ;
      P095Z3_A129BarCod = new int[1] ;
      P095Z3_A132BarCodReo = new byte[1] ;
      P095Z3_A130BarCodPar = new String[] {""} ;
      P095Z3_A10755Stp_Est = new byte[1] ;
      P095Z3_A396EmprCod = new String[] {""} ;
      P095Z3_A13723StpHdr = new String[] {""} ;
      P095Z3_A10752Stp_Mot = new String[] {""} ;
      P095Z3_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P095Z3_A10750Stp_Lin = new short[1] ;
      P095Z3_A13728StpColor = new String[] {""} ;
      P095Z3_n13728StpColor = new boolean[] {false} ;
      P095Z3_A13725StpBarserD = new String[] {""} ;
      P095Z3_n13725StpBarserD = new boolean[] {false} ;
      P095Z3_A13724StpBarser = new String[] {""} ;
      P095Z3_n13724StpBarser = new boolean[] {false} ;
      P095Z3_A13727StpCliNom = new String[] {""} ;
      P095Z3_n13727StpCliNom = new boolean[] {false} ;
      P095Z3_A13726StpClicod = new int[1] ;
      P095Z3_n13726StpClicod = new boolean[] {false} ;
      P095Z3_A10746Stp_hdr = new int[1] ;
      P095Z3_A10747Stp_r = new byte[1] ;
      P095Z3_A10748Stp_p = new String[] {""} ;
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV24GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.activarhdr_wcexport__default(),
         new Object[] {
             new Object[] {
            P095Z3_A129BarCod, P095Z3_A132BarCodReo, P095Z3_A130BarCodPar, P095Z3_A10755Stp_Est, P095Z3_A396EmprCod, P095Z3_A13723StpHdr, P095Z3_A10752Stp_Mot, P095Z3_A10751Stp_Dia, P095Z3_A10750Stp_Lin, P095Z3_A13728StpColor,
            P095Z3_n13728StpColor, P095Z3_A13725StpBarserD, P095Z3_n13725StpBarserD, P095Z3_A13724StpBarser, P095Z3_n13724StpBarser, P095Z3_A13727StpCliNom, P095Z3_n13727StpCliNom, P095Z3_A13726StpClicod, P095Z3_n13726StpClicod, P095Z3_A10746Stp_hdr,
            P095Z3_A10747Stp_r, P095Z3_A10748Stp_p
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private short AV37TFStp_Lin ;
   private short AV38TFStp_Lin_To ;
   private short GXv_int3[] ;
   private short A10750Stp_Lin ;
   private short AV61Activarhdr_wcds_2_tfstp_lin ;
   private short AV62Activarhdr_wcds_3_tfstp_lin_to ;
   private short AV19OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV45TFStpClicod ;
   private int AV46TFStpClicod_To ;
   private int AV58GXV1 ;
   private int A13726StpClicod ;
   private int AV68Activarhdr_wcds_9_tfstpclicod ;
   private int AV69Activarhdr_wcds_10_tfstpclicod_to ;
   private int A10746Stp_hdr ;
   private int AV78GXV2 ;
   private long AV34VisibleColumnCount ;
   private String AV44TFStpHdr_Sel ;
   private String AV43TFStpHdr ;
   private String AV48TFStpCliNom_Sel ;
   private String AV47TFStpCliNom ;
   private String AV50TFStpBarser_Sel ;
   private String AV49TFStpBarser ;
   private String AV52TFStpBarserDsc_Sel ;
   private String AV51TFStpBarserDsc ;
   private String AV54TFStpColor_Sel ;
   private String AV53TFStpColor ;
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String AV66Activarhdr_wcds_7_tfstphdr ;
   private String AV67Activarhdr_wcds_8_tfstphdr_sel ;
   private String AV70Activarhdr_wcds_11_tfstpclinom ;
   private String AV71Activarhdr_wcds_12_tfstpclinom_sel ;
   private String AV72Activarhdr_wcds_13_tfstpbarser ;
   private String AV73Activarhdr_wcds_14_tfstpbarser_sel ;
   private String AV74Activarhdr_wcds_15_tfstpbarserdsc ;
   private String AV75Activarhdr_wcds_16_tfstpbarserdsc_sel ;
   private String AV76Activarhdr_wcds_17_tfstpcolor ;
   private String AV77Activarhdr_wcds_18_tfstpcolor_sel ;
   private String lV70Activarhdr_wcds_11_tfstpclinom ;
   private String lV72Activarhdr_wcds_13_tfstpbarser ;
   private String lV74Activarhdr_wcds_15_tfstpbarserdsc ;
   private String lV76Activarhdr_wcds_17_tfstpcolor ;
   private String scmdbuf ;
   private String lV66Activarhdr_wcds_7_tfstphdr ;
   private String A10748Stp_p ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV39TFStp_Dia ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date AV63Activarhdr_wcds_4_tfstp_dia ;
   private java.util.Date AV17DiaInicial ;
   private java.util.Date AV18DiaInicial_to ;
   private boolean returnInSub ;
   private boolean AV20OrderedDsc ;
   private boolean n13728StpColor ;
   private boolean n13725StpBarserD ;
   private boolean n13724StpBarser ;
   private boolean n13727StpCliNom ;
   private boolean n13726StpClicod ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV21FilterFullText ;
   private String AV42TFStp_Mot_Sel ;
   private String AV41TFStp_Mot ;
   private String A10752Stp_Mot ;
   private String AV60Activarhdr_wcds_1_filterfulltext ;
   private String AV64Activarhdr_wcds_5_tfstp_mot ;
   private String AV65Activarhdr_wcds_6_tfstp_mot_sel ;
   private String lV60Activarhdr_wcds_1_filterfulltext ;
   private String lV64Activarhdr_wcds_5_tfstp_mot ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P095Z3_A129BarCod ;
   private byte[] P095Z3_A132BarCodReo ;
   private String[] P095Z3_A130BarCodPar ;
   private byte[] P095Z3_A10755Stp_Est ;
   private String[] P095Z3_A396EmprCod ;
   private String[] P095Z3_A13723StpHdr ;
   private String[] P095Z3_A10752Stp_Mot ;
   private java.util.Date[] P095Z3_A10751Stp_Dia ;
   private short[] P095Z3_A10750Stp_Lin ;
   private String[] P095Z3_A13728StpColor ;
   private boolean[] P095Z3_n13728StpColor ;
   private String[] P095Z3_A13725StpBarserD ;
   private boolean[] P095Z3_n13725StpBarserD ;
   private String[] P095Z3_A13724StpBarser ;
   private boolean[] P095Z3_n13724StpBarser ;
   private String[] P095Z3_A13727StpCliNom ;
   private boolean[] P095Z3_n13727StpCliNom ;
   private int[] P095Z3_A13726StpClicod ;
   private boolean[] P095Z3_n13726StpClicod ;
   private int[] P095Z3_A10746Stp_hdr ;
   private byte[] P095Z3_A10747Stp_r ;
   private String[] P095Z3_A10748Stp_p ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV24GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV25GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
}

final  class activarhdr_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV61Activarhdr_wcds_2_tfstp_lin ,
                                          short AV62Activarhdr_wcds_3_tfstp_lin_to ,
                                          java.util.Date AV63Activarhdr_wcds_4_tfstp_dia ,
                                          String AV65Activarhdr_wcds_6_tfstp_mot_sel ,
                                          String AV64Activarhdr_wcds_5_tfstp_mot ,
                                          String AV67Activarhdr_wcds_8_tfstphdr_sel ,
                                          String AV66Activarhdr_wcds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV60Activarhdr_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV68Activarhdr_wcds_9_tfstpclicod ,
                                          int AV69Activarhdr_wcds_10_tfstpclicod_to ,
                                          String AV71Activarhdr_wcds_12_tfstpclinom_sel ,
                                          String AV70Activarhdr_wcds_11_tfstpclinom ,
                                          String AV73Activarhdr_wcds_14_tfstpbarser_sel ,
                                          String AV72Activarhdr_wcds_13_tfstpbarser ,
                                          String AV75Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                          String AV74Activarhdr_wcds_15_tfstpbarserdsc ,
                                          String AV77Activarhdr_wcds_18_tfstpcolor_sel ,
                                          String AV76Activarhdr_wcds_17_tfstpcolor ,
                                          java.util.Date AV17DiaInicial ,
                                          java.util.Date AV18DiaInicial_to ,
                                          byte A10755Stp_Est ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Est, T1.EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV61Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV62Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV63Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV64Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV66Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV19OrderedBy == 1 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV19OrderedBy == 1 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
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
                  return conditional_P095Z3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
      }
   }

}

