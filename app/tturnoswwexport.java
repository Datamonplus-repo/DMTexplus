package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tturnoswwexport extends GXProcedure
{
   public tturnoswwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tturnoswwexport.class ), "" );
   }

   public tturnoswwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tturnoswwexport.this.aP1 = new String[] {""};
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
      tturnoswwexport.this.aP0 = aP0;
      tturnoswwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TTURNOSWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44FilterFullText, GXv_char5) ;
      tturnoswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV33TFTurnCod) && (0==AV34TFTurnCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Turno", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV33TFTurnCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV34TFTurnCod_To );
      }
      if ( ! ( (0==AV35TFTurnHin) && (0==AV36TFTurnHin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hh", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFTurnHin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFTurnHin_To );
      }
      if ( ! ( (0==AV37TFTurnMin) && (0==AV38TFTurnMin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mm", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV37TFTurnMin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV38TFTurnMin_To );
      }
      if ( ! ( (0==AV39TFTurnHfi) && (0==AV40TFTurnHfi_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hh", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV39TFTurnHfi );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV40TFTurnHfi_To );
      }
      if ( ! ( (0==AV41TFTurnMfi) && (0==AV42TFTurnMfi_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mm", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV41TFTurnMfi );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tturnoswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV42TFTurnMfi_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("TTURNOSWWColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("TTURNOSWWColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV47GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV49Tturnoswwds_1_filterfulltext = AV44FilterFullText ;
      AV50Tturnoswwds_2_tfturncod = AV33TFTurnCod ;
      AV51Tturnoswwds_3_tfturncod_to = AV34TFTurnCod_To ;
      AV52Tturnoswwds_4_tfturnhin = AV35TFTurnHin ;
      AV53Tturnoswwds_5_tfturnhin_to = AV36TFTurnHin_To ;
      AV54Tturnoswwds_6_tfturnmin = AV37TFTurnMin ;
      AV55Tturnoswwds_7_tfturnmin_to = AV38TFTurnMin_To ;
      AV56Tturnoswwds_8_tfturnhfi = AV39TFTurnHfi ;
      AV57Tturnoswwds_9_tfturnhfi_to = AV40TFTurnHfi_To ;
      AV58Tturnoswwds_10_tfturnmfi = AV41TFTurnMfi ;
      AV59Tturnoswwds_11_tfturnmfi_to = AV42TFTurnMfi_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Tturnoswwds_1_filterfulltext ,
                                           Byte.valueOf(AV50Tturnoswwds_2_tfturncod) ,
                                           Byte.valueOf(AV51Tturnoswwds_3_tfturncod_to) ,
                                           Byte.valueOf(AV52Tturnoswwds_4_tfturnhin) ,
                                           Byte.valueOf(AV53Tturnoswwds_5_tfturnhin_to) ,
                                           Byte.valueOf(AV54Tturnoswwds_6_tfturnmin) ,
                                           Byte.valueOf(AV55Tturnoswwds_7_tfturnmin_to) ,
                                           Byte.valueOf(AV56Tturnoswwds_8_tfturnhfi) ,
                                           Byte.valueOf(AV57Tturnoswwds_9_tfturnhfi_to) ,
                                           Byte.valueOf(AV58Tturnoswwds_10_tfturnmfi) ,
                                           Byte.valueOf(AV59Tturnoswwds_11_tfturnmfi_to) ,
                                           Byte.valueOf(A1161TurnCod) ,
                                           Byte.valueOf(A1162TurnHin) ,
                                           Byte.valueOf(A1163TurnMin) ,
                                           Byte.valueOf(A1164TurnHfi) ,
                                           Byte.valueOf(A1165TurnMfi) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV49Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Tturnoswwds_1_filterfulltext), "%", "") ;
      lV49Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Tturnoswwds_1_filterfulltext), "%", "") ;
      lV49Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Tturnoswwds_1_filterfulltext), "%", "") ;
      lV49Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Tturnoswwds_1_filterfulltext), "%", "") ;
      lV49Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Tturnoswwds_1_filterfulltext), "%", "") ;
      /* Using cursor P08AV2 */
      pr_default.execute(0, new Object[] {lV49Tturnoswwds_1_filterfulltext, lV49Tturnoswwds_1_filterfulltext, lV49Tturnoswwds_1_filterfulltext, lV49Tturnoswwds_1_filterfulltext, lV49Tturnoswwds_1_filterfulltext, Byte.valueOf(AV50Tturnoswwds_2_tfturncod), Byte.valueOf(AV51Tturnoswwds_3_tfturncod_to), Byte.valueOf(AV52Tturnoswwds_4_tfturnhin), Byte.valueOf(AV53Tturnoswwds_5_tfturnhin_to), Byte.valueOf(AV54Tturnoswwds_6_tfturnmin), Byte.valueOf(AV55Tturnoswwds_7_tfturnmin_to), Byte.valueOf(AV56Tturnoswwds_8_tfturnhfi), Byte.valueOf(AV57Tturnoswwds_9_tfturnhfi_to), Byte.valueOf(AV58Tturnoswwds_10_tfturnmfi), Byte.valueOf(AV59Tturnoswwds_11_tfturnmfi_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1165TurnMfi = P08AV2_A1165TurnMfi[0] ;
         n1165TurnMfi = P08AV2_n1165TurnMfi[0] ;
         A1164TurnHfi = P08AV2_A1164TurnHfi[0] ;
         n1164TurnHfi = P08AV2_n1164TurnHfi[0] ;
         A1163TurnMin = P08AV2_A1163TurnMin[0] ;
         n1163TurnMin = P08AV2_n1163TurnMin[0] ;
         A1162TurnHin = P08AV2_A1162TurnHin[0] ;
         n1162TurnHin = P08AV2_n1162TurnHin[0] ;
         A1161TurnCod = P08AV2_A1161TurnCod[0] ;
         A396EmprCod = P08AV2_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A1161TurnCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A1162TurnHin );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A1163TurnMin );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A1164TurnHfi );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A1165TurnMfi );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TurnCod", "", "Turno", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TurnHin", "Inicio", "Hh", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TurnMin", "Inicio", "Mm", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TurnHfi", "Fin", "Hh", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TurnMfi", "Fin", "Mm", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTURNOSWWColumnsSelector", GXv_char5) ;
      tturnoswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("TTURNOSWWGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTURNOSWWGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("TTURNOSWWGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV60GXV2 = 1 ;
      while ( AV60GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNCOD") == 0 )
         {
            AV33TFTurnCod = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFTurnCod_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNHIN") == 0 )
         {
            AV35TFTurnHin = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFTurnHin_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNMIN") == 0 )
         {
            AV37TFTurnMin = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFTurnMin_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNHFI") == 0 )
         {
            AV39TFTurnHfi = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFTurnHfi_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNMFI") == 0 )
         {
            AV41TFTurnMfi = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFTurnMfi_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV60GXV2 = (int)(AV60GXV2+1) ;
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
      this.aP0[0] = tturnoswwexport.this.AV11Filename;
      this.aP1[0] = tturnoswwexport.this.AV12ErrorMessage;
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
      AV44FilterFullText = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV49Tturnoswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV49Tturnoswwds_1_filterfulltext = "" ;
      P08AV2_A1165TurnMfi = new byte[1] ;
      P08AV2_n1165TurnMfi = new boolean[] {false} ;
      P08AV2_A1164TurnHfi = new byte[1] ;
      P08AV2_n1164TurnHfi = new boolean[] {false} ;
      P08AV2_A1163TurnMin = new byte[1] ;
      P08AV2_n1163TurnMin = new boolean[] {false} ;
      P08AV2_A1162TurnHin = new byte[1] ;
      P08AV2_n1162TurnHin = new boolean[] {false} ;
      P08AV2_A1161TurnCod = new byte[1] ;
      P08AV2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tturnoswwexport__default(),
         new Object[] {
             new Object[] {
            P08AV2_A1165TurnMfi, P08AV2_n1165TurnMfi, P08AV2_A1164TurnHfi, P08AV2_n1164TurnHfi, P08AV2_A1163TurnMin, P08AV2_n1163TurnMin, P08AV2_A1162TurnHin, P08AV2_n1162TurnHin, P08AV2_A1161TurnCod, P08AV2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33TFTurnCod ;
   private byte AV34TFTurnCod_To ;
   private byte AV35TFTurnHin ;
   private byte AV36TFTurnHin_To ;
   private byte AV37TFTurnMin ;
   private byte AV38TFTurnMin_To ;
   private byte AV39TFTurnHfi ;
   private byte AV40TFTurnHfi_To ;
   private byte AV41TFTurnMfi ;
   private byte AV42TFTurnMfi_To ;
   private byte A1161TurnCod ;
   private byte A1162TurnHin ;
   private byte A1163TurnMin ;
   private byte A1164TurnHfi ;
   private byte A1165TurnMfi ;
   private byte AV50Tturnoswwds_2_tfturncod ;
   private byte AV51Tturnoswwds_3_tfturncod_to ;
   private byte AV52Tturnoswwds_4_tfturnhin ;
   private byte AV53Tturnoswwds_5_tfturnhin_to ;
   private byte AV54Tturnoswwds_6_tfturnmin ;
   private byte AV55Tturnoswwds_7_tfturnmin_to ;
   private byte AV56Tturnoswwds_8_tfturnhfi ;
   private byte AV57Tturnoswwds_9_tfturnhfi_to ;
   private byte AV58Tturnoswwds_10_tfturnmfi ;
   private byte AV59Tturnoswwds_11_tfturnmfi_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV47GXV1 ;
   private int AV60GXV2 ;
   private long AV30VisibleColumnCount ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1165TurnMfi ;
   private boolean n1164TurnHfi ;
   private boolean n1163TurnMin ;
   private boolean n1162TurnHin ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV44FilterFullText ;
   private String AV49Tturnoswwds_1_filterfulltext ;
   private String lV49Tturnoswwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08AV2_A1165TurnMfi ;
   private boolean[] P08AV2_n1165TurnMfi ;
   private byte[] P08AV2_A1164TurnHfi ;
   private boolean[] P08AV2_n1164TurnHfi ;
   private byte[] P08AV2_A1163TurnMin ;
   private boolean[] P08AV2_n1163TurnMin ;
   private byte[] P08AV2_A1162TurnHin ;
   private boolean[] P08AV2_n1162TurnHin ;
   private byte[] P08AV2_A1161TurnCod ;
   private String[] P08AV2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class tturnoswwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Tturnoswwds_1_filterfulltext ,
                                          byte AV50Tturnoswwds_2_tfturncod ,
                                          byte AV51Tturnoswwds_3_tfturncod_to ,
                                          byte AV52Tturnoswwds_4_tfturnhin ,
                                          byte AV53Tturnoswwds_5_tfturnhin_to ,
                                          byte AV54Tturnoswwds_6_tfturnmin ,
                                          byte AV55Tturnoswwds_7_tfturnmin_to ,
                                          byte AV56Tturnoswwds_8_tfturnhfi ,
                                          byte AV57Tturnoswwds_9_tfturnhfi_to ,
                                          byte AV58Tturnoswwds_10_tfturnmfi ,
                                          byte AV59Tturnoswwds_11_tfturnmfi_to ,
                                          byte A1161TurnCod ,
                                          byte A1162TurnHin ,
                                          byte A1163TurnMin ,
                                          byte A1164TurnHfi ,
                                          byte A1165TurnMfi ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT TurnMfi, TurnHfi, TurnMin, TurnHin, TurnCod, EmprCod FROM TXPTURNOS" ;
      if ( ! (GXutil.strcmp("", AV49Tturnoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TurnCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnHin,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnMin,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnHfi,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnMfi,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV50Tturnoswwds_2_tfturncod) )
      {
         addWhere(sWhereString, "(TurnCod >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV51Tturnoswwds_3_tfturncod_to) )
      {
         addWhere(sWhereString, "(TurnCod <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV52Tturnoswwds_4_tfturnhin) )
      {
         addWhere(sWhereString, "(TurnHin >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV53Tturnoswwds_5_tfturnhin_to) )
      {
         addWhere(sWhereString, "(TurnHin <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV54Tturnoswwds_6_tfturnmin) )
      {
         addWhere(sWhereString, "(TurnMin >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Tturnoswwds_7_tfturnmin_to) )
      {
         addWhere(sWhereString, "(TurnMin <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Tturnoswwds_8_tfturnhfi) )
      {
         addWhere(sWhereString, "(TurnHfi >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV57Tturnoswwds_9_tfturnhfi_to) )
      {
         addWhere(sWhereString, "(TurnHfi <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Tturnoswwds_10_tfturnmfi) )
      {
         addWhere(sWhereString, "(TurnMfi >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Tturnoswwds_11_tfturnmfi_to) )
      {
         addWhere(sWhereString, "(TurnMfi <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnHin" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnHin DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnMin" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnMin DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnHfi" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnHfi DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnMfi" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnMfi DESC" ;
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
                  return conditional_P08AV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               return;
      }
   }

}

