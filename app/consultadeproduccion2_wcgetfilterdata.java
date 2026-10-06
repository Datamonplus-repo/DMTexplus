package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion2_wcgetfilterdata extends GXProcedure
{
   public consultadeproduccion2_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion2_wcgetfilterdata.class ), "" );
   }

   public consultadeproduccion2_wcgetfilterdata( int remoteHandle ,
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
      consultadeproduccion2_wcgetfilterdata.this.aP5 = new String[] {""};
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
      consultadeproduccion2_wcgetfilterdata.this.AV14DDOName = aP0;
      consultadeproduccion2_wcgetfilterdata.this.AV12SearchTxt = aP1;
      consultadeproduccion2_wcgetfilterdata.this.AV13SearchTxtTo = aP2;
      consultadeproduccion2_wcgetfilterdata.this.aP3 = aP3;
      consultadeproduccion2_wcgetfilterdata.this.aP4 = aP4;
      consultadeproduccion2_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARENCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARENCCLIOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARNPED") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNPEDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV18OptionsJson = AV17Options.toJSonString(false) ;
      AV21OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV23OptionIndexesJson = AV22OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("ConsultadeProduccion2_WCGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion2_WCGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("ConsultadeProduccion2_WCGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV40TFBarEncCli = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV41TFBarEncCli_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFCliCod_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV44TFCliNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV45TFCliNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNPED") == 0 )
         {
            AV46TFBarNPed = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNPED_SEL") == 0 )
         {
            AV47TFBarNPed_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARENCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV40TFBarEncCli = AV12SearchTxt ;
      AV41TFBarEncCli_Sel = "" ;
      AV62Core_consultadeproduccion2_wcds_1_filterfulltext = AV30FilterFullText ;
      AV63Core_consultadeproduccion2_wcds_2_tfbarenccli = AV40TFBarEncCli ;
      AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel = AV41TFBarEncCli_Sel ;
      AV65Core_consultadeproduccion2_wcds_4_tfclicod = AV42TFCliCod ;
      AV66Core_consultadeproduccion2_wcds_5_tfclicod_to = AV43TFCliCod_To ;
      AV67Core_consultadeproduccion2_wcds_6_tfclinom = AV44TFCliNom ;
      AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel = AV45TFCliNom_Sel ;
      AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = AV10TFBarNHdr ;
      AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV71Core_consultadeproduccion2_wcds_10_tfbarnped = AV46TFBarNPed ;
      AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel = AV47TFBarNPed_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Core_consultadeproduccion2_wcds_1_filterfulltext ,
                                           AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ,
                                           AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ,
                                           Integer.valueOf(AV65Core_consultadeproduccion2_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV66Core_consultadeproduccion2_wcds_5_tfclicod_to) ,
                                           AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ,
                                           AV67Core_consultadeproduccion2_wcds_6_tfclinom ,
                                           AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ,
                                           AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ,
                                           AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ,
                                           AV71Core_consultadeproduccion2_wcds_10_tfbarnped ,
                                           A4812BarEncCli ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3746BarNPed ,
                                           A159BarFecGen ,
                                           AV49InoutBarFecGen ,
                                           AV50InoutBarFecGen_to ,
                                           A212BarSer ,
                                           AV51InoutBarSer ,
                                           A1652BarSerDsc ,
                                           AV52InoutBarSerDsc ,
                                           A135BarColNom ,
                                           AV53InoutBarColNom ,
                                           A1234BarNomCli ,
                                           AV54InoutBarNomCli ,
                                           Integer.valueOf(AV55InoutCliCod) ,
                                           Byte.valueOf(A213BarSit) ,
                                           Byte.valueOf(AV56InoutBarSit) ,
                                           Byte.valueOf(AV57InoutBarSit_to) ,
                                           A396EmprCod ,
                                           AV48EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51InoutBarSer = GXutil.padr( GXutil.rtrim( AV51InoutBarSer), 16, "%") ;
      lV52InoutBarSerDsc = GXutil.padr( GXutil.rtrim( AV52InoutBarSerDsc), 26, "%") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV63Core_consultadeproduccion2_wcds_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV63Core_consultadeproduccion2_wcds_2_tfbarenccli), 20, "%") ;
      lV67Core_consultadeproduccion2_wcds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV67Core_consultadeproduccion2_wcds_6_tfclinom), 30, "%") ;
      lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr), 11, "%") ;
      lV71Core_consultadeproduccion2_wcds_10_tfbarnped = GXutil.padr( GXutil.rtrim( AV71Core_consultadeproduccion2_wcds_10_tfbarnped), 20, "%") ;
      /* Using cursor P092P2 */
      pr_default.execute(0, new Object[] {AV49InoutBarFecGen, AV50InoutBarFecGen_to, lV51InoutBarSer, AV51InoutBarSer, lV52InoutBarSerDsc, AV52InoutBarSerDsc, AV53InoutBarColNom, AV53InoutBarColNom, AV54InoutBarNomCli, AV54InoutBarNomCli, Integer.valueOf(AV55InoutCliCod), Integer.valueOf(AV55InoutCliCod), Byte.valueOf(AV56InoutBarSit), Byte.valueOf(AV57InoutBarSit_to), AV48EmprCod, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV63Core_consultadeproduccion2_wcds_2_tfbarenccli, AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel, Integer.valueOf(AV65Core_consultadeproduccion2_wcds_4_tfclicod), Integer.valueOf(AV66Core_consultadeproduccion2_wcds_5_tfclicod_to), lV67Core_consultadeproduccion2_wcds_6_tfclinom, AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel, lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr, AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel, lV71Core_consultadeproduccion2_wcds_10_tfbarnped, AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk92P2 = false ;
         A396EmprCod = P092P2_A396EmprCod[0] ;
         A4812BarEncCli = P092P2_A4812BarEncCli[0] ;
         A213BarSit = P092P2_A213BarSit[0] ;
         A1234BarNomCli = P092P2_A1234BarNomCli[0] ;
         A135BarColNom = P092P2_A135BarColNom[0] ;
         A1652BarSerDsc = P092P2_A1652BarSerDsc[0] ;
         A212BarSer = P092P2_A212BarSer[0] ;
         A159BarFecGen = P092P2_A159BarFecGen[0] ;
         A252CliCod = P092P2_A252CliCod[0] ;
         n252CliCod = P092P2_n252CliCod[0] ;
         A3746BarNPed = P092P2_A3746BarNPed[0] ;
         A279CliNom = P092P2_A279CliNom[0] ;
         A130BarCodPar = P092P2_A130BarCodPar[0] ;
         A132BarCodReo = P092P2_A132BarCodReo[0] ;
         A129BarCod = P092P2_A129BarCod[0] ;
         A279CliNom = P092P2_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P092P2_A4812BarEncCli[0], A4812BarEncCli) == 0 ) )
         {
            brk92P2 = false ;
            A396EmprCod = P092P2_A396EmprCod[0] ;
            A130BarCodPar = P092P2_A130BarCodPar[0] ;
            A132BarCodReo = P092P2_A132BarCodReo[0] ;
            A129BarCod = P092P2_A129BarCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk92P2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4812BarEncCli)==0) )
         {
            AV16Option = A4812BarEncCli ;
            AV17Options.add(AV16Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk92P2 )
         {
            brk92P2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV44TFCliNom = AV12SearchTxt ;
      AV45TFCliNom_Sel = "" ;
      AV62Core_consultadeproduccion2_wcds_1_filterfulltext = AV30FilterFullText ;
      AV63Core_consultadeproduccion2_wcds_2_tfbarenccli = AV40TFBarEncCli ;
      AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel = AV41TFBarEncCli_Sel ;
      AV65Core_consultadeproduccion2_wcds_4_tfclicod = AV42TFCliCod ;
      AV66Core_consultadeproduccion2_wcds_5_tfclicod_to = AV43TFCliCod_To ;
      AV67Core_consultadeproduccion2_wcds_6_tfclinom = AV44TFCliNom ;
      AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel = AV45TFCliNom_Sel ;
      AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = AV10TFBarNHdr ;
      AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV71Core_consultadeproduccion2_wcds_10_tfbarnped = AV46TFBarNPed ;
      AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel = AV47TFBarNPed_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV62Core_consultadeproduccion2_wcds_1_filterfulltext ,
                                           AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ,
                                           AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ,
                                           Integer.valueOf(AV65Core_consultadeproduccion2_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV66Core_consultadeproduccion2_wcds_5_tfclicod_to) ,
                                           AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ,
                                           AV67Core_consultadeproduccion2_wcds_6_tfclinom ,
                                           AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ,
                                           AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ,
                                           AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ,
                                           AV71Core_consultadeproduccion2_wcds_10_tfbarnped ,
                                           A4812BarEncCli ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3746BarNPed ,
                                           A159BarFecGen ,
                                           AV49InoutBarFecGen ,
                                           AV50InoutBarFecGen_to ,
                                           A212BarSer ,
                                           AV51InoutBarSer ,
                                           A1652BarSerDsc ,
                                           AV52InoutBarSerDsc ,
                                           A135BarColNom ,
                                           AV53InoutBarColNom ,
                                           A1234BarNomCli ,
                                           AV54InoutBarNomCli ,
                                           Integer.valueOf(AV55InoutCliCod) ,
                                           Byte.valueOf(A213BarSit) ,
                                           Byte.valueOf(AV56InoutBarSit) ,
                                           Byte.valueOf(AV57InoutBarSit_to) ,
                                           A396EmprCod ,
                                           AV48EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51InoutBarSer = GXutil.padr( GXutil.rtrim( AV51InoutBarSer), 16, "%") ;
      lV52InoutBarSerDsc = GXutil.padr( GXutil.rtrim( AV52InoutBarSerDsc), 26, "%") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV63Core_consultadeproduccion2_wcds_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV63Core_consultadeproduccion2_wcds_2_tfbarenccli), 20, "%") ;
      lV67Core_consultadeproduccion2_wcds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV67Core_consultadeproduccion2_wcds_6_tfclinom), 30, "%") ;
      lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr), 11, "%") ;
      lV71Core_consultadeproduccion2_wcds_10_tfbarnped = GXutil.padr( GXutil.rtrim( AV71Core_consultadeproduccion2_wcds_10_tfbarnped), 20, "%") ;
      /* Using cursor P092P3 */
      pr_default.execute(1, new Object[] {AV49InoutBarFecGen, AV50InoutBarFecGen_to, lV51InoutBarSer, AV51InoutBarSer, lV52InoutBarSerDsc, AV52InoutBarSerDsc, AV53InoutBarColNom, AV53InoutBarColNom, AV54InoutBarNomCli, AV54InoutBarNomCli, Integer.valueOf(AV55InoutCliCod), Integer.valueOf(AV55InoutCliCod), Byte.valueOf(AV56InoutBarSit), Byte.valueOf(AV57InoutBarSit_to), AV48EmprCod, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV63Core_consultadeproduccion2_wcds_2_tfbarenccli, AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel, Integer.valueOf(AV65Core_consultadeproduccion2_wcds_4_tfclicod), Integer.valueOf(AV66Core_consultadeproduccion2_wcds_5_tfclicod_to), lV67Core_consultadeproduccion2_wcds_6_tfclinom, AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel, lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr, AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel, lV71Core_consultadeproduccion2_wcds_10_tfbarnped, AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk92P4 = false ;
         A396EmprCod = P092P3_A396EmprCod[0] ;
         A279CliNom = P092P3_A279CliNom[0] ;
         A213BarSit = P092P3_A213BarSit[0] ;
         A1234BarNomCli = P092P3_A1234BarNomCli[0] ;
         A135BarColNom = P092P3_A135BarColNom[0] ;
         A1652BarSerDsc = P092P3_A1652BarSerDsc[0] ;
         A212BarSer = P092P3_A212BarSer[0] ;
         A159BarFecGen = P092P3_A159BarFecGen[0] ;
         A252CliCod = P092P3_A252CliCod[0] ;
         n252CliCod = P092P3_n252CliCod[0] ;
         A3746BarNPed = P092P3_A3746BarNPed[0] ;
         A4812BarEncCli = P092P3_A4812BarEncCli[0] ;
         A130BarCodPar = P092P3_A130BarCodPar[0] ;
         A132BarCodReo = P092P3_A132BarCodReo[0] ;
         A129BarCod = P092P3_A129BarCod[0] ;
         A279CliNom = P092P3_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P092P3_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk92P4 = false ;
            A396EmprCod = P092P3_A396EmprCod[0] ;
            A252CliCod = P092P3_A252CliCod[0] ;
            n252CliCod = P092P3_n252CliCod[0] ;
            A130BarCodPar = P092P3_A130BarCodPar[0] ;
            A132BarCodReo = P092P3_A132BarCodReo[0] ;
            A129BarCod = P092P3_A129BarCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk92P4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV16Option = A279CliNom ;
            AV17Options.add(AV16Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk92P4 )
         {
            brk92P4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV12SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV62Core_consultadeproduccion2_wcds_1_filterfulltext = AV30FilterFullText ;
      AV63Core_consultadeproduccion2_wcds_2_tfbarenccli = AV40TFBarEncCli ;
      AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel = AV41TFBarEncCli_Sel ;
      AV65Core_consultadeproduccion2_wcds_4_tfclicod = AV42TFCliCod ;
      AV66Core_consultadeproduccion2_wcds_5_tfclicod_to = AV43TFCliCod_To ;
      AV67Core_consultadeproduccion2_wcds_6_tfclinom = AV44TFCliNom ;
      AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel = AV45TFCliNom_Sel ;
      AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = AV10TFBarNHdr ;
      AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV71Core_consultadeproduccion2_wcds_10_tfbarnped = AV46TFBarNPed ;
      AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel = AV47TFBarNPed_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV62Core_consultadeproduccion2_wcds_1_filterfulltext ,
                                           AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ,
                                           AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ,
                                           Integer.valueOf(AV65Core_consultadeproduccion2_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV66Core_consultadeproduccion2_wcds_5_tfclicod_to) ,
                                           AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ,
                                           AV67Core_consultadeproduccion2_wcds_6_tfclinom ,
                                           AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ,
                                           AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ,
                                           AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ,
                                           AV71Core_consultadeproduccion2_wcds_10_tfbarnped ,
                                           A4812BarEncCli ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3746BarNPed ,
                                           A159BarFecGen ,
                                           AV49InoutBarFecGen ,
                                           AV50InoutBarFecGen_to ,
                                           A212BarSer ,
                                           AV51InoutBarSer ,
                                           A1652BarSerDsc ,
                                           AV52InoutBarSerDsc ,
                                           A135BarColNom ,
                                           AV53InoutBarColNom ,
                                           A1234BarNomCli ,
                                           AV54InoutBarNomCli ,
                                           Integer.valueOf(AV55InoutCliCod) ,
                                           Byte.valueOf(A213BarSit) ,
                                           Byte.valueOf(AV56InoutBarSit) ,
                                           Byte.valueOf(AV57InoutBarSit_to) ,
                                           AV48EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51InoutBarSer = GXutil.padr( GXutil.rtrim( AV51InoutBarSer), 16, "%") ;
      lV52InoutBarSerDsc = GXutil.padr( GXutil.rtrim( AV52InoutBarSerDsc), 26, "%") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV63Core_consultadeproduccion2_wcds_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV63Core_consultadeproduccion2_wcds_2_tfbarenccli), 20, "%") ;
      lV67Core_consultadeproduccion2_wcds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV67Core_consultadeproduccion2_wcds_6_tfclinom), 30, "%") ;
      lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr), 11, "%") ;
      lV71Core_consultadeproduccion2_wcds_10_tfbarnped = GXutil.padr( GXutil.rtrim( AV71Core_consultadeproduccion2_wcds_10_tfbarnped), 20, "%") ;
      /* Using cursor P092P4 */
      pr_default.execute(2, new Object[] {AV48EmprCod, AV49InoutBarFecGen, AV50InoutBarFecGen_to, lV51InoutBarSer, AV51InoutBarSer, lV52InoutBarSerDsc, AV52InoutBarSerDsc, AV53InoutBarColNom, AV53InoutBarColNom, AV54InoutBarNomCli, AV54InoutBarNomCli, Integer.valueOf(AV55InoutCliCod), Integer.valueOf(AV55InoutCliCod), Byte.valueOf(AV56InoutBarSit), Byte.valueOf(AV57InoutBarSit_to), lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV63Core_consultadeproduccion2_wcds_2_tfbarenccli, AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel, Integer.valueOf(AV65Core_consultadeproduccion2_wcds_4_tfclicod), Integer.valueOf(AV66Core_consultadeproduccion2_wcds_5_tfclicod_to), lV67Core_consultadeproduccion2_wcds_6_tfclinom, AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel, lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr, AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel, lV71Core_consultadeproduccion2_wcds_10_tfbarnped, AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A213BarSit = P092P4_A213BarSit[0] ;
         A1234BarNomCli = P092P4_A1234BarNomCli[0] ;
         A135BarColNom = P092P4_A135BarColNom[0] ;
         A1652BarSerDsc = P092P4_A1652BarSerDsc[0] ;
         A212BarSer = P092P4_A212BarSer[0] ;
         A159BarFecGen = P092P4_A159BarFecGen[0] ;
         A396EmprCod = P092P4_A396EmprCod[0] ;
         A252CliCod = P092P4_A252CliCod[0] ;
         n252CliCod = P092P4_n252CliCod[0] ;
         A3746BarNPed = P092P4_A3746BarNPed[0] ;
         A279CliNom = P092P4_A279CliNom[0] ;
         A4812BarEncCli = P092P4_A4812BarEncCli[0] ;
         A130BarCodPar = P092P4_A130BarCodPar[0] ;
         A132BarCodReo = P092P4_A132BarCodReo[0] ;
         A129BarCod = P092P4_A129BarCod[0] ;
         A279CliNom = P092P4_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV16Option = A13696BarNHdr ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) == 0 ) )
            {
               AV24count = GXutil.lval( (String)AV22OptionIndexes.elementAt(-1+AV15InsertIndex)) ;
               AV24count = (long)(AV24count+1) ;
               AV22OptionIndexes.removeItem(AV15InsertIndex);
               AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), AV15InsertIndex);
            }
            else
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
               AV22OptionIndexes.add("1", AV15InsertIndex);
            }
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARNPEDOPTIONS' Routine */
      returnInSub = false ;
      AV46TFBarNPed = AV12SearchTxt ;
      AV47TFBarNPed_Sel = "" ;
      AV62Core_consultadeproduccion2_wcds_1_filterfulltext = AV30FilterFullText ;
      AV63Core_consultadeproduccion2_wcds_2_tfbarenccli = AV40TFBarEncCli ;
      AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel = AV41TFBarEncCli_Sel ;
      AV65Core_consultadeproduccion2_wcds_4_tfclicod = AV42TFCliCod ;
      AV66Core_consultadeproduccion2_wcds_5_tfclicod_to = AV43TFCliCod_To ;
      AV67Core_consultadeproduccion2_wcds_6_tfclinom = AV44TFCliNom ;
      AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel = AV45TFCliNom_Sel ;
      AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = AV10TFBarNHdr ;
      AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV71Core_consultadeproduccion2_wcds_10_tfbarnped = AV46TFBarNPed ;
      AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel = AV47TFBarNPed_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV62Core_consultadeproduccion2_wcds_1_filterfulltext ,
                                           AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ,
                                           AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ,
                                           Integer.valueOf(AV65Core_consultadeproduccion2_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV66Core_consultadeproduccion2_wcds_5_tfclicod_to) ,
                                           AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ,
                                           AV67Core_consultadeproduccion2_wcds_6_tfclinom ,
                                           AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ,
                                           AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ,
                                           AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ,
                                           AV71Core_consultadeproduccion2_wcds_10_tfbarnped ,
                                           A4812BarEncCli ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3746BarNPed ,
                                           A159BarFecGen ,
                                           AV49InoutBarFecGen ,
                                           AV50InoutBarFecGen_to ,
                                           A212BarSer ,
                                           AV51InoutBarSer ,
                                           A1652BarSerDsc ,
                                           AV52InoutBarSerDsc ,
                                           A135BarColNom ,
                                           AV53InoutBarColNom ,
                                           A1234BarNomCli ,
                                           AV54InoutBarNomCli ,
                                           Integer.valueOf(AV55InoutCliCod) ,
                                           Byte.valueOf(A213BarSit) ,
                                           Byte.valueOf(AV56InoutBarSit) ,
                                           Byte.valueOf(AV57InoutBarSit_to) ,
                                           A396EmprCod ,
                                           AV48EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51InoutBarSer = GXutil.padr( GXutil.rtrim( AV51InoutBarSer), 16, "%") ;
      lV52InoutBarSerDsc = GXutil.padr( GXutil.rtrim( AV52InoutBarSerDsc), 26, "%") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Core_consultadeproduccion2_wcds_1_filterfulltext), "%", "") ;
      lV63Core_consultadeproduccion2_wcds_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV63Core_consultadeproduccion2_wcds_2_tfbarenccli), 20, "%") ;
      lV67Core_consultadeproduccion2_wcds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV67Core_consultadeproduccion2_wcds_6_tfclinom), 30, "%") ;
      lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr), 11, "%") ;
      lV71Core_consultadeproduccion2_wcds_10_tfbarnped = GXutil.padr( GXutil.rtrim( AV71Core_consultadeproduccion2_wcds_10_tfbarnped), 20, "%") ;
      /* Using cursor P092P5 */
      pr_default.execute(3, new Object[] {AV49InoutBarFecGen, AV50InoutBarFecGen_to, lV51InoutBarSer, AV51InoutBarSer, lV52InoutBarSerDsc, AV52InoutBarSerDsc, AV53InoutBarColNom, AV53InoutBarColNom, AV54InoutBarNomCli, AV54InoutBarNomCli, Integer.valueOf(AV55InoutCliCod), Integer.valueOf(AV55InoutCliCod), Byte.valueOf(AV56InoutBarSit), Byte.valueOf(AV57InoutBarSit_to), AV48EmprCod, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV62Core_consultadeproduccion2_wcds_1_filterfulltext, lV63Core_consultadeproduccion2_wcds_2_tfbarenccli, AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel, Integer.valueOf(AV65Core_consultadeproduccion2_wcds_4_tfclicod), Integer.valueOf(AV66Core_consultadeproduccion2_wcds_5_tfclicod_to), lV67Core_consultadeproduccion2_wcds_6_tfclinom, AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel, lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr, AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel, lV71Core_consultadeproduccion2_wcds_10_tfbarnped, AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk92P7 = false ;
         A396EmprCod = P092P5_A396EmprCod[0] ;
         A3746BarNPed = P092P5_A3746BarNPed[0] ;
         A213BarSit = P092P5_A213BarSit[0] ;
         A1234BarNomCli = P092P5_A1234BarNomCli[0] ;
         A135BarColNom = P092P5_A135BarColNom[0] ;
         A1652BarSerDsc = P092P5_A1652BarSerDsc[0] ;
         A212BarSer = P092P5_A212BarSer[0] ;
         A159BarFecGen = P092P5_A159BarFecGen[0] ;
         A252CliCod = P092P5_A252CliCod[0] ;
         n252CliCod = P092P5_n252CliCod[0] ;
         A279CliNom = P092P5_A279CliNom[0] ;
         A4812BarEncCli = P092P5_A4812BarEncCli[0] ;
         A130BarCodPar = P092P5_A130BarCodPar[0] ;
         A132BarCodReo = P092P5_A132BarCodReo[0] ;
         A129BarCod = P092P5_A129BarCod[0] ;
         A279CliNom = P092P5_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P092P5_A3746BarNPed[0], A3746BarNPed) == 0 ) )
         {
            brk92P7 = false ;
            A396EmprCod = P092P5_A396EmprCod[0] ;
            A130BarCodPar = P092P5_A130BarCodPar[0] ;
            A132BarCodReo = P092P5_A132BarCodReo[0] ;
            A129BarCod = P092P5_A129BarCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk92P7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A3746BarNPed)==0) )
         {
            AV16Option = A3746BarNPed ;
            AV17Options.add(AV16Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk92P7 )
         {
            brk92P7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadeproduccion2_wcgetfilterdata.this.AV18OptionsJson;
      this.aP4[0] = consultadeproduccion2_wcgetfilterdata.this.AV21OptionsDescJson;
      this.aP5[0] = consultadeproduccion2_wcgetfilterdata.this.AV23OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18OptionsJson = "" ;
      AV21OptionsDescJson = "" ;
      AV23OptionIndexesJson = "" ;
      AV17Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV30FilterFullText = "" ;
      AV40TFBarEncCli = "" ;
      AV41TFBarEncCli_Sel = "" ;
      AV44TFCliNom = "" ;
      AV45TFCliNom_Sel = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV46TFBarNPed = "" ;
      AV47TFBarNPed_Sel = "" ;
      A4812BarEncCli = "" ;
      AV62Core_consultadeproduccion2_wcds_1_filterfulltext = "" ;
      AV63Core_consultadeproduccion2_wcds_2_tfbarenccli = "" ;
      AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel = "" ;
      AV67Core_consultadeproduccion2_wcds_6_tfclinom = "" ;
      AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel = "" ;
      AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = "" ;
      AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel = "" ;
      AV71Core_consultadeproduccion2_wcds_10_tfbarnped = "" ;
      AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel = "" ;
      lV51InoutBarSer = "" ;
      lV52InoutBarSerDsc = "" ;
      scmdbuf = "" ;
      lV62Core_consultadeproduccion2_wcds_1_filterfulltext = "" ;
      lV63Core_consultadeproduccion2_wcds_2_tfbarenccli = "" ;
      lV67Core_consultadeproduccion2_wcds_6_tfclinom = "" ;
      lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr = "" ;
      lV71Core_consultadeproduccion2_wcds_10_tfbarnped = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A3746BarNPed = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV49InoutBarFecGen = GXutil.nullDate() ;
      AV50InoutBarFecGen_to = GXutil.nullDate() ;
      A212BarSer = "" ;
      AV51InoutBarSer = "" ;
      A1652BarSerDsc = "" ;
      AV52InoutBarSerDsc = "" ;
      A135BarColNom = "" ;
      AV53InoutBarColNom = "" ;
      A1234BarNomCli = "" ;
      AV54InoutBarNomCli = "" ;
      A396EmprCod = "" ;
      AV48EmprCod = "" ;
      P092P2_A396EmprCod = new String[] {""} ;
      P092P2_A4812BarEncCli = new String[] {""} ;
      P092P2_A213BarSit = new byte[1] ;
      P092P2_A1234BarNomCli = new String[] {""} ;
      P092P2_A135BarColNom = new String[] {""} ;
      P092P2_A1652BarSerDsc = new String[] {""} ;
      P092P2_A212BarSer = new String[] {""} ;
      P092P2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P092P2_A252CliCod = new int[1] ;
      P092P2_n252CliCod = new boolean[] {false} ;
      P092P2_A3746BarNPed = new String[] {""} ;
      P092P2_A279CliNom = new String[] {""} ;
      P092P2_A130BarCodPar = new String[] {""} ;
      P092P2_A132BarCodReo = new byte[1] ;
      P092P2_A129BarCod = new int[1] ;
      A13696BarNHdr = "" ;
      AV16Option = "" ;
      P092P3_A396EmprCod = new String[] {""} ;
      P092P3_A279CliNom = new String[] {""} ;
      P092P3_A213BarSit = new byte[1] ;
      P092P3_A1234BarNomCli = new String[] {""} ;
      P092P3_A135BarColNom = new String[] {""} ;
      P092P3_A1652BarSerDsc = new String[] {""} ;
      P092P3_A212BarSer = new String[] {""} ;
      P092P3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P092P3_A252CliCod = new int[1] ;
      P092P3_n252CliCod = new boolean[] {false} ;
      P092P3_A3746BarNPed = new String[] {""} ;
      P092P3_A4812BarEncCli = new String[] {""} ;
      P092P3_A130BarCodPar = new String[] {""} ;
      P092P3_A132BarCodReo = new byte[1] ;
      P092P3_A129BarCod = new int[1] ;
      P092P4_A213BarSit = new byte[1] ;
      P092P4_A1234BarNomCli = new String[] {""} ;
      P092P4_A135BarColNom = new String[] {""} ;
      P092P4_A1652BarSerDsc = new String[] {""} ;
      P092P4_A212BarSer = new String[] {""} ;
      P092P4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P092P4_A396EmprCod = new String[] {""} ;
      P092P4_A252CliCod = new int[1] ;
      P092P4_n252CliCod = new boolean[] {false} ;
      P092P4_A3746BarNPed = new String[] {""} ;
      P092P4_A279CliNom = new String[] {""} ;
      P092P4_A4812BarEncCli = new String[] {""} ;
      P092P4_A130BarCodPar = new String[] {""} ;
      P092P4_A132BarCodReo = new byte[1] ;
      P092P4_A129BarCod = new int[1] ;
      P092P5_A396EmprCod = new String[] {""} ;
      P092P5_A3746BarNPed = new String[] {""} ;
      P092P5_A213BarSit = new byte[1] ;
      P092P5_A1234BarNomCli = new String[] {""} ;
      P092P5_A135BarColNom = new String[] {""} ;
      P092P5_A1652BarSerDsc = new String[] {""} ;
      P092P5_A212BarSer = new String[] {""} ;
      P092P5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P092P5_A252CliCod = new int[1] ;
      P092P5_n252CliCod = new boolean[] {false} ;
      P092P5_A279CliNom = new String[] {""} ;
      P092P5_A4812BarEncCli = new String[] {""} ;
      P092P5_A130BarCodPar = new String[] {""} ;
      P092P5_A132BarCodReo = new byte[1] ;
      P092P5_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion2_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P092P2_A396EmprCod, P092P2_A4812BarEncCli, P092P2_A213BarSit, P092P2_A1234BarNomCli, P092P2_A135BarColNom, P092P2_A1652BarSerDsc, P092P2_A212BarSer, P092P2_A159BarFecGen, P092P2_A252CliCod, P092P2_n252CliCod,
            P092P2_A3746BarNPed, P092P2_A279CliNom, P092P2_A130BarCodPar, P092P2_A132BarCodReo, P092P2_A129BarCod
            }
            , new Object[] {
            P092P3_A396EmprCod, P092P3_A279CliNom, P092P3_A213BarSit, P092P3_A1234BarNomCli, P092P3_A135BarColNom, P092P3_A1652BarSerDsc, P092P3_A212BarSer, P092P3_A159BarFecGen, P092P3_A252CliCod, P092P3_n252CliCod,
            P092P3_A3746BarNPed, P092P3_A4812BarEncCli, P092P3_A130BarCodPar, P092P3_A132BarCodReo, P092P3_A129BarCod
            }
            , new Object[] {
            P092P4_A213BarSit, P092P4_A1234BarNomCli, P092P4_A135BarColNom, P092P4_A1652BarSerDsc, P092P4_A212BarSer, P092P4_A159BarFecGen, P092P4_A396EmprCod, P092P4_A252CliCod, P092P4_n252CliCod, P092P4_A3746BarNPed,
            P092P4_A279CliNom, P092P4_A4812BarEncCli, P092P4_A130BarCodPar, P092P4_A132BarCodReo, P092P4_A129BarCod
            }
            , new Object[] {
            P092P5_A396EmprCod, P092P5_A3746BarNPed, P092P5_A213BarSit, P092P5_A1234BarNomCli, P092P5_A135BarColNom, P092P5_A1652BarSerDsc, P092P5_A212BarSer, P092P5_A159BarFecGen, P092P5_A252CliCod, P092P5_n252CliCod,
            P092P5_A279CliNom, P092P5_A4812BarEncCli, P092P5_A130BarCodPar, P092P5_A132BarCodReo, P092P5_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV56InoutBarSit ;
   private byte AV57InoutBarSit_to ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int AV42TFCliCod ;
   private int AV43TFCliCod_To ;
   private int AV65Core_consultadeproduccion2_wcds_4_tfclicod ;
   private int AV66Core_consultadeproduccion2_wcds_5_tfclicod_to ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV55InoutCliCod ;
   private int AV15InsertIndex ;
   private long AV24count ;
   private String AV40TFBarEncCli ;
   private String AV41TFBarEncCli_Sel ;
   private String AV44TFCliNom ;
   private String AV45TFCliNom_Sel ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV46TFBarNPed ;
   private String AV47TFBarNPed_Sel ;
   private String A4812BarEncCli ;
   private String AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ;
   private String AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ;
   private String AV67Core_consultadeproduccion2_wcds_6_tfclinom ;
   private String AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ;
   private String AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ;
   private String AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ;
   private String AV71Core_consultadeproduccion2_wcds_10_tfbarnped ;
   private String AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ;
   private String lV51InoutBarSer ;
   private String lV52InoutBarSerDsc ;
   private String scmdbuf ;
   private String lV63Core_consultadeproduccion2_wcds_2_tfbarenccli ;
   private String lV67Core_consultadeproduccion2_wcds_6_tfclinom ;
   private String lV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ;
   private String lV71Core_consultadeproduccion2_wcds_10_tfbarnped ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A3746BarNPed ;
   private String A212BarSer ;
   private String AV51InoutBarSer ;
   private String A1652BarSerDsc ;
   private String AV52InoutBarSerDsc ;
   private String A135BarColNom ;
   private String AV53InoutBarColNom ;
   private String A1234BarNomCli ;
   private String AV54InoutBarNomCli ;
   private String A396EmprCod ;
   private String AV48EmprCod ;
   private String A13696BarNHdr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV49InoutBarFecGen ;
   private java.util.Date AV50InoutBarFecGen_to ;
   private boolean returnInSub ;
   private boolean brk92P2 ;
   private boolean n252CliCod ;
   private boolean brk92P4 ;
   private boolean brk92P7 ;
   private String AV18OptionsJson ;
   private String AV21OptionsDescJson ;
   private String AV23OptionIndexesJson ;
   private String AV14DDOName ;
   private String AV12SearchTxt ;
   private String AV13SearchTxtTo ;
   private String AV30FilterFullText ;
   private String AV62Core_consultadeproduccion2_wcds_1_filterfulltext ;
   private String lV62Core_consultadeproduccion2_wcds_1_filterfulltext ;
   private String AV16Option ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P092P2_A396EmprCod ;
   private String[] P092P2_A4812BarEncCli ;
   private byte[] P092P2_A213BarSit ;
   private String[] P092P2_A1234BarNomCli ;
   private String[] P092P2_A135BarColNom ;
   private String[] P092P2_A1652BarSerDsc ;
   private String[] P092P2_A212BarSer ;
   private java.util.Date[] P092P2_A159BarFecGen ;
   private int[] P092P2_A252CliCod ;
   private boolean[] P092P2_n252CliCod ;
   private String[] P092P2_A3746BarNPed ;
   private String[] P092P2_A279CliNom ;
   private String[] P092P2_A130BarCodPar ;
   private byte[] P092P2_A132BarCodReo ;
   private int[] P092P2_A129BarCod ;
   private String[] P092P3_A396EmprCod ;
   private String[] P092P3_A279CliNom ;
   private byte[] P092P3_A213BarSit ;
   private String[] P092P3_A1234BarNomCli ;
   private String[] P092P3_A135BarColNom ;
   private String[] P092P3_A1652BarSerDsc ;
   private String[] P092P3_A212BarSer ;
   private java.util.Date[] P092P3_A159BarFecGen ;
   private int[] P092P3_A252CliCod ;
   private boolean[] P092P3_n252CliCod ;
   private String[] P092P3_A3746BarNPed ;
   private String[] P092P3_A4812BarEncCli ;
   private String[] P092P3_A130BarCodPar ;
   private byte[] P092P3_A132BarCodReo ;
   private int[] P092P3_A129BarCod ;
   private byte[] P092P4_A213BarSit ;
   private String[] P092P4_A1234BarNomCli ;
   private String[] P092P4_A135BarColNom ;
   private String[] P092P4_A1652BarSerDsc ;
   private String[] P092P4_A212BarSer ;
   private java.util.Date[] P092P4_A159BarFecGen ;
   private String[] P092P4_A396EmprCod ;
   private int[] P092P4_A252CliCod ;
   private boolean[] P092P4_n252CliCod ;
   private String[] P092P4_A3746BarNPed ;
   private String[] P092P4_A279CliNom ;
   private String[] P092P4_A4812BarEncCli ;
   private String[] P092P4_A130BarCodPar ;
   private byte[] P092P4_A132BarCodReo ;
   private int[] P092P4_A129BarCod ;
   private String[] P092P5_A396EmprCod ;
   private String[] P092P5_A3746BarNPed ;
   private byte[] P092P5_A213BarSit ;
   private String[] P092P5_A1234BarNomCli ;
   private String[] P092P5_A135BarColNom ;
   private String[] P092P5_A1652BarSerDsc ;
   private String[] P092P5_A212BarSer ;
   private java.util.Date[] P092P5_A159BarFecGen ;
   private int[] P092P5_A252CliCod ;
   private boolean[] P092P5_n252CliCod ;
   private String[] P092P5_A279CliNom ;
   private String[] P092P5_A4812BarEncCli ;
   private String[] P092P5_A130BarCodPar ;
   private byte[] P092P5_A132BarCodReo ;
   private int[] P092P5_A129BarCod ;
   private GXSimpleCollection<String> AV17Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV22OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class consultadeproduccion2_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P092P2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Core_consultadeproduccion2_wcds_1_filterfulltext ,
                                          String AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ,
                                          String AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ,
                                          int AV65Core_consultadeproduccion2_wcds_4_tfclicod ,
                                          int AV66Core_consultadeproduccion2_wcds_5_tfclicod_to ,
                                          String AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ,
                                          String AV67Core_consultadeproduccion2_wcds_6_tfclinom ,
                                          String AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ,
                                          String AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ,
                                          String AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ,
                                          String AV71Core_consultadeproduccion2_wcds_10_tfbarnped ,
                                          String A4812BarEncCli ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3746BarNPed ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV49InoutBarFecGen ,
                                          java.util.Date AV50InoutBarFecGen_to ,
                                          String A212BarSer ,
                                          String AV51InoutBarSer ,
                                          String A1652BarSerDsc ,
                                          String AV52InoutBarSerDsc ,
                                          String A135BarColNom ,
                                          String AV53InoutBarColNom ,
                                          String A1234BarNomCli ,
                                          String AV54InoutBarNomCli ,
                                          int AV55InoutCliCod ,
                                          byte A213BarSit ,
                                          byte AV56InoutBarSit ,
                                          byte AV57InoutBarSit_to ,
                                          String A396EmprCod ,
                                          String AV48EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarEncCli, T1.BarSit, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarFecGen, T1.CliCod, T1.BarNPed, T2.CliNom, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarSerDsc like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarColNom = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarNomCli = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV62Core_consultadeproduccion2_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( T1.BarEncCli like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( T2.CliNom like '%' || ?) or ( RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like '%' || ?) or ( T1.BarNPed like '%' || ?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
         GXv_int2[18] = (byte)(1) ;
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV63Core_consultadeproduccion2_wcds_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarEncCli like ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Core_consultadeproduccion2_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Core_consultadeproduccion2_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV67Core_consultadeproduccion2_wcds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV71Core_consultadeproduccion2_wcds_10_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarNPed like ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNPed = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarEncCli" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P092P3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Core_consultadeproduccion2_wcds_1_filterfulltext ,
                                          String AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ,
                                          String AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ,
                                          int AV65Core_consultadeproduccion2_wcds_4_tfclicod ,
                                          int AV66Core_consultadeproduccion2_wcds_5_tfclicod_to ,
                                          String AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ,
                                          String AV67Core_consultadeproduccion2_wcds_6_tfclinom ,
                                          String AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ,
                                          String AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ,
                                          String AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ,
                                          String AV71Core_consultadeproduccion2_wcds_10_tfbarnped ,
                                          String A4812BarEncCli ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3746BarNPed ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV49InoutBarFecGen ,
                                          java.util.Date AV50InoutBarFecGen_to ,
                                          String A212BarSer ,
                                          String AV51InoutBarSer ,
                                          String A1652BarSerDsc ,
                                          String AV52InoutBarSerDsc ,
                                          String A135BarColNom ,
                                          String AV53InoutBarColNom ,
                                          String A1234BarNomCli ,
                                          String AV54InoutBarNomCli ,
                                          int AV55InoutCliCod ,
                                          byte A213BarSit ,
                                          byte AV56InoutBarSit ,
                                          byte AV57InoutBarSit_to ,
                                          String A396EmprCod ,
                                          String AV48EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[30];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.BarSit, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarFecGen, T1.CliCod, T1.BarNPed, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarSerDsc like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarColNom = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarNomCli = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV62Core_consultadeproduccion2_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( T1.BarEncCli like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( T2.CliNom like '%' || ?) or ( RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like '%' || ?) or ( T1.BarNPed like '%' || ?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
         GXv_int4[16] = (byte)(1) ;
         GXv_int4[17] = (byte)(1) ;
         GXv_int4[18] = (byte)(1) ;
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV63Core_consultadeproduccion2_wcds_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarEncCli like ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Core_consultadeproduccion2_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Core_consultadeproduccion2_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV67Core_consultadeproduccion2_wcds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV71Core_consultadeproduccion2_wcds_10_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarNPed like ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNPed = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P092P4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Core_consultadeproduccion2_wcds_1_filterfulltext ,
                                          String AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ,
                                          String AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ,
                                          int AV65Core_consultadeproduccion2_wcds_4_tfclicod ,
                                          int AV66Core_consultadeproduccion2_wcds_5_tfclicod_to ,
                                          String AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ,
                                          String AV67Core_consultadeproduccion2_wcds_6_tfclinom ,
                                          String AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ,
                                          String AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ,
                                          String AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ,
                                          String AV71Core_consultadeproduccion2_wcds_10_tfbarnped ,
                                          String A4812BarEncCli ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3746BarNPed ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV49InoutBarFecGen ,
                                          java.util.Date AV50InoutBarFecGen_to ,
                                          String A212BarSer ,
                                          String AV51InoutBarSer ,
                                          String A1652BarSerDsc ,
                                          String AV52InoutBarSerDsc ,
                                          String A135BarColNom ,
                                          String AV53InoutBarColNom ,
                                          String A1234BarNomCli ,
                                          String AV54InoutBarNomCli ,
                                          int AV55InoutCliCod ,
                                          byte A213BarSit ,
                                          byte AV56InoutBarSit ,
                                          byte AV57InoutBarSit_to ,
                                          String AV48EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.BarSit, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarFecGen, T1.EmprCod, T1.CliCod, T1.BarNPed, T2.CliNom, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarSerDsc like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarColNom = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarNomCli = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (GXutil.strcmp("", AV62Core_consultadeproduccion2_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( T1.BarEncCli like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( T2.CliNom like '%' || ?) or ( RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like '%' || ?) or ( T1.BarNPed like '%' || ?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
         GXv_int6[18] = (byte)(1) ;
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV63Core_consultadeproduccion2_wcds_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarEncCli like ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Core_consultadeproduccion2_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Core_consultadeproduccion2_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV67Core_consultadeproduccion2_wcds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV71Core_consultadeproduccion2_wcds_10_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarNPed like ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNPed = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P092P5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Core_consultadeproduccion2_wcds_1_filterfulltext ,
                                          String AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel ,
                                          String AV63Core_consultadeproduccion2_wcds_2_tfbarenccli ,
                                          int AV65Core_consultadeproduccion2_wcds_4_tfclicod ,
                                          int AV66Core_consultadeproduccion2_wcds_5_tfclicod_to ,
                                          String AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel ,
                                          String AV67Core_consultadeproduccion2_wcds_6_tfclinom ,
                                          String AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel ,
                                          String AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr ,
                                          String AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel ,
                                          String AV71Core_consultadeproduccion2_wcds_10_tfbarnped ,
                                          String A4812BarEncCli ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3746BarNPed ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV49InoutBarFecGen ,
                                          java.util.Date AV50InoutBarFecGen_to ,
                                          String A212BarSer ,
                                          String AV51InoutBarSer ,
                                          String A1652BarSerDsc ,
                                          String AV52InoutBarSerDsc ,
                                          String A135BarColNom ,
                                          String AV53InoutBarColNom ,
                                          String A1234BarNomCli ,
                                          String AV54InoutBarNomCli ,
                                          int AV55InoutCliCod ,
                                          byte A213BarSit ,
                                          byte AV56InoutBarSit ,
                                          byte AV57InoutBarSit_to ,
                                          String A396EmprCod ,
                                          String AV48EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNPed, T1.BarSit, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarFecGen, T1.CliCod, T2.CliNom, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarSerDsc like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarColNom = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarNomCli = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV62Core_consultadeproduccion2_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( T1.BarEncCli like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( T2.CliNom like '%' || ?) or ( RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like '%' || ?) or ( T1.BarNPed like '%' || ?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
         GXv_int8[18] = (byte)(1) ;
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV63Core_consultadeproduccion2_wcds_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarEncCli like ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Core_consultadeproduccion2_wcds_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV65Core_consultadeproduccion2_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV66Core_consultadeproduccion2_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV67Core_consultadeproduccion2_wcds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Core_consultadeproduccion2_wcds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_consultadeproduccion2_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_consultadeproduccion2_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV71Core_consultadeproduccion2_wcds_10_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(T1.BarNPed like ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Core_consultadeproduccion2_wcds_11_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNPed = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNPed" ;
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
                  return conditional_P092P2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_P092P3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 2 :
                  return conditional_P092P4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 3 :
                  return conditional_P092P5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P092P2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092P3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092P4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092P5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               return;
      }
   }

}

