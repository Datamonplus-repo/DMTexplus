package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdoctrnwwgetfilterdata extends GXProcedure
{
   public tdoctrnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdoctrnwwgetfilterdata.class ), "" );
   }

   public tdoctrnwwgetfilterdata( int remoteHandle ,
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
      tdoctrnwwgetfilterdata.this.aP5 = new String[] {""};
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
      tdoctrnwwgetfilterdata.this.AV54DDOName = aP0;
      tdoctrnwwgetfilterdata.this.AV52SearchTxt = aP1;
      tdoctrnwwgetfilterdata.this.AV53SearchTxtTo = aP2;
      tdoctrnwwgetfilterdata.this.aP3 = aP3;
      tdoctrnwwgetfilterdata.this.aP4 = aP4;
      tdoctrnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV57Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV62OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_ALBCOMFD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMFDOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_ALBCOMFDD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMFDDOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV58OptionsJson = AV57Options.toJSonString(false) ;
      AV61OptionsDescJson = AV60OptionsDesc.toJSonString(false) ;
      AV63OptionIndexesJson = AV62OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV65Session.getValue("TDOCTRNWWGridState"), "") == 0 )
      {
         AV67GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDOCTRNWWGridState"), null, null);
      }
      else
      {
         AV67GridState.fromxml(AV65Session.getValue("TDOCTRNWWGridState"), null, null);
      }
      AV101GXV1 = 1 ;
      while ( AV101GXV1 <= AV67GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV68GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV67GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV101GXV1));
         if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV93AlbComPri = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV94AlbComFch = localUtil.ctod( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV95AlbComFch_To = localUtil.ctod( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV98FilterFullText = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV10TFAlbComCod = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbComCod_To = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV87TFAlbComPri_SelsJson = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV88TFAlbComPri_Sels.fromJSonString(AV87TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEST_SEL") == 0 )
         {
            AV91TFAlbComEst_SelsJson = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV92TFAlbComEst_Sels.fromJSonString(AV91TFAlbComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV12TFAlbComFch = localUtil.ctod( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD") == 0 )
         {
            AV44TFAlbComFd = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD_SEL") == 0 )
         {
            AV45TFAlbComFd_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV89TFAlbComFdD = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV90TFAlbComFdD_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFINDDOMENV") == 0 )
         {
            AV96TFfindDomEnv = (byte)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV97TFfindDomEnv_To = (byte)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV101GXV1 = (int)(AV101GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCliNom = AV52SearchTxt ;
      AV21TFCliNom_Sel = "" ;
      AV103Tdoctrnwwds_1_albcompri = AV93AlbComPri ;
      AV104Tdoctrnwwds_2_albcomfch = AV94AlbComFch ;
      AV105Tdoctrnwwds_3_albcomfch_to = AV95AlbComFch_To ;
      AV106Tdoctrnwwds_4_filterfulltext = AV98FilterFullText ;
      AV107Tdoctrnwwds_5_tfalbcomcod = AV10TFAlbComCod ;
      AV108Tdoctrnwwds_6_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV109Tdoctrnwwds_7_tfalbcompri_sels = AV88TFAlbComPri_Sels ;
      AV110Tdoctrnwwds_8_tfalbcomest_sels = AV92TFAlbComEst_Sels ;
      AV111Tdoctrnwwds_9_tfalbcomfch = AV12TFAlbComFch ;
      AV112Tdoctrnwwds_10_tfclicod = AV18TFCliCod ;
      AV113Tdoctrnwwds_11_tfclicod_to = AV19TFCliCod_To ;
      AV114Tdoctrnwwds_12_tfclinom = AV20TFCliNom ;
      AV115Tdoctrnwwds_13_tfclinom_sel = AV21TFCliNom_Sel ;
      AV116Tdoctrnwwds_14_tfalbcomfd = AV44TFAlbComFd ;
      AV117Tdoctrnwwds_15_tfalbcomfd_sel = AV45TFAlbComFd_Sel ;
      AV118Tdoctrnwwds_16_tfalbcomfdd = AV89TFAlbComFdD ;
      AV119Tdoctrnwwds_17_tfalbcomfdd_sel = AV90TFAlbComFdD_Sel ;
      AV120Tdoctrnwwds_18_tffinddomenv = AV96TFfindDomEnv ;
      AV121Tdoctrnwwds_19_tffinddomenv_to = AV97TFfindDomEnv_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV109Tdoctrnwwds_7_tfalbcompri_sels ,
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV110Tdoctrnwwds_8_tfalbcomest_sels ,
                                           AV104Tdoctrnwwds_2_albcomfch ,
                                           AV105Tdoctrnwwds_3_albcomfch_to ,
                                           Integer.valueOf(AV107Tdoctrnwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV108Tdoctrnwwds_6_tfalbcomcod_to) ,
                                           Integer.valueOf(AV109Tdoctrnwwds_7_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV110Tdoctrnwwds_8_tfalbcomest_sels.size()) ,
                                           AV111Tdoctrnwwds_9_tfalbcomfch ,
                                           Integer.valueOf(AV112Tdoctrnwwds_10_tfclicod) ,
                                           Integer.valueOf(AV113Tdoctrnwwds_11_tfclicod_to) ,
                                           AV115Tdoctrnwwds_13_tfclinom_sel ,
                                           AV114Tdoctrnwwds_12_tfclinom ,
                                           AV117Tdoctrnwwds_15_tfalbcomfd_sel ,
                                           AV116Tdoctrnwwds_14_tfalbcomfd ,
                                           AV119Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                           AV118Tdoctrnwwds_16_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           AV106Tdoctrnwwds_4_filterfulltext ,
                                           Byte.valueOf(A13739findDomEnv) ,
                                           Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv) ,
                                           Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to) ,
                                           AV103Tdoctrnwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV114Tdoctrnwwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV114Tdoctrnwwds_12_tfclinom), 30, "%") ;
      lV116Tdoctrnwwds_14_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV116Tdoctrnwwds_14_tfalbcomfd), 200, "%") ;
      lV118Tdoctrnwwds_16_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV118Tdoctrnwwds_16_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G02 */
      pr_default.execute(0, new Object[] {AV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to), Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to), AV103Tdoctrnwwds_1_albcompri, AV104Tdoctrnwwds_2_albcomfch, AV105Tdoctrnwwds_3_albcomfch_to, Integer.valueOf(AV107Tdoctrnwwds_5_tfalbcomcod), Integer.valueOf(AV108Tdoctrnwwds_6_tfalbcomcod_to), AV111Tdoctrnwwds_9_tfalbcomfch, Integer.valueOf(AV112Tdoctrnwwds_10_tfclicod), Integer.valueOf(AV113Tdoctrnwwds_11_tfclicod_to), lV114Tdoctrnwwds_12_tfclinom, AV115Tdoctrnwwds_13_tfclinom_sel, lV116Tdoctrnwwds_14_tfalbcomfd, AV117Tdoctrnwwds_15_tfalbcomfd_sel, lV118Tdoctrnwwds_16_tfalbcomfdd, AV119Tdoctrnwwds_17_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8G02 = false ;
         A396EmprCod = P08G02_A396EmprCod[0] ;
         A5142AlcDomEnv = P08G02_A5142AlcDomEnv[0] ;
         A22AlbComPri = P08G02_A22AlbComPri[0] ;
         A279CliNom = P08G02_A279CliNom[0] ;
         A10015AlbComFdD = P08G02_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G02_A10014AlbComFd[0] ;
         A252CliCod = P08G02_A252CliCod[0] ;
         A16AlbComEst = P08G02_A16AlbComEst[0] ;
         A14AlbComCod = P08G02_A14AlbComCod[0] ;
         A17AlbComFch = P08G02_A17AlbComFch[0] ;
         A13739findDomEnv = P08G02_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G02_n13739findDomEnv[0] ;
         A279CliNom = P08G02_A279CliNom[0] ;
         A13739findDomEnv = P08G02_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G02_n13739findDomEnv[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08G02_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8G02 = false ;
            A396EmprCod = P08G02_A396EmprCod[0] ;
            A252CliCod = P08G02_A252CliCod[0] ;
            A14AlbComCod = P08G02_A14AlbComCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk8G02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV56Option = A279CliNom ;
            AV57Options.add(AV56Option, 0);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8G02 )
         {
            brk8G02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBCOMFDOPTIONS' Routine */
      returnInSub = false ;
      AV44TFAlbComFd = AV52SearchTxt ;
      AV45TFAlbComFd_Sel = "" ;
      AV103Tdoctrnwwds_1_albcompri = AV93AlbComPri ;
      AV104Tdoctrnwwds_2_albcomfch = AV94AlbComFch ;
      AV105Tdoctrnwwds_3_albcomfch_to = AV95AlbComFch_To ;
      AV106Tdoctrnwwds_4_filterfulltext = AV98FilterFullText ;
      AV107Tdoctrnwwds_5_tfalbcomcod = AV10TFAlbComCod ;
      AV108Tdoctrnwwds_6_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV109Tdoctrnwwds_7_tfalbcompri_sels = AV88TFAlbComPri_Sels ;
      AV110Tdoctrnwwds_8_tfalbcomest_sels = AV92TFAlbComEst_Sels ;
      AV111Tdoctrnwwds_9_tfalbcomfch = AV12TFAlbComFch ;
      AV112Tdoctrnwwds_10_tfclicod = AV18TFCliCod ;
      AV113Tdoctrnwwds_11_tfclicod_to = AV19TFCliCod_To ;
      AV114Tdoctrnwwds_12_tfclinom = AV20TFCliNom ;
      AV115Tdoctrnwwds_13_tfclinom_sel = AV21TFCliNom_Sel ;
      AV116Tdoctrnwwds_14_tfalbcomfd = AV44TFAlbComFd ;
      AV117Tdoctrnwwds_15_tfalbcomfd_sel = AV45TFAlbComFd_Sel ;
      AV118Tdoctrnwwds_16_tfalbcomfdd = AV89TFAlbComFdD ;
      AV119Tdoctrnwwds_17_tfalbcomfdd_sel = AV90TFAlbComFdD_Sel ;
      AV120Tdoctrnwwds_18_tffinddomenv = AV96TFfindDomEnv ;
      AV121Tdoctrnwwds_19_tffinddomenv_to = AV97TFfindDomEnv_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV109Tdoctrnwwds_7_tfalbcompri_sels ,
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV110Tdoctrnwwds_8_tfalbcomest_sels ,
                                           AV104Tdoctrnwwds_2_albcomfch ,
                                           AV105Tdoctrnwwds_3_albcomfch_to ,
                                           Integer.valueOf(AV107Tdoctrnwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV108Tdoctrnwwds_6_tfalbcomcod_to) ,
                                           Integer.valueOf(AV109Tdoctrnwwds_7_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV110Tdoctrnwwds_8_tfalbcomest_sels.size()) ,
                                           AV111Tdoctrnwwds_9_tfalbcomfch ,
                                           Integer.valueOf(AV112Tdoctrnwwds_10_tfclicod) ,
                                           Integer.valueOf(AV113Tdoctrnwwds_11_tfclicod_to) ,
                                           AV115Tdoctrnwwds_13_tfclinom_sel ,
                                           AV114Tdoctrnwwds_12_tfclinom ,
                                           AV117Tdoctrnwwds_15_tfalbcomfd_sel ,
                                           AV116Tdoctrnwwds_14_tfalbcomfd ,
                                           AV119Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                           AV118Tdoctrnwwds_16_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           AV106Tdoctrnwwds_4_filterfulltext ,
                                           Byte.valueOf(A13739findDomEnv) ,
                                           Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv) ,
                                           Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to) ,
                                           AV103Tdoctrnwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV114Tdoctrnwwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV114Tdoctrnwwds_12_tfclinom), 30, "%") ;
      lV116Tdoctrnwwds_14_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV116Tdoctrnwwds_14_tfalbcomfd), 200, "%") ;
      lV118Tdoctrnwwds_16_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV118Tdoctrnwwds_16_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G03 */
      pr_default.execute(1, new Object[] {AV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to), Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to), AV103Tdoctrnwwds_1_albcompri, AV104Tdoctrnwwds_2_albcomfch, AV105Tdoctrnwwds_3_albcomfch_to, Integer.valueOf(AV107Tdoctrnwwds_5_tfalbcomcod), Integer.valueOf(AV108Tdoctrnwwds_6_tfalbcomcod_to), AV111Tdoctrnwwds_9_tfalbcomfch, Integer.valueOf(AV112Tdoctrnwwds_10_tfclicod), Integer.valueOf(AV113Tdoctrnwwds_11_tfclicod_to), lV114Tdoctrnwwds_12_tfclinom, AV115Tdoctrnwwds_13_tfclinom_sel, lV116Tdoctrnwwds_14_tfalbcomfd, AV117Tdoctrnwwds_15_tfalbcomfd_sel, lV118Tdoctrnwwds_16_tfalbcomfdd, AV119Tdoctrnwwds_17_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8G04 = false ;
         A396EmprCod = P08G03_A396EmprCod[0] ;
         A5142AlcDomEnv = P08G03_A5142AlcDomEnv[0] ;
         A22AlbComPri = P08G03_A22AlbComPri[0] ;
         A10014AlbComFd = P08G03_A10014AlbComFd[0] ;
         A10015AlbComFdD = P08G03_A10015AlbComFdD[0] ;
         A279CliNom = P08G03_A279CliNom[0] ;
         A252CliCod = P08G03_A252CliCod[0] ;
         A16AlbComEst = P08G03_A16AlbComEst[0] ;
         A14AlbComCod = P08G03_A14AlbComCod[0] ;
         A17AlbComFch = P08G03_A17AlbComFch[0] ;
         A13739findDomEnv = P08G03_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G03_n13739findDomEnv[0] ;
         A279CliNom = P08G03_A279CliNom[0] ;
         A13739findDomEnv = P08G03_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G03_n13739findDomEnv[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08G03_A10014AlbComFd[0], A10014AlbComFd) == 0 ) )
         {
            brk8G04 = false ;
            A396EmprCod = P08G03_A396EmprCod[0] ;
            A14AlbComCod = P08G03_A14AlbComCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk8G04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A10014AlbComFd)==0) )
         {
            AV56Option = A10014AlbComFd ;
            AV57Options.add(AV56Option, 0);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8G04 )
         {
            brk8G04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBCOMFDDOPTIONS' Routine */
      returnInSub = false ;
      AV89TFAlbComFdD = AV52SearchTxt ;
      AV90TFAlbComFdD_Sel = "" ;
      AV103Tdoctrnwwds_1_albcompri = AV93AlbComPri ;
      AV104Tdoctrnwwds_2_albcomfch = AV94AlbComFch ;
      AV105Tdoctrnwwds_3_albcomfch_to = AV95AlbComFch_To ;
      AV106Tdoctrnwwds_4_filterfulltext = AV98FilterFullText ;
      AV107Tdoctrnwwds_5_tfalbcomcod = AV10TFAlbComCod ;
      AV108Tdoctrnwwds_6_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV109Tdoctrnwwds_7_tfalbcompri_sels = AV88TFAlbComPri_Sels ;
      AV110Tdoctrnwwds_8_tfalbcomest_sels = AV92TFAlbComEst_Sels ;
      AV111Tdoctrnwwds_9_tfalbcomfch = AV12TFAlbComFch ;
      AV112Tdoctrnwwds_10_tfclicod = AV18TFCliCod ;
      AV113Tdoctrnwwds_11_tfclicod_to = AV19TFCliCod_To ;
      AV114Tdoctrnwwds_12_tfclinom = AV20TFCliNom ;
      AV115Tdoctrnwwds_13_tfclinom_sel = AV21TFCliNom_Sel ;
      AV116Tdoctrnwwds_14_tfalbcomfd = AV44TFAlbComFd ;
      AV117Tdoctrnwwds_15_tfalbcomfd_sel = AV45TFAlbComFd_Sel ;
      AV118Tdoctrnwwds_16_tfalbcomfdd = AV89TFAlbComFdD ;
      AV119Tdoctrnwwds_17_tfalbcomfdd_sel = AV90TFAlbComFdD_Sel ;
      AV120Tdoctrnwwds_18_tffinddomenv = AV96TFfindDomEnv ;
      AV121Tdoctrnwwds_19_tffinddomenv_to = AV97TFfindDomEnv_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV109Tdoctrnwwds_7_tfalbcompri_sels ,
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV110Tdoctrnwwds_8_tfalbcomest_sels ,
                                           AV104Tdoctrnwwds_2_albcomfch ,
                                           AV105Tdoctrnwwds_3_albcomfch_to ,
                                           Integer.valueOf(AV107Tdoctrnwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV108Tdoctrnwwds_6_tfalbcomcod_to) ,
                                           Integer.valueOf(AV109Tdoctrnwwds_7_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV110Tdoctrnwwds_8_tfalbcomest_sels.size()) ,
                                           AV111Tdoctrnwwds_9_tfalbcomfch ,
                                           Integer.valueOf(AV112Tdoctrnwwds_10_tfclicod) ,
                                           Integer.valueOf(AV113Tdoctrnwwds_11_tfclicod_to) ,
                                           AV115Tdoctrnwwds_13_tfclinom_sel ,
                                           AV114Tdoctrnwwds_12_tfclinom ,
                                           AV117Tdoctrnwwds_15_tfalbcomfd_sel ,
                                           AV116Tdoctrnwwds_14_tfalbcomfd ,
                                           AV119Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                           AV118Tdoctrnwwds_16_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           AV106Tdoctrnwwds_4_filterfulltext ,
                                           Byte.valueOf(A13739findDomEnv) ,
                                           Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv) ,
                                           Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to) ,
                                           AV103Tdoctrnwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV106Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV114Tdoctrnwwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV114Tdoctrnwwds_12_tfclinom), 30, "%") ;
      lV116Tdoctrnwwds_14_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV116Tdoctrnwwds_14_tfalbcomfd), 200, "%") ;
      lV118Tdoctrnwwds_16_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV118Tdoctrnwwds_16_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G04 */
      pr_default.execute(2, new Object[] {AV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, lV106Tdoctrnwwds_4_filterfulltext, Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV120Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to), Byte.valueOf(AV121Tdoctrnwwds_19_tffinddomenv_to), AV103Tdoctrnwwds_1_albcompri, AV104Tdoctrnwwds_2_albcomfch, AV105Tdoctrnwwds_3_albcomfch_to, Integer.valueOf(AV107Tdoctrnwwds_5_tfalbcomcod), Integer.valueOf(AV108Tdoctrnwwds_6_tfalbcomcod_to), AV111Tdoctrnwwds_9_tfalbcomfch, Integer.valueOf(AV112Tdoctrnwwds_10_tfclicod), Integer.valueOf(AV113Tdoctrnwwds_11_tfclicod_to), lV114Tdoctrnwwds_12_tfclinom, AV115Tdoctrnwwds_13_tfclinom_sel, lV116Tdoctrnwwds_14_tfalbcomfd, AV117Tdoctrnwwds_15_tfalbcomfd_sel, lV118Tdoctrnwwds_16_tfalbcomfdd, AV119Tdoctrnwwds_17_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8G06 = false ;
         A396EmprCod = P08G04_A396EmprCod[0] ;
         A5142AlcDomEnv = P08G04_A5142AlcDomEnv[0] ;
         A22AlbComPri = P08G04_A22AlbComPri[0] ;
         A10015AlbComFdD = P08G04_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G04_A10014AlbComFd[0] ;
         A279CliNom = P08G04_A279CliNom[0] ;
         A252CliCod = P08G04_A252CliCod[0] ;
         A16AlbComEst = P08G04_A16AlbComEst[0] ;
         A14AlbComCod = P08G04_A14AlbComCod[0] ;
         A17AlbComFch = P08G04_A17AlbComFch[0] ;
         A13739findDomEnv = P08G04_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G04_n13739findDomEnv[0] ;
         A279CliNom = P08G04_A279CliNom[0] ;
         A13739findDomEnv = P08G04_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G04_n13739findDomEnv[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08G04_A10015AlbComFdD[0], A10015AlbComFdD) == 0 ) )
         {
            brk8G06 = false ;
            A396EmprCod = P08G04_A396EmprCod[0] ;
            A14AlbComCod = P08G04_A14AlbComCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk8G06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A10015AlbComFdD)==0) )
         {
            AV56Option = A10015AlbComFdD ;
            AV57Options.add(AV56Option, 0);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8G06 )
         {
            brk8G06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tdoctrnwwgetfilterdata.this.AV58OptionsJson;
      this.aP4[0] = tdoctrnwwgetfilterdata.this.AV61OptionsDescJson;
      this.aP5[0] = tdoctrnwwgetfilterdata.this.AV63OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV58OptionsJson = "" ;
      AV61OptionsDescJson = "" ;
      AV63OptionIndexesJson = "" ;
      AV57Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV65Session = httpContext.getWebSession();
      AV67GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV68GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV93AlbComPri = "" ;
      AV94AlbComFch = GXutil.nullDate() ;
      AV95AlbComFch_To = GXutil.nullDate() ;
      AV98FilterFullText = "" ;
      AV87TFAlbComPri_SelsJson = "" ;
      AV88TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV91TFAlbComEst_SelsJson = "" ;
      AV92TFAlbComEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV12TFAlbComFch = GXutil.nullDate() ;
      AV20TFCliNom = "" ;
      AV21TFCliNom_Sel = "" ;
      AV44TFAlbComFd = "" ;
      AV45TFAlbComFd_Sel = "" ;
      AV89TFAlbComFdD = "" ;
      AV90TFAlbComFdD_Sel = "" ;
      A279CliNom = "" ;
      AV103Tdoctrnwwds_1_albcompri = "" ;
      AV104Tdoctrnwwds_2_albcomfch = GXutil.nullDate() ;
      AV105Tdoctrnwwds_3_albcomfch_to = GXutil.nullDate() ;
      AV106Tdoctrnwwds_4_filterfulltext = "" ;
      AV109Tdoctrnwwds_7_tfalbcompri_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV110Tdoctrnwwds_8_tfalbcomest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV111Tdoctrnwwds_9_tfalbcomfch = GXutil.nullDate() ;
      AV114Tdoctrnwwds_12_tfclinom = "" ;
      AV115Tdoctrnwwds_13_tfclinom_sel = "" ;
      AV116Tdoctrnwwds_14_tfalbcomfd = "" ;
      AV117Tdoctrnwwds_15_tfalbcomfd_sel = "" ;
      AV118Tdoctrnwwds_16_tfalbcomfdd = "" ;
      AV119Tdoctrnwwds_17_tfalbcomfdd_sel = "" ;
      lV106Tdoctrnwwds_4_filterfulltext = "" ;
      scmdbuf = "" ;
      lV114Tdoctrnwwds_12_tfclinom = "" ;
      lV116Tdoctrnwwds_14_tfalbcomfd = "" ;
      lV118Tdoctrnwwds_16_tfalbcomfdd = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      P08G02_A266CliEnvLin = new byte[1] ;
      P08G02_A396EmprCod = new String[] {""} ;
      P08G02_A5142AlcDomEnv = new byte[1] ;
      P08G02_A22AlbComPri = new String[] {""} ;
      P08G02_A279CliNom = new String[] {""} ;
      P08G02_A10015AlbComFdD = new String[] {""} ;
      P08G02_A10014AlbComFd = new String[] {""} ;
      P08G02_A252CliCod = new int[1] ;
      P08G02_A16AlbComEst = new byte[1] ;
      P08G02_A14AlbComCod = new int[1] ;
      P08G02_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G02_A13739findDomEnv = new byte[1] ;
      P08G02_n13739findDomEnv = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV56Option = "" ;
      P08G03_A266CliEnvLin = new byte[1] ;
      P08G03_A396EmprCod = new String[] {""} ;
      P08G03_A5142AlcDomEnv = new byte[1] ;
      P08G03_A22AlbComPri = new String[] {""} ;
      P08G03_A10014AlbComFd = new String[] {""} ;
      P08G03_A10015AlbComFdD = new String[] {""} ;
      P08G03_A279CliNom = new String[] {""} ;
      P08G03_A252CliCod = new int[1] ;
      P08G03_A16AlbComEst = new byte[1] ;
      P08G03_A14AlbComCod = new int[1] ;
      P08G03_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G03_A13739findDomEnv = new byte[1] ;
      P08G03_n13739findDomEnv = new boolean[] {false} ;
      P08G04_A266CliEnvLin = new byte[1] ;
      P08G04_A396EmprCod = new String[] {""} ;
      P08G04_A5142AlcDomEnv = new byte[1] ;
      P08G04_A22AlbComPri = new String[] {""} ;
      P08G04_A10015AlbComFdD = new String[] {""} ;
      P08G04_A10014AlbComFd = new String[] {""} ;
      P08G04_A279CliNom = new String[] {""} ;
      P08G04_A252CliCod = new int[1] ;
      P08G04_A16AlbComEst = new byte[1] ;
      P08G04_A14AlbComCod = new int[1] ;
      P08G04_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G04_A13739findDomEnv = new byte[1] ;
      P08G04_n13739findDomEnv = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdoctrnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08G02_A266CliEnvLin, P08G02_A396EmprCod, P08G02_A5142AlcDomEnv, P08G02_A22AlbComPri, P08G02_A279CliNom, P08G02_A10015AlbComFdD, P08G02_A10014AlbComFd, P08G02_A252CliCod, P08G02_A16AlbComEst, P08G02_A14AlbComCod,
            P08G02_A17AlbComFch, P08G02_A13739findDomEnv, P08G02_n13739findDomEnv
            }
            , new Object[] {
            P08G03_A266CliEnvLin, P08G03_A396EmprCod, P08G03_A5142AlcDomEnv, P08G03_A22AlbComPri, P08G03_A10014AlbComFd, P08G03_A10015AlbComFdD, P08G03_A279CliNom, P08G03_A252CliCod, P08G03_A16AlbComEst, P08G03_A14AlbComCod,
            P08G03_A17AlbComFch, P08G03_A13739findDomEnv, P08G03_n13739findDomEnv
            }
            , new Object[] {
            P08G04_A266CliEnvLin, P08G04_A396EmprCod, P08G04_A5142AlcDomEnv, P08G04_A22AlbComPri, P08G04_A10015AlbComFdD, P08G04_A10014AlbComFd, P08G04_A279CliNom, P08G04_A252CliCod, P08G04_A16AlbComEst, P08G04_A14AlbComCod,
            P08G04_A17AlbComFch, P08G04_A13739findDomEnv, P08G04_n13739findDomEnv
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV96TFfindDomEnv ;
   private byte AV97TFfindDomEnv_To ;
   private byte AV120Tdoctrnwwds_18_tffinddomenv ;
   private byte AV121Tdoctrnwwds_19_tffinddomenv_to ;
   private byte A16AlbComEst ;
   private byte A13739findDomEnv ;
   private byte A5142AlcDomEnv ;
   private short Gx_err ;
   private int AV101GXV1 ;
   private int AV10TFAlbComCod ;
   private int AV11TFAlbComCod_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV107Tdoctrnwwds_5_tfalbcomcod ;
   private int AV108Tdoctrnwwds_6_tfalbcomcod_to ;
   private int AV112Tdoctrnwwds_10_tfclicod ;
   private int AV113Tdoctrnwwds_11_tfclicod_to ;
   private int AV109Tdoctrnwwds_7_tfalbcompri_sels_size ;
   private int AV110Tdoctrnwwds_8_tfalbcomest_sels_size ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private long AV64count ;
   private String AV93AlbComPri ;
   private String AV20TFCliNom ;
   private String AV21TFCliNom_Sel ;
   private String AV44TFAlbComFd ;
   private String AV45TFAlbComFd_Sel ;
   private String AV89TFAlbComFdD ;
   private String AV90TFAlbComFdD_Sel ;
   private String A279CliNom ;
   private String AV103Tdoctrnwwds_1_albcompri ;
   private String AV114Tdoctrnwwds_12_tfclinom ;
   private String AV115Tdoctrnwwds_13_tfclinom_sel ;
   private String AV116Tdoctrnwwds_14_tfalbcomfd ;
   private String AV117Tdoctrnwwds_15_tfalbcomfd_sel ;
   private String AV118Tdoctrnwwds_16_tfalbcomfdd ;
   private String AV119Tdoctrnwwds_17_tfalbcomfdd_sel ;
   private String scmdbuf ;
   private String lV114Tdoctrnwwds_12_tfclinom ;
   private String lV116Tdoctrnwwds_14_tfalbcomfd ;
   private String lV118Tdoctrnwwds_16_tfalbcomfdd ;
   private String A22AlbComPri ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String A396EmprCod ;
   private java.util.Date AV94AlbComFch ;
   private java.util.Date AV95AlbComFch_To ;
   private java.util.Date AV12TFAlbComFch ;
   private java.util.Date AV104Tdoctrnwwds_2_albcomfch ;
   private java.util.Date AV105Tdoctrnwwds_3_albcomfch_to ;
   private java.util.Date AV111Tdoctrnwwds_9_tfalbcomfch ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean brk8G02 ;
   private boolean n13739findDomEnv ;
   private boolean brk8G04 ;
   private boolean brk8G06 ;
   private String AV58OptionsJson ;
   private String AV61OptionsDescJson ;
   private String AV63OptionIndexesJson ;
   private String AV87TFAlbComPri_SelsJson ;
   private String AV91TFAlbComEst_SelsJson ;
   private String AV54DDOName ;
   private String AV52SearchTxt ;
   private String AV53SearchTxtTo ;
   private String AV98FilterFullText ;
   private String AV106Tdoctrnwwds_4_filterfulltext ;
   private String lV106Tdoctrnwwds_4_filterfulltext ;
   private String AV56Option ;
   private GXSimpleCollection<Byte> AV92TFAlbComEst_Sels ;
   private GXSimpleCollection<Byte> AV110Tdoctrnwwds_8_tfalbcomest_sels ;
   private com.genexus.webpanels.WebSession AV65Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08G02_A266CliEnvLin ;
   private String[] P08G02_A396EmprCod ;
   private byte[] P08G02_A5142AlcDomEnv ;
   private String[] P08G02_A22AlbComPri ;
   private String[] P08G02_A279CliNom ;
   private String[] P08G02_A10015AlbComFdD ;
   private String[] P08G02_A10014AlbComFd ;
   private int[] P08G02_A252CliCod ;
   private byte[] P08G02_A16AlbComEst ;
   private int[] P08G02_A14AlbComCod ;
   private java.util.Date[] P08G02_A17AlbComFch ;
   private byte[] P08G02_A13739findDomEnv ;
   private boolean[] P08G02_n13739findDomEnv ;
   private byte[] P08G03_A266CliEnvLin ;
   private String[] P08G03_A396EmprCod ;
   private byte[] P08G03_A5142AlcDomEnv ;
   private String[] P08G03_A22AlbComPri ;
   private String[] P08G03_A10014AlbComFd ;
   private String[] P08G03_A10015AlbComFdD ;
   private String[] P08G03_A279CliNom ;
   private int[] P08G03_A252CliCod ;
   private byte[] P08G03_A16AlbComEst ;
   private int[] P08G03_A14AlbComCod ;
   private java.util.Date[] P08G03_A17AlbComFch ;
   private byte[] P08G03_A13739findDomEnv ;
   private boolean[] P08G03_n13739findDomEnv ;
   private byte[] P08G04_A266CliEnvLin ;
   private String[] P08G04_A396EmprCod ;
   private byte[] P08G04_A5142AlcDomEnv ;
   private String[] P08G04_A22AlbComPri ;
   private String[] P08G04_A10015AlbComFdD ;
   private String[] P08G04_A10014AlbComFd ;
   private String[] P08G04_A279CliNom ;
   private int[] P08G04_A252CliCod ;
   private byte[] P08G04_A16AlbComEst ;
   private int[] P08G04_A14AlbComCod ;
   private java.util.Date[] P08G04_A17AlbComFch ;
   private byte[] P08G04_A13739findDomEnv ;
   private boolean[] P08G04_n13739findDomEnv ;
   private GXSimpleCollection<String> AV88TFAlbComPri_Sels ;
   private GXSimpleCollection<String> AV109Tdoctrnwwds_7_tfalbcompri_sels ;
   private GXSimpleCollection<String> AV57Options ;
   private GXSimpleCollection<String> AV60OptionsDesc ;
   private GXSimpleCollection<String> AV62OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV67GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV68GridStateFilterValue ;
}

