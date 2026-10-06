package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informacionproducto_wcgetfilterdata extends GXProcedure
{
   public informacionproducto_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informacionproducto_wcgetfilterdata.class ), "" );
   }

   public informacionproducto_wcgetfilterdata( int remoteHandle ,
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
      informacionproducto_wcgetfilterdata.this.aP5 = new String[] {""};
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
      informacionproducto_wcgetfilterdata.this.AV20DDOName = aP0;
      informacionproducto_wcgetfilterdata.this.AV18SearchTxt = aP1;
      informacionproducto_wcgetfilterdata.this.AV19SearchTxtTo = aP2;
      informacionproducto_wcgetfilterdata.this.aP3 = aP3;
      informacionproducto_wcgetfilterdata.this.aP4 = aP4;
      informacionproducto_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV31Session.getValue("InformacionProducto_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformacionProducto_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("InformacionProducto_WCGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV14TFPrvNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPrvNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV16TFPrvNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV17TFPrvNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV18SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV43Informacionproducto_wcds_1_filterfulltext = AV36FilterFullText ;
      AV44Informacionproducto_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV45Informacionproducto_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV46Informacionproducto_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV47Informacionproducto_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV48Informacionproducto_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV49Informacionproducto_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV50Informacionproducto_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV51Informacionproducto_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Informacionproducto_wcds_1_filterfulltext ,
                                           AV45Informacionproducto_wcds_3_tfprdnum_sel ,
                                           AV44Informacionproducto_wcds_2_tfprdnum ,
                                           AV47Informacionproducto_wcds_5_tfprdnom_sel ,
                                           AV46Informacionproducto_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV48Informacionproducto_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV49Informacionproducto_wcds_7_tfprvnum_to) ,
                                           AV51Informacionproducto_wcds_9_tfprvnom_sel ,
                                           AV50Informacionproducto_wcds_8_tfprvnom ,
                                           AV37EmprCod ,
                                           AV38PrdNum ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV44Informacionproducto_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV44Informacionproducto_wcds_2_tfprdnum), 6, "%") ;
      lV46Informacionproducto_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV46Informacionproducto_wcds_4_tfprdnom), 26, "%") ;
      lV50Informacionproducto_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV50Informacionproducto_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor P09FZ2 */
      pr_default.execute(0, new Object[] {lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV44Informacionproducto_wcds_2_tfprdnum, AV45Informacionproducto_wcds_3_tfprdnum_sel, lV46Informacionproducto_wcds_4_tfprdnom, AV47Informacionproducto_wcds_5_tfprdnom_sel, Integer.valueOf(AV48Informacionproducto_wcds_6_tfprvnum), Integer.valueOf(AV49Informacionproducto_wcds_7_tfprvnum_to), lV50Informacionproducto_wcds_8_tfprvnom, AV51Informacionproducto_wcds_9_tfprvnom_sel, AV37EmprCod, AV38PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9FZ2 = false ;
         A719PrdNum = P09FZ2_A719PrdNum[0] ;
         A396EmprCod = P09FZ2_A396EmprCod[0] ;
         A794PrvNom = P09FZ2_A794PrvNom[0] ;
         n794PrvNom = P09FZ2_n794PrvNom[0] ;
         A795PrvNum = P09FZ2_A795PrvNum[0] ;
         A718PrdNom = P09FZ2_A718PrdNom[0] ;
         A794PrvNom = P09FZ2_A794PrvNom[0] ;
         n794PrvNom = P09FZ2_n794PrvNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09FZ2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9FZ2 = false ;
            A396EmprCod = P09FZ2_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9FZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV22Option = A719PrdNum ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FZ2 )
         {
            brk9FZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV18SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV43Informacionproducto_wcds_1_filterfulltext = AV36FilterFullText ;
      AV44Informacionproducto_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV45Informacionproducto_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV46Informacionproducto_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV47Informacionproducto_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV48Informacionproducto_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV49Informacionproducto_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV50Informacionproducto_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV51Informacionproducto_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV43Informacionproducto_wcds_1_filterfulltext ,
                                           AV45Informacionproducto_wcds_3_tfprdnum_sel ,
                                           AV44Informacionproducto_wcds_2_tfprdnum ,
                                           AV47Informacionproducto_wcds_5_tfprdnom_sel ,
                                           AV46Informacionproducto_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV48Informacionproducto_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV49Informacionproducto_wcds_7_tfprvnum_to) ,
                                           AV51Informacionproducto_wcds_9_tfprvnom_sel ,
                                           AV50Informacionproducto_wcds_8_tfprvnom ,
                                           AV37EmprCod ,
                                           AV38PrdNum ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV44Informacionproducto_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV44Informacionproducto_wcds_2_tfprdnum), 6, "%") ;
      lV46Informacionproducto_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV46Informacionproducto_wcds_4_tfprdnom), 26, "%") ;
      lV50Informacionproducto_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV50Informacionproducto_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor P09FZ3 */
      pr_default.execute(1, new Object[] {lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV44Informacionproducto_wcds_2_tfprdnum, AV45Informacionproducto_wcds_3_tfprdnum_sel, lV46Informacionproducto_wcds_4_tfprdnom, AV47Informacionproducto_wcds_5_tfprdnom_sel, Integer.valueOf(AV48Informacionproducto_wcds_6_tfprvnum), Integer.valueOf(AV49Informacionproducto_wcds_7_tfprvnum_to), lV50Informacionproducto_wcds_8_tfprvnom, AV51Informacionproducto_wcds_9_tfprvnom_sel, AV37EmprCod, AV38PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9FZ4 = false ;
         A718PrdNom = P09FZ3_A718PrdNom[0] ;
         A396EmprCod = P09FZ3_A396EmprCod[0] ;
         A794PrvNom = P09FZ3_A794PrvNom[0] ;
         n794PrvNom = P09FZ3_n794PrvNom[0] ;
         A795PrvNum = P09FZ3_A795PrvNum[0] ;
         A719PrdNum = P09FZ3_A719PrdNum[0] ;
         A794PrvNom = P09FZ3_A794PrvNom[0] ;
         n794PrvNom = P09FZ3_n794PrvNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09FZ3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk9FZ4 = false ;
            A396EmprCod = P09FZ3_A396EmprCod[0] ;
            A719PrdNum = P09FZ3_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9FZ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV22Option = A718PrdNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FZ4 )
         {
            brk9FZ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrvNom = AV18SearchTxt ;
      AV17TFPrvNom_Sel = "" ;
      AV43Informacionproducto_wcds_1_filterfulltext = AV36FilterFullText ;
      AV44Informacionproducto_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV45Informacionproducto_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV46Informacionproducto_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV47Informacionproducto_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV48Informacionproducto_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV49Informacionproducto_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV50Informacionproducto_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV51Informacionproducto_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV43Informacionproducto_wcds_1_filterfulltext ,
                                           AV45Informacionproducto_wcds_3_tfprdnum_sel ,
                                           AV44Informacionproducto_wcds_2_tfprdnum ,
                                           AV47Informacionproducto_wcds_5_tfprdnom_sel ,
                                           AV46Informacionproducto_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV48Informacionproducto_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV49Informacionproducto_wcds_7_tfprvnum_to) ,
                                           AV51Informacionproducto_wcds_9_tfprvnom_sel ,
                                           AV50Informacionproducto_wcds_8_tfprvnom ,
                                           AV37EmprCod ,
                                           AV38PrdNum ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV43Informacionproducto_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Informacionproducto_wcds_1_filterfulltext), "%", "") ;
      lV44Informacionproducto_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV44Informacionproducto_wcds_2_tfprdnum), 6, "%") ;
      lV46Informacionproducto_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV46Informacionproducto_wcds_4_tfprdnom), 26, "%") ;
      lV50Informacionproducto_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV50Informacionproducto_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor P09FZ4 */
      pr_default.execute(2, new Object[] {lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV43Informacionproducto_wcds_1_filterfulltext, lV44Informacionproducto_wcds_2_tfprdnum, AV45Informacionproducto_wcds_3_tfprdnum_sel, lV46Informacionproducto_wcds_4_tfprdnom, AV47Informacionproducto_wcds_5_tfprdnom_sel, Integer.valueOf(AV48Informacionproducto_wcds_6_tfprvnum), Integer.valueOf(AV49Informacionproducto_wcds_7_tfprvnum_to), lV50Informacionproducto_wcds_8_tfprvnom, AV51Informacionproducto_wcds_9_tfprvnom_sel, AV37EmprCod, AV38PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9FZ6 = false ;
         A795PrvNum = P09FZ4_A795PrvNum[0] ;
         A396EmprCod = P09FZ4_A396EmprCod[0] ;
         A794PrvNom = P09FZ4_A794PrvNom[0] ;
         n794PrvNom = P09FZ4_n794PrvNom[0] ;
         A718PrdNom = P09FZ4_A718PrdNom[0] ;
         A719PrdNum = P09FZ4_A719PrdNum[0] ;
         A794PrvNom = P09FZ4_A794PrvNom[0] ;
         n794PrvNom = P09FZ4_n794PrvNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09FZ4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09FZ4_A795PrvNum[0] == A795PrvNum ) )
         {
            brk9FZ6 = false ;
            A719PrdNum = P09FZ4_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9FZ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
         {
            AV22Option = A794PrvNom ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            AV23Options.add(AV22Option, AV21InsertIndex);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FZ6 )
         {
            brk9FZ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = informacionproducto_wcgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = informacionproducto_wcgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = informacionproducto_wcgetfilterdata.this.AV29OptionIndexesJson;
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
      AV36FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV16TFPrvNom = "" ;
      AV17TFPrvNom_Sel = "" ;
      A719PrdNum = "" ;
      AV43Informacionproducto_wcds_1_filterfulltext = "" ;
      AV44Informacionproducto_wcds_2_tfprdnum = "" ;
      AV45Informacionproducto_wcds_3_tfprdnum_sel = "" ;
      AV46Informacionproducto_wcds_4_tfprdnom = "" ;
      AV47Informacionproducto_wcds_5_tfprdnom_sel = "" ;
      AV50Informacionproducto_wcds_8_tfprvnom = "" ;
      AV51Informacionproducto_wcds_9_tfprvnom_sel = "" ;
      scmdbuf = "" ;
      lV43Informacionproducto_wcds_1_filterfulltext = "" ;
      lV44Informacionproducto_wcds_2_tfprdnum = "" ;
      lV46Informacionproducto_wcds_4_tfprdnom = "" ;
      lV50Informacionproducto_wcds_8_tfprvnom = "" ;
      AV37EmprCod = "" ;
      AV38PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A396EmprCod = "" ;
      P09FZ2_A719PrdNum = new String[] {""} ;
      P09FZ2_A396EmprCod = new String[] {""} ;
      P09FZ2_A794PrvNom = new String[] {""} ;
      P09FZ2_n794PrvNom = new boolean[] {false} ;
      P09FZ2_A795PrvNum = new int[1] ;
      P09FZ2_A718PrdNom = new String[] {""} ;
      AV22Option = "" ;
      P09FZ3_A718PrdNom = new String[] {""} ;
      P09FZ3_A396EmprCod = new String[] {""} ;
      P09FZ3_A794PrvNom = new String[] {""} ;
      P09FZ3_n794PrvNom = new boolean[] {false} ;
      P09FZ3_A795PrvNum = new int[1] ;
      P09FZ3_A719PrdNum = new String[] {""} ;
      P09FZ4_A795PrvNum = new int[1] ;
      P09FZ4_A396EmprCod = new String[] {""} ;
      P09FZ4_A794PrvNom = new String[] {""} ;
      P09FZ4_n794PrvNom = new boolean[] {false} ;
      P09FZ4_A718PrdNom = new String[] {""} ;
      P09FZ4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informacionproducto_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09FZ2_A719PrdNum, P09FZ2_A396EmprCod, P09FZ2_A794PrvNom, P09FZ2_n794PrvNom, P09FZ2_A795PrvNum, P09FZ2_A718PrdNom
            }
            , new Object[] {
            P09FZ3_A718PrdNom, P09FZ3_A396EmprCod, P09FZ3_A794PrvNom, P09FZ3_n794PrvNom, P09FZ3_A795PrvNum, P09FZ3_A719PrdNum
            }
            , new Object[] {
            P09FZ4_A795PrvNum, P09FZ4_A396EmprCod, P09FZ4_A794PrvNom, P09FZ4_n794PrvNom, P09FZ4_A718PrdNom, P09FZ4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV14TFPrvNum ;
   private int AV15TFPrvNum_To ;
   private int AV48Informacionproducto_wcds_6_tfprvnum ;
   private int AV49Informacionproducto_wcds_7_tfprvnum_to ;
   private int A795PrvNum ;
   private int AV21InsertIndex ;
   private long AV30count ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV16TFPrvNom ;
   private String AV17TFPrvNom_Sel ;
   private String A719PrdNum ;
   private String AV44Informacionproducto_wcds_2_tfprdnum ;
   private String AV45Informacionproducto_wcds_3_tfprdnum_sel ;
   private String AV46Informacionproducto_wcds_4_tfprdnom ;
   private String AV47Informacionproducto_wcds_5_tfprdnom_sel ;
   private String AV50Informacionproducto_wcds_8_tfprvnom ;
   private String AV51Informacionproducto_wcds_9_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV44Informacionproducto_wcds_2_tfprdnum ;
   private String lV46Informacionproducto_wcds_4_tfprdnom ;
   private String lV50Informacionproducto_wcds_8_tfprvnom ;
   private String AV37EmprCod ;
   private String AV38PrdNum ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9FZ2 ;
   private boolean n794PrvNom ;
   private boolean brk9FZ4 ;
   private boolean brk9FZ6 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV43Informacionproducto_wcds_1_filterfulltext ;
   private String lV43Informacionproducto_wcds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09FZ2_A719PrdNum ;
   private String[] P09FZ2_A396EmprCod ;
   private String[] P09FZ2_A794PrvNom ;
   private boolean[] P09FZ2_n794PrvNom ;
   private int[] P09FZ2_A795PrvNum ;
   private String[] P09FZ2_A718PrdNom ;
   private String[] P09FZ3_A718PrdNom ;
   private String[] P09FZ3_A396EmprCod ;
   private String[] P09FZ3_A794PrvNom ;
   private boolean[] P09FZ3_n794PrvNom ;
   private int[] P09FZ3_A795PrvNum ;
   private String[] P09FZ3_A719PrdNum ;
   private int[] P09FZ4_A795PrvNum ;
   private String[] P09FZ4_A396EmprCod ;
   private String[] P09FZ4_A794PrvNom ;
   private boolean[] P09FZ4_n794PrvNom ;
   private String[] P09FZ4_A718PrdNom ;
   private String[] P09FZ4_A719PrdNum ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class informacionproducto_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Informacionproducto_wcds_1_filterfulltext ,
                                          String AV45Informacionproducto_wcds_3_tfprdnum_sel ,
                                          String AV44Informacionproducto_wcds_2_tfprdnum ,
                                          String AV47Informacionproducto_wcds_5_tfprdnom_sel ,
                                          String AV46Informacionproducto_wcds_4_tfprdnom ,
                                          int AV48Informacionproducto_wcds_6_tfprvnum ,
                                          int AV49Informacionproducto_wcds_7_tfprvnum_to ,
                                          String AV51Informacionproducto_wcds_9_tfprvnom_sel ,
                                          String AV50Informacionproducto_wcds_8_tfprvnom ,
                                          String AV37EmprCod ,
                                          String AV38PrdNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T2.PrvNom, T1.PrvNum, T1.PrdNom FROM (TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV43Informacionproducto_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Informacionproducto_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV44Informacionproducto_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Informacionproducto_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Informacionproducto_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV46Informacionproducto_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Informacionproducto_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV48Informacionproducto_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV49Informacionproducto_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Informacionproducto_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Informacionproducto_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Informacionproducto_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38PrdNum)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09FZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Informacionproducto_wcds_1_filterfulltext ,
                                          String AV45Informacionproducto_wcds_3_tfprdnum_sel ,
                                          String AV44Informacionproducto_wcds_2_tfprdnum ,
                                          String AV47Informacionproducto_wcds_5_tfprdnom_sel ,
                                          String AV46Informacionproducto_wcds_4_tfprdnom ,
                                          int AV48Informacionproducto_wcds_6_tfprvnum ,
                                          int AV49Informacionproducto_wcds_7_tfprvnum_to ,
                                          String AV51Informacionproducto_wcds_9_tfprvnom_sel ,
                                          String AV50Informacionproducto_wcds_8_tfprvnom ,
                                          String AV37EmprCod ,
                                          String AV38PrdNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNom, T1.EmprCod, T2.PrvNom, T1.PrvNum, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV43Informacionproducto_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Informacionproducto_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV44Informacionproducto_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Informacionproducto_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Informacionproducto_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV46Informacionproducto_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Informacionproducto_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV48Informacionproducto_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV49Informacionproducto_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Informacionproducto_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Informacionproducto_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Informacionproducto_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38PrdNum)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09FZ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Informacionproducto_wcds_1_filterfulltext ,
                                          String AV45Informacionproducto_wcds_3_tfprdnum_sel ,
                                          String AV44Informacionproducto_wcds_2_tfprdnum ,
                                          String AV47Informacionproducto_wcds_5_tfprdnom_sel ,
                                          String AV46Informacionproducto_wcds_4_tfprdnom ,
                                          int AV48Informacionproducto_wcds_6_tfprvnum ,
                                          int AV49Informacionproducto_wcds_7_tfprvnum_to ,
                                          String AV51Informacionproducto_wcds_9_tfprvnom_sel ,
                                          String AV50Informacionproducto_wcds_8_tfprvnom ,
                                          String AV37EmprCod ,
                                          String AV38PrdNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[14];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.EmprCod, T2.PrvNom, T1.PrdNom, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV43Informacionproducto_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Informacionproducto_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV44Informacionproducto_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Informacionproducto_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Informacionproducto_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV46Informacionproducto_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Informacionproducto_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV48Informacionproducto_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV49Informacionproducto_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Informacionproducto_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Informacionproducto_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Informacionproducto_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38PrdNum)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
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
                  return conditional_P09FZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P09FZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 2 :
                  return conditional_P09FZ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FZ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
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
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
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
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
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
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               return;
      }
   }

}

