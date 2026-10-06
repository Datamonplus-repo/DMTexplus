package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webdatospedidocolorgetfilterdata extends GXProcedure
{
   public webdatospedidocolorgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webdatospedidocolorgetfilterdata.class ), "" );
   }

   public webdatospedidocolorgetfilterdata( int remoteHandle ,
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
      webdatospedidocolorgetfilterdata.this.aP5 = new String[] {""};
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
      webdatospedidocolorgetfilterdata.this.AV72DDOName = aP0;
      webdatospedidocolorgetfilterdata.this.AV70SearchTxt = aP1;
      webdatospedidocolorgetfilterdata.this.AV71SearchTxtTo = aP2;
      webdatospedidocolorgetfilterdata.this.aP3 = aP3;
      webdatospedidocolorgetfilterdata.this.aP4 = aP4;
      webdatospedidocolorgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV75Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV78OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV80OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_FORNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADFORNOMCLIOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_FORTONAL") == 0 )
      {
         /* Execute user subroutine: 'LOADFORTONALOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV76OptionsJson = AV75Options.toJSonString(false) ;
      AV79OptionsDescJson = AV78OptionsDesc.toJSonString(false) ;
      AV81OptionIndexesJson = AV80OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV83Session.getValue("WebDatosPedidoColorGridState"), "") == 0 )
      {
         AV85GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebDatosPedidoColorGridState"), null, null);
      }
      else
      {
         AV85GridState.fromxml(AV83Session.getValue("WebDatosPedidoColorGridState"), null, null);
      }
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV85GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV86GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV85GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV1));
         if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV88FilterFullText = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV14TFForSer = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV15TFForSer_Sel = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV16TFForColNom = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV17TFForColNom_Sel = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV18TFForColNum = (int)(GXutil.lval( AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFForColNum_To = (int)(GXutil.lval( AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV20TFTipColCod = (byte)(GXutil.lval( AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFTipColCod_To = (byte)(GXutil.lval( AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV26TFForNomCli = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV27TFForNomCli_Sel = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCLI") == 0 )
         {
            AV24TFForNumCli = (int)(GXutil.lval( AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFForNumCli_To = (int)(GXutil.lval( AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL") == 0 )
         {
            AV58TFForTonal = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL_SEL") == 0 )
         {
            AV59TFForTonal_Sel = AV86GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSer = AV70SearchTxt ;
      AV15TFForSer_Sel = "" ;
      AV101Webdatospedidocolords_1_filterfulltext = AV88FilterFullText ;
      AV102Webdatospedidocolords_2_tfforser = AV14TFForSer ;
      AV103Webdatospedidocolords_3_tfforser_sel = AV15TFForSer_Sel ;
      AV104Webdatospedidocolords_4_tfforcolnom = AV16TFForColNom ;
      AV105Webdatospedidocolords_5_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV106Webdatospedidocolords_6_tfforcolnum = AV18TFForColNum ;
      AV107Webdatospedidocolords_7_tfforcolnum_to = AV19TFForColNum_To ;
      AV108Webdatospedidocolords_8_tftipcolcod = AV20TFTipColCod ;
      AV109Webdatospedidocolords_9_tftipcolcod_to = AV21TFTipColCod_To ;
      AV110Webdatospedidocolords_10_tffornomcli = AV26TFForNomCli ;
      AV111Webdatospedidocolords_11_tffornomcli_sel = AV27TFForNomCli_Sel ;
      AV112Webdatospedidocolords_12_tffornumcli = AV24TFForNumCli ;
      AV113Webdatospedidocolords_13_tffornumcli_to = AV25TFForNumCli_To ;
      AV114Webdatospedidocolords_14_tffortonal = AV58TFForTonal ;
      AV115Webdatospedidocolords_15_tffortonal_sel = AV59TFForTonal_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV101Webdatospedidocolords_1_filterfulltext ,
                                           AV103Webdatospedidocolords_3_tfforser_sel ,
                                           AV102Webdatospedidocolords_2_tfforser ,
                                           AV105Webdatospedidocolords_5_tfforcolnom_sel ,
                                           AV104Webdatospedidocolords_4_tfforcolnom ,
                                           Integer.valueOf(AV106Webdatospedidocolords_6_tfforcolnum) ,
                                           Integer.valueOf(AV107Webdatospedidocolords_7_tfforcolnum_to) ,
                                           Byte.valueOf(AV108Webdatospedidocolords_8_tftipcolcod) ,
                                           Byte.valueOf(AV109Webdatospedidocolords_9_tftipcolcod_to) ,
                                           AV111Webdatospedidocolords_11_tffornomcli_sel ,
                                           AV110Webdatospedidocolords_10_tffornomcli ,
                                           Integer.valueOf(AV112Webdatospedidocolords_12_tffornumcli) ,
                                           Integer.valueOf(AV113Webdatospedidocolords_13_tffornumcli_to) ,
                                           AV115Webdatospedidocolords_15_tffortonal_sel ,
                                           AV114Webdatospedidocolords_14_tffortonal ,
                                           AV96pForSer ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           AV89EmprCod ,
                                           Integer.valueOf(AV90CliCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV102Webdatospedidocolords_2_tfforser = GXutil.padr( GXutil.rtrim( AV102Webdatospedidocolords_2_tfforser), 16, "%") ;
      lV104Webdatospedidocolords_4_tfforcolnom = GXutil.padr( GXutil.rtrim( AV104Webdatospedidocolords_4_tfforcolnom), 13, "%") ;
      lV110Webdatospedidocolords_10_tffornomcli = GXutil.padr( GXutil.rtrim( AV110Webdatospedidocolords_10_tffornomcli), 13, "%") ;
      lV114Webdatospedidocolords_14_tffortonal = GXutil.padr( GXutil.rtrim( AV114Webdatospedidocolords_14_tffortonal), 20, "%") ;
      /* Using cursor P086X2 */
      pr_default.execute(0, new Object[] {AV89EmprCod, Integer.valueOf(AV90CliCod), lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV102Webdatospedidocolords_2_tfforser, AV103Webdatospedidocolords_3_tfforser_sel, lV104Webdatospedidocolords_4_tfforcolnom, AV105Webdatospedidocolords_5_tfforcolnom_sel, Integer.valueOf(AV106Webdatospedidocolords_6_tfforcolnum), Integer.valueOf(AV107Webdatospedidocolords_7_tfforcolnum_to), Byte.valueOf(AV108Webdatospedidocolords_8_tftipcolcod), Byte.valueOf(AV109Webdatospedidocolords_9_tftipcolcod_to), lV110Webdatospedidocolords_10_tffornomcli, AV111Webdatospedidocolords_11_tffornomcli_sel, Integer.valueOf(AV112Webdatospedidocolords_12_tffornumcli), Integer.valueOf(AV113Webdatospedidocolords_13_tffornumcli_to), lV114Webdatospedidocolords_14_tffortonal, AV115Webdatospedidocolords_15_tffortonal_sel, AV96pForSer});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk86X2 = false ;
         A252CliCod = P086X2_A252CliCod[0] ;
         A396EmprCod = P086X2_A396EmprCod[0] ;
         A494ForSer = P086X2_A494ForSer[0] ;
         A995ForTonal = P086X2_A995ForTonal[0] ;
         n995ForTonal = P086X2_n995ForTonal[0] ;
         A1192ForNumCli = P086X2_A1192ForNumCli[0] ;
         n1192ForNumCli = P086X2_n1192ForNumCli[0] ;
         A1191ForNomCli = P086X2_A1191ForNomCli[0] ;
         n1191ForNomCli = P086X2_n1191ForNomCli[0] ;
         A831TipColCod = P086X2_A831TipColCod[0] ;
         A483ForColNum = P086X2_A483ForColNum[0] ;
         A482ForColNom = P086X2_A482ForColNom[0] ;
         AV82count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P086X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086X2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P086X2_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk86X2 = false ;
            A831TipColCod = P086X2_A831TipColCod[0] ;
            A483ForColNum = P086X2_A483ForColNum[0] ;
            A482ForColNom = P086X2_A482ForColNom[0] ;
            AV82count = (long)(AV82count+1) ;
            brk86X2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV74Option = A494ForSer ;
            AV75Options.add(AV74Option, 0);
            AV80OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV82count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV75Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk86X2 )
         {
            brk86X2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForColNom = AV70SearchTxt ;
      AV17TFForColNom_Sel = "" ;
      AV101Webdatospedidocolords_1_filterfulltext = AV88FilterFullText ;
      AV102Webdatospedidocolords_2_tfforser = AV14TFForSer ;
      AV103Webdatospedidocolords_3_tfforser_sel = AV15TFForSer_Sel ;
      AV104Webdatospedidocolords_4_tfforcolnom = AV16TFForColNom ;
      AV105Webdatospedidocolords_5_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV106Webdatospedidocolords_6_tfforcolnum = AV18TFForColNum ;
      AV107Webdatospedidocolords_7_tfforcolnum_to = AV19TFForColNum_To ;
      AV108Webdatospedidocolords_8_tftipcolcod = AV20TFTipColCod ;
      AV109Webdatospedidocolords_9_tftipcolcod_to = AV21TFTipColCod_To ;
      AV110Webdatospedidocolords_10_tffornomcli = AV26TFForNomCli ;
      AV111Webdatospedidocolords_11_tffornomcli_sel = AV27TFForNomCli_Sel ;
      AV112Webdatospedidocolords_12_tffornumcli = AV24TFForNumCli ;
      AV113Webdatospedidocolords_13_tffornumcli_to = AV25TFForNumCli_To ;
      AV114Webdatospedidocolords_14_tffortonal = AV58TFForTonal ;
      AV115Webdatospedidocolords_15_tffortonal_sel = AV59TFForTonal_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV101Webdatospedidocolords_1_filterfulltext ,
                                           AV103Webdatospedidocolords_3_tfforser_sel ,
                                           AV102Webdatospedidocolords_2_tfforser ,
                                           AV105Webdatospedidocolords_5_tfforcolnom_sel ,
                                           AV104Webdatospedidocolords_4_tfforcolnom ,
                                           Integer.valueOf(AV106Webdatospedidocolords_6_tfforcolnum) ,
                                           Integer.valueOf(AV107Webdatospedidocolords_7_tfforcolnum_to) ,
                                           Byte.valueOf(AV108Webdatospedidocolords_8_tftipcolcod) ,
                                           Byte.valueOf(AV109Webdatospedidocolords_9_tftipcolcod_to) ,
                                           AV111Webdatospedidocolords_11_tffornomcli_sel ,
                                           AV110Webdatospedidocolords_10_tffornomcli ,
                                           Integer.valueOf(AV112Webdatospedidocolords_12_tffornumcli) ,
                                           Integer.valueOf(AV113Webdatospedidocolords_13_tffornumcli_to) ,
                                           AV115Webdatospedidocolords_15_tffortonal_sel ,
                                           AV114Webdatospedidocolords_14_tffortonal ,
                                           AV96pForSer ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           A396EmprCod ,
                                           AV89EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV90CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV102Webdatospedidocolords_2_tfforser = GXutil.padr( GXutil.rtrim( AV102Webdatospedidocolords_2_tfforser), 16, "%") ;
      lV104Webdatospedidocolords_4_tfforcolnom = GXutil.padr( GXutil.rtrim( AV104Webdatospedidocolords_4_tfforcolnom), 13, "%") ;
      lV110Webdatospedidocolords_10_tffornomcli = GXutil.padr( GXutil.rtrim( AV110Webdatospedidocolords_10_tffornomcli), 13, "%") ;
      lV114Webdatospedidocolords_14_tffortonal = GXutil.padr( GXutil.rtrim( AV114Webdatospedidocolords_14_tffortonal), 20, "%") ;
      /* Using cursor P086X3 */
      pr_default.execute(1, new Object[] {AV89EmprCod, Integer.valueOf(AV90CliCod), lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV102Webdatospedidocolords_2_tfforser, AV103Webdatospedidocolords_3_tfforser_sel, lV104Webdatospedidocolords_4_tfforcolnom, AV105Webdatospedidocolords_5_tfforcolnom_sel, Integer.valueOf(AV106Webdatospedidocolords_6_tfforcolnum), Integer.valueOf(AV107Webdatospedidocolords_7_tfforcolnum_to), Byte.valueOf(AV108Webdatospedidocolords_8_tftipcolcod), Byte.valueOf(AV109Webdatospedidocolords_9_tftipcolcod_to), lV110Webdatospedidocolords_10_tffornomcli, AV111Webdatospedidocolords_11_tffornomcli_sel, Integer.valueOf(AV112Webdatospedidocolords_12_tffornumcli), Integer.valueOf(AV113Webdatospedidocolords_13_tffornumcli_to), lV114Webdatospedidocolords_14_tffortonal, AV115Webdatospedidocolords_15_tffortonal_sel, AV96pForSer});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk86X4 = false ;
         A396EmprCod = P086X3_A396EmprCod[0] ;
         A252CliCod = P086X3_A252CliCod[0] ;
         A482ForColNom = P086X3_A482ForColNom[0] ;
         A995ForTonal = P086X3_A995ForTonal[0] ;
         n995ForTonal = P086X3_n995ForTonal[0] ;
         A1192ForNumCli = P086X3_A1192ForNumCli[0] ;
         n1192ForNumCli = P086X3_n1192ForNumCli[0] ;
         A1191ForNomCli = P086X3_A1191ForNomCli[0] ;
         n1191ForNomCli = P086X3_n1191ForNomCli[0] ;
         A831TipColCod = P086X3_A831TipColCod[0] ;
         A483ForColNum = P086X3_A483ForColNum[0] ;
         A494ForSer = P086X3_A494ForSer[0] ;
         AV82count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P086X3_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk86X4 = false ;
            A396EmprCod = P086X3_A396EmprCod[0] ;
            A252CliCod = P086X3_A252CliCod[0] ;
            A831TipColCod = P086X3_A831TipColCod[0] ;
            A483ForColNum = P086X3_A483ForColNum[0] ;
            A494ForSer = P086X3_A494ForSer[0] ;
            AV82count = (long)(AV82count+1) ;
            brk86X4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV74Option = A482ForColNom ;
            AV75Options.add(AV74Option, 0);
            AV80OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV82count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV75Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk86X4 )
         {
            brk86X4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV26TFForNomCli = AV70SearchTxt ;
      AV27TFForNomCli_Sel = "" ;
      AV101Webdatospedidocolords_1_filterfulltext = AV88FilterFullText ;
      AV102Webdatospedidocolords_2_tfforser = AV14TFForSer ;
      AV103Webdatospedidocolords_3_tfforser_sel = AV15TFForSer_Sel ;
      AV104Webdatospedidocolords_4_tfforcolnom = AV16TFForColNom ;
      AV105Webdatospedidocolords_5_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV106Webdatospedidocolords_6_tfforcolnum = AV18TFForColNum ;
      AV107Webdatospedidocolords_7_tfforcolnum_to = AV19TFForColNum_To ;
      AV108Webdatospedidocolords_8_tftipcolcod = AV20TFTipColCod ;
      AV109Webdatospedidocolords_9_tftipcolcod_to = AV21TFTipColCod_To ;
      AV110Webdatospedidocolords_10_tffornomcli = AV26TFForNomCli ;
      AV111Webdatospedidocolords_11_tffornomcli_sel = AV27TFForNomCli_Sel ;
      AV112Webdatospedidocolords_12_tffornumcli = AV24TFForNumCli ;
      AV113Webdatospedidocolords_13_tffornumcli_to = AV25TFForNumCli_To ;
      AV114Webdatospedidocolords_14_tffortonal = AV58TFForTonal ;
      AV115Webdatospedidocolords_15_tffortonal_sel = AV59TFForTonal_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV101Webdatospedidocolords_1_filterfulltext ,
                                           AV103Webdatospedidocolords_3_tfforser_sel ,
                                           AV102Webdatospedidocolords_2_tfforser ,
                                           AV105Webdatospedidocolords_5_tfforcolnom_sel ,
                                           AV104Webdatospedidocolords_4_tfforcolnom ,
                                           Integer.valueOf(AV106Webdatospedidocolords_6_tfforcolnum) ,
                                           Integer.valueOf(AV107Webdatospedidocolords_7_tfforcolnum_to) ,
                                           Byte.valueOf(AV108Webdatospedidocolords_8_tftipcolcod) ,
                                           Byte.valueOf(AV109Webdatospedidocolords_9_tftipcolcod_to) ,
                                           AV111Webdatospedidocolords_11_tffornomcli_sel ,
                                           AV110Webdatospedidocolords_10_tffornomcli ,
                                           Integer.valueOf(AV112Webdatospedidocolords_12_tffornumcli) ,
                                           Integer.valueOf(AV113Webdatospedidocolords_13_tffornumcli_to) ,
                                           AV115Webdatospedidocolords_15_tffortonal_sel ,
                                           AV114Webdatospedidocolords_14_tffortonal ,
                                           AV96pForSer ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           A396EmprCod ,
                                           AV89EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV90CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV102Webdatospedidocolords_2_tfforser = GXutil.padr( GXutil.rtrim( AV102Webdatospedidocolords_2_tfforser), 16, "%") ;
      lV104Webdatospedidocolords_4_tfforcolnom = GXutil.padr( GXutil.rtrim( AV104Webdatospedidocolords_4_tfforcolnom), 13, "%") ;
      lV110Webdatospedidocolords_10_tffornomcli = GXutil.padr( GXutil.rtrim( AV110Webdatospedidocolords_10_tffornomcli), 13, "%") ;
      lV114Webdatospedidocolords_14_tffortonal = GXutil.padr( GXutil.rtrim( AV114Webdatospedidocolords_14_tffortonal), 20, "%") ;
      /* Using cursor P086X4 */
      pr_default.execute(2, new Object[] {AV89EmprCod, Integer.valueOf(AV90CliCod), lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV102Webdatospedidocolords_2_tfforser, AV103Webdatospedidocolords_3_tfforser_sel, lV104Webdatospedidocolords_4_tfforcolnom, AV105Webdatospedidocolords_5_tfforcolnom_sel, Integer.valueOf(AV106Webdatospedidocolords_6_tfforcolnum), Integer.valueOf(AV107Webdatospedidocolords_7_tfforcolnum_to), Byte.valueOf(AV108Webdatospedidocolords_8_tftipcolcod), Byte.valueOf(AV109Webdatospedidocolords_9_tftipcolcod_to), lV110Webdatospedidocolords_10_tffornomcli, AV111Webdatospedidocolords_11_tffornomcli_sel, Integer.valueOf(AV112Webdatospedidocolords_12_tffornumcli), Integer.valueOf(AV113Webdatospedidocolords_13_tffornumcli_to), lV114Webdatospedidocolords_14_tffortonal, AV115Webdatospedidocolords_15_tffortonal_sel, AV96pForSer});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk86X6 = false ;
         A396EmprCod = P086X4_A396EmprCod[0] ;
         A252CliCod = P086X4_A252CliCod[0] ;
         A1191ForNomCli = P086X4_A1191ForNomCli[0] ;
         n1191ForNomCli = P086X4_n1191ForNomCli[0] ;
         A995ForTonal = P086X4_A995ForTonal[0] ;
         n995ForTonal = P086X4_n995ForTonal[0] ;
         A1192ForNumCli = P086X4_A1192ForNumCli[0] ;
         n1192ForNumCli = P086X4_n1192ForNumCli[0] ;
         A831TipColCod = P086X4_A831TipColCod[0] ;
         A483ForColNum = P086X4_A483ForColNum[0] ;
         A482ForColNom = P086X4_A482ForColNom[0] ;
         A494ForSer = P086X4_A494ForSer[0] ;
         AV82count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P086X4_A1191ForNomCli[0], A1191ForNomCli) == 0 ) )
         {
            brk86X6 = false ;
            A396EmprCod = P086X4_A396EmprCod[0] ;
            A252CliCod = P086X4_A252CliCod[0] ;
            A831TipColCod = P086X4_A831TipColCod[0] ;
            A483ForColNum = P086X4_A483ForColNum[0] ;
            A482ForColNom = P086X4_A482ForColNom[0] ;
            A494ForSer = P086X4_A494ForSer[0] ;
            AV82count = (long)(AV82count+1) ;
            brk86X6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1191ForNomCli)==0) )
         {
            AV74Option = A1191ForNomCli ;
            AV75Options.add(AV74Option, 0);
            AV80OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV82count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV75Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk86X6 )
         {
            brk86X6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORTONALOPTIONS' Routine */
      returnInSub = false ;
      AV58TFForTonal = AV70SearchTxt ;
      AV59TFForTonal_Sel = "" ;
      AV101Webdatospedidocolords_1_filterfulltext = AV88FilterFullText ;
      AV102Webdatospedidocolords_2_tfforser = AV14TFForSer ;
      AV103Webdatospedidocolords_3_tfforser_sel = AV15TFForSer_Sel ;
      AV104Webdatospedidocolords_4_tfforcolnom = AV16TFForColNom ;
      AV105Webdatospedidocolords_5_tfforcolnom_sel = AV17TFForColNom_Sel ;
      AV106Webdatospedidocolords_6_tfforcolnum = AV18TFForColNum ;
      AV107Webdatospedidocolords_7_tfforcolnum_to = AV19TFForColNum_To ;
      AV108Webdatospedidocolords_8_tftipcolcod = AV20TFTipColCod ;
      AV109Webdatospedidocolords_9_tftipcolcod_to = AV21TFTipColCod_To ;
      AV110Webdatospedidocolords_10_tffornomcli = AV26TFForNomCli ;
      AV111Webdatospedidocolords_11_tffornomcli_sel = AV27TFForNomCli_Sel ;
      AV112Webdatospedidocolords_12_tffornumcli = AV24TFForNumCli ;
      AV113Webdatospedidocolords_13_tffornumcli_to = AV25TFForNumCli_To ;
      AV114Webdatospedidocolords_14_tffortonal = AV58TFForTonal ;
      AV115Webdatospedidocolords_15_tffortonal_sel = AV59TFForTonal_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV101Webdatospedidocolords_1_filterfulltext ,
                                           AV103Webdatospedidocolords_3_tfforser_sel ,
                                           AV102Webdatospedidocolords_2_tfforser ,
                                           AV105Webdatospedidocolords_5_tfforcolnom_sel ,
                                           AV104Webdatospedidocolords_4_tfforcolnom ,
                                           Integer.valueOf(AV106Webdatospedidocolords_6_tfforcolnum) ,
                                           Integer.valueOf(AV107Webdatospedidocolords_7_tfforcolnum_to) ,
                                           Byte.valueOf(AV108Webdatospedidocolords_8_tftipcolcod) ,
                                           Byte.valueOf(AV109Webdatospedidocolords_9_tftipcolcod_to) ,
                                           AV111Webdatospedidocolords_11_tffornomcli_sel ,
                                           AV110Webdatospedidocolords_10_tffornomcli ,
                                           Integer.valueOf(AV112Webdatospedidocolords_12_tffornumcli) ,
                                           Integer.valueOf(AV113Webdatospedidocolords_13_tffornumcli_to) ,
                                           AV115Webdatospedidocolords_15_tffortonal_sel ,
                                           AV114Webdatospedidocolords_14_tffortonal ,
                                           AV96pForSer ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           A396EmprCod ,
                                           AV89EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV90CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV101Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV102Webdatospedidocolords_2_tfforser = GXutil.padr( GXutil.rtrim( AV102Webdatospedidocolords_2_tfforser), 16, "%") ;
      lV104Webdatospedidocolords_4_tfforcolnom = GXutil.padr( GXutil.rtrim( AV104Webdatospedidocolords_4_tfforcolnom), 13, "%") ;
      lV110Webdatospedidocolords_10_tffornomcli = GXutil.padr( GXutil.rtrim( AV110Webdatospedidocolords_10_tffornomcli), 13, "%") ;
      lV114Webdatospedidocolords_14_tffortonal = GXutil.padr( GXutil.rtrim( AV114Webdatospedidocolords_14_tffortonal), 20, "%") ;
      /* Using cursor P086X5 */
      pr_default.execute(3, new Object[] {AV89EmprCod, Integer.valueOf(AV90CliCod), lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV101Webdatospedidocolords_1_filterfulltext, lV102Webdatospedidocolords_2_tfforser, AV103Webdatospedidocolords_3_tfforser_sel, lV104Webdatospedidocolords_4_tfforcolnom, AV105Webdatospedidocolords_5_tfforcolnom_sel, Integer.valueOf(AV106Webdatospedidocolords_6_tfforcolnum), Integer.valueOf(AV107Webdatospedidocolords_7_tfforcolnum_to), Byte.valueOf(AV108Webdatospedidocolords_8_tftipcolcod), Byte.valueOf(AV109Webdatospedidocolords_9_tftipcolcod_to), lV110Webdatospedidocolords_10_tffornomcli, AV111Webdatospedidocolords_11_tffornomcli_sel, Integer.valueOf(AV112Webdatospedidocolords_12_tffornumcli), Integer.valueOf(AV113Webdatospedidocolords_13_tffornumcli_to), lV114Webdatospedidocolords_14_tffortonal, AV115Webdatospedidocolords_15_tffortonal_sel, AV96pForSer});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk86X8 = false ;
         A396EmprCod = P086X5_A396EmprCod[0] ;
         A252CliCod = P086X5_A252CliCod[0] ;
         A995ForTonal = P086X5_A995ForTonal[0] ;
         n995ForTonal = P086X5_n995ForTonal[0] ;
         A1192ForNumCli = P086X5_A1192ForNumCli[0] ;
         n1192ForNumCli = P086X5_n1192ForNumCli[0] ;
         A1191ForNomCli = P086X5_A1191ForNomCli[0] ;
         n1191ForNomCli = P086X5_n1191ForNomCli[0] ;
         A831TipColCod = P086X5_A831TipColCod[0] ;
         A483ForColNum = P086X5_A483ForColNum[0] ;
         A482ForColNom = P086X5_A482ForColNom[0] ;
         A494ForSer = P086X5_A494ForSer[0] ;
         AV82count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P086X5_A995ForTonal[0], A995ForTonal) == 0 ) )
         {
            brk86X8 = false ;
            A396EmprCod = P086X5_A396EmprCod[0] ;
            A252CliCod = P086X5_A252CliCod[0] ;
            A831TipColCod = P086X5_A831TipColCod[0] ;
            A483ForColNum = P086X5_A483ForColNum[0] ;
            A482ForColNom = P086X5_A482ForColNom[0] ;
            A494ForSer = P086X5_A494ForSer[0] ;
            AV82count = (long)(AV82count+1) ;
            brk86X8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A995ForTonal)==0) )
         {
            AV74Option = A995ForTonal ;
            AV75Options.add(AV74Option, 0);
            AV80OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV82count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV75Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk86X8 )
         {
            brk86X8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webdatospedidocolorgetfilterdata.this.AV76OptionsJson;
      this.aP4[0] = webdatospedidocolorgetfilterdata.this.AV79OptionsDescJson;
      this.aP5[0] = webdatospedidocolorgetfilterdata.this.AV81OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV76OptionsJson = "" ;
      AV79OptionsDescJson = "" ;
      AV81OptionIndexesJson = "" ;
      AV75Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV78OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV80OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV83Session = httpContext.getWebSession();
      AV85GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV86GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV88FilterFullText = "" ;
      AV14TFForSer = "" ;
      AV15TFForSer_Sel = "" ;
      AV16TFForColNom = "" ;
      AV17TFForColNom_Sel = "" ;
      AV26TFForNomCli = "" ;
      AV27TFForNomCli_Sel = "" ;
      AV58TFForTonal = "" ;
      AV59TFForTonal_Sel = "" ;
      A494ForSer = "" ;
      AV101Webdatospedidocolords_1_filterfulltext = "" ;
      AV102Webdatospedidocolords_2_tfforser = "" ;
      AV103Webdatospedidocolords_3_tfforser_sel = "" ;
      AV104Webdatospedidocolords_4_tfforcolnom = "" ;
      AV105Webdatospedidocolords_5_tfforcolnom_sel = "" ;
      AV110Webdatospedidocolords_10_tffornomcli = "" ;
      AV111Webdatospedidocolords_11_tffornomcli_sel = "" ;
      AV114Webdatospedidocolords_14_tffortonal = "" ;
      AV115Webdatospedidocolords_15_tffortonal_sel = "" ;
      scmdbuf = "" ;
      lV101Webdatospedidocolords_1_filterfulltext = "" ;
      lV102Webdatospedidocolords_2_tfforser = "" ;
      lV104Webdatospedidocolords_4_tfforcolnom = "" ;
      lV110Webdatospedidocolords_10_tffornomcli = "" ;
      lV114Webdatospedidocolords_14_tffortonal = "" ;
      AV96pForSer = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      AV89EmprCod = "" ;
      A396EmprCod = "" ;
      P086X2_A252CliCod = new int[1] ;
      P086X2_A396EmprCod = new String[] {""} ;
      P086X2_A494ForSer = new String[] {""} ;
      P086X2_A995ForTonal = new String[] {""} ;
      P086X2_n995ForTonal = new boolean[] {false} ;
      P086X2_A1192ForNumCli = new int[1] ;
      P086X2_n1192ForNumCli = new boolean[] {false} ;
      P086X2_A1191ForNomCli = new String[] {""} ;
      P086X2_n1191ForNomCli = new boolean[] {false} ;
      P086X2_A831TipColCod = new byte[1] ;
      P086X2_A483ForColNum = new int[1] ;
      P086X2_A482ForColNom = new String[] {""} ;
      AV74Option = "" ;
      P086X3_A396EmprCod = new String[] {""} ;
      P086X3_A252CliCod = new int[1] ;
      P086X3_A482ForColNom = new String[] {""} ;
      P086X3_A995ForTonal = new String[] {""} ;
      P086X3_n995ForTonal = new boolean[] {false} ;
      P086X3_A1192ForNumCli = new int[1] ;
      P086X3_n1192ForNumCli = new boolean[] {false} ;
      P086X3_A1191ForNomCli = new String[] {""} ;
      P086X3_n1191ForNomCli = new boolean[] {false} ;
      P086X3_A831TipColCod = new byte[1] ;
      P086X3_A483ForColNum = new int[1] ;
      P086X3_A494ForSer = new String[] {""} ;
      P086X4_A396EmprCod = new String[] {""} ;
      P086X4_A252CliCod = new int[1] ;
      P086X4_A1191ForNomCli = new String[] {""} ;
      P086X4_n1191ForNomCli = new boolean[] {false} ;
      P086X4_A995ForTonal = new String[] {""} ;
      P086X4_n995ForTonal = new boolean[] {false} ;
      P086X4_A1192ForNumCli = new int[1] ;
      P086X4_n1192ForNumCli = new boolean[] {false} ;
      P086X4_A831TipColCod = new byte[1] ;
      P086X4_A483ForColNum = new int[1] ;
      P086X4_A482ForColNom = new String[] {""} ;
      P086X4_A494ForSer = new String[] {""} ;
      P086X5_A396EmprCod = new String[] {""} ;
      P086X5_A252CliCod = new int[1] ;
      P086X5_A995ForTonal = new String[] {""} ;
      P086X5_n995ForTonal = new boolean[] {false} ;
      P086X5_A1192ForNumCli = new int[1] ;
      P086X5_n1192ForNumCli = new boolean[] {false} ;
      P086X5_A1191ForNomCli = new String[] {""} ;
      P086X5_n1191ForNomCli = new boolean[] {false} ;
      P086X5_A831TipColCod = new byte[1] ;
      P086X5_A483ForColNum = new int[1] ;
      P086X5_A482ForColNom = new String[] {""} ;
      P086X5_A494ForSer = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webdatospedidocolorgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P086X2_A252CliCod, P086X2_A396EmprCod, P086X2_A494ForSer, P086X2_A995ForTonal, P086X2_n995ForTonal, P086X2_A1192ForNumCli, P086X2_n1192ForNumCli, P086X2_A1191ForNomCli, P086X2_n1191ForNomCli, P086X2_A831TipColCod,
            P086X2_A483ForColNum, P086X2_A482ForColNom
            }
            , new Object[] {
            P086X3_A396EmprCod, P086X3_A252CliCod, P086X3_A482ForColNom, P086X3_A995ForTonal, P086X3_n995ForTonal, P086X3_A1192ForNumCli, P086X3_n1192ForNumCli, P086X3_A1191ForNomCli, P086X3_n1191ForNomCli, P086X3_A831TipColCod,
            P086X3_A483ForColNum, P086X3_A494ForSer
            }
            , new Object[] {
            P086X4_A396EmprCod, P086X4_A252CliCod, P086X4_A1191ForNomCli, P086X4_n1191ForNomCli, P086X4_A995ForTonal, P086X4_n995ForTonal, P086X4_A1192ForNumCli, P086X4_n1192ForNumCli, P086X4_A831TipColCod, P086X4_A483ForColNum,
            P086X4_A482ForColNom, P086X4_A494ForSer
            }
            , new Object[] {
            P086X5_A396EmprCod, P086X5_A252CliCod, P086X5_A995ForTonal, P086X5_n995ForTonal, P086X5_A1192ForNumCli, P086X5_n1192ForNumCli, P086X5_A1191ForNomCli, P086X5_n1191ForNomCli, P086X5_A831TipColCod, P086X5_A483ForColNum,
            P086X5_A482ForColNom, P086X5_A494ForSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFTipColCod ;
   private byte AV21TFTipColCod_To ;
   private byte AV108Webdatospedidocolords_8_tftipcolcod ;
   private byte AV109Webdatospedidocolords_9_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV99GXV1 ;
   private int AV18TFForColNum ;
   private int AV19TFForColNum_To ;
   private int AV24TFForNumCli ;
   private int AV25TFForNumCli_To ;
   private int AV106Webdatospedidocolords_6_tfforcolnum ;
   private int AV107Webdatospedidocolords_7_tfforcolnum_to ;
   private int AV112Webdatospedidocolords_12_tffornumcli ;
   private int AV113Webdatospedidocolords_13_tffornumcli_to ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int AV90CliCod ;
   private int A252CliCod ;
   private long AV82count ;
   private String AV14TFForSer ;
   private String AV15TFForSer_Sel ;
   private String AV16TFForColNom ;
   private String AV17TFForColNom_Sel ;
   private String AV26TFForNomCli ;
   private String AV27TFForNomCli_Sel ;
   private String AV58TFForTonal ;
   private String AV59TFForTonal_Sel ;
   private String A494ForSer ;
   private String AV102Webdatospedidocolords_2_tfforser ;
   private String AV103Webdatospedidocolords_3_tfforser_sel ;
   private String AV104Webdatospedidocolords_4_tfforcolnom ;
   private String AV105Webdatospedidocolords_5_tfforcolnom_sel ;
   private String AV110Webdatospedidocolords_10_tffornomcli ;
   private String AV111Webdatospedidocolords_11_tffornomcli_sel ;
   private String AV114Webdatospedidocolords_14_tffortonal ;
   private String AV115Webdatospedidocolords_15_tffortonal_sel ;
   private String scmdbuf ;
   private String lV102Webdatospedidocolords_2_tfforser ;
   private String lV104Webdatospedidocolords_4_tfforcolnom ;
   private String lV110Webdatospedidocolords_10_tffornomcli ;
   private String lV114Webdatospedidocolords_14_tffortonal ;
   private String AV96pForSer ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A995ForTonal ;
   private String AV89EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk86X2 ;
   private boolean n995ForTonal ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean brk86X4 ;
   private boolean brk86X6 ;
   private boolean brk86X8 ;
   private String AV76OptionsJson ;
   private String AV79OptionsDescJson ;
   private String AV81OptionIndexesJson ;
   private String AV72DDOName ;
   private String AV70SearchTxt ;
   private String AV71SearchTxtTo ;
   private String AV88FilterFullText ;
   private String AV101Webdatospedidocolords_1_filterfulltext ;
   private String lV101Webdatospedidocolords_1_filterfulltext ;
   private String AV74Option ;
   private com.genexus.webpanels.WebSession AV83Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P086X2_A252CliCod ;
   private String[] P086X2_A396EmprCod ;
   private String[] P086X2_A494ForSer ;
   private String[] P086X2_A995ForTonal ;
   private boolean[] P086X2_n995ForTonal ;
   private int[] P086X2_A1192ForNumCli ;
   private boolean[] P086X2_n1192ForNumCli ;
   private String[] P086X2_A1191ForNomCli ;
   private boolean[] P086X2_n1191ForNomCli ;
   private byte[] P086X2_A831TipColCod ;
   private int[] P086X2_A483ForColNum ;
   private String[] P086X2_A482ForColNom ;
   private String[] P086X3_A396EmprCod ;
   private int[] P086X3_A252CliCod ;
   private String[] P086X3_A482ForColNom ;
   private String[] P086X3_A995ForTonal ;
   private boolean[] P086X3_n995ForTonal ;
   private int[] P086X3_A1192ForNumCli ;
   private boolean[] P086X3_n1192ForNumCli ;
   private String[] P086X3_A1191ForNomCli ;
   private boolean[] P086X3_n1191ForNomCli ;
   private byte[] P086X3_A831TipColCod ;
   private int[] P086X3_A483ForColNum ;
   private String[] P086X3_A494ForSer ;
   private String[] P086X4_A396EmprCod ;
   private int[] P086X4_A252CliCod ;
   private String[] P086X4_A1191ForNomCli ;
   private boolean[] P086X4_n1191ForNomCli ;
   private String[] P086X4_A995ForTonal ;
   private boolean[] P086X4_n995ForTonal ;
   private int[] P086X4_A1192ForNumCli ;
   private boolean[] P086X4_n1192ForNumCli ;
   private byte[] P086X4_A831TipColCod ;
   private int[] P086X4_A483ForColNum ;
   private String[] P086X4_A482ForColNom ;
   private String[] P086X4_A494ForSer ;
   private String[] P086X5_A396EmprCod ;
   private int[] P086X5_A252CliCod ;
   private String[] P086X5_A995ForTonal ;
   private boolean[] P086X5_n995ForTonal ;
   private int[] P086X5_A1192ForNumCli ;
   private boolean[] P086X5_n1192ForNumCli ;
   private String[] P086X5_A1191ForNomCli ;
   private boolean[] P086X5_n1191ForNomCli ;
   private byte[] P086X5_A831TipColCod ;
   private int[] P086X5_A483ForColNum ;
   private String[] P086X5_A482ForColNom ;
   private String[] P086X5_A494ForSer ;
   private GXSimpleCollection<String> AV75Options ;
   private GXSimpleCollection<String> AV78OptionsDesc ;
   private GXSimpleCollection<String> AV80OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV85GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV86GridStateFilterValue ;
}