final  class tdoctrnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08G02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV109Tdoctrnwwds_7_tfalbcompri_sels ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV110Tdoctrnwwds_8_tfalbcomest_sels ,
                                          java.util.Date AV104Tdoctrnwwds_2_albcomfch ,
                                          java.util.Date AV105Tdoctrnwwds_3_albcomfch_to ,
                                          int AV107Tdoctrnwwds_5_tfalbcomcod ,
                                          int AV108Tdoctrnwwds_6_tfalbcomcod_to ,
                                          int AV109Tdoctrnwwds_7_tfalbcompri_sels_size ,
                                          int AV110Tdoctrnwwds_8_tfalbcomest_sels_size ,
                                          java.util.Date AV111Tdoctrnwwds_9_tfalbcomfch ,
                                          int AV112Tdoctrnwwds_10_tfclicod ,
                                          int AV113Tdoctrnwwds_11_tfclicod_to ,
                                          String AV115Tdoctrnwwds_13_tfclinom_sel ,
                                          String AV114Tdoctrnwwds_12_tfclinom ,
                                          String AV117Tdoctrnwwds_15_tfalbcomfd_sel ,
                                          String AV116Tdoctrnwwds_14_tfalbcomfd ,
                                          String AV119Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                          String AV118Tdoctrnwwds_16_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          String AV106Tdoctrnwwds_4_filterfulltext ,
                                          byte A13739findDomEnv ,
                                          byte AV120Tdoctrnwwds_18_tffinddomenv ,
                                          byte AV121Tdoctrnwwds_19_tffinddomenv_to ,
                                          String AV103Tdoctrnwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.CliEnvLin, T1.EmprCod, T1.AlcDomEnv, T1.AlbComPri, T2.CliNom, T1.AlbComFdD, T1.AlbComFd, T1.CliCod, T1.AlbComEst, T1.AlbComCod, T1.AlbComFch, COALESCE(" ;
      scmdbuf += " T3.CliEnvLin, 0) AS findDomEnv FROM ((TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCLIENV T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.CliEnvLin = T1.AlcDomEnv)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliEnvLin, 0),'90'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) <= ?))");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tdoctrnwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tdoctrnwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV107Tdoctrnwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV108Tdoctrnwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( AV109Tdoctrnwwds_7_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tdoctrnwwds_7_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( AV110Tdoctrnwwds_8_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Tdoctrnwwds_8_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Tdoctrnwwds_9_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV112Tdoctrnwwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV113Tdoctrnwwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tdoctrnwwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV114Tdoctrnwwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tdoctrnwwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tdoctrnwwds_15_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV116Tdoctrnwwds_14_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tdoctrnwwds_15_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tdoctrnwwds_17_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV118Tdoctrnwwds_16_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tdoctrnwwds_17_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
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

   protected Object[] conditional_P08G03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV109Tdoctrnwwds_7_tfalbcompri_sels ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV110Tdoctrnwwds_8_tfalbcomest_sels ,
                                          java.util.Date AV104Tdoctrnwwds_2_albcomfch ,
                                          java.util.Date AV105Tdoctrnwwds_3_albcomfch_to ,
                                          int AV107Tdoctrnwwds_5_tfalbcomcod ,
                                          int AV108Tdoctrnwwds_6_tfalbcomcod_to ,
                                          int AV109Tdoctrnwwds_7_tfalbcompri_sels_size ,
                                          int AV110Tdoctrnwwds_8_tfalbcomest_sels_size ,
                                          java.util.Date AV111Tdoctrnwwds_9_tfalbcomfch ,
                                          int AV112Tdoctrnwwds_10_tfclicod ,
                                          int AV113Tdoctrnwwds_11_tfclicod_to ,
                                          String AV115Tdoctrnwwds_13_tfclinom_sel ,
                                          String AV114Tdoctrnwwds_12_tfclinom ,
                                          String AV117Tdoctrnwwds_15_tfalbcomfd_sel ,
                                          String AV116Tdoctrnwwds_14_tfalbcomfd ,
                                          String AV119Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                          String AV118Tdoctrnwwds_16_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          String AV106Tdoctrnwwds_4_filterfulltext ,
                                          byte A13739findDomEnv ,
                                          byte AV120Tdoctrnwwds_18_tffinddomenv ,
                                          byte AV121Tdoctrnwwds_19_tffinddomenv_to ,
                                          String AV103Tdoctrnwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[27];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T3.CliEnvLin, T1.EmprCod, T1.AlcDomEnv, T1.AlbComPri, T1.AlbComFd, T1.AlbComFdD, T2.CliNom, T1.CliCod, T1.AlbComEst, T1.AlbComCod, T1.AlbComFch, COALESCE(" ;
      scmdbuf += " T3.CliEnvLin, 0) AS findDomEnv FROM ((TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCLIENV T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.CliEnvLin = T1.AlcDomEnv)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliEnvLin, 0),'90'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) <= ?))");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tdoctrnwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tdoctrnwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV107Tdoctrnwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV108Tdoctrnwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( AV109Tdoctrnwwds_7_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tdoctrnwwds_7_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( AV110Tdoctrnwwds_8_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Tdoctrnwwds_8_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Tdoctrnwwds_9_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV112Tdoctrnwwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV113Tdoctrnwwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tdoctrnwwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV114Tdoctrnwwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tdoctrnwwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tdoctrnwwds_15_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV116Tdoctrnwwds_14_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tdoctrnwwds_15_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tdoctrnwwds_17_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV118Tdoctrnwwds_16_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tdoctrnwwds_17_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComFd" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08G04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV109Tdoctrnwwds_7_tfalbcompri_sels ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV110Tdoctrnwwds_8_tfalbcomest_sels ,
                                          java.util.Date AV104Tdoctrnwwds_2_albcomfch ,
                                          java.util.Date AV105Tdoctrnwwds_3_albcomfch_to ,
                                          int AV107Tdoctrnwwds_5_tfalbcomcod ,
                                          int AV108Tdoctrnwwds_6_tfalbcomcod_to ,
                                          int AV109Tdoctrnwwds_7_tfalbcompri_sels_size ,
                                          int AV110Tdoctrnwwds_8_tfalbcomest_sels_size ,
                                          java.util.Date AV111Tdoctrnwwds_9_tfalbcomfch ,
                                          int AV112Tdoctrnwwds_10_tfclicod ,
                                          int AV113Tdoctrnwwds_11_tfclicod_to ,
                                          String AV115Tdoctrnwwds_13_tfclinom_sel ,
                                          String AV114Tdoctrnwwds_12_tfclinom ,
                                          String AV117Tdoctrnwwds_15_tfalbcomfd_sel ,
                                          String AV116Tdoctrnwwds_14_tfalbcomfd ,
                                          String AV119Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                          String AV118Tdoctrnwwds_16_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          String AV106Tdoctrnwwds_4_filterfulltext ,
                                          byte A13739findDomEnv ,
                                          byte AV120Tdoctrnwwds_18_tffinddomenv ,
                                          byte AV121Tdoctrnwwds_19_tffinddomenv_to ,
                                          String AV103Tdoctrnwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.CliEnvLin, T1.EmprCod, T1.AlcDomEnv, T1.AlbComPri, T1.AlbComFdD, T1.AlbComFd, T2.CliNom, T1.CliCod, T1.AlbComEst, T1.AlbComCod, T1.AlbComFch, COALESCE(" ;
      scmdbuf += " T3.CliEnvLin, 0) AS findDomEnv FROM ((TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCLIENV T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.CliEnvLin = T1.AlcDomEnv)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliEnvLin, 0),'90'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) <= ?))");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tdoctrnwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tdoctrnwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV107Tdoctrnwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV108Tdoctrnwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( AV109Tdoctrnwwds_7_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tdoctrnwwds_7_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( AV110Tdoctrnwwds_8_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Tdoctrnwwds_8_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Tdoctrnwwds_9_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV112Tdoctrnwwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV113Tdoctrnwwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tdoctrnwwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV114Tdoctrnwwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tdoctrnwwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tdoctrnwwds_15_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV116Tdoctrnwwds_14_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tdoctrnwwds_15_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tdoctrnwwds_17_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV118Tdoctrnwwds_16_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tdoctrnwwds_17_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComFdD" ;
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
                  return conditional_P08G02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P08G03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P08G04(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08G02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08G03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08G04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 200);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 200);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 200);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 200);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 200);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 200);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 200);
               }
               return;
      }
   }

}

