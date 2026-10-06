package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordcowwexport extends GXProcedure
{
   public tmordcowwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordcowwexport.class ), "" );
   }

   public tmordcowwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmordcowwexport.this.aP1 = new String[] {""};
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
      tmordcowwexport.this.aP0 = aP0;
      tmordcowwexport.this.aP1 = aP1;
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
      AV11Filename = "PrivateTempStorage" + "TMOrdCoWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tmordcowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV38TFOMCod) && (0==AV39TFOMCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod de Orden de Mantto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFOMCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFOMCod_To );
      }
      if ( ! ( (0==AV40TFOMOpeCod) && (0==AV41TFOMOpeCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario Mantenimiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFOMOpeCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFOMOpeCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFOMOpeNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFOMOpeNom_Sel, GXv_char5) ;
         tmordcowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFOMOpeNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Operario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFOMOpeNom, GXv_char5) ;
            tmordcowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV45TFOMMTpo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo de Línea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV51i = 1 ;
         AV54GXV1 = 1 ;
         while ( AV54GXV1 <= AV45TFOMMTpo_Sels.size() )
         {
            AV46TFOMMTpo_Sel = (String)AV45TFOMMTpo_Sels.elementAt(-1+AV54GXV1) ;
            if ( AV51i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV46TFOMMTpo_Sel), httpContext.getMessage( "R", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Reserva", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV46TFOMMTpo_Sel), httpContext.getMessage( "C", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Consumo", "") );
            }
            AV51i = (long)(AV51i+1) ;
            AV54GXV1 = (int)(AV54GXV1+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFOMMCCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFOMMCCnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad Consumo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFOMMCCnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFOMMCCnt_To)) );
      }
      if ( ! ( (0==AV49TFOMMCUlt) && (0==AV50TFOMMCUlt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ultimo Control", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV49TFOMMCUlt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordcowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV50TFOMMCUlt_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TMOrdCoWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TMOrdCoWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV55GXV2 = 1 ;
      while ( AV55GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV55GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV55GXV2 = (int)(AV55GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Tmordcowwds_1_filterfulltext = AV18FilterFullText ;
      AV58Tmordcowwds_2_tfomcod = AV38TFOMCod ;
      AV59Tmordcowwds_3_tfomcod_to = AV39TFOMCod_To ;
      AV60Tmordcowwds_4_tfomopecod = AV40TFOMOpeCod ;
      AV61Tmordcowwds_5_tfomopecod_to = AV41TFOMOpeCod_To ;
      AV62Tmordcowwds_6_tfomopenom = AV42TFOMOpeNom ;
      AV63Tmordcowwds_7_tfomopenom_sel = AV43TFOMOpeNom_Sel ;
      AV64Tmordcowwds_8_tfommtpo_sels = AV45TFOMMTpo_Sels ;
      AV65Tmordcowwds_9_tfommccnt = AV47TFOMMCCnt ;
      AV66Tmordcowwds_10_tfommccnt_to = AV48TFOMMCCnt_To ;
      AV67Tmordcowwds_11_tfommcult = AV49TFOMMCUlt ;
      AV68Tmordcowwds_12_tfommcult_to = AV50TFOMMCUlt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9458OMMTpo ,
                                           AV64Tmordcowwds_8_tfommtpo_sels ,
                                           Integer.valueOf(AV58Tmordcowwds_2_tfomcod) ,
                                           Integer.valueOf(AV59Tmordcowwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV60Tmordcowwds_4_tfomopecod) ,
                                           Integer.valueOf(AV61Tmordcowwds_5_tfomopecod_to) ,
                                           AV63Tmordcowwds_7_tfomopenom_sel ,
                                           AV62Tmordcowwds_6_tfomopenom ,
                                           Integer.valueOf(AV64Tmordcowwds_8_tfommtpo_sels.size()) ,
                                           AV65Tmordcowwds_9_tfommccnt ,
                                           AV66Tmordcowwds_10_tfommccnt_to ,
                                           Short.valueOf(AV67Tmordcowwds_11_tfommcult) ,
                                           Short.valueOf(AV68Tmordcowwds_12_tfommcult_to) ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9455OMOpeCod) ,
                                           A9456OMOpeNom ,
                                           A9461OMMCCnt ,
                                           Short.valueOf(A9465OMMCUlt) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV57Tmordcowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV62Tmordcowwds_6_tfomopenom = GXutil.padr( GXutil.rtrim( AV62Tmordcowwds_6_tfomopenom), 30, "%") ;
      /* Using cursor P08XP2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV58Tmordcowwds_2_tfomcod), Integer.valueOf(AV59Tmordcowwds_3_tfomcod_to), Integer.valueOf(AV60Tmordcowwds_4_tfomopecod), Integer.valueOf(AV61Tmordcowwds_5_tfomopecod_to), lV62Tmordcowwds_6_tfomopenom, AV63Tmordcowwds_7_tfomopenom_sel, AV65Tmordcowwds_9_tfommccnt, AV66Tmordcowwds_10_tfommccnt_to, Short.valueOf(AV67Tmordcowwds_11_tfommcult), Short.valueOf(AV68Tmordcowwds_12_tfommcult_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08XP2_A396EmprCod[0] ;
         A9465OMMCUlt = P08XP2_A9465OMMCUlt[0] ;
         n9465OMMCUlt = P08XP2_n9465OMMCUlt[0] ;
         A9461OMMCCnt = P08XP2_A9461OMMCCnt[0] ;
         A9456OMOpeNom = P08XP2_A9456OMOpeNom[0] ;
         n9456OMOpeNom = P08XP2_n9456OMOpeNom[0] ;
         A9455OMOpeCod = P08XP2_A9455OMOpeCod[0] ;
         A9425OMCod = P08XP2_A9425OMCod[0] ;
         A9458OMMTpo = P08XP2_A9458OMMTpo[0] ;
         A9456OMOpeNom = P08XP2_A9456OMOpeNom[0] ;
         n9456OMOpeNom = P08XP2_n9456OMOpeNom[0] ;
         if ( (GXutil.strcmp("", AV57Tmordcowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV57Tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9455OMOpeCod, 6, 0) , GXutil.padr( "%" + AV57Tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9456OMOpeNom) , GXutil.padr( "%" + GXutil.upper( AV57Tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "reserva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "consumo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A9461OMMCCnt, 12, 3) , GXutil.padr( "%" + AV57Tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9465OMMCUlt, 4, 0) , GXutil.padr( "%" + AV57Tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
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
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9425OMCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9455OMOpeCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9456OMOpeNom, GXv_char5) ;
               tmordcowwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A9458OMMTpo), httpContext.getMessage( "R", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Reserva", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A9458OMMTpo), httpContext.getMessage( "C", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Consumo", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9461OMMCCnt)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9465OMMCUlt );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OMCod", "", "Cod de Orden de Mantto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OMOpeCod", "", "Operario Mantenimiento", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OMOpeNom", "", "Nombre Operario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OMMTpo", "", "Tipo de Línea", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OMMCCnt", "", "Cantidad Consumo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OMMCUlt", "", "Ultimo Control", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMOrdCoWWColumnsSelector", GXv_char5) ;
      tmordcowwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMOrdCoWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMOrdCoWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TMOrdCoWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV69GXV3 = 1 ;
      while ( AV69GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV38TFOMCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFOMCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPECOD") == 0 )
         {
            AV40TFOMOpeCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFOMOpeCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPENOM") == 0 )
         {
            AV42TFOMOpeNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPENOM_SEL") == 0 )
         {
            AV43TFOMOpeNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMTPO_SEL") == 0 )
         {
            AV44TFOMMTpo_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFOMMTpo_Sels.fromJSonString(AV44TFOMMTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCNT") == 0 )
         {
            AV47TFOMMCCnt = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFOMMCCnt_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCULT") == 0 )
         {
            AV49TFOMMCUlt = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFOMMCUlt_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV69GXV3 = (int)(AV69GXV3+1) ;
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
      this.aP0[0] = tmordcowwexport.this.AV11Filename;
      this.aP1[0] = tmordcowwexport.this.AV12ErrorMessage;
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
      AV43TFOMOpeNom_Sel = "" ;
      AV42TFOMOpeNom = "" ;
      AV45TFOMMTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46TFOMMTpo_Sel = "" ;
      AV47TFOMMCCnt = DecimalUtil.ZERO ;
      AV48TFOMMCCnt_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9456OMOpeNom = "" ;
      A9458OMMTpo = "" ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      AV57Tmordcowwds_1_filterfulltext = "" ;
      AV62Tmordcowwds_6_tfomopenom = "" ;
      AV63Tmordcowwds_7_tfomopenom_sel = "" ;
      AV64Tmordcowwds_8_tfommtpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV65Tmordcowwds_9_tfommccnt = DecimalUtil.ZERO ;
      AV66Tmordcowwds_10_tfommccnt_to = DecimalUtil.ZERO ;
      lV57Tmordcowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV62Tmordcowwds_6_tfomopenom = "" ;
      P08XP2_A396EmprCod = new String[] {""} ;
      P08XP2_A9465OMMCUlt = new short[1] ;
      P08XP2_n9465OMMCUlt = new boolean[] {false} ;
      P08XP2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XP2_A9456OMOpeNom = new String[] {""} ;
      P08XP2_n9456OMOpeNom = new boolean[] {false} ;
      P08XP2_A9455OMOpeCod = new int[1] ;
      P08XP2_A9425OMCod = new int[1] ;
      P08XP2_A9458OMMTpo = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44TFOMMTpo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordcowwexport__default(),
         new Object[] {
             new Object[] {
            P08XP2_A396EmprCod, P08XP2_A9465OMMCUlt, P08XP2_n9465OMMCUlt, P08XP2_A9461OMMCCnt, P08XP2_A9456OMOpeNom, P08XP2_n9456OMOpeNom, P08XP2_A9455OMOpeCod, P08XP2_A9425OMCod, P08XP2_A9458OMMTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV49TFOMMCUlt ;
   private short AV50TFOMMCUlt_To ;
   private short GXv_int3[] ;
   private short A9465OMMCUlt ;
   private short AV67Tmordcowwds_11_tfommcult ;
   private short AV68Tmordcowwds_12_tfommcult_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFOMCod ;
   private int AV39TFOMCod_To ;
   private int AV40TFOMOpeCod ;
   private int AV41TFOMOpeCod_To ;
   private int AV54GXV1 ;
   private int AV55GXV2 ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int AV58Tmordcowwds_2_tfomcod ;
   private int AV59Tmordcowwds_3_tfomcod_to ;
   private int AV60Tmordcowwds_4_tfomopecod ;
   private int AV61Tmordcowwds_5_tfomopecod_to ;
   private int AV64Tmordcowwds_8_tfommtpo_sels_size ;
   private int AV69GXV3 ;
   private long AV51i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV47TFOMMCCnt ;
   private java.math.BigDecimal AV48TFOMMCCnt_To ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal AV65Tmordcowwds_9_tfommccnt ;
   private java.math.BigDecimal AV66Tmordcowwds_10_tfommccnt_to ;
   private String AV43TFOMOpeNom_Sel ;
   private String AV42TFOMOpeNom ;
   private String AV46TFOMMTpo_Sel ;
   private String A9456OMOpeNom ;
   private String A9458OMMTpo ;
   private String AV62Tmordcowwds_6_tfomopenom ;
   private String AV63Tmordcowwds_7_tfomopenom_sel ;
   private String scmdbuf ;
   private String lV62Tmordcowwds_6_tfomopenom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n9465OMMCUlt ;
   private boolean n9456OMOpeNom ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV44TFOMMTpo_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV57Tmordcowwds_1_filterfulltext ;
   private String lV57Tmordcowwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV45TFOMMTpo_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08XP2_A396EmprCod ;
   private short[] P08XP2_A9465OMMCUlt ;
   private boolean[] P08XP2_n9465OMMCUlt ;
   private java.math.BigDecimal[] P08XP2_A9461OMMCCnt ;
   private String[] P08XP2_A9456OMOpeNom ;
   private boolean[] P08XP2_n9456OMOpeNom ;
   private int[] P08XP2_A9455OMOpeCod ;
   private int[] P08XP2_A9425OMCod ;
   private String[] P08XP2_A9458OMMTpo ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV64Tmordcowwds_8_tfommtpo_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class tmordcowwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08XP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9458OMMTpo ,
                                          GXSimpleCollection<String> AV64Tmordcowwds_8_tfommtpo_sels ,
                                          int AV58Tmordcowwds_2_tfomcod ,
                                          int AV59Tmordcowwds_3_tfomcod_to ,
                                          int AV60Tmordcowwds_4_tfomopecod ,
                                          int AV61Tmordcowwds_5_tfomopecod_to ,
                                          String AV63Tmordcowwds_7_tfomopenom_sel ,
                                          String AV62Tmordcowwds_6_tfomopenom ,
                                          int AV64Tmordcowwds_8_tfommtpo_sels_size ,
                                          java.math.BigDecimal AV65Tmordcowwds_9_tfommccnt ,
                                          java.math.BigDecimal AV66Tmordcowwds_10_tfommccnt_to ,
                                          short AV67Tmordcowwds_11_tfommcult ,
                                          short AV68Tmordcowwds_12_tfommcult_to ,
                                          int A9425OMCod ,
                                          int A9455OMOpeCod ,
                                          String A9456OMOpeNom ,
                                          java.math.BigDecimal A9461OMMCCnt ,
                                          short A9465OMMCUlt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV57Tmordcowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[10];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMMCUlt, T1.OMMCCnt, T2.OpeNom AS OMOpeNom, T1.OMOpeCod AS OMOpeCod, T1.OMCod, T1.OMMTpo FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod)" ;
      if ( ! (0==AV58Tmordcowwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV59Tmordcowwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV60Tmordcowwds_4_tfomopecod) )
      {
         addWhere(sWhereString, "(T1.OMOpeCod >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV61Tmordcowwds_5_tfomopecod_to) )
      {
         addWhere(sWhereString, "(T1.OMOpeCod <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmordcowwds_7_tfomopenom_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmordcowwds_6_tfomopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmordcowwds_7_tfomopenom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.OpeNom = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV64Tmordcowwds_8_tfommtpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV64Tmordcowwds_8_tfommtpo_sels, "T1.OMMTpo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Tmordcowwds_9_tfommccnt)==0) )
      {
         addWhere(sWhereString, "(T1.OMMCCnt >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Tmordcowwds_10_tfommccnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.OMMCCnt <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV67Tmordcowwds_11_tfommcult) )
      {
         addWhere(sWhereString, "(T1.OMMCUlt >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmordcowwds_12_tfommcult_to) )
      {
         addWhere(sWhereString, "(T1.OMMCUlt <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.OpeNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.OpeNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMOpeCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMOpeCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMTpo" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMTpo DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMCCnt" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMCCnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMCUlt" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMCUlt DESC" ;
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
                  return conditional_P08XP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               return;
      }
   }

}

