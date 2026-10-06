package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entrarecuentos_wcgetfilterdata extends GXProcedure
{
   public entrarecuentos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entrarecuentos_wcgetfilterdata.class ), "" );
   }

   public entrarecuentos_wcgetfilterdata( int remoteHandle ,
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
      entrarecuentos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      entrarecuentos_wcgetfilterdata.this.AV30DDOName = aP0;
      entrarecuentos_wcgetfilterdata.this.AV28SearchTxt = aP1;
      entrarecuentos_wcgetfilterdata.this.AV29SearchTxtTo = aP2;
      entrarecuentos_wcgetfilterdata.this.aP3 = aP3;
      entrarecuentos_wcgetfilterdata.this.aP4 = aP4;
      entrarecuentos_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNOM") == 0 )
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
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("EntraRecuentos_WCGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntraRecuentos_WCGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("EntraRecuentos_WCGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV14TFPrdNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV18TFRecExiTeo = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFRecExiTeo_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITCC") == 0 )
         {
            AV24TFRecExiTcc = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFRecExiTcc_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV28SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV54Entrarecuentos_wcds_1_filterfulltext = AV46FilterFullText ;
      AV55Entrarecuentos_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV56Entrarecuentos_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV57Entrarecuentos_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV58Entrarecuentos_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV59Entrarecuentos_wcds_6_tfrecexiteo = AV18TFRecExiTeo ;
      AV60Entrarecuentos_wcds_7_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV61Entrarecuentos_wcds_8_tfrecexitcc = AV24TFRecExiTcc ;
      AV62Entrarecuentos_wcds_9_tfrecexitcc_to = AV25TFRecExiTcc_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Entrarecuentos_wcds_1_filterfulltext ,
                                           AV56Entrarecuentos_wcds_3_tfprdnum_sel ,
                                           AV55Entrarecuentos_wcds_2_tfprdnum ,
                                           AV58Entrarecuentos_wcds_5_tfprdnom_sel ,
                                           AV57Entrarecuentos_wcds_4_tfprdnom ,
                                           AV59Entrarecuentos_wcds_6_tfrecexiteo ,
                                           AV60Entrarecuentos_wcds_7_tfrecexiteo_to ,
                                           AV61Entrarecuentos_wcds_8_tfrecexitcc ,
                                           AV62Entrarecuentos_wcds_9_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           A727PrdRec ,
                                           A810RecFec ,
                                           AV49Recfec ,
                                           Byte.valueOf(A13416RecEstInv) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE
                                           }
      });
      lV54Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV54Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV54Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV54Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV55Entrarecuentos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Entrarecuentos_wcds_2_tfprdnum), 6, "%") ;
      lV57Entrarecuentos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Entrarecuentos_wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P09FH2 */
      pr_default.execute(0, new Object[] {AV49Recfec, lV54Entrarecuentos_wcds_1_filterfulltext, lV54Entrarecuentos_wcds_1_filterfulltext, lV54Entrarecuentos_wcds_1_filterfulltext, lV54Entrarecuentos_wcds_1_filterfulltext, lV55Entrarecuentos_wcds_2_tfprdnum, AV56Entrarecuentos_wcds_3_tfprdnum_sel, lV57Entrarecuentos_wcds_4_tfprdnom, AV58Entrarecuentos_wcds_5_tfprdnom_sel, AV59Entrarecuentos_wcds_6_tfrecexiteo, AV60Entrarecuentos_wcds_7_tfrecexiteo_to, AV61Entrarecuentos_wcds_8_tfrecexitcc, AV62Entrarecuentos_wcds_9_tfrecexitcc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9FH2 = false ;
         A396EmprCod = P09FH2_A396EmprCod[0] ;
         A810RecFec = P09FH2_A810RecFec[0] ;
         A13416RecEstInv = P09FH2_A13416RecEstInv[0] ;
         A719PrdNum = P09FH2_A719PrdNum[0] ;
         A727PrdRec = P09FH2_A727PrdRec[0] ;
         A808RecExiTcc = P09FH2_A808RecExiTcc[0] ;
         A809RecExiTeo = P09FH2_A809RecExiTeo[0] ;
         A718PrdNom = P09FH2_A718PrdNom[0] ;
         A727PrdRec = P09FH2_A727PrdRec[0] ;
         A718PrdNom = P09FH2_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09FH2_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk9FH2 = false ;
               A396EmprCod = P09FH2_A396EmprCod[0] ;
               A810RecFec = P09FH2_A810RecFec[0] ;
               AV40count = (long)(AV40count+1) ;
               brk9FH2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
            {
               AV32Option = A719PrdNum ;
               AV33Options.add(AV32Option, 0);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV33Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9FH2 )
         {
            brk9FH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV28SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV54Entrarecuentos_wcds_1_filterfulltext = AV46FilterFullText ;
      AV55Entrarecuentos_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV56Entrarecuentos_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV57Entrarecuentos_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV58Entrarecuentos_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV59Entrarecuentos_wcds_6_tfrecexiteo = AV18TFRecExiTeo ;
      AV60Entrarecuentos_wcds_7_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV61Entrarecuentos_wcds_8_tfrecexitcc = AV24TFRecExiTcc ;
      AV62Entrarecuentos_wcds_9_tfrecexitcc_to = AV25TFRecExiTcc_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Entrarecuentos_wcds_1_filterfulltext ,
                                           AV56Entrarecuentos_wcds_3_tfprdnum_sel ,
                                           AV55Entrarecuentos_wcds_2_tfprdnum ,
                                           AV58Entrarecuentos_wcds_5_tfprdnom_sel ,
                                           AV57Entrarecuentos_wcds_4_tfprdnom ,
                                           AV59Entrarecuentos_wcds_6_tfrecexiteo ,
                                           AV60Entrarecuentos_wcds_7_tfrecexiteo_to ,
                                           AV61Entrarecuentos_wcds_8_tfrecexitcc ,
                                           AV62Entrarecuentos_wcds_9_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           A727PrdRec ,
                                           A810RecFec ,
                                           AV49Recfec ,
                                           Byte.valueOf(A13416RecEstInv) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE
                                           }
      });
      lV54Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV54Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV54Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV54Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV55Entrarecuentos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Entrarecuentos_wcds_2_tfprdnum), 6, "%") ;
      lV57Entrarecuentos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Entrarecuentos_wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P09FH3 */
      pr_default.execute(1, new Object[] {AV49Recfec, lV54Entrarecuentos_wcds_1_filterfulltext, lV54Entrarecuentos_wcds_1_filterfulltext, lV54Entrarecuentos_wcds_1_filterfulltext, lV54Entrarecuentos_wcds_1_filterfulltext, lV55Entrarecuentos_wcds_2_tfprdnum, AV56Entrarecuentos_wcds_3_tfprdnum_sel, lV57Entrarecuentos_wcds_4_tfprdnom, AV58Entrarecuentos_wcds_5_tfprdnom_sel, AV59Entrarecuentos_wcds_6_tfrecexiteo, AV60Entrarecuentos_wcds_7_tfrecexiteo_to, AV61Entrarecuentos_wcds_8_tfrecexitcc, AV62Entrarecuentos_wcds_9_tfrecexitcc_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9FH4 = false ;
         A396EmprCod = P09FH3_A396EmprCod[0] ;
         A810RecFec = P09FH3_A810RecFec[0] ;
         A13416RecEstInv = P09FH3_A13416RecEstInv[0] ;
         A718PrdNom = P09FH3_A718PrdNom[0] ;
         A727PrdRec = P09FH3_A727PrdRec[0] ;
         A808RecExiTcc = P09FH3_A808RecExiTcc[0] ;
         A809RecExiTeo = P09FH3_A809RecExiTeo[0] ;
         A719PrdNum = P09FH3_A719PrdNum[0] ;
         A718PrdNom = P09FH3_A718PrdNom[0] ;
         A727PrdRec = P09FH3_A727PrdRec[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV40count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09FH3_A718PrdNom[0], A718PrdNom) == 0 ) )
            {
               brk9FH4 = false ;
               A396EmprCod = P09FH3_A396EmprCod[0] ;
               A810RecFec = P09FH3_A810RecFec[0] ;
               A719PrdNum = P09FH3_A719PrdNum[0] ;
               AV40count = (long)(AV40count+1) ;
               brk9FH4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
            {
               AV32Option = A718PrdNom ;
               AV33Options.add(AV32Option, 0);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV33Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9FH4 )
         {
            brk9FH4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entrarecuentos_wcgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = entrarecuentos_wcgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = entrarecuentos_wcgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46FilterFullText = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV18TFRecExiTeo = DecimalUtil.ZERO ;
      AV19TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV24TFRecExiTcc = DecimalUtil.ZERO ;
      AV25TFRecExiTcc_To = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV54Entrarecuentos_wcds_1_filterfulltext = "" ;
      AV55Entrarecuentos_wcds_2_tfprdnum = "" ;
      AV56Entrarecuentos_wcds_3_tfprdnum_sel = "" ;
      AV57Entrarecuentos_wcds_4_tfprdnom = "" ;
      AV58Entrarecuentos_wcds_5_tfprdnom_sel = "" ;
      AV59Entrarecuentos_wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV60Entrarecuentos_wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV61Entrarecuentos_wcds_8_tfrecexitcc = DecimalUtil.ZERO ;
      AV62Entrarecuentos_wcds_9_tfrecexitcc_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV54Entrarecuentos_wcds_1_filterfulltext = "" ;
      lV55Entrarecuentos_wcds_2_tfprdnum = "" ;
      lV57Entrarecuentos_wcds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A810RecFec = GXutil.nullDate() ;
      AV49Recfec = GXutil.nullDate() ;
      P09FH2_A396EmprCod = new String[] {""} ;
      P09FH2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09FH2_A13416RecEstInv = new byte[1] ;
      P09FH2_A719PrdNum = new String[] {""} ;
      P09FH2_A727PrdRec = new String[] {""} ;
      P09FH2_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FH2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FH2_A718PrdNom = new String[] {""} ;
      A396EmprCod = "" ;
      AV32Option = "" ;
      P09FH3_A396EmprCod = new String[] {""} ;
      P09FH3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09FH3_A13416RecEstInv = new byte[1] ;
      P09FH3_A718PrdNom = new String[] {""} ;
      P09FH3_A727PrdRec = new String[] {""} ;
      P09FH3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FH3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FH3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entrarecuentos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09FH2_A396EmprCod, P09FH2_A810RecFec, P09FH2_A13416RecEstInv, P09FH2_A719PrdNum, P09FH2_A727PrdRec, P09FH2_A808RecExiTcc, P09FH2_A809RecExiTeo, P09FH2_A718PrdNom
            }
            , new Object[] {
            P09FH3_A396EmprCod, P09FH3_A810RecFec, P09FH3_A13416RecEstInv, P09FH3_A718PrdNom, P09FH3_A727PrdRec, P09FH3_A808RecExiTcc, P09FH3_A809RecExiTeo, P09FH3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13416RecEstInv ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private long AV40count ;
   private java.math.BigDecimal AV18TFRecExiTeo ;
   private java.math.BigDecimal AV19TFRecExiTeo_To ;
   private java.math.BigDecimal AV24TFRecExiTcc ;
   private java.math.BigDecimal AV25TFRecExiTcc_To ;
   private java.math.BigDecimal AV59Entrarecuentos_wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV60Entrarecuentos_wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV61Entrarecuentos_wcds_8_tfrecexitcc ;
   private java.math.BigDecimal AV62Entrarecuentos_wcds_9_tfrecexitcc_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A808RecExiTcc ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String A719PrdNum ;
   private String AV55Entrarecuentos_wcds_2_tfprdnum ;
   private String AV56Entrarecuentos_wcds_3_tfprdnum_sel ;
   private String AV57Entrarecuentos_wcds_4_tfprdnom ;
   private String AV58Entrarecuentos_wcds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV55Entrarecuentos_wcds_2_tfprdnum ;
   private String lV57Entrarecuentos_wcds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A727PrdRec ;
   private String A396EmprCod ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV49Recfec ;
   private boolean returnInSub ;
   private boolean brk9FH2 ;
   private boolean brk9FH4 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV54Entrarecuentos_wcds_1_filterfulltext ;
   private String lV54Entrarecuentos_wcds_1_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09FH2_A396EmprCod ;
   private java.util.Date[] P09FH2_A810RecFec ;
   private byte[] P09FH2_A13416RecEstInv ;
   private String[] P09FH2_A719PrdNum ;
   private String[] P09FH2_A727PrdRec ;
   private java.math.BigDecimal[] P09FH2_A808RecExiTcc ;
   private java.math.BigDecimal[] P09FH2_A809RecExiTeo ;
   private String[] P09FH2_A718PrdNom ;
   private String[] P09FH3_A396EmprCod ;
   private java.util.Date[] P09FH3_A810RecFec ;
   private byte[] P09FH3_A13416RecEstInv ;
   private String[] P09FH3_A718PrdNom ;
   private String[] P09FH3_A727PrdRec ;
   private java.math.BigDecimal[] P09FH3_A808RecExiTcc ;
   private java.math.BigDecimal[] P09FH3_A809RecExiTeo ;
   private String[] P09FH3_A719PrdNum ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class entrarecuentos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Entrarecuentos_wcds_1_filterfulltext ,
                                          String AV56Entrarecuentos_wcds_3_tfprdnum_sel ,
                                          String AV55Entrarecuentos_wcds_2_tfprdnum ,
                                          String AV58Entrarecuentos_wcds_5_tfprdnom_sel ,
                                          String AV57Entrarecuentos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV59Entrarecuentos_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV60Entrarecuentos_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV61Entrarecuentos_wcds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV62Entrarecuentos_wcds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          String A727PrdRec ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV49Recfec ,
                                          byte A13416RecEstInv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T1.RecEstInv, T1.PrdNum, T2.PrdRec, T1.RecExiTcc, T1.RecExiTeo, T2.PrdNom FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV54Entrarecuentos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Entrarecuentos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Entrarecuentos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Entrarecuentos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Entrarecuentos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Entrarecuentos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Entrarecuentos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Entrarecuentos_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Entrarecuentos_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Entrarecuentos_wcds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Entrarecuentos_wcds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09FH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Entrarecuentos_wcds_1_filterfulltext ,
                                          String AV56Entrarecuentos_wcds_3_tfprdnum_sel ,
                                          String AV55Entrarecuentos_wcds_2_tfprdnum ,
                                          String AV58Entrarecuentos_wcds_5_tfprdnom_sel ,
                                          String AV57Entrarecuentos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV59Entrarecuentos_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV60Entrarecuentos_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV61Entrarecuentos_wcds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV62Entrarecuentos_wcds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          String A727PrdRec ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV49Recfec ,
                                          byte A13416RecEstInv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T1.RecEstInv, T2.PrdNom, T2.PrdRec, T1.RecExiTcc, T1.RecExiTeo, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV54Entrarecuentos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Entrarecuentos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Entrarecuentos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Entrarecuentos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Entrarecuentos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Entrarecuentos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Entrarecuentos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Entrarecuentos_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Entrarecuentos_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Entrarecuentos_wcds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Entrarecuentos_wcds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
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
                  return conditional_P09FH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() );
            case 1 :
                  return conditional_P09FH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               return;
      }
   }

}

