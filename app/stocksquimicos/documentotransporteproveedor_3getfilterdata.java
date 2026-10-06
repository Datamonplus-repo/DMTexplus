package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_3getfilterdata extends GXProcedure
{
   public documentotransporteproveedor_3getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_3getfilterdata.class ), "" );
   }

   public documentotransporteproveedor_3getfilterdata( int remoteHandle ,
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
      documentotransporteproveedor_3getfilterdata.this.aP5 = new String[] {""};
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
      documentotransporteproveedor_3getfilterdata.this.AV34DDOName = aP0;
      documentotransporteproveedor_3getfilterdata.this.AV35SearchTxt = aP1;
      documentotransporteproveedor_3getfilterdata.this.AV36SearchTxtTo = aP2;
      documentotransporteproveedor_3getfilterdata.this.aP3 = aP3;
      documentotransporteproveedor_3getfilterdata.this.aP4 = aP4;
      documentotransporteproveedor_3getfilterdata.this.aP5 = aP5;
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
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("StocksQuimicos.DocumentoTransporteProveedor_3GridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.DocumentoTransporteProveedor_3GridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("StocksQuimicos.DocumentoTransporteProveedor_3GridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROLINEA") == 0 )
         {
            AV45TFAlbProLinea = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFAlbProLinea_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV47TFPrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV48TFPrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODSC") == 0 )
         {
            AV49TFAlbProDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODSC_SEL") == 0 )
         {
            AV50TFAlbProDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCNT") == 0 )
         {
            AV51TFAlbProCnt = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFAlbProCnt_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROUND_SEL") == 0 )
         {
            AV53TFAlbProUnd_SelsJson = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV54TFAlbProUnd_Sels.fromJSonString(AV53TFAlbProUnd_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCAJAS") == 0 )
         {
            AV55TFAlbProCajas = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFAlbProCajas_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV40Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROID") == 0 )
         {
            AV41AlbProId = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROIDAT") == 0 )
         {
            AV42ALbProIDAT = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROSYS") == 0 )
         {
            AV43AlbProSys = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPRODATE") == 0 )
         {
            AV44AlbProDate = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV47TFPrdNum = AV35SearchTxt ;
      AV48TFPrdNum_Sel = "" ;
      AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A13444AlbProUnd ,
                                           AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ,
                                           Short.valueOf(AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea) ,
                                           Short.valueOf(AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to) ,
                                           AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ,
                                           AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ,
                                           AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ,
                                           AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ,
                                           AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ,
                                           AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ,
                                           Integer.valueOf(AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels.size()) ,
                                           Short.valueOf(AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas) ,
                                           Short.valueOf(AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to) ,
                                           Short.valueOf(A13442AlbProLine) ,
                                           A719PrdNum ,
                                           A13448AlbProDsc ,
                                           A13443AlbProCnt ,
                                           Short.valueOf(A13449AlbProCaja) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(AV41AlbProId) ,
                                           AV40Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum), 6, "%") ;
      lV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc), 60, "%") ;
      /* Using cursor P09SR2 */
      pr_default.execute(0, new Object[] {AV40Emprcod, Integer.valueOf(AV41AlbProId), Short.valueOf(AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea), Short.valueOf(AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to), lV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum, AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel, lV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc, AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel, AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt, AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to, Short.valueOf(AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas), Short.valueOf(AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9SR2 = false ;
         A396EmprCod = P09SR2_A396EmprCod[0] ;
         A719PrdNum = P09SR2_A719PrdNum[0] ;
         A13418AlbProID = P09SR2_A13418AlbProID[0] ;
         A13449AlbProCaja = P09SR2_A13449AlbProCaja[0] ;
         n13449AlbProCaja = P09SR2_n13449AlbProCaja[0] ;
         A13444AlbProUnd = P09SR2_A13444AlbProUnd[0] ;
         n13444AlbProUnd = P09SR2_n13444AlbProUnd[0] ;
         A13443AlbProCnt = P09SR2_A13443AlbProCnt[0] ;
         n13443AlbProCnt = P09SR2_n13443AlbProCnt[0] ;
         A13448AlbProDsc = P09SR2_A13448AlbProDsc[0] ;
         n13448AlbProDsc = P09SR2_n13448AlbProDsc[0] ;
         A13442AlbProLine = P09SR2_A13442AlbProLine[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09SR2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09SR2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9SR2 = false ;
            A13418AlbProID = P09SR2_A13418AlbProID[0] ;
            A13442AlbProLine = P09SR2_A13442AlbProLine[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9SR2 = true ;
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
         if ( ! brk9SR2 )
         {
            brk9SR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV49TFAlbProDsc = AV35SearchTxt ;
      AV50TFAlbProDsc_Sel = "" ;
      AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A13444AlbProUnd ,
                                           AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ,
                                           Short.valueOf(AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea) ,
                                           Short.valueOf(AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to) ,
                                           AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ,
                                           AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ,
                                           AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ,
                                           AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ,
                                           AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ,
                                           AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ,
                                           Integer.valueOf(AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels.size()) ,
                                           Short.valueOf(AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas) ,
                                           Short.valueOf(AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to) ,
                                           Short.valueOf(A13442AlbProLine) ,
                                           A719PrdNum ,
                                           A13448AlbProDsc ,
                                           A13443AlbProCnt ,
                                           Short.valueOf(A13449AlbProCaja) ,
                                           A396EmprCod ,
                                           AV40Emprcod ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(AV41AlbProId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum), 6, "%") ;
      lV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc), 60, "%") ;
      /* Using cursor P09SR3 */
      pr_default.execute(1, new Object[] {AV40Emprcod, Integer.valueOf(AV41AlbProId), Short.valueOf(AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea), Short.valueOf(AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to), lV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum, AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel, lV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc, AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel, AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt, AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to, Short.valueOf(AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas), Short.valueOf(AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9SR4 = false ;
         A396EmprCod = P09SR3_A396EmprCod[0] ;
         A13418AlbProID = P09SR3_A13418AlbProID[0] ;
         A13448AlbProDsc = P09SR3_A13448AlbProDsc[0] ;
         n13448AlbProDsc = P09SR3_n13448AlbProDsc[0] ;
         A13449AlbProCaja = P09SR3_A13449AlbProCaja[0] ;
         n13449AlbProCaja = P09SR3_n13449AlbProCaja[0] ;
         A13444AlbProUnd = P09SR3_A13444AlbProUnd[0] ;
         n13444AlbProUnd = P09SR3_n13444AlbProUnd[0] ;
         A13443AlbProCnt = P09SR3_A13443AlbProCnt[0] ;
         n13443AlbProCnt = P09SR3_n13443AlbProCnt[0] ;
         A719PrdNum = P09SR3_A719PrdNum[0] ;
         A13442AlbProLine = P09SR3_A13442AlbProLine[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09SR3_A13448AlbProDsc[0], A13448AlbProDsc) == 0 ) )
         {
            brk9SR4 = false ;
            A396EmprCod = P09SR3_A396EmprCod[0] ;
            A13418AlbProID = P09SR3_A13418AlbProID[0] ;
            A13442AlbProLine = P09SR3_A13442AlbProLine[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9SR4 = true ;
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
         if ( ! brk9SR4 )
         {
            brk9SR4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentotransporteproveedor_3getfilterdata.this.AV37OptionsJson;
      this.aP4[0] = documentotransporteproveedor_3getfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = documentotransporteproveedor_3getfilterdata.this.AV39OptionIndexesJson;
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
      AV47TFPrdNum = "" ;
      AV48TFPrdNum_Sel = "" ;
      AV49TFAlbProDsc = "" ;
      AV50TFAlbProDsc_Sel = "" ;
      AV51TFAlbProCnt = DecimalUtil.ZERO ;
      AV52TFAlbProCnt_To = DecimalUtil.ZERO ;
      AV53TFAlbProUnd_SelsJson = "" ;
      AV54TFAlbProUnd_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40Emprcod = "" ;
      AV42ALbProIDAT = "" ;
      AV43AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      AV44AlbProDate = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = "" ;
      AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = "" ;
      AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = "" ;
      AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = "" ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = DecimalUtil.ZERO ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = DecimalUtil.ZERO ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = "" ;
      lV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = "" ;
      A13444AlbProUnd = "" ;
      A13448AlbProDsc = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P09SR2_A396EmprCod = new String[] {""} ;
      P09SR2_A719PrdNum = new String[] {""} ;
      P09SR2_A13418AlbProID = new int[1] ;
      P09SR2_A13449AlbProCaja = new short[1] ;
      P09SR2_n13449AlbProCaja = new boolean[] {false} ;
      P09SR2_A13444AlbProUnd = new String[] {""} ;
      P09SR2_n13444AlbProUnd = new boolean[] {false} ;
      P09SR2_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09SR2_n13443AlbProCnt = new boolean[] {false} ;
      P09SR2_A13448AlbProDsc = new String[] {""} ;
      P09SR2_n13448AlbProDsc = new boolean[] {false} ;
      P09SR2_A13442AlbProLine = new short[1] ;
      AV23Option = "" ;
      P09SR3_A396EmprCod = new String[] {""} ;
      P09SR3_A13418AlbProID = new int[1] ;
      P09SR3_A13448AlbProDsc = new String[] {""} ;
      P09SR3_n13448AlbProDsc = new boolean[] {false} ;
      P09SR3_A13449AlbProCaja = new short[1] ;
      P09SR3_n13449AlbProCaja = new boolean[] {false} ;
      P09SR3_A13444AlbProUnd = new String[] {""} ;
      P09SR3_n13444AlbProUnd = new boolean[] {false} ;
      P09SR3_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09SR3_n13443AlbProCnt = new boolean[] {false} ;
      P09SR3_A719PrdNum = new String[] {""} ;
      P09SR3_A13442AlbProLine = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_3getfilterdata__default(),
         new Object[] {
             new Object[] {
            P09SR2_A396EmprCod, P09SR2_A719PrdNum, P09SR2_A13418AlbProID, P09SR2_A13449AlbProCaja, P09SR2_n13449AlbProCaja, P09SR2_A13444AlbProUnd, P09SR2_n13444AlbProUnd, P09SR2_A13443AlbProCnt, P09SR2_n13443AlbProCnt, P09SR2_A13448AlbProDsc,
            P09SR2_n13448AlbProDsc, P09SR2_A13442AlbProLine
            }
            , new Object[] {
            P09SR3_A396EmprCod, P09SR3_A13418AlbProID, P09SR3_A13448AlbProDsc, P09SR3_n13448AlbProDsc, P09SR3_A13449AlbProCaja, P09SR3_n13449AlbProCaja, P09SR3_A13444AlbProUnd, P09SR3_n13444AlbProUnd, P09SR3_A13443AlbProCnt, P09SR3_n13443AlbProCnt,
            P09SR3_A719PrdNum, P09SR3_A13442AlbProLine
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV45TFAlbProLinea ;
   private short AV46TFAlbProLinea_To ;
   private short AV55TFAlbProCajas ;
   private short AV56TFAlbProCajas_To ;
   private short AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea ;
   private short AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to ;
   private short AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas ;
   private short AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to ;
   private short A13442AlbProLine ;
   private short A13449AlbProCaja ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV41AlbProId ;
   private int AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size ;
   private int A13418AlbProID ;
   private long AV28count ;
   private java.math.BigDecimal AV51TFAlbProCnt ;
   private java.math.BigDecimal AV52TFAlbProCnt_To ;
   private java.math.BigDecimal AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ;
   private java.math.BigDecimal AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private String AV47TFPrdNum ;
   private String AV48TFPrdNum_Sel ;
   private String AV49TFAlbProDsc ;
   private String AV50TFAlbProDsc_Sel ;
   private String AV40Emprcod ;
   private String AV42ALbProIDAT ;
   private String A719PrdNum ;
   private String AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ;
   private String AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ;
   private String AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ;
   private String AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ;
   private String scmdbuf ;
   private String lV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ;
   private String lV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ;
   private String A13444AlbProUnd ;
   private String A13448AlbProDsc ;
   private String A396EmprCod ;
   private java.util.Date AV43AlbProSys ;
   private java.util.Date AV44AlbProDate ;
   private boolean returnInSub ;
   private boolean brk9SR2 ;
   private boolean n13449AlbProCaja ;
   private boolean n13444AlbProUnd ;
   private boolean n13443AlbProCnt ;
   private boolean n13448AlbProDsc ;
   private boolean brk9SR4 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV53TFAlbProUnd_SelsJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09SR2_A396EmprCod ;
   private String[] P09SR2_A719PrdNum ;
   private int[] P09SR2_A13418AlbProID ;
   private short[] P09SR2_A13449AlbProCaja ;
   private boolean[] P09SR2_n13449AlbProCaja ;
   private String[] P09SR2_A13444AlbProUnd ;
   private boolean[] P09SR2_n13444AlbProUnd ;
   private java.math.BigDecimal[] P09SR2_A13443AlbProCnt ;
   private boolean[] P09SR2_n13443AlbProCnt ;
   private String[] P09SR2_A13448AlbProDsc ;
   private boolean[] P09SR2_n13448AlbProDsc ;
   private short[] P09SR2_A13442AlbProLine ;
   private String[] P09SR3_A396EmprCod ;
   private int[] P09SR3_A13418AlbProID ;
   private String[] P09SR3_A13448AlbProDsc ;
   private boolean[] P09SR3_n13448AlbProDsc ;
   private short[] P09SR3_A13449AlbProCaja ;
   private boolean[] P09SR3_n13449AlbProCaja ;
   private String[] P09SR3_A13444AlbProUnd ;
   private boolean[] P09SR3_n13444AlbProUnd ;
   private java.math.BigDecimal[] P09SR3_A13443AlbProCnt ;
   private boolean[] P09SR3_n13443AlbProCnt ;
   private String[] P09SR3_A719PrdNum ;
   private short[] P09SR3_A13442AlbProLine ;
   private GXSimpleCollection<String> AV54TFAlbProUnd_Sels ;
   private GXSimpleCollection<String> AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class documentotransporteproveedor_3getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09SR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ,
                                          short AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea ,
                                          short AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to ,
                                          String AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ,
                                          String AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ,
                                          String AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ,
                                          String AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ,
                                          int AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size ,
                                          short AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas ,
                                          short AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          int A13418AlbProID ,
                                          int AV41AlbProId ,
                                          String AV40Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, AlbProID, AlbProCaja, AlbProUnd, AlbProCnt, AlbProDsc, AlbProLine FROM TXPLALPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProID = ?)");
      if ( ! (0==AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09SR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ,
                                          short AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea ,
                                          short AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to ,
                                          String AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ,
                                          String AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ,
                                          String AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ,
                                          String AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ,
                                          int AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size ,
                                          short AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas ,
                                          short AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          String A396EmprCod ,
                                          String AV40Emprcod ,
                                          int A13418AlbProID ,
                                          int AV41AlbProId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[12];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProID, AlbProDsc, AlbProCaja, AlbProUnd, AlbProCnt, PrdNum, AlbProLine FROM TXPLALPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProID = ?)");
      if ( ! (0==AV63Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV72Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV73Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbProDsc" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P09SR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 1 :
                  return conditional_P09SR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((short[]) buf[11])[0] = rslt.getShort(8);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               return;
      }
   }

}

