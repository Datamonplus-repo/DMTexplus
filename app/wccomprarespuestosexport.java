package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccomprarespuestosexport extends GXProcedure
{
   public wccomprarespuestosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccomprarespuestosexport.class ), "" );
   }

   public wccomprarespuestosexport( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wccomprarespuestosexport.this.aP1 = new String[] {""};
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
      wccomprarespuestosexport.this.aP0 = aP0;
      wccomprarespuestosexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCCompraRespuestosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48FilterFullText, GXv_char5) ;
      wccomprarespuestosexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV38TFMRNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Repuesto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFMRNom_Sel, GXv_char5) ;
         wccomprarespuestosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFMRNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Repuesto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFMRNom, GXv_char5) ;
            wccomprarespuestosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV35TFMRCod) && (0==AV36TFMRCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFMRCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFMRCod_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMComSolCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMComSolCnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39TFMComSolCnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFMComSolCnt_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFMComSolPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMComSolPre_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFMComSolPre)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFMComSolPre_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMComEntCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMComEntCnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFMComEntCnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFMComEntCnt_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMComEntPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFMComEntPre_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFMComEntPre)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccomprarespuestosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFMComEntPre_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV20Session.getValue("WCCompraRespuestosColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV20Session.getValue("WCCompraRespuestosColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV51GXV1));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Wccomprarespuestosds_1_emprcod = AV16EmprCod ;
      AV54Wccomprarespuestosds_2_mcomcod = AV17MComCod ;
      AV55Wccomprarespuestosds_3_filterfulltext = AV48FilterFullText ;
      AV56Wccomprarespuestosds_4_tfmrnom = AV37TFMRNom ;
      AV57Wccomprarespuestosds_5_tfmrnom_sel = AV38TFMRNom_Sel ;
      AV58Wccomprarespuestosds_6_tfmrcod = AV35TFMRCod ;
      AV59Wccomprarespuestosds_7_tfmrcod_to = AV36TFMRCod_To ;
      AV60Wccomprarespuestosds_8_tfmcomsolcnt = AV39TFMComSolCnt ;
      AV61Wccomprarespuestosds_9_tfmcomsolcnt_to = AV40TFMComSolCnt_To ;
      AV62Wccomprarespuestosds_10_tfmcomsolpre = AV41TFMComSolPre ;
      AV63Wccomprarespuestosds_11_tfmcomsolpre_to = AV42TFMComSolPre_To ;
      AV64Wccomprarespuestosds_12_tfmcomentcnt = AV43TFMComEntCnt ;
      AV65Wccomprarespuestosds_13_tfmcomentcnt_to = AV44TFMComEntCnt_To ;
      AV66Wccomprarespuestosds_14_tfmcomentpre = AV45TFMComEntPre ;
      AV67Wccomprarespuestosds_15_tfmcomentpre_to = AV46TFMComEntPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Wccomprarespuestosds_3_filterfulltext ,
                                           AV57Wccomprarespuestosds_5_tfmrnom_sel ,
                                           AV56Wccomprarespuestosds_4_tfmrnom ,
                                           Integer.valueOf(AV58Wccomprarespuestosds_6_tfmrcod) ,
                                           Integer.valueOf(AV59Wccomprarespuestosds_7_tfmrcod_to) ,
                                           AV60Wccomprarespuestosds_8_tfmcomsolcnt ,
                                           AV61Wccomprarespuestosds_9_tfmcomsolcnt_to ,
                                           AV62Wccomprarespuestosds_10_tfmcomsolpre ,
                                           AV63Wccomprarespuestosds_11_tfmcomsolpre_to ,
                                           AV64Wccomprarespuestosds_12_tfmcomentcnt ,
                                           AV65Wccomprarespuestosds_13_tfmcomentcnt_to ,
                                           AV66Wccomprarespuestosds_14_tfmcomentpre ,
                                           AV67Wccomprarespuestosds_15_tfmcomentpre_to ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A11051MComSolCnt ,
                                           A11052MComSolPre ,
                                           A11053MComEntCnt ,
                                           A11054MComEntPre ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV53Wccomprarespuestosds_1_emprcod ,
                                           Long.valueOf(AV54Wccomprarespuestosds_2_mcomcod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A11055MComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV56Wccomprarespuestosds_4_tfmrnom = GXutil.padr( GXutil.rtrim( AV56Wccomprarespuestosds_4_tfmrnom), 100, "%") ;
      /* Using cursor P08WF2 */
      pr_default.execute(0, new Object[] {AV53Wccomprarespuestosds_1_emprcod, Long.valueOf(AV54Wccomprarespuestosds_2_mcomcod), lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV56Wccomprarespuestosds_4_tfmrnom, AV57Wccomprarespuestosds_5_tfmrnom_sel, Integer.valueOf(AV58Wccomprarespuestosds_6_tfmrcod), Integer.valueOf(AV59Wccomprarespuestosds_7_tfmrcod_to), AV60Wccomprarespuestosds_8_tfmcomsolcnt, AV61Wccomprarespuestosds_9_tfmcomsolcnt_to, AV62Wccomprarespuestosds_10_tfmcomsolpre, AV63Wccomprarespuestosds_11_tfmcomsolpre_to, AV64Wccomprarespuestosds_12_tfmcomentcnt, AV65Wccomprarespuestosds_13_tfmcomentcnt_to, AV66Wccomprarespuestosds_14_tfmcomentpre, AV67Wccomprarespuestosds_15_tfmcomentpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11054MComEntPre = P08WF2_A11054MComEntPre[0] ;
         A11053MComEntCnt = P08WF2_A11053MComEntCnt[0] ;
         A11052MComSolPre = P08WF2_A11052MComSolPre[0] ;
         A11051MComSolCnt = P08WF2_A11051MComSolCnt[0] ;
         A9492MRCod = P08WF2_A9492MRCod[0] ;
         A9493MRNom = P08WF2_A9493MRNom[0] ;
         n9493MRNom = P08WF2_n9493MRNom[0] ;
         A11055MComCod = P08WF2_A11055MComCod[0] ;
         A396EmprCod = P08WF2_A396EmprCod[0] ;
         A9493MRNom = P08WF2_A9493MRNom[0] ;
         n9493MRNom = P08WF2_n9493MRNom[0] ;
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
         AV32VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9493MRNom, GXv_char5) ;
            wccomprarespuestosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A9492MRCod );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11051MComSolCnt)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11052MComSolPre)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11053MComEntCnt)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11054MComEntPre)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRNom", "", "Repuesto", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRCod", "", "Codigo", false, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MComSolCnt", "", "Cantidad", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MComSolPre", "", "Precio", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MComEntCnt", "", "Cantidad Entrada", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MComEntPre", "", "Precio entrada", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCCompraRespuestosColumnsSelector", GXv_char5) ;
      wccomprarespuestosexport.this.GXt_char4 = GXv_char5[0] ;
      AV28UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("WCCompraRespuestosGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCCompraRespuestosGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("WCCompraRespuestosGridState"), null, null);
      }
      AV18OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV68GXV2 = 1 ;
      while ( AV68GXV2 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV2));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV37TFMRNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV38TFMRNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV35TFMRCod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFMRCod_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLCNT") == 0 )
         {
            AV39TFMComSolCnt = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFMComSolCnt_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLPRE") == 0 )
         {
            AV41TFMComSolPre = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFMComSolPre_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTCNT") == 0 )
         {
            AV43TFMComEntCnt = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFMComEntCnt_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTPRE") == 0 )
         {
            AV45TFMComEntPre = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFMComEntPre_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MCOMCOD") == 0 )
         {
            AV17MComCod = GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         AV68GXV2 = (int)(AV68GXV2+1) ;
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
      this.aP0[0] = wccomprarespuestosexport.this.AV11Filename;
      this.aP1[0] = wccomprarespuestosexport.this.AV12ErrorMessage;
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
      AV48FilterFullText = "" ;
      AV38TFMRNom_Sel = "" ;
      AV37TFMRNom = "" ;
      AV39TFMComSolCnt = DecimalUtil.ZERO ;
      AV40TFMComSolCnt_To = DecimalUtil.ZERO ;
      AV41TFMComSolPre = DecimalUtil.ZERO ;
      AV42TFMComSolPre_To = DecimalUtil.ZERO ;
      AV43TFMComEntCnt = DecimalUtil.ZERO ;
      AV44TFMComEntCnt_To = DecimalUtil.ZERO ;
      AV45TFMComEntPre = DecimalUtil.ZERO ;
      AV46TFMComEntPre_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV20Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9493MRNom = "" ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      AV53Wccomprarespuestosds_1_emprcod = "" ;
      AV16EmprCod = "" ;
      AV55Wccomprarespuestosds_3_filterfulltext = "" ;
      AV56Wccomprarespuestosds_4_tfmrnom = "" ;
      AV57Wccomprarespuestosds_5_tfmrnom_sel = "" ;
      AV60Wccomprarespuestosds_8_tfmcomsolcnt = DecimalUtil.ZERO ;
      AV61Wccomprarespuestosds_9_tfmcomsolcnt_to = DecimalUtil.ZERO ;
      AV62Wccomprarespuestosds_10_tfmcomsolpre = DecimalUtil.ZERO ;
      AV63Wccomprarespuestosds_11_tfmcomsolpre_to = DecimalUtil.ZERO ;
      AV64Wccomprarespuestosds_12_tfmcomentcnt = DecimalUtil.ZERO ;
      AV65Wccomprarespuestosds_13_tfmcomentcnt_to = DecimalUtil.ZERO ;
      AV66Wccomprarespuestosds_14_tfmcomentpre = DecimalUtil.ZERO ;
      AV67Wccomprarespuestosds_15_tfmcomentpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV55Wccomprarespuestosds_3_filterfulltext = "" ;
      lV56Wccomprarespuestosds_4_tfmrnom = "" ;
      A396EmprCod = "" ;
      P08WF2_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WF2_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WF2_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WF2_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WF2_A9492MRCod = new int[1] ;
      P08WF2_A9493MRNom = new String[] {""} ;
      P08WF2_n9493MRNom = new boolean[] {false} ;
      P08WF2_A11055MComCod = new long[1] ;
      P08WF2_A396EmprCod = new String[] {""} ;
      AV28UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccomprarespuestosexport__default(),
         new Object[] {
             new Object[] {
            P08WF2_A11054MComEntPre, P08WF2_A11053MComEntCnt, P08WF2_A11052MComSolPre, P08WF2_A11051MComSolCnt, P08WF2_A9492MRCod, P08WF2_A9493MRNom, P08WF2_n9493MRNom, P08WF2_A11055MComCod, P08WF2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV18OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV35TFMRCod ;
   private int AV36TFMRCod_To ;
   private int AV51GXV1 ;
   private int A9492MRCod ;
   private int AV58Wccomprarespuestosds_6_tfmrcod ;
   private int AV59Wccomprarespuestosds_7_tfmrcod_to ;
   private int AV68GXV2 ;
   private long AV32VisibleColumnCount ;
   private long AV54Wccomprarespuestosds_2_mcomcod ;
   private long AV17MComCod ;
   private long A11055MComCod ;
   private java.math.BigDecimal AV39TFMComSolCnt ;
   private java.math.BigDecimal AV40TFMComSolCnt_To ;
   private java.math.BigDecimal AV41TFMComSolPre ;
   private java.math.BigDecimal AV42TFMComSolPre_To ;
   private java.math.BigDecimal AV43TFMComEntCnt ;
   private java.math.BigDecimal AV44TFMComEntCnt_To ;
   private java.math.BigDecimal AV45TFMComEntPre ;
   private java.math.BigDecimal AV46TFMComEntPre_To ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal A11054MComEntPre ;
   private java.math.BigDecimal AV60Wccomprarespuestosds_8_tfmcomsolcnt ;
   private java.math.BigDecimal AV61Wccomprarespuestosds_9_tfmcomsolcnt_to ;
   private java.math.BigDecimal AV62Wccomprarespuestosds_10_tfmcomsolpre ;
   private java.math.BigDecimal AV63Wccomprarespuestosds_11_tfmcomsolpre_to ;
   private java.math.BigDecimal AV64Wccomprarespuestosds_12_tfmcomentcnt ;
   private java.math.BigDecimal AV65Wccomprarespuestosds_13_tfmcomentcnt_to ;
   private java.math.BigDecimal AV66Wccomprarespuestosds_14_tfmcomentpre ;
   private java.math.BigDecimal AV67Wccomprarespuestosds_15_tfmcomentpre_to ;
   private String AV38TFMRNom_Sel ;
   private String AV37TFMRNom ;
   private String A9493MRNom ;
   private String AV53Wccomprarespuestosds_1_emprcod ;
   private String AV16EmprCod ;
   private String AV56Wccomprarespuestosds_4_tfmrnom ;
   private String AV57Wccomprarespuestosds_5_tfmrnom_sel ;
   private String scmdbuf ;
   private String lV56Wccomprarespuestosds_4_tfmrnom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private boolean n9493MRNom ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV48FilterFullText ;
   private String AV55Wccomprarespuestosds_3_filterfulltext ;
   private String lV55Wccomprarespuestosds_3_filterfulltext ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08WF2_A11054MComEntPre ;
   private java.math.BigDecimal[] P08WF2_A11053MComEntCnt ;
   private java.math.BigDecimal[] P08WF2_A11052MComSolPre ;
   private java.math.BigDecimal[] P08WF2_A11051MComSolCnt ;
   private int[] P08WF2_A9492MRCod ;
   private String[] P08WF2_A9493MRNom ;
   private boolean[] P08WF2_n9493MRNom ;
   private long[] P08WF2_A11055MComCod ;
   private String[] P08WF2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class wccomprarespuestosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Wccomprarespuestosds_3_filterfulltext ,
                                          String AV57Wccomprarespuestosds_5_tfmrnom_sel ,
                                          String AV56Wccomprarespuestosds_4_tfmrnom ,
                                          int AV58Wccomprarespuestosds_6_tfmrcod ,
                                          int AV59Wccomprarespuestosds_7_tfmrcod_to ,
                                          java.math.BigDecimal AV60Wccomprarespuestosds_8_tfmcomsolcnt ,
                                          java.math.BigDecimal AV61Wccomprarespuestosds_9_tfmcomsolcnt_to ,
                                          java.math.BigDecimal AV62Wccomprarespuestosds_10_tfmcomsolpre ,
                                          java.math.BigDecimal AV63Wccomprarespuestosds_11_tfmcomsolpre_to ,
                                          java.math.BigDecimal AV64Wccomprarespuestosds_12_tfmcomentcnt ,
                                          java.math.BigDecimal AV65Wccomprarespuestosds_13_tfmcomentcnt_to ,
                                          java.math.BigDecimal AV66Wccomprarespuestosds_14_tfmcomentpre ,
                                          java.math.BigDecimal AV67Wccomprarespuestosds_15_tfmcomentpre_to ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          java.math.BigDecimal A11051MComSolCnt ,
                                          java.math.BigDecimal A11052MComSolPre ,
                                          java.math.BigDecimal A11053MComEntCnt ,
                                          java.math.BigDecimal A11054MComEntPre ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV53Wccomprarespuestosds_1_emprcod ,
                                          long AV54Wccomprarespuestosds_2_mcomcod ,
                                          String A396EmprCod ,
                                          long A11055MComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MComEntPre, T1.MComEntCnt, T1.MComSolPre, T1.MComSolCnt, T1.MRCod, T2.MRNom, T1.MComCod, T1.EmprCod FROM (TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MRCod = T1.MRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MComCod = ?)");
      if ( ! (GXutil.strcmp("", AV55Wccomprarespuestosds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComSolCnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComSolPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComEntCnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComEntPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wccomprarespuestosds_5_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Wccomprarespuestosds_4_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wccomprarespuestosds_5_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV58Wccomprarespuestosds_6_tfmrcod) )
      {
         addWhere(sWhereString, "(T1.MRCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV59Wccomprarespuestosds_7_tfmrcod_to) )
      {
         addWhere(sWhereString, "(T1.MRCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wccomprarespuestosds_8_tfmcomsolcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolCnt >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wccomprarespuestosds_9_tfmcomsolcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolCnt <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wccomprarespuestosds_10_tfmcomsolpre)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolPre >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wccomprarespuestosds_11_tfmcomsolpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolPre <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wccomprarespuestosds_12_tfmcomentcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntCnt >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wccomprarespuestosds_13_tfmcomentcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntCnt <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wccomprarespuestosds_14_tfmcomentpre)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntPre >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Wccomprarespuestosds_15_tfmcomentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntPre <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T2.MRNom" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T2.MRNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MRCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MRCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComSolCnt" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComSolCnt DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComSolPre" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComSolPre DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComEntCnt" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComEntCnt DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComEntPre" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComEntPre DESC" ;
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
                  return conditional_P08WF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
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
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               return;
      }
   }

}

