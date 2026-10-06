package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradarecuentosproductosgetfilterdata extends GXProcedure
{
   public entradarecuentosproductosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradarecuentosproductosgetfilterdata.class ), "" );
   }

   public entradarecuentosproductosgetfilterdata( int remoteHandle ,
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
      entradarecuentosproductosgetfilterdata.this.aP5 = new String[] {""};
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
      entradarecuentosproductosgetfilterdata.this.AV20DDOName = aP0;
      entradarecuentosproductosgetfilterdata.this.AV18SearchTxt = aP1;
      entradarecuentosproductosgetfilterdata.this.AV19SearchTxtTo = aP2;
      entradarecuentosproductosgetfilterdata.this.aP3 = aP3;
      entradarecuentosproductosgetfilterdata.this.aP4 = aP4;
      entradarecuentosproductosgetfilterdata.this.aP5 = aP5;
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
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("EntradaRecuentosProductosGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntradaRecuentosProductosGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("EntradaRecuentosProductosGridState"), null, null);
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
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV14TFRecExiTeo = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFRecExiTeo_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITCC") == 0 )
         {
            AV16TFRecExiTcc = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFRecExiTcc_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
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
      AV43Entradarecuentosproductosds_1_filterfulltext = AV36FilterFullText ;
      AV44Entradarecuentosproductosds_2_tfprdnum = AV10TFPrdNum ;
      AV45Entradarecuentosproductosds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV46Entradarecuentosproductosds_4_tfprdnom = AV12TFPrdNom ;
      AV47Entradarecuentosproductosds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV48Entradarecuentosproductosds_6_tfrecexiteo = AV14TFRecExiTeo ;
      AV49Entradarecuentosproductosds_7_tfrecexiteo_to = AV15TFRecExiTeo_To ;
      AV50Entradarecuentosproductosds_8_tfrecexitcc = AV16TFRecExiTcc ;
      AV51Entradarecuentosproductosds_9_tfrecexitcc_to = AV17TFRecExiTcc_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Entradarecuentosproductosds_1_filterfulltext ,
                                           AV45Entradarecuentosproductosds_3_tfprdnum_sel ,
                                           AV44Entradarecuentosproductosds_2_tfprdnum ,
                                           AV47Entradarecuentosproductosds_5_tfprdnom_sel ,
                                           AV46Entradarecuentosproductosds_4_tfprdnom ,
                                           AV48Entradarecuentosproductosds_6_tfrecexiteo ,
                                           AV49Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                           AV50Entradarecuentosproductosds_8_tfrecexitcc ,
                                           AV51Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           A727PrdRec ,
                                           A810RecFec ,
                                           AV38Recfec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV37EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV43Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV43Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV43Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV43Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV44Entradarecuentosproductosds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV44Entradarecuentosproductosds_2_tfprdnum), 6, "%") ;
      lV46Entradarecuentosproductosds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV46Entradarecuentosproductosds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08V42 */
      pr_default.execute(0, new Object[] {AV37EmprCod, AV38Recfec, lV43Entradarecuentosproductosds_1_filterfulltext, lV43Entradarecuentosproductosds_1_filterfulltext, lV43Entradarecuentosproductosds_1_filterfulltext, lV43Entradarecuentosproductosds_1_filterfulltext, lV44Entradarecuentosproductosds_2_tfprdnum, AV45Entradarecuentosproductosds_3_tfprdnum_sel, lV46Entradarecuentosproductosds_4_tfprdnom, AV47Entradarecuentosproductosds_5_tfprdnom_sel, AV48Entradarecuentosproductosds_6_tfrecexiteo, AV49Entradarecuentosproductosds_7_tfrecexiteo_to, AV50Entradarecuentosproductosds_8_tfrecexitcc, AV51Entradarecuentosproductosds_9_tfrecexitcc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8V42 = false ;
         A396EmprCod = P08V42_A396EmprCod[0] ;
         A719PrdNum = P08V42_A719PrdNum[0] ;
         A13416RecEstInv = P08V42_A13416RecEstInv[0] ;
         A727PrdRec = P08V42_A727PrdRec[0] ;
         A810RecFec = P08V42_A810RecFec[0] ;
         A808RecExiTcc = P08V42_A808RecExiTcc[0] ;
         A809RecExiTeo = P08V42_A809RecExiTeo[0] ;
         A718PrdNom = P08V42_A718PrdNom[0] ;
         A727PrdRec = P08V42_A727PrdRec[0] ;
         A718PrdNom = P08V42_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV30count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08V42_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08V42_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk8V42 = false ;
               A810RecFec = P08V42_A810RecFec[0] ;
               AV30count = (long)(AV30count+1) ;
               brk8V42 = true ;
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
         }
         if ( ! brk8V42 )
         {
            brk8V42 = true ;
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
      AV43Entradarecuentosproductosds_1_filterfulltext = AV36FilterFullText ;
      AV44Entradarecuentosproductosds_2_tfprdnum = AV10TFPrdNum ;
      AV45Entradarecuentosproductosds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV46Entradarecuentosproductosds_4_tfprdnom = AV12TFPrdNom ;
      AV47Entradarecuentosproductosds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV48Entradarecuentosproductosds_6_tfrecexiteo = AV14TFRecExiTeo ;
      AV49Entradarecuentosproductosds_7_tfrecexiteo_to = AV15TFRecExiTeo_To ;
      AV50Entradarecuentosproductosds_8_tfrecexitcc = AV16TFRecExiTcc ;
      AV51Entradarecuentosproductosds_9_tfrecexitcc_to = AV17TFRecExiTcc_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV43Entradarecuentosproductosds_1_filterfulltext ,
                                           AV45Entradarecuentosproductosds_3_tfprdnum_sel ,
                                           AV44Entradarecuentosproductosds_2_tfprdnum ,
                                           AV47Entradarecuentosproductosds_5_tfprdnom_sel ,
                                           AV46Entradarecuentosproductosds_4_tfprdnom ,
                                           AV48Entradarecuentosproductosds_6_tfrecexiteo ,
                                           AV49Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                           AV50Entradarecuentosproductosds_8_tfrecexitcc ,
                                           AV51Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           A727PrdRec ,
                                           A396EmprCod ,
                                           AV37EmprCod ,
                                           A810RecFec ,
                                           AV38Recfec ,
                                           Byte.valueOf(A13416RecEstInv) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE
                                           }
      });
      lV43Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV43Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV43Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV43Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV44Entradarecuentosproductosds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV44Entradarecuentosproductosds_2_tfprdnum), 6, "%") ;
      lV46Entradarecuentosproductosds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV46Entradarecuentosproductosds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08V43 */
      pr_default.execute(1, new Object[] {AV37EmprCod, AV38Recfec, lV43Entradarecuentosproductosds_1_filterfulltext, lV43Entradarecuentosproductosds_1_filterfulltext, lV43Entradarecuentosproductosds_1_filterfulltext, lV43Entradarecuentosproductosds_1_filterfulltext, lV44Entradarecuentosproductosds_2_tfprdnum, AV45Entradarecuentosproductosds_3_tfprdnum_sel, lV46Entradarecuentosproductosds_4_tfprdnom, AV47Entradarecuentosproductosds_5_tfprdnom_sel, AV48Entradarecuentosproductosds_6_tfrecexiteo, AV49Entradarecuentosproductosds_7_tfrecexiteo_to, AV50Entradarecuentosproductosds_8_tfrecexitcc, AV51Entradarecuentosproductosds_9_tfrecexitcc_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8V44 = false ;
         A396EmprCod = P08V43_A396EmprCod[0] ;
         A810RecFec = P08V43_A810RecFec[0] ;
         A13416RecEstInv = P08V43_A13416RecEstInv[0] ;
         A718PrdNom = P08V43_A718PrdNom[0] ;
         A727PrdRec = P08V43_A727PrdRec[0] ;
         A808RecExiTcc = P08V43_A808RecExiTcc[0] ;
         A809RecExiTeo = P08V43_A809RecExiTeo[0] ;
         A719PrdNum = P08V43_A719PrdNum[0] ;
         A718PrdNom = P08V43_A718PrdNom[0] ;
         A727PrdRec = P08V43_A727PrdRec[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV30count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08V43_A718PrdNom[0], A718PrdNom) == 0 ) )
            {
               brk8V44 = false ;
               A396EmprCod = P08V43_A396EmprCod[0] ;
               A810RecFec = P08V43_A810RecFec[0] ;
               A719PrdNum = P08V43_A719PrdNum[0] ;
               AV30count = (long)(AV30count+1) ;
               brk8V44 = true ;
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
         }
         if ( ! brk8V44 )
         {
            brk8V44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entradarecuentosproductosgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = entradarecuentosproductosgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = entradarecuentosproductosgetfilterdata.this.AV29OptionIndexesJson;
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
      AV14TFRecExiTeo = DecimalUtil.ZERO ;
      AV15TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV16TFRecExiTcc = DecimalUtil.ZERO ;
      AV17TFRecExiTcc_To = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV43Entradarecuentosproductosds_1_filterfulltext = "" ;
      AV44Entradarecuentosproductosds_2_tfprdnum = "" ;
      AV45Entradarecuentosproductosds_3_tfprdnum_sel = "" ;
      AV46Entradarecuentosproductosds_4_tfprdnom = "" ;
      AV47Entradarecuentosproductosds_5_tfprdnom_sel = "" ;
      AV48Entradarecuentosproductosds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV49Entradarecuentosproductosds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV50Entradarecuentosproductosds_8_tfrecexitcc = DecimalUtil.ZERO ;
      AV51Entradarecuentosproductosds_9_tfrecexitcc_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV43Entradarecuentosproductosds_1_filterfulltext = "" ;
      lV44Entradarecuentosproductosds_2_tfprdnum = "" ;
      lV46Entradarecuentosproductosds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A810RecFec = GXutil.nullDate() ;
      AV38Recfec = GXutil.nullDate() ;
      AV37EmprCod = "" ;
      A396EmprCod = "" ;
      P08V42_A396EmprCod = new String[] {""} ;
      P08V42_A719PrdNum = new String[] {""} ;
      P08V42_A13416RecEstInv = new byte[1] ;
      P08V42_A727PrdRec = new String[] {""} ;
      P08V42_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08V42_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08V42_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08V42_A718PrdNom = new String[] {""} ;
      AV22Option = "" ;
      P08V43_A396EmprCod = new String[] {""} ;
      P08V43_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08V43_A13416RecEstInv = new byte[1] ;
      P08V43_A718PrdNom = new String[] {""} ;
      P08V43_A727PrdRec = new String[] {""} ;
      P08V43_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08V43_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08V43_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentosproductosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08V42_A396EmprCod, P08V42_A719PrdNum, P08V42_A13416RecEstInv, P08V42_A727PrdRec, P08V42_A810RecFec, P08V42_A808RecExiTcc, P08V42_A809RecExiTeo, P08V42_A718PrdNom
            }
            , new Object[] {
            P08V43_A396EmprCod, P08V43_A810RecFec, P08V43_A13416RecEstInv, P08V43_A718PrdNom, P08V43_A727PrdRec, P08V43_A808RecExiTcc, P08V43_A809RecExiTeo, P08V43_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13416RecEstInv ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private long AV30count ;
   private java.math.BigDecimal AV14TFRecExiTeo ;
   private java.math.BigDecimal AV15TFRecExiTeo_To ;
   private java.math.BigDecimal AV16TFRecExiTcc ;
   private java.math.BigDecimal AV17TFRecExiTcc_To ;
   private java.math.BigDecimal AV48Entradarecuentosproductosds_6_tfrecexiteo ;
   private java.math.BigDecimal AV49Entradarecuentosproductosds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV50Entradarecuentosproductosds_8_tfrecexitcc ;
   private java.math.BigDecimal AV51Entradarecuentosproductosds_9_tfrecexitcc_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A808RecExiTcc ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String A719PrdNum ;
   private String AV44Entradarecuentosproductosds_2_tfprdnum ;
   private String AV45Entradarecuentosproductosds_3_tfprdnum_sel ;
   private String AV46Entradarecuentosproductosds_4_tfprdnom ;
   private String AV47Entradarecuentosproductosds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV44Entradarecuentosproductosds_2_tfprdnum ;
   private String lV46Entradarecuentosproductosds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A727PrdRec ;
   private String AV37EmprCod ;
   private String A396EmprCod ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV38Recfec ;
   private boolean returnInSub ;
   private boolean brk8V42 ;
   private boolean brk8V44 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV43Entradarecuentosproductosds_1_filterfulltext ;
   private String lV43Entradarecuentosproductosds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08V42_A396EmprCod ;
   private String[] P08V42_A719PrdNum ;
   private byte[] P08V42_A13416RecEstInv ;
   private String[] P08V42_A727PrdRec ;
   private java.util.Date[] P08V42_A810RecFec ;
   private java.math.BigDecimal[] P08V42_A808RecExiTcc ;
   private java.math.BigDecimal[] P08V42_A809RecExiTeo ;
   private String[] P08V42_A718PrdNom ;
   private String[] P08V43_A396EmprCod ;
   private java.util.Date[] P08V43_A810RecFec ;
   private byte[] P08V43_A13416RecEstInv ;
   private String[] P08V43_A718PrdNom ;
   private String[] P08V43_A727PrdRec ;
   private java.math.BigDecimal[] P08V43_A808RecExiTcc ;
   private java.math.BigDecimal[] P08V43_A809RecExiTeo ;
   private String[] P08V43_A719PrdNum ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class entradarecuentosproductosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08V42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Entradarecuentosproductosds_1_filterfulltext ,
                                          String AV45Entradarecuentosproductosds_3_tfprdnum_sel ,
                                          String AV44Entradarecuentosproductosds_2_tfprdnum ,
                                          String AV47Entradarecuentosproductosds_5_tfprdnom_sel ,
                                          String AV46Entradarecuentosproductosds_4_tfprdnom ,
                                          java.math.BigDecimal AV48Entradarecuentosproductosds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV49Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV50Entradarecuentosproductosds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV51Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          String A727PrdRec ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV38Recfec ,
                                          byte A13416RecEstInv ,
                                          String AV37EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.RecEstInv, T2.PrdRec, T1.RecFec, T1.RecExiTcc, T1.RecExiTeo, T2.PrdNom FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV43Entradarecuentosproductosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Entradarecuentosproductosds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV44Entradarecuentosproductosds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Entradarecuentosproductosds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Entradarecuentosproductosds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV46Entradarecuentosproductosds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Entradarecuentosproductosds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Entradarecuentosproductosds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49Entradarecuentosproductosds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50Entradarecuentosproductosds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Entradarecuentosproductosds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08V43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Entradarecuentosproductosds_1_filterfulltext ,
                                          String AV45Entradarecuentosproductosds_3_tfprdnum_sel ,
                                          String AV44Entradarecuentosproductosds_2_tfprdnum ,
                                          String AV47Entradarecuentosproductosds_5_tfprdnom_sel ,
                                          String AV46Entradarecuentosproductosds_4_tfprdnom ,
                                          java.math.BigDecimal AV48Entradarecuentosproductosds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV49Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV50Entradarecuentosproductosds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV51Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          String A727PrdRec ,
                                          String A396EmprCod ,
                                          String AV37EmprCod ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV38Recfec ,
                                          byte A13416RecEstInv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T1.RecEstInv, T2.PrdNom, T2.PrdRec, T1.RecExiTcc, T1.RecExiTeo, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV43Entradarecuentosproductosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Entradarecuentosproductosds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV44Entradarecuentosproductosds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Entradarecuentosproductosds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Entradarecuentosproductosds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV46Entradarecuentosproductosds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Entradarecuentosproductosds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Entradarecuentosproductosds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49Entradarecuentosproductosds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50Entradarecuentosproductosds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Entradarecuentosproductosds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
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
                  return conditional_P08V42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P08V43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08V42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08V43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               return;
      }
   }

}

