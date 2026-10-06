package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class talbcomwwgetfilterdata extends GXProcedure
{
   public talbcomwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbcomwwgetfilterdata.class ), "" );
   }

   public talbcomwwgetfilterdata( int remoteHandle ,
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
      talbcomwwgetfilterdata.this.aP5 = new String[] {""};
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
      talbcomwwgetfilterdata.this.AV52DDOName = aP0;
      talbcomwwgetfilterdata.this.AV50SearchTxt = aP1;
      talbcomwwgetfilterdata.this.AV51SearchTxtTo = aP2;
      talbcomwwgetfilterdata.this.aP3 = aP3;
      talbcomwwgetfilterdata.this.aP4 = aP4;
      talbcomwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_ALBCOMFD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_ALBCOMFDD") == 0 )
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
      AV56OptionsJson = AV55Options.toJSonString(false) ;
      AV59OptionsDescJson = AV58OptionsDesc.toJSonString(false) ;
      AV61OptionIndexesJson = AV60OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV63Session.getValue("TALBCOMWWGridState"), "") == 0 )
      {
         AV65GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBCOMWWGridState"), null, null);
      }
      else
      {
         AV65GridState.fromxml(AV63Session.getValue("TALBCOMWWGridState"), null, null);
      }
      AV95GXV1 = 1 ;
      while ( AV95GXV1 <= AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV66GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV1));
         if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV89AlbComPri = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV90AlbComFch = localUtil.ctod( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV91AlbComFch_To = localUtil.ctod( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV92FilterFullText = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV10TFAlbComCod = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbComCod_To = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV12TFAlbComFch = localUtil.ctod( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV87TFAlbComPri_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV88TFAlbComPri_Sels.fromJSonString(AV87TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD") == 0 )
         {
            AV46TFAlbComFd = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD_SEL") == 0 )
         {
            AV47TFAlbComFd_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV48TFAlbComFdD = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV49TFAlbComFdD_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV95GXV1 = (int)(AV95GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV50SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV97Talbcomwwds_1_albcompri = AV89AlbComPri ;
      AV98Talbcomwwds_2_albcomfch = AV90AlbComFch ;
      AV99Talbcomwwds_3_albcomfch_to = AV91AlbComFch_To ;
      AV100Talbcomwwds_4_filterfulltext = AV92FilterFullText ;
      AV101Talbcomwwds_5_tfalbcomcod = AV10TFAlbComCod ;
      AV102Talbcomwwds_6_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV103Talbcomwwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV104Talbcomwwds_8_tfalbcompri_sels = AV88TFAlbComPri_Sels ;
      AV105Talbcomwwds_9_tfclicod = AV16TFCliCod ;
      AV106Talbcomwwds_10_tfclicod_to = AV17TFCliCod_To ;
      AV107Talbcomwwds_11_tfclinom = AV18TFCliNom ;
      AV108Talbcomwwds_12_tfclinom_sel = AV19TFCliNom_Sel ;
      AV109Talbcomwwds_13_tfalbcomfd = AV46TFAlbComFd ;
      AV110Talbcomwwds_14_tfalbcomfd_sel = AV47TFAlbComFd_Sel ;
      AV111Talbcomwwds_15_tfalbcomfdd = AV48TFAlbComFdD ;
      AV112Talbcomwwds_16_tfalbcomfdd_sel = AV49TFAlbComFdD_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV104Talbcomwwds_8_tfalbcompri_sels ,
                                           AV98Talbcomwwds_2_albcomfch ,
                                           AV99Talbcomwwds_3_albcomfch_to ,
                                           AV100Talbcomwwds_4_filterfulltext ,
                                           Integer.valueOf(AV101Talbcomwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV102Talbcomwwds_6_tfalbcomcod_to) ,
                                           AV103Talbcomwwds_7_tfalbcomfch ,
                                           Integer.valueOf(AV104Talbcomwwds_8_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV105Talbcomwwds_9_tfclicod) ,
                                           Integer.valueOf(AV106Talbcomwwds_10_tfclicod_to) ,
                                           AV108Talbcomwwds_12_tfclinom_sel ,
                                           AV107Talbcomwwds_11_tfclinom ,
                                           AV110Talbcomwwds_14_tfalbcomfd_sel ,
                                           AV109Talbcomwwds_13_tfalbcomfd ,
                                           AV112Talbcomwwds_16_tfalbcomfdd_sel ,
                                           AV111Talbcomwwds_15_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           AV97Talbcomwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV107Talbcomwwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV107Talbcomwwds_11_tfclinom), 30, "%") ;
      lV109Talbcomwwds_13_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV109Talbcomwwds_13_tfalbcomfd), 200, "%") ;
      lV111Talbcomwwds_15_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV111Talbcomwwds_15_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G42 */
      pr_default.execute(0, new Object[] {AV97Talbcomwwds_1_albcompri, AV98Talbcomwwds_2_albcomfch, AV99Talbcomwwds_3_albcomfch_to, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, Integer.valueOf(AV101Talbcomwwds_5_tfalbcomcod), Integer.valueOf(AV102Talbcomwwds_6_tfalbcomcod_to), AV103Talbcomwwds_7_tfalbcomfch, Integer.valueOf(AV105Talbcomwwds_9_tfclicod), Integer.valueOf(AV106Talbcomwwds_10_tfclicod_to), lV107Talbcomwwds_11_tfclinom, AV108Talbcomwwds_12_tfclinom_sel, lV109Talbcomwwds_13_tfalbcomfd, AV110Talbcomwwds_14_tfalbcomfd_sel, lV111Talbcomwwds_15_tfalbcomfdd, AV112Talbcomwwds_16_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8G42 = false ;
         A396EmprCod = P08G42_A396EmprCod[0] ;
         A22AlbComPri = P08G42_A22AlbComPri[0] ;
         A279CliNom = P08G42_A279CliNom[0] ;
         A10015AlbComFdD = P08G42_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G42_A10014AlbComFd[0] ;
         A252CliCod = P08G42_A252CliCod[0] ;
         A14AlbComCod = P08G42_A14AlbComCod[0] ;
         A17AlbComFch = P08G42_A17AlbComFch[0] ;
         A279CliNom = P08G42_A279CliNom[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08G42_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8G42 = false ;
            A396EmprCod = P08G42_A396EmprCod[0] ;
            A252CliCod = P08G42_A252CliCod[0] ;
            A14AlbComCod = P08G42_A14AlbComCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8G42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV54Option = A279CliNom ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8G42 )
         {
            brk8G42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBCOMFDOPTIONS' Routine */
      returnInSub = false ;
      AV46TFAlbComFd = AV50SearchTxt ;
      AV47TFAlbComFd_Sel = "" ;
      AV97Talbcomwwds_1_albcompri = AV89AlbComPri ;
      AV98Talbcomwwds_2_albcomfch = AV90AlbComFch ;
      AV99Talbcomwwds_3_albcomfch_to = AV91AlbComFch_To ;
      AV100Talbcomwwds_4_filterfulltext = AV92FilterFullText ;
      AV101Talbcomwwds_5_tfalbcomcod = AV10TFAlbComCod ;
      AV102Talbcomwwds_6_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV103Talbcomwwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV104Talbcomwwds_8_tfalbcompri_sels = AV88TFAlbComPri_Sels ;
      AV105Talbcomwwds_9_tfclicod = AV16TFCliCod ;
      AV106Talbcomwwds_10_tfclicod_to = AV17TFCliCod_To ;
      AV107Talbcomwwds_11_tfclinom = AV18TFCliNom ;
      AV108Talbcomwwds_12_tfclinom_sel = AV19TFCliNom_Sel ;
      AV109Talbcomwwds_13_tfalbcomfd = AV46TFAlbComFd ;
      AV110Talbcomwwds_14_tfalbcomfd_sel = AV47TFAlbComFd_Sel ;
      AV111Talbcomwwds_15_tfalbcomfdd = AV48TFAlbComFdD ;
      AV112Talbcomwwds_16_tfalbcomfdd_sel = AV49TFAlbComFdD_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV104Talbcomwwds_8_tfalbcompri_sels ,
                                           AV98Talbcomwwds_2_albcomfch ,
                                           AV99Talbcomwwds_3_albcomfch_to ,
                                           AV100Talbcomwwds_4_filterfulltext ,
                                           Integer.valueOf(AV101Talbcomwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV102Talbcomwwds_6_tfalbcomcod_to) ,
                                           AV103Talbcomwwds_7_tfalbcomfch ,
                                           Integer.valueOf(AV104Talbcomwwds_8_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV105Talbcomwwds_9_tfclicod) ,
                                           Integer.valueOf(AV106Talbcomwwds_10_tfclicod_to) ,
                                           AV108Talbcomwwds_12_tfclinom_sel ,
                                           AV107Talbcomwwds_11_tfclinom ,
                                           AV110Talbcomwwds_14_tfalbcomfd_sel ,
                                           AV109Talbcomwwds_13_tfalbcomfd ,
                                           AV112Talbcomwwds_16_tfalbcomfdd_sel ,
                                           AV111Talbcomwwds_15_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           AV97Talbcomwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV107Talbcomwwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV107Talbcomwwds_11_tfclinom), 30, "%") ;
      lV109Talbcomwwds_13_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV109Talbcomwwds_13_tfalbcomfd), 200, "%") ;
      lV111Talbcomwwds_15_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV111Talbcomwwds_15_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G43 */
      pr_default.execute(1, new Object[] {AV97Talbcomwwds_1_albcompri, AV98Talbcomwwds_2_albcomfch, AV99Talbcomwwds_3_albcomfch_to, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, Integer.valueOf(AV101Talbcomwwds_5_tfalbcomcod), Integer.valueOf(AV102Talbcomwwds_6_tfalbcomcod_to), AV103Talbcomwwds_7_tfalbcomfch, Integer.valueOf(AV105Talbcomwwds_9_tfclicod), Integer.valueOf(AV106Talbcomwwds_10_tfclicod_to), lV107Talbcomwwds_11_tfclinom, AV108Talbcomwwds_12_tfclinom_sel, lV109Talbcomwwds_13_tfalbcomfd, AV110Talbcomwwds_14_tfalbcomfd_sel, lV111Talbcomwwds_15_tfalbcomfdd, AV112Talbcomwwds_16_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8G44 = false ;
         A396EmprCod = P08G43_A396EmprCod[0] ;
         A22AlbComPri = P08G43_A22AlbComPri[0] ;
         A10014AlbComFd = P08G43_A10014AlbComFd[0] ;
         A10015AlbComFdD = P08G43_A10015AlbComFdD[0] ;
         A279CliNom = P08G43_A279CliNom[0] ;
         A252CliCod = P08G43_A252CliCod[0] ;
         A14AlbComCod = P08G43_A14AlbComCod[0] ;
         A17AlbComFch = P08G43_A17AlbComFch[0] ;
         A279CliNom = P08G43_A279CliNom[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08G43_A10014AlbComFd[0], A10014AlbComFd) == 0 ) )
         {
            brk8G44 = false ;
            A396EmprCod = P08G43_A396EmprCod[0] ;
            A14AlbComCod = P08G43_A14AlbComCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8G44 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A10014AlbComFd)==0) )
         {
            AV54Option = A10014AlbComFd ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8G44 )
         {
            brk8G44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBCOMFDDOPTIONS' Routine */
      returnInSub = false ;
      AV48TFAlbComFdD = AV50SearchTxt ;
      AV49TFAlbComFdD_Sel = "" ;
      AV97Talbcomwwds_1_albcompri = AV89AlbComPri ;
      AV98Talbcomwwds_2_albcomfch = AV90AlbComFch ;
      AV99Talbcomwwds_3_albcomfch_to = AV91AlbComFch_To ;
      AV100Talbcomwwds_4_filterfulltext = AV92FilterFullText ;
      AV101Talbcomwwds_5_tfalbcomcod = AV10TFAlbComCod ;
      AV102Talbcomwwds_6_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV103Talbcomwwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV104Talbcomwwds_8_tfalbcompri_sels = AV88TFAlbComPri_Sels ;
      AV105Talbcomwwds_9_tfclicod = AV16TFCliCod ;
      AV106Talbcomwwds_10_tfclicod_to = AV17TFCliCod_To ;
      AV107Talbcomwwds_11_tfclinom = AV18TFCliNom ;
      AV108Talbcomwwds_12_tfclinom_sel = AV19TFCliNom_Sel ;
      AV109Talbcomwwds_13_tfalbcomfd = AV46TFAlbComFd ;
      AV110Talbcomwwds_14_tfalbcomfd_sel = AV47TFAlbComFd_Sel ;
      AV111Talbcomwwds_15_tfalbcomfdd = AV48TFAlbComFdD ;
      AV112Talbcomwwds_16_tfalbcomfdd_sel = AV49TFAlbComFdD_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV104Talbcomwwds_8_tfalbcompri_sels ,
                                           AV98Talbcomwwds_2_albcomfch ,
                                           AV99Talbcomwwds_3_albcomfch_to ,
                                           AV100Talbcomwwds_4_filterfulltext ,
                                           Integer.valueOf(AV101Talbcomwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV102Talbcomwwds_6_tfalbcomcod_to) ,
                                           AV103Talbcomwwds_7_tfalbcomfch ,
                                           Integer.valueOf(AV104Talbcomwwds_8_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV105Talbcomwwds_9_tfclicod) ,
                                           Integer.valueOf(AV106Talbcomwwds_10_tfclicod_to) ,
                                           AV108Talbcomwwds_12_tfclinom_sel ,
                                           AV107Talbcomwwds_11_tfclinom ,
                                           AV110Talbcomwwds_14_tfalbcomfd_sel ,
                                           AV109Talbcomwwds_13_tfalbcomfd ,
                                           AV112Talbcomwwds_16_tfalbcomfdd_sel ,
                                           AV111Talbcomwwds_15_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           AV97Talbcomwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV100Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Talbcomwwds_4_filterfulltext), "%", "") ;
      lV107Talbcomwwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV107Talbcomwwds_11_tfclinom), 30, "%") ;
      lV109Talbcomwwds_13_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV109Talbcomwwds_13_tfalbcomfd), 200, "%") ;
      lV111Talbcomwwds_15_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV111Talbcomwwds_15_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G44 */
      pr_default.execute(2, new Object[] {AV97Talbcomwwds_1_albcompri, AV98Talbcomwwds_2_albcomfch, AV99Talbcomwwds_3_albcomfch_to, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, lV100Talbcomwwds_4_filterfulltext, Integer.valueOf(AV101Talbcomwwds_5_tfalbcomcod), Integer.valueOf(AV102Talbcomwwds_6_tfalbcomcod_to), AV103Talbcomwwds_7_tfalbcomfch, Integer.valueOf(AV105Talbcomwwds_9_tfclicod), Integer.valueOf(AV106Talbcomwwds_10_tfclicod_to), lV107Talbcomwwds_11_tfclinom, AV108Talbcomwwds_12_tfclinom_sel, lV109Talbcomwwds_13_tfalbcomfd, AV110Talbcomwwds_14_tfalbcomfd_sel, lV111Talbcomwwds_15_tfalbcomfdd, AV112Talbcomwwds_16_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8G46 = false ;
         A396EmprCod = P08G44_A396EmprCod[0] ;
         A22AlbComPri = P08G44_A22AlbComPri[0] ;
         A10015AlbComFdD = P08G44_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G44_A10014AlbComFd[0] ;
         A279CliNom = P08G44_A279CliNom[0] ;
         A252CliCod = P08G44_A252CliCod[0] ;
         A14AlbComCod = P08G44_A14AlbComCod[0] ;
         A17AlbComFch = P08G44_A17AlbComFch[0] ;
         A279CliNom = P08G44_A279CliNom[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08G44_A10015AlbComFdD[0], A10015AlbComFdD) == 0 ) )
         {
            brk8G46 = false ;
            A396EmprCod = P08G44_A396EmprCod[0] ;
            A14AlbComCod = P08G44_A14AlbComCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8G46 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A10015AlbComFdD)==0) )
         {
            AV54Option = A10015AlbComFdD ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8G46 )
         {
            brk8G46 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = talbcomwwgetfilterdata.this.AV56OptionsJson;
      this.aP4[0] = talbcomwwgetfilterdata.this.AV59OptionsDescJson;
      this.aP5[0] = talbcomwwgetfilterdata.this.AV61OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV56OptionsJson = "" ;
      AV59OptionsDescJson = "" ;
      AV61OptionIndexesJson = "" ;
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63Session = httpContext.getWebSession();
      AV65GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV89AlbComPri = "" ;
      AV90AlbComFch = GXutil.nullDate() ;
      AV91AlbComFch_To = GXutil.nullDate() ;
      AV92FilterFullText = "" ;
      AV12TFAlbComFch = GXutil.nullDate() ;
      AV87TFAlbComPri_SelsJson = "" ;
      AV88TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV46TFAlbComFd = "" ;
      AV47TFAlbComFd_Sel = "" ;
      AV48TFAlbComFdD = "" ;
      AV49TFAlbComFdD_Sel = "" ;
      A279CliNom = "" ;
      AV97Talbcomwwds_1_albcompri = "" ;
      AV98Talbcomwwds_2_albcomfch = GXutil.nullDate() ;
      AV99Talbcomwwds_3_albcomfch_to = GXutil.nullDate() ;
      AV100Talbcomwwds_4_filterfulltext = "" ;
      AV103Talbcomwwds_7_tfalbcomfch = GXutil.nullDate() ;
      AV104Talbcomwwds_8_tfalbcompri_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV107Talbcomwwds_11_tfclinom = "" ;
      AV108Talbcomwwds_12_tfclinom_sel = "" ;
      AV109Talbcomwwds_13_tfalbcomfd = "" ;
      AV110Talbcomwwds_14_tfalbcomfd_sel = "" ;
      AV111Talbcomwwds_15_tfalbcomfdd = "" ;
      AV112Talbcomwwds_16_tfalbcomfdd_sel = "" ;
      scmdbuf = "" ;
      lV100Talbcomwwds_4_filterfulltext = "" ;
      lV107Talbcomwwds_11_tfclinom = "" ;
      lV109Talbcomwwds_13_tfalbcomfd = "" ;
      lV111Talbcomwwds_15_tfalbcomfdd = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      P08G42_A396EmprCod = new String[] {""} ;
      P08G42_A22AlbComPri = new String[] {""} ;
      P08G42_A279CliNom = new String[] {""} ;
      P08G42_A10015AlbComFdD = new String[] {""} ;
      P08G42_A10014AlbComFd = new String[] {""} ;
      P08G42_A252CliCod = new int[1] ;
      P08G42_A14AlbComCod = new int[1] ;
      P08G42_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      AV54Option = "" ;
      P08G43_A396EmprCod = new String[] {""} ;
      P08G43_A22AlbComPri = new String[] {""} ;
      P08G43_A10014AlbComFd = new String[] {""} ;
      P08G43_A10015AlbComFdD = new String[] {""} ;
      P08G43_A279CliNom = new String[] {""} ;
      P08G43_A252CliCod = new int[1] ;
      P08G43_A14AlbComCod = new int[1] ;
      P08G43_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G44_A396EmprCod = new String[] {""} ;
      P08G44_A22AlbComPri = new String[] {""} ;
      P08G44_A10015AlbComFdD = new String[] {""} ;
      P08G44_A10014AlbComFd = new String[] {""} ;
      P08G44_A279CliNom = new String[] {""} ;
      P08G44_A252CliCod = new int[1] ;
      P08G44_A14AlbComCod = new int[1] ;
      P08G44_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbcomwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08G42_A396EmprCod, P08G42_A22AlbComPri, P08G42_A279CliNom, P08G42_A10015AlbComFdD, P08G42_A10014AlbComFd, P08G42_A252CliCod, P08G42_A14AlbComCod, P08G42_A17AlbComFch
            }
            , new Object[] {
            P08G43_A396EmprCod, P08G43_A22AlbComPri, P08G43_A10014AlbComFd, P08G43_A10015AlbComFdD, P08G43_A279CliNom, P08G43_A252CliCod, P08G43_A14AlbComCod, P08G43_A17AlbComFch
            }
            , new Object[] {
            P08G44_A396EmprCod, P08G44_A22AlbComPri, P08G44_A10015AlbComFdD, P08G44_A10014AlbComFd, P08G44_A279CliNom, P08G44_A252CliCod, P08G44_A14AlbComCod, P08G44_A17AlbComFch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV95GXV1 ;
   private int AV10TFAlbComCod ;
   private int AV11TFAlbComCod_To ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV101Talbcomwwds_5_tfalbcomcod ;
   private int AV102Talbcomwwds_6_tfalbcomcod_to ;
   private int AV105Talbcomwwds_9_tfclicod ;
   private int AV106Talbcomwwds_10_tfclicod_to ;
   private int AV104Talbcomwwds_8_tfalbcompri_sels_size ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private long AV62count ;
   private String AV89AlbComPri ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String AV46TFAlbComFd ;
   private String AV47TFAlbComFd_Sel ;
   private String AV48TFAlbComFdD ;
   private String AV49TFAlbComFdD_Sel ;
   private String A279CliNom ;
   private String AV97Talbcomwwds_1_albcompri ;
   private String AV107Talbcomwwds_11_tfclinom ;
   private String AV108Talbcomwwds_12_tfclinom_sel ;
   private String AV109Talbcomwwds_13_tfalbcomfd ;
   private String AV110Talbcomwwds_14_tfalbcomfd_sel ;
   private String AV111Talbcomwwds_15_tfalbcomfdd ;
   private String AV112Talbcomwwds_16_tfalbcomfdd_sel ;
   private String scmdbuf ;
   private String lV107Talbcomwwds_11_tfclinom ;
   private String lV109Talbcomwwds_13_tfalbcomfd ;
   private String lV111Talbcomwwds_15_tfalbcomfdd ;
   private String A22AlbComPri ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String A396EmprCod ;
   private java.util.Date AV90AlbComFch ;
   private java.util.Date AV91AlbComFch_To ;
   private java.util.Date AV12TFAlbComFch ;
   private java.util.Date AV98Talbcomwwds_2_albcomfch ;
   private java.util.Date AV99Talbcomwwds_3_albcomfch_to ;
   private java.util.Date AV103Talbcomwwds_7_tfalbcomfch ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean brk8G42 ;
   private boolean brk8G44 ;
   private boolean brk8G46 ;
   private String AV56OptionsJson ;
   private String AV59OptionsDescJson ;
   private String AV61OptionIndexesJson ;
   private String AV87TFAlbComPri_SelsJson ;
   private String AV52DDOName ;
   private String AV50SearchTxt ;
   private String AV51SearchTxtTo ;
   private String AV92FilterFullText ;
   private String AV100Talbcomwwds_4_filterfulltext ;
   private String lV100Talbcomwwds_4_filterfulltext ;
   private String AV54Option ;
   private com.genexus.webpanels.WebSession AV63Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08G42_A396EmprCod ;
   private String[] P08G42_A22AlbComPri ;
   private String[] P08G42_A279CliNom ;
   private String[] P08G42_A10015AlbComFdD ;
   private String[] P08G42_A10014AlbComFd ;
   private int[] P08G42_A252CliCod ;
   private int[] P08G42_A14AlbComCod ;
   private java.util.Date[] P08G42_A17AlbComFch ;
   private String[] P08G43_A396EmprCod ;
   private String[] P08G43_A22AlbComPri ;
   private String[] P08G43_A10014AlbComFd ;
   private String[] P08G43_A10015AlbComFdD ;
   private String[] P08G43_A279CliNom ;
   private int[] P08G43_A252CliCod ;
   private int[] P08G43_A14AlbComCod ;
   private java.util.Date[] P08G43_A17AlbComFch ;
   private String[] P08G44_A396EmprCod ;
   private String[] P08G44_A22AlbComPri ;
   private String[] P08G44_A10015AlbComFdD ;
   private String[] P08G44_A10014AlbComFd ;
   private String[] P08G44_A279CliNom ;
   private int[] P08G44_A252CliCod ;
   private int[] P08G44_A14AlbComCod ;
   private java.util.Date[] P08G44_A17AlbComFch ;
   private GXSimpleCollection<String> AV88TFAlbComPri_Sels ;
   private GXSimpleCollection<String> AV104Talbcomwwds_8_tfalbcompri_sels ;
   private GXSimpleCollection<String> AV55Options ;
   private GXSimpleCollection<String> AV58OptionsDesc ;
   private GXSimpleCollection<String> AV60OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV65GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV66GridStateFilterValue ;
}

