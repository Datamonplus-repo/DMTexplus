package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_lineasgetfilterdata extends GXProcedure
{
   public documentotransportecomercial_lineasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_lineasgetfilterdata.class ), "" );
   }

   public documentotransportecomercial_lineasgetfilterdata( int remoteHandle ,
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
      documentotransportecomercial_lineasgetfilterdata.this.aP5 = new String[] {""};
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
      documentotransportecomercial_lineasgetfilterdata.this.AV61DDOName = aP0;
      documentotransportecomercial_lineasgetfilterdata.this.AV62SearchTxt = aP1;
      documentotransportecomercial_lineasgetfilterdata.this.AV63SearchTxtTo = aP2;
      documentotransportecomercial_lineasgetfilterdata.this.aP3 = aP3;
      documentotransportecomercial_lineasgetfilterdata.this.aP4 = aP4;
      documentotransportecomercial_lineasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV51Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV53OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV61DDOName), "DDO_ALBCOMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV61DDOName), "DDO_ALBCOMDC2") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMDC2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV61DDOName), "DDO_ALBUCODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBUCODSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV64OptionsJson = AV51Options.toJSonString(false) ;
      AV65OptionsDescJson = AV53OptionsDesc.toJSonString(false) ;
      AV66OptionIndexesJson = AV54OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV56Session.getValue("DocumentoTransporteComercial.DocumentoTransporteComercial_LineasGridState"), "") == 0 )
      {
         AV58GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteComercial.DocumentoTransporteComercial_LineasGridState"), null, null);
      }
      else
      {
         AV58GridState.fromxml(AV56Session.getValue("DocumentoTransporteComercial.DocumentoTransporteComercial_LineasGridState"), null, null);
      }
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV58GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV59GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV58GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMLIN") == 0 )
         {
            AV23TFAlbComLin = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFAlbComLin_To = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC") == 0 )
         {
            AV25TFAlbComDsc = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC_SEL") == 0 )
         {
            AV26TFAlbComDsc_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDC2") == 0 )
         {
            AV27TFAlbComDc2 = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDC2_SEL") == 0 )
         {
            AV28TFAlbComDc2_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCNT") == 0 )
         {
            AV33TFAlbComCnt = CommonUtil.decimalVal( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV34TFAlbComCnt_To = CommonUtil.decimalVal( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBUCODSC") == 0 )
         {
            AV31TFAlbUcoDsc = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBUCODSC_SEL") == 0 )
         {
            AV32TFAlbUcoDsc_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRE") == 0 )
         {
            AV35TFAlbComPre = CommonUtil.decimalVal( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV36TFAlbComPre_To = CommonUtil.decimalVal( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCIMPLIN") == 0 )
         {
            AV37TFAlbCImpLin = CommonUtil.decimalVal( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFAlbCImpLin_To = CommonUtil.decimalVal( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBCOMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV25TFAlbComDsc = AV62SearchTxt ;
      AV26TFAlbComDsc_Sel = "" ;
      AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV23TFAlbComLin ;
      AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV24TFAlbComLin_To ;
      AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV25TFAlbComDsc ;
      AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV26TFAlbComDsc_Sel ;
      AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV27TFAlbComDc2 ;
      AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV28TFAlbComDc2_Sel ;
      AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV33TFAlbComCnt ;
      AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV34TFAlbComCnt_To ;
      AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV31TFAlbUcoDsc ;
      AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV32TFAlbUcoDsc_Sel ;
      AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV35TFAlbComPre ;
      AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV36TFAlbComPre_To ;
      AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV37TFAlbCImpLin ;
      AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV38TFAlbCImpLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) ,
                                           Short.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) ,
                                           AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                           AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                           AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                           AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                           AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                           AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                           AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                           AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                           AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                           AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                           AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                           AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A15AlbComDsc ,
                                           A10806AlbComDc2 ,
                                           A13AlbComCnt ,
                                           A5144AlbUcoDsc ,
                                           A21AlbComPre ,
                                           A396EmprCod ,
                                           AV68EmprCod ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV69AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc), 40, "%") ;
      lV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = GXutil.padr( GXutil.rtrim( AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2), 100, "%") ;
      lV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = GXutil.padr( GXutil.rtrim( AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc), 8, "%") ;
      /* Using cursor P0A8V2 */
      pr_default.execute(0, new Object[] {AV68EmprCod, Integer.valueOf(AV69AlbComCod), Short.valueOf(AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin), Short.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to), lV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc, AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel, lV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2, AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel, AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt, AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to, lV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc, AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel, AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre, AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to, AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin, AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA8V2 = false ;
         A4717AlbComUni = P0A8V2_A4717AlbComUni[0] ;
         A396EmprCod = P0A8V2_A396EmprCod[0] ;
         A14AlbComCod = P0A8V2_A14AlbComCod[0] ;
         A15AlbComDsc = P0A8V2_A15AlbComDsc[0] ;
         A5144AlbUcoDsc = P0A8V2_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = P0A8V2_n5144AlbUcoDsc[0] ;
         A10806AlbComDc2 = P0A8V2_A10806AlbComDc2[0] ;
         A20AlbComLin = P0A8V2_A20AlbComLin[0] ;
         A13AlbComCnt = P0A8V2_A13AlbComCnt[0] ;
         A21AlbComPre = P0A8V2_A21AlbComPre[0] ;
         A5144AlbUcoDsc = P0A8V2_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = P0A8V2_n5144AlbUcoDsc[0] ;
         A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
         A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
         AV55count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A8V2_A15AlbComDsc[0], A15AlbComDsc) == 0 ) )
         {
            brkA8V2 = false ;
            A396EmprCod = P0A8V2_A396EmprCod[0] ;
            A14AlbComCod = P0A8V2_A14AlbComCod[0] ;
            A20AlbComLin = P0A8V2_A20AlbComLin[0] ;
            AV55count = (long)(AV55count+1) ;
            brkA8V2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A15AlbComDsc)==0) )
         {
            AV50Option = A15AlbComDsc ;
            AV51Options.add(AV50Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV55count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV51Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8V2 )
         {
            brkA8V2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBCOMDC2OPTIONS' Routine */
      returnInSub = false ;
      AV27TFAlbComDc2 = AV62SearchTxt ;
      AV28TFAlbComDc2_Sel = "" ;
      AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV23TFAlbComLin ;
      AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV24TFAlbComLin_To ;
      AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV25TFAlbComDsc ;
      AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV26TFAlbComDsc_Sel ;
      AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV27TFAlbComDc2 ;
      AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV28TFAlbComDc2_Sel ;
      AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV33TFAlbComCnt ;
      AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV34TFAlbComCnt_To ;
      AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV31TFAlbUcoDsc ;
      AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV32TFAlbUcoDsc_Sel ;
      AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV35TFAlbComPre ;
      AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV36TFAlbComPre_To ;
      AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV37TFAlbCImpLin ;
      AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV38TFAlbCImpLin_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) ,
                                           Short.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) ,
                                           AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                           AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                           AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                           AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                           AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                           AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                           AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                           AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                           AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                           AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                           AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                           AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A15AlbComDsc ,
                                           A10806AlbComDc2 ,
                                           A13AlbComCnt ,
                                           A5144AlbUcoDsc ,
                                           A21AlbComPre ,
                                           A396EmprCod ,
                                           AV68EmprCod ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV69AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc), 40, "%") ;
      lV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = GXutil.padr( GXutil.rtrim( AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2), 100, "%") ;
      lV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = GXutil.padr( GXutil.rtrim( AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc), 8, "%") ;
      /* Using cursor P0A8V3 */
      pr_default.execute(1, new Object[] {AV68EmprCod, Integer.valueOf(AV69AlbComCod), Short.valueOf(AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin), Short.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to), lV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc, AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel, lV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2, AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel, AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt, AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to, lV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc, AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel, AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre, AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to, AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin, AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA8V4 = false ;
         A4717AlbComUni = P0A8V3_A4717AlbComUni[0] ;
         A396EmprCod = P0A8V3_A396EmprCod[0] ;
         A14AlbComCod = P0A8V3_A14AlbComCod[0] ;
         A10806AlbComDc2 = P0A8V3_A10806AlbComDc2[0] ;
         A5144AlbUcoDsc = P0A8V3_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = P0A8V3_n5144AlbUcoDsc[0] ;
         A15AlbComDsc = P0A8V3_A15AlbComDsc[0] ;
         A20AlbComLin = P0A8V3_A20AlbComLin[0] ;
         A13AlbComCnt = P0A8V3_A13AlbComCnt[0] ;
         A21AlbComPre = P0A8V3_A21AlbComPre[0] ;
         A5144AlbUcoDsc = P0A8V3_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = P0A8V3_n5144AlbUcoDsc[0] ;
         A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
         A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
         AV55count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A8V3_A10806AlbComDc2[0], A10806AlbComDc2) == 0 ) )
         {
            brkA8V4 = false ;
            A396EmprCod = P0A8V3_A396EmprCod[0] ;
            A14AlbComCod = P0A8V3_A14AlbComCod[0] ;
            A20AlbComLin = P0A8V3_A20AlbComLin[0] ;
            AV55count = (long)(AV55count+1) ;
            brkA8V4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A10806AlbComDc2)==0) )
         {
            AV50Option = A10806AlbComDc2 ;
            AV51Options.add(AV50Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV55count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV51Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8V4 )
         {
            brkA8V4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBUCODSCOPTIONS' Routine */
      returnInSub = false ;
      AV31TFAlbUcoDsc = AV62SearchTxt ;
      AV32TFAlbUcoDsc_Sel = "" ;
      AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV23TFAlbComLin ;
      AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV24TFAlbComLin_To ;
      AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV25TFAlbComDsc ;
      AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV26TFAlbComDsc_Sel ;
      AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV27TFAlbComDc2 ;
      AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV28TFAlbComDc2_Sel ;
      AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV33TFAlbComCnt ;
      AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV34TFAlbComCnt_To ;
      AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV31TFAlbUcoDsc ;
      AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV32TFAlbUcoDsc_Sel ;
      AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV35TFAlbComPre ;
      AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV36TFAlbComPre_To ;
      AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV37TFAlbCImpLin ;
      AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV38TFAlbCImpLin_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) ,
                                           Short.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) ,
                                           AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                           AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                           AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                           AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                           AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                           AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                           AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                           AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                           AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                           AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                           AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                           AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A15AlbComDsc ,
                                           A10806AlbComDc2 ,
                                           A13AlbComCnt ,
                                           A5144AlbUcoDsc ,
                                           A21AlbComPre ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV69AlbComCod) ,
                                           AV68EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc), 40, "%") ;
      lV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = GXutil.padr( GXutil.rtrim( AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2), 100, "%") ;
      lV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = GXutil.padr( GXutil.rtrim( AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc), 8, "%") ;
      /* Using cursor P0A8V4 */
      pr_default.execute(2, new Object[] {AV68EmprCod, Integer.valueOf(AV69AlbComCod), Short.valueOf(AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin), Short.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to), lV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc, AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel, lV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2, AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel, AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt, AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to, lV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc, AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel, AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre, AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to, AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin, AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA8V6 = false ;
         A4717AlbComUni = P0A8V4_A4717AlbComUni[0] ;
         A396EmprCod = P0A8V4_A396EmprCod[0] ;
         A14AlbComCod = P0A8V4_A14AlbComCod[0] ;
         A5144AlbUcoDsc = P0A8V4_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = P0A8V4_n5144AlbUcoDsc[0] ;
         A10806AlbComDc2 = P0A8V4_A10806AlbComDc2[0] ;
         A15AlbComDsc = P0A8V4_A15AlbComDsc[0] ;
         A20AlbComLin = P0A8V4_A20AlbComLin[0] ;
         A13AlbComCnt = P0A8V4_A13AlbComCnt[0] ;
         A21AlbComPre = P0A8V4_A21AlbComPre[0] ;
         A5144AlbUcoDsc = P0A8V4_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = P0A8V4_n5144AlbUcoDsc[0] ;
         A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
         A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
         AV55count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A8V4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A8V4_A4717AlbComUni[0] == A4717AlbComUni ) )
         {
            brkA8V6 = false ;
            A14AlbComCod = P0A8V4_A14AlbComCod[0] ;
            A20AlbComLin = P0A8V4_A20AlbComLin[0] ;
            AV55count = (long)(AV55count+1) ;
            brkA8V6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5144AlbUcoDsc)==0) )
         {
            AV50Option = A5144AlbUcoDsc ;
            AV49InsertIndex = 1 ;
            while ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) < 0 ) )
            {
               AV49InsertIndex = (int)(AV49InsertIndex+1) ;
            }
            AV51Options.add(AV50Option, AV49InsertIndex);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV55count), "Z,ZZZ,ZZZ,ZZ9")), AV49InsertIndex);
         }
         if ( AV51Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8V6 )
         {
            brkA8V6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentotransportecomercial_lineasgetfilterdata.this.AV64OptionsJson;
      this.aP4[0] = documentotransportecomercial_lineasgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = documentotransportecomercial_lineasgetfilterdata.this.AV66OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV64OptionsJson = "" ;
      AV65OptionsDescJson = "" ;
      AV66OptionIndexesJson = "" ;
      AV51Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV53OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV56Session = httpContext.getWebSession();
      AV58GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV59GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV25TFAlbComDsc = "" ;
      AV26TFAlbComDsc_Sel = "" ;
      AV27TFAlbComDc2 = "" ;
      AV28TFAlbComDc2_Sel = "" ;
      AV33TFAlbComCnt = DecimalUtil.ZERO ;
      AV34TFAlbComCnt_To = DecimalUtil.ZERO ;
      AV31TFAlbUcoDsc = "" ;
      AV32TFAlbUcoDsc_Sel = "" ;
      AV35TFAlbComPre = DecimalUtil.ZERO ;
      AV36TFAlbComPre_To = DecimalUtil.ZERO ;
      AV37TFAlbCImpLin = DecimalUtil.ZERO ;
      AV38TFAlbCImpLin_To = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = "" ;
      AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = "" ;
      AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = "" ;
      AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = "" ;
      AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = DecimalUtil.ZERO ;
      AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = DecimalUtil.ZERO ;
      AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = "" ;
      AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = "" ;
      AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = DecimalUtil.ZERO ;
      AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = DecimalUtil.ZERO ;
      AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = DecimalUtil.ZERO ;
      AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = "" ;
      lV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = "" ;
      lV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = "" ;
      A10806AlbComDc2 = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A5144AlbUcoDsc = "" ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV68EmprCod = "" ;
      P0A8V2_A4717AlbComUni = new byte[1] ;
      P0A8V2_A396EmprCod = new String[] {""} ;
      P0A8V2_A14AlbComCod = new int[1] ;
      P0A8V2_A15AlbComDsc = new String[] {""} ;
      P0A8V2_A5144AlbUcoDsc = new String[] {""} ;
      P0A8V2_n5144AlbUcoDsc = new boolean[] {false} ;
      P0A8V2_A10806AlbComDc2 = new String[] {""} ;
      P0A8V2_A20AlbComLin = new short[1] ;
      P0A8V2_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A8V2_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3914AlbCImpL = DecimalUtil.ZERO ;
      A12AlbCImpLin = DecimalUtil.ZERO ;
      AV50Option = "" ;
      P0A8V3_A4717AlbComUni = new byte[1] ;
      P0A8V3_A396EmprCod = new String[] {""} ;
      P0A8V3_A14AlbComCod = new int[1] ;
      P0A8V3_A10806AlbComDc2 = new String[] {""} ;
      P0A8V3_A5144AlbUcoDsc = new String[] {""} ;
      P0A8V3_n5144AlbUcoDsc = new boolean[] {false} ;
      P0A8V3_A15AlbComDsc = new String[] {""} ;
      P0A8V3_A20AlbComLin = new short[1] ;
      P0A8V3_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A8V3_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A8V4_A4717AlbComUni = new byte[1] ;
      P0A8V4_A396EmprCod = new String[] {""} ;
      P0A8V4_A14AlbComCod = new int[1] ;
      P0A8V4_A5144AlbUcoDsc = new String[] {""} ;
      P0A8V4_n5144AlbUcoDsc = new boolean[] {false} ;
      P0A8V4_A10806AlbComDc2 = new String[] {""} ;
      P0A8V4_A15AlbComDsc = new String[] {""} ;
      P0A8V4_A20AlbComLin = new short[1] ;
      P0A8V4_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A8V4_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_lineasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A8V2_A4717AlbComUni, P0A8V2_A396EmprCod, P0A8V2_A14AlbComCod, P0A8V2_A15AlbComDsc, P0A8V2_A5144AlbUcoDsc, P0A8V2_n5144AlbUcoDsc, P0A8V2_A10806AlbComDc2, P0A8V2_A20AlbComLin, P0A8V2_A13AlbComCnt, P0A8V2_A21AlbComPre
            }
            , new Object[] {
            P0A8V3_A4717AlbComUni, P0A8V3_A396EmprCod, P0A8V3_A14AlbComCod, P0A8V3_A10806AlbComDc2, P0A8V3_A5144AlbUcoDsc, P0A8V3_n5144AlbUcoDsc, P0A8V3_A15AlbComDsc, P0A8V3_A20AlbComLin, P0A8V3_A13AlbComCnt, P0A8V3_A21AlbComPre
            }
            , new Object[] {
            P0A8V4_A4717AlbComUni, P0A8V4_A396EmprCod, P0A8V4_A14AlbComCod, P0A8V4_A5144AlbUcoDsc, P0A8V4_n5144AlbUcoDsc, P0A8V4_A10806AlbComDc2, P0A8V4_A15AlbComDsc, P0A8V4_A20AlbComLin, P0A8V4_A13AlbComCnt, P0A8V4_A21AlbComPre
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4717AlbComUni ;
   private short AV23TFAlbComLin ;
   private short AV24TFAlbComLin_To ;
   private short AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin ;
   private short AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV72GXV1 ;
   private int A14AlbComCod ;
   private int AV69AlbComCod ;
   private int AV49InsertIndex ;
   private long AV55count ;
   private java.math.BigDecimal AV33TFAlbComCnt ;
   private java.math.BigDecimal AV34TFAlbComCnt_To ;
   private java.math.BigDecimal AV35TFAlbComPre ;
   private java.math.BigDecimal AV36TFAlbComPre_To ;
   private java.math.BigDecimal AV37TFAlbCImpLin ;
   private java.math.BigDecimal AV38TFAlbCImpLin_To ;
   private java.math.BigDecimal AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ;
   private java.math.BigDecimal AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ;
   private java.math.BigDecimal AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ;
   private java.math.BigDecimal AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ;
   private java.math.BigDecimal AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ;
   private java.math.BigDecimal AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A3914AlbCImpL ;
   private java.math.BigDecimal A12AlbCImpLin ;
   private String AV25TFAlbComDsc ;
   private String AV26TFAlbComDsc_Sel ;
   private String AV27TFAlbComDc2 ;
   private String AV28TFAlbComDc2_Sel ;
   private String AV31TFAlbUcoDsc ;
   private String AV32TFAlbUcoDsc_Sel ;
   private String A15AlbComDsc ;
   private String AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ;
   private String AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ;
   private String AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ;
   private String AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ;
   private String AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ;
   private String AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ;
   private String scmdbuf ;
   private String lV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ;
   private String lV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ;
   private String lV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ;
   private String A10806AlbComDc2 ;
   private String A5144AlbUcoDsc ;
   private String A396EmprCod ;
   private String AV68EmprCod ;
   private boolean returnInSub ;
   private boolean brkA8V2 ;
   private boolean n5144AlbUcoDsc ;
   private boolean brkA8V4 ;
   private boolean brkA8V6 ;
   private String AV64OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV66OptionIndexesJson ;
   private String AV61DDOName ;
   private String AV62SearchTxt ;
   private String AV63SearchTxtTo ;
   private String AV50Option ;
   private com.genexus.webpanels.WebSession AV56Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0A8V2_A4717AlbComUni ;
   private String[] P0A8V2_A396EmprCod ;
   private int[] P0A8V2_A14AlbComCod ;
   private String[] P0A8V2_A15AlbComDsc ;
   private String[] P0A8V2_A5144AlbUcoDsc ;
   private boolean[] P0A8V2_n5144AlbUcoDsc ;
   private String[] P0A8V2_A10806AlbComDc2 ;
   private short[] P0A8V2_A20AlbComLin ;
   private java.math.BigDecimal[] P0A8V2_A13AlbComCnt ;
   private java.math.BigDecimal[] P0A8V2_A21AlbComPre ;
   private byte[] P0A8V3_A4717AlbComUni ;
   private String[] P0A8V3_A396EmprCod ;
   private int[] P0A8V3_A14AlbComCod ;
   private String[] P0A8V3_A10806AlbComDc2 ;
   private String[] P0A8V3_A5144AlbUcoDsc ;
   private boolean[] P0A8V3_n5144AlbUcoDsc ;
   private String[] P0A8V3_A15AlbComDsc ;
   private short[] P0A8V3_A20AlbComLin ;
   private java.math.BigDecimal[] P0A8V3_A13AlbComCnt ;
   private java.math.BigDecimal[] P0A8V3_A21AlbComPre ;
   private byte[] P0A8V4_A4717AlbComUni ;
   private String[] P0A8V4_A396EmprCod ;
   private int[] P0A8V4_A14AlbComCod ;
   private String[] P0A8V4_A5144AlbUcoDsc ;
   private boolean[] P0A8V4_n5144AlbUcoDsc ;
   private String[] P0A8V4_A10806AlbComDc2 ;
   private String[] P0A8V4_A15AlbComDsc ;
   private short[] P0A8V4_A20AlbComLin ;
   private java.math.BigDecimal[] P0A8V4_A13AlbComCnt ;
   private java.math.BigDecimal[] P0A8V4_A21AlbComPre ;
   private GXSimpleCollection<String> AV51Options ;
   private GXSimpleCollection<String> AV53OptionsDesc ;
   private GXSimpleCollection<String> AV54OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV58GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV59GridStateFilterValue ;
}

