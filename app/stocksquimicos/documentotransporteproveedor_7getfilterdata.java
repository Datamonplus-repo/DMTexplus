package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_7getfilterdata extends GXProcedure
{
   public documentotransporteproveedor_7getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_7getfilterdata.class ), "" );
   }

   public documentotransporteproveedor_7getfilterdata( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      documentotransporteproveedor_7getfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      documentotransporteproveedor_7getfilterdata.this.AV34DDOName = aP0;
      documentotransporteproveedor_7getfilterdata.this.AV35SearchTxt = aP1;
      documentotransporteproveedor_7getfilterdata.this.AV36SearchTxtTo = aP2;
      documentotransporteproveedor_7getfilterdata.this.aP3 = aP3;
      documentotransporteproveedor_7getfilterdata.this.aP4 = aP4;
      documentotransporteproveedor_7getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_ALBPRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPRODSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_ALBPROLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROLOTEOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("StocksQuimicos.DocumentoTransporteProveedor_7GridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.DocumentoTransporteProveedor_7GridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("StocksQuimicos.DocumentoTransporteProveedor_7GridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROLINEA") == 0 )
         {
            AV10TFAlbProLinea = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbProLinea_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODSC") == 0 )
         {
            AV14TFAlbProDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODSC_SEL") == 0 )
         {
            AV15TFAlbProDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCNT") == 0 )
         {
            AV16TFAlbProCnt = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFAlbProCnt_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROUND_SEL") == 0 )
         {
            AV18TFAlbProUnd_SelsJson = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV19TFAlbProUnd_Sels.fromJSonString(AV18TFAlbProUnd_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCAJAS") == 0 )
         {
            AV20TFAlbProCajas = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFAlbProCajas_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROLOTE") == 0 )
         {
            AV42TFAlbProLote = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROLOTE_SEL") == 0 )
         {
            AV43TFAlbProLote_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV35SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV10TFAlbProLinea ;
      AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV11TFAlbProLinea_To ;
      AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV12TFPrdNum ;
      AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV14TFAlbProDsc ;
      AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV15TFAlbProDsc_Sel ;
      AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV16TFAlbProCnt ;
      AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV17TFAlbProCnt_To ;
      AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV19TFAlbProUnd_Sels ;
      AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV20TFAlbProCajas ;
      AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV21TFAlbProCajas_To ;
      AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV42TFAlbProLote ;
      AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV43TFAlbProLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A13444AlbProUnd ,
                                           AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                           Short.valueOf(AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) ,
                                           Short.valueOf(AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) ,
                                           AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                           AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                           AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                           AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                           AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                           AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                           Integer.valueOf(AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels.size()) ,
                                           Short.valueOf(AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) ,
                                           Short.valueOf(AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) ,
                                           AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                           AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                           Short.valueOf(A13442AlbProLine) ,
                                           A719PrdNum ,
                                           A13448AlbProDsc ,
                                           A13443AlbProCnt ,
                                           Short.valueOf(A13449AlbProCaja) ,
                                           A14401AlbProLote ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(AV41AlbProId) ,
                                           AV40Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum), 6, "%") ;
      lV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc), 60, "%") ;
      lV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote), 26, "%") ;
      /* Using cursor P0AIF2 */
      pr_default.execute(0, new Object[] {AV40Emprcod, Integer.valueOf(AV41AlbProId), Short.valueOf(AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea), Short.valueOf(AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to), lV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum, AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel, lV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc, AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel, AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt, AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to, Short.valueOf(AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas), Short.valueOf(AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to), lV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote, AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAIF2 = false ;
         A396EmprCod = P0AIF2_A396EmprCod[0] ;
         A719PrdNum = P0AIF2_A719PrdNum[0] ;
         A13418AlbProID = P0AIF2_A13418AlbProID[0] ;
         A14401AlbProLote = P0AIF2_A14401AlbProLote[0] ;
         n14401AlbProLote = P0AIF2_n14401AlbProLote[0] ;
         A13449AlbProCaja = P0AIF2_A13449AlbProCaja[0] ;
         n13449AlbProCaja = P0AIF2_n13449AlbProCaja[0] ;
         A13444AlbProUnd = P0AIF2_A13444AlbProUnd[0] ;
         n13444AlbProUnd = P0AIF2_n13444AlbProUnd[0] ;
         A13443AlbProCnt = P0AIF2_A13443AlbProCnt[0] ;
         n13443AlbProCnt = P0AIF2_n13443AlbProCnt[0] ;
         A13448AlbProDsc = P0AIF2_A13448AlbProDsc[0] ;
         n13448AlbProDsc = P0AIF2_n13448AlbProDsc[0] ;
         A13442AlbProLine = P0AIF2_A13442AlbProLine[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AIF2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AIF2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brkAIF2 = false ;
            A13418AlbProID = P0AIF2_A13418AlbProID[0] ;
            A13442AlbProLine = P0AIF2_A13442AlbProLine[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAIF2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV23Option = A719PrdNum ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAIF2 )
         {
            brkAIF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbProDsc = AV35SearchTxt ;
      AV15TFAlbProDsc_Sel = "" ;
      AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV10TFAlbProLinea ;
      AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV11TFAlbProLinea_To ;
      AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV12TFPrdNum ;
      AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV14TFAlbProDsc ;
      AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV15TFAlbProDsc_Sel ;
      AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV16TFAlbProCnt ;
      AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV17TFAlbProCnt_To ;
      AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV19TFAlbProUnd_Sels ;
      AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV20TFAlbProCajas ;
      AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV21TFAlbProCajas_To ;
      AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV42TFAlbProLote ;
      AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV43TFAlbProLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A13444AlbProUnd ,
                                           AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                           Short.valueOf(AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) ,
                                           Short.valueOf(AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) ,
                                           AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                           AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                           AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                           AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                           AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                           AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                           Integer.valueOf(AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels.size()) ,
                                           Short.valueOf(AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) ,
                                           Short.valueOf(AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) ,
                                           AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                           AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                           Short.valueOf(A13442AlbProLine) ,
                                           A719PrdNum ,
                                           A13448AlbProDsc ,
                                           A13443AlbProCnt ,
                                           Short.valueOf(A13449AlbProCaja) ,
                                           A14401AlbProLote ,
                                           A396EmprCod ,
                                           AV40Emprcod ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(AV41AlbProId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum), 6, "%") ;
      lV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc), 60, "%") ;
      lV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote), 26, "%") ;
      /* Using cursor P0AIF3 */
      pr_default.execute(1, new Object[] {AV40Emprcod, Integer.valueOf(AV41AlbProId), Short.valueOf(AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea), Short.valueOf(AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to), lV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum, AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel, lV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc, AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel, AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt, AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to, Short.valueOf(AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas), Short.valueOf(AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to), lV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote, AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAIF4 = false ;
         A396EmprCod = P0AIF3_A396EmprCod[0] ;
         A13418AlbProID = P0AIF3_A13418AlbProID[0] ;
         A13448AlbProDsc = P0AIF3_A13448AlbProDsc[0] ;
         n13448AlbProDsc = P0AIF3_n13448AlbProDsc[0] ;
         A14401AlbProLote = P0AIF3_A14401AlbProLote[0] ;
         n14401AlbProLote = P0AIF3_n14401AlbProLote[0] ;
         A13449AlbProCaja = P0AIF3_A13449AlbProCaja[0] ;
         n13449AlbProCaja = P0AIF3_n13449AlbProCaja[0] ;
         A13444AlbProUnd = P0AIF3_A13444AlbProUnd[0] ;
         n13444AlbProUnd = P0AIF3_n13444AlbProUnd[0] ;
         A13443AlbProCnt = P0AIF3_A13443AlbProCnt[0] ;
         n13443AlbProCnt = P0AIF3_n13443AlbProCnt[0] ;
         A719PrdNum = P0AIF3_A719PrdNum[0] ;
         A13442AlbProLine = P0AIF3_A13442AlbProLine[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AIF3_A13448AlbProDsc[0], A13448AlbProDsc) == 0 ) )
         {
            brkAIF4 = false ;
            A396EmprCod = P0AIF3_A396EmprCod[0] ;
            A13418AlbProID = P0AIF3_A13418AlbProID[0] ;
            A13442AlbProLine = P0AIF3_A13442AlbProLine[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAIF4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13448AlbProDsc)==0) )
         {
            AV23Option = A13448AlbProDsc ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAIF4 )
         {
            brkAIF4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBPROLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV42TFAlbProLote = AV35SearchTxt ;
      AV43TFAlbProLote_Sel = "" ;
      AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV10TFAlbProLinea ;
      AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV11TFAlbProLinea_To ;
      AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV12TFPrdNum ;
      AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV14TFAlbProDsc ;
      AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV15TFAlbProDsc_Sel ;
      AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV16TFAlbProCnt ;
      AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV17TFAlbProCnt_To ;
      AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV19TFAlbProUnd_Sels ;
      AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV20TFAlbProCajas ;
      AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV21TFAlbProCajas_To ;
      AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV42TFAlbProLote ;
      AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV43TFAlbProLote_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A13444AlbProUnd ,
                                           AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                           Short.valueOf(AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) ,
                                           Short.valueOf(AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) ,
                                           AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                           AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                           AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                           AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                           AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                           AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                           Integer.valueOf(AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels.size()) ,
                                           Short.valueOf(AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) ,
                                           Short.valueOf(AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) ,
                                           AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                           AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                           Short.valueOf(A13442AlbProLine) ,
                                           A719PrdNum ,
                                           A13448AlbProDsc ,
                                           A13443AlbProCnt ,
                                           Short.valueOf(A13449AlbProCaja) ,
                                           A14401AlbProLote ,
                                           A396EmprCod ,
                                           AV40Emprcod ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(AV41AlbProId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum), 6, "%") ;
      lV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc), 60, "%") ;
      lV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote), 26, "%") ;
      /* Using cursor P0AIF4 */
      pr_default.execute(2, new Object[] {AV40Emprcod, Integer.valueOf(AV41AlbProId), Short.valueOf(AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea), Short.valueOf(AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to), lV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum, AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel, lV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc, AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel, AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt, AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to, Short.valueOf(AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas), Short.valueOf(AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to), lV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote, AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAIF6 = false ;
         A396EmprCod = P0AIF4_A396EmprCod[0] ;
         A13418AlbProID = P0AIF4_A13418AlbProID[0] ;
         A14401AlbProLote = P0AIF4_A14401AlbProLote[0] ;
         n14401AlbProLote = P0AIF4_n14401AlbProLote[0] ;
         A13449AlbProCaja = P0AIF4_A13449AlbProCaja[0] ;
         n13449AlbProCaja = P0AIF4_n13449AlbProCaja[0] ;
         A13444AlbProUnd = P0AIF4_A13444AlbProUnd[0] ;
         n13444AlbProUnd = P0AIF4_n13444AlbProUnd[0] ;
         A13443AlbProCnt = P0AIF4_A13443AlbProCnt[0] ;
         n13443AlbProCnt = P0AIF4_n13443AlbProCnt[0] ;
         A13448AlbProDsc = P0AIF4_A13448AlbProDsc[0] ;
         n13448AlbProDsc = P0AIF4_n13448AlbProDsc[0] ;
         A719PrdNum = P0AIF4_A719PrdNum[0] ;
         A13442AlbProLine = P0AIF4_A13442AlbProLine[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AIF4_A14401AlbProLote[0], A14401AlbProLote) == 0 ) )
         {
            brkAIF6 = false ;
            A396EmprCod = P0AIF4_A396EmprCod[0] ;
            A13418AlbProID = P0AIF4_A13418AlbProID[0] ;
            A13442AlbProLine = P0AIF4_A13442AlbProLine[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAIF6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14401AlbProLote)==0) )
         {
            AV23Option = A14401AlbProLote ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAIF6 )
         {
            brkAIF6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentotransporteproveedor_7getfilterdata.this.AV37OptionsJson;
      this.aP4[0] = documentotransporteproveedor_7getfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = documentotransporteproveedor_7getfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFAlbProDsc = "" ;
      AV15TFAlbProDsc_Sel = "" ;
      AV16TFAlbProCnt = DecimalUtil.ZERO ;
      AV17TFAlbProCnt_To = DecimalUtil.ZERO ;
      AV18TFAlbProUnd_SelsJson = "" ;
      AV19TFAlbProUnd_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42TFAlbProLote = "" ;
      AV43TFAlbProLote_Sel = "" ;
      A719PrdNum = "" ;
      AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = "" ;
      AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = "" ;
      AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = "" ;
      AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = "" ;
      AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = DecimalUtil.ZERO ;
      AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = DecimalUtil.ZERO ;
      AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = "" ;
      AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = "" ;
      scmdbuf = "" ;
      lV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = "" ;
      lV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = "" ;
      lV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = "" ;
      A13444AlbProUnd = "" ;
      A13448AlbProDsc = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A14401AlbProLote = "" ;
      AV40Emprcod = "" ;
      A396EmprCod = "" ;
      P0AIF2_A396EmprCod = new String[] {""} ;
      P0AIF2_A719PrdNum = new String[] {""} ;
      P0AIF2_A13418AlbProID = new int[1] ;
      P0AIF2_A14401AlbProLote = new String[] {""} ;
      P0AIF2_n14401AlbProLote = new boolean[] {false} ;
      P0AIF2_A13449AlbProCaja = new short[1] ;
      P0AIF2_n13449AlbProCaja = new boolean[] {false} ;
      P0AIF2_A13444AlbProUnd = new String[] {""} ;
      P0AIF2_n13444AlbProUnd = new boolean[] {false} ;
      P0AIF2_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIF2_n13443AlbProCnt = new boolean[] {false} ;
      P0AIF2_A13448AlbProDsc = new String[] {""} ;
      P0AIF2_n13448AlbProDsc = new boolean[] {false} ;
      P0AIF2_A13442AlbProLine = new short[1] ;
      AV23Option = "" ;
      P0AIF3_A396EmprCod = new String[] {""} ;
      P0AIF3_A13418AlbProID = new int[1] ;
      P0AIF3_A13448AlbProDsc = new String[] {""} ;
      P0AIF3_n13448AlbProDsc = new boolean[] {false} ;
      P0AIF3_A14401AlbProLote = new String[] {""} ;
      P0AIF3_n14401AlbProLote = new boolean[] {false} ;
      P0AIF3_A13449AlbProCaja = new short[1] ;
      P0AIF3_n13449AlbProCaja = new boolean[] {false} ;
      P0AIF3_A13444AlbProUnd = new String[] {""} ;
      P0AIF3_n13444AlbProUnd = new boolean[] {false} ;
      P0AIF3_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIF3_n13443AlbProCnt = new boolean[] {false} ;
      P0AIF3_A719PrdNum = new String[] {""} ;
      P0AIF3_A13442AlbProLine = new short[1] ;
      P0AIF4_A396EmprCod = new String[] {""} ;
      P0AIF4_A13418AlbProID = new int[1] ;
      P0AIF4_A14401AlbProLote = new String[] {""} ;
      P0AIF4_n14401AlbProLote = new boolean[] {false} ;
      P0AIF4_A13449AlbProCaja = new short[1] ;
      P0AIF4_n13449AlbProCaja = new boolean[] {false} ;
      P0AIF4_A13444AlbProUnd = new String[] {""} ;
      P0AIF4_n13444AlbProUnd = new boolean[] {false} ;
      P0AIF4_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIF4_n13443AlbProCnt = new boolean[] {false} ;
      P0AIF4_A13448AlbProDsc = new String[] {""} ;
      P0AIF4_n13448AlbProDsc = new boolean[] {false} ;
      P0AIF4_A719PrdNum = new String[] {""} ;
      P0AIF4_A13442AlbProLine = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_7getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AIF2_A396EmprCod, P0AIF2_A719PrdNum, P0AIF2_A13418AlbProID, P0AIF2_A14401AlbProLote, P0AIF2_n14401AlbProLote, P0AIF2_A13449AlbProCaja, P0AIF2_n13449AlbProCaja, P0AIF2_A13444AlbProUnd, P0AIF2_n13444AlbProUnd, P0AIF2_A13443AlbProCnt,
            P0AIF2_n13443AlbProCnt, P0AIF2_A13448AlbProDsc, P0AIF2_n13448AlbProDsc, P0AIF2_A13442AlbProLine
            }
            , new Object[] {
            P0AIF3_A396EmprCod, P0AIF3_A13418AlbProID, P0AIF3_A13448AlbProDsc, P0AIF3_n13448AlbProDsc, P0AIF3_A14401AlbProLote, P0AIF3_n14401AlbProLote, P0AIF3_A13449AlbProCaja, P0AIF3_n13449AlbProCaja, P0AIF3_A13444AlbProUnd, P0AIF3_n13444AlbProUnd,
            P0AIF3_A13443AlbProCnt, P0AIF3_n13443AlbProCnt, P0AIF3_A719PrdNum, P0AIF3_A13442AlbProLine
            }
            , new Object[] {
            P0AIF4_A396EmprCod, P0AIF4_A13418AlbProID, P0AIF4_A14401AlbProLote, P0AIF4_n14401AlbProLote, P0AIF4_A13449AlbProCaja, P0AIF4_n13449AlbProCaja, P0AIF4_A13444AlbProUnd, P0AIF4_n13444AlbProUnd, P0AIF4_A13443AlbProCnt, P0AIF4_n13443AlbProCnt,
            P0AIF4_A13448AlbProDsc, P0AIF4_n13448AlbProDsc, P0AIF4_A719PrdNum, P0AIF4_A13442AlbProLine
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFAlbProLinea ;
   private short AV11TFAlbProLinea_To ;
   private short AV20TFAlbProCajas ;
   private short AV21TFAlbProCajas_To ;
   private short AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea ;
   private short AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to ;
   private short AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas ;
   private short AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to ;
   private short A13442AlbProLine ;
   private short A13449AlbProCaja ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size ;
   private int A13418AlbProID ;
   private int AV41AlbProId ;
   private long AV28count ;
   private java.math.BigDecimal AV16TFAlbProCnt ;
   private java.math.BigDecimal AV17TFAlbProCnt_To ;
   private java.math.BigDecimal AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ;
   private java.math.BigDecimal AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFAlbProDsc ;
   private String AV15TFAlbProDsc_Sel ;
   private String AV42TFAlbProLote ;
   private String AV43TFAlbProLote_Sel ;
   private String A719PrdNum ;
   private String AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ;
   private String AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ;
   private String AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ;
   private String AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ;
   private String AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ;
   private String AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ;
   private String scmdbuf ;
   private String lV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ;
   private String lV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ;
   private String lV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ;
   private String A13444AlbProUnd ;
   private String A13448AlbProDsc ;
   private String A14401AlbProLote ;
   private String AV40Emprcod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAIF2 ;
   private boolean n14401AlbProLote ;
   private boolean n13449AlbProCaja ;
   private boolean n13444AlbProUnd ;
   private boolean n13443AlbProCnt ;
   private boolean n13448AlbProDsc ;
   private boolean brkAIF4 ;
   private boolean brkAIF6 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV18TFAlbProUnd_SelsJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AIF2_A396EmprCod ;
   private String[] P0AIF2_A719PrdNum ;
   private int[] P0AIF2_A13418AlbProID ;
   private String[] P0AIF2_A14401AlbProLote ;
   private boolean[] P0AIF2_n14401AlbProLote ;
   private short[] P0AIF2_A13449AlbProCaja ;
   private boolean[] P0AIF2_n13449AlbProCaja ;
   private String[] P0AIF2_A13444AlbProUnd ;
   private boolean[] P0AIF2_n13444AlbProUnd ;
   private java.math.BigDecimal[] P0AIF2_A13443AlbProCnt ;
   private boolean[] P0AIF2_n13443AlbProCnt ;
   private String[] P0AIF2_A13448AlbProDsc ;
   private boolean[] P0AIF2_n13448AlbProDsc ;
   private short[] P0AIF2_A13442AlbProLine ;
   private String[] P0AIF3_A396EmprCod ;
   private int[] P0AIF3_A13418AlbProID ;
   private String[] P0AIF3_A13448AlbProDsc ;
   private boolean[] P0AIF3_n13448AlbProDsc ;
   private String[] P0AIF3_A14401AlbProLote ;
   private boolean[] P0AIF3_n14401AlbProLote ;
   private short[] P0AIF3_A13449AlbProCaja ;
   private boolean[] P0AIF3_n13449AlbProCaja ;
   private String[] P0AIF3_A13444AlbProUnd ;
   private boolean[] P0AIF3_n13444AlbProUnd ;
   private java.math.BigDecimal[] P0AIF3_A13443AlbProCnt ;
   private boolean[] P0AIF3_n13443AlbProCnt ;
   private String[] P0AIF3_A719PrdNum ;
   private short[] P0AIF3_A13442AlbProLine ;
   private String[] P0AIF4_A396EmprCod ;
   private int[] P0AIF4_A13418AlbProID ;
   private String[] P0AIF4_A14401AlbProLote ;
   private boolean[] P0AIF4_n14401AlbProLote ;
   private short[] P0AIF4_A13449AlbProCaja ;
   private boolean[] P0AIF4_n13449AlbProCaja ;
   private String[] P0AIF4_A13444AlbProUnd ;
   private boolean[] P0AIF4_n13444AlbProUnd ;
   private java.math.BigDecimal[] P0AIF4_A13443AlbProCnt ;
   private boolean[] P0AIF4_n13443AlbProCnt ;
   private String[] P0AIF4_A13448AlbProDsc ;
   private boolean[] P0AIF4_n13448AlbProDsc ;
   private String[] P0AIF4_A719PrdNum ;
   private short[] P0AIF4_A13442AlbProLine ;
   private GXSimpleCollection<String> AV19TFAlbProUnd_Sels ;
   private GXSimpleCollection<String> AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class documentotransporteproveedor_7getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AIF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                          short AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea ,
                                          short AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to ,
                                          String AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                          String AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                          String AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                          String AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                          int AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size ,
                                          short AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas ,
                                          short AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to ,
                                          String AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                          String AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          String A14401AlbProLote ,
                                          int A13418AlbProID ,
                                          int AV41AlbProId ,
                                          String AV40Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, AlbProID, AlbProLote, AlbProCaja, AlbProUnd, AlbProCnt, AlbProDsc, AlbProLine FROM TXPLALPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProID = ?)");
      if ( ! (0==AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProLote = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AIF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                          short AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea ,
                                          short AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to ,
                                          String AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                          String AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                          String AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                          String AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                          int AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size ,
                                          short AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas ,
                                          short AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to ,
                                          String AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                          String AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          String A14401AlbProLote ,
                                          String A396EmprCod ,
                                          String AV40Emprcod ,
                                          int A13418AlbProID ,
                                          int AV41AlbProId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[14];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProID, AlbProDsc, AlbProLote, AlbProCaja, AlbProUnd, AlbProCnt, PrdNum, AlbProLine FROM TXPLALPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProID = ?)");
      if ( ! (0==AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProLote = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbProDsc" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0AIF4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                          short AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea ,
                                          short AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to ,
                                          String AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                          String AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                          String AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                          String AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                          int AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size ,
                                          short AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas ,
                                          short AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to ,
                                          String AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                          String AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          String A14401AlbProLote ,
                                          String A396EmprCod ,
                                          String AV40Emprcod ,
                                          int A13418AlbProID ,
                                          int AV41AlbProId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[14];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProID, AlbProLote, AlbProCaja, AlbProUnd, AlbProCnt, AlbProDsc, PrdNum, AlbProLine FROM TXPLALPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProID = ?)");
      if ( ! (0==AV48Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV49Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV50Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV57Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV58Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProLote = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbProLote" ;
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
                  return conditional_P0AIF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P0AIF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() );
            case 2 :
                  return conditional_P0AIF4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AIF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AIF4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((short[]) buf[13])[0] = rslt.getShort(9);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
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
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
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
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
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

