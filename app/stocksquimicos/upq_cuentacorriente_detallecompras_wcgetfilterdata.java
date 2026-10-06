package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_detallecompras_wcgetfilterdata extends GXProcedure
{
   public upq_cuentacorriente_detallecompras_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_detallecompras_wcgetfilterdata.class ), "" );
   }

   public upq_cuentacorriente_detallecompras_wcgetfilterdata( int remoteHandle ,
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
      upq_cuentacorriente_detallecompras_wcgetfilterdata.this.aP5 = new String[] {""};
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
      upq_cuentacorriente_detallecompras_wcgetfilterdata.this.AV20DDOName = aP0;
      upq_cuentacorriente_detallecompras_wcgetfilterdata.this.AV18SearchTxt = aP1;
      upq_cuentacorriente_detallecompras_wcgetfilterdata.this.AV19SearchTxtTo = aP2;
      upq_cuentacorriente_detallecompras_wcgetfilterdata.this.aP3 = aP3;
      upq_cuentacorriente_detallecompras_wcgetfilterdata.this.aP4 = aP4;
      upq_cuentacorriente_detallecompras_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_ALBARAN") == 0 )
      {
         /* Execute user subroutine: 'LOADALBARANOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_ENTLOTN") == 0 )
      {
         /* Execute user subroutine: 'LOADENTLOTNOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_DetalleCompras_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.UPQ_CuentaCorriente_DetalleCompras_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_DetalleCompras_WCGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV10TFEntFecEnt = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBARAN") == 0 )
         {
            AV12TFAlbaran = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBARAN_SEL") == 0 )
         {
            AV13TFAlbaran_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIREM") == 0 )
         {
            AV14TFEntUniRem = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFEntUniRem_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN") == 0 )
         {
            AV16TFEntLotN = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN_SEL") == 0 )
         {
            AV17TFEntLotN_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV37Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV38Prdnum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBARANOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbaran = AV18SearchTxt ;
      AV13TFAlbaran_Sel = "" ;
      AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent = AV10TFEntFecEnt ;
      AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran = AV12TFAlbaran ;
      AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel = AV13TFAlbaran_Sel ;
      AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem = AV14TFEntUniRem ;
      AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to = AV15TFEntUniRem_To ;
      AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn = AV16TFEntLotN ;
      AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel = AV17TFEntLotN_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent ,
                                           AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel ,
                                           AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran ,
                                           AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem ,
                                           AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to ,
                                           AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel ,
                                           AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A396EmprCod ,
                                           AV37Emprcod ,
                                           A719PrdNum ,
                                           AV38Prdnum ,
                                           Byte.valueOf(A411EntCon) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran = GXutil.padr( GXutil.rtrim( AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran), 10, "%") ;
      lV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn = GXutil.padr( GXutil.rtrim( AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn), 26, "%") ;
      /* Using cursor P09HS2 */
      pr_default.execute(0, new Object[] {AV37Emprcod, AV38Prdnum, AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent, lV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran, AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel, AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem, AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to, lV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn, AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9HS2 = false ;
         A396EmprCod = P09HS2_A396EmprCod[0] ;
         A719PrdNum = P09HS2_A719PrdNum[0] ;
         A411EntCon = P09HS2_A411EntCon[0] ;
         A11Albaran = P09HS2_A11Albaran[0] ;
         A5686EntLotN = P09HS2_A5686EntLotN[0] ;
         A419EntUniRem = P09HS2_A419EntUniRem[0] ;
         A415EntFecEnt = P09HS2_A415EntFecEnt[0] ;
         A597LinEnt = P09HS2_A597LinEnt[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09HS2_A11Albaran[0], A11Albaran) == 0 ) )
         {
            brk9HS2 = false ;
            A396EmprCod = P09HS2_A396EmprCod[0] ;
            A719PrdNum = P09HS2_A719PrdNum[0] ;
            A597LinEnt = P09HS2_A597LinEnt[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9HS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11Albaran)==0) )
         {
            AV22Option = A11Albaran ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HS2 )
         {
            brk9HS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADENTLOTNOPTIONS' Routine */
      returnInSub = false ;
      AV16TFEntLotN = AV18SearchTxt ;
      AV17TFEntLotN_Sel = "" ;
      AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent = AV10TFEntFecEnt ;
      AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran = AV12TFAlbaran ;
      AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel = AV13TFAlbaran_Sel ;
      AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem = AV14TFEntUniRem ;
      AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to = AV15TFEntUniRem_To ;
      AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn = AV16TFEntLotN ;
      AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel = AV17TFEntLotN_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent ,
                                           AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel ,
                                           AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran ,
                                           AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem ,
                                           AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to ,
                                           AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel ,
                                           AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A396EmprCod ,
                                           AV37Emprcod ,
                                           A719PrdNum ,
                                           AV38Prdnum ,
                                           Byte.valueOf(A411EntCon) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran = GXutil.padr( GXutil.rtrim( AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran), 10, "%") ;
      lV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn = GXutil.padr( GXutil.rtrim( AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn), 26, "%") ;
      /* Using cursor P09HS3 */
      pr_default.execute(1, new Object[] {AV37Emprcod, AV38Prdnum, AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent, lV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran, AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel, AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem, AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to, lV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn, AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9HS4 = false ;
         A396EmprCod = P09HS3_A396EmprCod[0] ;
         A719PrdNum = P09HS3_A719PrdNum[0] ;
         A411EntCon = P09HS3_A411EntCon[0] ;
         A5686EntLotN = P09HS3_A5686EntLotN[0] ;
         A419EntUniRem = P09HS3_A419EntUniRem[0] ;
         A11Albaran = P09HS3_A11Albaran[0] ;
         A415EntFecEnt = P09HS3_A415EntFecEnt[0] ;
         A597LinEnt = P09HS3_A597LinEnt[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09HS3_A5686EntLotN[0], A5686EntLotN) == 0 ) )
         {
            brk9HS4 = false ;
            A396EmprCod = P09HS3_A396EmprCod[0] ;
            A719PrdNum = P09HS3_A719PrdNum[0] ;
            A597LinEnt = P09HS3_A597LinEnt[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9HS4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5686EntLotN)==0) )
         {
            AV22Option = A5686EntLotN ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HS4 )
         {
            brk9HS4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = upq_cuentacorriente_detallecompras_wcgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = upq_cuentacorriente_detallecompras_wcgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = upq_cuentacorriente_detallecompras_wcgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFEntFecEnt = GXutil.nullDate() ;
      AV12TFAlbaran = "" ;
      AV13TFAlbaran_Sel = "" ;
      AV14TFEntUniRem = DecimalUtil.ZERO ;
      AV15TFEntUniRem_To = DecimalUtil.ZERO ;
      AV16TFEntLotN = "" ;
      AV17TFEntLotN_Sel = "" ;
      AV37Emprcod = "" ;
      AV38Prdnum = "" ;
      A11Albaran = "" ;
      AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent = GXutil.nullDate() ;
      AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran = "" ;
      AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel = "" ;
      AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem = DecimalUtil.ZERO ;
      AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to = DecimalUtil.ZERO ;
      AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn = "" ;
      AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel = "" ;
      scmdbuf = "" ;
      lV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran = "" ;
      lV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09HS2_A396EmprCod = new String[] {""} ;
      P09HS2_A719PrdNum = new String[] {""} ;
      P09HS2_A411EntCon = new byte[1] ;
      P09HS2_A11Albaran = new String[] {""} ;
      P09HS2_A5686EntLotN = new String[] {""} ;
      P09HS2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HS2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HS2_A597LinEnt = new short[1] ;
      AV22Option = "" ;
      P09HS3_A396EmprCod = new String[] {""} ;
      P09HS3_A719PrdNum = new String[] {""} ;
      P09HS3_A411EntCon = new byte[1] ;
      P09HS3_A5686EntLotN = new String[] {""} ;
      P09HS3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HS3_A11Albaran = new String[] {""} ;
      P09HS3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HS3_A597LinEnt = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_detallecompras_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09HS2_A396EmprCod, P09HS2_A719PrdNum, P09HS2_A411EntCon, P09HS2_A11Albaran, P09HS2_A5686EntLotN, P09HS2_A419EntUniRem, P09HS2_A415EntFecEnt, P09HS2_A597LinEnt
            }
            , new Object[] {
            P09HS3_A396EmprCod, P09HS3_A719PrdNum, P09HS3_A411EntCon, P09HS3_A5686EntLotN, P09HS3_A419EntUniRem, P09HS3_A11Albaran, P09HS3_A415EntFecEnt, P09HS3_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A411EntCon ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private long AV30count ;
   private java.math.BigDecimal AV14TFEntUniRem ;
   private java.math.BigDecimal AV15TFEntUniRem_To ;
   private java.math.BigDecimal AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem ;
   private java.math.BigDecimal AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to ;
   private java.math.BigDecimal A419EntUniRem ;
   private String AV12TFAlbaran ;
   private String AV13TFAlbaran_Sel ;
   private String AV16TFEntLotN ;
   private String AV17TFEntLotN_Sel ;
   private String AV37Emprcod ;
   private String AV38Prdnum ;
   private String A11Albaran ;
   private String AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran ;
   private String AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel ;
   private String AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn ;
   private String AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel ;
   private String scmdbuf ;
   private String lV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran ;
   private String lV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn ;
   private String A5686EntLotN ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.util.Date AV10TFEntFecEnt ;
   private java.util.Date AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent ;
   private java.util.Date A415EntFecEnt ;
   private boolean returnInSub ;
   private boolean brk9HS2 ;
   private boolean brk9HS4 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09HS2_A396EmprCod ;
   private String[] P09HS2_A719PrdNum ;
   private byte[] P09HS2_A411EntCon ;
   private String[] P09HS2_A11Albaran ;
   private String[] P09HS2_A5686EntLotN ;
   private java.math.BigDecimal[] P09HS2_A419EntUniRem ;
   private java.util.Date[] P09HS2_A415EntFecEnt ;
   private short[] P09HS2_A597LinEnt ;
   private String[] P09HS3_A396EmprCod ;
   private String[] P09HS3_A719PrdNum ;
   private byte[] P09HS3_A411EntCon ;
   private String[] P09HS3_A5686EntLotN ;
   private java.math.BigDecimal[] P09HS3_A419EntUniRem ;
   private String[] P09HS3_A11Albaran ;
   private java.util.Date[] P09HS3_A415EntFecEnt ;
   private short[] P09HS3_A597LinEnt ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class upq_cuentacorriente_detallecompras_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent ,
                                          String AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel ,
                                          String AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran ,
                                          java.math.BigDecimal AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem ,
                                          java.math.BigDecimal AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to ,
                                          String AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel ,
                                          String AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          String A396EmprCod ,
                                          String AV37Emprcod ,
                                          String A719PrdNum ,
                                          String AV38Prdnum ,
                                          byte A411EntCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntCon, Albaran, EntLotN, EntUniRem, EntFecEnt, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Albaran" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09HS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent ,
                                          String AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel ,
                                          String AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran ,
                                          java.math.BigDecimal AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem ,
                                          java.math.BigDecimal AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to ,
                                          String AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel ,
                                          String AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          String A396EmprCod ,
                                          String AV37Emprcod ,
                                          String A719PrdNum ,
                                          String AV38Prdnum ,
                                          byte A411EntCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntCon, EntLotN, EntUniRem, Albaran, EntFecEnt, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_1_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV44Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_2_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_3_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_4_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_5_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV48Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_6_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Stocksquimicos_upq_cuentacorriente_detallecompras_wcds_7_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EntLotN" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P09HS2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() );
            case 1 :
                  return conditional_P09HS3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               return;
      }
   }

}