final  class talbcomwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08G42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV104Talbcomwwds_8_tfalbcompri_sels ,
                                          java.util.Date AV98Talbcomwwds_2_albcomfch ,
                                          java.util.Date AV99Talbcomwwds_3_albcomfch_to ,
                                          String AV100Talbcomwwds_4_filterfulltext ,
                                          int AV101Talbcomwwds_5_tfalbcomcod ,
                                          int AV102Talbcomwwds_6_tfalbcomcod_to ,
                                          java.util.Date AV103Talbcomwwds_7_tfalbcomfch ,
                                          int AV104Talbcomwwds_8_tfalbcompri_sels_size ,
                                          int AV105Talbcomwwds_9_tfclicod ,
                                          int AV106Talbcomwwds_10_tfclicod_to ,
                                          String AV108Talbcomwwds_12_tfclinom_sel ,
                                          String AV107Talbcomwwds_11_tfclinom ,
                                          String AV110Talbcomwwds_14_tfalbcomfd_sel ,
                                          String AV109Talbcomwwds_13_tfalbcomfd ,
                                          String AV112Talbcomwwds_16_tfalbcomfdd_sel ,
                                          String AV111Talbcomwwds_15_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          String AV97Talbcomwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T2.CliNom, T1.AlbComFdD, T1.AlbComFd, T1.CliCod, T1.AlbComCod, T1.AlbComFch FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Talbcomwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Talbcomwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Talbcomwwds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)))");
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
      if ( ! (0==AV101Talbcomwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV102Talbcomwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Talbcomwwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV104Talbcomwwds_8_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Talbcomwwds_8_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( ! (0==AV105Talbcomwwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbcomwwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Talbcomwwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV107Talbcomwwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Talbcomwwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbcomwwds_14_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbcomwwds_13_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbcomwwds_14_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbcomwwds_16_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbcomwwds_15_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbcomwwds_16_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08G43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV104Talbcomwwds_8_tfalbcompri_sels ,
                                          java.util.Date AV98Talbcomwwds_2_albcomfch ,
                                          java.util.Date AV99Talbcomwwds_3_albcomfch_to ,
                                          String AV100Talbcomwwds_4_filterfulltext ,
                                          int AV101Talbcomwwds_5_tfalbcomcod ,
                                          int AV102Talbcomwwds_6_tfalbcomcod_to ,
                                          java.util.Date AV103Talbcomwwds_7_tfalbcomfch ,
                                          int AV104Talbcomwwds_8_tfalbcompri_sels_size ,
                                          int AV105Talbcomwwds_9_tfclicod ,
                                          int AV106Talbcomwwds_10_tfclicod_to ,
                                          String AV108Talbcomwwds_12_tfclinom_sel ,
                                          String AV107Talbcomwwds_11_tfclinom ,
                                          String AV110Talbcomwwds_14_tfalbcomfd_sel ,
                                          String AV109Talbcomwwds_13_tfalbcomfd ,
                                          String AV112Talbcomwwds_16_tfalbcomfdd_sel ,
                                          String AV111Talbcomwwds_15_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          String AV97Talbcomwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[20];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComFd, T1.AlbComFdD, T2.CliNom, T1.CliCod, T1.AlbComCod, T1.AlbComFch FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Talbcomwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Talbcomwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Talbcomwwds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV101Talbcomwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV102Talbcomwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Talbcomwwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( AV104Talbcomwwds_8_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Talbcomwwds_8_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( ! (0==AV105Talbcomwwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbcomwwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Talbcomwwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV107Talbcomwwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Talbcomwwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbcomwwds_14_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbcomwwds_13_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbcomwwds_14_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbcomwwds_16_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbcomwwds_15_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbcomwwds_16_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComFd" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08G44( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV104Talbcomwwds_8_tfalbcompri_sels ,
                                          java.util.Date AV98Talbcomwwds_2_albcomfch ,
                                          java.util.Date AV99Talbcomwwds_3_albcomfch_to ,
                                          String AV100Talbcomwwds_4_filterfulltext ,
                                          int AV101Talbcomwwds_5_tfalbcomcod ,
                                          int AV102Talbcomwwds_6_tfalbcomcod_to ,
                                          java.util.Date AV103Talbcomwwds_7_tfalbcomfch ,
                                          int AV104Talbcomwwds_8_tfalbcompri_sels_size ,
                                          int AV105Talbcomwwds_9_tfclicod ,
                                          int AV106Talbcomwwds_10_tfclicod_to ,
                                          String AV108Talbcomwwds_12_tfclinom_sel ,
                                          String AV107Talbcomwwds_11_tfclinom ,
                                          String AV110Talbcomwwds_14_tfalbcomfd_sel ,
                                          String AV109Talbcomwwds_13_tfalbcomfd ,
                                          String AV112Talbcomwwds_16_tfalbcomfdd_sel ,
                                          String AV111Talbcomwwds_15_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          String AV97Talbcomwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComFdD, T1.AlbComFd, T2.CliNom, T1.CliCod, T1.AlbComCod, T1.AlbComFch FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Talbcomwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Talbcomwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Talbcomwwds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV101Talbcomwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV102Talbcomwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Talbcomwwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( AV104Talbcomwwds_8_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Talbcomwwds_8_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( ! (0==AV105Talbcomwwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Talbcomwwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Talbcomwwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV107Talbcomwwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Talbcomwwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Talbcomwwds_14_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV109Talbcomwwds_13_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Talbcomwwds_14_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Talbcomwwds_16_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV111Talbcomwwds_15_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Talbcomwwds_16_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
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
                  return conditional_P08G42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 1 :
                  return conditional_P08G43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 2 :
                  return conditional_P08G44(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08G42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08G43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08G44", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
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
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 200);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 200);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 200);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 200);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 200);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 200);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 200);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 200);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 200);
               }
               return;
      }
   }

}

