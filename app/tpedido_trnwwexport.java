package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpedido_trnwwexport extends GXProcedure
{
   public tpedido_trnwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedido_trnwwexport.class ), "" );
   }

   public tpedido_trnwwexport( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tpedido_trnwwexport.this.aP1 = new String[] {""};
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
      tpedido_trnwwexport.this.aP0 = aP0;
      tpedido_trnwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TPEDIDO_TrnWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( GXutil.strcmp(GXutil.trim( AV18PedSit), httpContext.getMessage( "S", "")) == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Cumplimentado", "") );
      }
      else if ( GXutil.strcmp(GXutil.trim( AV18PedSit), httpContext.getMessage( "N", "")) == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
      }
      else if ( GXutil.strcmp(GXutil.trim( AV18PedSit), "") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Indistinto", "") );
      }
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV19FilterFullText, GXv_char5) ;
      tpedido_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV37TFPedCod) && (0==AV38TFPedCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Pedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV37TFPedCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV38TFPedCod_To );
      }
      if ( ! ( (0==AV39TFPrvNum) && (0==AV40TFPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV39TFPrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV40TFPrvNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV42TFPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPrvNom_Sel, GXv_char5) ;
         tpedido_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPrvNom, GXv_char5) ;
            tpedido_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFPedFec)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFPedFec_To)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV43TFPedFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV44TFPedFec_To );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45TFPedFecEnt)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Ent. Prev.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tpedido_trnwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV45TFPedFecEnt );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV20Session.getValue("TPEDIDO_TrnWWColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV20Session.getValue("TPEDIDO_TrnWWColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV50GXV1));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Tpedido_trnwwds_1_pedsit = AV18PedSit ;
      AV53Tpedido_trnwwds_2_filterfulltext = AV19FilterFullText ;
      AV54Tpedido_trnwwds_3_tfpedcod = AV37TFPedCod ;
      AV55Tpedido_trnwwds_4_tfpedcod_to = AV38TFPedCod_To ;
      AV56Tpedido_trnwwds_5_tfprvnum = AV39TFPrvNum ;
      AV57Tpedido_trnwwds_6_tfprvnum_to = AV40TFPrvNum_To ;
      AV58Tpedido_trnwwds_7_tfprvnom = AV41TFPrvNom ;
      AV59Tpedido_trnwwds_8_tfprvnom_sel = AV42TFPrvNom_Sel ;
      AV60Tpedido_trnwwds_9_tfpedfec = AV43TFPedFec ;
      AV61Tpedido_trnwwds_10_tfpedfec_to = AV44TFPedFec_To ;
      AV62Tpedido_trnwwds_11_tfpedfecent = AV45TFPedFecEnt ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Tpedido_trnwwds_1_pedsit ,
                                           AV53Tpedido_trnwwds_2_filterfulltext ,
                                           Integer.valueOf(AV54Tpedido_trnwwds_3_tfpedcod) ,
                                           Integer.valueOf(AV55Tpedido_trnwwds_4_tfpedcod_to) ,
                                           Integer.valueOf(AV56Tpedido_trnwwds_5_tfprvnum) ,
                                           Integer.valueOf(AV57Tpedido_trnwwds_6_tfprvnum_to) ,
                                           AV59Tpedido_trnwwds_8_tfprvnom_sel ,
                                           AV58Tpedido_trnwwds_7_tfprvnom ,
                                           AV60Tpedido_trnwwds_9_tfpedfec ,
                                           AV61Tpedido_trnwwds_10_tfpedfec_to ,
                                           AV62Tpedido_trnwwds_11_tfpedfecent ,
                                           A667PedSit ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A661PedFec ,
                                           A662PedFecEnt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV52Tpedido_trnwwds_1_pedsit = GXutil.padr( GXutil.rtrim( AV52Tpedido_trnwwds_1_pedsit), 1, "%") ;
      lV53Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV53Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV53Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV58Tpedido_trnwwds_7_tfprvnom = GXutil.padr( GXutil.rtrim( AV58Tpedido_trnwwds_7_tfprvnom), 30, "%") ;
      /* Using cursor P09XK2 */
      pr_default.execute(0, new Object[] {lV52Tpedido_trnwwds_1_pedsit, lV53Tpedido_trnwwds_2_filterfulltext, lV53Tpedido_trnwwds_2_filterfulltext, lV53Tpedido_trnwwds_2_filterfulltext, Integer.valueOf(AV54Tpedido_trnwwds_3_tfpedcod), Integer.valueOf(AV55Tpedido_trnwwds_4_tfpedcod_to), Integer.valueOf(AV56Tpedido_trnwwds_5_tfprvnum), Integer.valueOf(AV57Tpedido_trnwwds_6_tfprvnum_to), lV58Tpedido_trnwwds_7_tfprvnom, AV59Tpedido_trnwwds_8_tfprvnom_sel, AV60Tpedido_trnwwds_9_tfpedfec, AV61Tpedido_trnwwds_10_tfpedfec_to, AV62Tpedido_trnwwds_11_tfpedfecent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P09XK2_A658PedCod[0] ;
         A396EmprCod = P09XK2_A396EmprCod[0] ;
         A667PedSit = P09XK2_A667PedSit[0] ;
         A662PedFecEnt = P09XK2_A662PedFecEnt[0] ;
         A661PedFec = P09XK2_A661PedFec[0] ;
         A794PrvNom = P09XK2_A794PrvNom[0] ;
         n794PrvNom = P09XK2_n794PrvNom[0] ;
         A795PrvNum = P09XK2_A795PrvNum[0] ;
         A794PrvNom = P09XK2_A794PrvNom[0] ;
         n794PrvNom = P09XK2_n794PrvNom[0] ;
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
         AV34VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A658PedCod );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A795PrvNum );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A794PrvNom, GXv_char5) ;
            tpedido_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A661PedFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A662PedFecEnt );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV24PedCant = DecimalUtil.doubleToDec(0) ;
            AV63Pedcanent = DecimalUtil.doubleToDec(0) ;
            /* Optimized group. */
            /* Using cursor P09XK3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            c669PedUni = P09XK3_A669PedUni[0] ;
            c657PedCanEnt = P09XK3_A657PedCanEnt[0] ;
            pr_default.close(1);
            AV24PedCant = AV24PedCant.add(c669PedUni) ;
            AV63Pedcanent = AV63Pedcanent.add(c657PedCanEnt) ;
            /* End optimized group. */
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24PedCant)) );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV25PedSitGrid = ((GXutil.strcmp(A667PedSit, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "Cumplimentado", "") : httpContext.getMessage( "Pendiente", "")) ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV25PedSitGrid, GXv_char5) ;
            tpedido_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedCod", "", "Nº Pedido", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrvNum", "", "Proveedor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrvNom", "", "Nombre", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedFec", "", "Fecha", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedFecEnt", "", "Fecha Ent. Prev.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PedCant", "", "Cantidad", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PedCanEnt", "", "Cant.Entreg", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PedSitGrid", "", "Estado", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPEDIDO_TrnWWColumnsSelector", GXv_char5) ;
      tpedido_trnwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("TPEDIDO_TrnWWGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPEDIDO_TrnWWGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("TPEDIDO_TrnWWGridState"), null, null);
      }
      AV16OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV65GXV2 = 1 ;
      while ( AV65GXV2 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV2));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PEDSIT") == 0 )
         {
            AV18PedSit = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV37TFPedCod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFPedCod_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV39TFPrvNum = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFPrvNum_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV41TFPrvNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV42TFPrvNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV43TFPedFec = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV44TFPedFec_To = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV45TFPedFecEnt = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV65GXV2 = (int)(AV65GXV2+1) ;
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
      this.aP0[0] = tpedido_trnwwexport.this.AV11Filename;
      this.aP1[0] = tpedido_trnwwexport.this.AV12ErrorMessage;
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
      AV18PedSit = "" ;
      AV19FilterFullText = "" ;
      AV42TFPrvNom_Sel = "" ;
      AV41TFPrvNom = "" ;
      AV43TFPedFec = GXutil.nullDate() ;
      AV44TFPedFec_To = GXutil.nullDate() ;
      AV45TFPedFecEnt = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV20Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A794PrvNom = "" ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      A667PedSit = "" ;
      AV52Tpedido_trnwwds_1_pedsit = "" ;
      AV53Tpedido_trnwwds_2_filterfulltext = "" ;
      AV58Tpedido_trnwwds_7_tfprvnom = "" ;
      AV59Tpedido_trnwwds_8_tfprvnom_sel = "" ;
      AV60Tpedido_trnwwds_9_tfpedfec = GXutil.nullDate() ;
      AV61Tpedido_trnwwds_10_tfpedfec_to = GXutil.nullDate() ;
      AV62Tpedido_trnwwds_11_tfpedfecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV52Tpedido_trnwwds_1_pedsit = "" ;
      lV53Tpedido_trnwwds_2_filterfulltext = "" ;
      lV58Tpedido_trnwwds_7_tfprvnom = "" ;
      P09XK2_A658PedCod = new int[1] ;
      P09XK2_A396EmprCod = new String[] {""} ;
      P09XK2_A667PedSit = new String[] {""} ;
      P09XK2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09XK2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09XK2_A794PrvNom = new String[] {""} ;
      P09XK2_n794PrvNom = new boolean[] {false} ;
      P09XK2_A795PrvNum = new int[1] ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV24PedCant = DecimalUtil.ZERO ;
      AV63Pedcanent = DecimalUtil.ZERO ;
      c669PedUni = DecimalUtil.ZERO ;
      c657PedCanEnt = DecimalUtil.ZERO ;
      P09XK3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09XK3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV25PedSitGrid = "" ;
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedido_trnwwexport__default(),
         new Object[] {
             new Object[] {
            P09XK2_A658PedCod, P09XK2_A396EmprCod, P09XK2_A667PedSit, P09XK2_A662PedFecEnt, P09XK2_A661PedFec, P09XK2_A794PrvNom, P09XK2_n794PrvNom, P09XK2_A795PrvNum
            }
            , new Object[] {
            P09XK3_A669PedUni, P09XK3_A657PedCanEnt
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
   private int AV37TFPedCod ;
   private int AV38TFPedCod_To ;
   private int AV39TFPrvNum ;
   private int AV40TFPrvNum_To ;
   private int AV50GXV1 ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int AV54Tpedido_trnwwds_3_tfpedcod ;
   private int AV55Tpedido_trnwwds_4_tfpedcod_to ;
   private int AV56Tpedido_trnwwds_5_tfprvnum ;
   private int AV57Tpedido_trnwwds_6_tfprvnum_to ;
   private int AV65GXV2 ;
   private long AV34VisibleColumnCount ;
   private java.math.BigDecimal AV24PedCant ;
   private java.math.BigDecimal AV63Pedcanent ;
   private java.math.BigDecimal c669PedUni ;
   private java.math.BigDecimal c657PedCanEnt ;
   private String AV18PedSit ;
   private String AV42TFPrvNom_Sel ;
   private String AV41TFPrvNom ;
   private String A794PrvNom ;
   private String A667PedSit ;
   private String AV52Tpedido_trnwwds_1_pedsit ;
   private String AV58Tpedido_trnwwds_7_tfprvnom ;
   private String AV59Tpedido_trnwwds_8_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV52Tpedido_trnwwds_1_pedsit ;
   private String lV58Tpedido_trnwwds_7_tfprvnom ;
   private String A396EmprCod ;
   private String AV25PedSitGrid ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV43TFPedFec ;
   private java.util.Date AV44TFPedFec_To ;
   private java.util.Date AV45TFPedFecEnt ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date AV60Tpedido_trnwwds_9_tfpedfec ;
   private java.util.Date AV61Tpedido_trnwwds_10_tfpedfec_to ;
   private java.util.Date AV62Tpedido_trnwwds_11_tfpedfecent ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n794PrvNom ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV19FilterFullText ;
   private String AV53Tpedido_trnwwds_2_filterfulltext ;
   private String lV53Tpedido_trnwwds_2_filterfulltext ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09XK2_A658PedCod ;
   private String[] P09XK2_A396EmprCod ;
   private String[] P09XK2_A667PedSit ;
   private java.util.Date[] P09XK2_A662PedFecEnt ;
   private java.util.Date[] P09XK2_A661PedFec ;
   private String[] P09XK2_A794PrvNom ;
   private boolean[] P09XK2_n794PrvNom ;
   private int[] P09XK2_A795PrvNum ;
   private java.math.BigDecimal[] P09XK3_A669PedUni ;
   private java.math.BigDecimal[] P09XK3_A657PedCanEnt ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
}

final  class tpedido_trnwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09XK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Tpedido_trnwwds_1_pedsit ,
                                          String AV53Tpedido_trnwwds_2_filterfulltext ,
                                          int AV54Tpedido_trnwwds_3_tfpedcod ,
                                          int AV55Tpedido_trnwwds_4_tfpedcod_to ,
                                          int AV56Tpedido_trnwwds_5_tfprvnum ,
                                          int AV57Tpedido_trnwwds_6_tfprvnum_to ,
                                          String AV59Tpedido_trnwwds_8_tfprvnom_sel ,
                                          String AV58Tpedido_trnwwds_7_tfprvnom ,
                                          java.util.Date AV60Tpedido_trnwwds_9_tfpedfec ,
                                          java.util.Date AV61Tpedido_trnwwds_10_tfpedfec_to ,
                                          java.util.Date AV62Tpedido_trnwwds_11_tfpedfecent ,
                                          String A667PedSit ,
                                          int A658PedCod ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[13];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.PedCod, T1.EmprCod, T1.PedSit, T1.PedFecEnt, T1.PedFec, T2.PrvNom, T1.PrvNum FROM (TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV52Tpedido_trnwwds_1_pedsit)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedSit) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tpedido_trnwwds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Tpedido_trnwwds_3_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV55Tpedido_trnwwds_4_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV56Tpedido_trnwwds_5_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV57Tpedido_trnwwds_6_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tpedido_trnwwds_8_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Tpedido_trnwwds_7_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tpedido_trnwwds_8_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Tpedido_trnwwds_9_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61Tpedido_trnwwds_10_tfpedfec_to)) )
      {
         addWhere(sWhereString, "(T1.PedFec <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Tpedido_trnwwds_11_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.PedCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFec" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFecEnt" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFecEnt DESC" ;
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
                  return conditional_P09XK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09XK3", "SELECT SUM(PedUni), SUM(PedCanEnt) FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

