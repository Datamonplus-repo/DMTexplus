package app.comprasquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informecompramesacumuladogetfilterdata extends GXProcedure
{
   public informecompramesacumuladogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informecompramesacumuladogetfilterdata.class ), "" );
   }

   public informecompramesacumuladogetfilterdata( int remoteHandle ,
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
      informecompramesacumuladogetfilterdata.this.aP5 = new String[] {""};
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
      informecompramesacumuladogetfilterdata.this.AV22DDOName = aP0;
      informecompramesacumuladogetfilterdata.this.AV20SearchTxt = aP1;
      informecompramesacumuladogetfilterdata.this.AV21SearchTxtTo = aP2;
      informecompramesacumuladogetfilterdata.this.aP3 = aP3;
      informecompramesacumuladogetfilterdata.this.aP4 = aP4;
      informecompramesacumuladogetfilterdata.this.aP5 = aP5;
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
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMMES") == 0 )
         {
            AV10TFPrdNumMes = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrdNumMes_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV14TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUNICPRM") == 0 )
         {
            AV16TFPrdUniCprM = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPrdUniCprM_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCPRM") == 0 )
         {
            AV18TFPrdValCprM = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPrdValCprM_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV20SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = AV38FilterFullText ;
      AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes = AV10TFPrdNumMes ;
      AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to = AV11TFPrdNumMes_To ;
      AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum = AV12TFPrdNum ;
      AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom = AV14TFPrdNom ;
      AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm = AV16TFPrdUniCprM ;
      AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to = AV17TFPrdUniCprM_To ;
      AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm = AV18TFPrdValCprM ;
      AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to = AV19TFPrdValCprM_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext ,
                                           Byte.valueOf(AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes) ,
                                           Byte.valueOf(AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to) ,
                                           AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ,
                                           AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum ,
                                           AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ,
                                           AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom ,
                                           AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ,
                                           AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ,
                                           AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ,
                                           AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A745PrdUniCprM ,
                                           A749PrdValCprM ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV42PrvNum) ,
                                           Integer.valueOf(AV43UProv) ,
                                           AV39Emprcod ,
                                           AV40PrdNum ,
                                           Short.valueOf(AV44Any) ,
                                           Byte.valueOf(AV45Mes) ,
                                           A396EmprCod ,
                                           AV41UProd } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum), 6, "%") ;
      lV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom), 26, "%") ;
      /* Using cursor P09GE2 */
      pr_default.execute(0, new Object[] {AV39Emprcod, AV40PrdNum, Short.valueOf(AV44Any), Byte.valueOf(AV45Mes), Integer.valueOf(AV42PrvNum), Integer.valueOf(AV43UProv), AV41UProd, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, Byte.valueOf(AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes), Byte.valueOf(AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to), lV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum, AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel, lV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom, AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel, AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm, AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to, AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm, AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9GE2 = false ;
         A396EmprCod = P09GE2_A396EmprCod[0] ;
         A719PrdNum = P09GE2_A719PrdNum[0] ;
         A681PrdAny = P09GE2_A681PrdAny[0] ;
         A795PrvNum = P09GE2_A795PrvNum[0] ;
         A749PrdValCprM = P09GE2_A749PrdValCprM[0] ;
         A745PrdUniCprM = P09GE2_A745PrdUniCprM[0] ;
         A718PrdNom = P09GE2_A718PrdNom[0] ;
         A720PrdNumMes = P09GE2_A720PrdNumMes[0] ;
         A795PrvNum = P09GE2_A795PrvNum[0] ;
         A718PrdNom = P09GE2_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09GE2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09GE2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9GE2 = false ;
            A681PrdAny = P09GE2_A681PrdAny[0] ;
            A720PrdNumMes = P09GE2_A720PrdNumMes[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9GE2 = true ;
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
         if ( ! brk9GE2 )
         {
            brk9GE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV20SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = AV38FilterFullText ;
      AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes = AV10TFPrdNumMes ;
      AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to = AV11TFPrdNumMes_To ;
      AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum = AV12TFPrdNum ;
      AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom = AV14TFPrdNom ;
      AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm = AV16TFPrdUniCprM ;
      AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to = AV17TFPrdUniCprM_To ;
      AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm = AV18TFPrdValCprM ;
      AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to = AV19TFPrdValCprM_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext ,
                                           Byte.valueOf(AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes) ,
                                           Byte.valueOf(AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to) ,
                                           AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ,
                                           AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum ,
                                           AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ,
                                           AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom ,
                                           AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ,
                                           AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ,
                                           AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ,
                                           AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A745PrdUniCprM ,
                                           A749PrdValCprM ,
                                           AV40PrdNum ,
                                           AV41UProd ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV42PrvNum) ,
                                           Integer.valueOf(AV43UProv) ,
                                           A396EmprCod ,
                                           AV39Emprcod ,
                                           Short.valueOf(A681PrdAny) ,
                                           Short.valueOf(AV44Any) ,
                                           Byte.valueOf(AV45Mes) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE
                                           }
      });
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
      lV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum), 6, "%") ;
      lV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom), 26, "%") ;
      /* Using cursor P09GE3 */
      pr_default.execute(1, new Object[] {AV40PrdNum, AV41UProd, Integer.valueOf(AV42PrvNum), Integer.valueOf(AV43UProv), AV39Emprcod, Short.valueOf(AV44Any), Byte.valueOf(AV45Mes), lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext, Byte.valueOf(AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes), Byte.valueOf(AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to), lV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum, AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel, lV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom, AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel, AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm, AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to, AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm, AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9GE4 = false ;
         A396EmprCod = P09GE3_A396EmprCod[0] ;
         A681PrdAny = P09GE3_A681PrdAny[0] ;
         A720PrdNumMes = P09GE3_A720PrdNumMes[0] ;
         A718PrdNom = P09GE3_A718PrdNom[0] ;
         A795PrvNum = P09GE3_A795PrvNum[0] ;
         A749PrdValCprM = P09GE3_A749PrdValCprM[0] ;
         A745PrdUniCprM = P09GE3_A745PrdUniCprM[0] ;
         A719PrdNum = P09GE3_A719PrdNum[0] ;
         A718PrdNom = P09GE3_A718PrdNom[0] ;
         A795PrvNum = P09GE3_A795PrvNum[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09GE3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk9GE4 = false ;
            A396EmprCod = P09GE3_A396EmprCod[0] ;
            A681PrdAny = P09GE3_A681PrdAny[0] ;
            A720PrdNumMes = P09GE3_A720PrdNumMes[0] ;
            A719PrdNum = P09GE3_A719PrdNum[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9GE4 = true ;
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
         if ( ! brk9GE4 )
         {
            brk9GE4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = informecompramesacumuladogetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = informecompramesacumuladogetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = informecompramesacumuladogetfilterdata.this.AV31OptionIndexesJson;
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
      AV38FilterFullText = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV16TFPrdUniCprM = DecimalUtil.ZERO ;
      AV17TFPrdUniCprM_To = DecimalUtil.ZERO ;
      AV18TFPrdValCprM = DecimalUtil.ZERO ;
      AV19TFPrdValCprM_To = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = "" ;
      AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum = "" ;
      AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel = "" ;
      AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom = "" ;
      AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel = "" ;
      AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm = DecimalUtil.ZERO ;
      AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to = DecimalUtil.ZERO ;
      AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm = DecimalUtil.ZERO ;
      AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext = "" ;
      lV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum = "" ;
      lV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom = "" ;
      A718PrdNom = "" ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      AV39Emprcod = "" ;
      AV40PrdNum = "" ;
      A396EmprCod = "" ;
      AV41UProd = "" ;
      P09GE2_A396EmprCod = new String[] {""} ;
      P09GE2_A719PrdNum = new String[] {""} ;
      P09GE2_A681PrdAny = new short[1] ;
      P09GE2_A795PrvNum = new int[1] ;
      P09GE2_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GE2_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GE2_A718PrdNom = new String[] {""} ;
      P09GE2_A720PrdNumMes = new byte[1] ;
      AV24Option = "" ;
      P09GE3_A396EmprCod = new String[] {""} ;
      P09GE3_A681PrdAny = new short[1] ;
      P09GE3_A720PrdNumMes = new byte[1] ;
      P09GE3_A718PrdNom = new String[] {""} ;
      P09GE3_A795PrvNum = new int[1] ;
      P09GE3_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GE3_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GE3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.comprasquimicos.informecompramesacumuladogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09GE2_A396EmprCod, P09GE2_A719PrdNum, P09GE2_A681PrdAny, P09GE2_A795PrvNum, P09GE2_A749PrdValCprM, P09GE2_A745PrdUniCprM, P09GE2_A718PrdNom, P09GE2_A720PrdNumMes
            }
            , new Object[] {
            P09GE3_A396EmprCod, P09GE3_A681PrdAny, P09GE3_A720PrdNumMes, P09GE3_A718PrdNom, P09GE3_A795PrvNum, P09GE3_A749PrdValCprM, P09GE3_A745PrdUniCprM, P09GE3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFPrdNumMes ;
   private byte AV11TFPrdNumMes_To ;
   private byte AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes ;
   private byte AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to ;
   private byte A720PrdNumMes ;
   private byte AV45Mes ;
   private short AV44Any ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private int A795PrvNum ;
   private int AV42PrvNum ;
   private int AV43UProv ;
   private long AV32count ;
   private java.math.BigDecimal AV16TFPrdUniCprM ;
   private java.math.BigDecimal AV17TFPrdUniCprM_To ;
   private java.math.BigDecimal AV18TFPrdValCprM ;
   private java.math.BigDecimal AV19TFPrdValCprM_To ;
   private java.math.BigDecimal AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ;
   private java.math.BigDecimal AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ;
   private java.math.BigDecimal AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ;
   private java.math.BigDecimal AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String A719PrdNum ;
   private String AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum ;
   private String AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ;
   private String AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom ;
   private String AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum ;
   private String lV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom ;
   private String A718PrdNom ;
   private String AV39Emprcod ;
   private String AV40PrdNum ;
   private String A396EmprCod ;
   private String AV41UProd ;
   private boolean returnInSub ;
   private boolean brk9GE2 ;
   private boolean brk9GE4 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext ;
   private String lV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09GE2_A396EmprCod ;
   private String[] P09GE2_A719PrdNum ;
   private short[] P09GE2_A681PrdAny ;
   private int[] P09GE2_A795PrvNum ;
   private java.math.BigDecimal[] P09GE2_A749PrdValCprM ;
   private java.math.BigDecimal[] P09GE2_A745PrdUniCprM ;
   private String[] P09GE2_A718PrdNom ;
   private byte[] P09GE2_A720PrdNumMes ;
   private String[] P09GE3_A396EmprCod ;
   private short[] P09GE3_A681PrdAny ;
   private byte[] P09GE3_A720PrdNumMes ;
   private String[] P09GE3_A718PrdNom ;
   private int[] P09GE3_A795PrvNum ;
   private java.math.BigDecimal[] P09GE3_A749PrdValCprM ;
   private java.math.BigDecimal[] P09GE3_A745PrdUniCprM ;
   private String[] P09GE3_A719PrdNum ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class informecompramesacumuladogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext ,
                                          byte AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes ,
                                          byte AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to ,
                                          String AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ,
                                          String AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum ,
                                          String AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ,
                                          String AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom ,
                                          java.math.BigDecimal AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ,
                                          java.math.BigDecimal AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ,
                                          java.math.BigDecimal AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ,
                                          java.math.BigDecimal AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ,
                                          byte A720PrdNumMes ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A745PrdUniCprM ,
                                          java.math.BigDecimal A749PrdValCprM ,
                                          int A795PrvNum ,
                                          int AV42PrvNum ,
                                          int AV43UProv ,
                                          String AV39Emprcod ,
                                          String AV40PrdNum ,
                                          short AV44Any ,
                                          byte AV45Mes ,
                                          String A396EmprCod ,
                                          String AV41UProd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.PrdAny, T2.PrvNum, T1.PrdValCprM, T1.PrdUniCprM, T2.PrdNom, T1.PrdNumMes FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAny = ? and T1.PrdNumMes = ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdUniCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdValCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PrdNumMes,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdUniCprM,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdValCprM,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes) )
      {
         addWhere(sWhereString, "(T1.PrdNumMes >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to) )
      {
         addWhere(sWhereString, "(T1.PrdNumMes <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUniCprM >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUniCprM <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdValCprM >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdValCprM <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAny, T1.PrdNumMes" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09GE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext ,
                                          byte AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes ,
                                          byte AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to ,
                                          String AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ,
                                          String AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum ,
                                          String AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ,
                                          String AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom ,
                                          java.math.BigDecimal AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ,
                                          java.math.BigDecimal AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ,
                                          java.math.BigDecimal AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ,
                                          java.math.BigDecimal AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ,
                                          byte A720PrdNumMes ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A745PrdUniCprM ,
                                          java.math.BigDecimal A749PrdValCprM ,
                                          String AV40PrdNum ,
                                          String AV41UProd ,
                                          int A795PrvNum ,
                                          int AV42PrvNum ,
                                          int AV43UProv ,
                                          String A396EmprCod ,
                                          String AV39Emprcod ,
                                          short A681PrdAny ,
                                          short AV44Any ,
                                          byte AV45Mes )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdAny, T1.PrdNumMes, T2.PrdNom, T2.PrvNum, T1.PrdValCprM, T1.PrdUniCprM, T1.PrdNum FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdUniCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdValCprM <> 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdAny = ?)");
      addWhere(sWhereString, "(T1.PrdNumMes = ?)");
      if ( ! (GXutil.strcmp("", AV50Comprasquimicos_informecompramesacumuladods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PrdNumMes,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdUniCprM,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdValCprM,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV51Comprasquimicos_informecompramesacumuladods_2_tfprdnummes) )
      {
         addWhere(sWhereString, "(T1.PrdNumMes >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV52Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to) )
      {
         addWhere(sWhereString, "(T1.PrdNumMes <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Comprasquimicos_informecompramesacumuladods_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Comprasquimicos_informecompramesacumuladods_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUniCprM >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUniCprM <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdValCprM >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdValCprM <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdNom" ;
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
                  return conditional_P09GE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P09GE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               return;
      }
   }

}

