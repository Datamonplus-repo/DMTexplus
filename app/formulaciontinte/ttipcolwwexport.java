package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipcolwwexport extends GXProcedure
{
   public ttipcolwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipcolwwexport.class ), "" );
   }

   public ttipcolwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttipcolwwexport.this.aP1 = new String[] {""};
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
      ttipcolwwexport.this.aP0 = aP0;
      ttipcolwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TTIPCOLWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40FilterFullText, GXv_char5) ;
      ttipcolwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV33TFTipColCod) && (0==AV34TFTipColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV33TFTipColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV34TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV36TFTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFTipColDsc_Sel, GXv_char5) ;
         ttipcolwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV35TFTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFTipColDsc, GXv_char5) ;
            ttipcolwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV37TFTipColTie) && (0==AV38TFTipColTie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tiempo Teo.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV37TFTipColTie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV38TFTipColTie_To );
      }
      if ( ! ( (0==AV41TFTipArtFam) && (0==AV42TFTipArtFam_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Clase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV41TFTipArtFam );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV42TFTipArtFam_To );
      }
      if ( ! ( (GXutil.strcmp("", AV44TFTipDscFam_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFTipDscFam_Sel, GXv_char5) ;
         ttipcolwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFTipDscFam)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttipcolwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFTipDscFam, GXv_char5) ;
            ttipcolwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.TTIPCOLWWColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("FormulacionTinte.TTIPCOLWWColumnsSelector") ;
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
      AV49Formulaciontinte_ttipcolwwds_1_filterfulltext = AV40FilterFullText ;
      AV50Formulaciontinte_ttipcolwwds_2_tftipcolcod = AV33TFTipColCod ;
      AV51Formulaciontinte_ttipcolwwds_3_tftipcolcod_to = AV34TFTipColCod_To ;
      AV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc = AV35TFTipColDsc ;
      AV53Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = AV36TFTipColDsc_Sel ;
      AV54Formulaciontinte_ttipcolwwds_6_tftipcoltie = AV37TFTipColTie ;
      AV55Formulaciontinte_ttipcolwwds_7_tftipcoltie_to = AV38TFTipColTie_To ;
      AV56Formulaciontinte_ttipcolwwds_8_tftipartfam = AV41TFTipArtFam ;
      AV57Formulaciontinte_ttipcolwwds_9_tftipartfam_to = AV42TFTipArtFam_To ;
      AV58Formulaciontinte_ttipcolwwds_10_tftipdscfam = AV43TFTipDscFam ;
      AV59Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = AV44TFTipDscFam_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV50Formulaciontinte_ttipcolwwds_2_tftipcolcod) ,
                                           Byte.valueOf(AV51Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) ,
                                           AV53Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                           AV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                           Integer.valueOf(AV54Formulaciontinte_ttipcolwwds_6_tftipcoltie) ,
                                           Integer.valueOf(AV55Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) ,
                                           Short.valueOf(AV56Formulaciontinte_ttipcolwwds_8_tftipartfam) ,
                                           Short.valueOf(AV57Formulaciontinte_ttipcolwwds_9_tftipartfam_to) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A4999TipColTie) ,
                                           Short.valueOf(A5723TipArtFam) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV49Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                           A5724TipDscFam ,
                                           AV59Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                           AV58Formulaciontinte_ttipcolwwds_10_tftipdscfam } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc), 30, "%") ;
      /* Using cursor P08GY2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV50Formulaciontinte_ttipcolwwds_2_tftipcolcod), Byte.valueOf(AV51Formulaciontinte_ttipcolwwds_3_tftipcolcod_to), lV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc, AV53Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel, Integer.valueOf(AV54Formulaciontinte_ttipcolwwds_6_tftipcoltie), Integer.valueOf(AV55Formulaciontinte_ttipcolwwds_7_tftipcoltie_to), Short.valueOf(AV56Formulaciontinte_ttipcolwwds_8_tftipartfam), Short.valueOf(AV57Formulaciontinte_ttipcolwwds_9_tftipartfam_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4999TipColTie = P08GY2_A4999TipColTie[0] ;
         n4999TipColTie = P08GY2_n4999TipColTie[0] ;
         A832TipColDsc = P08GY2_A832TipColDsc[0] ;
         n832TipColDsc = P08GY2_n832TipColDsc[0] ;
         A831TipColCod = P08GY2_A831TipColCod[0] ;
         A5723TipArtFam = P08GY2_A5723TipArtFam[0] ;
         n5723TipArtFam = P08GY2_n5723TipArtFam[0] ;
         A396EmprCod = P08GY2_A396EmprCod[0] ;
         GXt_char4 = A5724TipDscFam ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int3[0] = A5723TipArtFam ;
         GXv_char6[0] = GXt_char4 ;
         new app.pfamdsc(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_char6) ;
         ttipcolwwexport.this.A396EmprCod = GXv_char5[0] ;
         ttipcolwwexport.this.A5723TipArtFam = GXv_int3[0] ;
         ttipcolwwexport.this.GXt_char4 = GXv_char6[0] ;
         A5724TipDscFam = GXt_char4 ;
         if ( (GXutil.strcmp("", AV49Formulaciontinte_ttipcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV49Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV49Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4999TipColTie, 6, 0) , GXutil.padr( "%" + AV49Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5723TipArtFam, 4, 0) , GXutil.padr( "%" + AV49Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV49Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV59Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_ttipcolwwds_10_tftipdscfam)==0) ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV58Formulaciontinte_ttipcolwwds_10_tftipdscfam) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV59Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) || ( ( GXutil.strcmp(A5724TipDscFam, AV59Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel) == 0 ) ) )
               {
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
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
                     AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char6[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A832TipColDsc, GXv_char6) ;
                     ttipcolwwexport.this.GXt_char4 = GXv_char6[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A4999TipColTie );
                     AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A5723TipArtFam );
                     AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char6[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5724TipDscFam, GXv_char6) ;
                     ttipcolwwexport.this.GXt_char4 = GXv_char6[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColCod", "", "Codigo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColTie", "", "Tiempo Teo.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipArtFam", "", "Clase", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipDscFam", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char6[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.TTIPCOLWWColumnsSelector", GXv_char6) ;
      ttipcolwwexport.this.GXt_char4 = GXv_char6[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.TTIPCOLWWGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TTIPCOLWWGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("FormulacionTinte.TTIPCOLWWGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV60GXV2 = 1 ;
      while ( AV60GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV33TFTipColCod = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFTipColCod_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV35TFTipColDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV36TFTipColDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLTIE") == 0 )
         {
            AV37TFTipColTie = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFTipColTie_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTFAM") == 0 )
         {
            AV41TFTipArtFam = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFTipArtFam_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDSCFAM") == 0 )
         {
            AV43TFTipDscFam = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDSCFAM_SEL") == 0 )
         {
            AV44TFTipDscFam_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      this.aP0[0] = ttipcolwwexport.this.AV11Filename;
      this.aP1[0] = ttipcolwwexport.this.AV12ErrorMessage;
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
      AV40FilterFullText = "" ;
      AV36TFTipColDsc_Sel = "" ;
      AV35TFTipColDsc = "" ;
      AV44TFTipDscFam_Sel = "" ;
      AV43TFTipDscFam = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A832TipColDsc = "" ;
      A5724TipDscFam = "" ;
      AV49Formulaciontinte_ttipcolwwds_1_filterfulltext = "" ;
      AV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc = "" ;
      AV53Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = "" ;
      AV58Formulaciontinte_ttipcolwwds_10_tftipdscfam = "" ;
      AV59Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = "" ;
      scmdbuf = "" ;
      lV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc = "" ;
      P08GY2_A4999TipColTie = new int[1] ;
      P08GY2_n4999TipColTie = new boolean[] {false} ;
      P08GY2_A832TipColDsc = new String[] {""} ;
      P08GY2_n832TipColDsc = new boolean[] {false} ;
      P08GY2_A831TipColCod = new byte[1] ;
      P08GY2_A5723TipArtFam = new short[1] ;
      P08GY2_n5723TipArtFam = new boolean[] {false} ;
      P08GY2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new short[1] ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char6 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcolwwexport__default(),
         new Object[] {
             new Object[] {
            P08GY2_A4999TipColTie, P08GY2_n4999TipColTie, P08GY2_A832TipColDsc, P08GY2_n832TipColDsc, P08GY2_A831TipColCod, P08GY2_A5723TipArtFam, P08GY2_n5723TipArtFam, P08GY2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33TFTipColCod ;
   private byte AV34TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV50Formulaciontinte_ttipcolwwds_2_tftipcolcod ;
   private byte AV51Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ;
   private short AV41TFTipArtFam ;
   private short AV42TFTipArtFam_To ;
   private short A5723TipArtFam ;
   private short AV56Formulaciontinte_ttipcolwwds_8_tftipartfam ;
   private short AV57Formulaciontinte_ttipcolwwds_9_tftipartfam_to ;
   private short AV16OrderedBy ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV37TFTipColTie ;
   private int AV38TFTipColTie_To ;
   private int AV47GXV1 ;
   private int A4999TipColTie ;
   private int AV54Formulaciontinte_ttipcolwwds_6_tftipcoltie ;
   private int AV55Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ;
   private int AV60GXV2 ;
   private long AV30VisibleColumnCount ;
   private String AV36TFTipColDsc_Sel ;
   private String AV35TFTipColDsc ;
   private String AV44TFTipDscFam_Sel ;
   private String AV43TFTipDscFam ;
   private String A832TipColDsc ;
   private String A5724TipDscFam ;
   private String AV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc ;
   private String AV53Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ;
   private String AV58Formulaciontinte_ttipcolwwds_10_tftipdscfam ;
   private String AV59Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ;
   private String scmdbuf ;
   private String lV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc ;
   private String A396EmprCod ;
   private String GXv_char5[] ;
   private String GXt_char4 ;
   private String GXv_char6[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n4999TipColTie ;
   private boolean n832TipColDsc ;
   private boolean n5723TipArtFam ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV40FilterFullText ;
   private String AV49Formulaciontinte_ttipcolwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P08GY2_A4999TipColTie ;
   private boolean[] P08GY2_n4999TipColTie ;
   private String[] P08GY2_A832TipColDsc ;
   private boolean[] P08GY2_n832TipColDsc ;
   private byte[] P08GY2_A831TipColCod ;
   private short[] P08GY2_A5723TipArtFam ;
   private boolean[] P08GY2_n5723TipArtFam ;
   private String[] P08GY2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class ttipcolwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV50Formulaciontinte_ttipcolwwds_2_tftipcolcod ,
                                          byte AV51Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ,
                                          String AV53Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                          String AV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                          int AV54Formulaciontinte_ttipcolwwds_6_tftipcoltie ,
                                          int AV55Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ,
                                          short AV56Formulaciontinte_ttipcolwwds_8_tftipartfam ,
                                          short AV57Formulaciontinte_ttipcolwwds_9_tftipartfam_to ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A4999TipColTie ,
                                          short A5723TipArtFam ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV49Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                          String A5724TipDscFam ,
                                          String AV59Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                          String AV58Formulaciontinte_ttipcolwwds_10_tftipdscfam )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[8];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT TipColTie, TipColDsc, TipColCod, TipArtFam, EmprCod FROM TXPTIPCOL" ;
      if ( ! (0==AV50Formulaciontinte_ttipcolwwds_2_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_ttipcolwwds_4_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipColDsc = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_ttipcolwwds_6_tftipcoltie) )
      {
         addWhere(sWhereString, "(TipColTie >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) )
      {
         addWhere(sWhereString, "(TipColTie <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_ttipcolwwds_8_tftipartfam) )
      {
         addWhere(sWhereString, "(TipArtFam >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_ttipcolwwds_9_tftipartfam_to) )
      {
         addWhere(sWhereString, "(TipArtFam <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColTie" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColTie DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipArtFam" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipArtFam DESC" ;
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
                  return conditional_P08GY2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               return;
      }
   }

}

