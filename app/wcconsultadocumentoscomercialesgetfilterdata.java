package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultadocumentoscomercialesgetfilterdata extends GXProcedure
{
   public wcconsultadocumentoscomercialesgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadocumentoscomercialesgetfilterdata.class ), "" );
   }

   public wcconsultadocumentoscomercialesgetfilterdata( int remoteHandle ,
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
      wcconsultadocumentoscomercialesgetfilterdata.this.aP5 = new String[] {""};
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
      wcconsultadocumentoscomercialesgetfilterdata.this.AV24DDOName = aP0;
      wcconsultadocumentoscomercialesgetfilterdata.this.AV22SearchTxt = aP1;
      wcconsultadocumentoscomercialesgetfilterdata.this.AV23SearchTxtTo = aP2;
      wcconsultadocumentoscomercialesgetfilterdata.this.aP3 = aP3;
      wcconsultadocumentoscomercialesgetfilterdata.this.aP4 = aP4;
      wcconsultadocumentoscomercialesgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_ALBCOMPRI") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMPRIOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("WCConsultaDocumentosComercialesGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDocumentosComercialesGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("WCConsultaDocumentosComercialesGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV12TFAlbComFch = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV10TFAlbComCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbComCod_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI") == 0 )
         {
            AV14TFAlbComPri = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV15TFAlbComPri_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMIMP") == 0 )
         {
            AV20TFAlbComImp = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFAlbComImp_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV42Clicod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV43Clicod_to = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMFCH") == 0 )
         {
            AV44AlbComFch = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMFCH_TO") == 0 )
         {
            AV45AlbComFch_to = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRIORIDAD") == 0 )
         {
            AV47Prioridad = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV22SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV52Wcconsultadocumentoscomercialesds_1_filterfulltext = AV40FilterFullText ;
      AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch = AV12TFAlbComFch ;
      AV54Wcconsultadocumentoscomercialesds_3_tfclicod = AV16TFCliCod ;
      AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to = AV17TFCliCod_To ;
      AV56Wcconsultadocumentoscomercialesds_5_tfclinom = AV18TFCliNom ;
      AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel = AV19TFCliNom_Sel ;
      AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod = AV10TFAlbComCod ;
      AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri = AV14TFAlbComPri ;
      AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel = AV15TFAlbComPri_Sel ;
      AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp = AV20TFAlbComImp ;
      AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to = AV21TFAlbComImp_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Wcconsultadocumentoscomercialesds_1_filterfulltext ,
                                           AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch ,
                                           Integer.valueOf(AV54Wcconsultadocumentoscomercialesds_3_tfclicod) ,
                                           Integer.valueOf(AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to) ,
                                           AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel ,
                                           AV56Wcconsultadocumentoscomercialesds_5_tfclinom ,
                                           Integer.valueOf(AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod) ,
                                           Integer.valueOf(AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to) ,
                                           AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel ,
                                           AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri ,
                                           AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp ,
                                           AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A22AlbComPri ,
                                           A18AlbComImp ,
                                           A17AlbComFch ,
                                           Integer.valueOf(AV42Clicod) ,
                                           Integer.valueOf(AV43Clicod_to) ,
                                           AV44AlbComFch ,
                                           AV45AlbComFch_to ,
                                           AV47Prioridad ,
                                           A396EmprCod ,
                                           AV41Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV56Wcconsultadocumentoscomercialesds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV56Wcconsultadocumentoscomercialesds_5_tfclinom), 30, "%") ;
      lV60Wcconsultadocumentoscomercialesds_9_tfalbcompri = GXutil.padr( GXutil.rtrim( AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri), 1, "%") ;
      /* Using cursor P090R3 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV42Clicod), Integer.valueOf(AV43Clicod_to), AV44AlbComFch, AV45AlbComFch_to, AV47Prioridad, AV47Prioridad, AV41Emprcod, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch, Integer.valueOf(AV54Wcconsultadocumentoscomercialesds_3_tfclicod), Integer.valueOf(AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to), lV56Wcconsultadocumentoscomercialesds_5_tfclinom, AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel, Integer.valueOf(AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod), Integer.valueOf(AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to), lV60Wcconsultadocumentoscomercialesds_9_tfalbcompri, AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel, AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp, AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk90R2 = false ;
         A396EmprCod = P090R3_A396EmprCod[0] ;
         A279CliNom = P090R3_A279CliNom[0] ;
         A22AlbComPri = P090R3_A22AlbComPri[0] ;
         A14AlbComCod = P090R3_A14AlbComCod[0] ;
         A252CliCod = P090R3_A252CliCod[0] ;
         A17AlbComFch = P090R3_A17AlbComFch[0] ;
         A18AlbComImp = P090R3_A18AlbComImp[0] ;
         n18AlbComImp = P090R3_n18AlbComImp[0] ;
         A18AlbComImp = P090R3_A18AlbComImp[0] ;
         n18AlbComImp = P090R3_n18AlbComImp[0] ;
         A279CliNom = P090R3_A279CliNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P090R3_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk90R2 = false ;
            A396EmprCod = P090R3_A396EmprCod[0] ;
            A14AlbComCod = P090R3_A14AlbComCod[0] ;
            A252CliCod = P090R3_A252CliCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk90R2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV26Option = A279CliNom ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90R2 )
         {
            brk90R2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBCOMPRIOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbComPri = AV22SearchTxt ;
      AV15TFAlbComPri_Sel = "" ;
      AV52Wcconsultadocumentoscomercialesds_1_filterfulltext = AV40FilterFullText ;
      AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch = AV12TFAlbComFch ;
      AV54Wcconsultadocumentoscomercialesds_3_tfclicod = AV16TFCliCod ;
      AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to = AV17TFCliCod_To ;
      AV56Wcconsultadocumentoscomercialesds_5_tfclinom = AV18TFCliNom ;
      AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel = AV19TFCliNom_Sel ;
      AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod = AV10TFAlbComCod ;
      AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri = AV14TFAlbComPri ;
      AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel = AV15TFAlbComPri_Sel ;
      AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp = AV20TFAlbComImp ;
      AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to = AV21TFAlbComImp_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV52Wcconsultadocumentoscomercialesds_1_filterfulltext ,
                                           AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch ,
                                           Integer.valueOf(AV54Wcconsultadocumentoscomercialesds_3_tfclicod) ,
                                           Integer.valueOf(AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to) ,
                                           AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel ,
                                           AV56Wcconsultadocumentoscomercialesds_5_tfclinom ,
                                           Integer.valueOf(AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod) ,
                                           Integer.valueOf(AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to) ,
                                           AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel ,
                                           AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri ,
                                           AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp ,
                                           AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A22AlbComPri ,
                                           A18AlbComImp ,
                                           A17AlbComFch ,
                                           Integer.valueOf(AV42Clicod) ,
                                           Integer.valueOf(AV43Clicod_to) ,
                                           AV44AlbComFch ,
                                           AV45AlbComFch_to ,
                                           AV47Prioridad ,
                                           A396EmprCod ,
                                           AV41Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV56Wcconsultadocumentoscomercialesds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV56Wcconsultadocumentoscomercialesds_5_tfclinom), 30, "%") ;
      lV60Wcconsultadocumentoscomercialesds_9_tfalbcompri = GXutil.padr( GXutil.rtrim( AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri), 1, "%") ;
      /* Using cursor P090R5 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV42Clicod), Integer.valueOf(AV43Clicod_to), AV44AlbComFch, AV45AlbComFch_to, AV47Prioridad, AV47Prioridad, AV41Emprcod, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, lV52Wcconsultadocumentoscomercialesds_1_filterfulltext, AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch, Integer.valueOf(AV54Wcconsultadocumentoscomercialesds_3_tfclicod), Integer.valueOf(AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to), lV56Wcconsultadocumentoscomercialesds_5_tfclinom, AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel, Integer.valueOf(AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod), Integer.valueOf(AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to), lV60Wcconsultadocumentoscomercialesds_9_tfalbcompri, AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel, AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp, AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk90R4 = false ;
         A396EmprCod = P090R5_A396EmprCod[0] ;
         A22AlbComPri = P090R5_A22AlbComPri[0] ;
         A14AlbComCod = P090R5_A14AlbComCod[0] ;
         A279CliNom = P090R5_A279CliNom[0] ;
         A252CliCod = P090R5_A252CliCod[0] ;
         A17AlbComFch = P090R5_A17AlbComFch[0] ;
         A18AlbComImp = P090R5_A18AlbComImp[0] ;
         n18AlbComImp = P090R5_n18AlbComImp[0] ;
         A18AlbComImp = P090R5_A18AlbComImp[0] ;
         n18AlbComImp = P090R5_n18AlbComImp[0] ;
         A279CliNom = P090R5_A279CliNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P090R5_A22AlbComPri[0], A22AlbComPri) == 0 ) )
         {
            brk90R4 = false ;
            A396EmprCod = P090R5_A396EmprCod[0] ;
            A14AlbComCod = P090R5_A14AlbComCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk90R4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A22AlbComPri)==0) )
         {
            AV26Option = A22AlbComPri ;
            AV29OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A22AlbComPri, "9"))) ;
            AV27Options.add(AV26Option, 0);
            AV30OptionsDesc.add(AV29OptionDesc, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90R4 )
         {
            brk90R4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcconsultadocumentoscomercialesgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = wcconsultadocumentoscomercialesgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = wcconsultadocumentoscomercialesgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV12TFAlbComFch = GXutil.nullDate() ;
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV14TFAlbComPri = "" ;
      AV15TFAlbComPri_Sel = "" ;
      AV20TFAlbComImp = DecimalUtil.ZERO ;
      AV21TFAlbComImp_To = DecimalUtil.ZERO ;
      AV41Emprcod = "" ;
      AV44AlbComFch = GXutil.nullDate() ;
      AV45AlbComFch_to = GXutil.nullDate() ;
      AV47Prioridad = "" ;
      A279CliNom = "" ;
      AV52Wcconsultadocumentoscomercialesds_1_filterfulltext = "" ;
      AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch = GXutil.nullDate() ;
      AV56Wcconsultadocumentoscomercialesds_5_tfclinom = "" ;
      AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel = "" ;
      AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri = "" ;
      AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel = "" ;
      AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp = DecimalUtil.ZERO ;
      AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV52Wcconsultadocumentoscomercialesds_1_filterfulltext = "" ;
      lV56Wcconsultadocumentoscomercialesds_5_tfclinom = "" ;
      lV60Wcconsultadocumentoscomercialesds_9_tfalbcompri = "" ;
      A22AlbComPri = "" ;
      A18AlbComImp = DecimalUtil.ZERO ;
      A17AlbComFch = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P090R3_A396EmprCod = new String[] {""} ;
      P090R3_A279CliNom = new String[] {""} ;
      P090R3_A22AlbComPri = new String[] {""} ;
      P090R3_A14AlbComCod = new int[1] ;
      P090R3_A252CliCod = new int[1] ;
      P090R3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090R3_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090R3_n18AlbComImp = new boolean[] {false} ;
      AV26Option = "" ;
      P090R5_A396EmprCod = new String[] {""} ;
      P090R5_A22AlbComPri = new String[] {""} ;
      P090R5_A14AlbComCod = new int[1] ;
      P090R5_A279CliNom = new String[] {""} ;
      P090R5_A252CliCod = new int[1] ;
      P090R5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090R5_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090R5_n18AlbComImp = new boolean[] {false} ;
      AV29OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadocumentoscomercialesgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P090R3_A396EmprCod, P090R3_A279CliNom, P090R3_A22AlbComPri, P090R3_A14AlbComCod, P090R3_A252CliCod, P090R3_A17AlbComFch, P090R3_A18AlbComImp, P090R3_n18AlbComImp
            }
            , new Object[] {
            P090R5_A396EmprCod, P090R5_A22AlbComPri, P090R5_A14AlbComCod, P090R5_A279CliNom, P090R5_A252CliCod, P090R5_A17AlbComFch, P090R5_A18AlbComImp, P090R5_n18AlbComImp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV50GXV1 ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV10TFAlbComCod ;
   private int AV11TFAlbComCod_To ;
   private int AV42Clicod ;
   private int AV43Clicod_to ;
   private int AV54Wcconsultadocumentoscomercialesds_3_tfclicod ;
   private int AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to ;
   private int AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod ;
   private int AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to ;
   private int A252CliCod ;
   private int A14AlbComCod ;
   private long AV34count ;
   private java.math.BigDecimal AV20TFAlbComImp ;
   private java.math.BigDecimal AV21TFAlbComImp_To ;
   private java.math.BigDecimal AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp ;
   private java.math.BigDecimal AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to ;
   private java.math.BigDecimal A18AlbComImp ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String AV14TFAlbComPri ;
   private String AV15TFAlbComPri_Sel ;
   private String AV41Emprcod ;
   private String AV47Prioridad ;
   private String A279CliNom ;
   private String AV56Wcconsultadocumentoscomercialesds_5_tfclinom ;
   private String AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel ;
   private String AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri ;
   private String AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel ;
   private String scmdbuf ;
   private String lV56Wcconsultadocumentoscomercialesds_5_tfclinom ;
   private String lV60Wcconsultadocumentoscomercialesds_9_tfalbcompri ;
   private String A22AlbComPri ;
   private String A396EmprCod ;
   private java.util.Date AV12TFAlbComFch ;
   private java.util.Date AV44AlbComFch ;
   private java.util.Date AV45AlbComFch_to ;
   private java.util.Date AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean brk90R2 ;
   private boolean n18AlbComImp ;
   private boolean brk90R4 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV52Wcconsultadocumentoscomercialesds_1_filterfulltext ;
   private String lV52Wcconsultadocumentoscomercialesds_1_filterfulltext ;
   private String AV26Option ;
   private String AV29OptionDesc ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P090R3_A396EmprCod ;
   private String[] P090R3_A279CliNom ;
   private String[] P090R3_A22AlbComPri ;
   private int[] P090R3_A14AlbComCod ;
   private int[] P090R3_A252CliCod ;
   private java.util.Date[] P090R3_A17AlbComFch ;
   private java.math.BigDecimal[] P090R3_A18AlbComImp ;
   private boolean[] P090R3_n18AlbComImp ;
   private String[] P090R5_A396EmprCod ;
   private String[] P090R5_A22AlbComPri ;
   private int[] P090R5_A14AlbComCod ;
   private String[] P090R5_A279CliNom ;
   private int[] P090R5_A252CliCod ;
   private java.util.Date[] P090R5_A17AlbComFch ;
   private java.math.BigDecimal[] P090R5_A18AlbComImp ;
   private boolean[] P090R5_n18AlbComImp ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class wcconsultadocumentoscomercialesgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090R3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcconsultadocumentoscomercialesds_1_filterfulltext ,
                                          java.util.Date AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch ,
                                          int AV54Wcconsultadocumentoscomercialesds_3_tfclicod ,
                                          int AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to ,
                                          String AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel ,
                                          String AV56Wcconsultadocumentoscomercialesds_5_tfclinom ,
                                          int AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod ,
                                          int AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to ,
                                          String AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel ,
                                          String AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri ,
                                          java.math.BigDecimal AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp ,
                                          java.math.BigDecimal AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A14AlbComCod ,
                                          String A22AlbComPri ,
                                          java.math.BigDecimal A18AlbComImp ,
                                          java.util.Date A17AlbComFch ,
                                          int AV42Clicod ,
                                          int AV43Clicod_to ,
                                          java.util.Date AV44AlbComFch ,
                                          java.util.Date AV45AlbComFch_to ,
                                          String AV47Prioridad ,
                                          String A396EmprCod ,
                                          String AV41Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.AlbComPri, T1.AlbComCod, T1.CliCod, T1.AlbComFch, COALESCE( T2.AlbComImp, 0) AS AlbComImp FROM ((TXPCALCOM T1 LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.AlbComCod = T1.AlbComCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ? or ? = '2')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Wcconsultadocumentoscomercialesds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.AlbComImp, 0),'9999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV54Wcconsultadocumentoscomercialesds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcconsultadocumentoscomercialesds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPri = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.AlbComImp, 0) >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.AlbComImp, 0) <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P090R5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcconsultadocumentoscomercialesds_1_filterfulltext ,
                                          java.util.Date AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch ,
                                          int AV54Wcconsultadocumentoscomercialesds_3_tfclicod ,
                                          int AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to ,
                                          String AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel ,
                                          String AV56Wcconsultadocumentoscomercialesds_5_tfclinom ,
                                          int AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod ,
                                          int AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to ,
                                          String AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel ,
                                          String AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri ,
                                          java.math.BigDecimal AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp ,
                                          java.math.BigDecimal AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A14AlbComCod ,
                                          String A22AlbComPri ,
                                          java.math.BigDecimal A18AlbComImp ,
                                          java.util.Date A17AlbComFch ,
                                          int AV42Clicod ,
                                          int AV43Clicod_to ,
                                          java.util.Date AV44AlbComFch ,
                                          java.util.Date AV45AlbComFch_to ,
                                          String AV47Prioridad ,
                                          String A396EmprCod ,
                                          String AV41Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[23];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComCod, T3.CliNom, T1.CliCod, T1.AlbComFch, COALESCE( T2.AlbComImp, 0) AS AlbComImp FROM ((TXPCALCOM T1 LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.AlbComCod = T1.AlbComCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ? or ? = '2')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Wcconsultadocumentoscomercialesds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.AlbComImp, 0),'9999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Wcconsultadocumentoscomercialesds_2_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV54Wcconsultadocumentoscomercialesds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV55Wcconsultadocumentoscomercialesds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcconsultadocumentoscomercialesds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcconsultadocumentoscomercialesds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV58Wcconsultadocumentoscomercialesds_7_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcconsultadocumentoscomercialesds_9_tfalbcompri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPri = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcconsultadocumentoscomercialesds_11_tfalbcomimp)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.AlbComImp, 0) >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.AlbComImp, 0) <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComPri" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P090R3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P090R5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090R3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090R5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               return;
      }
   }

}

