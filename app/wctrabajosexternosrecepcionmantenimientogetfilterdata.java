package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wctrabajosexternosrecepcionmantenimientogetfilterdata extends GXProcedure
{
   public wctrabajosexternosrecepcionmantenimientogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctrabajosexternosrecepcionmantenimientogetfilterdata.class ), "" );
   }

   public wctrabajosexternosrecepcionmantenimientogetfilterdata( int remoteHandle ,
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
      wctrabajosexternosrecepcionmantenimientogetfilterdata.this.aP5 = new String[] {""};
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
      wctrabajosexternosrecepcionmantenimientogetfilterdata.this.AV28DDOName = aP0;
      wctrabajosexternosrecepcionmantenimientogetfilterdata.this.AV26SearchTxt = aP1;
      wctrabajosexternosrecepcionmantenimientogetfilterdata.this.AV27SearchTxtTo = aP2;
      wctrabajosexternosrecepcionmantenimientogetfilterdata.this.aP3 = aP3;
      wctrabajosexternosrecepcionmantenimientogetfilterdata.this.aP4 = aP4;
      wctrabajosexternosrecepcionmantenimientogetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV39Session.getValue("WCTrabajosExternosRecepcionMantenimientoGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCTrabajosExternosRecepcionMantenimientoGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("WCTrabajosExternosRecepcionMantenimientoGridState"), null, null);
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDLI") == 0 )
         {
            AV14TFRpExHdLi = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFRpExHdLi_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDFE") == 0 )
         {
            AV12TFRpExHdFe = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDALB") == 0 )
         {
            AV10TFRpExHdAlb = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRpExHdAlb_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV20TFBarSer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV21TFBarSer_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV22TFBarSerDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV23TFBarSerDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV26SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV44FilterFullText ;
      AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV14TFRpExHdLi ;
      AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV15TFRpExHdLi_To ;
      AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV12TFRpExHdFe ;
      AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV10TFRpExHdAlb ;
      AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV11TFRpExHdAlb_To ;
      AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV16TFCliCod ;
      AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV17TFCliCod_To ;
      AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV18TFCliNom ;
      AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV19TFCliNom_Sel ;
      AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV20TFBarSer ;
      AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV22TFBarSerDsc ;
      AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                           Short.valueOf(AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) ,
                                           Short.valueOf(AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) ,
                                           AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                           Integer.valueOf(AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) ,
                                           Integer.valueOf(AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) ,
                                           Integer.valueOf(AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) ,
                                           Integer.valueOf(AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) ,
                                           AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                           AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                           AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                           AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                           AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                           AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                           Short.valueOf(A2713RpExHdLi) ,
                                           Integer.valueOf(A2714RpExHdAlb) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A2711RpExHdFe ,
                                           A396EmprCod ,
                                           AV45EmprCod ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(AV46Mancod) ,
                                           AV47RpExHdFe } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE
                                           }
      });
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = GXutil.padr( GXutil.rtrim( AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom), 30, "%") ;
      lV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = GXutil.padr( GXutil.rtrim( AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser), 16, "%") ;
      lV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc), 26, "%") ;
      /* Using cursor P091I2 */
      pr_default.execute(0, new Object[] {AV45EmprCod, Short.valueOf(AV46Mancod), AV47RpExHdFe, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, Short.valueOf(AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli), Short.valueOf(AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to), AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe, Integer.valueOf(AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb), Integer.valueOf(AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to), Integer.valueOf(AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod), Integer.valueOf(AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to), lV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom, AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel, lV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser, AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel, lV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc, AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk91I2 = false ;
         A129BarCod = P091I2_A129BarCod[0] ;
         A132BarCodReo = P091I2_A132BarCodReo[0] ;
         A130BarCodPar = P091I2_A130BarCodPar[0] ;
         A396EmprCod = P091I2_A396EmprCod[0] ;
         A2248ManCod = P091I2_A2248ManCod[0] ;
         A2711RpExHdFe = P091I2_A2711RpExHdFe[0] ;
         A279CliNom = P091I2_A279CliNom[0] ;
         A1652BarSerDsc = P091I2_A1652BarSerDsc[0] ;
         A212BarSer = P091I2_A212BarSer[0] ;
         A252CliCod = P091I2_A252CliCod[0] ;
         n252CliCod = P091I2_n252CliCod[0] ;
         A2714RpExHdAlb = P091I2_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P091I2_n2714RpExHdAlb[0] ;
         A2713RpExHdLi = P091I2_A2713RpExHdLi[0] ;
         A1652BarSerDsc = P091I2_A1652BarSerDsc[0] ;
         A212BarSer = P091I2_A212BarSer[0] ;
         A252CliCod = P091I2_A252CliCod[0] ;
         n252CliCod = P091I2_n252CliCod[0] ;
         A279CliNom = P091I2_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P091I2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk91I2 = false ;
            A129BarCod = P091I2_A129BarCod[0] ;
            A132BarCodReo = P091I2_A132BarCodReo[0] ;
            A130BarCodPar = P091I2_A130BarCodPar[0] ;
            A396EmprCod = P091I2_A396EmprCod[0] ;
            A2248ManCod = P091I2_A2248ManCod[0] ;
            A2711RpExHdFe = P091I2_A2711RpExHdFe[0] ;
            A252CliCod = P091I2_A252CliCod[0] ;
            n252CliCod = P091I2_n252CliCod[0] ;
            A2713RpExHdLi = P091I2_A2713RpExHdLi[0] ;
            A252CliCod = P091I2_A252CliCod[0] ;
            n252CliCod = P091I2_n252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk91I2 = true ;
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
         if ( ! brk91I2 )
         {
            brk91I2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarSer = AV26SearchTxt ;
      AV21TFBarSer_Sel = "" ;
      AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV44FilterFullText ;
      AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV14TFRpExHdLi ;
      AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV15TFRpExHdLi_To ;
      AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV12TFRpExHdFe ;
      AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV10TFRpExHdAlb ;
      AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV11TFRpExHdAlb_To ;
      AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV16TFCliCod ;
      AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV17TFCliCod_To ;
      AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV18TFCliNom ;
      AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV19TFCliNom_Sel ;
      AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV20TFBarSer ;
      AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV22TFBarSerDsc ;
      AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                           Short.valueOf(AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) ,
                                           Short.valueOf(AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) ,
                                           AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                           Integer.valueOf(AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) ,
                                           Integer.valueOf(AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) ,
                                           Integer.valueOf(AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) ,
                                           Integer.valueOf(AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) ,
                                           AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                           AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                           AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                           AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                           AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                           AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                           Short.valueOf(A2713RpExHdLi) ,
                                           Integer.valueOf(A2714RpExHdAlb) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A2711RpExHdFe ,
                                           A396EmprCod ,
                                           AV45EmprCod ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(AV46Mancod) ,
                                           AV47RpExHdFe } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE
                                           }
      });
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = GXutil.padr( GXutil.rtrim( AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom), 30, "%") ;
      lV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = GXutil.padr( GXutil.rtrim( AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser), 16, "%") ;
      lV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc), 26, "%") ;
      /* Using cursor P091I3 */
      pr_default.execute(1, new Object[] {AV45EmprCod, Short.valueOf(AV46Mancod), AV47RpExHdFe, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, Short.valueOf(AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli), Short.valueOf(AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to), AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe, Integer.valueOf(AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb), Integer.valueOf(AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to), Integer.valueOf(AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod), Integer.valueOf(AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to), lV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom, AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel, lV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser, AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel, lV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc, AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk91I4 = false ;
         A129BarCod = P091I3_A129BarCod[0] ;
         A132BarCodReo = P091I3_A132BarCodReo[0] ;
         A130BarCodPar = P091I3_A130BarCodPar[0] ;
         A396EmprCod = P091I3_A396EmprCod[0] ;
         A2248ManCod = P091I3_A2248ManCod[0] ;
         A2711RpExHdFe = P091I3_A2711RpExHdFe[0] ;
         A212BarSer = P091I3_A212BarSer[0] ;
         A1652BarSerDsc = P091I3_A1652BarSerDsc[0] ;
         A279CliNom = P091I3_A279CliNom[0] ;
         A252CliCod = P091I3_A252CliCod[0] ;
         n252CliCod = P091I3_n252CliCod[0] ;
         A2714RpExHdAlb = P091I3_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P091I3_n2714RpExHdAlb[0] ;
         A2713RpExHdLi = P091I3_A2713RpExHdLi[0] ;
         A212BarSer = P091I3_A212BarSer[0] ;
         A1652BarSerDsc = P091I3_A1652BarSerDsc[0] ;
         A252CliCod = P091I3_A252CliCod[0] ;
         n252CliCod = P091I3_n252CliCod[0] ;
         A279CliNom = P091I3_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P091I3_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk91I4 = false ;
            A129BarCod = P091I3_A129BarCod[0] ;
            A132BarCodReo = P091I3_A132BarCodReo[0] ;
            A130BarCodPar = P091I3_A130BarCodPar[0] ;
            A396EmprCod = P091I3_A396EmprCod[0] ;
            A2248ManCod = P091I3_A2248ManCod[0] ;
            A2711RpExHdFe = P091I3_A2711RpExHdFe[0] ;
            A2713RpExHdLi = P091I3_A2713RpExHdLi[0] ;
            AV38count = (long)(AV38count+1) ;
            brk91I4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV30Option = A212BarSer ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91I4 )
         {
            brk91I4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSerDsc = AV26SearchTxt ;
      AV23TFBarSerDsc_Sel = "" ;
      AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV44FilterFullText ;
      AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV14TFRpExHdLi ;
      AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV15TFRpExHdLi_To ;
      AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV12TFRpExHdFe ;
      AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV10TFRpExHdAlb ;
      AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV11TFRpExHdAlb_To ;
      AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV16TFCliCod ;
      AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV17TFCliCod_To ;
      AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV18TFCliNom ;
      AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV19TFCliNom_Sel ;
      AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV20TFBarSer ;
      AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV21TFBarSer_Sel ;
      AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV22TFBarSerDsc ;
      AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                           Short.valueOf(AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) ,
                                           Short.valueOf(AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) ,
                                           AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                           Integer.valueOf(AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) ,
                                           Integer.valueOf(AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) ,
                                           Integer.valueOf(AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) ,
                                           Integer.valueOf(AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) ,
                                           AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                           AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                           AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                           AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                           AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                           AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                           Short.valueOf(A2713RpExHdLi) ,
                                           Integer.valueOf(A2714RpExHdAlb) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A2711RpExHdFe ,
                                           A396EmprCod ,
                                           AV45EmprCod ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(AV46Mancod) ,
                                           AV47RpExHdFe } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE
                                           }
      });
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = GXutil.padr( GXutil.rtrim( AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom), 30, "%") ;
      lV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = GXutil.padr( GXutil.rtrim( AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser), 16, "%") ;
      lV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc), 26, "%") ;
      /* Using cursor P091I4 */
      pr_default.execute(2, new Object[] {AV45EmprCod, Short.valueOf(AV46Mancod), AV47RpExHdFe, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, Short.valueOf(AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli), Short.valueOf(AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to), AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe, Integer.valueOf(AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb), Integer.valueOf(AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to), Integer.valueOf(AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod), Integer.valueOf(AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to), lV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom, AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel, lV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser, AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel, lV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc, AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk91I6 = false ;
         A129BarCod = P091I4_A129BarCod[0] ;
         A132BarCodReo = P091I4_A132BarCodReo[0] ;
         A130BarCodPar = P091I4_A130BarCodPar[0] ;
         A396EmprCod = P091I4_A396EmprCod[0] ;
         A2248ManCod = P091I4_A2248ManCod[0] ;
         A2711RpExHdFe = P091I4_A2711RpExHdFe[0] ;
         A1652BarSerDsc = P091I4_A1652BarSerDsc[0] ;
         A212BarSer = P091I4_A212BarSer[0] ;
         A279CliNom = P091I4_A279CliNom[0] ;
         A252CliCod = P091I4_A252CliCod[0] ;
         n252CliCod = P091I4_n252CliCod[0] ;
         A2714RpExHdAlb = P091I4_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P091I4_n2714RpExHdAlb[0] ;
         A2713RpExHdLi = P091I4_A2713RpExHdLi[0] ;
         A1652BarSerDsc = P091I4_A1652BarSerDsc[0] ;
         A212BarSer = P091I4_A212BarSer[0] ;
         A252CliCod = P091I4_A252CliCod[0] ;
         n252CliCod = P091I4_n252CliCod[0] ;
         A279CliNom = P091I4_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P091I4_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk91I6 = false ;
            A129BarCod = P091I4_A129BarCod[0] ;
            A132BarCodReo = P091I4_A132BarCodReo[0] ;
            A130BarCodPar = P091I4_A130BarCodPar[0] ;
            A396EmprCod = P091I4_A396EmprCod[0] ;
            A2248ManCod = P091I4_A2248ManCod[0] ;
            A2711RpExHdFe = P091I4_A2711RpExHdFe[0] ;
            A2713RpExHdLi = P091I4_A2713RpExHdLi[0] ;
            AV38count = (long)(AV38count+1) ;
            brk91I6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV30Option = A1652BarSerDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91I6 )
         {
            brk91I6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wctrabajosexternosrecepcionmantenimientogetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = wctrabajosexternosrecepcionmantenimientogetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = wctrabajosexternosrecepcionmantenimientogetfilterdata.this.AV37OptionIndexesJson;
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
      AV12TFRpExHdFe = GXutil.nullDate() ;
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV20TFBarSer = "" ;
      AV21TFBarSer_Sel = "" ;
      AV22TFBarSerDsc = "" ;
      AV23TFBarSerDsc_Sel = "" ;
      A279CliNom = "" ;
      AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = "" ;
      AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = GXutil.nullDate() ;
      AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = "" ;
      AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = "" ;
      AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = "" ;
      AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = "" ;
      AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = "" ;
      AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = "" ;
      scmdbuf = "" ;
      lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = "" ;
      lV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = "" ;
      lV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = "" ;
      lV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV45EmprCod = "" ;
      AV47RpExHdFe = GXutil.nullDate() ;
      P091I2_A129BarCod = new int[1] ;
      P091I2_A132BarCodReo = new byte[1] ;
      P091I2_A130BarCodPar = new String[] {""} ;
      P091I2_A396EmprCod = new String[] {""} ;
      P091I2_A2248ManCod = new short[1] ;
      P091I2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091I2_A279CliNom = new String[] {""} ;
      P091I2_A1652BarSerDsc = new String[] {""} ;
      P091I2_A212BarSer = new String[] {""} ;
      P091I2_A252CliCod = new int[1] ;
      P091I2_n252CliCod = new boolean[] {false} ;
      P091I2_A2714RpExHdAlb = new int[1] ;
      P091I2_n2714RpExHdAlb = new boolean[] {false} ;
      P091I2_A2713RpExHdLi = new short[1] ;
      A130BarCodPar = "" ;
      AV30Option = "" ;
      P091I3_A129BarCod = new int[1] ;
      P091I3_A132BarCodReo = new byte[1] ;
      P091I3_A130BarCodPar = new String[] {""} ;
      P091I3_A396EmprCod = new String[] {""} ;
      P091I3_A2248ManCod = new short[1] ;
      P091I3_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091I3_A212BarSer = new String[] {""} ;
      P091I3_A1652BarSerDsc = new String[] {""} ;
      P091I3_A279CliNom = new String[] {""} ;
      P091I3_A252CliCod = new int[1] ;
      P091I3_n252CliCod = new boolean[] {false} ;
      P091I3_A2714RpExHdAlb = new int[1] ;
      P091I3_n2714RpExHdAlb = new boolean[] {false} ;
      P091I3_A2713RpExHdLi = new short[1] ;
      P091I4_A129BarCod = new int[1] ;
      P091I4_A132BarCodReo = new byte[1] ;
      P091I4_A130BarCodPar = new String[] {""} ;
      P091I4_A396EmprCod = new String[] {""} ;
      P091I4_A2248ManCod = new short[1] ;
      P091I4_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091I4_A1652BarSerDsc = new String[] {""} ;
      P091I4_A212BarSer = new String[] {""} ;
      P091I4_A279CliNom = new String[] {""} ;
      P091I4_A252CliCod = new int[1] ;
      P091I4_n252CliCod = new boolean[] {false} ;
      P091I4_A2714RpExHdAlb = new int[1] ;
      P091I4_n2714RpExHdAlb = new boolean[] {false} ;
      P091I4_A2713RpExHdLi = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctrabajosexternosrecepcionmantenimientogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P091I2_A129BarCod, P091I2_A132BarCodReo, P091I2_A130BarCodPar, P091I2_A396EmprCod, P091I2_A2248ManCod, P091I2_A2711RpExHdFe, P091I2_A279CliNom, P091I2_A1652BarSerDsc, P091I2_A212BarSer, P091I2_A252CliCod,
            P091I2_n252CliCod, P091I2_A2714RpExHdAlb, P091I2_n2714RpExHdAlb, P091I2_A2713RpExHdLi
            }
            , new Object[] {
            P091I3_A129BarCod, P091I3_A132BarCodReo, P091I3_A130BarCodPar, P091I3_A396EmprCod, P091I3_A2248ManCod, P091I3_A2711RpExHdFe, P091I3_A212BarSer, P091I3_A1652BarSerDsc, P091I3_A279CliNom, P091I3_A252CliCod,
            P091I3_n252CliCod, P091I3_A2714RpExHdAlb, P091I3_n2714RpExHdAlb, P091I3_A2713RpExHdLi
            }
            , new Object[] {
            P091I4_A129BarCod, P091I4_A132BarCodReo, P091I4_A130BarCodPar, P091I4_A396EmprCod, P091I4_A2248ManCod, P091I4_A2711RpExHdFe, P091I4_A1652BarSerDsc, P091I4_A212BarSer, P091I4_A279CliNom, P091I4_A252CliCod,
            P091I4_n252CliCod, P091I4_A2714RpExHdAlb, P091I4_n2714RpExHdAlb, P091I4_A2713RpExHdLi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV14TFRpExHdLi ;
   private short AV15TFRpExHdLi_To ;
   private short AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ;
   private short AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ;
   private short A2713RpExHdLi ;
   private short A2248ManCod ;
   private short AV46Mancod ;
   private short Gx_err ;
   private int AV74GXV1 ;
   private int AV10TFRpExHdAlb ;
   private int AV11TFRpExHdAlb_To ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ;
   private int AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ;
   private int AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ;
   private int AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ;
   private int A2714RpExHdAlb ;
   private int A252CliCod ;
   private int A129BarCod ;
   private long AV38count ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String AV20TFBarSer ;
   private String AV21TFBarSer_Sel ;
   private String AV22TFBarSerDsc ;
   private String AV23TFBarSerDsc_Sel ;
   private String A279CliNom ;
   private String AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ;
   private String AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ;
   private String AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ;
   private String AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ;
   private String AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ;
   private String AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ;
   private String scmdbuf ;
   private String lV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ;
   private String lV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ;
   private String lV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A396EmprCod ;
   private String AV45EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date AV12TFRpExHdFe ;
   private java.util.Date AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ;
   private java.util.Date A2711RpExHdFe ;
   private java.util.Date AV47RpExHdFe ;
   private boolean returnInSub ;
   private boolean brk91I2 ;
   private boolean n252CliCod ;
   private boolean n2714RpExHdAlb ;
   private boolean brk91I4 ;
   private boolean brk91I6 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ;
   private String lV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P091I2_A129BarCod ;
   private byte[] P091I2_A132BarCodReo ;
   private String[] P091I2_A130BarCodPar ;
   private String[] P091I2_A396EmprCod ;
   private short[] P091I2_A2248ManCod ;
   private java.util.Date[] P091I2_A2711RpExHdFe ;
   private String[] P091I2_A279CliNom ;
   private String[] P091I2_A1652BarSerDsc ;
   private String[] P091I2_A212BarSer ;
   private int[] P091I2_A252CliCod ;
   private boolean[] P091I2_n252CliCod ;
   private int[] P091I2_A2714RpExHdAlb ;
   private boolean[] P091I2_n2714RpExHdAlb ;
   private short[] P091I2_A2713RpExHdLi ;
   private int[] P091I3_A129BarCod ;
   private byte[] P091I3_A132BarCodReo ;
   private String[] P091I3_A130BarCodPar ;
   private String[] P091I3_A396EmprCod ;
   private short[] P091I3_A2248ManCod ;
   private java.util.Date[] P091I3_A2711RpExHdFe ;
   private String[] P091I3_A212BarSer ;
   private String[] P091I3_A1652BarSerDsc ;
   private String[] P091I3_A279CliNom ;
   private int[] P091I3_A252CliCod ;
   private boolean[] P091I3_n252CliCod ;
   private int[] P091I3_A2714RpExHdAlb ;
   private boolean[] P091I3_n2714RpExHdAlb ;
   private short[] P091I3_A2713RpExHdLi ;
   private int[] P091I4_A129BarCod ;
   private byte[] P091I4_A132BarCodReo ;
   private String[] P091I4_A130BarCodPar ;
   private String[] P091I4_A396EmprCod ;
   private short[] P091I4_A2248ManCod ;
   private java.util.Date[] P091I4_A2711RpExHdFe ;
   private String[] P091I4_A1652BarSerDsc ;
   private String[] P091I4_A212BarSer ;
   private String[] P091I4_A279CliNom ;
   private int[] P091I4_A252CliCod ;
   private boolean[] P091I4_n252CliCod ;
   private int[] P091I4_A2714RpExHdAlb ;
   private boolean[] P091I4_n2714RpExHdAlb ;
   private short[] P091I4_A2713RpExHdLi ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class wctrabajosexternosrecepcionmantenimientogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P091I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                          short AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ,
                                          short AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ,
                                          java.util.Date AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                          int AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ,
                                          int AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ,
                                          int AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ,
                                          int AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ,
                                          String AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                          String AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                          String AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                          String AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                          String AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                          String AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                          short A2713RpExHdLi ,
                                          int A2714RpExHdAlb ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.util.Date A2711RpExHdFe ,
                                          String A396EmprCod ,
                                          String AV45EmprCod ,
                                          short A2248ManCod ,
                                          short AV46Mancod ,
                                          java.util.Date AV47RpExHdFe )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.ManCod, T1.RpExHdFe, T3.CliNom, T2.BarSerDsc, T2.BarSer, T2.CliCod, T1.RpExHdAlb, T1.RpExHdLi FROM ((TXPLREXHD" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ManCod = ?)");
      addWhere(sWhereString, "(T1.RpExHdFe = ?)");
      if ( ! (GXutil.strcmp("", AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RpExHdLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RpExHdAlb,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe)) )
      {
         addWhere(sWhereString, "(T1.RpExHdFe >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P091I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                          short AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ,
                                          short AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ,
                                          java.util.Date AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                          int AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ,
                                          int AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ,
                                          int AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ,
                                          int AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ,
                                          String AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                          String AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                          String AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                          String AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                          String AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                          String AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                          short A2713RpExHdLi ,
                                          int A2714RpExHdAlb ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.util.Date A2711RpExHdFe ,
                                          String A396EmprCod ,
                                          String AV45EmprCod ,
                                          short A2248ManCod ,
                                          short AV46Mancod ,
                                          java.util.Date AV47RpExHdFe )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.ManCod, T1.RpExHdFe, T2.BarSer, T2.BarSerDsc, T3.CliNom, T2.CliCod, T1.RpExHdAlb, T1.RpExHdLi FROM ((TXPLREXHD" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ManCod = ?)");
      addWhere(sWhereString, "(T1.RpExHdFe = ?)");
      if ( ! (GXutil.strcmp("", AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RpExHdLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RpExHdAlb,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe)) )
      {
         addWhere(sWhereString, "(T1.RpExHdFe >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P091I4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                          short AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ,
                                          short AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ,
                                          java.util.Date AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                          int AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ,
                                          int AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ,
                                          int AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ,
                                          int AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ,
                                          String AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                          String AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                          String AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                          String AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                          String AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                          String AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                          short A2713RpExHdLi ,
                                          int A2714RpExHdAlb ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.util.Date A2711RpExHdFe ,
                                          String A396EmprCod ,
                                          String AV45EmprCod ,
                                          short A2248ManCod ,
                                          short AV46Mancod ,
                                          java.util.Date AV47RpExHdFe )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.ManCod, T1.RpExHdFe, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.RpExHdAlb, T1.RpExHdLi FROM ((TXPLREXHD" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ManCod = ?)");
      addWhere(sWhereString, "(T1.RpExHdFe = ?)");
      if ( ! (GXutil.strcmp("", AV76Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RpExHdLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RpExHdAlb,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe)) )
      {
         addWhere(sWhereString, "(T1.RpExHdFe >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV82Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV83Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctrabajosexternosrecepcionmantenimientods_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV86Wctrabajosexternosrecepcionmantenimientods_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV88Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
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
                  return conditional_P091I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (java.util.Date)dynConstraints[25] );
            case 1 :
                  return conditional_P091I3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (java.util.Date)dynConstraints[25] );
            case 2 :
                  return conditional_P091I4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (java.util.Date)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091I4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
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
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
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
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
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
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
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
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               return;
      }
   }

}