final  class documentotransportecomercial_lineasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A8V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin ,
                                          short AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to ,
                                          String AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                          String AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                          String AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                          String AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                          java.math.BigDecimal AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                          java.math.BigDecimal AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                          String AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                          String AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                          java.math.BigDecimal AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                          java.math.BigDecimal AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                          java.math.BigDecimal AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                          java.math.BigDecimal AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                          short A20AlbComLin ,
                                          String A15AlbComDsc ,
                                          String A10806AlbComDc2 ,
                                          java.math.BigDecimal A13AlbComCnt ,
                                          String A5144AlbUcoDsc ,
                                          java.math.BigDecimal A21AlbComPre ,
                                          String A396EmprCod ,
                                          String AV68EmprCod ,
                                          int A14AlbComCod ,
                                          int AV69AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbComUni AS AlbComUni, T1.EmprCod, T1.AlbComCod, T1.AlbComDsc, T2.UniDsc AS AlbUcoDsc, T1.AlbComDc2, T1.AlbComLin, T1.AlbComCnt, T1.AlbComPre FROM (TXPLALCOM" ;
      scmdbuf += " T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComCod = ?)");
      if ( ! (0==AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) )
      {
         addWhere(sWhereString, "(T1.AlbComLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(T1.AlbComLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDc2 = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.UniDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A8V3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin ,
                                          short AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to ,
                                          String AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                          String AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                          String AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                          String AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                          java.math.BigDecimal AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                          java.math.BigDecimal AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                          String AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                          String AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                          java.math.BigDecimal AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                          java.math.BigDecimal AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                          java.math.BigDecimal AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                          java.math.BigDecimal AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                          short A20AlbComLin ,
                                          String A15AlbComDsc ,
                                          String A10806AlbComDc2 ,
                                          java.math.BigDecimal A13AlbComCnt ,
                                          String A5144AlbUcoDsc ,
                                          java.math.BigDecimal A21AlbComPre ,
                                          String A396EmprCod ,
                                          String AV68EmprCod ,
                                          int A14AlbComCod ,
                                          int AV69AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[16];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.AlbComUni AS AlbComUni, T1.EmprCod, T1.AlbComCod, T1.AlbComDc2, T2.UniDsc AS AlbUcoDsc, T1.AlbComDsc, T1.AlbComLin, T1.AlbComCnt, T1.AlbComPre FROM (TXPLALCOM" ;
      scmdbuf += " T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComCod = ?)");
      if ( ! (0==AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) )
      {
         addWhere(sWhereString, "(T1.AlbComLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(T1.AlbComLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDc2 = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.UniDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComDc2" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A8V4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin ,
                                          short AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to ,
                                          String AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                          String AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                          String AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                          String AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                          java.math.BigDecimal AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                          java.math.BigDecimal AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                          String AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                          String AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                          java.math.BigDecimal AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                          java.math.BigDecimal AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                          java.math.BigDecimal AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                          java.math.BigDecimal AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                          short A20AlbComLin ,
                                          String A15AlbComDsc ,
                                          String A10806AlbComDc2 ,
                                          java.math.BigDecimal A13AlbComCnt ,
                                          String A5144AlbUcoDsc ,
                                          java.math.BigDecimal A21AlbComPre ,
                                          int A14AlbComCod ,
                                          int AV69AlbComCod ,
                                          String AV68EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.AlbComUni AS AlbComUni, T1.EmprCod, T1.AlbComCod, T2.UniDsc AS AlbUcoDsc, T1.AlbComDc2, T1.AlbComDsc, T1.AlbComLin, T1.AlbComCnt, T1.AlbComPre FROM (TXPLALCOM" ;
      scmdbuf += " T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComCod = ?)");
      if ( ! (0==AV74Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) )
      {
         addWhere(sWhereString, "(T1.AlbComLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV75Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(T1.AlbComLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDsc = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDc2 = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.UniDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbComUni" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0A8V2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() );
            case 1 :
                  return conditional_P0A8V3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() );
            case 2 :
                  return conditional_P0A8V4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A8V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8V3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8V4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 100);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               return;
      }
   }

}

