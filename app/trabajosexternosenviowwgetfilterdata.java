package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajosexternosenviowwgetfilterdata extends GXProcedure
{
   public trabajosexternosenviowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajosexternosenviowwgetfilterdata.class ), "" );
   }

   public trabajosexternosenviowwgetfilterdata( int remoteHandle ,
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
      trabajosexternosenviowwgetfilterdata.this.aP5 = new String[] {""};
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
      trabajosexternosenviowwgetfilterdata.this.AV36DDOName = aP0;
      trabajosexternosenviowwgetfilterdata.this.AV34SearchTxt = aP1;
      trabajosexternosenviowwgetfilterdata.this.AV35SearchTxtTo = aP2;
      trabajosexternosenviowwgetfilterdata.this.aP3 = aP3;
      trabajosexternosenviowwgetfilterdata.this.aP4 = aP4;
      trabajosexternosenviowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MANNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMANNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_TRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTRNNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_SALEXTHOR") == 0 )
      {
         /* Execute user subroutine: 'LOADSALEXTHOROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_SALSTS") == 0 )
      {
         /* Execute user subroutine: 'LOADSALSTSOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV40OptionsJson = AV39Options.toJSonString(false) ;
      AV43OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV44OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue("TrabajosExternosEnvioWWGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternosEnvioWWGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("TrabajosExternosEnvioWWGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTALB") == 0 )
         {
            AV10TFSalExtAlb = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFSalExtAlb_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM") == 0 )
         {
            AV12TFManNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM_SEL") == 0 )
         {
            AV13TFManNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCOD") == 0 )
         {
            AV14TFManCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFManCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV16TFTrnCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFTrnCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV18TFTrnNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV19TFTrnNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTFEC") == 0 )
         {
            AV20TFSalExtFec = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTHOR") == 0 )
         {
            AV22TFSalExtHor = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTHOR_SEL") == 0 )
         {
            AV23TFSalExtHor_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS") == 0 )
         {
            AV57TFSalSts = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS_SEL") == 0 )
         {
            AV58TFSalSts_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMANNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFManNom = AV34SearchTxt ;
      AV13TFManNom_Sel = "" ;
      AV63Trabajosexternosenviowwds_1_filterfulltext = AV52FilterFullText ;
      AV64Trabajosexternosenviowwds_2_tfsalextalb = AV10TFSalExtAlb ;
      AV65Trabajosexternosenviowwds_3_tfsalextalb_to = AV11TFSalExtAlb_To ;
      AV66Trabajosexternosenviowwds_4_tfmannom = AV12TFManNom ;
      AV67Trabajosexternosenviowwds_5_tfmannom_sel = AV13TFManNom_Sel ;
      AV68Trabajosexternosenviowwds_6_tfmancod = AV14TFManCod ;
      AV69Trabajosexternosenviowwds_7_tfmancod_to = AV15TFManCod_To ;
      AV70Trabajosexternosenviowwds_8_tftrncod = AV16TFTrnCod ;
      AV71Trabajosexternosenviowwds_9_tftrncod_to = AV17TFTrnCod_To ;
      AV72Trabajosexternosenviowwds_10_tftrnnom = AV18TFTrnNom ;
      AV73Trabajosexternosenviowwds_11_tftrnnom_sel = AV19TFTrnNom_Sel ;
      AV74Trabajosexternosenviowwds_12_tfsalextfec = AV20TFSalExtFec ;
      AV75Trabajosexternosenviowwds_13_tfsalexthor = AV22TFSalExtHor ;
      AV76Trabajosexternosenviowwds_14_tfsalexthor_sel = AV23TFSalExtHor_Sel ;
      AV77Trabajosexternosenviowwds_15_tfsalsts = AV57TFSalSts ;
      AV78Trabajosexternosenviowwds_16_tfsalsts_sel = AV58TFSalSts_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Trabajosexternosenviowwds_1_filterfulltext ,
                                           Integer.valueOf(AV64Trabajosexternosenviowwds_2_tfsalextalb) ,
                                           Integer.valueOf(AV65Trabajosexternosenviowwds_3_tfsalextalb_to) ,
                                           AV67Trabajosexternosenviowwds_5_tfmannom_sel ,
                                           AV66Trabajosexternosenviowwds_4_tfmannom ,
                                           Short.valueOf(AV68Trabajosexternosenviowwds_6_tfmancod) ,
                                           Short.valueOf(AV69Trabajosexternosenviowwds_7_tfmancod_to) ,
                                           Short.valueOf(AV70Trabajosexternosenviowwds_8_tftrncod) ,
                                           Short.valueOf(AV71Trabajosexternosenviowwds_9_tftrncod_to) ,
                                           AV73Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                           AV72Trabajosexternosenviowwds_10_tftrnnom ,
                                           AV74Trabajosexternosenviowwds_12_tfsalextfec ,
                                           AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                           AV75Trabajosexternosenviowwds_13_tfsalexthor ,
                                           AV78Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                           AV77Trabajosexternosenviowwds_15_tfsalsts ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           A2249ManNom ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A6396SalExtHor ,
                                           A10080SalSts ,
                                           A2256SalExtFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV66Trabajosexternosenviowwds_4_tfmannom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternosenviowwds_4_tfmannom), 30, "%") ;
      lV72Trabajosexternosenviowwds_10_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Trabajosexternosenviowwds_10_tftrnnom), 30, "%") ;
      lV75Trabajosexternosenviowwds_13_tfsalexthor = GXutil.padr( GXutil.rtrim( AV75Trabajosexternosenviowwds_13_tfsalexthor), 8, "%") ;
      lV77Trabajosexternosenviowwds_15_tfsalsts = GXutil.padr( GXutil.rtrim( AV77Trabajosexternosenviowwds_15_tfsalsts), 1, "%") ;
      /* Using cursor P09142 */
      pr_default.execute(0, new Object[] {lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, Integer.valueOf(AV64Trabajosexternosenviowwds_2_tfsalextalb), Integer.valueOf(AV65Trabajosexternosenviowwds_3_tfsalextalb_to), lV66Trabajosexternosenviowwds_4_tfmannom, AV67Trabajosexternosenviowwds_5_tfmannom_sel, Short.valueOf(AV68Trabajosexternosenviowwds_6_tfmancod), Short.valueOf(AV69Trabajosexternosenviowwds_7_tfmancod_to), Short.valueOf(AV70Trabajosexternosenviowwds_8_tftrncod), Short.valueOf(AV71Trabajosexternosenviowwds_9_tftrncod_to), lV72Trabajosexternosenviowwds_10_tftrnnom, AV73Trabajosexternosenviowwds_11_tftrnnom_sel, AV74Trabajosexternosenviowwds_12_tfsalextfec, lV75Trabajosexternosenviowwds_13_tfsalexthor, AV76Trabajosexternosenviowwds_14_tfsalexthor_sel, lV77Trabajosexternosenviowwds_15_tfsalsts, AV78Trabajosexternosenviowwds_16_tfsalsts_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9142 = false ;
         A2248ManCod = P09142_A2248ManCod[0] ;
         A396EmprCod = P09142_A396EmprCod[0] ;
         A10080SalSts = P09142_A10080SalSts[0] ;
         A6396SalExtHor = P09142_A6396SalExtHor[0] ;
         A2256SalExtFec = P09142_A2256SalExtFec[0] ;
         A841TrnNom = P09142_A841TrnNom[0] ;
         n841TrnNom = P09142_n841TrnNom[0] ;
         A840TrnCod = P09142_A840TrnCod[0] ;
         n840TrnCod = P09142_n840TrnCod[0] ;
         A2249ManNom = P09142_A2249ManNom[0] ;
         n2249ManNom = P09142_n2249ManNom[0] ;
         A2253SalExtAlb = P09142_A2253SalExtAlb[0] ;
         A2249ManNom = P09142_A2249ManNom[0] ;
         n2249ManNom = P09142_n2249ManNom[0] ;
         A841TrnNom = P09142_A841TrnNom[0] ;
         n841TrnNom = P09142_n841TrnNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09142_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09142_A2248ManCod[0] == A2248ManCod ) )
         {
            brk9142 = false ;
            A2253SalExtAlb = P09142_A2253SalExtAlb[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9142 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2249ManNom)==0) )
         {
            AV38Option = A2249ManNom ;
            AV37InsertIndex = 1 ;
            while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
            {
               AV37InsertIndex = (int)(AV37InsertIndex+1) ;
            }
            AV39Options.add(AV38Option, AV37InsertIndex);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9142 )
         {
            brk9142 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFTrnNom = AV34SearchTxt ;
      AV19TFTrnNom_Sel = "" ;
      AV63Trabajosexternosenviowwds_1_filterfulltext = AV52FilterFullText ;
      AV64Trabajosexternosenviowwds_2_tfsalextalb = AV10TFSalExtAlb ;
      AV65Trabajosexternosenviowwds_3_tfsalextalb_to = AV11TFSalExtAlb_To ;
      AV66Trabajosexternosenviowwds_4_tfmannom = AV12TFManNom ;
      AV67Trabajosexternosenviowwds_5_tfmannom_sel = AV13TFManNom_Sel ;
      AV68Trabajosexternosenviowwds_6_tfmancod = AV14TFManCod ;
      AV69Trabajosexternosenviowwds_7_tfmancod_to = AV15TFManCod_To ;
      AV70Trabajosexternosenviowwds_8_tftrncod = AV16TFTrnCod ;
      AV71Trabajosexternosenviowwds_9_tftrncod_to = AV17TFTrnCod_To ;
      AV72Trabajosexternosenviowwds_10_tftrnnom = AV18TFTrnNom ;
      AV73Trabajosexternosenviowwds_11_tftrnnom_sel = AV19TFTrnNom_Sel ;
      AV74Trabajosexternosenviowwds_12_tfsalextfec = AV20TFSalExtFec ;
      AV75Trabajosexternosenviowwds_13_tfsalexthor = AV22TFSalExtHor ;
      AV76Trabajosexternosenviowwds_14_tfsalexthor_sel = AV23TFSalExtHor_Sel ;
      AV77Trabajosexternosenviowwds_15_tfsalsts = AV57TFSalSts ;
      AV78Trabajosexternosenviowwds_16_tfsalsts_sel = AV58TFSalSts_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV63Trabajosexternosenviowwds_1_filterfulltext ,
                                           Integer.valueOf(AV64Trabajosexternosenviowwds_2_tfsalextalb) ,
                                           Integer.valueOf(AV65Trabajosexternosenviowwds_3_tfsalextalb_to) ,
                                           AV67Trabajosexternosenviowwds_5_tfmannom_sel ,
                                           AV66Trabajosexternosenviowwds_4_tfmannom ,
                                           Short.valueOf(AV68Trabajosexternosenviowwds_6_tfmancod) ,
                                           Short.valueOf(AV69Trabajosexternosenviowwds_7_tfmancod_to) ,
                                           Short.valueOf(AV70Trabajosexternosenviowwds_8_tftrncod) ,
                                           Short.valueOf(AV71Trabajosexternosenviowwds_9_tftrncod_to) ,
                                           AV73Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                           AV72Trabajosexternosenviowwds_10_tftrnnom ,
                                           AV74Trabajosexternosenviowwds_12_tfsalextfec ,
                                           AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                           AV75Trabajosexternosenviowwds_13_tfsalexthor ,
                                           AV78Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                           AV77Trabajosexternosenviowwds_15_tfsalsts ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           A2249ManNom ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A6396SalExtHor ,
                                           A10080SalSts ,
                                           A2256SalExtFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV66Trabajosexternosenviowwds_4_tfmannom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternosenviowwds_4_tfmannom), 30, "%") ;
      lV72Trabajosexternosenviowwds_10_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Trabajosexternosenviowwds_10_tftrnnom), 30, "%") ;
      lV75Trabajosexternosenviowwds_13_tfsalexthor = GXutil.padr( GXutil.rtrim( AV75Trabajosexternosenviowwds_13_tfsalexthor), 8, "%") ;
      lV77Trabajosexternosenviowwds_15_tfsalsts = GXutil.padr( GXutil.rtrim( AV77Trabajosexternosenviowwds_15_tfsalsts), 1, "%") ;
      /* Using cursor P09143 */
      pr_default.execute(1, new Object[] {lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, Integer.valueOf(AV64Trabajosexternosenviowwds_2_tfsalextalb), Integer.valueOf(AV65Trabajosexternosenviowwds_3_tfsalextalb_to), lV66Trabajosexternosenviowwds_4_tfmannom, AV67Trabajosexternosenviowwds_5_tfmannom_sel, Short.valueOf(AV68Trabajosexternosenviowwds_6_tfmancod), Short.valueOf(AV69Trabajosexternosenviowwds_7_tfmancod_to), Short.valueOf(AV70Trabajosexternosenviowwds_8_tftrncod), Short.valueOf(AV71Trabajosexternosenviowwds_9_tftrncod_to), lV72Trabajosexternosenviowwds_10_tftrnnom, AV73Trabajosexternosenviowwds_11_tftrnnom_sel, AV74Trabajosexternosenviowwds_12_tfsalextfec, lV75Trabajosexternosenviowwds_13_tfsalexthor, AV76Trabajosexternosenviowwds_14_tfsalexthor_sel, lV77Trabajosexternosenviowwds_15_tfsalsts, AV78Trabajosexternosenviowwds_16_tfsalsts_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9144 = false ;
         A840TrnCod = P09143_A840TrnCod[0] ;
         n840TrnCod = P09143_n840TrnCod[0] ;
         A396EmprCod = P09143_A396EmprCod[0] ;
         A10080SalSts = P09143_A10080SalSts[0] ;
         A6396SalExtHor = P09143_A6396SalExtHor[0] ;
         A2256SalExtFec = P09143_A2256SalExtFec[0] ;
         A841TrnNom = P09143_A841TrnNom[0] ;
         n841TrnNom = P09143_n841TrnNom[0] ;
         A2248ManCod = P09143_A2248ManCod[0] ;
         A2249ManNom = P09143_A2249ManNom[0] ;
         n2249ManNom = P09143_n2249ManNom[0] ;
         A2253SalExtAlb = P09143_A2253SalExtAlb[0] ;
         A841TrnNom = P09143_A841TrnNom[0] ;
         n841TrnNom = P09143_n841TrnNom[0] ;
         A2249ManNom = P09143_A2249ManNom[0] ;
         n2249ManNom = P09143_n2249ManNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09143_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09143_A840TrnCod[0] == A840TrnCod ) )
         {
            brk9144 = false ;
            A2253SalExtAlb = P09143_A2253SalExtAlb[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9144 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
         {
            AV38Option = A841TrnNom ;
            AV37InsertIndex = 1 ;
            while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
            {
               AV37InsertIndex = (int)(AV37InsertIndex+1) ;
            }
            AV39Options.add(AV38Option, AV37InsertIndex);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9144 )
         {
            brk9144 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADSALEXTHOROPTIONS' Routine */
      returnInSub = false ;
      AV22TFSalExtHor = AV34SearchTxt ;
      AV23TFSalExtHor_Sel = "" ;
      AV63Trabajosexternosenviowwds_1_filterfulltext = AV52FilterFullText ;
      AV64Trabajosexternosenviowwds_2_tfsalextalb = AV10TFSalExtAlb ;
      AV65Trabajosexternosenviowwds_3_tfsalextalb_to = AV11TFSalExtAlb_To ;
      AV66Trabajosexternosenviowwds_4_tfmannom = AV12TFManNom ;
      AV67Trabajosexternosenviowwds_5_tfmannom_sel = AV13TFManNom_Sel ;
      AV68Trabajosexternosenviowwds_6_tfmancod = AV14TFManCod ;
      AV69Trabajosexternosenviowwds_7_tfmancod_to = AV15TFManCod_To ;
      AV70Trabajosexternosenviowwds_8_tftrncod = AV16TFTrnCod ;
      AV71Trabajosexternosenviowwds_9_tftrncod_to = AV17TFTrnCod_To ;
      AV72Trabajosexternosenviowwds_10_tftrnnom = AV18TFTrnNom ;
      AV73Trabajosexternosenviowwds_11_tftrnnom_sel = AV19TFTrnNom_Sel ;
      AV74Trabajosexternosenviowwds_12_tfsalextfec = AV20TFSalExtFec ;
      AV75Trabajosexternosenviowwds_13_tfsalexthor = AV22TFSalExtHor ;
      AV76Trabajosexternosenviowwds_14_tfsalexthor_sel = AV23TFSalExtHor_Sel ;
      AV77Trabajosexternosenviowwds_15_tfsalsts = AV57TFSalSts ;
      AV78Trabajosexternosenviowwds_16_tfsalsts_sel = AV58TFSalSts_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV63Trabajosexternosenviowwds_1_filterfulltext ,
                                           Integer.valueOf(AV64Trabajosexternosenviowwds_2_tfsalextalb) ,
                                           Integer.valueOf(AV65Trabajosexternosenviowwds_3_tfsalextalb_to) ,
                                           AV67Trabajosexternosenviowwds_5_tfmannom_sel ,
                                           AV66Trabajosexternosenviowwds_4_tfmannom ,
                                           Short.valueOf(AV68Trabajosexternosenviowwds_6_tfmancod) ,
                                           Short.valueOf(AV69Trabajosexternosenviowwds_7_tfmancod_to) ,
                                           Short.valueOf(AV70Trabajosexternosenviowwds_8_tftrncod) ,
                                           Short.valueOf(AV71Trabajosexternosenviowwds_9_tftrncod_to) ,
                                           AV73Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                           AV72Trabajosexternosenviowwds_10_tftrnnom ,
                                           AV74Trabajosexternosenviowwds_12_tfsalextfec ,
                                           AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                           AV75Trabajosexternosenviowwds_13_tfsalexthor ,
                                           AV78Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                           AV77Trabajosexternosenviowwds_15_tfsalsts ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           A2249ManNom ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A6396SalExtHor ,
                                           A10080SalSts ,
                                           A2256SalExtFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV66Trabajosexternosenviowwds_4_tfmannom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternosenviowwds_4_tfmannom), 30, "%") ;
      lV72Trabajosexternosenviowwds_10_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Trabajosexternosenviowwds_10_tftrnnom), 30, "%") ;
      lV75Trabajosexternosenviowwds_13_tfsalexthor = GXutil.padr( GXutil.rtrim( AV75Trabajosexternosenviowwds_13_tfsalexthor), 8, "%") ;
      lV77Trabajosexternosenviowwds_15_tfsalsts = GXutil.padr( GXutil.rtrim( AV77Trabajosexternosenviowwds_15_tfsalsts), 1, "%") ;
      /* Using cursor P09144 */
      pr_default.execute(2, new Object[] {lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, Integer.valueOf(AV64Trabajosexternosenviowwds_2_tfsalextalb), Integer.valueOf(AV65Trabajosexternosenviowwds_3_tfsalextalb_to), lV66Trabajosexternosenviowwds_4_tfmannom, AV67Trabajosexternosenviowwds_5_tfmannom_sel, Short.valueOf(AV68Trabajosexternosenviowwds_6_tfmancod), Short.valueOf(AV69Trabajosexternosenviowwds_7_tfmancod_to), Short.valueOf(AV70Trabajosexternosenviowwds_8_tftrncod), Short.valueOf(AV71Trabajosexternosenviowwds_9_tftrncod_to), lV72Trabajosexternosenviowwds_10_tftrnnom, AV73Trabajosexternosenviowwds_11_tftrnnom_sel, AV74Trabajosexternosenviowwds_12_tfsalextfec, lV75Trabajosexternosenviowwds_13_tfsalexthor, AV76Trabajosexternosenviowwds_14_tfsalexthor_sel, lV77Trabajosexternosenviowwds_15_tfsalsts, AV78Trabajosexternosenviowwds_16_tfsalsts_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9146 = false ;
         A396EmprCod = P09144_A396EmprCod[0] ;
         A6396SalExtHor = P09144_A6396SalExtHor[0] ;
         A10080SalSts = P09144_A10080SalSts[0] ;
         A2256SalExtFec = P09144_A2256SalExtFec[0] ;
         A841TrnNom = P09144_A841TrnNom[0] ;
         n841TrnNom = P09144_n841TrnNom[0] ;
         A840TrnCod = P09144_A840TrnCod[0] ;
         n840TrnCod = P09144_n840TrnCod[0] ;
         A2248ManCod = P09144_A2248ManCod[0] ;
         A2249ManNom = P09144_A2249ManNom[0] ;
         n2249ManNom = P09144_n2249ManNom[0] ;
         A2253SalExtAlb = P09144_A2253SalExtAlb[0] ;
         A841TrnNom = P09144_A841TrnNom[0] ;
         n841TrnNom = P09144_n841TrnNom[0] ;
         A2249ManNom = P09144_A2249ManNom[0] ;
         n2249ManNom = P09144_n2249ManNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09144_A6396SalExtHor[0], A6396SalExtHor) == 0 ) )
         {
            brk9146 = false ;
            A396EmprCod = P09144_A396EmprCod[0] ;
            A2253SalExtAlb = P09144_A2253SalExtAlb[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9146 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A6396SalExtHor)==0) )
         {
            AV38Option = A6396SalExtHor ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9146 )
         {
            brk9146 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADSALSTSOPTIONS' Routine */
      returnInSub = false ;
      AV57TFSalSts = AV34SearchTxt ;
      AV58TFSalSts_Sel = "" ;
      AV63Trabajosexternosenviowwds_1_filterfulltext = AV52FilterFullText ;
      AV64Trabajosexternosenviowwds_2_tfsalextalb = AV10TFSalExtAlb ;
      AV65Trabajosexternosenviowwds_3_tfsalextalb_to = AV11TFSalExtAlb_To ;
      AV66Trabajosexternosenviowwds_4_tfmannom = AV12TFManNom ;
      AV67Trabajosexternosenviowwds_5_tfmannom_sel = AV13TFManNom_Sel ;
      AV68Trabajosexternosenviowwds_6_tfmancod = AV14TFManCod ;
      AV69Trabajosexternosenviowwds_7_tfmancod_to = AV15TFManCod_To ;
      AV70Trabajosexternosenviowwds_8_tftrncod = AV16TFTrnCod ;
      AV71Trabajosexternosenviowwds_9_tftrncod_to = AV17TFTrnCod_To ;
      AV72Trabajosexternosenviowwds_10_tftrnnom = AV18TFTrnNom ;
      AV73Trabajosexternosenviowwds_11_tftrnnom_sel = AV19TFTrnNom_Sel ;
      AV74Trabajosexternosenviowwds_12_tfsalextfec = AV20TFSalExtFec ;
      AV75Trabajosexternosenviowwds_13_tfsalexthor = AV22TFSalExtHor ;
      AV76Trabajosexternosenviowwds_14_tfsalexthor_sel = AV23TFSalExtHor_Sel ;
      AV77Trabajosexternosenviowwds_15_tfsalsts = AV57TFSalSts ;
      AV78Trabajosexternosenviowwds_16_tfsalsts_sel = AV58TFSalSts_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV63Trabajosexternosenviowwds_1_filterfulltext ,
                                           Integer.valueOf(AV64Trabajosexternosenviowwds_2_tfsalextalb) ,
                                           Integer.valueOf(AV65Trabajosexternosenviowwds_3_tfsalextalb_to) ,
                                           AV67Trabajosexternosenviowwds_5_tfmannom_sel ,
                                           AV66Trabajosexternosenviowwds_4_tfmannom ,
                                           Short.valueOf(AV68Trabajosexternosenviowwds_6_tfmancod) ,
                                           Short.valueOf(AV69Trabajosexternosenviowwds_7_tfmancod_to) ,
                                           Short.valueOf(AV70Trabajosexternosenviowwds_8_tftrncod) ,
                                           Short.valueOf(AV71Trabajosexternosenviowwds_9_tftrncod_to) ,
                                           AV73Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                           AV72Trabajosexternosenviowwds_10_tftrnnom ,
                                           AV74Trabajosexternosenviowwds_12_tfsalextfec ,
                                           AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                           AV75Trabajosexternosenviowwds_13_tfsalexthor ,
                                           AV78Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                           AV77Trabajosexternosenviowwds_15_tfsalsts ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           A2249ManNom ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A6396SalExtHor ,
                                           A10080SalSts ,
                                           A2256SalExtFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV66Trabajosexternosenviowwds_4_tfmannom = GXutil.padr( GXutil.rtrim( AV66Trabajosexternosenviowwds_4_tfmannom), 30, "%") ;
      lV72Trabajosexternosenviowwds_10_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Trabajosexternosenviowwds_10_tftrnnom), 30, "%") ;
      lV75Trabajosexternosenviowwds_13_tfsalexthor = GXutil.padr( GXutil.rtrim( AV75Trabajosexternosenviowwds_13_tfsalexthor), 8, "%") ;
      lV77Trabajosexternosenviowwds_15_tfsalsts = GXutil.padr( GXutil.rtrim( AV77Trabajosexternosenviowwds_15_tfsalsts), 1, "%") ;
      /* Using cursor P09145 */
      pr_default.execute(3, new Object[] {lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, lV63Trabajosexternosenviowwds_1_filterfulltext, Integer.valueOf(AV64Trabajosexternosenviowwds_2_tfsalextalb), Integer.valueOf(AV65Trabajosexternosenviowwds_3_tfsalextalb_to), lV66Trabajosexternosenviowwds_4_tfmannom, AV67Trabajosexternosenviowwds_5_tfmannom_sel, Short.valueOf(AV68Trabajosexternosenviowwds_6_tfmancod), Short.valueOf(AV69Trabajosexternosenviowwds_7_tfmancod_to), Short.valueOf(AV70Trabajosexternosenviowwds_8_tftrncod), Short.valueOf(AV71Trabajosexternosenviowwds_9_tftrncod_to), lV72Trabajosexternosenviowwds_10_tftrnnom, AV73Trabajosexternosenviowwds_11_tftrnnom_sel, AV74Trabajosexternosenviowwds_12_tfsalextfec, lV75Trabajosexternosenviowwds_13_tfsalexthor, AV76Trabajosexternosenviowwds_14_tfsalexthor_sel, lV77Trabajosexternosenviowwds_15_tfsalsts, AV78Trabajosexternosenviowwds_16_tfsalsts_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9148 = false ;
         A396EmprCod = P09145_A396EmprCod[0] ;
         A10080SalSts = P09145_A10080SalSts[0] ;
         A6396SalExtHor = P09145_A6396SalExtHor[0] ;
         A2256SalExtFec = P09145_A2256SalExtFec[0] ;
         A841TrnNom = P09145_A841TrnNom[0] ;
         n841TrnNom = P09145_n841TrnNom[0] ;
         A840TrnCod = P09145_A840TrnCod[0] ;
         n840TrnCod = P09145_n840TrnCod[0] ;
         A2248ManCod = P09145_A2248ManCod[0] ;
         A2249ManNom = P09145_A2249ManNom[0] ;
         n2249ManNom = P09145_n2249ManNom[0] ;
         A2253SalExtAlb = P09145_A2253SalExtAlb[0] ;
         A841TrnNom = P09145_A841TrnNom[0] ;
         n841TrnNom = P09145_n841TrnNom[0] ;
         A2249ManNom = P09145_A2249ManNom[0] ;
         n2249ManNom = P09145_n2249ManNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09145_A10080SalSts[0], A10080SalSts) == 0 ) )
         {
            brk9148 = false ;
            A396EmprCod = P09145_A396EmprCod[0] ;
            A2253SalExtAlb = P09145_A2253SalExtAlb[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9148 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A10080SalSts)==0) )
         {
            AV38Option = A10080SalSts ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9148 )
         {
            brk9148 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = trabajosexternosenviowwgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = trabajosexternosenviowwgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = trabajosexternosenviowwgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40OptionsJson = "" ;
      AV43OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52FilterFullText = "" ;
      AV12TFManNom = "" ;
      AV13TFManNom_Sel = "" ;
      AV18TFTrnNom = "" ;
      AV19TFTrnNom_Sel = "" ;
      AV20TFSalExtFec = GXutil.nullDate() ;
      AV22TFSalExtHor = "" ;
      AV23TFSalExtHor_Sel = "" ;
      AV57TFSalSts = "" ;
      AV58TFSalSts_Sel = "" ;
      A2249ManNom = "" ;
      AV63Trabajosexternosenviowwds_1_filterfulltext = "" ;
      AV66Trabajosexternosenviowwds_4_tfmannom = "" ;
      AV67Trabajosexternosenviowwds_5_tfmannom_sel = "" ;
      AV72Trabajosexternosenviowwds_10_tftrnnom = "" ;
      AV73Trabajosexternosenviowwds_11_tftrnnom_sel = "" ;
      AV74Trabajosexternosenviowwds_12_tfsalextfec = GXutil.nullDate() ;
      AV75Trabajosexternosenviowwds_13_tfsalexthor = "" ;
      AV76Trabajosexternosenviowwds_14_tfsalexthor_sel = "" ;
      AV77Trabajosexternosenviowwds_15_tfsalsts = "" ;
      AV78Trabajosexternosenviowwds_16_tfsalsts_sel = "" ;
      scmdbuf = "" ;
      lV63Trabajosexternosenviowwds_1_filterfulltext = "" ;
      lV66Trabajosexternosenviowwds_4_tfmannom = "" ;
      lV72Trabajosexternosenviowwds_10_tftrnnom = "" ;
      lV75Trabajosexternosenviowwds_13_tfsalexthor = "" ;
      lV77Trabajosexternosenviowwds_15_tfsalsts = "" ;
      A841TrnNom = "" ;
      A6396SalExtHor = "" ;
      A10080SalSts = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      P09142_A2248ManCod = new short[1] ;
      P09142_A396EmprCod = new String[] {""} ;
      P09142_A10080SalSts = new String[] {""} ;
      P09142_A6396SalExtHor = new String[] {""} ;
      P09142_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09142_A841TrnNom = new String[] {""} ;
      P09142_n841TrnNom = new boolean[] {false} ;
      P09142_A840TrnCod = new short[1] ;
      P09142_n840TrnCod = new boolean[] {false} ;
      P09142_A2249ManNom = new String[] {""} ;
      P09142_n2249ManNom = new boolean[] {false} ;
      P09142_A2253SalExtAlb = new int[1] ;
      A396EmprCod = "" ;
      AV38Option = "" ;
      P09143_A840TrnCod = new short[1] ;
      P09143_n840TrnCod = new boolean[] {false} ;
      P09143_A396EmprCod = new String[] {""} ;
      P09143_A10080SalSts = new String[] {""} ;
      P09143_A6396SalExtHor = new String[] {""} ;
      P09143_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09143_A841TrnNom = new String[] {""} ;
      P09143_n841TrnNom = new boolean[] {false} ;
      P09143_A2248ManCod = new short[1] ;
      P09143_A2249ManNom = new String[] {""} ;
      P09143_n2249ManNom = new boolean[] {false} ;
      P09143_A2253SalExtAlb = new int[1] ;
      P09144_A396EmprCod = new String[] {""} ;
      P09144_A6396SalExtHor = new String[] {""} ;
      P09144_A10080SalSts = new String[] {""} ;
      P09144_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09144_A841TrnNom = new String[] {""} ;
      P09144_n841TrnNom = new boolean[] {false} ;
      P09144_A840TrnCod = new short[1] ;
      P09144_n840TrnCod = new boolean[] {false} ;
      P09144_A2248ManCod = new short[1] ;
      P09144_A2249ManNom = new String[] {""} ;
      P09144_n2249ManNom = new boolean[] {false} ;
      P09144_A2253SalExtAlb = new int[1] ;
      P09145_A396EmprCod = new String[] {""} ;
      P09145_A10080SalSts = new String[] {""} ;
      P09145_A6396SalExtHor = new String[] {""} ;
      P09145_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09145_A841TrnNom = new String[] {""} ;
      P09145_n841TrnNom = new boolean[] {false} ;
      P09145_A840TrnCod = new short[1] ;
      P09145_n840TrnCod = new boolean[] {false} ;
      P09145_A2248ManCod = new short[1] ;
      P09145_A2249ManNom = new String[] {""} ;
      P09145_n2249ManNom = new boolean[] {false} ;
      P09145_A2253SalExtAlb = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenviowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09142_A2248ManCod, P09142_A396EmprCod, P09142_A10080SalSts, P09142_A6396SalExtHor, P09142_A2256SalExtFec, P09142_A841TrnNom, P09142_n841TrnNom, P09142_A840TrnCod, P09142_n840TrnCod, P09142_A2249ManNom,
            P09142_n2249ManNom, P09142_A2253SalExtAlb
            }
            , new Object[] {
            P09143_A840TrnCod, P09143_n840TrnCod, P09143_A396EmprCod, P09143_A10080SalSts, P09143_A6396SalExtHor, P09143_A2256SalExtFec, P09143_A841TrnNom, P09143_n841TrnNom, P09143_A2248ManCod, P09143_A2249ManNom,
            P09143_n2249ManNom, P09143_A2253SalExtAlb
            }
            , new Object[] {
            P09144_A396EmprCod, P09144_A6396SalExtHor, P09144_A10080SalSts, P09144_A2256SalExtFec, P09144_A841TrnNom, P09144_n841TrnNom, P09144_A840TrnCod, P09144_n840TrnCod, P09144_A2248ManCod, P09144_A2249ManNom,
            P09144_n2249ManNom, P09144_A2253SalExtAlb
            }
            , new Object[] {
            P09145_A396EmprCod, P09145_A10080SalSts, P09145_A6396SalExtHor, P09145_A2256SalExtFec, P09145_A841TrnNom, P09145_n841TrnNom, P09145_A840TrnCod, P09145_n840TrnCod, P09145_A2248ManCod, P09145_A2249ManNom,
            P09145_n2249ManNom, P09145_A2253SalExtAlb
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14TFManCod ;
   private short AV15TFManCod_To ;
   private short AV16TFTrnCod ;
   private short AV17TFTrnCod_To ;
   private short AV68Trabajosexternosenviowwds_6_tfmancod ;
   private short AV69Trabajosexternosenviowwds_7_tfmancod_to ;
   private short AV70Trabajosexternosenviowwds_8_tftrncod ;
   private short AV71Trabajosexternosenviowwds_9_tftrncod_to ;
   private short A2248ManCod ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV10TFSalExtAlb ;
   private int AV11TFSalExtAlb_To ;
   private int AV64Trabajosexternosenviowwds_2_tfsalextalb ;
   private int AV65Trabajosexternosenviowwds_3_tfsalextalb_to ;
   private int A2253SalExtAlb ;
   private int AV37InsertIndex ;
   private long AV46count ;
   private String AV12TFManNom ;
   private String AV13TFManNom_Sel ;
   private String AV18TFTrnNom ;
   private String AV19TFTrnNom_Sel ;
   private String AV22TFSalExtHor ;
   private String AV23TFSalExtHor_Sel ;
   private String AV57TFSalSts ;
   private String AV58TFSalSts_Sel ;
   private String A2249ManNom ;
   private String AV66Trabajosexternosenviowwds_4_tfmannom ;
   private String AV67Trabajosexternosenviowwds_5_tfmannom_sel ;
   private String AV72Trabajosexternosenviowwds_10_tftrnnom ;
   private String AV73Trabajosexternosenviowwds_11_tftrnnom_sel ;
   private String AV75Trabajosexternosenviowwds_13_tfsalexthor ;
   private String AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ;
   private String AV77Trabajosexternosenviowwds_15_tfsalsts ;
   private String AV78Trabajosexternosenviowwds_16_tfsalsts_sel ;
   private String scmdbuf ;
   private String lV66Trabajosexternosenviowwds_4_tfmannom ;
   private String lV72Trabajosexternosenviowwds_10_tftrnnom ;
   private String lV75Trabajosexternosenviowwds_13_tfsalexthor ;
   private String lV77Trabajosexternosenviowwds_15_tfsalsts ;
   private String A841TrnNom ;
   private String A6396SalExtHor ;
   private String A10080SalSts ;
   private String A396EmprCod ;
   private java.util.Date AV20TFSalExtFec ;
   private java.util.Date AV74Trabajosexternosenviowwds_12_tfsalextfec ;
   private java.util.Date A2256SalExtFec ;
   private boolean returnInSub ;
   private boolean brk9142 ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n2249ManNom ;
   private boolean brk9144 ;
   private boolean brk9146 ;
   private boolean brk9148 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV63Trabajosexternosenviowwds_1_filterfulltext ;
   private String lV63Trabajosexternosenviowwds_1_filterfulltext ;
   private String AV38Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09142_A2248ManCod ;
   private String[] P09142_A396EmprCod ;
   private String[] P09142_A10080SalSts ;
   private String[] P09142_A6396SalExtHor ;
   private java.util.Date[] P09142_A2256SalExtFec ;
   private String[] P09142_A841TrnNom ;
   private boolean[] P09142_n841TrnNom ;
   private short[] P09142_A840TrnCod ;
   private boolean[] P09142_n840TrnCod ;
   private String[] P09142_A2249ManNom ;
   private boolean[] P09142_n2249ManNom ;
   private int[] P09142_A2253SalExtAlb ;
   private short[] P09143_A840TrnCod ;
   private boolean[] P09143_n840TrnCod ;
   private String[] P09143_A396EmprCod ;
   private String[] P09143_A10080SalSts ;
   private String[] P09143_A6396SalExtHor ;
   private java.util.Date[] P09143_A2256SalExtFec ;
   private String[] P09143_A841TrnNom ;
   private boolean[] P09143_n841TrnNom ;
   private short[] P09143_A2248ManCod ;
   private String[] P09143_A2249ManNom ;
   private boolean[] P09143_n2249ManNom ;
   private int[] P09143_A2253SalExtAlb ;
   private String[] P09144_A396EmprCod ;
   private String[] P09144_A6396SalExtHor ;
   private String[] P09144_A10080SalSts ;
   private java.util.Date[] P09144_A2256SalExtFec ;
   private String[] P09144_A841TrnNom ;
   private boolean[] P09144_n841TrnNom ;
   private short[] P09144_A840TrnCod ;
   private boolean[] P09144_n840TrnCod ;
   private short[] P09144_A2248ManCod ;
   private String[] P09144_A2249ManNom ;
   private boolean[] P09144_n2249ManNom ;
   private int[] P09144_A2253SalExtAlb ;
   private String[] P09145_A396EmprCod ;
   private String[] P09145_A10080SalSts ;
   private String[] P09145_A6396SalExtHor ;
   private java.util.Date[] P09145_A2256SalExtFec ;
   private String[] P09145_A841TrnNom ;
   private boolean[] P09145_n841TrnNom ;
   private short[] P09145_A840TrnCod ;
   private boolean[] P09145_n840TrnCod ;
   private short[] P09145_A2248ManCod ;
   private String[] P09145_A2249ManNom ;
   private boolean[] P09145_n2249ManNom ;
   private int[] P09145_A2253SalExtAlb ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class trabajosexternosenviowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09142( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Trabajosexternosenviowwds_1_filterfulltext ,
                                          int AV64Trabajosexternosenviowwds_2_tfsalextalb ,
                                          int AV65Trabajosexternosenviowwds_3_tfsalextalb_to ,
                                          String AV67Trabajosexternosenviowwds_5_tfmannom_sel ,
                                          String AV66Trabajosexternosenviowwds_4_tfmannom ,
                                          short AV68Trabajosexternosenviowwds_6_tfmancod ,
                                          short AV69Trabajosexternosenviowwds_7_tfmancod_to ,
                                          short AV70Trabajosexternosenviowwds_8_tftrncod ,
                                          short AV71Trabajosexternosenviowwds_9_tftrncod_to ,
                                          String AV73Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                          String AV72Trabajosexternosenviowwds_10_tftrnnom ,
                                          java.util.Date AV74Trabajosexternosenviowwds_12_tfsalextfec ,
                                          String AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                          String AV75Trabajosexternosenviowwds_13_tfsalexthor ,
                                          String AV78Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                          String AV77Trabajosexternosenviowwds_15_tfsalsts ,
                                          int A2253SalExtAlb ,
                                          String A2249ManNom ,
                                          short A2248ManCod ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A6396SalExtHor ,
                                          String A10080SalSts ,
                                          java.util.Date A2256SalExtFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ManCod, T1.EmprCod, T1.SalSts, T1.SalExtHor, T1.SalExtFec, T3.TrnNom, T1.TrnCod, T2.ManNom, T1.SalExtAlb FROM ((TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      if ( ! (GXutil.strcmp("", AV63Trabajosexternosenviowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.SalExtAlb,'99999990'), 2) like '%' || ?) or ( UPPER(T2.ManNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.SalExtHor) like '%' || UPPER(?)) or ( UPPER(T1.SalSts) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternosenviowwds_2_tfsalextalb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternosenviowwds_3_tfsalextalb_to) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternosenviowwds_5_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternosenviowwds_4_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternosenviowwds_5_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ManNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternosenviowwds_6_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Trabajosexternosenviowwds_7_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Trabajosexternosenviowwds_8_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternosenviowwds_9_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternosenviowwds_11_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternosenviowwds_10_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternosenviowwds_11_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Trabajosexternosenviowwds_12_tfsalextfec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternosenviowwds_13_tfsalexthor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtHor = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternosenviowwds_16_tfsalsts_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternosenviowwds_15_tfsalsts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternosenviowwds_16_tfsalsts_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalSts = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ManCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09143( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Trabajosexternosenviowwds_1_filterfulltext ,
                                          int AV64Trabajosexternosenviowwds_2_tfsalextalb ,
                                          int AV65Trabajosexternosenviowwds_3_tfsalextalb_to ,
                                          String AV67Trabajosexternosenviowwds_5_tfmannom_sel ,
                                          String AV66Trabajosexternosenviowwds_4_tfmannom ,
                                          short AV68Trabajosexternosenviowwds_6_tfmancod ,
                                          short AV69Trabajosexternosenviowwds_7_tfmancod_to ,
                                          short AV70Trabajosexternosenviowwds_8_tftrncod ,
                                          short AV71Trabajosexternosenviowwds_9_tftrncod_to ,
                                          String AV73Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                          String AV72Trabajosexternosenviowwds_10_tftrnnom ,
                                          java.util.Date AV74Trabajosexternosenviowwds_12_tfsalextfec ,
                                          String AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                          String AV75Trabajosexternosenviowwds_13_tfsalexthor ,
                                          String AV78Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                          String AV77Trabajosexternosenviowwds_15_tfsalsts ,
                                          int A2253SalExtAlb ,
                                          String A2249ManNom ,
                                          short A2248ManCod ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A6396SalExtHor ,
                                          String A10080SalSts ,
                                          java.util.Date A2256SalExtFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.EmprCod, T1.SalSts, T1.SalExtHor, T1.SalExtFec, T2.TrnNom, T1.ManCod, T3.ManNom, T1.SalExtAlb FROM ((TXPCEXTSA T1 LEFT JOIN TXPTRANSP T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = T1.EmprCod AND T3.ManCod = T1.ManCod)" ;
      if ( ! (GXutil.strcmp("", AV63Trabajosexternosenviowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.SalExtAlb,'99999990'), 2) like '%' || ?) or ( UPPER(T3.ManNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.SalExtHor) like '%' || UPPER(?)) or ( UPPER(T1.SalSts) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternosenviowwds_2_tfsalextalb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternosenviowwds_3_tfsalextalb_to) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternosenviowwds_5_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternosenviowwds_4_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternosenviowwds_5_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ManNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternosenviowwds_6_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Trabajosexternosenviowwds_7_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Trabajosexternosenviowwds_8_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternosenviowwds_9_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternosenviowwds_11_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternosenviowwds_10_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternosenviowwds_11_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Trabajosexternosenviowwds_12_tfsalextfec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternosenviowwds_13_tfsalexthor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtHor = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternosenviowwds_16_tfsalsts_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternosenviowwds_15_tfsalsts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternosenviowwds_16_tfsalsts_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalSts = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09144( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Trabajosexternosenviowwds_1_filterfulltext ,
                                          int AV64Trabajosexternosenviowwds_2_tfsalextalb ,
                                          int AV65Trabajosexternosenviowwds_3_tfsalextalb_to ,
                                          String AV67Trabajosexternosenviowwds_5_tfmannom_sel ,
                                          String AV66Trabajosexternosenviowwds_4_tfmannom ,
                                          short AV68Trabajosexternosenviowwds_6_tfmancod ,
                                          short AV69Trabajosexternosenviowwds_7_tfmancod_to ,
                                          short AV70Trabajosexternosenviowwds_8_tftrncod ,
                                          short AV71Trabajosexternosenviowwds_9_tftrncod_to ,
                                          String AV73Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                          String AV72Trabajosexternosenviowwds_10_tftrnnom ,
                                          java.util.Date AV74Trabajosexternosenviowwds_12_tfsalextfec ,
                                          String AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                          String AV75Trabajosexternosenviowwds_13_tfsalexthor ,
                                          String AV78Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                          String AV77Trabajosexternosenviowwds_15_tfsalsts ,
                                          int A2253SalExtAlb ,
                                          String A2249ManNom ,
                                          short A2248ManCod ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A6396SalExtHor ,
                                          String A10080SalSts ,
                                          java.util.Date A2256SalExtFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalExtHor, T1.SalSts, T1.SalExtFec, T2.TrnNom, T1.TrnCod, T1.ManCod, T3.ManNom, T1.SalExtAlb FROM ((TXPCEXTSA T1 LEFT JOIN TXPTRANSP T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = T1.EmprCod AND T3.ManCod = T1.ManCod)" ;
      if ( ! (GXutil.strcmp("", AV63Trabajosexternosenviowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.SalExtAlb,'99999990'), 2) like '%' || ?) or ( UPPER(T3.ManNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.SalExtHor) like '%' || UPPER(?)) or ( UPPER(T1.SalSts) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternosenviowwds_2_tfsalextalb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternosenviowwds_3_tfsalextalb_to) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternosenviowwds_5_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternosenviowwds_4_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternosenviowwds_5_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ManNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternosenviowwds_6_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Trabajosexternosenviowwds_7_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Trabajosexternosenviowwds_8_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternosenviowwds_9_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternosenviowwds_11_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternosenviowwds_10_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternosenviowwds_11_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Trabajosexternosenviowwds_12_tfsalextfec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternosenviowwds_13_tfsalexthor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtHor = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternosenviowwds_16_tfsalsts_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternosenviowwds_15_tfsalsts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternosenviowwds_16_tfsalsts_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalSts = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.SalExtHor" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09145( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Trabajosexternosenviowwds_1_filterfulltext ,
                                          int AV64Trabajosexternosenviowwds_2_tfsalextalb ,
                                          int AV65Trabajosexternosenviowwds_3_tfsalextalb_to ,
                                          String AV67Trabajosexternosenviowwds_5_tfmannom_sel ,
                                          String AV66Trabajosexternosenviowwds_4_tfmannom ,
                                          short AV68Trabajosexternosenviowwds_6_tfmancod ,
                                          short AV69Trabajosexternosenviowwds_7_tfmancod_to ,
                                          short AV70Trabajosexternosenviowwds_8_tftrncod ,
                                          short AV71Trabajosexternosenviowwds_9_tftrncod_to ,
                                          String AV73Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                          String AV72Trabajosexternosenviowwds_10_tftrnnom ,
                                          java.util.Date AV74Trabajosexternosenviowwds_12_tfsalextfec ,
                                          String AV76Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                          String AV75Trabajosexternosenviowwds_13_tfsalexthor ,
                                          String AV78Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                          String AV77Trabajosexternosenviowwds_15_tfsalsts ,
                                          int A2253SalExtAlb ,
                                          String A2249ManNom ,
                                          short A2248ManCod ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A6396SalExtHor ,
                                          String A10080SalSts ,
                                          java.util.Date A2256SalExtFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[22];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalSts, T1.SalExtHor, T1.SalExtFec, T2.TrnNom, T1.TrnCod, T1.ManCod, T3.ManNom, T1.SalExtAlb FROM ((TXPCEXTSA T1 LEFT JOIN TXPTRANSP T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = T1.EmprCod AND T3.ManCod = T1.ManCod)" ;
      if ( ! (GXutil.strcmp("", AV63Trabajosexternosenviowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.SalExtAlb,'99999990'), 2) like '%' || ?) or ( UPPER(T3.ManNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.SalExtHor) like '%' || UPPER(?)) or ( UPPER(T1.SalSts) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV64Trabajosexternosenviowwds_2_tfsalextalb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternosenviowwds_3_tfsalextalb_to) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Trabajosexternosenviowwds_5_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV66Trabajosexternosenviowwds_4_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Trabajosexternosenviowwds_5_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ManNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternosenviowwds_6_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Trabajosexternosenviowwds_7_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Trabajosexternosenviowwds_8_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternosenviowwds_9_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternosenviowwds_11_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternosenviowwds_10_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternosenviowwds_11_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Trabajosexternosenviowwds_12_tfsalextfec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternosenviowwds_13_tfsalexthor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtHor = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternosenviowwds_16_tfsalsts_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternosenviowwds_15_tfsalsts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternosenviowwds_16_tfsalsts_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalSts = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.SalSts" ;
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
                  return conditional_P09142(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] );
            case 1 :
                  return conditional_P09143(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] );
            case 2 :
                  return conditional_P09144(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] );
            case 3 :
                  return conditional_P09145(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09142", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09143", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09144", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09145", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
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
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
      }
   }

}

