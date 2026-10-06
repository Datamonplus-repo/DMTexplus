package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiocolorenhdragrupadagetfilterdata extends GXProcedure
{
   public cambiocolorenhdragrupadagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiocolorenhdragrupadagetfilterdata.class ), "" );
   }

   public cambiocolorenhdragrupadagetfilterdata( int remoteHandle ,
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
      cambiocolorenhdragrupadagetfilterdata.this.aP5 = new String[] {""};
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
      cambiocolorenhdragrupadagetfilterdata.this.AV30DDOName = aP0;
      cambiocolorenhdragrupadagetfilterdata.this.AV31SearchTxt = aP1;
      cambiocolorenhdragrupadagetfilterdata.this.AV32SearchTxtTo = aP2;
      cambiocolorenhdragrupadagetfilterdata.this.aP3 = aP3;
      cambiocolorenhdragrupadagetfilterdata.this.aP4 = aP4;
      cambiocolorenhdragrupadagetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARAGRNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARAGRSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_COLNOMAGR") == 0 )
      {
         /* Execute user subroutine: 'LOADCOLNOMAGROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV33OptionsJson = AV20Options.toJSonString(false) ;
      AV34OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV23OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("GestionLaboratorio.CambioColorenHdrAgrupadaGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.CambioColorenHdrAgrupadaGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("GestionLaboratorio.CambioColorenHdrAgrupadaGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV10TFBarAgrNhdr = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV11TFBarAgrNhdr_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV12TFBarAgrSer = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV13TFBarAgrSer_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV14TFColNomAgr = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV15TFColNomAgr_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV16TFColNumAgr = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFColNumAgr_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARAGRNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarAgrNhdr = AV31SearchTxt ;
      AV11TFBarAgrNhdr_Sel = "" ;
      AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV10TFBarAgrNhdr ;
      AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV11TFBarAgrNhdr_Sel ;
      AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV12TFBarAgrSer ;
      AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV13TFBarAgrSer_Sel ;
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV14TFColNomAgr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV15TFColNomAgr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV16TFColNumAgr ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV17TFColNumAgr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                           AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                           AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                           AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                           AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                           AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                           Integer.valueOf(AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) ,
                                           Integer.valueOf(AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A1245BarAgrSer ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           AV37EmprCod ,
                                           Integer.valueOf(AV38barcod) ,
                                           Byte.valueOf(AV39barcodreo) ,
                                           AV40barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr), 11, "%") ;
      lV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = GXutil.padr( GXutil.rtrim( AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser), 16, "%") ;
      lV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr), 13, "%") ;
      /* Using cursor P0ADX2 */
      pr_default.execute(0, new Object[] {AV37EmprCod, Integer.valueOf(AV38barcod), Byte.valueOf(AV39barcodreo), AV40barcodpar, lV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr, AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel, lV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser, AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel, lV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr, AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel, Integer.valueOf(AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr), Integer.valueOf(AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0ADX2_A130BarCodPar[0] ;
         A132BarCodReo = P0ADX2_A132BarCodReo[0] ;
         A129BarCod = P0ADX2_A129BarCod[0] ;
         A396EmprCod = P0ADX2_A396EmprCod[0] ;
         A1512ColNumAgr = P0ADX2_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P0ADX2_A1510ColNomAgr[0] ;
         A1245BarAgrSer = P0ADX2_A1245BarAgrSer[0] ;
         A122BarAgrPar = P0ADX2_A122BarAgrPar[0] ;
         A124BarAgrReo = P0ADX2_A124BarAgrReo[0] ;
         A119BarAgrCod = P0ADX2_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         if ( ! (GXutil.strcmp("", A13792BarAgrNhdr)==0) )
         {
            AV19Option = A13792BarAgrNhdr ;
            AV18InsertIndex = 1 ;
            while ( ( AV18InsertIndex <= AV20Options.size() ) && ( GXutil.strcmp((String)AV20Options.elementAt(-1+AV18InsertIndex), AV19Option) < 0 ) )
            {
               AV18InsertIndex = (int)(AV18InsertIndex+1) ;
            }
            if ( ( AV18InsertIndex <= AV20Options.size() ) && ( GXutil.strcmp((String)AV20Options.elementAt(-1+AV18InsertIndex), AV19Option) == 0 ) )
            {
               AV24count = GXutil.lval( (String)AV23OptionIndexes.elementAt(-1+AV18InsertIndex)) ;
               AV24count = (long)(AV24count+1) ;
               AV23OptionIndexes.removeItem(AV18InsertIndex);
               AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), AV18InsertIndex);
            }
            else
            {
               AV20Options.add(AV19Option, AV18InsertIndex);
               AV23OptionIndexes.add("1", AV18InsertIndex);
            }
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARAGRSEROPTIONS' Routine */
      returnInSub = false ;
      AV12TFBarAgrSer = AV31SearchTxt ;
      AV13TFBarAgrSer_Sel = "" ;
      AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV10TFBarAgrNhdr ;
      AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV11TFBarAgrNhdr_Sel ;
      AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV12TFBarAgrSer ;
      AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV13TFBarAgrSer_Sel ;
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV14TFColNomAgr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV15TFColNomAgr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV16TFColNumAgr ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV17TFColNumAgr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                           AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                           AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                           AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                           AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                           AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                           Integer.valueOf(AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) ,
                                           Integer.valueOf(AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A1245BarAgrSer ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A396EmprCod ,
                                           AV37EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV38barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV39barcodreo) ,
                                           A130BarCodPar ,
                                           AV40barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr), 11, "%") ;
      lV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = GXutil.padr( GXutil.rtrim( AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser), 16, "%") ;
      lV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr), 13, "%") ;
      /* Using cursor P0ADX3 */
      pr_default.execute(1, new Object[] {AV37EmprCod, Integer.valueOf(AV38barcod), Byte.valueOf(AV39barcodreo), AV40barcodpar, lV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr, AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel, lV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser, AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel, lV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr, AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel, Integer.valueOf(AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr), Integer.valueOf(AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkADX3 = false ;
         A396EmprCod = P0ADX3_A396EmprCod[0] ;
         A129BarCod = P0ADX3_A129BarCod[0] ;
         A132BarCodReo = P0ADX3_A132BarCodReo[0] ;
         A130BarCodPar = P0ADX3_A130BarCodPar[0] ;
         A1245BarAgrSer = P0ADX3_A1245BarAgrSer[0] ;
         A1512ColNumAgr = P0ADX3_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P0ADX3_A1510ColNomAgr[0] ;
         A122BarAgrPar = P0ADX3_A122BarAgrPar[0] ;
         A124BarAgrReo = P0ADX3_A124BarAgrReo[0] ;
         A119BarAgrCod = P0ADX3_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ADX3_A1245BarAgrSer[0], A1245BarAgrSer) == 0 ) )
         {
            brkADX3 = false ;
            A396EmprCod = P0ADX3_A396EmprCod[0] ;
            A129BarCod = P0ADX3_A129BarCod[0] ;
            A132BarCodReo = P0ADX3_A132BarCodReo[0] ;
            A130BarCodPar = P0ADX3_A130BarCodPar[0] ;
            A122BarAgrPar = P0ADX3_A122BarAgrPar[0] ;
            A124BarAgrReo = P0ADX3_A124BarAgrReo[0] ;
            A119BarAgrCod = P0ADX3_A119BarAgrCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brkADX3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A1245BarAgrSer)==0) )
         {
            AV19Option = A1245BarAgrSer ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADX3 )
         {
            brkADX3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCOLNOMAGROPTIONS' Routine */
      returnInSub = false ;
      AV14TFColNomAgr = AV31SearchTxt ;
      AV15TFColNomAgr_Sel = "" ;
      AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV10TFBarAgrNhdr ;
      AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV11TFBarAgrNhdr_Sel ;
      AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV12TFBarAgrSer ;
      AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV13TFBarAgrSer_Sel ;
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV14TFColNomAgr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV15TFColNomAgr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV16TFColNumAgr ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV17TFColNumAgr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                           AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                           AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                           AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                           AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                           AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                           Integer.valueOf(AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) ,
                                           Integer.valueOf(AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A1245BarAgrSer ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A396EmprCod ,
                                           AV37EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV38barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV39barcodreo) ,
                                           A130BarCodPar ,
                                           AV40barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr), 11, "%") ;
      lV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = GXutil.padr( GXutil.rtrim( AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser), 16, "%") ;
      lV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr), 13, "%") ;
      /* Using cursor P0ADX4 */
      pr_default.execute(2, new Object[] {AV37EmprCod, Integer.valueOf(AV38barcod), Byte.valueOf(AV39barcodreo), AV40barcodpar, lV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr, AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel, lV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser, AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel, lV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr, AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel, Integer.valueOf(AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr), Integer.valueOf(AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkADX5 = false ;
         A396EmprCod = P0ADX4_A396EmprCod[0] ;
         A129BarCod = P0ADX4_A129BarCod[0] ;
         A132BarCodReo = P0ADX4_A132BarCodReo[0] ;
         A130BarCodPar = P0ADX4_A130BarCodPar[0] ;
         A1510ColNomAgr = P0ADX4_A1510ColNomAgr[0] ;
         A1512ColNumAgr = P0ADX4_A1512ColNumAgr[0] ;
         A1245BarAgrSer = P0ADX4_A1245BarAgrSer[0] ;
         A122BarAgrPar = P0ADX4_A122BarAgrPar[0] ;
         A124BarAgrReo = P0ADX4_A124BarAgrReo[0] ;
         A119BarAgrCod = P0ADX4_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ADX4_A1510ColNomAgr[0], A1510ColNomAgr) == 0 ) )
         {
            brkADX5 = false ;
            A396EmprCod = P0ADX4_A396EmprCod[0] ;
            A129BarCod = P0ADX4_A129BarCod[0] ;
            A132BarCodReo = P0ADX4_A132BarCodReo[0] ;
            A130BarCodPar = P0ADX4_A130BarCodPar[0] ;
            A122BarAgrPar = P0ADX4_A122BarAgrPar[0] ;
            A124BarAgrReo = P0ADX4_A124BarAgrReo[0] ;
            A119BarAgrCod = P0ADX4_A119BarAgrCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brkADX5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1510ColNomAgr)==0) )
         {
            AV19Option = A1510ColNomAgr ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADX5 )
         {
            brkADX5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cambiocolorenhdragrupadagetfilterdata.this.AV33OptionsJson;
      this.aP4[0] = cambiocolorenhdragrupadagetfilterdata.this.AV34OptionsDescJson;
      this.aP5[0] = cambiocolorenhdragrupadagetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33OptionsJson = "" ;
      AV34OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFBarAgrNhdr = "" ;
      AV11TFBarAgrNhdr_Sel = "" ;
      AV12TFBarAgrSer = "" ;
      AV13TFBarAgrSer_Sel = "" ;
      AV14TFColNomAgr = "" ;
      AV15TFColNomAgr_Sel = "" ;
      A13792BarAgrNhdr = "" ;
      AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = "" ;
      AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = "" ;
      AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = "" ;
      AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = "" ;
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = "" ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = "" ;
      scmdbuf = "" ;
      lV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = "" ;
      lV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = "" ;
      lV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = "" ;
      A122BarAgrPar = "" ;
      A1245BarAgrSer = "" ;
      A1510ColNomAgr = "" ;
      AV37EmprCod = "" ;
      AV40barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P0ADX2_A130BarCodPar = new String[] {""} ;
      P0ADX2_A132BarCodReo = new byte[1] ;
      P0ADX2_A129BarCod = new int[1] ;
      P0ADX2_A396EmprCod = new String[] {""} ;
      P0ADX2_A1512ColNumAgr = new int[1] ;
      P0ADX2_A1510ColNomAgr = new String[] {""} ;
      P0ADX2_A1245BarAgrSer = new String[] {""} ;
      P0ADX2_A122BarAgrPar = new String[] {""} ;
      P0ADX2_A124BarAgrReo = new byte[1] ;
      P0ADX2_A119BarAgrCod = new int[1] ;
      AV19Option = "" ;
      P0ADX3_A396EmprCod = new String[] {""} ;
      P0ADX3_A129BarCod = new int[1] ;
      P0ADX3_A132BarCodReo = new byte[1] ;
      P0ADX3_A130BarCodPar = new String[] {""} ;
      P0ADX3_A1245BarAgrSer = new String[] {""} ;
      P0ADX3_A1512ColNumAgr = new int[1] ;
      P0ADX3_A1510ColNomAgr = new String[] {""} ;
      P0ADX3_A122BarAgrPar = new String[] {""} ;
      P0ADX3_A124BarAgrReo = new byte[1] ;
      P0ADX3_A119BarAgrCod = new int[1] ;
      P0ADX4_A396EmprCod = new String[] {""} ;
      P0ADX4_A129BarCod = new int[1] ;
      P0ADX4_A132BarCodReo = new byte[1] ;
      P0ADX4_A130BarCodPar = new String[] {""} ;
      P0ADX4_A1510ColNomAgr = new String[] {""} ;
      P0ADX4_A1512ColNumAgr = new int[1] ;
      P0ADX4_A1245BarAgrSer = new String[] {""} ;
      P0ADX4_A122BarAgrPar = new String[] {""} ;
      P0ADX4_A124BarAgrReo = new byte[1] ;
      P0ADX4_A119BarAgrCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.cambiocolorenhdragrupadagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ADX2_A130BarCodPar, P0ADX2_A132BarCodReo, P0ADX2_A129BarCod, P0ADX2_A396EmprCod, P0ADX2_A1512ColNumAgr, P0ADX2_A1510ColNomAgr, P0ADX2_A1245BarAgrSer, P0ADX2_A122BarAgrPar, P0ADX2_A124BarAgrReo, P0ADX2_A119BarAgrCod
            }
            , new Object[] {
            P0ADX3_A396EmprCod, P0ADX3_A129BarCod, P0ADX3_A132BarCodReo, P0ADX3_A130BarCodPar, P0ADX3_A1245BarAgrSer, P0ADX3_A1512ColNumAgr, P0ADX3_A1510ColNomAgr, P0ADX3_A122BarAgrPar, P0ADX3_A124BarAgrReo, P0ADX3_A119BarAgrCod
            }
            , new Object[] {
            P0ADX4_A396EmprCod, P0ADX4_A129BarCod, P0ADX4_A132BarCodReo, P0ADX4_A130BarCodPar, P0ADX4_A1510ColNomAgr, P0ADX4_A1512ColNumAgr, P0ADX4_A1245BarAgrSer, P0ADX4_A122BarAgrPar, P0ADX4_A124BarAgrReo, P0ADX4_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private byte AV39barcodreo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV16TFColNumAgr ;
   private int AV17TFColNumAgr_To ;
   private int AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr ;
   private int AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to ;
   private int A119BarAgrCod ;
   private int A1512ColNumAgr ;
   private int AV38barcod ;
   private int A129BarCod ;
   private int AV18InsertIndex ;
   private long AV24count ;
   private String AV10TFBarAgrNhdr ;
   private String AV11TFBarAgrNhdr_Sel ;
   private String AV12TFBarAgrSer ;
   private String AV13TFBarAgrSer_Sel ;
   private String AV14TFColNomAgr ;
   private String AV15TFColNomAgr_Sel ;
   private String A13792BarAgrNhdr ;
   private String AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ;
   private String AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ;
   private String AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ;
   private String AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ;
   private String AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ;
   private String AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ;
   private String scmdbuf ;
   private String lV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ;
   private String lV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ;
   private String lV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ;
   private String A122BarAgrPar ;
   private String A1245BarAgrSer ;
   private String A1510ColNomAgr ;
   private String AV37EmprCod ;
   private String AV40barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brkADX3 ;
   private boolean brkADX5 ;
   private String AV33OptionsJson ;
   private String AV34OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV19Option ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADX2_A130BarCodPar ;
   private byte[] P0ADX2_A132BarCodReo ;
   private int[] P0ADX2_A129BarCod ;
   private String[] P0ADX2_A396EmprCod ;
   private int[] P0ADX2_A1512ColNumAgr ;
   private String[] P0ADX2_A1510ColNomAgr ;
   private String[] P0ADX2_A1245BarAgrSer ;
   private String[] P0ADX2_A122BarAgrPar ;
   private byte[] P0ADX2_A124BarAgrReo ;
   private int[] P0ADX2_A119BarAgrCod ;
   private String[] P0ADX3_A396EmprCod ;
   private int[] P0ADX3_A129BarCod ;
   private byte[] P0ADX3_A132BarCodReo ;
   private String[] P0ADX3_A130BarCodPar ;
   private String[] P0ADX3_A1245BarAgrSer ;
   private int[] P0ADX3_A1512ColNumAgr ;
   private String[] P0ADX3_A1510ColNomAgr ;
   private String[] P0ADX3_A122BarAgrPar ;
   private byte[] P0ADX3_A124BarAgrReo ;
   private int[] P0ADX3_A119BarAgrCod ;
   private String[] P0ADX4_A396EmprCod ;
   private int[] P0ADX4_A129BarCod ;
   private byte[] P0ADX4_A132BarCodReo ;
   private String[] P0ADX4_A130BarCodPar ;
   private String[] P0ADX4_A1510ColNomAgr ;
   private int[] P0ADX4_A1512ColNumAgr ;
   private String[] P0ADX4_A1245BarAgrSer ;
   private String[] P0ADX4_A122BarAgrPar ;
   private byte[] P0ADX4_A124BarAgrReo ;
   private int[] P0ADX4_A119BarAgrCod ;
   private GXSimpleCollection<String> AV20Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV23OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class cambiocolorenhdragrupadagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ADX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                          String AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                          String AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                          String AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                          String AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                          String AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                          int AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr ,
                                          int AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          String A1245BarAgrSer ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String AV37EmprCod ,
                                          int AV38barcod ,
                                          byte AV39barcodreo ,
                                          String AV40barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, ColNumAgr, ColNomAgr, BarAgrSer, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ADX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                          String AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                          String AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                          String AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                          String AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                          String AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                          int AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr ,
                                          int AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          String A1245BarAgrSer ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A396EmprCod ,
                                          String AV37EmprCod ,
                                          int A129BarCod ,
                                          int AV38barcod ,
                                          byte A132BarCodReo ,
                                          byte AV39barcodreo ,
                                          String A130BarCodPar ,
                                          String AV40barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrSer, ColNumAgr, ColNomAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarAgrSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ADX4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                          String AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                          String AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                          String AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                          String AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                          String AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                          int AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr ,
                                          int AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          String A1245BarAgrSer ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A396EmprCod ,
                                          String AV37EmprCod ,
                                          int A129BarCod ,
                                          int AV38barcod ,
                                          byte A132BarCodReo ,
                                          byte AV39barcodreo ,
                                          String A130BarCodPar ,
                                          String AV40barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ColNomAgr, ColNumAgr, BarAgrSer, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV45Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV47Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV49Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV52Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ColNomAgr" ;
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
                  return conditional_P0ADX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] );
            case 1 :
                  return conditional_P0ADX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 2 :
                  return conditional_P0ADX4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADX4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
      }
   }

}