final  class webdatospedidocolorgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webdatospedidocolords_1_filterfulltext ,
                                          String AV103Webdatospedidocolords_3_tfforser_sel ,
                                          String AV102Webdatospedidocolords_2_tfforser ,
                                          String AV105Webdatospedidocolords_5_tfforcolnom_sel ,
                                          String AV104Webdatospedidocolords_4_tfforcolnom ,
                                          int AV106Webdatospedidocolords_6_tfforcolnum ,
                                          int AV107Webdatospedidocolords_7_tfforcolnum_to ,
                                          byte AV108Webdatospedidocolords_8_tftipcolcod ,
                                          byte AV109Webdatospedidocolords_9_tftipcolcod_to ,
                                          String AV111Webdatospedidocolords_11_tffornomcli_sel ,
                                          String AV110Webdatospedidocolords_10_tffornomcli ,
                                          int AV112Webdatospedidocolords_12_tffornumcli ,
                                          int AV113Webdatospedidocolords_13_tffornumcli_to ,
                                          String AV115Webdatospedidocolords_15_tffortonal_sel ,
                                          String AV114Webdatospedidocolords_14_tffortonal ,
                                          String AV96pForSer ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          String AV89EmprCod ,
                                          int AV90CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CliCod, EmprCod, ForSer, ForTonal, ForNumCli, ForNomCli, TipColCod, ForColNum, ForColNom FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV101Webdatospedidocolords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForNumCli,'999990'), 2) like '%' || ?) or ( UPPER(ForTonal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Webdatospedidocolords_3_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV102Webdatospedidocolords_2_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webdatospedidocolords_3_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webdatospedidocolords_5_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Webdatospedidocolords_4_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webdatospedidocolords_5_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Webdatospedidocolords_6_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Webdatospedidocolords_7_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Webdatospedidocolords_8_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Webdatospedidocolords_9_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Webdatospedidocolords_11_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV110Webdatospedidocolords_10_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Webdatospedidocolords_11_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(ForNomCli = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV112Webdatospedidocolords_12_tffornumcli) )
      {
         addWhere(sWhereString, "(ForNumCli >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV113Webdatospedidocolords_13_tffornumcli_to) )
      {
         addWhere(sWhereString, "(ForNumCli <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webdatospedidocolords_15_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV114Webdatospedidocolords_14_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webdatospedidocolords_15_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(ForTonal = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96pForSer)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ForSer" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P086X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webdatospedidocolords_1_filterfulltext ,
                                          String AV103Webdatospedidocolords_3_tfforser_sel ,
                                          String AV102Webdatospedidocolords_2_tfforser ,
                                          String AV105Webdatospedidocolords_5_tfforcolnom_sel ,
                                          String AV104Webdatospedidocolords_4_tfforcolnom ,
                                          int AV106Webdatospedidocolords_6_tfforcolnum ,
                                          int AV107Webdatospedidocolords_7_tfforcolnum_to ,
                                          byte AV108Webdatospedidocolords_8_tftipcolcod ,
                                          byte AV109Webdatospedidocolords_9_tftipcolcod_to ,
                                          String AV111Webdatospedidocolords_11_tffornomcli_sel ,
                                          String AV110Webdatospedidocolords_10_tffornomcli ,
                                          int AV112Webdatospedidocolords_12_tffornumcli ,
                                          int AV113Webdatospedidocolords_13_tffornumcli_to ,
                                          String AV115Webdatospedidocolords_15_tffortonal_sel ,
                                          String AV114Webdatospedidocolords_14_tffortonal ,
                                          String AV96pForSer ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          String A396EmprCod ,
                                          String AV89EmprCod ,
                                          int A252CliCod ,
                                          int AV90CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ForColNom, ForTonal, ForNumCli, ForNomCli, TipColCod, ForColNum, ForSer FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV101Webdatospedidocolords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForNumCli,'999990'), 2) like '%' || ?) or ( UPPER(ForTonal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Webdatospedidocolords_3_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV102Webdatospedidocolords_2_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webdatospedidocolords_3_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webdatospedidocolords_5_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Webdatospedidocolords_4_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webdatospedidocolords_5_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Webdatospedidocolords_6_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Webdatospedidocolords_7_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Webdatospedidocolords_8_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Webdatospedidocolords_9_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Webdatospedidocolords_11_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV110Webdatospedidocolords_10_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Webdatospedidocolords_11_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(ForNomCli = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV112Webdatospedidocolords_12_tffornumcli) )
      {
         addWhere(sWhereString, "(ForNumCli >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV113Webdatospedidocolords_13_tffornumcli_to) )
      {
         addWhere(sWhereString, "(ForNumCli <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webdatospedidocolords_15_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV114Webdatospedidocolords_14_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webdatospedidocolords_15_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(ForTonal = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96pForSer)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForColNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P086X4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webdatospedidocolords_1_filterfulltext ,
                                          String AV103Webdatospedidocolords_3_tfforser_sel ,
                                          String AV102Webdatospedidocolords_2_tfforser ,
                                          String AV105Webdatospedidocolords_5_tfforcolnom_sel ,
                                          String AV104Webdatospedidocolords_4_tfforcolnom ,
                                          int AV106Webdatospedidocolords_6_tfforcolnum ,
                                          int AV107Webdatospedidocolords_7_tfforcolnum_to ,
                                          byte AV108Webdatospedidocolords_8_tftipcolcod ,
                                          byte AV109Webdatospedidocolords_9_tftipcolcod_to ,
                                          String AV111Webdatospedidocolords_11_tffornomcli_sel ,
                                          String AV110Webdatospedidocolords_10_tffornomcli ,
                                          int AV112Webdatospedidocolords_12_tffornumcli ,
                                          int AV113Webdatospedidocolords_13_tffornumcli_to ,
                                          String AV115Webdatospedidocolords_15_tffortonal_sel ,
                                          String AV114Webdatospedidocolords_14_tffortonal ,
                                          String AV96pForSer ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          String A396EmprCod ,
                                          String AV89EmprCod ,
                                          int A252CliCod ,
                                          int AV90CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ForNomCli, ForTonal, ForNumCli, TipColCod, ForColNum, ForColNom, ForSer FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV101Webdatospedidocolords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForNumCli,'999990'), 2) like '%' || ?) or ( UPPER(ForTonal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Webdatospedidocolords_3_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV102Webdatospedidocolords_2_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webdatospedidocolords_3_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webdatospedidocolords_5_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Webdatospedidocolords_4_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webdatospedidocolords_5_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Webdatospedidocolords_6_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Webdatospedidocolords_7_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Webdatospedidocolords_8_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Webdatospedidocolords_9_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Webdatospedidocolords_11_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV110Webdatospedidocolords_10_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Webdatospedidocolords_11_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(ForNomCli = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV112Webdatospedidocolords_12_tffornumcli) )
      {
         addWhere(sWhereString, "(ForNumCli >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV113Webdatospedidocolords_13_tffornumcli_to) )
      {
         addWhere(sWhereString, "(ForNumCli <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webdatospedidocolords_15_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV114Webdatospedidocolords_14_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webdatospedidocolords_15_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(ForTonal = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96pForSer)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForNomCli" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P086X5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webdatospedidocolords_1_filterfulltext ,
                                          String AV103Webdatospedidocolords_3_tfforser_sel ,
                                          String AV102Webdatospedidocolords_2_tfforser ,
                                          String AV105Webdatospedidocolords_5_tfforcolnom_sel ,
                                          String AV104Webdatospedidocolords_4_tfforcolnom ,
                                          int AV106Webdatospedidocolords_6_tfforcolnum ,
                                          int AV107Webdatospedidocolords_7_tfforcolnum_to ,
                                          byte AV108Webdatospedidocolords_8_tftipcolcod ,
                                          byte AV109Webdatospedidocolords_9_tftipcolcod_to ,
                                          String AV111Webdatospedidocolords_11_tffornomcli_sel ,
                                          String AV110Webdatospedidocolords_10_tffornomcli ,
                                          int AV112Webdatospedidocolords_12_tffornumcli ,
                                          int AV113Webdatospedidocolords_13_tffornumcli_to ,
                                          String AV115Webdatospedidocolords_15_tffortonal_sel ,
                                          String AV114Webdatospedidocolords_14_tffortonal ,
                                          String AV96pForSer ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          String A396EmprCod ,
                                          String AV89EmprCod ,
                                          int A252CliCod ,
                                          int AV90CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, ForTonal, ForNumCli, ForNomCli, TipColCod, ForColNum, ForColNom, ForSer FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV101Webdatospedidocolords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForNumCli,'999990'), 2) like '%' || ?) or ( UPPER(ForTonal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Webdatospedidocolords_3_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV102Webdatospedidocolords_2_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webdatospedidocolords_3_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webdatospedidocolords_5_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Webdatospedidocolords_4_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webdatospedidocolords_5_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Webdatospedidocolords_6_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Webdatospedidocolords_7_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Webdatospedidocolords_8_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Webdatospedidocolords_9_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Webdatospedidocolords_11_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV110Webdatospedidocolords_10_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Webdatospedidocolords_11_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(ForNomCli = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV112Webdatospedidocolords_12_tffornumcli) )
      {
         addWhere(sWhereString, "(ForNumCli >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV113Webdatospedidocolords_13_tffornumcli_to) )
      {
         addWhere(sWhereString, "(ForNumCli <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webdatospedidocolords_15_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV114Webdatospedidocolords_14_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webdatospedidocolords_15_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(ForTonal = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96pForSer)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForTonal" ;
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
                  return conditional_P086X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
            case 1 :
                  return conditional_P086X3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() );
            case 2 :
                  return conditional_P086X4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() );
            case 3 :
                  return conditional_P086X5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086X4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086X5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               return;
      }
   }

}

