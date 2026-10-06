package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class talbcomwwexport extends GXProcedure
{
   public talbcomwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbcomwwexport.class ), "" );
   }

   public talbcomwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      talbcomwwexport.this.aP1 = new String[] {""};
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
      talbcomwwexport.this.aP0 = aP0;
      talbcomwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TALBCOMWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( GXutil.strcmp(GXutil.trim( AV100AlbComPri), "1") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "GR", "") );
      }
      else if ( GXutil.strcmp(GXutil.trim( AV100AlbComPri), "0") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "GT", "") );
      }
      GXt_dtime2 = GXutil.resetTime( AV101AlbComFch );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_dtime2 = GXutil.resetTime( AV102AlbComFch_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV103FilterFullText, GXv_char6) ;
      talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      if ( ! ( (0==AV52TFAlbComCod) && (0==AV53TFAlbComCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFAlbComCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFAlbComCod_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFAlbComFch)) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_dtime2 = GXutil.resetTime( AV54TFAlbComFch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime2 );
      }
      if ( ! ( ( AV99TFAlbComPri_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV94i = 1 ;
         AV106GXV1 = 1 ;
         while ( AV106GXV1 <= AV99TFAlbComPri_Sels.size() )
         {
            AV57TFAlbComPri_Sel = (String)AV99TFAlbComPri_Sels.elementAt(-1+AV106GXV1) ;
            if ( AV94i == 1 )
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
            AV94i = (long)(AV94i+1) ;
            AV106GXV1 = (int)(AV106GXV1+1) ;
         }
      }
      if ( ! ( (0==AV58TFCliCod) && (0==AV59TFCliCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV58TFCliCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV59TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV61TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFCliNom_Sel, GXv_char6) ;
         talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFCliNom)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFCliNom, GXv_char6) ;
            talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV91TFAlbComFd_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFAlbComFd_Sel, GXv_char6) ;
         talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV90TFAlbComFd)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFAlbComFd, GXv_char6) ;
            talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV93TFAlbComFdD_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash Ctrl", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93TFAlbComFdD_Sel, GXv_char6) ;
         talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV92TFAlbComFdD)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash Ctrl", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            talbcomwwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFAlbComFdD, GXv_char6) ;
            talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV49VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV37Session.getValue("TALBCOMWWColumnsSelector"), "") != 0 )
      {
         AV44ColumnsSelectorXML = AV37Session.getValue("TALBCOMWWColumnsSelector") ;
         AV41ColumnsSelector.fromxml(AV44ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV107GXV2 = 1 ;
      while ( AV107GXV2 <= AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV43ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV107GXV2));
         if ( AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setColor( 11 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         AV107GXV2 = (int)(AV107GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV109Talbcomwwds_1_albcompri = AV100AlbComPri ;
      AV110Talbcomwwds_2_albcomfch = AV101AlbComFch ;
      AV111Talbcomwwds_3_albcomfch_to = AV102AlbComFch_To ;
      AV112Talbcomwwds_4_filterfulltext = AV103FilterFullText ;
      AV113Talbcomwwds_5_tfalbcomcod = AV52TFAlbComCod ;
      AV114Talbcomwwds_6_tfalbcomcod_to = AV53TFAlbComCod_To ;
      AV115Talbcomwwds_7_tfalbcomfch = AV54TFAlbComFch ;
      AV116Talbcomwwds_8_tfalbcompri_sels = AV99TFAlbComPri_Sels ;
      AV117Talbcomwwds_9_tfclicod = AV58TFCliCod ;
      AV118Talbcomwwds_10_tfclicod_to = AV59TFCliCod_To ;
      AV119Talbcomwwds_11_tfclinom = AV60TFCliNom ;
      AV120Talbcomwwds_12_tfclinom_sel = AV61TFCliNom_Sel ;
      AV121Talbcomwwds_13_tfalbcomfd = AV90TFAlbComFd ;
      AV122Talbcomwwds_14_tfalbcomfd_sel = AV91TFAlbComFd_Sel ;
      AV123Talbcomwwds_15_tfalbcomfdd = AV92TFAlbComFdD ;
      AV124Talbcomwwds_16_tfalbcomfdd_sel = AV93TFAlbComFdD_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV116Talbcomwwds_8_tfalbcompri_sels ,
                                           AV110Talbcomwwds_2_albcomfch ,
                                           AV111Talbcomwwds_3_albcomfch_to ,
                                           AV112Talbcomwwds_4_filterfulltext ,
                                           Integer.valueOf(AV113Talbcomwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV114Talbcomwwds_6_tfalbcomcod_to) ,
                                           AV115Talbcomwwds_7_tfalbcomfch ,
                                           Integer.valueOf(AV116Talbcomwwds_8_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV117Talbcomwwds_9_tfclicod) ,
                                           Integer.valueOf(AV118Talbcomwwds_10_tfclicod_to) ,
                                           AV120Talbcomwwds_12_tfclinom_sel ,
                                           AV119Talbcomwwds_11_tfclinom ,
                                           AV122Talbcomwwds_14_tfalbcomfd_sel ,
                                           AV121Talbcomwwds_13_tfalbcomfd ,
                                           AV124Talbcomwwds_16_tfalbcomfdd_sel ,
                                           AV123Talbcomwwds_15_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV109Talbcomwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV112Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Talbcomwwds_4_filterfulltext), "%", "") ;
      lV112Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Talbcomwwds_4_filterfulltext), "%", "") ;
      lV112Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Talbcomwwds_4_filterfulltext), "%", "") ;
      lV112Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Talbcomwwds_4_filterfulltext), "%", "") ;
      lV112Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Talbcomwwds_4_filterfulltext), "%", "") ;
      lV112Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV112Talbcomwwds_4_filterfulltext), "%", "") ;
      lV119Talbcomwwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV119Talbcomwwds_11_tfclinom), 30, "%") ;
      lV121Talbcomwwds_13_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV121Talbcomwwds_13_tfalbcomfd), 200, "%") ;
      lV123Talbcomwwds_15_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV123Talbcomwwds_15_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G52 */
      pr_default.execute(0, new Object[] {AV109Talbcomwwds_1_albcompri, AV110Talbcomwwds_2_albcomfch, AV111Talbcomwwds_3_albcomfch_to, lV112Talbcomwwds_4_filterfulltext, lV112Talbcomwwds_4_filterfulltext, lV112Talbcomwwds_4_filterfulltext, lV112Talbcomwwds_4_filterfulltext, lV112Talbcomwwds_4_filterfulltext, lV112Talbcomwwds_4_filterfulltext, Integer.valueOf(AV113Talbcomwwds_5_tfalbcomcod), Integer.valueOf(AV114Talbcomwwds_6_tfalbcomcod_to), AV115Talbcomwwds_7_tfalbcomfch, Integer.valueOf(AV117Talbcomwwds_9_tfclicod), Integer.valueOf(AV118Talbcomwwds_10_tfclicod_to), lV119Talbcomwwds_11_tfclinom, AV120Talbcomwwds_12_tfclinom_sel, lV121Talbcomwwds_13_tfalbcomfd, AV122Talbcomwwds_14_tfalbcomfd_sel, lV123Talbcomwwds_15_tfalbcomfdd, AV124Talbcomwwds_16_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08G52_A396EmprCod[0] ;
         A10015AlbComFdD = P08G52_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G52_A10014AlbComFd[0] ;
         A279CliNom = P08G52_A279CliNom[0] ;
         A252CliCod = P08G52_A252CliCod[0] ;
         A14AlbComCod = P08G52_A14AlbComCod[0] ;
         A17AlbComFch = P08G52_A17AlbComFch[0] ;
         A22AlbComPri = P08G52_A22AlbComPri[0] ;
         A279CliNom = P08G52_A279CliNom[0] ;
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
         AV49VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A14AlbComCod );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime2 = GXutil.resetTime( A17AlbComFch );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setDate( GXt_dtime2 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char6) ;
            talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10014AlbComFd, GXv_char6) ;
            talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10015AlbComFdD, GXv_char6) ;
            talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
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
      AV41ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComCod", "", "Nº Documento", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComFch", "", "Fecha", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbComPri", "", "", true, "") ;
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
      GXt_char5 = AV45UserCustomValue ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TALBCOMWWColumnsSelector", GXv_char6) ;
      talbcomwwexport.this.GXt_char5 = GXv_char6[0] ;
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
      if ( GXutil.strcmp(AV37Session.getValue("TALBCOMWWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBCOMWWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TALBCOMWWGridState"), null, null);
      }
      AV16OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV125GXV3 = 1 ;
      while ( AV125GXV3 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV125GXV3));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV100AlbComPri = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV101AlbComFch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV102AlbComFch_To = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV103FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV52TFAlbComCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFAlbComCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV54TFAlbComFch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV98TFAlbComPri_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV99TFAlbComPri_Sels.fromJSonString(AV98TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV58TFCliCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFCliCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV60TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV61TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD") == 0 )
         {
            AV90TFAlbComFd = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD_SEL") == 0 )
         {
            AV91TFAlbComFd_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV92TFAlbComFdD = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV93TFAlbComFdD_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV125GXV3 = (int)(AV125GXV3+1) ;
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
      this.aP0[0] = talbcomwwexport.this.AV11Filename;
      this.aP1[0] = talbcomwwexport.this.AV12ErrorMessage;
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
      AV100AlbComPri = "" ;
      AV101AlbComFch = GXutil.nullDate() ;
      AV102AlbComFch_To = GXutil.nullDate() ;
      AV103FilterFullText = "" ;
      AV54TFAlbComFch = GXutil.nullDate() ;
      AV99TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV57TFAlbComPri_Sel = "" ;
      AV61TFCliNom_Sel = "" ;
      AV60TFCliNom = "" ;
      AV91TFAlbComFd_Sel = "" ;
      AV90TFAlbComFd = "" ;
      AV93TFAlbComFdD_Sel = "" ;
      AV92TFAlbComFdD = "" ;
      GXv_exceldoc3 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int4 = new short[1] ;
      AV37Session = httpContext.getWebSession();
      AV44ColumnsSelectorXML = "" ;
      AV41ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV43ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A17AlbComFch = GXutil.nullDate() ;
      A22AlbComPri = "" ;
      A279CliNom = "" ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      AV109Talbcomwwds_1_albcompri = "" ;
      AV110Talbcomwwds_2_albcomfch = GXutil.nullDate() ;
      AV111Talbcomwwds_3_albcomfch_to = GXutil.nullDate() ;
      AV112Talbcomwwds_4_filterfulltext = "" ;
      AV115Talbcomwwds_7_tfalbcomfch = GXutil.nullDate() ;
      AV116Talbcomwwds_8_tfalbcompri_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV119Talbcomwwds_11_tfclinom = "" ;
      AV120Talbcomwwds_12_tfclinom_sel = "" ;
      AV121Talbcomwwds_13_tfalbcomfd = "" ;
      AV122Talbcomwwds_14_tfalbcomfd_sel = "" ;
      AV123Talbcomwwds_15_tfalbcomfdd = "" ;
      AV124Talbcomwwds_16_tfalbcomfdd_sel = "" ;
      scmdbuf = "" ;
      lV112Talbcomwwds_4_filterfulltext = "" ;
      lV119Talbcomwwds_11_tfclinom = "" ;
      lV121Talbcomwwds_13_tfalbcomfd = "" ;
      lV123Talbcomwwds_15_tfalbcomfdd = "" ;
      P08G52_A396EmprCod = new String[] {""} ;
      P08G52_A10015AlbComFdD = new String[] {""} ;
      P08G52_A10014AlbComFd = new String[] {""} ;
      P08G52_A279CliNom = new String[] {""} ;
      P08G52_A252CliCod = new int[1] ;
      P08G52_A14AlbComCod = new int[1] ;
      P08G52_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G52_A22AlbComPri = new String[] {""} ;
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
      AV98TFAlbComPri_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbcomwwexport__default(),
         new Object[] {
             new Object[] {
            P08G52_A396EmprCod, P08G52_A10015AlbComFdD, P08G52_A10014AlbComFd, P08G52_A279CliNom, P08G52_A252CliCod, P08G52_A14AlbComCod, P08G52_A17AlbComFch, P08G52_A22AlbComPri
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
   private int AV52TFAlbComCod ;
   private int AV53TFAlbComCod_To ;
   private int AV106GXV1 ;
   private int AV58TFCliCod ;
   private int AV59TFCliCod_To ;
   private int AV107GXV2 ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV113Talbcomwwds_5_tfalbcomcod ;
   private int AV114Talbcomwwds_6_tfalbcomcod_to ;
   private int AV117Talbcomwwds_9_tfclicod ;
   private int AV118Talbcomwwds_10_tfclicod_to ;
   private int AV116Talbcomwwds_8_tfalbcompri_sels_size ;
   private int AV125GXV3 ;
   private long AV94i ;
   private long AV49VisibleColumnCount ;
   private String AV100AlbComPri ;
   private String AV57TFAlbComPri_Sel ;
   private String AV61TFCliNom_Sel ;
   private String AV60TFCliNom ;
   private String AV91TFAlbComFd_Sel ;
   private String AV90TFAlbComFd ;
   private String AV93TFAlbComFdD_Sel ;
   private String AV92TFAlbComFdD ;
   private String A22AlbComPri ;
   private String A279CliNom ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String AV109Talbcomwwds_1_albcompri ;
   private String AV119Talbcomwwds_11_tfclinom ;
   private String AV120Talbcomwwds_12_tfclinom_sel ;
   private String AV121Talbcomwwds_13_tfalbcomfd ;
   private String AV122Talbcomwwds_14_tfalbcomfd_sel ;
   private String AV123Talbcomwwds_15_tfalbcomfdd ;
   private String AV124Talbcomwwds_16_tfalbcomfdd_sel ;
   private String scmdbuf ;
   private String lV119Talbcomwwds_11_tfclinom ;
   private String lV121Talbcomwwds_13_tfalbcomfd ;
   private String lV123Talbcomwwds_15_tfalbcomfdd ;
   private String A396EmprCod ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private java.util.Date GXt_dtime2 ;
   private java.util.Date AV101AlbComFch ;
   private java.util.Date AV102AlbComFch_To ;
   private java.util.Date AV54TFAlbComFch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV110Talbcomwwds_2_albcomfch ;
   private java.util.Date AV111Talbcomwwds_3_albcomfch_to ;
   private java.util.Date AV115Talbcomwwds_7_tfalbcomfch ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV44ColumnsSelectorXML ;
   private String AV45UserCustomValue ;
   private String AV98TFAlbComPri_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV103FilterFullText ;
   private String AV112Talbcomwwds_4_filterfulltext ;
   private String lV112Talbcomwwds_4_filterfulltext ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private GXSimpleCollection<String> AV99TFAlbComPri_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08G52_A396EmprCod ;
   private String[] P08G52_A10015AlbComFdD ;
   private String[] P08G52_A10014AlbComFd ;
   private String[] P08G52_A279CliNom ;
   private int[] P08G52_A252CliCod ;
   private int[] P08G52_A14AlbComCod ;
   private java.util.Date[] P08G52_A17AlbComFch ;
   private String[] P08G52_A22AlbComPri ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc3[] ;
   private GXSimpleCollection<String> AV116Talbcomwwds_8_tfalbcompri_sels ;
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

final  class talbcomwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08G52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV116Talbcomwwds_8_tfalbcompri_sels ,
                                          java.util.Date AV110Talbcomwwds_2_albcomfch ,
                                          java.util.Date AV111Talbcomwwds_3_albcomfch_to ,
                                          String AV112Talbcomwwds_4_filterfulltext ,
                                          int AV113Talbcomwwds_5_tfalbcomcod ,
                                          int AV114Talbcomwwds_6_tfalbcomcod_to ,
                                          java.util.Date AV115Talbcomwwds_7_tfalbcomfch ,
                                          int AV116Talbcomwwds_8_tfalbcompri_sels_size ,
                                          int AV117Talbcomwwds_9_tfclicod ,
                                          int AV118Talbcomwwds_10_tfclicod_to ,
                                          String AV120Talbcomwwds_12_tfclinom_sel ,
                                          String AV119Talbcomwwds_11_tfclinom ,
                                          String AV122Talbcomwwds_14_tfalbcomfd_sel ,
                                          String AV121Talbcomwwds_13_tfalbcomfd ,
                                          String AV124Talbcomwwds_16_tfalbcomfdd_sel ,
                                          String AV123Talbcomwwds_15_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV109Talbcomwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[20];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComFdD, T1.AlbComFd, T2.CliNom, T1.CliCod, T1.AlbComCod, T1.AlbComFch, T1.AlbComPri FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110Talbcomwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Talbcomwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbcomwwds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV113Talbcomwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV114Talbcomwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Talbcomwwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( AV116Talbcomwwds_8_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV116Talbcomwwds_8_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( ! (0==AV117Talbcomwwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV118Talbcomwwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Talbcomwwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV119Talbcomwwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Talbcomwwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Talbcomwwds_14_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV121Talbcomwwds_13_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Talbcomwwds_14_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Talbcomwwds_16_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV123Talbcomwwds_15_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Talbcomwwds_16_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFd" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFd DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
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
                  return conditional_P08G52(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08G52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 200);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 200);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 200);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 200);
               }
               return;
      }
   }

}

