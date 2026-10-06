package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentocomercialv01wwgetfilterdata extends GXProcedure
{
   public documentocomercialv01wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentocomercialv01wwgetfilterdata.class ), "" );
   }

   public documentocomercialv01wwgetfilterdata( int remoteHandle ,
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
      documentocomercialv01wwgetfilterdata.this.aP5 = new String[] {""};
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
      documentocomercialv01wwgetfilterdata.this.AV34DDOName = aP0;
      documentocomercialv01wwgetfilterdata.this.AV32SearchTxt = aP1;
      documentocomercialv01wwgetfilterdata.this.AV33SearchTxtTo = aP2;
      documentocomercialv01wwgetfilterdata.this.aP3 = aP3;
      documentocomercialv01wwgetfilterdata.this.aP4 = aP4;
      documentocomercialv01wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_ALBCOMPRI") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMPRIOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_TRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTRNNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_ALBCOMMAT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMMATOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV38OptionsJson = AV37Options.toJSonString(false) ;
      AV41OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("DocumentoComercialv01WWGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoComercialv01WWGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("DocumentoComercialv01WWGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV10TFAlbComCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbComCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI") == 0 )
         {
            AV14TFAlbComPri = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV15TFAlbComPri_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV12TFAlbComFch = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMHOR") == 0 )
         {
            AV30TFAlbComHor = localUtil.ctot( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV20TFCliCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFCliCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV22TFCliNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV23TFCliNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV24TFTrnCod = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFTrnCod_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV26TFTrnNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV27TFTrnNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMAT") == 0 )
         {
            AV28TFAlbComMat = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMAT_SEL") == 0 )
         {
            AV29TFAlbComMat_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALCDOMENV") == 0 )
         {
            AV16TFAlcDomEnv = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFAlcDomEnv_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBCOMPRIOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbComPri = AV32SearchTxt ;
      AV15TFAlbComPri_Sel = "" ;
      AV55Documentocomercialv01wwds_1_filterfulltext = AV50FilterFullText ;
      AV56Documentocomercialv01wwds_2_tfalbcomcod = AV10TFAlbComCod ;
      AV57Documentocomercialv01wwds_3_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV58Documentocomercialv01wwds_4_tfalbcompri = AV14TFAlbComPri ;
      AV59Documentocomercialv01wwds_5_tfalbcompri_sel = AV15TFAlbComPri_Sel ;
      AV60Documentocomercialv01wwds_6_tfalbcomfch = AV12TFAlbComFch ;
      AV61Documentocomercialv01wwds_7_tfalbcomhor = AV30TFAlbComHor ;
      AV62Documentocomercialv01wwds_8_tfclicod = AV20TFCliCod ;
      AV63Documentocomercialv01wwds_9_tfclicod_to = AV21TFCliCod_To ;
      AV64Documentocomercialv01wwds_10_tfclinom = AV22TFCliNom ;
      AV65Documentocomercialv01wwds_11_tfclinom_sel = AV23TFCliNom_Sel ;
      AV66Documentocomercialv01wwds_12_tftrncod = AV24TFTrnCod ;
      AV67Documentocomercialv01wwds_13_tftrncod_to = AV25TFTrnCod_To ;
      AV68Documentocomercialv01wwds_14_tftrnnom = AV26TFTrnNom ;
      AV69Documentocomercialv01wwds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV70Documentocomercialv01wwds_16_tfalbcommat = AV28TFAlbComMat ;
      AV71Documentocomercialv01wwds_17_tfalbcommat_sel = AV29TFAlbComMat_Sel ;
      AV72Documentocomercialv01wwds_18_tfalcdomenv = AV16TFAlcDomEnv ;
      AV73Documentocomercialv01wwds_19_tfalcdomenv_to = AV17TFAlcDomEnv_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Documentocomercialv01wwds_1_filterfulltext ,
                                           Integer.valueOf(AV56Documentocomercialv01wwds_2_tfalbcomcod) ,
                                           Integer.valueOf(AV57Documentocomercialv01wwds_3_tfalbcomcod_to) ,
                                           AV59Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                           AV58Documentocomercialv01wwds_4_tfalbcompri ,
                                           AV60Documentocomercialv01wwds_6_tfalbcomfch ,
                                           AV61Documentocomercialv01wwds_7_tfalbcomhor ,
                                           Integer.valueOf(AV62Documentocomercialv01wwds_8_tfclicod) ,
                                           Integer.valueOf(AV63Documentocomercialv01wwds_9_tfclicod_to) ,
                                           AV65Documentocomercialv01wwds_11_tfclinom_sel ,
                                           AV64Documentocomercialv01wwds_10_tfclinom ,
                                           Short.valueOf(AV66Documentocomercialv01wwds_12_tftrncod) ,
                                           Short.valueOf(AV67Documentocomercialv01wwds_13_tftrncod_to) ,
                                           AV69Documentocomercialv01wwds_15_tftrnnom_sel ,
                                           AV68Documentocomercialv01wwds_14_tftrnnom ,
                                           AV71Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                           AV70Documentocomercialv01wwds_16_tfalbcommat ,
                                           Byte.valueOf(AV72Documentocomercialv01wwds_18_tfalcdomenv) ,
                                           Byte.valueOf(AV73Documentocomercialv01wwds_19_tfalcdomenv_to) ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A22AlbComPri ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A4830AlbComMat ,
                                           Byte.valueOf(A5142AlcDomEnv) ,
                                           A17AlbComFch ,
                                           A4829AlbComHor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE
                                           }
      });
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV58Documentocomercialv01wwds_4_tfalbcompri = GXutil.padr( GXutil.rtrim( AV58Documentocomercialv01wwds_4_tfalbcompri), 1, "%") ;
      lV64Documentocomercialv01wwds_10_tfclinom = GXutil.padr( GXutil.rtrim( AV64Documentocomercialv01wwds_10_tfclinom), 30, "%") ;
      lV68Documentocomercialv01wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV68Documentocomercialv01wwds_14_tftrnnom), 30, "%") ;
      lV70Documentocomercialv01wwds_16_tfalbcommat = GXutil.padr( GXutil.rtrim( AV70Documentocomercialv01wwds_16_tfalbcommat), 20, "%") ;
      /* Using cursor P090J2 */
      pr_default.execute(0, new Object[] {lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, Integer.valueOf(AV56Documentocomercialv01wwds_2_tfalbcomcod), Integer.valueOf(AV57Documentocomercialv01wwds_3_tfalbcomcod_to), lV58Documentocomercialv01wwds_4_tfalbcompri, AV59Documentocomercialv01wwds_5_tfalbcompri_sel, AV60Documentocomercialv01wwds_6_tfalbcomfch, AV61Documentocomercialv01wwds_7_tfalbcomhor, Integer.valueOf(AV62Documentocomercialv01wwds_8_tfclicod), Integer.valueOf(AV63Documentocomercialv01wwds_9_tfclicod_to), lV64Documentocomercialv01wwds_10_tfclinom, AV65Documentocomercialv01wwds_11_tfclinom_sel, Short.valueOf(AV66Documentocomercialv01wwds_12_tftrncod), Short.valueOf(AV67Documentocomercialv01wwds_13_tftrncod_to), lV68Documentocomercialv01wwds_14_tftrnnom, AV69Documentocomercialv01wwds_15_tftrnnom_sel, lV70Documentocomercialv01wwds_16_tfalbcommat, AV71Documentocomercialv01wwds_17_tfalbcommat_sel, Byte.valueOf(AV72Documentocomercialv01wwds_18_tfalcdomenv), Byte.valueOf(AV73Documentocomercialv01wwds_19_tfalcdomenv_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk90J2 = false ;
         A396EmprCod = P090J2_A396EmprCod[0] ;
         A22AlbComPri = P090J2_A22AlbComPri[0] ;
         A5142AlcDomEnv = P090J2_A5142AlcDomEnv[0] ;
         A4830AlbComMat = P090J2_A4830AlbComMat[0] ;
         A841TrnNom = P090J2_A841TrnNom[0] ;
         n841TrnNom = P090J2_n841TrnNom[0] ;
         A840TrnCod = P090J2_A840TrnCod[0] ;
         n840TrnCod = P090J2_n840TrnCod[0] ;
         A279CliNom = P090J2_A279CliNom[0] ;
         A252CliCod = P090J2_A252CliCod[0] ;
         A4829AlbComHor = P090J2_A4829AlbComHor[0] ;
         A17AlbComFch = P090J2_A17AlbComFch[0] ;
         A14AlbComCod = P090J2_A14AlbComCod[0] ;
         A841TrnNom = P090J2_A841TrnNom[0] ;
         n841TrnNom = P090J2_n841TrnNom[0] ;
         A279CliNom = P090J2_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P090J2_A22AlbComPri[0], A22AlbComPri) == 0 ) )
         {
            brk90J2 = false ;
            A396EmprCod = P090J2_A396EmprCod[0] ;
            A14AlbComCod = P090J2_A14AlbComCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk90J2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A22AlbComPri)==0) )
         {
            AV36Option = A22AlbComPri ;
            AV39OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A22AlbComPri, "9"))) ;
            AV37Options.add(AV36Option, 0);
            AV40OptionsDesc.add(AV39OptionDesc, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90J2 )
         {
            brk90J2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCliNom = AV32SearchTxt ;
      AV23TFCliNom_Sel = "" ;
      AV55Documentocomercialv01wwds_1_filterfulltext = AV50FilterFullText ;
      AV56Documentocomercialv01wwds_2_tfalbcomcod = AV10TFAlbComCod ;
      AV57Documentocomercialv01wwds_3_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV58Documentocomercialv01wwds_4_tfalbcompri = AV14TFAlbComPri ;
      AV59Documentocomercialv01wwds_5_tfalbcompri_sel = AV15TFAlbComPri_Sel ;
      AV60Documentocomercialv01wwds_6_tfalbcomfch = AV12TFAlbComFch ;
      AV61Documentocomercialv01wwds_7_tfalbcomhor = AV30TFAlbComHor ;
      AV62Documentocomercialv01wwds_8_tfclicod = AV20TFCliCod ;
      AV63Documentocomercialv01wwds_9_tfclicod_to = AV21TFCliCod_To ;
      AV64Documentocomercialv01wwds_10_tfclinom = AV22TFCliNom ;
      AV65Documentocomercialv01wwds_11_tfclinom_sel = AV23TFCliNom_Sel ;
      AV66Documentocomercialv01wwds_12_tftrncod = AV24TFTrnCod ;
      AV67Documentocomercialv01wwds_13_tftrncod_to = AV25TFTrnCod_To ;
      AV68Documentocomercialv01wwds_14_tftrnnom = AV26TFTrnNom ;
      AV69Documentocomercialv01wwds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV70Documentocomercialv01wwds_16_tfalbcommat = AV28TFAlbComMat ;
      AV71Documentocomercialv01wwds_17_tfalbcommat_sel = AV29TFAlbComMat_Sel ;
      AV72Documentocomercialv01wwds_18_tfalcdomenv = AV16TFAlcDomEnv ;
      AV73Documentocomercialv01wwds_19_tfalcdomenv_to = AV17TFAlcDomEnv_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Documentocomercialv01wwds_1_filterfulltext ,
                                           Integer.valueOf(AV56Documentocomercialv01wwds_2_tfalbcomcod) ,
                                           Integer.valueOf(AV57Documentocomercialv01wwds_3_tfalbcomcod_to) ,
                                           AV59Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                           AV58Documentocomercialv01wwds_4_tfalbcompri ,
                                           AV60Documentocomercialv01wwds_6_tfalbcomfch ,
                                           AV61Documentocomercialv01wwds_7_tfalbcomhor ,
                                           Integer.valueOf(AV62Documentocomercialv01wwds_8_tfclicod) ,
                                           Integer.valueOf(AV63Documentocomercialv01wwds_9_tfclicod_to) ,
                                           AV65Documentocomercialv01wwds_11_tfclinom_sel ,
                                           AV64Documentocomercialv01wwds_10_tfclinom ,
                                           Short.valueOf(AV66Documentocomercialv01wwds_12_tftrncod) ,
                                           Short.valueOf(AV67Documentocomercialv01wwds_13_tftrncod_to) ,
                                           AV69Documentocomercialv01wwds_15_tftrnnom_sel ,
                                           AV68Documentocomercialv01wwds_14_tftrnnom ,
                                           AV71Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                           AV70Documentocomercialv01wwds_16_tfalbcommat ,
                                           Byte.valueOf(AV72Documentocomercialv01wwds_18_tfalcdomenv) ,
                                           Byte.valueOf(AV73Documentocomercialv01wwds_19_tfalcdomenv_to) ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A22AlbComPri ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A4830AlbComMat ,
                                           Byte.valueOf(A5142AlcDomEnv) ,
                                           A17AlbComFch ,
                                           A4829AlbComHor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE
                                           }
      });
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV58Documentocomercialv01wwds_4_tfalbcompri = GXutil.padr( GXutil.rtrim( AV58Documentocomercialv01wwds_4_tfalbcompri), 1, "%") ;
      lV64Documentocomercialv01wwds_10_tfclinom = GXutil.padr( GXutil.rtrim( AV64Documentocomercialv01wwds_10_tfclinom), 30, "%") ;
      lV68Documentocomercialv01wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV68Documentocomercialv01wwds_14_tftrnnom), 30, "%") ;
      lV70Documentocomercialv01wwds_16_tfalbcommat = GXutil.padr( GXutil.rtrim( AV70Documentocomercialv01wwds_16_tfalbcommat), 20, "%") ;
      /* Using cursor P090J3 */
      pr_default.execute(1, new Object[] {lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, Integer.valueOf(AV56Documentocomercialv01wwds_2_tfalbcomcod), Integer.valueOf(AV57Documentocomercialv01wwds_3_tfalbcomcod_to), lV58Documentocomercialv01wwds_4_tfalbcompri, AV59Documentocomercialv01wwds_5_tfalbcompri_sel, AV60Documentocomercialv01wwds_6_tfalbcomfch, AV61Documentocomercialv01wwds_7_tfalbcomhor, Integer.valueOf(AV62Documentocomercialv01wwds_8_tfclicod), Integer.valueOf(AV63Documentocomercialv01wwds_9_tfclicod_to), lV64Documentocomercialv01wwds_10_tfclinom, AV65Documentocomercialv01wwds_11_tfclinom_sel, Short.valueOf(AV66Documentocomercialv01wwds_12_tftrncod), Short.valueOf(AV67Documentocomercialv01wwds_13_tftrncod_to), lV68Documentocomercialv01wwds_14_tftrnnom, AV69Documentocomercialv01wwds_15_tftrnnom_sel, lV70Documentocomercialv01wwds_16_tfalbcommat, AV71Documentocomercialv01wwds_17_tfalbcommat_sel, Byte.valueOf(AV72Documentocomercialv01wwds_18_tfalcdomenv), Byte.valueOf(AV73Documentocomercialv01wwds_19_tfalcdomenv_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk90J4 = false ;
         A396EmprCod = P090J3_A396EmprCod[0] ;
         A279CliNom = P090J3_A279CliNom[0] ;
         A5142AlcDomEnv = P090J3_A5142AlcDomEnv[0] ;
         A4830AlbComMat = P090J3_A4830AlbComMat[0] ;
         A841TrnNom = P090J3_A841TrnNom[0] ;
         n841TrnNom = P090J3_n841TrnNom[0] ;
         A840TrnCod = P090J3_A840TrnCod[0] ;
         n840TrnCod = P090J3_n840TrnCod[0] ;
         A252CliCod = P090J3_A252CliCod[0] ;
         A4829AlbComHor = P090J3_A4829AlbComHor[0] ;
         A17AlbComFch = P090J3_A17AlbComFch[0] ;
         A22AlbComPri = P090J3_A22AlbComPri[0] ;
         A14AlbComCod = P090J3_A14AlbComCod[0] ;
         A841TrnNom = P090J3_A841TrnNom[0] ;
         n841TrnNom = P090J3_n841TrnNom[0] ;
         A279CliNom = P090J3_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P090J3_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk90J4 = false ;
            A396EmprCod = P090J3_A396EmprCod[0] ;
            A252CliCod = P090J3_A252CliCod[0] ;
            A14AlbComCod = P090J3_A14AlbComCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk90J4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV36Option = A279CliNom ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90J4 )
         {
            brk90J4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFTrnNom = AV32SearchTxt ;
      AV27TFTrnNom_Sel = "" ;
      AV55Documentocomercialv01wwds_1_filterfulltext = AV50FilterFullText ;
      AV56Documentocomercialv01wwds_2_tfalbcomcod = AV10TFAlbComCod ;
      AV57Documentocomercialv01wwds_3_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV58Documentocomercialv01wwds_4_tfalbcompri = AV14TFAlbComPri ;
      AV59Documentocomercialv01wwds_5_tfalbcompri_sel = AV15TFAlbComPri_Sel ;
      AV60Documentocomercialv01wwds_6_tfalbcomfch = AV12TFAlbComFch ;
      AV61Documentocomercialv01wwds_7_tfalbcomhor = AV30TFAlbComHor ;
      AV62Documentocomercialv01wwds_8_tfclicod = AV20TFCliCod ;
      AV63Documentocomercialv01wwds_9_tfclicod_to = AV21TFCliCod_To ;
      AV64Documentocomercialv01wwds_10_tfclinom = AV22TFCliNom ;
      AV65Documentocomercialv01wwds_11_tfclinom_sel = AV23TFCliNom_Sel ;
      AV66Documentocomercialv01wwds_12_tftrncod = AV24TFTrnCod ;
      AV67Documentocomercialv01wwds_13_tftrncod_to = AV25TFTrnCod_To ;
      AV68Documentocomercialv01wwds_14_tftrnnom = AV26TFTrnNom ;
      AV69Documentocomercialv01wwds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV70Documentocomercialv01wwds_16_tfalbcommat = AV28TFAlbComMat ;
      AV71Documentocomercialv01wwds_17_tfalbcommat_sel = AV29TFAlbComMat_Sel ;
      AV72Documentocomercialv01wwds_18_tfalcdomenv = AV16TFAlcDomEnv ;
      AV73Documentocomercialv01wwds_19_tfalcdomenv_to = AV17TFAlcDomEnv_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV55Documentocomercialv01wwds_1_filterfulltext ,
                                           Integer.valueOf(AV56Documentocomercialv01wwds_2_tfalbcomcod) ,
                                           Integer.valueOf(AV57Documentocomercialv01wwds_3_tfalbcomcod_to) ,
                                           AV59Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                           AV58Documentocomercialv01wwds_4_tfalbcompri ,
                                           AV60Documentocomercialv01wwds_6_tfalbcomfch ,
                                           AV61Documentocomercialv01wwds_7_tfalbcomhor ,
                                           Integer.valueOf(AV62Documentocomercialv01wwds_8_tfclicod) ,
                                           Integer.valueOf(AV63Documentocomercialv01wwds_9_tfclicod_to) ,
                                           AV65Documentocomercialv01wwds_11_tfclinom_sel ,
                                           AV64Documentocomercialv01wwds_10_tfclinom ,
                                           Short.valueOf(AV66Documentocomercialv01wwds_12_tftrncod) ,
                                           Short.valueOf(AV67Documentocomercialv01wwds_13_tftrncod_to) ,
                                           AV69Documentocomercialv01wwds_15_tftrnnom_sel ,
                                           AV68Documentocomercialv01wwds_14_tftrnnom ,
                                           AV71Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                           AV70Documentocomercialv01wwds_16_tfalbcommat ,
                                           Byte.valueOf(AV72Documentocomercialv01wwds_18_tfalcdomenv) ,
                                           Byte.valueOf(AV73Documentocomercialv01wwds_19_tfalcdomenv_to) ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A22AlbComPri ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A4830AlbComMat ,
                                           Byte.valueOf(A5142AlcDomEnv) ,
                                           A17AlbComFch ,
                                           A4829AlbComHor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE
                                           }
      });
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV58Documentocomercialv01wwds_4_tfalbcompri = GXutil.padr( GXutil.rtrim( AV58Documentocomercialv01wwds_4_tfalbcompri), 1, "%") ;
      lV64Documentocomercialv01wwds_10_tfclinom = GXutil.padr( GXutil.rtrim( AV64Documentocomercialv01wwds_10_tfclinom), 30, "%") ;
      lV68Documentocomercialv01wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV68Documentocomercialv01wwds_14_tftrnnom), 30, "%") ;
      lV70Documentocomercialv01wwds_16_tfalbcommat = GXutil.padr( GXutil.rtrim( AV70Documentocomercialv01wwds_16_tfalbcommat), 20, "%") ;
      /* Using cursor P090J4 */
      pr_default.execute(2, new Object[] {lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, Integer.valueOf(AV56Documentocomercialv01wwds_2_tfalbcomcod), Integer.valueOf(AV57Documentocomercialv01wwds_3_tfalbcomcod_to), lV58Documentocomercialv01wwds_4_tfalbcompri, AV59Documentocomercialv01wwds_5_tfalbcompri_sel, AV60Documentocomercialv01wwds_6_tfalbcomfch, AV61Documentocomercialv01wwds_7_tfalbcomhor, Integer.valueOf(AV62Documentocomercialv01wwds_8_tfclicod), Integer.valueOf(AV63Documentocomercialv01wwds_9_tfclicod_to), lV64Documentocomercialv01wwds_10_tfclinom, AV65Documentocomercialv01wwds_11_tfclinom_sel, Short.valueOf(AV66Documentocomercialv01wwds_12_tftrncod), Short.valueOf(AV67Documentocomercialv01wwds_13_tftrncod_to), lV68Documentocomercialv01wwds_14_tftrnnom, AV69Documentocomercialv01wwds_15_tftrnnom_sel, lV70Documentocomercialv01wwds_16_tfalbcommat, AV71Documentocomercialv01wwds_17_tfalbcommat_sel, Byte.valueOf(AV72Documentocomercialv01wwds_18_tfalcdomenv), Byte.valueOf(AV73Documentocomercialv01wwds_19_tfalcdomenv_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk90J6 = false ;
         A840TrnCod = P090J4_A840TrnCod[0] ;
         n840TrnCod = P090J4_n840TrnCod[0] ;
         A396EmprCod = P090J4_A396EmprCod[0] ;
         A5142AlcDomEnv = P090J4_A5142AlcDomEnv[0] ;
         A4830AlbComMat = P090J4_A4830AlbComMat[0] ;
         A841TrnNom = P090J4_A841TrnNom[0] ;
         n841TrnNom = P090J4_n841TrnNom[0] ;
         A279CliNom = P090J4_A279CliNom[0] ;
         A252CliCod = P090J4_A252CliCod[0] ;
         A4829AlbComHor = P090J4_A4829AlbComHor[0] ;
         A17AlbComFch = P090J4_A17AlbComFch[0] ;
         A22AlbComPri = P090J4_A22AlbComPri[0] ;
         A14AlbComCod = P090J4_A14AlbComCod[0] ;
         A841TrnNom = P090J4_A841TrnNom[0] ;
         n841TrnNom = P090J4_n841TrnNom[0] ;
         A279CliNom = P090J4_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P090J4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P090J4_A840TrnCod[0] == A840TrnCod ) )
         {
            brk90J6 = false ;
            A14AlbComCod = P090J4_A14AlbComCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk90J6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
         {
            AV36Option = A841TrnNom ;
            AV35InsertIndex = 1 ;
            while ( ( AV35InsertIndex <= AV37Options.size() ) && ( GXutil.strcmp((String)AV37Options.elementAt(-1+AV35InsertIndex), AV36Option) < 0 ) )
            {
               AV35InsertIndex = (int)(AV35InsertIndex+1) ;
            }
            AV37Options.add(AV36Option, AV35InsertIndex);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), AV35InsertIndex);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90J6 )
         {
            brk90J6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBCOMMATOPTIONS' Routine */
      returnInSub = false ;
      AV28TFAlbComMat = AV32SearchTxt ;
      AV29TFAlbComMat_Sel = "" ;
      AV55Documentocomercialv01wwds_1_filterfulltext = AV50FilterFullText ;
      AV56Documentocomercialv01wwds_2_tfalbcomcod = AV10TFAlbComCod ;
      AV57Documentocomercialv01wwds_3_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV58Documentocomercialv01wwds_4_tfalbcompri = AV14TFAlbComPri ;
      AV59Documentocomercialv01wwds_5_tfalbcompri_sel = AV15TFAlbComPri_Sel ;
      AV60Documentocomercialv01wwds_6_tfalbcomfch = AV12TFAlbComFch ;
      AV61Documentocomercialv01wwds_7_tfalbcomhor = AV30TFAlbComHor ;
      AV62Documentocomercialv01wwds_8_tfclicod = AV20TFCliCod ;
      AV63Documentocomercialv01wwds_9_tfclicod_to = AV21TFCliCod_To ;
      AV64Documentocomercialv01wwds_10_tfclinom = AV22TFCliNom ;
      AV65Documentocomercialv01wwds_11_tfclinom_sel = AV23TFCliNom_Sel ;
      AV66Documentocomercialv01wwds_12_tftrncod = AV24TFTrnCod ;
      AV67Documentocomercialv01wwds_13_tftrncod_to = AV25TFTrnCod_To ;
      AV68Documentocomercialv01wwds_14_tftrnnom = AV26TFTrnNom ;
      AV69Documentocomercialv01wwds_15_tftrnnom_sel = AV27TFTrnNom_Sel ;
      AV70Documentocomercialv01wwds_16_tfalbcommat = AV28TFAlbComMat ;
      AV71Documentocomercialv01wwds_17_tfalbcommat_sel = AV29TFAlbComMat_Sel ;
      AV72Documentocomercialv01wwds_18_tfalcdomenv = AV16TFAlcDomEnv ;
      AV73Documentocomercialv01wwds_19_tfalcdomenv_to = AV17TFAlcDomEnv_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV55Documentocomercialv01wwds_1_filterfulltext ,
                                           Integer.valueOf(AV56Documentocomercialv01wwds_2_tfalbcomcod) ,
                                           Integer.valueOf(AV57Documentocomercialv01wwds_3_tfalbcomcod_to) ,
                                           AV59Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                           AV58Documentocomercialv01wwds_4_tfalbcompri ,
                                           AV60Documentocomercialv01wwds_6_tfalbcomfch ,
                                           AV61Documentocomercialv01wwds_7_tfalbcomhor ,
                                           Integer.valueOf(AV62Documentocomercialv01wwds_8_tfclicod) ,
                                           Integer.valueOf(AV63Documentocomercialv01wwds_9_tfclicod_to) ,
                                           AV65Documentocomercialv01wwds_11_tfclinom_sel ,
                                           AV64Documentocomercialv01wwds_10_tfclinom ,
                                           Short.valueOf(AV66Documentocomercialv01wwds_12_tftrncod) ,
                                           Short.valueOf(AV67Documentocomercialv01wwds_13_tftrncod_to) ,
                                           AV69Documentocomercialv01wwds_15_tftrnnom_sel ,
                                           AV68Documentocomercialv01wwds_14_tftrnnom ,
                                           AV71Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                           AV70Documentocomercialv01wwds_16_tfalbcommat ,
                                           Byte.valueOf(AV72Documentocomercialv01wwds_18_tfalcdomenv) ,
                                           Byte.valueOf(AV73Documentocomercialv01wwds_19_tfalcdomenv_to) ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A22AlbComPri ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A4830AlbComMat ,
                                           Byte.valueOf(A5142AlcDomEnv) ,
                                           A17AlbComFch ,
                                           A4829AlbComHor } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE
                                           }
      });
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV55Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV58Documentocomercialv01wwds_4_tfalbcompri = GXutil.padr( GXutil.rtrim( AV58Documentocomercialv01wwds_4_tfalbcompri), 1, "%") ;
      lV64Documentocomercialv01wwds_10_tfclinom = GXutil.padr( GXutil.rtrim( AV64Documentocomercialv01wwds_10_tfclinom), 30, "%") ;
      lV68Documentocomercialv01wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV68Documentocomercialv01wwds_14_tftrnnom), 30, "%") ;
      lV70Documentocomercialv01wwds_16_tfalbcommat = GXutil.padr( GXutil.rtrim( AV70Documentocomercialv01wwds_16_tfalbcommat), 20, "%") ;
      /* Using cursor P090J5 */
      pr_default.execute(3, new Object[] {lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, lV55Documentocomercialv01wwds_1_filterfulltext, Integer.valueOf(AV56Documentocomercialv01wwds_2_tfalbcomcod), Integer.valueOf(AV57Documentocomercialv01wwds_3_tfalbcomcod_to), lV58Documentocomercialv01wwds_4_tfalbcompri, AV59Documentocomercialv01wwds_5_tfalbcompri_sel, AV60Documentocomercialv01wwds_6_tfalbcomfch, AV61Documentocomercialv01wwds_7_tfalbcomhor, Integer.valueOf(AV62Documentocomercialv01wwds_8_tfclicod), Integer.valueOf(AV63Documentocomercialv01wwds_9_tfclicod_to), lV64Documentocomercialv01wwds_10_tfclinom, AV65Documentocomercialv01wwds_11_tfclinom_sel, Short.valueOf(AV66Documentocomercialv01wwds_12_tftrncod), Short.valueOf(AV67Documentocomercialv01wwds_13_tftrncod_to), lV68Documentocomercialv01wwds_14_tftrnnom, AV69Documentocomercialv01wwds_15_tftrnnom_sel, lV70Documentocomercialv01wwds_16_tfalbcommat, AV71Documentocomercialv01wwds_17_tfalbcommat_sel, Byte.valueOf(AV72Documentocomercialv01wwds_18_tfalcdomenv), Byte.valueOf(AV73Documentocomercialv01wwds_19_tfalcdomenv_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk90J8 = false ;
         A396EmprCod = P090J5_A396EmprCod[0] ;
         A4830AlbComMat = P090J5_A4830AlbComMat[0] ;
         A5142AlcDomEnv = P090J5_A5142AlcDomEnv[0] ;
         A841TrnNom = P090J5_A841TrnNom[0] ;
         n841TrnNom = P090J5_n841TrnNom[0] ;
         A840TrnCod = P090J5_A840TrnCod[0] ;
         n840TrnCod = P090J5_n840TrnCod[0] ;
         A279CliNom = P090J5_A279CliNom[0] ;
         A252CliCod = P090J5_A252CliCod[0] ;
         A4829AlbComHor = P090J5_A4829AlbComHor[0] ;
         A17AlbComFch = P090J5_A17AlbComFch[0] ;
         A22AlbComPri = P090J5_A22AlbComPri[0] ;
         A14AlbComCod = P090J5_A14AlbComCod[0] ;
         A841TrnNom = P090J5_A841TrnNom[0] ;
         n841TrnNom = P090J5_n841TrnNom[0] ;
         A279CliNom = P090J5_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P090J5_A4830AlbComMat[0], A4830AlbComMat) == 0 ) )
         {
            brk90J8 = false ;
            A396EmprCod = P090J5_A396EmprCod[0] ;
            A14AlbComCod = P090J5_A14AlbComCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk90J8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4830AlbComMat)==0) )
         {
            AV36Option = A4830AlbComMat ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90J8 )
         {
            brk90J8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentocomercialv01wwgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = documentocomercialv01wwgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = documentocomercialv01wwgetfilterdata.this.AV43OptionIndexesJson;
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
      AV41OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV14TFAlbComPri = "" ;
      AV15TFAlbComPri_Sel = "" ;
      AV12TFAlbComFch = GXutil.nullDate() ;
      AV30TFAlbComHor = GXutil.resetTime( GXutil.nullDate() );
      AV22TFCliNom = "" ;
      AV23TFCliNom_Sel = "" ;
      AV26TFTrnNom = "" ;
      AV27TFTrnNom_Sel = "" ;
      AV28TFAlbComMat = "" ;
      AV29TFAlbComMat_Sel = "" ;
      A22AlbComPri = "" ;
      AV55Documentocomercialv01wwds_1_filterfulltext = "" ;
      AV58Documentocomercialv01wwds_4_tfalbcompri = "" ;
      AV59Documentocomercialv01wwds_5_tfalbcompri_sel = "" ;
      AV60Documentocomercialv01wwds_6_tfalbcomfch = GXutil.nullDate() ;
      AV61Documentocomercialv01wwds_7_tfalbcomhor = GXutil.resetTime( GXutil.nullDate() );
      AV64Documentocomercialv01wwds_10_tfclinom = "" ;
      AV65Documentocomercialv01wwds_11_tfclinom_sel = "" ;
      AV68Documentocomercialv01wwds_14_tftrnnom = "" ;
      AV69Documentocomercialv01wwds_15_tftrnnom_sel = "" ;
      AV70Documentocomercialv01wwds_16_tfalbcommat = "" ;
      AV71Documentocomercialv01wwds_17_tfalbcommat_sel = "" ;
      scmdbuf = "" ;
      lV55Documentocomercialv01wwds_1_filterfulltext = "" ;
      lV58Documentocomercialv01wwds_4_tfalbcompri = "" ;
      lV64Documentocomercialv01wwds_10_tfclinom = "" ;
      lV68Documentocomercialv01wwds_14_tftrnnom = "" ;
      lV70Documentocomercialv01wwds_16_tfalbcommat = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A4830AlbComMat = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      P090J2_A396EmprCod = new String[] {""} ;
      P090J2_A22AlbComPri = new String[] {""} ;
      P090J2_A5142AlcDomEnv = new byte[1] ;
      P090J2_A4830AlbComMat = new String[] {""} ;
      P090J2_A841TrnNom = new String[] {""} ;
      P090J2_n841TrnNom = new boolean[] {false} ;
      P090J2_A840TrnCod = new short[1] ;
      P090J2_n840TrnCod = new boolean[] {false} ;
      P090J2_A279CliNom = new String[] {""} ;
      P090J2_A252CliCod = new int[1] ;
      P090J2_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090J2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090J2_A14AlbComCod = new int[1] ;
      A396EmprCod = "" ;
      AV36Option = "" ;
      AV39OptionDesc = "" ;
      P090J3_A396EmprCod = new String[] {""} ;
      P090J3_A279CliNom = new String[] {""} ;
      P090J3_A5142AlcDomEnv = new byte[1] ;
      P090J3_A4830AlbComMat = new String[] {""} ;
      P090J3_A841TrnNom = new String[] {""} ;
      P090J3_n841TrnNom = new boolean[] {false} ;
      P090J3_A840TrnCod = new short[1] ;
      P090J3_n840TrnCod = new boolean[] {false} ;
      P090J3_A252CliCod = new int[1] ;
      P090J3_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090J3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090J3_A22AlbComPri = new String[] {""} ;
      P090J3_A14AlbComCod = new int[1] ;
      P090J4_A840TrnCod = new short[1] ;
      P090J4_n840TrnCod = new boolean[] {false} ;
      P090J4_A396EmprCod = new String[] {""} ;
      P090J4_A5142AlcDomEnv = new byte[1] ;
      P090J4_A4830AlbComMat = new String[] {""} ;
      P090J4_A841TrnNom = new String[] {""} ;
      P090J4_n841TrnNom = new boolean[] {false} ;
      P090J4_A279CliNom = new String[] {""} ;
      P090J4_A252CliCod = new int[1] ;
      P090J4_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090J4_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090J4_A22AlbComPri = new String[] {""} ;
      P090J4_A14AlbComCod = new int[1] ;
      P090J5_A396EmprCod = new String[] {""} ;
      P090J5_A4830AlbComMat = new String[] {""} ;
      P090J5_A5142AlcDomEnv = new byte[1] ;
      P090J5_A841TrnNom = new String[] {""} ;
      P090J5_n841TrnNom = new boolean[] {false} ;
      P090J5_A840TrnCod = new short[1] ;
      P090J5_n840TrnCod = new boolean[] {false} ;
      P090J5_A279CliNom = new String[] {""} ;
      P090J5_A252CliCod = new int[1] ;
      P090J5_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090J5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090J5_A22AlbComPri = new String[] {""} ;
      P090J5_A14AlbComCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv01wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P090J2_A396EmprCod, P090J2_A22AlbComPri, P090J2_A5142AlcDomEnv, P090J2_A4830AlbComMat, P090J2_A841TrnNom, P090J2_n841TrnNom, P090J2_A840TrnCod, P090J2_n840TrnCod, P090J2_A279CliNom, P090J2_A252CliCod,
            P090J2_A4829AlbComHor, P090J2_A17AlbComFch, P090J2_A14AlbComCod
            }
            , new Object[] {
            P090J3_A396EmprCod, P090J3_A279CliNom, P090J3_A5142AlcDomEnv, P090J3_A4830AlbComMat, P090J3_A841TrnNom, P090J3_n841TrnNom, P090J3_A840TrnCod, P090J3_n840TrnCod, P090J3_A252CliCod, P090J3_A4829AlbComHor,
            P090J3_A17AlbComFch, P090J3_A22AlbComPri, P090J3_A14AlbComCod
            }
            , new Object[] {
            P090J4_A840TrnCod, P090J4_n840TrnCod, P090J4_A396EmprCod, P090J4_A5142AlcDomEnv, P090J4_A4830AlbComMat, P090J4_A841TrnNom, P090J4_n841TrnNom, P090J4_A279CliNom, P090J4_A252CliCod, P090J4_A4829AlbComHor,
            P090J4_A17AlbComFch, P090J4_A22AlbComPri, P090J4_A14AlbComCod
            }
            , new Object[] {
            P090J5_A396EmprCod, P090J5_A4830AlbComMat, P090J5_A5142AlcDomEnv, P090J5_A841TrnNom, P090J5_n841TrnNom, P090J5_A840TrnCod, P090J5_n840TrnCod, P090J5_A279CliNom, P090J5_A252CliCod, P090J5_A4829AlbComHor,
            P090J5_A17AlbComFch, P090J5_A22AlbComPri, P090J5_A14AlbComCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFAlcDomEnv ;
   private byte AV17TFAlcDomEnv_To ;
   private byte AV72Documentocomercialv01wwds_18_tfalcdomenv ;
   private byte AV73Documentocomercialv01wwds_19_tfalcdomenv_to ;
   private byte A5142AlcDomEnv ;
   private short AV24TFTrnCod ;
   private short AV25TFTrnCod_To ;
   private short AV66Documentocomercialv01wwds_12_tftrncod ;
   private short AV67Documentocomercialv01wwds_13_tftrncod_to ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV10TFAlbComCod ;
   private int AV11TFAlbComCod_To ;
   private int AV20TFCliCod ;
   private int AV21TFCliCod_To ;
   private int AV56Documentocomercialv01wwds_2_tfalbcomcod ;
   private int AV57Documentocomercialv01wwds_3_tfalbcomcod_to ;
   private int AV62Documentocomercialv01wwds_8_tfclicod ;
   private int AV63Documentocomercialv01wwds_9_tfclicod_to ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV35InsertIndex ;
   private long AV44count ;
   private String AV14TFAlbComPri ;
   private String AV15TFAlbComPri_Sel ;
   private String AV22TFCliNom ;
   private String AV23TFCliNom_Sel ;
   private String AV26TFTrnNom ;
   private String AV27TFTrnNom_Sel ;
   private String AV28TFAlbComMat ;
   private String AV29TFAlbComMat_Sel ;
   private String A22AlbComPri ;
   private String AV58Documentocomercialv01wwds_4_tfalbcompri ;
   private String AV59Documentocomercialv01wwds_5_tfalbcompri_sel ;
   private String AV64Documentocomercialv01wwds_10_tfclinom ;
   private String AV65Documentocomercialv01wwds_11_tfclinom_sel ;
   private String AV68Documentocomercialv01wwds_14_tftrnnom ;
   private String AV69Documentocomercialv01wwds_15_tftrnnom_sel ;
   private String AV70Documentocomercialv01wwds_16_tfalbcommat ;
   private String AV71Documentocomercialv01wwds_17_tfalbcommat_sel ;
   private String scmdbuf ;
   private String lV58Documentocomercialv01wwds_4_tfalbcompri ;
   private String lV64Documentocomercialv01wwds_10_tfclinom ;
   private String lV68Documentocomercialv01wwds_14_tftrnnom ;
   private String lV70Documentocomercialv01wwds_16_tfalbcommat ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A4830AlbComMat ;
   private String A396EmprCod ;
   private java.util.Date AV30TFAlbComHor ;
   private java.util.Date AV61Documentocomercialv01wwds_7_tfalbcomhor ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date AV12TFAlbComFch ;
   private java.util.Date AV60Documentocomercialv01wwds_6_tfalbcomfch ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean brk90J2 ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean brk90J4 ;
   private boolean brk90J6 ;
   private boolean brk90J8 ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV55Documentocomercialv01wwds_1_filterfulltext ;
   private String lV55Documentocomercialv01wwds_1_filterfulltext ;
   private String AV36Option ;
   private String AV39OptionDesc ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P090J2_A396EmprCod ;
   private String[] P090J2_A22AlbComPri ;
   private byte[] P090J2_A5142AlcDomEnv ;
   private String[] P090J2_A4830AlbComMat ;
   private String[] P090J2_A841TrnNom ;
   private boolean[] P090J2_n841TrnNom ;
   private short[] P090J2_A840TrnCod ;
   private boolean[] P090J2_n840TrnCod ;
   private String[] P090J2_A279CliNom ;
   private int[] P090J2_A252CliCod ;
   private java.util.Date[] P090J2_A4829AlbComHor ;
   private java.util.Date[] P090J2_A17AlbComFch ;
   private int[] P090J2_A14AlbComCod ;
   private String[] P090J3_A396EmprCod ;
   private String[] P090J3_A279CliNom ;
   private byte[] P090J3_A5142AlcDomEnv ;
   private String[] P090J3_A4830AlbComMat ;
   private String[] P090J3_A841TrnNom ;
   private boolean[] P090J3_n841TrnNom ;
   private short[] P090J3_A840TrnCod ;
   private boolean[] P090J3_n840TrnCod ;
   private int[] P090J3_A252CliCod ;
   private java.util.Date[] P090J3_A4829AlbComHor ;
   private java.util.Date[] P090J3_A17AlbComFch ;
   private String[] P090J3_A22AlbComPri ;
   private int[] P090J3_A14AlbComCod ;
   private short[] P090J4_A840TrnCod ;
   private boolean[] P090J4_n840TrnCod ;
   private String[] P090J4_A396EmprCod ;
   private byte[] P090J4_A5142AlcDomEnv ;
   private String[] P090J4_A4830AlbComMat ;
   private String[] P090J4_A841TrnNom ;
   private boolean[] P090J4_n841TrnNom ;
   private String[] P090J4_A279CliNom ;
   private int[] P090J4_A252CliCod ;
   private java.util.Date[] P090J4_A4829AlbComHor ;
   private java.util.Date[] P090J4_A17AlbComFch ;
   private String[] P090J4_A22AlbComPri ;
   private int[] P090J4_A14AlbComCod ;
   private String[] P090J5_A396EmprCod ;
   private String[] P090J5_A4830AlbComMat ;
   private byte[] P090J5_A5142AlcDomEnv ;
   private String[] P090J5_A841TrnNom ;
   private boolean[] P090J5_n841TrnNom ;
   private short[] P090J5_A840TrnCod ;
   private boolean[] P090J5_n840TrnCod ;
   private String[] P090J5_A279CliNom ;
   private int[] P090J5_A252CliCod ;
   private java.util.Date[] P090J5_A4829AlbComHor ;
   private java.util.Date[] P090J5_A17AlbComFch ;
   private String[] P090J5_A22AlbComPri ;
   private int[] P090J5_A14AlbComCod ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class documentocomercialv01wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Documentocomercialv01wwds_1_filterfulltext ,
                                          int AV56Documentocomercialv01wwds_2_tfalbcomcod ,
                                          int AV57Documentocomercialv01wwds_3_tfalbcomcod_to ,
                                          String AV59Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                          String AV58Documentocomercialv01wwds_4_tfalbcompri ,
                                          java.util.Date AV60Documentocomercialv01wwds_6_tfalbcomfch ,
                                          java.util.Date AV61Documentocomercialv01wwds_7_tfalbcomhor ,
                                          int AV62Documentocomercialv01wwds_8_tfclicod ,
                                          int AV63Documentocomercialv01wwds_9_tfclicod_to ,
                                          String AV65Documentocomercialv01wwds_11_tfclinom_sel ,
                                          String AV64Documentocomercialv01wwds_10_tfclinom ,
                                          short AV66Documentocomercialv01wwds_12_tftrncod ,
                                          short AV67Documentocomercialv01wwds_13_tftrncod_to ,
                                          String AV69Documentocomercialv01wwds_15_tftrnnom_sel ,
                                          String AV68Documentocomercialv01wwds_14_tftrnnom ,
                                          String AV71Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                          String AV70Documentocomercialv01wwds_16_tfalbcommat ,
                                          byte AV72Documentocomercialv01wwds_18_tfalcdomenv ,
                                          byte AV73Documentocomercialv01wwds_19_tfalcdomenv_to ,
                                          int A14AlbComCod ,
                                          String A22AlbComPri ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A4830AlbComMat ,
                                          byte A5142AlcDomEnv ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[26];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlcDomEnv, T1.AlbComMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.AlbComHor, T1.AlbComFch, T1.AlbComCod FROM ((TXPCALCOM" ;
      scmdbuf += " T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV55Documentocomercialv01wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlcDomEnv,'90'), 2) like '%' || ?))");
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
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Documentocomercialv01wwds_2_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Documentocomercialv01wwds_3_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Documentocomercialv01wwds_5_tfalbcompri_sel)==0) && ( ! (GXutil.strcmp("", AV58Documentocomercialv01wwds_4_tfalbcompri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Documentocomercialv01wwds_5_tfalbcompri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPri = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Documentocomercialv01wwds_6_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Documentocomercialv01wwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV62Documentocomercialv01wwds_8_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV63Documentocomercialv01wwds_9_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Documentocomercialv01wwds_11_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Documentocomercialv01wwds_10_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Documentocomercialv01wwds_11_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Documentocomercialv01wwds_12_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV67Documentocomercialv01wwds_13_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Documentocomercialv01wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentocomercialv01wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentocomercialv01wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Documentocomercialv01wwds_17_tfalbcommat_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentocomercialv01wwds_16_tfalbcommat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentocomercialv01wwds_17_tfalbcommat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComMat = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentocomercialv01wwds_18_tfalcdomenv) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentocomercialv01wwds_19_tfalcdomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComPri" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P090J3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Documentocomercialv01wwds_1_filterfulltext ,
                                          int AV56Documentocomercialv01wwds_2_tfalbcomcod ,
                                          int AV57Documentocomercialv01wwds_3_tfalbcomcod_to ,
                                          String AV59Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                          String AV58Documentocomercialv01wwds_4_tfalbcompri ,
                                          java.util.Date AV60Documentocomercialv01wwds_6_tfalbcomfch ,
                                          java.util.Date AV61Documentocomercialv01wwds_7_tfalbcomhor ,
                                          int AV62Documentocomercialv01wwds_8_tfclicod ,
                                          int AV63Documentocomercialv01wwds_9_tfclicod_to ,
                                          String AV65Documentocomercialv01wwds_11_tfclinom_sel ,
                                          String AV64Documentocomercialv01wwds_10_tfclinom ,
                                          short AV66Documentocomercialv01wwds_12_tftrncod ,
                                          short AV67Documentocomercialv01wwds_13_tftrncod_to ,
                                          String AV69Documentocomercialv01wwds_15_tftrnnom_sel ,
                                          String AV68Documentocomercialv01wwds_14_tftrnnom ,
                                          String AV71Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                          String AV70Documentocomercialv01wwds_16_tfalbcommat ,
                                          byte AV72Documentocomercialv01wwds_18_tfalcdomenv ,
                                          byte AV73Documentocomercialv01wwds_19_tfalcdomenv_to ,
                                          int A14AlbComCod ,
                                          String A22AlbComPri ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A4830AlbComMat ,
                                          byte A5142AlcDomEnv ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[26];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.AlcDomEnv, T1.AlbComMat, T2.TrnNom, T1.TrnCod, T1.CliCod, T1.AlbComHor, T1.AlbComFch, T1.AlbComPri, T1.AlbComCod FROM ((TXPCALCOM" ;
      scmdbuf += " T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV55Documentocomercialv01wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlcDomEnv,'90'), 2) like '%' || ?))");
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
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Documentocomercialv01wwds_2_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Documentocomercialv01wwds_3_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Documentocomercialv01wwds_5_tfalbcompri_sel)==0) && ( ! (GXutil.strcmp("", AV58Documentocomercialv01wwds_4_tfalbcompri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Documentocomercialv01wwds_5_tfalbcompri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPri = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Documentocomercialv01wwds_6_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Documentocomercialv01wwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV62Documentocomercialv01wwds_8_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV63Documentocomercialv01wwds_9_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Documentocomercialv01wwds_11_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Documentocomercialv01wwds_10_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Documentocomercialv01wwds_11_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Documentocomercialv01wwds_12_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV67Documentocomercialv01wwds_13_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Documentocomercialv01wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentocomercialv01wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentocomercialv01wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Documentocomercialv01wwds_17_tfalbcommat_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentocomercialv01wwds_16_tfalbcommat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentocomercialv01wwds_17_tfalbcommat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComMat = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentocomercialv01wwds_18_tfalcdomenv) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentocomercialv01wwds_19_tfalcdomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P090J4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Documentocomercialv01wwds_1_filterfulltext ,
                                          int AV56Documentocomercialv01wwds_2_tfalbcomcod ,
                                          int AV57Documentocomercialv01wwds_3_tfalbcomcod_to ,
                                          String AV59Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                          String AV58Documentocomercialv01wwds_4_tfalbcompri ,
                                          java.util.Date AV60Documentocomercialv01wwds_6_tfalbcomfch ,
                                          java.util.Date AV61Documentocomercialv01wwds_7_tfalbcomhor ,
                                          int AV62Documentocomercialv01wwds_8_tfclicod ,
                                          int AV63Documentocomercialv01wwds_9_tfclicod_to ,
                                          String AV65Documentocomercialv01wwds_11_tfclinom_sel ,
                                          String AV64Documentocomercialv01wwds_10_tfclinom ,
                                          short AV66Documentocomercialv01wwds_12_tftrncod ,
                                          short AV67Documentocomercialv01wwds_13_tftrncod_to ,
                                          String AV69Documentocomercialv01wwds_15_tftrnnom_sel ,
                                          String AV68Documentocomercialv01wwds_14_tftrnnom ,
                                          String AV71Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                          String AV70Documentocomercialv01wwds_16_tfalbcommat ,
                                          byte AV72Documentocomercialv01wwds_18_tfalcdomenv ,
                                          byte AV73Documentocomercialv01wwds_19_tfalcdomenv_to ,
                                          int A14AlbComCod ,
                                          String A22AlbComPri ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A4830AlbComMat ,
                                          byte A5142AlcDomEnv ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[26];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.EmprCod, T1.AlcDomEnv, T1.AlbComMat, T2.TrnNom, T3.CliNom, T1.CliCod, T1.AlbComHor, T1.AlbComFch, T1.AlbComPri, T1.AlbComCod FROM ((TXPCALCOM" ;
      scmdbuf += " T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV55Documentocomercialv01wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlcDomEnv,'90'), 2) like '%' || ?))");
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
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Documentocomercialv01wwds_2_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Documentocomercialv01wwds_3_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Documentocomercialv01wwds_5_tfalbcompri_sel)==0) && ( ! (GXutil.strcmp("", AV58Documentocomercialv01wwds_4_tfalbcompri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Documentocomercialv01wwds_5_tfalbcompri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPri = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Documentocomercialv01wwds_6_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Documentocomercialv01wwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV62Documentocomercialv01wwds_8_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV63Documentocomercialv01wwds_9_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Documentocomercialv01wwds_11_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Documentocomercialv01wwds_10_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Documentocomercialv01wwds_11_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Documentocomercialv01wwds_12_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV67Documentocomercialv01wwds_13_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Documentocomercialv01wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentocomercialv01wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentocomercialv01wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Documentocomercialv01wwds_17_tfalbcommat_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentocomercialv01wwds_16_tfalbcommat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentocomercialv01wwds_17_tfalbcommat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComMat = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentocomercialv01wwds_18_tfalcdomenv) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentocomercialv01wwds_19_tfalcdomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P090J5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Documentocomercialv01wwds_1_filterfulltext ,
                                          int AV56Documentocomercialv01wwds_2_tfalbcomcod ,
                                          int AV57Documentocomercialv01wwds_3_tfalbcomcod_to ,
                                          String AV59Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                          String AV58Documentocomercialv01wwds_4_tfalbcompri ,
                                          java.util.Date AV60Documentocomercialv01wwds_6_tfalbcomfch ,
                                          java.util.Date AV61Documentocomercialv01wwds_7_tfalbcomhor ,
                                          int AV62Documentocomercialv01wwds_8_tfclicod ,
                                          int AV63Documentocomercialv01wwds_9_tfclicod_to ,
                                          String AV65Documentocomercialv01wwds_11_tfclinom_sel ,
                                          String AV64Documentocomercialv01wwds_10_tfclinom ,
                                          short AV66Documentocomercialv01wwds_12_tftrncod ,
                                          short AV67Documentocomercialv01wwds_13_tftrncod_to ,
                                          String AV69Documentocomercialv01wwds_15_tftrnnom_sel ,
                                          String AV68Documentocomercialv01wwds_14_tftrnnom ,
                                          String AV71Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                          String AV70Documentocomercialv01wwds_16_tfalbcommat ,
                                          byte AV72Documentocomercialv01wwds_18_tfalcdomenv ,
                                          byte AV73Documentocomercialv01wwds_19_tfalcdomenv_to ,
                                          int A14AlbComCod ,
                                          String A22AlbComPri ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A4830AlbComMat ,
                                          byte A5142AlcDomEnv ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[26];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComMat, T1.AlcDomEnv, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.AlbComHor, T1.AlbComFch, T1.AlbComPri, T1.AlbComCod FROM ((TXPCALCOM" ;
      scmdbuf += " T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV55Documentocomercialv01wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlcDomEnv,'90'), 2) like '%' || ?))");
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
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Documentocomercialv01wwds_2_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Documentocomercialv01wwds_3_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Documentocomercialv01wwds_5_tfalbcompri_sel)==0) && ( ! (GXutil.strcmp("", AV58Documentocomercialv01wwds_4_tfalbcompri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Documentocomercialv01wwds_5_tfalbcompri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPri = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Documentocomercialv01wwds_6_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Documentocomercialv01wwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV62Documentocomercialv01wwds_8_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV63Documentocomercialv01wwds_9_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Documentocomercialv01wwds_11_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Documentocomercialv01wwds_10_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Documentocomercialv01wwds_11_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Documentocomercialv01wwds_12_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV67Documentocomercialv01wwds_13_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Documentocomercialv01wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentocomercialv01wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentocomercialv01wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Documentocomercialv01wwds_17_tfalbcommat_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentocomercialv01wwds_16_tfalbcommat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentocomercialv01wwds_17_tfalbcommat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComMat = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentocomercialv01wwds_18_tfalcdomenv) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentocomercialv01wwds_19_tfalcdomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComMat" ;
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
                  return conditional_P090J2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] );
            case 1 :
                  return conditional_P090J3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] );
            case 2 :
                  return conditional_P090J4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] );
            case 3 :
                  return conditional_P090J5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090J3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090J4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090J5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((int[]) buf[12])[0] = rslt.getInt(11);
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
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
      }
   }

}

