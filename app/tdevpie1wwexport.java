package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdevpie1wwexport extends GXProcedure
{
   public tdevpie1wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie1wwexport.class ), "" );
   }

   public tdevpie1wwexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tdevpie1wwexport.this.aP1 = new String[] {""};
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
      tdevpie1wwexport.this.aP0 = aP0;
      tdevpie1wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TDevPie1WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71FilterFullText, GXv_char5) ;
      tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV52TFDevGenCod) && (0==AV53TFDevGenCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Devolucion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFDevGenCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFDevGenCod_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFDevGenFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV54TFDevGenFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV56TFAlbRecCod) && (0==AV57TFAlbRecCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV56TFAlbRecCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV57TFAlbRecCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFCliNom_Sel, GXv_char5) ;
         tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFCliNom, GXv_char5) ;
            tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV61TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cdg.Ref.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFAlbRef_Sel, GXv_char5) ;
         tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFAlbRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cdg.Ref.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFAlbRef, GXv_char5) ;
            tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFDevTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFDevTrnNom_Sel, GXv_char5) ;
         tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFDevTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFDevTrnNom, GXv_char5) ;
            tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFDevGenUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFDevGenUni_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFDevGenUni)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFDevGenUni_To)) );
      }
      if ( ! ( ( AV73TFAlbRUni_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV70i = 1 ;
         AV78GXV1 = 1 ;
         while ( AV78GXV1 <= AV73TFAlbRUni_Sels.size() )
         {
            AV67TFAlbRUni_Sel = (String)AV73TFAlbRUni_Sels.elementAt(-1+AV78GXV1) ;
            if ( AV70i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV67TFAlbRUni_Sel), httpContext.getMessage( "K", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "K", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV67TFAlbRUni_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "M", "") );
            }
            AV70i = (long)(AV70i+1) ;
            AV78GXV1 = (int)(AV78GXV1+1) ;
         }
      }
      if ( ! ( (0==AV68TFDevGenPie) && (0==AV69TFDevGenPie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV68TFDevGenPie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV69TFDevGenPie_To );
      }
      if ( ! ( (GXutil.strcmp("", AV75TFEmprTrn_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "EmprTrn", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFEmprTrn_Sel, GXv_char5) ;
         tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV74TFEmprTrn)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "EmprTrn", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tdevpie1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFEmprTrn, GXv_char5) ;
            tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV49VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV37Session.getValue("TDevPie1WWColumnsSelector"), "") != 0 )
      {
         AV44ColumnsSelectorXML = AV37Session.getValue("TDevPie1WWColumnsSelector") ;
         AV41ColumnsSelector.fromxml(AV44ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV79GXV2 = 1 ;
      while ( AV79GXV2 <= AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV43ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV79GXV2));
         if ( AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setColor( 11 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         AV79GXV2 = (int)(AV79GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV81Tdevpie1wwds_1_filterfulltext = AV71FilterFullText ;
      AV82Tdevpie1wwds_2_tfdevgencod = AV52TFDevGenCod ;
      AV83Tdevpie1wwds_3_tfdevgencod_to = AV53TFDevGenCod_To ;
      AV84Tdevpie1wwds_4_tfdevgenfec = AV54TFDevGenFec ;
      AV85Tdevpie1wwds_5_tfalbreccod = AV56TFAlbRecCod ;
      AV86Tdevpie1wwds_6_tfalbreccod_to = AV57TFAlbRecCod_To ;
      AV87Tdevpie1wwds_7_tfclinom = AV58TFCliNom ;
      AV88Tdevpie1wwds_8_tfclinom_sel = AV59TFCliNom_Sel ;
      AV89Tdevpie1wwds_9_tfalbref = AV60TFAlbRef ;
      AV90Tdevpie1wwds_10_tfalbref_sel = AV61TFAlbRef_Sel ;
      AV91Tdevpie1wwds_11_tfdevtrnnom = AV62TFDevTrnNom ;
      AV92Tdevpie1wwds_12_tfdevtrnnom_sel = AV63TFDevTrnNom_Sel ;
      AV93Tdevpie1wwds_13_tfdevgenuni = AV64TFDevGenUni ;
      AV94Tdevpie1wwds_14_tfdevgenuni_to = AV65TFDevGenUni_To ;
      AV95Tdevpie1wwds_15_tfalbruni_sels = AV73TFAlbRUni_Sels ;
      AV96Tdevpie1wwds_16_tfdevgenpie = AV68TFDevGenPie ;
      AV97Tdevpie1wwds_17_tfdevgenpie_to = AV69TFDevGenPie_To ;
      AV98Tdevpie1wwds_18_tfemprtrn = AV74TFEmprTrn ;
      AV99Tdevpie1wwds_19_tfemprtrn_sel = AV75TFEmprTrn_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV95Tdevpie1wwds_15_tfalbruni_sels ,
                                           Integer.valueOf(AV82Tdevpie1wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV83Tdevpie1wwds_3_tfdevgencod_to) ,
                                           AV84Tdevpie1wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV85Tdevpie1wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV86Tdevpie1wwds_6_tfalbreccod_to) ,
                                           AV88Tdevpie1wwds_8_tfclinom_sel ,
                                           AV87Tdevpie1wwds_7_tfclinom ,
                                           AV90Tdevpie1wwds_10_tfalbref_sel ,
                                           AV89Tdevpie1wwds_9_tfalbref ,
                                           AV92Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                           AV91Tdevpie1wwds_11_tfdevtrnnom ,
                                           AV93Tdevpie1wwds_13_tfdevgenuni ,
                                           AV94Tdevpie1wwds_14_tfdevgenuni_to ,
                                           Integer.valueOf(AV95Tdevpie1wwds_15_tfalbruni_sels.size()) ,
                                           Short.valueOf(AV96Tdevpie1wwds_16_tfdevgenpie) ,
                                           Short.valueOf(AV97Tdevpie1wwds_17_tfdevgenpie_to) ,
                                           AV99Tdevpie1wwds_19_tfemprtrn_sel ,
                                           AV98Tdevpie1wwds_18_tfemprtrn ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A329DevTrnNom ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           A410EmprTrn ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV81Tdevpie1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV87Tdevpie1wwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV87Tdevpie1wwds_7_tfclinom), 30, "%") ;
      lV89Tdevpie1wwds_9_tfalbref = GXutil.padr( GXutil.rtrim( AV89Tdevpie1wwds_9_tfalbref), 16, "%") ;
      lV91Tdevpie1wwds_11_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV91Tdevpie1wwds_11_tfdevtrnnom), 30, "%") ;
      lV98Tdevpie1wwds_18_tfemprtrn = GXutil.padr( GXutil.rtrim( AV98Tdevpie1wwds_18_tfemprtrn), 3, "%") ;
      /* Using cursor P086I2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV82Tdevpie1wwds_2_tfdevgencod), Integer.valueOf(AV83Tdevpie1wwds_3_tfdevgencod_to), AV84Tdevpie1wwds_4_tfdevgenfec, Integer.valueOf(AV85Tdevpie1wwds_5_tfalbreccod), Integer.valueOf(AV86Tdevpie1wwds_6_tfalbreccod_to), lV87Tdevpie1wwds_7_tfclinom, AV88Tdevpie1wwds_8_tfclinom_sel, lV89Tdevpie1wwds_9_tfalbref, AV90Tdevpie1wwds_10_tfalbref_sel, lV91Tdevpie1wwds_11_tfdevtrnnom, AV92Tdevpie1wwds_12_tfdevtrnnom_sel, AV93Tdevpie1wwds_13_tfdevgenuni, AV94Tdevpie1wwds_14_tfdevgenuni_to, Short.valueOf(AV96Tdevpie1wwds_16_tfdevgenpie), Short.valueOf(AV97Tdevpie1wwds_17_tfdevgenpie_to), lV98Tdevpie1wwds_18_tfemprtrn, AV99Tdevpie1wwds_19_tfemprtrn_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086I2_A396EmprCod[0] ;
         A252CliCod = P086I2_A252CliCod[0] ;
         n252CliCod = P086I2_n252CliCod[0] ;
         A327DevGenTrn = P086I2_A327DevGenTrn[0] ;
         n327DevGenTrn = P086I2_n327DevGenTrn[0] ;
         A410EmprTrn = P086I2_A410EmprTrn[0] ;
         n410EmprTrn = P086I2_n410EmprTrn[0] ;
         A326DevGenPie = P086I2_A326DevGenPie[0] ;
         n326DevGenPie = P086I2_n326DevGenPie[0] ;
         A328DevGenUni = P086I2_A328DevGenUni[0] ;
         n328DevGenUni = P086I2_n328DevGenUni[0] ;
         A329DevTrnNom = P086I2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086I2_n329DevTrnNom[0] ;
         A45AlbRef = P086I2_A45AlbRef[0] ;
         A279CliNom = P086I2_A279CliNom[0] ;
         A44AlbRecCod = P086I2_A44AlbRecCod[0] ;
         n44AlbRecCod = P086I2_n44AlbRecCod[0] ;
         A325DevGenFec = P086I2_A325DevGenFec[0] ;
         n325DevGenFec = P086I2_n325DevGenFec[0] ;
         A323DevGenCod = P086I2_A323DevGenCod[0] ;
         A56AlbRUni = P086I2_A56AlbRUni[0] ;
         A279CliNom = P086I2_A279CliNom[0] ;
         A329DevTrnNom = P086I2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086I2_n329DevTrnNom[0] ;
         A45AlbRef = P086I2_A45AlbRef[0] ;
         A56AlbRUni = P086I2_A56AlbRUni[0] ;
         if ( (GXutil.strcmp("", AV81Tdevpie1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV81Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV81Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV81Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV81Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV81Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV81Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV81Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A410EmprTrn) , GXutil.padr( "%" + GXutil.upper( AV81Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
            AV49VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A323DevGenCod );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A325DevGenFec );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A44AlbRecCod );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char5) ;
               tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A329DevTrnNom, GXv_char5) ;
               tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A328DevGenUni)) );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "K", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "K", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "M", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "M", "") );
               }
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A326DevGenPie );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A410EmprTrn, GXv_char5) ;
               tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
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
      AV41ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenCod", "", "N Devolucion", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenFec", "", "Fecha", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Cliente", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRef", "", "Cdg.Ref.", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevTrnNom", "", "Transportista", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenUni", "", "Unidades", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUni", "", "Unidad", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenPie", "", "Piezas", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "EmprTrn", "", "EmprTrn", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV45UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TDevPie1WWColumnsSelector", GXv_char5) ;
      tdevpie1wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV45UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV45UserCustomValue)==0) ) )
      {
         AV42ColumnsSelectorAux.fromxml(AV45UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV42ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV41ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV42ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV41ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("TDevPie1WWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDevPie1WWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TDevPie1WWGridState"), null, null);
      }
      AV16OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV3 = 1 ;
      while ( AV100GXV3 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV3));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV71FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV52TFDevGenCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFDevGenCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV54TFDevGenFec = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV56TFAlbRecCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFAlbRecCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV58TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV59TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV60TFAlbRef = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV61TFAlbRef_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV62TFDevTrnNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV63TFDevTrnNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV64TFDevGenUni = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFDevGenUni_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV72TFAlbRUni_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV73TFAlbRUni_Sels.fromJSonString(AV72TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV68TFDevGenPie = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFDevGenPie_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTRN") == 0 )
         {
            AV74TFEmprTrn = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTRN_SEL") == 0 )
         {
            AV75TFEmprTrn_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV100GXV3 = (int)(AV100GXV3+1) ;
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
      this.aP0[0] = tdevpie1wwexport.this.AV11Filename;
      this.aP1[0] = tdevpie1wwexport.this.AV12ErrorMessage;
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
      AV71FilterFullText = "" ;
      AV54TFDevGenFec = GXutil.nullDate() ;
      AV59TFCliNom_Sel = "" ;
      AV58TFCliNom = "" ;
      AV61TFAlbRef_Sel = "" ;
      AV60TFAlbRef = "" ;
      AV63TFDevTrnNom_Sel = "" ;
      AV62TFDevTrnNom = "" ;
      AV64TFDevGenUni = DecimalUtil.ZERO ;
      AV65TFDevGenUni_To = DecimalUtil.ZERO ;
      AV73TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV67TFAlbRUni_Sel = "" ;
      AV75TFEmprTrn_Sel = "" ;
      AV74TFEmprTrn = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV37Session = httpContext.getWebSession();
      AV44ColumnsSelectorXML = "" ;
      AV41ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV43ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A325DevGenFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A329DevTrnNom = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A410EmprTrn = "" ;
      AV81Tdevpie1wwds_1_filterfulltext = "" ;
      AV84Tdevpie1wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV87Tdevpie1wwds_7_tfclinom = "" ;
      AV88Tdevpie1wwds_8_tfclinom_sel = "" ;
      AV89Tdevpie1wwds_9_tfalbref = "" ;
      AV90Tdevpie1wwds_10_tfalbref_sel = "" ;
      AV91Tdevpie1wwds_11_tfdevtrnnom = "" ;
      AV92Tdevpie1wwds_12_tfdevtrnnom_sel = "" ;
      AV93Tdevpie1wwds_13_tfdevgenuni = DecimalUtil.ZERO ;
      AV94Tdevpie1wwds_14_tfdevgenuni_to = DecimalUtil.ZERO ;
      AV95Tdevpie1wwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV98Tdevpie1wwds_18_tfemprtrn = "" ;
      AV99Tdevpie1wwds_19_tfemprtrn_sel = "" ;
      lV81Tdevpie1wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV87Tdevpie1wwds_7_tfclinom = "" ;
      lV89Tdevpie1wwds_9_tfalbref = "" ;
      lV91Tdevpie1wwds_11_tfdevtrnnom = "" ;
      lV98Tdevpie1wwds_18_tfemprtrn = "" ;
      P086I2_A396EmprCod = new String[] {""} ;
      P086I2_A252CliCod = new int[1] ;
      P086I2_n252CliCod = new boolean[] {false} ;
      P086I2_A327DevGenTrn = new short[1] ;
      P086I2_n327DevGenTrn = new boolean[] {false} ;
      P086I2_A410EmprTrn = new String[] {""} ;
      P086I2_n410EmprTrn = new boolean[] {false} ;
      P086I2_A326DevGenPie = new short[1] ;
      P086I2_n326DevGenPie = new boolean[] {false} ;
      P086I2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086I2_n328DevGenUni = new boolean[] {false} ;
      P086I2_A329DevTrnNom = new String[] {""} ;
      P086I2_n329DevTrnNom = new boolean[] {false} ;
      P086I2_A45AlbRef = new String[] {""} ;
      P086I2_A279CliNom = new String[] {""} ;
      P086I2_A44AlbRecCod = new int[1] ;
      P086I2_n44AlbRecCod = new boolean[] {false} ;
      P086I2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086I2_n325DevGenFec = new boolean[] {false} ;
      P086I2_A323DevGenCod = new int[1] ;
      P086I2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV45UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV42ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72TFAlbRUni_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie1wwexport__default(),
         new Object[] {
             new Object[] {
            P086I2_A396EmprCod, P086I2_A252CliCod, P086I2_n252CliCod, P086I2_A327DevGenTrn, P086I2_n327DevGenTrn, P086I2_A410EmprTrn, P086I2_n410EmprTrn, P086I2_A326DevGenPie, P086I2_n326DevGenPie, P086I2_A328DevGenUni,
            P086I2_n328DevGenUni, P086I2_A329DevTrnNom, P086I2_n329DevTrnNom, P086I2_A45AlbRef, P086I2_A279CliNom, P086I2_A44AlbRecCod, P086I2_n44AlbRecCod, P086I2_A325DevGenFec, P086I2_n325DevGenFec, P086I2_A323DevGenCod,
            P086I2_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV68TFDevGenPie ;
   private short AV69TFDevGenPie_To ;
   private short GXv_int3[] ;
   private short A326DevGenPie ;
   private short AV96Tdevpie1wwds_16_tfdevgenpie ;
   private short AV97Tdevpie1wwds_17_tfdevgenpie_to ;
   private short AV16OrderedBy ;
   private short A327DevGenTrn ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV52TFDevGenCod ;
   private int AV53TFDevGenCod_To ;
   private int AV56TFAlbRecCod ;
   private int AV57TFAlbRecCod_To ;
   private int AV78GXV1 ;
   private int AV79GXV2 ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int AV82Tdevpie1wwds_2_tfdevgencod ;
   private int AV83Tdevpie1wwds_3_tfdevgencod_to ;
   private int AV85Tdevpie1wwds_5_tfalbreccod ;
   private int AV86Tdevpie1wwds_6_tfalbreccod_to ;
   private int AV95Tdevpie1wwds_15_tfalbruni_sels_size ;
   private int A252CliCod ;
   private int AV100GXV3 ;
   private long AV70i ;
   private long AV49VisibleColumnCount ;
   private java.math.BigDecimal AV64TFDevGenUni ;
   private java.math.BigDecimal AV65TFDevGenUni_To ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal AV93Tdevpie1wwds_13_tfdevgenuni ;
   private java.math.BigDecimal AV94Tdevpie1wwds_14_tfdevgenuni_to ;
   private String AV59TFCliNom_Sel ;
   private String AV58TFCliNom ;
   private String AV61TFAlbRef_Sel ;
   private String AV60TFAlbRef ;
   private String AV63TFDevTrnNom_Sel ;
   private String AV62TFDevTrnNom ;
   private String AV67TFAlbRUni_Sel ;
   private String AV75TFEmprTrn_Sel ;
   private String AV74TFEmprTrn ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A329DevTrnNom ;
   private String A56AlbRUni ;
   private String A410EmprTrn ;
   private String AV87Tdevpie1wwds_7_tfclinom ;
   private String AV88Tdevpie1wwds_8_tfclinom_sel ;
   private String AV89Tdevpie1wwds_9_tfalbref ;
   private String AV90Tdevpie1wwds_10_tfalbref_sel ;
   private String AV91Tdevpie1wwds_11_tfdevtrnnom ;
   private String AV92Tdevpie1wwds_12_tfdevtrnnom_sel ;
   private String AV98Tdevpie1wwds_18_tfemprtrn ;
   private String AV99Tdevpie1wwds_19_tfemprtrn_sel ;
   private String scmdbuf ;
   private String lV87Tdevpie1wwds_7_tfclinom ;
   private String lV89Tdevpie1wwds_9_tfalbref ;
   private String lV91Tdevpie1wwds_11_tfdevtrnnom ;
   private String lV98Tdevpie1wwds_18_tfemprtrn ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV54TFDevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date AV84Tdevpie1wwds_4_tfdevgenfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n327DevGenTrn ;
   private boolean n410EmprTrn ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n329DevTrnNom ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private String AV44ColumnsSelectorXML ;
   private String AV45UserCustomValue ;
   private String AV72TFAlbRUni_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV71FilterFullText ;
   private String AV81Tdevpie1wwds_1_filterfulltext ;
   private String lV81Tdevpie1wwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private GXSimpleCollection<String> AV73TFAlbRUni_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P086I2_A396EmprCod ;
   private int[] P086I2_A252CliCod ;
   private boolean[] P086I2_n252CliCod ;
   private short[] P086I2_A327DevGenTrn ;
   private boolean[] P086I2_n327DevGenTrn ;
   private String[] P086I2_A410EmprTrn ;
   private boolean[] P086I2_n410EmprTrn ;
   private short[] P086I2_A326DevGenPie ;
   private boolean[] P086I2_n326DevGenPie ;
   private java.math.BigDecimal[] P086I2_A328DevGenUni ;
   private boolean[] P086I2_n328DevGenUni ;
   private String[] P086I2_A329DevTrnNom ;
   private boolean[] P086I2_n329DevTrnNom ;
   private String[] P086I2_A45AlbRef ;
   private String[] P086I2_A279CliNom ;
   private int[] P086I2_A44AlbRecCod ;
   private boolean[] P086I2_n44AlbRecCod ;
   private java.util.Date[] P086I2_A325DevGenFec ;
   private boolean[] P086I2_n325DevGenFec ;
   private int[] P086I2_A323DevGenCod ;
   private String[] P086I2_A56AlbRUni ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV95Tdevpie1wwds_15_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV41ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV42ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV43ColumnsSelector_Column ;
}

final  class tdevpie1wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV95Tdevpie1wwds_15_tfalbruni_sels ,
                                          int AV82Tdevpie1wwds_2_tfdevgencod ,
                                          int AV83Tdevpie1wwds_3_tfdevgencod_to ,
                                          java.util.Date AV84Tdevpie1wwds_4_tfdevgenfec ,
                                          int AV85Tdevpie1wwds_5_tfalbreccod ,
                                          int AV86Tdevpie1wwds_6_tfalbreccod_to ,
                                          String AV88Tdevpie1wwds_8_tfclinom_sel ,
                                          String AV87Tdevpie1wwds_7_tfclinom ,
                                          String AV90Tdevpie1wwds_10_tfalbref_sel ,
                                          String AV89Tdevpie1wwds_9_tfalbref ,
                                          String AV92Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                          String AV91Tdevpie1wwds_11_tfdevtrnnom ,
                                          java.math.BigDecimal AV93Tdevpie1wwds_13_tfdevgenuni ,
                                          java.math.BigDecimal AV94Tdevpie1wwds_14_tfdevgenuni_to ,
                                          int AV95Tdevpie1wwds_15_tfalbruni_sels_size ,
                                          short AV96Tdevpie1wwds_16_tfdevgenpie ,
                                          short AV97Tdevpie1wwds_17_tfdevgenpie_to ,
                                          String AV99Tdevpie1wwds_19_tfemprtrn_sel ,
                                          String AV98Tdevpie1wwds_18_tfemprtrn ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String A410EmprTrn ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV81Tdevpie1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[17];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.DevGenTrn AS DevGenTrn, T1.EmprTrn, T1.DevGenPie, T1.DevGenUni, T3.TrnNom AS DevTrnNom, T4.AlbRef, T2.CliNom, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni FROM (((TXPDEVGEN T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TrnCod = T1.DevGenTrn) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod = T1.AlbRecCod)" ;
      if ( ! (0==AV82Tdevpie1wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV83Tdevpie1wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Tdevpie1wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (0==AV85Tdevpie1wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV86Tdevpie1wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tdevpie1wwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV87Tdevpie1wwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tdevpie1wwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tdevpie1wwds_10_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV89Tdevpie1wwds_9_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tdevpie1wwds_10_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tdevpie1wwds_12_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tdevpie1wwds_11_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tdevpie1wwds_12_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Tdevpie1wwds_13_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Tdevpie1wwds_14_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( AV95Tdevpie1wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV95Tdevpie1wwds_15_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV96Tdevpie1wwds_16_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV97Tdevpie1wwds_17_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tdevpie1wwds_19_tfemprtrn_sel)==0) && ( ! (GXutil.strcmp("", AV98Tdevpie1wwds_18_tfemprtrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTrn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tdevpie1wwds_19_tfemprtrn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTrn = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenFec" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRef" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRef DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenUni" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRUni" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenPie" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenPie DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprTrn" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprTrn DESC" ;
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
                  return conditional_P086I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 16);
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               return;
      }
   }

}

