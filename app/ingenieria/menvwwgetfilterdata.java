package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class menvwwgetfilterdata extends GXProcedure
{
   public menvwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( menvwwgetfilterdata.class ), "" );
   }

   public menvwwgetfilterdata( int remoteHandle ,
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
      menvwwgetfilterdata.this.aP5 = new String[] {""};
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
      menvwwgetfilterdata.this.AV28DDOName = aP0;
      menvwwgetfilterdata.this.AV26SearchTxt = aP1;
      menvwwgetfilterdata.this.AV27SearchTxtTo = aP2;
      menvwwgetfilterdata.this.aP3 = aP3;
      menvwwgetfilterdata.this.aP4 = aP4;
      menvwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("Ingenieria.MEnvWWGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.MEnvWWGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("Ingenieria.MEnvWWGridState"), null, null);
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV12TFBarCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFBarCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV14TFBarCodReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFBarCodReo_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV16TFBarCodPar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV17TFBarCodPar_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVORD") == 0 )
         {
            AV49TFMEnvOrd = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFMEnvOrd_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV51TFFasCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV52TFFasCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVINI") == 0 )
         {
            AV53TFMEnvIni = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVFIN") == 0 )
         {
            AV55TFMEnvFin = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVEST_SEL") == 0 )
         {
            AV57TFMEnvEst_SelsJson = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV58TFMEnvEst_Sels.fromJSonString(AV57TFMEnvEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVINT") == 0 )
         {
            AV59TFMEnvInt = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFMEnvInt_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarCodPar = AV26SearchTxt ;
      AV17TFBarCodPar_Sel = "" ;
      AV65Ingenieria_menvwwds_1_filterfulltext = AV44FilterFullText ;
      AV66Ingenieria_menvwwds_2_tfbarcod = AV12TFBarCod ;
      AV67Ingenieria_menvwwds_3_tfbarcod_to = AV13TFBarCod_To ;
      AV68Ingenieria_menvwwds_4_tfbarcodreo = AV14TFBarCodReo ;
      AV69Ingenieria_menvwwds_5_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV70Ingenieria_menvwwds_6_tfbarcodpar = AV16TFBarCodPar ;
      AV71Ingenieria_menvwwds_7_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV72Ingenieria_menvwwds_8_tfmenvord = AV49TFMEnvOrd ;
      AV73Ingenieria_menvwwds_9_tfmenvord_to = AV50TFMEnvOrd_To ;
      AV74Ingenieria_menvwwds_10_tffascod = AV51TFFasCod ;
      AV75Ingenieria_menvwwds_11_tffascod_sel = AV52TFFasCod_Sel ;
      AV76Ingenieria_menvwwds_12_tfmenvini = AV53TFMEnvIni ;
      AV77Ingenieria_menvwwds_13_tfmenvfin = AV55TFMEnvFin ;
      AV78Ingenieria_menvwwds_14_tfmenvest_sels = AV58TFMEnvEst_Sels ;
      AV79Ingenieria_menvwwds_15_tfmenvint = AV59TFMEnvInt ;
      AV80Ingenieria_menvwwds_16_tfmenvint_to = AV60TFMEnvInt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A14156MEnvEst) ,
                                           AV78Ingenieria_menvwwds_14_tfmenvest_sels ,
                                           Integer.valueOf(AV66Ingenieria_menvwwds_2_tfbarcod) ,
                                           Integer.valueOf(AV67Ingenieria_menvwwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV68Ingenieria_menvwwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV69Ingenieria_menvwwds_5_tfbarcodreo_to) ,
                                           AV71Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                           AV70Ingenieria_menvwwds_6_tfbarcodpar ,
                                           Short.valueOf(AV72Ingenieria_menvwwds_8_tfmenvord) ,
                                           Short.valueOf(AV73Ingenieria_menvwwds_9_tfmenvord_to) ,
                                           AV75Ingenieria_menvwwds_11_tffascod_sel ,
                                           AV74Ingenieria_menvwwds_10_tffascod ,
                                           AV76Ingenieria_menvwwds_12_tfmenvini ,
                                           AV77Ingenieria_menvwwds_13_tfmenvfin ,
                                           AV79Ingenieria_menvwwds_15_tfmenvint ,
                                           AV80Ingenieria_menvwwds_16_tfmenvint_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A14152MEnvOrd) ,
                                           A457FasCod ,
                                           A14158MEnvIni ,
                                           A14157MEnvFin ,
                                           AV65Ingenieria_menvwwds_1_filterfulltext ,
                                           A14162MEnvInt ,
                                           Integer.valueOf(AV78Ingenieria_menvwwds_14_tfmenvest_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV70Ingenieria_menvwwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV70Ingenieria_menvwwds_6_tfbarcodpar), 1, "%") ;
      lV74Ingenieria_menvwwds_10_tffascod = GXutil.padr( GXutil.rtrim( AV74Ingenieria_menvwwds_10_tffascod), 8, "%") ;
      /* Using cursor P09RI2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV78Ingenieria_menvwwds_14_tfmenvest_sels.size()), Integer.valueOf(AV66Ingenieria_menvwwds_2_tfbarcod), Integer.valueOf(AV67Ingenieria_menvwwds_3_tfbarcod_to), Byte.valueOf(AV68Ingenieria_menvwwds_4_tfbarcodreo), Byte.valueOf(AV69Ingenieria_menvwwds_5_tfbarcodreo_to), lV70Ingenieria_menvwwds_6_tfbarcodpar, AV71Ingenieria_menvwwds_7_tfbarcodpar_sel, Short.valueOf(AV72Ingenieria_menvwwds_8_tfmenvord), Short.valueOf(AV73Ingenieria_menvwwds_9_tfmenvord_to), lV74Ingenieria_menvwwds_10_tffascod, AV75Ingenieria_menvwwds_11_tffascod_sel, AV76Ingenieria_menvwwds_12_tfmenvini, AV77Ingenieria_menvwwds_13_tfmenvfin, AV79Ingenieria_menvwwds_15_tfmenvint, AV80Ingenieria_menvwwds_16_tfmenvint_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9RI2 = false ;
         A130BarCodPar = P09RI2_A130BarCodPar[0] ;
         A14162MEnvInt = P09RI2_A14162MEnvInt[0] ;
         A457FasCod = P09RI2_A457FasCod[0] ;
         A14152MEnvOrd = P09RI2_A14152MEnvOrd[0] ;
         A132BarCodReo = P09RI2_A132BarCodReo[0] ;
         A129BarCod = P09RI2_A129BarCod[0] ;
         A14156MEnvEst = P09RI2_A14156MEnvEst[0] ;
         A14157MEnvFin = P09RI2_A14157MEnvFin[0] ;
         A14158MEnvIni = P09RI2_A14158MEnvIni[0] ;
         A396EmprCod = P09RI2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV65Ingenieria_menvwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV65Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV65Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV65Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14152MEnvOrd, 4, 0) , GXutil.padr( "%" + AV65Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV65Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a procesar", ""), "") , GXutil.padr( "%" + GXutil.lower( AV65Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "procesado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV65Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 2 ) ) || ( GXutil.like( GXutil.str( A14162MEnvInt, 10, 2) , GXutil.padr( "%" + AV65Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV38count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09RI2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               brk9RI2 = false ;
               A14152MEnvOrd = P09RI2_A14152MEnvOrd[0] ;
               A132BarCodReo = P09RI2_A132BarCodReo[0] ;
               A129BarCod = P09RI2_A129BarCod[0] ;
               A396EmprCod = P09RI2_A396EmprCod[0] ;
               AV38count = (long)(AV38count+1) ;
               brk9RI2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
            {
               AV30Option = A130BarCodPar ;
               AV31Options.add(AV30Option, 0);
               AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV31Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9RI2 )
         {
            brk9RI2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV51TFFasCod = AV26SearchTxt ;
      AV52TFFasCod_Sel = "" ;
      AV65Ingenieria_menvwwds_1_filterfulltext = AV44FilterFullText ;
      AV66Ingenieria_menvwwds_2_tfbarcod = AV12TFBarCod ;
      AV67Ingenieria_menvwwds_3_tfbarcod_to = AV13TFBarCod_To ;
      AV68Ingenieria_menvwwds_4_tfbarcodreo = AV14TFBarCodReo ;
      AV69Ingenieria_menvwwds_5_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV70Ingenieria_menvwwds_6_tfbarcodpar = AV16TFBarCodPar ;
      AV71Ingenieria_menvwwds_7_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV72Ingenieria_menvwwds_8_tfmenvord = AV49TFMEnvOrd ;
      AV73Ingenieria_menvwwds_9_tfmenvord_to = AV50TFMEnvOrd_To ;
      AV74Ingenieria_menvwwds_10_tffascod = AV51TFFasCod ;
      AV75Ingenieria_menvwwds_11_tffascod_sel = AV52TFFasCod_Sel ;
      AV76Ingenieria_menvwwds_12_tfmenvini = AV53TFMEnvIni ;
      AV77Ingenieria_menvwwds_13_tfmenvfin = AV55TFMEnvFin ;
      AV78Ingenieria_menvwwds_14_tfmenvest_sels = AV58TFMEnvEst_Sels ;
      AV79Ingenieria_menvwwds_15_tfmenvint = AV59TFMEnvInt ;
      AV80Ingenieria_menvwwds_16_tfmenvint_to = AV60TFMEnvInt_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A14156MEnvEst) ,
                                           AV78Ingenieria_menvwwds_14_tfmenvest_sels ,
                                           Integer.valueOf(AV66Ingenieria_menvwwds_2_tfbarcod) ,
                                           Integer.valueOf(AV67Ingenieria_menvwwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV68Ingenieria_menvwwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV69Ingenieria_menvwwds_5_tfbarcodreo_to) ,
                                           AV71Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                           AV70Ingenieria_menvwwds_6_tfbarcodpar ,
                                           Short.valueOf(AV72Ingenieria_menvwwds_8_tfmenvord) ,
                                           Short.valueOf(AV73Ingenieria_menvwwds_9_tfmenvord_to) ,
                                           AV75Ingenieria_menvwwds_11_tffascod_sel ,
                                           AV74Ingenieria_menvwwds_10_tffascod ,
                                           AV76Ingenieria_menvwwds_12_tfmenvini ,
                                           AV77Ingenieria_menvwwds_13_tfmenvfin ,
                                           AV79Ingenieria_menvwwds_15_tfmenvint ,
                                           AV80Ingenieria_menvwwds_16_tfmenvint_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A14152MEnvOrd) ,
                                           A457FasCod ,
                                           A14158MEnvIni ,
                                           A14157MEnvFin ,
                                           AV65Ingenieria_menvwwds_1_filterfulltext ,
                                           A14162MEnvInt ,
                                           Integer.valueOf(AV78Ingenieria_menvwwds_14_tfmenvest_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV70Ingenieria_menvwwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV70Ingenieria_menvwwds_6_tfbarcodpar), 1, "%") ;
      lV74Ingenieria_menvwwds_10_tffascod = GXutil.padr( GXutil.rtrim( AV74Ingenieria_menvwwds_10_tffascod), 8, "%") ;
      /* Using cursor P09RI3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV78Ingenieria_menvwwds_14_tfmenvest_sels.size()), Integer.valueOf(AV66Ingenieria_menvwwds_2_tfbarcod), Integer.valueOf(AV67Ingenieria_menvwwds_3_tfbarcod_to), Byte.valueOf(AV68Ingenieria_menvwwds_4_tfbarcodreo), Byte.valueOf(AV69Ingenieria_menvwwds_5_tfbarcodreo_to), lV70Ingenieria_menvwwds_6_tfbarcodpar, AV71Ingenieria_menvwwds_7_tfbarcodpar_sel, Short.valueOf(AV72Ingenieria_menvwwds_8_tfmenvord), Short.valueOf(AV73Ingenieria_menvwwds_9_tfmenvord_to), lV74Ingenieria_menvwwds_10_tffascod, AV75Ingenieria_menvwwds_11_tffascod_sel, AV76Ingenieria_menvwwds_12_tfmenvini, AV77Ingenieria_menvwwds_13_tfmenvfin, AV79Ingenieria_menvwwds_15_tfmenvint, AV80Ingenieria_menvwwds_16_tfmenvint_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9RI4 = false ;
         A457FasCod = P09RI3_A457FasCod[0] ;
         A14162MEnvInt = P09RI3_A14162MEnvInt[0] ;
         A14152MEnvOrd = P09RI3_A14152MEnvOrd[0] ;
         A130BarCodPar = P09RI3_A130BarCodPar[0] ;
         A132BarCodReo = P09RI3_A132BarCodReo[0] ;
         A129BarCod = P09RI3_A129BarCod[0] ;
         A14156MEnvEst = P09RI3_A14156MEnvEst[0] ;
         A14157MEnvFin = P09RI3_A14157MEnvFin[0] ;
         A14158MEnvIni = P09RI3_A14158MEnvIni[0] ;
         A396EmprCod = P09RI3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV65Ingenieria_menvwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV65Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV65Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV65Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14152MEnvOrd, 4, 0) , GXutil.padr( "%" + AV65Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV65Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a procesar", ""), "") , GXutil.padr( "%" + GXutil.lower( AV65Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "procesado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV65Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 2 ) ) || ( GXutil.like( GXutil.str( A14162MEnvInt, 10, 2) , GXutil.padr( "%" + AV65Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV38count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09RI3_A457FasCod[0], A457FasCod) == 0 ) )
            {
               brk9RI4 = false ;
               A14152MEnvOrd = P09RI3_A14152MEnvOrd[0] ;
               A130BarCodPar = P09RI3_A130BarCodPar[0] ;
               A132BarCodReo = P09RI3_A132BarCodReo[0] ;
               A129BarCod = P09RI3_A129BarCod[0] ;
               A396EmprCod = P09RI3_A396EmprCod[0] ;
               AV38count = (long)(AV38count+1) ;
               brk9RI4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A457FasCod)==0) )
            {
               AV30Option = A457FasCod ;
               AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
               AV31Options.add(AV30Option, 0);
               AV34OptionsDesc.add(AV33OptionDesc, 0);
               AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV31Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9RI4 )
         {
            brk9RI4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = menvwwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = menvwwgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = menvwwgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV16TFBarCodPar = "" ;
      AV17TFBarCodPar_Sel = "" ;
      AV51TFFasCod = "" ;
      AV52TFFasCod_Sel = "" ;
      AV53TFMEnvIni = GXutil.resetTime( GXutil.nullDate() );
      AV55TFMEnvFin = GXutil.resetTime( GXutil.nullDate() );
      AV57TFMEnvEst_SelsJson = "" ;
      AV58TFMEnvEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV59TFMEnvInt = DecimalUtil.ZERO ;
      AV60TFMEnvInt_To = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV65Ingenieria_menvwwds_1_filterfulltext = "" ;
      AV70Ingenieria_menvwwds_6_tfbarcodpar = "" ;
      AV71Ingenieria_menvwwds_7_tfbarcodpar_sel = "" ;
      AV74Ingenieria_menvwwds_10_tffascod = "" ;
      AV75Ingenieria_menvwwds_11_tffascod_sel = "" ;
      AV76Ingenieria_menvwwds_12_tfmenvini = GXutil.resetTime( GXutil.nullDate() );
      AV77Ingenieria_menvwwds_13_tfmenvfin = GXutil.resetTime( GXutil.nullDate() );
      AV78Ingenieria_menvwwds_14_tfmenvest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV79Ingenieria_menvwwds_15_tfmenvint = DecimalUtil.ZERO ;
      AV80Ingenieria_menvwwds_16_tfmenvint_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV65Ingenieria_menvwwds_1_filterfulltext = "" ;
      lV70Ingenieria_menvwwds_6_tfbarcodpar = "" ;
      lV74Ingenieria_menvwwds_10_tffascod = "" ;
      A457FasCod = "" ;
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      A14162MEnvInt = DecimalUtil.ZERO ;
      P09RI2_A130BarCodPar = new String[] {""} ;
      P09RI2_A14162MEnvInt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RI2_A457FasCod = new String[] {""} ;
      P09RI2_A14152MEnvOrd = new short[1] ;
      P09RI2_A132BarCodReo = new byte[1] ;
      P09RI2_A129BarCod = new int[1] ;
      P09RI2_A14156MEnvEst = new byte[1] ;
      P09RI2_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      P09RI2_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      P09RI2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV30Option = "" ;
      P09RI3_A457FasCod = new String[] {""} ;
      P09RI3_A14162MEnvInt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RI3_A14152MEnvOrd = new short[1] ;
      P09RI3_A130BarCodPar = new String[] {""} ;
      P09RI3_A132BarCodReo = new byte[1] ;
      P09RI3_A129BarCod = new int[1] ;
      P09RI3_A14156MEnvEst = new byte[1] ;
      P09RI3_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      P09RI3_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      P09RI3_A396EmprCod = new String[] {""} ;
      AV33OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menvwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09RI2_A130BarCodPar, P09RI2_A14162MEnvInt, P09RI2_A457FasCod, P09RI2_A14152MEnvOrd, P09RI2_A132BarCodReo, P09RI2_A129BarCod, P09RI2_A14156MEnvEst, P09RI2_A14157MEnvFin, P09RI2_A14158MEnvIni, P09RI2_A396EmprCod
            }
            , new Object[] {
            P09RI3_A457FasCod, P09RI3_A14162MEnvInt, P09RI3_A14152MEnvOrd, P09RI3_A130BarCodPar, P09RI3_A132BarCodReo, P09RI3_A129BarCod, P09RI3_A14156MEnvEst, P09RI3_A14157MEnvFin, P09RI3_A14158MEnvIni, P09RI3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFBarCodReo ;
   private byte AV15TFBarCodReo_To ;
   private byte AV68Ingenieria_menvwwds_4_tfbarcodreo ;
   private byte AV69Ingenieria_menvwwds_5_tfbarcodreo_to ;
   private byte A14156MEnvEst ;
   private byte A132BarCodReo ;
   private short AV49TFMEnvOrd ;
   private short AV50TFMEnvOrd_To ;
   private short AV72Ingenieria_menvwwds_8_tfmenvord ;
   private short AV73Ingenieria_menvwwds_9_tfmenvord_to ;
   private short A14152MEnvOrd ;
   private short Gx_err ;
   private int AV63GXV1 ;
   private int AV12TFBarCod ;
   private int AV13TFBarCod_To ;
   private int AV66Ingenieria_menvwwds_2_tfbarcod ;
   private int AV67Ingenieria_menvwwds_3_tfbarcod_to ;
   private int AV78Ingenieria_menvwwds_14_tfmenvest_sels_size ;
   private int A129BarCod ;
   private long AV38count ;
   private java.math.BigDecimal AV59TFMEnvInt ;
   private java.math.BigDecimal AV60TFMEnvInt_To ;
   private java.math.BigDecimal AV79Ingenieria_menvwwds_15_tfmenvint ;
   private java.math.BigDecimal AV80Ingenieria_menvwwds_16_tfmenvint_to ;
   private java.math.BigDecimal A14162MEnvInt ;
   private String AV16TFBarCodPar ;
   private String AV17TFBarCodPar_Sel ;
   private String AV51TFFasCod ;
   private String AV52TFFasCod_Sel ;
   private String A130BarCodPar ;
   private String AV70Ingenieria_menvwwds_6_tfbarcodpar ;
   private String AV71Ingenieria_menvwwds_7_tfbarcodpar_sel ;
   private String AV74Ingenieria_menvwwds_10_tffascod ;
   private String AV75Ingenieria_menvwwds_11_tffascod_sel ;
   private String scmdbuf ;
   private String lV70Ingenieria_menvwwds_6_tfbarcodpar ;
   private String lV74Ingenieria_menvwwds_10_tffascod ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private java.util.Date AV53TFMEnvIni ;
   private java.util.Date AV55TFMEnvFin ;
   private java.util.Date AV76Ingenieria_menvwwds_12_tfmenvini ;
   private java.util.Date AV77Ingenieria_menvwwds_13_tfmenvfin ;
   private java.util.Date A14158MEnvIni ;
   private java.util.Date A14157MEnvFin ;
   private boolean returnInSub ;
   private boolean brk9RI2 ;
   private boolean brk9RI4 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV57TFMEnvEst_SelsJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV65Ingenieria_menvwwds_1_filterfulltext ;
   private String lV65Ingenieria_menvwwds_1_filterfulltext ;
   private String AV30Option ;
   private String AV33OptionDesc ;
   private GXSimpleCollection<Byte> AV58TFMEnvEst_Sels ;
   private GXSimpleCollection<Byte> AV78Ingenieria_menvwwds_14_tfmenvest_sels ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09RI2_A130BarCodPar ;
   private java.math.BigDecimal[] P09RI2_A14162MEnvInt ;
   private String[] P09RI2_A457FasCod ;
   private short[] P09RI2_A14152MEnvOrd ;
   private byte[] P09RI2_A132BarCodReo ;
   private int[] P09RI2_A129BarCod ;
   private byte[] P09RI2_A14156MEnvEst ;
   private java.util.Date[] P09RI2_A14157MEnvFin ;
   private java.util.Date[] P09RI2_A14158MEnvIni ;
   private String[] P09RI2_A396EmprCod ;
   private String[] P09RI3_A457FasCod ;
   private java.math.BigDecimal[] P09RI3_A14162MEnvInt ;
   private short[] P09RI3_A14152MEnvOrd ;
   private String[] P09RI3_A130BarCodPar ;
   private byte[] P09RI3_A132BarCodReo ;
   private int[] P09RI3_A129BarCod ;
   private byte[] P09RI3_A14156MEnvEst ;
   private java.util.Date[] P09RI3_A14157MEnvFin ;
   private java.util.Date[] P09RI3_A14158MEnvIni ;
   private String[] P09RI3_A396EmprCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class menvwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A14156MEnvEst ,
                                          GXSimpleCollection<Byte> AV78Ingenieria_menvwwds_14_tfmenvest_sels ,
                                          int AV66Ingenieria_menvwwds_2_tfbarcod ,
                                          int AV67Ingenieria_menvwwds_3_tfbarcod_to ,
                                          byte AV68Ingenieria_menvwwds_4_tfbarcodreo ,
                                          byte AV69Ingenieria_menvwwds_5_tfbarcodreo_to ,
                                          String AV71Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                          String AV70Ingenieria_menvwwds_6_tfbarcodpar ,
                                          short AV72Ingenieria_menvwwds_8_tfmenvord ,
                                          short AV73Ingenieria_menvwwds_9_tfmenvord_to ,
                                          String AV75Ingenieria_menvwwds_11_tffascod_sel ,
                                          String AV74Ingenieria_menvwwds_10_tffascod ,
                                          java.util.Date AV76Ingenieria_menvwwds_12_tfmenvini ,
                                          java.util.Date AV77Ingenieria_menvwwds_13_tfmenvfin ,
                                          java.math.BigDecimal AV79Ingenieria_menvwwds_15_tfmenvint ,
                                          java.math.BigDecimal AV80Ingenieria_menvwwds_16_tfmenvint_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A14152MEnvOrd ,
                                          String A457FasCod ,
                                          java.util.Date A14158MEnvIni ,
                                          java.util.Date A14157MEnvFin ,
                                          String AV65Ingenieria_menvwwds_1_filterfulltext ,
                                          java.math.BigDecimal A14162MEnvInt ,
                                          int AV78Ingenieria_menvwwds_14_tfmenvest_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarCodPar, CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END AS MEnvInt, FasCod," ;
      scmdbuf += " MEnvOrd, BarCodReo, BarCod, CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END AS MEnvEst, MEnvFin, MEnvIni, EmprCod FROM TXPMEnv" ;
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV78Ingenieria_menvwwds_14_tfmenvest_sels, "CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END IN (", ")")+"))");
      if ( ! (0==AV66Ingenieria_menvwwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV67Ingenieria_menvwwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV68Ingenieria_menvwwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Ingenieria_menvwwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_menvwwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV72Ingenieria_menvwwds_8_tfmenvord) )
      {
         addWhere(sWhereString, "(MEnvOrd >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Ingenieria_menvwwds_9_tfmenvord_to) )
      {
         addWhere(sWhereString, "(MEnvOrd <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_menvwwds_11_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_menvwwds_10_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_menvwwds_11_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(FasCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Ingenieria_menvwwds_12_tfmenvini) )
      {
         addWhere(sWhereString, "(MEnvIni >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Ingenieria_menvwwds_13_tfmenvfin) )
      {
         addWhere(sWhereString, "(MEnvFin >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ingenieria_menvwwds_15_tfmenvint)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ingenieria_menvwwds_16_tfmenvint_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09RI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A14156MEnvEst ,
                                          GXSimpleCollection<Byte> AV78Ingenieria_menvwwds_14_tfmenvest_sels ,
                                          int AV66Ingenieria_menvwwds_2_tfbarcod ,
                                          int AV67Ingenieria_menvwwds_3_tfbarcod_to ,
                                          byte AV68Ingenieria_menvwwds_4_tfbarcodreo ,
                                          byte AV69Ingenieria_menvwwds_5_tfbarcodreo_to ,
                                          String AV71Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                          String AV70Ingenieria_menvwwds_6_tfbarcodpar ,
                                          short AV72Ingenieria_menvwwds_8_tfmenvord ,
                                          short AV73Ingenieria_menvwwds_9_tfmenvord_to ,
                                          String AV75Ingenieria_menvwwds_11_tffascod_sel ,
                                          String AV74Ingenieria_menvwwds_10_tffascod ,
                                          java.util.Date AV76Ingenieria_menvwwds_12_tfmenvini ,
                                          java.util.Date AV77Ingenieria_menvwwds_13_tfmenvfin ,
                                          java.math.BigDecimal AV79Ingenieria_menvwwds_15_tfmenvint ,
                                          java.math.BigDecimal AV80Ingenieria_menvwwds_16_tfmenvint_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A14152MEnvOrd ,
                                          String A457FasCod ,
                                          java.util.Date A14158MEnvIni ,
                                          java.util.Date A14157MEnvFin ,
                                          String AV65Ingenieria_menvwwds_1_filterfulltext ,
                                          java.math.BigDecimal A14162MEnvInt ,
                                          int AV78Ingenieria_menvwwds_14_tfmenvest_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[15];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT FasCod, CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END AS MEnvInt, MEnvOrd," ;
      scmdbuf += " BarCodPar, BarCodReo, BarCod, CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END AS MEnvEst, MEnvFin, MEnvIni, EmprCod FROM TXPMEnv" ;
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV78Ingenieria_menvwwds_14_tfmenvest_sels, "CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END IN (", ")")+"))");
      if ( ! (0==AV66Ingenieria_menvwwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (0==AV67Ingenieria_menvwwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV68Ingenieria_menvwwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Ingenieria_menvwwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_menvwwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV72Ingenieria_menvwwds_8_tfmenvord) )
      {
         addWhere(sWhereString, "(MEnvOrd >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Ingenieria_menvwwds_9_tfmenvord_to) )
      {
         addWhere(sWhereString, "(MEnvOrd <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_menvwwds_11_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_menvwwds_10_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_menvwwds_11_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(FasCod = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Ingenieria_menvwwds_12_tfmenvini) )
      {
         addWhere(sWhereString, "(MEnvIni >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Ingenieria_menvwwds_13_tfmenvfin) )
      {
         addWhere(sWhereString, "(MEnvFin >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ingenieria_menvwwds_15_tfmenvint)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ingenieria_menvwwds_16_tfmenvint_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FasCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P09RI2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() );
            case 1 :
                  return conditional_P09RI3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RI3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9, true);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9, true);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false, true);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false, true);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               return;
      }
   }

}

