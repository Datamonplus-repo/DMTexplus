package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webbcprodgetfilterdata extends GXProcedure
{
   public webbcprodgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webbcprodgetfilterdata.class ), "" );
   }

   public webbcprodgetfilterdata( int remoteHandle ,
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
      webbcprodgetfilterdata.this.aP5 = new String[] {""};
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
      webbcprodgetfilterdata.this.AV22DDOName = aP0;
      webbcprodgetfilterdata.this.AV20SearchTxt = aP1;
      webbcprodgetfilterdata.this.AV21SearchTxtTo = aP2;
      webbcprodgetfilterdata.this.aP3 = aP3;
      webbcprodgetfilterdata.this.aP4 = aP4;
      webbcprodgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRDUCPDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDUCPDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRVNIF") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNIFOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("WebBCPRODGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebBCPRODGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WebBCPRODGridState"), null, null);
      }
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV14TFPrdUcpDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV15TFPrdUcpDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV16TFPrdPreAct = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPrdPreAct_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV76TFPrdDisponible = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFPrdDisponible_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV18TFPrvNif = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV19TFPrvNif_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV20SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV82Webbcprodds_1_tfprdnum = AV10TFPrdNum ;
      AV83Webbcprodds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV84Webbcprodds_3_tfprdnom = AV12TFPrdNom ;
      AV85Webbcprodds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV86Webbcprodds_5_tfprducpdsc = AV14TFPrdUcpDsc ;
      AV87Webbcprodds_6_tfprducpdsc_sel = AV15TFPrdUcpDsc_Sel ;
      AV88Webbcprodds_7_tfprdpreact = AV16TFPrdPreAct ;
      AV89Webbcprodds_8_tfprdpreact_to = AV17TFPrdPreAct_To ;
      AV90Webbcprodds_9_tfprddisponible = AV76TFPrdDisponible ;
      AV91Webbcprodds_10_tfprddisponible_to = AV77TFPrdDisponible_To ;
      AV92Webbcprodds_11_tfprvnif = AV18TFPrvNif ;
      AV93Webbcprodds_12_tfprvnif_sel = AV19TFPrvNif_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV83Webbcprodds_2_tfprdnum_sel ,
                                           AV82Webbcprodds_1_tfprdnum ,
                                           AV85Webbcprodds_4_tfprdnom_sel ,
                                           AV84Webbcprodds_3_tfprdnom ,
                                           AV87Webbcprodds_6_tfprducpdsc_sel ,
                                           AV86Webbcprodds_5_tfprducpdsc ,
                                           AV88Webbcprodds_7_tfprdpreact ,
                                           AV89Webbcprodds_8_tfprdpreact_to ,
                                           AV90Webbcprodds_9_tfprddisponible ,
                                           AV91Webbcprodds_10_tfprddisponible_to ,
                                           AV93Webbcprodds_12_tfprvnif_sel ,
                                           AV92Webbcprodds_11_tfprvnif ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A793PrvNif ,
                                           A3936PrdEqLP ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV73EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV82Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV82Webbcprodds_1_tfprdnum), 6, "%") ;
      lV84Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV84Webbcprodds_3_tfprdnom), 26, "%") ;
      lV86Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV86Webbcprodds_5_tfprducpdsc), 8, "%") ;
      lV92Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV92Webbcprodds_11_tfprvnif), 20, "%") ;
      /* Using cursor P07ZU2 */
      pr_default.execute(0, new Object[] {AV73EmprCod, lV82Webbcprodds_1_tfprdnum, AV83Webbcprodds_2_tfprdnum_sel, lV84Webbcprodds_3_tfprdnom, AV85Webbcprodds_4_tfprdnom_sel, lV86Webbcprodds_5_tfprducpdsc, AV87Webbcprodds_6_tfprducpdsc_sel, AV88Webbcprodds_7_tfprdpreact, AV89Webbcprodds_8_tfprdpreact_to, AV90Webbcprodds_9_tfprddisponible, AV91Webbcprodds_10_tfprddisponible_to, lV92Webbcprodds_11_tfprvnif, AV93Webbcprodds_12_tfprvnif_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7ZU2 = false ;
         A795PrvNum = P07ZU2_A795PrvNum[0] ;
         A742PrdUniCom = P07ZU2_A742PrdUniCom[0] ;
         A396EmprCod = P07ZU2_A396EmprCod[0] ;
         A719PrdNum = P07ZU2_A719PrdNum[0] ;
         A3936PrdEqLP = P07ZU2_A3936PrdEqLP[0] ;
         A856ValCod = P07ZU2_A856ValCod[0] ;
         A793PrvNif = P07ZU2_A793PrvNif[0] ;
         n793PrvNif = P07ZU2_n793PrvNif[0] ;
         A724PrdPreAct = P07ZU2_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P07ZU2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZU2_n737PrdUcpDsc[0] ;
         A718PrdNom = P07ZU2_A718PrdNom[0] ;
         A685PrdCanRes = P07ZU2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P07ZU2_A704PrdExiAlm[0] ;
         A793PrvNif = P07ZU2_A793PrvNif[0] ;
         n793PrvNif = P07ZU2_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZU2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZU2_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            AV32count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07ZU2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07ZU2_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk7ZU2 = false ;
               AV32count = (long)(AV32count+1) ;
               brk7ZU2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
            {
               AV24Option = A719PrdNum ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZU2 )
         {
            brk7ZU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV20SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV82Webbcprodds_1_tfprdnum = AV10TFPrdNum ;
      AV83Webbcprodds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV84Webbcprodds_3_tfprdnom = AV12TFPrdNom ;
      AV85Webbcprodds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV86Webbcprodds_5_tfprducpdsc = AV14TFPrdUcpDsc ;
      AV87Webbcprodds_6_tfprducpdsc_sel = AV15TFPrdUcpDsc_Sel ;
      AV88Webbcprodds_7_tfprdpreact = AV16TFPrdPreAct ;
      AV89Webbcprodds_8_tfprdpreact_to = AV17TFPrdPreAct_To ;
      AV90Webbcprodds_9_tfprddisponible = AV76TFPrdDisponible ;
      AV91Webbcprodds_10_tfprddisponible_to = AV77TFPrdDisponible_To ;
      AV92Webbcprodds_11_tfprvnif = AV18TFPrvNif ;
      AV93Webbcprodds_12_tfprvnif_sel = AV19TFPrvNif_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV83Webbcprodds_2_tfprdnum_sel ,
                                           AV82Webbcprodds_1_tfprdnum ,
                                           AV85Webbcprodds_4_tfprdnom_sel ,
                                           AV84Webbcprodds_3_tfprdnom ,
                                           AV87Webbcprodds_6_tfprducpdsc_sel ,
                                           AV86Webbcprodds_5_tfprducpdsc ,
                                           AV88Webbcprodds_7_tfprdpreact ,
                                           AV89Webbcprodds_8_tfprdpreact_to ,
                                           AV90Webbcprodds_9_tfprddisponible ,
                                           AV91Webbcprodds_10_tfprddisponible_to ,
                                           AV93Webbcprodds_12_tfprvnif_sel ,
                                           AV92Webbcprodds_11_tfprvnif ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A793PrvNif ,
                                           A3936PrdEqLP ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV73EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV82Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV82Webbcprodds_1_tfprdnum), 6, "%") ;
      lV84Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV84Webbcprodds_3_tfprdnom), 26, "%") ;
      lV86Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV86Webbcprodds_5_tfprducpdsc), 8, "%") ;
      lV92Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV92Webbcprodds_11_tfprvnif), 20, "%") ;
      /* Using cursor P07ZU3 */
      pr_default.execute(1, new Object[] {AV73EmprCod, lV82Webbcprodds_1_tfprdnum, AV83Webbcprodds_2_tfprdnum_sel, lV84Webbcprodds_3_tfprdnom, AV85Webbcprodds_4_tfprdnom_sel, lV86Webbcprodds_5_tfprducpdsc, AV87Webbcprodds_6_tfprducpdsc_sel, AV88Webbcprodds_7_tfprdpreact, AV89Webbcprodds_8_tfprdpreact_to, AV90Webbcprodds_9_tfprddisponible, AV91Webbcprodds_10_tfprddisponible_to, lV92Webbcprodds_11_tfprvnif, AV93Webbcprodds_12_tfprvnif_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk7ZU4 = false ;
         A795PrvNum = P07ZU3_A795PrvNum[0] ;
         A742PrdUniCom = P07ZU3_A742PrdUniCom[0] ;
         A396EmprCod = P07ZU3_A396EmprCod[0] ;
         A718PrdNom = P07ZU3_A718PrdNom[0] ;
         A3936PrdEqLP = P07ZU3_A3936PrdEqLP[0] ;
         A856ValCod = P07ZU3_A856ValCod[0] ;
         A793PrvNif = P07ZU3_A793PrvNif[0] ;
         n793PrvNif = P07ZU3_n793PrvNif[0] ;
         A724PrdPreAct = P07ZU3_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P07ZU3_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZU3_n737PrdUcpDsc[0] ;
         A719PrdNum = P07ZU3_A719PrdNum[0] ;
         A685PrdCanRes = P07ZU3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P07ZU3_A704PrdExiAlm[0] ;
         A793PrvNif = P07ZU3_A793PrvNif[0] ;
         n793PrvNif = P07ZU3_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZU3_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZU3_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            AV32count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07ZU3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07ZU3_A718PrdNom[0], A718PrdNom) == 0 ) )
            {
               brk7ZU4 = false ;
               A719PrdNum = P07ZU3_A719PrdNum[0] ;
               AV32count = (long)(AV32count+1) ;
               brk7ZU4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
            {
               AV24Option = A718PrdNom ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZU4 )
         {
            brk7ZU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDUCPDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdUcpDsc = AV20SearchTxt ;
      AV15TFPrdUcpDsc_Sel = "" ;
      AV82Webbcprodds_1_tfprdnum = AV10TFPrdNum ;
      AV83Webbcprodds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV84Webbcprodds_3_tfprdnom = AV12TFPrdNom ;
      AV85Webbcprodds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV86Webbcprodds_5_tfprducpdsc = AV14TFPrdUcpDsc ;
      AV87Webbcprodds_6_tfprducpdsc_sel = AV15TFPrdUcpDsc_Sel ;
      AV88Webbcprodds_7_tfprdpreact = AV16TFPrdPreAct ;
      AV89Webbcprodds_8_tfprdpreact_to = AV17TFPrdPreAct_To ;
      AV90Webbcprodds_9_tfprddisponible = AV76TFPrdDisponible ;
      AV91Webbcprodds_10_tfprddisponible_to = AV77TFPrdDisponible_To ;
      AV92Webbcprodds_11_tfprvnif = AV18TFPrvNif ;
      AV93Webbcprodds_12_tfprvnif_sel = AV19TFPrvNif_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV83Webbcprodds_2_tfprdnum_sel ,
                                           AV82Webbcprodds_1_tfprdnum ,
                                           AV85Webbcprodds_4_tfprdnom_sel ,
                                           AV84Webbcprodds_3_tfprdnom ,
                                           AV87Webbcprodds_6_tfprducpdsc_sel ,
                                           AV86Webbcprodds_5_tfprducpdsc ,
                                           AV88Webbcprodds_7_tfprdpreact ,
                                           AV89Webbcprodds_8_tfprdpreact_to ,
                                           AV90Webbcprodds_9_tfprddisponible ,
                                           AV91Webbcprodds_10_tfprddisponible_to ,
                                           AV93Webbcprodds_12_tfprvnif_sel ,
                                           AV92Webbcprodds_11_tfprvnif ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A793PrvNif ,
                                           A3936PrdEqLP ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV73EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV82Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV82Webbcprodds_1_tfprdnum), 6, "%") ;
      lV84Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV84Webbcprodds_3_tfprdnom), 26, "%") ;
      lV86Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV86Webbcprodds_5_tfprducpdsc), 8, "%") ;
      lV92Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV92Webbcprodds_11_tfprvnif), 20, "%") ;
      /* Using cursor P07ZU4 */
      pr_default.execute(2, new Object[] {AV73EmprCod, lV82Webbcprodds_1_tfprdnum, AV83Webbcprodds_2_tfprdnum_sel, lV84Webbcprodds_3_tfprdnom, AV85Webbcprodds_4_tfprdnom_sel, lV86Webbcprodds_5_tfprducpdsc, AV87Webbcprodds_6_tfprducpdsc_sel, AV88Webbcprodds_7_tfprdpreact, AV89Webbcprodds_8_tfprdpreact_to, AV90Webbcprodds_9_tfprddisponible, AV91Webbcprodds_10_tfprddisponible_to, lV92Webbcprodds_11_tfprvnif, AV93Webbcprodds_12_tfprvnif_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk7ZU6 = false ;
         A795PrvNum = P07ZU4_A795PrvNum[0] ;
         A742PrdUniCom = P07ZU4_A742PrdUniCom[0] ;
         A396EmprCod = P07ZU4_A396EmprCod[0] ;
         A3936PrdEqLP = P07ZU4_A3936PrdEqLP[0] ;
         A856ValCod = P07ZU4_A856ValCod[0] ;
         A793PrvNif = P07ZU4_A793PrvNif[0] ;
         n793PrvNif = P07ZU4_n793PrvNif[0] ;
         A724PrdPreAct = P07ZU4_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P07ZU4_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZU4_n737PrdUcpDsc[0] ;
         A718PrdNom = P07ZU4_A718PrdNom[0] ;
         A719PrdNum = P07ZU4_A719PrdNum[0] ;
         A685PrdCanRes = P07ZU4_A685PrdCanRes[0] ;
         A704PrdExiAlm = P07ZU4_A704PrdExiAlm[0] ;
         A793PrvNif = P07ZU4_A793PrvNif[0] ;
         n793PrvNif = P07ZU4_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZU4_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZU4_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            AV32count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P07ZU4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P07ZU4_A742PrdUniCom[0] == A742PrdUniCom ) )
            {
               brk7ZU6 = false ;
               A719PrdNum = P07ZU4_A719PrdNum[0] ;
               AV32count = (long)(AV32count+1) ;
               brk7ZU6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A737PrdUcpDsc)==0) )
            {
               AV24Option = A737PrdUcpDsc ;
               AV23InsertIndex = 1 ;
               while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
               {
                  AV23InsertIndex = (int)(AV23InsertIndex+1) ;
               }
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZU6 )
         {
            brk7ZU6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRVNIFOPTIONS' Routine */
      returnInSub = false ;
      AV18TFPrvNif = AV20SearchTxt ;
      AV19TFPrvNif_Sel = "" ;
      AV82Webbcprodds_1_tfprdnum = AV10TFPrdNum ;
      AV83Webbcprodds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV84Webbcprodds_3_tfprdnom = AV12TFPrdNom ;
      AV85Webbcprodds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV86Webbcprodds_5_tfprducpdsc = AV14TFPrdUcpDsc ;
      AV87Webbcprodds_6_tfprducpdsc_sel = AV15TFPrdUcpDsc_Sel ;
      AV88Webbcprodds_7_tfprdpreact = AV16TFPrdPreAct ;
      AV89Webbcprodds_8_tfprdpreact_to = AV17TFPrdPreAct_To ;
      AV90Webbcprodds_9_tfprddisponible = AV76TFPrdDisponible ;
      AV91Webbcprodds_10_tfprddisponible_to = AV77TFPrdDisponible_To ;
      AV92Webbcprodds_11_tfprvnif = AV18TFPrvNif ;
      AV93Webbcprodds_12_tfprvnif_sel = AV19TFPrvNif_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV83Webbcprodds_2_tfprdnum_sel ,
                                           AV82Webbcprodds_1_tfprdnum ,
                                           AV85Webbcprodds_4_tfprdnom_sel ,
                                           AV84Webbcprodds_3_tfprdnom ,
                                           AV87Webbcprodds_6_tfprducpdsc_sel ,
                                           AV86Webbcprodds_5_tfprducpdsc ,
                                           AV88Webbcprodds_7_tfprdpreact ,
                                           AV89Webbcprodds_8_tfprdpreact_to ,
                                           AV90Webbcprodds_9_tfprddisponible ,
                                           AV91Webbcprodds_10_tfprddisponible_to ,
                                           AV93Webbcprodds_12_tfprvnif_sel ,
                                           AV92Webbcprodds_11_tfprvnif ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A793PrvNif ,
                                           A3936PrdEqLP ,
                                           A396EmprCod ,
                                           AV73EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV82Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV82Webbcprodds_1_tfprdnum), 6, "%") ;
      lV84Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV84Webbcprodds_3_tfprdnom), 26, "%") ;
      lV86Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV86Webbcprodds_5_tfprducpdsc), 8, "%") ;
      lV92Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV92Webbcprodds_11_tfprvnif), 20, "%") ;
      /* Using cursor P07ZU5 */
      pr_default.execute(3, new Object[] {AV73EmprCod, lV82Webbcprodds_1_tfprdnum, AV83Webbcprodds_2_tfprdnum_sel, lV84Webbcprodds_3_tfprdnom, AV85Webbcprodds_4_tfprdnom_sel, lV86Webbcprodds_5_tfprducpdsc, AV87Webbcprodds_6_tfprducpdsc_sel, AV88Webbcprodds_7_tfprdpreact, AV89Webbcprodds_8_tfprdpreact_to, AV90Webbcprodds_9_tfprddisponible, AV91Webbcprodds_10_tfprddisponible_to, lV92Webbcprodds_11_tfprvnif, AV93Webbcprodds_12_tfprvnif_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk7ZU8 = false ;
         A795PrvNum = P07ZU5_A795PrvNum[0] ;
         A742PrdUniCom = P07ZU5_A742PrdUniCom[0] ;
         A396EmprCod = P07ZU5_A396EmprCod[0] ;
         A856ValCod = P07ZU5_A856ValCod[0] ;
         A793PrvNif = P07ZU5_A793PrvNif[0] ;
         n793PrvNif = P07ZU5_n793PrvNif[0] ;
         A3936PrdEqLP = P07ZU5_A3936PrdEqLP[0] ;
         A724PrdPreAct = P07ZU5_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P07ZU5_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZU5_n737PrdUcpDsc[0] ;
         A718PrdNom = P07ZU5_A718PrdNom[0] ;
         A719PrdNum = P07ZU5_A719PrdNum[0] ;
         A685PrdCanRes = P07ZU5_A685PrdCanRes[0] ;
         A704PrdExiAlm = P07ZU5_A704PrdExiAlm[0] ;
         A793PrvNif = P07ZU5_A793PrvNif[0] ;
         n793PrvNif = P07ZU5_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZU5_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZU5_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            AV32count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P07ZU5_A793PrvNif[0], A793PrvNif) == 0 ) )
            {
               brk7ZU8 = false ;
               A795PrvNum = P07ZU5_A795PrvNum[0] ;
               A396EmprCod = P07ZU5_A396EmprCod[0] ;
               A719PrdNum = P07ZU5_A719PrdNum[0] ;
               AV32count = (long)(AV32count+1) ;
               brk7ZU8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A793PrvNif)==0) )
            {
               AV24Option = A793PrvNif ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZU8 )
         {
            brk7ZU8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webbcprodgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = webbcprodgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = webbcprodgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdUcpDsc = "" ;
      AV15TFPrdUcpDsc_Sel = "" ;
      AV16TFPrdPreAct = DecimalUtil.ZERO ;
      AV17TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV76TFPrdDisponible = DecimalUtil.ZERO ;
      AV77TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV18TFPrvNif = "" ;
      AV19TFPrvNif_Sel = "" ;
      A719PrdNum = "" ;
      AV82Webbcprodds_1_tfprdnum = "" ;
      AV83Webbcprodds_2_tfprdnum_sel = "" ;
      AV84Webbcprodds_3_tfprdnom = "" ;
      AV85Webbcprodds_4_tfprdnom_sel = "" ;
      AV86Webbcprodds_5_tfprducpdsc = "" ;
      AV87Webbcprodds_6_tfprducpdsc_sel = "" ;
      AV88Webbcprodds_7_tfprdpreact = DecimalUtil.ZERO ;
      AV89Webbcprodds_8_tfprdpreact_to = DecimalUtil.ZERO ;
      AV90Webbcprodds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV91Webbcprodds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV92Webbcprodds_11_tfprvnif = "" ;
      AV93Webbcprodds_12_tfprvnif_sel = "" ;
      scmdbuf = "" ;
      lV82Webbcprodds_1_tfprdnum = "" ;
      lV84Webbcprodds_3_tfprdnom = "" ;
      lV86Webbcprodds_5_tfprducpdsc = "" ;
      lV92Webbcprodds_11_tfprvnif = "" ;
      A718PrdNom = "" ;
      A737PrdUcpDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A793PrvNif = "" ;
      A3936PrdEqLP = "" ;
      AV73EmprCod = "" ;
      A396EmprCod = "" ;
      P07ZU2_A795PrvNum = new int[1] ;
      P07ZU2_A742PrdUniCom = new byte[1] ;
      P07ZU2_A396EmprCod = new String[] {""} ;
      P07ZU2_A719PrdNum = new String[] {""} ;
      P07ZU2_A3936PrdEqLP = new String[] {""} ;
      P07ZU2_A856ValCod = new byte[1] ;
      P07ZU2_A793PrvNif = new String[] {""} ;
      P07ZU2_n793PrvNif = new boolean[] {false} ;
      P07ZU2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU2_A737PrdUcpDsc = new String[] {""} ;
      P07ZU2_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZU2_A718PrdNom = new String[] {""} ;
      P07ZU2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      AV24Option = "" ;
      P07ZU3_A795PrvNum = new int[1] ;
      P07ZU3_A742PrdUniCom = new byte[1] ;
      P07ZU3_A396EmprCod = new String[] {""} ;
      P07ZU3_A718PrdNom = new String[] {""} ;
      P07ZU3_A3936PrdEqLP = new String[] {""} ;
      P07ZU3_A856ValCod = new byte[1] ;
      P07ZU3_A793PrvNif = new String[] {""} ;
      P07ZU3_n793PrvNif = new boolean[] {false} ;
      P07ZU3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU3_A737PrdUcpDsc = new String[] {""} ;
      P07ZU3_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZU3_A719PrdNum = new String[] {""} ;
      P07ZU3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU4_A795PrvNum = new int[1] ;
      P07ZU4_A742PrdUniCom = new byte[1] ;
      P07ZU4_A396EmprCod = new String[] {""} ;
      P07ZU4_A3936PrdEqLP = new String[] {""} ;
      P07ZU4_A856ValCod = new byte[1] ;
      P07ZU4_A793PrvNif = new String[] {""} ;
      P07ZU4_n793PrvNif = new boolean[] {false} ;
      P07ZU4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU4_A737PrdUcpDsc = new String[] {""} ;
      P07ZU4_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZU4_A718PrdNom = new String[] {""} ;
      P07ZU4_A719PrdNum = new String[] {""} ;
      P07ZU4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU5_A795PrvNum = new int[1] ;
      P07ZU5_A742PrdUniCom = new byte[1] ;
      P07ZU5_A396EmprCod = new String[] {""} ;
      P07ZU5_A856ValCod = new byte[1] ;
      P07ZU5_A793PrvNif = new String[] {""} ;
      P07ZU5_n793PrvNif = new boolean[] {false} ;
      P07ZU5_A3936PrdEqLP = new String[] {""} ;
      P07ZU5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU5_A737PrdUcpDsc = new String[] {""} ;
      P07ZU5_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZU5_A718PrdNom = new String[] {""} ;
      P07ZU5_A719PrdNum = new String[] {""} ;
      P07ZU5_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZU5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webbcprodgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07ZU2_A795PrvNum, P07ZU2_A742PrdUniCom, P07ZU2_A396EmprCod, P07ZU2_A719PrdNum, P07ZU2_A3936PrdEqLP, P07ZU2_A856ValCod, P07ZU2_A793PrvNif, P07ZU2_n793PrvNif, P07ZU2_A724PrdPreAct, P07ZU2_A737PrdUcpDsc,
            P07ZU2_n737PrdUcpDsc, P07ZU2_A718PrdNom, P07ZU2_A685PrdCanRes, P07ZU2_A704PrdExiAlm
            }
            , new Object[] {
            P07ZU3_A795PrvNum, P07ZU3_A742PrdUniCom, P07ZU3_A396EmprCod, P07ZU3_A718PrdNom, P07ZU3_A3936PrdEqLP, P07ZU3_A856ValCod, P07ZU3_A793PrvNif, P07ZU3_n793PrvNif, P07ZU3_A724PrdPreAct, P07ZU3_A737PrdUcpDsc,
            P07ZU3_n737PrdUcpDsc, P07ZU3_A719PrdNum, P07ZU3_A685PrdCanRes, P07ZU3_A704PrdExiAlm
            }
            , new Object[] {
            P07ZU4_A795PrvNum, P07ZU4_A742PrdUniCom, P07ZU4_A396EmprCod, P07ZU4_A3936PrdEqLP, P07ZU4_A856ValCod, P07ZU4_A793PrvNif, P07ZU4_n793PrvNif, P07ZU4_A724PrdPreAct, P07ZU4_A737PrdUcpDsc, P07ZU4_n737PrdUcpDsc,
            P07ZU4_A718PrdNom, P07ZU4_A719PrdNum, P07ZU4_A685PrdCanRes, P07ZU4_A704PrdExiAlm
            }
            , new Object[] {
            P07ZU5_A795PrvNum, P07ZU5_A742PrdUniCom, P07ZU5_A396EmprCod, P07ZU5_A856ValCod, P07ZU5_A793PrvNif, P07ZU5_n793PrvNif, P07ZU5_A3936PrdEqLP, P07ZU5_A724PrdPreAct, P07ZU5_A737PrdUcpDsc, P07ZU5_n737PrdUcpDsc,
            P07ZU5_A718PrdNom, P07ZU5_A719PrdNum, P07ZU5_A685PrdCanRes, P07ZU5_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A742PrdUniCom ;
   private short Gx_err ;
   private int AV80GXV1 ;
   private int A795PrvNum ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV16TFPrdPreAct ;
   private java.math.BigDecimal AV17TFPrdPreAct_To ;
   private java.math.BigDecimal AV76TFPrdDisponible ;
   private java.math.BigDecimal AV77TFPrdDisponible_To ;
   private java.math.BigDecimal AV88Webbcprodds_7_tfprdpreact ;
   private java.math.BigDecimal AV89Webbcprodds_8_tfprdpreact_to ;
   private java.math.BigDecimal AV90Webbcprodds_9_tfprddisponible ;
   private java.math.BigDecimal AV91Webbcprodds_10_tfprddisponible_to ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV14TFPrdUcpDsc ;
   private String AV15TFPrdUcpDsc_Sel ;
   private String AV18TFPrvNif ;
   private String AV19TFPrvNif_Sel ;
   private String A719PrdNum ;
   private String AV82Webbcprodds_1_tfprdnum ;
   private String AV83Webbcprodds_2_tfprdnum_sel ;
   private String AV84Webbcprodds_3_tfprdnom ;
   private String AV85Webbcprodds_4_tfprdnom_sel ;
   private String AV86Webbcprodds_5_tfprducpdsc ;
   private String AV87Webbcprodds_6_tfprducpdsc_sel ;
   private String AV92Webbcprodds_11_tfprvnif ;
   private String AV93Webbcprodds_12_tfprvnif_sel ;
   private String scmdbuf ;
   private String lV82Webbcprodds_1_tfprdnum ;
   private String lV84Webbcprodds_3_tfprdnom ;
   private String lV86Webbcprodds_5_tfprducpdsc ;
   private String lV92Webbcprodds_11_tfprvnif ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private String A793PrvNif ;
   private String A3936PrdEqLP ;
   private String AV73EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk7ZU2 ;
   private boolean n793PrvNif ;
   private boolean n737PrdUcpDsc ;
   private boolean brk7ZU4 ;
   private boolean brk7ZU6 ;
   private boolean brk7ZU8 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P07ZU2_A795PrvNum ;
   private byte[] P07ZU2_A742PrdUniCom ;
   private String[] P07ZU2_A396EmprCod ;
   private String[] P07ZU2_A719PrdNum ;
   private String[] P07ZU2_A3936PrdEqLP ;
   private byte[] P07ZU2_A856ValCod ;
   private String[] P07ZU2_A793PrvNif ;
   private boolean[] P07ZU2_n793PrvNif ;
   private java.math.BigDecimal[] P07ZU2_A724PrdPreAct ;
   private String[] P07ZU2_A737PrdUcpDsc ;
   private boolean[] P07ZU2_n737PrdUcpDsc ;
   private String[] P07ZU2_A718PrdNom ;
   private java.math.BigDecimal[] P07ZU2_A685PrdCanRes ;
   private java.math.BigDecimal[] P07ZU2_A704PrdExiAlm ;
   private int[] P07ZU3_A795PrvNum ;
   private byte[] P07ZU3_A742PrdUniCom ;
   private String[] P07ZU3_A396EmprCod ;
   private String[] P07ZU3_A718PrdNom ;
   private String[] P07ZU3_A3936PrdEqLP ;
   private byte[] P07ZU3_A856ValCod ;
   private String[] P07ZU3_A793PrvNif ;
   private boolean[] P07ZU3_n793PrvNif ;
   private java.math.BigDecimal[] P07ZU3_A724PrdPreAct ;
   private String[] P07ZU3_A737PrdUcpDsc ;
   private boolean[] P07ZU3_n737PrdUcpDsc ;
   private String[] P07ZU3_A719PrdNum ;
   private java.math.BigDecimal[] P07ZU3_A685PrdCanRes ;
   private java.math.BigDecimal[] P07ZU3_A704PrdExiAlm ;
   private int[] P07ZU4_A795PrvNum ;
   private byte[] P07ZU4_A742PrdUniCom ;
   private String[] P07ZU4_A396EmprCod ;
   private String[] P07ZU4_A3936PrdEqLP ;
   private byte[] P07ZU4_A856ValCod ;
   private String[] P07ZU4_A793PrvNif ;
   private boolean[] P07ZU4_n793PrvNif ;
   private java.math.BigDecimal[] P07ZU4_A724PrdPreAct ;
   private String[] P07ZU4_A737PrdUcpDsc ;
   private boolean[] P07ZU4_n737PrdUcpDsc ;
   private String[] P07ZU4_A718PrdNom ;
   private String[] P07ZU4_A719PrdNum ;
   private java.math.BigDecimal[] P07ZU4_A685PrdCanRes ;
   private java.math.BigDecimal[] P07ZU4_A704PrdExiAlm ;
   private int[] P07ZU5_A795PrvNum ;
   private byte[] P07ZU5_A742PrdUniCom ;
   private String[] P07ZU5_A396EmprCod ;
   private byte[] P07ZU5_A856ValCod ;
   private String[] P07ZU5_A793PrvNif ;
   private boolean[] P07ZU5_n793PrvNif ;
   private String[] P07ZU5_A3936PrdEqLP ;
   private java.math.BigDecimal[] P07ZU5_A724PrdPreAct ;
   private String[] P07ZU5_A737PrdUcpDsc ;
   private boolean[] P07ZU5_n737PrdUcpDsc ;
   private String[] P07ZU5_A718PrdNom ;
   private String[] P07ZU5_A719PrdNum ;
   private java.math.BigDecimal[] P07ZU5_A685PrdCanRes ;
   private java.math.BigDecimal[] P07ZU5_A704PrdExiAlm ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class webbcprodgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Webbcprodds_2_tfprdnum_sel ,
                                          String AV82Webbcprodds_1_tfprdnum ,
                                          String AV85Webbcprodds_4_tfprdnom_sel ,
                                          String AV84Webbcprodds_3_tfprdnom ,
                                          String AV87Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV86Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV88Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV89Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV90Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV91Webbcprodds_10_tfprddisponible_to ,
                                          String AV93Webbcprodds_12_tfprvnif_sel ,
                                          String AV92Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          String A3936PrdEqLP ,
                                          byte A856ValCod ,
                                          String AV73EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.PrdNum, T1.PrdEqLP, T1.ValCod, T2.PrvNif, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNom, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV83Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV82Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV92Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P07ZU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Webbcprodds_2_tfprdnum_sel ,
                                          String AV82Webbcprodds_1_tfprdnum ,
                                          String AV85Webbcprodds_4_tfprdnom_sel ,
                                          String AV84Webbcprodds_3_tfprdnom ,
                                          String AV87Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV86Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV88Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV89Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV90Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV91Webbcprodds_10_tfprddisponible_to ,
                                          String AV93Webbcprodds_12_tfprvnif_sel ,
                                          String AV92Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          String A3936PrdEqLP ,
                                          byte A856ValCod ,
                                          String AV73EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.PrdNom, T1.PrdEqLP, T1.ValCod, T2.PrvNif, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNum, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV83Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV82Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV92Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P07ZU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Webbcprodds_2_tfprdnum_sel ,
                                          String AV82Webbcprodds_1_tfprdnum ,
                                          String AV85Webbcprodds_4_tfprdnom_sel ,
                                          String AV84Webbcprodds_3_tfprdnom ,
                                          String AV87Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV86Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV88Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV89Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV90Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV91Webbcprodds_10_tfprddisponible_to ,
                                          String AV93Webbcprodds_12_tfprvnif_sel ,
                                          String AV92Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          String A3936PrdEqLP ,
                                          byte A856ValCod ,
                                          String AV73EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.PrdEqLP, T1.ValCod, T2.PrvNif, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNom, T1.PrdNum, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV83Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV82Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV92Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdUniCom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P07ZU5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Webbcprodds_2_tfprdnum_sel ,
                                          String AV82Webbcprodds_1_tfprdnum ,
                                          String AV85Webbcprodds_4_tfprdnom_sel ,
                                          String AV84Webbcprodds_3_tfprdnom ,
                                          String AV87Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV86Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV88Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV89Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV90Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV91Webbcprodds_10_tfprddisponible_to ,
                                          String AV93Webbcprodds_12_tfprvnif_sel ,
                                          String AV92Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          String A3936PrdEqLP ,
                                          String A396EmprCod ,
                                          String AV73EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[13];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.ValCod, T2.PrvNif, T1.PrdEqLP, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNom, T1.PrdNum, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV83Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV82Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV92Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrvNif" ;
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
                  return conditional_P07ZU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 1 :
                  return conditional_P07ZU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 2 :
                  return conditional_P07ZU4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 3 :
                  return conditional_P07ZU5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZU5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
      }
   }

}

