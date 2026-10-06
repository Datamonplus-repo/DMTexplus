package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpedobswwgetfilterdata extends GXProcedure
{
   public tpedobswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedobswwgetfilterdata.class ), "" );
   }

   public tpedobswwgetfilterdata( int remoteHandle ,
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
      tpedobswwgetfilterdata.this.aP5 = new String[] {""};
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
      tpedobswwgetfilterdata.this.AV30DDOName = aP0;
      tpedobswwgetfilterdata.this.AV28SearchTxt = aP1;
      tpedobswwgetfilterdata.this.AV29SearchTxtTo = aP2;
      tpedobswwgetfilterdata.this.aP3 = aP3;
      tpedobswwgetfilterdata.this.aP4 = aP4;
      tpedobswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PEDPERDES") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDPERDESOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PEDPERPET") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDPERPETOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV41Session.getValue("TPEDOBSWWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPEDOBSWWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("TPEDOBSWWGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV57FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV12TFPedCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFPedCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDOBSUL") == 0 )
         {
            AV14TFPedObsUL = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPedObsUL_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV16TFEmprNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV17TFEmprNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCONLIN") == 0 )
         {
            AV18TFPedConLin = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFPedConLin_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERDES") == 0 )
         {
            AV20TFPedPerDes = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERDES_SEL") == 0 )
         {
            AV21TFPedPerDes_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERPET") == 0 )
         {
            AV22TFPedPerPet = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERPET_SEL") == 0 )
         {
            AV23TFPedPerPet_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV24TFPedFecEnt = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV26TFPedFec = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV28SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV62Tpedobswwds_1_filterfulltext = AV57FilterFullText ;
      AV63Tpedobswwds_2_tfemprcod = AV10TFEmprCod ;
      AV64Tpedobswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV65Tpedobswwds_4_tfpedcod = AV12TFPedCod ;
      AV66Tpedobswwds_5_tfpedcod_to = AV13TFPedCod_To ;
      AV67Tpedobswwds_6_tfpedobsul = AV14TFPedObsUL ;
      AV68Tpedobswwds_7_tfpedobsul_to = AV15TFPedObsUL_To ;
      AV69Tpedobswwds_8_tfemprnom = AV16TFEmprNom ;
      AV70Tpedobswwds_9_tfemprnom_sel = AV17TFEmprNom_Sel ;
      AV71Tpedobswwds_10_tfpedconlin = AV18TFPedConLin ;
      AV72Tpedobswwds_11_tfpedconlin_to = AV19TFPedConLin_To ;
      AV73Tpedobswwds_12_tfpedperdes = AV20TFPedPerDes ;
      AV74Tpedobswwds_13_tfpedperdes_sel = AV21TFPedPerDes_Sel ;
      AV75Tpedobswwds_14_tfpedperpet = AV22TFPedPerPet ;
      AV76Tpedobswwds_15_tfpedperpet_sel = AV23TFPedPerPet_Sel ;
      AV77Tpedobswwds_16_tfpedfecent = AV24TFPedFecEnt ;
      AV78Tpedobswwds_17_tfpedfec = AV26TFPedFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Tpedobswwds_1_filterfulltext ,
                                           AV64Tpedobswwds_3_tfemprcod_sel ,
                                           AV63Tpedobswwds_2_tfemprcod ,
                                           Integer.valueOf(AV65Tpedobswwds_4_tfpedcod) ,
                                           Integer.valueOf(AV66Tpedobswwds_5_tfpedcod_to) ,
                                           Byte.valueOf(AV67Tpedobswwds_6_tfpedobsul) ,
                                           Byte.valueOf(AV68Tpedobswwds_7_tfpedobsul_to) ,
                                           AV70Tpedobswwds_9_tfemprnom_sel ,
                                           AV69Tpedobswwds_8_tfemprnom ,
                                           Byte.valueOf(AV71Tpedobswwds_10_tfpedconlin) ,
                                           Byte.valueOf(AV72Tpedobswwds_11_tfpedconlin_to) ,
                                           AV74Tpedobswwds_13_tfpedperdes_sel ,
                                           AV73Tpedobswwds_12_tfpedperdes ,
                                           AV76Tpedobswwds_15_tfpedperpet_sel ,
                                           AV75Tpedobswwds_14_tfpedperpet ,
                                           AV77Tpedobswwds_16_tfpedfecent ,
                                           AV78Tpedobswwds_17_tfpedfec ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A2503PedObsUL) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A5049PedConLin) ,
                                           A8154PedPerDes ,
                                           A8155PedPerPet ,
                                           A662PedFecEnt ,
                                           A661PedFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV63Tpedobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV63Tpedobswwds_2_tfemprcod), 3, "%") ;
      lV69Tpedobswwds_8_tfemprnom = GXutil.padr( GXutil.rtrim( AV69Tpedobswwds_8_tfemprnom), 30, "%") ;
      lV73Tpedobswwds_12_tfpedperdes = GXutil.padr( GXutil.rtrim( AV73Tpedobswwds_12_tfpedperdes), 30, "%") ;
      lV75Tpedobswwds_14_tfpedperpet = GXutil.padr( GXutil.rtrim( AV75Tpedobswwds_14_tfpedperpet), 30, "%") ;
      /* Using cursor P08PC3 */
      pr_default.execute(0, new Object[] {lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV63Tpedobswwds_2_tfemprcod, AV64Tpedobswwds_3_tfemprcod_sel, Integer.valueOf(AV65Tpedobswwds_4_tfpedcod), Integer.valueOf(AV66Tpedobswwds_5_tfpedcod_to), Byte.valueOf(AV67Tpedobswwds_6_tfpedobsul), Byte.valueOf(AV68Tpedobswwds_7_tfpedobsul_to), lV69Tpedobswwds_8_tfemprnom, AV70Tpedobswwds_9_tfemprnom_sel, Byte.valueOf(AV71Tpedobswwds_10_tfpedconlin), Byte.valueOf(AV72Tpedobswwds_11_tfpedconlin_to), lV73Tpedobswwds_12_tfpedperdes, AV74Tpedobswwds_13_tfpedperdes_sel, lV75Tpedobswwds_14_tfpedperpet, AV76Tpedobswwds_15_tfpedperpet_sel, AV77Tpedobswwds_16_tfpedfecent, AV78Tpedobswwds_17_tfpedfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PC2 = false ;
         A396EmprCod = P08PC3_A396EmprCod[0] ;
         A661PedFec = P08PC3_A661PedFec[0] ;
         A662PedFecEnt = P08PC3_A662PedFecEnt[0] ;
         A8155PedPerPet = P08PC3_A8155PedPerPet[0] ;
         A8154PedPerDes = P08PC3_A8154PedPerDes[0] ;
         A407EmprNom = P08PC3_A407EmprNom[0] ;
         n407EmprNom = P08PC3_n407EmprNom[0] ;
         A2503PedObsUL = P08PC3_A2503PedObsUL[0] ;
         n2503PedObsUL = P08PC3_n2503PedObsUL[0] ;
         A658PedCod = P08PC3_A658PedCod[0] ;
         A5049PedConLin = P08PC3_A5049PedConLin[0] ;
         n5049PedConLin = P08PC3_n5049PedConLin[0] ;
         A407EmprNom = P08PC3_A407EmprNom[0] ;
         n407EmprNom = P08PC3_n407EmprNom[0] ;
         A5049PedConLin = P08PC3_A5049PedConLin[0] ;
         n5049PedConLin = P08PC3_n5049PedConLin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PC3_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8PC2 = false ;
            A658PedCod = P08PC3_A658PedCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8PC2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV32Option = A396EmprCod ;
            AV35OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV33Options.add(AV32Option, 0);
            AV36OptionsDesc.add(AV35OptionDesc, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PC2 )
         {
            brk8PC2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFEmprNom = AV28SearchTxt ;
      AV17TFEmprNom_Sel = "" ;
      AV62Tpedobswwds_1_filterfulltext = AV57FilterFullText ;
      AV63Tpedobswwds_2_tfemprcod = AV10TFEmprCod ;
      AV64Tpedobswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV65Tpedobswwds_4_tfpedcod = AV12TFPedCod ;
      AV66Tpedobswwds_5_tfpedcod_to = AV13TFPedCod_To ;
      AV67Tpedobswwds_6_tfpedobsul = AV14TFPedObsUL ;
      AV68Tpedobswwds_7_tfpedobsul_to = AV15TFPedObsUL_To ;
      AV69Tpedobswwds_8_tfemprnom = AV16TFEmprNom ;
      AV70Tpedobswwds_9_tfemprnom_sel = AV17TFEmprNom_Sel ;
      AV71Tpedobswwds_10_tfpedconlin = AV18TFPedConLin ;
      AV72Tpedobswwds_11_tfpedconlin_to = AV19TFPedConLin_To ;
      AV73Tpedobswwds_12_tfpedperdes = AV20TFPedPerDes ;
      AV74Tpedobswwds_13_tfpedperdes_sel = AV21TFPedPerDes_Sel ;
      AV75Tpedobswwds_14_tfpedperpet = AV22TFPedPerPet ;
      AV76Tpedobswwds_15_tfpedperpet_sel = AV23TFPedPerPet_Sel ;
      AV77Tpedobswwds_16_tfpedfecent = AV24TFPedFecEnt ;
      AV78Tpedobswwds_17_tfpedfec = AV26TFPedFec ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV62Tpedobswwds_1_filterfulltext ,
                                           AV64Tpedobswwds_3_tfemprcod_sel ,
                                           AV63Tpedobswwds_2_tfemprcod ,
                                           Integer.valueOf(AV65Tpedobswwds_4_tfpedcod) ,
                                           Integer.valueOf(AV66Tpedobswwds_5_tfpedcod_to) ,
                                           Byte.valueOf(AV67Tpedobswwds_6_tfpedobsul) ,
                                           Byte.valueOf(AV68Tpedobswwds_7_tfpedobsul_to) ,
                                           AV70Tpedobswwds_9_tfemprnom_sel ,
                                           AV69Tpedobswwds_8_tfemprnom ,
                                           Byte.valueOf(AV71Tpedobswwds_10_tfpedconlin) ,
                                           Byte.valueOf(AV72Tpedobswwds_11_tfpedconlin_to) ,
                                           AV74Tpedobswwds_13_tfpedperdes_sel ,
                                           AV73Tpedobswwds_12_tfpedperdes ,
                                           AV76Tpedobswwds_15_tfpedperpet_sel ,
                                           AV75Tpedobswwds_14_tfpedperpet ,
                                           AV77Tpedobswwds_16_tfpedfecent ,
                                           AV78Tpedobswwds_17_tfpedfec ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A2503PedObsUL) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A5049PedConLin) ,
                                           A8154PedPerDes ,
                                           A8155PedPerPet ,
                                           A662PedFecEnt ,
                                           A661PedFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV63Tpedobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV63Tpedobswwds_2_tfemprcod), 3, "%") ;
      lV69Tpedobswwds_8_tfemprnom = GXutil.padr( GXutil.rtrim( AV69Tpedobswwds_8_tfemprnom), 30, "%") ;
      lV73Tpedobswwds_12_tfpedperdes = GXutil.padr( GXutil.rtrim( AV73Tpedobswwds_12_tfpedperdes), 30, "%") ;
      lV75Tpedobswwds_14_tfpedperpet = GXutil.padr( GXutil.rtrim( AV75Tpedobswwds_14_tfpedperpet), 30, "%") ;
      /* Using cursor P08PC5 */
      pr_default.execute(1, new Object[] {lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV63Tpedobswwds_2_tfemprcod, AV64Tpedobswwds_3_tfemprcod_sel, Integer.valueOf(AV65Tpedobswwds_4_tfpedcod), Integer.valueOf(AV66Tpedobswwds_5_tfpedcod_to), Byte.valueOf(AV67Tpedobswwds_6_tfpedobsul), Byte.valueOf(AV68Tpedobswwds_7_tfpedobsul_to), lV69Tpedobswwds_8_tfemprnom, AV70Tpedobswwds_9_tfemprnom_sel, Byte.valueOf(AV71Tpedobswwds_10_tfpedconlin), Byte.valueOf(AV72Tpedobswwds_11_tfpedconlin_to), lV73Tpedobswwds_12_tfpedperdes, AV74Tpedobswwds_13_tfpedperdes_sel, lV75Tpedobswwds_14_tfpedperpet, AV76Tpedobswwds_15_tfpedperpet_sel, AV77Tpedobswwds_16_tfpedfecent, AV78Tpedobswwds_17_tfpedfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8PC4 = false ;
         A407EmprNom = P08PC5_A407EmprNom[0] ;
         n407EmprNom = P08PC5_n407EmprNom[0] ;
         A661PedFec = P08PC5_A661PedFec[0] ;
         A662PedFecEnt = P08PC5_A662PedFecEnt[0] ;
         A8155PedPerPet = P08PC5_A8155PedPerPet[0] ;
         A8154PedPerDes = P08PC5_A8154PedPerDes[0] ;
         A2503PedObsUL = P08PC5_A2503PedObsUL[0] ;
         n2503PedObsUL = P08PC5_n2503PedObsUL[0] ;
         A658PedCod = P08PC5_A658PedCod[0] ;
         A396EmprCod = P08PC5_A396EmprCod[0] ;
         A5049PedConLin = P08PC5_A5049PedConLin[0] ;
         n5049PedConLin = P08PC5_n5049PedConLin[0] ;
         A407EmprNom = P08PC5_A407EmprNom[0] ;
         n407EmprNom = P08PC5_n407EmprNom[0] ;
         A5049PedConLin = P08PC5_A5049PedConLin[0] ;
         n5049PedConLin = P08PC5_n5049PedConLin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08PC5_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk8PC4 = false ;
            A658PedCod = P08PC5_A658PedCod[0] ;
            A396EmprCod = P08PC5_A396EmprCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8PC4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV32Option = A407EmprNom ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PC4 )
         {
            brk8PC4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPEDPERDESOPTIONS' Routine */
      returnInSub = false ;
      AV20TFPedPerDes = AV28SearchTxt ;
      AV21TFPedPerDes_Sel = "" ;
      AV62Tpedobswwds_1_filterfulltext = AV57FilterFullText ;
      AV63Tpedobswwds_2_tfemprcod = AV10TFEmprCod ;
      AV64Tpedobswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV65Tpedobswwds_4_tfpedcod = AV12TFPedCod ;
      AV66Tpedobswwds_5_tfpedcod_to = AV13TFPedCod_To ;
      AV67Tpedobswwds_6_tfpedobsul = AV14TFPedObsUL ;
      AV68Tpedobswwds_7_tfpedobsul_to = AV15TFPedObsUL_To ;
      AV69Tpedobswwds_8_tfemprnom = AV16TFEmprNom ;
      AV70Tpedobswwds_9_tfemprnom_sel = AV17TFEmprNom_Sel ;
      AV71Tpedobswwds_10_tfpedconlin = AV18TFPedConLin ;
      AV72Tpedobswwds_11_tfpedconlin_to = AV19TFPedConLin_To ;
      AV73Tpedobswwds_12_tfpedperdes = AV20TFPedPerDes ;
      AV74Tpedobswwds_13_tfpedperdes_sel = AV21TFPedPerDes_Sel ;
      AV75Tpedobswwds_14_tfpedperpet = AV22TFPedPerPet ;
      AV76Tpedobswwds_15_tfpedperpet_sel = AV23TFPedPerPet_Sel ;
      AV77Tpedobswwds_16_tfpedfecent = AV24TFPedFecEnt ;
      AV78Tpedobswwds_17_tfpedfec = AV26TFPedFec ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV62Tpedobswwds_1_filterfulltext ,
                                           AV64Tpedobswwds_3_tfemprcod_sel ,
                                           AV63Tpedobswwds_2_tfemprcod ,
                                           Integer.valueOf(AV65Tpedobswwds_4_tfpedcod) ,
                                           Integer.valueOf(AV66Tpedobswwds_5_tfpedcod_to) ,
                                           Byte.valueOf(AV67Tpedobswwds_6_tfpedobsul) ,
                                           Byte.valueOf(AV68Tpedobswwds_7_tfpedobsul_to) ,
                                           AV70Tpedobswwds_9_tfemprnom_sel ,
                                           AV69Tpedobswwds_8_tfemprnom ,
                                           Byte.valueOf(AV71Tpedobswwds_10_tfpedconlin) ,
                                           Byte.valueOf(AV72Tpedobswwds_11_tfpedconlin_to) ,
                                           AV74Tpedobswwds_13_tfpedperdes_sel ,
                                           AV73Tpedobswwds_12_tfpedperdes ,
                                           AV76Tpedobswwds_15_tfpedperpet_sel ,
                                           AV75Tpedobswwds_14_tfpedperpet ,
                                           AV77Tpedobswwds_16_tfpedfecent ,
                                           AV78Tpedobswwds_17_tfpedfec ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A2503PedObsUL) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A5049PedConLin) ,
                                           A8154PedPerDes ,
                                           A8155PedPerPet ,
                                           A662PedFecEnt ,
                                           A661PedFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV63Tpedobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV63Tpedobswwds_2_tfemprcod), 3, "%") ;
      lV69Tpedobswwds_8_tfemprnom = GXutil.padr( GXutil.rtrim( AV69Tpedobswwds_8_tfemprnom), 30, "%") ;
      lV73Tpedobswwds_12_tfpedperdes = GXutil.padr( GXutil.rtrim( AV73Tpedobswwds_12_tfpedperdes), 30, "%") ;
      lV75Tpedobswwds_14_tfpedperpet = GXutil.padr( GXutil.rtrim( AV75Tpedobswwds_14_tfpedperpet), 30, "%") ;
      /* Using cursor P08PC7 */
      pr_default.execute(2, new Object[] {lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV63Tpedobswwds_2_tfemprcod, AV64Tpedobswwds_3_tfemprcod_sel, Integer.valueOf(AV65Tpedobswwds_4_tfpedcod), Integer.valueOf(AV66Tpedobswwds_5_tfpedcod_to), Byte.valueOf(AV67Tpedobswwds_6_tfpedobsul), Byte.valueOf(AV68Tpedobswwds_7_tfpedobsul_to), lV69Tpedobswwds_8_tfemprnom, AV70Tpedobswwds_9_tfemprnom_sel, Byte.valueOf(AV71Tpedobswwds_10_tfpedconlin), Byte.valueOf(AV72Tpedobswwds_11_tfpedconlin_to), lV73Tpedobswwds_12_tfpedperdes, AV74Tpedobswwds_13_tfpedperdes_sel, lV75Tpedobswwds_14_tfpedperpet, AV76Tpedobswwds_15_tfpedperpet_sel, AV77Tpedobswwds_16_tfpedfecent, AV78Tpedobswwds_17_tfpedfec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8PC6 = false ;
         A8154PedPerDes = P08PC7_A8154PedPerDes[0] ;
         A661PedFec = P08PC7_A661PedFec[0] ;
         A662PedFecEnt = P08PC7_A662PedFecEnt[0] ;
         A8155PedPerPet = P08PC7_A8155PedPerPet[0] ;
         A407EmprNom = P08PC7_A407EmprNom[0] ;
         n407EmprNom = P08PC7_n407EmprNom[0] ;
         A2503PedObsUL = P08PC7_A2503PedObsUL[0] ;
         n2503PedObsUL = P08PC7_n2503PedObsUL[0] ;
         A658PedCod = P08PC7_A658PedCod[0] ;
         A396EmprCod = P08PC7_A396EmprCod[0] ;
         A5049PedConLin = P08PC7_A5049PedConLin[0] ;
         n5049PedConLin = P08PC7_n5049PedConLin[0] ;
         A407EmprNom = P08PC7_A407EmprNom[0] ;
         n407EmprNom = P08PC7_n407EmprNom[0] ;
         A5049PedConLin = P08PC7_A5049PedConLin[0] ;
         n5049PedConLin = P08PC7_n5049PedConLin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08PC7_A8154PedPerDes[0], A8154PedPerDes) == 0 ) )
         {
            brk8PC6 = false ;
            A658PedCod = P08PC7_A658PedCod[0] ;
            A396EmprCod = P08PC7_A396EmprCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8PC6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A8154PedPerDes)==0) )
         {
            AV32Option = A8154PedPerDes ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PC6 )
         {
            brk8PC6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPEDPERPETOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPedPerPet = AV28SearchTxt ;
      AV23TFPedPerPet_Sel = "" ;
      AV62Tpedobswwds_1_filterfulltext = AV57FilterFullText ;
      AV63Tpedobswwds_2_tfemprcod = AV10TFEmprCod ;
      AV64Tpedobswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV65Tpedobswwds_4_tfpedcod = AV12TFPedCod ;
      AV66Tpedobswwds_5_tfpedcod_to = AV13TFPedCod_To ;
      AV67Tpedobswwds_6_tfpedobsul = AV14TFPedObsUL ;
      AV68Tpedobswwds_7_tfpedobsul_to = AV15TFPedObsUL_To ;
      AV69Tpedobswwds_8_tfemprnom = AV16TFEmprNom ;
      AV70Tpedobswwds_9_tfemprnom_sel = AV17TFEmprNom_Sel ;
      AV71Tpedobswwds_10_tfpedconlin = AV18TFPedConLin ;
      AV72Tpedobswwds_11_tfpedconlin_to = AV19TFPedConLin_To ;
      AV73Tpedobswwds_12_tfpedperdes = AV20TFPedPerDes ;
      AV74Tpedobswwds_13_tfpedperdes_sel = AV21TFPedPerDes_Sel ;
      AV75Tpedobswwds_14_tfpedperpet = AV22TFPedPerPet ;
      AV76Tpedobswwds_15_tfpedperpet_sel = AV23TFPedPerPet_Sel ;
      AV77Tpedobswwds_16_tfpedfecent = AV24TFPedFecEnt ;
      AV78Tpedobswwds_17_tfpedfec = AV26TFPedFec ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV62Tpedobswwds_1_filterfulltext ,
                                           AV64Tpedobswwds_3_tfemprcod_sel ,
                                           AV63Tpedobswwds_2_tfemprcod ,
                                           Integer.valueOf(AV65Tpedobswwds_4_tfpedcod) ,
                                           Integer.valueOf(AV66Tpedobswwds_5_tfpedcod_to) ,
                                           Byte.valueOf(AV67Tpedobswwds_6_tfpedobsul) ,
                                           Byte.valueOf(AV68Tpedobswwds_7_tfpedobsul_to) ,
                                           AV70Tpedobswwds_9_tfemprnom_sel ,
                                           AV69Tpedobswwds_8_tfemprnom ,
                                           Byte.valueOf(AV71Tpedobswwds_10_tfpedconlin) ,
                                           Byte.valueOf(AV72Tpedobswwds_11_tfpedconlin_to) ,
                                           AV74Tpedobswwds_13_tfpedperdes_sel ,
                                           AV73Tpedobswwds_12_tfpedperdes ,
                                           AV76Tpedobswwds_15_tfpedperpet_sel ,
                                           AV75Tpedobswwds_14_tfpedperpet ,
                                           AV77Tpedobswwds_16_tfpedfecent ,
                                           AV78Tpedobswwds_17_tfpedfec ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A2503PedObsUL) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A5049PedConLin) ,
                                           A8154PedPerDes ,
                                           A8155PedPerPet ,
                                           A662PedFecEnt ,
                                           A661PedFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV62Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Tpedobswwds_1_filterfulltext), "%", "") ;
      lV63Tpedobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV63Tpedobswwds_2_tfemprcod), 3, "%") ;
      lV69Tpedobswwds_8_tfemprnom = GXutil.padr( GXutil.rtrim( AV69Tpedobswwds_8_tfemprnom), 30, "%") ;
      lV73Tpedobswwds_12_tfpedperdes = GXutil.padr( GXutil.rtrim( AV73Tpedobswwds_12_tfpedperdes), 30, "%") ;
      lV75Tpedobswwds_14_tfpedperpet = GXutil.padr( GXutil.rtrim( AV75Tpedobswwds_14_tfpedperpet), 30, "%") ;
      /* Using cursor P08PC9 */
      pr_default.execute(3, new Object[] {lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV62Tpedobswwds_1_filterfulltext, lV63Tpedobswwds_2_tfemprcod, AV64Tpedobswwds_3_tfemprcod_sel, Integer.valueOf(AV65Tpedobswwds_4_tfpedcod), Integer.valueOf(AV66Tpedobswwds_5_tfpedcod_to), Byte.valueOf(AV67Tpedobswwds_6_tfpedobsul), Byte.valueOf(AV68Tpedobswwds_7_tfpedobsul_to), lV69Tpedobswwds_8_tfemprnom, AV70Tpedobswwds_9_tfemprnom_sel, Byte.valueOf(AV71Tpedobswwds_10_tfpedconlin), Byte.valueOf(AV72Tpedobswwds_11_tfpedconlin_to), lV73Tpedobswwds_12_tfpedperdes, AV74Tpedobswwds_13_tfpedperdes_sel, lV75Tpedobswwds_14_tfpedperpet, AV76Tpedobswwds_15_tfpedperpet_sel, AV77Tpedobswwds_16_tfpedfecent, AV78Tpedobswwds_17_tfpedfec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8PC8 = false ;
         A8155PedPerPet = P08PC9_A8155PedPerPet[0] ;
         A661PedFec = P08PC9_A661PedFec[0] ;
         A662PedFecEnt = P08PC9_A662PedFecEnt[0] ;
         A8154PedPerDes = P08PC9_A8154PedPerDes[0] ;
         A407EmprNom = P08PC9_A407EmprNom[0] ;
         n407EmprNom = P08PC9_n407EmprNom[0] ;
         A2503PedObsUL = P08PC9_A2503PedObsUL[0] ;
         n2503PedObsUL = P08PC9_n2503PedObsUL[0] ;
         A658PedCod = P08PC9_A658PedCod[0] ;
         A396EmprCod = P08PC9_A396EmprCod[0] ;
         A5049PedConLin = P08PC9_A5049PedConLin[0] ;
         n5049PedConLin = P08PC9_n5049PedConLin[0] ;
         A407EmprNom = P08PC9_A407EmprNom[0] ;
         n407EmprNom = P08PC9_n407EmprNom[0] ;
         A5049PedConLin = P08PC9_A5049PedConLin[0] ;
         n5049PedConLin = P08PC9_n5049PedConLin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08PC9_A8155PedPerPet[0], A8155PedPerPet) == 0 ) )
         {
            brk8PC8 = false ;
            A658PedCod = P08PC9_A658PedCod[0] ;
            A396EmprCod = P08PC9_A396EmprCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8PC8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A8155PedPerPet)==0) )
         {
            AV32Option = A8155PedPerPet ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PC8 )
         {
            brk8PC8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tpedobswwgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = tpedobswwgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = tpedobswwgetfilterdata.this.AV39OptionIndexesJson;
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
      AV57FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV16TFEmprNom = "" ;
      AV17TFEmprNom_Sel = "" ;
      AV20TFPedPerDes = "" ;
      AV21TFPedPerDes_Sel = "" ;
      AV22TFPedPerPet = "" ;
      AV23TFPedPerPet_Sel = "" ;
      AV24TFPedFecEnt = GXutil.nullDate() ;
      AV26TFPedFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV62Tpedobswwds_1_filterfulltext = "" ;
      AV63Tpedobswwds_2_tfemprcod = "" ;
      AV64Tpedobswwds_3_tfemprcod_sel = "" ;
      AV69Tpedobswwds_8_tfemprnom = "" ;
      AV70Tpedobswwds_9_tfemprnom_sel = "" ;
      AV73Tpedobswwds_12_tfpedperdes = "" ;
      AV74Tpedobswwds_13_tfpedperdes_sel = "" ;
      AV75Tpedobswwds_14_tfpedperpet = "" ;
      AV76Tpedobswwds_15_tfpedperpet_sel = "" ;
      AV77Tpedobswwds_16_tfpedfecent = GXutil.nullDate() ;
      AV78Tpedobswwds_17_tfpedfec = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV62Tpedobswwds_1_filterfulltext = "" ;
      lV63Tpedobswwds_2_tfemprcod = "" ;
      lV69Tpedobswwds_8_tfemprnom = "" ;
      lV73Tpedobswwds_12_tfpedperdes = "" ;
      lV75Tpedobswwds_14_tfpedperpet = "" ;
      A407EmprNom = "" ;
      A8154PedPerDes = "" ;
      A8155PedPerPet = "" ;
      A662PedFecEnt = GXutil.nullDate() ;
      A661PedFec = GXutil.nullDate() ;
      P08PC3_A396EmprCod = new String[] {""} ;
      P08PC3_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PC3_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PC3_A8155PedPerPet = new String[] {""} ;
      P08PC3_A8154PedPerDes = new String[] {""} ;
      P08PC3_A407EmprNom = new String[] {""} ;
      P08PC3_n407EmprNom = new boolean[] {false} ;
      P08PC3_A2503PedObsUL = new byte[1] ;
      P08PC3_n2503PedObsUL = new boolean[] {false} ;
      P08PC3_A658PedCod = new int[1] ;
      P08PC3_A5049PedConLin = new byte[1] ;
      P08PC3_n5049PedConLin = new boolean[] {false} ;
      AV32Option = "" ;
      AV35OptionDesc = "" ;
      P08PC5_A407EmprNom = new String[] {""} ;
      P08PC5_n407EmprNom = new boolean[] {false} ;
      P08PC5_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PC5_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PC5_A8155PedPerPet = new String[] {""} ;
      P08PC5_A8154PedPerDes = new String[] {""} ;
      P08PC5_A2503PedObsUL = new byte[1] ;
      P08PC5_n2503PedObsUL = new boolean[] {false} ;
      P08PC5_A658PedCod = new int[1] ;
      P08PC5_A396EmprCod = new String[] {""} ;
      P08PC5_A5049PedConLin = new byte[1] ;
      P08PC5_n5049PedConLin = new boolean[] {false} ;
      P08PC7_A8154PedPerDes = new String[] {""} ;
      P08PC7_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PC7_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PC7_A8155PedPerPet = new String[] {""} ;
      P08PC7_A407EmprNom = new String[] {""} ;
      P08PC7_n407EmprNom = new boolean[] {false} ;
      P08PC7_A2503PedObsUL = new byte[1] ;
      P08PC7_n2503PedObsUL = new boolean[] {false} ;
      P08PC7_A658PedCod = new int[1] ;
      P08PC7_A396EmprCod = new String[] {""} ;
      P08PC7_A5049PedConLin = new byte[1] ;
      P08PC7_n5049PedConLin = new boolean[] {false} ;
      P08PC9_A8155PedPerPet = new String[] {""} ;
      P08PC9_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PC9_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PC9_A8154PedPerDes = new String[] {""} ;
      P08PC9_A407EmprNom = new String[] {""} ;
      P08PC9_n407EmprNom = new boolean[] {false} ;
      P08PC9_A2503PedObsUL = new byte[1] ;
      P08PC9_n2503PedObsUL = new boolean[] {false} ;
      P08PC9_A658PedCod = new int[1] ;
      P08PC9_A396EmprCod = new String[] {""} ;
      P08PC9_A5049PedConLin = new byte[1] ;
      P08PC9_n5049PedConLin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedobswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PC3_A396EmprCod, P08PC3_A661PedFec, P08PC3_A662PedFecEnt, P08PC3_A8155PedPerPet, P08PC3_A8154PedPerDes, P08PC3_A407EmprNom, P08PC3_n407EmprNom, P08PC3_A2503PedObsUL, P08PC3_n2503PedObsUL, P08PC3_A658PedCod,
            P08PC3_A5049PedConLin, P08PC3_n5049PedConLin
            }
            , new Object[] {
            P08PC5_A407EmprNom, P08PC5_n407EmprNom, P08PC5_A661PedFec, P08PC5_A662PedFecEnt, P08PC5_A8155PedPerPet, P08PC5_A8154PedPerDes, P08PC5_A2503PedObsUL, P08PC5_n2503PedObsUL, P08PC5_A658PedCod, P08PC5_A396EmprCod,
            P08PC5_A5049PedConLin, P08PC5_n5049PedConLin
            }
            , new Object[] {
            P08PC7_A8154PedPerDes, P08PC7_A661PedFec, P08PC7_A662PedFecEnt, P08PC7_A8155PedPerPet, P08PC7_A407EmprNom, P08PC7_n407EmprNom, P08PC7_A2503PedObsUL, P08PC7_n2503PedObsUL, P08PC7_A658PedCod, P08PC7_A396EmprCod,
            P08PC7_A5049PedConLin, P08PC7_n5049PedConLin
            }
            , new Object[] {
            P08PC9_A8155PedPerPet, P08PC9_A661PedFec, P08PC9_A662PedFecEnt, P08PC9_A8154PedPerDes, P08PC9_A407EmprNom, P08PC9_n407EmprNom, P08PC9_A2503PedObsUL, P08PC9_n2503PedObsUL, P08PC9_A658PedCod, P08PC9_A396EmprCod,
            P08PC9_A5049PedConLin, P08PC9_n5049PedConLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFPedObsUL ;
   private byte AV15TFPedObsUL_To ;
   private byte AV18TFPedConLin ;
   private byte AV19TFPedConLin_To ;
   private byte AV67Tpedobswwds_6_tfpedobsul ;
   private byte AV68Tpedobswwds_7_tfpedobsul_to ;
   private byte AV71Tpedobswwds_10_tfpedconlin ;
   private byte AV72Tpedobswwds_11_tfpedconlin_to ;
   private byte A2503PedObsUL ;
   private byte A5049PedConLin ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int AV12TFPedCod ;
   private int AV13TFPedCod_To ;
   private int AV65Tpedobswwds_4_tfpedcod ;
   private int AV66Tpedobswwds_5_tfpedcod_to ;
   private int A658PedCod ;
   private long AV40count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV16TFEmprNom ;
   private String AV17TFEmprNom_Sel ;
   private String AV20TFPedPerDes ;
   private String AV21TFPedPerDes_Sel ;
   private String AV22TFPedPerPet ;
   private String AV23TFPedPerPet_Sel ;
   private String A396EmprCod ;
   private String AV63Tpedobswwds_2_tfemprcod ;
   private String AV64Tpedobswwds_3_tfemprcod_sel ;
   private String AV69Tpedobswwds_8_tfemprnom ;
   private String AV70Tpedobswwds_9_tfemprnom_sel ;
   private String AV73Tpedobswwds_12_tfpedperdes ;
   private String AV74Tpedobswwds_13_tfpedperdes_sel ;
   private String AV75Tpedobswwds_14_tfpedperpet ;
   private String AV76Tpedobswwds_15_tfpedperpet_sel ;
   private String scmdbuf ;
   private String lV63Tpedobswwds_2_tfemprcod ;
   private String lV69Tpedobswwds_8_tfemprnom ;
   private String lV73Tpedobswwds_12_tfpedperdes ;
   private String lV75Tpedobswwds_14_tfpedperpet ;
   private String A407EmprNom ;
   private String A8154PedPerDes ;
   private String A8155PedPerPet ;
   private java.util.Date AV24TFPedFecEnt ;
   private java.util.Date AV26TFPedFec ;
   private java.util.Date AV77Tpedobswwds_16_tfpedfecent ;
   private java.util.Date AV78Tpedobswwds_17_tfpedfec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date A661PedFec ;
   private boolean returnInSub ;
   private boolean brk8PC2 ;
   private boolean n407EmprNom ;
   private boolean n2503PedObsUL ;
   private boolean n5049PedConLin ;
   private boolean brk8PC4 ;
   private boolean brk8PC6 ;
   private boolean brk8PC8 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV57FilterFullText ;
   private String AV62Tpedobswwds_1_filterfulltext ;
   private String lV62Tpedobswwds_1_filterfulltext ;
   private String AV32Option ;
   private String AV35OptionDesc ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08PC3_A396EmprCod ;
   private java.util.Date[] P08PC3_A661PedFec ;
   private java.util.Date[] P08PC3_A662PedFecEnt ;
   private String[] P08PC3_A8155PedPerPet ;
   private String[] P08PC3_A8154PedPerDes ;
   private String[] P08PC3_A407EmprNom ;
   private boolean[] P08PC3_n407EmprNom ;
   private byte[] P08PC3_A2503PedObsUL ;
   private boolean[] P08PC3_n2503PedObsUL ;
   private int[] P08PC3_A658PedCod ;
   private byte[] P08PC3_A5049PedConLin ;
   private boolean[] P08PC3_n5049PedConLin ;
   private String[] P08PC5_A407EmprNom ;
   private boolean[] P08PC5_n407EmprNom ;
   private java.util.Date[] P08PC5_A661PedFec ;
   private java.util.Date[] P08PC5_A662PedFecEnt ;
   private String[] P08PC5_A8155PedPerPet ;
   private String[] P08PC5_A8154PedPerDes ;
   private byte[] P08PC5_A2503PedObsUL ;
   private boolean[] P08PC5_n2503PedObsUL ;
   private int[] P08PC5_A658PedCod ;
   private String[] P08PC5_A396EmprCod ;
   private byte[] P08PC5_A5049PedConLin ;
   private boolean[] P08PC5_n5049PedConLin ;
   private String[] P08PC7_A8154PedPerDes ;
   private java.util.Date[] P08PC7_A661PedFec ;
   private java.util.Date[] P08PC7_A662PedFecEnt ;
   private String[] P08PC7_A8155PedPerPet ;
   private String[] P08PC7_A407EmprNom ;
   private boolean[] P08PC7_n407EmprNom ;
   private byte[] P08PC7_A2503PedObsUL ;
   private boolean[] P08PC7_n2503PedObsUL ;
   private int[] P08PC7_A658PedCod ;
   private String[] P08PC7_A396EmprCod ;
   private byte[] P08PC7_A5049PedConLin ;
   private boolean[] P08PC7_n5049PedConLin ;
   private String[] P08PC9_A8155PedPerPet ;
   private java.util.Date[] P08PC9_A661PedFec ;
   private java.util.Date[] P08PC9_A662PedFecEnt ;
   private String[] P08PC9_A8154PedPerDes ;
   private String[] P08PC9_A407EmprNom ;
   private boolean[] P08PC9_n407EmprNom ;
   private byte[] P08PC9_A2503PedObsUL ;
   private boolean[] P08PC9_n2503PedObsUL ;
   private int[] P08PC9_A658PedCod ;
   private String[] P08PC9_A396EmprCod ;
   private byte[] P08PC9_A5049PedConLin ;
   private boolean[] P08PC9_n5049PedConLin ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tpedobswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Tpedobswwds_1_filterfulltext ,
                                          String AV64Tpedobswwds_3_tfemprcod_sel ,
                                          String AV63Tpedobswwds_2_tfemprcod ,
                                          int AV65Tpedobswwds_4_tfpedcod ,
                                          int AV66Tpedobswwds_5_tfpedcod_to ,
                                          byte AV67Tpedobswwds_6_tfpedobsul ,
                                          byte AV68Tpedobswwds_7_tfpedobsul_to ,
                                          String AV70Tpedobswwds_9_tfemprnom_sel ,
                                          String AV69Tpedobswwds_8_tfemprnom ,
                                          byte AV71Tpedobswwds_10_tfpedconlin ,
                                          byte AV72Tpedobswwds_11_tfpedconlin_to ,
                                          String AV74Tpedobswwds_13_tfpedperdes_sel ,
                                          String AV73Tpedobswwds_12_tfpedperdes ,
                                          String AV76Tpedobswwds_15_tfpedperpet_sel ,
                                          String AV75Tpedobswwds_14_tfpedperpet ,
                                          java.util.Date AV77Tpedobswwds_16_tfpedfecent ,
                                          java.util.Date AV78Tpedobswwds_17_tfpedfec ,
                                          String A396EmprCod ,
                                          int A658PedCod ,
                                          byte A2503PedObsUL ,
                                          String A407EmprNom ,
                                          byte A5049PedConLin ,
                                          String A8154PedPerDes ,
                                          String A8155PedPerPet ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date A661PedFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PedFec, T1.PedFecEnt, T1.PedPerPet, T1.PedPerDes, T2.EmprNom, T1.PedObsUL, T1.PedCod, COALESCE( T3.PedConLin, 0) AS PedConLin FROM ((TXPCPEDID" ;
      scmdbuf += " T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      if ( ! (GXutil.strcmp("", AV62Tpedobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedObsUL,'90'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.PedConLin, 0),'90'), 2) like '%' || ?) or ( UPPER(T1.PedPerDes) like '%' || UPPER(?)) or ( UPPER(T1.PedPerPet) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV64Tpedobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Tpedobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tpedobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Tpedobswwds_4_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Tpedobswwds_5_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tpedobswwds_6_tfpedobsul) )
      {
         addWhere(sWhereString, "(T1.PedObsUL >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tpedobswwds_7_tfpedobsul_to) )
      {
         addWhere(sWhereString, "(T1.PedObsUL <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tpedobswwds_9_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tpedobswwds_8_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tpedobswwds_9_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Tpedobswwds_10_tfpedconlin) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Tpedobswwds_11_tfpedconlin_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tpedobswwds_13_tfpedperdes_sel)==0) && ( ! (GXutil.strcmp("", AV73Tpedobswwds_12_tfpedperdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tpedobswwds_13_tfpedperdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerDes = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tpedobswwds_15_tfpedperpet_sel)==0) && ( ! (GXutil.strcmp("", AV75Tpedobswwds_14_tfpedperpet)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerPet) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tpedobswwds_15_tfpedperpet_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerPet = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Tpedobswwds_16_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Tpedobswwds_17_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08PC5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Tpedobswwds_1_filterfulltext ,
                                          String AV64Tpedobswwds_3_tfemprcod_sel ,
                                          String AV63Tpedobswwds_2_tfemprcod ,
                                          int AV65Tpedobswwds_4_tfpedcod ,
                                          int AV66Tpedobswwds_5_tfpedcod_to ,
                                          byte AV67Tpedobswwds_6_tfpedobsul ,
                                          byte AV68Tpedobswwds_7_tfpedobsul_to ,
                                          String AV70Tpedobswwds_9_tfemprnom_sel ,
                                          String AV69Tpedobswwds_8_tfemprnom ,
                                          byte AV71Tpedobswwds_10_tfpedconlin ,
                                          byte AV72Tpedobswwds_11_tfpedconlin_to ,
                                          String AV74Tpedobswwds_13_tfpedperdes_sel ,
                                          String AV73Tpedobswwds_12_tfpedperdes ,
                                          String AV76Tpedobswwds_15_tfpedperpet_sel ,
                                          String AV75Tpedobswwds_14_tfpedperpet ,
                                          java.util.Date AV77Tpedobswwds_16_tfpedfecent ,
                                          java.util.Date AV78Tpedobswwds_17_tfpedfec ,
                                          String A396EmprCod ,
                                          int A658PedCod ,
                                          byte A2503PedObsUL ,
                                          String A407EmprNom ,
                                          byte A5049PedConLin ,
                                          String A8154PedPerDes ,
                                          String A8155PedPerPet ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date A661PedFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[23];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.PedFec, T1.PedFecEnt, T1.PedPerPet, T1.PedPerDes, T1.PedObsUL, T1.PedCod, T1.EmprCod, COALESCE( T3.PedConLin, 0) AS PedConLin FROM ((TXPCPEDID" ;
      scmdbuf += " T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      if ( ! (GXutil.strcmp("", AV62Tpedobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedObsUL,'90'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.PedConLin, 0),'90'), 2) like '%' || ?) or ( UPPER(T1.PedPerDes) like '%' || UPPER(?)) or ( UPPER(T1.PedPerPet) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV64Tpedobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Tpedobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tpedobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Tpedobswwds_4_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Tpedobswwds_5_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tpedobswwds_6_tfpedobsul) )
      {
         addWhere(sWhereString, "(T1.PedObsUL >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tpedobswwds_7_tfpedobsul_to) )
      {
         addWhere(sWhereString, "(T1.PedObsUL <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tpedobswwds_9_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tpedobswwds_8_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tpedobswwds_9_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Tpedobswwds_10_tfpedconlin) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Tpedobswwds_11_tfpedconlin_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tpedobswwds_13_tfpedperdes_sel)==0) && ( ! (GXutil.strcmp("", AV73Tpedobswwds_12_tfpedperdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tpedobswwds_13_tfpedperdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerDes = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tpedobswwds_15_tfpedperpet_sel)==0) && ( ! (GXutil.strcmp("", AV75Tpedobswwds_14_tfpedperpet)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerPet) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tpedobswwds_15_tfpedperpet_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerPet = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Tpedobswwds_16_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Tpedobswwds_17_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08PC7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Tpedobswwds_1_filterfulltext ,
                                          String AV64Tpedobswwds_3_tfemprcod_sel ,
                                          String AV63Tpedobswwds_2_tfemprcod ,
                                          int AV65Tpedobswwds_4_tfpedcod ,
                                          int AV66Tpedobswwds_5_tfpedcod_to ,
                                          byte AV67Tpedobswwds_6_tfpedobsul ,
                                          byte AV68Tpedobswwds_7_tfpedobsul_to ,
                                          String AV70Tpedobswwds_9_tfemprnom_sel ,
                                          String AV69Tpedobswwds_8_tfemprnom ,
                                          byte AV71Tpedobswwds_10_tfpedconlin ,
                                          byte AV72Tpedobswwds_11_tfpedconlin_to ,
                                          String AV74Tpedobswwds_13_tfpedperdes_sel ,
                                          String AV73Tpedobswwds_12_tfpedperdes ,
                                          String AV76Tpedobswwds_15_tfpedperpet_sel ,
                                          String AV75Tpedobswwds_14_tfpedperpet ,
                                          java.util.Date AV77Tpedobswwds_16_tfpedfecent ,
                                          java.util.Date AV78Tpedobswwds_17_tfpedfec ,
                                          String A396EmprCod ,
                                          int A658PedCod ,
                                          byte A2503PedObsUL ,
                                          String A407EmprNom ,
                                          byte A5049PedConLin ,
                                          String A8154PedPerDes ,
                                          String A8155PedPerPet ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date A661PedFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PedPerDes, T1.PedFec, T1.PedFecEnt, T1.PedPerPet, T2.EmprNom, T1.PedObsUL, T1.PedCod, T1.EmprCod, COALESCE( T3.PedConLin, 0) AS PedConLin FROM ((TXPCPEDID" ;
      scmdbuf += " T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      if ( ! (GXutil.strcmp("", AV62Tpedobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedObsUL,'90'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.PedConLin, 0),'90'), 2) like '%' || ?) or ( UPPER(T1.PedPerDes) like '%' || UPPER(?)) or ( UPPER(T1.PedPerPet) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV64Tpedobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Tpedobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tpedobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Tpedobswwds_4_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Tpedobswwds_5_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tpedobswwds_6_tfpedobsul) )
      {
         addWhere(sWhereString, "(T1.PedObsUL >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tpedobswwds_7_tfpedobsul_to) )
      {
         addWhere(sWhereString, "(T1.PedObsUL <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tpedobswwds_9_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tpedobswwds_8_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tpedobswwds_9_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Tpedobswwds_10_tfpedconlin) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Tpedobswwds_11_tfpedconlin_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tpedobswwds_13_tfpedperdes_sel)==0) && ( ! (GXutil.strcmp("", AV73Tpedobswwds_12_tfpedperdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tpedobswwds_13_tfpedperdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerDes = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tpedobswwds_15_tfpedperpet_sel)==0) && ( ! (GXutil.strcmp("", AV75Tpedobswwds_14_tfpedperpet)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerPet) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tpedobswwds_15_tfpedperpet_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerPet = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Tpedobswwds_16_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Tpedobswwds_17_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PedPerDes" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08PC9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Tpedobswwds_1_filterfulltext ,
                                          String AV64Tpedobswwds_3_tfemprcod_sel ,
                                          String AV63Tpedobswwds_2_tfemprcod ,
                                          int AV65Tpedobswwds_4_tfpedcod ,
                                          int AV66Tpedobswwds_5_tfpedcod_to ,
                                          byte AV67Tpedobswwds_6_tfpedobsul ,
                                          byte AV68Tpedobswwds_7_tfpedobsul_to ,
                                          String AV70Tpedobswwds_9_tfemprnom_sel ,
                                          String AV69Tpedobswwds_8_tfemprnom ,
                                          byte AV71Tpedobswwds_10_tfpedconlin ,
                                          byte AV72Tpedobswwds_11_tfpedconlin_to ,
                                          String AV74Tpedobswwds_13_tfpedperdes_sel ,
                                          String AV73Tpedobswwds_12_tfpedperdes ,
                                          String AV76Tpedobswwds_15_tfpedperpet_sel ,
                                          String AV75Tpedobswwds_14_tfpedperpet ,
                                          java.util.Date AV77Tpedobswwds_16_tfpedfecent ,
                                          java.util.Date AV78Tpedobswwds_17_tfpedfec ,
                                          String A396EmprCod ,
                                          int A658PedCod ,
                                          byte A2503PedObsUL ,
                                          String A407EmprNom ,
                                          byte A5049PedConLin ,
                                          String A8154PedPerDes ,
                                          String A8155PedPerPet ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date A661PedFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[23];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PedPerPet, T1.PedFec, T1.PedFecEnt, T1.PedPerDes, T2.EmprNom, T1.PedObsUL, T1.PedCod, T1.EmprCod, COALESCE( T3.PedConLin, 0) AS PedConLin FROM ((TXPCPEDID" ;
      scmdbuf += " T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      if ( ! (GXutil.strcmp("", AV62Tpedobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedObsUL,'90'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.PedConLin, 0),'90'), 2) like '%' || ?) or ( UPPER(T1.PedPerDes) like '%' || UPPER(?)) or ( UPPER(T1.PedPerPet) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV64Tpedobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Tpedobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tpedobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Tpedobswwds_4_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Tpedobswwds_5_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tpedobswwds_6_tfpedobsul) )
      {
         addWhere(sWhereString, "(T1.PedObsUL >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tpedobswwds_7_tfpedobsul_to) )
      {
         addWhere(sWhereString, "(T1.PedObsUL <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tpedobswwds_9_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tpedobswwds_8_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tpedobswwds_9_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Tpedobswwds_10_tfpedconlin) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Tpedobswwds_11_tfpedconlin_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tpedobswwds_13_tfpedperdes_sel)==0) && ( ! (GXutil.strcmp("", AV73Tpedobswwds_12_tfpedperdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tpedobswwds_13_tfpedperdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerDes = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tpedobswwds_15_tfpedperpet_sel)==0) && ( ! (GXutil.strcmp("", AV75Tpedobswwds_14_tfpedperpet)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerPet) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tpedobswwds_15_tfpedperpet_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerPet = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Tpedobswwds_16_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Tpedobswwds_17_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PedPerPet" ;
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
                  return conditional_P08PC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] );
            case 1 :
                  return conditional_P08PC5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] );
            case 2 :
                  return conditional_P08PC7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] );
            case 3 :
                  return conditional_P08PC9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PC5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PC7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PC9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
      }
   }

}

