package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcdencproductos_anyadidasexport extends GXProcedure
{
   public wcwcdencproductos_anyadidasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcdencproductos_anyadidasexport.class ), "" );
   }

   public wcwcdencproductos_anyadidasexport( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcwcdencproductos_anyadidasexport.this.aP1 = new String[] {""};
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
      wcwcdencproductos_anyadidasexport.this.aP0 = aP0;
      wcwcdencproductos_anyadidasexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCWcdencproductos_AnyadidasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcwcdencproductos_anyadidasexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV45TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwcdencproductos_anyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPrdNum_Sel, GXv_char5) ;
         wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwcdencproductos_anyadidasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPrdNum, GXv_char5) ;
            wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFHrdPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwcdencproductos_anyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFHrdPrdDsc_Sel, GXv_char5) ;
         wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFHrdPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwcdencproductos_anyadidasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFHrdPrdDsc, GXv_char5) ;
            wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFHreLanyLot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwcdencproductos_anyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFHreLanyLot_Sel, GXv_char5) ;
         wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFHreLanyLot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwcdencproductos_anyadidasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFHreLanyLot, GXv_char5) ;
            wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("WCWcdencproductos_AnyadidasColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV19Session.getValue("WCWcdencproductos_AnyadidasColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV52GXV1));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV54Wcwcdencproductos_anyadidasds_1_filterfulltext = AV18FilterFullText ;
      AV55Wcwcdencproductos_anyadidasds_2_tfprdnum = AV44TFPrdNum ;
      AV56Wcwcdencproductos_anyadidasds_3_tfprdnum_sel = AV45TFPrdNum_Sel ;
      AV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = AV46TFHrdPrdDsc ;
      AV58Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel = AV47TFHrdPrdDsc_Sel ;
      AV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot = AV48TFHreLanyLot ;
      AV60Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel = AV49TFHreLanyLot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                           AV56Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                           AV55Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                           AV58Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                           AV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                           AV60Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                           AV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A5808HreLanyLot ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           Short.valueOf(AV41Tb1_cod) ,
                                           A4529HreFecTin ,
                                           AV42HreFecTin ,
                                           AV43HreFecTin_to ,
                                           Short.valueOf(A12535HreCencId) ,
                                           AV40Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV54Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV54Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV55Wcwcdencproductos_anyadidasds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Wcwcdencproductos_anyadidasds_2_tfprdnum), 6, "%") ;
      lV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc), 26, "%") ;
      lV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot = GXutil.padr( GXutil.rtrim( AV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot), 26, "%") ;
      /* Using cursor P095I2 */
      pr_default.execute(0, new Object[] {AV40Emprcod, Short.valueOf(AV41Tb1_cod), AV42HreFecTin, AV43HreFecTin_to, Short.valueOf(AV41Tb1_cod), lV54Wcwcdencproductos_anyadidasds_1_filterfulltext, lV54Wcwcdencproductos_anyadidasds_1_filterfulltext, lV54Wcwcdencproductos_anyadidasds_1_filterfulltext, lV55Wcwcdencproductos_anyadidasds_2_tfprdnum, AV56Wcwcdencproductos_anyadidasds_3_tfprdnum_sel, lV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc, AV58Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel, lV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot, AV60Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4495HreNumCie = P095I2_A4495HreNumCie[0] ;
         A4529HreFecTin = P095I2_A4529HreFecTin[0] ;
         n4529HreFecTin = P095I2_n4529HreFecTin[0] ;
         A12535HreCencId = P095I2_A12535HreCencId[0] ;
         n12535HreCencId = P095I2_n12535HreCencId[0] ;
         A396EmprCod = P095I2_A396EmprCod[0] ;
         A5808HreLanyLot = P095I2_A5808HreLanyLot[0] ;
         n5808HreLanyLot = P095I2_n5808HreLanyLot[0] ;
         A4510HrdPrdDsc = P095I2_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P095I2_n4510HrdPrdDsc[0] ;
         A719PrdNum = P095I2_A719PrdNum[0] ;
         A4494HreBarPar = P095I2_A4494HreBarPar[0] ;
         A4493HreBarReo = P095I2_A4493HreBarReo[0] ;
         A4492HreBarCod = P095I2_A4492HreBarCod[0] ;
         A4508HreLinMAL = P095I2_A4508HreLinMAL[0] ;
         A4509HreNumAny = P095I2_A4509HreNumAny[0] ;
         A4529HreFecTin = P095I2_A4529HreFecTin[0] ;
         n4529HreFecTin = P095I2_n4529HreFecTin[0] ;
         A12535HreCencId = P095I2_A12535HreCencId[0] ;
         n12535HreCencId = P095I2_n12535HreCencId[0] ;
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
            AV23BarNHdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23BarNHdr, GXv_char5) ;
            wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4510HrdPrdDsc, GXv_char5) ;
            wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5808HreLanyLot, GXv_char5) ;
            wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&BarNHdr", "", "N Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HrdPrdDsc", "", "Descripcion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HreLanyLot", "", "Lote", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWcdencproductos_AnyadidasColumnsSelector", GXv_char5) ;
      wcwcdencproductos_anyadidasexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWcdencproductos_AnyadidasGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcdencproductos_AnyadidasGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCWcdencproductos_AnyadidasGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV61GXV2 = 1 ;
      while ( AV61GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV44TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV45TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC") == 0 )
         {
            AV46TFHrdPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC_SEL") == 0 )
         {
            AV47TFHrdPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYLOT") == 0 )
         {
            AV48TFHreLanyLot = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYLOT_SEL") == 0 )
         {
            AV49TFHreLanyLot_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV40Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TB1_COD") == 0 )
         {
            AV41Tb1_cod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREFECTIN") == 0 )
         {
            AV42HreFecTin = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREFECTIN_TO") == 0 )
         {
            AV43HreFecTin_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV61GXV2 = (int)(AV61GXV2+1) ;
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
      this.aP0[0] = wcwcdencproductos_anyadidasexport.this.AV11Filename;
      this.aP1[0] = wcwcdencproductos_anyadidasexport.this.AV12ErrorMessage;
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
      AV45TFPrdNum_Sel = "" ;
      AV44TFPrdNum = "" ;
      AV47TFHrdPrdDsc_Sel = "" ;
      AV46TFHrdPrdDsc = "" ;
      AV49TFHreLanyLot_Sel = "" ;
      AV48TFHreLanyLot = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4494HreBarPar = "" ;
      A719PrdNum = "" ;
      A4510HrdPrdDsc = "" ;
      A5808HreLanyLot = "" ;
      AV54Wcwcdencproductos_anyadidasds_1_filterfulltext = "" ;
      AV55Wcwcdencproductos_anyadidasds_2_tfprdnum = "" ;
      AV56Wcwcdencproductos_anyadidasds_3_tfprdnum_sel = "" ;
      AV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = "" ;
      AV58Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel = "" ;
      AV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot = "" ;
      AV60Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel = "" ;
      scmdbuf = "" ;
      lV54Wcwcdencproductos_anyadidasds_1_filterfulltext = "" ;
      lV55Wcwcdencproductos_anyadidasds_2_tfprdnum = "" ;
      lV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = "" ;
      lV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      AV42HreFecTin = GXutil.nullDate() ;
      AV43HreFecTin_to = GXutil.nullDate() ;
      AV40Emprcod = "" ;
      A396EmprCod = "" ;
      P095I2_A4495HreNumCie = new byte[1] ;
      P095I2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P095I2_n4529HreFecTin = new boolean[] {false} ;
      P095I2_A12535HreCencId = new short[1] ;
      P095I2_n12535HreCencId = new boolean[] {false} ;
      P095I2_A396EmprCod = new String[] {""} ;
      P095I2_A5808HreLanyLot = new String[] {""} ;
      P095I2_n5808HreLanyLot = new boolean[] {false} ;
      P095I2_A4510HrdPrdDsc = new String[] {""} ;
      P095I2_n4510HrdPrdDsc = new boolean[] {false} ;
      P095I2_A719PrdNum = new String[] {""} ;
      P095I2_A4494HreBarPar = new String[] {""} ;
      P095I2_A4493HreBarReo = new byte[1] ;
      P095I2_A4492HreBarCod = new int[1] ;
      P095I2_A4508HreLinMAL = new short[1] ;
      P095I2_A4509HreNumAny = new byte[1] ;
      AV23BarNHdr = "" ;
      AV28UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcdencproductos_anyadidasexport__default(),
         new Object[] {
             new Object[] {
            P095I2_A4495HreNumCie, P095I2_A4529HreFecTin, P095I2_n4529HreFecTin, P095I2_A12535HreCencId, P095I2_n12535HreCencId, P095I2_A396EmprCod, P095I2_A5808HreLanyLot, P095I2_n5808HreLanyLot, P095I2_A4510HrdPrdDsc, P095I2_n4510HrdPrdDsc,
            P095I2_A719PrdNum, P095I2_A4494HreBarPar, P095I2_A4493HreBarReo, P095I2_A4492HreBarCod, P095I2_A4508HreLinMAL, P095I2_A4509HreNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4509HreNumAny ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV41Tb1_cod ;
   private short A12535HreCencId ;
   private short A4508HreLinMAL ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV52GXV1 ;
   private int A4492HreBarCod ;
   private int AV61GXV2 ;
   private long AV32VisibleColumnCount ;
   private String AV45TFPrdNum_Sel ;
   private String AV44TFPrdNum ;
   private String AV47TFHrdPrdDsc_Sel ;
   private String AV46TFHrdPrdDsc ;
   private String AV49TFHreLanyLot_Sel ;
   private String AV48TFHreLanyLot ;
   private String A4494HreBarPar ;
   private String A719PrdNum ;
   private String A4510HrdPrdDsc ;
   private String A5808HreLanyLot ;
   private String AV55Wcwcdencproductos_anyadidasds_2_tfprdnum ;
   private String AV56Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ;
   private String AV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ;
   private String AV58Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ;
   private String AV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot ;
   private String AV60Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ;
   private String scmdbuf ;
   private String lV55Wcwcdencproductos_anyadidasds_2_tfprdnum ;
   private String lV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ;
   private String lV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot ;
   private String AV40Emprcod ;
   private String A396EmprCod ;
   private String AV23BarNHdr ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV42HreFecTin ;
   private java.util.Date AV43HreFecTin_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n4529HreFecTin ;
   private boolean n12535HreCencId ;
   private boolean n5808HreLanyLot ;
   private boolean n4510HrdPrdDsc ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV54Wcwcdencproductos_anyadidasds_1_filterfulltext ;
   private String lV54Wcwcdencproductos_anyadidasds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P095I2_A4495HreNumCie ;
   private java.util.Date[] P095I2_A4529HreFecTin ;
   private boolean[] P095I2_n4529HreFecTin ;
   private short[] P095I2_A12535HreCencId ;
   private boolean[] P095I2_n12535HreCencId ;
   private String[] P095I2_A396EmprCod ;
   private String[] P095I2_A5808HreLanyLot ;
   private boolean[] P095I2_n5808HreLanyLot ;
   private String[] P095I2_A4510HrdPrdDsc ;
   private boolean[] P095I2_n4510HrdPrdDsc ;
   private String[] P095I2_A719PrdNum ;
   private String[] P095I2_A4494HreBarPar ;
   private byte[] P095I2_A4493HreBarReo ;
   private int[] P095I2_A4492HreBarCod ;
   private short[] P095I2_A4508HreLinMAL ;
   private byte[] P095I2_A4509HreNumAny ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class wcwcdencproductos_anyadidasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                          String AV56Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                          String AV55Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                          String AV58Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                          String AV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                          String AV60Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                          String AV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          String A5808HreLanyLot ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          short AV41Tb1_cod ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV42HreFecTin ,
                                          java.util.Date AV43HreFecTin_to ,
                                          short A12535HreCencId ,
                                          String AV40Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[14];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.HreNumCie, T2.HreFecTin, T2.HreCencId, T1.EmprCod, T1.HreLanyLot, T1.HrdPrdDsc, T1.PrdNum, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreLinMAL, T1.HreNumAny" ;
      scmdbuf += " FROM (TXPHISREA T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar" ;
      scmdbuf += " AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T2.HreFecTin >= ?)");
      addWhere(sWhereString, "(T2.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(T2.HreCencId = ?)");
      if ( ! (GXutil.strcmp("", AV54Wcwcdencproductos_anyadidasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrdPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.HreLanyLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcwcdencproductos_anyadidasds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcwcdencproductos_anyadidasds_4_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwcdencproductos_anyadidasds_6_tfhrelanylot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreLanyLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreLanyLot = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrdPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrdPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreLanyLot" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreLanyLot DESC" ;
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
                  return conditional_P095I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , ((Number) dynConstraints[12]).shortValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
      }
   }

}

