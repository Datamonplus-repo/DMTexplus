package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdoctrnwwexport extends GXProcedure
{
   public tdoctrnwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdoctrnwwexport.class ), "" );
   }

   public tdoctrnwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tdoctrnwwexport.this.aP1 = new String[] {""};
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
      tdoctrnwwexport.this.aP0 = aP0;
      tdoctrnwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TDOCTRNWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( "" );
      if ( GXutil.strcmp(GXutil.trim( AV103AlbComPri), "1") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "GR", "") );
      }
      else if ( GXutil.strcmp(GXutil.trim( AV103AlbComPri), "0") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "GT", "") );
      }
      GXt_dtime2 = GXutil.resetTime( AV104AlbComFch );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_dtime2 = GXutil.resetTime( AV105AlbComFch_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV106FilterFullText, GXv_char6) ;
      tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      if ( ! ( (0==AV52TFAlbComCod) && (0==AV53TFAlbComCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "N Documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFAlbComCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFAlbComCod_To );
      }
      if ( ! ( ( AV97TFAlbComPri_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV95i = 1 ;
         AV111GXV1 = 1 ;
         while ( AV111GXV1 <= AV97TFAlbComPri_Sels.size() )
         {
            AV57TFAlbComPri_Sel = (String)AV97TFAlbComPri_Sels.elementAt(-1+AV111GXV1) ;
            if ( AV95i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV57TFAlbComPri_Sel), "1") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "GR", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV57TFAlbComPri_Sel), "0") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "GT", "") );
            }
            AV95i = (long)(AV95i+1) ;
            AV111GXV1 = (int)(AV111GXV1+1) ;
         }
      }
      if ( ! ( ( AV101TFAlbComEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV95i = 1 ;
         AV112GXV2 = 1 ;
         while ( AV112GXV2 <= AV101TFAlbComEst_Sels.size() )
         {
            AV102TFAlbComEst_Sel = ((Number) AV101TFAlbComEst_Sels.elementAt(-1+AV112GXV2)).byteValue() ;
            if ( AV95i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV102TFAlbComEst_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Generado", "") );
            }
            else if ( AV102TFAlbComEst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Impreso", "") );
            }
            else if ( AV102TFAlbComEst_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Facturado", "") );
            }
            AV95i = (long)(AV95i+1) ;
            AV112GXV2 = (int)(AV112GXV2+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFAlbComFch)) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_dtime2 = GXutil.resetTime( AV54TFAlbComFch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime2 );
      }
      if ( ! ( (0==AV60TFCliCod) && (0==AV61TFCliCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFCliCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV63TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFCliNom_Sel, GXv_char6) ;
         tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFCliNom)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFCliNom, GXv_char6) ;
            tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV88TFAlbComFd_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV88TFAlbComFd_Sel, GXv_char6) ;
         tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV87TFAlbComFd)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV87TFAlbComFd, GXv_char6) ;
            tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV99TFAlbComFdD_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash Ctrl", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99TFAlbComFdD_Sel, GXv_char6) ;
         tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV98TFAlbComFdD)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash Ctrl", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV98TFAlbComFdD, GXv_char6) ;
            tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (0==AV107TFfindDomEnv) && (0==AV108TFfindDomEnv_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio envio", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV107TFfindDomEnv );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tdoctrnwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV108TFfindDomEnv_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV49VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV37Session.getValue("TDOCTRNWWColumnsSelector"), "") != 0 )
      {
         AV44ColumnsSelectorXML = AV37Session.getValue("TDOCTRNWWColumnsSelector") ;
         AV41ColumnsSelector.fromxml(AV44ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV113GXV3 = 1 ;
      while ( AV113GXV3 <= AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV43ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV113GXV3));
         if ( AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setColor( 11 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         AV113GXV3 = (int)(AV113GXV3+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV115Tdoctrnwwds_1_albcompri = AV103AlbComPri ;
      AV116Tdoctrnwwds_2_albcomfch = AV104AlbComFch ;
      AV117Tdoctrnwwds_3_albcomfch_to = AV105AlbComFch_To ;
      AV118Tdoctrnwwds_4_filterfulltext = AV106FilterFullText ;
      AV119Tdoctrnwwds_5_tfalbcomcod = AV52TFAlbComCod ;
      AV120Tdoctrnwwds_6_tfalbcomcod_to = AV53TFAlbComCod_To ;
      AV121Tdoctrnwwds_7_tfalbcompri_sels = AV97TFAlbComPri_Sels ;
      AV122Tdoctrnwwds_8_tfalbcomest_sels = AV101TFAlbComEst_Sels ;
      AV123Tdoctrnwwds_9_tfalbcomfch = AV54TFAlbComFch ;
      AV124Tdoctrnwwds_10_tfclicod = AV60TFCliCod ;
      AV125Tdoctrnwwds_11_tfclicod_to = AV61TFCliCod_To ;
      AV126Tdoctrnwwds_12_tfclinom = AV62TFCliNom ;
      AV127Tdoctrnwwds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV128Tdoctrnwwds_14_tfalbcomfd = AV87TFAlbComFd ;
      AV129Tdoctrnwwds_15_tfalbcomfd_sel = AV88TFAlbComFd_Sel ;
      AV130Tdoctrnwwds_16_tfalbcomfdd = AV98TFAlbComFdD ;
      AV131Tdoctrnwwds_17_tfalbcomfdd_sel = AV99TFAlbComFdD_Sel ;
      AV132Tdoctrnwwds_18_tffinddomenv = AV107TFfindDomEnv ;
      AV133Tdoctrnwwds_19_tffinddomenv_to = AV108TFfindDomEnv_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV121Tdoctrnwwds_7_tfalbcompri_sels ,
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV122Tdoctrnwwds_8_tfalbcomest_sels ,
                                           AV116Tdoctrnwwds_2_albcomfch ,
                                           AV117Tdoctrnwwds_3_albcomfch_to ,
                                           Integer.valueOf(AV119Tdoctrnwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV120Tdoctrnwwds_6_tfalbcomcod_to) ,
                                           Integer.valueOf(AV121Tdoctrnwwds_7_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV122Tdoctrnwwds_8_tfalbcomest_sels.size()) ,
                                           AV123Tdoctrnwwds_9_tfalbcomfch ,
                                           Integer.valueOf(AV124Tdoctrnwwds_10_tfclicod) ,
                                           Integer.valueOf(AV125Tdoctrnwwds_11_tfclicod_to) ,
                                           AV127Tdoctrnwwds_13_tfclinom_sel ,
                                           AV126Tdoctrnwwds_12_tfclinom ,
                                           AV129Tdoctrnwwds_15_tfalbcomfd_sel ,
                                           AV128Tdoctrnwwds_14_tfalbcomfd ,
                                           AV131Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                           AV130Tdoctrnwwds_16_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV118Tdoctrnwwds_4_filterfulltext ,
                                           Byte.valueOf(A13739findDomEnv) ,
                                           Byte.valueOf(AV132Tdoctrnwwds_18_tffinddomenv) ,
                                           Byte.valueOf(AV133Tdoctrnwwds_19_tffinddomenv_to) ,
                                           AV115Tdoctrnwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING
                                           }
      });
      lV118Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV118Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV118Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV118Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV118Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV118Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV118Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV118Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV126Tdoctrnwwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV126Tdoctrnwwds_12_tfclinom), 30, "%") ;
      lV128Tdoctrnwwds_14_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV128Tdoctrnwwds_14_tfalbcomfd), 200, "%") ;
      lV130Tdoctrnwwds_16_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV130Tdoctrnwwds_16_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G12 */
      pr_default.execute(0, new Object[] {AV118Tdoctrnwwds_4_filterfulltext, lV118Tdoctrnwwds_4_filterfulltext, lV118Tdoctrnwwds_4_filterfulltext, lV118Tdoctrnwwds_4_filterfulltext, lV118Tdoctrnwwds_4_filterfulltext, lV118Tdoctrnwwds_4_filterfulltext, lV118Tdoctrnwwds_4_filterfulltext, lV118Tdoctrnwwds_4_filterfulltext, lV118Tdoctrnwwds_4_filterfulltext, Byte.valueOf(AV132Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV132Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV133Tdoctrnwwds_19_tffinddomenv_to), Byte.valueOf(AV133Tdoctrnwwds_19_tffinddomenv_to), AV115Tdoctrnwwds_1_albcompri, AV116Tdoctrnwwds_2_albcomfch, AV117Tdoctrnwwds_3_albcomfch_to, Integer.valueOf(AV119Tdoctrnwwds_5_tfalbcomcod), Integer.valueOf(AV120Tdoctrnwwds_6_tfalbcomcod_to), AV123Tdoctrnwwds_9_tfalbcomfch, Integer.valueOf(AV124Tdoctrnwwds_10_tfclicod), Integer.valueOf(AV125Tdoctrnwwds_11_tfclicod_to), lV126Tdoctrnwwds_12_tfclinom, AV127Tdoctrnwwds_13_tfclinom_sel, lV128Tdoctrnwwds_14_tfalbcomfd, AV129Tdoctrnwwds_15_tfalbcomfd_sel, lV130Tdoctrnwwds_16_tfalbcomfdd, AV131Tdoctrnwwds_17_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08G12_A396EmprCod[0] ;
         A5142AlcDomEnv = P08G12_A5142AlcDomEnv[0] ;
         A10015AlbComFdD = P08G12_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G12_A10014AlbComFd[0] ;
         A279CliNom = P08G12_A279CliNom[0] ;
         A252CliCod = P08G12_A252CliCod[0] ;
         A16AlbComEst = P08G12_A16AlbComEst[0] ;
         A14AlbComCod = P08G12_A14AlbComCod[0] ;
         A17AlbComFch = P08G12_A17AlbComFch[0] ;
         A22AlbComPri = P08G12_A22AlbComPri[0] ;
         A13739findDomEnv = P08G12_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G12_n13739findDomEnv[0] ;
         A279CliNom = P08G12_A279CliNom[0] ;
         A13739findDomEnv = P08G12_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G12_n13739findDomEnv[0] ;
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
         AV49VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A14AlbComCod );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( A22AlbComPri), "1") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "GR", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A22AlbComPri), "0") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "GT", "") );
            }
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( "" );
            if ( A16AlbComEst == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Generado", "") );
            }
            else if ( A16AlbComEst == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Impreso", "") );
            }
            else if ( A16AlbComEst == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Facturado", "") );
            }
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime2 = GXutil.resetTime( A17AlbComFch );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setDate( GXt_dtime2 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char6) ;
            tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10014AlbComFd, GXv_char6) ;
            tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10015AlbComFdD, GXv_char6) ;
            tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A13739findDomEnv );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
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
      AV41ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComCod", "", "N Documento", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComPri", "", "P", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComEst", "", "", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComFch", "", "Fecha", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComFd", "", "Hash", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComFdD", "", "Hash Ctrl", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "findDomEnv", "", "Domicilio envio", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char5 = AV45UserCustomValue ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TDOCTRNWWColumnsSelector", GXv_char6) ;
      tdoctrnwwexport.this.GXt_char5 = GXv_char6[0] ;
      AV45UserCustomValue = GXt_char5 ;
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
      if ( GXutil.strcmp(AV37Session.getValue("TDOCTRNWWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDOCTRNWWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TDOCTRNWWGridState"), null, null);
      }
      AV16OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV134GXV4 = 1 ;
      while ( AV134GXV4 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV134GXV4));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV103AlbComPri = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV104AlbComFch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV105AlbComFch_To = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV106FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV52TFAlbComCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFAlbComCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV96TFAlbComPri_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV97TFAlbComPri_Sels.fromJSonString(AV96TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEST_SEL") == 0 )
         {
            AV100TFAlbComEst_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV101TFAlbComEst_Sels.fromJSonString(AV100TFAlbComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV54TFAlbComFch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV60TFCliCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFCliCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV62TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV63TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD") == 0 )
         {
            AV87TFAlbComFd = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD_SEL") == 0 )
         {
            AV88TFAlbComFd_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV98TFAlbComFdD = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV99TFAlbComFdD_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFINDDOMENV") == 0 )
         {
            AV107TFfindDomEnv = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV108TFfindDomEnv_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV134GXV4 = (int)(AV134GXV4+1) ;
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
      this.aP0[0] = tdoctrnwwexport.this.AV11Filename;
      this.aP1[0] = tdoctrnwwexport.this.AV12ErrorMessage;
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
      AV103AlbComPri = "" ;
      AV104AlbComFch = GXutil.nullDate() ;
      AV105AlbComFch_To = GXutil.nullDate() ;
      AV106FilterFullText = "" ;
      AV97TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV57TFAlbComPri_Sel = "" ;
      AV101TFAlbComEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV54TFAlbComFch = GXutil.nullDate() ;
      AV63TFCliNom_Sel = "" ;
      AV62TFCliNom = "" ;
      AV88TFAlbComFd_Sel = "" ;
      AV87TFAlbComFd = "" ;
      AV99TFAlbComFdD_Sel = "" ;
      AV98TFAlbComFdD = "" ;
      GXv_exceldoc3 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int4 = new short[1] ;
      AV37Session = httpContext.getWebSession();
      AV44ColumnsSelectorXML = "" ;
      AV41ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV43ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      AV115Tdoctrnwwds_1_albcompri = "" ;
      AV116Tdoctrnwwds_2_albcomfch = GXutil.nullDate() ;
      AV117Tdoctrnwwds_3_albcomfch_to = GXutil.nullDate() ;
      AV118Tdoctrnwwds_4_filterfulltext = "" ;
      AV121Tdoctrnwwds_7_tfalbcompri_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV122Tdoctrnwwds_8_tfalbcomest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV123Tdoctrnwwds_9_tfalbcomfch = GXutil.nullDate() ;
      AV126Tdoctrnwwds_12_tfclinom = "" ;
      AV127Tdoctrnwwds_13_tfclinom_sel = "" ;
      AV128Tdoctrnwwds_14_tfalbcomfd = "" ;
      AV129Tdoctrnwwds_15_tfalbcomfd_sel = "" ;
      AV130Tdoctrnwwds_16_tfalbcomfdd = "" ;
      AV131Tdoctrnwwds_17_tfalbcomfdd_sel = "" ;
      lV118Tdoctrnwwds_4_filterfulltext = "" ;
      scmdbuf = "" ;
      lV126Tdoctrnwwds_12_tfclinom = "" ;
      lV128Tdoctrnwwds_14_tfalbcomfd = "" ;
      lV130Tdoctrnwwds_16_tfalbcomfdd = "" ;
      P08G12_A266CliEnvLin = new byte[1] ;
      P08G12_A396EmprCod = new String[] {""} ;
      P08G12_A5142AlcDomEnv = new byte[1] ;
      P08G12_A10015AlbComFdD = new String[] {""} ;
      P08G12_A10014AlbComFd = new String[] {""} ;
      P08G12_A279CliNom = new String[] {""} ;
      P08G12_A252CliCod = new int[1] ;
      P08G12_A16AlbComEst = new byte[1] ;
      P08G12_A14AlbComCod = new int[1] ;
      P08G12_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G12_A22AlbComPri = new String[] {""} ;
      P08G12_A13739findDomEnv = new byte[1] ;
      P08G12_n13739findDomEnv = new boolean[] {false} ;
      A396EmprCod = "" ;
      GXt_dtime2 = GXutil.resetTime( GXutil.nullDate() );
      AV45UserCustomValue = "" ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      AV42ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV96TFAlbComPri_SelsJson = "" ;
      AV100TFAlbComEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdoctrnwwexport__default(),
         new Object[] {
             new Object[] {
            P08G12_A266CliEnvLin, P08G12_A396EmprCod, P08G12_A5142AlcDomEnv, P08G12_A10015AlbComFdD, P08G12_A10014AlbComFd, P08G12_A279CliNom, P08G12_A252CliCod, P08G12_A16AlbComEst, P08G12_A14AlbComCod, P08G12_A17AlbComFch,
            P08G12_A22AlbComPri, P08G12_A13739findDomEnv, P08G12_n13739findDomEnv
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV102TFAlbComEst_Sel ;
   private byte AV107TFfindDomEnv ;
   private byte AV108TFfindDomEnv_To ;
   private byte A16AlbComEst ;
   private byte A13739findDomEnv ;
   private byte AV132Tdoctrnwwds_18_tffinddomenv ;
   private byte AV133Tdoctrnwwds_19_tffinddomenv_to ;
   private byte A5142AlcDomEnv ;
   private short GXv_int4[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV52TFAlbComCod ;
   private int AV53TFAlbComCod_To ;
   private int AV111GXV1 ;
   private int AV112GXV2 ;
   private int AV60TFCliCod ;
   private int AV61TFCliCod_To ;
   private int AV113GXV3 ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV119Tdoctrnwwds_5_tfalbcomcod ;
   private int AV120Tdoctrnwwds_6_tfalbcomcod_to ;
   private int AV124Tdoctrnwwds_10_tfclicod ;
   private int AV125Tdoctrnwwds_11_tfclicod_to ;
   private int AV121Tdoctrnwwds_7_tfalbcompri_sels_size ;
   private int AV122Tdoctrnwwds_8_tfalbcomest_sels_size ;
   private int AV134GXV4 ;
   private long AV95i ;
   private long AV49VisibleColumnCount ;
   private String AV103AlbComPri ;
   private String AV57TFAlbComPri_Sel ;
   private String AV63TFCliNom_Sel ;
   private String AV62TFCliNom ;
   private String AV88TFAlbComFd_Sel ;
   private String AV87TFAlbComFd ;
   private String AV99TFAlbComFdD_Sel ;
   private String AV98TFAlbComFdD ;
   private String A22AlbComPri ;
   private String A279CliNom ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String AV115Tdoctrnwwds_1_albcompri ;
   private String AV126Tdoctrnwwds_12_tfclinom ;
   private String AV127Tdoctrnwwds_13_tfclinom_sel ;
   private String AV128Tdoctrnwwds_14_tfalbcomfd ;
   private String AV129Tdoctrnwwds_15_tfalbcomfd_sel ;
   private String AV130Tdoctrnwwds_16_tfalbcomfdd ;
   private String AV131Tdoctrnwwds_17_tfalbcomfdd_sel ;
   private String scmdbuf ;
   private String lV126Tdoctrnwwds_12_tfclinom ;
   private String lV128Tdoctrnwwds_14_tfalbcomfd ;
   private String lV130Tdoctrnwwds_16_tfalbcomfdd ;
   private String A396EmprCod ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private java.util.Date GXt_dtime2 ;
   private java.util.Date AV104AlbComFch ;
   private java.util.Date AV105AlbComFch_To ;
   private java.util.Date AV54TFAlbComFch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV116Tdoctrnwwds_2_albcomfch ;
   private java.util.Date AV117Tdoctrnwwds_3_albcomfch_to ;
   private java.util.Date AV123Tdoctrnwwds_9_tfalbcomfch ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13739findDomEnv ;
   private String AV44ColumnsSelectorXML ;
   private String AV45UserCustomValue ;
   private String AV96TFAlbComPri_SelsJson ;
   private String AV100TFAlbComEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV106FilterFullText ;
   private String AV118Tdoctrnwwds_4_filterfulltext ;
   private String lV118Tdoctrnwwds_4_filterfulltext ;
   private GXSimpleCollection<Byte> AV101TFAlbComEst_Sels ;
   private GXSimpleCollection<Byte> AV122Tdoctrnwwds_8_tfalbcomest_sels ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private GXSimpleCollection<String> AV97TFAlbComPri_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08G12_A266CliEnvLin ;
   private String[] P08G12_A396EmprCod ;
   private byte[] P08G12_A5142AlcDomEnv ;
   private String[] P08G12_A10015AlbComFdD ;
   private String[] P08G12_A10014AlbComFd ;
   private String[] P08G12_A279CliNom ;
   private int[] P08G12_A252CliCod ;
   private byte[] P08G12_A16AlbComEst ;
   private int[] P08G12_A14AlbComCod ;
   private java.util.Date[] P08G12_A17AlbComFch ;
   private String[] P08G12_A22AlbComPri ;
   private byte[] P08G12_A13739findDomEnv ;
   private boolean[] P08G12_n13739findDomEnv ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc3[] ;
   private GXSimpleCollection<String> AV121Tdoctrnwwds_7_tfalbcompri_sels ;
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

final  class tdoctrnwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08G12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV121Tdoctrnwwds_7_tfalbcompri_sels ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV122Tdoctrnwwds_8_tfalbcomest_sels ,
                                          java.util.Date AV116Tdoctrnwwds_2_albcomfch ,
                                          java.util.Date AV117Tdoctrnwwds_3_albcomfch_to ,
                                          int AV119Tdoctrnwwds_5_tfalbcomcod ,
                                          int AV120Tdoctrnwwds_6_tfalbcomcod_to ,
                                          int AV121Tdoctrnwwds_7_tfalbcompri_sels_size ,
                                          int AV122Tdoctrnwwds_8_tfalbcomest_sels_size ,
                                          java.util.Date AV123Tdoctrnwwds_9_tfalbcomfch ,
                                          int AV124Tdoctrnwwds_10_tfclicod ,
                                          int AV125Tdoctrnwwds_11_tfclicod_to ,
                                          String AV127Tdoctrnwwds_13_tfclinom_sel ,
                                          String AV126Tdoctrnwwds_12_tfclinom ,
                                          String AV129Tdoctrnwwds_15_tfalbcomfd_sel ,
                                          String AV128Tdoctrnwwds_14_tfalbcomfd ,
                                          String AV131Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                          String AV130Tdoctrnwwds_16_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV118Tdoctrnwwds_4_filterfulltext ,
                                          byte A13739findDomEnv ,
                                          byte AV132Tdoctrnwwds_18_tffinddomenv ,
                                          byte AV133Tdoctrnwwds_19_tffinddomenv_to ,
                                          String AV115Tdoctrnwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[27];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T3.CliEnvLin, T1.EmprCod, T1.AlcDomEnv, T1.AlbComFdD, T1.AlbComFd, T2.CliNom, T1.CliCod, T1.AlbComEst, T1.AlbComCod, T1.AlbComFch, T1.AlbComPri, COALESCE(" ;
      scmdbuf += " T3.CliEnvLin, 0) AS findDomEnv FROM ((TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCLIENV T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.CliEnvLin = T1.AlcDomEnv)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliEnvLin, 0),'90'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) <= ?))");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Tdoctrnwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Tdoctrnwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV119Tdoctrnwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV120Tdoctrnwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( AV121Tdoctrnwwds_7_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Tdoctrnwwds_7_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( AV122Tdoctrnwwds_8_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV122Tdoctrnwwds_8_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Tdoctrnwwds_9_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV124Tdoctrnwwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV125Tdoctrnwwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tdoctrnwwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV126Tdoctrnwwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tdoctrnwwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tdoctrnwwds_15_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV128Tdoctrnwwds_14_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tdoctrnwwds_15_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tdoctrnwwds_17_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV130Tdoctrnwwds_16_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tdoctrnwwds_17_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComPri" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComPri DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComEst" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFd" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFd DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD DESC" ;
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
                  return conditional_P08G12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08G12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 200);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 200);
               }
               return;
      }
   }

}

