package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class veranyadidasgetfilterdata extends GXProcedure
{
   public veranyadidasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( veranyadidasgetfilterdata.class ), "" );
   }

   public veranyadidasgetfilterdata( int remoteHandle ,
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
      veranyadidasgetfilterdata.this.aP5 = new String[] {""};
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
      veranyadidasgetfilterdata.this.AV35DDOName = aP0;
      veranyadidasgetfilterdata.this.AV36SearchTxt = aP1;
      veranyadidasgetfilterdata.this.AV37SearchTxtTo = aP2;
      veranyadidasgetfilterdata.this.aP3 = aP3;
      veranyadidasgetfilterdata.this.aP4 = aP4;
      veranyadidasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV35DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV35DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV35DDOName), "DDO_LANYLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADLANYLOTEOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV38OptionsJson = AV25Options.toJSonString(false) ;
      AV39OptionsDescJson = AV27OptionsDesc.toJSonString(false) ;
      AV40OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue("FormulacionTinte.VerAnyadidasGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.VerAnyadidasGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV30Session.getValue("FormulacionTinte.VerAnyadidasGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECNUMANY") == 0 )
         {
            AV10TFRecNumAny = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecNumAny_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV14TFPrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCFIN") == 0 )
         {
            AV16TFPrdCFin = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPrdCFin_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE") == 0 )
         {
            AV21TFLanyLote = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE_SEL") == 0 )
         {
            AV22TFLanyLote_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV42EmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV43BarCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV44BarCodReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV45BarCodPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAL") == 0 )
         {
            AV46RecLinMAL = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV36SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV51Formulaciontinte_veranyadidasds_1_tfrecnumany = AV10TFRecNumAny ;
      AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to = AV11TFRecNumAny_To ;
      AV53Formulaciontinte_veranyadidasds_3_tfprdnum = AV12TFPrdNum ;
      AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Formulaciontinte_veranyadidasds_5_tfprdnom = AV14TFPrdNom ;
      AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Formulaciontinte_veranyadidasds_7_tfprdcfin = AV16TFPrdCFin ;
      AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to = AV17TFPrdCFin_To ;
      AV59Formulaciontinte_veranyadidasds_9_tflanylote = AV21TFLanyLote ;
      AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel = AV22TFLanyLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV51Formulaciontinte_veranyadidasds_1_tfrecnumany) ,
                                           Byte.valueOf(AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to) ,
                                           AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel ,
                                           AV53Formulaciontinte_veranyadidasds_3_tfprdnum ,
                                           AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel ,
                                           AV55Formulaciontinte_veranyadidasds_5_tfprdnom ,
                                           AV57Formulaciontinte_veranyadidasds_7_tfprdcfin ,
                                           AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to ,
                                           AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel ,
                                           AV59Formulaciontinte_veranyadidasds_9_tflanylote ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A5807LanyLote ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44BarCodReo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Short.valueOf(AV46RecLinMAL) ,
                                           AV42EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_veranyadidasds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_veranyadidasds_3_tfprdnum), 6, "%") ;
      lV55Formulaciontinte_veranyadidasds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_veranyadidasds_5_tfprdnom), 26, "%") ;
      lV59Formulaciontinte_veranyadidasds_9_tflanylote = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_veranyadidasds_9_tflanylote), 26, "%") ;
      /* Using cursor P0ADP2 */
      pr_default.execute(0, new Object[] {AV42EmprCod, Integer.valueOf(AV43BarCod), Byte.valueOf(AV44BarCodReo), AV45BarCodPar, Short.valueOf(AV46RecLinMAL), Byte.valueOf(AV51Formulaciontinte_veranyadidasds_1_tfrecnumany), Byte.valueOf(AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to), lV53Formulaciontinte_veranyadidasds_3_tfprdnum, AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel, lV55Formulaciontinte_veranyadidasds_5_tfprdnom, AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel, AV57Formulaciontinte_veranyadidasds_7_tfprdcfin, AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to, lV59Formulaciontinte_veranyadidasds_9_tflanylote, AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkADP2 = false ;
         A396EmprCod = P0ADP2_A396EmprCod[0] ;
         A719PrdNum = P0ADP2_A719PrdNum[0] ;
         A2808RecLinMAL = P0ADP2_A2808RecLinMAL[0] ;
         A130BarCodPar = P0ADP2_A130BarCodPar[0] ;
         A132BarCodReo = P0ADP2_A132BarCodReo[0] ;
         A129BarCod = P0ADP2_A129BarCod[0] ;
         A5807LanyLote = P0ADP2_A5807LanyLote[0] ;
         n5807LanyLote = P0ADP2_n5807LanyLote[0] ;
         A1378PrdCFin = P0ADP2_A1378PrdCFin[0] ;
         n1378PrdCFin = P0ADP2_n1378PrdCFin[0] ;
         A718PrdNom = P0ADP2_A718PrdNom[0] ;
         A1377RecNumAny = P0ADP2_A1377RecNumAny[0] ;
         A718PrdNom = P0ADP2_A718PrdNom[0] ;
         AV29count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ADP2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ADP2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brkADP2 = false ;
            A2808RecLinMAL = P0ADP2_A2808RecLinMAL[0] ;
            A130BarCodPar = P0ADP2_A130BarCodPar[0] ;
            A132BarCodReo = P0ADP2_A132BarCodReo[0] ;
            A129BarCod = P0ADP2_A129BarCod[0] ;
            A1377RecNumAny = P0ADP2_A1377RecNumAny[0] ;
            AV29count = (long)(AV29count+1) ;
            brkADP2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV24Option = A719PrdNum ;
            AV25Options.add(AV24Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV29count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADP2 )
         {
            brkADP2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV36SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV51Formulaciontinte_veranyadidasds_1_tfrecnumany = AV10TFRecNumAny ;
      AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to = AV11TFRecNumAny_To ;
      AV53Formulaciontinte_veranyadidasds_3_tfprdnum = AV12TFPrdNum ;
      AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Formulaciontinte_veranyadidasds_5_tfprdnom = AV14TFPrdNom ;
      AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Formulaciontinte_veranyadidasds_7_tfprdcfin = AV16TFPrdCFin ;
      AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to = AV17TFPrdCFin_To ;
      AV59Formulaciontinte_veranyadidasds_9_tflanylote = AV21TFLanyLote ;
      AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel = AV22TFLanyLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV51Formulaciontinte_veranyadidasds_1_tfrecnumany) ,
                                           Byte.valueOf(AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to) ,
                                           AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel ,
                                           AV53Formulaciontinte_veranyadidasds_3_tfprdnum ,
                                           AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel ,
                                           AV55Formulaciontinte_veranyadidasds_5_tfprdnom ,
                                           AV57Formulaciontinte_veranyadidasds_7_tfprdcfin ,
                                           AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to ,
                                           AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel ,
                                           AV59Formulaciontinte_veranyadidasds_9_tflanylote ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A5807LanyLote ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44BarCodReo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Short.valueOf(AV46RecLinMAL) ,
                                           AV42EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_veranyadidasds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_veranyadidasds_3_tfprdnum), 6, "%") ;
      lV55Formulaciontinte_veranyadidasds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_veranyadidasds_5_tfprdnom), 26, "%") ;
      lV59Formulaciontinte_veranyadidasds_9_tflanylote = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_veranyadidasds_9_tflanylote), 26, "%") ;
      /* Using cursor P0ADP3 */
      pr_default.execute(1, new Object[] {AV42EmprCod, Integer.valueOf(AV43BarCod), Byte.valueOf(AV44BarCodReo), AV45BarCodPar, Short.valueOf(AV46RecLinMAL), Byte.valueOf(AV51Formulaciontinte_veranyadidasds_1_tfrecnumany), Byte.valueOf(AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to), lV53Formulaciontinte_veranyadidasds_3_tfprdnum, AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel, lV55Formulaciontinte_veranyadidasds_5_tfprdnom, AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel, AV57Formulaciontinte_veranyadidasds_7_tfprdcfin, AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to, lV59Formulaciontinte_veranyadidasds_9_tflanylote, AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkADP4 = false ;
         A719PrdNum = P0ADP3_A719PrdNum[0] ;
         A396EmprCod = P0ADP3_A396EmprCod[0] ;
         A2808RecLinMAL = P0ADP3_A2808RecLinMAL[0] ;
         A130BarCodPar = P0ADP3_A130BarCodPar[0] ;
         A132BarCodReo = P0ADP3_A132BarCodReo[0] ;
         A129BarCod = P0ADP3_A129BarCod[0] ;
         A5807LanyLote = P0ADP3_A5807LanyLote[0] ;
         n5807LanyLote = P0ADP3_n5807LanyLote[0] ;
         A1378PrdCFin = P0ADP3_A1378PrdCFin[0] ;
         n1378PrdCFin = P0ADP3_n1378PrdCFin[0] ;
         A718PrdNom = P0ADP3_A718PrdNom[0] ;
         A1377RecNumAny = P0ADP3_A1377RecNumAny[0] ;
         A718PrdNom = P0ADP3_A718PrdNom[0] ;
         AV29count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ADP3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ADP3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brkADP4 = false ;
            A2808RecLinMAL = P0ADP3_A2808RecLinMAL[0] ;
            A130BarCodPar = P0ADP3_A130BarCodPar[0] ;
            A132BarCodReo = P0ADP3_A132BarCodReo[0] ;
            A129BarCod = P0ADP3_A129BarCod[0] ;
            A1377RecNumAny = P0ADP3_A1377RecNumAny[0] ;
            AV29count = (long)(AV29count+1) ;
            brkADP4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV24Option = A718PrdNom ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            AV25Options.add(AV24Option, AV23InsertIndex);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV29count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADP4 )
         {
            brkADP4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLANYLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV21TFLanyLote = AV36SearchTxt ;
      AV22TFLanyLote_Sel = "" ;
      AV51Formulaciontinte_veranyadidasds_1_tfrecnumany = AV10TFRecNumAny ;
      AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to = AV11TFRecNumAny_To ;
      AV53Formulaciontinte_veranyadidasds_3_tfprdnum = AV12TFPrdNum ;
      AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Formulaciontinte_veranyadidasds_5_tfprdnom = AV14TFPrdNom ;
      AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Formulaciontinte_veranyadidasds_7_tfprdcfin = AV16TFPrdCFin ;
      AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to = AV17TFPrdCFin_To ;
      AV59Formulaciontinte_veranyadidasds_9_tflanylote = AV21TFLanyLote ;
      AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel = AV22TFLanyLote_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(AV51Formulaciontinte_veranyadidasds_1_tfrecnumany) ,
                                           Byte.valueOf(AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to) ,
                                           AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel ,
                                           AV53Formulaciontinte_veranyadidasds_3_tfprdnum ,
                                           AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel ,
                                           AV55Formulaciontinte_veranyadidasds_5_tfprdnom ,
                                           AV57Formulaciontinte_veranyadidasds_7_tfprdcfin ,
                                           AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to ,
                                           AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel ,
                                           AV59Formulaciontinte_veranyadidasds_9_tflanylote ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A5807LanyLote ,
                                           A396EmprCod ,
                                           AV42EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44BarCodReo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Short.valueOf(AV46RecLinMAL) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV53Formulaciontinte_veranyadidasds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_veranyadidasds_3_tfprdnum), 6, "%") ;
      lV55Formulaciontinte_veranyadidasds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_veranyadidasds_5_tfprdnom), 26, "%") ;
      lV59Formulaciontinte_veranyadidasds_9_tflanylote = GXutil.padr( GXutil.rtrim( AV59Formulaciontinte_veranyadidasds_9_tflanylote), 26, "%") ;
      /* Using cursor P0ADP4 */
      pr_default.execute(2, new Object[] {AV42EmprCod, Integer.valueOf(AV43BarCod), Byte.valueOf(AV44BarCodReo), AV45BarCodPar, Short.valueOf(AV46RecLinMAL), Byte.valueOf(AV51Formulaciontinte_veranyadidasds_1_tfrecnumany), Byte.valueOf(AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to), lV53Formulaciontinte_veranyadidasds_3_tfprdnum, AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel, lV55Formulaciontinte_veranyadidasds_5_tfprdnom, AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel, AV57Formulaciontinte_veranyadidasds_7_tfprdcfin, AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to, lV59Formulaciontinte_veranyadidasds_9_tflanylote, AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkADP6 = false ;
         A396EmprCod = P0ADP4_A396EmprCod[0] ;
         A129BarCod = P0ADP4_A129BarCod[0] ;
         A132BarCodReo = P0ADP4_A132BarCodReo[0] ;
         A130BarCodPar = P0ADP4_A130BarCodPar[0] ;
         A2808RecLinMAL = P0ADP4_A2808RecLinMAL[0] ;
         A5807LanyLote = P0ADP4_A5807LanyLote[0] ;
         n5807LanyLote = P0ADP4_n5807LanyLote[0] ;
         A1378PrdCFin = P0ADP4_A1378PrdCFin[0] ;
         n1378PrdCFin = P0ADP4_n1378PrdCFin[0] ;
         A718PrdNom = P0ADP4_A718PrdNom[0] ;
         A719PrdNum = P0ADP4_A719PrdNum[0] ;
         A1377RecNumAny = P0ADP4_A1377RecNumAny[0] ;
         A718PrdNom = P0ADP4_A718PrdNom[0] ;
         AV29count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ADP4_A5807LanyLote[0], A5807LanyLote) == 0 ) )
         {
            brkADP6 = false ;
            A396EmprCod = P0ADP4_A396EmprCod[0] ;
            A129BarCod = P0ADP4_A129BarCod[0] ;
            A132BarCodReo = P0ADP4_A132BarCodReo[0] ;
            A130BarCodPar = P0ADP4_A130BarCodPar[0] ;
            A2808RecLinMAL = P0ADP4_A2808RecLinMAL[0] ;
            A719PrdNum = P0ADP4_A719PrdNum[0] ;
            A1377RecNumAny = P0ADP4_A1377RecNumAny[0] ;
            AV29count = (long)(AV29count+1) ;
            brkADP6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5807LanyLote)==0) )
         {
            AV24Option = A5807LanyLote ;
            AV25Options.add(AV24Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV29count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADP6 )
         {
            brkADP6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = veranyadidasgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = veranyadidasgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = veranyadidasgetfilterdata.this.AV40OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV40OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV30Session = httpContext.getWebSession();
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV16TFPrdCFin = DecimalUtil.ZERO ;
      AV17TFPrdCFin_To = DecimalUtil.ZERO ;
      AV21TFLanyLote = "" ;
      AV22TFLanyLote_Sel = "" ;
      AV42EmprCod = "" ;
      AV45BarCodPar = "" ;
      A719PrdNum = "" ;
      AV53Formulaciontinte_veranyadidasds_3_tfprdnum = "" ;
      AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel = "" ;
      AV55Formulaciontinte_veranyadidasds_5_tfprdnom = "" ;
      AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel = "" ;
      AV57Formulaciontinte_veranyadidasds_7_tfprdcfin = DecimalUtil.ZERO ;
      AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to = DecimalUtil.ZERO ;
      AV59Formulaciontinte_veranyadidasds_9_tflanylote = "" ;
      AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel = "" ;
      scmdbuf = "" ;
      lV53Formulaciontinte_veranyadidasds_3_tfprdnum = "" ;
      lV55Formulaciontinte_veranyadidasds_5_tfprdnom = "" ;
      lV59Formulaciontinte_veranyadidasds_9_tflanylote = "" ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A5807LanyLote = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P0ADP2_A396EmprCod = new String[] {""} ;
      P0ADP2_A719PrdNum = new String[] {""} ;
      P0ADP2_A2808RecLinMAL = new short[1] ;
      P0ADP2_A130BarCodPar = new String[] {""} ;
      P0ADP2_A132BarCodReo = new byte[1] ;
      P0ADP2_A129BarCod = new int[1] ;
      P0ADP2_A5807LanyLote = new String[] {""} ;
      P0ADP2_n5807LanyLote = new boolean[] {false} ;
      P0ADP2_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADP2_n1378PrdCFin = new boolean[] {false} ;
      P0ADP2_A718PrdNom = new String[] {""} ;
      P0ADP2_A1377RecNumAny = new byte[1] ;
      AV24Option = "" ;
      P0ADP3_A719PrdNum = new String[] {""} ;
      P0ADP3_A396EmprCod = new String[] {""} ;
      P0ADP3_A2808RecLinMAL = new short[1] ;
      P0ADP3_A130BarCodPar = new String[] {""} ;
      P0ADP3_A132BarCodReo = new byte[1] ;
      P0ADP3_A129BarCod = new int[1] ;
      P0ADP3_A5807LanyLote = new String[] {""} ;
      P0ADP3_n5807LanyLote = new boolean[] {false} ;
      P0ADP3_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADP3_n1378PrdCFin = new boolean[] {false} ;
      P0ADP3_A718PrdNom = new String[] {""} ;
      P0ADP3_A1377RecNumAny = new byte[1] ;
      P0ADP4_A396EmprCod = new String[] {""} ;
      P0ADP4_A129BarCod = new int[1] ;
      P0ADP4_A132BarCodReo = new byte[1] ;
      P0ADP4_A130BarCodPar = new String[] {""} ;
      P0ADP4_A2808RecLinMAL = new short[1] ;
      P0ADP4_A5807LanyLote = new String[] {""} ;
      P0ADP4_n5807LanyLote = new boolean[] {false} ;
      P0ADP4_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ADP4_n1378PrdCFin = new boolean[] {false} ;
      P0ADP4_A718PrdNom = new String[] {""} ;
      P0ADP4_A719PrdNum = new String[] {""} ;
      P0ADP4_A1377RecNumAny = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.veranyadidasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ADP2_A396EmprCod, P0ADP2_A719PrdNum, P0ADP2_A2808RecLinMAL, P0ADP2_A130BarCodPar, P0ADP2_A132BarCodReo, P0ADP2_A129BarCod, P0ADP2_A5807LanyLote, P0ADP2_n5807LanyLote, P0ADP2_A1378PrdCFin, P0ADP2_n1378PrdCFin,
            P0ADP2_A718PrdNom, P0ADP2_A1377RecNumAny
            }
            , new Object[] {
            P0ADP3_A719PrdNum, P0ADP3_A396EmprCod, P0ADP3_A2808RecLinMAL, P0ADP3_A130BarCodPar, P0ADP3_A132BarCodReo, P0ADP3_A129BarCod, P0ADP3_A5807LanyLote, P0ADP3_n5807LanyLote, P0ADP3_A1378PrdCFin, P0ADP3_n1378PrdCFin,
            P0ADP3_A718PrdNom, P0ADP3_A1377RecNumAny
            }
            , new Object[] {
            P0ADP4_A396EmprCod, P0ADP4_A129BarCod, P0ADP4_A132BarCodReo, P0ADP4_A130BarCodPar, P0ADP4_A2808RecLinMAL, P0ADP4_A5807LanyLote, P0ADP4_n5807LanyLote, P0ADP4_A1378PrdCFin, P0ADP4_n1378PrdCFin, P0ADP4_A718PrdNom,
            P0ADP4_A719PrdNum, P0ADP4_A1377RecNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecNumAny ;
   private byte AV11TFRecNumAny_To ;
   private byte AV44BarCodReo ;
   private byte AV51Formulaciontinte_veranyadidasds_1_tfrecnumany ;
   private byte AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to ;
   private byte A1377RecNumAny ;
   private byte A132BarCodReo ;
   private short AV46RecLinMAL ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV43BarCod ;
   private int A129BarCod ;
   private int AV23InsertIndex ;
   private long AV29count ;
   private java.math.BigDecimal AV16TFPrdCFin ;
   private java.math.BigDecimal AV17TFPrdCFin_To ;
   private java.math.BigDecimal AV57Formulaciontinte_veranyadidasds_7_tfprdcfin ;
   private java.math.BigDecimal AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to ;
   private java.math.BigDecimal A1378PrdCFin ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV21TFLanyLote ;
   private String AV22TFLanyLote_Sel ;
   private String AV42EmprCod ;
   private String AV45BarCodPar ;
   private String A719PrdNum ;
   private String AV53Formulaciontinte_veranyadidasds_3_tfprdnum ;
   private String AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel ;
   private String AV55Formulaciontinte_veranyadidasds_5_tfprdnom ;
   private String AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel ;
   private String AV59Formulaciontinte_veranyadidasds_9_tflanylote ;
   private String AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel ;
   private String scmdbuf ;
   private String lV53Formulaciontinte_veranyadidasds_3_tfprdnum ;
   private String lV55Formulaciontinte_veranyadidasds_5_tfprdnom ;
   private String lV59Formulaciontinte_veranyadidasds_9_tflanylote ;
   private String A718PrdNom ;
   private String A5807LanyLote ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkADP2 ;
   private boolean n5807LanyLote ;
   private boolean n1378PrdCFin ;
   private boolean brkADP4 ;
   private boolean brkADP6 ;
   private String AV38OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV40OptionIndexesJson ;
   private String AV35DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADP2_A396EmprCod ;
   private String[] P0ADP2_A719PrdNum ;
   private short[] P0ADP2_A2808RecLinMAL ;
   private String[] P0ADP2_A130BarCodPar ;
   private byte[] P0ADP2_A132BarCodReo ;
   private int[] P0ADP2_A129BarCod ;
   private String[] P0ADP2_A5807LanyLote ;
   private boolean[] P0ADP2_n5807LanyLote ;
   private java.math.BigDecimal[] P0ADP2_A1378PrdCFin ;
   private boolean[] P0ADP2_n1378PrdCFin ;
   private String[] P0ADP2_A718PrdNom ;
   private byte[] P0ADP2_A1377RecNumAny ;
   private String[] P0ADP3_A719PrdNum ;
   private String[] P0ADP3_A396EmprCod ;
   private short[] P0ADP3_A2808RecLinMAL ;
   private String[] P0ADP3_A130BarCodPar ;
   private byte[] P0ADP3_A132BarCodReo ;
   private int[] P0ADP3_A129BarCod ;
   private String[] P0ADP3_A5807LanyLote ;
   private boolean[] P0ADP3_n5807LanyLote ;
   private java.math.BigDecimal[] P0ADP3_A1378PrdCFin ;
   private boolean[] P0ADP3_n1378PrdCFin ;
   private String[] P0ADP3_A718PrdNom ;
   private byte[] P0ADP3_A1377RecNumAny ;
   private String[] P0ADP4_A396EmprCod ;
   private int[] P0ADP4_A129BarCod ;
   private byte[] P0ADP4_A132BarCodReo ;
   private String[] P0ADP4_A130BarCodPar ;
   private short[] P0ADP4_A2808RecLinMAL ;
   private String[] P0ADP4_A5807LanyLote ;
   private boolean[] P0ADP4_n5807LanyLote ;
   private java.math.BigDecimal[] P0ADP4_A1378PrdCFin ;
   private boolean[] P0ADP4_n1378PrdCFin ;
   private String[] P0ADP4_A718PrdNom ;
   private String[] P0ADP4_A719PrdNum ;
   private byte[] P0ADP4_A1377RecNumAny ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV27OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class veranyadidasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ADP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV51Formulaciontinte_veranyadidasds_1_tfrecnumany ,
                                          byte AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to ,
                                          String AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel ,
                                          String AV53Formulaciontinte_veranyadidasds_3_tfprdnum ,
                                          String AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel ,
                                          String AV55Formulaciontinte_veranyadidasds_5_tfprdnom ,
                                          java.math.BigDecimal AV57Formulaciontinte_veranyadidasds_7_tfprdcfin ,
                                          java.math.BigDecimal AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to ,
                                          String AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel ,
                                          String AV59Formulaciontinte_veranyadidasds_9_tflanylote ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A5807LanyLote ,
                                          int A129BarCod ,
                                          int AV43BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV44BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          short A2808RecLinMAL ,
                                          short AV46RecLinMAL ,
                                          String AV42EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.RecLinMAL, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.LanyLote, T1.PrdCFin, T2.PrdNom, T1.RecNumAny FROM (TXPLANYAD T1 INNER JOIN" ;
      scmdbuf += " TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMAL = ?)");
      if ( ! (0==AV51Formulaciontinte_veranyadidasds_1_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_veranyadidasds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_veranyadidasds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Formulaciontinte_veranyadidasds_7_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_veranyadidasds_9_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ADP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV51Formulaciontinte_veranyadidasds_1_tfrecnumany ,
                                          byte AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to ,
                                          String AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel ,
                                          String AV53Formulaciontinte_veranyadidasds_3_tfprdnum ,
                                          String AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel ,
                                          String AV55Formulaciontinte_veranyadidasds_5_tfprdnom ,
                                          java.math.BigDecimal AV57Formulaciontinte_veranyadidasds_7_tfprdcfin ,
                                          java.math.BigDecimal AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to ,
                                          String AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel ,
                                          String AV59Formulaciontinte_veranyadidasds_9_tflanylote ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A5807LanyLote ,
                                          int A129BarCod ,
                                          int AV43BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV44BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          short A2808RecLinMAL ,
                                          short AV46RecLinMAL ,
                                          String AV42EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[15];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.RecLinMAL, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.LanyLote, T1.PrdCFin, T2.PrdNom, T1.RecNumAny FROM (TXPLANYAD T1 INNER JOIN" ;
      scmdbuf += " TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMAL = ?)");
      if ( ! (0==AV51Formulaciontinte_veranyadidasds_1_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_veranyadidasds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_veranyadidasds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Formulaciontinte_veranyadidasds_7_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_veranyadidasds_9_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ADP4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV51Formulaciontinte_veranyadidasds_1_tfrecnumany ,
                                          byte AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to ,
                                          String AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel ,
                                          String AV53Formulaciontinte_veranyadidasds_3_tfprdnum ,
                                          String AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel ,
                                          String AV55Formulaciontinte_veranyadidasds_5_tfprdnom ,
                                          java.math.BigDecimal AV57Formulaciontinte_veranyadidasds_7_tfprdcfin ,
                                          java.math.BigDecimal AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to ,
                                          String AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel ,
                                          String AV59Formulaciontinte_veranyadidasds_9_tflanylote ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A5807LanyLote ,
                                          String A396EmprCod ,
                                          String AV42EmprCod ,
                                          int A129BarCod ,
                                          int AV43BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV44BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          short A2808RecLinMAL ,
                                          short AV46RecLinMAL )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.LanyLote, T1.PrdCFin, T2.PrdNom, T1.PrdNum, T1.RecNumAny FROM (TXPLANYAD T1 INNER JOIN" ;
      scmdbuf += " TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMAL = ?)");
      if ( ! (0==AV51Formulaciontinte_veranyadidasds_1_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_veranyadidasds_2_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_veranyadidasds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_veranyadidasds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_veranyadidasds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_veranyadidasds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Formulaciontinte_veranyadidasds_7_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Formulaciontinte_veranyadidasds_8_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV59Formulaciontinte_veranyadidasds_9_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_veranyadidasds_10_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.LanyLote" ;
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
                  return conditional_P0ADP2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P0ADP3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P0ADP4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADP4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
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
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               return;
      }
   }

}

