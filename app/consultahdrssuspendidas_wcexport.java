package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultahdrssuspendidas_wcexport extends GXProcedure
{
   public consultahdrssuspendidas_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultahdrssuspendidas_wcexport.class ), "" );
   }

   public consultahdrssuspendidas_wcexport( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultahdrssuspendidas_wcexport.this.aP1 = new String[] {""};
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
      consultahdrssuspendidas_wcexport.this.aP0 = aP0;
      consultahdrssuspendidas_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultaHdrsSuspendidas_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFStpHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFStpHdr_Sel, GXv_char5) ;
         consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFStpHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFStpHdr, GXv_char5) ;
            consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV36TFStpClicod) && (0==AV37TFStpClicod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFStpClicod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFStpClicod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFStpCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFStpCliNom_Sel, GXv_char5) ;
         consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFStpCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFStpCliNom, GXv_char5) ;
            consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFStpBarser_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFStpBarser_Sel, GXv_char5) ;
         consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFStpBarser)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFStpBarser, GXv_char5) ;
            consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFStpBarserDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFStpBarserDsc_Sel, GXv_char5) ;
         consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFStpBarserDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFStpBarserDsc, GXv_char5) ;
            consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFStpColor_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFStpColor_Sel, GXv_char5) ;
         consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFStpColor)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFStpColor, GXv_char5) ;
            consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV46TFStp_Dia) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dia Suspension", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV46TFStp_Dia );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFStp_Mot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Motivo Suspension", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFStp_Mot_Sel, GXv_char5) ;
         consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFStp_Mot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Motivo Suspension", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFStp_Mot, GXv_char5) ;
            consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV50TFStp_DiaA) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dia Activacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV50TFStp_DiaA );
      }
      if ( ! ( (GXutil.strcmp("", AV53TFStp_MotA_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Motivo Activacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFStp_MotA_Sel, GXv_char5) ;
         consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFStp_MotA)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Motivo Activacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultahdrssuspendidas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFStp_MotA, GXv_char5) ;
            consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaHdrsSuspendidas_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("ConsultaHdrsSuspendidas_WCColumnsSelector") ;
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
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = AV18FilterFullText ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = AV34TFStpHdr ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV35TFStpHdr_Sel ;
      AV68Consultahdrssuspendidas_wcds_4_tfstpclicod = AV36TFStpClicod ;
      AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV37TFStpClicod_To ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = AV38TFStpCliNom ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV39TFStpCliNom_Sel ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = AV40TFStpBarser ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV41TFStpBarser_Sel ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV42TFStpBarserDsc ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV43TFStpBarserDsc_Sel ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = AV44TFStpColor ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV45TFStpColor_Sel ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = AV46TFStp_Dia ;
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = AV48TFStp_Mot ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV49TFStp_Mot_Sel ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV50TFStp_DiaA ;
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = AV52TFStp_MotA ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV53TFStp_MotA_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV66Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV78Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV79Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV82Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV65Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV70Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV72Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV76Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV56DiaSuspension ,
                                           AV57DiaSuspension_to ,
                                           AV58DiaActivacion ,
                                           AV59DiaActivacion_to ,
                                           AV55Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV70Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV72Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV72Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV76Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV66Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV79Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV79Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV82Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV82Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P09623 */
      pr_default.execute(0, new Object[] {AV55Emprcod, AV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV70Consultahdrssuspendidas_wcds_6_tfstpclinom, lV70Consultahdrssuspendidas_wcds_6_tfstpclinom, AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV72Consultahdrssuspendidas_wcds_8_tfstpbarser, lV72Consultahdrssuspendidas_wcds_8_tfstpbarser, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV76Consultahdrssuspendidas_wcds_12_tfstpcolor, lV76Consultahdrssuspendidas_wcds_12_tfstpcolor, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV66Consultahdrssuspendidas_wcds_2_tfstphdr, AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV78Consultahdrssuspendidas_wcds_14_tfstp_dia, lV79Consultahdrssuspendidas_wcds_15_tfstp_mot, AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV82Consultahdrssuspendidas_wcds_18_tfstp_mota, AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09623_A396EmprCod[0] ;
         A10757Stp_MotA = P09623_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P09623_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P09623_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09623_A10751Stp_Dia[0] ;
         A13723StpHdr = P09623_A13723StpHdr[0] ;
         A13728StpColor = P09623_A13728StpColor[0] ;
         n13728StpColor = P09623_n13728StpColor[0] ;
         A13725StpBarserD = P09623_A13725StpBarserD[0] ;
         n13725StpBarserD = P09623_n13725StpBarserD[0] ;
         A13724StpBarser = P09623_A13724StpBarser[0] ;
         n13724StpBarser = P09623_n13724StpBarser[0] ;
         A13727StpCliNom = P09623_A13727StpCliNom[0] ;
         n13727StpCliNom = P09623_n13727StpCliNom[0] ;
         A13726StpClicod = P09623_A13726StpClicod[0] ;
         n13726StpClicod = P09623_n13726StpClicod[0] ;
         A10746Stp_hdr = P09623_A10746Stp_hdr[0] ;
         A10747Stp_r = P09623_A10747Stp_r[0] ;
         A10748Stp_p = P09623_A10748Stp_p[0] ;
         A10750Stp_Lin = P09623_A10750Stp_Lin[0] ;
         A13723StpHdr = P09623_A13723StpHdr[0] ;
         A13728StpColor = P09623_A13728StpColor[0] ;
         n13728StpColor = P09623_n13728StpColor[0] ;
         A13725StpBarserD = P09623_A13725StpBarserD[0] ;
         n13725StpBarserD = P09623_n13725StpBarserD[0] ;
         A13724StpBarser = P09623_A13724StpBarser[0] ;
         n13724StpBarser = P09623_n13724StpBarser[0] ;
         A13726StpClicod = P09623_A13726StpClicod[0] ;
         n13726StpClicod = P09623_n13726StpClicod[0] ;
         A13727StpCliNom = P09623_A13727StpCliNom[0] ;
         n13727StpCliNom = P09623_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV56DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV56DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV57DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV57DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV58DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV58DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV59DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV59DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59DiaActivacion_to)) )
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
                     AV31VisibleColumnCount = 0 ;
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13723StpHdr, GXv_char5) ;
                        consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13726StpClicod );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13727StpCliNom, GXv_char5) ;
                        consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13724StpBarser, GXv_char5) ;
                        consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13725StpBarserD, GXv_char5) ;
                        consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13728StpColor, GXv_char5) ;
                        consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A10751Stp_Dia );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10752Stp_Mot, GXv_char5) ;
                        consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                        AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A10756Stp_DiaA );
                        AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char4 = "" ;
                        GXv_char5[0] = GXt_char4 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10757Stp_MotA, GXv_char5) ;
                        consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
                        returnInSub = true;
                        if (true) return;
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
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpHdr", "", "Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpClicod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpCliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpBarser", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpBarserDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "StpColor", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Stp_Dia", "", "Dia Suspension", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Stp_Mot", "", "Motivo Suspension", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Stp_DiaA", "", "Dia Activacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Stp_MotA", "", "Motivo Activacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultaHdrsSuspendidas_WCColumnsSelector", GXv_char5) ;
      consultahdrssuspendidas_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaHdrsSuspendidas_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaHdrsSuspendidas_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ConsultaHdrsSuspendidas_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV84GXV2 = 1 ;
      while ( AV84GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV34TFStpHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV35TFStpHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV36TFStpClicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFStpClicod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV38TFStpCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV39TFStpCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV40TFStpBarser = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV41TFStpBarser_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV42TFStpBarserDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV43TFStpBarserDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV44TFStpColor = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV45TFStpColor_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV46TFStp_Dia = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV48TFStp_Mot = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV49TFStp_Mot_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIAA") == 0 )
         {
            AV50TFStp_DiaA = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA") == 0 )
         {
            AV52TFStp_MotA = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA_SEL") == 0 )
         {
            AV53TFStp_MotA_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIASUSPENSION") == 0 )
         {
            AV56DiaSuspension = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIASUSPENSION_TO") == 0 )
         {
            AV57DiaSuspension_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAACTIVACION") == 0 )
         {
            AV58DiaActivacion = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAACTIVACION_TO") == 0 )
         {
            AV59DiaActivacion_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV84GXV2 = (int)(AV84GXV2+1) ;
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
      this.aP0[0] = consultahdrssuspendidas_wcexport.this.AV11Filename;
      this.aP1[0] = consultahdrssuspendidas_wcexport.this.AV12ErrorMessage;
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
      AV35TFStpHdr_Sel = "" ;
      AV34TFStpHdr = "" ;
      AV39TFStpCliNom_Sel = "" ;
      AV38TFStpCliNom = "" ;
      AV41TFStpBarser_Sel = "" ;
      AV40TFStpBarser = "" ;
      AV43TFStpBarserDsc_Sel = "" ;
      AV42TFStpBarserDsc = "" ;
      AV45TFStpColor_Sel = "" ;
      AV44TFStpColor = "" ;
      AV46TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV49TFStp_Mot_Sel = "" ;
      AV48TFStp_Mot = "" ;
      AV50TFStp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      AV53TFStp_MotA_Sel = "" ;
      AV52TFStp_MotA = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = "" ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = "" ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = "" ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = "" ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = "" ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = "" ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = "" ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = "" ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = "" ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = "" ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = "" ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = "" ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = "" ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = GXutil.resetTime( GXutil.nullDate() );
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = "" ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = "" ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = "" ;
      lV70Consultahdrssuspendidas_wcds_6_tfstpclinom = "" ;
      lV72Consultahdrssuspendidas_wcds_8_tfstpbarser = "" ;
      lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = "" ;
      lV76Consultahdrssuspendidas_wcds_12_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV66Consultahdrssuspendidas_wcds_2_tfstphdr = "" ;
      lV79Consultahdrssuspendidas_wcds_15_tfstp_mot = "" ;
      lV82Consultahdrssuspendidas_wcds_18_tfstp_mota = "" ;
      A10748Stp_p = "" ;
      AV56DiaSuspension = GXutil.nullDate() ;
      AV57DiaSuspension_to = GXutil.nullDate() ;
      AV58DiaActivacion = GXutil.nullDate() ;
      AV59DiaActivacion_to = GXutil.nullDate() ;
      AV55Emprcod = "" ;
      A396EmprCod = "" ;
      P09623_A129BarCod = new int[1] ;
      P09623_A132BarCodReo = new byte[1] ;
      P09623_A130BarCodPar = new String[] {""} ;
      P09623_A396EmprCod = new String[] {""} ;
      P09623_A10757Stp_MotA = new String[] {""} ;
      P09623_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P09623_A10752Stp_Mot = new String[] {""} ;
      P09623_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09623_A13723StpHdr = new String[] {""} ;
      P09623_A13728StpColor = new String[] {""} ;
      P09623_n13728StpColor = new boolean[] {false} ;
      P09623_A13725StpBarserD = new String[] {""} ;
      P09623_n13725StpBarserD = new boolean[] {false} ;
      P09623_A13724StpBarser = new String[] {""} ;
      P09623_n13724StpBarser = new boolean[] {false} ;
      P09623_A13727StpCliNom = new String[] {""} ;
      P09623_n13727StpCliNom = new boolean[] {false} ;
      P09623_A13726StpClicod = new int[1] ;
      P09623_n13726StpClicod = new boolean[] {false} ;
      P09623_A10746Stp_hdr = new int[1] ;
      P09623_A10747Stp_r = new byte[1] ;
      P09623_A10748Stp_p = new String[] {""} ;
      P09623_A10750Stp_Lin = new short[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultahdrssuspendidas_wcexport__default(),
         new Object[] {
             new Object[] {
            P09623_A129BarCod, P09623_A132BarCodReo, P09623_A130BarCodPar, P09623_A396EmprCod, P09623_A10757Stp_MotA, P09623_A10756Stp_DiaA, P09623_A10752Stp_Mot, P09623_A10751Stp_Dia, P09623_A13723StpHdr, P09623_A13728StpColor,
            P09623_n13728StpColor, P09623_A13725StpBarserD, P09623_n13725StpBarserD, P09623_A13724StpBarser, P09623_n13724StpBarser, P09623_A13727StpCliNom, P09623_n13727StpCliNom, P09623_A13726StpClicod, P09623_n13726StpClicod, P09623_A10746Stp_hdr,
            P09623_A10747Stp_r, P09623_A10748Stp_p, P09623_A10750Stp_Lin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A10750Stp_Lin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV36TFStpClicod ;
   private int AV37TFStpClicod_To ;
   private int AV63GXV1 ;
   private int A13726StpClicod ;
   private int AV68Consultahdrssuspendidas_wcds_4_tfstpclicod ;
   private int AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to ;
   private int A10746Stp_hdr ;
   private int AV84GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV35TFStpHdr_Sel ;
   private String AV34TFStpHdr ;
   private String AV39TFStpCliNom_Sel ;
   private String AV38TFStpCliNom ;
   private String AV41TFStpBarser_Sel ;
   private String AV40TFStpBarser ;
   private String AV43TFStpBarserDsc_Sel ;
   private String AV42TFStpBarserDsc ;
   private String AV45TFStpColor_Sel ;
   private String AV44TFStpColor ;
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String AV66Consultahdrssuspendidas_wcds_2_tfstphdr ;
   private String AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel ;
   private String AV70Consultahdrssuspendidas_wcds_6_tfstpclinom ;
   private String AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ;
   private String AV72Consultahdrssuspendidas_wcds_8_tfstpbarser ;
   private String AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ;
   private String AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ;
   private String AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ;
   private String AV76Consultahdrssuspendidas_wcds_12_tfstpcolor ;
   private String AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ;
   private String lV70Consultahdrssuspendidas_wcds_6_tfstpclinom ;
   private String lV72Consultahdrssuspendidas_wcds_8_tfstpbarser ;
   private String lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ;
   private String lV76Consultahdrssuspendidas_wcds_12_tfstpcolor ;
   private String scmdbuf ;
   private String lV66Consultahdrssuspendidas_wcds_2_tfstphdr ;
   private String A10748Stp_p ;
   private String AV55Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV46TFStp_Dia ;
   private java.util.Date AV50TFStp_DiaA ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private java.util.Date AV78Consultahdrssuspendidas_wcds_14_tfstp_dia ;
   private java.util.Date AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa ;
   private java.util.Date AV56DiaSuspension ;
   private java.util.Date AV57DiaSuspension_to ;
   private java.util.Date AV58DiaActivacion ;
   private java.util.Date AV59DiaActivacion_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13728StpColor ;
   private boolean n13725StpBarserD ;
   private boolean n13724StpBarser ;
   private boolean n13727StpCliNom ;
   private boolean n13726StpClicod ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV49TFStp_Mot_Sel ;
   private String AV48TFStp_Mot ;
   private String AV53TFStp_MotA_Sel ;
   private String AV52TFStp_MotA ;
   private String A10752Stp_Mot ;
   private String A10757Stp_MotA ;
   private String AV65Consultahdrssuspendidas_wcds_1_filterfulltext ;
   private String AV79Consultahdrssuspendidas_wcds_15_tfstp_mot ;
   private String AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ;
   private String AV82Consultahdrssuspendidas_wcds_18_tfstp_mota ;
   private String AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ;
   private String lV65Consultahdrssuspendidas_wcds_1_filterfulltext ;
   private String lV79Consultahdrssuspendidas_wcds_15_tfstp_mot ;
   private String lV82Consultahdrssuspendidas_wcds_18_tfstp_mota ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09623_A129BarCod ;
   private byte[] P09623_A132BarCodReo ;
   private String[] P09623_A130BarCodPar ;
   private String[] P09623_A396EmprCod ;
   private String[] P09623_A10757Stp_MotA ;
   private java.util.Date[] P09623_A10756Stp_DiaA ;
   private String[] P09623_A10752Stp_Mot ;
   private java.util.Date[] P09623_A10751Stp_Dia ;
   private String[] P09623_A13723StpHdr ;
   private String[] P09623_A13728StpColor ;
   private boolean[] P09623_n13728StpColor ;
   private String[] P09623_A13725StpBarserD ;
   private boolean[] P09623_n13725StpBarserD ;
   private String[] P09623_A13724StpBarser ;
   private boolean[] P09623_n13724StpBarser ;
   private String[] P09623_A13727StpCliNom ;
   private boolean[] P09623_n13727StpCliNom ;
   private int[] P09623_A13726StpClicod ;
   private boolean[] P09623_n13726StpClicod ;
   private int[] P09623_A10746Stp_hdr ;
   private byte[] P09623_A10747Stp_r ;
   private String[] P09623_A10748Stp_p ;
   private short[] P09623_A10750Stp_Lin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class consultahdrssuspendidas_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09623( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                          String AV66Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                          java.util.Date AV78Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                          String AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                          String AV79Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                          java.util.Date AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                          String AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                          String AV82Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV65Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV68Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                          int AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                          String AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                          String AV70Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                          String AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                          String AV72Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                          String AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                          String AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                          String AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                          String AV76Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                          java.util.Date AV56DiaSuspension ,
                                          java.util.Date AV57DiaSuspension_to ,
                                          java.util.Date AV58DiaActivacion ,
                                          java.util.Date AV59DiaActivacion_to ,
                                          String AV55Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[42];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
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
      if ( (GXutil.strcmp("", AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV66Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV78Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV79Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV82Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_DiaA" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_DiaA DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_MotA" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_MotA DESC" ;
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
                  return conditional_P09623(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09623", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
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
               ((short[]) buf[22])[0] = rslt.getShort(18);
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
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
      }
   }

}

