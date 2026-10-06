package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidowwgetfilterdata extends GXProcedure
{
   public almacentejidowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidowwgetfilterdata.class ), "" );
   }

   public almacentejidowwgetfilterdata( int remoteHandle ,
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
      almacentejidowwgetfilterdata.this.aP5 = new String[] {""};
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
      almacentejidowwgetfilterdata.this.AV28DDOName = aP0;
      almacentejidowwgetfilterdata.this.AV26SearchTxt = aP1;
      almacentejidowwgetfilterdata.this.AV27SearchTxtTo = aP2;
      almacentejidowwgetfilterdata.this.aP3 = aP3;
      almacentejidowwgetfilterdata.this.aP4 = aP4;
      almacentejidowwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_ALBREFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFDSCOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV39Session.getValue("AlmacenSinDetalle.AlmacenTejidoWWGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.AlmacenTejidoWWGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("AlmacenSinDetalle.AlmacenTejidoWWGridState"), null, null);
      }
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV22TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            AV23TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV24TFAlbRef = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV25TFAlbRef_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV48TFAlbRefDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV49TFAlbRefDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV50TFAlbRPieEnt = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFAlbRPieEnt_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV52TFAlbRPieUti = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFAlbRPieUti_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV54TFAlbRPieDis = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFAlbRPieDis_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV56TFAlbRUni_SelsJson = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV57TFAlbRUni_Sels.fromJSonString(AV56TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV58TFAlbRUniEnt = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFAlbRUniEnt_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV60TFAlbRUniUti = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFAlbRUniUti_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV62TFAlbRUniDis = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFAlbRUniDis_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV26SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV73Almacensindetalle_almacentejidowwds_1_tfclinom = AV18TFCliNom ;
      AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV19TFCliNom_Sel ;
      AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV22TFAlbrHor ;
      AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV23TFAlbrHor_To ;
      AV77Almacensindetalle_almacentejidowwds_5_tfalbref = AV24TFAlbRef ;
      AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV48TFAlbRefDsc ;
      AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV49TFAlbRefDsc_Sel ;
      AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV50TFAlbRPieEnt ;
      AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV51TFAlbRPieEnt_To ;
      AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV54TFAlbRPieDis ;
      AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV55TFAlbRPieDis_To ;
      AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV57TFAlbRUni_Sels ;
      AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV58TFAlbRUniEnt ;
      AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV59TFAlbRUniEnt_To ;
      AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV60TFAlbRUniUti ;
      AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV61TFAlbRUniUti_To ;
      AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV62TFAlbRUniDis ;
      AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV63TFAlbRUniDis_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                           AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                           AV73Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                           AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                           AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                           AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                           AV77Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                           AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                           AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels.size()) ,
                                           AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                           AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                           AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                           AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                           AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                           AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                           Integer.valueOf(AV64AlbRecCod) ,
                                           AV65AlbRFenfrom ,
                                           AV66AlbRFento ,
                                           Integer.valueOf(AV67CliCod) ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV47VarAlbrEst) ,
                                           A396EmprCod ,
                                           AV68EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV73Almacensindetalle_almacentejidowwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV73Almacensindetalle_almacentejidowwds_1_tfclinom), 30, "%") ;
      lV77Almacensindetalle_almacentejidowwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV77Almacensindetalle_almacentejidowwds_5_tfalbref), 16, "%") ;
      lV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P09IZ2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV47VarAlbrEst), Byte.valueOf(AV47VarAlbrEst), AV68EmprCod, lV73Almacensindetalle_almacentejidowwds_1_tfclinom, AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel, AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor, AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to, lV77Almacensindetalle_almacentejidowwds_5_tfalbref, AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel, lV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc, AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel, Integer.valueOf(AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent), Integer.valueOf(AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to), Integer.valueOf(AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti), Integer.valueOf(AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to), Integer.valueOf(AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis), Integer.valueOf(AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to), AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient, AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to, AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti, AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to, AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis, AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to, Integer.valueOf(AV64AlbRecCod), AV65AlbRFenfrom, AV66AlbRFento, Integer.valueOf(AV67CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9IZ2 = false ;
         A396EmprCod = P09IZ2_A396EmprCod[0] ;
         A279CliNom = P09IZ2_A279CliNom[0] ;
         A47AlbREst = P09IZ2_A47AlbREst[0] ;
         A252CliCod = P09IZ2_A252CliCod[0] ;
         A49AlbRFen = P09IZ2_A49AlbRFen[0] ;
         A44AlbRecCod = P09IZ2_A44AlbRecCod[0] ;
         A56AlbRUni = P09IZ2_A56AlbRUni[0] ;
         A3613AlbRefDsc = P09IZ2_A3613AlbRefDsc[0] ;
         A45AlbRef = P09IZ2_A45AlbRef[0] ;
         A6179AlbrHor = P09IZ2_A6179AlbrHor[0] ;
         A54AlbRPieUti = P09IZ2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P09IZ2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P09IZ2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P09IZ2_A58AlbRUniEnt[0] ;
         A279CliNom = P09IZ2_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09IZ2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9IZ2 = false ;
            A396EmprCod = P09IZ2_A396EmprCod[0] ;
            A252CliCod = P09IZ2_A252CliCod[0] ;
            A44AlbRecCod = P09IZ2_A44AlbRecCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9IZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV30Option = A279CliNom ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9IZ2 )
         {
            brk9IZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV24TFAlbRef = AV26SearchTxt ;
      AV25TFAlbRef_Sel = "" ;
      AV73Almacensindetalle_almacentejidowwds_1_tfclinom = AV18TFCliNom ;
      AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV19TFCliNom_Sel ;
      AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV22TFAlbrHor ;
      AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV23TFAlbrHor_To ;
      AV77Almacensindetalle_almacentejidowwds_5_tfalbref = AV24TFAlbRef ;
      AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV48TFAlbRefDsc ;
      AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV49TFAlbRefDsc_Sel ;
      AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV50TFAlbRPieEnt ;
      AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV51TFAlbRPieEnt_To ;
      AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV54TFAlbRPieDis ;
      AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV55TFAlbRPieDis_To ;
      AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV57TFAlbRUni_Sels ;
      AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV58TFAlbRUniEnt ;
      AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV59TFAlbRUniEnt_To ;
      AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV60TFAlbRUniUti ;
      AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV61TFAlbRUniUti_To ;
      AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV62TFAlbRUniDis ;
      AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV63TFAlbRUniDis_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                           AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                           AV73Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                           AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                           AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                           AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                           AV77Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                           AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                           AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels.size()) ,
                                           AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                           AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                           AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                           AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                           AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                           AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                           Integer.valueOf(AV64AlbRecCod) ,
                                           AV65AlbRFenfrom ,
                                           AV66AlbRFento ,
                                           Integer.valueOf(AV67CliCod) ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV47VarAlbrEst) ,
                                           A396EmprCod ,
                                           AV68EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV73Almacensindetalle_almacentejidowwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV73Almacensindetalle_almacentejidowwds_1_tfclinom), 30, "%") ;
      lV77Almacensindetalle_almacentejidowwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV77Almacensindetalle_almacentejidowwds_5_tfalbref), 16, "%") ;
      lV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P09IZ3 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV47VarAlbrEst), Byte.valueOf(AV47VarAlbrEst), AV68EmprCod, lV73Almacensindetalle_almacentejidowwds_1_tfclinom, AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel, AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor, AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to, lV77Almacensindetalle_almacentejidowwds_5_tfalbref, AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel, lV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc, AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel, Integer.valueOf(AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent), Integer.valueOf(AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to), Integer.valueOf(AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti), Integer.valueOf(AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to), Integer.valueOf(AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis), Integer.valueOf(AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to), AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient, AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to, AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti, AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to, AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis, AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to, Integer.valueOf(AV64AlbRecCod), AV65AlbRFenfrom, AV66AlbRFento, Integer.valueOf(AV67CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9IZ4 = false ;
         A396EmprCod = P09IZ3_A396EmprCod[0] ;
         A45AlbRef = P09IZ3_A45AlbRef[0] ;
         A47AlbREst = P09IZ3_A47AlbREst[0] ;
         A252CliCod = P09IZ3_A252CliCod[0] ;
         A49AlbRFen = P09IZ3_A49AlbRFen[0] ;
         A44AlbRecCod = P09IZ3_A44AlbRecCod[0] ;
         A56AlbRUni = P09IZ3_A56AlbRUni[0] ;
         A3613AlbRefDsc = P09IZ3_A3613AlbRefDsc[0] ;
         A6179AlbrHor = P09IZ3_A6179AlbrHor[0] ;
         A279CliNom = P09IZ3_A279CliNom[0] ;
         A54AlbRPieUti = P09IZ3_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P09IZ3_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P09IZ3_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P09IZ3_A58AlbRUniEnt[0] ;
         A279CliNom = P09IZ3_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09IZ3_A45AlbRef[0], A45AlbRef) == 0 ) )
         {
            brk9IZ4 = false ;
            A396EmprCod = P09IZ3_A396EmprCod[0] ;
            A44AlbRecCod = P09IZ3_A44AlbRecCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9IZ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
         {
            AV30Option = A45AlbRef ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9IZ4 )
         {
            brk9IZ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV48TFAlbRefDsc = AV26SearchTxt ;
      AV49TFAlbRefDsc_Sel = "" ;
      AV73Almacensindetalle_almacentejidowwds_1_tfclinom = AV18TFCliNom ;
      AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV19TFCliNom_Sel ;
      AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV22TFAlbrHor ;
      AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV23TFAlbrHor_To ;
      AV77Almacensindetalle_almacentejidowwds_5_tfalbref = AV24TFAlbRef ;
      AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV48TFAlbRefDsc ;
      AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV49TFAlbRefDsc_Sel ;
      AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV50TFAlbRPieEnt ;
      AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV51TFAlbRPieEnt_To ;
      AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV52TFAlbRPieUti ;
      AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV53TFAlbRPieUti_To ;
      AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV54TFAlbRPieDis ;
      AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV55TFAlbRPieDis_To ;
      AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV57TFAlbRUni_Sels ;
      AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV58TFAlbRUniEnt ;
      AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV59TFAlbRUniEnt_To ;
      AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV60TFAlbRUniUti ;
      AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV61TFAlbRUniUti_To ;
      AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV62TFAlbRUniDis ;
      AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV63TFAlbRUniDis_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                           AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                           AV73Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                           AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                           AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                           AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                           AV77Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                           AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                           AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels.size()) ,
                                           AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                           AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                           AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                           AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                           AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                           AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                           Integer.valueOf(AV64AlbRecCod) ,
                                           AV65AlbRFenfrom ,
                                           AV66AlbRFento ,
                                           Integer.valueOf(AV67CliCod) ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV47VarAlbrEst) ,
                                           A396EmprCod ,
                                           AV68EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV73Almacensindetalle_almacentejidowwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV73Almacensindetalle_almacentejidowwds_1_tfclinom), 30, "%") ;
      lV77Almacensindetalle_almacentejidowwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV77Almacensindetalle_almacentejidowwds_5_tfalbref), 16, "%") ;
      lV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P09IZ4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV47VarAlbrEst), Byte.valueOf(AV47VarAlbrEst), AV68EmprCod, lV73Almacensindetalle_almacentejidowwds_1_tfclinom, AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel, AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor, AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to, lV77Almacensindetalle_almacentejidowwds_5_tfalbref, AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel, lV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc, AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel, Integer.valueOf(AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent), Integer.valueOf(AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to), Integer.valueOf(AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti), Integer.valueOf(AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to), Integer.valueOf(AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis), Integer.valueOf(AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to), AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient, AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to, AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti, AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to, AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis, AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to, Integer.valueOf(AV64AlbRecCod), AV65AlbRFenfrom, AV66AlbRFento, Integer.valueOf(AV67CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9IZ6 = false ;
         A396EmprCod = P09IZ4_A396EmprCod[0] ;
         A3613AlbRefDsc = P09IZ4_A3613AlbRefDsc[0] ;
         A47AlbREst = P09IZ4_A47AlbREst[0] ;
         A252CliCod = P09IZ4_A252CliCod[0] ;
         A49AlbRFen = P09IZ4_A49AlbRFen[0] ;
         A44AlbRecCod = P09IZ4_A44AlbRecCod[0] ;
         A56AlbRUni = P09IZ4_A56AlbRUni[0] ;
         A45AlbRef = P09IZ4_A45AlbRef[0] ;
         A6179AlbrHor = P09IZ4_A6179AlbrHor[0] ;
         A279CliNom = P09IZ4_A279CliNom[0] ;
         A54AlbRPieUti = P09IZ4_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P09IZ4_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P09IZ4_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P09IZ4_A58AlbRUniEnt[0] ;
         A279CliNom = P09IZ4_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09IZ4_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
         {
            brk9IZ6 = false ;
            A396EmprCod = P09IZ4_A396EmprCod[0] ;
            A44AlbRecCod = P09IZ4_A44AlbRecCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9IZ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
         {
            AV30Option = A3613AlbRefDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9IZ6 )
         {
            brk9IZ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = almacentejidowwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = almacentejidowwgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = almacentejidowwgetfilterdata.this.AV37OptionIndexesJson;
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
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV22TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV23TFAlbrHor_To = GXutil.resetTime( GXutil.nullDate() );
      AV24TFAlbRef = "" ;
      AV25TFAlbRef_Sel = "" ;
      AV48TFAlbRefDsc = "" ;
      AV49TFAlbRefDsc_Sel = "" ;
      AV56TFAlbRUni_SelsJson = "" ;
      AV57TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV59TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV60TFAlbRUniUti = DecimalUtil.ZERO ;
      AV61TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV62TFAlbRUniDis = DecimalUtil.ZERO ;
      AV63TFAlbRUniDis_To = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV73Almacensindetalle_almacentejidowwds_1_tfclinom = "" ;
      AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel = "" ;
      AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = GXutil.resetTime( GXutil.nullDate() );
      AV77Almacensindetalle_almacentejidowwds_5_tfalbref = "" ;
      AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel = "" ;
      AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = "" ;
      AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = "" ;
      AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient = DecimalUtil.ZERO ;
      AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = DecimalUtil.ZERO ;
      AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti = DecimalUtil.ZERO ;
      AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis = DecimalUtil.ZERO ;
      AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV73Almacensindetalle_almacentejidowwds_1_tfclinom = "" ;
      lV77Almacensindetalle_almacentejidowwds_5_tfalbref = "" ;
      lV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = "" ;
      A56AlbRUni = "" ;
      AV65AlbRFenfrom = GXutil.nullDate() ;
      AV66AlbRFento = GXutil.nullDate() ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A49AlbRFen = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV68EmprCod = "" ;
      P09IZ2_A396EmprCod = new String[] {""} ;
      P09IZ2_A279CliNom = new String[] {""} ;
      P09IZ2_A47AlbREst = new byte[1] ;
      P09IZ2_A252CliCod = new int[1] ;
      P09IZ2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P09IZ2_A44AlbRecCod = new int[1] ;
      P09IZ2_A56AlbRUni = new String[] {""} ;
      P09IZ2_A3613AlbRefDsc = new String[] {""} ;
      P09IZ2_A45AlbRef = new String[] {""} ;
      P09IZ2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P09IZ2_A54AlbRPieUti = new int[1] ;
      P09IZ2_A52AlbRPieEnt = new int[1] ;
      P09IZ2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IZ2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV30Option = "" ;
      P09IZ3_A396EmprCod = new String[] {""} ;
      P09IZ3_A45AlbRef = new String[] {""} ;
      P09IZ3_A47AlbREst = new byte[1] ;
      P09IZ3_A252CliCod = new int[1] ;
      P09IZ3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P09IZ3_A44AlbRecCod = new int[1] ;
      P09IZ3_A56AlbRUni = new String[] {""} ;
      P09IZ3_A3613AlbRefDsc = new String[] {""} ;
      P09IZ3_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P09IZ3_A279CliNom = new String[] {""} ;
      P09IZ3_A54AlbRPieUti = new int[1] ;
      P09IZ3_A52AlbRPieEnt = new int[1] ;
      P09IZ3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IZ3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IZ4_A396EmprCod = new String[] {""} ;
      P09IZ4_A3613AlbRefDsc = new String[] {""} ;
      P09IZ4_A47AlbREst = new byte[1] ;
      P09IZ4_A252CliCod = new int[1] ;
      P09IZ4_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P09IZ4_A44AlbRecCod = new int[1] ;
      P09IZ4_A56AlbRUni = new String[] {""} ;
      P09IZ4_A45AlbRef = new String[] {""} ;
      P09IZ4_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P09IZ4_A279CliNom = new String[] {""} ;
      P09IZ4_A54AlbRPieUti = new int[1] ;
      P09IZ4_A52AlbRPieEnt = new int[1] ;
      P09IZ4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IZ4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09IZ2_A396EmprCod, P09IZ2_A279CliNom, P09IZ2_A47AlbREst, P09IZ2_A252CliCod, P09IZ2_A49AlbRFen, P09IZ2_A44AlbRecCod, P09IZ2_A56AlbRUni, P09IZ2_A3613AlbRefDsc, P09IZ2_A45AlbRef, P09IZ2_A6179AlbrHor,
            P09IZ2_A54AlbRPieUti, P09IZ2_A52AlbRPieEnt, P09IZ2_A60AlbRUniUti, P09IZ2_A58AlbRUniEnt
            }
            , new Object[] {
            P09IZ3_A396EmprCod, P09IZ3_A45AlbRef, P09IZ3_A47AlbREst, P09IZ3_A252CliCod, P09IZ3_A49AlbRFen, P09IZ3_A44AlbRecCod, P09IZ3_A56AlbRUni, P09IZ3_A3613AlbRefDsc, P09IZ3_A6179AlbrHor, P09IZ3_A279CliNom,
            P09IZ3_A54AlbRPieUti, P09IZ3_A52AlbRPieEnt, P09IZ3_A60AlbRUniUti, P09IZ3_A58AlbRUniEnt
            }
            , new Object[] {
            P09IZ4_A396EmprCod, P09IZ4_A3613AlbRefDsc, P09IZ4_A47AlbREst, P09IZ4_A252CliCod, P09IZ4_A49AlbRFen, P09IZ4_A44AlbRecCod, P09IZ4_A56AlbRUni, P09IZ4_A45AlbRef, P09IZ4_A6179AlbrHor, P09IZ4_A279CliNom,
            P09IZ4_A54AlbRPieUti, P09IZ4_A52AlbRPieEnt, P09IZ4_A60AlbRUniUti, P09IZ4_A58AlbRUniEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private byte AV47VarAlbrEst ;
   private short Gx_err ;
   private int AV71GXV1 ;
   private int AV50TFAlbRPieEnt ;
   private int AV51TFAlbRPieEnt_To ;
   private int AV52TFAlbRPieUti ;
   private int AV53TFAlbRPieUti_To ;
   private int AV54TFAlbRPieDis ;
   private int AV55TFAlbRPieDis_To ;
   private int AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent ;
   private int AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ;
   private int AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ;
   private int AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ;
   private int AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ;
   private int AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ;
   private int AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ;
   private int AV64AlbRecCod ;
   private int AV67CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A51AlbRPieDis ;
   private long AV38count ;
   private java.math.BigDecimal AV58TFAlbRUniEnt ;
   private java.math.BigDecimal AV59TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV60TFAlbRUniUti ;
   private java.math.BigDecimal AV61TFAlbRUniUti_To ;
   private java.math.BigDecimal AV62TFAlbRUniDis ;
   private java.math.BigDecimal AV63TFAlbRUniDis_To ;
   private java.math.BigDecimal AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient ;
   private java.math.BigDecimal AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ;
   private java.math.BigDecimal AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti ;
   private java.math.BigDecimal AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ;
   private java.math.BigDecimal AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis ;
   private java.math.BigDecimal AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String AV24TFAlbRef ;
   private String AV25TFAlbRef_Sel ;
   private String AV48TFAlbRefDsc ;
   private String AV49TFAlbRefDsc_Sel ;
   private String A279CliNom ;
   private String AV73Almacensindetalle_almacentejidowwds_1_tfclinom ;
   private String AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel ;
   private String AV77Almacensindetalle_almacentejidowwds_5_tfalbref ;
   private String AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel ;
   private String AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ;
   private String AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV73Almacensindetalle_almacentejidowwds_1_tfclinom ;
   private String lV77Almacensindetalle_almacentejidowwds_5_tfalbref ;
   private String lV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ;
   private String A56AlbRUni ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A396EmprCod ;
   private String AV68EmprCod ;
   private java.util.Date AV22TFAlbrHor ;
   private java.util.Date AV23TFAlbrHor_To ;
   private java.util.Date AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor ;
   private java.util.Date AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV65AlbRFenfrom ;
   private java.util.Date AV66AlbRFento ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean brk9IZ2 ;
   private boolean brk9IZ4 ;
   private boolean brk9IZ6 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV56TFAlbRUni_SelsJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09IZ2_A396EmprCod ;
   private String[] P09IZ2_A279CliNom ;
   private byte[] P09IZ2_A47AlbREst ;
   private int[] P09IZ2_A252CliCod ;
   private java.util.Date[] P09IZ2_A49AlbRFen ;
   private int[] P09IZ2_A44AlbRecCod ;
   private String[] P09IZ2_A56AlbRUni ;
   private String[] P09IZ2_A3613AlbRefDsc ;
   private String[] P09IZ2_A45AlbRef ;
   private java.util.Date[] P09IZ2_A6179AlbrHor ;
   private int[] P09IZ2_A54AlbRPieUti ;
   private int[] P09IZ2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P09IZ2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P09IZ2_A58AlbRUniEnt ;
   private String[] P09IZ3_A396EmprCod ;
   private String[] P09IZ3_A45AlbRef ;
   private byte[] P09IZ3_A47AlbREst ;
   private int[] P09IZ3_A252CliCod ;
   private java.util.Date[] P09IZ3_A49AlbRFen ;
   private int[] P09IZ3_A44AlbRecCod ;
   private String[] P09IZ3_A56AlbRUni ;
   private String[] P09IZ3_A3613AlbRefDsc ;
   private java.util.Date[] P09IZ3_A6179AlbrHor ;
   private String[] P09IZ3_A279CliNom ;
   private int[] P09IZ3_A54AlbRPieUti ;
   private int[] P09IZ3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P09IZ3_A60AlbRUniUti ;
   private java.math.BigDecimal[] P09IZ3_A58AlbRUniEnt ;
   private String[] P09IZ4_A396EmprCod ;
   private String[] P09IZ4_A3613AlbRefDsc ;
   private byte[] P09IZ4_A47AlbREst ;
   private int[] P09IZ4_A252CliCod ;
   private java.util.Date[] P09IZ4_A49AlbRFen ;
   private int[] P09IZ4_A44AlbRecCod ;
   private String[] P09IZ4_A56AlbRUni ;
   private String[] P09IZ4_A45AlbRef ;
   private java.util.Date[] P09IZ4_A6179AlbrHor ;
   private String[] P09IZ4_A279CliNom ;
   private int[] P09IZ4_A54AlbRPieUti ;
   private int[] P09IZ4_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P09IZ4_A60AlbRUniUti ;
   private java.math.BigDecimal[] P09IZ4_A58AlbRUniEnt ;
   private GXSimpleCollection<String> AV57TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class almacentejidowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09IZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                          String AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                          String AV73Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                          java.util.Date AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                          java.util.Date AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                          String AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                          String AV77Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                          String AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                          String AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                          int AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent ,
                                          int AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ,
                                          int AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ,
                                          int AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ,
                                          int AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ,
                                          int AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ,
                                          int AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                          int AV64AlbRecCod ,
                                          java.util.Date AV65AlbRFenfrom ,
                                          java.util.Date AV66AlbRFento ,
                                          int AV67CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          byte A47AlbREst ,
                                          byte AV47VarAlbrEst ,
                                          String A396EmprCod ,
                                          String AV68EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.AlbREst, T1.CliCod, T1.AlbRFen, T1.AlbRecCod, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidowwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidowwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65AlbRFenfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbRFento)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV67CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09IZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                          String AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                          String AV73Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                          java.util.Date AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                          java.util.Date AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                          String AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                          String AV77Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                          String AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                          String AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                          int AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent ,
                                          int AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ,
                                          int AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ,
                                          int AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ,
                                          int AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ,
                                          int AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ,
                                          int AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                          int AV64AlbRecCod ,
                                          java.util.Date AV65AlbRFenfrom ,
                                          java.util.Date AV66AlbRFento ,
                                          int AV67CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          byte A47AlbREst ,
                                          byte AV47VarAlbrEst ,
                                          String A396EmprCod ,
                                          String AV68EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[27];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRef, T1.AlbREst, T1.CliCod, T1.AlbRFen, T1.AlbRecCod, T1.AlbRUni, T1.AlbRefDsc, T1.AlbrHor, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidowwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidowwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65AlbRFenfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbRFento)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV67CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRef" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09IZ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                          String AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                          String AV73Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                          java.util.Date AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                          java.util.Date AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                          String AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                          String AV77Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                          String AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                          String AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                          int AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent ,
                                          int AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ,
                                          int AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ,
                                          int AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ,
                                          int AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ,
                                          int AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ,
                                          int AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                          int AV64AlbRecCod ,
                                          java.util.Date AV65AlbRFenfrom ,
                                          java.util.Date AV66AlbRFento ,
                                          int AV67CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          byte A47AlbREst ,
                                          byte AV47VarAlbrEst ,
                                          String A396EmprCod ,
                                          String AV68EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRefDsc, T1.AlbREst, T1.CliCod, T1.AlbRFen, T1.AlbRecCod, T1.AlbRUni, T1.AlbRef, T1.AlbrHor, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Almacensindetalle_almacentejidowwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Almacensindetalle_almacentejidowwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Almacensindetalle_almacentejidowwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidowwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Almacensindetalle_almacentejidowwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Almacensindetalle_almacentejidowwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV83Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV84Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Almacensindetalle_almacentejidowwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Almacensindetalle_almacentejidowwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Almacensindetalle_almacentejidowwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Almacensindetalle_almacentejidowwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Almacensindetalle_almacentejidowwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65AlbRFenfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbRFento)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV67CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRefDsc" ;
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
                  return conditional_P09IZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 1 :
                  return conditional_P09IZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 2 :
                  return conditional_P09IZ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IZ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
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
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[32], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], true);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[32], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], true);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[32], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], true);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
      }
   }

}

