package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwlisalcexport extends GXProcedure
{
   public webwlisalcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwlisalcexport.class ), "" );
   }

   public webwlisalcexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webwlisalcexport.this.aP1 = new String[] {""};
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
      webwlisalcexport.this.aP0 = aP0;
      webwlisalcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebWLISALCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( GXutil.strcmp(GXutil.trim( AV18AlbComPri), "1") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "GR", "") );
      }
      else if ( GXutil.strcmp(GXutil.trim( AV18AlbComPri), "0") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "GT", "") );
      }
      GXt_dtime2 = GXutil.resetTime( AV19AlbComFch );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_dtime2 = GXutil.resetTime( AV20AlbComFch_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime2 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( AV21CliCod );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( AV22CliCod_To );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49FilterFullText, GXv_char6) ;
      webwlisalcexport.this.GXt_char5 = GXv_char6[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      if ( ! ( (0==AV38TFAlbComCod) && (0==AV39TFAlbComCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "N Documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFAlbComCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFAlbComCod_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFAlbComFch)) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_dtime2 = GXutil.resetTime( AV40TFAlbComFch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime2 );
      }
      if ( ! ( (0==AV42TFCliCod) && (0==AV43TFCliCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFCliCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFCliNom_Sel, GXv_char6) ;
         webwlisalcexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFCliNom)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            webwlisalcexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFCliNom, GXv_char6) ;
            webwlisalcexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV35VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV23Session.getValue("WebWLISALCColumnsSelector"), "") != 0 )
      {
         AV30ColumnsSelectorXML = AV23Session.getValue("WebWLISALCColumnsSelector") ;
         AV27ColumnsSelector.fromxml(AV30ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV29ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV52GXV1));
         if ( AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setColor( 11 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV54Webwlisalcds_1_albcompri = AV18AlbComPri ;
      AV55Webwlisalcds_2_albcomfch = AV19AlbComFch ;
      AV56Webwlisalcds_3_albcomfch_to = AV20AlbComFch_To ;
      AV57Webwlisalcds_4_clicod = AV21CliCod ;
      AV58Webwlisalcds_5_clicod_to = AV22CliCod_To ;
      AV59Webwlisalcds_6_filterfulltext = AV49FilterFullText ;
      AV60Webwlisalcds_7_tfalbcomcod = AV38TFAlbComCod ;
      AV61Webwlisalcds_8_tfalbcomcod_to = AV39TFAlbComCod_To ;
      AV62Webwlisalcds_9_tfalbcomfch = AV40TFAlbComFch ;
      AV63Webwlisalcds_10_tfclicod = AV42TFCliCod ;
      AV64Webwlisalcds_11_tfclicod_to = AV43TFCliCod_To ;
      AV65Webwlisalcds_12_tfclinom = AV44TFCliNom ;
      AV66Webwlisalcds_13_tfclinom_sel = AV45TFCliNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Webwlisalcds_2_albcomfch ,
                                           AV56Webwlisalcds_3_albcomfch_to ,
                                           Integer.valueOf(AV57Webwlisalcds_4_clicod) ,
                                           Integer.valueOf(AV58Webwlisalcds_5_clicod_to) ,
                                           AV59Webwlisalcds_6_filterfulltext ,
                                           Integer.valueOf(AV60Webwlisalcds_7_tfalbcomcod) ,
                                           Integer.valueOf(AV61Webwlisalcds_8_tfalbcomcod_to) ,
                                           AV62Webwlisalcds_9_tfalbcomfch ,
                                           Integer.valueOf(AV63Webwlisalcds_10_tfclicod) ,
                                           Integer.valueOf(AV64Webwlisalcds_11_tfclicod_to) ,
                                           AV66Webwlisalcds_13_tfclinom_sel ,
                                           AV65Webwlisalcds_12_tfclinom ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A279CliNom ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A22AlbComPri ,
                                           AV54Webwlisalcds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Webwlisalcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Webwlisalcds_6_filterfulltext), "%", "") ;
      lV59Webwlisalcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Webwlisalcds_6_filterfulltext), "%", "") ;
      lV59Webwlisalcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Webwlisalcds_6_filterfulltext), "%", "") ;
      lV65Webwlisalcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV65Webwlisalcds_12_tfclinom), 30, "%") ;
      /* Using cursor P08GB2 */
      pr_default.execute(0, new Object[] {AV54Webwlisalcds_1_albcompri, AV55Webwlisalcds_2_albcomfch, AV56Webwlisalcds_3_albcomfch_to, Integer.valueOf(AV57Webwlisalcds_4_clicod), Integer.valueOf(AV58Webwlisalcds_5_clicod_to), lV59Webwlisalcds_6_filterfulltext, lV59Webwlisalcds_6_filterfulltext, lV59Webwlisalcds_6_filterfulltext, Integer.valueOf(AV60Webwlisalcds_7_tfalbcomcod), Integer.valueOf(AV61Webwlisalcds_8_tfalbcomcod_to), AV62Webwlisalcds_9_tfalbcomfch, Integer.valueOf(AV63Webwlisalcds_10_tfclicod), Integer.valueOf(AV64Webwlisalcds_11_tfclicod_to), lV65Webwlisalcds_12_tfclinom, AV66Webwlisalcds_13_tfclinom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08GB2_A396EmprCod[0] ;
         A279CliNom = P08GB2_A279CliNom[0] ;
         A14AlbComCod = P08GB2_A14AlbComCod[0] ;
         A252CliCod = P08GB2_A252CliCod[0] ;
         A17AlbComFch = P08GB2_A17AlbComFch[0] ;
         A22AlbComPri = P08GB2_A22AlbComPri[0] ;
         A279CliNom = P08GB2_A279CliNom[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV35VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( A14AlbComCod );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime2 = GXutil.resetTime( A17AlbComFch );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setDate( GXt_dtime2 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char6) ;
            webwlisalcexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      AV27ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComCod", "", "N Documento", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComFch", "", "Fecha", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char5 = AV31UserCustomValue ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWLISALCColumnsSelector", GXv_char6) ;
      webwlisalcexport.this.GXt_char5 = GXv_char6[0] ;
      AV31UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV31UserCustomValue)==0) ) )
      {
         AV28ColumnsSelectorAux.fromxml(AV31UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV27ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV28ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV27ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("WebWLISALCGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWLISALCGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("WebWLISALCGridState"), null, null);
      }
      AV16OrderedBy = AV25GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV25GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV67GXV2 = 1 ;
      while ( AV67GXV2 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV2));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV18AlbComPri = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV19AlbComFch = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV20AlbComFch_To = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLICOD") == 0 )
         {
            AV21CliCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22CliCod_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV38TFAlbComCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFAlbComCod_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV40TFAlbComFch = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFCliCod_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV44TFCliNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV45TFCliNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV67GXV2 = (int)(AV67GXV2+1) ;
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
      this.aP0[0] = webwlisalcexport.this.AV11Filename;
      this.aP1[0] = webwlisalcexport.this.AV12ErrorMessage;
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
      AV18AlbComPri = "" ;
      AV19AlbComFch = GXutil.nullDate() ;
      AV20AlbComFch_To = GXutil.nullDate() ;
      AV49FilterFullText = "" ;
      AV40TFAlbComFch = GXutil.nullDate() ;
      AV45TFCliNom_Sel = "" ;
      AV44TFCliNom = "" ;
      GXv_exceldoc3 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int4 = new short[1] ;
      AV23Session = httpContext.getWebSession();
      AV30ColumnsSelectorXML = "" ;
      AV27ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A17AlbComFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV54Webwlisalcds_1_albcompri = "" ;
      AV55Webwlisalcds_2_albcomfch = GXutil.nullDate() ;
      AV56Webwlisalcds_3_albcomfch_to = GXutil.nullDate() ;
      AV59Webwlisalcds_6_filterfulltext = "" ;
      AV62Webwlisalcds_9_tfalbcomfch = GXutil.nullDate() ;
      AV65Webwlisalcds_12_tfclinom = "" ;
      AV66Webwlisalcds_13_tfclinom_sel = "" ;
      scmdbuf = "" ;
      lV59Webwlisalcds_6_filterfulltext = "" ;
      lV65Webwlisalcds_12_tfclinom = "" ;
      A22AlbComPri = "" ;
      P08GB2_A396EmprCod = new String[] {""} ;
      P08GB2_A279CliNom = new String[] {""} ;
      P08GB2_A14AlbComCod = new int[1] ;
      P08GB2_A252CliCod = new int[1] ;
      P08GB2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08GB2_A22AlbComPri = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime2 = GXutil.resetTime( GXutil.nullDate() );
      AV31UserCustomValue = "" ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      AV28ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlisalcexport__default(),
         new Object[] {
             new Object[] {
            P08GB2_A396EmprCod, P08GB2_A279CliNom, P08GB2_A14AlbComCod, P08GB2_A252CliCod, P08GB2_A17AlbComFch, P08GB2_A22AlbComPri
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int4[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV21CliCod ;
   private int AV22CliCod_To ;
   private int AV38TFAlbComCod ;
   private int AV39TFAlbComCod_To ;
   private int AV42TFCliCod ;
   private int AV43TFCliCod_To ;
   private int AV52GXV1 ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV57Webwlisalcds_4_clicod ;
   private int AV58Webwlisalcds_5_clicod_to ;
   private int AV60Webwlisalcds_7_tfalbcomcod ;
   private int AV61Webwlisalcds_8_tfalbcomcod_to ;
   private int AV63Webwlisalcds_10_tfclicod ;
   private int AV64Webwlisalcds_11_tfclicod_to ;
   private int AV67GXV2 ;
   private long AV35VisibleColumnCount ;
   private String AV18AlbComPri ;
   private String AV45TFCliNom_Sel ;
   private String AV44TFCliNom ;
   private String A279CliNom ;
   private String AV54Webwlisalcds_1_albcompri ;
   private String AV65Webwlisalcds_12_tfclinom ;
   private String AV66Webwlisalcds_13_tfclinom_sel ;
   private String scmdbuf ;
   private String lV65Webwlisalcds_12_tfclinom ;
   private String A22AlbComPri ;
   private String A396EmprCod ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private java.util.Date GXt_dtime2 ;
   private java.util.Date AV19AlbComFch ;
   private java.util.Date AV20AlbComFch_To ;
   private java.util.Date AV40TFAlbComFch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV55Webwlisalcds_2_albcomfch ;
   private java.util.Date AV56Webwlisalcds_3_albcomfch_to ;
   private java.util.Date AV62Webwlisalcds_9_tfalbcomfch ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV30ColumnsSelectorXML ;
   private String AV31UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV49FilterFullText ;
   private String AV59Webwlisalcds_6_filterfulltext ;
   private String lV59Webwlisalcds_6_filterfulltext ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08GB2_A396EmprCod ;
   private String[] P08GB2_A279CliNom ;
   private int[] P08GB2_A14AlbComCod ;
   private int[] P08GB2_A252CliCod ;
   private java.util.Date[] P08GB2_A17AlbComFch ;
   private String[] P08GB2_A22AlbComPri ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc3[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV29ColumnsSelector_Column ;
}

final  class webwlisalcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV55Webwlisalcds_2_albcomfch ,
                                          java.util.Date AV56Webwlisalcds_3_albcomfch_to ,
                                          int AV57Webwlisalcds_4_clicod ,
                                          int AV58Webwlisalcds_5_clicod_to ,
                                          String AV59Webwlisalcds_6_filterfulltext ,
                                          int AV60Webwlisalcds_7_tfalbcomcod ,
                                          int AV61Webwlisalcds_8_tfalbcomcod_to ,
                                          java.util.Date AV62Webwlisalcds_9_tfalbcomfch ,
                                          int AV63Webwlisalcds_10_tfclicod ,
                                          int AV64Webwlisalcds_11_tfclicod_to ,
                                          String AV66Webwlisalcds_13_tfclinom_sel ,
                                          String AV65Webwlisalcds_12_tfclinom ,
                                          java.util.Date A17AlbComFch ,
                                          int A252CliCod ,
                                          int A14AlbComCod ,
                                          String A279CliNom ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A22AlbComPri ,
                                          String AV54Webwlisalcds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[15];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.AlbComCod, T1.CliCod, T1.AlbComFch, T1.AlbComPri FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Webwlisalcds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Webwlisalcds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Webwlisalcds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Webwlisalcds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Webwlisalcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV60Webwlisalcds_7_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Webwlisalcds_8_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Webwlisalcds_9_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV63Webwlisalcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Webwlisalcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Webwlisalcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Webwlisalcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Webwlisalcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
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
                  return conditional_P08GB2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               return;
      }
   }

}

